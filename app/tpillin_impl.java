package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpillin_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_BC463( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
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
         A3173SolPilCliC = (int)(GXutil.lval( httpContext.GetPar( "SolPilCliC"))) ;
         n3173SolPilCliC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3173SolPilCliC), 6, 0));
         A3166SolPilMat = httpContext.GetPar( "SolPilMat") ;
         n3166SolPilMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", A3166SolPilMat);
         A3168SolPilTip = (short)(GXutil.lval( httpContext.GetPar( "SolPilTip"))) ;
         n3168SolPilTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3168SolPilTip), 4, 0));
         A3167SolPilSer = httpContext.GetPar( "SolPilSer") ;
         n3167SolPilSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", A3167SolPilSer);
         A3169SolPilDisN = httpContext.GetPar( "SolPilDisN") ;
         n3169SolPilDisN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", A3169SolPilDisN);
         A3170SolPilNom = httpContext.GetPar( "SolPilNom") ;
         n3170SolPilNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", A3170SolPilNom);
         A3171SolPilNum = (int)(GXutil.lval( httpContext.GetPar( "SolPilNum"))) ;
         n3171SolPilNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3171SolPilNum), 6, 0));
         A3174SolPilCliN = httpContext.GetPar( "SolPilCliN") ;
         n3174SolPilCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", A3174SolPilCliN);
         A3183SolPilRef = httpContext.GetPar( "SolPilRef") ;
         n3183SolPilRef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", A3183SolPilRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_BC463( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A3173SolPilCliC, A3166SolPilMat, A3168SolPilTip, A3167SolPilSer, A3169SolPilDisN, A3170SolPilNom, A3171SolPilNum, A3174SolPilCliN, A3183SolPilRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3181SolPilMaq = httpContext.GetPar( "SolPilMaq") ;
         n3181SolPilMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", A3181SolPilMaq);
         AV19FlagM = (byte)(GXutil.lval( httpContext.GetPar( "FlagM"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_BC463( A396EmprCod, A3181SolPilMaq, AV19FlagM) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
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
         xc_27_BC463( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV41FlagCal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
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
         AV56FlagHdr = (byte)(GXutil.lval( httpContext.GetPar( "FlagHdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56FlagHdr", GXutil.str( AV56FlagHdr, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_BC463( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV56FlagHdr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3165SolPilCod = (int)(GXutil.lval( httpContext.GetPar( "SolPilCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
         A3184SolPilGra = httpContext.GetPar( "SolPilGra") ;
         n3184SolPilGra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", A3184SolPilGra);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_BC463( A396EmprCod, A3165SolPilCod, A3184SolPilGra) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         n652OpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_38( A396EmprCod, A652OpeCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TEST DE PILLING", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSolPilCod_Internalname ;
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
      nRC_GXsfl_155 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_155"))) ;
      nGXsfl_155_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_155_idx"))) ;
      sGXsfl_155_idx = httpContext.GetPar( "sGXsfl_155_idx") ;
      A3182SolPilUlin = (byte)(GXutil.lval( httpContext.GetPar( "SolPilUlin"))) ;
      n3182SolPilUlin = false ;
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

   public tpillin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpillin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpillin_impl.class ));
   }

   public tpillin_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPILLIN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"3chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3165SolPilCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolPilCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3165SolPilCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3165SolPilCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"8chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilCod_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"8chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"1chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"1chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilMat_Internalname, GXutil.rtrim( A3166SolPilMat), GXutil.rtrim( localUtil.format( A3166SolPilMat, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"16chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilMat_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilSer_Internalname, GXutil.rtrim( A3167SolPilSer), GXutil.rtrim( localUtil.format( A3167SolPilSer, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"16chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilSer_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilTip_Internalname, GXutil.ltrim( localUtil.ntoc( A3168SolPilTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolPilTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3168SolPilTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3168SolPilTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"4chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilTip_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Disp Cli", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilDisN_Internalname, GXutil.rtrim( A3169SolPilDisN), GXutil.rtrim( localUtil.format( A3169SolPilDisN, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"8chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilDisN_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilDisN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilNom_Internalname, GXutil.rtrim( A3170SolPilNom), GXutil.rtrim( localUtil.format( A3170SolPilNom, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"13chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilNom_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3171SolPilNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolPilNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3171SolPilNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3171SolPilNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilNum_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Test", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSolPilFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilFec_Internalname, localUtil.format(A3172SolPilFec, "99/99/99"), localUtil.format( A3172SolPilFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"8chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilFec_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSolPilFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSolPilFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPILLIN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cliente Codigo", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A3173SolPilCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolPilCliC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3173SolPilCliC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3173SolPilCliC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilCliC_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilCliC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilCliN_Internalname, GXutil.rtrim( A3174SolPilCliN), GXutil.rtrim( localUtil.format( A3174SolPilCliN, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilCliN_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Muy Bien", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilMB_Internalname, GXutil.rtrim( A3175SolPilMB), GXutil.rtrim( localUtil.format( A3175SolPilMB, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"2chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilMB_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilMB_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Bien", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilB_Internalname, GXutil.rtrim( A3176SolPilB), GXutil.rtrim( localUtil.format( A3176SolPilB, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"2chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilB_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilB_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Medio", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilMd_Internalname, GXutil.rtrim( A3177SolPilMd), GXutil.rtrim( localUtil.format( A3177SolPilMd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"2chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilMd_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilMd_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Mal", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilM_Internalname, GXutil.rtrim( A3178SolPilM), GXutil.rtrim( localUtil.format( A3178SolPilM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"2chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilM_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilM_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Muy Mal", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilMM_Internalname, GXutil.rtrim( A3179SolPilMM), GXutil.rtrim( localUtil.format( A3179SolPilMM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"2chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilMM_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilMM_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Norma Iso", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilNor_Internalname, GXutil.rtrim( A3180SolPilNor), GXutil.rtrim( localUtil.format( A3180SolPilNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"20chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilNor_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilNor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Maquinaaq", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilMaq_Internalname, GXutil.rtrim( A3181SolPilMaq), GXutil.rtrim( localUtil.format( A3181SolPilMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilMaq_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Num Linea", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A3182SolPilUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolPilUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3182SolPilUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3182SolPilUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"2chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilUlin_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "SolPilRef", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilRef_Internalname, GXutil.rtrim( A3183SolPilRef), GXutil.rtrim( localUtil.format( A3183SolPilRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"15chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilRef_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilRef_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Grado 1,2,3,4,5 + OBS", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolPilGra_Internalname, GXutil.rtrim( A3184SolPilGra), GXutil.rtrim( localUtil.format( A3184SolPilGra, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"20chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolPilGra_Jsonclick, 0, "", "", "", "", "", 1, edtSolPilGra_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPILLIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol155( ) ;
      nGXsfl_155_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount464 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_464 = (short)(1) ;
            scanStartBC464( ) ;
            while ( RcdFound464 != 0 )
            {
               init_level_properties464( ) ;
               getByPrimaryKeyBC464( ) ;
               addRowBC464( ) ;
               scanNextBC464( ) ;
            }
            scanEndBC464( ) ;
            nBlankRcdCount464 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3182SolPilUlin = A3182SolPilUlin ;
         n3182SolPilUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
         standaloneNotModalBC464( ) ;
         standaloneModalBC464( ) ;
         sMode464 = Gx_mode ;
         while ( nGXsfl_155_idx < nRC_GXsfl_155 )
         {
            bGXsfl_155_Refreshing = true ;
            readRowBC464( ) ;
            edtavnRcdDeleted_464_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_464_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_464_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_464_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            edtSolPilLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLPILLIN_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolPilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilLin_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            edtSolPilObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLPILOBS_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolPilObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilObs_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            if ( ( nRcdExists_464 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalBC464( ) ;
            }
            sendRowBC464( ) ;
            bGXsfl_155_Refreshing = false ;
         }
         Gx_mode = sMode464 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3182SolPilUlin = B3182SolPilUlin ;
         n3182SolPilUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount464 = (short)(5) ;
         nRcdExists_464 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartBC464( ) ;
            while ( RcdFound464 != 0 )
            {
               sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_155464( ) ;
               init_level_properties464( ) ;
               standaloneNotModalBC464( ) ;
               getByPrimaryKeyBC464( ) ;
               standaloneModalBC464( ) ;
               addRowBC464( ) ;
               scanNextBC464( ) ;
            }
            scanEndBC464( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode464 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_155464( ) ;
      initAllBC464( ) ;
      init_level_properties464( ) ;
      B3182SolPilUlin = A3182SolPilUlin ;
      n3182SolPilUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      nRcdExists_464 = (short)(0) ;
      nIsMod_464 = (short)(0) ;
      nRcdDeleted_464 = (short)(0) ;
      nBlankRcdCount464 = (short)(nBlankRcdUsr464+nBlankRcdCount464) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount464 > 0 )
      {
         standaloneNotModalBC464( ) ;
         standaloneModalBC464( ) ;
         addRowBC464( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtSolPilLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount464 = (short)(nBlankRcdCount464-1) ;
      }
      Gx_mode = sMode464 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3182SolPilUlin = B3182SolPilUlin ;
      n3182SolPilUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPILLIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPILLIN.htm");
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
      e11BC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z3165SolPilCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3165SolPilCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z3166SolPilMat = httpContext.cgiGet( "Z3166SolPilMat") ;
            Z3167SolPilSer = httpContext.cgiGet( "Z3167SolPilSer") ;
            Z3168SolPilTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z3168SolPilTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3169SolPilDisN = httpContext.cgiGet( "Z3169SolPilDisN") ;
            Z3170SolPilNom = httpContext.cgiGet( "Z3170SolPilNom") ;
            Z3171SolPilNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z3171SolPilNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3172SolPilFec = localUtil.ctod( httpContext.cgiGet( "Z3172SolPilFec"), 0) ;
            Z3173SolPilCliC = (int)(localUtil.ctol( httpContext.cgiGet( "Z3173SolPilCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3174SolPilCliN = httpContext.cgiGet( "Z3174SolPilCliN") ;
            Z3175SolPilMB = httpContext.cgiGet( "Z3175SolPilMB") ;
            Z3176SolPilB = httpContext.cgiGet( "Z3176SolPilB") ;
            Z3177SolPilMd = httpContext.cgiGet( "Z3177SolPilMd") ;
            Z3178SolPilM = httpContext.cgiGet( "Z3178SolPilM") ;
            Z3179SolPilMM = httpContext.cgiGet( "Z3179SolPilMM") ;
            Z3180SolPilNor = httpContext.cgiGet( "Z3180SolPilNor") ;
            Z3181SolPilMaq = httpContext.cgiGet( "Z3181SolPilMaq") ;
            Z3182SolPilUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3182SolPilUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3183SolPilRef = httpContext.cgiGet( "Z3183SolPilRef") ;
            Z3184SolPilGra = httpContext.cgiGet( "Z3184SolPilGra") ;
            Z11798SolPilRqMn = httpContext.cgiGet( "Z11798SolPilRqMn") ;
            Z11799SolPilSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11799SolPilSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11868SolPilMtdo = httpContext.cgiGet( "Z11868SolPilMtdo") ;
            Z11869SolPilRev = httpContext.cgiGet( "Z11869SolPilRev") ;
            Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11798SolPilRqMn = httpContext.cgiGet( "Z11798SolPilRqMn") ;
            n11798SolPilRqMn = false ;
            A11799SolPilSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11799SolPilSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11799SolPilSt = false ;
            A11868SolPilMtdo = httpContext.cgiGet( "Z11868SolPilMtdo") ;
            n11868SolPilMtdo = false ;
            A11869SolPilRev = httpContext.cgiGet( "Z11869SolPilRev") ;
            n11869SolPilRev = false ;
            O3182SolPilUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "O3182SolPilUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_155 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_155"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41FlagCal = (int)(localUtil.ctol( httpContext.cgiGet( "vFLAGCAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11799SolPilSt = (byte)(localUtil.ctol( httpContext.cgiGet( "SOLPILST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11868SolPilMtdo = httpContext.cgiGet( "SOLPILMTDO") ;
            A11869SolPilRev = httpContext.cgiGet( "SOLPILREV") ;
            AV19FlagM = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV56FlagHdr = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGHDR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11798SolPilRqMn = httpContext.cgiGet( "SOLPILRQMN") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolPilCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolPilCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLPILCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSolPilCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3165SolPilCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
            }
            else
            {
               A3165SolPilCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSolPilCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
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
            A3166SolPilMat = httpContext.cgiGet( edtSolPilMat_Internalname) ;
            n3166SolPilMat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", A3166SolPilMat);
            A3167SolPilSer = httpContext.cgiGet( edtSolPilSer_Internalname) ;
            n3167SolPilSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", A3167SolPilSer);
            A3168SolPilTip = (short)(localUtil.ctol( httpContext.cgiGet( edtSolPilTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3168SolPilTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3168SolPilTip), 4, 0));
            A3169SolPilDisN = httpContext.cgiGet( edtSolPilDisN_Internalname) ;
            n3169SolPilDisN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", A3169SolPilDisN);
            A3170SolPilNom = httpContext.cgiGet( edtSolPilNom_Internalname) ;
            n3170SolPilNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", A3170SolPilNom);
            A3171SolPilNum = (int)(localUtil.ctol( httpContext.cgiGet( edtSolPilNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3171SolPilNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3171SolPilNum), 6, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtSolPilFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SOLPILFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSolPilFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3172SolPilFec = GXutil.nullDate() ;
               n3172SolPilFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3172SolPilFec", localUtil.format(A3172SolPilFec, "99/99/99"));
            }
            else
            {
               A3172SolPilFec = localUtil.ctod( httpContext.cgiGet( edtSolPilFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3172SolPilFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3172SolPilFec", localUtil.format(A3172SolPilFec, "99/99/99"));
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
            A3173SolPilCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtSolPilCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3173SolPilCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3173SolPilCliC), 6, 0));
            A3174SolPilCliN = httpContext.cgiGet( edtSolPilCliN_Internalname) ;
            n3174SolPilCliN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", A3174SolPilCliN);
            A3175SolPilMB = httpContext.cgiGet( edtSolPilMB_Internalname) ;
            n3175SolPilMB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3175SolPilMB", A3175SolPilMB);
            A3176SolPilB = httpContext.cgiGet( edtSolPilB_Internalname) ;
            n3176SolPilB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3176SolPilB", A3176SolPilB);
            A3177SolPilMd = httpContext.cgiGet( edtSolPilMd_Internalname) ;
            n3177SolPilMd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3177SolPilMd", A3177SolPilMd);
            A3178SolPilM = httpContext.cgiGet( edtSolPilM_Internalname) ;
            n3178SolPilM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3178SolPilM", A3178SolPilM);
            A3179SolPilMM = httpContext.cgiGet( edtSolPilMM_Internalname) ;
            n3179SolPilMM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3179SolPilMM", A3179SolPilMM);
            A3180SolPilNor = httpContext.cgiGet( edtSolPilNor_Internalname) ;
            n3180SolPilNor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3180SolPilNor", A3180SolPilNor);
            A3181SolPilMaq = httpContext.cgiGet( edtSolPilMaq_Internalname) ;
            n3181SolPilMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", A3181SolPilMaq);
            A3182SolPilUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolPilUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3182SolPilUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
            A3183SolPilRef = httpContext.cgiGet( edtSolPilRef_Internalname) ;
            n3183SolPilRef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", A3183SolPilRef);
            A3184SolPilGra = httpContext.cgiGet( edtSolPilGra_Internalname) ;
            n3184SolPilGra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", A3184SolPilGra);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPILLIN");
            forbiddenHiddens.add("SolPilRqMn", GXutil.rtrim( localUtil.format( A11798SolPilRqMn, "")));
            forbiddenHiddens.add("SolPilSt", localUtil.format( DecimalUtil.doubleToDec(A11799SolPilSt), "9"));
            forbiddenHiddens.add("SolPilMtdo", GXutil.rtrim( localUtil.format( A11868SolPilMtdo, "")));
            forbiddenHiddens.add("SolPilRev", GXutil.rtrim( localUtil.format( A11869SolPilRev, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A3165SolPilCod != Z3165SolPilCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tpillin:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A3165SolPilCod = (int)(GXutil.lval( httpContext.GetPar( "SolPilCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
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
                        e11BC2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'GRADOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Grados' */
                        e12BC2 ();
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
            initAllBC463( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_464_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_464_Enabled), 5, 0), !bGXsfl_155_Refreshing);
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
      disableAttributesBC463( ) ;
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

   public void confirm_BC0( )
   {
      beforeValidateBC463( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsBC463( ) ;
         }
         else
         {
            checkExtendedTableBC463( ) ;
            if ( AnyError == 0 )
            {
               zmBC463( 37) ;
               zmBC463( 38) ;
            }
            closeExtendedTableCursorsBC463( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode463 = Gx_mode ;
         confirm_BC464( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode463 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode463 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesBC0( ) ;
      }
   }

   public void confirm_BC464( )
   {
      s3182SolPilUlin = O3182SolPilUlin ;
      n3182SolPilUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      nGXsfl_155_idx = 0 ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         readRowBC464( ) ;
         if ( ( nRcdExists_464 != 0 ) || ( nIsMod_464 != 0 ) )
         {
            getKeyBC464( ) ;
            if ( ( nRcdExists_464 == 0 ) && ( nRcdDeleted_464 == 0 ) )
            {
               if ( RcdFound464 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateBC464( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableBC464( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsBC464( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3182SolPilUlin = A3182SolPilUlin ;
                     n3182SolPilUlin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "SOLPILLIN_" + sGXsfl_155_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSolPilLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound464 != 0 )
               {
                  if ( nRcdDeleted_464 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyBC464( ) ;
                     loadBC464( ) ;
                     beforeValidateBC464( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsBC464( ) ;
                        O3182SolPilUlin = A3182SolPilUlin ;
                        n3182SolPilUlin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_464 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateBC464( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableBC464( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsBC464( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3182SolPilUlin = A3182SolPilUlin ;
                           n3182SolPilUlin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_464 == 0 )
                  {
                     GXCCtl = "SOLPILLIN_" + sGXsfl_155_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolPilLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_464_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolPilLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3185SolPilLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolPilObs_Internalname, GXutil.rtrim( A3186SolPilObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3185SolPilLin_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( Z3185SolPilLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3186SolPilObs_"+sGXsfl_155_idx, GXutil.rtrim( Z3186SolPilObs)) ;
         httpContext.changePostValue( "nRcdDeleted_464_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_464_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_464_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_464 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_464_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_464_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLPILLIN_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolPilLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLPILOBS_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolPilObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3182SolPilUlin = s3182SolPilUlin ;
      n3182SolPilUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionBC0( )
   {
   }

   public void e11BC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      tpillin_impl.this.A396EmprCod = GXv_char1[0] ;
      tpillin_impl.this.AV16EmprNom = GXv_char2[0] ;
      tpillin_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV21LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char4 = AV20Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char4 = AV35Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1098_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV35Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit4", AV35Lit4);
      GXt_char4 = AV38Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV38Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit7", AV38Lit7);
      GXt_char4 = AV47LitSer ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "BARSER", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV47LitSer = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47LitSer", AV47LitSer);
      GXt_char4 = AV49LitCli ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV49LitCli = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49LitCli", AV49LitCli);
      GXt_char4 = AV48LitMat ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV48LitMat = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48LitMat", AV48LitMat);
      GXt_char4 = AV44LitNTest ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT374_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV44LitNTest = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44LitNTest", AV44LitNTest);
      GXt_char4 = AV45LitFTest ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT310_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV45LitFTest = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45LitFTest", AV45LitFTest);
      GXt_char4 = AV43LitHDR ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT171_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV43LitHDR = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43LitHDR", AV43LitHDR);
      GXt_char4 = AV51LitNorma ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA005", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV51LitNorma = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51LitNorma", AV51LitNorma);
      GXt_char4 = AV50LitMaq ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV50LitMaq = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50LitMaq", AV50LitMaq);
      GXt_char4 = AV52LitResul ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT184_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV52LitResul = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52LitResul", AV52LitResul);
      GXt_char4 = AV55LitOper ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV55LitOper = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55LitOper", AV55LitOper);
      GXt_char4 = AV53LitObser ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT185_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV53LitObser = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53LitObser", AV53LitObser);
      GXt_char4 = AV42LitTit ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA022", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV42LitTit = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42LitTit", AV42LitTit);
      GXt_char4 = AV46LitRef ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2402_", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV46LitRef = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46LitRef", AV46LitRef);
      GXt_char4 = AV54LitGrado ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA021", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV54LitGrado = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54LitGrado", AV54LitGrado);
      GXt_char4 = AV57Lit200 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "PILLIN001", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV57Lit200 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Lit200", AV57Lit200);
      GXt_char4 = AV58Lit202 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "PILLIN003", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV58Lit202 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Lit202", AV58Lit202);
      GXt_char4 = AV59Lit203 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "PILLIN004", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV59Lit203 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Lit203", AV59Lit203);
      GXt_char4 = AV60Lit204 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "PILLIN005", ""), (byte)(99), GXv_char3) ;
      tpillin_impl.this.GXt_char4 = GXv_char3[0] ;
      AV60Lit204 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Lit204", AV60Lit204);
   }

   public void e12BC2( )
   {
      /* 'Grados' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int5[0] = A3165SolPilCod ;
         GXv_char2[0] = A3184SolPilGra ;
         new app.pgradopilling(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_char2) ;
         tpillin_impl.this.A396EmprCod = GXv_char3[0] ;
         tpillin_impl.this.A3165SolPilCod = GXv_int5[0] ;
         tpillin_impl.this.A3184SolPilGra = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", A3184SolPilGra);
      }
      /*  Sending Event outputs  */
   }

   public void zmBC463( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z129BarCod = T00BC5_A129BarCod[0] ;
            Z132BarCodReo = T00BC5_A132BarCodReo[0] ;
            Z130BarCodPar = T00BC5_A130BarCodPar[0] ;
            Z3166SolPilMat = T00BC5_A3166SolPilMat[0] ;
            Z3167SolPilSer = T00BC5_A3167SolPilSer[0] ;
            Z3168SolPilTip = T00BC5_A3168SolPilTip[0] ;
            Z3169SolPilDisN = T00BC5_A3169SolPilDisN[0] ;
            Z3170SolPilNom = T00BC5_A3170SolPilNom[0] ;
            Z3171SolPilNum = T00BC5_A3171SolPilNum[0] ;
            Z3172SolPilFec = T00BC5_A3172SolPilFec[0] ;
            Z3173SolPilCliC = T00BC5_A3173SolPilCliC[0] ;
            Z3174SolPilCliN = T00BC5_A3174SolPilCliN[0] ;
            Z3175SolPilMB = T00BC5_A3175SolPilMB[0] ;
            Z3176SolPilB = T00BC5_A3176SolPilB[0] ;
            Z3177SolPilMd = T00BC5_A3177SolPilMd[0] ;
            Z3178SolPilM = T00BC5_A3178SolPilM[0] ;
            Z3179SolPilMM = T00BC5_A3179SolPilMM[0] ;
            Z3180SolPilNor = T00BC5_A3180SolPilNor[0] ;
            Z3181SolPilMaq = T00BC5_A3181SolPilMaq[0] ;
            Z3182SolPilUlin = T00BC5_A3182SolPilUlin[0] ;
            Z3183SolPilRef = T00BC5_A3183SolPilRef[0] ;
            Z3184SolPilGra = T00BC5_A3184SolPilGra[0] ;
            Z11798SolPilRqMn = T00BC5_A11798SolPilRqMn[0] ;
            Z11799SolPilSt = T00BC5_A11799SolPilSt[0] ;
            Z11868SolPilMtdo = T00BC5_A11868SolPilMtdo[0] ;
            Z11869SolPilRev = T00BC5_A11869SolPilRev[0] ;
            Z652OpeCod = T00BC5_A652OpeCod[0] ;
         }
         else
         {
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z3166SolPilMat = A3166SolPilMat ;
            Z3167SolPilSer = A3167SolPilSer ;
            Z3168SolPilTip = A3168SolPilTip ;
            Z3169SolPilDisN = A3169SolPilDisN ;
            Z3170SolPilNom = A3170SolPilNom ;
            Z3171SolPilNum = A3171SolPilNum ;
            Z3172SolPilFec = A3172SolPilFec ;
            Z3173SolPilCliC = A3173SolPilCliC ;
            Z3174SolPilCliN = A3174SolPilCliN ;
            Z3175SolPilMB = A3175SolPilMB ;
            Z3176SolPilB = A3176SolPilB ;
            Z3177SolPilMd = A3177SolPilMd ;
            Z3178SolPilM = A3178SolPilM ;
            Z3179SolPilMM = A3179SolPilMM ;
            Z3180SolPilNor = A3180SolPilNor ;
            Z3181SolPilMaq = A3181SolPilMaq ;
            Z3182SolPilUlin = A3182SolPilUlin ;
            Z3183SolPilRef = A3183SolPilRef ;
            Z3184SolPilGra = A3184SolPilGra ;
            Z11798SolPilRqMn = A11798SolPilRqMn ;
            Z11799SolPilSt = A11799SolPilSt ;
            Z11868SolPilMtdo = A11868SolPilMtdo ;
            Z11869SolPilRev = A11869SolPilRev ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z3165SolPilCod = A3165SolPilCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z3166SolPilMat = A3166SolPilMat ;
         Z3167SolPilSer = A3167SolPilSer ;
         Z3168SolPilTip = A3168SolPilTip ;
         Z3169SolPilDisN = A3169SolPilDisN ;
         Z3170SolPilNom = A3170SolPilNom ;
         Z3171SolPilNum = A3171SolPilNum ;
         Z3172SolPilFec = A3172SolPilFec ;
         Z3173SolPilCliC = A3173SolPilCliC ;
         Z3174SolPilCliN = A3174SolPilCliN ;
         Z3175SolPilMB = A3175SolPilMB ;
         Z3176SolPilB = A3176SolPilB ;
         Z3177SolPilMd = A3177SolPilMd ;
         Z3178SolPilM = A3178SolPilM ;
         Z3179SolPilMM = A3179SolPilMM ;
         Z3180SolPilNor = A3180SolPilNor ;
         Z3181SolPilMaq = A3181SolPilMaq ;
         Z3182SolPilUlin = A3182SolPilUlin ;
         Z3183SolPilRef = A3183SolPilRef ;
         Z3184SolPilGra = A3184SolPilGra ;
         Z11798SolPilRqMn = A11798SolPilRqMn ;
         Z11799SolPilSt = A11799SolPilSt ;
         Z11868SolPilMtdo = A11868SolPilMtdo ;
         Z11869SolPilRev = A11869SolPilRev ;
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
      edtSolPilCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilCliC_Enabled), 5, 0), true);
      edtSolPilCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilCliN_Enabled), 5, 0), true);
      edtSolPilNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilNom_Enabled), 5, 0), true);
      edtSolPilNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilNum_Enabled), 5, 0), true);
      edtSolPilDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilDisN_Enabled), 5, 0), true);
      edtSolPilMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilMat_Enabled), 5, 0), true);
      edtSolPilTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilTip_Enabled), 5, 0), true);
      edtSolPilSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilSer_Enabled), 5, 0), true);
      edtSolPilUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilUlin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolPilCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilCliC_Enabled), 5, 0), true);
      edtSolPilCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilCliN_Enabled), 5, 0), true);
      edtSolPilNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilNom_Enabled), 5, 0), true);
      edtSolPilNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilNum_Enabled), 5, 0), true);
      edtSolPilDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilDisN_Enabled), 5, 0), true);
      edtSolPilMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilMat_Enabled), 5, 0), true);
      edtSolPilTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilTip_Enabled), 5, 0), true);
      edtSolPilSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilSer_Enabled), 5, 0), true);
      edtSolPilUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilUlin_Enabled), 5, 0), true);
      /* Using cursor T00BC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00BC6_A407EmprNom[0] ;
      n407EmprNom = T00BC6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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
      if ( isIns( )  && (0==A11799SolPilSt) && ( Gx_BScreen == 0 ) )
      {
         A11799SolPilSt = (byte)(1) ;
         n11799SolPilSt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11799SolPilSt", GXutil.str( A11799SolPilSt, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11868SolPilMtdo)==0) && ( Gx_BScreen == 0 ) )
      {
         A11868SolPilMtdo = httpContext.getMessage( httpContext.getMessage( "NEXT MET 19", ""), "") ;
         n11868SolPilMtdo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11868SolPilMtdo", A11868SolPilMtdo);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11869SolPilRev)==0) && ( Gx_BScreen == 0 ) )
      {
         A11869SolPilRev = "7200" ;
         n11869SolPilRev = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11869SolPilRev", A11869SolPilRev);
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

   public void loadBC463( )
   {
      /* Using cursor T00BC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound463 = (short)(1) ;
         A407EmprNom = T00BC8_A407EmprNom[0] ;
         n407EmprNom = T00BC8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A129BarCod = T00BC8_A129BarCod[0] ;
         n129BarCod = T00BC8_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00BC8_A132BarCodReo[0] ;
         n132BarCodReo = T00BC8_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00BC8_A130BarCodPar[0] ;
         n130BarCodPar = T00BC8_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A3166SolPilMat = T00BC8_A3166SolPilMat[0] ;
         n3166SolPilMat = T00BC8_n3166SolPilMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", A3166SolPilMat);
         A3167SolPilSer = T00BC8_A3167SolPilSer[0] ;
         n3167SolPilSer = T00BC8_n3167SolPilSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", A3167SolPilSer);
         A3168SolPilTip = T00BC8_A3168SolPilTip[0] ;
         n3168SolPilTip = T00BC8_n3168SolPilTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3168SolPilTip), 4, 0));
         A3169SolPilDisN = T00BC8_A3169SolPilDisN[0] ;
         n3169SolPilDisN = T00BC8_n3169SolPilDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", A3169SolPilDisN);
         A3170SolPilNom = T00BC8_A3170SolPilNom[0] ;
         n3170SolPilNom = T00BC8_n3170SolPilNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", A3170SolPilNom);
         A3171SolPilNum = T00BC8_A3171SolPilNum[0] ;
         n3171SolPilNum = T00BC8_n3171SolPilNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3171SolPilNum), 6, 0));
         A3172SolPilFec = T00BC8_A3172SolPilFec[0] ;
         n3172SolPilFec = T00BC8_n3172SolPilFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3172SolPilFec", localUtil.format(A3172SolPilFec, "99/99/99"));
         A653OpeNom = T00BC8_A653OpeNom[0] ;
         n653OpeNom = T00BC8_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A3173SolPilCliC = T00BC8_A3173SolPilCliC[0] ;
         n3173SolPilCliC = T00BC8_n3173SolPilCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3173SolPilCliC), 6, 0));
         A3174SolPilCliN = T00BC8_A3174SolPilCliN[0] ;
         n3174SolPilCliN = T00BC8_n3174SolPilCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", A3174SolPilCliN);
         A3175SolPilMB = T00BC8_A3175SolPilMB[0] ;
         n3175SolPilMB = T00BC8_n3175SolPilMB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3175SolPilMB", A3175SolPilMB);
         A3176SolPilB = T00BC8_A3176SolPilB[0] ;
         n3176SolPilB = T00BC8_n3176SolPilB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3176SolPilB", A3176SolPilB);
         A3177SolPilMd = T00BC8_A3177SolPilMd[0] ;
         n3177SolPilMd = T00BC8_n3177SolPilMd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3177SolPilMd", A3177SolPilMd);
         A3178SolPilM = T00BC8_A3178SolPilM[0] ;
         n3178SolPilM = T00BC8_n3178SolPilM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3178SolPilM", A3178SolPilM);
         A3179SolPilMM = T00BC8_A3179SolPilMM[0] ;
         n3179SolPilMM = T00BC8_n3179SolPilMM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3179SolPilMM", A3179SolPilMM);
         A3180SolPilNor = T00BC8_A3180SolPilNor[0] ;
         n3180SolPilNor = T00BC8_n3180SolPilNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3180SolPilNor", A3180SolPilNor);
         A3181SolPilMaq = T00BC8_A3181SolPilMaq[0] ;
         n3181SolPilMaq = T00BC8_n3181SolPilMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", A3181SolPilMaq);
         A3182SolPilUlin = T00BC8_A3182SolPilUlin[0] ;
         n3182SolPilUlin = T00BC8_n3182SolPilUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
         A3183SolPilRef = T00BC8_A3183SolPilRef[0] ;
         n3183SolPilRef = T00BC8_n3183SolPilRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", A3183SolPilRef);
         A3184SolPilGra = T00BC8_A3184SolPilGra[0] ;
         n3184SolPilGra = T00BC8_n3184SolPilGra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", A3184SolPilGra);
         A11798SolPilRqMn = T00BC8_A11798SolPilRqMn[0] ;
         n11798SolPilRqMn = T00BC8_n11798SolPilRqMn[0] ;
         A11799SolPilSt = T00BC8_A11799SolPilSt[0] ;
         n11799SolPilSt = T00BC8_n11799SolPilSt[0] ;
         A11868SolPilMtdo = T00BC8_A11868SolPilMtdo[0] ;
         n11868SolPilMtdo = T00BC8_n11868SolPilMtdo[0] ;
         A11869SolPilRev = T00BC8_A11869SolPilRev[0] ;
         n11869SolPilRev = T00BC8_n11869SolPilRev[0] ;
         A652OpeCod = T00BC8_A652OpeCod[0] ;
         n652OpeCod = T00BC8_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zmBC463( -36) ;
      }
      pr_default.close(6);
      onLoadActionsBC463( ) ;
   }

   public void onLoadActionsBC463( )
   {
      Gx_msg = httpContext.getMessage( httpContext.getMessage( "!AVISO.Esta Hoja Ruta/Ordem Serviço ya/ja tiene/te TEST = ", ""), "") + GXutil.str( AV41FlagCal, 8, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
   }

   public void checkExtendedTableBC463( )
   {
      nIsDirty_463 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00BC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T00BC7_A653OpeNom[0] ;
      n653OpeNom = T00BC7_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(5);
      if ( isIns( )  && ( ! (0==A3165SolPilCod) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLPILCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolPilCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (0==A3165SolPilCod) )
      {
         GXv_int5[0] = A3165SolPilCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PILLIN", ""), GXv_int5) ;
         tpillin_impl.this.A3165SolPilCod = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
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
         GXv_int7[0] = A3173SolPilCliC ;
         GXv_char1[0] = A3166SolPilMat ;
         GXv_int8[0] = A3168SolPilTip ;
         GXv_char9[0] = A3167SolPilSer ;
         GXv_char10[0] = A3169SolPilDisN ;
         GXv_char11[0] = A3170SolPilNom ;
         GXv_int12[0] = A3171SolPilNum ;
         GXv_char13[0] = A3174SolPilCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int15[0] = (short)(0) ;
         GXv_char16[0] = A3183SolPilRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_char1, GXv_int8, GXv_char9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_int14, GXv_int15, GXv_char16) ;
         tpillin_impl.this.A396EmprCod = GXv_char3[0] ;
         tpillin_impl.this.A129BarCod = GXv_int5[0] ;
         tpillin_impl.this.A132BarCodReo = GXv_int6[0] ;
         tpillin_impl.this.A130BarCodPar = GXv_char2[0] ;
         tpillin_impl.this.A3173SolPilCliC = GXv_int7[0] ;
         tpillin_impl.this.A3166SolPilMat = GXv_char1[0] ;
         tpillin_impl.this.A3168SolPilTip = GXv_int8[0] ;
         tpillin_impl.this.A3167SolPilSer = GXv_char9[0] ;
         tpillin_impl.this.A3169SolPilDisN = GXv_char10[0] ;
         tpillin_impl.this.A3170SolPilNom = GXv_char11[0] ;
         tpillin_impl.this.A3171SolPilNum = GXv_int12[0] ;
         tpillin_impl.this.A3174SolPilCliN = GXv_char13[0] ;
         tpillin_impl.this.A3183SolPilRef = GXv_char16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3173SolPilCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", A3166SolPilMat);
         httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3168SolPilTip), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", A3167SolPilSer);
         httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", A3169SolPilDisN);
         httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", A3170SolPilNom);
         httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3171SolPilNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", A3174SolPilCliN);
         httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", A3183SolPilRef);
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = AV41FlagCal ;
         new app.pctrpil(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int6, GXv_char13, GXv_int7) ;
         tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
         tpillin_impl.this.A129BarCod = GXv_int12[0] ;
         tpillin_impl.this.A132BarCodReo = GXv_int6[0] ;
         tpillin_impl.this.A130BarCodPar = GXv_char13[0] ;
         tpillin_impl.this.AV41FlagCal = GXv_int7[0] ;
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
         GXv_int17[0] = AV56FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int6, GXv_char13, GXv_int17) ;
         tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
         tpillin_impl.this.A129BarCod = GXv_int12[0] ;
         tpillin_impl.this.A132BarCodReo = GXv_int6[0] ;
         tpillin_impl.this.A130BarCodPar = GXv_char13[0] ;
         tpillin_impl.this.AV56FlagHdr = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV56FlagHdr", GXutil.str( AV56FlagHdr, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ( AV56FlagHdr == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ( AV56FlagHdr == 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3181SolPilMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
         tpillin_impl.this.A3181SolPilMaq = GXv_char13[0] ;
         tpillin_impl.this.AV19FlagM = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", A3181SolPilMaq);
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A3181SolPilMaq)==0) && (0==AV19FlagM) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, "SOLPILMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolPilMaq_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsBC463( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_38( String A396EmprCod ,
                          int A652OpeCod )
   {
      /* Using cursor T00BC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T00BC9_A653OpeNom[0] ;
      n653OpeNom = T00BC9_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKeyBC463( )
   {
      /* Using cursor T00BC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound463 = (short)(1) ;
      }
      else
      {
         RcdFound463 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00BC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00BC5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmBC463( 36) ;
         RcdFound463 = (short)(1) ;
         A3165SolPilCod = T00BC5_A3165SolPilCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
         A129BarCod = T00BC5_A129BarCod[0] ;
         n129BarCod = T00BC5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00BC5_A132BarCodReo[0] ;
         n132BarCodReo = T00BC5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00BC5_A130BarCodPar[0] ;
         n130BarCodPar = T00BC5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A3166SolPilMat = T00BC5_A3166SolPilMat[0] ;
         n3166SolPilMat = T00BC5_n3166SolPilMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", A3166SolPilMat);
         A3167SolPilSer = T00BC5_A3167SolPilSer[0] ;
         n3167SolPilSer = T00BC5_n3167SolPilSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", A3167SolPilSer);
         A3168SolPilTip = T00BC5_A3168SolPilTip[0] ;
         n3168SolPilTip = T00BC5_n3168SolPilTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3168SolPilTip), 4, 0));
         A3169SolPilDisN = T00BC5_A3169SolPilDisN[0] ;
         n3169SolPilDisN = T00BC5_n3169SolPilDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", A3169SolPilDisN);
         A3170SolPilNom = T00BC5_A3170SolPilNom[0] ;
         n3170SolPilNom = T00BC5_n3170SolPilNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", A3170SolPilNom);
         A3171SolPilNum = T00BC5_A3171SolPilNum[0] ;
         n3171SolPilNum = T00BC5_n3171SolPilNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3171SolPilNum), 6, 0));
         A3172SolPilFec = T00BC5_A3172SolPilFec[0] ;
         n3172SolPilFec = T00BC5_n3172SolPilFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3172SolPilFec", localUtil.format(A3172SolPilFec, "99/99/99"));
         A3173SolPilCliC = T00BC5_A3173SolPilCliC[0] ;
         n3173SolPilCliC = T00BC5_n3173SolPilCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3173SolPilCliC), 6, 0));
         A3174SolPilCliN = T00BC5_A3174SolPilCliN[0] ;
         n3174SolPilCliN = T00BC5_n3174SolPilCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", A3174SolPilCliN);
         A3175SolPilMB = T00BC5_A3175SolPilMB[0] ;
         n3175SolPilMB = T00BC5_n3175SolPilMB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3175SolPilMB", A3175SolPilMB);
         A3176SolPilB = T00BC5_A3176SolPilB[0] ;
         n3176SolPilB = T00BC5_n3176SolPilB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3176SolPilB", A3176SolPilB);
         A3177SolPilMd = T00BC5_A3177SolPilMd[0] ;
         n3177SolPilMd = T00BC5_n3177SolPilMd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3177SolPilMd", A3177SolPilMd);
         A3178SolPilM = T00BC5_A3178SolPilM[0] ;
         n3178SolPilM = T00BC5_n3178SolPilM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3178SolPilM", A3178SolPilM);
         A3179SolPilMM = T00BC5_A3179SolPilMM[0] ;
         n3179SolPilMM = T00BC5_n3179SolPilMM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3179SolPilMM", A3179SolPilMM);
         A3180SolPilNor = T00BC5_A3180SolPilNor[0] ;
         n3180SolPilNor = T00BC5_n3180SolPilNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3180SolPilNor", A3180SolPilNor);
         A3181SolPilMaq = T00BC5_A3181SolPilMaq[0] ;
         n3181SolPilMaq = T00BC5_n3181SolPilMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", A3181SolPilMaq);
         A3182SolPilUlin = T00BC5_A3182SolPilUlin[0] ;
         n3182SolPilUlin = T00BC5_n3182SolPilUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
         A3183SolPilRef = T00BC5_A3183SolPilRef[0] ;
         n3183SolPilRef = T00BC5_n3183SolPilRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", A3183SolPilRef);
         A3184SolPilGra = T00BC5_A3184SolPilGra[0] ;
         n3184SolPilGra = T00BC5_n3184SolPilGra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", A3184SolPilGra);
         A11798SolPilRqMn = T00BC5_A11798SolPilRqMn[0] ;
         n11798SolPilRqMn = T00BC5_n11798SolPilRqMn[0] ;
         A11799SolPilSt = T00BC5_A11799SolPilSt[0] ;
         n11799SolPilSt = T00BC5_n11799SolPilSt[0] ;
         A11868SolPilMtdo = T00BC5_A11868SolPilMtdo[0] ;
         n11868SolPilMtdo = T00BC5_n11868SolPilMtdo[0] ;
         A11869SolPilRev = T00BC5_A11869SolPilRev[0] ;
         n11869SolPilRev = T00BC5_n11869SolPilRev[0] ;
         A652OpeCod = T00BC5_A652OpeCod[0] ;
         n652OpeCod = T00BC5_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         O3182SolPilUlin = A3182SolPilUlin ;
         n3182SolPilUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z3165SolPilCod = A3165SolPilCod ;
         sMode463 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadBC463( ) ;
         if ( AnyError == 1 )
         {
            RcdFound463 = (short)(0) ;
            initializeNonKeyBC463( ) ;
         }
         Gx_mode = sMode463 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound463 = (short)(0) ;
         initializeNonKeyBC463( ) ;
         sMode463 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode463 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyBC463( ) ;
      if ( RcdFound463 == 0 )
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
      RcdFound463 = (short)(0) ;
      /* Using cursor T00BC11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A3165SolPilCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00BC11_A3165SolPilCod[0] < A3165SolPilCod ) ) && ( GXutil.strcmp(T00BC11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00BC11_A3165SolPilCod[0] > A3165SolPilCod ) ) && ( GXutil.strcmp(T00BC11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3165SolPilCod = T00BC11_A3165SolPilCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
            RcdFound463 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound463 = (short)(0) ;
      /* Using cursor T00BC12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A3165SolPilCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T00BC12_A3165SolPilCod[0] > A3165SolPilCod ) ) && ( GXutil.strcmp(T00BC12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T00BC12_A3165SolPilCod[0] < A3165SolPilCod ) ) && ( GXutil.strcmp(T00BC12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3165SolPilCod = T00BC12_A3165SolPilCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
            RcdFound463 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyBC463( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3182SolPilUlin = O3182SolPilUlin ;
         n3182SolPilUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
         GX_FocusControl = edtSolPilCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertBC463( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound463 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3165SolPilCod != Z3165SolPilCod ) )
            {
               A3165SolPilCod = Z3165SolPilCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3182SolPilUlin = O3182SolPilUlin ;
               n3182SolPilUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSolPilCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3182SolPilUlin = O3182SolPilUlin ;
               n3182SolPilUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
               updateBC463( ) ;
               GX_FocusControl = edtSolPilCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3165SolPilCod != Z3165SolPilCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3182SolPilUlin = O3182SolPilUlin ;
               n3182SolPilUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
               GX_FocusControl = edtSolPilCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertBC463( ) ;
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
                  A3182SolPilUlin = O3182SolPilUlin ;
                  n3182SolPilUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
                  GX_FocusControl = edtSolPilCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertBC463( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3165SolPilCod != Z3165SolPilCod ) )
      {
         A3165SolPilCod = Z3165SolPilCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3182SolPilUlin = O3182SolPilUlin ;
         n3182SolPilUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSolPilCod_Internalname ;
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
      getKeyBC463( ) ;
      if ( RcdFound463 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3165SolPilCod != Z3165SolPilCod ) )
         {
            A3165SolPilCod = Z3165SolPilCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3165SolPilCod != Z3165SolPilCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpillin");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_BC0( ) ;
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
      if ( RcdFound463 == 0 )
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
      scanStartBC463( ) ;
      if ( RcdFound463 == 0 )
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
      scanEndBC463( ) ;
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
      if ( RcdFound463 == 0 )
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
      if ( RcdFound463 == 0 )
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
      scanStartBC463( ) ;
      if ( RcdFound463 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound463 != 0 )
         {
            scanNextBC463( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndBC463( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyBC463( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00BC4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPILLI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z129BarCod != T00BC4_A129BarCod[0] ) || ( Z132BarCodReo != T00BC4_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T00BC4_A130BarCodPar[0]) != 0 ) || ( GXutil.strcmp(Z3166SolPilMat, T00BC4_A3166SolPilMat[0]) != 0 ) || ( GXutil.strcmp(Z3167SolPilSer, T00BC4_A3167SolPilSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3168SolPilTip != T00BC4_A3168SolPilTip[0] ) || ( GXutil.strcmp(Z3169SolPilDisN, T00BC4_A3169SolPilDisN[0]) != 0 ) || ( GXutil.strcmp(Z3170SolPilNom, T00BC4_A3170SolPilNom[0]) != 0 ) || ( Z3171SolPilNum != T00BC4_A3171SolPilNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z3172SolPilFec), GXutil.resetTime(T00BC4_A3172SolPilFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3173SolPilCliC != T00BC4_A3173SolPilCliC[0] ) || ( GXutil.strcmp(Z3174SolPilCliN, T00BC4_A3174SolPilCliN[0]) != 0 ) || ( GXutil.strcmp(Z3175SolPilMB, T00BC4_A3175SolPilMB[0]) != 0 ) || ( GXutil.strcmp(Z3176SolPilB, T00BC4_A3176SolPilB[0]) != 0 ) || ( GXutil.strcmp(Z3177SolPilMd, T00BC4_A3177SolPilMd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3178SolPilM, T00BC4_A3178SolPilM[0]) != 0 ) || ( GXutil.strcmp(Z3179SolPilMM, T00BC4_A3179SolPilMM[0]) != 0 ) || ( GXutil.strcmp(Z3180SolPilNor, T00BC4_A3180SolPilNor[0]) != 0 ) || ( GXutil.strcmp(Z3181SolPilMaq, T00BC4_A3181SolPilMaq[0]) != 0 ) || ( Z3182SolPilUlin != T00BC4_A3182SolPilUlin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3183SolPilRef, T00BC4_A3183SolPilRef[0]) != 0 ) || ( GXutil.strcmp(Z3184SolPilGra, T00BC4_A3184SolPilGra[0]) != 0 ) || ( GXutil.strcmp(Z11798SolPilRqMn, T00BC4_A11798SolPilRqMn[0]) != 0 ) || ( Z11799SolPilSt != T00BC4_A11799SolPilSt[0] ) || ( GXutil.strcmp(Z11868SolPilMtdo, T00BC4_A11868SolPilMtdo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11869SolPilRev, T00BC4_A11869SolPilRev[0]) != 0 ) || ( Z652OpeCod != T00BC4_A652OpeCod[0] ) )
         {
            if ( Z129BarCod != T00BC4_A129BarCod[0] )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T00BC4_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T00BC4_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T00BC4_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T00BC4_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T00BC4_A130BarCodPar[0]);
            }
            if ( GXutil.strcmp(Z3166SolPilMat, T00BC4_A3166SolPilMat[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilMat");
               GXutil.writeLogRaw("Old: ",Z3166SolPilMat);
               GXutil.writeLogRaw("Current: ",T00BC4_A3166SolPilMat[0]);
            }
            if ( GXutil.strcmp(Z3167SolPilSer, T00BC4_A3167SolPilSer[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilSer");
               GXutil.writeLogRaw("Old: ",Z3167SolPilSer);
               GXutil.writeLogRaw("Current: ",T00BC4_A3167SolPilSer[0]);
            }
            if ( Z3168SolPilTip != T00BC4_A3168SolPilTip[0] )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilTip");
               GXutil.writeLogRaw("Old: ",Z3168SolPilTip);
               GXutil.writeLogRaw("Current: ",T00BC4_A3168SolPilTip[0]);
            }
            if ( GXutil.strcmp(Z3169SolPilDisN, T00BC4_A3169SolPilDisN[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilDisN");
               GXutil.writeLogRaw("Old: ",Z3169SolPilDisN);
               GXutil.writeLogRaw("Current: ",T00BC4_A3169SolPilDisN[0]);
            }
            if ( GXutil.strcmp(Z3170SolPilNom, T00BC4_A3170SolPilNom[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilNom");
               GXutil.writeLogRaw("Old: ",Z3170SolPilNom);
               GXutil.writeLogRaw("Current: ",T00BC4_A3170SolPilNom[0]);
            }
            if ( Z3171SolPilNum != T00BC4_A3171SolPilNum[0] )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilNum");
               GXutil.writeLogRaw("Old: ",Z3171SolPilNum);
               GXutil.writeLogRaw("Current: ",T00BC4_A3171SolPilNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3172SolPilFec), GXutil.resetTime(T00BC4_A3172SolPilFec[0])) ) )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilFec");
               GXutil.writeLogRaw("Old: ",Z3172SolPilFec);
               GXutil.writeLogRaw("Current: ",T00BC4_A3172SolPilFec[0]);
            }
            if ( Z3173SolPilCliC != T00BC4_A3173SolPilCliC[0] )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilCliC");
               GXutil.writeLogRaw("Old: ",Z3173SolPilCliC);
               GXutil.writeLogRaw("Current: ",T00BC4_A3173SolPilCliC[0]);
            }
            if ( GXutil.strcmp(Z3174SolPilCliN, T00BC4_A3174SolPilCliN[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilCliN");
               GXutil.writeLogRaw("Old: ",Z3174SolPilCliN);
               GXutil.writeLogRaw("Current: ",T00BC4_A3174SolPilCliN[0]);
            }
            if ( GXutil.strcmp(Z3175SolPilMB, T00BC4_A3175SolPilMB[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilMB");
               GXutil.writeLogRaw("Old: ",Z3175SolPilMB);
               GXutil.writeLogRaw("Current: ",T00BC4_A3175SolPilMB[0]);
            }
            if ( GXutil.strcmp(Z3176SolPilB, T00BC4_A3176SolPilB[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilB");
               GXutil.writeLogRaw("Old: ",Z3176SolPilB);
               GXutil.writeLogRaw("Current: ",T00BC4_A3176SolPilB[0]);
            }
            if ( GXutil.strcmp(Z3177SolPilMd, T00BC4_A3177SolPilMd[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilMd");
               GXutil.writeLogRaw("Old: ",Z3177SolPilMd);
               GXutil.writeLogRaw("Current: ",T00BC4_A3177SolPilMd[0]);
            }
            if ( GXutil.strcmp(Z3178SolPilM, T00BC4_A3178SolPilM[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilM");
               GXutil.writeLogRaw("Old: ",Z3178SolPilM);
               GXutil.writeLogRaw("Current: ",T00BC4_A3178SolPilM[0]);
            }
            if ( GXutil.strcmp(Z3179SolPilMM, T00BC4_A3179SolPilMM[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilMM");
               GXutil.writeLogRaw("Old: ",Z3179SolPilMM);
               GXutil.writeLogRaw("Current: ",T00BC4_A3179SolPilMM[0]);
            }
            if ( GXutil.strcmp(Z3180SolPilNor, T00BC4_A3180SolPilNor[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilNor");
               GXutil.writeLogRaw("Old: ",Z3180SolPilNor);
               GXutil.writeLogRaw("Current: ",T00BC4_A3180SolPilNor[0]);
            }
            if ( GXutil.strcmp(Z3181SolPilMaq, T00BC4_A3181SolPilMaq[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilMaq");
               GXutil.writeLogRaw("Old: ",Z3181SolPilMaq);
               GXutil.writeLogRaw("Current: ",T00BC4_A3181SolPilMaq[0]);
            }
            if ( Z3182SolPilUlin != T00BC4_A3182SolPilUlin[0] )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilUlin");
               GXutil.writeLogRaw("Old: ",Z3182SolPilUlin);
               GXutil.writeLogRaw("Current: ",T00BC4_A3182SolPilUlin[0]);
            }
            if ( GXutil.strcmp(Z3183SolPilRef, T00BC4_A3183SolPilRef[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilRef");
               GXutil.writeLogRaw("Old: ",Z3183SolPilRef);
               GXutil.writeLogRaw("Current: ",T00BC4_A3183SolPilRef[0]);
            }
            if ( GXutil.strcmp(Z3184SolPilGra, T00BC4_A3184SolPilGra[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilGra");
               GXutil.writeLogRaw("Old: ",Z3184SolPilGra);
               GXutil.writeLogRaw("Current: ",T00BC4_A3184SolPilGra[0]);
            }
            if ( GXutil.strcmp(Z11798SolPilRqMn, T00BC4_A11798SolPilRqMn[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilRqMn");
               GXutil.writeLogRaw("Old: ",Z11798SolPilRqMn);
               GXutil.writeLogRaw("Current: ",T00BC4_A11798SolPilRqMn[0]);
            }
            if ( Z11799SolPilSt != T00BC4_A11799SolPilSt[0] )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilSt");
               GXutil.writeLogRaw("Old: ",Z11799SolPilSt);
               GXutil.writeLogRaw("Current: ",T00BC4_A11799SolPilSt[0]);
            }
            if ( GXutil.strcmp(Z11868SolPilMtdo, T00BC4_A11868SolPilMtdo[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilMtdo");
               GXutil.writeLogRaw("Old: ",Z11868SolPilMtdo);
               GXutil.writeLogRaw("Current: ",T00BC4_A11868SolPilMtdo[0]);
            }
            if ( GXutil.strcmp(Z11869SolPilRev, T00BC4_A11869SolPilRev[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilRev");
               GXutil.writeLogRaw("Old: ",Z11869SolPilRev);
               GXutil.writeLogRaw("Current: ",T00BC4_A11869SolPilRev[0]);
            }
            if ( Z652OpeCod != T00BC4_A652OpeCod[0] )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T00BC4_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPILLI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertBC463( )
   {
      beforeValidateBC463( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBC463( ) ;
      }
      if ( AnyError == 0 )
      {
         zmBC463( 0) ;
         checkOptimisticConcurrencyBC463( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmBC463( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertBC463( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BC13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A3165SolPilCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n3166SolPilMat), A3166SolPilMat, Boolean.valueOf(n3167SolPilSer), A3167SolPilSer, Boolean.valueOf(n3168SolPilTip), Short.valueOf(A3168SolPilTip), Boolean.valueOf(n3169SolPilDisN), A3169SolPilDisN, Boolean.valueOf(n3170SolPilNom), A3170SolPilNom, Boolean.valueOf(n3171SolPilNum), Integer.valueOf(A3171SolPilNum), Boolean.valueOf(n3172SolPilFec), A3172SolPilFec, Boolean.valueOf(n3173SolPilCliC), Integer.valueOf(A3173SolPilCliC), Boolean.valueOf(n3174SolPilCliN), A3174SolPilCliN, Boolean.valueOf(n3175SolPilMB), A3175SolPilMB, Boolean.valueOf(n3176SolPilB), A3176SolPilB, Boolean.valueOf(n3177SolPilMd), A3177SolPilMd, Boolean.valueOf(n3178SolPilM), A3178SolPilM, Boolean.valueOf(n3179SolPilMM), A3179SolPilMM, Boolean.valueOf(n3180SolPilNor), A3180SolPilNor, Boolean.valueOf(n3181SolPilMaq), A3181SolPilMaq, Boolean.valueOf(n3182SolPilUlin), Byte.valueOf(A3182SolPilUlin), Boolean.valueOf(n3183SolPilRef), A3183SolPilRef, Boolean.valueOf(n3184SolPilGra), A3184SolPilGra, Boolean.valueOf(n11798SolPilRqMn), A11798SolPilRqMn, Boolean.valueOf(n11799SolPilSt), Byte.valueOf(A11799SolPilSt), Boolean.valueOf(n11868SolPilMtdo), A11868SolPilMtdo, Boolean.valueOf(n11869SolPilRev), A11869SolPilRev, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPILLI");
                  if ( (pr_default.getStatus(11) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( GXutil.strcmp(A3184SolPilGra, " ") != 0 ) && true /* Level */ && true /* After */ )
                     {
                        GXv_char16[0] = A396EmprCod ;
                        GXv_int12[0] = A3165SolPilCod ;
                        GXv_char13[0] = A3184SolPilGra ;
                        new app.pgradopilling(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_char13) ;
                        tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
                        tpillin_impl.this.A3165SolPilCod = GXv_int12[0] ;
                        tpillin_impl.this.A3184SolPilGra = GXv_char13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", A3184SolPilGra);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelBC463( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionBC0( ) ;
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
            loadBC463( ) ;
         }
         endLevelBC463( ) ;
      }
      closeExtendedTableCursorsBC463( ) ;
   }

   public void updateBC463( )
   {
      beforeValidateBC463( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBC463( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyBC463( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmBC463( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateBC463( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BC14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n3166SolPilMat), A3166SolPilMat, Boolean.valueOf(n3167SolPilSer), A3167SolPilSer, Boolean.valueOf(n3168SolPilTip), Short.valueOf(A3168SolPilTip), Boolean.valueOf(n3169SolPilDisN), A3169SolPilDisN, Boolean.valueOf(n3170SolPilNom), A3170SolPilNom, Boolean.valueOf(n3171SolPilNum), Integer.valueOf(A3171SolPilNum), Boolean.valueOf(n3172SolPilFec), A3172SolPilFec, Boolean.valueOf(n3173SolPilCliC), Integer.valueOf(A3173SolPilCliC), Boolean.valueOf(n3174SolPilCliN), A3174SolPilCliN, Boolean.valueOf(n3175SolPilMB), A3175SolPilMB, Boolean.valueOf(n3176SolPilB), A3176SolPilB, Boolean.valueOf(n3177SolPilMd), A3177SolPilMd, Boolean.valueOf(n3178SolPilM), A3178SolPilM, Boolean.valueOf(n3179SolPilMM), A3179SolPilMM, Boolean.valueOf(n3180SolPilNor), A3180SolPilNor, Boolean.valueOf(n3181SolPilMaq), A3181SolPilMaq, Boolean.valueOf(n3182SolPilUlin), Byte.valueOf(A3182SolPilUlin), Boolean.valueOf(n3183SolPilRef), A3183SolPilRef, Boolean.valueOf(n3184SolPilGra), A3184SolPilGra, Boolean.valueOf(n11798SolPilRqMn), A11798SolPilRqMn, Boolean.valueOf(n11799SolPilSt), Byte.valueOf(A11799SolPilSt), Boolean.valueOf(n11868SolPilMtdo), A11868SolPilMtdo, Boolean.valueOf(n11869SolPilRev), A11869SolPilRev, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A3165SolPilCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPILLI");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPILLI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateBC463( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelBC463( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionBC0( ) ;
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
         endLevelBC463( ) ;
      }
      closeExtendedTableCursorsBC463( ) ;
   }

   public void deferredUpdateBC463( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateBC463( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyBC463( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsBC463( ) ;
         afterConfirmBC463( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteBC463( ) ;
            if ( AnyError == 0 )
            {
               A3182SolPilUlin = O3182SolPilUlin ;
               n3182SolPilUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
               scanStartBC464( ) ;
               while ( RcdFound464 != 0 )
               {
                  getByPrimaryKeyBC464( ) ;
                  deleteBC464( ) ;
                  scanNextBC464( ) ;
                  O3182SolPilUlin = A3182SolPilUlin ;
                  n3182SolPilUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
               }
               scanEndBC464( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BC15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPILLI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound463 == 0 )
                        {
                           initAllBC463( ) ;
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
                        resetCaptionBC0( ) ;
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
      sMode463 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelBC463( ) ;
      Gx_mode = sMode463 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsBC463( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( ! (0==A3165SolPilCod) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLPILCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolPilCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  && (0==A3165SolPilCod) )
         {
            GXv_int12[0] = A3165SolPilCod ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PILLIN", ""), GXv_int12) ;
            tpillin_impl.this.A3165SolPilCod = GXv_int12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
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
            GXv_int7[0] = A3173SolPilCliC ;
            GXv_char11[0] = A3166SolPilMat ;
            GXv_int15[0] = A3168SolPilTip ;
            GXv_char10[0] = A3167SolPilSer ;
            GXv_char9[0] = A3169SolPilDisN ;
            GXv_char3[0] = A3170SolPilNom ;
            GXv_int5[0] = A3171SolPilNum ;
            GXv_char2[0] = A3174SolPilCliN ;
            GXv_int14[0] = (short)(0) ;
            GXv_int8[0] = (short)(0) ;
            GXv_char1[0] = A3183SolPilRef ;
            new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
            tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
            tpillin_impl.this.A129BarCod = GXv_int12[0] ;
            tpillin_impl.this.A132BarCodReo = GXv_int17[0] ;
            tpillin_impl.this.A130BarCodPar = GXv_char13[0] ;
            tpillin_impl.this.A3173SolPilCliC = GXv_int7[0] ;
            tpillin_impl.this.A3166SolPilMat = GXv_char11[0] ;
            tpillin_impl.this.A3168SolPilTip = GXv_int15[0] ;
            tpillin_impl.this.A3167SolPilSer = GXv_char10[0] ;
            tpillin_impl.this.A3169SolPilDisN = GXv_char9[0] ;
            tpillin_impl.this.A3170SolPilNom = GXv_char3[0] ;
            tpillin_impl.this.A3171SolPilNum = GXv_int5[0] ;
            tpillin_impl.this.A3174SolPilCliN = GXv_char2[0] ;
            tpillin_impl.this.A3183SolPilRef = GXv_char1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3173SolPilCliC), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", A3166SolPilMat);
            httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3168SolPilTip), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", A3167SolPilSer);
            httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", A3169SolPilDisN);
            httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", A3170SolPilNom);
            httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3171SolPilNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", A3174SolPilCliN);
            httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", A3183SolPilRef);
         }
         if ( true /* Level */ && true /* After */ && isIns( )  )
         {
            GXv_char16[0] = A396EmprCod ;
            GXv_int12[0] = A129BarCod ;
            GXv_int17[0] = A132BarCodReo ;
            GXv_char13[0] = A130BarCodPar ;
            GXv_int7[0] = AV41FlagCal ;
            new app.pctrpil(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
            tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
            tpillin_impl.this.A129BarCod = GXv_int12[0] ;
            tpillin_impl.this.A132BarCodReo = GXv_int17[0] ;
            tpillin_impl.this.A130BarCodPar = GXv_char13[0] ;
            tpillin_impl.this.AV41FlagCal = GXv_int7[0] ;
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
         if ( true /* Level */ && true /* After */ && ( AV56FlagHdr == 0 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && true /* After */ && ( AV56FlagHdr == 0 ) && isUpd( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
         }
         /* Using cursor T00BC16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T00BC16_A653OpeNom[0] ;
         n653OpeNom = T00BC16_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevelBC464( )
   {
      s3182SolPilUlin = O3182SolPilUlin ;
      n3182SolPilUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      nGXsfl_155_idx = 0 ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         readRowBC464( ) ;
         if ( ( nRcdExists_464 != 0 ) || ( nIsMod_464 != 0 ) )
         {
            standaloneNotModalBC464( ) ;
            getKeyBC464( ) ;
            if ( ( nRcdExists_464 == 0 ) && ( nRcdDeleted_464 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertBC464( ) ;
            }
            else
            {
               if ( RcdFound464 != 0 )
               {
                  if ( ( nRcdDeleted_464 != 0 ) && ( nRcdExists_464 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteBC464( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_464 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateBC464( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_464 == 0 )
                  {
                     GXCCtl = "SOLPILLIN_" + sGXsfl_155_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolPilLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3182SolPilUlin = A3182SolPilUlin ;
            n3182SolPilUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_464_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolPilLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3185SolPilLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolPilObs_Internalname, GXutil.rtrim( A3186SolPilObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3185SolPilLin_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( Z3185SolPilLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3186SolPilObs_"+sGXsfl_155_idx, GXutil.rtrim( Z3186SolPilObs)) ;
         httpContext.changePostValue( "nRcdDeleted_464_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_464_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_464_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_464 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_464_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_464_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLPILLIN_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolPilLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLPILOBS_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolPilObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllBC464( ) ;
      if ( AnyError != 0 )
      {
         O3182SolPilUlin = s3182SolPilUlin ;
         n3182SolPilUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      }
      nRcdExists_464 = (short)(0) ;
      nIsMod_464 = (short)(0) ;
      nRcdDeleted_464 = (short)(0) ;
   }

   public void processLevelBC463( )
   {
      /* Save parent mode. */
      sMode463 = Gx_mode ;
      processNestedLevelBC464( ) ;
      if ( AnyError != 0 )
      {
         O3182SolPilUlin = s3182SolPilUlin ;
         n3182SolPilUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode463 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00BC17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n3182SolPilUlin), Byte.valueOf(A3182SolPilUlin), A396EmprCod, Integer.valueOf(A3165SolPilCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPILLI");
   }

   public void endLevelBC463( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteBC463( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpillin");
         if ( AnyError == 0 )
         {
            confirmValuesBC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpillin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartBC463( )
   {
      /* Scan By routine */
      /* Using cursor T00BC18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound463 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound463 = (short)(1) ;
         A3165SolPilCod = T00BC18_A3165SolPilCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextBC463( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound463 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound463 = (short)(1) ;
         A3165SolPilCod = T00BC18_A3165SolPilCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
      }
   }

   public void scanEndBC463( )
   {
      pr_default.close(16);
   }

   public void afterConfirmBC463( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertBC463( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateBC463( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteBC463( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteBC463( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateBC463( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesBC463( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolPilCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtSolPilMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilMat_Enabled), 5, 0), true);
      edtSolPilSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilSer_Enabled), 5, 0), true);
      edtSolPilTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilTip_Enabled), 5, 0), true);
      edtSolPilDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilDisN_Enabled), 5, 0), true);
      edtSolPilNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilNom_Enabled), 5, 0), true);
      edtSolPilNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilNum_Enabled), 5, 0), true);
      edtSolPilFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilFec_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtSolPilCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilCliC_Enabled), 5, 0), true);
      edtSolPilCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilCliN_Enabled), 5, 0), true);
      edtSolPilMB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilMB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilMB_Enabled), 5, 0), true);
      edtSolPilB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilB_Enabled), 5, 0), true);
      edtSolPilMd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilMd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilMd_Enabled), 5, 0), true);
      edtSolPilM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilM_Enabled), 5, 0), true);
      edtSolPilMM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilMM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilMM_Enabled), 5, 0), true);
      edtSolPilNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilNor_Enabled), 5, 0), true);
      edtSolPilMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilMaq_Enabled), 5, 0), true);
      edtSolPilUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilUlin_Enabled), 5, 0), true);
      edtSolPilRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilRef_Enabled), 5, 0), true);
      edtSolPilGra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilGra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilGra_Enabled), 5, 0), true);
   }

   public void zmBC464( int GX_JID )
   {
      if ( ( GX_JID == 39 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3186SolPilObs = T00BC3_A3186SolPilObs[0] ;
         }
         else
         {
            Z3186SolPilObs = A3186SolPilObs ;
         }
      }
      if ( GX_JID == -39 )
      {
         Z3165SolPilCod = A3165SolPilCod ;
         Z3185SolPilLin = A3185SolPilLin ;
         Z3186SolPilObs = A3186SolPilObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalBC464( )
   {
      edtSolPilUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilUlin_Enabled), 5, 0), true);
      edtSolPilUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilUlin_Enabled), 5, 0), true);
   }

   public void standaloneModalBC464( )
   {
      if ( isIns( )  )
      {
         A3182SolPilUlin = (byte)(O3182SolPilUlin+1) ;
         n3182SolPilUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3185SolPilLin = A3182SolPilUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSolPilLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolPilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilLin_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      }
      else
      {
         edtSolPilLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolPilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilLin_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      }
   }

   public void loadBC464( )
   {
      /* Using cursor T00BC19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod), Byte.valueOf(A3185SolPilLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound464 = (short)(1) ;
         A3186SolPilObs = T00BC19_A3186SolPilObs[0] ;
         n3186SolPilObs = T00BC19_n3186SolPilObs[0] ;
         zmBC464( -39) ;
      }
      pr_default.close(17);
      onLoadActionsBC464( ) ;
   }

   public void onLoadActionsBC464( )
   {
   }

   public void checkExtendedTableBC464( )
   {
      nIsDirty_464 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalBC464( ) ;
   }

   public void closeExtendedTableCursorsBC464( )
   {
   }

   public void enableDisableBC464( )
   {
   }

   public void getKeyBC464( )
   {
      /* Using cursor T00BC20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod), Byte.valueOf(A3185SolPilLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound464 = (short)(1) ;
      }
      else
      {
         RcdFound464 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKeyBC464( )
   {
      /* Using cursor T00BC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod), Byte.valueOf(A3185SolPilLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00BC3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmBC464( 39) ;
         RcdFound464 = (short)(1) ;
         initializeNonKeyBC464( ) ;
         A3185SolPilLin = T00BC3_A3185SolPilLin[0] ;
         A3186SolPilObs = T00BC3_A3186SolPilObs[0] ;
         n3186SolPilObs = T00BC3_n3186SolPilObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3165SolPilCod = A3165SolPilCod ;
         Z3185SolPilLin = A3185SolPilLin ;
         sMode464 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalBC464( ) ;
         loadBC464( ) ;
         Gx_mode = sMode464 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound464 = (short)(0) ;
         initializeNonKeyBC464( ) ;
         sMode464 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalBC464( ) ;
         Gx_mode = sMode464 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesBC464( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyBC464( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00BC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod), Byte.valueOf(A3185SolPilLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPILLI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3186SolPilObs, T00BC2_A3186SolPilObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3186SolPilObs, T00BC2_A3186SolPilObs[0]) != 0 )
            {
               GXutil.writeLogln("tpillin:[seudo value changed for attri]"+"SolPilObs");
               GXutil.writeLogRaw("Old: ",Z3186SolPilObs);
               GXutil.writeLogRaw("Current: ",T00BC2_A3186SolPilObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPILLI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertBC464( )
   {
      beforeValidateBC464( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBC464( ) ;
      }
      if ( AnyError == 0 )
      {
         zmBC464( 0) ;
         checkOptimisticConcurrencyBC464( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmBC464( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertBC464( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BC21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A3165SolPilCod), Byte.valueOf(A3185SolPilLin), Boolean.valueOf(n3186SolPilObs), A3186SolPilObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPILLI");
                  if ( (pr_default.getStatus(19) == 1) )
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
            loadBC464( ) ;
         }
         endLevelBC464( ) ;
      }
      closeExtendedTableCursorsBC464( ) ;
   }

   public void updateBC464( )
   {
      beforeValidateBC464( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBC464( ) ;
      }
      if ( ( nIsMod_464 != 0 ) || ( nIsDirty_464 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyBC464( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmBC464( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateBC464( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00BC22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n3186SolPilObs), A3186SolPilObs, A396EmprCod, Integer.valueOf(A3165SolPilCod), Byte.valueOf(A3185SolPilLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPILLI");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPILLI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateBC464( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyBC464( ) ;
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
            endLevelBC464( ) ;
         }
      }
      closeExtendedTableCursorsBC464( ) ;
   }

   public void deferredUpdateBC464( )
   {
   }

   public void deleteBC464( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateBC464( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyBC464( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsBC464( ) ;
         afterConfirmBC464( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteBC464( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00BC23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod), Byte.valueOf(A3185SolPilLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPILLI");
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
      sMode464 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelBC464( ) ;
      Gx_mode = sMode464 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsBC464( )
   {
      standaloneModalBC464( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelBC464( )
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

   public void scanStartBC464( )
   {
      /* Scan By routine */
      /* Using cursor T00BC24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A3165SolPilCod)});
      RcdFound464 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound464 = (short)(1) ;
         A3185SolPilLin = T00BC24_A3185SolPilLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextBC464( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound464 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound464 = (short)(1) ;
         A3185SolPilLin = T00BC24_A3185SolPilLin[0] ;
      }
   }

   public void scanEndBC464( )
   {
      pr_default.close(22);
   }

   public void afterConfirmBC464( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertBC464( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateBC464( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteBC464( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteBC464( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateBC464( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesBC464( )
   {
      edtSolPilLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilLin_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      edtSolPilObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilObs_Enabled), 5, 0), !bGXsfl_155_Refreshing);
   }

   public void send_integrity_lvl_hashesBC464( )
   {
   }

   public void send_integrity_lvl_hashesBC463( )
   {
   }

   public void subsflControlProps_155464( )
   {
      edtavnRcdDeleted_464_Internalname = "vNRCDDELETED_464_"+sGXsfl_155_idx ;
      edtSolPilLin_Internalname = "SOLPILLIN_"+sGXsfl_155_idx ;
      edtSolPilObs_Internalname = "SOLPILOBS_"+sGXsfl_155_idx ;
   }

   public void subsflControlProps_fel_155464( )
   {
      edtavnRcdDeleted_464_Internalname = "vNRCDDELETED_464_"+sGXsfl_155_fel_idx ;
      edtSolPilLin_Internalname = "SOLPILLIN_"+sGXsfl_155_fel_idx ;
      edtSolPilObs_Internalname = "SOLPILOBS_"+sGXsfl_155_fel_idx ;
   }

   public void addRowBC464( )
   {
      nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_155464( ) ;
      sendRowBC464( ) ;
   }

   public void sendRowBC464( )
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
         if ( ((int)((nGXsfl_155_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_464_" + sGXsfl_155_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 156,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_464_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_464_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_464), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_464), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_464_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_464_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_464_" + sGXsfl_155_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolPilLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3185SolPilLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3185SolPilLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,157);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolPilLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolPilLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_464_" + sGXsfl_155_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolPilObs_Internalname,GXutil.rtrim( A3186SolPilObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,158);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolPilObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolPilObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesBC464( ) ;
      GXCCtl = "Z3185SolPilLin_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3185SolPilLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3186SolPilObs_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3186SolPilObs));
      GXCCtl = "nRcdDeleted_464_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_464_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_464_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_464, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_464_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_464_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLPILLIN_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolPilLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLPILOBS_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolPilObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowBC464( )
   {
      nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_155464( ) ;
      edtavnRcdDeleted_464_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_464_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolPilLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLPILLIN_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolPilObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLPILOBS_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_464_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_464_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_464");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_464_Internalname ;
         wbErr = true ;
         nRcdDeleted_464 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_464 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_464_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolPilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolPilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "SOLPILLIN_" + sGXsfl_155_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolPilLin_Internalname ;
         wbErr = true ;
         A3185SolPilLin = (byte)(0) ;
      }
      else
      {
         A3185SolPilLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolPilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3186SolPilObs = httpContext.cgiGet( edtSolPilObs_Internalname) ;
      n3186SolPilObs = false ;
      GXCCtl = "Z3185SolPilLin_" + sGXsfl_155_idx ;
      Z3185SolPilLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3186SolPilObs_" + sGXsfl_155_idx ;
      Z3186SolPilObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_464_" + sGXsfl_155_idx ;
      nRcdDeleted_464 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_464_" + sGXsfl_155_idx ;
      nRcdExists_464 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_464_" + sGXsfl_155_idx ;
      nIsMod_464 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtSolPilLin_Enabled = edtSolPilLin_Enabled ;
   }

   public void confirmValuesBC0( )
   {
      nGXsfl_155_idx = 0 ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_155464( ) ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
         sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_155464( ) ;
         httpContext.changePostValue( "Z3185SolPilLin_"+sGXsfl_155_idx, httpContext.cgiGet( "ZT_"+"Z3185SolPilLin_"+sGXsfl_155_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3185SolPilLin_"+sGXsfl_155_idx) ;
         httpContext.changePostValue( "Z3186SolPilObs_"+sGXsfl_155_idx, httpContext.cgiGet( "ZT_"+"Z3186SolPilObs_"+sGXsfl_155_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3186SolPilObs_"+sGXsfl_155_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpillin", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPILLIN");
      forbiddenHiddens.add("SolPilRqMn", GXutil.rtrim( localUtil.format( A11798SolPilRqMn, "")));
      forbiddenHiddens.add("SolPilSt", localUtil.format( DecimalUtil.doubleToDec(A11799SolPilSt), "9"));
      forbiddenHiddens.add("SolPilMtdo", GXutil.rtrim( localUtil.format( A11868SolPilMtdo, "")));
      forbiddenHiddens.add("SolPilRev", GXutil.rtrim( localUtil.format( A11869SolPilRev, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpillin:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3165SolPilCod", GXutil.ltrim( localUtil.ntoc( Z3165SolPilCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3166SolPilMat", GXutil.rtrim( Z3166SolPilMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3167SolPilSer", GXutil.rtrim( Z3167SolPilSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3168SolPilTip", GXutil.ltrim( localUtil.ntoc( Z3168SolPilTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3169SolPilDisN", GXutil.rtrim( Z3169SolPilDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3170SolPilNom", GXutil.rtrim( Z3170SolPilNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3171SolPilNum", GXutil.ltrim( localUtil.ntoc( Z3171SolPilNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3172SolPilFec", localUtil.dtoc( Z3172SolPilFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3173SolPilCliC", GXutil.ltrim( localUtil.ntoc( Z3173SolPilCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3174SolPilCliN", GXutil.rtrim( Z3174SolPilCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3175SolPilMB", GXutil.rtrim( Z3175SolPilMB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3176SolPilB", GXutil.rtrim( Z3176SolPilB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3177SolPilMd", GXutil.rtrim( Z3177SolPilMd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3178SolPilM", GXutil.rtrim( Z3178SolPilM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3179SolPilMM", GXutil.rtrim( Z3179SolPilMM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3180SolPilNor", GXutil.rtrim( Z3180SolPilNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3181SolPilMaq", GXutil.rtrim( Z3181SolPilMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3182SolPilUlin", GXutil.ltrim( localUtil.ntoc( Z3182SolPilUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3183SolPilRef", GXutil.rtrim( Z3183SolPilRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3184SolPilGra", GXutil.rtrim( Z3184SolPilGra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11798SolPilRqMn", GXutil.rtrim( Z11798SolPilRqMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11799SolPilSt", GXutil.ltrim( localUtil.ntoc( Z11799SolPilSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11868SolPilMtdo", GXutil.rtrim( Z11868SolPilMtdo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11869SolPilRev", GXutil.rtrim( Z11869SolPilRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3182SolPilUlin", GXutil.ltrim( localUtil.ntoc( O3182SolPilUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_155", GXutil.ltrim( localUtil.ntoc( nGXsfl_155_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCAL", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLPILST", GXutil.ltrim( localUtil.ntoc( A11799SolPilSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLPILMTDO", GXutil.rtrim( A11868SolPilMtdo));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLPILREV", GXutil.rtrim( A11869SolPilRev));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGHDR", GXutil.ltrim( localUtil.ntoc( AV56FlagHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLPILRQMN", GXutil.rtrim( A11798SolPilRqMn));
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
      return formatLink("app.tpillin", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPILLIN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TEST DE PILLING", "") ;
   }

   public void initializeNonKeyBC463( )
   {
      AV19FlagM = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
      AV41FlagCal = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41FlagCal), 8, 0));
      AV56FlagHdr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56FlagHdr", GXutil.str( AV56FlagHdr, 1, 0));
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A3166SolPilMat = "" ;
      n3166SolPilMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", A3166SolPilMat);
      A3167SolPilSer = "" ;
      n3167SolPilSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", A3167SolPilSer);
      A3168SolPilTip = (short)(0) ;
      n3168SolPilTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3168SolPilTip), 4, 0));
      A3169SolPilDisN = "" ;
      n3169SolPilDisN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", A3169SolPilDisN);
      A3170SolPilNom = "" ;
      n3170SolPilNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", A3170SolPilNom);
      A3171SolPilNum = 0 ;
      n3171SolPilNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3171SolPilNum), 6, 0));
      A3172SolPilFec = GXutil.nullDate() ;
      n3172SolPilFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3172SolPilFec", localUtil.format(A3172SolPilFec, "99/99/99"));
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A3173SolPilCliC = 0 ;
      n3173SolPilCliC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3173SolPilCliC), 6, 0));
      A3174SolPilCliN = "" ;
      n3174SolPilCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", A3174SolPilCliN);
      A3175SolPilMB = "" ;
      n3175SolPilMB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3175SolPilMB", A3175SolPilMB);
      A3176SolPilB = "" ;
      n3176SolPilB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3176SolPilB", A3176SolPilB);
      A3177SolPilMd = "" ;
      n3177SolPilMd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3177SolPilMd", A3177SolPilMd);
      A3178SolPilM = "" ;
      n3178SolPilM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3178SolPilM", A3178SolPilM);
      A3179SolPilMM = "" ;
      n3179SolPilMM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3179SolPilMM", A3179SolPilMM);
      A3180SolPilNor = "" ;
      n3180SolPilNor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3180SolPilNor", A3180SolPilNor);
      A3181SolPilMaq = "" ;
      n3181SolPilMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", A3181SolPilMaq);
      A3182SolPilUlin = (byte)(0) ;
      n3182SolPilUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      A3183SolPilRef = "" ;
      n3183SolPilRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", A3183SolPilRef);
      A3184SolPilGra = "" ;
      n3184SolPilGra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", A3184SolPilGra);
      A11798SolPilRqMn = "" ;
      n11798SolPilRqMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11798SolPilRqMn", A11798SolPilRqMn);
      A11799SolPilSt = (byte)(1) ;
      n11799SolPilSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11799SolPilSt", GXutil.str( A11799SolPilSt, 1, 0));
      A11868SolPilMtdo = httpContext.getMessage( "NEXT MET 19", "") ;
      n11868SolPilMtdo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11868SolPilMtdo", A11868SolPilMtdo);
      A11869SolPilRev = "7200" ;
      n11869SolPilRev = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11869SolPilRev", A11869SolPilRev);
      O3182SolPilUlin = A3182SolPilUlin ;
      n3182SolPilUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z3166SolPilMat = "" ;
      Z3167SolPilSer = "" ;
      Z3168SolPilTip = (short)(0) ;
      Z3169SolPilDisN = "" ;
      Z3170SolPilNom = "" ;
      Z3171SolPilNum = 0 ;
      Z3172SolPilFec = GXutil.nullDate() ;
      Z3173SolPilCliC = 0 ;
      Z3174SolPilCliN = "" ;
      Z3175SolPilMB = "" ;
      Z3176SolPilB = "" ;
      Z3177SolPilMd = "" ;
      Z3178SolPilM = "" ;
      Z3179SolPilMM = "" ;
      Z3180SolPilNor = "" ;
      Z3181SolPilMaq = "" ;
      Z3182SolPilUlin = (byte)(0) ;
      Z3183SolPilRef = "" ;
      Z3184SolPilGra = "" ;
      Z11798SolPilRqMn = "" ;
      Z11799SolPilSt = (byte)(0) ;
      Z11868SolPilMtdo = "" ;
      Z11869SolPilRev = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAllBC463( )
   {
      A3165SolPilCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
      initializeNonKeyBC463( ) ;
   }

   public void standaloneModalInsert( )
   {
      A11799SolPilSt = i11799SolPilSt ;
      n11799SolPilSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11799SolPilSt", GXutil.str( A11799SolPilSt, 1, 0));
      A11868SolPilMtdo = i11868SolPilMtdo ;
      n11868SolPilMtdo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11868SolPilMtdo", A11868SolPilMtdo);
      A11869SolPilRev = i11869SolPilRev ;
      n11869SolPilRev = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11869SolPilRev", A11869SolPilRev);
   }

   public void initializeNonKeyBC464( )
   {
      A3186SolPilObs = "" ;
      n3186SolPilObs = false ;
      Z3186SolPilObs = "" ;
   }

   public void initAllBC464( )
   {
      A3185SolPilLin = (byte)(0) ;
      initializeNonKeyBC464( ) ;
   }

   public void standaloneModalInsertBC464( )
   {
      A3182SolPilUlin = i3182SolPilUlin ;
      n3182SolPilUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3182SolPilUlin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241512638", true, true);
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
      httpContext.AddJavascriptSource("tpillin.js", "?20268241512638", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties464( )
   {
      edtSolPilLin_Enabled = defedtSolPilLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolPilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolPilLin_Enabled), 5, 0), !bGXsfl_155_Refreshing);
   }

   public void startgridcontrol155( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_464, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_464_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3185SolPilLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolPilLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3186SolPilObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolPilObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSolPilCod_Internalname = "SOLPILCOD" ;
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
      edtSolPilMat_Internalname = "SOLPILMAT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSolPilSer_Internalname = "SOLPILSER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSolPilTip_Internalname = "SOLPILTIP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSolPilDisN_Internalname = "SOLPILDISN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSolPilNom_Internalname = "SOLPILNOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtSolPilNum_Internalname = "SOLPILNUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtSolPilFec_Internalname = "SOLPILFEC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtSolPilCliC_Internalname = "SOLPILCLIC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtSolPilCliN_Internalname = "SOLPILCLIN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtSolPilMB_Internalname = "SOLPILMB" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtSolPilB_Internalname = "SOLPILB" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtSolPilMd_Internalname = "SOLPILMD" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtSolPilM_Internalname = "SOLPILM" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtSolPilMM_Internalname = "SOLPILMM" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtSolPilNor_Internalname = "SOLPILNOR" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtSolPilMaq_Internalname = "SOLPILMAQ" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtSolPilUlin_Internalname = "SOLPILULIN" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtSolPilRef_Internalname = "SOLPILREF" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtSolPilGra_Internalname = "SOLPILGRA" ;
      edtavnRcdDeleted_464_Internalname = "vNRCDDELETED_464" ;
      edtSolPilLin_Internalname = "SOLPILLIN" ;
      edtSolPilObs_Internalname = "SOLPILOBS" ;
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
      Form.setCaption( httpContext.getMessage( "TEST DE PILLING", "") );
      edtSolPilObs_Jsonclick = "" ;
      edtSolPilLin_Jsonclick = "" ;
      edtavnRcdDeleted_464_Jsonclick = "" ;
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
      edtSolPilObs_Enabled = 1 ;
      edtSolPilLin_Enabled = 1 ;
      edtavnRcdDeleted_464_Enabled = 1 ;
      edtSolPilGra_Jsonclick = "" ;
      edtSolPilGra_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilGra_Enabled = 1 ;
      edtSolPilRef_Jsonclick = "" ;
      edtSolPilRef_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilRef_Enabled = 1 ;
      edtSolPilUlin_Jsonclick = "" ;
      edtSolPilUlin_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilUlin_Enabled = 0 ;
      edtSolPilMaq_Jsonclick = "" ;
      edtSolPilMaq_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilMaq_Enabled = 1 ;
      edtSolPilNor_Jsonclick = "" ;
      edtSolPilNor_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilNor_Enabled = 1 ;
      edtSolPilMM_Jsonclick = "" ;
      edtSolPilMM_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilMM_Enabled = 1 ;
      edtSolPilM_Jsonclick = "" ;
      edtSolPilM_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilM_Enabled = 1 ;
      edtSolPilMd_Jsonclick = "" ;
      edtSolPilMd_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilMd_Enabled = 1 ;
      edtSolPilB_Jsonclick = "" ;
      edtSolPilB_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilB_Enabled = 1 ;
      edtSolPilMB_Jsonclick = "" ;
      edtSolPilMB_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilMB_Enabled = 1 ;
      edtSolPilCliN_Jsonclick = "" ;
      edtSolPilCliN_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilCliN_Enabled = 0 ;
      edtSolPilCliC_Jsonclick = "" ;
      edtSolPilCliC_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilCliC_Enabled = 0 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtSolPilFec_Jsonclick = "" ;
      edtSolPilFec_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilFec_Enabled = 1 ;
      edtSolPilNum_Jsonclick = "" ;
      edtSolPilNum_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilNum_Enabled = 0 ;
      edtSolPilNom_Jsonclick = "" ;
      edtSolPilNom_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilNom_Enabled = 0 ;
      edtSolPilDisN_Jsonclick = "" ;
      edtSolPilDisN_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilDisN_Enabled = 0 ;
      edtSolPilTip_Jsonclick = "" ;
      edtSolPilTip_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilTip_Enabled = 0 ;
      edtSolPilSer_Jsonclick = "" ;
      edtSolPilSer_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilSer_Enabled = 0 ;
      edtSolPilMat_Jsonclick = "" ;
      edtSolPilMat_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilMat_Enabled = 0 ;
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
      edtSolPilCod_Jsonclick = "" ;
      edtSolPilCod_Backcolor = (int)(0xFFFFFF) ;
      edtSolPilCod_Enabled = 1 ;
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

   public void xc_23_BC463( )
   {
      if ( isIns( )  && (0==A3165SolPilCod) )
      {
         GXv_int12[0] = A3165SolPilCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PILLIN", ""), GXv_int12) ;
         A3165SolPilCod = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
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

   public void xc_24_BC463( String Gx_mode ,
                            String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            int A3173SolPilCliC ,
                            String A3166SolPilMat ,
                            short A3168SolPilTip ,
                            String A3167SolPilSer ,
                            String A3169SolPilDisN ,
                            String A3170SolPilNom ,
                            int A3171SolPilNum ,
                            String A3174SolPilCliN ,
                            String A3183SolPilRef )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = A3173SolPilCliC ;
         GXv_char11[0] = A3166SolPilMat ;
         GXv_int15[0] = A3168SolPilTip ;
         GXv_char10[0] = A3167SolPilSer ;
         GXv_char9[0] = A3169SolPilDisN ;
         GXv_char3[0] = A3170SolPilNom ;
         GXv_int5[0] = A3171SolPilNum ;
         GXv_char2[0] = A3174SolPilCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int8[0] = (short)(0) ;
         GXv_char1[0] = A3183SolPilRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
         A396EmprCod = GXv_char16[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int17[0] ;
         A130BarCodPar = GXv_char13[0] ;
         A3173SolPilCliC = GXv_int7[0] ;
         A3166SolPilMat = GXv_char11[0] ;
         A3168SolPilTip = GXv_int15[0] ;
         A3167SolPilSer = GXv_char10[0] ;
         A3169SolPilDisN = GXv_char9[0] ;
         A3170SolPilNom = GXv_char3[0] ;
         A3171SolPilNum = GXv_int5[0] ;
         A3174SolPilCliN = GXv_char2[0] ;
         A3183SolPilRef = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3173SolPilCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", A3166SolPilMat);
         httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3168SolPilTip), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", A3167SolPilSer);
         httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", A3169SolPilDisN);
         httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", A3170SolPilNom);
         httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3171SolPilNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", A3174SolPilCliN);
         httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", A3183SolPilRef);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3173SolPilCliC, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3166SolPilMat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3168SolPilTip, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3167SolPilSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3169SolPilDisN))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3170SolPilNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3171SolPilNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3174SolPilCliN))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3183SolPilRef))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_25_BC463( String A396EmprCod ,
                            String A3181SolPilMaq ,
                            byte AV19FlagM )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3181SolPilMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         A396EmprCod = GXv_char16[0] ;
         A3181SolPilMaq = GXv_char13[0] ;
         AV19FlagM = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", A3181SolPilMaq);
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3181SolPilMaq))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_27_BC463( String Gx_mode ,
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
         new app.pctrpil(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
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

   public void xc_29_BC463( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            byte AV56FlagHdr )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int6[0] = AV56FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int6) ;
         A396EmprCod = GXv_char16[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int17[0] ;
         A130BarCodPar = GXv_char13[0] ;
         AV56FlagHdr = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV56FlagHdr", GXutil.str( AV56FlagHdr, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV56FlagHdr, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_BC463( String A396EmprCod ,
                            int A3165SolPilCod ,
                            String A3184SolPilGra )
   {
      if ( ( GXutil.strcmp(A3184SolPilGra, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A3165SolPilCod ;
         GXv_char13[0] = A3184SolPilGra ;
         new app.pgradopilling(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_char13) ;
         A396EmprCod = GXv_char16[0] ;
         A3165SolPilCod = GXv_int12[0] ;
         A3184SolPilGra = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3165SolPilCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", A3184SolPilGra);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3165SolPilCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3184SolPilGra))+"\"") ;
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
      subsflControlProps_155464( ) ;
      while ( nGXsfl_155_idx <= nRC_GXsfl_155 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalBC464( ) ;
         standaloneModalBC464( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowBC464( ) ;
         nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
         sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_155464( ) ;
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
      /* Using cursor T00BC25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00BC25_A407EmprNom[0] ;
      n407EmprNom = T00BC25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
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

   public void valid_Solpilcod( )
   {
      n11798SolPilRqMn = false ;
      n3182SolPilUlin = false ;
      n11799SolPilSt = false ;
      n11868SolPilMtdo = false ;
      n11869SolPilRev = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( isIns( )  && ( ! (0==A3165SolPilCod) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLPILCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolPilCod_Internalname ;
      }
      if ( isIns( )  && (0==A3165SolPilCod) )
      {
         GXv_int12[0] = A3165SolPilCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PILLIN", ""), GXv_int12) ;
         tpillin_impl.this.A3165SolPilCod = GXv_int12[0] ;
         A3165SolPilCod = this.A3165SolPilCod ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", GXutil.rtrim( A3166SolPilMat));
      httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", GXutil.rtrim( A3167SolPilSer));
      httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrim( localUtil.ntoc( A3168SolPilTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", GXutil.rtrim( A3169SolPilDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", GXutil.rtrim( A3170SolPilNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrim( localUtil.ntoc( A3171SolPilNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3172SolPilFec", localUtil.format(A3172SolPilFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrim( localUtil.ntoc( A3173SolPilCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", GXutil.rtrim( A3174SolPilCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A3175SolPilMB", GXutil.rtrim( A3175SolPilMB));
      httpContext.ajax_rsp_assign_attri("", false, "A3176SolPilB", GXutil.rtrim( A3176SolPilB));
      httpContext.ajax_rsp_assign_attri("", false, "A3177SolPilMd", GXutil.rtrim( A3177SolPilMd));
      httpContext.ajax_rsp_assign_attri("", false, "A3178SolPilM", GXutil.rtrim( A3178SolPilM));
      httpContext.ajax_rsp_assign_attri("", false, "A3179SolPilMM", GXutil.rtrim( A3179SolPilMM));
      httpContext.ajax_rsp_assign_attri("", false, "A3180SolPilNor", GXutil.rtrim( A3180SolPilNor));
      httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", GXutil.rtrim( A3181SolPilMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A3182SolPilUlin", GXutil.ltrim( localUtil.ntoc( A3182SolPilUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", GXutil.rtrim( A3183SolPilRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3184SolPilGra", GXutil.rtrim( A3184SolPilGra));
      httpContext.ajax_rsp_assign_attri("", false, "A11798SolPilRqMn", GXutil.rtrim( A11798SolPilRqMn));
      httpContext.ajax_rsp_assign_attri("", false, "A11799SolPilSt", GXutil.ltrim( localUtil.ntoc( A11799SolPilSt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11868SolPilMtdo", GXutil.rtrim( A11868SolPilMtdo));
      httpContext.ajax_rsp_assign_attri("", false, "A11869SolPilRev", GXutil.rtrim( A11869SolPilRev));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3165SolPilCod", GXutil.ltrim( localUtil.ntoc( A3165SolPilCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
      httpContext.ajax_rsp_assign_attri("", false, "AV56FlagHdr", GXutil.ltrim( localUtil.ntoc( AV56FlagHdr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3166SolPilMat", GXutil.rtrim( Z3166SolPilMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3167SolPilSer", GXutil.rtrim( Z3167SolPilSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3168SolPilTip", GXutil.ltrim( localUtil.ntoc( Z3168SolPilTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3169SolPilDisN", GXutil.rtrim( Z3169SolPilDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3170SolPilNom", GXutil.rtrim( Z3170SolPilNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3171SolPilNum", GXutil.ltrim( localUtil.ntoc( Z3171SolPilNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3172SolPilFec", localUtil.format(Z3172SolPilFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3173SolPilCliC", GXutil.ltrim( localUtil.ntoc( Z3173SolPilCliC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3174SolPilCliN", GXutil.rtrim( Z3174SolPilCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3175SolPilMB", GXutil.rtrim( Z3175SolPilMB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3176SolPilB", GXutil.rtrim( Z3176SolPilB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3177SolPilMd", GXutil.rtrim( Z3177SolPilMd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3178SolPilM", GXutil.rtrim( Z3178SolPilM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3179SolPilMM", GXutil.rtrim( Z3179SolPilMM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3180SolPilNor", GXutil.rtrim( Z3180SolPilNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3181SolPilMaq", GXutil.rtrim( Z3181SolPilMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3182SolPilUlin", GXutil.ltrim( localUtil.ntoc( Z3182SolPilUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3183SolPilRef", GXutil.rtrim( Z3183SolPilRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3184SolPilGra", GXutil.rtrim( Z3184SolPilGra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11798SolPilRqMn", GXutil.rtrim( Z11798SolPilRqMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11799SolPilSt", GXutil.ltrim( localUtil.ntoc( Z11799SolPilSt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11868SolPilMtdo", GXutil.rtrim( Z11868SolPilMtdo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11869SolPilRev", GXutil.rtrim( Z11869SolPilRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3165SolPilCod", GXutil.ltrim( localUtil.ntoc( Z3165SolPilCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV41FlagCal", GXutil.ltrim( localUtil.ntoc( ZV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Gx_msg", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV56FlagHdr", GXutil.ltrim( localUtil.ntoc( ZV56FlagHdr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV19FlagM", GXutil.ltrim( localUtil.ntoc( ZV19FlagM, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3182SolPilUlin", GXutil.ltrim( localUtil.ntoc( O3182SolPilUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      n3183SolPilRef = false ;
      n3174SolPilCliN = false ;
      n3171SolPilNum = false ;
      n3170SolPilNom = false ;
      n3169SolPilDisN = false ;
      n3167SolPilSer = false ;
      n3168SolPilTip = false ;
      n3166SolPilMat = false ;
      n3173SolPilCliC = false ;
      n132BarCodReo = false ;
      n129BarCod = false ;
      n130BarCodPar = false ;
      if ( isIns( )  && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = A3173SolPilCliC ;
         GXv_char11[0] = A3166SolPilMat ;
         GXv_int15[0] = A3168SolPilTip ;
         GXv_char10[0] = A3167SolPilSer ;
         GXv_char9[0] = A3169SolPilDisN ;
         GXv_char3[0] = A3170SolPilNom ;
         GXv_int5[0] = A3171SolPilNum ;
         GXv_char2[0] = A3174SolPilCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int8[0] = (short)(0) ;
         GXv_char1[0] = A3183SolPilRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
         tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpillin_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         tpillin_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tpillin_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tpillin_impl.this.A3173SolPilCliC = GXv_int7[0] ;
         A3173SolPilCliC = this.A3173SolPilCliC ;
         tpillin_impl.this.A3166SolPilMat = GXv_char11[0] ;
         A3166SolPilMat = this.A3166SolPilMat ;
         tpillin_impl.this.A3168SolPilTip = GXv_int15[0] ;
         A3168SolPilTip = this.A3168SolPilTip ;
         tpillin_impl.this.A3167SolPilSer = GXv_char10[0] ;
         A3167SolPilSer = this.A3167SolPilSer ;
         tpillin_impl.this.A3169SolPilDisN = GXv_char9[0] ;
         A3169SolPilDisN = this.A3169SolPilDisN ;
         tpillin_impl.this.A3170SolPilNom = GXv_char3[0] ;
         A3170SolPilNom = this.A3170SolPilNom ;
         tpillin_impl.this.A3171SolPilNum = GXv_int5[0] ;
         A3171SolPilNum = this.A3171SolPilNum ;
         tpillin_impl.this.A3174SolPilCliN = GXv_char2[0] ;
         A3174SolPilCliN = this.A3174SolPilCliN ;
         tpillin_impl.this.A3183SolPilRef = GXv_char1[0] ;
         A3183SolPilRef = this.A3183SolPilRef ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = AV41FlagCal ;
         new app.pctrpil(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
         tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpillin_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         tpillin_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tpillin_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tpillin_impl.this.AV41FlagCal = GXv_int7[0] ;
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
         GXv_int6[0] = AV56FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int6) ;
         tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpillin_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         tpillin_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tpillin_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tpillin_impl.this.AV56FlagHdr = GXv_int6[0] ;
         AV56FlagHdr = this.AV56FlagHdr ;
      }
      if ( true /* Level */ && true /* After */ && ( AV56FlagHdr == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && ( AV56FlagHdr == 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
      httpContext.ajax_rsp_assign_attri("", false, "A3173SolPilCliC", GXutil.ltrim( localUtil.ntoc( A3173SolPilCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3166SolPilMat", GXutil.rtrim( A3166SolPilMat));
      httpContext.ajax_rsp_assign_attri("", false, "A3168SolPilTip", GXutil.ltrim( localUtil.ntoc( A3168SolPilTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3167SolPilSer", GXutil.rtrim( A3167SolPilSer));
      httpContext.ajax_rsp_assign_attri("", false, "A3169SolPilDisN", GXutil.rtrim( A3169SolPilDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A3170SolPilNom", GXutil.rtrim( A3170SolPilNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3171SolPilNum", GXutil.ltrim( localUtil.ntoc( A3171SolPilNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3174SolPilCliN", GXutil.rtrim( A3174SolPilCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A3183SolPilRef", GXutil.rtrim( A3183SolPilRef));
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "AV56FlagHdr", GXutil.ltrim( localUtil.ntoc( AV56FlagHdr, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T00BC16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T00BC16_A653OpeNom[0] ;
      n653OpeNom = T00BC16_n653OpeNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
   }

   public void valid_Solpilmaq( )
   {
      n3181SolPilMaq = false ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3181SolPilMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         tpillin_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpillin_impl.this.A3181SolPilMaq = GXv_char13[0] ;
         A3181SolPilMaq = this.A3181SolPilMaq ;
         tpillin_impl.this.AV19FlagM = GXv_int17[0] ;
         AV19FlagM = this.AV19FlagM ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A3181SolPilMaq)==0) && (0==AV19FlagM) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, "SOLPILMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolPilMaq_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3181SolPilMaq", GXutil.rtrim( A3181SolPilMaq));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A11798SolPilRqMn',fld:'SOLPILRQMN',pic:''},{av:'A11799SolPilSt',fld:'SOLPILST',pic:'9'},{av:'A11868SolPilMtdo',fld:'SOLPILMTDO',pic:''},{av:'A11869SolPilRev',fld:'SOLPILREV',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'GRADOS'","{handler:'e12BC2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3165SolPilCod',fld:'SOLPILCOD',pic:'ZZZZZZZ9'},{av:'A3184SolPilGra',fld:'SOLPILGRA',pic:''}]");
      setEventMetadata("'GRADOS'",",oparms:[{av:'A3184SolPilGra',fld:'SOLPILGRA',pic:''},{av:'A3165SolPilCod',fld:'SOLPILCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_SOLPILCOD","{handler:'valid_Solpilcod',iparms:[{av:'A11798SolPilRqMn',fld:'SOLPILRQMN',pic:''},{av:'A3182SolPilUlin',fld:'SOLPILULIN',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3165SolPilCod',fld:'SOLPILCOD',pic:'ZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A11799SolPilSt',fld:'SOLPILST',pic:'9'},{av:'A11868SolPilMtdo',fld:'SOLPILMTDO',pic:''},{av:'A11869SolPilRev',fld:'SOLPILREV',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV56FlagHdr',fld:'vFLAGHDR',pic:'9'},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]");
      setEventMetadata("VALID_SOLPILCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3166SolPilMat',fld:'SOLPILMAT',pic:''},{av:'A3167SolPilSer',fld:'SOLPILSER',pic:''},{av:'A3168SolPilTip',fld:'SOLPILTIP',pic:'ZZZ9'},{av:'A3169SolPilDisN',fld:'SOLPILDISN',pic:''},{av:'A3170SolPilNom',fld:'SOLPILNOM',pic:''},{av:'A3171SolPilNum',fld:'SOLPILNUM',pic:'ZZZZZ9'},{av:'A3172SolPilFec',fld:'SOLPILFEC',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A3173SolPilCliC',fld:'SOLPILCLIC',pic:'ZZZZZ9'},{av:'A3174SolPilCliN',fld:'SOLPILCLIN',pic:''},{av:'A3175SolPilMB',fld:'SOLPILMB',pic:''},{av:'A3176SolPilB',fld:'SOLPILB',pic:''},{av:'A3177SolPilMd',fld:'SOLPILMD',pic:''},{av:'A3178SolPilM',fld:'SOLPILM',pic:''},{av:'A3179SolPilMM',fld:'SOLPILMM',pic:''},{av:'A3180SolPilNor',fld:'SOLPILNOR',pic:''},{av:'A3181SolPilMaq',fld:'SOLPILMAQ',pic:''},{av:'A3182SolPilUlin',fld:'SOLPILULIN',pic:'Z9'},{av:'A3183SolPilRef',fld:'SOLPILREF',pic:''},{av:'A3184SolPilGra',fld:'SOLPILGRA',pic:''},{av:'A11798SolPilRqMn',fld:'SOLPILRQMN',pic:''},{av:'A11799SolPilSt',fld:'SOLPILST',pic:'9'},{av:'A11868SolPilMtdo',fld:'SOLPILMTDO',pic:''},{av:'A11869SolPilRev',fld:'SOLPILREV',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A3165SolPilCod',fld:'SOLPILCOD',pic:'ZZZZZZZ9'},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV56FlagHdr',fld:'vFLAGHDR',pic:'9'},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z407EmprNom'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z3166SolPilMat'},{av:'Z3167SolPilSer'},{av:'Z3168SolPilTip'},{av:'Z3169SolPilDisN'},{av:'Z3170SolPilNom'},{av:'Z3171SolPilNum'},{av:'Z3172SolPilFec'},{av:'Z652OpeCod'},{av:'Z3173SolPilCliC'},{av:'Z3174SolPilCliN'},{av:'Z3175SolPilMB'},{av:'Z3176SolPilB'},{av:'Z3177SolPilMd'},{av:'Z3178SolPilM'},{av:'Z3179SolPilMM'},{av:'Z3180SolPilNor'},{av:'Z3181SolPilMaq'},{av:'Z3182SolPilUlin'},{av:'Z3183SolPilRef'},{av:'Z3184SolPilGra'},{av:'Z11798SolPilRqMn'},{av:'Z11799SolPilSt'},{av:'Z11868SolPilMtdo'},{av:'Z11869SolPilRev'},{av:'Z653OpeNom'},{av:'Z3165SolPilCod'},{av:'ZV41FlagCal'},{av:'Gx_msg'},{av:'ZV56FlagHdr'},{av:'ZV19FlagM'},{av:'O3182SolPilUlin'},{av:'edtBarCod_Enabled',ctrl:'BARCOD',prop:'Enabled'},{av:'edtBarCodReo_Enabled',ctrl:'BARCODREO',prop:'Enabled'},{av:'edtBarCodPar_Enabled',ctrl:'BARCODPAR',prop:'Enabled'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A3183SolPilRef',fld:'SOLPILREF',pic:''},{av:'A3174SolPilCliN',fld:'SOLPILCLIN',pic:''},{av:'A3171SolPilNum',fld:'SOLPILNUM',pic:'ZZZZZ9'},{av:'A3170SolPilNom',fld:'SOLPILNOM',pic:''},{av:'A3169SolPilDisN',fld:'SOLPILDISN',pic:''},{av:'A3167SolPilSer',fld:'SOLPILSER',pic:''},{av:'A3168SolPilTip',fld:'SOLPILTIP',pic:'ZZZ9'},{av:'A3166SolPilMat',fld:'SOLPILMAT',pic:''},{av:'A3173SolPilCliC',fld:'SOLPILCLIC',pic:'ZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV56FlagHdr',fld:'vFLAGHDR',pic:'9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''},{av:'A3173SolPilCliC',fld:'SOLPILCLIC',pic:'ZZZZZ9'},{av:'A3166SolPilMat',fld:'SOLPILMAT',pic:''},{av:'A3168SolPilTip',fld:'SOLPILTIP',pic:'ZZZ9'},{av:'A3167SolPilSer',fld:'SOLPILSER',pic:''},{av:'A3169SolPilDisN',fld:'SOLPILDISN',pic:''},{av:'A3170SolPilNom',fld:'SOLPILNOM',pic:''},{av:'A3171SolPilNum',fld:'SOLPILNUM',pic:'ZZZZZ9'},{av:'A3174SolPilCliN',fld:'SOLPILCLIN',pic:''},{av:'A3183SolPilRef',fld:'SOLPILREF',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV56FlagHdr',fld:'vFLAGHDR',pic:'9'}]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_SOLPILMAQ","{handler:'valid_Solpilmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3181SolPilMaq',fld:'SOLPILMAQ',pic:''},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]");
      setEventMetadata("VALID_SOLPILMAQ",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3181SolPilMaq',fld:'SOLPILMAQ',pic:''},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]}");
      setEventMetadata("VALID_SOLPILULIN","{handler:'valid_Solpilulin',iparms:[]");
      setEventMetadata("VALID_SOLPILULIN",",oparms:[]}");
      setEventMetadata("VALID_SOLPILGRA","{handler:'valid_Solpilgra',iparms:[]");
      setEventMetadata("VALID_SOLPILGRA",",oparms:[]}");
      setEventMetadata("VALID_SOLPILLIN","{handler:'valid_Solpillin',iparms:[]");
      setEventMetadata("VALID_SOLPILLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Solpilobs',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z3166SolPilMat = "" ;
      Z3167SolPilSer = "" ;
      Z3169SolPilDisN = "" ;
      Z3170SolPilNom = "" ;
      Z3172SolPilFec = GXutil.nullDate() ;
      Z3174SolPilCliN = "" ;
      Z3175SolPilMB = "" ;
      Z3176SolPilB = "" ;
      Z3177SolPilMd = "" ;
      Z3178SolPilM = "" ;
      Z3179SolPilMM = "" ;
      Z3180SolPilNor = "" ;
      Z3181SolPilMaq = "" ;
      Z3183SolPilRef = "" ;
      Z3184SolPilGra = "" ;
      Z11798SolPilRqMn = "" ;
      Z11868SolPilMtdo = "" ;
      Z11869SolPilRev = "" ;
      Z3186SolPilObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A3166SolPilMat = "" ;
      A3167SolPilSer = "" ;
      A3169SolPilDisN = "" ;
      A3170SolPilNom = "" ;
      A3174SolPilCliN = "" ;
      A3183SolPilRef = "" ;
      A3181SolPilMaq = "" ;
      A3184SolPilGra = "" ;
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
      A3172SolPilFec = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A3175SolPilMB = "" ;
      lblTextblock19_Jsonclick = "" ;
      A3176SolPilB = "" ;
      lblTextblock20_Jsonclick = "" ;
      A3177SolPilMd = "" ;
      lblTextblock21_Jsonclick = "" ;
      A3178SolPilM = "" ;
      lblTextblock22_Jsonclick = "" ;
      A3179SolPilMM = "" ;
      lblTextblock23_Jsonclick = "" ;
      A3180SolPilNor = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode464 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A11798SolPilRqMn = "" ;
      A11868SolPilMtdo = "" ;
      A11869SolPilRev = "" ;
      Gx_msg = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode463 = "" ;
      GXCCtl = "" ;
      A3186SolPilObs = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV21LitFe = "" ;
      AV20Lit0 = "" ;
      AV35Lit4 = "" ;
      AV38Lit7 = "" ;
      AV47LitSer = "" ;
      AV49LitCli = "" ;
      AV48LitMat = "" ;
      AV44LitNTest = "" ;
      AV45LitFTest = "" ;
      AV43LitHDR = "" ;
      AV51LitNorma = "" ;
      AV50LitMaq = "" ;
      AV52LitResul = "" ;
      AV55LitOper = "" ;
      AV53LitObser = "" ;
      AV42LitTit = "" ;
      AV46LitRef = "" ;
      AV54LitGrado = "" ;
      AV57Lit200 = "" ;
      AV58Lit202 = "" ;
      AV59Lit203 = "" ;
      AV60Lit204 = "" ;
      GXt_char4 = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T00BC6_A407EmprNom = new String[] {""} ;
      T00BC6_n407EmprNom = new boolean[] {false} ;
      T00BC8_A3165SolPilCod = new int[1] ;
      T00BC8_A407EmprNom = new String[] {""} ;
      T00BC8_n407EmprNom = new boolean[] {false} ;
      T00BC8_A129BarCod = new int[1] ;
      T00BC8_n129BarCod = new boolean[] {false} ;
      T00BC8_A132BarCodReo = new byte[1] ;
      T00BC8_n132BarCodReo = new boolean[] {false} ;
      T00BC8_A130BarCodPar = new String[] {""} ;
      T00BC8_n130BarCodPar = new boolean[] {false} ;
      T00BC8_A3166SolPilMat = new String[] {""} ;
      T00BC8_n3166SolPilMat = new boolean[] {false} ;
      T00BC8_A3167SolPilSer = new String[] {""} ;
      T00BC8_n3167SolPilSer = new boolean[] {false} ;
      T00BC8_A3168SolPilTip = new short[1] ;
      T00BC8_n3168SolPilTip = new boolean[] {false} ;
      T00BC8_A3169SolPilDisN = new String[] {""} ;
      T00BC8_n3169SolPilDisN = new boolean[] {false} ;
      T00BC8_A3170SolPilNom = new String[] {""} ;
      T00BC8_n3170SolPilNom = new boolean[] {false} ;
      T00BC8_A3171SolPilNum = new int[1] ;
      T00BC8_n3171SolPilNum = new boolean[] {false} ;
      T00BC8_A3172SolPilFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00BC8_n3172SolPilFec = new boolean[] {false} ;
      T00BC8_A653OpeNom = new String[] {""} ;
      T00BC8_n653OpeNom = new boolean[] {false} ;
      T00BC8_A3173SolPilCliC = new int[1] ;
      T00BC8_n3173SolPilCliC = new boolean[] {false} ;
      T00BC8_A3174SolPilCliN = new String[] {""} ;
      T00BC8_n3174SolPilCliN = new boolean[] {false} ;
      T00BC8_A3175SolPilMB = new String[] {""} ;
      T00BC8_n3175SolPilMB = new boolean[] {false} ;
      T00BC8_A3176SolPilB = new String[] {""} ;
      T00BC8_n3176SolPilB = new boolean[] {false} ;
      T00BC8_A3177SolPilMd = new String[] {""} ;
      T00BC8_n3177SolPilMd = new boolean[] {false} ;
      T00BC8_A3178SolPilM = new String[] {""} ;
      T00BC8_n3178SolPilM = new boolean[] {false} ;
      T00BC8_A3179SolPilMM = new String[] {""} ;
      T00BC8_n3179SolPilMM = new boolean[] {false} ;
      T00BC8_A3180SolPilNor = new String[] {""} ;
      T00BC8_n3180SolPilNor = new boolean[] {false} ;
      T00BC8_A3181SolPilMaq = new String[] {""} ;
      T00BC8_n3181SolPilMaq = new boolean[] {false} ;
      T00BC8_A3182SolPilUlin = new byte[1] ;
      T00BC8_n3182SolPilUlin = new boolean[] {false} ;
      T00BC8_A3183SolPilRef = new String[] {""} ;
      T00BC8_n3183SolPilRef = new boolean[] {false} ;
      T00BC8_A3184SolPilGra = new String[] {""} ;
      T00BC8_n3184SolPilGra = new boolean[] {false} ;
      T00BC8_A11798SolPilRqMn = new String[] {""} ;
      T00BC8_n11798SolPilRqMn = new boolean[] {false} ;
      T00BC8_A11799SolPilSt = new byte[1] ;
      T00BC8_n11799SolPilSt = new boolean[] {false} ;
      T00BC8_A11868SolPilMtdo = new String[] {""} ;
      T00BC8_n11868SolPilMtdo = new boolean[] {false} ;
      T00BC8_A11869SolPilRev = new String[] {""} ;
      T00BC8_n11869SolPilRev = new boolean[] {false} ;
      T00BC8_A396EmprCod = new String[] {""} ;
      T00BC8_A652OpeCod = new int[1] ;
      T00BC8_n652OpeCod = new boolean[] {false} ;
      T00BC7_A653OpeNom = new String[] {""} ;
      T00BC7_n653OpeNom = new boolean[] {false} ;
      T00BC9_A653OpeNom = new String[] {""} ;
      T00BC9_n653OpeNom = new boolean[] {false} ;
      T00BC10_A396EmprCod = new String[] {""} ;
      T00BC10_A3165SolPilCod = new int[1] ;
      T00BC5_A3165SolPilCod = new int[1] ;
      T00BC5_A129BarCod = new int[1] ;
      T00BC5_n129BarCod = new boolean[] {false} ;
      T00BC5_A132BarCodReo = new byte[1] ;
      T00BC5_n132BarCodReo = new boolean[] {false} ;
      T00BC5_A130BarCodPar = new String[] {""} ;
      T00BC5_n130BarCodPar = new boolean[] {false} ;
      T00BC5_A3166SolPilMat = new String[] {""} ;
      T00BC5_n3166SolPilMat = new boolean[] {false} ;
      T00BC5_A3167SolPilSer = new String[] {""} ;
      T00BC5_n3167SolPilSer = new boolean[] {false} ;
      T00BC5_A3168SolPilTip = new short[1] ;
      T00BC5_n3168SolPilTip = new boolean[] {false} ;
      T00BC5_A3169SolPilDisN = new String[] {""} ;
      T00BC5_n3169SolPilDisN = new boolean[] {false} ;
      T00BC5_A3170SolPilNom = new String[] {""} ;
      T00BC5_n3170SolPilNom = new boolean[] {false} ;
      T00BC5_A3171SolPilNum = new int[1] ;
      T00BC5_n3171SolPilNum = new boolean[] {false} ;
      T00BC5_A3172SolPilFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00BC5_n3172SolPilFec = new boolean[] {false} ;
      T00BC5_A3173SolPilCliC = new int[1] ;
      T00BC5_n3173SolPilCliC = new boolean[] {false} ;
      T00BC5_A3174SolPilCliN = new String[] {""} ;
      T00BC5_n3174SolPilCliN = new boolean[] {false} ;
      T00BC5_A3175SolPilMB = new String[] {""} ;
      T00BC5_n3175SolPilMB = new boolean[] {false} ;
      T00BC5_A3176SolPilB = new String[] {""} ;
      T00BC5_n3176SolPilB = new boolean[] {false} ;
      T00BC5_A3177SolPilMd = new String[] {""} ;
      T00BC5_n3177SolPilMd = new boolean[] {false} ;
      T00BC5_A3178SolPilM = new String[] {""} ;
      T00BC5_n3178SolPilM = new boolean[] {false} ;
      T00BC5_A3179SolPilMM = new String[] {""} ;
      T00BC5_n3179SolPilMM = new boolean[] {false} ;
      T00BC5_A3180SolPilNor = new String[] {""} ;
      T00BC5_n3180SolPilNor = new boolean[] {false} ;
      T00BC5_A3181SolPilMaq = new String[] {""} ;
      T00BC5_n3181SolPilMaq = new boolean[] {false} ;
      T00BC5_A3182SolPilUlin = new byte[1] ;
      T00BC5_n3182SolPilUlin = new boolean[] {false} ;
      T00BC5_A3183SolPilRef = new String[] {""} ;
      T00BC5_n3183SolPilRef = new boolean[] {false} ;
      T00BC5_A3184SolPilGra = new String[] {""} ;
      T00BC5_n3184SolPilGra = new boolean[] {false} ;
      T00BC5_A11798SolPilRqMn = new String[] {""} ;
      T00BC5_n11798SolPilRqMn = new boolean[] {false} ;
      T00BC5_A11799SolPilSt = new byte[1] ;
      T00BC5_n11799SolPilSt = new boolean[] {false} ;
      T00BC5_A11868SolPilMtdo = new String[] {""} ;
      T00BC5_n11868SolPilMtdo = new boolean[] {false} ;
      T00BC5_A11869SolPilRev = new String[] {""} ;
      T00BC5_n11869SolPilRev = new boolean[] {false} ;
      T00BC5_A396EmprCod = new String[] {""} ;
      T00BC5_A652OpeCod = new int[1] ;
      T00BC5_n652OpeCod = new boolean[] {false} ;
      T00BC11_A396EmprCod = new String[] {""} ;
      T00BC11_A3165SolPilCod = new int[1] ;
      T00BC12_A396EmprCod = new String[] {""} ;
      T00BC12_A3165SolPilCod = new int[1] ;
      T00BC4_A3165SolPilCod = new int[1] ;
      T00BC4_A129BarCod = new int[1] ;
      T00BC4_n129BarCod = new boolean[] {false} ;
      T00BC4_A132BarCodReo = new byte[1] ;
      T00BC4_n132BarCodReo = new boolean[] {false} ;
      T00BC4_A130BarCodPar = new String[] {""} ;
      T00BC4_n130BarCodPar = new boolean[] {false} ;
      T00BC4_A3166SolPilMat = new String[] {""} ;
      T00BC4_n3166SolPilMat = new boolean[] {false} ;
      T00BC4_A3167SolPilSer = new String[] {""} ;
      T00BC4_n3167SolPilSer = new boolean[] {false} ;
      T00BC4_A3168SolPilTip = new short[1] ;
      T00BC4_n3168SolPilTip = new boolean[] {false} ;
      T00BC4_A3169SolPilDisN = new String[] {""} ;
      T00BC4_n3169SolPilDisN = new boolean[] {false} ;
      T00BC4_A3170SolPilNom = new String[] {""} ;
      T00BC4_n3170SolPilNom = new boolean[] {false} ;
      T00BC4_A3171SolPilNum = new int[1] ;
      T00BC4_n3171SolPilNum = new boolean[] {false} ;
      T00BC4_A3172SolPilFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00BC4_n3172SolPilFec = new boolean[] {false} ;
      T00BC4_A3173SolPilCliC = new int[1] ;
      T00BC4_n3173SolPilCliC = new boolean[] {false} ;
      T00BC4_A3174SolPilCliN = new String[] {""} ;
      T00BC4_n3174SolPilCliN = new boolean[] {false} ;
      T00BC4_A3175SolPilMB = new String[] {""} ;
      T00BC4_n3175SolPilMB = new boolean[] {false} ;
      T00BC4_A3176SolPilB = new String[] {""} ;
      T00BC4_n3176SolPilB = new boolean[] {false} ;
      T00BC4_A3177SolPilMd = new String[] {""} ;
      T00BC4_n3177SolPilMd = new boolean[] {false} ;
      T00BC4_A3178SolPilM = new String[] {""} ;
      T00BC4_n3178SolPilM = new boolean[] {false} ;
      T00BC4_A3179SolPilMM = new String[] {""} ;
      T00BC4_n3179SolPilMM = new boolean[] {false} ;
      T00BC4_A3180SolPilNor = new String[] {""} ;
      T00BC4_n3180SolPilNor = new boolean[] {false} ;
      T00BC4_A3181SolPilMaq = new String[] {""} ;
      T00BC4_n3181SolPilMaq = new boolean[] {false} ;
      T00BC4_A3182SolPilUlin = new byte[1] ;
      T00BC4_n3182SolPilUlin = new boolean[] {false} ;
      T00BC4_A3183SolPilRef = new String[] {""} ;
      T00BC4_n3183SolPilRef = new boolean[] {false} ;
      T00BC4_A3184SolPilGra = new String[] {""} ;
      T00BC4_n3184SolPilGra = new boolean[] {false} ;
      T00BC4_A11798SolPilRqMn = new String[] {""} ;
      T00BC4_n11798SolPilRqMn = new boolean[] {false} ;
      T00BC4_A11799SolPilSt = new byte[1] ;
      T00BC4_n11799SolPilSt = new boolean[] {false} ;
      T00BC4_A11868SolPilMtdo = new String[] {""} ;
      T00BC4_n11868SolPilMtdo = new boolean[] {false} ;
      T00BC4_A11869SolPilRev = new String[] {""} ;
      T00BC4_n11869SolPilRev = new boolean[] {false} ;
      T00BC4_A396EmprCod = new String[] {""} ;
      T00BC4_A652OpeCod = new int[1] ;
      T00BC4_n652OpeCod = new boolean[] {false} ;
      T00BC16_A653OpeNom = new String[] {""} ;
      T00BC16_n653OpeNom = new boolean[] {false} ;
      T00BC18_A396EmprCod = new String[] {""} ;
      T00BC18_A3165SolPilCod = new int[1] ;
      T00BC19_A3165SolPilCod = new int[1] ;
      T00BC19_A3185SolPilLin = new byte[1] ;
      T00BC19_A3186SolPilObs = new String[] {""} ;
      T00BC19_n3186SolPilObs = new boolean[] {false} ;
      T00BC19_A396EmprCod = new String[] {""} ;
      T00BC20_A396EmprCod = new String[] {""} ;
      T00BC20_A3165SolPilCod = new int[1] ;
      T00BC20_A3185SolPilLin = new byte[1] ;
      T00BC3_A3165SolPilCod = new int[1] ;
      T00BC3_A3185SolPilLin = new byte[1] ;
      T00BC3_A3186SolPilObs = new String[] {""} ;
      T00BC3_n3186SolPilObs = new boolean[] {false} ;
      T00BC3_A396EmprCod = new String[] {""} ;
      T00BC2_A3165SolPilCod = new int[1] ;
      T00BC2_A3185SolPilLin = new byte[1] ;
      T00BC2_A3186SolPilObs = new String[] {""} ;
      T00BC2_n3186SolPilObs = new boolean[] {false} ;
      T00BC2_A396EmprCod = new String[] {""} ;
      T00BC24_A396EmprCod = new String[] {""} ;
      T00BC24_A3165SolPilCod = new int[1] ;
      T00BC24_A3185SolPilLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11868SolPilMtdo = "" ;
      i11869SolPilRev = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00BC25_A407EmprNom = new String[] {""} ;
      T00BC25_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ130BarCodPar = "" ;
      ZZ3166SolPilMat = "" ;
      ZZ3167SolPilSer = "" ;
      ZZ3169SolPilDisN = "" ;
      ZZ3170SolPilNom = "" ;
      ZZ3172SolPilFec = GXutil.nullDate() ;
      ZZ3174SolPilCliN = "" ;
      ZZ3175SolPilMB = "" ;
      ZZ3176SolPilB = "" ;
      ZZ3177SolPilMd = "" ;
      ZZ3178SolPilM = "" ;
      ZZ3179SolPilMM = "" ;
      ZZ3180SolPilNor = "" ;
      ZZ3181SolPilMaq = "" ;
      ZZ3183SolPilRef = "" ;
      ZZ3184SolPilGra = "" ;
      ZZ11798SolPilRqMn = "" ;
      ZZ11868SolPilMtdo = "" ;
      ZZ11869SolPilRev = "" ;
      ZZ653OpeNom = "" ;
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
      GXv_char16 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int17 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpillin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpillin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpillin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpillin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpillin__default(),
         new Object[] {
             new Object[] {
            T00BC2_A3165SolPilCod, T00BC2_A3185SolPilLin, T00BC2_A3186SolPilObs, T00BC2_n3186SolPilObs, T00BC2_A396EmprCod
            }
            , new Object[] {
            T00BC3_A3165SolPilCod, T00BC3_A3185SolPilLin, T00BC3_A3186SolPilObs, T00BC3_n3186SolPilObs, T00BC3_A396EmprCod
            }
            , new Object[] {
            T00BC4_A3165SolPilCod, T00BC4_A129BarCod, T00BC4_n129BarCod, T00BC4_A132BarCodReo, T00BC4_n132BarCodReo, T00BC4_A130BarCodPar, T00BC4_n130BarCodPar, T00BC4_A3166SolPilMat, T00BC4_n3166SolPilMat, T00BC4_A3167SolPilSer,
            T00BC4_n3167SolPilSer, T00BC4_A3168SolPilTip, T00BC4_n3168SolPilTip, T00BC4_A3169SolPilDisN, T00BC4_n3169SolPilDisN, T00BC4_A3170SolPilNom, T00BC4_n3170SolPilNom, T00BC4_A3171SolPilNum, T00BC4_n3171SolPilNum, T00BC4_A3172SolPilFec,
            T00BC4_n3172SolPilFec, T00BC4_A3173SolPilCliC, T00BC4_n3173SolPilCliC, T00BC4_A3174SolPilCliN, T00BC4_n3174SolPilCliN, T00BC4_A3175SolPilMB, T00BC4_n3175SolPilMB, T00BC4_A3176SolPilB, T00BC4_n3176SolPilB, T00BC4_A3177SolPilMd,
            T00BC4_n3177SolPilMd, T00BC4_A3178SolPilM, T00BC4_n3178SolPilM, T00BC4_A3179SolPilMM, T00BC4_n3179SolPilMM, T00BC4_A3180SolPilNor, T00BC4_n3180SolPilNor, T00BC4_A3181SolPilMaq, T00BC4_n3181SolPilMaq, T00BC4_A3182SolPilUlin,
            T00BC4_n3182SolPilUlin, T00BC4_A3183SolPilRef, T00BC4_n3183SolPilRef, T00BC4_A3184SolPilGra, T00BC4_n3184SolPilGra, T00BC4_A11798SolPilRqMn, T00BC4_n11798SolPilRqMn, T00BC4_A11799SolPilSt, T00BC4_n11799SolPilSt, T00BC4_A11868SolPilMtdo,
            T00BC4_n11868SolPilMtdo, T00BC4_A11869SolPilRev, T00BC4_n11869SolPilRev, T00BC4_A396EmprCod, T00BC4_A652OpeCod, T00BC4_n652OpeCod
            }
            , new Object[] {
            T00BC5_A3165SolPilCod, T00BC5_A129BarCod, T00BC5_n129BarCod, T00BC5_A132BarCodReo, T00BC5_n132BarCodReo, T00BC5_A130BarCodPar, T00BC5_n130BarCodPar, T00BC5_A3166SolPilMat, T00BC5_n3166SolPilMat, T00BC5_A3167SolPilSer,
            T00BC5_n3167SolPilSer, T00BC5_A3168SolPilTip, T00BC5_n3168SolPilTip, T00BC5_A3169SolPilDisN, T00BC5_n3169SolPilDisN, T00BC5_A3170SolPilNom, T00BC5_n3170SolPilNom, T00BC5_A3171SolPilNum, T00BC5_n3171SolPilNum, T00BC5_A3172SolPilFec,
            T00BC5_n3172SolPilFec, T00BC5_A3173SolPilCliC, T00BC5_n3173SolPilCliC, T00BC5_A3174SolPilCliN, T00BC5_n3174SolPilCliN, T00BC5_A3175SolPilMB, T00BC5_n3175SolPilMB, T00BC5_A3176SolPilB, T00BC5_n3176SolPilB, T00BC5_A3177SolPilMd,
            T00BC5_n3177SolPilMd, T00BC5_A3178SolPilM, T00BC5_n3178SolPilM, T00BC5_A3179SolPilMM, T00BC5_n3179SolPilMM, T00BC5_A3180SolPilNor, T00BC5_n3180SolPilNor, T00BC5_A3181SolPilMaq, T00BC5_n3181SolPilMaq, T00BC5_A3182SolPilUlin,
            T00BC5_n3182SolPilUlin, T00BC5_A3183SolPilRef, T00BC5_n3183SolPilRef, T00BC5_A3184SolPilGra, T00BC5_n3184SolPilGra, T00BC5_A11798SolPilRqMn, T00BC5_n11798SolPilRqMn, T00BC5_A11799SolPilSt, T00BC5_n11799SolPilSt, T00BC5_A11868SolPilMtdo,
            T00BC5_n11868SolPilMtdo, T00BC5_A11869SolPilRev, T00BC5_n11869SolPilRev, T00BC5_A396EmprCod, T00BC5_A652OpeCod, T00BC5_n652OpeCod
            }
            , new Object[] {
            T00BC6_A407EmprNom, T00BC6_n407EmprNom
            }
            , new Object[] {
            T00BC7_A653OpeNom, T00BC7_n653OpeNom
            }
            , new Object[] {
            T00BC8_A3165SolPilCod, T00BC8_A407EmprNom, T00BC8_n407EmprNom, T00BC8_A129BarCod, T00BC8_n129BarCod, T00BC8_A132BarCodReo, T00BC8_n132BarCodReo, T00BC8_A130BarCodPar, T00BC8_n130BarCodPar, T00BC8_A3166SolPilMat,
            T00BC8_n3166SolPilMat, T00BC8_A3167SolPilSer, T00BC8_n3167SolPilSer, T00BC8_A3168SolPilTip, T00BC8_n3168SolPilTip, T00BC8_A3169SolPilDisN, T00BC8_n3169SolPilDisN, T00BC8_A3170SolPilNom, T00BC8_n3170SolPilNom, T00BC8_A3171SolPilNum,
            T00BC8_n3171SolPilNum, T00BC8_A3172SolPilFec, T00BC8_n3172SolPilFec, T00BC8_A653OpeNom, T00BC8_n653OpeNom, T00BC8_A3173SolPilCliC, T00BC8_n3173SolPilCliC, T00BC8_A3174SolPilCliN, T00BC8_n3174SolPilCliN, T00BC8_A3175SolPilMB,
            T00BC8_n3175SolPilMB, T00BC8_A3176SolPilB, T00BC8_n3176SolPilB, T00BC8_A3177SolPilMd, T00BC8_n3177SolPilMd, T00BC8_A3178SolPilM, T00BC8_n3178SolPilM, T00BC8_A3179SolPilMM, T00BC8_n3179SolPilMM, T00BC8_A3180SolPilNor,
            T00BC8_n3180SolPilNor, T00BC8_A3181SolPilMaq, T00BC8_n3181SolPilMaq, T00BC8_A3182SolPilUlin, T00BC8_n3182SolPilUlin, T00BC8_A3183SolPilRef, T00BC8_n3183SolPilRef, T00BC8_A3184SolPilGra, T00BC8_n3184SolPilGra, T00BC8_A11798SolPilRqMn,
            T00BC8_n11798SolPilRqMn, T00BC8_A11799SolPilSt, T00BC8_n11799SolPilSt, T00BC8_A11868SolPilMtdo, T00BC8_n11868SolPilMtdo, T00BC8_A11869SolPilRev, T00BC8_n11869SolPilRev, T00BC8_A396EmprCod, T00BC8_A652OpeCod, T00BC8_n652OpeCod
            }
            , new Object[] {
            T00BC9_A653OpeNom, T00BC9_n653OpeNom
            }
            , new Object[] {
            T00BC10_A396EmprCod, T00BC10_A3165SolPilCod
            }
            , new Object[] {
            T00BC11_A396EmprCod, T00BC11_A3165SolPilCod
            }
            , new Object[] {
            T00BC12_A396EmprCod, T00BC12_A3165SolPilCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00BC16_A653OpeNom, T00BC16_n653OpeNom
            }
            , new Object[] {
            }
            , new Object[] {
            T00BC18_A396EmprCod, T00BC18_A3165SolPilCod
            }
            , new Object[] {
            T00BC19_A3165SolPilCod, T00BC19_A3185SolPilLin, T00BC19_A3186SolPilObs, T00BC19_n3186SolPilObs, T00BC19_A396EmprCod
            }
            , new Object[] {
            T00BC20_A396EmprCod, T00BC20_A3165SolPilCod, T00BC20_A3185SolPilLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00BC24_A396EmprCod, T00BC24_A3165SolPilCod, T00BC24_A3185SolPilLin
            }
            , new Object[] {
            T00BC25_A407EmprNom, T00BC25_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z11869SolPilRev = "7200" ;
      n11869SolPilRev = false ;
      A11869SolPilRev = "7200" ;
      n11869SolPilRev = false ;
      i11869SolPilRev = "7200" ;
      n11869SolPilRev = false ;
      Z11868SolPilMtdo = httpContext.getMessage( "NEXT MET 19", "") ;
      n11868SolPilMtdo = false ;
      A11868SolPilMtdo = httpContext.getMessage( "NEXT MET 19", "") ;
      n11868SolPilMtdo = false ;
      i11868SolPilMtdo = httpContext.getMessage( "NEXT MET 19", "") ;
      n11868SolPilMtdo = false ;
      Z11799SolPilSt = (byte)(1) ;
      n11799SolPilSt = false ;
      A11799SolPilSt = (byte)(1) ;
      n11799SolPilSt = false ;
      i11799SolPilSt = (byte)(1) ;
      n11799SolPilSt = false ;
   }

   private byte Z132BarCodReo ;
   private byte Z3182SolPilUlin ;
   private byte Z11799SolPilSt ;
   private byte O3182SolPilUlin ;
   private byte Z3185SolPilLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV19FlagM ;
   private byte AV56FlagHdr ;
   private byte nKeyPressed ;
   private byte A3182SolPilUlin ;
   private byte Gx_BScreen ;
   private byte B3182SolPilUlin ;
   private byte A11799SolPilSt ;
   private byte s3182SolPilUlin ;
   private byte A3185SolPilLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i11799SolPilSt ;
   private byte i3182SolPilUlin ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZV56FlagHdr ;
   private byte ZV19FlagM ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3182SolPilUlin ;
   private byte ZZ11799SolPilSt ;
   private byte ZZV56FlagHdr ;
   private byte ZZV19FlagM ;
   private byte ZO3182SolPilUlin ;
   private byte GXv_int6[] ;
   private byte GXv_int17[] ;
   private short Z3168SolPilTip ;
   private short nRcdDeleted_464 ;
   private short nRcdExists_464 ;
   private short nIsMod_464 ;
   private short A3168SolPilTip ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount464 ;
   private short RcdFound464 ;
   private short nBlankRcdUsr464 ;
   private short RcdFound463 ;
   private short nIsDirty_463 ;
   private short nIsDirty_464 ;
   private short ZZ3168SolPilTip ;
   private short GXv_int15[] ;
   private short GXv_int14[] ;
   private short GXv_int8[] ;
   private int Z3165SolPilCod ;
   private int Z129BarCod ;
   private int Z3171SolPilNum ;
   private int Z3173SolPilCliC ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_155 ;
   private int nGXsfl_155_idx=1 ;
   private int A129BarCod ;
   private int A3173SolPilCliC ;
   private int A3171SolPilNum ;
   private int AV41FlagCal ;
   private int A3165SolPilCod ;
   private int A652OpeCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtSolPilCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtSolPilMat_Enabled ;
   private int edtSolPilSer_Enabled ;
   private int edtSolPilTip_Enabled ;
   private int edtSolPilDisN_Enabled ;
   private int edtSolPilNom_Enabled ;
   private int edtSolPilNum_Enabled ;
   private int edtSolPilFec_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtSolPilCliC_Enabled ;
   private int edtSolPilCliN_Enabled ;
   private int edtSolPilMB_Enabled ;
   private int edtSolPilB_Enabled ;
   private int edtSolPilMd_Enabled ;
   private int edtSolPilM_Enabled ;
   private int edtSolPilMM_Enabled ;
   private int edtSolPilNor_Enabled ;
   private int edtSolPilMaq_Enabled ;
   private int edtSolPilUlin_Enabled ;
   private int edtSolPilRef_Enabled ;
   private int edtSolPilGra_Enabled ;
   private int edtavnRcdDeleted_464_Enabled ;
   private int edtSolPilLin_Enabled ;
   private int edtSolPilObs_Enabled ;
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
   private int defedtSolPilLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSolPilGra_Backcolor ;
   private int edtSolPilRef_Backcolor ;
   private int edtSolPilUlin_Backcolor ;
   private int edtSolPilMaq_Backcolor ;
   private int edtSolPilNor_Backcolor ;
   private int edtSolPilMM_Backcolor ;
   private int edtSolPilM_Backcolor ;
   private int edtSolPilMd_Backcolor ;
   private int edtSolPilB_Backcolor ;
   private int edtSolPilMB_Backcolor ;
   private int edtSolPilCliN_Backcolor ;
   private int edtSolPilCliC_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtSolPilFec_Backcolor ;
   private int edtSolPilNum_Backcolor ;
   private int edtSolPilNom_Backcolor ;
   private int edtSolPilDisN_Backcolor ;
   private int edtSolPilTip_Backcolor ;
   private int edtSolPilSer_Backcolor ;
   private int edtSolPilMat_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtSolPilCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZV41FlagCal ;
   private int ZZ129BarCod ;
   private int ZZ3171SolPilNum ;
   private int ZZ652OpeCod ;
   private int ZZ3173SolPilCliC ;
   private int ZZ3165SolPilCod ;
   private int ZZV41FlagCal ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int GXv_int12[] ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z3166SolPilMat ;
   private String Z3167SolPilSer ;
   private String Z3169SolPilDisN ;
   private String Z3170SolPilNom ;
   private String Z3174SolPilCliN ;
   private String Z3175SolPilMB ;
   private String Z3176SolPilB ;
   private String Z3177SolPilMd ;
   private String Z3178SolPilM ;
   private String Z3179SolPilMM ;
   private String Z3180SolPilNor ;
   private String Z3181SolPilMaq ;
   private String Z3183SolPilRef ;
   private String Z3184SolPilGra ;
   private String Z11798SolPilRqMn ;
   private String Z11868SolPilMtdo ;
   private String Z11869SolPilRev ;
   private String Z3186SolPilObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A3166SolPilMat ;
   private String A3167SolPilSer ;
   private String A3169SolPilDisN ;
   private String A3170SolPilNom ;
   private String A3174SolPilCliN ;
   private String A3183SolPilRef ;
   private String A3181SolPilMaq ;
   private String A3184SolPilGra ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSolPilCod_Internalname ;
   private String sGXsfl_155_idx="0001" ;
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
   private String edtSolPilCod_Jsonclick ;
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
   private String edtSolPilMat_Internalname ;
   private String edtSolPilMat_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSolPilSer_Internalname ;
   private String edtSolPilSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSolPilTip_Internalname ;
   private String edtSolPilTip_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSolPilDisN_Internalname ;
   private String edtSolPilDisN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSolPilNom_Internalname ;
   private String edtSolPilNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtSolPilNum_Internalname ;
   private String edtSolPilNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtSolPilFec_Internalname ;
   private String edtSolPilFec_Jsonclick ;
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
   private String edtSolPilCliC_Internalname ;
   private String edtSolPilCliC_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtSolPilCliN_Internalname ;
   private String edtSolPilCliN_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtSolPilMB_Internalname ;
   private String A3175SolPilMB ;
   private String edtSolPilMB_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtSolPilB_Internalname ;
   private String A3176SolPilB ;
   private String edtSolPilB_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtSolPilMd_Internalname ;
   private String A3177SolPilMd ;
   private String edtSolPilMd_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtSolPilM_Internalname ;
   private String A3178SolPilM ;
   private String edtSolPilM_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtSolPilMM_Internalname ;
   private String A3179SolPilMM ;
   private String edtSolPilMM_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtSolPilNor_Internalname ;
   private String A3180SolPilNor ;
   private String edtSolPilNor_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtSolPilMaq_Internalname ;
   private String edtSolPilMaq_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtSolPilUlin_Internalname ;
   private String edtSolPilUlin_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtSolPilRef_Internalname ;
   private String edtSolPilRef_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtSolPilGra_Internalname ;
   private String edtSolPilGra_Jsonclick ;
   private String sMode464 ;
   private String edtavnRcdDeleted_464_Internalname ;
   private String edtSolPilLin_Internalname ;
   private String edtSolPilObs_Internalname ;
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
   private String A11798SolPilRqMn ;
   private String A11868SolPilMtdo ;
   private String A11869SolPilRev ;
   private String Gx_msg ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode463 ;
   private String GXCCtl ;
   private String A3186SolPilObs ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String AV21LitFe ;
   private String AV20Lit0 ;
   private String AV35Lit4 ;
   private String AV38Lit7 ;
   private String AV47LitSer ;
   private String AV49LitCli ;
   private String AV48LitMat ;
   private String AV44LitNTest ;
   private String AV45LitFTest ;
   private String AV43LitHDR ;
   private String AV51LitNorma ;
   private String AV50LitMaq ;
   private String AV52LitResul ;
   private String AV55LitOper ;
   private String AV53LitObser ;
   private String AV42LitTit ;
   private String AV46LitRef ;
   private String AV54LitGrado ;
   private String AV57Lit200 ;
   private String AV58Lit202 ;
   private String AV59Lit203 ;
   private String AV60Lit204 ;
   private String GXt_char4 ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String sGXsfl_155_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_464_Jsonclick ;
   private String edtSolPilLin_Jsonclick ;
   private String edtSolPilObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11868SolPilMtdo ;
   private String i11869SolPilRev ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ130BarCodPar ;
   private String ZZ3166SolPilMat ;
   private String ZZ3167SolPilSer ;
   private String ZZ3169SolPilDisN ;
   private String ZZ3170SolPilNom ;
   private String ZZ3174SolPilCliN ;
   private String ZZ3175SolPilMB ;
   private String ZZ3176SolPilB ;
   private String ZZ3177SolPilMd ;
   private String ZZ3178SolPilM ;
   private String ZZ3179SolPilMM ;
   private String ZZ3180SolPilNor ;
   private String ZZ3181SolPilMaq ;
   private String ZZ3183SolPilRef ;
   private String ZZ3184SolPilGra ;
   private String ZZ11798SolPilRqMn ;
   private String ZZ11868SolPilMtdo ;
   private String ZZ11869SolPilRev ;
   private String ZZ653OpeNom ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char16[] ;
   private String GXv_char13[] ;
   private java.util.Date Z3172SolPilFec ;
   private java.util.Date A3172SolPilFec ;
   private java.util.Date ZZ3172SolPilFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n3173SolPilCliC ;
   private boolean n3166SolPilMat ;
   private boolean n3168SolPilTip ;
   private boolean n3167SolPilSer ;
   private boolean n3169SolPilDisN ;
   private boolean n3170SolPilNom ;
   private boolean n3171SolPilNum ;
   private boolean n3174SolPilCliN ;
   private boolean n3183SolPilRef ;
   private boolean n3181SolPilMaq ;
   private boolean n3184SolPilGra ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean n3182SolPilUlin ;
   private boolean bGXsfl_155_Refreshing=false ;
   private boolean n11798SolPilRqMn ;
   private boolean n11799SolPilSt ;
   private boolean n11868SolPilMtdo ;
   private boolean n11869SolPilRev ;
   private boolean n407EmprNom ;
   private boolean n3172SolPilFec ;
   private boolean n653OpeNom ;
   private boolean n3175SolPilMB ;
   private boolean n3176SolPilB ;
   private boolean n3177SolPilMd ;
   private boolean n3178SolPilM ;
   private boolean n3179SolPilMM ;
   private boolean n3180SolPilNor ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n3186SolPilObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00BC6_A407EmprNom ;
   private boolean[] T00BC6_n407EmprNom ;
   private int[] T00BC8_A3165SolPilCod ;
   private String[] T00BC8_A407EmprNom ;
   private boolean[] T00BC8_n407EmprNom ;
   private int[] T00BC8_A129BarCod ;
   private boolean[] T00BC8_n129BarCod ;
   private byte[] T00BC8_A132BarCodReo ;
   private boolean[] T00BC8_n132BarCodReo ;
   private String[] T00BC8_A130BarCodPar ;
   private boolean[] T00BC8_n130BarCodPar ;
   private String[] T00BC8_A3166SolPilMat ;
   private boolean[] T00BC8_n3166SolPilMat ;
   private String[] T00BC8_A3167SolPilSer ;
   private boolean[] T00BC8_n3167SolPilSer ;
   private short[] T00BC8_A3168SolPilTip ;
   private boolean[] T00BC8_n3168SolPilTip ;
   private String[] T00BC8_A3169SolPilDisN ;
   private boolean[] T00BC8_n3169SolPilDisN ;
   private String[] T00BC8_A3170SolPilNom ;
   private boolean[] T00BC8_n3170SolPilNom ;
   private int[] T00BC8_A3171SolPilNum ;
   private boolean[] T00BC8_n3171SolPilNum ;
   private java.util.Date[] T00BC8_A3172SolPilFec ;
   private boolean[] T00BC8_n3172SolPilFec ;
   private String[] T00BC8_A653OpeNom ;
   private boolean[] T00BC8_n653OpeNom ;
   private int[] T00BC8_A3173SolPilCliC ;
   private boolean[] T00BC8_n3173SolPilCliC ;
   private String[] T00BC8_A3174SolPilCliN ;
   private boolean[] T00BC8_n3174SolPilCliN ;
   private String[] T00BC8_A3175SolPilMB ;
   private boolean[] T00BC8_n3175SolPilMB ;
   private String[] T00BC8_A3176SolPilB ;
   private boolean[] T00BC8_n3176SolPilB ;
   private String[] T00BC8_A3177SolPilMd ;
   private boolean[] T00BC8_n3177SolPilMd ;
   private String[] T00BC8_A3178SolPilM ;
   private boolean[] T00BC8_n3178SolPilM ;
   private String[] T00BC8_A3179SolPilMM ;
   private boolean[] T00BC8_n3179SolPilMM ;
   private String[] T00BC8_A3180SolPilNor ;
   private boolean[] T00BC8_n3180SolPilNor ;
   private String[] T00BC8_A3181SolPilMaq ;
   private boolean[] T00BC8_n3181SolPilMaq ;
   private byte[] T00BC8_A3182SolPilUlin ;
   private boolean[] T00BC8_n3182SolPilUlin ;
   private String[] T00BC8_A3183SolPilRef ;
   private boolean[] T00BC8_n3183SolPilRef ;
   private String[] T00BC8_A3184SolPilGra ;
   private boolean[] T00BC8_n3184SolPilGra ;
   private String[] T00BC8_A11798SolPilRqMn ;
   private boolean[] T00BC8_n11798SolPilRqMn ;
   private byte[] T00BC8_A11799SolPilSt ;
   private boolean[] T00BC8_n11799SolPilSt ;
   private String[] T00BC8_A11868SolPilMtdo ;
   private boolean[] T00BC8_n11868SolPilMtdo ;
   private String[] T00BC8_A11869SolPilRev ;
   private boolean[] T00BC8_n11869SolPilRev ;
   private String[] T00BC8_A396EmprCod ;
   private int[] T00BC8_A652OpeCod ;
   private boolean[] T00BC8_n652OpeCod ;
   private String[] T00BC7_A653OpeNom ;
   private boolean[] T00BC7_n653OpeNom ;
   private String[] T00BC9_A653OpeNom ;
   private boolean[] T00BC9_n653OpeNom ;
   private String[] T00BC10_A396EmprCod ;
   private int[] T00BC10_A3165SolPilCod ;
   private int[] T00BC5_A3165SolPilCod ;
   private int[] T00BC5_A129BarCod ;
   private boolean[] T00BC5_n129BarCod ;
   private byte[] T00BC5_A132BarCodReo ;
   private boolean[] T00BC5_n132BarCodReo ;
   private String[] T00BC5_A130BarCodPar ;
   private boolean[] T00BC5_n130BarCodPar ;
   private String[] T00BC5_A3166SolPilMat ;
   private boolean[] T00BC5_n3166SolPilMat ;
   private String[] T00BC5_A3167SolPilSer ;
   private boolean[] T00BC5_n3167SolPilSer ;
   private short[] T00BC5_A3168SolPilTip ;
   private boolean[] T00BC5_n3168SolPilTip ;
   private String[] T00BC5_A3169SolPilDisN ;
   private boolean[] T00BC5_n3169SolPilDisN ;
   private String[] T00BC5_A3170SolPilNom ;
   private boolean[] T00BC5_n3170SolPilNom ;
   private int[] T00BC5_A3171SolPilNum ;
   private boolean[] T00BC5_n3171SolPilNum ;
   private java.util.Date[] T00BC5_A3172SolPilFec ;
   private boolean[] T00BC5_n3172SolPilFec ;
   private int[] T00BC5_A3173SolPilCliC ;
   private boolean[] T00BC5_n3173SolPilCliC ;
   private String[] T00BC5_A3174SolPilCliN ;
   private boolean[] T00BC5_n3174SolPilCliN ;
   private String[] T00BC5_A3175SolPilMB ;
   private boolean[] T00BC5_n3175SolPilMB ;
   private String[] T00BC5_A3176SolPilB ;
   private boolean[] T00BC5_n3176SolPilB ;
   private String[] T00BC5_A3177SolPilMd ;
   private boolean[] T00BC5_n3177SolPilMd ;
   private String[] T00BC5_A3178SolPilM ;
   private boolean[] T00BC5_n3178SolPilM ;
   private String[] T00BC5_A3179SolPilMM ;
   private boolean[] T00BC5_n3179SolPilMM ;
   private String[] T00BC5_A3180SolPilNor ;
   private boolean[] T00BC5_n3180SolPilNor ;
   private String[] T00BC5_A3181SolPilMaq ;
   private boolean[] T00BC5_n3181SolPilMaq ;
   private byte[] T00BC5_A3182SolPilUlin ;
   private boolean[] T00BC5_n3182SolPilUlin ;
   private String[] T00BC5_A3183SolPilRef ;
   private boolean[] T00BC5_n3183SolPilRef ;
   private String[] T00BC5_A3184SolPilGra ;
   private boolean[] T00BC5_n3184SolPilGra ;
   private String[] T00BC5_A11798SolPilRqMn ;
   private boolean[] T00BC5_n11798SolPilRqMn ;
   private byte[] T00BC5_A11799SolPilSt ;
   private boolean[] T00BC5_n11799SolPilSt ;
   private String[] T00BC5_A11868SolPilMtdo ;
   private boolean[] T00BC5_n11868SolPilMtdo ;
   private String[] T00BC5_A11869SolPilRev ;
   private boolean[] T00BC5_n11869SolPilRev ;
   private String[] T00BC5_A396EmprCod ;
   private int[] T00BC5_A652OpeCod ;
   private boolean[] T00BC5_n652OpeCod ;
   private String[] T00BC11_A396EmprCod ;
   private int[] T00BC11_A3165SolPilCod ;
   private String[] T00BC12_A396EmprCod ;
   private int[] T00BC12_A3165SolPilCod ;
   private int[] T00BC4_A3165SolPilCod ;
   private int[] T00BC4_A129BarCod ;
   private boolean[] T00BC4_n129BarCod ;
   private byte[] T00BC4_A132BarCodReo ;
   private boolean[] T00BC4_n132BarCodReo ;
   private String[] T00BC4_A130BarCodPar ;
   private boolean[] T00BC4_n130BarCodPar ;
   private String[] T00BC4_A3166SolPilMat ;
   private boolean[] T00BC4_n3166SolPilMat ;
   private String[] T00BC4_A3167SolPilSer ;
   private boolean[] T00BC4_n3167SolPilSer ;
   private short[] T00BC4_A3168SolPilTip ;
   private boolean[] T00BC4_n3168SolPilTip ;
   private String[] T00BC4_A3169SolPilDisN ;
   private boolean[] T00BC4_n3169SolPilDisN ;
   private String[] T00BC4_A3170SolPilNom ;
   private boolean[] T00BC4_n3170SolPilNom ;
   private int[] T00BC4_A3171SolPilNum ;
   private boolean[] T00BC4_n3171SolPilNum ;
   private java.util.Date[] T00BC4_A3172SolPilFec ;
   private boolean[] T00BC4_n3172SolPilFec ;
   private int[] T00BC4_A3173SolPilCliC ;
   private boolean[] T00BC4_n3173SolPilCliC ;
   private String[] T00BC4_A3174SolPilCliN ;
   private boolean[] T00BC4_n3174SolPilCliN ;
   private String[] T00BC4_A3175SolPilMB ;
   private boolean[] T00BC4_n3175SolPilMB ;
   private String[] T00BC4_A3176SolPilB ;
   private boolean[] T00BC4_n3176SolPilB ;
   private String[] T00BC4_A3177SolPilMd ;
   private boolean[] T00BC4_n3177SolPilMd ;
   private String[] T00BC4_A3178SolPilM ;
   private boolean[] T00BC4_n3178SolPilM ;
   private String[] T00BC4_A3179SolPilMM ;
   private boolean[] T00BC4_n3179SolPilMM ;
   private String[] T00BC4_A3180SolPilNor ;
   private boolean[] T00BC4_n3180SolPilNor ;
   private String[] T00BC4_A3181SolPilMaq ;
   private boolean[] T00BC4_n3181SolPilMaq ;
   private byte[] T00BC4_A3182SolPilUlin ;
   private boolean[] T00BC4_n3182SolPilUlin ;
   private String[] T00BC4_A3183SolPilRef ;
   private boolean[] T00BC4_n3183SolPilRef ;
   private String[] T00BC4_A3184SolPilGra ;
   private boolean[] T00BC4_n3184SolPilGra ;
   private String[] T00BC4_A11798SolPilRqMn ;
   private boolean[] T00BC4_n11798SolPilRqMn ;
   private byte[] T00BC4_A11799SolPilSt ;
   private boolean[] T00BC4_n11799SolPilSt ;
   private String[] T00BC4_A11868SolPilMtdo ;
   private boolean[] T00BC4_n11868SolPilMtdo ;
   private String[] T00BC4_A11869SolPilRev ;
   private boolean[] T00BC4_n11869SolPilRev ;
   private String[] T00BC4_A396EmprCod ;
   private int[] T00BC4_A652OpeCod ;
   private boolean[] T00BC4_n652OpeCod ;
   private String[] T00BC16_A653OpeNom ;
   private boolean[] T00BC16_n653OpeNom ;
   private String[] T00BC18_A396EmprCod ;
   private int[] T00BC18_A3165SolPilCod ;
   private int[] T00BC19_A3165SolPilCod ;
   private byte[] T00BC19_A3185SolPilLin ;
   private String[] T00BC19_A3186SolPilObs ;
   private boolean[] T00BC19_n3186SolPilObs ;
   private String[] T00BC19_A396EmprCod ;
   private String[] T00BC20_A396EmprCod ;
   private int[] T00BC20_A3165SolPilCod ;
   private byte[] T00BC20_A3185SolPilLin ;
   private int[] T00BC3_A3165SolPilCod ;
   private byte[] T00BC3_A3185SolPilLin ;
   private String[] T00BC3_A3186SolPilObs ;
   private boolean[] T00BC3_n3186SolPilObs ;
   private String[] T00BC3_A396EmprCod ;
   private int[] T00BC2_A3165SolPilCod ;
   private byte[] T00BC2_A3185SolPilLin ;
   private String[] T00BC2_A3186SolPilObs ;
   private boolean[] T00BC2_n3186SolPilObs ;
   private String[] T00BC2_A396EmprCod ;
   private String[] T00BC24_A396EmprCod ;
   private int[] T00BC24_A3165SolPilCod ;
   private byte[] T00BC24_A3185SolPilLin ;
   private String[] T00BC25_A407EmprNom ;
   private boolean[] T00BC25_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpillin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpillin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpillin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpillin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpillin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00BC2", "SELECT SolPilCod, SolPilLin, SolPilObs, EmprCod FROM TXPLPILLI WHERE EmprCod = ? AND SolPilCod = ? AND SolPilLin = ?  FOR UPDATE OF SolPilObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC3", "SELECT SolPilCod, SolPilLin, SolPilObs, EmprCod FROM TXPLPILLI WHERE EmprCod = ? AND SolPilCod = ? AND SolPilLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC4", "SELECT SolPilCod, BarCod, BarCodReo, BarCodPar, SolPilMat, SolPilSer, SolPilTip, SolPilDisN, SolPilNom, SolPilNum, SolPilFec, SolPilCliC, SolPilCliN, SolPilMB, SolPilB, SolPilMd, SolPilM, SolPilMM, SolPilNor, SolPilMaq, SolPilUlin, SolPilRef, SolPilGra, SolPilRqMn, SolPilSt, SolPilMtdo, SolPilRev, EmprCod, OpeCod FROM TXPCPILLI WHERE EmprCod = ? AND SolPilCod = ?  FOR UPDATE OF BarCod, BarCodReo, BarCodPar, SolPilMat, SolPilSer, SolPilTip, SolPilDisN, SolPilNom, SolPilNum, SolPilFec, SolPilCliC, SolPilCliN, SolPilMB, SolPilB, SolPilMd, SolPilM, SolPilMM, SolPilNor, SolPilMaq, SolPilUlin, SolPilRef, SolPilGra, SolPilRqMn, SolPilSt, SolPilMtdo, SolPilRev, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC5", "SELECT SolPilCod, BarCod, BarCodReo, BarCodPar, SolPilMat, SolPilSer, SolPilTip, SolPilDisN, SolPilNom, SolPilNum, SolPilFec, SolPilCliC, SolPilCliN, SolPilMB, SolPilB, SolPilMd, SolPilM, SolPilMM, SolPilNor, SolPilMaq, SolPilUlin, SolPilRef, SolPilGra, SolPilRqMn, SolPilSt, SolPilMtdo, SolPilRev, EmprCod, OpeCod FROM TXPCPILLI WHERE EmprCod = ? AND SolPilCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC7", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC8", "SELECT /*+ FIRST_ROWS(100) */ TM1.SolPilCod, T2.EmprNom, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.SolPilMat, TM1.SolPilSer, TM1.SolPilTip, TM1.SolPilDisN, TM1.SolPilNom, TM1.SolPilNum, TM1.SolPilFec, T3.OpeNom, TM1.SolPilCliC, TM1.SolPilCliN, TM1.SolPilMB, TM1.SolPilB, TM1.SolPilMd, TM1.SolPilM, TM1.SolPilMM, TM1.SolPilNor, TM1.SolPilMaq, TM1.SolPilUlin, TM1.SolPilRef, TM1.SolPilGra, TM1.SolPilRqMn, TM1.SolPilSt, TM1.SolPilMtdo, TM1.SolPilRev, TM1.EmprCod, TM1.OpeCod FROM ((TXPCPILLI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.SolPilCod = ? ORDER BY TM1.EmprCod, TM1.SolPilCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC9", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND SolPilCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolPilCod FROM TXPCPILLI WHERE ( SolPilCod > ?) and EmprCod = ? ORDER BY EmprCod, SolPilCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00BC12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolPilCod FROM TXPCPILLI WHERE ( SolPilCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, SolPilCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00BC13", "INSERT INTO TXPCPILLI(SolPilCod, BarCod, BarCodReo, BarCodPar, SolPilMat, SolPilSer, SolPilTip, SolPilDisN, SolPilNom, SolPilNum, SolPilFec, SolPilCliC, SolPilCliN, SolPilMB, SolPilB, SolPilMd, SolPilM, SolPilMM, SolPilNor, SolPilMaq, SolPilUlin, SolPilRef, SolPilGra, SolPilRqMn, SolPilSt, SolPilMtdo, SolPilRev, EmprCod, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCPILLI")
         ,new UpdateCursor("T00BC14", "UPDATE TXPCPILLI SET BarCod=?, BarCodReo=?, BarCodPar=?, SolPilMat=?, SolPilSer=?, SolPilTip=?, SolPilDisN=?, SolPilNom=?, SolPilNum=?, SolPilFec=?, SolPilCliC=?, SolPilCliN=?, SolPilMB=?, SolPilB=?, SolPilMd=?, SolPilM=?, SolPilMM=?, SolPilNor=?, SolPilMaq=?, SolPilUlin=?, SolPilRef=?, SolPilGra=?, SolPilRqMn=?, SolPilSt=?, SolPilMtdo=?, SolPilRev=?, OpeCod=?  WHERE EmprCod = ? AND SolPilCod = ?", GX_NOMASK, "TXPCPILLI")
         ,new UpdateCursor("T00BC15", "DELETE FROM TXPCPILLI  WHERE EmprCod = ? AND SolPilCod = ?", GX_NOMASK, "TXPCPILLI")
         ,new ForEachCursor("T00BC16", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00BC17", "UPDATE TXPCPILLI SET SolPilUlin=?  WHERE EmprCod = ? AND SolPilCod = ?", GX_NOMASK, "TXPCPILLI")
         ,new ForEachCursor("T00BC18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? ORDER BY EmprCod, SolPilCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC19", "SELECT SolPilCod, SolPilLin, SolPilObs, EmprCod FROM TXPLPILLI WHERE EmprCod = ? and SolPilCod = ? and SolPilLin = ? ORDER BY EmprCod, SolPilCod, SolPilLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC20", "SELECT EmprCod, SolPilCod, SolPilLin FROM TXPLPILLI WHERE EmprCod = ? AND SolPilCod = ? AND SolPilLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00BC21", "INSERT INTO TXPLPILLI(SolPilCod, SolPilLin, SolPilObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLPILLI")
         ,new UpdateCursor("T00BC22", "UPDATE TXPLPILLI SET SolPilObs=?  WHERE EmprCod = ? AND SolPilCod = ? AND SolPilLin = ?", GX_NOMASK, "TXPLPILLI")
         ,new UpdateCursor("T00BC23", "DELETE FROM TXPLPILLI  WHERE EmprCod = ? AND SolPilCod = ? AND SolPilLin = ?", GX_NOMASK, "TXPLPILLI")
         ,new ForEachCursor("T00BC24", "SELECT EmprCod, SolPilCod, SolPilLin FROM TXPLPILLI WHERE EmprCod = ? and SolPilCod = ? ORDER BY EmprCod, SolPilCod, SolPilLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BC25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[25])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 15);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((int[]) buf[54])[0] = rslt.getInt(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
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
               ((String[]) buf[25])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 15);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((int[]) buf[54])[0] = rslt.getInt(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
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
               ((String[]) buf[29])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 15);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 10);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 20);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 10);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 3);
               ((int[]) buf[58])[0] = rslt.getInt(31);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 23 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
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
                  stmt.setString(14, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 20);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 6);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[40]).byteValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 15);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 20);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 10);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 20);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 10);
               }
               stmt.setString(28, (String)parms[53], 3);
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[55]).intValue());
               }
               return;
            case 12 :
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
                  stmt.setString(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 20);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 6);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 15);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 20);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 10);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 20);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 10);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[53]).intValue());
               }
               stmt.setString(28, (String)parms[54], 3);
               stmt.setInt(29, ((Number) parms[55]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
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
            case 15 :
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
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 19 :
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
            case 20 :
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
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

