package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttslcc_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "Barcod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_UR467( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A3226SolLuzCliC = (int)(GXutil.lval( httpContext.GetPar( "SolLuzCliC"))) ;
         n3226SolLuzCliC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         A3219SolLuzMat = httpContext.GetPar( "SolLuzMat") ;
         n3219SolLuzMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
         A3221SolLuzTip = (short)(GXutil.lval( httpContext.GetPar( "SolLuzTip"))) ;
         n3221SolLuzTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         A3220SolLuzSer = httpContext.GetPar( "SolLuzSer") ;
         n3220SolLuzSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
         A3222SolLuzDisN = httpContext.GetPar( "SolLuzDisN") ;
         n3222SolLuzDisN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
         A3223SolLuzNom = httpContext.GetPar( "SolLuzNom") ;
         n3223SolLuzNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
         A3224SolLuzNum = (int)(GXutil.lval( httpContext.GetPar( "SolLuzNum"))) ;
         n3224SolLuzNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         A3227SolLuzCliN = httpContext.GetPar( "SolLuzCliN") ;
         n3227SolLuzCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
         A3232SolLuzRef = httpContext.GetPar( "SolLuzRef") ;
         n3232SolLuzRef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_UR467( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A3226SolLuzCliC, A3219SolLuzMat, A3221SolLuzTip, A3220SolLuzSer, A3222SolLuzDisN, A3223SolLuzNom, A3224SolLuzNum, A3227SolLuzCliN, A3232SolLuzRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3230SolLuzMaq = httpContext.GetPar( "SolLuzMaq") ;
         n3230SolLuzMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
         AV19FlagM = (byte)(GXutil.lval( httpContext.GetPar( "FlagM"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_UR467( A396EmprCod, A3230SolLuzMaq, AV19FlagM) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action28") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV41FlagCal = (int)(GXutil.lval( httpContext.GetPar( "FlagCal"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41FlagCal), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_28_UR467( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV41FlagCal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV55FlagHdr = (byte)(GXutil.lval( httpContext.GetPar( "FlagHdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55FlagHdr", GXutil.str( AV55FlagHdr, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_UR467( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV55FlagHdr) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "Barcod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Barcod") ;
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
         AV56Barcod = (int)(GXutil.lval( gxfirstwebparm)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Barcod), 8, 0));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV57Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57Barcodreo", GXutil.str( AV57Barcodreo, 1, 0));
            AV58Barcodpar = httpContext.GetPar( "Barcodpar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58Barcodpar", AV58Barcodpar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TEST SOLIDEZ LUZ,PARM", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSolLuzCod_Internalname ;
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
      nRC_GXsfl_130 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_130"))) ;
      nGXsfl_130_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_130_idx"))) ;
      sGXsfl_130_idx = httpContext.GetPar( "sGXsfl_130_idx") ;
      A3231SolLuzUlin = (byte)(GXutil.lval( httpContext.GetPar( "SolLuzUlin"))) ;
      n3231SolLuzUlin = false ;
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

   public ttslcc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttslcc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttslcc_impl.class ));
   }

   public ttslcc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTSLCC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Num Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3218SolLuzCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3218SolLuzCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3218SolLuzCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzCod_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzMat_Internalname, GXutil.rtrim( A3219SolLuzMat), GXutil.rtrim( localUtil.format( A3219SolLuzMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzMat_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzSer_Internalname, GXutil.rtrim( A3220SolLuzSer), GXutil.rtrim( localUtil.format( A3220SolLuzSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzSer_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo ARticulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzTip_Internalname, GXutil.ltrim( localUtil.ntoc( A3221SolLuzTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3221SolLuzTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3221SolLuzTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzTip_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Disp Cli", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzDisN_Internalname, GXutil.rtrim( A3222SolLuzDisN), GXutil.rtrim( localUtil.format( A3222SolLuzDisN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzDisN_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzDisN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzNom_Internalname, GXutil.rtrim( A3223SolLuzNom), GXutil.rtrim( localUtil.format( A3223SolLuzNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzNom_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3224SolLuzNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3224SolLuzNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3224SolLuzNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzNum_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Test", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSolLuzFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzFec_Internalname, localUtil.format(A3225SolLuzFec, "99/99/99"), localUtil.format( A3225SolLuzFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzFec_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSolLuzFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSolLuzFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTSLCC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cliente Codigo", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A3226SolLuzCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzCliC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3226SolLuzCliC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3226SolLuzCliC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzCliC_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzCliC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzCliN_Internalname, GXutil.rtrim( A3227SolLuzCliN), GXutil.rtrim( localUtil.format( A3227SolLuzCliN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzCliN_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Valor Resultado", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzSol_Internalname, GXutil.rtrim( A3228SolLuzSol), GXutil.rtrim( localUtil.format( A3228SolLuzSol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzSol_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzSol_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Norma Iso", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzNor_Internalname, GXutil.rtrim( A3229SolLuzNor), GXutil.rtrim( localUtil.format( A3229SolLuzNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzNor_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzNor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzMaq_Internalname, GXutil.rtrim( A3230SolLuzMaq), GXutil.rtrim( localUtil.format( A3230SolLuzMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzMaq_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A3231SolLuzUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3231SolLuzUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3231SolLuzUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzUlin_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "SolLuzRef", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzRef_Internalname, GXutil.rtrim( A3232SolLuzRef), GXutil.rtrim( localUtil.format( A3232SolLuzRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzRef_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzRef_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSLCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol130( ) ;
      nGXsfl_130_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount468 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_468 = (short)(1) ;
            scanStartUR468( ) ;
            while ( RcdFound468 != 0 )
            {
               init_level_properties468( ) ;
               getByPrimaryKeyUR468( ) ;
               addRowUR468( ) ;
               scanNextUR468( ) ;
            }
            scanEndUR468( ) ;
            nBlankRcdCount468 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3231SolLuzUlin = A3231SolLuzUlin ;
         n3231SolLuzUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         standaloneNotModalUR468( ) ;
         standaloneModalUR468( ) ;
         sMode468 = Gx_mode ;
         while ( nGXsfl_130_idx < nRC_GXsfl_130 )
         {
            bGXsfl_130_Refreshing = true ;
            readRowUR468( ) ;
            edtavnRcdDeleted_468_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_468_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_468_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtSolLuzLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtSolLuzObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolLuzObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzObs_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            if ( ( nRcdExists_468 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalUR468( ) ;
            }
            sendRowUR468( ) ;
            bGXsfl_130_Refreshing = false ;
         }
         Gx_mode = sMode468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3231SolLuzUlin = B3231SolLuzUlin ;
         n3231SolLuzUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount468 = (short)(5) ;
         nRcdExists_468 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartUR468( ) ;
            while ( RcdFound468 != 0 )
            {
               sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_130468( ) ;
               init_level_properties468( ) ;
               standaloneNotModalUR468( ) ;
               getByPrimaryKeyUR468( ) ;
               standaloneModalUR468( ) ;
               addRowUR468( ) ;
               scanNextUR468( ) ;
            }
            scanEndUR468( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode468 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_130468( ) ;
      initAllUR468( ) ;
      init_level_properties468( ) ;
      B3231SolLuzUlin = A3231SolLuzUlin ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      nRcdExists_468 = (short)(0) ;
      nIsMod_468 = (short)(0) ;
      nRcdDeleted_468 = (short)(0) ;
      nBlankRcdCount468 = (short)(nBlankRcdUsr468+nBlankRcdCount468) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount468 > 0 )
      {
         standaloneNotModalUR468( ) ;
         standaloneModalUR468( ) ;
         addRowUR468( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtSolLuzLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount468 = (short)(nBlankRcdCount468-1) ;
      }
      Gx_mode = sMode468 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3231SolLuzUlin = B3231SolLuzUlin ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSLCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTSLCC.htm");
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
      e11UR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z3218SolLuzCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3218SolLuzCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z3219SolLuzMat = httpContext.cgiGet( "Z3219SolLuzMat") ;
            Z3220SolLuzSer = httpContext.cgiGet( "Z3220SolLuzSer") ;
            Z3221SolLuzTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z3221SolLuzTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3222SolLuzDisN = httpContext.cgiGet( "Z3222SolLuzDisN") ;
            Z3223SolLuzNom = httpContext.cgiGet( "Z3223SolLuzNom") ;
            Z3224SolLuzNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z3224SolLuzNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3225SolLuzFec = localUtil.ctod( httpContext.cgiGet( "Z3225SolLuzFec"), 0) ;
            Z3226SolLuzCliC = (int)(localUtil.ctol( httpContext.cgiGet( "Z3226SolLuzCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3227SolLuzCliN = httpContext.cgiGet( "Z3227SolLuzCliN") ;
            Z3228SolLuzSol = httpContext.cgiGet( "Z3228SolLuzSol") ;
            Z3229SolLuzNor = httpContext.cgiGet( "Z3229SolLuzNor") ;
            Z3230SolLuzMaq = httpContext.cgiGet( "Z3230SolLuzMaq") ;
            Z3231SolLuzUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3231SolLuzUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3232SolLuzRef = httpContext.cgiGet( "Z3232SolLuzRef") ;
            Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3231SolLuzUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "O3231SolLuzUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_130 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_130"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV56Barcod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV57Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV58Barcodpar = httpContext.cgiGet( "vBARCODPAR") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41FlagCal = (int)(localUtil.ctol( httpContext.cgiGet( "vFLAGCAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            AV19FlagM = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV55FlagHdr = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGHDR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLLUZCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSolLuzCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3218SolLuzCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
            }
            else
            {
               A3218SolLuzCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSolLuzCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A3219SolLuzMat = httpContext.cgiGet( edtSolLuzMat_Internalname) ;
            n3219SolLuzMat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
            A3220SolLuzSer = httpContext.cgiGet( edtSolLuzSer_Internalname) ;
            n3220SolLuzSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
            A3221SolLuzTip = (short)(localUtil.ctol( httpContext.cgiGet( edtSolLuzTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3221SolLuzTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
            A3222SolLuzDisN = httpContext.cgiGet( edtSolLuzDisN_Internalname) ;
            n3222SolLuzDisN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
            A3223SolLuzNom = httpContext.cgiGet( edtSolLuzNom_Internalname) ;
            n3223SolLuzNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
            A3224SolLuzNum = (int)(localUtil.ctol( httpContext.cgiGet( edtSolLuzNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3224SolLuzNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtSolLuzFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SOLLUZFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSolLuzFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3225SolLuzFec = GXutil.nullDate() ;
               n3225SolLuzFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
            }
            else
            {
               A3225SolLuzFec = localUtil.ctod( httpContext.cgiGet( edtSolLuzFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3225SolLuzFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A652OpeCod = 0 ;
               n652OpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            }
            else
            {
               A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n652OpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            }
            A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
            n653OpeNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
            A3226SolLuzCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtSolLuzCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3226SolLuzCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
            A3227SolLuzCliN = httpContext.cgiGet( edtSolLuzCliN_Internalname) ;
            n3227SolLuzCliN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
            A3228SolLuzSol = httpContext.cgiGet( edtSolLuzSol_Internalname) ;
            n3228SolLuzSol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", A3228SolLuzSol);
            A3229SolLuzNor = httpContext.cgiGet( edtSolLuzNor_Internalname) ;
            n3229SolLuzNor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", A3229SolLuzNor);
            A3230SolLuzMaq = httpContext.cgiGet( edtSolLuzMaq_Internalname) ;
            n3230SolLuzMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
            A3231SolLuzUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolLuzUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3231SolLuzUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
            A3232SolLuzRef = httpContext.cgiGet( edtSolLuzRef_Internalname) ;
            n3232SolLuzRef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
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
               A3218SolLuzCod = (int)(GXutil.lval( httpContext.GetPar( "SolLuzCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
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
                        e11UR2 ();
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
            initAllUR467( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_468_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_468_Enabled), 5, 0), !bGXsfl_130_Refreshing);
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
      disableAttributesUR467( ) ;
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

   public void confirm_UR0( )
   {
      beforeValidateUR467( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsUR467( ) ;
         }
         else
         {
            checkExtendedTableUR467( ) ;
            if ( AnyError == 0 )
            {
               zmUR467( 37) ;
               zmUR467( 38) ;
            }
            closeExtendedTableCursorsUR467( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode467 = Gx_mode ;
         confirm_UR468( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode467 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode467 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesUR0( ) ;
      }
   }

   public void confirm_UR468( )
   {
      s3231SolLuzUlin = O3231SolLuzUlin ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      nGXsfl_130_idx = 0 ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         readRowUR468( ) ;
         if ( ( nRcdExists_468 != 0 ) || ( nIsMod_468 != 0 ) )
         {
            getKeyUR468( ) ;
            if ( ( nRcdExists_468 == 0 ) && ( nRcdDeleted_468 == 0 ) )
            {
               if ( RcdFound468 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateUR468( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableUR468( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsUR468( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3231SolLuzUlin = A3231SolLuzUlin ;
                     n3231SolLuzUlin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "SOLLUZLIN_" + sGXsfl_130_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSolLuzLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound468 != 0 )
               {
                  if ( nRcdDeleted_468 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyUR468( ) ;
                     loadUR468( ) ;
                     beforeValidateUR468( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsUR468( ) ;
                        O3231SolLuzUlin = A3231SolLuzUlin ;
                        n3231SolLuzUlin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_468 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateUR468( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableUR468( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsUR468( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3231SolLuzUlin = A3231SolLuzUlin ;
                           n3231SolLuzUlin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_468 == 0 )
                  {
                     GXCCtl = "SOLLUZLIN_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolLuzLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_468_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolLuzLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolLuzObs_Internalname, GXutil.rtrim( A3234SolLuzObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3233SolLuzLin_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3234SolLuzObs_"+sGXsfl_130_idx, GXutil.rtrim( Z3234SolLuzObs)) ;
         httpContext.changePostValue( "nRcdDeleted_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_468 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_468_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3231SolLuzUlin = s3231SolLuzUlin ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionUR0( )
   {
   }

   public void e11UR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      ttslcc_impl.this.A396EmprCod = GXv_char1[0] ;
      ttslcc_impl.this.AV16EmprNom = GXv_char2[0] ;
      ttslcc_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV21LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char4 = AV20Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char4 = AV35Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1098_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV35Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit4", AV35Lit4);
      GXt_char4 = AV38Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV38Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit7", AV38Lit7);
      GXt_char4 = AV47LitSer ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "BARSER", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV47LitSer = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47LitSer", AV47LitSer);
      GXt_char4 = AV53LitCli ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV53LitCli = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53LitCli", AV53LitCli);
      GXt_char4 = AV46LitMat ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV46LitMat = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46LitMat", AV46LitMat);
      GXt_char4 = AV43LitNTest ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT374_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV43LitNTest = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43LitNTest", AV43LitNTest);
      GXt_char4 = AV42LitFTest ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT310_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV42LitFTest = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42LitFTest", AV42LitFTest);
      GXt_char4 = AV44LitHDR ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT171_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV44LitHDR = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44LitHDR", AV44LitHDR);
      GXt_char4 = AV49LitNorma ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA005", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV49LitNorma = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49LitNorma", AV49LitNorma);
      GXt_char4 = AV48LitMaq ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV48LitMaq = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48LitMaq", AV48LitMaq);
      GXt_char4 = AV50LitResul ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT184_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV50LitResul = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50LitResul", AV50LitResul);
      GXt_char4 = AV52LitOper ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV52LitOper = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52LitOper", AV52LitOper);
      GXt_char4 = AV51LitObser ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT185_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV51LitObser = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51LitObser", AV51LitObser);
      GXt_char4 = AV54LitTit ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA020", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV54LitTit = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54LitTit", AV54LitTit);
      GXt_char4 = AV45LitRef ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2402_", ""), (byte)(99), GXv_char3) ;
      ttslcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV45LitRef = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45LitRef", AV45LitRef);
   }

   public void zmUR467( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z129BarCod = T00UR5_A129BarCod[0] ;
            Z132BarCodReo = T00UR5_A132BarCodReo[0] ;
            Z130BarCodPar = T00UR5_A130BarCodPar[0] ;
            Z3219SolLuzMat = T00UR5_A3219SolLuzMat[0] ;
            Z3220SolLuzSer = T00UR5_A3220SolLuzSer[0] ;
            Z3221SolLuzTip = T00UR5_A3221SolLuzTip[0] ;
            Z3222SolLuzDisN = T00UR5_A3222SolLuzDisN[0] ;
            Z3223SolLuzNom = T00UR5_A3223SolLuzNom[0] ;
            Z3224SolLuzNum = T00UR5_A3224SolLuzNum[0] ;
            Z3225SolLuzFec = T00UR5_A3225SolLuzFec[0] ;
            Z3226SolLuzCliC = T00UR5_A3226SolLuzCliC[0] ;
            Z3227SolLuzCliN = T00UR5_A3227SolLuzCliN[0] ;
            Z3228SolLuzSol = T00UR5_A3228SolLuzSol[0] ;
            Z3229SolLuzNor = T00UR5_A3229SolLuzNor[0] ;
            Z3230SolLuzMaq = T00UR5_A3230SolLuzMaq[0] ;
            Z3231SolLuzUlin = T00UR5_A3231SolLuzUlin[0] ;
            Z3232SolLuzRef = T00UR5_A3232SolLuzRef[0] ;
            Z652OpeCod = T00UR5_A652OpeCod[0] ;
         }
         else
         {
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z3219SolLuzMat = A3219SolLuzMat ;
            Z3220SolLuzSer = A3220SolLuzSer ;
            Z3221SolLuzTip = A3221SolLuzTip ;
            Z3222SolLuzDisN = A3222SolLuzDisN ;
            Z3223SolLuzNom = A3223SolLuzNom ;
            Z3224SolLuzNum = A3224SolLuzNum ;
            Z3225SolLuzFec = A3225SolLuzFec ;
            Z3226SolLuzCliC = A3226SolLuzCliC ;
            Z3227SolLuzCliN = A3227SolLuzCliN ;
            Z3228SolLuzSol = A3228SolLuzSol ;
            Z3229SolLuzNor = A3229SolLuzNor ;
            Z3230SolLuzMaq = A3230SolLuzMaq ;
            Z3231SolLuzUlin = A3231SolLuzUlin ;
            Z3232SolLuzRef = A3232SolLuzRef ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z3218SolLuzCod = A3218SolLuzCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z3219SolLuzMat = A3219SolLuzMat ;
         Z3220SolLuzSer = A3220SolLuzSer ;
         Z3221SolLuzTip = A3221SolLuzTip ;
         Z3222SolLuzDisN = A3222SolLuzDisN ;
         Z3223SolLuzNom = A3223SolLuzNom ;
         Z3224SolLuzNum = A3224SolLuzNum ;
         Z3225SolLuzFec = A3225SolLuzFec ;
         Z3226SolLuzCliC = A3226SolLuzCliC ;
         Z3227SolLuzCliN = A3227SolLuzCliN ;
         Z3228SolLuzSol = A3228SolLuzSol ;
         Z3229SolLuzNor = A3229SolLuzNor ;
         Z3230SolLuzMaq = A3230SolLuzMaq ;
         Z3231SolLuzUlin = A3231SolLuzUlin ;
         Z3232SolLuzRef = A3232SolLuzRef ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z407EmprNom = A407EmprNom ;
         Z653OpeNom = A653OpeNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolLuzCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCliC_Enabled), 5, 0), true);
      edtSolLuzCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCliN_Enabled), 5, 0), true);
      edtSolLuzNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNom_Enabled), 5, 0), true);
      edtSolLuzNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNum_Enabled), 5, 0), true);
      edtSolLuzDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzDisN_Enabled), 5, 0), true);
      edtSolLuzMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzMat_Enabled), 5, 0), true);
      edtSolLuzTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzTip_Enabled), 5, 0), true);
      edtSolLuzSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzSer_Enabled), 5, 0), true);
      edtSolLuzUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzUlin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolLuzCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCliC_Enabled), 5, 0), true);
      edtSolLuzCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCliN_Enabled), 5, 0), true);
      edtSolLuzNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNom_Enabled), 5, 0), true);
      edtSolLuzNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNum_Enabled), 5, 0), true);
      edtSolLuzDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzDisN_Enabled), 5, 0), true);
      edtSolLuzMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzMat_Enabled), 5, 0), true);
      edtSolLuzTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzTip_Enabled), 5, 0), true);
      edtSolLuzSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzSer_Enabled), 5, 0), true);
      edtSolLuzUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzUlin_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
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
      A130BarCodPar = AV58Barcodpar ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A132BarCodReo = AV57Barcodreo ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A129BarCod = AV56Barcod ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3225SolLuzFec)) && ( Gx_BScreen == 0 ) )
      {
         A3225SolLuzFec = GXutil.today( ) ;
         n3225SolLuzFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T00UR6 */
         pr_default.execute(4, new Object[] {A396EmprCod});
         A407EmprNom = T00UR6_A407EmprNom[0] ;
         n407EmprNom = T00UR6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(4);
      }
   }

   public void loadUR467( )
   {
      /* Using cursor T00UR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound467 = (short)(1) ;
         A129BarCod = T00UR8_A129BarCod[0] ;
         n129BarCod = T00UR8_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00UR8_A132BarCodReo[0] ;
         n132BarCodReo = T00UR8_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00UR8_A130BarCodPar[0] ;
         n130BarCodPar = T00UR8_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A407EmprNom = T00UR8_A407EmprNom[0] ;
         n407EmprNom = T00UR8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3219SolLuzMat = T00UR8_A3219SolLuzMat[0] ;
         n3219SolLuzMat = T00UR8_n3219SolLuzMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
         A3220SolLuzSer = T00UR8_A3220SolLuzSer[0] ;
         n3220SolLuzSer = T00UR8_n3220SolLuzSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
         A3221SolLuzTip = T00UR8_A3221SolLuzTip[0] ;
         n3221SolLuzTip = T00UR8_n3221SolLuzTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         A3222SolLuzDisN = T00UR8_A3222SolLuzDisN[0] ;
         n3222SolLuzDisN = T00UR8_n3222SolLuzDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
         A3223SolLuzNom = T00UR8_A3223SolLuzNom[0] ;
         n3223SolLuzNom = T00UR8_n3223SolLuzNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
         A3224SolLuzNum = T00UR8_A3224SolLuzNum[0] ;
         n3224SolLuzNum = T00UR8_n3224SolLuzNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         A3225SolLuzFec = T00UR8_A3225SolLuzFec[0] ;
         n3225SolLuzFec = T00UR8_n3225SolLuzFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
         A653OpeNom = T00UR8_A653OpeNom[0] ;
         n653OpeNom = T00UR8_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A3226SolLuzCliC = T00UR8_A3226SolLuzCliC[0] ;
         n3226SolLuzCliC = T00UR8_n3226SolLuzCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         A3227SolLuzCliN = T00UR8_A3227SolLuzCliN[0] ;
         n3227SolLuzCliN = T00UR8_n3227SolLuzCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
         A3228SolLuzSol = T00UR8_A3228SolLuzSol[0] ;
         n3228SolLuzSol = T00UR8_n3228SolLuzSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", A3228SolLuzSol);
         A3229SolLuzNor = T00UR8_A3229SolLuzNor[0] ;
         n3229SolLuzNor = T00UR8_n3229SolLuzNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", A3229SolLuzNor);
         A3230SolLuzMaq = T00UR8_A3230SolLuzMaq[0] ;
         n3230SolLuzMaq = T00UR8_n3230SolLuzMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
         A3231SolLuzUlin = T00UR8_A3231SolLuzUlin[0] ;
         n3231SolLuzUlin = T00UR8_n3231SolLuzUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         A3232SolLuzRef = T00UR8_A3232SolLuzRef[0] ;
         n3232SolLuzRef = T00UR8_n3232SolLuzRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
         A652OpeCod = T00UR8_A652OpeCod[0] ;
         n652OpeCod = T00UR8_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zmUR467( -36) ;
      }
      pr_default.close(6);
      onLoadActionsUR467( ) ;
   }

   public void onLoadActionsUR467( )
   {
      Gx_msg = httpContext.getMessage( httpContext.getMessage( "!AVISO.Esta Hoja Ruta/Ordem Serviço ya/ja tiene/te TEST = ", ""), "") + GXutil.str( AV41FlagCal, 8, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
   }

   public void checkExtendedTableUR467( )
   {
      nIsDirty_467 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( isIns( )  && ( ! (0==A3218SolLuzCod) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLLUZCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolLuzCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (0==A129BarCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja Ruta Incorrecta", ""), 1, "BARCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int7[0] = A3226SolLuzCliC ;
         GXv_char1[0] = A3219SolLuzMat ;
         GXv_int8[0] = A3221SolLuzTip ;
         GXv_char9[0] = A3220SolLuzSer ;
         GXv_char10[0] = A3222SolLuzDisN ;
         GXv_char11[0] = A3223SolLuzNom ;
         GXv_int12[0] = A3224SolLuzNum ;
         GXv_char13[0] = A3227SolLuzCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int15[0] = (short)(0) ;
         GXv_char16[0] = A3232SolLuzRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_char1, GXv_int8, GXv_char9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_int14, GXv_int15, GXv_char16) ;
         ttslcc_impl.this.A396EmprCod = GXv_char3[0] ;
         ttslcc_impl.this.A129BarCod = GXv_int5[0] ;
         ttslcc_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttslcc_impl.this.A130BarCodPar = GXv_char2[0] ;
         ttslcc_impl.this.A3226SolLuzCliC = GXv_int7[0] ;
         ttslcc_impl.this.A3219SolLuzMat = GXv_char1[0] ;
         ttslcc_impl.this.A3221SolLuzTip = GXv_int8[0] ;
         ttslcc_impl.this.A3220SolLuzSer = GXv_char9[0] ;
         ttslcc_impl.this.A3222SolLuzDisN = GXv_char10[0] ;
         ttslcc_impl.this.A3223SolLuzNom = GXv_char11[0] ;
         ttslcc_impl.this.A3224SolLuzNum = GXv_int12[0] ;
         ttslcc_impl.this.A3227SolLuzCliN = GXv_char13[0] ;
         ttslcc_impl.this.A3232SolLuzRef = GXv_char16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
         httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
         httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
         httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
         httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
         httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = AV41FlagCal ;
         new app.pctrluz(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int6, GXv_char13, GXv_int7) ;
         ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
         ttslcc_impl.this.A129BarCod = GXv_int12[0] ;
         ttslcc_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttslcc_impl.this.A130BarCodPar = GXv_char13[0] ;
         ttslcc_impl.this.AV41FlagCal = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41FlagCal), 8, 0));
      }
      Gx_msg = httpContext.getMessage( httpContext.getMessage( "!AVISO.Esta Hoja Ruta/Ordem Serviço ya/ja tiene/te TEST = ", ""), "") + GXutil.str( AV41FlagCal, 8, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV41FlagCal > 0 ) )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 0, "BARCODPAR");
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int17[0] = AV55FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int6, GXv_char13, GXv_int17) ;
         ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
         ttslcc_impl.this.A129BarCod = GXv_int12[0] ;
         ttslcc_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttslcc_impl.this.A130BarCodPar = GXv_char13[0] ;
         ttslcc_impl.this.AV55FlagHdr = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV55FlagHdr", GXutil.str( AV55FlagHdr, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ( AV55FlagHdr == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ( AV55FlagHdr == 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3230SolLuzMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
         ttslcc_impl.this.A3230SolLuzMaq = GXv_char13[0] ;
         ttslcc_impl.this.AV19FlagM = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A3230SolLuzMaq)==0) && (0==AV19FlagM) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, "SOLLUZMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolLuzMaq_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsUR467( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyUR467( )
   {
      /* Using cursor T00UR9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound467 = (short)(1) ;
      }
      else
      {
         RcdFound467 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00UR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00UR5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmUR467( 36) ;
         RcdFound467 = (short)(1) ;
         A3218SolLuzCod = T00UR5_A3218SolLuzCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
         A129BarCod = T00UR5_A129BarCod[0] ;
         n129BarCod = T00UR5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00UR5_A132BarCodReo[0] ;
         n132BarCodReo = T00UR5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00UR5_A130BarCodPar[0] ;
         n130BarCodPar = T00UR5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A3219SolLuzMat = T00UR5_A3219SolLuzMat[0] ;
         n3219SolLuzMat = T00UR5_n3219SolLuzMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
         A3220SolLuzSer = T00UR5_A3220SolLuzSer[0] ;
         n3220SolLuzSer = T00UR5_n3220SolLuzSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
         A3221SolLuzTip = T00UR5_A3221SolLuzTip[0] ;
         n3221SolLuzTip = T00UR5_n3221SolLuzTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         A3222SolLuzDisN = T00UR5_A3222SolLuzDisN[0] ;
         n3222SolLuzDisN = T00UR5_n3222SolLuzDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
         A3223SolLuzNom = T00UR5_A3223SolLuzNom[0] ;
         n3223SolLuzNom = T00UR5_n3223SolLuzNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
         A3224SolLuzNum = T00UR5_A3224SolLuzNum[0] ;
         n3224SolLuzNum = T00UR5_n3224SolLuzNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         A3225SolLuzFec = T00UR5_A3225SolLuzFec[0] ;
         n3225SolLuzFec = T00UR5_n3225SolLuzFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
         A3226SolLuzCliC = T00UR5_A3226SolLuzCliC[0] ;
         n3226SolLuzCliC = T00UR5_n3226SolLuzCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         A3227SolLuzCliN = T00UR5_A3227SolLuzCliN[0] ;
         n3227SolLuzCliN = T00UR5_n3227SolLuzCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
         A3228SolLuzSol = T00UR5_A3228SolLuzSol[0] ;
         n3228SolLuzSol = T00UR5_n3228SolLuzSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", A3228SolLuzSol);
         A3229SolLuzNor = T00UR5_A3229SolLuzNor[0] ;
         n3229SolLuzNor = T00UR5_n3229SolLuzNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", A3229SolLuzNor);
         A3230SolLuzMaq = T00UR5_A3230SolLuzMaq[0] ;
         n3230SolLuzMaq = T00UR5_n3230SolLuzMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
         A3231SolLuzUlin = T00UR5_A3231SolLuzUlin[0] ;
         n3231SolLuzUlin = T00UR5_n3231SolLuzUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         A3232SolLuzRef = T00UR5_A3232SolLuzRef[0] ;
         n3232SolLuzRef = T00UR5_n3232SolLuzRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
         A652OpeCod = T00UR5_A652OpeCod[0] ;
         n652OpeCod = T00UR5_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         O3231SolLuzUlin = A3231SolLuzUlin ;
         n3231SolLuzUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z3218SolLuzCod = A3218SolLuzCod ;
         sMode467 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadUR467( ) ;
         if ( AnyError == 1 )
         {
            RcdFound467 = (short)(0) ;
            initializeNonKeyUR467( ) ;
         }
         Gx_mode = sMode467 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound467 = (short)(0) ;
         initializeNonKeyUR467( ) ;
         sMode467 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode467 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyUR467( ) ;
      if ( RcdFound467 == 0 )
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
      RcdFound467 = (short)(0) ;
      /* Using cursor T00UR10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A3218SolLuzCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T00UR10_A3218SolLuzCod[0] < A3218SolLuzCod ) ) && ( GXutil.strcmp(T00UR10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T00UR10_A3218SolLuzCod[0] > A3218SolLuzCod ) ) && ( GXutil.strcmp(T00UR10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3218SolLuzCod = T00UR10_A3218SolLuzCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
            RcdFound467 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound467 = (short)(0) ;
      /* Using cursor T00UR11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A3218SolLuzCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00UR11_A3218SolLuzCod[0] > A3218SolLuzCod ) ) && ( GXutil.strcmp(T00UR11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00UR11_A3218SolLuzCod[0] < A3218SolLuzCod ) ) && ( GXutil.strcmp(T00UR11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3218SolLuzCod = T00UR11_A3218SolLuzCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
            RcdFound467 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyUR467( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3231SolLuzUlin = O3231SolLuzUlin ;
         n3231SolLuzUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         GX_FocusControl = edtSolLuzCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertUR467( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound467 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
            {
               A3218SolLuzCod = Z3218SolLuzCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3231SolLuzUlin = O3231SolLuzUlin ;
               n3231SolLuzUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSolLuzCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3231SolLuzUlin = O3231SolLuzUlin ;
               n3231SolLuzUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
               updateUR467( ) ;
               GX_FocusControl = edtSolLuzCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3231SolLuzUlin = O3231SolLuzUlin ;
               n3231SolLuzUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
               GX_FocusControl = edtSolLuzCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertUR467( ) ;
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
                  A3231SolLuzUlin = O3231SolLuzUlin ;
                  n3231SolLuzUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
                  GX_FocusControl = edtSolLuzCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertUR467( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
      {
         A3218SolLuzCod = Z3218SolLuzCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3231SolLuzUlin = O3231SolLuzUlin ;
         n3231SolLuzUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSolLuzCod_Internalname ;
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
      getKeyUR467( ) ;
      if ( RcdFound467 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
         {
            A3218SolLuzCod = Z3218SolLuzCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttslcc");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_UR0( ) ;
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
      if ( RcdFound467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartUR467( ) ;
      if ( RcdFound467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndUR467( ) ;
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
      if ( RcdFound467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      if ( RcdFound467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      scanStartUR467( ) ;
      if ( RcdFound467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound467 != 0 )
         {
            scanNextUR467( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndUR467( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyUR467( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00UR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCSOLLU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z129BarCod != T00UR4_A129BarCod[0] ) || ( Z132BarCodReo != T00UR4_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T00UR4_A130BarCodPar[0]) != 0 ) || ( GXutil.strcmp(Z3219SolLuzMat, T00UR4_A3219SolLuzMat[0]) != 0 ) || ( GXutil.strcmp(Z3220SolLuzSer, T00UR4_A3220SolLuzSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3221SolLuzTip != T00UR4_A3221SolLuzTip[0] ) || ( GXutil.strcmp(Z3222SolLuzDisN, T00UR4_A3222SolLuzDisN[0]) != 0 ) || ( GXutil.strcmp(Z3223SolLuzNom, T00UR4_A3223SolLuzNom[0]) != 0 ) || ( Z3224SolLuzNum != T00UR4_A3224SolLuzNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z3225SolLuzFec), GXutil.resetTime(T00UR4_A3225SolLuzFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3226SolLuzCliC != T00UR4_A3226SolLuzCliC[0] ) || ( GXutil.strcmp(Z3227SolLuzCliN, T00UR4_A3227SolLuzCliN[0]) != 0 ) || ( GXutil.strcmp(Z3228SolLuzSol, T00UR4_A3228SolLuzSol[0]) != 0 ) || ( GXutil.strcmp(Z3229SolLuzNor, T00UR4_A3229SolLuzNor[0]) != 0 ) || ( GXutil.strcmp(Z3230SolLuzMaq, T00UR4_A3230SolLuzMaq[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3231SolLuzUlin != T00UR4_A3231SolLuzUlin[0] ) || ( GXutil.strcmp(Z3232SolLuzRef, T00UR4_A3232SolLuzRef[0]) != 0 ) || ( Z652OpeCod != T00UR4_A652OpeCod[0] ) )
         {
            if ( Z129BarCod != T00UR4_A129BarCod[0] )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T00UR4_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T00UR4_A132BarCodReo[0] )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T00UR4_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T00UR4_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T00UR4_A130BarCodPar[0]);
            }
            if ( GXutil.strcmp(Z3219SolLuzMat, T00UR4_A3219SolLuzMat[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzMat");
               GXutil.writeLogRaw("Old: ",Z3219SolLuzMat);
               GXutil.writeLogRaw("Current: ",T00UR4_A3219SolLuzMat[0]);
            }
            if ( GXutil.strcmp(Z3220SolLuzSer, T00UR4_A3220SolLuzSer[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzSer");
               GXutil.writeLogRaw("Old: ",Z3220SolLuzSer);
               GXutil.writeLogRaw("Current: ",T00UR4_A3220SolLuzSer[0]);
            }
            if ( Z3221SolLuzTip != T00UR4_A3221SolLuzTip[0] )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzTip");
               GXutil.writeLogRaw("Old: ",Z3221SolLuzTip);
               GXutil.writeLogRaw("Current: ",T00UR4_A3221SolLuzTip[0]);
            }
            if ( GXutil.strcmp(Z3222SolLuzDisN, T00UR4_A3222SolLuzDisN[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzDisN");
               GXutil.writeLogRaw("Old: ",Z3222SolLuzDisN);
               GXutil.writeLogRaw("Current: ",T00UR4_A3222SolLuzDisN[0]);
            }
            if ( GXutil.strcmp(Z3223SolLuzNom, T00UR4_A3223SolLuzNom[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzNom");
               GXutil.writeLogRaw("Old: ",Z3223SolLuzNom);
               GXutil.writeLogRaw("Current: ",T00UR4_A3223SolLuzNom[0]);
            }
            if ( Z3224SolLuzNum != T00UR4_A3224SolLuzNum[0] )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzNum");
               GXutil.writeLogRaw("Old: ",Z3224SolLuzNum);
               GXutil.writeLogRaw("Current: ",T00UR4_A3224SolLuzNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3225SolLuzFec), GXutil.resetTime(T00UR4_A3225SolLuzFec[0])) ) )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzFec");
               GXutil.writeLogRaw("Old: ",Z3225SolLuzFec);
               GXutil.writeLogRaw("Current: ",T00UR4_A3225SolLuzFec[0]);
            }
            if ( Z3226SolLuzCliC != T00UR4_A3226SolLuzCliC[0] )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzCliC");
               GXutil.writeLogRaw("Old: ",Z3226SolLuzCliC);
               GXutil.writeLogRaw("Current: ",T00UR4_A3226SolLuzCliC[0]);
            }
            if ( GXutil.strcmp(Z3227SolLuzCliN, T00UR4_A3227SolLuzCliN[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzCliN");
               GXutil.writeLogRaw("Old: ",Z3227SolLuzCliN);
               GXutil.writeLogRaw("Current: ",T00UR4_A3227SolLuzCliN[0]);
            }
            if ( GXutil.strcmp(Z3228SolLuzSol, T00UR4_A3228SolLuzSol[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzSol");
               GXutil.writeLogRaw("Old: ",Z3228SolLuzSol);
               GXutil.writeLogRaw("Current: ",T00UR4_A3228SolLuzSol[0]);
            }
            if ( GXutil.strcmp(Z3229SolLuzNor, T00UR4_A3229SolLuzNor[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzNor");
               GXutil.writeLogRaw("Old: ",Z3229SolLuzNor);
               GXutil.writeLogRaw("Current: ",T00UR4_A3229SolLuzNor[0]);
            }
            if ( GXutil.strcmp(Z3230SolLuzMaq, T00UR4_A3230SolLuzMaq[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzMaq");
               GXutil.writeLogRaw("Old: ",Z3230SolLuzMaq);
               GXutil.writeLogRaw("Current: ",T00UR4_A3230SolLuzMaq[0]);
            }
            if ( Z3231SolLuzUlin != T00UR4_A3231SolLuzUlin[0] )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzUlin");
               GXutil.writeLogRaw("Old: ",Z3231SolLuzUlin);
               GXutil.writeLogRaw("Current: ",T00UR4_A3231SolLuzUlin[0]);
            }
            if ( GXutil.strcmp(Z3232SolLuzRef, T00UR4_A3232SolLuzRef[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzRef");
               GXutil.writeLogRaw("Old: ",Z3232SolLuzRef);
               GXutil.writeLogRaw("Current: ",T00UR4_A3232SolLuzRef[0]);
            }
            if ( Z652OpeCod != T00UR4_A652OpeCod[0] )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T00UR4_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCSOLLU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertUR467( )
   {
      beforeValidateUR467( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUR467( ) ;
      }
      if ( AnyError == 0 )
      {
         zmUR467( 0) ;
         checkOptimisticConcurrencyUR467( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUR467( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertUR467( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UR12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A3218SolLuzCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n3219SolLuzMat), A3219SolLuzMat, Boolean.valueOf(n3220SolLuzSer), A3220SolLuzSer, Boolean.valueOf(n3221SolLuzTip), Short.valueOf(A3221SolLuzTip), Boolean.valueOf(n3222SolLuzDisN), A3222SolLuzDisN, Boolean.valueOf(n3223SolLuzNom), A3223SolLuzNom, Boolean.valueOf(n3224SolLuzNum), Integer.valueOf(A3224SolLuzNum), Boolean.valueOf(n3225SolLuzFec), A3225SolLuzFec, Boolean.valueOf(n3226SolLuzCliC), Integer.valueOf(A3226SolLuzCliC), Boolean.valueOf(n3227SolLuzCliN), A3227SolLuzCliN, Boolean.valueOf(n3228SolLuzSol), A3228SolLuzSol, Boolean.valueOf(n3229SolLuzNor), A3229SolLuzNor, Boolean.valueOf(n3230SolLuzMaq), A3230SolLuzMaq, Boolean.valueOf(n3231SolLuzUlin), Byte.valueOf(A3231SolLuzUlin), Boolean.valueOf(n3232SolLuzRef), A3232SolLuzRef, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLLU");
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
                        processLevelUR467( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionUR0( ) ;
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
            loadUR467( ) ;
         }
         endLevelUR467( ) ;
      }
      closeExtendedTableCursorsUR467( ) ;
   }

   public void updateUR467( )
   {
      beforeValidateUR467( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUR467( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUR467( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUR467( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateUR467( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UR13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n3219SolLuzMat), A3219SolLuzMat, Boolean.valueOf(n3220SolLuzSer), A3220SolLuzSer, Boolean.valueOf(n3221SolLuzTip), Short.valueOf(A3221SolLuzTip), Boolean.valueOf(n3222SolLuzDisN), A3222SolLuzDisN, Boolean.valueOf(n3223SolLuzNom), A3223SolLuzNom, Boolean.valueOf(n3224SolLuzNum), Integer.valueOf(A3224SolLuzNum), Boolean.valueOf(n3225SolLuzFec), A3225SolLuzFec, Boolean.valueOf(n3226SolLuzCliC), Integer.valueOf(A3226SolLuzCliC), Boolean.valueOf(n3227SolLuzCliN), A3227SolLuzCliN, Boolean.valueOf(n3228SolLuzSol), A3228SolLuzSol, Boolean.valueOf(n3229SolLuzNor), A3229SolLuzNor, Boolean.valueOf(n3230SolLuzMaq), A3230SolLuzMaq, Boolean.valueOf(n3231SolLuzUlin), Byte.valueOf(A3231SolLuzUlin), Boolean.valueOf(n3232SolLuzRef), A3232SolLuzRef, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLLU");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCSOLLU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateUR467( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelUR467( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionUR0( ) ;
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
         endLevelUR467( ) ;
      }
      closeExtendedTableCursorsUR467( ) ;
   }

   public void deferredUpdateUR467( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateUR467( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUR467( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsUR467( ) ;
         afterConfirmUR467( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteUR467( ) ;
            if ( AnyError == 0 )
            {
               A3231SolLuzUlin = O3231SolLuzUlin ;
               n3231SolLuzUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
               scanStartUR468( ) ;
               while ( RcdFound468 != 0 )
               {
                  getByPrimaryKeyUR468( ) ;
                  deleteUR468( ) ;
                  scanNextUR468( ) ;
                  O3231SolLuzUlin = A3231SolLuzUlin ;
                  n3231SolLuzUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
               }
               scanEndUR468( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UR14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLLU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound467 == 0 )
                        {
                           initAllUR467( ) ;
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
                        resetCaptionUR0( ) ;
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
      sMode467 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelUR467( ) ;
      Gx_mode = sMode467 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsUR467( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( ! (0==A3218SolLuzCod) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLLUZCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolLuzCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  && (0==A129BarCod) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja Ruta Incorrecta", ""), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  && true /* After */ )
         {
            GXv_char16[0] = A396EmprCod ;
            GXv_int12[0] = A129BarCod ;
            GXv_int17[0] = A132BarCodReo ;
            GXv_char13[0] = A130BarCodPar ;
            GXv_int7[0] = A3226SolLuzCliC ;
            GXv_char11[0] = A3219SolLuzMat ;
            GXv_int15[0] = A3221SolLuzTip ;
            GXv_char10[0] = A3220SolLuzSer ;
            GXv_char9[0] = A3222SolLuzDisN ;
            GXv_char3[0] = A3223SolLuzNom ;
            GXv_int5[0] = A3224SolLuzNum ;
            GXv_char2[0] = A3227SolLuzCliN ;
            GXv_int14[0] = (short)(0) ;
            GXv_int8[0] = (short)(0) ;
            GXv_char1[0] = A3232SolLuzRef ;
            new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
            ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
            ttslcc_impl.this.A129BarCod = GXv_int12[0] ;
            ttslcc_impl.this.A132BarCodReo = GXv_int17[0] ;
            ttslcc_impl.this.A130BarCodPar = GXv_char13[0] ;
            ttslcc_impl.this.A3226SolLuzCliC = GXv_int7[0] ;
            ttslcc_impl.this.A3219SolLuzMat = GXv_char11[0] ;
            ttslcc_impl.this.A3221SolLuzTip = GXv_int15[0] ;
            ttslcc_impl.this.A3220SolLuzSer = GXv_char10[0] ;
            ttslcc_impl.this.A3222SolLuzDisN = GXv_char9[0] ;
            ttslcc_impl.this.A3223SolLuzNom = GXv_char3[0] ;
            ttslcc_impl.this.A3224SolLuzNum = GXv_int5[0] ;
            ttslcc_impl.this.A3227SolLuzCliN = GXv_char2[0] ;
            ttslcc_impl.this.A3232SolLuzRef = GXv_char1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
            httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
            httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
            httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
            httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
            httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
         }
         if ( true /* Level */ && true /* After */ && isIns( )  )
         {
            GXv_char16[0] = A396EmprCod ;
            GXv_int12[0] = A129BarCod ;
            GXv_int17[0] = A132BarCodReo ;
            GXv_char13[0] = A130BarCodPar ;
            GXv_int7[0] = AV41FlagCal ;
            new app.pctrluz(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
            ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
            ttslcc_impl.this.A129BarCod = GXv_int12[0] ;
            ttslcc_impl.this.A132BarCodReo = GXv_int17[0] ;
            ttslcc_impl.this.A130BarCodPar = GXv_char13[0] ;
            ttslcc_impl.this.AV41FlagCal = GXv_int7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41FlagCal), 8, 0));
         }
         if ( true /* Level */ && true /* After */ && isIns( )  && ( AV41FlagCal > 0 ) )
         {
            httpContext.GX_msglist.addItem(Gx_msg, 0, "BARCODPAR");
         }
         if ( true /* Level */ && true /* After */ && ( AV55FlagHdr == 0 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && true /* After */ && ( AV55FlagHdr == 0 ) && isUpd( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
         }
      }
   }

   public void processNestedLevelUR468( )
   {
      s3231SolLuzUlin = O3231SolLuzUlin ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      nGXsfl_130_idx = 0 ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         readRowUR468( ) ;
         if ( ( nRcdExists_468 != 0 ) || ( nIsMod_468 != 0 ) )
         {
            standaloneNotModalUR468( ) ;
            getKeyUR468( ) ;
            if ( ( nRcdExists_468 == 0 ) && ( nRcdDeleted_468 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertUR468( ) ;
            }
            else
            {
               if ( RcdFound468 != 0 )
               {
                  if ( ( nRcdDeleted_468 != 0 ) && ( nRcdExists_468 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteUR468( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_468 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateUR468( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_468 == 0 )
                  {
                     GXCCtl = "SOLLUZLIN_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolLuzLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3231SolLuzUlin = A3231SolLuzUlin ;
            n3231SolLuzUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_468_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolLuzLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolLuzObs_Internalname, GXutil.rtrim( A3234SolLuzObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3233SolLuzLin_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3234SolLuzObs_"+sGXsfl_130_idx, GXutil.rtrim( Z3234SolLuzObs)) ;
         httpContext.changePostValue( "nRcdDeleted_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_468 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_468_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllUR468( ) ;
      if ( AnyError != 0 )
      {
         O3231SolLuzUlin = s3231SolLuzUlin ;
         n3231SolLuzUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      }
      nRcdExists_468 = (short)(0) ;
      nIsMod_468 = (short)(0) ;
      nRcdDeleted_468 = (short)(0) ;
   }

   public void processLevelUR467( )
   {
      /* Save parent mode. */
      sMode467 = Gx_mode ;
      processNestedLevelUR468( ) ;
      if ( AnyError != 0 )
      {
         O3231SolLuzUlin = s3231SolLuzUlin ;
         n3231SolLuzUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode467 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00UR15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n3231SolLuzUlin), Byte.valueOf(A3231SolLuzUlin), A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLLU");
   }

   public void endLevelUR467( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteUR467( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttslcc");
         if ( AnyError == 0 )
         {
            confirmValuesUR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttslcc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartUR467( )
   {
      /* Scan By routine */
      /* Using cursor T00UR16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound467 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound467 = (short)(1) ;
         A3218SolLuzCod = T00UR16_A3218SolLuzCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextUR467( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound467 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound467 = (short)(1) ;
         A3218SolLuzCod = T00UR16_A3218SolLuzCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
      }
   }

   public void scanEndUR467( )
   {
      pr_default.close(14);
   }

   public void afterConfirmUR467( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertUR467( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateUR467( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteUR467( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteUR467( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateUR467( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesUR467( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolLuzCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtSolLuzMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzMat_Enabled), 5, 0), true);
      edtSolLuzSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzSer_Enabled), 5, 0), true);
      edtSolLuzTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzTip_Enabled), 5, 0), true);
      edtSolLuzDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzDisN_Enabled), 5, 0), true);
      edtSolLuzNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNom_Enabled), 5, 0), true);
      edtSolLuzNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNum_Enabled), 5, 0), true);
      edtSolLuzFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzFec_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtSolLuzCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCliC_Enabled), 5, 0), true);
      edtSolLuzCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCliN_Enabled), 5, 0), true);
      edtSolLuzSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzSol_Enabled), 5, 0), true);
      edtSolLuzNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNor_Enabled), 5, 0), true);
      edtSolLuzMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzMaq_Enabled), 5, 0), true);
      edtSolLuzUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzUlin_Enabled), 5, 0), true);
      edtSolLuzRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzRef_Enabled), 5, 0), true);
   }

   public void zmUR468( int GX_JID )
   {
      if ( ( GX_JID == 39 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3234SolLuzObs = T00UR3_A3234SolLuzObs[0] ;
         }
         else
         {
            Z3234SolLuzObs = A3234SolLuzObs ;
         }
      }
      if ( GX_JID == -39 )
      {
         Z3218SolLuzCod = A3218SolLuzCod ;
         Z3233SolLuzLin = A3233SolLuzLin ;
         Z3234SolLuzObs = A3234SolLuzObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalUR468( )
   {
      edtSolLuzUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzUlin_Enabled), 5, 0), true);
      edtSolLuzUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzUlin_Enabled), 5, 0), true);
   }

   public void standaloneModalUR468( )
   {
      if ( isIns( )  )
      {
         A3231SolLuzUlin = (byte)(O3231SolLuzUlin+1) ;
         n3231SolLuzUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3233SolLuzLin = A3231SolLuzUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSolLuzLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      }
      else
      {
         edtSolLuzLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      }
   }

   public void loadUR468( )
   {
      /* Using cursor T00UR17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound468 = (short)(1) ;
         A3234SolLuzObs = T00UR17_A3234SolLuzObs[0] ;
         n3234SolLuzObs = T00UR17_n3234SolLuzObs[0] ;
         zmUR468( -39) ;
      }
      pr_default.close(15);
      onLoadActionsUR468( ) ;
   }

   public void onLoadActionsUR468( )
   {
   }

   public void checkExtendedTableUR468( )
   {
      nIsDirty_468 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalUR468( ) ;
   }

   public void closeExtendedTableCursorsUR468( )
   {
   }

   public void enableDisableUR468( )
   {
   }

   public void getKeyUR468( )
   {
      /* Using cursor T00UR18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound468 = (short)(1) ;
      }
      else
      {
         RcdFound468 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKeyUR468( )
   {
      /* Using cursor T00UR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00UR3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmUR468( 39) ;
         RcdFound468 = (short)(1) ;
         initializeNonKeyUR468( ) ;
         A3233SolLuzLin = T00UR3_A3233SolLuzLin[0] ;
         A3234SolLuzObs = T00UR3_A3234SolLuzObs[0] ;
         n3234SolLuzObs = T00UR3_n3234SolLuzObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3218SolLuzCod = A3218SolLuzCod ;
         Z3233SolLuzLin = A3233SolLuzLin ;
         sMode468 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalUR468( ) ;
         loadUR468( ) ;
         Gx_mode = sMode468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound468 = (short)(0) ;
         initializeNonKeyUR468( ) ;
         sMode468 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalUR468( ) ;
         Gx_mode = sMode468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesUR468( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyUR468( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00UR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLSOLLU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3234SolLuzObs, T00UR2_A3234SolLuzObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3234SolLuzObs, T00UR2_A3234SolLuzObs[0]) != 0 )
            {
               GXutil.writeLogln("ttslcc:[seudo value changed for attri]"+"SolLuzObs");
               GXutil.writeLogRaw("Old: ",Z3234SolLuzObs);
               GXutil.writeLogRaw("Current: ",T00UR2_A3234SolLuzObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLSOLLU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertUR468( )
   {
      beforeValidateUR468( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUR468( ) ;
      }
      if ( AnyError == 0 )
      {
         zmUR468( 0) ;
         checkOptimisticConcurrencyUR468( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUR468( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertUR468( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UR19 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin), Boolean.valueOf(n3234SolLuzObs), A3234SolLuzObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLLU");
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
            loadUR468( ) ;
         }
         endLevelUR468( ) ;
      }
      closeExtendedTableCursorsUR468( ) ;
   }

   public void updateUR468( )
   {
      beforeValidateUR468( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUR468( ) ;
      }
      if ( ( nIsMod_468 != 0 ) || ( nIsDirty_468 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyUR468( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmUR468( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateUR468( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00UR20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n3234SolLuzObs), A3234SolLuzObs, A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLLU");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLSOLLU"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateUR468( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyUR468( ) ;
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
            endLevelUR468( ) ;
         }
      }
      closeExtendedTableCursorsUR468( ) ;
   }

   public void deferredUpdateUR468( )
   {
   }

   public void deleteUR468( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateUR468( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUR468( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsUR468( ) ;
         afterConfirmUR468( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteUR468( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00UR21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLLU");
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
      sMode468 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelUR468( ) ;
      Gx_mode = sMode468 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsUR468( )
   {
      standaloneModalUR468( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelUR468( )
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

   public void scanStartUR468( )
   {
      /* Scan By routine */
      /* Using cursor T00UR22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      RcdFound468 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound468 = (short)(1) ;
         A3233SolLuzLin = T00UR22_A3233SolLuzLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextUR468( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound468 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound468 = (short)(1) ;
         A3233SolLuzLin = T00UR22_A3233SolLuzLin[0] ;
      }
   }

   public void scanEndUR468( )
   {
      pr_default.close(20);
   }

   public void afterConfirmUR468( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertUR468( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateUR468( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteUR468( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteUR468( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateUR468( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesUR468( )
   {
      edtSolLuzLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtSolLuzObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzObs_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void send_integrity_lvl_hashesUR468( )
   {
   }

   public void send_integrity_lvl_hashesUR467( )
   {
   }

   public void subsflControlProps_130468( )
   {
      edtavnRcdDeleted_468_Internalname = "vNRCDDELETED_468_"+sGXsfl_130_idx ;
      edtSolLuzLin_Internalname = "SOLLUZLIN_"+sGXsfl_130_idx ;
      edtSolLuzObs_Internalname = "SOLLUZOBS_"+sGXsfl_130_idx ;
   }

   public void subsflControlProps_fel_130468( )
   {
      edtavnRcdDeleted_468_Internalname = "vNRCDDELETED_468_"+sGXsfl_130_fel_idx ;
      edtSolLuzLin_Internalname = "SOLLUZLIN_"+sGXsfl_130_fel_idx ;
      edtSolLuzObs_Internalname = "SOLLUZOBS_"+sGXsfl_130_fel_idx ;
   }

   public void addRowUR468( )
   {
      nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130468( ) ;
      sendRowUR468( ) ;
   }

   public void sendRowUR468( )
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
         if ( ((int)((nGXsfl_130_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_468_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_468_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_468_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_468), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_468), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_468_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_468_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_468_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolLuzLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3233SolLuzLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolLuzLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolLuzLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_468_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolLuzObs_Internalname,GXutil.rtrim( A3234SolLuzObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolLuzObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolLuzObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesUR468( ) ;
      GXCCtl = "Z3233SolLuzLin_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3234SolLuzObs_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3234SolLuzObs));
      GXCCtl = "nRcdDeleted_468_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_468_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_468_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCOD_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV56Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV57Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV58Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_468_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowUR468( )
   {
      nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130468( ) ;
      edtavnRcdDeleted_468_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolLuzLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolLuzObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_468_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_468_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_468");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_468_Internalname ;
         wbErr = true ;
         nRcdDeleted_468 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_468 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_468_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "SOLLUZLIN_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolLuzLin_Internalname ;
         wbErr = true ;
         A3233SolLuzLin = (byte)(0) ;
      }
      else
      {
         A3233SolLuzLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolLuzLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3234SolLuzObs = httpContext.cgiGet( edtSolLuzObs_Internalname) ;
      n3234SolLuzObs = false ;
      GXCCtl = "Z3233SolLuzLin_" + sGXsfl_130_idx ;
      Z3233SolLuzLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3234SolLuzObs_" + sGXsfl_130_idx ;
      Z3234SolLuzObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_468_" + sGXsfl_130_idx ;
      nRcdDeleted_468 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_468_" + sGXsfl_130_idx ;
      nRcdExists_468 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_468_" + sGXsfl_130_idx ;
      nIsMod_468 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtSolLuzLin_Enabled = edtSolLuzLin_Enabled ;
   }

   public void confirmValuesUR0( )
   {
      nGXsfl_130_idx = 0 ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130468( ) ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_130468( ) ;
         httpContext.changePostValue( "Z3233SolLuzLin_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z3233SolLuzLin_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3233SolLuzLin_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z3234SolLuzObs_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z3234SolLuzObs_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3234SolLuzObs_"+sGXsfl_130_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttslcc", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV56Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV58Barcodpar))}, new String[] {"Barcod","Barcodreo","Barcodpar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3218SolLuzCod", GXutil.ltrim( localUtil.ntoc( Z3218SolLuzCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3219SolLuzMat", GXutil.rtrim( Z3219SolLuzMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3220SolLuzSer", GXutil.rtrim( Z3220SolLuzSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3221SolLuzTip", GXutil.ltrim( localUtil.ntoc( Z3221SolLuzTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3222SolLuzDisN", GXutil.rtrim( Z3222SolLuzDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3223SolLuzNom", GXutil.rtrim( Z3223SolLuzNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3224SolLuzNum", GXutil.ltrim( localUtil.ntoc( Z3224SolLuzNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3225SolLuzFec", localUtil.dtoc( Z3225SolLuzFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3226SolLuzCliC", GXutil.ltrim( localUtil.ntoc( Z3226SolLuzCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3227SolLuzCliN", GXutil.rtrim( Z3227SolLuzCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3228SolLuzSol", GXutil.rtrim( Z3228SolLuzSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3229SolLuzNor", GXutil.rtrim( Z3229SolLuzNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3230SolLuzMaq", GXutil.rtrim( Z3230SolLuzMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3231SolLuzUlin", GXutil.ltrim( localUtil.ntoc( Z3231SolLuzUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3232SolLuzRef", GXutil.rtrim( Z3232SolLuzRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3231SolLuzUlin", GXutil.ltrim( localUtil.ntoc( O3231SolLuzUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_130", GXutil.ltrim( localUtil.ntoc( nGXsfl_130_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV56Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV57Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV58Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCAL", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGHDR", GXutil.ltrim( localUtil.ntoc( AV55FlagHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttslcc", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV56Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV58Barcodpar))}, new String[] {"Barcod","Barcodreo","Barcodpar"})  ;
   }

   public String getPgmname( )
   {
      return "TTSLCC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TEST SOLIDEZ LUZ,PARM", "") ;
   }

   public void initializeNonKeyUR467( )
   {
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      AV19FlagM = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
      AV41FlagCal = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41FlagCal), 8, 0));
      AV55FlagHdr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55FlagHdr", GXutil.str( AV55FlagHdr, 1, 0));
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3219SolLuzMat = "" ;
      n3219SolLuzMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
      A3220SolLuzSer = "" ;
      n3220SolLuzSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
      A3221SolLuzTip = (short)(0) ;
      n3221SolLuzTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
      A3222SolLuzDisN = "" ;
      n3222SolLuzDisN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
      A3223SolLuzNom = "" ;
      n3223SolLuzNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
      A3224SolLuzNum = 0 ;
      n3224SolLuzNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A3226SolLuzCliC = 0 ;
      n3226SolLuzCliC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
      A3227SolLuzCliN = "" ;
      n3227SolLuzCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
      A3228SolLuzSol = "" ;
      n3228SolLuzSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", A3228SolLuzSol);
      A3229SolLuzNor = "" ;
      n3229SolLuzNor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", A3229SolLuzNor);
      A3230SolLuzMaq = "" ;
      n3230SolLuzMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
      A3231SolLuzUlin = (byte)(0) ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      A3232SolLuzRef = "" ;
      n3232SolLuzRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
      A3225SolLuzFec = GXutil.today( ) ;
      n3225SolLuzFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
      O3231SolLuzUlin = A3231SolLuzUlin ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z3219SolLuzMat = "" ;
      Z3220SolLuzSer = "" ;
      Z3221SolLuzTip = (short)(0) ;
      Z3222SolLuzDisN = "" ;
      Z3223SolLuzNom = "" ;
      Z3224SolLuzNum = 0 ;
      Z3225SolLuzFec = GXutil.nullDate() ;
      Z3226SolLuzCliC = 0 ;
      Z3227SolLuzCliN = "" ;
      Z3228SolLuzSol = "" ;
      Z3229SolLuzNor = "" ;
      Z3230SolLuzMaq = "" ;
      Z3231SolLuzUlin = (byte)(0) ;
      Z3232SolLuzRef = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAllUR467( )
   {
      A3218SolLuzCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
      initializeNonKeyUR467( ) ;
   }

   public void standaloneModalInsert( )
   {
      A3225SolLuzFec = i3225SolLuzFec ;
      n3225SolLuzFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
   }

   public void initializeNonKeyUR468( )
   {
      A3234SolLuzObs = "" ;
      n3234SolLuzObs = false ;
      Z3234SolLuzObs = "" ;
   }

   public void initAllUR468( )
   {
      A3233SolLuzLin = (byte)(0) ;
      initializeNonKeyUR468( ) ;
   }

   public void standaloneModalInsertUR468( )
   {
      A3231SolLuzUlin = i3231SolLuzUlin ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241531028", true, true);
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
      httpContext.AddJavascriptSource("ttslcc.js", "?20268241531028", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties468( )
   {
      edtSolLuzLin_Enabled = defedtSolLuzLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void startgridcontrol130( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_468_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3233SolLuzLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3234SolLuzObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSolLuzCod_Internalname = "SOLLUZCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtSolLuzMat_Internalname = "SOLLUZMAT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSolLuzSer_Internalname = "SOLLUZSER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSolLuzTip_Internalname = "SOLLUZTIP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSolLuzDisN_Internalname = "SOLLUZDISN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSolLuzNom_Internalname = "SOLLUZNOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtSolLuzNum_Internalname = "SOLLUZNUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtSolLuzFec_Internalname = "SOLLUZFEC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtSolLuzCliC_Internalname = "SOLLUZCLIC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtSolLuzCliN_Internalname = "SOLLUZCLIN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtSolLuzSol_Internalname = "SOLLUZSOL" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtSolLuzNor_Internalname = "SOLLUZNOR" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtSolLuzMaq_Internalname = "SOLLUZMAQ" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtSolLuzUlin_Internalname = "SOLLUZULIN" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtSolLuzRef_Internalname = "SOLLUZREF" ;
      edtavnRcdDeleted_468_Internalname = "vNRCDDELETED_468" ;
      edtSolLuzLin_Internalname = "SOLLUZLIN" ;
      edtSolLuzObs_Internalname = "SOLLUZOBS" ;
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
      Form.setCaption( httpContext.getMessage( "TEST SOLIDEZ LUZ,PARM", "") );
      edtSolLuzObs_Jsonclick = "" ;
      edtSolLuzLin_Jsonclick = "" ;
      edtavnRcdDeleted_468_Jsonclick = "" ;
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
      edtSolLuzObs_Enabled = 1 ;
      edtSolLuzLin_Enabled = 1 ;
      edtavnRcdDeleted_468_Enabled = 1 ;
      edtSolLuzRef_Jsonclick = "" ;
      edtSolLuzRef_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzRef_Enabled = 1 ;
      edtSolLuzUlin_Jsonclick = "" ;
      edtSolLuzUlin_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzUlin_Enabled = 0 ;
      edtSolLuzMaq_Jsonclick = "" ;
      edtSolLuzMaq_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzMaq_Enabled = 1 ;
      edtSolLuzNor_Jsonclick = "" ;
      edtSolLuzNor_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzNor_Enabled = 1 ;
      edtSolLuzSol_Jsonclick = "" ;
      edtSolLuzSol_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzSol_Enabled = 1 ;
      edtSolLuzCliN_Jsonclick = "" ;
      edtSolLuzCliN_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzCliN_Enabled = 0 ;
      edtSolLuzCliC_Jsonclick = "" ;
      edtSolLuzCliC_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzCliC_Enabled = 0 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtSolLuzFec_Jsonclick = "" ;
      edtSolLuzFec_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzFec_Enabled = 1 ;
      edtSolLuzNum_Jsonclick = "" ;
      edtSolLuzNum_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzNum_Enabled = 0 ;
      edtSolLuzNom_Jsonclick = "" ;
      edtSolLuzNom_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzNom_Enabled = 0 ;
      edtSolLuzDisN_Jsonclick = "" ;
      edtSolLuzDisN_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzDisN_Enabled = 0 ;
      edtSolLuzTip_Jsonclick = "" ;
      edtSolLuzTip_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzTip_Enabled = 0 ;
      edtSolLuzSer_Jsonclick = "" ;
      edtSolLuzSer_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzSer_Enabled = 0 ;
      edtSolLuzMat_Jsonclick = "" ;
      edtSolLuzMat_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzMat_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtSolLuzCod_Jsonclick = "" ;
      edtSolLuzCod_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzCod_Enabled = 1 ;
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

   public void xc_24_UR467( )
   {
      if ( isIns( )  && (0==A3218SolLuzCod) )
      {
         GXv_int12[0] = A3218SolLuzCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SOLLUZ", ""), GXv_int12) ;
         A3218SolLuzCod = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_25_UR467( String Gx_mode ,
                            String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            int A3226SolLuzCliC ,
                            String A3219SolLuzMat ,
                            short A3221SolLuzTip ,
                            String A3220SolLuzSer ,
                            String A3222SolLuzDisN ,
                            String A3223SolLuzNom ,
                            int A3224SolLuzNum ,
                            String A3227SolLuzCliN ,
                            String A3232SolLuzRef )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = A3226SolLuzCliC ;
         GXv_char11[0] = A3219SolLuzMat ;
         GXv_int15[0] = A3221SolLuzTip ;
         GXv_char10[0] = A3220SolLuzSer ;
         GXv_char9[0] = A3222SolLuzDisN ;
         GXv_char3[0] = A3223SolLuzNom ;
         GXv_int5[0] = A3224SolLuzNum ;
         GXv_char2[0] = A3227SolLuzCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int8[0] = (short)(0) ;
         GXv_char1[0] = A3232SolLuzRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
         A396EmprCod = GXv_char16[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int17[0] ;
         A130BarCodPar = GXv_char13[0] ;
         A3226SolLuzCliC = GXv_int7[0] ;
         A3219SolLuzMat = GXv_char11[0] ;
         A3221SolLuzTip = GXv_int15[0] ;
         A3220SolLuzSer = GXv_char10[0] ;
         A3222SolLuzDisN = GXv_char9[0] ;
         A3223SolLuzNom = GXv_char3[0] ;
         A3224SolLuzNum = GXv_int5[0] ;
         A3227SolLuzCliN = GXv_char2[0] ;
         A3232SolLuzRef = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
         httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
         httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
         httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
         httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
         httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3226SolLuzCliC, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3219SolLuzMat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3221SolLuzTip, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3220SolLuzSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3222SolLuzDisN))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3223SolLuzNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3224SolLuzNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3227SolLuzCliN))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3232SolLuzRef))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_26_UR467( String A396EmprCod ,
                            String A3230SolLuzMaq ,
                            byte AV19FlagM )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3230SolLuzMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         A396EmprCod = GXv_char16[0] ;
         A3230SolLuzMaq = GXv_char13[0] ;
         AV19FlagM = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3230SolLuzMaq))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_28_UR467( String Gx_mode ,
                            String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            int AV41FlagCal )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = AV41FlagCal ;
         new app.pctrluz(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
         A396EmprCod = GXv_char16[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int17[0] ;
         A130BarCodPar = GXv_char13[0] ;
         AV41FlagCal = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41FlagCal), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_30_UR467( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            byte AV55FlagHdr )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int6[0] = AV55FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int6) ;
         A396EmprCod = GXv_char16[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int17[0] ;
         A130BarCodPar = GXv_char13[0] ;
         AV55FlagHdr = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV55FlagHdr", GXutil.str( AV55FlagHdr, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV55FlagHdr, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_130468( ) ;
      while ( nGXsfl_130_idx <= nRC_GXsfl_130 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalUR468( ) ;
         standaloneModalUR468( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowUR468( ) ;
         nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_130468( ) ;
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
      /* Using cursor T00UR6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00UR6_A407EmprNom[0] ;
      n407EmprNom = T00UR6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      GX_FocusControl = edtBarCod_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T00UR6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00UR6_A407EmprNom[0] ;
      n407EmprNom = T00UR6_n407EmprNom[0] ;
      pr_default.close(4);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Solluzcod( )
   {
      n3231SolLuzUlin = false ;
      n130BarCodPar = false ;
      n132BarCodReo = false ;
      n129BarCod = false ;
      n3225SolLuzFec = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( isIns( )  && ( ! (0==A3218SolLuzCod) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLLUZCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolLuzCod_Internalname ;
      }
      if ( isIns( )  && (0==A3218SolLuzCod) )
      {
         GXv_int12[0] = A3218SolLuzCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SOLLUZ", ""), GXv_int12) ;
         ttslcc_impl.this.A3218SolLuzCod = GXv_int12[0] ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", GXutil.rtrim( A3219SolLuzMat));
      httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", GXutil.rtrim( A3220SolLuzSer));
      httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrim( localUtil.ntoc( A3221SolLuzTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", GXutil.rtrim( A3222SolLuzDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", GXutil.rtrim( A3223SolLuzNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrim( localUtil.ntoc( A3224SolLuzNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrim( localUtil.ntoc( A3226SolLuzCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", GXutil.rtrim( A3227SolLuzCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", GXutil.rtrim( A3228SolLuzSol));
      httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", GXutil.rtrim( A3229SolLuzNor));
      httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", GXutil.rtrim( A3230SolLuzMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrim( localUtil.ntoc( A3231SolLuzUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", GXutil.rtrim( A3232SolLuzRef));
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
      httpContext.ajax_rsp_assign_attri("", false, "AV55FlagHdr", GXutil.ltrim( localUtil.ntoc( AV55FlagHdr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3218SolLuzCod", GXutil.ltrim( localUtil.ntoc( Z3218SolLuzCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3219SolLuzMat", GXutil.rtrim( Z3219SolLuzMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3220SolLuzSer", GXutil.rtrim( Z3220SolLuzSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3221SolLuzTip", GXutil.ltrim( localUtil.ntoc( Z3221SolLuzTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3222SolLuzDisN", GXutil.rtrim( Z3222SolLuzDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3223SolLuzNom", GXutil.rtrim( Z3223SolLuzNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3224SolLuzNum", GXutil.ltrim( localUtil.ntoc( Z3224SolLuzNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3225SolLuzFec", localUtil.format(Z3225SolLuzFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3226SolLuzCliC", GXutil.ltrim( localUtil.ntoc( Z3226SolLuzCliC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3227SolLuzCliN", GXutil.rtrim( Z3227SolLuzCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3228SolLuzSol", GXutil.rtrim( Z3228SolLuzSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3229SolLuzNor", GXutil.rtrim( Z3229SolLuzNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3230SolLuzMaq", GXutil.rtrim( Z3230SolLuzMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3231SolLuzUlin", GXutil.ltrim( localUtil.ntoc( Z3231SolLuzUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3232SolLuzRef", GXutil.rtrim( Z3232SolLuzRef));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV41FlagCal", GXutil.ltrim( localUtil.ntoc( ZV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Gx_msg", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV55FlagHdr", GXutil.ltrim( localUtil.ntoc( ZV55FlagHdr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV19FlagM", GXutil.ltrim( localUtil.ntoc( ZV19FlagM, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3231SolLuzUlin", GXutil.ltrim( localUtil.ntoc( O3231SolLuzUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n3232SolLuzRef = false ;
      n3227SolLuzCliN = false ;
      n3224SolLuzNum = false ;
      n3223SolLuzNom = false ;
      n3222SolLuzDisN = false ;
      n3220SolLuzSer = false ;
      n3221SolLuzTip = false ;
      n3219SolLuzMat = false ;
      n3226SolLuzCliC = false ;
      n132BarCodReo = false ;
      n129BarCod = false ;
      n130BarCodPar = false ;
      if ( isIns( )  && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = A3226SolLuzCliC ;
         GXv_char11[0] = A3219SolLuzMat ;
         GXv_int15[0] = A3221SolLuzTip ;
         GXv_char10[0] = A3220SolLuzSer ;
         GXv_char9[0] = A3222SolLuzDisN ;
         GXv_char3[0] = A3223SolLuzNom ;
         GXv_int5[0] = A3224SolLuzNum ;
         GXv_char2[0] = A3227SolLuzCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int8[0] = (short)(0) ;
         GXv_char1[0] = A3232SolLuzRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
         ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttslcc_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         ttslcc_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         ttslcc_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         ttslcc_impl.this.A3226SolLuzCliC = GXv_int7[0] ;
         A3226SolLuzCliC = this.A3226SolLuzCliC ;
         ttslcc_impl.this.A3219SolLuzMat = GXv_char11[0] ;
         A3219SolLuzMat = this.A3219SolLuzMat ;
         ttslcc_impl.this.A3221SolLuzTip = GXv_int15[0] ;
         A3221SolLuzTip = this.A3221SolLuzTip ;
         ttslcc_impl.this.A3220SolLuzSer = GXv_char10[0] ;
         A3220SolLuzSer = this.A3220SolLuzSer ;
         ttslcc_impl.this.A3222SolLuzDisN = GXv_char9[0] ;
         A3222SolLuzDisN = this.A3222SolLuzDisN ;
         ttslcc_impl.this.A3223SolLuzNom = GXv_char3[0] ;
         A3223SolLuzNom = this.A3223SolLuzNom ;
         ttslcc_impl.this.A3224SolLuzNum = GXv_int5[0] ;
         A3224SolLuzNum = this.A3224SolLuzNum ;
         ttslcc_impl.this.A3227SolLuzCliN = GXv_char2[0] ;
         A3227SolLuzCliN = this.A3227SolLuzCliN ;
         ttslcc_impl.this.A3232SolLuzRef = GXv_char1[0] ;
         A3232SolLuzRef = this.A3232SolLuzRef ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = AV41FlagCal ;
         new app.pctrluz(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
         ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttslcc_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         ttslcc_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         ttslcc_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         ttslcc_impl.this.AV41FlagCal = GXv_int7[0] ;
         AV41FlagCal = this.AV41FlagCal ;
      }
      Gx_msg = httpContext.getMessage( httpContext.getMessage( "!AVISO.Esta Hoja Ruta/Ordem Serviço ya/ja tiene/te TEST = ", ""), "") + GXutil.str( AV41FlagCal, 8, 0) ;
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV41FlagCal > 0 ) )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 0, "BARCODPAR");
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int6[0] = AV55FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int6) ;
         ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttslcc_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         ttslcc_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         ttslcc_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         ttslcc_impl.this.AV55FlagHdr = GXv_int6[0] ;
         AV55FlagHdr = this.AV55FlagHdr ;
      }
      if ( true /* Level */ && true /* After */ && ( AV55FlagHdr == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && ( AV55FlagHdr == 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
      httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrim( localUtil.ntoc( A3226SolLuzCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", GXutil.rtrim( A3219SolLuzMat));
      httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrim( localUtil.ntoc( A3221SolLuzTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", GXutil.rtrim( A3220SolLuzSer));
      httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", GXutil.rtrim( A3222SolLuzDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", GXutil.rtrim( A3223SolLuzNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrim( localUtil.ntoc( A3224SolLuzNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", GXutil.rtrim( A3227SolLuzCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", GXutil.rtrim( A3232SolLuzRef));
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "AV55FlagHdr", GXutil.ltrim( localUtil.ntoc( AV55FlagHdr, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T00UR7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T00UR7_A653OpeNom[0] ;
      n653OpeNom = T00UR7_n653OpeNom[0] ;
      pr_default.close(5);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
   }

   public void valid_Solluzmaq( )
   {
      n3230SolLuzMaq = false ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3230SolLuzMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         ttslcc_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttslcc_impl.this.A3230SolLuzMaq = GXv_char13[0] ;
         A3230SolLuzMaq = this.A3230SolLuzMaq ;
         ttslcc_impl.this.AV19FlagM = GXv_int17[0] ;
         AV19FlagM = this.AV19FlagM ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A3230SolLuzMaq)==0) && (0==AV19FlagM) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, "SOLLUZMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolLuzMaq_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", GXutil.rtrim( A3230SolLuzMaq));
      httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'AV56Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV58Barcodpar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_SOLLUZCOD","{handler:'valid_Solluzcod',iparms:[{av:'A3231SolLuzUlin',fld:'SOLLUZULIN',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3218SolLuzCod',fld:'SOLLUZCOD',pic:'ZZZZZZZ9'},{av:'AV58Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV57Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV56Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A3225SolLuzFec',fld:'SOLLUZFEC',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV55FlagHdr',fld:'vFLAGHDR',pic:'9'},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]");
      setEventMetadata("VALID_SOLLUZCOD",",oparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3219SolLuzMat',fld:'SOLLUZMAT',pic:''},{av:'A3220SolLuzSer',fld:'SOLLUZSER',pic:''},{av:'A3221SolLuzTip',fld:'SOLLUZTIP',pic:'ZZZ9'},{av:'A3222SolLuzDisN',fld:'SOLLUZDISN',pic:''},{av:'A3223SolLuzNom',fld:'SOLLUZNOM',pic:''},{av:'A3224SolLuzNum',fld:'SOLLUZNUM',pic:'ZZZZZ9'},{av:'A3225SolLuzFec',fld:'SOLLUZFEC',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A3226SolLuzCliC',fld:'SOLLUZCLIC',pic:'ZZZZZ9'},{av:'A3227SolLuzCliN',fld:'SOLLUZCLIN',pic:''},{av:'A3228SolLuzSol',fld:'SOLLUZSOL',pic:''},{av:'A3229SolLuzNor',fld:'SOLLUZNOR',pic:''},{av:'A3230SolLuzMaq',fld:'SOLLUZMAQ',pic:''},{av:'A3231SolLuzUlin',fld:'SOLLUZULIN',pic:'Z9'},{av:'A3232SolLuzRef',fld:'SOLLUZREF',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV55FlagHdr',fld:'vFLAGHDR',pic:'9'},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3218SolLuzCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z407EmprNom'},{av:'Z3219SolLuzMat'},{av:'Z3220SolLuzSer'},{av:'Z3221SolLuzTip'},{av:'Z3222SolLuzDisN'},{av:'Z3223SolLuzNom'},{av:'Z3224SolLuzNum'},{av:'Z3225SolLuzFec'},{av:'Z652OpeCod'},{av:'Z653OpeNom'},{av:'Z3226SolLuzCliC'},{av:'Z3227SolLuzCliN'},{av:'Z3228SolLuzSol'},{av:'Z3229SolLuzNor'},{av:'Z3230SolLuzMaq'},{av:'Z3231SolLuzUlin'},{av:'Z3232SolLuzRef'},{av:'ZV41FlagCal'},{av:'Gx_msg'},{av:'ZV55FlagHdr'},{av:'ZV19FlagM'},{av:'O3231SolLuzUlin'},{av:'edtBarCod_Enabled',ctrl:'BARCOD',prop:'Enabled'},{av:'edtBarCodReo_Enabled',ctrl:'BARCODREO',prop:'Enabled'},{av:'edtBarCodPar_Enabled',ctrl:'BARCODPAR',prop:'Enabled'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A3232SolLuzRef',fld:'SOLLUZREF',pic:''},{av:'A3227SolLuzCliN',fld:'SOLLUZCLIN',pic:''},{av:'A3224SolLuzNum',fld:'SOLLUZNUM',pic:'ZZZZZ9'},{av:'A3223SolLuzNom',fld:'SOLLUZNOM',pic:''},{av:'A3222SolLuzDisN',fld:'SOLLUZDISN',pic:''},{av:'A3220SolLuzSer',fld:'SOLLUZSER',pic:''},{av:'A3221SolLuzTip',fld:'SOLLUZTIP',pic:'ZZZ9'},{av:'A3219SolLuzMat',fld:'SOLLUZMAT',pic:''},{av:'A3226SolLuzCliC',fld:'SOLLUZCLIC',pic:'ZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV55FlagHdr',fld:'vFLAGHDR',pic:'9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''},{av:'A3226SolLuzCliC',fld:'SOLLUZCLIC',pic:'ZZZZZ9'},{av:'A3219SolLuzMat',fld:'SOLLUZMAT',pic:''},{av:'A3221SolLuzTip',fld:'SOLLUZTIP',pic:'ZZZ9'},{av:'A3220SolLuzSer',fld:'SOLLUZSER',pic:''},{av:'A3222SolLuzDisN',fld:'SOLLUZDISN',pic:''},{av:'A3223SolLuzNom',fld:'SOLLUZNOM',pic:''},{av:'A3224SolLuzNum',fld:'SOLLUZNUM',pic:'ZZZZZ9'},{av:'A3227SolLuzCliN',fld:'SOLLUZCLIN',pic:''},{av:'A3232SolLuzRef',fld:'SOLLUZREF',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV55FlagHdr',fld:'vFLAGHDR',pic:'9'}]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_SOLLUZMAQ","{handler:'valid_Solluzmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3230SolLuzMaq',fld:'SOLLUZMAQ',pic:''},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]");
      setEventMetadata("VALID_SOLLUZMAQ",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3230SolLuzMaq',fld:'SOLLUZMAQ',pic:''},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]}");
      setEventMetadata("VALID_SOLLUZULIN","{handler:'valid_Solluzulin',iparms:[]");
      setEventMetadata("VALID_SOLLUZULIN",",oparms:[]}");
      setEventMetadata("VALID_SOLLUZLIN","{handler:'valid_Solluzlin',iparms:[]");
      setEventMetadata("VALID_SOLLUZLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Solluzobs',iparms:[]");
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
      pr_default.close(4);
      pr_default.close(5);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOAV58Barcodpar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z3219SolLuzMat = "" ;
      Z3220SolLuzSer = "" ;
      Z3222SolLuzDisN = "" ;
      Z3223SolLuzNom = "" ;
      Z3225SolLuzFec = GXutil.nullDate() ;
      Z3227SolLuzCliN = "" ;
      Z3228SolLuzSol = "" ;
      Z3229SolLuzNor = "" ;
      Z3230SolLuzMaq = "" ;
      Z3232SolLuzRef = "" ;
      Z3234SolLuzObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A3219SolLuzMat = "" ;
      A3220SolLuzSer = "" ;
      A3222SolLuzDisN = "" ;
      A3223SolLuzNom = "" ;
      A3227SolLuzCliN = "" ;
      A3232SolLuzRef = "" ;
      A3230SolLuzMaq = "" ;
      AV58Barcodpar = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A3225SolLuzFec = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A3228SolLuzSol = "" ;
      lblTextblock19_Jsonclick = "" ;
      A3229SolLuzNor = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode468 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_msg = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode467 = "" ;
      GXCCtl = "" ;
      A3234SolLuzObs = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV21LitFe = "" ;
      AV20Lit0 = "" ;
      AV35Lit4 = "" ;
      AV38Lit7 = "" ;
      AV47LitSer = "" ;
      AV53LitCli = "" ;
      AV46LitMat = "" ;
      AV43LitNTest = "" ;
      AV42LitFTest = "" ;
      AV44LitHDR = "" ;
      AV49LitNorma = "" ;
      AV48LitMaq = "" ;
      AV50LitResul = "" ;
      AV52LitOper = "" ;
      AV51LitObser = "" ;
      AV54LitTit = "" ;
      AV45LitRef = "" ;
      GXt_char4 = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T00UR6_A407EmprNom = new String[] {""} ;
      T00UR6_n407EmprNom = new boolean[] {false} ;
      T00UR8_A3218SolLuzCod = new int[1] ;
      T00UR8_A129BarCod = new int[1] ;
      T00UR8_n129BarCod = new boolean[] {false} ;
      T00UR8_A132BarCodReo = new byte[1] ;
      T00UR8_n132BarCodReo = new boolean[] {false} ;
      T00UR8_A130BarCodPar = new String[] {""} ;
      T00UR8_n130BarCodPar = new boolean[] {false} ;
      T00UR8_A407EmprNom = new String[] {""} ;
      T00UR8_n407EmprNom = new boolean[] {false} ;
      T00UR8_A3219SolLuzMat = new String[] {""} ;
      T00UR8_n3219SolLuzMat = new boolean[] {false} ;
      T00UR8_A3220SolLuzSer = new String[] {""} ;
      T00UR8_n3220SolLuzSer = new boolean[] {false} ;
      T00UR8_A3221SolLuzTip = new short[1] ;
      T00UR8_n3221SolLuzTip = new boolean[] {false} ;
      T00UR8_A3222SolLuzDisN = new String[] {""} ;
      T00UR8_n3222SolLuzDisN = new boolean[] {false} ;
      T00UR8_A3223SolLuzNom = new String[] {""} ;
      T00UR8_n3223SolLuzNom = new boolean[] {false} ;
      T00UR8_A3224SolLuzNum = new int[1] ;
      T00UR8_n3224SolLuzNum = new boolean[] {false} ;
      T00UR8_A3225SolLuzFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UR8_n3225SolLuzFec = new boolean[] {false} ;
      T00UR8_A653OpeNom = new String[] {""} ;
      T00UR8_n653OpeNom = new boolean[] {false} ;
      T00UR8_A3226SolLuzCliC = new int[1] ;
      T00UR8_n3226SolLuzCliC = new boolean[] {false} ;
      T00UR8_A3227SolLuzCliN = new String[] {""} ;
      T00UR8_n3227SolLuzCliN = new boolean[] {false} ;
      T00UR8_A3228SolLuzSol = new String[] {""} ;
      T00UR8_n3228SolLuzSol = new boolean[] {false} ;
      T00UR8_A3229SolLuzNor = new String[] {""} ;
      T00UR8_n3229SolLuzNor = new boolean[] {false} ;
      T00UR8_A3230SolLuzMaq = new String[] {""} ;
      T00UR8_n3230SolLuzMaq = new boolean[] {false} ;
      T00UR8_A3231SolLuzUlin = new byte[1] ;
      T00UR8_n3231SolLuzUlin = new boolean[] {false} ;
      T00UR8_A3232SolLuzRef = new String[] {""} ;
      T00UR8_n3232SolLuzRef = new boolean[] {false} ;
      T00UR8_A396EmprCod = new String[] {""} ;
      T00UR8_A652OpeCod = new int[1] ;
      T00UR8_n652OpeCod = new boolean[] {false} ;
      T00UR9_A396EmprCod = new String[] {""} ;
      T00UR9_A3218SolLuzCod = new int[1] ;
      T00UR5_A3218SolLuzCod = new int[1] ;
      T00UR5_A129BarCod = new int[1] ;
      T00UR5_n129BarCod = new boolean[] {false} ;
      T00UR5_A132BarCodReo = new byte[1] ;
      T00UR5_n132BarCodReo = new boolean[] {false} ;
      T00UR5_A130BarCodPar = new String[] {""} ;
      T00UR5_n130BarCodPar = new boolean[] {false} ;
      T00UR5_A3219SolLuzMat = new String[] {""} ;
      T00UR5_n3219SolLuzMat = new boolean[] {false} ;
      T00UR5_A3220SolLuzSer = new String[] {""} ;
      T00UR5_n3220SolLuzSer = new boolean[] {false} ;
      T00UR5_A3221SolLuzTip = new short[1] ;
      T00UR5_n3221SolLuzTip = new boolean[] {false} ;
      T00UR5_A3222SolLuzDisN = new String[] {""} ;
      T00UR5_n3222SolLuzDisN = new boolean[] {false} ;
      T00UR5_A3223SolLuzNom = new String[] {""} ;
      T00UR5_n3223SolLuzNom = new boolean[] {false} ;
      T00UR5_A3224SolLuzNum = new int[1] ;
      T00UR5_n3224SolLuzNum = new boolean[] {false} ;
      T00UR5_A3225SolLuzFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UR5_n3225SolLuzFec = new boolean[] {false} ;
      T00UR5_A3226SolLuzCliC = new int[1] ;
      T00UR5_n3226SolLuzCliC = new boolean[] {false} ;
      T00UR5_A3227SolLuzCliN = new String[] {""} ;
      T00UR5_n3227SolLuzCliN = new boolean[] {false} ;
      T00UR5_A3228SolLuzSol = new String[] {""} ;
      T00UR5_n3228SolLuzSol = new boolean[] {false} ;
      T00UR5_A3229SolLuzNor = new String[] {""} ;
      T00UR5_n3229SolLuzNor = new boolean[] {false} ;
      T00UR5_A3230SolLuzMaq = new String[] {""} ;
      T00UR5_n3230SolLuzMaq = new boolean[] {false} ;
      T00UR5_A3231SolLuzUlin = new byte[1] ;
      T00UR5_n3231SolLuzUlin = new boolean[] {false} ;
      T00UR5_A3232SolLuzRef = new String[] {""} ;
      T00UR5_n3232SolLuzRef = new boolean[] {false} ;
      T00UR5_A396EmprCod = new String[] {""} ;
      T00UR5_A652OpeCod = new int[1] ;
      T00UR5_n652OpeCod = new boolean[] {false} ;
      T00UR10_A396EmprCod = new String[] {""} ;
      T00UR10_A3218SolLuzCod = new int[1] ;
      T00UR11_A396EmprCod = new String[] {""} ;
      T00UR11_A3218SolLuzCod = new int[1] ;
      T00UR4_A3218SolLuzCod = new int[1] ;
      T00UR4_A129BarCod = new int[1] ;
      T00UR4_n129BarCod = new boolean[] {false} ;
      T00UR4_A132BarCodReo = new byte[1] ;
      T00UR4_n132BarCodReo = new boolean[] {false} ;
      T00UR4_A130BarCodPar = new String[] {""} ;
      T00UR4_n130BarCodPar = new boolean[] {false} ;
      T00UR4_A3219SolLuzMat = new String[] {""} ;
      T00UR4_n3219SolLuzMat = new boolean[] {false} ;
      T00UR4_A3220SolLuzSer = new String[] {""} ;
      T00UR4_n3220SolLuzSer = new boolean[] {false} ;
      T00UR4_A3221SolLuzTip = new short[1] ;
      T00UR4_n3221SolLuzTip = new boolean[] {false} ;
      T00UR4_A3222SolLuzDisN = new String[] {""} ;
      T00UR4_n3222SolLuzDisN = new boolean[] {false} ;
      T00UR4_A3223SolLuzNom = new String[] {""} ;
      T00UR4_n3223SolLuzNom = new boolean[] {false} ;
      T00UR4_A3224SolLuzNum = new int[1] ;
      T00UR4_n3224SolLuzNum = new boolean[] {false} ;
      T00UR4_A3225SolLuzFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UR4_n3225SolLuzFec = new boolean[] {false} ;
      T00UR4_A3226SolLuzCliC = new int[1] ;
      T00UR4_n3226SolLuzCliC = new boolean[] {false} ;
      T00UR4_A3227SolLuzCliN = new String[] {""} ;
      T00UR4_n3227SolLuzCliN = new boolean[] {false} ;
      T00UR4_A3228SolLuzSol = new String[] {""} ;
      T00UR4_n3228SolLuzSol = new boolean[] {false} ;
      T00UR4_A3229SolLuzNor = new String[] {""} ;
      T00UR4_n3229SolLuzNor = new boolean[] {false} ;
      T00UR4_A3230SolLuzMaq = new String[] {""} ;
      T00UR4_n3230SolLuzMaq = new boolean[] {false} ;
      T00UR4_A3231SolLuzUlin = new byte[1] ;
      T00UR4_n3231SolLuzUlin = new boolean[] {false} ;
      T00UR4_A3232SolLuzRef = new String[] {""} ;
      T00UR4_n3232SolLuzRef = new boolean[] {false} ;
      T00UR4_A396EmprCod = new String[] {""} ;
      T00UR4_A652OpeCod = new int[1] ;
      T00UR4_n652OpeCod = new boolean[] {false} ;
      T00UR16_A396EmprCod = new String[] {""} ;
      T00UR16_A3218SolLuzCod = new int[1] ;
      T00UR17_A3218SolLuzCod = new int[1] ;
      T00UR17_A3233SolLuzLin = new byte[1] ;
      T00UR17_A3234SolLuzObs = new String[] {""} ;
      T00UR17_n3234SolLuzObs = new boolean[] {false} ;
      T00UR17_A396EmprCod = new String[] {""} ;
      T00UR18_A396EmprCod = new String[] {""} ;
      T00UR18_A3218SolLuzCod = new int[1] ;
      T00UR18_A3233SolLuzLin = new byte[1] ;
      T00UR3_A3218SolLuzCod = new int[1] ;
      T00UR3_A3233SolLuzLin = new byte[1] ;
      T00UR3_A3234SolLuzObs = new String[] {""} ;
      T00UR3_n3234SolLuzObs = new boolean[] {false} ;
      T00UR3_A396EmprCod = new String[] {""} ;
      T00UR2_A3218SolLuzCod = new int[1] ;
      T00UR2_A3233SolLuzLin = new byte[1] ;
      T00UR2_A3234SolLuzObs = new String[] {""} ;
      T00UR2_n3234SolLuzObs = new boolean[] {false} ;
      T00UR2_A396EmprCod = new String[] {""} ;
      T00UR22_A396EmprCod = new String[] {""} ;
      T00UR22_A3218SolLuzCod = new int[1] ;
      T00UR22_A3233SolLuzLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i3225SolLuzFec = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ3219SolLuzMat = "" ;
      ZZ3220SolLuzSer = "" ;
      ZZ3222SolLuzDisN = "" ;
      ZZ3223SolLuzNom = "" ;
      ZZ3225SolLuzFec = GXutil.nullDate() ;
      ZZ653OpeNom = "" ;
      ZZ3227SolLuzCliN = "" ;
      ZZ3228SolLuzSol = "" ;
      ZZ3229SolLuzNor = "" ;
      ZZ3230SolLuzMaq = "" ;
      ZZ3232SolLuzRef = "" ;
      GXv_char11 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int14 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_char1 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int6 = new byte[1] ;
      T00UR7_A653OpeNom = new String[] {""} ;
      T00UR7_n653OpeNom = new boolean[] {false} ;
      GXv_char16 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int17 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttslcc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttslcc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttslcc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttslcc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttslcc__default(),
         new Object[] {
             new Object[] {
            T00UR2_A3218SolLuzCod, T00UR2_A3233SolLuzLin, T00UR2_A3234SolLuzObs, T00UR2_n3234SolLuzObs, T00UR2_A396EmprCod
            }
            , new Object[] {
            T00UR3_A3218SolLuzCod, T00UR3_A3233SolLuzLin, T00UR3_A3234SolLuzObs, T00UR3_n3234SolLuzObs, T00UR3_A396EmprCod
            }
            , new Object[] {
            T00UR4_A3218SolLuzCod, T00UR4_A129BarCod, T00UR4_n129BarCod, T00UR4_A132BarCodReo, T00UR4_n132BarCodReo, T00UR4_A130BarCodPar, T00UR4_n130BarCodPar, T00UR4_A3219SolLuzMat, T00UR4_n3219SolLuzMat, T00UR4_A3220SolLuzSer,
            T00UR4_n3220SolLuzSer, T00UR4_A3221SolLuzTip, T00UR4_n3221SolLuzTip, T00UR4_A3222SolLuzDisN, T00UR4_n3222SolLuzDisN, T00UR4_A3223SolLuzNom, T00UR4_n3223SolLuzNom, T00UR4_A3224SolLuzNum, T00UR4_n3224SolLuzNum, T00UR4_A3225SolLuzFec,
            T00UR4_n3225SolLuzFec, T00UR4_A3226SolLuzCliC, T00UR4_n3226SolLuzCliC, T00UR4_A3227SolLuzCliN, T00UR4_n3227SolLuzCliN, T00UR4_A3228SolLuzSol, T00UR4_n3228SolLuzSol, T00UR4_A3229SolLuzNor, T00UR4_n3229SolLuzNor, T00UR4_A3230SolLuzMaq,
            T00UR4_n3230SolLuzMaq, T00UR4_A3231SolLuzUlin, T00UR4_n3231SolLuzUlin, T00UR4_A3232SolLuzRef, T00UR4_n3232SolLuzRef, T00UR4_A396EmprCod, T00UR4_A652OpeCod, T00UR4_n652OpeCod
            }
            , new Object[] {
            T00UR5_A3218SolLuzCod, T00UR5_A129BarCod, T00UR5_n129BarCod, T00UR5_A132BarCodReo, T00UR5_n132BarCodReo, T00UR5_A130BarCodPar, T00UR5_n130BarCodPar, T00UR5_A3219SolLuzMat, T00UR5_n3219SolLuzMat, T00UR5_A3220SolLuzSer,
            T00UR5_n3220SolLuzSer, T00UR5_A3221SolLuzTip, T00UR5_n3221SolLuzTip, T00UR5_A3222SolLuzDisN, T00UR5_n3222SolLuzDisN, T00UR5_A3223SolLuzNom, T00UR5_n3223SolLuzNom, T00UR5_A3224SolLuzNum, T00UR5_n3224SolLuzNum, T00UR5_A3225SolLuzFec,
            T00UR5_n3225SolLuzFec, T00UR5_A3226SolLuzCliC, T00UR5_n3226SolLuzCliC, T00UR5_A3227SolLuzCliN, T00UR5_n3227SolLuzCliN, T00UR5_A3228SolLuzSol, T00UR5_n3228SolLuzSol, T00UR5_A3229SolLuzNor, T00UR5_n3229SolLuzNor, T00UR5_A3230SolLuzMaq,
            T00UR5_n3230SolLuzMaq, T00UR5_A3231SolLuzUlin, T00UR5_n3231SolLuzUlin, T00UR5_A3232SolLuzRef, T00UR5_n3232SolLuzRef, T00UR5_A396EmprCod, T00UR5_A652OpeCod, T00UR5_n652OpeCod
            }
            , new Object[] {
            T00UR6_A407EmprNom, T00UR6_n407EmprNom
            }
            , new Object[] {
            T00UR7_A653OpeNom, T00UR7_n653OpeNom
            }
            , new Object[] {
            T00UR8_A3218SolLuzCod, T00UR8_A129BarCod, T00UR8_n129BarCod, T00UR8_A132BarCodReo, T00UR8_n132BarCodReo, T00UR8_A130BarCodPar, T00UR8_n130BarCodPar, T00UR8_A407EmprNom, T00UR8_n407EmprNom, T00UR8_A3219SolLuzMat,
            T00UR8_n3219SolLuzMat, T00UR8_A3220SolLuzSer, T00UR8_n3220SolLuzSer, T00UR8_A3221SolLuzTip, T00UR8_n3221SolLuzTip, T00UR8_A3222SolLuzDisN, T00UR8_n3222SolLuzDisN, T00UR8_A3223SolLuzNom, T00UR8_n3223SolLuzNom, T00UR8_A3224SolLuzNum,
            T00UR8_n3224SolLuzNum, T00UR8_A3225SolLuzFec, T00UR8_n3225SolLuzFec, T00UR8_A653OpeNom, T00UR8_n653OpeNom, T00UR8_A3226SolLuzCliC, T00UR8_n3226SolLuzCliC, T00UR8_A3227SolLuzCliN, T00UR8_n3227SolLuzCliN, T00UR8_A3228SolLuzSol,
            T00UR8_n3228SolLuzSol, T00UR8_A3229SolLuzNor, T00UR8_n3229SolLuzNor, T00UR8_A3230SolLuzMaq, T00UR8_n3230SolLuzMaq, T00UR8_A3231SolLuzUlin, T00UR8_n3231SolLuzUlin, T00UR8_A3232SolLuzRef, T00UR8_n3232SolLuzRef, T00UR8_A396EmprCod,
            T00UR8_A652OpeCod, T00UR8_n652OpeCod
            }
            , new Object[] {
            T00UR9_A396EmprCod, T00UR9_A3218SolLuzCod
            }
            , new Object[] {
            T00UR10_A396EmprCod, T00UR10_A3218SolLuzCod
            }
            , new Object[] {
            T00UR11_A396EmprCod, T00UR11_A3218SolLuzCod
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
            T00UR16_A396EmprCod, T00UR16_A3218SolLuzCod
            }
            , new Object[] {
            T00UR17_A3218SolLuzCod, T00UR17_A3233SolLuzLin, T00UR17_A3234SolLuzObs, T00UR17_n3234SolLuzObs, T00UR17_A396EmprCod
            }
            , new Object[] {
            T00UR18_A396EmprCod, T00UR18_A3218SolLuzCod, T00UR18_A3233SolLuzLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00UR22_A396EmprCod, T00UR22_A3218SolLuzCod, T00UR22_A3233SolLuzLin
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z3225SolLuzFec = GXutil.today( ) ;
      n3225SolLuzFec = false ;
      A3225SolLuzFec = GXutil.today( ) ;
      n3225SolLuzFec = false ;
      i3225SolLuzFec = GXutil.today( ) ;
      n3225SolLuzFec = false ;
   }

   private byte wcpOAV57Barcodreo ;
   private byte Z132BarCodReo ;
   private byte Z3231SolLuzUlin ;
   private byte O3231SolLuzUlin ;
   private byte Z3233SolLuzLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV19FlagM ;
   private byte AV55FlagHdr ;
   private byte AV57Barcodreo ;
   private byte nKeyPressed ;
   private byte A3231SolLuzUlin ;
   private byte Gx_BScreen ;
   private byte B3231SolLuzUlin ;
   private byte s3231SolLuzUlin ;
   private byte A3233SolLuzLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i3231SolLuzUlin ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZV55FlagHdr ;
   private byte ZV19FlagM ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3231SolLuzUlin ;
   private byte ZZV55FlagHdr ;
   private byte ZZV19FlagM ;
   private byte ZO3231SolLuzUlin ;
   private byte GXv_int6[] ;
   private byte GXv_int17[] ;
   private short Z3221SolLuzTip ;
   private short nRcdDeleted_468 ;
   private short nRcdExists_468 ;
   private short nIsMod_468 ;
   private short A3221SolLuzTip ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount468 ;
   private short RcdFound468 ;
   private short nBlankRcdUsr468 ;
   private short RcdFound467 ;
   private short nIsDirty_467 ;
   private short nIsDirty_468 ;
   private short ZZ3221SolLuzTip ;
   private short GXv_int15[] ;
   private short GXv_int14[] ;
   private short GXv_int8[] ;
   private int wcpOAV56Barcod ;
   private int Z3218SolLuzCod ;
   private int Z129BarCod ;
   private int Z3224SolLuzNum ;
   private int Z3226SolLuzCliC ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_130 ;
   private int nGXsfl_130_idx=1 ;
   private int A129BarCod ;
   private int A3226SolLuzCliC ;
   private int A3224SolLuzNum ;
   private int AV41FlagCal ;
   private int AV56Barcod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A3218SolLuzCod ;
   private int edtSolLuzCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtSolLuzMat_Enabled ;
   private int edtSolLuzSer_Enabled ;
   private int edtSolLuzTip_Enabled ;
   private int edtSolLuzDisN_Enabled ;
   private int edtSolLuzNom_Enabled ;
   private int edtSolLuzNum_Enabled ;
   private int edtSolLuzFec_Enabled ;
   private int A652OpeCod ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtSolLuzCliC_Enabled ;
   private int edtSolLuzCliN_Enabled ;
   private int edtSolLuzSol_Enabled ;
   private int edtSolLuzNor_Enabled ;
   private int edtSolLuzMaq_Enabled ;
   private int edtSolLuzUlin_Enabled ;
   private int edtSolLuzRef_Enabled ;
   private int edtavnRcdDeleted_468_Enabled ;
   private int edtSolLuzLin_Enabled ;
   private int edtSolLuzObs_Enabled ;
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
   private int defedtSolLuzLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSolLuzRef_Backcolor ;
   private int edtSolLuzUlin_Backcolor ;
   private int edtSolLuzMaq_Backcolor ;
   private int edtSolLuzNor_Backcolor ;
   private int edtSolLuzSol_Backcolor ;
   private int edtSolLuzCliN_Backcolor ;
   private int edtSolLuzCliC_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtSolLuzFec_Backcolor ;
   private int edtSolLuzNum_Backcolor ;
   private int edtSolLuzNom_Backcolor ;
   private int edtSolLuzDisN_Backcolor ;
   private int edtSolLuzTip_Backcolor ;
   private int edtSolLuzSer_Backcolor ;
   private int edtSolLuzMat_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtSolLuzCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZV41FlagCal ;
   private int ZZ3218SolLuzCod ;
   private int ZZ129BarCod ;
   private int ZZ3224SolLuzNum ;
   private int ZZ652OpeCod ;
   private int ZZ3226SolLuzCliC ;
   private int ZZV41FlagCal ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int GXv_int12[] ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOAV58Barcodpar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z3219SolLuzMat ;
   private String Z3220SolLuzSer ;
   private String Z3222SolLuzDisN ;
   private String Z3223SolLuzNom ;
   private String Z3227SolLuzCliN ;
   private String Z3228SolLuzSol ;
   private String Z3229SolLuzNor ;
   private String Z3230SolLuzMaq ;
   private String Z3232SolLuzRef ;
   private String Z3234SolLuzObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A3219SolLuzMat ;
   private String A3220SolLuzSer ;
   private String A3222SolLuzDisN ;
   private String A3223SolLuzNom ;
   private String A3227SolLuzCliN ;
   private String A3232SolLuzRef ;
   private String A3230SolLuzMaq ;
   private String AV58Barcodpar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSolLuzCod_Internalname ;
   private String sGXsfl_130_idx="0001" ;
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
   private String edtSolLuzCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtSolLuzMat_Internalname ;
   private String edtSolLuzMat_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSolLuzSer_Internalname ;
   private String edtSolLuzSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSolLuzTip_Internalname ;
   private String edtSolLuzTip_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSolLuzDisN_Internalname ;
   private String edtSolLuzDisN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSolLuzNom_Internalname ;
   private String edtSolLuzNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtSolLuzNum_Internalname ;
   private String edtSolLuzNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtSolLuzFec_Internalname ;
   private String edtSolLuzFec_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtOpeCod_Internalname ;
   private String edtOpeCod_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtOpeNom_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtSolLuzCliC_Internalname ;
   private String edtSolLuzCliC_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtSolLuzCliN_Internalname ;
   private String edtSolLuzCliN_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtSolLuzSol_Internalname ;
   private String A3228SolLuzSol ;
   private String edtSolLuzSol_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtSolLuzNor_Internalname ;
   private String A3229SolLuzNor ;
   private String edtSolLuzNor_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtSolLuzMaq_Internalname ;
   private String edtSolLuzMaq_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtSolLuzUlin_Internalname ;
   private String edtSolLuzUlin_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtSolLuzRef_Internalname ;
   private String edtSolLuzRef_Jsonclick ;
   private String sMode468 ;
   private String edtavnRcdDeleted_468_Internalname ;
   private String edtSolLuzLin_Internalname ;
   private String edtSolLuzObs_Internalname ;
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
   private String Gx_msg ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode467 ;
   private String GXCCtl ;
   private String A3234SolLuzObs ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String AV21LitFe ;
   private String AV20Lit0 ;
   private String AV35Lit4 ;
   private String AV38Lit7 ;
   private String AV47LitSer ;
   private String AV53LitCli ;
   private String AV46LitMat ;
   private String AV43LitNTest ;
   private String AV42LitFTest ;
   private String AV44LitHDR ;
   private String AV49LitNorma ;
   private String AV48LitMaq ;
   private String AV50LitResul ;
   private String AV52LitOper ;
   private String AV51LitObser ;
   private String AV54LitTit ;
   private String AV45LitRef ;
   private String GXt_char4 ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String sGXsfl_130_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_468_Jsonclick ;
   private String edtSolLuzLin_Jsonclick ;
   private String edtSolLuzObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String ZZ3219SolLuzMat ;
   private String ZZ3220SolLuzSer ;
   private String ZZ3222SolLuzDisN ;
   private String ZZ3223SolLuzNom ;
   private String ZZ653OpeNom ;
   private String ZZ3227SolLuzCliN ;
   private String ZZ3228SolLuzSol ;
   private String ZZ3229SolLuzNor ;
   private String ZZ3230SolLuzMaq ;
   private String ZZ3232SolLuzRef ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char16[] ;
   private String GXv_char13[] ;
   private java.util.Date Z3225SolLuzFec ;
   private java.util.Date A3225SolLuzFec ;
   private java.util.Date i3225SolLuzFec ;
   private java.util.Date ZZ3225SolLuzFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n3226SolLuzCliC ;
   private boolean n3219SolLuzMat ;
   private boolean n3221SolLuzTip ;
   private boolean n3220SolLuzSer ;
   private boolean n3222SolLuzDisN ;
   private boolean n3223SolLuzNom ;
   private boolean n3224SolLuzNum ;
   private boolean n3227SolLuzCliN ;
   private boolean n3232SolLuzRef ;
   private boolean n3230SolLuzMaq ;
   private boolean wbErr ;
   private boolean n3231SolLuzUlin ;
   private boolean bGXsfl_130_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3225SolLuzFec ;
   private boolean n652OpeCod ;
   private boolean n653OpeNom ;
   private boolean n3228SolLuzSol ;
   private boolean n3229SolLuzNor ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n3234SolLuzObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00UR6_A407EmprNom ;
   private boolean[] T00UR6_n407EmprNom ;
   private int[] T00UR8_A3218SolLuzCod ;
   private int[] T00UR8_A129BarCod ;
   private boolean[] T00UR8_n129BarCod ;
   private byte[] T00UR8_A132BarCodReo ;
   private boolean[] T00UR8_n132BarCodReo ;
   private String[] T00UR8_A130BarCodPar ;
   private boolean[] T00UR8_n130BarCodPar ;
   private String[] T00UR8_A407EmprNom ;
   private boolean[] T00UR8_n407EmprNom ;
   private String[] T00UR8_A3219SolLuzMat ;
   private boolean[] T00UR8_n3219SolLuzMat ;
   private String[] T00UR8_A3220SolLuzSer ;
   private boolean[] T00UR8_n3220SolLuzSer ;
   private short[] T00UR8_A3221SolLuzTip ;
   private boolean[] T00UR8_n3221SolLuzTip ;
   private String[] T00UR8_A3222SolLuzDisN ;
   private boolean[] T00UR8_n3222SolLuzDisN ;
   private String[] T00UR8_A3223SolLuzNom ;
   private boolean[] T00UR8_n3223SolLuzNom ;
   private int[] T00UR8_A3224SolLuzNum ;
   private boolean[] T00UR8_n3224SolLuzNum ;
   private java.util.Date[] T00UR8_A3225SolLuzFec ;
   private boolean[] T00UR8_n3225SolLuzFec ;
   private String[] T00UR8_A653OpeNom ;
   private boolean[] T00UR8_n653OpeNom ;
   private int[] T00UR8_A3226SolLuzCliC ;
   private boolean[] T00UR8_n3226SolLuzCliC ;
   private String[] T00UR8_A3227SolLuzCliN ;
   private boolean[] T00UR8_n3227SolLuzCliN ;
   private String[] T00UR8_A3228SolLuzSol ;
   private boolean[] T00UR8_n3228SolLuzSol ;
   private String[] T00UR8_A3229SolLuzNor ;
   private boolean[] T00UR8_n3229SolLuzNor ;
   private String[] T00UR8_A3230SolLuzMaq ;
   private boolean[] T00UR8_n3230SolLuzMaq ;
   private byte[] T00UR8_A3231SolLuzUlin ;
   private boolean[] T00UR8_n3231SolLuzUlin ;
   private String[] T00UR8_A3232SolLuzRef ;
   private boolean[] T00UR8_n3232SolLuzRef ;
   private String[] T00UR8_A396EmprCod ;
   private int[] T00UR8_A652OpeCod ;
   private boolean[] T00UR8_n652OpeCod ;
   private String[] T00UR9_A396EmprCod ;
   private int[] T00UR9_A3218SolLuzCod ;
   private int[] T00UR5_A3218SolLuzCod ;
   private int[] T00UR5_A129BarCod ;
   private boolean[] T00UR5_n129BarCod ;
   private byte[] T00UR5_A132BarCodReo ;
   private boolean[] T00UR5_n132BarCodReo ;
   private String[] T00UR5_A130BarCodPar ;
   private boolean[] T00UR5_n130BarCodPar ;
   private String[] T00UR5_A3219SolLuzMat ;
   private boolean[] T00UR5_n3219SolLuzMat ;
   private String[] T00UR5_A3220SolLuzSer ;
   private boolean[] T00UR5_n3220SolLuzSer ;
   private short[] T00UR5_A3221SolLuzTip ;
   private boolean[] T00UR5_n3221SolLuzTip ;
   private String[] T00UR5_A3222SolLuzDisN ;
   private boolean[] T00UR5_n3222SolLuzDisN ;
   private String[] T00UR5_A3223SolLuzNom ;
   private boolean[] T00UR5_n3223SolLuzNom ;
   private int[] T00UR5_A3224SolLuzNum ;
   private boolean[] T00UR5_n3224SolLuzNum ;
   private java.util.Date[] T00UR5_A3225SolLuzFec ;
   private boolean[] T00UR5_n3225SolLuzFec ;
   private int[] T00UR5_A3226SolLuzCliC ;
   private boolean[] T00UR5_n3226SolLuzCliC ;
   private String[] T00UR5_A3227SolLuzCliN ;
   private boolean[] T00UR5_n3227SolLuzCliN ;
   private String[] T00UR5_A3228SolLuzSol ;
   private boolean[] T00UR5_n3228SolLuzSol ;
   private String[] T00UR5_A3229SolLuzNor ;
   private boolean[] T00UR5_n3229SolLuzNor ;
   private String[] T00UR5_A3230SolLuzMaq ;
   private boolean[] T00UR5_n3230SolLuzMaq ;
   private byte[] T00UR5_A3231SolLuzUlin ;
   private boolean[] T00UR5_n3231SolLuzUlin ;
   private String[] T00UR5_A3232SolLuzRef ;
   private boolean[] T00UR5_n3232SolLuzRef ;
   private String[] T00UR5_A396EmprCod ;
   private int[] T00UR5_A652OpeCod ;
   private boolean[] T00UR5_n652OpeCod ;
   private String[] T00UR10_A396EmprCod ;
   private int[] T00UR10_A3218SolLuzCod ;
   private String[] T00UR11_A396EmprCod ;
   private int[] T00UR11_A3218SolLuzCod ;
   private int[] T00UR4_A3218SolLuzCod ;
   private int[] T00UR4_A129BarCod ;
   private boolean[] T00UR4_n129BarCod ;
   private byte[] T00UR4_A132BarCodReo ;
   private boolean[] T00UR4_n132BarCodReo ;
   private String[] T00UR4_A130BarCodPar ;
   private boolean[] T00UR4_n130BarCodPar ;
   private String[] T00UR4_A3219SolLuzMat ;
   private boolean[] T00UR4_n3219SolLuzMat ;
   private String[] T00UR4_A3220SolLuzSer ;
   private boolean[] T00UR4_n3220SolLuzSer ;
   private short[] T00UR4_A3221SolLuzTip ;
   private boolean[] T00UR4_n3221SolLuzTip ;
   private String[] T00UR4_A3222SolLuzDisN ;
   private boolean[] T00UR4_n3222SolLuzDisN ;
   private String[] T00UR4_A3223SolLuzNom ;
   private boolean[] T00UR4_n3223SolLuzNom ;
   private int[] T00UR4_A3224SolLuzNum ;
   private boolean[] T00UR4_n3224SolLuzNum ;
   private java.util.Date[] T00UR4_A3225SolLuzFec ;
   private boolean[] T00UR4_n3225SolLuzFec ;
   private int[] T00UR4_A3226SolLuzCliC ;
   private boolean[] T00UR4_n3226SolLuzCliC ;
   private String[] T00UR4_A3227SolLuzCliN ;
   private boolean[] T00UR4_n3227SolLuzCliN ;
   private String[] T00UR4_A3228SolLuzSol ;
   private boolean[] T00UR4_n3228SolLuzSol ;
   private String[] T00UR4_A3229SolLuzNor ;
   private boolean[] T00UR4_n3229SolLuzNor ;
   private String[] T00UR4_A3230SolLuzMaq ;
   private boolean[] T00UR4_n3230SolLuzMaq ;
   private byte[] T00UR4_A3231SolLuzUlin ;
   private boolean[] T00UR4_n3231SolLuzUlin ;
   private String[] T00UR4_A3232SolLuzRef ;
   private boolean[] T00UR4_n3232SolLuzRef ;
   private String[] T00UR4_A396EmprCod ;
   private int[] T00UR4_A652OpeCod ;
   private boolean[] T00UR4_n652OpeCod ;
   private String[] T00UR16_A396EmprCod ;
   private int[] T00UR16_A3218SolLuzCod ;
   private int[] T00UR17_A3218SolLuzCod ;
   private byte[] T00UR17_A3233SolLuzLin ;
   private String[] T00UR17_A3234SolLuzObs ;
   private boolean[] T00UR17_n3234SolLuzObs ;
   private String[] T00UR17_A396EmprCod ;
   private String[] T00UR18_A396EmprCod ;
   private int[] T00UR18_A3218SolLuzCod ;
   private byte[] T00UR18_A3233SolLuzLin ;
   private int[] T00UR3_A3218SolLuzCod ;
   private byte[] T00UR3_A3233SolLuzLin ;
   private String[] T00UR3_A3234SolLuzObs ;
   private boolean[] T00UR3_n3234SolLuzObs ;
   private String[] T00UR3_A396EmprCod ;
   private int[] T00UR2_A3218SolLuzCod ;
   private byte[] T00UR2_A3233SolLuzLin ;
   private String[] T00UR2_A3234SolLuzObs ;
   private boolean[] T00UR2_n3234SolLuzObs ;
   private String[] T00UR2_A396EmprCod ;
   private String[] T00UR22_A396EmprCod ;
   private int[] T00UR22_A3218SolLuzCod ;
   private byte[] T00UR22_A3233SolLuzLin ;
   private String[] T00UR7_A653OpeNom ;
   private boolean[] T00UR7_n653OpeNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttslcc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttslcc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttslcc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttslcc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttslcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00UR2", "SELECT SolLuzCod, SolLuzLin, SolLuzObs, EmprCod FROM TXPLSOLLU WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ?  FOR UPDATE OF SolLuzObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR3", "SELECT SolLuzCod, SolLuzLin, SolLuzObs, EmprCod FROM TXPLSOLLU WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR4", "SELECT SolLuzCod, BarCod, BarCodReo, BarCodPar, SolLuzMat, SolLuzSer, SolLuzTip, SolLuzDisN, SolLuzNom, SolLuzNum, SolLuzFec, SolLuzCliC, SolLuzCliN, SolLuzSol, SolLuzNor, SolLuzMaq, SolLuzUlin, SolLuzRef, EmprCod, OpeCod FROM TXPCSOLLU WHERE EmprCod = ? AND SolLuzCod = ?  FOR UPDATE OF BarCod, BarCodReo, BarCodPar, SolLuzMat, SolLuzSer, SolLuzTip, SolLuzDisN, SolLuzNom, SolLuzNum, SolLuzFec, SolLuzCliC, SolLuzCliN, SolLuzSol, SolLuzNor, SolLuzMaq, SolLuzUlin, SolLuzRef, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR5", "SELECT SolLuzCod, BarCod, BarCodReo, BarCodPar, SolLuzMat, SolLuzSer, SolLuzTip, SolLuzDisN, SolLuzNom, SolLuzNum, SolLuzFec, SolLuzCliC, SolLuzCliN, SolLuzSol, SolLuzNor, SolLuzMaq, SolLuzUlin, SolLuzRef, EmprCod, OpeCod FROM TXPCSOLLU WHERE EmprCod = ? AND SolLuzCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR7", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR8", "SELECT /*+ FIRST_ROWS(100) */ TM1.SolLuzCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T2.EmprNom, TM1.SolLuzMat, TM1.SolLuzSer, TM1.SolLuzTip, TM1.SolLuzDisN, TM1.SolLuzNom, TM1.SolLuzNum, TM1.SolLuzFec, T3.OpeNom, TM1.SolLuzCliC, TM1.SolLuzCliN, TM1.SolLuzSol, TM1.SolLuzNor, TM1.SolLuzMaq, TM1.SolLuzUlin, TM1.SolLuzRef, TM1.EmprCod, TM1.OpeCod FROM ((TXPCSOLLU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.SolLuzCod = ? ORDER BY TM1.EmprCod, TM1.SolLuzCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND SolLuzCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolLuzCod FROM TXPCSOLLU WHERE ( SolLuzCod > ?) and EmprCod = ? ORDER BY EmprCod, SolLuzCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00UR11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolLuzCod FROM TXPCSOLLU WHERE ( SolLuzCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, SolLuzCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00UR12", "INSERT INTO TXPCSOLLU(SolLuzCod, BarCod, BarCodReo, BarCodPar, SolLuzMat, SolLuzSer, SolLuzTip, SolLuzDisN, SolLuzNom, SolLuzNum, SolLuzFec, SolLuzCliC, SolLuzCliN, SolLuzSol, SolLuzNor, SolLuzMaq, SolLuzUlin, SolLuzRef, EmprCod, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCSOLLU")
         ,new UpdateCursor("T00UR13", "UPDATE TXPCSOLLU SET BarCod=?, BarCodReo=?, BarCodPar=?, SolLuzMat=?, SolLuzSer=?, SolLuzTip=?, SolLuzDisN=?, SolLuzNom=?, SolLuzNum=?, SolLuzFec=?, SolLuzCliC=?, SolLuzCliN=?, SolLuzSol=?, SolLuzNor=?, SolLuzMaq=?, SolLuzUlin=?, SolLuzRef=?, OpeCod=?  WHERE EmprCod = ? AND SolLuzCod = ?", GX_NOMASK, "TXPCSOLLU")
         ,new UpdateCursor("T00UR14", "DELETE FROM TXPCSOLLU  WHERE EmprCod = ? AND SolLuzCod = ?", GX_NOMASK, "TXPCSOLLU")
         ,new UpdateCursor("T00UR15", "UPDATE TXPCSOLLU SET SolLuzUlin=?  WHERE EmprCod = ? AND SolLuzCod = ?", GX_NOMASK, "TXPCSOLLU")
         ,new ForEachCursor("T00UR16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? ORDER BY EmprCod, SolLuzCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR17", "SELECT SolLuzCod, SolLuzLin, SolLuzObs, EmprCod FROM TXPLSOLLU WHERE EmprCod = ? and SolLuzCod = ? and SolLuzLin = ? ORDER BY EmprCod, SolLuzCod, SolLuzLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UR18", "SELECT EmprCod, SolLuzCod, SolLuzLin FROM TXPLSOLLU WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00UR19", "INSERT INTO TXPLSOLLU(SolLuzCod, SolLuzLin, SolLuzObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLSOLLU")
         ,new UpdateCursor("T00UR20", "UPDATE TXPLSOLLU SET SolLuzObs=?  WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ?", GX_NOMASK, "TXPLSOLLU")
         ,new UpdateCursor("T00UR21", "DELETE FROM TXPLSOLLU  WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ?", GX_NOMASK, "TXPLSOLLU")
         ,new ForEachCursor("T00UR22", "SELECT EmprCod, SolLuzCod, SolLuzLin FROM TXPLSOLLU WHERE EmprCod = ? and SolLuzCod = ? ORDER BY EmprCod, SolLuzCod, SolLuzLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 15);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((int[]) buf[36])[0] = rslt.getInt(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 15);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((int[]) buf[36])[0] = rslt.getInt(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 15);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 3);
               ((int[]) buf[40])[0] = rslt.getInt(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 8);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 13);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 30);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 3);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 20);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 6);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 15);
               }
               stmt.setString(19, (String)parms[35], 3);
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[37]).intValue());
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 8);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 13);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 30);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 3);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 20);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 6);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 15);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[35]).intValue());
               }
               stmt.setString(19, (String)parms[36], 3);
               stmt.setInt(20, ((Number) parms[37]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
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
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 60);
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

