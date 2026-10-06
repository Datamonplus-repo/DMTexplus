package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tubidpg_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5322Dp_Nrecep = (int)(GXutil.lval( httpContext.GetPar( "Dp_Nrecep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         A4978Dp_Ubi = httpContext.GetPar( "Dp_Ubi") ;
         A4979Dp_Plg = (short)(GXutil.lval( httpContext.GetPar( "Dp_Plg"))) ;
         A4344Dp_PzU = (int)(GXutil.lval( httpContext.GetPar( "Dp_PzU"))) ;
         n4344Dp_PzU = false ;
         A4982Dp_UnU = CommonUtil.decimalVal( httpContext.GetPar( "Dp_UnU"), ".") ;
         n4982Dp_UnU = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_13_16K1343( A396EmprCod, A5322Dp_Nrecep, A4978Dp_Ubi, A4979Dp_Plg, A4344Dp_PzU, A4982Dp_UnU) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5322Dp_Nrecep = (int)(GXutil.lval( httpContext.GetPar( "Dp_Nrecep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         A4978Dp_Ubi = httpContext.GetPar( "Dp_Ubi") ;
         A4979Dp_Plg = (short)(GXutil.lval( httpContext.GetPar( "Dp_Plg"))) ;
         AV33Oldpz = (int)(GXutil.lval( httpContext.GetPar( "Oldpz"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
         AV32OldUn = CommonUtil.decimalVal( httpContext.GetPar( "OldUn"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
         A4344Dp_PzU = (int)(GXutil.lval( httpContext.GetPar( "Dp_PzU"))) ;
         n4344Dp_PzU = false ;
         A4982Dp_UnU = CommonUtil.decimalVal( httpContext.GetPar( "Dp_UnU"), ".") ;
         n4982Dp_UnU = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_16K1343( A396EmprCod, A5322Dp_Nrecep, A4978Dp_Ubi, A4979Dp_Plg, AV33Oldpz, AV32OldUn, A4344Dp_PzU, A4982Dp_UnU) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5322Dp_Nrecep = (int)(GXutil.lval( httpContext.GetPar( "Dp_Nrecep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         A4978Dp_Ubi = httpContext.GetPar( "Dp_Ubi") ;
         A4979Dp_Plg = (short)(GXutil.lval( httpContext.GetPar( "Dp_Plg"))) ;
         AV33Oldpz = (int)(GXutil.lval( httpContext.GetPar( "Oldpz"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
         AV32OldUn = CommonUtil.decimalVal( httpContext.GetPar( "OldUn"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_16K1343( A396EmprCod, A5322Dp_Nrecep, A4978Dp_Ubi, A4979Dp_Plg, AV33Oldpz, AV32OldUn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DP_UND") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5322Dp_Nrecep = (int)(GXutil.lval( httpContext.GetPar( "Dp_Nrecep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         A4978Dp_Ubi = httpContext.GetPar( "Dp_Ubi") ;
         A4979Dp_Plg = (short)(GXutil.lval( httpContext.GetPar( "Dp_Plg"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadp_und16K1343( A396EmprCod, A5322Dp_Nrecep, A4978Dp_Ubi, A4979Dp_Plg) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"DP_PZD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5322Dp_Nrecep = (int)(GXutil.lval( httpContext.GetPar( "Dp_Nrecep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         A4978Dp_Ubi = httpContext.GetPar( "Dp_Ubi") ;
         A4979Dp_Plg = (short)(GXutil.lval( httpContext.GetPar( "Dp_Plg"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asadp_pzd16K1343( A396EmprCod, A5322Dp_Nrecep, A4978Dp_Ubi, A4979Dp_Plg) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"DP_DUB") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4978Dp_Ubi = httpContext.GetPar( "Dp_Ubi") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asadp_dub16K1343( A396EmprCod, A4978Dp_Ubi) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A5322Dp_Nrecep = (int)(GXutil.lval( httpContext.GetPar( "Dp_Nrecep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "SALIDAS DE UBICACIONES PLG", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDp_Kgs_Internalname ;
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
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
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

   public tubidpg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tubidpg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tubidpg_impl.class ));
   }

   public tubidpg_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e1116K2 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TUBIDPG.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Recepcion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_Nrecep_Internalname, GXutil.ltrim( localUtil.ntoc( A5322Dp_Nrecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_Nrecep_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5322Dp_Nrecep), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5322Dp_Nrecep), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_Nrecep_Jsonclick, 0, "", "", "", "", "", 1, edtDp_Nrecep_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Kgs", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A6008Dp_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_Kgs_Enabled!=0) ? localUtil.format( A6008Dp_Kgs, "ZZZZZ9.99") : localUtil.format( A6008Dp_Kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_Kgs_Jsonclick, 0, "", "", "", "", "", 1, edtDp_Kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Mts", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_Mts_Internalname, GXutil.ltrim( localUtil.ntoc( A5323Dp_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_Mts_Enabled!=0) ? localUtil.format( A5323Dp_Mts, "ZZZZZ9.99") : localUtil.format( A5323Dp_Mts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_Mts_Jsonclick, 0, "", "", "", "", "", 1, edtDp_Mts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Piezas HDR por Recepcion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A5891Dp_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_pzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5891Dp_pzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5891Dp_pzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_pzs_Jsonclick, 0, "", "", "", "", "", 1, edtDp_pzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniMed_Internalname, GXutil.rtrim( A228BarUniMed), GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtBarUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Sumo Piezas", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_SPz_Internalname, GXutil.ltrim( localUtil.ntoc( A1089Dp_SPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_SPz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1089Dp_SPz), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1089Dp_SPz), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_SPz_Jsonclick, 0, "", "", "", "", "", 1, edtDp_SPz_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Sumo Unidades", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_SUn_Internalname, GXutil.ltrim( localUtil.ntoc( A1077Dp_SUn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_SUn_Enabled!=0) ? localUtil.format( A1077Dp_SUn, "ZZZZZ9.99") : localUtil.format( A1077Dp_SUn, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_SUn_Jsonclick, 0, "", "", "", "", "", 1, edtDp_SUn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol80( ) ;
      nGXsfl_80_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1343 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1343 = (short)(1) ;
            scanStart16K1343( ) ;
            while ( RcdFound1343 != 0 )
            {
               init_level_properties1343( ) ;
               getByPrimaryKey16K1343( ) ;
               addRow16K1343( ) ;
               scanNext16K1343( ) ;
            }
            scanEnd16K1343( ) ;
            nBlankRcdCount1343 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1089Dp_SPz = A1089Dp_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         B1077Dp_SUn = A1077Dp_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
         standaloneNotModal16K1343( ) ;
         standaloneModal16K1343( ) ;
         sMode1343 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow16K1343( ) ;
            edtavnRcdDeleted_1343_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1343_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1343_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1343_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDp_Ubi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_UBI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDp_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDp_Plg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_PLG_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDp_Plg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Plg_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDp_DUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_DUB_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDp_DUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_DUb_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDp_UnU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_UNU_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDp_UnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_UnU_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDp_PzU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_PZU_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDp_PzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_PzU_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDp_PzD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_PZD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDp_PzD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_PzD_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDp_UnD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_UND_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDp_UnD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_UnD_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1343 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16K1343( ) ;
            }
            sendRow16K1343( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1343 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1089Dp_SPz = B1089Dp_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         A1077Dp_SUn = B1077Dp_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1343 = (short)(5) ;
         nRcdExists_1343 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16K1343( ) ;
            while ( RcdFound1343 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801343( ) ;
               init_level_properties1343( ) ;
               standaloneNotModal16K1343( ) ;
               getByPrimaryKey16K1343( ) ;
               standaloneModal16K1343( ) ;
               addRow16K1343( ) ;
               scanNext16K1343( ) ;
            }
            scanEnd16K1343( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1343 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801343( ) ;
      initAll16K1343( ) ;
      init_level_properties1343( ) ;
      B1089Dp_SPz = A1089Dp_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      B1077Dp_SUn = A1077Dp_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      nRcdExists_1343 = (short)(0) ;
      nIsMod_1343 = (short)(0) ;
      nRcdDeleted_1343 = (short)(0) ;
      nBlankRcdCount1343 = (short)(nBlankRcdUsr1343+nBlankRcdCount1343) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1343 > 0 )
      {
         standaloneNotModal16K1343( ) ;
         standaloneModal16K1343( ) ;
         addRow16K1343( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDp_Ubi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1343 = (short)(nBlankRcdCount1343-1) ;
      }
      Gx_mode = sMode1343 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1089Dp_SPz = B1089Dp_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      A1077Dp_SUn = B1077Dp_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TUBIDPG.htm");
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
      e1216K2 ();
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
            Z5322Dp_Nrecep = (int)(localUtil.ctol( httpContext.cgiGet( "Z5322Dp_Nrecep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6008Dp_Kgs = localUtil.ctond( httpContext.cgiGet( "Z6008Dp_Kgs")) ;
            Z5323Dp_Mts = localUtil.ctond( httpContext.cgiGet( "Z5323Dp_Mts")) ;
            Z5891Dp_pzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z5891Dp_pzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1089Dp_SPz = (int)(localUtil.ctol( httpContext.cgiGet( "O1089Dp_SPz"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1077Dp_SUn = localUtil.ctond( httpContext.cgiGet( "O1077Dp_SUn")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV32OldUn = localUtil.ctond( httpContext.cgiGet( "vOLDUN")) ;
            AV33Oldpz = (int)(localUtil.ctol( httpContext.cgiGet( "vOLDPZ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A5322Dp_Nrecep = (int)(localUtil.ctol( httpContext.cgiGet( edtDp_Nrecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDp_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDp_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DP_KGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDp_Kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6008Dp_Kgs = DecimalUtil.ZERO ;
               n6008Dp_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
            }
            else
            {
               A6008Dp_Kgs = localUtil.ctond( httpContext.cgiGet( edtDp_Kgs_Internalname)) ;
               n6008Dp_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDp_Mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDp_Mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DP_MTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDp_Mts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5323Dp_Mts = DecimalUtil.ZERO ;
               n5323Dp_Mts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
            }
            else
            {
               A5323Dp_Mts = localUtil.ctond( httpContext.cgiGet( edtDp_Mts_Internalname)) ;
               n5323Dp_Mts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDp_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDp_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DP_PZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDp_pzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5891Dp_pzs = 0 ;
               n5891Dp_pzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
            }
            else
            {
               A5891Dp_pzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDp_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5891Dp_pzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
            }
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
            A1089Dp_SPz = (int)(localUtil.ctol( httpContext.cgiGet( edtDp_SPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
            A1077Dp_SUn = localUtil.ctond( httpContext.cgiGet( edtDp_SUn_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A5322Dp_Nrecep = (int)(GXutil.lval( httpContext.GetPar( "Dp_Nrecep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
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
                        e1216K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e1116K2 ();
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
            initAll16K1342( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1343_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1343_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes16K1342( ) ;
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

   public void confirm_16K0( )
   {
      beforeValidate16K1342( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16K1342( ) ;
         }
         else
         {
            checkExtendedTable16K1342( ) ;
            if ( AnyError == 0 )
            {
               zm16K1342( 19) ;
               zm16K1342( 20) ;
               zm16K1342( 21) ;
            }
            closeExtendedTableCursors16K1342( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1342 = Gx_mode ;
         confirm_16K1343( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1342 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1342 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues16K0( ) ;
      }
   }

   public void confirm_16K1343( )
   {
      s1089Dp_SPz = O1089Dp_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      s1077Dp_SUn = O1077Dp_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow16K1343( ) ;
         if ( ( nRcdExists_1343 != 0 ) || ( nIsMod_1343 != 0 ) )
         {
            getKey16K1343( ) ;
            if ( ( nRcdExists_1343 == 0 ) && ( nRcdDeleted_1343 == 0 ) )
            {
               if ( RcdFound1343 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16K1343( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16K1343( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors16K1343( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1089Dp_SPz = A1089Dp_SPz ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
                     O1077Dp_SUn = A1077Dp_SUn ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "DP_UBI_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDp_Ubi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1343 != 0 )
               {
                  if ( nRcdDeleted_1343 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16K1343( ) ;
                     load16K1343( ) ;
                     beforeValidate16K1343( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16K1343( ) ;
                        O1089Dp_SPz = A1089Dp_SPz ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
                        O1077Dp_SUn = A1077Dp_SUn ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1343 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16K1343( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16K1343( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors16K1343( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1089Dp_SPz = A1089Dp_SPz ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
                           O1077Dp_SUn = A1077Dp_SUn ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1343 == 0 )
                  {
                     GXCCtl = "DP_UBI_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDp_Ubi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1343_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_Ubi_Internalname, GXutil.rtrim( A4978Dp_Ubi)) ;
         httpContext.changePostValue( edtDp_Plg_Internalname, GXutil.ltrim( localUtil.ntoc( A4979Dp_Plg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_DUb_Internalname, GXutil.rtrim( A1090Dp_DUb)) ;
         httpContext.changePostValue( edtDp_UnU_Internalname, GXutil.ltrim( localUtil.ntoc( A4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_PzU_Internalname, GXutil.ltrim( localUtil.ntoc( A4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_PzD_Internalname, GXutil.ltrim( localUtil.ntoc( A4000Dp_PzD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_UnD_Internalname, GXutil.ltrim( localUtil.ntoc( A4001Dp_UnD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4978Dp_Ubi_"+sGXsfl_80_idx, GXutil.rtrim( Z4978Dp_Ubi)) ;
         httpContext.changePostValue( "ZT_"+"Z4979Dp_Plg_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z4979Dp_Plg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4982Dp_UnU_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4344Dp_PzU_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4344Dp_PzU_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4982Dp_UnU_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1343_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1343_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1343_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1343 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1343_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1343_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_UBI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_Ubi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_PLG_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_Plg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_DUB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_DUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_UNU_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_UnU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_PZU_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_PzU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_PZD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_PzD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_UND_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_UnD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1089Dp_SPz = s1089Dp_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      O1077Dp_SUn = s1077Dp_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16K0( )
   {
   }

   public void e1216K2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tubidpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tubidpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tubidpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "N Recepcion", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Hoja Ruta", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Kgs", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV17Lit5 = httpContext.getMessage( "Mts", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV18Lit6 = httpContext.getMessage( "Piezas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tubidpg_impl.this.A396EmprCod = GXv_char2[0] ;
      tubidpg_impl.this.AV11EmprNom = GXv_char3[0] ;
      tubidpg_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e1116K2 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e1116K2( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int7[0] = A5322Dp_Nrecep ;
      new app.pubidpg(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A129BarCod = GXv_int5[0] ;
      tubidpg_impl.this.A132BarCodReo = GXv_int6[0] ;
      tubidpg_impl.this.A130BarCodPar = GXv_char3[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      /*  Sending Event outputs  */
   }

   public void zm16K1342( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6008Dp_Kgs = T016K5_A6008Dp_Kgs[0] ;
            Z5323Dp_Mts = T016K5_A5323Dp_Mts[0] ;
            Z5891Dp_pzs = T016K5_A5891Dp_pzs[0] ;
         }
         else
         {
            Z6008Dp_Kgs = A6008Dp_Kgs ;
            Z5323Dp_Mts = A5323Dp_Mts ;
            Z5891Dp_pzs = A5891Dp_pzs ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z5322Dp_Nrecep = A5322Dp_Nrecep ;
         Z6008Dp_Kgs = A6008Dp_Kgs ;
         Z5323Dp_Mts = A5323Dp_Mts ;
         Z5891Dp_pzs = A5891Dp_pzs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z228BarUniMed = A228BarUniMed ;
         Z1089Dp_SPz = A1089Dp_SPz ;
         Z1077Dp_SUn = A1077Dp_SUn ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TUBIDPG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T016K6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016K6_A407EmprNom[0] ;
      n407EmprNom = T016K6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T016K7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A228BarUniMed = T016K7_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      pr_default.close(5);
      /* Using cursor T016K9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A1089Dp_SPz = T016K9_A1089Dp_SPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         A1077Dp_SUn = T016K9_A1077Dp_SUn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      else
      {
         A1089Dp_SPz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         A1077Dp_SUn = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      O1089Dp_SPz = A1089Dp_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      O1077Dp_SUn = A1077Dp_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      pr_default.close(6);
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

   public void load16K1342( )
   {
      /* Using cursor T016K11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1342 = (short)(1) ;
         A407EmprNom = T016K11_A407EmprNom[0] ;
         n407EmprNom = T016K11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A6008Dp_Kgs = T016K11_A6008Dp_Kgs[0] ;
         n6008Dp_Kgs = T016K11_n6008Dp_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
         A5323Dp_Mts = T016K11_A5323Dp_Mts[0] ;
         n5323Dp_Mts = T016K11_n5323Dp_Mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
         A5891Dp_pzs = T016K11_A5891Dp_pzs[0] ;
         n5891Dp_pzs = T016K11_n5891Dp_pzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
         A228BarUniMed = T016K11_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         A1089Dp_SPz = T016K11_A1089Dp_SPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         A1077Dp_SUn = T016K11_A1077Dp_SUn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
         zm16K1342( -18) ;
      }
      pr_default.close(7);
      onLoadActions16K1342( ) ;
   }

   public void onLoadActions16K1342( )
   {
      O1089Dp_SPz = A1089Dp_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      O1077Dp_SUn = A1077Dp_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
   }

   public void checkExtendedTable16K1342( )
   {
      nIsDirty_1342 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors16K1342( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey16K1342( )
   {
      /* Using cursor T016K12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1342 = (short)(1) ;
      }
      else
      {
         RcdFound1342 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016K5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(3) != 101) && ( T016K5_A5322Dp_Nrecep[0] == A5322Dp_Nrecep ) && ( GXutil.strcmp(T016K5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016K5_A129BarCod[0] == A129BarCod ) && ( T016K5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016K5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm16K1342( 18) ;
         RcdFound1342 = (short)(1) ;
         A6008Dp_Kgs = T016K5_A6008Dp_Kgs[0] ;
         n6008Dp_Kgs = T016K5_n6008Dp_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
         A5323Dp_Mts = T016K5_A5323Dp_Mts[0] ;
         n5323Dp_Mts = T016K5_n5323Dp_Mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
         A5891Dp_pzs = T016K5_A5891Dp_pzs[0] ;
         n5891Dp_pzs = T016K5_n5891Dp_pzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z5322Dp_Nrecep = A5322Dp_Nrecep ;
         sMode1342 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16K1342( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1342 = (short)(0) ;
            initializeNonKey16K1342( ) ;
         }
         Gx_mode = sMode1342 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1342 = (short)(0) ;
         initializeNonKey16K1342( ) ;
         sMode1342 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1342 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey16K1342( ) ;
      if ( RcdFound1342 == 0 )
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
      RcdFound1342 = (short)(0) ;
      /* Using cursor T016K13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T016K13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016K13_A129BarCod[0] == A129BarCod ) && ( T016K13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016K13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016K13_A5322Dp_Nrecep[0] == A5322Dp_Nrecep ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T016K13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016K13_A129BarCod[0] == A129BarCod ) && ( T016K13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016K13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016K13_A5322Dp_Nrecep[0] == A5322Dp_Nrecep ) )
         {
            RcdFound1342 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1342 = (short)(0) ;
      /* Using cursor T016K14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016K14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016K14_A129BarCod[0] == A129BarCod ) && ( T016K14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016K14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016K14_A5322Dp_Nrecep[0] == A5322Dp_Nrecep ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016K14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016K14_A129BarCod[0] == A129BarCod ) && ( T016K14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016K14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016K14_A5322Dp_Nrecep[0] == A5322Dp_Nrecep ) )
         {
            RcdFound1342 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16K1342( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1089Dp_SPz = O1089Dp_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         A1077Dp_SUn = O1077Dp_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
         GX_FocusControl = edtDp_Kgs_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16K1342( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1342 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1089Dp_SPz = O1089Dp_SPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
               A1077Dp_SUn = O1077Dp_SUn ;
               httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDp_Kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A1089Dp_SPz = O1089Dp_SPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
               A1077Dp_SUn = O1077Dp_SUn ;
               httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
               update16K1342( ) ;
               GX_FocusControl = edtDp_Kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A1089Dp_SPz = O1089Dp_SPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
               A1077Dp_SUn = O1077Dp_SUn ;
               httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
               GX_FocusControl = edtDp_Kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16K1342( ) ;
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
                  A1089Dp_SPz = O1089Dp_SPz ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
                  A1077Dp_SUn = O1077Dp_SUn ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
                  GX_FocusControl = edtDp_Kgs_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16K1342( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1089Dp_SPz = O1089Dp_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         A1077Dp_SUn = O1077Dp_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDp_Kgs_Internalname ;
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
      getKey16K1342( ) ;
      if ( RcdFound1342 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tubidpg");
      GX_FocusControl = edtDp_Kgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_16K0( ) ;
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
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDp_Kgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart16K1342( ) ;
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDp_Kgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16K1342( ) ;
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
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDp_Kgs_Internalname ;
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
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDp_Kgs_Internalname ;
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
      scanStart16K1342( ) ;
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1342 != 0 )
         {
            scanNext16K1342( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDp_Kgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16K1342( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16K1342( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016K4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIDEP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z6008Dp_Kgs, T016K4_A6008Dp_Kgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z5323Dp_Mts, T016K4_A5323Dp_Mts[0]) != 0 ) || ( Z5891Dp_pzs != T016K4_A5891Dp_pzs[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6008Dp_Kgs, T016K4_A6008Dp_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("tubidpg:[seudo value changed for attri]"+"Dp_Kgs");
               GXutil.writeLogRaw("Old: ",Z6008Dp_Kgs);
               GXutil.writeLogRaw("Current: ",T016K4_A6008Dp_Kgs[0]);
            }
            if ( DecimalUtil.compareTo(Z5323Dp_Mts, T016K4_A5323Dp_Mts[0]) != 0 )
            {
               GXutil.writeLogln("tubidpg:[seudo value changed for attri]"+"Dp_Mts");
               GXutil.writeLogRaw("Old: ",Z5323Dp_Mts);
               GXutil.writeLogRaw("Current: ",T016K4_A5323Dp_Mts[0]);
            }
            if ( Z5891Dp_pzs != T016K4_A5891Dp_pzs[0] )
            {
               GXutil.writeLogln("tubidpg:[seudo value changed for attri]"+"Dp_pzs");
               GXutil.writeLogRaw("Old: ",Z5891Dp_pzs);
               GXutil.writeLogRaw("Current: ",T016K4_A5891Dp_pzs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUBIDEP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16K1342( )
   {
      beforeValidate16K1342( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16K1342( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16K1342( 0) ;
         checkOptimisticConcurrency16K1342( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16K1342( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16K1342( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016K15 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A5322Dp_Nrecep), Boolean.valueOf(n6008Dp_Kgs), A6008Dp_Kgs, Boolean.valueOf(n5323Dp_Mts), A5323Dp_Mts, Boolean.valueOf(n5891Dp_pzs), Integer.valueOf(A5891Dp_pzs), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDEP");
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
                        processLevel16K1342( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16K0( ) ;
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
            load16K1342( ) ;
         }
         endLevel16K1342( ) ;
      }
      closeExtendedTableCursors16K1342( ) ;
   }

   public void update16K1342( )
   {
      beforeValidate16K1342( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16K1342( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16K1342( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16K1342( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16K1342( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016K16 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n6008Dp_Kgs), A6008Dp_Kgs, Boolean.valueOf(n5323Dp_Mts), A5323Dp_Mts, Boolean.valueOf(n5891Dp_pzs), Integer.valueOf(A5891Dp_pzs), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDEP");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIDEP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16K1342( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16K1342( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16K0( ) ;
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
         endLevel16K1342( ) ;
      }
      closeExtendedTableCursors16K1342( ) ;
   }

   public void deferredUpdate16K1342( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16K1342( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16K1342( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16K1342( ) ;
         afterConfirm16K1342( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16K1342( ) ;
            if ( AnyError == 0 )
            {
               A1089Dp_SPz = O1089Dp_SPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
               A1077Dp_SUn = O1077Dp_SUn ;
               httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
               scanStart16K1343( ) ;
               while ( RcdFound1343 != 0 )
               {
                  getByPrimaryKey16K1343( ) ;
                  delete16K1343( ) ;
                  scanNext16K1343( ) ;
                  O1089Dp_SPz = A1089Dp_SPz ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
                  O1077Dp_SUn = A1077Dp_SUn ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
               }
               scanEnd16K1343( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016K17 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDEP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1342 == 0 )
                        {
                           initAll16K1342( ) ;
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
                        resetCaption16K0( ) ;
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
      sMode1342 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16K1342( ) ;
      Gx_mode = sMode1342 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16K1342( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel16K1343( )
   {
      s1089Dp_SPz = O1089Dp_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      s1077Dp_SUn = O1077Dp_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow16K1343( ) ;
         if ( ( nRcdExists_1343 != 0 ) || ( nIsMod_1343 != 0 ) )
         {
            standaloneNotModal16K1343( ) ;
            getKey16K1343( ) ;
            if ( ( nRcdExists_1343 == 0 ) && ( nRcdDeleted_1343 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16K1343( ) ;
            }
            else
            {
               if ( RcdFound1343 != 0 )
               {
                  if ( ( nRcdDeleted_1343 != 0 ) && ( nRcdExists_1343 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16K1343( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1343 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16K1343( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1343 == 0 )
                  {
                     GXCCtl = "DP_UBI_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDp_Ubi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1089Dp_SPz = A1089Dp_SPz ;
            httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
            O1077Dp_SUn = A1077Dp_SUn ;
            httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1343_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_Ubi_Internalname, GXutil.rtrim( A4978Dp_Ubi)) ;
         httpContext.changePostValue( edtDp_Plg_Internalname, GXutil.ltrim( localUtil.ntoc( A4979Dp_Plg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_DUb_Internalname, GXutil.rtrim( A1090Dp_DUb)) ;
         httpContext.changePostValue( edtDp_UnU_Internalname, GXutil.ltrim( localUtil.ntoc( A4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_PzU_Internalname, GXutil.ltrim( localUtil.ntoc( A4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_PzD_Internalname, GXutil.ltrim( localUtil.ntoc( A4000Dp_PzD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDp_UnD_Internalname, GXutil.ltrim( localUtil.ntoc( A4001Dp_UnD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4978Dp_Ubi_"+sGXsfl_80_idx, GXutil.rtrim( Z4978Dp_Ubi)) ;
         httpContext.changePostValue( "ZT_"+"Z4979Dp_Plg_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z4979Dp_Plg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4982Dp_UnU_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4344Dp_PzU_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4344Dp_PzU_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4982Dp_UnU_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1343_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1343_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1343_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1343 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1343_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1343_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_UBI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_Ubi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_PLG_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_Plg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_DUB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_DUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_UNU_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_UnU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_PZU_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_PzU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_PZD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_PzD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DP_UND_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_UnD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16K1343( ) ;
      if ( AnyError != 0 )
      {
         O1089Dp_SPz = s1089Dp_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         O1077Dp_SUn = s1077Dp_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      nRcdExists_1343 = (short)(0) ;
      nIsMod_1343 = (short)(0) ;
      nRcdDeleted_1343 = (short)(0) ;
   }

   public void processLevel16K1342( )
   {
      /* Save parent mode. */
      sMode1342 = Gx_mode ;
      processNestedLevel16K1343( ) ;
      if ( AnyError != 0 )
      {
         O1089Dp_SPz = s1089Dp_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         O1077Dp_SUn = s1077Dp_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1342 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16K1342( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16K1342( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tubidpg");
         if ( AnyError == 0 )
         {
            confirmValues16K0( ) ;
         }
         /* After transaction rules */
         if ( ( A5891Dp_pzs != A1089Dp_SPz ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.No coincide el Total Piezas UBICADAS con el Total Dispuesto", ""), 1, "DP_PZS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDp_pzs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            return  ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tubidpg");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16K1342( )
   {
      /* Scan By routine */
      /* Using cursor T016K18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      RcdFound1342 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1342 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16K1342( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1342 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1342 = (short)(1) ;
      }
   }

   public void scanEnd16K1342( )
   {
      pr_default.close(14);
   }

   public void afterConfirm16K1342( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16K1342( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16K1342( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16K1342( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16K1342( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16K1342( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16K1342( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtDp_Nrecep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Nrecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Nrecep_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDp_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Kgs_Enabled), 5, 0), true);
      edtDp_Mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Mts_Enabled), 5, 0), true);
      edtDp_pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_pzs_Enabled), 5, 0), true);
      edtBarUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Enabled), 5, 0), true);
      edtDp_SPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_SPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_SPz_Enabled), 5, 0), true);
      edtDp_SUn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_SUn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_SUn_Enabled), 5, 0), true);
   }

   public void zm16K1343( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4982Dp_UnU = T016K3_A4982Dp_UnU[0] ;
            Z4344Dp_PzU = T016K3_A4344Dp_PzU[0] ;
         }
         else
         {
            Z4982Dp_UnU = A4982Dp_UnU ;
            Z4344Dp_PzU = A4344Dp_PzU ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z5322Dp_Nrecep = A5322Dp_Nrecep ;
         Z4978Dp_Ubi = A4978Dp_Ubi ;
         Z4979Dp_Plg = A4979Dp_Plg ;
         Z4982Dp_UnU = A4982Dp_UnU ;
         Z4344Dp_PzU = A4344Dp_PzU ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal16K1343( )
   {
   }

   public void standaloneModal16K1343( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDp_Ubi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDp_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtDp_Ubi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDp_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDp_Plg_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDp_Plg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Plg_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtDp_Plg_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDp_Plg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Plg_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load16K1343( )
   {
      /* Using cursor T016K19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1343 = (short)(1) ;
         A4982Dp_UnU = T016K19_A4982Dp_UnU[0] ;
         n4982Dp_UnU = T016K19_n4982Dp_UnU[0] ;
         A4344Dp_PzU = T016K19_A4344Dp_PzU[0] ;
         n4344Dp_PzU = T016K19_n4344Dp_PzU[0] ;
         zm16K1343( -22) ;
      }
      pr_default.close(15);
      onLoadActions16K1343( ) ;
   }

   public void onLoadActions16K1343( )
   {
      GXt_char1 = A1090Dp_DUb ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1090Dp_DUb = GXt_char1 ;
      GXt_decimal8 = A4001Dp_UnD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A5322Dp_Nrecep ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_int9[0] = A4979Dp_Plg ;
      GXv_decimal10[0] = GXt_decimal8 ;
      new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int9, GXv_decimal10) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int7[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
      tubidpg_impl.this.GXt_decimal8 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      A4001Dp_UnD = GXt_decimal8 ;
      GXt_int11 = (byte)(A4000Dp_PzD) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A5322Dp_Nrecep ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_int9[0] = A4979Dp_Plg ;
      GXv_int6[0] = GXt_int11 ;
      new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int9, GXv_int6) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int7[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
      tubidpg_impl.this.GXt_int11 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      A4000Dp_PzD = GXt_int11 ;
      if ( isIns( )  )
      {
         A1077Dp_SUn = O1077Dp_SUn.add(A4982Dp_UnU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1077Dp_SUn = O1077Dp_SUn.add(A4982Dp_UnU).subtract(O4982Dp_UnU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1077Dp_SUn = O1077Dp_SUn.subtract(O4982Dp_UnU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
            }
         }
      }
      AV32OldUn = O4982Dp_UnU ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
      if ( isIns( )  )
      {
         A1089Dp_SPz = (int)(O1089Dp_SPz+A4344Dp_PzU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1089Dp_SPz = (int)(O1089Dp_SPz+A4344Dp_PzU-O4344Dp_PzU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1089Dp_SPz = (int)(O1089Dp_SPz-O4344Dp_PzU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
            }
         }
      }
      AV33Oldpz = O4344Dp_PzU ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
   }

   public void checkExtendedTable16K1343( )
   {
      nIsDirty_1343 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal16K1343( ) ;
      nIsDirty_1343 = (short)(1) ;
      GXt_char1 = A1090Dp_DUb ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1090Dp_DUb = GXt_char1 ;
      if ( ( GXutil.strcmp(A1090Dp_DUb, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "DP_UBI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No existe Ubicacion", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDp_Ubi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1343 = (short)(1) ;
      GXt_decimal8 = A4001Dp_UnD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A5322Dp_Nrecep ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_int9[0] = A4979Dp_Plg ;
      GXv_decimal10[0] = GXt_decimal8 ;
      new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int9, GXv_decimal10) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int7[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
      tubidpg_impl.this.GXt_decimal8 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      A4001Dp_UnD = GXt_decimal8 ;
      nIsDirty_1343 = (short)(1) ;
      GXt_int11 = (byte)(A4000Dp_PzD) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A5322Dp_Nrecep ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_int9[0] = A4979Dp_Plg ;
      GXv_int6[0] = GXt_int11 ;
      new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int9, GXv_int6) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int7[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
      tubidpg_impl.this.GXt_int11 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      A4000Dp_PzD = GXt_int11 ;
      if ( isIns( )  )
      {
         nIsDirty_1343 = (short)(1) ;
         A1077Dp_SUn = O1077Dp_SUn.add(A4982Dp_UnU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1343 = (short)(1) ;
            A1077Dp_SUn = O1077Dp_SUn.add(A4982Dp_UnU).subtract(O4982Dp_UnU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1343 = (short)(1) ;
               A1077Dp_SUn = O1077Dp_SUn.subtract(O4982Dp_UnU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
            }
         }
      }
      AV32OldUn = O4982Dp_UnU ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
      if ( isIns( )  )
      {
         nIsDirty_1343 = (short)(1) ;
         A1089Dp_SPz = (int)(O1089Dp_SPz+A4344Dp_PzU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1343 = (short)(1) ;
            A1089Dp_SPz = (int)(O1089Dp_SPz+A4344Dp_PzU-O4344Dp_PzU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1343 = (short)(1) ;
               A1089Dp_SPz = (int)(O1089Dp_SPz-O4344Dp_PzU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
            }
         }
      }
      AV33Oldpz = O4344Dp_PzU ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
   }

   public void closeExtendedTableCursors16K1343( )
   {
   }

   public void enableDisable16K1343( )
   {
   }

   public void getKey16K1343( )
   {
      /* Using cursor T016K20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1343 = (short)(1) ;
      }
      else
      {
         RcdFound1343 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey16K1343( )
   {
      /* Using cursor T016K3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg)});
      if ( (pr_default.getStatus(1) != 101) && ( T016K3_A129BarCod[0] == A129BarCod ) && ( T016K3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016K3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016K3_A5322Dp_Nrecep[0] == A5322Dp_Nrecep ) && ( GXutil.strcmp(T016K3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16K1343( 22) ;
         RcdFound1343 = (short)(1) ;
         initializeNonKey16K1343( ) ;
         A4978Dp_Ubi = T016K3_A4978Dp_Ubi[0] ;
         A4979Dp_Plg = T016K3_A4979Dp_Plg[0] ;
         A4982Dp_UnU = T016K3_A4982Dp_UnU[0] ;
         n4982Dp_UnU = T016K3_n4982Dp_UnU[0] ;
         A4344Dp_PzU = T016K3_A4344Dp_PzU[0] ;
         n4344Dp_PzU = T016K3_n4344Dp_PzU[0] ;
         O4344Dp_PzU = A4344Dp_PzU ;
         n4344Dp_PzU = false ;
         O4982Dp_UnU = A4982Dp_UnU ;
         n4982Dp_UnU = false ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z5322Dp_Nrecep = A5322Dp_Nrecep ;
         Z4978Dp_Ubi = A4978Dp_Ubi ;
         Z4979Dp_Plg = A4979Dp_Plg ;
         sMode1343 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16K1343( ) ;
         load16K1343( ) ;
         Gx_mode = sMode1343 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1343 = (short)(0) ;
         initializeNonKey16K1343( ) ;
         sMode1343 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16K1343( ) ;
         Gx_mode = sMode1343 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16K1343( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16K1343( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016K2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIDPG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4982Dp_UnU, T016K2_A4982Dp_UnU[0]) != 0 ) || ( Z4344Dp_PzU != T016K2_A4344Dp_PzU[0] ) )
         {
            if ( DecimalUtil.compareTo(Z4982Dp_UnU, T016K2_A4982Dp_UnU[0]) != 0 )
            {
               GXutil.writeLogln("tubidpg:[seudo value changed for attri]"+"Dp_UnU");
               GXutil.writeLogRaw("Old: ",Z4982Dp_UnU);
               GXutil.writeLogRaw("Current: ",T016K2_A4982Dp_UnU[0]);
            }
            if ( Z4344Dp_PzU != T016K2_A4344Dp_PzU[0] )
            {
               GXutil.writeLogln("tubidpg:[seudo value changed for attri]"+"Dp_PzU");
               GXutil.writeLogRaw("Old: ",Z4344Dp_PzU);
               GXutil.writeLogRaw("Current: ",T016K2_A4344Dp_PzU[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUBIDPG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16K1343( )
   {
      beforeValidate16K1343( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16K1343( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16K1343( 0) ;
         checkOptimisticConcurrency16K1343( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16K1343( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16K1343( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016K21 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg), Boolean.valueOf(n4982Dp_UnU), A4982Dp_UnU, Boolean.valueOf(n4344Dp_PzU), Integer.valueOf(A4344Dp_PzU), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDPG");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int7[0] = A5322Dp_Nrecep ;
                        GXv_char3[0] = A4978Dp_Ubi ;
                        GXv_int9[0] = A4979Dp_Plg ;
                        GXv_int5[0] = 0 ;
                        GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
                        GXv_int12[0] = A4344Dp_PzU ;
                        GXv_decimal13[0] = A4982Dp_UnU ;
                        new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int9, GXv_int5, GXv_decimal10, GXv_int12, GXv_decimal13) ;
                        tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
                        tubidpg_impl.this.A5322Dp_Nrecep = GXv_int7[0] ;
                        tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
                        tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
                        tubidpg_impl.this.A4344Dp_PzU = GXv_int12[0] ;
                        tubidpg_impl.this.A4982Dp_UnU = GXv_decimal13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
                     }
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
            load16K1343( ) ;
         }
         endLevel16K1343( ) ;
      }
      closeExtendedTableCursors16K1343( ) ;
   }

   public void update16K1343( )
   {
      beforeValidate16K1343( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16K1343( ) ;
      }
      if ( ( nIsMod_1343 != 0 ) || ( nIsDirty_1343 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16K1343( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16K1343( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16K1343( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016K22 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n4982Dp_UnU), A4982Dp_UnU, Boolean.valueOf(n4344Dp_PzU), Integer.valueOf(A4344Dp_PzU), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDPG");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIDPG"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16K1343( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int12[0] = A5322Dp_Nrecep ;
                           GXv_char3[0] = A4978Dp_Ubi ;
                           GXv_int9[0] = A4979Dp_Plg ;
                           GXv_int7[0] = AV33Oldpz ;
                           GXv_decimal13[0] = AV32OldUn ;
                           GXv_int5[0] = A4344Dp_PzU ;
                           GXv_decimal10[0] = A4982Dp_UnU ;
                           new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_int7, GXv_decimal13, GXv_int5, GXv_decimal10) ;
                           tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
                           tubidpg_impl.this.A5322Dp_Nrecep = GXv_int12[0] ;
                           tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
                           tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
                           tubidpg_impl.this.AV33Oldpz = GXv_int7[0] ;
                           tubidpg_impl.this.AV32OldUn = GXv_decimal13[0] ;
                           tubidpg_impl.this.A4344Dp_PzU = GXv_int5[0] ;
                           tubidpg_impl.this.A4982Dp_UnU = GXv_decimal10[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16K1343( ) ;
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
            endLevel16K1343( ) ;
         }
      }
      closeExtendedTableCursors16K1343( ) ;
   }

   public void deferredUpdate16K1343( )
   {
   }

   public void delete16K1343( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16K1343( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16K1343( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16K1343( ) ;
         afterConfirm16K1343( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16K1343( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016K23 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDPG");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int12[0] = A5322Dp_Nrecep ;
                     GXv_char3[0] = A4978Dp_Ubi ;
                     GXv_int9[0] = A4979Dp_Plg ;
                     GXv_int7[0] = AV33Oldpz ;
                     GXv_decimal13[0] = AV32OldUn ;
                     GXv_int5[0] = 0 ;
                     GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
                     new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_int7, GXv_decimal13, GXv_int5, GXv_decimal10) ;
                     tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
                     tubidpg_impl.this.A5322Dp_Nrecep = GXv_int12[0] ;
                     tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
                     tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
                     tubidpg_impl.this.AV33Oldpz = GXv_int7[0] ;
                     tubidpg_impl.this.AV32OldUn = GXv_decimal13[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
                  }
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
      sMode1343 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16K1343( ) ;
      Gx_mode = sMode1343 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16K1343( )
   {
      standaloneModal16K1343( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A1090Dp_DUb ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A4978Dp_Ubi ;
         GXv_char2[0] = GXt_char1 ;
         new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
         tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
         tubidpg_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1090Dp_DUb = GXt_char1 ;
         GXt_decimal8 = A4001Dp_UnD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A5322Dp_Nrecep ;
         GXv_char3[0] = A4978Dp_Ubi ;
         GXv_int9[0] = A4979Dp_Plg ;
         GXv_decimal13[0] = GXt_decimal8 ;
         new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_decimal13) ;
         tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
         tubidpg_impl.this.A5322Dp_Nrecep = GXv_int12[0] ;
         tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
         tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
         tubidpg_impl.this.GXt_decimal8 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         A4001Dp_UnD = GXt_decimal8 ;
         GXt_int11 = (byte)(A4000Dp_PzD) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A5322Dp_Nrecep ;
         GXv_char3[0] = A4978Dp_Ubi ;
         GXv_int9[0] = A4979Dp_Plg ;
         GXv_int6[0] = GXt_int11 ;
         new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_int6) ;
         tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
         tubidpg_impl.this.A5322Dp_Nrecep = GXv_int12[0] ;
         tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
         tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
         tubidpg_impl.this.GXt_int11 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         A4000Dp_PzD = GXt_int11 ;
         if ( isIns( )  )
         {
            A1077Dp_SUn = O1077Dp_SUn.add(A4982Dp_UnU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1077Dp_SUn = O1077Dp_SUn.add(A4982Dp_UnU).subtract(O4982Dp_UnU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1077Dp_SUn = O1077Dp_SUn.subtract(O4982Dp_UnU) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
               }
            }
         }
         AV32OldUn = O4982Dp_UnU ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
         if ( isIns( )  )
         {
            A1089Dp_SPz = (int)(O1089Dp_SPz+A4344Dp_PzU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1089Dp_SPz = (int)(O1089Dp_SPz+A4344Dp_PzU-O4344Dp_PzU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1089Dp_SPz = (int)(O1089Dp_SPz-O4344Dp_PzU) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
               }
            }
         }
         AV33Oldpz = O4344Dp_PzU ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
      }
   }

   public void endLevel16K1343( )
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

   public void scanStart16K1343( )
   {
      /* Scan By routine */
      /* Using cursor T016K24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      RcdFound1343 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1343 = (short)(1) ;
         A4978Dp_Ubi = T016K24_A4978Dp_Ubi[0] ;
         A4979Dp_Plg = T016K24_A4979Dp_Plg[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16K1343( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1343 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1343 = (short)(1) ;
         A4978Dp_Ubi = T016K24_A4978Dp_Ubi[0] ;
         A4979Dp_Plg = T016K24_A4979Dp_Plg[0] ;
      }
   }

   public void scanEnd16K1343( )
   {
      pr_default.close(20);
   }

   public void afterConfirm16K1343( )
   {
      /* After Confirm Rules */
      if ( ( A4982Dp_UnU.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "DP_UNU_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. No ha entrado Unidades", ""), 0, GXCCtl);
      }
      if ( ( A4344Dp_PzU == 0 ) && true /* After */ )
      {
         GXCCtl = "DP_PZU_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No ha entrado Piezas", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDp_PzU_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( ( A4344Dp_PzU - AV33Oldpz ) > A4000Dp_PzD ) && true /* After */ && true /* After */ )
      {
         GXCCtl = "DP_PZU_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Piezas superior a las disponibles en Ubicacion", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDp_PzU_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( ( A4344Dp_PzU - AV33Oldpz ) > A5891Dp_pzs ) && true /* After */ && true /* After */ )
      {
         GXCCtl = "DP_PZU_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Piezas Entradas superior a las de la HDR ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDp_PzU_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert16K1343( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16K1343( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16K1343( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16K1343( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16K1343( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16K1343( )
   {
      edtDp_Ubi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDp_Plg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Plg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Plg_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDp_DUb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_DUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_DUb_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDp_UnU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_UnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_UnU_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDp_PzU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_PzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_PzU_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDp_PzD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_PzD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_PzD_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDp_UnD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_UnD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_UnD_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes16K1343( )
   {
   }

   public void send_integrity_lvl_hashes16K1342( )
   {
   }

   public void subsflControlProps_801343( )
   {
      edtavnRcdDeleted_1343_Internalname = "vNRCDDELETED_1343_"+sGXsfl_80_idx ;
      edtDp_Ubi_Internalname = "DP_UBI_"+sGXsfl_80_idx ;
      edtDp_Plg_Internalname = "DP_PLG_"+sGXsfl_80_idx ;
      edtDp_DUb_Internalname = "DP_DUB_"+sGXsfl_80_idx ;
      edtDp_UnU_Internalname = "DP_UNU_"+sGXsfl_80_idx ;
      edtDp_PzU_Internalname = "DP_PZU_"+sGXsfl_80_idx ;
      edtDp_PzD_Internalname = "DP_PZD_"+sGXsfl_80_idx ;
      edtDp_UnD_Internalname = "DP_UND_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801343( )
   {
      edtavnRcdDeleted_1343_Internalname = "vNRCDDELETED_1343_"+sGXsfl_80_fel_idx ;
      edtDp_Ubi_Internalname = "DP_UBI_"+sGXsfl_80_fel_idx ;
      edtDp_Plg_Internalname = "DP_PLG_"+sGXsfl_80_fel_idx ;
      edtDp_DUb_Internalname = "DP_DUB_"+sGXsfl_80_fel_idx ;
      edtDp_UnU_Internalname = "DP_UNU_"+sGXsfl_80_fel_idx ;
      edtDp_PzU_Internalname = "DP_PZU_"+sGXsfl_80_fel_idx ;
      edtDp_PzD_Internalname = "DP_PZD_"+sGXsfl_80_fel_idx ;
      edtDp_UnD_Internalname = "DP_UND_"+sGXsfl_80_fel_idx ;
   }

   public void addRow16K1343( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801343( ) ;
      sendRow16K1343( ) ;
   }

   public void sendRow16K1343( )
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
         if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1343_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1343_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1343_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1343), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1343), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1343_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1343_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1343_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDp_Ubi_Internalname,GXutil.rtrim( A4978Dp_Ubi),GXutil.rtrim( localUtil.format( A4978Dp_Ubi, "!!!/!!!!!!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDp_Ubi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDp_Ubi_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1343_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDp_Plg_Internalname,GXutil.ltrim( localUtil.ntoc( A4979Dp_Plg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4979Dp_Plg), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDp_Plg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDp_Plg_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDp_DUb_Internalname,GXutil.rtrim( A1090Dp_DUb),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDp_DUb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDp_DUb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1343_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDp_UnU_Internalname,GXutil.ltrim( localUtil.ntoc( A4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDp_UnU_Enabled!=0) ? localUtil.format( A4982Dp_UnU, "ZZZZZ9.99") : localUtil.format( A4982Dp_UnU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDp_UnU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDp_UnU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1343_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDp_PzU_Internalname,GXutil.ltrim( localUtil.ntoc( A4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDp_PzU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4344Dp_PzU), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4344Dp_PzU), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDp_PzU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDp_PzU_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDp_PzD_Internalname,GXutil.ltrim( localUtil.ntoc( A4000Dp_PzD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDp_PzD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4000Dp_PzD), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4000Dp_PzD), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDp_PzD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDp_PzD_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDp_UnD_Internalname,GXutil.ltrim( localUtil.ntoc( A4001Dp_UnD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDp_UnD_Enabled!=0) ? localUtil.format( A4001Dp_UnD, "ZZZZZ9.99") : localUtil.format( A4001Dp_UnD, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDp_UnD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDp_UnD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes16K1343( ) ;
      GXCCtl = "Z4978Dp_Ubi_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4978Dp_Ubi));
      GXCCtl = "Z4979Dp_Plg_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4979Dp_Plg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4982Dp_UnU_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4344Dp_PzU_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4344Dp_PzU_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4344Dp_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4982Dp_UnU_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4982Dp_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1343_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1343_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1343_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1343, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1343_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1343_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DP_UBI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_Ubi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DP_PLG_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_Plg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DP_DUB_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_DUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DP_UNU_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_UnU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DP_PZU_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_PzU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DP_PZD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_PzD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DP_UND_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_UnD_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow16K1343( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801343( ) ;
      edtavnRcdDeleted_1343_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1343_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDp_Ubi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_UBI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDp_Plg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_PLG_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDp_DUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_DUB_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDp_UnU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_UNU_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDp_PzU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_PZU_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDp_PzD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_PZD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDp_UnD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DP_UND_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1343_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1343_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1343");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1343_Internalname ;
         wbErr = true ;
         nRcdDeleted_1343 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1343 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1343_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4978Dp_Ubi = httpContext.cgiGet( edtDp_Ubi_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDp_Plg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDp_Plg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "DP_PLG_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDp_Plg_Internalname ;
         wbErr = true ;
         A4979Dp_Plg = (short)(0) ;
      }
      else
      {
         A4979Dp_Plg = (short)(localUtil.ctol( httpContext.cgiGet( edtDp_Plg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1090Dp_DUb = httpContext.cgiGet( edtDp_DUb_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDp_UnU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDp_UnU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DP_UNU_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDp_UnU_Internalname ;
         wbErr = true ;
         A4982Dp_UnU = DecimalUtil.ZERO ;
         n4982Dp_UnU = false ;
      }
      else
      {
         A4982Dp_UnU = localUtil.ctond( httpContext.cgiGet( edtDp_UnU_Internalname)) ;
         n4982Dp_UnU = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDp_PzU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDp_PzU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "DP_PZU_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDp_PzU_Internalname ;
         wbErr = true ;
         A4344Dp_PzU = 0 ;
         n4344Dp_PzU = false ;
      }
      else
      {
         A4344Dp_PzU = (int)(localUtil.ctol( httpContext.cgiGet( edtDp_PzU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4344Dp_PzU = false ;
      }
      A4000Dp_PzD = (int)(localUtil.ctol( httpContext.cgiGet( edtDp_PzD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4001Dp_UnD = localUtil.ctond( httpContext.cgiGet( edtDp_UnD_Internalname)) ;
      GXCCtl = "Z4978Dp_Ubi_" + sGXsfl_80_idx ;
      Z4978Dp_Ubi = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4979Dp_Plg_" + sGXsfl_80_idx ;
      Z4979Dp_Plg = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4982Dp_UnU_" + sGXsfl_80_idx ;
      Z4982Dp_UnU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4344Dp_PzU_" + sGXsfl_80_idx ;
      Z4344Dp_PzU = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O4344Dp_PzU_" + sGXsfl_80_idx ;
      O4344Dp_PzU = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O4982Dp_UnU_" + sGXsfl_80_idx ;
      O4982Dp_UnU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1343_" + sGXsfl_80_idx ;
      nRcdDeleted_1343 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1343_" + sGXsfl_80_idx ;
      nRcdExists_1343 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1343_" + sGXsfl_80_idx ;
      nIsMod_1343 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDp_Plg_Enabled = edtDp_Plg_Enabled ;
      defedtDp_Ubi_Enabled = edtDp_Ubi_Enabled ;
   }

   public void confirmValues16K0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801343( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801343( ) ;
         httpContext.changePostValue( "Z4978Dp_Ubi_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z4978Dp_Ubi_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4978Dp_Ubi_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z4979Dp_Plg_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z4979Dp_Plg_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4979Dp_Plg_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z4982Dp_UnU_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z4982Dp_UnU_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4982Dp_UnU_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z4344Dp_PzU_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z4344Dp_PzU_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4344Dp_PzU_"+sGXsfl_80_idx) ;
      }
      httpContext.changePostValue( "O4344Dp_PzU", httpContext.cgiGet( "T4344Dp_PzU")) ;
      httpContext.deletePostValue( "T4344Dp_PzU") ;
      httpContext.changePostValue( "O4982Dp_UnU", httpContext.cgiGet( "T4982Dp_UnU")) ;
      httpContext.deletePostValue( "T4982Dp_UnU") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tubidpg", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A5322Dp_Nrecep,8,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Dp_Nrecep"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5322Dp_Nrecep", GXutil.ltrim( localUtil.ntoc( Z5322Dp_Nrecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6008Dp_Kgs", GXutil.ltrim( localUtil.ntoc( Z6008Dp_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5323Dp_Mts", GXutil.ltrim( localUtil.ntoc( Z5323Dp_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5891Dp_pzs", GXutil.ltrim( localUtil.ntoc( Z5891Dp_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1089Dp_SPz", GXutil.ltrim( localUtil.ntoc( O1089Dp_SPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1077Dp_SUn", GXutil.ltrim( localUtil.ntoc( O1077Dp_SUn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDUN", GXutil.ltrim( localUtil.ntoc( AV32OldUn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPZ", GXutil.ltrim( localUtil.ntoc( AV33Oldpz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tubidpg", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A5322Dp_Nrecep,8,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Dp_Nrecep"})  ;
   }

   public String getPgmname( )
   {
      return "TUBIDPG" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "SALIDAS DE UBICACIONES PLG", "") ;
   }

   public void initializeNonKey16K1342( )
   {
      A6008Dp_Kgs = DecimalUtil.ZERO ;
      n6008Dp_Kgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
      A5323Dp_Mts = DecimalUtil.ZERO ;
      n5323Dp_Mts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
      A5891Dp_pzs = 0 ;
      n5891Dp_pzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
      O1089Dp_SPz = A1089Dp_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
      O1077Dp_SUn = A1077Dp_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      Z6008Dp_Kgs = DecimalUtil.ZERO ;
      Z5323Dp_Mts = DecimalUtil.ZERO ;
      Z5891Dp_pzs = 0 ;
   }

   public void initAll16K1342( )
   {
      initializeNonKey16K1342( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16K1343( )
   {
      AV32OldUn = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
      AV33Oldpz = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
      A1090Dp_DUb = "" ;
      A4000Dp_PzD = 0 ;
      A4001Dp_UnD = DecimalUtil.ZERO ;
      A4982Dp_UnU = DecimalUtil.ZERO ;
      n4982Dp_UnU = false ;
      A4344Dp_PzU = 0 ;
      n4344Dp_PzU = false ;
      O4344Dp_PzU = A4344Dp_PzU ;
      n4344Dp_PzU = false ;
      O4982Dp_UnU = A4982Dp_UnU ;
      n4982Dp_UnU = false ;
      Z4982Dp_UnU = DecimalUtil.ZERO ;
      Z4344Dp_PzU = 0 ;
   }

   public void initAll16K1343( )
   {
      A4978Dp_Ubi = "" ;
      A4979Dp_Plg = (short)(0) ;
      initializeNonKey16K1343( ) ;
   }

   public void standaloneModalInsert16K1343( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824155661", true, true);
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
      httpContext.AddJavascriptSource("tubidpg.js", "?2026824155661", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1343( )
   {
      edtDp_Plg_Enabled = defedtDp_Plg_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Plg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Plg_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDp_Ubi_Enabled = defedtDp_Ubi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Ubi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Ubi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void startgridcontrol80( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1343, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1343_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4978Dp_Ubi));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_Ubi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4979Dp_Plg, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_Plg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1090Dp_DUb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_DUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4982Dp_UnU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_UnU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4344Dp_PzU, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_PzU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4000Dp_PzD, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_PzD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4001Dp_UnD, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDp_UnD_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDp_Nrecep_Internalname = "DP_NRECEP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDp_Kgs_Internalname = "DP_KGS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDp_Mts_Internalname = "DP_MTS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDp_pzs_Internalname = "DP_PZS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDp_SPz_Internalname = "DP_SPZ" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDp_SUn_Internalname = "DP_SUN" ;
      edtavnRcdDeleted_1343_Internalname = "vNRCDDELETED_1343" ;
      edtDp_Ubi_Internalname = "DP_UBI" ;
      edtDp_Plg_Internalname = "DP_PLG" ;
      edtDp_DUb_Internalname = "DP_DUB" ;
      edtDp_UnU_Internalname = "DP_UNU" ;
      edtDp_PzU_Internalname = "DP_PZU" ;
      edtDp_PzD_Internalname = "DP_PZD" ;
      edtDp_UnD_Internalname = "DP_UND" ;
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
      Form.setCaption( httpContext.getMessage( "SALIDAS DE UBICACIONES PLG", "") );
      edtDp_UnD_Jsonclick = "" ;
      edtDp_PzD_Jsonclick = "" ;
      edtDp_PzU_Jsonclick = "" ;
      edtDp_UnU_Jsonclick = "" ;
      edtDp_DUb_Jsonclick = "" ;
      edtDp_Plg_Jsonclick = "" ;
      edtDp_Ubi_Jsonclick = "" ;
      edtavnRcdDeleted_1343_Jsonclick = "" ;
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
      edtDp_UnD_Enabled = 0 ;
      edtDp_PzD_Enabled = 0 ;
      edtDp_PzU_Enabled = 1 ;
      edtDp_UnU_Enabled = 1 ;
      edtDp_DUb_Enabled = 0 ;
      edtDp_Plg_Enabled = 1 ;
      edtDp_Ubi_Enabled = 1 ;
      edtavnRcdDeleted_1343_Enabled = 1 ;
      edtDp_SUn_Jsonclick = "" ;
      edtDp_SUn_Backcolor = (int)(0xFFFFFF) ;
      edtDp_SUn_Enabled = 0 ;
      edtDp_SPz_Jsonclick = "" ;
      edtDp_SPz_Backcolor = (int)(0xFFFFFF) ;
      edtDp_SPz_Enabled = 0 ;
      edtBarUniMed_Jsonclick = "" ;
      edtBarUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtBarUniMed_Enabled = 0 ;
      edtDp_pzs_Jsonclick = "" ;
      edtDp_pzs_Backcolor = (int)(0xFFFFFF) ;
      edtDp_pzs_Enabled = 1 ;
      edtDp_Mts_Jsonclick = "" ;
      edtDp_Mts_Backcolor = (int)(0xFFFFFF) ;
      edtDp_Mts_Enabled = 1 ;
      edtDp_Kgs_Jsonclick = "" ;
      edtDp_Kgs_Backcolor = (int)(0xFFFFFF) ;
      edtDp_Kgs_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDp_Nrecep_Jsonclick = "" ;
      edtDp_Nrecep_Backcolor = (int)(0xFFFFFF) ;
      edtDp_Nrecep_Enabled = 0 ;
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

   public void gx2asadp_und16K1343( String A396EmprCod ,
                                    int A5322Dp_Nrecep ,
                                    String A4978Dp_Ubi ,
                                    short A4979Dp_Plg )
   {
      GXt_decimal8 = A4001Dp_UnD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A5322Dp_Nrecep ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_int9[0] = A4979Dp_Plg ;
      GXv_decimal13[0] = GXt_decimal8 ;
      new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_decimal13) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int12[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
      tubidpg_impl.this.GXt_decimal8 = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      A4001Dp_UnD = GXt_decimal8 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4001Dp_UnD, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asadp_pzd16K1343( String A396EmprCod ,
                                    int A5322Dp_Nrecep ,
                                    String A4978Dp_Ubi ,
                                    short A4979Dp_Plg )
   {
      GXt_int11 = (byte)(A4000Dp_PzD) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A5322Dp_Nrecep ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_int9[0] = A4979Dp_Plg ;
      GXv_int6[0] = GXt_int11 ;
      new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_int6) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int12[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
      tubidpg_impl.this.GXt_int11 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      A4000Dp_PzD = GXt_int11 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4000Dp_PzD, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asadp_dub16K1343( String A396EmprCod ,
                                    String A4978Dp_Ubi )
   {
      GXt_char1 = A1090Dp_DUb ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1090Dp_DUb = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1090Dp_DUb))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_13_16K1343( String A396EmprCod ,
                              int A5322Dp_Nrecep ,
                              String A4978Dp_Ubi ,
                              short A4979Dp_Plg ,
                              int A4344Dp_PzU ,
                              java.math.BigDecimal A4982Dp_UnU )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A5322Dp_Nrecep ;
         GXv_char3[0] = A4978Dp_Ubi ;
         GXv_int9[0] = A4979Dp_Plg ;
         GXv_int7[0] = 0 ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int5[0] = A4344Dp_PzU ;
         GXv_decimal10[0] = A4982Dp_UnU ;
         new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_int7, GXv_decimal13, GXv_int5, GXv_decimal10) ;
         A396EmprCod = GXv_char4[0] ;
         A5322Dp_Nrecep = GXv_int12[0] ;
         A4978Dp_Ubi = GXv_char3[0] ;
         A4979Dp_Plg = GXv_int9[0] ;
         A4344Dp_PzU = GXv_int5[0] ;
         A4982Dp_UnU = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5322Dp_Nrecep, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4978Dp_Ubi))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4979Dp_Plg, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4344Dp_PzU, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4982Dp_UnU, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_14_16K1343( String A396EmprCod ,
                              int A5322Dp_Nrecep ,
                              String A4978Dp_Ubi ,
                              short A4979Dp_Plg ,
                              int AV33Oldpz ,
                              java.math.BigDecimal AV32OldUn ,
                              int A4344Dp_PzU ,
                              java.math.BigDecimal A4982Dp_UnU )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A5322Dp_Nrecep ;
         GXv_char3[0] = A4978Dp_Ubi ;
         GXv_int9[0] = A4979Dp_Plg ;
         GXv_int7[0] = AV33Oldpz ;
         GXv_decimal13[0] = AV32OldUn ;
         GXv_int5[0] = A4344Dp_PzU ;
         GXv_decimal10[0] = A4982Dp_UnU ;
         new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_int7, GXv_decimal13, GXv_int5, GXv_decimal10) ;
         A396EmprCod = GXv_char4[0] ;
         A5322Dp_Nrecep = GXv_int12[0] ;
         A4978Dp_Ubi = GXv_char3[0] ;
         A4979Dp_Plg = GXv_int9[0] ;
         AV33Oldpz = GXv_int7[0] ;
         AV32OldUn = GXv_decimal13[0] ;
         A4344Dp_PzU = GXv_int5[0] ;
         A4982Dp_UnU = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5322Dp_Nrecep, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4978Dp_Ubi))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4979Dp_Plg, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Oldpz, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32OldUn, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4344Dp_PzU, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4982Dp_UnU, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_15_16K1343( String A396EmprCod ,
                              int A5322Dp_Nrecep ,
                              String A4978Dp_Ubi ,
                              short A4979Dp_Plg ,
                              int AV33Oldpz ,
                              java.math.BigDecimal AV32OldUn )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A5322Dp_Nrecep ;
         GXv_char3[0] = A4978Dp_Ubi ;
         GXv_int9[0] = A4979Dp_Plg ;
         GXv_int7[0] = AV33Oldpz ;
         GXv_decimal13[0] = AV32OldUn ;
         GXv_int5[0] = 0 ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_int7, GXv_decimal13, GXv_int5, GXv_decimal10) ;
         A396EmprCod = GXv_char4[0] ;
         A5322Dp_Nrecep = GXv_int12[0] ;
         A4978Dp_Ubi = GXv_char3[0] ;
         A4979Dp_Plg = GXv_int9[0] ;
         AV33Oldpz = GXv_int7[0] ;
         AV32OldUn = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Oldpz), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrimstr( AV32OldUn, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5322Dp_Nrecep, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4978Dp_Ubi))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4979Dp_Plg, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Oldpz, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32OldUn, (byte)(9), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_801343( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16K1343( ) ;
         standaloneModal16K1343( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16K1343( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801343( ) ;
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
      /* Using cursor T016K25 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016K25_A407EmprNom[0] ;
      n407EmprNom = T016K25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T016K26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A228BarUniMed = T016K26_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      pr_default.close(22);
      /* Using cursor T016K28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A1089Dp_SPz = T016K28_A1089Dp_SPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         A1077Dp_SUn = T016K28_A1077Dp_SUn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      else
      {
         A1089Dp_SPz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1089Dp_SPz), 6, 0));
         A1077Dp_SUn = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrimstr( A1077Dp_SUn, 9, 2));
      }
      pr_default.close(23);
      GX_FocusControl = edtDp_Kgs_Internalname ;
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

   public void valid_Dp_nrecep( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrim( localUtil.ntoc( A6008Dp_Kgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrim( localUtil.ntoc( A5323Dp_Mts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrim( localUtil.ntoc( A5891Dp_pzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", GXutil.rtrim( A228BarUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A1089Dp_SPz", GXutil.ltrim( localUtil.ntoc( A1089Dp_SPz, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1077Dp_SUn", GXutil.ltrim( localUtil.ntoc( A1077Dp_SUn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5322Dp_Nrecep", GXutil.ltrim( localUtil.ntoc( Z5322Dp_Nrecep, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6008Dp_Kgs", GXutil.ltrim( localUtil.ntoc( Z6008Dp_Kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5323Dp_Mts", GXutil.ltrim( localUtil.ntoc( Z5323Dp_Mts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5891Dp_pzs", GXutil.ltrim( localUtil.ntoc( Z5891Dp_pzs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z228BarUniMed", GXutil.rtrim( Z228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1089Dp_SPz", GXutil.ltrim( localUtil.ntoc( Z1089Dp_SPz, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1077Dp_SUn", GXutil.ltrim( localUtil.ntoc( Z1077Dp_SUn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1089Dp_SPz", GXutil.ltrim( localUtil.ntoc( O1089Dp_SPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1077Dp_SUn", GXutil.ltrim( localUtil.ntoc( O1077Dp_SUn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Dp_ubi( )
   {
      GXt_char1 = A1090Dp_DUb ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.GXt_char1 = GXv_char2[0] ;
      A1090Dp_DUb = GXt_char1 ;
      if ( ( GXutil.strcmp(A1090Dp_DUb, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No existe Ubicacion", ""), 1, "DP_UBI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDp_Ubi_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1090Dp_DUb", GXutil.rtrim( A1090Dp_DUb));
   }

   public void valid_Dp_plg( )
   {
      GXt_decimal8 = A4001Dp_UnD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A5322Dp_Nrecep ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_int9[0] = A4979Dp_Plg ;
      GXv_decimal13[0] = GXt_decimal8 ;
      new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_decimal13) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int12[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
      tubidpg_impl.this.GXt_decimal8 = GXv_decimal13[0] ;
      A4001Dp_UnD = GXt_decimal8 ;
      GXt_int11 = (byte)(A4000Dp_PzD) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A5322Dp_Nrecep ;
      GXv_char3[0] = A4978Dp_Ubi ;
      GXv_int9[0] = A4979Dp_Plg ;
      GXv_int6[0] = GXt_int11 ;
      new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int9, GXv_int6) ;
      tubidpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tubidpg_impl.this.A5322Dp_Nrecep = GXv_int12[0] ;
      tubidpg_impl.this.A4978Dp_Ubi = GXv_char3[0] ;
      tubidpg_impl.this.A4979Dp_Plg = GXv_int9[0] ;
      tubidpg_impl.this.GXt_int11 = GXv_int6[0] ;
      A4000Dp_PzD = GXt_int11 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4001Dp_UnD", GXutil.ltrim( localUtil.ntoc( A4001Dp_UnD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4000Dp_PzD", GXutil.ltrim( localUtil.ntoc( A4000Dp_PzD, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Dp_unu( )
   {
      n4982Dp_UnU = false ;
      AV32OldUn = O4982Dp_UnU ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldUn", GXutil.ltrim( localUtil.ntoc( AV32OldUn, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Dp_pzu( )
   {
      n4344Dp_PzU = false ;
      AV33Oldpz = O4344Dp_PzU ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV33Oldpz", GXutil.ltrim( localUtil.ntoc( AV33Oldpz, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A5322Dp_Nrecep',fld:'DP_NRECEP',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("EXIT","{handler:'e1116K2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A5322Dp_Nrecep',fld:'DP_NRECEP',pic:'ZZZZZZZ9'}]");
      setEventMetadata("EXIT",",oparms:[{av:'A5322Dp_Nrecep',fld:'DP_NRECEP',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_DP_NRECEP","{handler:'valid_Dp_nrecep',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A5322Dp_Nrecep',fld:'DP_NRECEP',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DP_NRECEP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A6008Dp_Kgs',fld:'DP_KGS',pic:'ZZZZZ9.99'},{av:'A5323Dp_Mts',fld:'DP_MTS',pic:'ZZZZZ9.99'},{av:'A5891Dp_pzs',fld:'DP_PZS',pic:'ZZZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A1089Dp_SPz',fld:'DP_SPZ',pic:'ZZZZZ9'},{av:'A1077Dp_SUn',fld:'DP_SUN',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z5322Dp_Nrecep'},{av:'Z407EmprNom'},{av:'Z6008Dp_Kgs'},{av:'Z5323Dp_Mts'},{av:'Z5891Dp_pzs'},{av:'Z228BarUniMed'},{av:'Z1089Dp_SPz'},{av:'Z1077Dp_SUn'},{av:'O1089Dp_SPz'},{av:'O1077Dp_SUn'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DP_PZS","{handler:'valid_Dp_pzs',iparms:[]");
      setEventMetadata("VALID_DP_PZS",",oparms:[]}");
      setEventMetadata("VALID_DP_SPZ","{handler:'valid_Dp_spz',iparms:[]");
      setEventMetadata("VALID_DP_SPZ",",oparms:[]}");
      setEventMetadata("VALID_DP_UBI","{handler:'valid_Dp_ubi',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4978Dp_Ubi',fld:'DP_UBI',pic:'!!!/!!!!!!'},{av:'A1090Dp_DUb',fld:'DP_DUB',pic:''}]");
      setEventMetadata("VALID_DP_UBI",",oparms:[{av:'A1090Dp_DUb',fld:'DP_DUB',pic:''}]}");
      setEventMetadata("VALID_DP_PLG","{handler:'valid_Dp_plg',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5322Dp_Nrecep',fld:'DP_NRECEP',pic:'ZZZZZZZ9'},{av:'A4978Dp_Ubi',fld:'DP_UBI',pic:'!!!/!!!!!!'},{av:'A4979Dp_Plg',fld:'DP_PLG',pic:'ZZ9'},{av:'A4001Dp_UnD',fld:'DP_UND',pic:'ZZZZZ9.99'},{av:'A4000Dp_PzD',fld:'DP_PZD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_DP_PLG",",oparms:[{av:'A4001Dp_UnD',fld:'DP_UND',pic:'ZZZZZ9.99'},{av:'A4000Dp_PzD',fld:'DP_PZD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_DP_UNU","{handler:'valid_Dp_unu',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O4982Dp_UnU'},{av:'O1077Dp_SUn'},{av:'A4982Dp_UnU',fld:'DP_UNU',pic:'ZZZZZ9.99'},{av:'AV32OldUn',fld:'vOLDUN',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_DP_UNU",",oparms:[{av:'AV32OldUn',fld:'vOLDUN',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_DP_PZU","{handler:'valid_Dp_pzu',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O4344Dp_PzU'},{av:'O1089Dp_SPz'},{av:'A4344Dp_PzU',fld:'DP_PZU',pic:'ZZZZZ9'},{av:'AV33Oldpz',fld:'vOLDPZ',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_DP_PZU",",oparms:[{av:'AV33Oldpz',fld:'vOLDPZ',pic:'ZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'valid_Dp_und',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z6008Dp_Kgs = DecimalUtil.ZERO ;
      Z5323Dp_Mts = DecimalUtil.ZERO ;
      O1077Dp_SUn = DecimalUtil.ZERO ;
      Z4978Dp_Ubi = "" ;
      Z4982Dp_UnU = DecimalUtil.ZERO ;
      O4982Dp_UnU = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4978Dp_Ubi = "" ;
      A4982Dp_UnU = DecimalUtil.ZERO ;
      AV32OldUn = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A6008Dp_Kgs = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A5323Dp_Mts = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A228BarUniMed = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A1077Dp_SUn = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B1077Dp_SUn = DecimalUtil.ZERO ;
      sMode1343 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1342 = "" ;
      s1077Dp_SUn = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A1090Dp_DUb = "" ;
      A4001Dp_UnD = DecimalUtil.ZERO ;
      T4982Dp_UnU = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z228BarUniMed = "" ;
      Z1077Dp_SUn = DecimalUtil.ZERO ;
      T016K6_A407EmprNom = new String[] {""} ;
      T016K6_n407EmprNom = new boolean[] {false} ;
      T016K7_A228BarUniMed = new String[] {""} ;
      T016K9_A1089Dp_SPz = new int[1] ;
      T016K9_A1077Dp_SUn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K11_A5322Dp_Nrecep = new int[1] ;
      T016K11_A407EmprNom = new String[] {""} ;
      T016K11_n407EmprNom = new boolean[] {false} ;
      T016K11_A6008Dp_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K11_n6008Dp_Kgs = new boolean[] {false} ;
      T016K11_A5323Dp_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K11_n5323Dp_Mts = new boolean[] {false} ;
      T016K11_A5891Dp_pzs = new int[1] ;
      T016K11_n5891Dp_pzs = new boolean[] {false} ;
      T016K11_A228BarUniMed = new String[] {""} ;
      T016K11_A396EmprCod = new String[] {""} ;
      T016K11_A129BarCod = new int[1] ;
      T016K11_A132BarCodReo = new byte[1] ;
      T016K11_A130BarCodPar = new String[] {""} ;
      T016K11_A1089Dp_SPz = new int[1] ;
      T016K11_A1077Dp_SUn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K12_A396EmprCod = new String[] {""} ;
      T016K12_A129BarCod = new int[1] ;
      T016K12_A132BarCodReo = new byte[1] ;
      T016K12_A130BarCodPar = new String[] {""} ;
      T016K12_A5322Dp_Nrecep = new int[1] ;
      T016K5_A5322Dp_Nrecep = new int[1] ;
      T016K5_A6008Dp_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K5_n6008Dp_Kgs = new boolean[] {false} ;
      T016K5_A5323Dp_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K5_n5323Dp_Mts = new boolean[] {false} ;
      T016K5_A5891Dp_pzs = new int[1] ;
      T016K5_n5891Dp_pzs = new boolean[] {false} ;
      T016K5_A396EmprCod = new String[] {""} ;
      T016K5_A129BarCod = new int[1] ;
      T016K5_A132BarCodReo = new byte[1] ;
      T016K5_A130BarCodPar = new String[] {""} ;
      T016K13_A396EmprCod = new String[] {""} ;
      T016K13_A129BarCod = new int[1] ;
      T016K13_A132BarCodReo = new byte[1] ;
      T016K13_A130BarCodPar = new String[] {""} ;
      T016K13_A5322Dp_Nrecep = new int[1] ;
      T016K14_A396EmprCod = new String[] {""} ;
      T016K14_A129BarCod = new int[1] ;
      T016K14_A132BarCodReo = new byte[1] ;
      T016K14_A130BarCodPar = new String[] {""} ;
      T016K14_A5322Dp_Nrecep = new int[1] ;
      T016K4_A5322Dp_Nrecep = new int[1] ;
      T016K4_A6008Dp_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K4_n6008Dp_Kgs = new boolean[] {false} ;
      T016K4_A5323Dp_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K4_n5323Dp_Mts = new boolean[] {false} ;
      T016K4_A5891Dp_pzs = new int[1] ;
      T016K4_n5891Dp_pzs = new boolean[] {false} ;
      T016K4_A396EmprCod = new String[] {""} ;
      T016K4_A129BarCod = new int[1] ;
      T016K4_A132BarCodReo = new byte[1] ;
      T016K4_A130BarCodPar = new String[] {""} ;
      T016K18_A396EmprCod = new String[] {""} ;
      T016K18_A129BarCod = new int[1] ;
      T016K18_A132BarCodReo = new byte[1] ;
      T016K18_A130BarCodPar = new String[] {""} ;
      T016K18_A5322Dp_Nrecep = new int[1] ;
      T016K19_A129BarCod = new int[1] ;
      T016K19_A132BarCodReo = new byte[1] ;
      T016K19_A130BarCodPar = new String[] {""} ;
      T016K19_A5322Dp_Nrecep = new int[1] ;
      T016K19_A4978Dp_Ubi = new String[] {""} ;
      T016K19_A4979Dp_Plg = new short[1] ;
      T016K19_A4982Dp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K19_n4982Dp_UnU = new boolean[] {false} ;
      T016K19_A4344Dp_PzU = new int[1] ;
      T016K19_n4344Dp_PzU = new boolean[] {false} ;
      T016K19_A396EmprCod = new String[] {""} ;
      T016K20_A396EmprCod = new String[] {""} ;
      T016K20_A129BarCod = new int[1] ;
      T016K20_A132BarCodReo = new byte[1] ;
      T016K20_A130BarCodPar = new String[] {""} ;
      T016K20_A5322Dp_Nrecep = new int[1] ;
      T016K20_A4978Dp_Ubi = new String[] {""} ;
      T016K20_A4979Dp_Plg = new short[1] ;
      T016K3_A129BarCod = new int[1] ;
      T016K3_A132BarCodReo = new byte[1] ;
      T016K3_A130BarCodPar = new String[] {""} ;
      T016K3_A5322Dp_Nrecep = new int[1] ;
      T016K3_A4978Dp_Ubi = new String[] {""} ;
      T016K3_A4979Dp_Plg = new short[1] ;
      T016K3_A4982Dp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K3_n4982Dp_UnU = new boolean[] {false} ;
      T016K3_A4344Dp_PzU = new int[1] ;
      T016K3_n4344Dp_PzU = new boolean[] {false} ;
      T016K3_A396EmprCod = new String[] {""} ;
      T016K2_A129BarCod = new int[1] ;
      T016K2_A132BarCodReo = new byte[1] ;
      T016K2_A130BarCodPar = new String[] {""} ;
      T016K2_A5322Dp_Nrecep = new int[1] ;
      T016K2_A4978Dp_Ubi = new String[] {""} ;
      T016K2_A4979Dp_Plg = new short[1] ;
      T016K2_A4982Dp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016K2_n4982Dp_UnU = new boolean[] {false} ;
      T016K2_A4344Dp_PzU = new int[1] ;
      T016K2_n4344Dp_PzU = new boolean[] {false} ;
      T016K2_A396EmprCod = new String[] {""} ;
      T016K24_A396EmprCod = new String[] {""} ;
      T016K24_A129BarCod = new int[1] ;
      T016K24_A132BarCodReo = new byte[1] ;
      T016K24_A130BarCodPar = new String[] {""} ;
      T016K24_A5322Dp_Nrecep = new int[1] ;
      T016K24_A4978Dp_Ubi = new String[] {""} ;
      T016K24_A4979Dp_Plg = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int7 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      T016K25_A407EmprNom = new String[] {""} ;
      T016K25_n407EmprNom = new boolean[] {false} ;
      T016K26_A228BarUniMed = new String[] {""} ;
      T016K28_A1089Dp_SPz = new int[1] ;
      T016K28_A1077Dp_SUn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ6008Dp_Kgs = DecimalUtil.ZERO ;
      ZZ5323Dp_Mts = DecimalUtil.ZERO ;
      ZZ228BarUniMed = "" ;
      ZZ1077Dp_SUn = DecimalUtil.ZERO ;
      ZO1077Dp_SUn = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Z1090Dp_DUb = "" ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int6 = new byte[1] ;
      Z4001Dp_UnD = DecimalUtil.ZERO ;
      ZV32OldUn = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tubidpg__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tubidpg__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tubidpg__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tubidpg__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tubidpg__default(),
         new Object[] {
             new Object[] {
            T016K2_A129BarCod, T016K2_A132BarCodReo, T016K2_A130BarCodPar, T016K2_A5322Dp_Nrecep, T016K2_A4978Dp_Ubi, T016K2_A4979Dp_Plg, T016K2_A4982Dp_UnU, T016K2_n4982Dp_UnU, T016K2_A4344Dp_PzU, T016K2_n4344Dp_PzU,
            T016K2_A396EmprCod
            }
            , new Object[] {
            T016K3_A129BarCod, T016K3_A132BarCodReo, T016K3_A130BarCodPar, T016K3_A5322Dp_Nrecep, T016K3_A4978Dp_Ubi, T016K3_A4979Dp_Plg, T016K3_A4982Dp_UnU, T016K3_n4982Dp_UnU, T016K3_A4344Dp_PzU, T016K3_n4344Dp_PzU,
            T016K3_A396EmprCod
            }
            , new Object[] {
            T016K4_A5322Dp_Nrecep, T016K4_A6008Dp_Kgs, T016K4_n6008Dp_Kgs, T016K4_A5323Dp_Mts, T016K4_n5323Dp_Mts, T016K4_A5891Dp_pzs, T016K4_n5891Dp_pzs, T016K4_A396EmprCod, T016K4_A129BarCod, T016K4_A132BarCodReo,
            T016K4_A130BarCodPar
            }
            , new Object[] {
            T016K5_A5322Dp_Nrecep, T016K5_A6008Dp_Kgs, T016K5_n6008Dp_Kgs, T016K5_A5323Dp_Mts, T016K5_n5323Dp_Mts, T016K5_A5891Dp_pzs, T016K5_n5891Dp_pzs, T016K5_A396EmprCod, T016K5_A129BarCod, T016K5_A132BarCodReo,
            T016K5_A130BarCodPar
            }
            , new Object[] {
            T016K6_A407EmprNom, T016K6_n407EmprNom
            }
            , new Object[] {
            T016K7_A228BarUniMed
            }
            , new Object[] {
            T016K9_A1089Dp_SPz, T016K9_A1077Dp_SUn
            }
            , new Object[] {
            T016K11_A5322Dp_Nrecep, T016K11_A407EmprNom, T016K11_n407EmprNom, T016K11_A6008Dp_Kgs, T016K11_n6008Dp_Kgs, T016K11_A5323Dp_Mts, T016K11_n5323Dp_Mts, T016K11_A5891Dp_pzs, T016K11_n5891Dp_pzs, T016K11_A228BarUniMed,
            T016K11_A396EmprCod, T016K11_A129BarCod, T016K11_A132BarCodReo, T016K11_A130BarCodPar, T016K11_A1089Dp_SPz, T016K11_A1077Dp_SUn
            }
            , new Object[] {
            T016K12_A396EmprCod, T016K12_A129BarCod, T016K12_A132BarCodReo, T016K12_A130BarCodPar, T016K12_A5322Dp_Nrecep
            }
            , new Object[] {
            T016K13_A396EmprCod, T016K13_A129BarCod, T016K13_A132BarCodReo, T016K13_A130BarCodPar, T016K13_A5322Dp_Nrecep
            }
            , new Object[] {
            T016K14_A396EmprCod, T016K14_A129BarCod, T016K14_A132BarCodReo, T016K14_A130BarCodPar, T016K14_A5322Dp_Nrecep
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016K18_A396EmprCod, T016K18_A129BarCod, T016K18_A132BarCodReo, T016K18_A130BarCodPar, T016K18_A5322Dp_Nrecep
            }
            , new Object[] {
            T016K19_A129BarCod, T016K19_A132BarCodReo, T016K19_A130BarCodPar, T016K19_A5322Dp_Nrecep, T016K19_A4978Dp_Ubi, T016K19_A4979Dp_Plg, T016K19_A4982Dp_UnU, T016K19_n4982Dp_UnU, T016K19_A4344Dp_PzU, T016K19_n4344Dp_PzU,
            T016K19_A396EmprCod
            }
            , new Object[] {
            T016K20_A396EmprCod, T016K20_A129BarCod, T016K20_A132BarCodReo, T016K20_A130BarCodPar, T016K20_A5322Dp_Nrecep, T016K20_A4978Dp_Ubi, T016K20_A4979Dp_Plg
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016K24_A396EmprCod, T016K24_A129BarCod, T016K24_A132BarCodReo, T016K24_A130BarCodPar, T016K24_A5322Dp_Nrecep, T016K24_A4978Dp_Ubi, T016K24_A4979Dp_Plg
            }
            , new Object[] {
            T016K25_A407EmprNom, T016K25_n407EmprNom
            }
            , new Object[] {
            T016K26_A228BarUniMed
            }
            , new Object[] {
            T016K28_A1089Dp_SPz, T016K28_A1077Dp_SUn
            }
         }
      );
      Z5322Dp_Nrecep = 0 ;
      A5322Dp_Nrecep = 0 ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TUBIDPG" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte GXt_int11 ;
   private byte GXv_int6[] ;
   private short Z4979Dp_Plg ;
   private short nRcdDeleted_1343 ;
   private short nRcdExists_1343 ;
   private short nIsMod_1343 ;
   private short A4979Dp_Plg ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1343 ;
   private short RcdFound1343 ;
   private short nBlankRcdUsr1343 ;
   private short RcdFound1342 ;
   private short nIsDirty_1342 ;
   private short nIsDirty_1343 ;
   private short GXv_int9[] ;
   private int wcpOA129BarCod ;
   private int wcpOA5322Dp_Nrecep ;
   private int Z129BarCod ;
   private int Z5322Dp_Nrecep ;
   private int Z5891Dp_pzs ;
   private int O1089Dp_SPz ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z4344Dp_PzU ;
   private int O4344Dp_PzU ;
   private int A5322Dp_Nrecep ;
   private int A4344Dp_PzU ;
   private int AV33Oldpz ;
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
   private int edtDp_Nrecep_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDp_Kgs_Enabled ;
   private int edtDp_Mts_Enabled ;
   private int A5891Dp_pzs ;
   private int edtDp_pzs_Enabled ;
   private int edtBarUniMed_Enabled ;
   private int A1089Dp_SPz ;
   private int edtDp_SPz_Enabled ;
   private int edtDp_SUn_Enabled ;
   private int B1089Dp_SPz ;
   private int edtavnRcdDeleted_1343_Enabled ;
   private int edtDp_Ubi_Enabled ;
   private int edtDp_Plg_Enabled ;
   private int edtDp_DUb_Enabled ;
   private int edtDp_UnU_Enabled ;
   private int edtDp_PzU_Enabled ;
   private int edtDp_PzD_Enabled ;
   private int edtDp_UnD_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s1089Dp_SPz ;
   private int A4000Dp_PzD ;
   private int T4344Dp_PzU ;
   private int GX_JID ;
   private int Z1089Dp_SPz ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtDp_Plg_Enabled ;
   private int defedtDp_Ubi_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtDp_SUn_Backcolor ;
   private int edtDp_SPz_Backcolor ;
   private int edtBarUniMed_Backcolor ;
   private int edtDp_pzs_Backcolor ;
   private int edtDp_Mts_Backcolor ;
   private int edtDp_Kgs_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDp_Nrecep_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private int ZZ129BarCod ;
   private int ZZ5322Dp_Nrecep ;
   private int ZZ5891Dp_pzs ;
   private int ZZ1089Dp_SPz ;
   private int ZO1089Dp_SPz ;
   private int GXv_int12[] ;
   private int Z4000Dp_PzD ;
   private int ZV33Oldpz ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6008Dp_Kgs ;
   private java.math.BigDecimal Z5323Dp_Mts ;
   private java.math.BigDecimal O1077Dp_SUn ;
   private java.math.BigDecimal Z4982Dp_UnU ;
   private java.math.BigDecimal O4982Dp_UnU ;
   private java.math.BigDecimal A4982Dp_UnU ;
   private java.math.BigDecimal AV32OldUn ;
   private java.math.BigDecimal A6008Dp_Kgs ;
   private java.math.BigDecimal A5323Dp_Mts ;
   private java.math.BigDecimal A1077Dp_SUn ;
   private java.math.BigDecimal B1077Dp_SUn ;
   private java.math.BigDecimal s1077Dp_SUn ;
   private java.math.BigDecimal A4001Dp_UnD ;
   private java.math.BigDecimal T4982Dp_UnU ;
   private java.math.BigDecimal Z1077Dp_SUn ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal ZZ6008Dp_Kgs ;
   private java.math.BigDecimal ZZ5323Dp_Mts ;
   private java.math.BigDecimal ZZ1077Dp_SUn ;
   private java.math.BigDecimal ZO1077Dp_SUn ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal Z4001Dp_UnD ;
   private java.math.BigDecimal ZV32OldUn ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z4978Dp_Ubi ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4978Dp_Ubi ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDp_Kgs_Internalname ;
   private String sGXsfl_80_idx="0001" ;
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
   private String edtDp_Nrecep_Internalname ;
   private String edtDp_Nrecep_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDp_Kgs_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDp_Mts_Internalname ;
   private String edtDp_Mts_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDp_pzs_Internalname ;
   private String edtDp_pzs_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarUniMed_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDp_SPz_Internalname ;
   private String edtDp_SPz_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDp_SUn_Internalname ;
   private String edtDp_SUn_Jsonclick ;
   private String sMode1343 ;
   private String edtavnRcdDeleted_1343_Internalname ;
   private String edtDp_Ubi_Internalname ;
   private String edtDp_Plg_Internalname ;
   private String edtDp_DUb_Internalname ;
   private String edtDp_UnU_Internalname ;
   private String edtDp_PzU_Internalname ;
   private String edtDp_PzD_Internalname ;
   private String edtDp_UnD_Internalname ;
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
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1342 ;
   private String GXCCtl ;
   private String A1090Dp_DUb ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z228BarUniMed ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1343_Jsonclick ;
   private String edtDp_Ubi_Jsonclick ;
   private String edtDp_Plg_Jsonclick ;
   private String edtDp_DUb_Jsonclick ;
   private String edtDp_UnU_Jsonclick ;
   private String edtDp_PzU_Jsonclick ;
   private String edtDp_PzD_Jsonclick ;
   private String edtDp_UnD_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String ZZ228BarUniMed ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z1090Dp_DUb ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4344Dp_PzU ;
   private boolean n4982Dp_UnU ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n6008Dp_Kgs ;
   private boolean n5323Dp_Mts ;
   private boolean n5891Dp_pzs ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T016K6_A407EmprNom ;
   private boolean[] T016K6_n407EmprNom ;
   private String[] T016K7_A228BarUniMed ;
   private int[] T016K9_A1089Dp_SPz ;
   private java.math.BigDecimal[] T016K9_A1077Dp_SUn ;
   private int[] T016K11_A5322Dp_Nrecep ;
   private String[] T016K11_A407EmprNom ;
   private boolean[] T016K11_n407EmprNom ;
   private java.math.BigDecimal[] T016K11_A6008Dp_Kgs ;
   private boolean[] T016K11_n6008Dp_Kgs ;
   private java.math.BigDecimal[] T016K11_A5323Dp_Mts ;
   private boolean[] T016K11_n5323Dp_Mts ;
   private int[] T016K11_A5891Dp_pzs ;
   private boolean[] T016K11_n5891Dp_pzs ;
   private String[] T016K11_A228BarUniMed ;
   private String[] T016K11_A396EmprCod ;
   private int[] T016K11_A129BarCod ;
   private byte[] T016K11_A132BarCodReo ;
   private String[] T016K11_A130BarCodPar ;
   private int[] T016K11_A1089Dp_SPz ;
   private java.math.BigDecimal[] T016K11_A1077Dp_SUn ;
   private String[] T016K12_A396EmprCod ;
   private int[] T016K12_A129BarCod ;
   private byte[] T016K12_A132BarCodReo ;
   private String[] T016K12_A130BarCodPar ;
   private int[] T016K12_A5322Dp_Nrecep ;
   private int[] T016K5_A5322Dp_Nrecep ;
   private java.math.BigDecimal[] T016K5_A6008Dp_Kgs ;
   private boolean[] T016K5_n6008Dp_Kgs ;
   private java.math.BigDecimal[] T016K5_A5323Dp_Mts ;
   private boolean[] T016K5_n5323Dp_Mts ;
   private int[] T016K5_A5891Dp_pzs ;
   private boolean[] T016K5_n5891Dp_pzs ;
   private String[] T016K5_A396EmprCod ;
   private int[] T016K5_A129BarCod ;
   private byte[] T016K5_A132BarCodReo ;
   private String[] T016K5_A130BarCodPar ;
   private String[] T016K13_A396EmprCod ;
   private int[] T016K13_A129BarCod ;
   private byte[] T016K13_A132BarCodReo ;
   private String[] T016K13_A130BarCodPar ;
   private int[] T016K13_A5322Dp_Nrecep ;
   private String[] T016K14_A396EmprCod ;
   private int[] T016K14_A129BarCod ;
   private byte[] T016K14_A132BarCodReo ;
   private String[] T016K14_A130BarCodPar ;
   private int[] T016K14_A5322Dp_Nrecep ;
   private int[] T016K4_A5322Dp_Nrecep ;
   private java.math.BigDecimal[] T016K4_A6008Dp_Kgs ;
   private boolean[] T016K4_n6008Dp_Kgs ;
   private java.math.BigDecimal[] T016K4_A5323Dp_Mts ;
   private boolean[] T016K4_n5323Dp_Mts ;
   private int[] T016K4_A5891Dp_pzs ;
   private boolean[] T016K4_n5891Dp_pzs ;
   private String[] T016K4_A396EmprCod ;
   private int[] T016K4_A129BarCod ;
   private byte[] T016K4_A132BarCodReo ;
   private String[] T016K4_A130BarCodPar ;
   private String[] T016K18_A396EmprCod ;
   private int[] T016K18_A129BarCod ;
   private byte[] T016K18_A132BarCodReo ;
   private String[] T016K18_A130BarCodPar ;
   private int[] T016K18_A5322Dp_Nrecep ;
   private int[] T016K19_A129BarCod ;
   private byte[] T016K19_A132BarCodReo ;
   private String[] T016K19_A130BarCodPar ;
   private int[] T016K19_A5322Dp_Nrecep ;
   private String[] T016K19_A4978Dp_Ubi ;
   private short[] T016K19_A4979Dp_Plg ;
   private java.math.BigDecimal[] T016K19_A4982Dp_UnU ;
   private boolean[] T016K19_n4982Dp_UnU ;
   private int[] T016K19_A4344Dp_PzU ;
   private boolean[] T016K19_n4344Dp_PzU ;
   private String[] T016K19_A396EmprCod ;
   private String[] T016K20_A396EmprCod ;
   private int[] T016K20_A129BarCod ;
   private byte[] T016K20_A132BarCodReo ;
   private String[] T016K20_A130BarCodPar ;
   private int[] T016K20_A5322Dp_Nrecep ;
   private String[] T016K20_A4978Dp_Ubi ;
   private short[] T016K20_A4979Dp_Plg ;
   private int[] T016K3_A129BarCod ;
   private byte[] T016K3_A132BarCodReo ;
   private String[] T016K3_A130BarCodPar ;
   private int[] T016K3_A5322Dp_Nrecep ;
   private String[] T016K3_A4978Dp_Ubi ;
   private short[] T016K3_A4979Dp_Plg ;
   private java.math.BigDecimal[] T016K3_A4982Dp_UnU ;
   private boolean[] T016K3_n4982Dp_UnU ;
   private int[] T016K3_A4344Dp_PzU ;
   private boolean[] T016K3_n4344Dp_PzU ;
   private String[] T016K3_A396EmprCod ;
   private int[] T016K2_A129BarCod ;
   private byte[] T016K2_A132BarCodReo ;
   private String[] T016K2_A130BarCodPar ;
   private int[] T016K2_A5322Dp_Nrecep ;
   private String[] T016K2_A4978Dp_Ubi ;
   private short[] T016K2_A4979Dp_Plg ;
   private java.math.BigDecimal[] T016K2_A4982Dp_UnU ;
   private boolean[] T016K2_n4982Dp_UnU ;
   private int[] T016K2_A4344Dp_PzU ;
   private boolean[] T016K2_n4344Dp_PzU ;
   private String[] T016K2_A396EmprCod ;
   private String[] T016K24_A396EmprCod ;
   private int[] T016K24_A129BarCod ;
   private byte[] T016K24_A132BarCodReo ;
   private String[] T016K24_A130BarCodPar ;
   private int[] T016K24_A5322Dp_Nrecep ;
   private String[] T016K24_A4978Dp_Ubi ;
   private short[] T016K24_A4979Dp_Plg ;
   private String[] T016K25_A407EmprNom ;
   private boolean[] T016K25_n407EmprNom ;
   private String[] T016K26_A228BarUniMed ;
   private int[] T016K28_A1089Dp_SPz ;
   private java.math.BigDecimal[] T016K28_A1077Dp_SUn ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tubidpg__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubidpg__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubidpg__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubidpg__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubidpg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016K2", "SELECT BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg, Dp_UnU, Dp_PzU, EmprCod FROM TXPUBIDPG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? AND Dp_Ubi = ? AND Dp_Plg = ?  FOR UPDATE OF Dp_UnU, Dp_PzU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016K3", "SELECT BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg, Dp_UnU, Dp_PzU, EmprCod FROM TXPUBIDPG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? AND Dp_Ubi = ? AND Dp_Plg = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016K4", "SELECT Dp_Nrecep, Dp_Kgs, Dp_Mts, Dp_pzs, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?  FOR UPDATE OF Dp_Kgs, Dp_Mts, Dp_pzs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K5", "SELECT Dp_Nrecep, Dp_Kgs, Dp_Mts, Dp_pzs, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K7", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K9", "SELECT COALESCE( T1.Dp_SPz, 0) AS Dp_SPz, COALESCE( T1.Dp_SUn, 0) AS Dp_SUn FROM (SELECT SUM(Dp_PzU) AS Dp_SPz, EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, SUM(Dp_UnU) AS Dp_SUn FROM TXPUBIDPG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.Dp_Nrecep = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K11", "SELECT /*+ FIRST_ROWS(1) */ TM1.Dp_Nrecep, T2.EmprNom, TM1.Dp_Kgs, TM1.Dp_Mts, TM1.Dp_pzs, T3.BarUniMed, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, COALESCE( T4.Dp_SPz, 0) AS Dp_SPz, COALESCE( T4.Dp_SUn, 0) AS Dp_SUn FROM (((TXPUBIDEP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN (SELECT SUM(Dp_PzU) AS Dp_SPz, EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, SUM(Dp_UnU) AS Dp_SUn FROM TXPUBIDPG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar AND T4.Dp_Nrecep = TM1.Dp_Nrecep) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.Dp_Nrecep = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.Dp_Nrecep ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Dp_Nrecep = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Dp_Nrecep = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, Dp_Nrecep DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016K15", "INSERT INTO TXPUBIDEP(Dp_Nrecep, Dp_Kgs, Dp_Mts, Dp_pzs, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPUBIDEP")
         ,new UpdateCursor("T016K16", "UPDATE TXPUBIDEP SET Dp_Kgs=?, Dp_Mts=?, Dp_pzs=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?", GX_NOMASK, "TXPUBIDEP")
         ,new UpdateCursor("T016K17", "DELETE FROM TXPUBIDEP  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?", GX_NOMASK, "TXPUBIDEP")
         ,new ForEachCursor("T016K18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Dp_Nrecep = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K19", "SELECT BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg, Dp_UnU, Dp_PzU, EmprCod FROM TXPUBIDPG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Dp_Nrecep = ? and Dp_Ubi = ? and Dp_Plg = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016K20", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg FROM TXPUBIDPG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? AND Dp_Ubi = ? AND Dp_Plg = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016K21", "INSERT INTO TXPUBIDPG(BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg, Dp_UnU, Dp_PzU, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPUBIDPG")
         ,new UpdateCursor("T016K22", "UPDATE TXPUBIDPG SET Dp_UnU=?, Dp_PzU=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? AND Dp_Ubi = ? AND Dp_Plg = ?", GX_NOMASK, "TXPUBIDPG")
         ,new UpdateCursor("T016K23", "DELETE FROM TXPUBIDPG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? AND Dp_Ubi = ? AND Dp_Plg = ?", GX_NOMASK, "TXPUBIDPG")
         ,new ForEachCursor("T016K24", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg FROM TXPUBIDPG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Dp_Nrecep = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016K25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K26", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016K28", "SELECT COALESCE( T1.Dp_SPz, 0) AS Dp_SPz, COALESCE( T1.Dp_SUn, 0) AS Dp_SUn FROM (SELECT SUM(Dp_PzU) AS Dp_SPz, EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, SUM(Dp_UnU) AS Dp_SUn FROM TXPUBIDPG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.Dp_Nrecep = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((String[]) buf[13])[0] = rslt.getString(10, 1);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 10);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 10);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               return;
            case 12 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 10);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 10);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 10);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               stmt.setString(9, (String)parms[10], 3);
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
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setString(8, (String)parms[9], 10);
               stmt.setShort(9, ((Number) parms[10]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 10);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

