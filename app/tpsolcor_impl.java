package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpsolcor_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action28") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1348SolColCod = (int)(GXutil.lval( httpContext.GetPar( "SolColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_28_1IA188( Gx_mode, A396EmprCod, A1348SolColCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
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
         A1346SolColCliC = (int)(GXutil.lval( httpContext.GetPar( "SolColCliC"))) ;
         n1346SolColCliC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         A1352SolColMat = httpContext.GetPar( "SolColMat") ;
         n1352SolColMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
         A1358SolColTip = (short)(GXutil.lval( httpContext.GetPar( "SolColTip"))) ;
         n1358SolColTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         A1356SolColSer = httpContext.GetPar( "SolColSer") ;
         n1356SolColSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
         A1349SolColDisN = httpContext.GetPar( "SolColDisN") ;
         n1349SolColDisN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
         A1353SolColNom = httpContext.GetPar( "SolColNom") ;
         n1353SolColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
         A1354SolColNum = (int)(GXutil.lval( httpContext.GetPar( "SolColNum"))) ;
         n1354SolColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         A1347SolColCliN = httpContext.GetPar( "SolColCliN") ;
         n1347SolColCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
         A3195SolColRef = httpContext.GetPar( "SolColRef") ;
         n3195SolColRef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_1IA188( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1346SolColCliC, A1352SolColMat, A1358SolColTip, A1356SolColSer, A1349SolColDisN, A1353SolColNom, A1354SolColNum, A1347SolColCliN, A3195SolColRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3188SolColMaq = httpContext.GetPar( "SolColMaq") ;
         n3188SolColMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
         AV19FlagM = (byte)(GXutil.lval( httpContext.GetPar( "FlagM"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_1IA188( A396EmprCod, A3188SolColMaq, AV19FlagM) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
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
         xc_32_1IA188( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV41FlagCal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
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
         AV58FlagHdr = (byte)(GXutil.lval( httpContext.GetPar( "FlagHdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58FlagHdr", GXutil.str( AV58FlagHdr, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_1IA188( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV58FlagHdr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_42") == 0 )
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
         gxload_42( A396EmprCod, A652OpeCod) ;
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
            AV62BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarCod), 8, 0));
            AV63BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63BarCodReo", GXutil.str( AV63BarCodReo, 1, 0));
            AV64BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64BarCodPar", AV64BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Llamada con parametro", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSolColCod_Internalname ;
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
      nRC_GXsfl_190 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_190"))) ;
      nGXsfl_190_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_190_idx"))) ;
      sGXsfl_190_idx = httpContext.GetPar( "sGXsfl_190_idx") ;
      A1359SolColUlin = (byte)(GXutil.lval( httpContext.GetPar( "SolColUlin"))) ;
      n1359SolColUlin = false ;
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

   public tpsolcor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpsolcor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpsolcor_impl.class ));
   }

   public tpsolcor_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpSOLCOR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero de Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1348SolColCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1348SolColCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1348SolColCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColCod_Jsonclick, 0, "", "", "", "", "", 1, edtSolColCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia Serie", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColMat_Internalname, GXutil.rtrim( A1352SolColMat), GXutil.rtrim( localUtil.format( A1352SolColMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColMat_Jsonclick, 0, "", "", "", "", "", 1, edtSolColMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColSer_Internalname, GXutil.rtrim( A1356SolColSer), GXutil.rtrim( localUtil.format( A1356SolColSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColSer_Jsonclick, 0, "", "", "", "", "", 1, edtSolColSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo de Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColTip_Internalname, GXutil.ltrim( localUtil.ntoc( A1358SolColTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1358SolColTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1358SolColTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColTip_Jsonclick, 0, "", "", "", "", "", 1, edtSolColTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColDisN_Internalname, GXutil.rtrim( A1349SolColDisN), GXutil.rtrim( localUtil.format( A1349SolColDisN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColDisN_Jsonclick, 0, "", "", "", "", "", 1, edtSolColDisN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColNom_Internalname, GXutil.rtrim( A1353SolColNom), GXutil.rtrim( localUtil.format( A1353SolColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColNom_Jsonclick, 0, "", "", "", "", "", 1, edtSolColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A1354SolColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1354SolColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1354SolColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColNum_Jsonclick, 0, "", "", "", "", "", 1, edtSolColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Test", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSolColFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColFec_Internalname, localUtil.format(A1350SolColFec, "99/99/99"), localUtil.format( A1350SolColFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColFec_Jsonclick, 0, "", "", "", "", "", 1, edtSolColFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSolColFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSolColFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Norma Iso", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColNor_Internalname, GXutil.rtrim( A3187SolColNor), GXutil.rtrim( localUtil.format( A3187SolColNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColNor_Jsonclick, 0, "", "", "", "", "", 1, edtSolColNor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColMaq_Internalname, GXutil.rtrim( A3188SolColMaq), GXutil.rtrim( localUtil.format( A3188SolColMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColMaq_Jsonclick, 0, "", "", "", "", "", 1, edtSolColMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Valor fibra Tac(Poliamida)", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColTac_Internalname, GXutil.rtrim( A3189SolColTac), GXutil.rtrim( localUtil.format( A3189SolColTac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColTac_Jsonclick, 0, "", "", "", "", "", 1, edtSolColTac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Valor Fibra Coto", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColCo_Internalname, GXutil.rtrim( A3190SolColCo), GXutil.rtrim( localUtil.format( A3190SolColCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColCo_Jsonclick, 0, "", "", "", "", "", 1, edtSolColCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Valor Fibra Pa6", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColPa6_Internalname, GXutil.rtrim( A3191SolColPa6), GXutil.rtrim( localUtil.format( A3191SolColPa6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColPa6_Jsonclick, 0, "", "", "", "", "", 1, edtSolColPa6_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Valor Fibra Pes", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColPes_Internalname, GXutil.rtrim( A3192SolColPes), GXutil.rtrim( localUtil.format( A3192SolColPes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColPes_Jsonclick, 0, "", "", "", "", "", 1, edtSolColPes_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Valor Fibra Pac", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColPac_Internalname, GXutil.rtrim( A3193SolColPac), GXutil.rtrim( localUtil.format( A3193SolColPac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColPac_Jsonclick, 0, "", "", "", "", "", 1, edtSolColPac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Valor Fibra Wool", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColWo_Internalname, GXutil.rtrim( A3194SolColWo), GXutil.rtrim( localUtil.format( A3194SolColWo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColWo_Jsonclick, 0, "", "", "", "", "", 1, edtSolColWo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "SolColCliCod", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A1346SolColCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColCliC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1346SolColCliC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1346SolColCliC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColCliC_Jsonclick, 0, "", "", "", "", "", 1, edtSolColCliC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Nombre Clliente", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColCliN_Internalname, GXutil.rtrim( A1347SolColCliN), GXutil.rtrim( localUtil.format( A1347SolColCliN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColCliN_Jsonclick, 0, "", "", "", "", "", 1, edtSolColCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Solidez del Color", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColSol_Internalname, GXutil.rtrim( A1357SolColSol), GXutil.rtrim( localUtil.format( A1357SolColSol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColSol_Jsonclick, 0, "", "", "", "", "", 1, edtSolColSol_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Alteracion del Color en Grados", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColAlt_Internalname, GXutil.rtrim( A1345SolColAlt), GXutil.rtrim( localUtil.format( A1345SolColAlt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColAlt_Jsonclick, 0, "", "", "", "", "", 1, edtSolColAlt_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Ultima Linea de Observaciones", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A1359SolColUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1359SolColUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1359SolColUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColUlin_Jsonclick, 0, "", "", "", "", "", 1, edtSolColUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "SolColRef", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColRef_Internalname, GXutil.rtrim( A3195SolColRef), GXutil.rtrim( localUtil.format( A3195SolColRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColRef_Jsonclick, 0, "", "", "", "", "", 1, edtSolColRef_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Temperatura", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColTmp_Internalname, GXutil.ltrim( localUtil.ntoc( A10918SolColTmp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColTmp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10918SolColTmp), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10918SolColTmp), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColTmp_Jsonclick, 0, "", "", "", "", "", 1, edtSolColTmp_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Rq Minimo", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColRqM_Internalname, GXutil.rtrim( A11803SolColRqM), GXutil.rtrim( localUtil.format( A11803SolColRqM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColRqM_Jsonclick, 0, "", "", "", "", "", 1, edtSolColRqM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Evaulacion 0 fallo 1 ok", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColSt_Internalname, GXutil.ltrim( localUtil.ntoc( A11804SolColSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11804SolColSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11804SolColSt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColSt_Jsonclick, 0, "", "", "", "", "", 1, edtSolColSt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Esferas", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColEsfe_Internalname, GXutil.rtrim( A11924SolColEsfe), GXutil.rtrim( localUtil.format( A11924SolColEsfe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColEsfe_Jsonclick, 0, "", "", "", "", "", 1, edtSolColEsfe_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Metodo", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColMetd_Internalname, GXutil.rtrim( A11925SolColMetd), GXutil.rtrim( localUtil.format( A11925SolColMetd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColMetd_Jsonclick, 0, "", "", "", "", "", 1, edtSolColMetd_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol190( ) ;
      nGXsfl_190_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount189 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_189 = (short)(1) ;
            scanStart1IA189( ) ;
            while ( RcdFound189 != 0 )
            {
               init_level_properties189( ) ;
               getByPrimaryKey1IA189( ) ;
               addRow1IA189( ) ;
               scanNext1IA189( ) ;
            }
            scanEnd1IA189( ) ;
            nBlankRcdCount189 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1359SolColUlin = A1359SolColUlin ;
         n1359SolColUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         standaloneNotModal1IA189( ) ;
         standaloneModal1IA189( ) ;
         sMode189 = Gx_mode ;
         while ( nGXsfl_190_idx < nRC_GXsfl_190 )
         {
            bGXsfl_190_Refreshing = true ;
            readRow1IA189( ) ;
            edtavnRcdDeleted_189_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_189_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_189_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_189_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            edtSolColLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLCOLLIN_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            edtSolColObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLCOLOBS_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolColObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColObs_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            if ( ( nRcdExists_189 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1IA189( ) ;
            }
            sendRow1IA189( ) ;
            bGXsfl_190_Refreshing = false ;
         }
         Gx_mode = sMode189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1359SolColUlin = B1359SolColUlin ;
         n1359SolColUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount189 = (short)(5) ;
         nRcdExists_189 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1IA189( ) ;
            while ( RcdFound189 != 0 )
            {
               sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_190189( ) ;
               init_level_properties189( ) ;
               standaloneNotModal1IA189( ) ;
               getByPrimaryKey1IA189( ) ;
               standaloneModal1IA189( ) ;
               addRow1IA189( ) ;
               scanNext1IA189( ) ;
            }
            scanEnd1IA189( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode189 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_190189( ) ;
      initAll1IA189( ) ;
      init_level_properties189( ) ;
      B1359SolColUlin = A1359SolColUlin ;
      n1359SolColUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      nRcdExists_189 = (short)(0) ;
      nIsMod_189 = (short)(0) ;
      nRcdDeleted_189 = (short)(0) ;
      nBlankRcdCount189 = (short)(nBlankRcdUsr189+nBlankRcdCount189) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount189 > 0 )
      {
         standaloneNotModal1IA189( ) ;
         standaloneModal1IA189( ) ;
         addRow1IA189( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtSolColLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount189 = (short)(nBlankRcdCount189-1) ;
      }
      Gx_mode = sMode189 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1359SolColUlin = B1359SolColUlin ;
      n1359SolColUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpSOLCOR.htm");
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
      e111IA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1348SolColCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1348SolColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z1352SolColMat = httpContext.cgiGet( "Z1352SolColMat") ;
            Z1356SolColSer = httpContext.cgiGet( "Z1356SolColSer") ;
            Z1358SolColTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z1358SolColTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1349SolColDisN = httpContext.cgiGet( "Z1349SolColDisN") ;
            Z1353SolColNom = httpContext.cgiGet( "Z1353SolColNom") ;
            Z1354SolColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z1354SolColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1350SolColFec = localUtil.ctod( httpContext.cgiGet( "Z1350SolColFec"), 0) ;
            Z3187SolColNor = httpContext.cgiGet( "Z3187SolColNor") ;
            Z3188SolColMaq = httpContext.cgiGet( "Z3188SolColMaq") ;
            Z3189SolColTac = httpContext.cgiGet( "Z3189SolColTac") ;
            Z3190SolColCo = httpContext.cgiGet( "Z3190SolColCo") ;
            Z3191SolColPa6 = httpContext.cgiGet( "Z3191SolColPa6") ;
            Z3192SolColPes = httpContext.cgiGet( "Z3192SolColPes") ;
            Z3193SolColPac = httpContext.cgiGet( "Z3193SolColPac") ;
            Z3194SolColWo = httpContext.cgiGet( "Z3194SolColWo") ;
            Z1346SolColCliC = (int)(localUtil.ctol( httpContext.cgiGet( "Z1346SolColCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1347SolColCliN = httpContext.cgiGet( "Z1347SolColCliN") ;
            Z1357SolColSol = httpContext.cgiGet( "Z1357SolColSol") ;
            Z1345SolColAlt = httpContext.cgiGet( "Z1345SolColAlt") ;
            Z1359SolColUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1359SolColUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3195SolColRef = httpContext.cgiGet( "Z3195SolColRef") ;
            Z10918SolColTmp = (short)(localUtil.ctol( httpContext.cgiGet( "Z10918SolColTmp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11803SolColRqM = httpContext.cgiGet( "Z11803SolColRqM") ;
            Z11804SolColSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11804SolColSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11924SolColEsfe = httpContext.cgiGet( "Z11924SolColEsfe") ;
            Z11925SolColMetd = httpContext.cgiGet( "Z11925SolColMetd") ;
            Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1359SolColUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "O1359SolColUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_190 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_190"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV62BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV63BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV64BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41FlagCal = (int)(localUtil.ctol( httpContext.cgiGet( "vFLAGCAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            AV19FlagM = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV58FlagHdr = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGHDR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSolColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1348SolColCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
            }
            else
            {
               A1348SolColCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSolColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
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
            A1352SolColMat = httpContext.cgiGet( edtSolColMat_Internalname) ;
            n1352SolColMat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
            A1356SolColSer = httpContext.cgiGet( edtSolColSer_Internalname) ;
            n1356SolColSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
            A1358SolColTip = (short)(localUtil.ctol( httpContext.cgiGet( edtSolColTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1358SolColTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
            A1349SolColDisN = httpContext.cgiGet( edtSolColDisN_Internalname) ;
            n1349SolColDisN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
            A1353SolColNom = httpContext.cgiGet( edtSolColNom_Internalname) ;
            n1353SolColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
            A1354SolColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtSolColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1354SolColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtSolColFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SOLCOLFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSolColFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1350SolColFec = GXutil.nullDate() ;
               n1350SolColFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
            }
            else
            {
               A1350SolColFec = localUtil.ctod( httpContext.cgiGet( edtSolColFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n1350SolColFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
            }
            A3187SolColNor = httpContext.cgiGet( edtSolColNor_Internalname) ;
            n3187SolColNor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3187SolColNor", A3187SolColNor);
            A3188SolColMaq = httpContext.cgiGet( edtSolColMaq_Internalname) ;
            n3188SolColMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
            A3189SolColTac = httpContext.cgiGet( edtSolColTac_Internalname) ;
            n3189SolColTac = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3189SolColTac", A3189SolColTac);
            A3190SolColCo = httpContext.cgiGet( edtSolColCo_Internalname) ;
            n3190SolColCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3190SolColCo", A3190SolColCo);
            A3191SolColPa6 = httpContext.cgiGet( edtSolColPa6_Internalname) ;
            n3191SolColPa6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3191SolColPa6", A3191SolColPa6);
            A3192SolColPes = httpContext.cgiGet( edtSolColPes_Internalname) ;
            n3192SolColPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3192SolColPes", A3192SolColPes);
            A3193SolColPac = httpContext.cgiGet( edtSolColPac_Internalname) ;
            n3193SolColPac = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3193SolColPac", A3193SolColPac);
            A3194SolColWo = httpContext.cgiGet( edtSolColWo_Internalname) ;
            n3194SolColWo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3194SolColWo", A3194SolColWo);
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
            A1346SolColCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtSolColCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1346SolColCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
            A1347SolColCliN = httpContext.cgiGet( edtSolColCliN_Internalname) ;
            n1347SolColCliN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
            A1357SolColSol = httpContext.cgiGet( edtSolColSol_Internalname) ;
            n1357SolColSol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1357SolColSol", A1357SolColSol);
            A1345SolColAlt = httpContext.cgiGet( edtSolColAlt_Internalname) ;
            n1345SolColAlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1345SolColAlt", A1345SolColAlt);
            A1359SolColUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolColUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1359SolColUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
            A3195SolColRef = httpContext.cgiGet( edtSolColRef_Internalname) ;
            n3195SolColRef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolColTmp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolColTmp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLCOLTMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSolColTmp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10918SolColTmp = (short)(0) ;
               n10918SolColTmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
            }
            else
            {
               A10918SolColTmp = (short)(localUtil.ctol( httpContext.cgiGet( edtSolColTmp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10918SolColTmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
            }
            A11803SolColRqM = httpContext.cgiGet( edtSolColRqM_Internalname) ;
            n11803SolColRqM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolColSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolColSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLCOLST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSolColSt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11804SolColSt = (byte)(0) ;
               n11804SolColSt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
            }
            else
            {
               A11804SolColSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolColSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11804SolColSt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
            }
            A11924SolColEsfe = httpContext.cgiGet( edtSolColEsfe_Internalname) ;
            n11924SolColEsfe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", A11924SolColEsfe);
            A11925SolColMetd = httpContext.cgiGet( edtSolColMetd_Internalname) ;
            n11925SolColMetd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
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
               A1348SolColCod = (int)(GXutil.lval( httpContext.GetPar( "SolColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
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
                        e111IA2 ();
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
            initAll1IA188( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_189_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_189_Enabled), 5, 0), !bGXsfl_190_Refreshing);
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
      disableAttributes1IA188( ) ;
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

   public void confirm_1IA0( )
   {
      beforeValidate1IA188( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IA188( ) ;
         }
         else
         {
            checkExtendedTable1IA188( ) ;
            if ( AnyError == 0 )
            {
               zm1IA188( 41) ;
               zm1IA188( 42) ;
            }
            closeExtendedTableCursors1IA188( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode188 = Gx_mode ;
         confirm_1IA189( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode188 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode188 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1IA0( ) ;
      }
   }

   public void confirm_1IA189( )
   {
      s1359SolColUlin = O1359SolColUlin ;
      n1359SolColUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      nGXsfl_190_idx = 0 ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         readRow1IA189( ) ;
         if ( ( nRcdExists_189 != 0 ) || ( nIsMod_189 != 0 ) )
         {
            getKey1IA189( ) ;
            if ( ( nRcdExists_189 == 0 ) && ( nRcdDeleted_189 == 0 ) )
            {
               if ( RcdFound189 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1IA189( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1IA189( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1IA189( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1359SolColUlin = A1359SolColUlin ;
                     n1359SolColUlin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "SOLCOLLIN_" + sGXsfl_190_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSolColLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound189 != 0 )
               {
                  if ( nRcdDeleted_189 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1IA189( ) ;
                     load1IA189( ) ;
                     beforeValidate1IA189( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1IA189( ) ;
                        O1359SolColUlin = A1359SolColUlin ;
                        n1359SolColUlin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_189 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1IA189( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1IA189( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1IA189( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1359SolColUlin = A1359SolColUlin ;
                           n1359SolColUlin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_189 == 0 )
                  {
                     GXCCtl = "SOLCOLLIN_" + sGXsfl_190_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolColLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_189_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolColLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1351SolColLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolColObs_Internalname, GXutil.rtrim( A1355SolColObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1351SolColLin_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( Z1351SolColLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1355SolColObs_"+sGXsfl_190_idx, GXutil.rtrim( Z1355SolColObs)) ;
         httpContext.changePostValue( "nRcdDeleted_189_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_189_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_189_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_189 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_189_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_189_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLCOLLIN_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLCOLOBS_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1359SolColUlin = s1359SolColUlin ;
      n1359SolColUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1IA0( )
   {
   }

   public void e111IA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      tpsolcor_impl.this.A396EmprCod = GXv_char1[0] ;
      tpsolcor_impl.this.AV16EmprNom = GXv_char2[0] ;
      tpsolcor_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV21LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char4 = AV20Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char4 = AV35Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1098_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV35Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit4", AV35Lit4);
      GXt_char4 = AV38Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV38Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit7", AV38Lit7);
      GXt_char4 = AV46LitSer ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "BARSER", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV46LitSer = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46LitSer", AV46LitSer);
      GXt_char4 = AV48LitCli ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV48LitCli = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48LitCli", AV48LitCli);
      GXt_char4 = AV47LitMat ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV47LitMat = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47LitMat", AV47LitMat);
      GXt_char4 = AV44LitNTest ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT374_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV44LitNTest = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44LitNTest", AV44LitNTest);
      GXt_char4 = AV45LitFTest ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT310_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV45LitFTest = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45LitFTest", AV45LitFTest);
      GXt_char4 = AV43LitHDR ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT171_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV43LitHDR = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43LitHDR", AV43LitHDR);
      GXt_char4 = AV50LitNorma ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA005", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV50LitNorma = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50LitNorma", AV50LitNorma);
      GXt_char4 = AV49LitMaq ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV49LitMaq = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49LitMaq", AV49LitMaq);
      GXt_char4 = AV51LitResul ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT184_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV51LitResul = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51LitResul", AV51LitResul);
      GXt_char4 = AV56LitOper ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV56LitOper = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56LitOper", AV56LitOper);
      GXt_char4 = AV57LitObser ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT185_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV57LitObser = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57LitObser", AV57LitObser);
      GXt_char4 = AV52LitTit ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA019", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV52LitTit = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52LitTit", AV52LitTit);
      GXt_char4 = AV42LitRef ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2402_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV42LitRef = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42LitRef", AV42LitRef);
      GXt_char4 = AV53LitMancha ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA007", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV53LitMancha = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53LitMancha", AV53LitMancha);
      AV54LitMancha2 = GXutil.trim( AV53LitMancha) + " -> " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54LitMancha2", AV54LitMancha2);
      GXt_char4 = AV55LitAltCol ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA006", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV55LitAltCol = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55LitAltCol", AV55LitAltCol);
      GXt_char4 = AV56LitOper ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV56LitOper = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56LitOper", AV56LitOper);
      GXt_char4 = AV57LitObser ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT185_", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV57LitObser = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57LitObser", AV57LitObser);
      GXt_char4 = AV59LitTmp ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "TEMPERATURA", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV59LitTmp = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59LitTmp", AV59LitTmp);
      GXt_char4 = AV60Lit200 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "SOLCOR001", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV60Lit200 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Lit200", AV60Lit200);
      GXt_char4 = AV61Lit202 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "SOLCOR003", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV61Lit202 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Lit202", AV61Lit202);
      GXt_char4 = AV65Lit203 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "SOLCOR004", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV65Lit203 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Lit203", AV65Lit203);
      GXt_char4 = AV66Lit204 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "SOLCOR005", ""), (byte)(99), GXv_char3) ;
      tpsolcor_impl.this.GXt_char4 = GXv_char3[0] ;
      AV66Lit204 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Lit204", AV66Lit204);
   }

   public void zm1IA188( int GX_JID )
   {
      if ( ( GX_JID == 40 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z129BarCod = T01IA5_A129BarCod[0] ;
            Z132BarCodReo = T01IA5_A132BarCodReo[0] ;
            Z130BarCodPar = T01IA5_A130BarCodPar[0] ;
            Z1352SolColMat = T01IA5_A1352SolColMat[0] ;
            Z1356SolColSer = T01IA5_A1356SolColSer[0] ;
            Z1358SolColTip = T01IA5_A1358SolColTip[0] ;
            Z1349SolColDisN = T01IA5_A1349SolColDisN[0] ;
            Z1353SolColNom = T01IA5_A1353SolColNom[0] ;
            Z1354SolColNum = T01IA5_A1354SolColNum[0] ;
            Z1350SolColFec = T01IA5_A1350SolColFec[0] ;
            Z3187SolColNor = T01IA5_A3187SolColNor[0] ;
            Z3188SolColMaq = T01IA5_A3188SolColMaq[0] ;
            Z3189SolColTac = T01IA5_A3189SolColTac[0] ;
            Z3190SolColCo = T01IA5_A3190SolColCo[0] ;
            Z3191SolColPa6 = T01IA5_A3191SolColPa6[0] ;
            Z3192SolColPes = T01IA5_A3192SolColPes[0] ;
            Z3193SolColPac = T01IA5_A3193SolColPac[0] ;
            Z3194SolColWo = T01IA5_A3194SolColWo[0] ;
            Z1346SolColCliC = T01IA5_A1346SolColCliC[0] ;
            Z1347SolColCliN = T01IA5_A1347SolColCliN[0] ;
            Z1357SolColSol = T01IA5_A1357SolColSol[0] ;
            Z1345SolColAlt = T01IA5_A1345SolColAlt[0] ;
            Z1359SolColUlin = T01IA5_A1359SolColUlin[0] ;
            Z3195SolColRef = T01IA5_A3195SolColRef[0] ;
            Z10918SolColTmp = T01IA5_A10918SolColTmp[0] ;
            Z11803SolColRqM = T01IA5_A11803SolColRqM[0] ;
            Z11804SolColSt = T01IA5_A11804SolColSt[0] ;
            Z11924SolColEsfe = T01IA5_A11924SolColEsfe[0] ;
            Z11925SolColMetd = T01IA5_A11925SolColMetd[0] ;
            Z652OpeCod = T01IA5_A652OpeCod[0] ;
         }
         else
         {
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z1352SolColMat = A1352SolColMat ;
            Z1356SolColSer = A1356SolColSer ;
            Z1358SolColTip = A1358SolColTip ;
            Z1349SolColDisN = A1349SolColDisN ;
            Z1353SolColNom = A1353SolColNom ;
            Z1354SolColNum = A1354SolColNum ;
            Z1350SolColFec = A1350SolColFec ;
            Z3187SolColNor = A3187SolColNor ;
            Z3188SolColMaq = A3188SolColMaq ;
            Z3189SolColTac = A3189SolColTac ;
            Z3190SolColCo = A3190SolColCo ;
            Z3191SolColPa6 = A3191SolColPa6 ;
            Z3192SolColPes = A3192SolColPes ;
            Z3193SolColPac = A3193SolColPac ;
            Z3194SolColWo = A3194SolColWo ;
            Z1346SolColCliC = A1346SolColCliC ;
            Z1347SolColCliN = A1347SolColCliN ;
            Z1357SolColSol = A1357SolColSol ;
            Z1345SolColAlt = A1345SolColAlt ;
            Z1359SolColUlin = A1359SolColUlin ;
            Z3195SolColRef = A3195SolColRef ;
            Z10918SolColTmp = A10918SolColTmp ;
            Z11803SolColRqM = A11803SolColRqM ;
            Z11804SolColSt = A11804SolColSt ;
            Z11924SolColEsfe = A11924SolColEsfe ;
            Z11925SolColMetd = A11925SolColMetd ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -40 )
      {
         Z1348SolColCod = A1348SolColCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1352SolColMat = A1352SolColMat ;
         Z1356SolColSer = A1356SolColSer ;
         Z1358SolColTip = A1358SolColTip ;
         Z1349SolColDisN = A1349SolColDisN ;
         Z1353SolColNom = A1353SolColNom ;
         Z1354SolColNum = A1354SolColNum ;
         Z1350SolColFec = A1350SolColFec ;
         Z3187SolColNor = A3187SolColNor ;
         Z3188SolColMaq = A3188SolColMaq ;
         Z3189SolColTac = A3189SolColTac ;
         Z3190SolColCo = A3190SolColCo ;
         Z3191SolColPa6 = A3191SolColPa6 ;
         Z3192SolColPes = A3192SolColPes ;
         Z3193SolColPac = A3193SolColPac ;
         Z3194SolColWo = A3194SolColWo ;
         Z1346SolColCliC = A1346SolColCliC ;
         Z1347SolColCliN = A1347SolColCliN ;
         Z1357SolColSol = A1357SolColSol ;
         Z1345SolColAlt = A1345SolColAlt ;
         Z1359SolColUlin = A1359SolColUlin ;
         Z3195SolColRef = A3195SolColRef ;
         Z10918SolColTmp = A10918SolColTmp ;
         Z11803SolColRqM = A11803SolColRqM ;
         Z11804SolColSt = A11804SolColSt ;
         Z11924SolColEsfe = A11924SolColEsfe ;
         Z11925SolColMetd = A11925SolColMetd ;
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
      edtSolColCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColCliC_Enabled), 5, 0), true);
      edtSolColCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColCliN_Enabled), 5, 0), true);
      edtSolColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColNom_Enabled), 5, 0), true);
      edtSolColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColNum_Enabled), 5, 0), true);
      edtSolColDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColDisN_Enabled), 5, 0), true);
      edtSolColMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColMat_Enabled), 5, 0), true);
      edtSolColTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColTip_Enabled), 5, 0), true);
      edtSolColSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColSer_Enabled), 5, 0), true);
      edtSolColUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColUlin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolColCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColCliC_Enabled), 5, 0), true);
      edtSolColCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColCliN_Enabled), 5, 0), true);
      edtSolColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColNom_Enabled), 5, 0), true);
      edtSolColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColNum_Enabled), 5, 0), true);
      edtSolColDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColDisN_Enabled), 5, 0), true);
      edtSolColMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColMat_Enabled), 5, 0), true);
      edtSolColTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColTip_Enabled), 5, 0), true);
      edtSolColSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColSer_Enabled), 5, 0), true);
      edtSolColUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColUlin_Enabled), 5, 0), true);
      /* Using cursor T01IA6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IA6_A407EmprNom[0] ;
      n407EmprNom = T01IA6_n407EmprNom[0] ;
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
      A130BarCodPar = AV64BarCodPar ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A132BarCodReo = AV63BarCodReo ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A129BarCod = AV62BarCod ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A1350SolColFec)) && ( Gx_BScreen == 0 ) )
      {
         A1350SolColFec = GXutil.today( ) ;
         n1350SolColFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
      }
      if ( isIns( )  && (0==A10918SolColTmp) && ( Gx_BScreen == 0 ) )
      {
         A10918SolColTmp = (short)(40) ;
         n10918SolColTmp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
      }
      if ( isIns( )  && (0==A11804SolColSt) && ( Gx_BScreen == 0 ) )
      {
         A11804SolColSt = (byte)(1) ;
         n11804SolColSt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11925SolColMetd)==0) && ( Gx_BScreen == 0 ) )
      {
         A11925SolColMetd = httpContext.getMessage( httpContext.getMessage( "NEXT MET 2", ""), "") ;
         n11925SolColMetd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11803SolColRqM)==0) && ( Gx_BScreen == 0 ) )
      {
         A11803SolColRqM = "4" ;
         n11803SolColRqM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
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
      }
   }

   public void load1IA188( )
   {
      /* Using cursor T01IA8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound188 = (short)(1) ;
         A129BarCod = T01IA8_A129BarCod[0] ;
         n129BarCod = T01IA8_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01IA8_A132BarCodReo[0] ;
         n132BarCodReo = T01IA8_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01IA8_A130BarCodPar[0] ;
         n130BarCodPar = T01IA8_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A407EmprNom = T01IA8_A407EmprNom[0] ;
         n407EmprNom = T01IA8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1352SolColMat = T01IA8_A1352SolColMat[0] ;
         n1352SolColMat = T01IA8_n1352SolColMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
         A1356SolColSer = T01IA8_A1356SolColSer[0] ;
         n1356SolColSer = T01IA8_n1356SolColSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
         A1358SolColTip = T01IA8_A1358SolColTip[0] ;
         n1358SolColTip = T01IA8_n1358SolColTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         A1349SolColDisN = T01IA8_A1349SolColDisN[0] ;
         n1349SolColDisN = T01IA8_n1349SolColDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
         A1353SolColNom = T01IA8_A1353SolColNom[0] ;
         n1353SolColNom = T01IA8_n1353SolColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
         A1354SolColNum = T01IA8_A1354SolColNum[0] ;
         n1354SolColNum = T01IA8_n1354SolColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         A1350SolColFec = T01IA8_A1350SolColFec[0] ;
         n1350SolColFec = T01IA8_n1350SolColFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
         A3187SolColNor = T01IA8_A3187SolColNor[0] ;
         n3187SolColNor = T01IA8_n3187SolColNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3187SolColNor", A3187SolColNor);
         A3188SolColMaq = T01IA8_A3188SolColMaq[0] ;
         n3188SolColMaq = T01IA8_n3188SolColMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
         A3189SolColTac = T01IA8_A3189SolColTac[0] ;
         n3189SolColTac = T01IA8_n3189SolColTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3189SolColTac", A3189SolColTac);
         A3190SolColCo = T01IA8_A3190SolColCo[0] ;
         n3190SolColCo = T01IA8_n3190SolColCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3190SolColCo", A3190SolColCo);
         A3191SolColPa6 = T01IA8_A3191SolColPa6[0] ;
         n3191SolColPa6 = T01IA8_n3191SolColPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3191SolColPa6", A3191SolColPa6);
         A3192SolColPes = T01IA8_A3192SolColPes[0] ;
         n3192SolColPes = T01IA8_n3192SolColPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3192SolColPes", A3192SolColPes);
         A3193SolColPac = T01IA8_A3193SolColPac[0] ;
         n3193SolColPac = T01IA8_n3193SolColPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3193SolColPac", A3193SolColPac);
         A3194SolColWo = T01IA8_A3194SolColWo[0] ;
         n3194SolColWo = T01IA8_n3194SolColWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3194SolColWo", A3194SolColWo);
         A653OpeNom = T01IA8_A653OpeNom[0] ;
         n653OpeNom = T01IA8_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A1346SolColCliC = T01IA8_A1346SolColCliC[0] ;
         n1346SolColCliC = T01IA8_n1346SolColCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         A1347SolColCliN = T01IA8_A1347SolColCliN[0] ;
         n1347SolColCliN = T01IA8_n1347SolColCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
         A1357SolColSol = T01IA8_A1357SolColSol[0] ;
         n1357SolColSol = T01IA8_n1357SolColSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1357SolColSol", A1357SolColSol);
         A1345SolColAlt = T01IA8_A1345SolColAlt[0] ;
         n1345SolColAlt = T01IA8_n1345SolColAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1345SolColAlt", A1345SolColAlt);
         A1359SolColUlin = T01IA8_A1359SolColUlin[0] ;
         n1359SolColUlin = T01IA8_n1359SolColUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         A3195SolColRef = T01IA8_A3195SolColRef[0] ;
         n3195SolColRef = T01IA8_n3195SolColRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
         A10918SolColTmp = T01IA8_A10918SolColTmp[0] ;
         n10918SolColTmp = T01IA8_n10918SolColTmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
         A11803SolColRqM = T01IA8_A11803SolColRqM[0] ;
         n11803SolColRqM = T01IA8_n11803SolColRqM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
         A11804SolColSt = T01IA8_A11804SolColSt[0] ;
         n11804SolColSt = T01IA8_n11804SolColSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
         A11924SolColEsfe = T01IA8_A11924SolColEsfe[0] ;
         n11924SolColEsfe = T01IA8_n11924SolColEsfe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", A11924SolColEsfe);
         A11925SolColMetd = T01IA8_A11925SolColMetd[0] ;
         n11925SolColMetd = T01IA8_n11925SolColMetd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
         A652OpeCod = T01IA8_A652OpeCod[0] ;
         n652OpeCod = T01IA8_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zm1IA188( -40) ;
      }
      pr_default.close(6);
      onLoadActions1IA188( ) ;
   }

   public void onLoadActions1IA188( )
   {
      Gx_msg = httpContext.getMessage( httpContext.getMessage( "!AVISO.Esta Hoja Ruta/Ordem Serviço ya/ja tiene/te TEST = ", ""), "") + GXutil.str( AV41FlagCal, 8, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
   }

   public void checkExtendedTable1IA188( )
   {
      nIsDirty_188 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01IA7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01IA7_A653OpeNom[0] ;
      n653OpeNom = T01IA7_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(5);
      if ( isIns( )  && ( ! (0==A1348SolColCod) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (0==A1348SolColCod) )
      {
         GXv_int5[0] = A1348SolColCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "490001", GXv_int5) ;
         tpsolcor_impl.this.A1348SolColCod = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
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
         GXv_int7[0] = A1346SolColCliC ;
         GXv_char1[0] = A1352SolColMat ;
         GXv_int8[0] = A1358SolColTip ;
         GXv_char9[0] = A1356SolColSer ;
         GXv_char10[0] = A1349SolColDisN ;
         GXv_char11[0] = A1353SolColNom ;
         GXv_int12[0] = A1354SolColNum ;
         GXv_char13[0] = A1347SolColCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int15[0] = (short)(0) ;
         GXv_char16[0] = A3195SolColRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_char1, GXv_int8, GXv_char9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_int14, GXv_int15, GXv_char16) ;
         tpsolcor_impl.this.A396EmprCod = GXv_char3[0] ;
         tpsolcor_impl.this.A129BarCod = GXv_int5[0] ;
         tpsolcor_impl.this.A132BarCodReo = GXv_int6[0] ;
         tpsolcor_impl.this.A130BarCodPar = GXv_char2[0] ;
         tpsolcor_impl.this.A1346SolColCliC = GXv_int7[0] ;
         tpsolcor_impl.this.A1352SolColMat = GXv_char1[0] ;
         tpsolcor_impl.this.A1358SolColTip = GXv_int8[0] ;
         tpsolcor_impl.this.A1356SolColSer = GXv_char9[0] ;
         tpsolcor_impl.this.A1349SolColDisN = GXv_char10[0] ;
         tpsolcor_impl.this.A1353SolColNom = GXv_char11[0] ;
         tpsolcor_impl.this.A1354SolColNum = GXv_int12[0] ;
         tpsolcor_impl.this.A1347SolColCliN = GXv_char13[0] ;
         tpsolcor_impl.this.A3195SolColRef = GXv_char16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
         httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
         httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
         httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
         httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = AV41FlagCal ;
         new app.pctrcor(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int6, GXv_char13, GXv_int7) ;
         tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
         tpsolcor_impl.this.A129BarCod = GXv_int12[0] ;
         tpsolcor_impl.this.A132BarCodReo = GXv_int6[0] ;
         tpsolcor_impl.this.A130BarCodPar = GXv_char13[0] ;
         tpsolcor_impl.this.AV41FlagCal = GXv_int7[0] ;
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
         GXv_int17[0] = AV58FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int6, GXv_char13, GXv_int17) ;
         tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
         tpsolcor_impl.this.A129BarCod = GXv_int12[0] ;
         tpsolcor_impl.this.A132BarCodReo = GXv_int6[0] ;
         tpsolcor_impl.this.A130BarCodPar = GXv_char13[0] ;
         tpsolcor_impl.this.AV58FlagHdr = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV58FlagHdr", GXutil.str( AV58FlagHdr, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ( AV58FlagHdr == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ( AV58FlagHdr == 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3188SolColMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
         tpsolcor_impl.this.A3188SolColMaq = GXv_char13[0] ;
         tpsolcor_impl.this.AV19FlagM = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A3188SolColMaq)==0) && (0==AV19FlagM) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, "SOLCOLMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolColMaq_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1IA188( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_42( String A396EmprCod ,
                          int A652OpeCod )
   {
      /* Using cursor T01IA9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01IA9_A653OpeNom[0] ;
      n653OpeNom = T01IA9_n653OpeNom[0] ;
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

   public void getKey1IA188( )
   {
      /* Using cursor T01IA10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound188 = (short)(1) ;
      }
      else
      {
         RcdFound188 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IA5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01IA5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1IA188( 40) ;
         RcdFound188 = (short)(1) ;
         A1348SolColCod = T01IA5_A1348SolColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
         A129BarCod = T01IA5_A129BarCod[0] ;
         n129BarCod = T01IA5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01IA5_A132BarCodReo[0] ;
         n132BarCodReo = T01IA5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01IA5_A130BarCodPar[0] ;
         n130BarCodPar = T01IA5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1352SolColMat = T01IA5_A1352SolColMat[0] ;
         n1352SolColMat = T01IA5_n1352SolColMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
         A1356SolColSer = T01IA5_A1356SolColSer[0] ;
         n1356SolColSer = T01IA5_n1356SolColSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
         A1358SolColTip = T01IA5_A1358SolColTip[0] ;
         n1358SolColTip = T01IA5_n1358SolColTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         A1349SolColDisN = T01IA5_A1349SolColDisN[0] ;
         n1349SolColDisN = T01IA5_n1349SolColDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
         A1353SolColNom = T01IA5_A1353SolColNom[0] ;
         n1353SolColNom = T01IA5_n1353SolColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
         A1354SolColNum = T01IA5_A1354SolColNum[0] ;
         n1354SolColNum = T01IA5_n1354SolColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         A1350SolColFec = T01IA5_A1350SolColFec[0] ;
         n1350SolColFec = T01IA5_n1350SolColFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
         A3187SolColNor = T01IA5_A3187SolColNor[0] ;
         n3187SolColNor = T01IA5_n3187SolColNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3187SolColNor", A3187SolColNor);
         A3188SolColMaq = T01IA5_A3188SolColMaq[0] ;
         n3188SolColMaq = T01IA5_n3188SolColMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
         A3189SolColTac = T01IA5_A3189SolColTac[0] ;
         n3189SolColTac = T01IA5_n3189SolColTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3189SolColTac", A3189SolColTac);
         A3190SolColCo = T01IA5_A3190SolColCo[0] ;
         n3190SolColCo = T01IA5_n3190SolColCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3190SolColCo", A3190SolColCo);
         A3191SolColPa6 = T01IA5_A3191SolColPa6[0] ;
         n3191SolColPa6 = T01IA5_n3191SolColPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3191SolColPa6", A3191SolColPa6);
         A3192SolColPes = T01IA5_A3192SolColPes[0] ;
         n3192SolColPes = T01IA5_n3192SolColPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3192SolColPes", A3192SolColPes);
         A3193SolColPac = T01IA5_A3193SolColPac[0] ;
         n3193SolColPac = T01IA5_n3193SolColPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3193SolColPac", A3193SolColPac);
         A3194SolColWo = T01IA5_A3194SolColWo[0] ;
         n3194SolColWo = T01IA5_n3194SolColWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3194SolColWo", A3194SolColWo);
         A1346SolColCliC = T01IA5_A1346SolColCliC[0] ;
         n1346SolColCliC = T01IA5_n1346SolColCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         A1347SolColCliN = T01IA5_A1347SolColCliN[0] ;
         n1347SolColCliN = T01IA5_n1347SolColCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
         A1357SolColSol = T01IA5_A1357SolColSol[0] ;
         n1357SolColSol = T01IA5_n1357SolColSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1357SolColSol", A1357SolColSol);
         A1345SolColAlt = T01IA5_A1345SolColAlt[0] ;
         n1345SolColAlt = T01IA5_n1345SolColAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1345SolColAlt", A1345SolColAlt);
         A1359SolColUlin = T01IA5_A1359SolColUlin[0] ;
         n1359SolColUlin = T01IA5_n1359SolColUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         A3195SolColRef = T01IA5_A3195SolColRef[0] ;
         n3195SolColRef = T01IA5_n3195SolColRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
         A10918SolColTmp = T01IA5_A10918SolColTmp[0] ;
         n10918SolColTmp = T01IA5_n10918SolColTmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
         A11803SolColRqM = T01IA5_A11803SolColRqM[0] ;
         n11803SolColRqM = T01IA5_n11803SolColRqM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
         A11804SolColSt = T01IA5_A11804SolColSt[0] ;
         n11804SolColSt = T01IA5_n11804SolColSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
         A11924SolColEsfe = T01IA5_A11924SolColEsfe[0] ;
         n11924SolColEsfe = T01IA5_n11924SolColEsfe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", A11924SolColEsfe);
         A11925SolColMetd = T01IA5_A11925SolColMetd[0] ;
         n11925SolColMetd = T01IA5_n11925SolColMetd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
         A652OpeCod = T01IA5_A652OpeCod[0] ;
         n652OpeCod = T01IA5_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         O1359SolColUlin = A1359SolColUlin ;
         n1359SolColUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z1348SolColCod = A1348SolColCod ;
         sMode188 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IA188( ) ;
         if ( AnyError == 1 )
         {
            RcdFound188 = (short)(0) ;
            initializeNonKey1IA188( ) ;
         }
         Gx_mode = sMode188 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound188 = (short)(0) ;
         initializeNonKey1IA188( ) ;
         sMode188 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode188 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1IA188( ) ;
      if ( RcdFound188 == 0 )
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
      RcdFound188 = (short)(0) ;
      /* Using cursor T01IA11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A1348SolColCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01IA11_A1348SolColCod[0] < A1348SolColCod ) ) && ( GXutil.strcmp(T01IA11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01IA11_A1348SolColCod[0] > A1348SolColCod ) ) && ( GXutil.strcmp(T01IA11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1348SolColCod = T01IA11_A1348SolColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
            RcdFound188 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound188 = (short)(0) ;
      /* Using cursor T01IA12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A1348SolColCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01IA12_A1348SolColCod[0] > A1348SolColCod ) ) && ( GXutil.strcmp(T01IA12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01IA12_A1348SolColCod[0] < A1348SolColCod ) ) && ( GXutil.strcmp(T01IA12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1348SolColCod = T01IA12_A1348SolColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
            RcdFound188 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IA188( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1359SolColUlin = O1359SolColUlin ;
         n1359SolColUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         GX_FocusControl = edtSolColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IA188( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound188 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1348SolColCod != Z1348SolColCod ) )
            {
               A1348SolColCod = Z1348SolColCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1359SolColUlin = O1359SolColUlin ;
               n1359SolColUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSolColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A1359SolColUlin = O1359SolColUlin ;
               n1359SolColUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
               update1IA188( ) ;
               GX_FocusControl = edtSolColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1348SolColCod != Z1348SolColCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A1359SolColUlin = O1359SolColUlin ;
               n1359SolColUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
               GX_FocusControl = edtSolColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IA188( ) ;
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
                  A1359SolColUlin = O1359SolColUlin ;
                  n1359SolColUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
                  GX_FocusControl = edtSolColCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1IA188( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1348SolColCod != Z1348SolColCod ) )
      {
         A1348SolColCod = Z1348SolColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1359SolColUlin = O1359SolColUlin ;
         n1359SolColUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSolColCod_Internalname ;
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
      getKey1IA188( ) ;
      if ( RcdFound188 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1348SolColCod != Z1348SolColCod ) )
         {
            A1348SolColCod = Z1348SolColCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1348SolColCod != Z1348SolColCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpsolcor");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IA0( ) ;
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
      if ( RcdFound188 == 0 )
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
      scanStart1IA188( ) ;
      if ( RcdFound188 == 0 )
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
      scanEnd1IA188( ) ;
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
      if ( RcdFound188 == 0 )
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
      if ( RcdFound188 == 0 )
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
      scanStart1IA188( ) ;
      if ( RcdFound188 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound188 != 0 )
         {
            scanNext1IA188( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IA188( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IA188( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCSOLCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z129BarCod != T01IA4_A129BarCod[0] ) || ( Z132BarCodReo != T01IA4_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01IA4_A130BarCodPar[0]) != 0 ) || ( GXutil.strcmp(Z1352SolColMat, T01IA4_A1352SolColMat[0]) != 0 ) || ( GXutil.strcmp(Z1356SolColSer, T01IA4_A1356SolColSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1358SolColTip != T01IA4_A1358SolColTip[0] ) || ( GXutil.strcmp(Z1349SolColDisN, T01IA4_A1349SolColDisN[0]) != 0 ) || ( GXutil.strcmp(Z1353SolColNom, T01IA4_A1353SolColNom[0]) != 0 ) || ( Z1354SolColNum != T01IA4_A1354SolColNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z1350SolColFec), GXutil.resetTime(T01IA4_A1350SolColFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3187SolColNor, T01IA4_A3187SolColNor[0]) != 0 ) || ( GXutil.strcmp(Z3188SolColMaq, T01IA4_A3188SolColMaq[0]) != 0 ) || ( GXutil.strcmp(Z3189SolColTac, T01IA4_A3189SolColTac[0]) != 0 ) || ( GXutil.strcmp(Z3190SolColCo, T01IA4_A3190SolColCo[0]) != 0 ) || ( GXutil.strcmp(Z3191SolColPa6, T01IA4_A3191SolColPa6[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3192SolColPes, T01IA4_A3192SolColPes[0]) != 0 ) || ( GXutil.strcmp(Z3193SolColPac, T01IA4_A3193SolColPac[0]) != 0 ) || ( GXutil.strcmp(Z3194SolColWo, T01IA4_A3194SolColWo[0]) != 0 ) || ( Z1346SolColCliC != T01IA4_A1346SolColCliC[0] ) || ( GXutil.strcmp(Z1347SolColCliN, T01IA4_A1347SolColCliN[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1357SolColSol, T01IA4_A1357SolColSol[0]) != 0 ) || ( GXutil.strcmp(Z1345SolColAlt, T01IA4_A1345SolColAlt[0]) != 0 ) || ( Z1359SolColUlin != T01IA4_A1359SolColUlin[0] ) || ( GXutil.strcmp(Z3195SolColRef, T01IA4_A3195SolColRef[0]) != 0 ) || ( Z10918SolColTmp != T01IA4_A10918SolColTmp[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11803SolColRqM, T01IA4_A11803SolColRqM[0]) != 0 ) || ( Z11804SolColSt != T01IA4_A11804SolColSt[0] ) || ( GXutil.strcmp(Z11924SolColEsfe, T01IA4_A11924SolColEsfe[0]) != 0 ) || ( GXutil.strcmp(Z11925SolColMetd, T01IA4_A11925SolColMetd[0]) != 0 ) || ( Z652OpeCod != T01IA4_A652OpeCod[0] ) )
         {
            if ( Z129BarCod != T01IA4_A129BarCod[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01IA4_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01IA4_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01IA4_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01IA4_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01IA4_A130BarCodPar[0]);
            }
            if ( GXutil.strcmp(Z1352SolColMat, T01IA4_A1352SolColMat[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColMat");
               GXutil.writeLogRaw("Old: ",Z1352SolColMat);
               GXutil.writeLogRaw("Current: ",T01IA4_A1352SolColMat[0]);
            }
            if ( GXutil.strcmp(Z1356SolColSer, T01IA4_A1356SolColSer[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColSer");
               GXutil.writeLogRaw("Old: ",Z1356SolColSer);
               GXutil.writeLogRaw("Current: ",T01IA4_A1356SolColSer[0]);
            }
            if ( Z1358SolColTip != T01IA4_A1358SolColTip[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColTip");
               GXutil.writeLogRaw("Old: ",Z1358SolColTip);
               GXutil.writeLogRaw("Current: ",T01IA4_A1358SolColTip[0]);
            }
            if ( GXutil.strcmp(Z1349SolColDisN, T01IA4_A1349SolColDisN[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColDisN");
               GXutil.writeLogRaw("Old: ",Z1349SolColDisN);
               GXutil.writeLogRaw("Current: ",T01IA4_A1349SolColDisN[0]);
            }
            if ( GXutil.strcmp(Z1353SolColNom, T01IA4_A1353SolColNom[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColNom");
               GXutil.writeLogRaw("Old: ",Z1353SolColNom);
               GXutil.writeLogRaw("Current: ",T01IA4_A1353SolColNom[0]);
            }
            if ( Z1354SolColNum != T01IA4_A1354SolColNum[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColNum");
               GXutil.writeLogRaw("Old: ",Z1354SolColNum);
               GXutil.writeLogRaw("Current: ",T01IA4_A1354SolColNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z1350SolColFec), GXutil.resetTime(T01IA4_A1350SolColFec[0])) ) )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColFec");
               GXutil.writeLogRaw("Old: ",Z1350SolColFec);
               GXutil.writeLogRaw("Current: ",T01IA4_A1350SolColFec[0]);
            }
            if ( GXutil.strcmp(Z3187SolColNor, T01IA4_A3187SolColNor[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColNor");
               GXutil.writeLogRaw("Old: ",Z3187SolColNor);
               GXutil.writeLogRaw("Current: ",T01IA4_A3187SolColNor[0]);
            }
            if ( GXutil.strcmp(Z3188SolColMaq, T01IA4_A3188SolColMaq[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColMaq");
               GXutil.writeLogRaw("Old: ",Z3188SolColMaq);
               GXutil.writeLogRaw("Current: ",T01IA4_A3188SolColMaq[0]);
            }
            if ( GXutil.strcmp(Z3189SolColTac, T01IA4_A3189SolColTac[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColTac");
               GXutil.writeLogRaw("Old: ",Z3189SolColTac);
               GXutil.writeLogRaw("Current: ",T01IA4_A3189SolColTac[0]);
            }
            if ( GXutil.strcmp(Z3190SolColCo, T01IA4_A3190SolColCo[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColCo");
               GXutil.writeLogRaw("Old: ",Z3190SolColCo);
               GXutil.writeLogRaw("Current: ",T01IA4_A3190SolColCo[0]);
            }
            if ( GXutil.strcmp(Z3191SolColPa6, T01IA4_A3191SolColPa6[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColPa6");
               GXutil.writeLogRaw("Old: ",Z3191SolColPa6);
               GXutil.writeLogRaw("Current: ",T01IA4_A3191SolColPa6[0]);
            }
            if ( GXutil.strcmp(Z3192SolColPes, T01IA4_A3192SolColPes[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColPes");
               GXutil.writeLogRaw("Old: ",Z3192SolColPes);
               GXutil.writeLogRaw("Current: ",T01IA4_A3192SolColPes[0]);
            }
            if ( GXutil.strcmp(Z3193SolColPac, T01IA4_A3193SolColPac[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColPac");
               GXutil.writeLogRaw("Old: ",Z3193SolColPac);
               GXutil.writeLogRaw("Current: ",T01IA4_A3193SolColPac[0]);
            }
            if ( GXutil.strcmp(Z3194SolColWo, T01IA4_A3194SolColWo[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColWo");
               GXutil.writeLogRaw("Old: ",Z3194SolColWo);
               GXutil.writeLogRaw("Current: ",T01IA4_A3194SolColWo[0]);
            }
            if ( Z1346SolColCliC != T01IA4_A1346SolColCliC[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColCliC");
               GXutil.writeLogRaw("Old: ",Z1346SolColCliC);
               GXutil.writeLogRaw("Current: ",T01IA4_A1346SolColCliC[0]);
            }
            if ( GXutil.strcmp(Z1347SolColCliN, T01IA4_A1347SolColCliN[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColCliN");
               GXutil.writeLogRaw("Old: ",Z1347SolColCliN);
               GXutil.writeLogRaw("Current: ",T01IA4_A1347SolColCliN[0]);
            }
            if ( GXutil.strcmp(Z1357SolColSol, T01IA4_A1357SolColSol[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColSol");
               GXutil.writeLogRaw("Old: ",Z1357SolColSol);
               GXutil.writeLogRaw("Current: ",T01IA4_A1357SolColSol[0]);
            }
            if ( GXutil.strcmp(Z1345SolColAlt, T01IA4_A1345SolColAlt[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColAlt");
               GXutil.writeLogRaw("Old: ",Z1345SolColAlt);
               GXutil.writeLogRaw("Current: ",T01IA4_A1345SolColAlt[0]);
            }
            if ( Z1359SolColUlin != T01IA4_A1359SolColUlin[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColUlin");
               GXutil.writeLogRaw("Old: ",Z1359SolColUlin);
               GXutil.writeLogRaw("Current: ",T01IA4_A1359SolColUlin[0]);
            }
            if ( GXutil.strcmp(Z3195SolColRef, T01IA4_A3195SolColRef[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColRef");
               GXutil.writeLogRaw("Old: ",Z3195SolColRef);
               GXutil.writeLogRaw("Current: ",T01IA4_A3195SolColRef[0]);
            }
            if ( Z10918SolColTmp != T01IA4_A10918SolColTmp[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColTmp");
               GXutil.writeLogRaw("Old: ",Z10918SolColTmp);
               GXutil.writeLogRaw("Current: ",T01IA4_A10918SolColTmp[0]);
            }
            if ( GXutil.strcmp(Z11803SolColRqM, T01IA4_A11803SolColRqM[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColRqM");
               GXutil.writeLogRaw("Old: ",Z11803SolColRqM);
               GXutil.writeLogRaw("Current: ",T01IA4_A11803SolColRqM[0]);
            }
            if ( Z11804SolColSt != T01IA4_A11804SolColSt[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColSt");
               GXutil.writeLogRaw("Old: ",Z11804SolColSt);
               GXutil.writeLogRaw("Current: ",T01IA4_A11804SolColSt[0]);
            }
            if ( GXutil.strcmp(Z11924SolColEsfe, T01IA4_A11924SolColEsfe[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColEsfe");
               GXutil.writeLogRaw("Old: ",Z11924SolColEsfe);
               GXutil.writeLogRaw("Current: ",T01IA4_A11924SolColEsfe[0]);
            }
            if ( GXutil.strcmp(Z11925SolColMetd, T01IA4_A11925SolColMetd[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColMetd");
               GXutil.writeLogRaw("Old: ",Z11925SolColMetd);
               GXutil.writeLogRaw("Current: ",T01IA4_A11925SolColMetd[0]);
            }
            if ( Z652OpeCod != T01IA4_A652OpeCod[0] )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T01IA4_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCSOLCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IA188( )
   {
      beforeValidate1IA188( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IA188( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IA188( 0) ;
         checkOptimisticConcurrency1IA188( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IA188( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IA188( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IA13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A1348SolColCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n1352SolColMat), A1352SolColMat, Boolean.valueOf(n1356SolColSer), A1356SolColSer, Boolean.valueOf(n1358SolColTip), Short.valueOf(A1358SolColTip), Boolean.valueOf(n1349SolColDisN), A1349SolColDisN, Boolean.valueOf(n1353SolColNom), A1353SolColNom, Boolean.valueOf(n1354SolColNum), Integer.valueOf(A1354SolColNum), Boolean.valueOf(n1350SolColFec), A1350SolColFec, Boolean.valueOf(n3187SolColNor), A3187SolColNor, Boolean.valueOf(n3188SolColMaq), A3188SolColMaq, Boolean.valueOf(n3189SolColTac), A3189SolColTac, Boolean.valueOf(n3190SolColCo), A3190SolColCo, Boolean.valueOf(n3191SolColPa6), A3191SolColPa6, Boolean.valueOf(n3192SolColPes), A3192SolColPes, Boolean.valueOf(n3193SolColPac), A3193SolColPac, Boolean.valueOf(n3194SolColWo), A3194SolColWo, Boolean.valueOf(n1346SolColCliC), Integer.valueOf(A1346SolColCliC), Boolean.valueOf(n1347SolColCliN), A1347SolColCliN, Boolean.valueOf(n1357SolColSol), A1357SolColSol, Boolean.valueOf(n1345SolColAlt), A1345SolColAlt, Boolean.valueOf(n1359SolColUlin), Byte.valueOf(A1359SolColUlin), Boolean.valueOf(n3195SolColRef), A3195SolColRef, Boolean.valueOf(n10918SolColTmp), Short.valueOf(A10918SolColTmp), Boolean.valueOf(n11803SolColRqM), A11803SolColRqM, Boolean.valueOf(n11804SolColSt), Byte.valueOf(A11804SolColSt), Boolean.valueOf(n11924SolColEsfe), A11924SolColEsfe, Boolean.valueOf(n11925SolColMetd), A11925SolColMetd, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLCO");
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
                        processLevel1IA188( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1IA0( ) ;
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
            load1IA188( ) ;
         }
         endLevel1IA188( ) ;
      }
      closeExtendedTableCursors1IA188( ) ;
   }

   public void update1IA188( )
   {
      beforeValidate1IA188( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IA188( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IA188( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IA188( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IA188( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IA14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n1352SolColMat), A1352SolColMat, Boolean.valueOf(n1356SolColSer), A1356SolColSer, Boolean.valueOf(n1358SolColTip), Short.valueOf(A1358SolColTip), Boolean.valueOf(n1349SolColDisN), A1349SolColDisN, Boolean.valueOf(n1353SolColNom), A1353SolColNom, Boolean.valueOf(n1354SolColNum), Integer.valueOf(A1354SolColNum), Boolean.valueOf(n1350SolColFec), A1350SolColFec, Boolean.valueOf(n3187SolColNor), A3187SolColNor, Boolean.valueOf(n3188SolColMaq), A3188SolColMaq, Boolean.valueOf(n3189SolColTac), A3189SolColTac, Boolean.valueOf(n3190SolColCo), A3190SolColCo, Boolean.valueOf(n3191SolColPa6), A3191SolColPa6, Boolean.valueOf(n3192SolColPes), A3192SolColPes, Boolean.valueOf(n3193SolColPac), A3193SolColPac, Boolean.valueOf(n3194SolColWo), A3194SolColWo, Boolean.valueOf(n1346SolColCliC), Integer.valueOf(A1346SolColCliC), Boolean.valueOf(n1347SolColCliN), A1347SolColCliN, Boolean.valueOf(n1357SolColSol), A1357SolColSol, Boolean.valueOf(n1345SolColAlt), A1345SolColAlt, Boolean.valueOf(n1359SolColUlin), Byte.valueOf(A1359SolColUlin), Boolean.valueOf(n3195SolColRef), A3195SolColRef, Boolean.valueOf(n10918SolColTmp), Short.valueOf(A10918SolColTmp), Boolean.valueOf(n11803SolColRqM), A11803SolColRqM, Boolean.valueOf(n11804SolColSt), Byte.valueOf(A11804SolColSt), Boolean.valueOf(n11924SolColEsfe), A11924SolColEsfe, Boolean.valueOf(n11925SolColMetd), A11925SolColMetd, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A1348SolColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLCO");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCSOLCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IA188( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1IA188( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1IA0( ) ;
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
         endLevel1IA188( ) ;
      }
      closeExtendedTableCursors1IA188( ) ;
   }

   public void deferredUpdate1IA188( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IA188( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IA188( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IA188( ) ;
         afterConfirm1IA188( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IA188( ) ;
            if ( AnyError == 0 )
            {
               A1359SolColUlin = O1359SolColUlin ;
               n1359SolColUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
               scanStart1IA189( ) ;
               while ( RcdFound189 != 0 )
               {
                  getByPrimaryKey1IA189( ) ;
                  delete1IA189( ) ;
                  scanNext1IA189( ) ;
                  O1359SolColUlin = A1359SolColUlin ;
                  n1359SolColUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
               }
               scanEnd1IA189( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IA15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLCO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound188 == 0 )
                        {
                           initAll1IA188( ) ;
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
                        resetCaption1IA0( ) ;
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
      sMode188 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IA188( ) ;
      Gx_mode = sMode188 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IA188( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( ! (0==A1348SolColCod) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolColCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  && (0==A1348SolColCod) )
         {
            GXv_int12[0] = A1348SolColCod ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "490001", GXv_int12) ;
            tpsolcor_impl.this.A1348SolColCod = GXv_int12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
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
            GXv_int7[0] = A1346SolColCliC ;
            GXv_char11[0] = A1352SolColMat ;
            GXv_int15[0] = A1358SolColTip ;
            GXv_char10[0] = A1356SolColSer ;
            GXv_char9[0] = A1349SolColDisN ;
            GXv_char3[0] = A1353SolColNom ;
            GXv_int5[0] = A1354SolColNum ;
            GXv_char2[0] = A1347SolColCliN ;
            GXv_int14[0] = (short)(0) ;
            GXv_int8[0] = (short)(0) ;
            GXv_char1[0] = A3195SolColRef ;
            new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
            tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
            tpsolcor_impl.this.A129BarCod = GXv_int12[0] ;
            tpsolcor_impl.this.A132BarCodReo = GXv_int17[0] ;
            tpsolcor_impl.this.A130BarCodPar = GXv_char13[0] ;
            tpsolcor_impl.this.A1346SolColCliC = GXv_int7[0] ;
            tpsolcor_impl.this.A1352SolColMat = GXv_char11[0] ;
            tpsolcor_impl.this.A1358SolColTip = GXv_int15[0] ;
            tpsolcor_impl.this.A1356SolColSer = GXv_char10[0] ;
            tpsolcor_impl.this.A1349SolColDisN = GXv_char9[0] ;
            tpsolcor_impl.this.A1353SolColNom = GXv_char3[0] ;
            tpsolcor_impl.this.A1354SolColNum = GXv_int5[0] ;
            tpsolcor_impl.this.A1347SolColCliN = GXv_char2[0] ;
            tpsolcor_impl.this.A3195SolColRef = GXv_char1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
            httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
            httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
            httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
            httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
            httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
         }
         if ( true /* Level */ && true /* After */ && isIns( )  )
         {
            GXv_char16[0] = A396EmprCod ;
            GXv_int12[0] = A129BarCod ;
            GXv_int17[0] = A132BarCodReo ;
            GXv_char13[0] = A130BarCodPar ;
            GXv_int7[0] = AV41FlagCal ;
            new app.pctrcor(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
            tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
            tpsolcor_impl.this.A129BarCod = GXv_int12[0] ;
            tpsolcor_impl.this.A132BarCodReo = GXv_int17[0] ;
            tpsolcor_impl.this.A130BarCodPar = GXv_char13[0] ;
            tpsolcor_impl.this.AV41FlagCal = GXv_int7[0] ;
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
         if ( true /* Level */ && true /* After */ && ( AV58FlagHdr == 0 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && true /* After */ && ( AV58FlagHdr == 0 ) && isUpd( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
         }
         /* Using cursor T01IA16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T01IA16_A653OpeNom[0] ;
         n653OpeNom = T01IA16_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevel1IA189( )
   {
      s1359SolColUlin = O1359SolColUlin ;
      n1359SolColUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      nGXsfl_190_idx = 0 ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         readRow1IA189( ) ;
         if ( ( nRcdExists_189 != 0 ) || ( nIsMod_189 != 0 ) )
         {
            standaloneNotModal1IA189( ) ;
            getKey1IA189( ) ;
            if ( ( nRcdExists_189 == 0 ) && ( nRcdDeleted_189 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1IA189( ) ;
            }
            else
            {
               if ( RcdFound189 != 0 )
               {
                  if ( ( nRcdDeleted_189 != 0 ) && ( nRcdExists_189 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1IA189( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_189 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1IA189( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_189 == 0 )
                  {
                     GXCCtl = "SOLCOLLIN_" + sGXsfl_190_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolColLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1359SolColUlin = A1359SolColUlin ;
            n1359SolColUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_189_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolColLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1351SolColLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolColObs_Internalname, GXutil.rtrim( A1355SolColObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1351SolColLin_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( Z1351SolColLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1355SolColObs_"+sGXsfl_190_idx, GXutil.rtrim( Z1355SolColObs)) ;
         httpContext.changePostValue( "nRcdDeleted_189_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_189_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_189_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_189 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_189_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_189_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLCOLLIN_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLCOLOBS_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1IA189( ) ;
      if ( AnyError != 0 )
      {
         O1359SolColUlin = s1359SolColUlin ;
         n1359SolColUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      }
      nRcdExists_189 = (short)(0) ;
      nIsMod_189 = (short)(0) ;
      nRcdDeleted_189 = (short)(0) ;
   }

   public void processLevel1IA188( )
   {
      /* Save parent mode. */
      sMode188 = Gx_mode ;
      processNestedLevel1IA189( ) ;
      if ( AnyError != 0 )
      {
         O1359SolColUlin = s1359SolColUlin ;
         n1359SolColUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode188 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01IA17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n1359SolColUlin), Byte.valueOf(A1359SolColUlin), A396EmprCod, Integer.valueOf(A1348SolColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLCO");
   }

   public void endLevel1IA188( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1IA188( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpsolcor");
         if ( AnyError == 0 )
         {
            confirmValues1IA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpsolcor");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IA188( )
   {
      /* Scan By routine */
      /* Using cursor T01IA18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound188 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound188 = (short)(1) ;
         A1348SolColCod = T01IA18_A1348SolColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IA188( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound188 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound188 = (short)(1) ;
         A1348SolColCod = T01IA18_A1348SolColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
      }
   }

   public void scanEnd1IA188( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1IA188( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IA188( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IA188( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IA188( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IA188( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IA188( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IA188( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtSolColMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColMat_Enabled), 5, 0), true);
      edtSolColSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColSer_Enabled), 5, 0), true);
      edtSolColTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColTip_Enabled), 5, 0), true);
      edtSolColDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColDisN_Enabled), 5, 0), true);
      edtSolColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColNom_Enabled), 5, 0), true);
      edtSolColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColNum_Enabled), 5, 0), true);
      edtSolColFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColFec_Enabled), 5, 0), true);
      edtSolColNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColNor_Enabled), 5, 0), true);
      edtSolColMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColMaq_Enabled), 5, 0), true);
      edtSolColTac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColTac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColTac_Enabled), 5, 0), true);
      edtSolColCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColCo_Enabled), 5, 0), true);
      edtSolColPa6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColPa6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColPa6_Enabled), 5, 0), true);
      edtSolColPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColPes_Enabled), 5, 0), true);
      edtSolColPac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColPac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColPac_Enabled), 5, 0), true);
      edtSolColWo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColWo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColWo_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtSolColCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColCliC_Enabled), 5, 0), true);
      edtSolColCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColCliN_Enabled), 5, 0), true);
      edtSolColSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColSol_Enabled), 5, 0), true);
      edtSolColAlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColAlt_Enabled), 5, 0), true);
      edtSolColUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColUlin_Enabled), 5, 0), true);
      edtSolColRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColRef_Enabled), 5, 0), true);
      edtSolColTmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColTmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColTmp_Enabled), 5, 0), true);
      edtSolColRqM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColRqM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColRqM_Enabled), 5, 0), true);
      edtSolColSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColSt_Enabled), 5, 0), true);
      edtSolColEsfe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColEsfe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColEsfe_Enabled), 5, 0), true);
      edtSolColMetd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColMetd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColMetd_Enabled), 5, 0), true);
   }

   public void zm1IA189( int GX_JID )
   {
      if ( ( GX_JID == 43 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1355SolColObs = T01IA3_A1355SolColObs[0] ;
         }
         else
         {
            Z1355SolColObs = A1355SolColObs ;
         }
      }
      if ( GX_JID == -43 )
      {
         Z1348SolColCod = A1348SolColCod ;
         Z1351SolColLin = A1351SolColLin ;
         Z1355SolColObs = A1355SolColObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1IA189( )
   {
      edtSolColUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColUlin_Enabled), 5, 0), true);
      edtSolColUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColUlin_Enabled), 5, 0), true);
   }

   public void standaloneModal1IA189( )
   {
      if ( isIns( )  )
      {
         A1359SolColUlin = (byte)(O1359SolColUlin+1) ;
         n1359SolColUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1351SolColLin = A1359SolColUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSolColLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      }
      else
      {
         edtSolColLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      }
   }

   public void load1IA189( )
   {
      /* Using cursor T01IA19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound189 = (short)(1) ;
         A1355SolColObs = T01IA19_A1355SolColObs[0] ;
         n1355SolColObs = T01IA19_n1355SolColObs[0] ;
         zm1IA189( -43) ;
      }
      pr_default.close(17);
      onLoadActions1IA189( ) ;
   }

   public void onLoadActions1IA189( )
   {
   }

   public void checkExtendedTable1IA189( )
   {
      nIsDirty_189 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1IA189( ) ;
   }

   public void closeExtendedTableCursors1IA189( )
   {
   }

   public void enableDisable1IA189( )
   {
   }

   public void getKey1IA189( )
   {
      /* Using cursor T01IA20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound189 = (short)(1) ;
      }
      else
      {
         RcdFound189 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1IA189( )
   {
      /* Using cursor T01IA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01IA3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1IA189( 43) ;
         RcdFound189 = (short)(1) ;
         initializeNonKey1IA189( ) ;
         A1351SolColLin = T01IA3_A1351SolColLin[0] ;
         A1355SolColObs = T01IA3_A1355SolColObs[0] ;
         n1355SolColObs = T01IA3_n1355SolColObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1348SolColCod = A1348SolColCod ;
         Z1351SolColLin = A1351SolColLin ;
         sMode189 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IA189( ) ;
         load1IA189( ) ;
         Gx_mode = sMode189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound189 = (short)(0) ;
         initializeNonKey1IA189( ) ;
         sMode189 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IA189( ) ;
         Gx_mode = sMode189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1IA189( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1IA189( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLSOLCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1355SolColObs, T01IA2_A1355SolColObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1355SolColObs, T01IA2_A1355SolColObs[0]) != 0 )
            {
               GXutil.writeLogln("tpsolcor:[seudo value changed for attri]"+"SolColObs");
               GXutil.writeLogRaw("Old: ",Z1355SolColObs);
               GXutil.writeLogRaw("Current: ",T01IA2_A1355SolColObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLSOLCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IA189( )
   {
      beforeValidate1IA189( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IA189( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IA189( 0) ;
         checkOptimisticConcurrency1IA189( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IA189( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IA189( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IA21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin), Boolean.valueOf(n1355SolColObs), A1355SolColObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLCO");
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
            load1IA189( ) ;
         }
         endLevel1IA189( ) ;
      }
      closeExtendedTableCursors1IA189( ) ;
   }

   public void update1IA189( )
   {
      beforeValidate1IA189( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IA189( ) ;
      }
      if ( ( nIsMod_189 != 0 ) || ( nIsDirty_189 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1IA189( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1IA189( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1IA189( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01IA22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n1355SolColObs), A1355SolColObs, A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLCO");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLSOLCO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1IA189( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1IA189( ) ;
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
            endLevel1IA189( ) ;
         }
      }
      closeExtendedTableCursors1IA189( ) ;
   }

   public void deferredUpdate1IA189( )
   {
   }

   public void delete1IA189( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IA189( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IA189( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IA189( ) ;
         afterConfirm1IA189( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IA189( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IA23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLCO");
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
      sMode189 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IA189( ) ;
      Gx_mode = sMode189 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IA189( )
   {
      standaloneModal1IA189( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1IA189( )
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

   public void scanStart1IA189( )
   {
      /* Scan By routine */
      /* Using cursor T01IA24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
      RcdFound189 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound189 = (short)(1) ;
         A1351SolColLin = T01IA24_A1351SolColLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IA189( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound189 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound189 = (short)(1) ;
         A1351SolColLin = T01IA24_A1351SolColLin[0] ;
      }
   }

   public void scanEnd1IA189( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1IA189( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IA189( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IA189( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IA189( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IA189( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IA189( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IA189( )
   {
      edtSolColLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      edtSolColObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColObs_Enabled), 5, 0), !bGXsfl_190_Refreshing);
   }

   public void send_integrity_lvl_hashes1IA189( )
   {
   }

   public void send_integrity_lvl_hashes1IA188( )
   {
   }

   public void subsflControlProps_190189( )
   {
      edtavnRcdDeleted_189_Internalname = "vNRCDDELETED_189_"+sGXsfl_190_idx ;
      edtSolColLin_Internalname = "SOLCOLLIN_"+sGXsfl_190_idx ;
      edtSolColObs_Internalname = "SOLCOLOBS_"+sGXsfl_190_idx ;
   }

   public void subsflControlProps_fel_190189( )
   {
      edtavnRcdDeleted_189_Internalname = "vNRCDDELETED_189_"+sGXsfl_190_fel_idx ;
      edtSolColLin_Internalname = "SOLCOLLIN_"+sGXsfl_190_fel_idx ;
      edtSolColObs_Internalname = "SOLCOLOBS_"+sGXsfl_190_fel_idx ;
   }

   public void addRow1IA189( )
   {
      nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_190189( ) ;
      sendRow1IA189( ) ;
   }

   public void sendRow1IA189( )
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
         if ( ((int)((nGXsfl_190_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_189_" + sGXsfl_190_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_190_idx + "',190)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_189_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_189_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_189), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_189), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_189_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_189_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_189_" + sGXsfl_190_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 192,'',false,'" + sGXsfl_190_idx + "',190)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolColLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1351SolColLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1351SolColLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,192);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolColLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolColLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_189_" + sGXsfl_190_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 193,'',false,'" + sGXsfl_190_idx + "',190)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolColObs_Internalname,GXutil.rtrim( A1355SolColObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,193);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolColObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolColObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1IA189( ) ;
      GXCCtl = "Z1351SolColLin_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1351SolColLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1355SolColObs_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1355SolColObs));
      GXCCtl = "nRcdDeleted_189_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_189_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_189_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCOD_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV62BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV63BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV64BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_189_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_189_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLCOLLIN_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLCOLOBS_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1IA189( )
   {
      nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_190189( ) ;
      edtavnRcdDeleted_189_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_189_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolColLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLCOLLIN_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolColObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLCOLOBS_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_189_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_189_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_189");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_189_Internalname ;
         wbErr = true ;
         nRcdDeleted_189 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_189 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_189_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "SOLCOLLIN_" + sGXsfl_190_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolColLin_Internalname ;
         wbErr = true ;
         A1351SolColLin = (byte)(0) ;
      }
      else
      {
         A1351SolColLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1355SolColObs = httpContext.cgiGet( edtSolColObs_Internalname) ;
      n1355SolColObs = false ;
      GXCCtl = "Z1351SolColLin_" + sGXsfl_190_idx ;
      Z1351SolColLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1355SolColObs_" + sGXsfl_190_idx ;
      Z1355SolColObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_189_" + sGXsfl_190_idx ;
      nRcdDeleted_189 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_189_" + sGXsfl_190_idx ;
      nRcdExists_189 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_189_" + sGXsfl_190_idx ;
      nIsMod_189 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtSolColLin_Enabled = edtSolColLin_Enabled ;
   }

   public void confirmValues1IA0( )
   {
      nGXsfl_190_idx = 0 ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_190189( ) ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
         sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_190189( ) ;
         httpContext.changePostValue( "Z1351SolColLin_"+sGXsfl_190_idx, httpContext.cgiGet( "ZT_"+"Z1351SolColLin_"+sGXsfl_190_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1351SolColLin_"+sGXsfl_190_idx) ;
         httpContext.changePostValue( "Z1355SolColObs_"+sGXsfl_190_idx, httpContext.cgiGet( "ZT_"+"Z1355SolColObs_"+sGXsfl_190_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1355SolColObs_"+sGXsfl_190_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpsolcor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV64BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1348SolColCod", GXutil.ltrim( localUtil.ntoc( Z1348SolColCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1352SolColMat", GXutil.rtrim( Z1352SolColMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1356SolColSer", GXutil.rtrim( Z1356SolColSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1358SolColTip", GXutil.ltrim( localUtil.ntoc( Z1358SolColTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1349SolColDisN", GXutil.rtrim( Z1349SolColDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1353SolColNom", GXutil.rtrim( Z1353SolColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1354SolColNum", GXutil.ltrim( localUtil.ntoc( Z1354SolColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1350SolColFec", localUtil.dtoc( Z1350SolColFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3187SolColNor", GXutil.rtrim( Z3187SolColNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3188SolColMaq", GXutil.rtrim( Z3188SolColMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3189SolColTac", GXutil.rtrim( Z3189SolColTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3190SolColCo", GXutil.rtrim( Z3190SolColCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3191SolColPa6", GXutil.rtrim( Z3191SolColPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3192SolColPes", GXutil.rtrim( Z3192SolColPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3193SolColPac", GXutil.rtrim( Z3193SolColPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3194SolColWo", GXutil.rtrim( Z3194SolColWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1346SolColCliC", GXutil.ltrim( localUtil.ntoc( Z1346SolColCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1347SolColCliN", GXutil.rtrim( Z1347SolColCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1357SolColSol", GXutil.rtrim( Z1357SolColSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1345SolColAlt", GXutil.rtrim( Z1345SolColAlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1359SolColUlin", GXutil.ltrim( localUtil.ntoc( Z1359SolColUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3195SolColRef", GXutil.rtrim( Z3195SolColRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10918SolColTmp", GXutil.ltrim( localUtil.ntoc( Z10918SolColTmp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11803SolColRqM", GXutil.rtrim( Z11803SolColRqM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11804SolColSt", GXutil.ltrim( localUtil.ntoc( Z11804SolColSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11924SolColEsfe", GXutil.rtrim( Z11924SolColEsfe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11925SolColMetd", GXutil.rtrim( Z11925SolColMetd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1359SolColUlin", GXutil.ltrim( localUtil.ntoc( O1359SolColUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_190", GXutil.ltrim( localUtil.ntoc( nGXsfl_190_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV62BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV63BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV64BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCAL", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGHDR", GXutil.ltrim( localUtil.ntoc( AV58FlagHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpsolcor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV64BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TpSOLCOR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Llamada con parametro", "") ;
   }

   public void initializeNonKey1IA188( )
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
      AV58FlagHdr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58FlagHdr", GXutil.str( AV58FlagHdr, 1, 0));
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A1352SolColMat = "" ;
      n1352SolColMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
      A1356SolColSer = "" ;
      n1356SolColSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
      A1358SolColTip = (short)(0) ;
      n1358SolColTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
      A1349SolColDisN = "" ;
      n1349SolColDisN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
      A1353SolColNom = "" ;
      n1353SolColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
      A1354SolColNum = 0 ;
      n1354SolColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
      A3187SolColNor = "" ;
      n3187SolColNor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3187SolColNor", A3187SolColNor);
      A3188SolColMaq = "" ;
      n3188SolColMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
      A3189SolColTac = "" ;
      n3189SolColTac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3189SolColTac", A3189SolColTac);
      A3190SolColCo = "" ;
      n3190SolColCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3190SolColCo", A3190SolColCo);
      A3191SolColPa6 = "" ;
      n3191SolColPa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3191SolColPa6", A3191SolColPa6);
      A3192SolColPes = "" ;
      n3192SolColPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3192SolColPes", A3192SolColPes);
      A3193SolColPac = "" ;
      n3193SolColPac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3193SolColPac", A3193SolColPac);
      A3194SolColWo = "" ;
      n3194SolColWo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3194SolColWo", A3194SolColWo);
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A1346SolColCliC = 0 ;
      n1346SolColCliC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
      A1347SolColCliN = "" ;
      n1347SolColCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
      A1357SolColSol = "" ;
      n1357SolColSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1357SolColSol", A1357SolColSol);
      A1345SolColAlt = "" ;
      n1345SolColAlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1345SolColAlt", A1345SolColAlt);
      A1359SolColUlin = (byte)(0) ;
      n1359SolColUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      A3195SolColRef = "" ;
      n3195SolColRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
      A11924SolColEsfe = "" ;
      n11924SolColEsfe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", A11924SolColEsfe);
      A1350SolColFec = GXutil.today( ) ;
      n1350SolColFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
      A10918SolColTmp = (short)(40) ;
      n10918SolColTmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
      A11803SolColRqM = "4" ;
      n11803SolColRqM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
      A11804SolColSt = (byte)(1) ;
      n11804SolColSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
      A11925SolColMetd = httpContext.getMessage( "NEXT MET 2", "") ;
      n11925SolColMetd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
      O1359SolColUlin = A1359SolColUlin ;
      n1359SolColUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z1352SolColMat = "" ;
      Z1356SolColSer = "" ;
      Z1358SolColTip = (short)(0) ;
      Z1349SolColDisN = "" ;
      Z1353SolColNom = "" ;
      Z1354SolColNum = 0 ;
      Z1350SolColFec = GXutil.nullDate() ;
      Z3187SolColNor = "" ;
      Z3188SolColMaq = "" ;
      Z3189SolColTac = "" ;
      Z3190SolColCo = "" ;
      Z3191SolColPa6 = "" ;
      Z3192SolColPes = "" ;
      Z3193SolColPac = "" ;
      Z3194SolColWo = "" ;
      Z1346SolColCliC = 0 ;
      Z1347SolColCliN = "" ;
      Z1357SolColSol = "" ;
      Z1345SolColAlt = "" ;
      Z1359SolColUlin = (byte)(0) ;
      Z3195SolColRef = "" ;
      Z10918SolColTmp = (short)(0) ;
      Z11803SolColRqM = "" ;
      Z11804SolColSt = (byte)(0) ;
      Z11924SolColEsfe = "" ;
      Z11925SolColMetd = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAll1IA188( )
   {
      A1348SolColCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
      initializeNonKey1IA188( ) ;
   }

   public void standaloneModalInsert( )
   {
      A1350SolColFec = i1350SolColFec ;
      n1350SolColFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
      A10918SolColTmp = i10918SolColTmp ;
      n10918SolColTmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
      A11804SolColSt = i11804SolColSt ;
      n11804SolColSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
      A11925SolColMetd = i11925SolColMetd ;
      n11925SolColMetd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
      A11803SolColRqM = i11803SolColRqM ;
      n11803SolColRqM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
   }

   public void initializeNonKey1IA189( )
   {
      A1355SolColObs = "" ;
      n1355SolColObs = false ;
      Z1355SolColObs = "" ;
   }

   public void initAll1IA189( )
   {
      A1351SolColLin = (byte)(0) ;
      initializeNonKey1IA189( ) ;
   }

   public void standaloneModalInsert1IA189( )
   {
      A1359SolColUlin = i1359SolColUlin ;
      n1359SolColUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241581051", true, true);
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
      httpContext.AddJavascriptSource("tpsolcor.js", "?20268241581051", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties189( )
   {
      edtSolColLin_Enabled = defedtSolColLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
   }

   public void startgridcontrol190( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_189, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_189_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1351SolColLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1355SolColObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSolColCod_Internalname = "SOLCOLCOD" ;
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
      edtSolColMat_Internalname = "SOLCOLMAT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSolColSer_Internalname = "SOLCOLSER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSolColTip_Internalname = "SOLCOLTIP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSolColDisN_Internalname = "SOLCOLDISN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSolColNom_Internalname = "SOLCOLNOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtSolColNum_Internalname = "SOLCOLNUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtSolColFec_Internalname = "SOLCOLFEC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtSolColNor_Internalname = "SOLCOLNOR" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtSolColMaq_Internalname = "SOLCOLMAQ" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtSolColTac_Internalname = "SOLCOLTAC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtSolColCo_Internalname = "SOLCOLCO" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtSolColPa6_Internalname = "SOLCOLPA6" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtSolColPes_Internalname = "SOLCOLPES" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtSolColPac_Internalname = "SOLCOLPAC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtSolColWo_Internalname = "SOLCOLWO" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtSolColCliC_Internalname = "SOLCOLCLIC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtSolColCliN_Internalname = "SOLCOLCLIN" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtSolColSol_Internalname = "SOLCOLSOL" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtSolColAlt_Internalname = "SOLCOLALT" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtSolColUlin_Internalname = "SOLCOLULIN" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtSolColRef_Internalname = "SOLCOLREF" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtSolColTmp_Internalname = "SOLCOLTMP" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtSolColRqM_Internalname = "SOLCOLRQM" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtSolColSt_Internalname = "SOLCOLST" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtSolColEsfe_Internalname = "SOLCOLESFE" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtSolColMetd_Internalname = "SOLCOLMETD" ;
      edtavnRcdDeleted_189_Internalname = "vNRCDDELETED_189" ;
      edtSolColLin_Internalname = "SOLCOLLIN" ;
      edtSolColObs_Internalname = "SOLCOLOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Llamada con parametro", "") );
      edtSolColObs_Jsonclick = "" ;
      edtSolColLin_Jsonclick = "" ;
      edtavnRcdDeleted_189_Jsonclick = "" ;
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
      edtSolColObs_Enabled = 1 ;
      edtSolColLin_Enabled = 1 ;
      edtavnRcdDeleted_189_Enabled = 1 ;
      edtSolColMetd_Jsonclick = "" ;
      edtSolColMetd_Backcolor = (int)(0xFFFFFF) ;
      edtSolColMetd_Enabled = 1 ;
      edtSolColEsfe_Jsonclick = "" ;
      edtSolColEsfe_Backcolor = (int)(0xFFFFFF) ;
      edtSolColEsfe_Enabled = 1 ;
      edtSolColSt_Jsonclick = "" ;
      edtSolColSt_Backcolor = (int)(0xFFFFFF) ;
      edtSolColSt_Enabled = 1 ;
      edtSolColRqM_Jsonclick = "" ;
      edtSolColRqM_Backcolor = (int)(0xFFFFFF) ;
      edtSolColRqM_Enabled = 1 ;
      edtSolColTmp_Jsonclick = "" ;
      edtSolColTmp_Backcolor = (int)(0xFFFFFF) ;
      edtSolColTmp_Enabled = 1 ;
      edtSolColRef_Jsonclick = "" ;
      edtSolColRef_Backcolor = (int)(0xFFFFFF) ;
      edtSolColRef_Enabled = 1 ;
      edtSolColUlin_Jsonclick = "" ;
      edtSolColUlin_Backcolor = (int)(0xFFFFFF) ;
      edtSolColUlin_Enabled = 0 ;
      edtSolColAlt_Jsonclick = "" ;
      edtSolColAlt_Backcolor = (int)(0xFFFFFF) ;
      edtSolColAlt_Enabled = 1 ;
      edtSolColSol_Jsonclick = "" ;
      edtSolColSol_Backcolor = (int)(0xFFFFFF) ;
      edtSolColSol_Enabled = 1 ;
      edtSolColCliN_Jsonclick = "" ;
      edtSolColCliN_Backcolor = (int)(0xFFFFFF) ;
      edtSolColCliN_Enabled = 0 ;
      edtSolColCliC_Jsonclick = "" ;
      edtSolColCliC_Backcolor = (int)(0xFFFFFF) ;
      edtSolColCliC_Enabled = 0 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtSolColWo_Jsonclick = "" ;
      edtSolColWo_Backcolor = (int)(0xFFFFFF) ;
      edtSolColWo_Enabled = 1 ;
      edtSolColPac_Jsonclick = "" ;
      edtSolColPac_Backcolor = (int)(0xFFFFFF) ;
      edtSolColPac_Enabled = 1 ;
      edtSolColPes_Jsonclick = "" ;
      edtSolColPes_Backcolor = (int)(0xFFFFFF) ;
      edtSolColPes_Enabled = 1 ;
      edtSolColPa6_Jsonclick = "" ;
      edtSolColPa6_Backcolor = (int)(0xFFFFFF) ;
      edtSolColPa6_Enabled = 1 ;
      edtSolColCo_Jsonclick = "" ;
      edtSolColCo_Backcolor = (int)(0xFFFFFF) ;
      edtSolColCo_Enabled = 1 ;
      edtSolColTac_Jsonclick = "" ;
      edtSolColTac_Backcolor = (int)(0xFFFFFF) ;
      edtSolColTac_Enabled = 1 ;
      edtSolColMaq_Jsonclick = "" ;
      edtSolColMaq_Backcolor = (int)(0xFFFFFF) ;
      edtSolColMaq_Enabled = 1 ;
      edtSolColNor_Jsonclick = "" ;
      edtSolColNor_Backcolor = (int)(0xFFFFFF) ;
      edtSolColNor_Enabled = 1 ;
      edtSolColFec_Jsonclick = "" ;
      edtSolColFec_Backcolor = (int)(0xFFFFFF) ;
      edtSolColFec_Enabled = 1 ;
      edtSolColNum_Jsonclick = "" ;
      edtSolColNum_Backcolor = (int)(0xFFFFFF) ;
      edtSolColNum_Enabled = 0 ;
      edtSolColNom_Jsonclick = "" ;
      edtSolColNom_Backcolor = (int)(0xFFFFFF) ;
      edtSolColNom_Enabled = 0 ;
      edtSolColDisN_Jsonclick = "" ;
      edtSolColDisN_Backcolor = (int)(0xFFFFFF) ;
      edtSolColDisN_Enabled = 0 ;
      edtSolColTip_Jsonclick = "" ;
      edtSolColTip_Backcolor = (int)(0xFFFFFF) ;
      edtSolColTip_Enabled = 0 ;
      edtSolColSer_Jsonclick = "" ;
      edtSolColSer_Backcolor = (int)(0xFFFFFF) ;
      edtSolColSer_Enabled = 0 ;
      edtSolColMat_Jsonclick = "" ;
      edtSolColMat_Backcolor = (int)(0xFFFFFF) ;
      edtSolColMat_Enabled = 0 ;
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
      edtSolColCod_Jsonclick = "" ;
      edtSolColCod_Backcolor = (int)(0xFFFFFF) ;
      edtSolColCod_Enabled = 1 ;
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

   public void xc_28_1IA188( String Gx_mode ,
                             String A396EmprCod ,
                             int A1348SolColCod )
   {
      if ( isIns( )  && (0==A1348SolColCod) )
      {
         GXv_int12[0] = A1348SolColCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "490001", GXv_int12) ;
         A1348SolColCod = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1348SolColCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_29_1IA188( String Gx_mode ,
                             String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             int A1346SolColCliC ,
                             String A1352SolColMat ,
                             short A1358SolColTip ,
                             String A1356SolColSer ,
                             String A1349SolColDisN ,
                             String A1353SolColNom ,
                             int A1354SolColNum ,
                             String A1347SolColCliN ,
                             String A3195SolColRef )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = A1346SolColCliC ;
         GXv_char11[0] = A1352SolColMat ;
         GXv_int15[0] = A1358SolColTip ;
         GXv_char10[0] = A1356SolColSer ;
         GXv_char9[0] = A1349SolColDisN ;
         GXv_char3[0] = A1353SolColNom ;
         GXv_int5[0] = A1354SolColNum ;
         GXv_char2[0] = A1347SolColCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int8[0] = (short)(0) ;
         GXv_char1[0] = A3195SolColRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
         A396EmprCod = GXv_char16[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int17[0] ;
         A130BarCodPar = GXv_char13[0] ;
         A1346SolColCliC = GXv_int7[0] ;
         A1352SolColMat = GXv_char11[0] ;
         A1358SolColTip = GXv_int15[0] ;
         A1356SolColSer = GXv_char10[0] ;
         A1349SolColDisN = GXv_char9[0] ;
         A1353SolColNom = GXv_char3[0] ;
         A1354SolColNum = GXv_int5[0] ;
         A1347SolColCliN = GXv_char2[0] ;
         A3195SolColRef = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
         httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
         httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
         httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
         httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1346SolColCliC, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1352SolColMat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1358SolColTip, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1356SolColSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1349SolColDisN))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1353SolColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1354SolColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1347SolColCliN))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3195SolColRef))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_30_1IA188( String A396EmprCod ,
                             String A3188SolColMaq ,
                             byte AV19FlagM )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3188SolColMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         A396EmprCod = GXv_char16[0] ;
         A3188SolColMaq = GXv_char13[0] ;
         AV19FlagM = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
         httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.str( AV19FlagM, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3188SolColMaq))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_1IA188( String Gx_mode ,
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
         new app.pctrcor(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
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

   public void xc_34_1IA188( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             byte AV58FlagHdr )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int6[0] = AV58FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int6) ;
         A396EmprCod = GXv_char16[0] ;
         A129BarCod = GXv_int12[0] ;
         A132BarCodReo = GXv_int17[0] ;
         A130BarCodPar = GXv_char13[0] ;
         AV58FlagHdr = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV58FlagHdr", GXutil.str( AV58FlagHdr, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV58FlagHdr, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_190189( ) ;
      while ( nGXsfl_190_idx <= nRC_GXsfl_190 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1IA189( ) ;
         standaloneModal1IA189( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1IA189( ) ;
         nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
         sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_190189( ) ;
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
      /* Using cursor T01IA25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IA25_A407EmprNom[0] ;
      n407EmprNom = T01IA25_n407EmprNom[0] ;
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

   public void valid_Solcolcod( )
   {
      n1359SolColUlin = false ;
      n130BarCodPar = false ;
      n132BarCodReo = false ;
      n129BarCod = false ;
      n1350SolColFec = false ;
      n10918SolColTmp = false ;
      n11804SolColSt = false ;
      n11925SolColMetd = false ;
      n11803SolColRqM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( isIns( )  && ( ! (0==A1348SolColCod) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Test Inexistente", ""), 1, "SOLCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolColCod_Internalname ;
      }
      if ( isIns( )  && (0==A1348SolColCod) )
      {
         GXv_int12[0] = A1348SolColCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "490001", GXv_int12) ;
         tpsolcor_impl.this.A1348SolColCod = GXv_int12[0] ;
         A1348SolColCod = this.A1348SolColCod ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", GXutil.rtrim( A1352SolColMat));
      httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", GXutil.rtrim( A1356SolColSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrim( localUtil.ntoc( A1358SolColTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", GXutil.rtrim( A1349SolColDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", GXutil.rtrim( A1353SolColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrim( localUtil.ntoc( A1354SolColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3187SolColNor", GXutil.rtrim( A3187SolColNor));
      httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", GXutil.rtrim( A3188SolColMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A3189SolColTac", GXutil.rtrim( A3189SolColTac));
      httpContext.ajax_rsp_assign_attri("", false, "A3190SolColCo", GXutil.rtrim( A3190SolColCo));
      httpContext.ajax_rsp_assign_attri("", false, "A3191SolColPa6", GXutil.rtrim( A3191SolColPa6));
      httpContext.ajax_rsp_assign_attri("", false, "A3192SolColPes", GXutil.rtrim( A3192SolColPes));
      httpContext.ajax_rsp_assign_attri("", false, "A3193SolColPac", GXutil.rtrim( A3193SolColPac));
      httpContext.ajax_rsp_assign_attri("", false, "A3194SolColWo", GXutil.rtrim( A3194SolColWo));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrim( localUtil.ntoc( A1346SolColCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", GXutil.rtrim( A1347SolColCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A1357SolColSol", GXutil.rtrim( A1357SolColSol));
      httpContext.ajax_rsp_assign_attri("", false, "A1345SolColAlt", GXutil.rtrim( A1345SolColAlt));
      httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrim( localUtil.ntoc( A1359SolColUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", GXutil.rtrim( A3195SolColRef));
      httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrim( localUtil.ntoc( A10918SolColTmp, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", GXutil.rtrim( A11803SolColRqM));
      httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.ltrim( localUtil.ntoc( A11804SolColSt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", GXutil.rtrim( A11924SolColEsfe));
      httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", GXutil.rtrim( A11925SolColMetd));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
      httpContext.ajax_rsp_assign_attri("", false, "AV58FlagHdr", GXutil.ltrim( localUtil.ntoc( AV58FlagHdr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1352SolColMat", GXutil.rtrim( Z1352SolColMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1356SolColSer", GXutil.rtrim( Z1356SolColSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1358SolColTip", GXutil.ltrim( localUtil.ntoc( Z1358SolColTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1349SolColDisN", GXutil.rtrim( Z1349SolColDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1353SolColNom", GXutil.rtrim( Z1353SolColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1354SolColNum", GXutil.ltrim( localUtil.ntoc( Z1354SolColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1350SolColFec", localUtil.format(Z1350SolColFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3187SolColNor", GXutil.rtrim( Z3187SolColNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3188SolColMaq", GXutil.rtrim( Z3188SolColMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3189SolColTac", GXutil.rtrim( Z3189SolColTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3190SolColCo", GXutil.rtrim( Z3190SolColCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3191SolColPa6", GXutil.rtrim( Z3191SolColPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3192SolColPes", GXutil.rtrim( Z3192SolColPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3193SolColPac", GXutil.rtrim( Z3193SolColPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3194SolColWo", GXutil.rtrim( Z3194SolColWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1346SolColCliC", GXutil.ltrim( localUtil.ntoc( Z1346SolColCliC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1347SolColCliN", GXutil.rtrim( Z1347SolColCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1357SolColSol", GXutil.rtrim( Z1357SolColSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1345SolColAlt", GXutil.rtrim( Z1345SolColAlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1359SolColUlin", GXutil.ltrim( localUtil.ntoc( Z1359SolColUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3195SolColRef", GXutil.rtrim( Z3195SolColRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10918SolColTmp", GXutil.ltrim( localUtil.ntoc( Z10918SolColTmp, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11803SolColRqM", GXutil.rtrim( Z11803SolColRqM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11804SolColSt", GXutil.ltrim( localUtil.ntoc( Z11804SolColSt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11924SolColEsfe", GXutil.rtrim( Z11924SolColEsfe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11925SolColMetd", GXutil.rtrim( Z11925SolColMetd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1348SolColCod", GXutil.ltrim( localUtil.ntoc( Z1348SolColCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV41FlagCal", GXutil.ltrim( localUtil.ntoc( ZV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Gx_msg", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV58FlagHdr", GXutil.ltrim( localUtil.ntoc( ZV58FlagHdr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV19FlagM", GXutil.ltrim( localUtil.ntoc( ZV19FlagM, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1359SolColUlin", GXutil.ltrim( localUtil.ntoc( O1359SolColUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrim( localUtil.ntoc( A1348SolColCod, (byte)(8), (byte)(0), ".", "")));
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
      n3195SolColRef = false ;
      n1347SolColCliN = false ;
      n1354SolColNum = false ;
      n1353SolColNom = false ;
      n1349SolColDisN = false ;
      n1356SolColSer = false ;
      n1358SolColTip = false ;
      n1352SolColMat = false ;
      n1346SolColCliC = false ;
      n132BarCodReo = false ;
      n129BarCod = false ;
      n130BarCodPar = false ;
      if ( isIns( )  && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = A1346SolColCliC ;
         GXv_char11[0] = A1352SolColMat ;
         GXv_int15[0] = A1358SolColTip ;
         GXv_char10[0] = A1356SolColSer ;
         GXv_char9[0] = A1349SolColDisN ;
         GXv_char3[0] = A1353SolColNom ;
         GXv_int5[0] = A1354SolColNum ;
         GXv_char2[0] = A1347SolColCliN ;
         GXv_int14[0] = (short)(0) ;
         GXv_int8[0] = (short)(0) ;
         GXv_char1[0] = A3195SolColRef ;
         new app.pdathdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7, GXv_char11, GXv_int15, GXv_char10, GXv_char9, GXv_char3, GXv_int5, GXv_char2, GXv_int14, GXv_int8, GXv_char1) ;
         tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpsolcor_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         tpsolcor_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tpsolcor_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tpsolcor_impl.this.A1346SolColCliC = GXv_int7[0] ;
         A1346SolColCliC = this.A1346SolColCliC ;
         tpsolcor_impl.this.A1352SolColMat = GXv_char11[0] ;
         A1352SolColMat = this.A1352SolColMat ;
         tpsolcor_impl.this.A1358SolColTip = GXv_int15[0] ;
         A1358SolColTip = this.A1358SolColTip ;
         tpsolcor_impl.this.A1356SolColSer = GXv_char10[0] ;
         A1356SolColSer = this.A1356SolColSer ;
         tpsolcor_impl.this.A1349SolColDisN = GXv_char9[0] ;
         A1349SolColDisN = this.A1349SolColDisN ;
         tpsolcor_impl.this.A1353SolColNom = GXv_char3[0] ;
         A1353SolColNom = this.A1353SolColNom ;
         tpsolcor_impl.this.A1354SolColNum = GXv_int5[0] ;
         A1354SolColNum = this.A1354SolColNum ;
         tpsolcor_impl.this.A1347SolColCliN = GXv_char2[0] ;
         A1347SolColCliN = this.A1347SolColCliN ;
         tpsolcor_impl.this.A3195SolColRef = GXv_char1[0] ;
         A3195SolColRef = this.A3195SolColRef ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_int12[0] = A129BarCod ;
         GXv_int17[0] = A132BarCodReo ;
         GXv_char13[0] = A130BarCodPar ;
         GXv_int7[0] = AV41FlagCal ;
         new app.pctrcor(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int7) ;
         tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpsolcor_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         tpsolcor_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tpsolcor_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tpsolcor_impl.this.AV41FlagCal = GXv_int7[0] ;
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
         GXv_int6[0] = AV58FlagHdr ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char16, GXv_int12, GXv_int17, GXv_char13, GXv_int6) ;
         tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpsolcor_impl.this.A129BarCod = GXv_int12[0] ;
         A129BarCod = this.A129BarCod ;
         tpsolcor_impl.this.A132BarCodReo = GXv_int17[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tpsolcor_impl.this.A130BarCodPar = GXv_char13[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tpsolcor_impl.this.AV58FlagHdr = GXv_int6[0] ;
         AV58FlagHdr = this.AV58FlagHdr ;
      }
      if ( true /* Level */ && true /* After */ && ( AV58FlagHdr == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && ( AV58FlagHdr == 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Hoja Ruta/Ordem Serviço INEXISTENTE", ""), 0, "BARCODPAR");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
      httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrim( localUtil.ntoc( A1346SolColCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", GXutil.rtrim( A1352SolColMat));
      httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrim( localUtil.ntoc( A1358SolColTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", GXutil.rtrim( A1356SolColSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", GXutil.rtrim( A1349SolColDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", GXutil.rtrim( A1353SolColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrim( localUtil.ntoc( A1354SolColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", GXutil.rtrim( A1347SolColCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", GXutil.rtrim( A3195SolColRef));
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagCal", GXutil.ltrim( localUtil.ntoc( AV41FlagCal, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "AV58FlagHdr", GXutil.ltrim( localUtil.ntoc( AV58FlagHdr, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Solcolmaq( )
   {
      n3188SolColMaq = false ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char16[0] = A396EmprCod ;
         GXv_char13[0] = A3188SolColMaq ;
         GXv_int17[0] = AV19FlagM ;
         new app.pbusmaq(remoteHandle, context).execute( GXv_char16, GXv_char13, GXv_int17) ;
         tpsolcor_impl.this.A396EmprCod = GXv_char16[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpsolcor_impl.this.A3188SolColMaq = GXv_char13[0] ;
         A3188SolColMaq = this.A3188SolColMaq ;
         tpsolcor_impl.this.AV19FlagM = GXv_int17[0] ;
         AV19FlagM = this.AV19FlagM ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A3188SolColMaq)==0) && (0==AV19FlagM) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, "SOLCOLMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolColMaq_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", GXutil.rtrim( A3188SolColMaq));
      httpContext.ajax_rsp_assign_attri("", false, "AV19FlagM", GXutil.ltrim( localUtil.ntoc( AV19FlagM, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T01IA16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T01IA16_A653OpeNom[0] ;
      n653OpeNom = T01IA16_n653OpeNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_SOLCOLCOD","{handler:'valid_Solcolcod',iparms:[{av:'A1359SolColUlin',fld:'SOLCOLULIN',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1348SolColCod',fld:'SOLCOLCOD',pic:'ZZZZZZZ9'},{av:'AV64BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV63BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A1350SolColFec',fld:'SOLCOLFEC',pic:''},{av:'A10918SolColTmp',fld:'SOLCOLTMP',pic:'ZZ9'},{av:'A11804SolColSt',fld:'SOLCOLST',pic:'9'},{av:'A11925SolColMetd',fld:'SOLCOLMETD',pic:''},{av:'A11803SolColRqM',fld:'SOLCOLRQM',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV58FlagHdr',fld:'vFLAGHDR',pic:'9'},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]");
      setEventMetadata("VALID_SOLCOLCOD",",oparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1352SolColMat',fld:'SOLCOLMAT',pic:''},{av:'A1356SolColSer',fld:'SOLCOLSER',pic:''},{av:'A1358SolColTip',fld:'SOLCOLTIP',pic:'ZZZ9'},{av:'A1349SolColDisN',fld:'SOLCOLDISN',pic:''},{av:'A1353SolColNom',fld:'SOLCOLNOM',pic:''},{av:'A1354SolColNum',fld:'SOLCOLNUM',pic:'ZZZZZ9'},{av:'A1350SolColFec',fld:'SOLCOLFEC',pic:''},{av:'A3187SolColNor',fld:'SOLCOLNOR',pic:''},{av:'A3188SolColMaq',fld:'SOLCOLMAQ',pic:''},{av:'A3189SolColTac',fld:'SOLCOLTAC',pic:''},{av:'A3190SolColCo',fld:'SOLCOLCO',pic:''},{av:'A3191SolColPa6',fld:'SOLCOLPA6',pic:''},{av:'A3192SolColPes',fld:'SOLCOLPES',pic:''},{av:'A3193SolColPac',fld:'SOLCOLPAC',pic:''},{av:'A3194SolColWo',fld:'SOLCOLWO',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A1346SolColCliC',fld:'SOLCOLCLIC',pic:'ZZZZZ9'},{av:'A1347SolColCliN',fld:'SOLCOLCLIN',pic:''},{av:'A1357SolColSol',fld:'SOLCOLSOL',pic:''},{av:'A1345SolColAlt',fld:'SOLCOLALT',pic:''},{av:'A1359SolColUlin',fld:'SOLCOLULIN',pic:'Z9'},{av:'A3195SolColRef',fld:'SOLCOLREF',pic:''},{av:'A10918SolColTmp',fld:'SOLCOLTMP',pic:'ZZ9'},{av:'A11803SolColRqM',fld:'SOLCOLRQM',pic:''},{av:'A11804SolColSt',fld:'SOLCOLST',pic:'9'},{av:'A11924SolColEsfe',fld:'SOLCOLESFE',pic:''},{av:'A11925SolColMetd',fld:'SOLCOLMETD',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV58FlagHdr',fld:'vFLAGHDR',pic:'9'},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z407EmprNom'},{av:'Z1352SolColMat'},{av:'Z1356SolColSer'},{av:'Z1358SolColTip'},{av:'Z1349SolColDisN'},{av:'Z1353SolColNom'},{av:'Z1354SolColNum'},{av:'Z1350SolColFec'},{av:'Z3187SolColNor'},{av:'Z3188SolColMaq'},{av:'Z3189SolColTac'},{av:'Z3190SolColCo'},{av:'Z3191SolColPa6'},{av:'Z3192SolColPes'},{av:'Z3193SolColPac'},{av:'Z3194SolColWo'},{av:'Z652OpeCod'},{av:'Z1346SolColCliC'},{av:'Z1347SolColCliN'},{av:'Z1357SolColSol'},{av:'Z1345SolColAlt'},{av:'Z1359SolColUlin'},{av:'Z3195SolColRef'},{av:'Z10918SolColTmp'},{av:'Z11803SolColRqM'},{av:'Z11804SolColSt'},{av:'Z11924SolColEsfe'},{av:'Z11925SolColMetd'},{av:'Z653OpeNom'},{av:'Z1348SolColCod'},{av:'ZV41FlagCal'},{av:'Gx_msg'},{av:'ZV58FlagHdr'},{av:'ZV19FlagM'},{av:'O1359SolColUlin'},{av:'A1348SolColCod',fld:'SOLCOLCOD',pic:'ZZZZZZZ9'},{av:'edtBarCod_Enabled',ctrl:'BARCOD',prop:'Enabled'},{av:'edtBarCodReo_Enabled',ctrl:'BARCODREO',prop:'Enabled'},{av:'edtBarCodPar_Enabled',ctrl:'BARCODPAR',prop:'Enabled'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A3195SolColRef',fld:'SOLCOLREF',pic:''},{av:'A1347SolColCliN',fld:'SOLCOLCLIN',pic:''},{av:'A1354SolColNum',fld:'SOLCOLNUM',pic:'ZZZZZ9'},{av:'A1353SolColNom',fld:'SOLCOLNOM',pic:''},{av:'A1349SolColDisN',fld:'SOLCOLDISN',pic:''},{av:'A1356SolColSer',fld:'SOLCOLSER',pic:''},{av:'A1358SolColTip',fld:'SOLCOLTIP',pic:'ZZZ9'},{av:'A1352SolColMat',fld:'SOLCOLMAT',pic:''},{av:'A1346SolColCliC',fld:'SOLCOLCLIC',pic:'ZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV58FlagHdr',fld:'vFLAGHDR',pic:'9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''},{av:'A1346SolColCliC',fld:'SOLCOLCLIC',pic:'ZZZZZ9'},{av:'A1352SolColMat',fld:'SOLCOLMAT',pic:''},{av:'A1358SolColTip',fld:'SOLCOLTIP',pic:'ZZZ9'},{av:'A1356SolColSer',fld:'SOLCOLSER',pic:''},{av:'A1349SolColDisN',fld:'SOLCOLDISN',pic:''},{av:'A1353SolColNom',fld:'SOLCOLNOM',pic:''},{av:'A1354SolColNum',fld:'SOLCOLNUM',pic:'ZZZZZ9'},{av:'A1347SolColCliN',fld:'SOLCOLCLIN',pic:''},{av:'A3195SolColRef',fld:'SOLCOLREF',pic:''},{av:'AV41FlagCal',fld:'vFLAGCAL',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV58FlagHdr',fld:'vFLAGHDR',pic:'9'}]}");
      setEventMetadata("VALID_SOLCOLMAQ","{handler:'valid_Solcolmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3188SolColMaq',fld:'SOLCOLMAQ',pic:''},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]");
      setEventMetadata("VALID_SOLCOLMAQ",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3188SolColMaq',fld:'SOLCOLMAQ',pic:''},{av:'AV19FlagM',fld:'vFLAGM',pic:'9'}]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_SOLCOLULIN","{handler:'valid_Solcolulin',iparms:[]");
      setEventMetadata("VALID_SOLCOLULIN",",oparms:[]}");
      setEventMetadata("VALID_SOLCOLLIN","{handler:'valid_Solcollin',iparms:[]");
      setEventMetadata("VALID_SOLCOLLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Solcolobs',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      wcpOAV64BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1352SolColMat = "" ;
      Z1356SolColSer = "" ;
      Z1349SolColDisN = "" ;
      Z1353SolColNom = "" ;
      Z1350SolColFec = GXutil.nullDate() ;
      Z3187SolColNor = "" ;
      Z3188SolColMaq = "" ;
      Z3189SolColTac = "" ;
      Z3190SolColCo = "" ;
      Z3191SolColPa6 = "" ;
      Z3192SolColPes = "" ;
      Z3193SolColPac = "" ;
      Z3194SolColWo = "" ;
      Z1347SolColCliN = "" ;
      Z1357SolColSol = "" ;
      Z1345SolColAlt = "" ;
      Z3195SolColRef = "" ;
      Z11803SolColRqM = "" ;
      Z11924SolColEsfe = "" ;
      Z11925SolColMetd = "" ;
      Z1355SolColObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1352SolColMat = "" ;
      A1356SolColSer = "" ;
      A1349SolColDisN = "" ;
      A1353SolColNom = "" ;
      A1347SolColCliN = "" ;
      A3195SolColRef = "" ;
      A3188SolColMaq = "" ;
      AV64BarCodPar = "" ;
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
      A1350SolColFec = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      A3187SolColNor = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A3189SolColTac = "" ;
      lblTextblock17_Jsonclick = "" ;
      A3190SolColCo = "" ;
      lblTextblock18_Jsonclick = "" ;
      A3191SolColPa6 = "" ;
      lblTextblock19_Jsonclick = "" ;
      A3192SolColPes = "" ;
      lblTextblock20_Jsonclick = "" ;
      A3193SolColPac = "" ;
      lblTextblock21_Jsonclick = "" ;
      A3194SolColWo = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A1357SolColSol = "" ;
      lblTextblock27_Jsonclick = "" ;
      A1345SolColAlt = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A11803SolColRqM = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      A11924SolColEsfe = "" ;
      lblTextblock34_Jsonclick = "" ;
      A11925SolColMetd = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode189 = "" ;
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
      sMode188 = "" ;
      GXCCtl = "" ;
      A1355SolColObs = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV21LitFe = "" ;
      AV20Lit0 = "" ;
      AV35Lit4 = "" ;
      AV38Lit7 = "" ;
      AV46LitSer = "" ;
      AV48LitCli = "" ;
      AV47LitMat = "" ;
      AV44LitNTest = "" ;
      AV45LitFTest = "" ;
      AV43LitHDR = "" ;
      AV50LitNorma = "" ;
      AV49LitMaq = "" ;
      AV51LitResul = "" ;
      AV56LitOper = "" ;
      AV57LitObser = "" ;
      AV52LitTit = "" ;
      AV42LitRef = "" ;
      AV53LitMancha = "" ;
      AV54LitMancha2 = "" ;
      AV55LitAltCol = "" ;
      AV59LitTmp = "" ;
      AV60Lit200 = "" ;
      AV61Lit202 = "" ;
      AV65Lit203 = "" ;
      AV66Lit204 = "" ;
      GXt_char4 = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T01IA6_A407EmprNom = new String[] {""} ;
      T01IA6_n407EmprNom = new boolean[] {false} ;
      T01IA8_A1348SolColCod = new int[1] ;
      T01IA8_A129BarCod = new int[1] ;
      T01IA8_n129BarCod = new boolean[] {false} ;
      T01IA8_A132BarCodReo = new byte[1] ;
      T01IA8_n132BarCodReo = new boolean[] {false} ;
      T01IA8_A130BarCodPar = new String[] {""} ;
      T01IA8_n130BarCodPar = new boolean[] {false} ;
      T01IA8_A407EmprNom = new String[] {""} ;
      T01IA8_n407EmprNom = new boolean[] {false} ;
      T01IA8_A1352SolColMat = new String[] {""} ;
      T01IA8_n1352SolColMat = new boolean[] {false} ;
      T01IA8_A1356SolColSer = new String[] {""} ;
      T01IA8_n1356SolColSer = new boolean[] {false} ;
      T01IA8_A1358SolColTip = new short[1] ;
      T01IA8_n1358SolColTip = new boolean[] {false} ;
      T01IA8_A1349SolColDisN = new String[] {""} ;
      T01IA8_n1349SolColDisN = new boolean[] {false} ;
      T01IA8_A1353SolColNom = new String[] {""} ;
      T01IA8_n1353SolColNom = new boolean[] {false} ;
      T01IA8_A1354SolColNum = new int[1] ;
      T01IA8_n1354SolColNum = new boolean[] {false} ;
      T01IA8_A1350SolColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IA8_n1350SolColFec = new boolean[] {false} ;
      T01IA8_A3187SolColNor = new String[] {""} ;
      T01IA8_n3187SolColNor = new boolean[] {false} ;
      T01IA8_A3188SolColMaq = new String[] {""} ;
      T01IA8_n3188SolColMaq = new boolean[] {false} ;
      T01IA8_A3189SolColTac = new String[] {""} ;
      T01IA8_n3189SolColTac = new boolean[] {false} ;
      T01IA8_A3190SolColCo = new String[] {""} ;
      T01IA8_n3190SolColCo = new boolean[] {false} ;
      T01IA8_A3191SolColPa6 = new String[] {""} ;
      T01IA8_n3191SolColPa6 = new boolean[] {false} ;
      T01IA8_A3192SolColPes = new String[] {""} ;
      T01IA8_n3192SolColPes = new boolean[] {false} ;
      T01IA8_A3193SolColPac = new String[] {""} ;
      T01IA8_n3193SolColPac = new boolean[] {false} ;
      T01IA8_A3194SolColWo = new String[] {""} ;
      T01IA8_n3194SolColWo = new boolean[] {false} ;
      T01IA8_A653OpeNom = new String[] {""} ;
      T01IA8_n653OpeNom = new boolean[] {false} ;
      T01IA8_A1346SolColCliC = new int[1] ;
      T01IA8_n1346SolColCliC = new boolean[] {false} ;
      T01IA8_A1347SolColCliN = new String[] {""} ;
      T01IA8_n1347SolColCliN = new boolean[] {false} ;
      T01IA8_A1357SolColSol = new String[] {""} ;
      T01IA8_n1357SolColSol = new boolean[] {false} ;
      T01IA8_A1345SolColAlt = new String[] {""} ;
      T01IA8_n1345SolColAlt = new boolean[] {false} ;
      T01IA8_A1359SolColUlin = new byte[1] ;
      T01IA8_n1359SolColUlin = new boolean[] {false} ;
      T01IA8_A3195SolColRef = new String[] {""} ;
      T01IA8_n3195SolColRef = new boolean[] {false} ;
      T01IA8_A10918SolColTmp = new short[1] ;
      T01IA8_n10918SolColTmp = new boolean[] {false} ;
      T01IA8_A11803SolColRqM = new String[] {""} ;
      T01IA8_n11803SolColRqM = new boolean[] {false} ;
      T01IA8_A11804SolColSt = new byte[1] ;
      T01IA8_n11804SolColSt = new boolean[] {false} ;
      T01IA8_A11924SolColEsfe = new String[] {""} ;
      T01IA8_n11924SolColEsfe = new boolean[] {false} ;
      T01IA8_A11925SolColMetd = new String[] {""} ;
      T01IA8_n11925SolColMetd = new boolean[] {false} ;
      T01IA8_A396EmprCod = new String[] {""} ;
      T01IA8_A652OpeCod = new int[1] ;
      T01IA8_n652OpeCod = new boolean[] {false} ;
      T01IA7_A653OpeNom = new String[] {""} ;
      T01IA7_n653OpeNom = new boolean[] {false} ;
      T01IA9_A653OpeNom = new String[] {""} ;
      T01IA9_n653OpeNom = new boolean[] {false} ;
      T01IA10_A396EmprCod = new String[] {""} ;
      T01IA10_A1348SolColCod = new int[1] ;
      T01IA5_A1348SolColCod = new int[1] ;
      T01IA5_A129BarCod = new int[1] ;
      T01IA5_n129BarCod = new boolean[] {false} ;
      T01IA5_A132BarCodReo = new byte[1] ;
      T01IA5_n132BarCodReo = new boolean[] {false} ;
      T01IA5_A130BarCodPar = new String[] {""} ;
      T01IA5_n130BarCodPar = new boolean[] {false} ;
      T01IA5_A1352SolColMat = new String[] {""} ;
      T01IA5_n1352SolColMat = new boolean[] {false} ;
      T01IA5_A1356SolColSer = new String[] {""} ;
      T01IA5_n1356SolColSer = new boolean[] {false} ;
      T01IA5_A1358SolColTip = new short[1] ;
      T01IA5_n1358SolColTip = new boolean[] {false} ;
      T01IA5_A1349SolColDisN = new String[] {""} ;
      T01IA5_n1349SolColDisN = new boolean[] {false} ;
      T01IA5_A1353SolColNom = new String[] {""} ;
      T01IA5_n1353SolColNom = new boolean[] {false} ;
      T01IA5_A1354SolColNum = new int[1] ;
      T01IA5_n1354SolColNum = new boolean[] {false} ;
      T01IA5_A1350SolColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IA5_n1350SolColFec = new boolean[] {false} ;
      T01IA5_A3187SolColNor = new String[] {""} ;
      T01IA5_n3187SolColNor = new boolean[] {false} ;
      T01IA5_A3188SolColMaq = new String[] {""} ;
      T01IA5_n3188SolColMaq = new boolean[] {false} ;
      T01IA5_A3189SolColTac = new String[] {""} ;
      T01IA5_n3189SolColTac = new boolean[] {false} ;
      T01IA5_A3190SolColCo = new String[] {""} ;
      T01IA5_n3190SolColCo = new boolean[] {false} ;
      T01IA5_A3191SolColPa6 = new String[] {""} ;
      T01IA5_n3191SolColPa6 = new boolean[] {false} ;
      T01IA5_A3192SolColPes = new String[] {""} ;
      T01IA5_n3192SolColPes = new boolean[] {false} ;
      T01IA5_A3193SolColPac = new String[] {""} ;
      T01IA5_n3193SolColPac = new boolean[] {false} ;
      T01IA5_A3194SolColWo = new String[] {""} ;
      T01IA5_n3194SolColWo = new boolean[] {false} ;
      T01IA5_A1346SolColCliC = new int[1] ;
      T01IA5_n1346SolColCliC = new boolean[] {false} ;
      T01IA5_A1347SolColCliN = new String[] {""} ;
      T01IA5_n1347SolColCliN = new boolean[] {false} ;
      T01IA5_A1357SolColSol = new String[] {""} ;
      T01IA5_n1357SolColSol = new boolean[] {false} ;
      T01IA5_A1345SolColAlt = new String[] {""} ;
      T01IA5_n1345SolColAlt = new boolean[] {false} ;
      T01IA5_A1359SolColUlin = new byte[1] ;
      T01IA5_n1359SolColUlin = new boolean[] {false} ;
      T01IA5_A3195SolColRef = new String[] {""} ;
      T01IA5_n3195SolColRef = new boolean[] {false} ;
      T01IA5_A10918SolColTmp = new short[1] ;
      T01IA5_n10918SolColTmp = new boolean[] {false} ;
      T01IA5_A11803SolColRqM = new String[] {""} ;
      T01IA5_n11803SolColRqM = new boolean[] {false} ;
      T01IA5_A11804SolColSt = new byte[1] ;
      T01IA5_n11804SolColSt = new boolean[] {false} ;
      T01IA5_A11924SolColEsfe = new String[] {""} ;
      T01IA5_n11924SolColEsfe = new boolean[] {false} ;
      T01IA5_A11925SolColMetd = new String[] {""} ;
      T01IA5_n11925SolColMetd = new boolean[] {false} ;
      T01IA5_A396EmprCod = new String[] {""} ;
      T01IA5_A652OpeCod = new int[1] ;
      T01IA5_n652OpeCod = new boolean[] {false} ;
      T01IA11_A396EmprCod = new String[] {""} ;
      T01IA11_A1348SolColCod = new int[1] ;
      T01IA12_A396EmprCod = new String[] {""} ;
      T01IA12_A1348SolColCod = new int[1] ;
      T01IA4_A1348SolColCod = new int[1] ;
      T01IA4_A129BarCod = new int[1] ;
      T01IA4_n129BarCod = new boolean[] {false} ;
      T01IA4_A132BarCodReo = new byte[1] ;
      T01IA4_n132BarCodReo = new boolean[] {false} ;
      T01IA4_A130BarCodPar = new String[] {""} ;
      T01IA4_n130BarCodPar = new boolean[] {false} ;
      T01IA4_A1352SolColMat = new String[] {""} ;
      T01IA4_n1352SolColMat = new boolean[] {false} ;
      T01IA4_A1356SolColSer = new String[] {""} ;
      T01IA4_n1356SolColSer = new boolean[] {false} ;
      T01IA4_A1358SolColTip = new short[1] ;
      T01IA4_n1358SolColTip = new boolean[] {false} ;
      T01IA4_A1349SolColDisN = new String[] {""} ;
      T01IA4_n1349SolColDisN = new boolean[] {false} ;
      T01IA4_A1353SolColNom = new String[] {""} ;
      T01IA4_n1353SolColNom = new boolean[] {false} ;
      T01IA4_A1354SolColNum = new int[1] ;
      T01IA4_n1354SolColNum = new boolean[] {false} ;
      T01IA4_A1350SolColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IA4_n1350SolColFec = new boolean[] {false} ;
      T01IA4_A3187SolColNor = new String[] {""} ;
      T01IA4_n3187SolColNor = new boolean[] {false} ;
      T01IA4_A3188SolColMaq = new String[] {""} ;
      T01IA4_n3188SolColMaq = new boolean[] {false} ;
      T01IA4_A3189SolColTac = new String[] {""} ;
      T01IA4_n3189SolColTac = new boolean[] {false} ;
      T01IA4_A3190SolColCo = new String[] {""} ;
      T01IA4_n3190SolColCo = new boolean[] {false} ;
      T01IA4_A3191SolColPa6 = new String[] {""} ;
      T01IA4_n3191SolColPa6 = new boolean[] {false} ;
      T01IA4_A3192SolColPes = new String[] {""} ;
      T01IA4_n3192SolColPes = new boolean[] {false} ;
      T01IA4_A3193SolColPac = new String[] {""} ;
      T01IA4_n3193SolColPac = new boolean[] {false} ;
      T01IA4_A3194SolColWo = new String[] {""} ;
      T01IA4_n3194SolColWo = new boolean[] {false} ;
      T01IA4_A1346SolColCliC = new int[1] ;
      T01IA4_n1346SolColCliC = new boolean[] {false} ;
      T01IA4_A1347SolColCliN = new String[] {""} ;
      T01IA4_n1347SolColCliN = new boolean[] {false} ;
      T01IA4_A1357SolColSol = new String[] {""} ;
      T01IA4_n1357SolColSol = new boolean[] {false} ;
      T01IA4_A1345SolColAlt = new String[] {""} ;
      T01IA4_n1345SolColAlt = new boolean[] {false} ;
      T01IA4_A1359SolColUlin = new byte[1] ;
      T01IA4_n1359SolColUlin = new boolean[] {false} ;
      T01IA4_A3195SolColRef = new String[] {""} ;
      T01IA4_n3195SolColRef = new boolean[] {false} ;
      T01IA4_A10918SolColTmp = new short[1] ;
      T01IA4_n10918SolColTmp = new boolean[] {false} ;
      T01IA4_A11803SolColRqM = new String[] {""} ;
      T01IA4_n11803SolColRqM = new boolean[] {false} ;
      T01IA4_A11804SolColSt = new byte[1] ;
      T01IA4_n11804SolColSt = new boolean[] {false} ;
      T01IA4_A11924SolColEsfe = new String[] {""} ;
      T01IA4_n11924SolColEsfe = new boolean[] {false} ;
      T01IA4_A11925SolColMetd = new String[] {""} ;
      T01IA4_n11925SolColMetd = new boolean[] {false} ;
      T01IA4_A396EmprCod = new String[] {""} ;
      T01IA4_A652OpeCod = new int[1] ;
      T01IA4_n652OpeCod = new boolean[] {false} ;
      T01IA16_A653OpeNom = new String[] {""} ;
      T01IA16_n653OpeNom = new boolean[] {false} ;
      T01IA18_A396EmprCod = new String[] {""} ;
      T01IA18_A1348SolColCod = new int[1] ;
      T01IA19_A1348SolColCod = new int[1] ;
      T01IA19_A1351SolColLin = new byte[1] ;
      T01IA19_A1355SolColObs = new String[] {""} ;
      T01IA19_n1355SolColObs = new boolean[] {false} ;
      T01IA19_A396EmprCod = new String[] {""} ;
      T01IA20_A396EmprCod = new String[] {""} ;
      T01IA20_A1348SolColCod = new int[1] ;
      T01IA20_A1351SolColLin = new byte[1] ;
      T01IA3_A1348SolColCod = new int[1] ;
      T01IA3_A1351SolColLin = new byte[1] ;
      T01IA3_A1355SolColObs = new String[] {""} ;
      T01IA3_n1355SolColObs = new boolean[] {false} ;
      T01IA3_A396EmprCod = new String[] {""} ;
      T01IA2_A1348SolColCod = new int[1] ;
      T01IA2_A1351SolColLin = new byte[1] ;
      T01IA2_A1355SolColObs = new String[] {""} ;
      T01IA2_n1355SolColObs = new boolean[] {false} ;
      T01IA2_A396EmprCod = new String[] {""} ;
      T01IA24_A396EmprCod = new String[] {""} ;
      T01IA24_A1348SolColCod = new int[1] ;
      T01IA24_A1351SolColLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i1350SolColFec = GXutil.nullDate() ;
      i11925SolColMetd = "" ;
      i11803SolColRqM = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01IA25_A407EmprNom = new String[] {""} ;
      T01IA25_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ1352SolColMat = "" ;
      ZZ1356SolColSer = "" ;
      ZZ1349SolColDisN = "" ;
      ZZ1353SolColNom = "" ;
      ZZ1350SolColFec = GXutil.nullDate() ;
      ZZ3187SolColNor = "" ;
      ZZ3188SolColMaq = "" ;
      ZZ3189SolColTac = "" ;
      ZZ3190SolColCo = "" ;
      ZZ3191SolColPa6 = "" ;
      ZZ3192SolColPes = "" ;
      ZZ3193SolColPac = "" ;
      ZZ3194SolColWo = "" ;
      ZZ1347SolColCliN = "" ;
      ZZ1357SolColSol = "" ;
      ZZ1345SolColAlt = "" ;
      ZZ3195SolColRef = "" ;
      ZZ11803SolColRqM = "" ;
      ZZ11924SolColEsfe = "" ;
      ZZ11925SolColMetd = "" ;
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
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpsolcor__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpsolcor__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpsolcor__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpsolcor__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpsolcor__default(),
         new Object[] {
             new Object[] {
            T01IA2_A1348SolColCod, T01IA2_A1351SolColLin, T01IA2_A1355SolColObs, T01IA2_n1355SolColObs, T01IA2_A396EmprCod
            }
            , new Object[] {
            T01IA3_A1348SolColCod, T01IA3_A1351SolColLin, T01IA3_A1355SolColObs, T01IA3_n1355SolColObs, T01IA3_A396EmprCod
            }
            , new Object[] {
            T01IA4_A1348SolColCod, T01IA4_A129BarCod, T01IA4_n129BarCod, T01IA4_A132BarCodReo, T01IA4_n132BarCodReo, T01IA4_A130BarCodPar, T01IA4_n130BarCodPar, T01IA4_A1352SolColMat, T01IA4_n1352SolColMat, T01IA4_A1356SolColSer,
            T01IA4_n1356SolColSer, T01IA4_A1358SolColTip, T01IA4_n1358SolColTip, T01IA4_A1349SolColDisN, T01IA4_n1349SolColDisN, T01IA4_A1353SolColNom, T01IA4_n1353SolColNom, T01IA4_A1354SolColNum, T01IA4_n1354SolColNum, T01IA4_A1350SolColFec,
            T01IA4_n1350SolColFec, T01IA4_A3187SolColNor, T01IA4_n3187SolColNor, T01IA4_A3188SolColMaq, T01IA4_n3188SolColMaq, T01IA4_A3189SolColTac, T01IA4_n3189SolColTac, T01IA4_A3190SolColCo, T01IA4_n3190SolColCo, T01IA4_A3191SolColPa6,
            T01IA4_n3191SolColPa6, T01IA4_A3192SolColPes, T01IA4_n3192SolColPes, T01IA4_A3193SolColPac, T01IA4_n3193SolColPac, T01IA4_A3194SolColWo, T01IA4_n3194SolColWo, T01IA4_A1346SolColCliC, T01IA4_n1346SolColCliC, T01IA4_A1347SolColCliN,
            T01IA4_n1347SolColCliN, T01IA4_A1357SolColSol, T01IA4_n1357SolColSol, T01IA4_A1345SolColAlt, T01IA4_n1345SolColAlt, T01IA4_A1359SolColUlin, T01IA4_n1359SolColUlin, T01IA4_A3195SolColRef, T01IA4_n3195SolColRef, T01IA4_A10918SolColTmp,
            T01IA4_n10918SolColTmp, T01IA4_A11803SolColRqM, T01IA4_n11803SolColRqM, T01IA4_A11804SolColSt, T01IA4_n11804SolColSt, T01IA4_A11924SolColEsfe, T01IA4_n11924SolColEsfe, T01IA4_A11925SolColMetd, T01IA4_n11925SolColMetd, T01IA4_A396EmprCod,
            T01IA4_A652OpeCod, T01IA4_n652OpeCod
            }
            , new Object[] {
            T01IA5_A1348SolColCod, T01IA5_A129BarCod, T01IA5_n129BarCod, T01IA5_A132BarCodReo, T01IA5_n132BarCodReo, T01IA5_A130BarCodPar, T01IA5_n130BarCodPar, T01IA5_A1352SolColMat, T01IA5_n1352SolColMat, T01IA5_A1356SolColSer,
            T01IA5_n1356SolColSer, T01IA5_A1358SolColTip, T01IA5_n1358SolColTip, T01IA5_A1349SolColDisN, T01IA5_n1349SolColDisN, T01IA5_A1353SolColNom, T01IA5_n1353SolColNom, T01IA5_A1354SolColNum, T01IA5_n1354SolColNum, T01IA5_A1350SolColFec,
            T01IA5_n1350SolColFec, T01IA5_A3187SolColNor, T01IA5_n3187SolColNor, T01IA5_A3188SolColMaq, T01IA5_n3188SolColMaq, T01IA5_A3189SolColTac, T01IA5_n3189SolColTac, T01IA5_A3190SolColCo, T01IA5_n3190SolColCo, T01IA5_A3191SolColPa6,
            T01IA5_n3191SolColPa6, T01IA5_A3192SolColPes, T01IA5_n3192SolColPes, T01IA5_A3193SolColPac, T01IA5_n3193SolColPac, T01IA5_A3194SolColWo, T01IA5_n3194SolColWo, T01IA5_A1346SolColCliC, T01IA5_n1346SolColCliC, T01IA5_A1347SolColCliN,
            T01IA5_n1347SolColCliN, T01IA5_A1357SolColSol, T01IA5_n1357SolColSol, T01IA5_A1345SolColAlt, T01IA5_n1345SolColAlt, T01IA5_A1359SolColUlin, T01IA5_n1359SolColUlin, T01IA5_A3195SolColRef, T01IA5_n3195SolColRef, T01IA5_A10918SolColTmp,
            T01IA5_n10918SolColTmp, T01IA5_A11803SolColRqM, T01IA5_n11803SolColRqM, T01IA5_A11804SolColSt, T01IA5_n11804SolColSt, T01IA5_A11924SolColEsfe, T01IA5_n11924SolColEsfe, T01IA5_A11925SolColMetd, T01IA5_n11925SolColMetd, T01IA5_A396EmprCod,
            T01IA5_A652OpeCod, T01IA5_n652OpeCod
            }
            , new Object[] {
            T01IA6_A407EmprNom, T01IA6_n407EmprNom
            }
            , new Object[] {
            T01IA7_A653OpeNom, T01IA7_n653OpeNom
            }
            , new Object[] {
            T01IA8_A1348SolColCod, T01IA8_A129BarCod, T01IA8_n129BarCod, T01IA8_A132BarCodReo, T01IA8_n132BarCodReo, T01IA8_A130BarCodPar, T01IA8_n130BarCodPar, T01IA8_A407EmprNom, T01IA8_n407EmprNom, T01IA8_A1352SolColMat,
            T01IA8_n1352SolColMat, T01IA8_A1356SolColSer, T01IA8_n1356SolColSer, T01IA8_A1358SolColTip, T01IA8_n1358SolColTip, T01IA8_A1349SolColDisN, T01IA8_n1349SolColDisN, T01IA8_A1353SolColNom, T01IA8_n1353SolColNom, T01IA8_A1354SolColNum,
            T01IA8_n1354SolColNum, T01IA8_A1350SolColFec, T01IA8_n1350SolColFec, T01IA8_A3187SolColNor, T01IA8_n3187SolColNor, T01IA8_A3188SolColMaq, T01IA8_n3188SolColMaq, T01IA8_A3189SolColTac, T01IA8_n3189SolColTac, T01IA8_A3190SolColCo,
            T01IA8_n3190SolColCo, T01IA8_A3191SolColPa6, T01IA8_n3191SolColPa6, T01IA8_A3192SolColPes, T01IA8_n3192SolColPes, T01IA8_A3193SolColPac, T01IA8_n3193SolColPac, T01IA8_A3194SolColWo, T01IA8_n3194SolColWo, T01IA8_A653OpeNom,
            T01IA8_n653OpeNom, T01IA8_A1346SolColCliC, T01IA8_n1346SolColCliC, T01IA8_A1347SolColCliN, T01IA8_n1347SolColCliN, T01IA8_A1357SolColSol, T01IA8_n1357SolColSol, T01IA8_A1345SolColAlt, T01IA8_n1345SolColAlt, T01IA8_A1359SolColUlin,
            T01IA8_n1359SolColUlin, T01IA8_A3195SolColRef, T01IA8_n3195SolColRef, T01IA8_A10918SolColTmp, T01IA8_n10918SolColTmp, T01IA8_A11803SolColRqM, T01IA8_n11803SolColRqM, T01IA8_A11804SolColSt, T01IA8_n11804SolColSt, T01IA8_A11924SolColEsfe,
            T01IA8_n11924SolColEsfe, T01IA8_A11925SolColMetd, T01IA8_n11925SolColMetd, T01IA8_A396EmprCod, T01IA8_A652OpeCod, T01IA8_n652OpeCod
            }
            , new Object[] {
            T01IA9_A653OpeNom, T01IA9_n653OpeNom
            }
            , new Object[] {
            T01IA10_A396EmprCod, T01IA10_A1348SolColCod
            }
            , new Object[] {
            T01IA11_A396EmprCod, T01IA11_A1348SolColCod
            }
            , new Object[] {
            T01IA12_A396EmprCod, T01IA12_A1348SolColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IA16_A653OpeNom, T01IA16_n653OpeNom
            }
            , new Object[] {
            }
            , new Object[] {
            T01IA18_A396EmprCod, T01IA18_A1348SolColCod
            }
            , new Object[] {
            T01IA19_A1348SolColCod, T01IA19_A1351SolColLin, T01IA19_A1355SolColObs, T01IA19_n1355SolColObs, T01IA19_A396EmprCod
            }
            , new Object[] {
            T01IA20_A396EmprCod, T01IA20_A1348SolColCod, T01IA20_A1351SolColLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IA24_A396EmprCod, T01IA24_A1348SolColCod, T01IA24_A1351SolColLin
            }
            , new Object[] {
            T01IA25_A407EmprNom, T01IA25_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z11803SolColRqM = "4" ;
      n11803SolColRqM = false ;
      A11803SolColRqM = "4" ;
      n11803SolColRqM = false ;
      i11803SolColRqM = "4" ;
      n11803SolColRqM = false ;
      Z11925SolColMetd = httpContext.getMessage( "NEXT MET 2", "") ;
      n11925SolColMetd = false ;
      A11925SolColMetd = httpContext.getMessage( "NEXT MET 2", "") ;
      n11925SolColMetd = false ;
      i11925SolColMetd = httpContext.getMessage( "NEXT MET 2", "") ;
      n11925SolColMetd = false ;
      Z11804SolColSt = (byte)(1) ;
      n11804SolColSt = false ;
      A11804SolColSt = (byte)(1) ;
      n11804SolColSt = false ;
      i11804SolColSt = (byte)(1) ;
      n11804SolColSt = false ;
      Z10918SolColTmp = (short)(40) ;
      n10918SolColTmp = false ;
      A10918SolColTmp = (short)(40) ;
      n10918SolColTmp = false ;
      i10918SolColTmp = (short)(40) ;
      n10918SolColTmp = false ;
      Z1350SolColFec = GXutil.today( ) ;
      n1350SolColFec = false ;
      A1350SolColFec = GXutil.today( ) ;
      n1350SolColFec = false ;
      i1350SolColFec = GXutil.today( ) ;
      n1350SolColFec = false ;
   }

   private byte wcpOAV63BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z1359SolColUlin ;
   private byte Z11804SolColSt ;
   private byte O1359SolColUlin ;
   private byte Z1351SolColLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV19FlagM ;
   private byte AV58FlagHdr ;
   private byte AV63BarCodReo ;
   private byte nKeyPressed ;
   private byte A1359SolColUlin ;
   private byte Gx_BScreen ;
   private byte A11804SolColSt ;
   private byte B1359SolColUlin ;
   private byte s1359SolColUlin ;
   private byte A1351SolColLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i11804SolColSt ;
   private byte i1359SolColUlin ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZV58FlagHdr ;
   private byte ZV19FlagM ;
   private byte ZZ132BarCodReo ;
   private byte ZZ1359SolColUlin ;
   private byte ZZ11804SolColSt ;
   private byte ZZV58FlagHdr ;
   private byte ZZV19FlagM ;
   private byte ZO1359SolColUlin ;
   private byte GXv_int6[] ;
   private byte GXv_int17[] ;
   private short Z1358SolColTip ;
   private short Z10918SolColTmp ;
   private short nRcdDeleted_189 ;
   private short nRcdExists_189 ;
   private short nIsMod_189 ;
   private short A1358SolColTip ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10918SolColTmp ;
   private short nBlankRcdCount189 ;
   private short RcdFound189 ;
   private short nBlankRcdUsr189 ;
   private short RcdFound188 ;
   private short nIsDirty_188 ;
   private short nIsDirty_189 ;
   private short i10918SolColTmp ;
   private short ZZ1358SolColTip ;
   private short ZZ10918SolColTmp ;
   private short GXv_int15[] ;
   private short GXv_int14[] ;
   private short GXv_int8[] ;
   private int wcpOAV62BarCod ;
   private int Z1348SolColCod ;
   private int Z129BarCod ;
   private int Z1354SolColNum ;
   private int Z1346SolColCliC ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_190 ;
   private int nGXsfl_190_idx=1 ;
   private int A1348SolColCod ;
   private int A129BarCod ;
   private int A1346SolColCliC ;
   private int A1354SolColNum ;
   private int AV41FlagCal ;
   private int A652OpeCod ;
   private int AV62BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtSolColCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtSolColMat_Enabled ;
   private int edtSolColSer_Enabled ;
   private int edtSolColTip_Enabled ;
   private int edtSolColDisN_Enabled ;
   private int edtSolColNom_Enabled ;
   private int edtSolColNum_Enabled ;
   private int edtSolColFec_Enabled ;
   private int edtSolColNor_Enabled ;
   private int edtSolColMaq_Enabled ;
   private int edtSolColTac_Enabled ;
   private int edtSolColCo_Enabled ;
   private int edtSolColPa6_Enabled ;
   private int edtSolColPes_Enabled ;
   private int edtSolColPac_Enabled ;
   private int edtSolColWo_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtSolColCliC_Enabled ;
   private int edtSolColCliN_Enabled ;
   private int edtSolColSol_Enabled ;
   private int edtSolColAlt_Enabled ;
   private int edtSolColUlin_Enabled ;
   private int edtSolColRef_Enabled ;
   private int edtSolColTmp_Enabled ;
   private int edtSolColRqM_Enabled ;
   private int edtSolColSt_Enabled ;
   private int edtSolColEsfe_Enabled ;
   private int edtSolColMetd_Enabled ;
   private int edtavnRcdDeleted_189_Enabled ;
   private int edtSolColLin_Enabled ;
   private int edtSolColObs_Enabled ;
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
   private int defedtSolColLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSolColMetd_Backcolor ;
   private int edtSolColEsfe_Backcolor ;
   private int edtSolColSt_Backcolor ;
   private int edtSolColRqM_Backcolor ;
   private int edtSolColTmp_Backcolor ;
   private int edtSolColRef_Backcolor ;
   private int edtSolColUlin_Backcolor ;
   private int edtSolColAlt_Backcolor ;
   private int edtSolColSol_Backcolor ;
   private int edtSolColCliN_Backcolor ;
   private int edtSolColCliC_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtSolColWo_Backcolor ;
   private int edtSolColPac_Backcolor ;
   private int edtSolColPes_Backcolor ;
   private int edtSolColPa6_Backcolor ;
   private int edtSolColCo_Backcolor ;
   private int edtSolColTac_Backcolor ;
   private int edtSolColMaq_Backcolor ;
   private int edtSolColNor_Backcolor ;
   private int edtSolColFec_Backcolor ;
   private int edtSolColNum_Backcolor ;
   private int edtSolColNom_Backcolor ;
   private int edtSolColDisN_Backcolor ;
   private int edtSolColTip_Backcolor ;
   private int edtSolColSer_Backcolor ;
   private int edtSolColMat_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtSolColCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZV41FlagCal ;
   private int ZZ129BarCod ;
   private int ZZ1354SolColNum ;
   private int ZZ652OpeCod ;
   private int ZZ1346SolColCliC ;
   private int ZZ1348SolColCod ;
   private int ZZV41FlagCal ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int GXv_int12[] ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV64BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z1352SolColMat ;
   private String Z1356SolColSer ;
   private String Z1349SolColDisN ;
   private String Z1353SolColNom ;
   private String Z3187SolColNor ;
   private String Z3188SolColMaq ;
   private String Z3189SolColTac ;
   private String Z3190SolColCo ;
   private String Z3191SolColPa6 ;
   private String Z3192SolColPes ;
   private String Z3193SolColPac ;
   private String Z3194SolColWo ;
   private String Z1347SolColCliN ;
   private String Z1357SolColSol ;
   private String Z1345SolColAlt ;
   private String Z3195SolColRef ;
   private String Z11803SolColRqM ;
   private String Z11924SolColEsfe ;
   private String Z11925SolColMetd ;
   private String Z1355SolColObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1352SolColMat ;
   private String A1356SolColSer ;
   private String A1349SolColDisN ;
   private String A1353SolColNom ;
   private String A1347SolColCliN ;
   private String A3195SolColRef ;
   private String A3188SolColMaq ;
   private String AV64BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSolColCod_Internalname ;
   private String sGXsfl_190_idx="0001" ;
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
   private String edtSolColCod_Jsonclick ;
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
   private String edtSolColMat_Internalname ;
   private String edtSolColMat_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSolColSer_Internalname ;
   private String edtSolColSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSolColTip_Internalname ;
   private String edtSolColTip_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSolColDisN_Internalname ;
   private String edtSolColDisN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSolColNom_Internalname ;
   private String edtSolColNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtSolColNum_Internalname ;
   private String edtSolColNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtSolColFec_Internalname ;
   private String edtSolColFec_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtSolColNor_Internalname ;
   private String A3187SolColNor ;
   private String edtSolColNor_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtSolColMaq_Internalname ;
   private String edtSolColMaq_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtSolColTac_Internalname ;
   private String A3189SolColTac ;
   private String edtSolColTac_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtSolColCo_Internalname ;
   private String A3190SolColCo ;
   private String edtSolColCo_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtSolColPa6_Internalname ;
   private String A3191SolColPa6 ;
   private String edtSolColPa6_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtSolColPes_Internalname ;
   private String A3192SolColPes ;
   private String edtSolColPes_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtSolColPac_Internalname ;
   private String A3193SolColPac ;
   private String edtSolColPac_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtSolColWo_Internalname ;
   private String A3194SolColWo ;
   private String edtSolColWo_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtOpeCod_Internalname ;
   private String edtOpeCod_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtOpeNom_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtSolColCliC_Internalname ;
   private String edtSolColCliC_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtSolColCliN_Internalname ;
   private String edtSolColCliN_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtSolColSol_Internalname ;
   private String A1357SolColSol ;
   private String edtSolColSol_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtSolColAlt_Internalname ;
   private String A1345SolColAlt ;
   private String edtSolColAlt_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtSolColUlin_Internalname ;
   private String edtSolColUlin_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtSolColRef_Internalname ;
   private String edtSolColRef_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtSolColTmp_Internalname ;
   private String edtSolColTmp_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtSolColRqM_Internalname ;
   private String A11803SolColRqM ;
   private String edtSolColRqM_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtSolColSt_Internalname ;
   private String edtSolColSt_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtSolColEsfe_Internalname ;
   private String A11924SolColEsfe ;
   private String edtSolColEsfe_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtSolColMetd_Internalname ;
   private String A11925SolColMetd ;
   private String edtSolColMetd_Jsonclick ;
   private String sMode189 ;
   private String edtavnRcdDeleted_189_Internalname ;
   private String edtSolColLin_Internalname ;
   private String edtSolColObs_Internalname ;
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
   private String sMode188 ;
   private String GXCCtl ;
   private String A1355SolColObs ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String AV21LitFe ;
   private String AV20Lit0 ;
   private String AV35Lit4 ;
   private String AV38Lit7 ;
   private String AV46LitSer ;
   private String AV48LitCli ;
   private String AV47LitMat ;
   private String AV44LitNTest ;
   private String AV45LitFTest ;
   private String AV43LitHDR ;
   private String AV50LitNorma ;
   private String AV49LitMaq ;
   private String AV51LitResul ;
   private String AV56LitOper ;
   private String AV57LitObser ;
   private String AV52LitTit ;
   private String AV42LitRef ;
   private String AV53LitMancha ;
   private String AV54LitMancha2 ;
   private String AV55LitAltCol ;
   private String AV59LitTmp ;
   private String AV60Lit200 ;
   private String AV61Lit202 ;
   private String AV65Lit203 ;
   private String AV66Lit204 ;
   private String GXt_char4 ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String sGXsfl_190_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_189_Jsonclick ;
   private String edtSolColLin_Jsonclick ;
   private String edtSolColObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11925SolColMetd ;
   private String i11803SolColRqM ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String ZZ1352SolColMat ;
   private String ZZ1356SolColSer ;
   private String ZZ1349SolColDisN ;
   private String ZZ1353SolColNom ;
   private String ZZ3187SolColNor ;
   private String ZZ3188SolColMaq ;
   private String ZZ3189SolColTac ;
   private String ZZ3190SolColCo ;
   private String ZZ3191SolColPa6 ;
   private String ZZ3192SolColPes ;
   private String ZZ3193SolColPac ;
   private String ZZ3194SolColWo ;
   private String ZZ1347SolColCliN ;
   private String ZZ1357SolColSol ;
   private String ZZ1345SolColAlt ;
   private String ZZ3195SolColRef ;
   private String ZZ11803SolColRqM ;
   private String ZZ11924SolColEsfe ;
   private String ZZ11925SolColMetd ;
   private String ZZ653OpeNom ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char16[] ;
   private String GXv_char13[] ;
   private java.util.Date Z1350SolColFec ;
   private java.util.Date A1350SolColFec ;
   private java.util.Date i1350SolColFec ;
   private java.util.Date ZZ1350SolColFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n1346SolColCliC ;
   private boolean n1352SolColMat ;
   private boolean n1358SolColTip ;
   private boolean n1356SolColSer ;
   private boolean n1349SolColDisN ;
   private boolean n1353SolColNom ;
   private boolean n1354SolColNum ;
   private boolean n1347SolColCliN ;
   private boolean n3195SolColRef ;
   private boolean n3188SolColMaq ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean n1359SolColUlin ;
   private boolean bGXsfl_190_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n1350SolColFec ;
   private boolean n3187SolColNor ;
   private boolean n3189SolColTac ;
   private boolean n3190SolColCo ;
   private boolean n3191SolColPa6 ;
   private boolean n3192SolColPes ;
   private boolean n3193SolColPac ;
   private boolean n3194SolColWo ;
   private boolean n653OpeNom ;
   private boolean n1357SolColSol ;
   private boolean n1345SolColAlt ;
   private boolean n10918SolColTmp ;
   private boolean n11803SolColRqM ;
   private boolean n11804SolColSt ;
   private boolean n11924SolColEsfe ;
   private boolean n11925SolColMetd ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n1355SolColObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01IA6_A407EmprNom ;
   private boolean[] T01IA6_n407EmprNom ;
   private int[] T01IA8_A1348SolColCod ;
   private int[] T01IA8_A129BarCod ;
   private boolean[] T01IA8_n129BarCod ;
   private byte[] T01IA8_A132BarCodReo ;
   private boolean[] T01IA8_n132BarCodReo ;
   private String[] T01IA8_A130BarCodPar ;
   private boolean[] T01IA8_n130BarCodPar ;
   private String[] T01IA8_A407EmprNom ;
   private boolean[] T01IA8_n407EmprNom ;
   private String[] T01IA8_A1352SolColMat ;
   private boolean[] T01IA8_n1352SolColMat ;
   private String[] T01IA8_A1356SolColSer ;
   private boolean[] T01IA8_n1356SolColSer ;
   private short[] T01IA8_A1358SolColTip ;
   private boolean[] T01IA8_n1358SolColTip ;
   private String[] T01IA8_A1349SolColDisN ;
   private boolean[] T01IA8_n1349SolColDisN ;
   private String[] T01IA8_A1353SolColNom ;
   private boolean[] T01IA8_n1353SolColNom ;
   private int[] T01IA8_A1354SolColNum ;
   private boolean[] T01IA8_n1354SolColNum ;
   private java.util.Date[] T01IA8_A1350SolColFec ;
   private boolean[] T01IA8_n1350SolColFec ;
   private String[] T01IA8_A3187SolColNor ;
   private boolean[] T01IA8_n3187SolColNor ;
   private String[] T01IA8_A3188SolColMaq ;
   private boolean[] T01IA8_n3188SolColMaq ;
   private String[] T01IA8_A3189SolColTac ;
   private boolean[] T01IA8_n3189SolColTac ;
   private String[] T01IA8_A3190SolColCo ;
   private boolean[] T01IA8_n3190SolColCo ;
   private String[] T01IA8_A3191SolColPa6 ;
   private boolean[] T01IA8_n3191SolColPa6 ;
   private String[] T01IA8_A3192SolColPes ;
   private boolean[] T01IA8_n3192SolColPes ;
   private String[] T01IA8_A3193SolColPac ;
   private boolean[] T01IA8_n3193SolColPac ;
   private String[] T01IA8_A3194SolColWo ;
   private boolean[] T01IA8_n3194SolColWo ;
   private String[] T01IA8_A653OpeNom ;
   private boolean[] T01IA8_n653OpeNom ;
   private int[] T01IA8_A1346SolColCliC ;
   private boolean[] T01IA8_n1346SolColCliC ;
   private String[] T01IA8_A1347SolColCliN ;
   private boolean[] T01IA8_n1347SolColCliN ;
   private String[] T01IA8_A1357SolColSol ;
   private boolean[] T01IA8_n1357SolColSol ;
   private String[] T01IA8_A1345SolColAlt ;
   private boolean[] T01IA8_n1345SolColAlt ;
   private byte[] T01IA8_A1359SolColUlin ;
   private boolean[] T01IA8_n1359SolColUlin ;
   private String[] T01IA8_A3195SolColRef ;
   private boolean[] T01IA8_n3195SolColRef ;
   private short[] T01IA8_A10918SolColTmp ;
   private boolean[] T01IA8_n10918SolColTmp ;
   private String[] T01IA8_A11803SolColRqM ;
   private boolean[] T01IA8_n11803SolColRqM ;
   private byte[] T01IA8_A11804SolColSt ;
   private boolean[] T01IA8_n11804SolColSt ;
   private String[] T01IA8_A11924SolColEsfe ;
   private boolean[] T01IA8_n11924SolColEsfe ;
   private String[] T01IA8_A11925SolColMetd ;
   private boolean[] T01IA8_n11925SolColMetd ;
   private String[] T01IA8_A396EmprCod ;
   private int[] T01IA8_A652OpeCod ;
   private boolean[] T01IA8_n652OpeCod ;
   private String[] T01IA7_A653OpeNom ;
   private boolean[] T01IA7_n653OpeNom ;
   private String[] T01IA9_A653OpeNom ;
   private boolean[] T01IA9_n653OpeNom ;
   private String[] T01IA10_A396EmprCod ;
   private int[] T01IA10_A1348SolColCod ;
   private int[] T01IA5_A1348SolColCod ;
   private int[] T01IA5_A129BarCod ;
   private boolean[] T01IA5_n129BarCod ;
   private byte[] T01IA5_A132BarCodReo ;
   private boolean[] T01IA5_n132BarCodReo ;
   private String[] T01IA5_A130BarCodPar ;
   private boolean[] T01IA5_n130BarCodPar ;
   private String[] T01IA5_A1352SolColMat ;
   private boolean[] T01IA5_n1352SolColMat ;
   private String[] T01IA5_A1356SolColSer ;
   private boolean[] T01IA5_n1356SolColSer ;
   private short[] T01IA5_A1358SolColTip ;
   private boolean[] T01IA5_n1358SolColTip ;
   private String[] T01IA5_A1349SolColDisN ;
   private boolean[] T01IA5_n1349SolColDisN ;
   private String[] T01IA5_A1353SolColNom ;
   private boolean[] T01IA5_n1353SolColNom ;
   private int[] T01IA5_A1354SolColNum ;
   private boolean[] T01IA5_n1354SolColNum ;
   private java.util.Date[] T01IA5_A1350SolColFec ;
   private boolean[] T01IA5_n1350SolColFec ;
   private String[] T01IA5_A3187SolColNor ;
   private boolean[] T01IA5_n3187SolColNor ;
   private String[] T01IA5_A3188SolColMaq ;
   private boolean[] T01IA5_n3188SolColMaq ;
   private String[] T01IA5_A3189SolColTac ;
   private boolean[] T01IA5_n3189SolColTac ;
   private String[] T01IA5_A3190SolColCo ;
   private boolean[] T01IA5_n3190SolColCo ;
   private String[] T01IA5_A3191SolColPa6 ;
   private boolean[] T01IA5_n3191SolColPa6 ;
   private String[] T01IA5_A3192SolColPes ;
   private boolean[] T01IA5_n3192SolColPes ;
   private String[] T01IA5_A3193SolColPac ;
   private boolean[] T01IA5_n3193SolColPac ;
   private String[] T01IA5_A3194SolColWo ;
   private boolean[] T01IA5_n3194SolColWo ;
   private int[] T01IA5_A1346SolColCliC ;
   private boolean[] T01IA5_n1346SolColCliC ;
   private String[] T01IA5_A1347SolColCliN ;
   private boolean[] T01IA5_n1347SolColCliN ;
   private String[] T01IA5_A1357SolColSol ;
   private boolean[] T01IA5_n1357SolColSol ;
   private String[] T01IA5_A1345SolColAlt ;
   private boolean[] T01IA5_n1345SolColAlt ;
   private byte[] T01IA5_A1359SolColUlin ;
   private boolean[] T01IA5_n1359SolColUlin ;
   private String[] T01IA5_A3195SolColRef ;
   private boolean[] T01IA5_n3195SolColRef ;
   private short[] T01IA5_A10918SolColTmp ;
   private boolean[] T01IA5_n10918SolColTmp ;
   private String[] T01IA5_A11803SolColRqM ;
   private boolean[] T01IA5_n11803SolColRqM ;
   private byte[] T01IA5_A11804SolColSt ;
   private boolean[] T01IA5_n11804SolColSt ;
   private String[] T01IA5_A11924SolColEsfe ;
   private boolean[] T01IA5_n11924SolColEsfe ;
   private String[] T01IA5_A11925SolColMetd ;
   private boolean[] T01IA5_n11925SolColMetd ;
   private String[] T01IA5_A396EmprCod ;
   private int[] T01IA5_A652OpeCod ;
   private boolean[] T01IA5_n652OpeCod ;
   private String[] T01IA11_A396EmprCod ;
   private int[] T01IA11_A1348SolColCod ;
   private String[] T01IA12_A396EmprCod ;
   private int[] T01IA12_A1348SolColCod ;
   private int[] T01IA4_A1348SolColCod ;
   private int[] T01IA4_A129BarCod ;
   private boolean[] T01IA4_n129BarCod ;
   private byte[] T01IA4_A132BarCodReo ;
   private boolean[] T01IA4_n132BarCodReo ;
   private String[] T01IA4_A130BarCodPar ;
   private boolean[] T01IA4_n130BarCodPar ;
   private String[] T01IA4_A1352SolColMat ;
   private boolean[] T01IA4_n1352SolColMat ;
   private String[] T01IA4_A1356SolColSer ;
   private boolean[] T01IA4_n1356SolColSer ;
   private short[] T01IA4_A1358SolColTip ;
   private boolean[] T01IA4_n1358SolColTip ;
   private String[] T01IA4_A1349SolColDisN ;
   private boolean[] T01IA4_n1349SolColDisN ;
   private String[] T01IA4_A1353SolColNom ;
   private boolean[] T01IA4_n1353SolColNom ;
   private int[] T01IA4_A1354SolColNum ;
   private boolean[] T01IA4_n1354SolColNum ;
   private java.util.Date[] T01IA4_A1350SolColFec ;
   private boolean[] T01IA4_n1350SolColFec ;
   private String[] T01IA4_A3187SolColNor ;
   private boolean[] T01IA4_n3187SolColNor ;
   private String[] T01IA4_A3188SolColMaq ;
   private boolean[] T01IA4_n3188SolColMaq ;
   private String[] T01IA4_A3189SolColTac ;
   private boolean[] T01IA4_n3189SolColTac ;
   private String[] T01IA4_A3190SolColCo ;
   private boolean[] T01IA4_n3190SolColCo ;
   private String[] T01IA4_A3191SolColPa6 ;
   private boolean[] T01IA4_n3191SolColPa6 ;
   private String[] T01IA4_A3192SolColPes ;
   private boolean[] T01IA4_n3192SolColPes ;
   private String[] T01IA4_A3193SolColPac ;
   private boolean[] T01IA4_n3193SolColPac ;
   private String[] T01IA4_A3194SolColWo ;
   private boolean[] T01IA4_n3194SolColWo ;
   private int[] T01IA4_A1346SolColCliC ;
   private boolean[] T01IA4_n1346SolColCliC ;
   private String[] T01IA4_A1347SolColCliN ;
   private boolean[] T01IA4_n1347SolColCliN ;
   private String[] T01IA4_A1357SolColSol ;
   private boolean[] T01IA4_n1357SolColSol ;
   private String[] T01IA4_A1345SolColAlt ;
   private boolean[] T01IA4_n1345SolColAlt ;
   private byte[] T01IA4_A1359SolColUlin ;
   private boolean[] T01IA4_n1359SolColUlin ;
   private String[] T01IA4_A3195SolColRef ;
   private boolean[] T01IA4_n3195SolColRef ;
   private short[] T01IA4_A10918SolColTmp ;
   private boolean[] T01IA4_n10918SolColTmp ;
   private String[] T01IA4_A11803SolColRqM ;
   private boolean[] T01IA4_n11803SolColRqM ;
   private byte[] T01IA4_A11804SolColSt ;
   private boolean[] T01IA4_n11804SolColSt ;
   private String[] T01IA4_A11924SolColEsfe ;
   private boolean[] T01IA4_n11924SolColEsfe ;
   private String[] T01IA4_A11925SolColMetd ;
   private boolean[] T01IA4_n11925SolColMetd ;
   private String[] T01IA4_A396EmprCod ;
   private int[] T01IA4_A652OpeCod ;
   private boolean[] T01IA4_n652OpeCod ;
   private String[] T01IA16_A653OpeNom ;
   private boolean[] T01IA16_n653OpeNom ;
   private String[] T01IA18_A396EmprCod ;
   private int[] T01IA18_A1348SolColCod ;
   private int[] T01IA19_A1348SolColCod ;
   private byte[] T01IA19_A1351SolColLin ;
   private String[] T01IA19_A1355SolColObs ;
   private boolean[] T01IA19_n1355SolColObs ;
   private String[] T01IA19_A396EmprCod ;
   private String[] T01IA20_A396EmprCod ;
   private int[] T01IA20_A1348SolColCod ;
   private byte[] T01IA20_A1351SolColLin ;
   private int[] T01IA3_A1348SolColCod ;
   private byte[] T01IA3_A1351SolColLin ;
   private String[] T01IA3_A1355SolColObs ;
   private boolean[] T01IA3_n1355SolColObs ;
   private String[] T01IA3_A396EmprCod ;
   private int[] T01IA2_A1348SolColCod ;
   private byte[] T01IA2_A1351SolColLin ;
   private String[] T01IA2_A1355SolColObs ;
   private boolean[] T01IA2_n1355SolColObs ;
   private String[] T01IA2_A396EmprCod ;
   private String[] T01IA24_A396EmprCod ;
   private int[] T01IA24_A1348SolColCod ;
   private byte[] T01IA24_A1351SolColLin ;
   private String[] T01IA25_A407EmprNom ;
   private boolean[] T01IA25_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpsolcor__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolcor__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolcor__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolcor__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolcor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IA2", "SELECT SolColCod, SolColLin, SolColObs, EmprCod FROM TXPLSOLCO WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ?  FOR UPDATE OF SolColObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA3", "SELECT SolColCod, SolColLin, SolColObs, EmprCod FROM TXPLSOLCO WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA4", "SELECT SolColCod, BarCod, BarCodReo, BarCodPar, SolColMat, SolColSer, SolColTip, SolColDisN, SolColNom, SolColNum, SolColFec, SolColNor, SolColMaq, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColCliC, SolColCliN, SolColSol, SolColAlt, SolColUlin, SolColRef, SolColTmp, SolColRqM, SolColSt, SolColEsfe, SolColMetd, EmprCod, OpeCod FROM TXPCSOLCO WHERE EmprCod = ? AND SolColCod = ?  FOR UPDATE OF BarCod, BarCodReo, BarCodPar, SolColMat, SolColSer, SolColTip, SolColDisN, SolColNom, SolColNum, SolColFec, SolColNor, SolColMaq, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColCliC, SolColCliN, SolColSol, SolColAlt, SolColUlin, SolColRef, SolColTmp, SolColRqM, SolColSt, SolColEsfe, SolColMetd, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA5", "SELECT SolColCod, BarCod, BarCodReo, BarCodPar, SolColMat, SolColSer, SolColTip, SolColDisN, SolColNom, SolColNum, SolColFec, SolColNor, SolColMaq, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColCliC, SolColCliN, SolColSol, SolColAlt, SolColUlin, SolColRef, SolColTmp, SolColRqM, SolColSt, SolColEsfe, SolColMetd, EmprCod, OpeCod FROM TXPCSOLCO WHERE EmprCod = ? AND SolColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA7", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA8", "SELECT /*+ FIRST_ROWS(100) */ TM1.SolColCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T2.EmprNom, TM1.SolColMat, TM1.SolColSer, TM1.SolColTip, TM1.SolColDisN, TM1.SolColNom, TM1.SolColNum, TM1.SolColFec, TM1.SolColNor, TM1.SolColMaq, TM1.SolColTac, TM1.SolColCo, TM1.SolColPa6, TM1.SolColPes, TM1.SolColPac, TM1.SolColWo, T3.OpeNom, TM1.SolColCliC, TM1.SolColCliN, TM1.SolColSol, TM1.SolColAlt, TM1.SolColUlin, TM1.SolColRef, TM1.SolColTmp, TM1.SolColRqM, TM1.SolColSt, TM1.SolColEsfe, TM1.SolColMetd, TM1.EmprCod, TM1.OpeCod FROM ((TXPCSOLCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.SolColCod = ? ORDER BY TM1.EmprCod, TM1.SolColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA9", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND SolColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolColCod FROM TXPCSOLCO WHERE ( SolColCod > ?) and EmprCod = ? ORDER BY EmprCod, SolColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IA12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolColCod FROM TXPCSOLCO WHERE ( SolColCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, SolColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IA13", "INSERT INTO TXPCSOLCO(SolColCod, BarCod, BarCodReo, BarCodPar, SolColMat, SolColSer, SolColTip, SolColDisN, SolColNom, SolColNum, SolColFec, SolColNor, SolColMaq, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColCliC, SolColCliN, SolColSol, SolColAlt, SolColUlin, SolColRef, SolColTmp, SolColRqM, SolColSt, SolColEsfe, SolColMetd, EmprCod, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCSOLCO")
         ,new UpdateCursor("T01IA14", "UPDATE TXPCSOLCO SET BarCod=?, BarCodReo=?, BarCodPar=?, SolColMat=?, SolColSer=?, SolColTip=?, SolColDisN=?, SolColNom=?, SolColNum=?, SolColFec=?, SolColNor=?, SolColMaq=?, SolColTac=?, SolColCo=?, SolColPa6=?, SolColPes=?, SolColPac=?, SolColWo=?, SolColCliC=?, SolColCliN=?, SolColSol=?, SolColAlt=?, SolColUlin=?, SolColRef=?, SolColTmp=?, SolColRqM=?, SolColSt=?, SolColEsfe=?, SolColMetd=?, OpeCod=?  WHERE EmprCod = ? AND SolColCod = ?", GX_NOMASK, "TXPCSOLCO")
         ,new UpdateCursor("T01IA15", "DELETE FROM TXPCSOLCO  WHERE EmprCod = ? AND SolColCod = ?", GX_NOMASK, "TXPCSOLCO")
         ,new ForEachCursor("T01IA16", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01IA17", "UPDATE TXPCSOLCO SET SolColUlin=?  WHERE EmprCod = ? AND SolColCod = ?", GX_NOMASK, "TXPCSOLCO")
         ,new ForEachCursor("T01IA18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? ORDER BY EmprCod, SolColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA19", "SELECT SolColCod, SolColLin, SolColObs, EmprCod FROM TXPLSOLCO WHERE EmprCod = ? and SolColCod = ? and SolColLin = ? ORDER BY EmprCod, SolColCod, SolColLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA20", "SELECT EmprCod, SolColCod, SolColLin FROM TXPLSOLCO WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01IA21", "INSERT INTO TXPLSOLCO(SolColCod, SolColLin, SolColObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLSOLCO")
         ,new UpdateCursor("T01IA22", "UPDATE TXPLSOLCO SET SolColObs=?  WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ?", GX_NOMASK, "TXPLSOLCO")
         ,new UpdateCursor("T01IA23", "DELETE FROM TXPLSOLCO  WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ?", GX_NOMASK, "TXPLSOLCO")
         ,new ForEachCursor("T01IA24", "SELECT EmprCod, SolColCod, SolColLin FROM TXPLSOLCO WHERE EmprCod = ? and SolColCod = ? ORDER BY EmprCod, SolColCod, SolColLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IA25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 15);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 20);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((int[]) buf[60])[0] = rslt.getInt(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
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
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 15);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 20);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((int[]) buf[60])[0] = rslt.getInt(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
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
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 3);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 4);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 15);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 10);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((byte[]) buf[57])[0] = rslt.getByte(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((int[]) buf[64])[0] = rslt.getInt(34);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 20);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 6);
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
                  stmt.setString(15, (String)parms[28], 3);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 3);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 3);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 3);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 3);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[38]).intValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 30);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 30);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 4);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[46]).byteValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 15);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[50]).shortValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 10);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[54]).byteValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 20);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 20);
               }
               stmt.setString(31, (String)parms[59], 3);
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[61]).intValue());
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 6);
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
                  stmt.setString(14, (String)parms[27], 3);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 3);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 3);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 3);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 3);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 30);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 30);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 4);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 15);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[49]).shortValue());
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
                  stmt.setByte(27, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 20);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 20);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[59]).intValue());
               }
               stmt.setString(31, (String)parms[60], 3);
               stmt.setInt(32, ((Number) parms[61]).intValue());
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

