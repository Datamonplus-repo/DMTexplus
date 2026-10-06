package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfasesmodif_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV64Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
         AV35UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
         AV38Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
         AV61Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs", AV61Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         AV62OldMaq = httpContext.GetPar( "OldMaq") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62OldMaq", AV62OldMaq);
         A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
         AV63OldEst = (byte)(GXutil.lval( httpContext.GetPar( "OldEst"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63OldEst", GXutil.str( AV63OldEst, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_19V15( Gx_mode, A396EmprCod, AV64Pgmname, AV35UsurCod, AV38Station, AV61Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A603MaqCodBis, AV62OldMaq, A153BarFasEst, AV63OldEst) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A603MaqCodBis) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FASESModif", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarFasEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tfasesmodif_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfasesmodif_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasesmodif_impl.class ));
   }

   public tfasesmodif_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFASESModif.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Estado Barcada", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Control (S/N)", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasCon_Internalname, GXutil.rtrim( A152BarFasCon), GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasCon_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasCon_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "MaqCodBis", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodBis_Internalname, GXutil.rtrim( A603MaqCodBis), GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodBis_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCodBis_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "BarFacTin", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFacTin_Internalname, GXutil.rtrim( A150BarFacTin), GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFacTin_Jsonclick, 0, "", "", "", "", "", 1, edtBarFacTin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Teorica", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecTeo_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecTeo_Internalname, localUtil.format(A162BarFecTeo, "99/99/99"), localUtil.format( A162BarFecTeo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecTeo_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecTeo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecTeo_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecTeo_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFASESModif.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Fecha Real Cumplimentacion", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecRea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecRea_Internalname, localUtil.format(A160BarFecRea, "99/99/99"), localUtil.format( A160BarFecRea, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecRea_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecRea_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecRea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecRea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFASESModif.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Tiempo Teorico", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTieTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTieTeo_Enabled!=0) ? localUtil.format( A216BarTieTeo, "Z9.99") : localUtil.format( A216BarTieTeo, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTieTeo_Jsonclick, 0, "", "", "", "", "", 1, edtBarTieTeo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUni_Internalname, GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarUni_Enabled!=0) ? localUtil.format( A227BarUni, "ZZZZZ9.99") : localUtil.format( A227BarUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUni_Jsonclick, 0, "", "", "", "", "", 1, edtBarUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarLoc_Internalname, GXutil.rtrim( A179BarLoc), GXutil.rtrim( localUtil.format( A179BarLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarLoc_Jsonclick, 0, "", "", "", "", "", 1, edtBarLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Hora Inicio", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarHorIni_Internalname, GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarHorIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarHorIni_Jsonclick, 0, "", "", "", "", "", 1, edtBarHorIni_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Hora Fin", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarHorFin_Internalname, GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarHorFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarHorFin_Jsonclick, 0, "", "", "", "", "", 1, edtBarHorFin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Tiempo Real", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTieRea_Internalname, GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTieRea_Enabled!=0) ? localUtil.format( A215BarTieRea, "Z9.99") : localUtil.format( A215BarTieRea, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTieRea_Jsonclick, 0, "", "", "", "", "", 1, edtBarTieRea_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Embotada ?", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasBot_Internalname, GXutil.rtrim( A4021BarFasBot), GXutil.rtrim( localUtil.format( A4021BarFasBot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasBot_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasBot_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Numero de Bota", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumBot_Internalname, GXutil.ltrim( localUtil.ntoc( A4022BarNumBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumBot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4022BarNumBot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4022BarNumBot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumBot_Jsonclick, 0, "", "", "", "", "", 1, edtBarNumBot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Formula Productos", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasFor_Internalname, GXutil.rtrim( A4287BarFasFor), GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasFor_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasFor_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Prendas", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A4636BarFasPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4636BarFasPzas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4636BarFasPzas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasPzas_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasPzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Control Planning", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasCoP_Internalname, GXutil.rtrim( A4301BarFasCoP), GXutil.rtrim( localUtil.format( A4301BarFasCoP, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasCoP_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasCoP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Fase Manual?", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasCara_Internalname, GXutil.rtrim( A4637BarFasCara), GXutil.rtrim( localUtil.format( A4637BarFasCara, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasCara_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasCara_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Fase de Acabado", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasAcab_Internalname, GXutil.rtrim( A4905BarFasAcab), GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasAcab_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasAcab_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecRIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecRIni_Internalname, localUtil.format(A3298BarFecRIni, "99/99/99"), localUtil.format( A3298BarFecRIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecRIni_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecRIni_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecRIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecRIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFASESModif.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "BarFasKgm", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasKgm_Enabled!=0) ? localUtil.format( A3837BarFasKgm, "ZZZZZ9.99") : localUtil.format( A3837BarFasKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasKgm_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "BarFasMtr", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasMtr_Enabled!=0) ? localUtil.format( A3838BarFasMtr, "ZZZZZ9.99") : localUtil.format( A3838BarFasMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasMtr_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Kilos Totales", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasKgT_Internalname, GXutil.ltrim( localUtil.ntoc( A5719BarFasKgT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasKgT_Enabled!=0) ? localUtil.format( A5719BarFasKgT, "ZZZZZ9.99") : localUtil.format( A5719BarFasKgT, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasKgT_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasKgT_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Metros Totales", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasMtT_Internalname, GXutil.ltrim( localUtil.ntoc( A5720BarFasMtT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasMtT_Enabled!=0) ? localUtil.format( A5720BarFasMtT, "ZZZZZ9.99") : localUtil.format( A5720BarFasMtT, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasMtT_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasMtT_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Fase Generica?", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasGral_Internalname, GXutil.rtrim( A5369BarFasGral), GXutil.rtrim( localUtil.format( A5369BarFasGral, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasGral_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasGral_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Maquina Planing", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqPlan_Internalname, GXutil.rtrim( A5896BarMaqPlan), GXutil.rtrim( localUtil.format( A5896BarMaqPlan, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqPlan_Jsonclick, 0, "", "", "", "", "", 1, edtBarMaqPlan_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Seccion", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasSec_Internalname, GXutil.rtrim( A6173BarFasSec), GXutil.rtrim( localUtil.format( A6173BarFasSec, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasSec_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasSec_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Usuario que Planifica", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasUsu_Internalname, GXutil.rtrim( A5048BarFasUsu), GXutil.rtrim( localUtil.format( A5048BarFasUsu, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasUsu_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Descripcion II", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc2_Internalname, GXutil.rtrim( A4642FasDsc2), GXutil.rtrim( localUtil.format( A4642FasDsc2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc2_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Prioridad II", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarfasPri2_Internalname, GXutil.ltrim( localUtil.ntoc( A8938BarfasPri2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarfasPri2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8938BarfasPri2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8938BarfasPri2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarfasPri2_Jsonclick, 0, "", "", "", "", "", 1, edtBarfasPri2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Hdr Origen", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarHdrO_Internalname, GXutil.rtrim( A8594BarHdrO), GXutil.rtrim( localUtil.format( A8594BarHdrO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarHdrO_Jsonclick, 0, "", "", "", "", "", 1, edtBarHdrO_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Obs p/Fase", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBarObsF_Internalname, A9842BarObsF, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", (short)(0), 1, edtBarObsF_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TFASESModif.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 227,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASESModif.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFASESModif.htm");
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
      e1119V2 ();
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
            Z153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z153BarFasEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z152BarFasCon = httpContext.cgiGet( "Z152BarFasCon") ;
            Z150BarFacTin = httpContext.cgiGet( "Z150BarFacTin") ;
            Z162BarFecTeo = localUtil.ctod( httpContext.cgiGet( "Z162BarFecTeo"), 0) ;
            Z160BarFecRea = localUtil.ctod( httpContext.cgiGet( "Z160BarFecRea"), 0) ;
            Z216BarTieTeo = localUtil.ctond( httpContext.cgiGet( "Z216BarTieTeo")) ;
            Z227BarUni = localUtil.ctond( httpContext.cgiGet( "Z227BarUni")) ;
            Z179BarLoc = httpContext.cgiGet( "Z179BarLoc") ;
            Z165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( "Z165BarHorIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( "Z164BarHorFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z215BarTieRea = localUtil.ctond( httpContext.cgiGet( "Z215BarTieRea")) ;
            Z4021BarFasBot = httpContext.cgiGet( "Z4021BarFasBot") ;
            Z4022BarNumBot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4022BarNumBot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4287BarFasFor = httpContext.cgiGet( "Z4287BarFasFor") ;
            Z4636BarFasPzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z4636BarFasPzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4301BarFasCoP = httpContext.cgiGet( "Z4301BarFasCoP") ;
            Z4637BarFasCara = httpContext.cgiGet( "Z4637BarFasCara") ;
            Z4905BarFasAcab = httpContext.cgiGet( "Z4905BarFasAcab") ;
            Z3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( "Z3298BarFecRIni"), 0) ;
            Z3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( "Z3837BarFasKgm")) ;
            Z3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( "Z3838BarFasMtr")) ;
            Z5719BarFasKgT = localUtil.ctond( httpContext.cgiGet( "Z5719BarFasKgT")) ;
            Z5720BarFasMtT = localUtil.ctond( httpContext.cgiGet( "Z5720BarFasMtT")) ;
            Z5369BarFasGral = httpContext.cgiGet( "Z5369BarFasGral") ;
            Z5896BarMaqPlan = httpContext.cgiGet( "Z5896BarMaqPlan") ;
            Z6173BarFasSec = httpContext.cgiGet( "Z6173BarFasSec") ;
            Z5048BarFasUsu = httpContext.cgiGet( "Z5048BarFasUsu") ;
            Z8938BarfasPri2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z8938BarfasPri2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8594BarHdrO = httpContext.cgiGet( "Z8594BarHdrO") ;
            Z9842BarObsF = httpContext.cgiGet( "Z9842BarObsF") ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z603MaqCodBis = httpContext.cgiGet( "Z603MaqCodBis") ;
            O153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( "O153BarFasEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O603MaqCodBis = httpContext.cgiGet( "O603MaqCodBis") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV62OldMaq = httpContext.cgiGet( "vOLDMAQ") ;
            AV63OldEst = (byte)(localUtil.ctol( httpContext.cgiGet( "vOLDEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV61Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV64Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV35UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV38Station = httpContext.cgiGet( "vSTATION") ;
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
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFasEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A153BarFasEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
            }
            else
            {
               A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
            }
            A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
            A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
            if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecTeo_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARFECTEO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFecTeo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A162BarFecTeo = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
            }
            else
            {
               A162BarFecTeo = localUtil.ctod( httpContext.cgiGet( edtBarFecTeo_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARFECREA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFecRea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A160BarFecRea = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
            }
            else
            {
               A160BarFecRea = localUtil.ctod( httpContext.cgiGet( edtBarFecRea_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIETEO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTieTeo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A216BarTieTeo = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
            }
            else
            {
               A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARUNI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarUni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A227BarUni = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
            }
            else
            {
               A227BarUni = localUtil.ctond( httpContext.cgiGet( edtBarUni_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
            }
            A179BarLoc = httpContext.cgiGet( edtBarLoc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARHORINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarHorIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A165BarHorIni = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
            }
            else
            {
               A165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARHORFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarHorFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A164BarHorFin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
            }
            else
            {
               A164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
            }
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
            A4021BarFasBot = httpContext.cgiGet( edtBarFasBot_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMBOT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarNumBot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4022BarNumBot = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
            }
            else
            {
               A4022BarNumBot = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
            }
            A4287BarFasFor = GXutil.upper( httpContext.cgiGet( edtBarFasFor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASPZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFasPzas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4636BarFasPzas = 0 ;
               n4636BarFasPzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4636BarFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4636BarFasPzas), 6, 0));
            }
            else
            {
               A4636BarFasPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtBarFasPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4636BarFasPzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4636BarFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4636BarFasPzas), 6, 0));
            }
            A4301BarFasCoP = GXutil.upper( httpContext.cgiGet( edtBarFasCoP_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
            A4637BarFasCara = httpContext.cgiGet( edtBarFasCara_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
            A4905BarFasAcab = GXutil.upper( httpContext.cgiGet( edtBarFasAcab_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
            if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARFECRINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFecRIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3298BarFecRIni = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
            }
            else
            {
               A3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( edtBarFecRIni_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFasKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3837BarFasKgm = DecimalUtil.ZERO ;
               n3837BarFasKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3837BarFasKgm", GXutil.ltrimstr( A3837BarFasKgm, 9, 2));
            }
            else
            {
               A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
               n3837BarFasKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3837BarFasKgm", GXutil.ltrimstr( A3837BarFasKgm, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFasMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3838BarFasMtr = DecimalUtil.ZERO ;
               n3838BarFasMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3838BarFasMtr", GXutil.ltrimstr( A3838BarFasMtr, 9, 2));
            }
            else
            {
               A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
               n3838BarFasMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3838BarFasMtr", GXutil.ltrimstr( A3838BarFasMtr, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasKgT_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasKgT_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASKGT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFasKgT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5719BarFasKgT = DecimalUtil.ZERO ;
               n5719BarFasKgT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5719BarFasKgT", GXutil.ltrimstr( A5719BarFasKgT, 9, 2));
            }
            else
            {
               A5719BarFasKgT = localUtil.ctond( httpContext.cgiGet( edtBarFasKgT_Internalname)) ;
               n5719BarFasKgT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5719BarFasKgT", GXutil.ltrimstr( A5719BarFasKgT, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasMtT_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasMtT_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASMTT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarFasMtT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5720BarFasMtT = DecimalUtil.ZERO ;
               n5720BarFasMtT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5720BarFasMtT", GXutil.ltrimstr( A5720BarFasMtT, 9, 2));
            }
            else
            {
               A5720BarFasMtT = localUtil.ctond( httpContext.cgiGet( edtBarFasMtT_Internalname)) ;
               n5720BarFasMtT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5720BarFasMtT", GXutil.ltrimstr( A5720BarFasMtT, 9, 2));
            }
            A5369BarFasGral = httpContext.cgiGet( edtBarFasGral_Internalname) ;
            n5369BarFasGral = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5369BarFasGral", A5369BarFasGral);
            A5896BarMaqPlan = httpContext.cgiGet( edtBarMaqPlan_Internalname) ;
            n5896BarMaqPlan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5896BarMaqPlan", A5896BarMaqPlan);
            A6173BarFasSec = httpContext.cgiGet( edtBarFasSec_Internalname) ;
            n6173BarFasSec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6173BarFasSec", A6173BarFasSec);
            A5048BarFasUsu = GXutil.upper( httpContext.cgiGet( edtBarFasUsu_Internalname)) ;
            n5048BarFasUsu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5048BarFasUsu", A5048BarFasUsu);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A4642FasDsc2 = httpContext.cgiGet( edtFasDsc2_Internalname) ;
            n4642FasDsc2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarfasPri2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarfasPri2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASPRI2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarfasPri2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8938BarfasPri2 = (short)(0) ;
               n8938BarfasPri2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8938BarfasPri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8938BarfasPri2), 3, 0));
            }
            else
            {
               A8938BarfasPri2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarfasPri2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8938BarfasPri2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8938BarfasPri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8938BarfasPri2), 3, 0));
            }
            A8594BarHdrO = httpContext.cgiGet( edtBarHdrO_Internalname) ;
            n8594BarHdrO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8594BarHdrO", A8594BarHdrO);
            A9842BarObsF = httpContext.cgiGet( edtBarObsF_Internalname) ;
            n9842BarObsF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9842BarObsF", A9842BarObsF);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TFASESModif");
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
            forbiddenHiddens.add("BarTieRea", localUtil.format( A215BarTieRea, "Z9.99"));
            A457FasCod = httpContext.cgiGet( edtFasCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
            A6173BarFasSec = httpContext.cgiGet( edtBarFasSec_Internalname) ;
            n6173BarFasSec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6173BarFasSec", A6173BarFasSec);
            forbiddenHiddens.add("BarFasSec", GXutil.rtrim( localUtil.format( A6173BarFasSec, "")));
            A5048BarFasUsu = httpContext.cgiGet( edtBarFasUsu_Internalname) ;
            n5048BarFasUsu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5048BarFasUsu", A5048BarFasUsu);
            forbiddenHiddens.add("BarFasUsu", GXutil.rtrim( localUtil.format( A5048BarFasUsu, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tfasesmodif:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
                        e1119V2 ();
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
            initAll19V15( ) ;
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
      disableAttributes19V15( ) ;
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

   public void confirm_19V0( )
   {
      beforeValidate19V15( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls19V15( ) ;
         }
         else
         {
            checkExtendedTable19V15( ) ;
            if ( AnyError == 0 )
            {
               zm19V15( 19) ;
               zm19V15( 20) ;
               zm19V15( 21) ;
               zm19V15( 22) ;
            }
            closeExtendedTableCursors19V15( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues19V0( ) ;
      }
   }

   public void resetCaption19V0( )
   {
   }

   public void e1119V2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV36LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tfasesmodif_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36LitFe", AV36LitFe);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tfasesmodif_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      AV38Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
      GXv_char2[0] = AV39emprcod ;
      GXv_char3[0] = AV40emprnom ;
      GXv_char4[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfasesmodif_impl.this.AV39emprcod = GXv_char2[0] ;
      tfasesmodif_impl.this.AV40emprnom = GXv_char3[0] ;
      tfasesmodif_impl.this.AV35UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39emprcod", AV39emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV40emprnom", AV40emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
   }

   public void zm19V15( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z153BarFasEst = T019V3_A153BarFasEst[0] ;
            Z152BarFasCon = T019V3_A152BarFasCon[0] ;
            Z150BarFacTin = T019V3_A150BarFacTin[0] ;
            Z162BarFecTeo = T019V3_A162BarFecTeo[0] ;
            Z160BarFecRea = T019V3_A160BarFecRea[0] ;
            Z216BarTieTeo = T019V3_A216BarTieTeo[0] ;
            Z227BarUni = T019V3_A227BarUni[0] ;
            Z179BarLoc = T019V3_A179BarLoc[0] ;
            Z165BarHorIni = T019V3_A165BarHorIni[0] ;
            Z164BarHorFin = T019V3_A164BarHorFin[0] ;
            Z215BarTieRea = T019V3_A215BarTieRea[0] ;
            Z4021BarFasBot = T019V3_A4021BarFasBot[0] ;
            Z4022BarNumBot = T019V3_A4022BarNumBot[0] ;
            Z4287BarFasFor = T019V3_A4287BarFasFor[0] ;
            Z4636BarFasPzas = T019V3_A4636BarFasPzas[0] ;
            Z4301BarFasCoP = T019V3_A4301BarFasCoP[0] ;
            Z4637BarFasCara = T019V3_A4637BarFasCara[0] ;
            Z4905BarFasAcab = T019V3_A4905BarFasAcab[0] ;
            Z3298BarFecRIni = T019V3_A3298BarFecRIni[0] ;
            Z3837BarFasKgm = T019V3_A3837BarFasKgm[0] ;
            Z3838BarFasMtr = T019V3_A3838BarFasMtr[0] ;
            Z5719BarFasKgT = T019V3_A5719BarFasKgT[0] ;
            Z5720BarFasMtT = T019V3_A5720BarFasMtT[0] ;
            Z5369BarFasGral = T019V3_A5369BarFasGral[0] ;
            Z5896BarMaqPlan = T019V3_A5896BarMaqPlan[0] ;
            Z6173BarFasSec = T019V3_A6173BarFasSec[0] ;
            Z5048BarFasUsu = T019V3_A5048BarFasUsu[0] ;
            Z8938BarfasPri2 = T019V3_A8938BarfasPri2[0] ;
            Z8594BarHdrO = T019V3_A8594BarHdrO[0] ;
            Z9842BarObsF = T019V3_A9842BarObsF[0] ;
            Z457FasCod = T019V3_A457FasCod[0] ;
            Z603MaqCodBis = T019V3_A603MaqCodBis[0] ;
         }
         else
         {
            Z153BarFasEst = A153BarFasEst ;
            Z152BarFasCon = A152BarFasCon ;
            Z150BarFacTin = A150BarFacTin ;
            Z162BarFecTeo = A162BarFecTeo ;
            Z160BarFecRea = A160BarFecRea ;
            Z216BarTieTeo = A216BarTieTeo ;
            Z227BarUni = A227BarUni ;
            Z179BarLoc = A179BarLoc ;
            Z165BarHorIni = A165BarHorIni ;
            Z164BarHorFin = A164BarHorFin ;
            Z215BarTieRea = A215BarTieRea ;
            Z4021BarFasBot = A4021BarFasBot ;
            Z4022BarNumBot = A4022BarNumBot ;
            Z4287BarFasFor = A4287BarFasFor ;
            Z4636BarFasPzas = A4636BarFasPzas ;
            Z4301BarFasCoP = A4301BarFasCoP ;
            Z4637BarFasCara = A4637BarFasCara ;
            Z4905BarFasAcab = A4905BarFasAcab ;
            Z3298BarFecRIni = A3298BarFecRIni ;
            Z3837BarFasKgm = A3837BarFasKgm ;
            Z3838BarFasMtr = A3838BarFasMtr ;
            Z5719BarFasKgT = A5719BarFasKgT ;
            Z5720BarFasMtT = A5720BarFasMtT ;
            Z5369BarFasGral = A5369BarFasGral ;
            Z5896BarMaqPlan = A5896BarMaqPlan ;
            Z6173BarFasSec = A6173BarFasSec ;
            Z5048BarFasUsu = A5048BarFasUsu ;
            Z8938BarfasPri2 = A8938BarfasPri2 ;
            Z8594BarHdrO = A8594BarHdrO ;
            Z9842BarObsF = A9842BarObsF ;
            Z457FasCod = A457FasCod ;
            Z603MaqCodBis = A603MaqCodBis ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z194BarOrdLin = A194BarOrdLin ;
         Z153BarFasEst = A153BarFasEst ;
         Z152BarFasCon = A152BarFasCon ;
         Z150BarFacTin = A150BarFacTin ;
         Z162BarFecTeo = A162BarFecTeo ;
         Z160BarFecRea = A160BarFecRea ;
         Z216BarTieTeo = A216BarTieTeo ;
         Z227BarUni = A227BarUni ;
         Z179BarLoc = A179BarLoc ;
         Z165BarHorIni = A165BarHorIni ;
         Z164BarHorFin = A164BarHorFin ;
         Z215BarTieRea = A215BarTieRea ;
         Z4021BarFasBot = A4021BarFasBot ;
         Z4022BarNumBot = A4022BarNumBot ;
         Z4287BarFasFor = A4287BarFasFor ;
         Z4636BarFasPzas = A4636BarFasPzas ;
         Z4301BarFasCoP = A4301BarFasCoP ;
         Z4637BarFasCara = A4637BarFasCara ;
         Z4905BarFasAcab = A4905BarFasAcab ;
         Z3298BarFecRIni = A3298BarFecRIni ;
         Z3837BarFasKgm = A3837BarFasKgm ;
         Z3838BarFasMtr = A3838BarFasMtr ;
         Z5719BarFasKgT = A5719BarFasKgT ;
         Z5720BarFasMtT = A5720BarFasMtT ;
         Z5369BarFasGral = A5369BarFasGral ;
         Z5896BarMaqPlan = A5896BarMaqPlan ;
         Z6173BarFasSec = A6173BarFasSec ;
         Z5048BarFasUsu = A5048BarFasUsu ;
         Z8938BarfasPri2 = A8938BarfasPri2 ;
         Z8594BarHdrO = A8594BarHdrO ;
         Z9842BarObsF = A9842BarObsF ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z603MaqCodBis = A603MaqCodBis ;
         Z407EmprNom = A407EmprNom ;
         Z460FasDsc = A460FasDsc ;
         Z4642FasDsc2 = A4642FasDsc2 ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarTieRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Enabled), 5, 0), true);
      edtBarFasSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasSec_Enabled), 5, 0), true);
      edtBarFasUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasUsu_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      AV64Pgmname = "TFASESModif" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
      edtBarTieRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Enabled), 5, 0), true);
      edtBarFasSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasSec_Enabled), 5, 0), true);
      edtBarFasUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasUsu_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      /* Using cursor T019V4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019V4_A407EmprNom[0] ;
      n407EmprNom = T019V4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T019V5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
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
      /* Using cursor T019V6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T019V6_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4642FasDsc2 = T019V6_A4642FasDsc2[0] ;
      n4642FasDsc2 = T019V6_n4642FasDsc2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
      pr_default.close(4);
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

   public void load19V15( )
   {
      /* Using cursor T019V8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A407EmprNom = T019V8_A407EmprNom[0] ;
         n407EmprNom = T019V8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A153BarFasEst = T019V8_A153BarFasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
         A152BarFasCon = T019V8_A152BarFasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
         A150BarFacTin = T019V8_A150BarFacTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
         A162BarFecTeo = T019V8_A162BarFecTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
         A160BarFecRea = T019V8_A160BarFecRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
         A216BarTieTeo = T019V8_A216BarTieTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
         A227BarUni = T019V8_A227BarUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
         A179BarLoc = T019V8_A179BarLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
         A165BarHorIni = T019V8_A165BarHorIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
         A164BarHorFin = T019V8_A164BarHorFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
         A215BarTieRea = T019V8_A215BarTieRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
         A4021BarFasBot = T019V8_A4021BarFasBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
         A4022BarNumBot = T019V8_A4022BarNumBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
         A4287BarFasFor = T019V8_A4287BarFasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
         A4636BarFasPzas = T019V8_A4636BarFasPzas[0] ;
         n4636BarFasPzas = T019V8_n4636BarFasPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4636BarFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4636BarFasPzas), 6, 0));
         A4301BarFasCoP = T019V8_A4301BarFasCoP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
         A4637BarFasCara = T019V8_A4637BarFasCara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
         A4905BarFasAcab = T019V8_A4905BarFasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
         A3298BarFecRIni = T019V8_A3298BarFecRIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
         A3837BarFasKgm = T019V8_A3837BarFasKgm[0] ;
         n3837BarFasKgm = T019V8_n3837BarFasKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3837BarFasKgm", GXutil.ltrimstr( A3837BarFasKgm, 9, 2));
         A3838BarFasMtr = T019V8_A3838BarFasMtr[0] ;
         n3838BarFasMtr = T019V8_n3838BarFasMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3838BarFasMtr", GXutil.ltrimstr( A3838BarFasMtr, 9, 2));
         A5719BarFasKgT = T019V8_A5719BarFasKgT[0] ;
         n5719BarFasKgT = T019V8_n5719BarFasKgT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5719BarFasKgT", GXutil.ltrimstr( A5719BarFasKgT, 9, 2));
         A5720BarFasMtT = T019V8_A5720BarFasMtT[0] ;
         n5720BarFasMtT = T019V8_n5720BarFasMtT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5720BarFasMtT", GXutil.ltrimstr( A5720BarFasMtT, 9, 2));
         A5369BarFasGral = T019V8_A5369BarFasGral[0] ;
         n5369BarFasGral = T019V8_n5369BarFasGral[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5369BarFasGral", A5369BarFasGral);
         A5896BarMaqPlan = T019V8_A5896BarMaqPlan[0] ;
         n5896BarMaqPlan = T019V8_n5896BarMaqPlan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5896BarMaqPlan", A5896BarMaqPlan);
         A6173BarFasSec = T019V8_A6173BarFasSec[0] ;
         n6173BarFasSec = T019V8_n6173BarFasSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6173BarFasSec", A6173BarFasSec);
         A5048BarFasUsu = T019V8_A5048BarFasUsu[0] ;
         n5048BarFasUsu = T019V8_n5048BarFasUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5048BarFasUsu", A5048BarFasUsu);
         A460FasDsc = T019V8_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A4642FasDsc2 = T019V8_A4642FasDsc2[0] ;
         n4642FasDsc2 = T019V8_n4642FasDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
         A8938BarfasPri2 = T019V8_A8938BarfasPri2[0] ;
         n8938BarfasPri2 = T019V8_n8938BarfasPri2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8938BarfasPri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8938BarfasPri2), 3, 0));
         A8594BarHdrO = T019V8_A8594BarHdrO[0] ;
         n8594BarHdrO = T019V8_n8594BarHdrO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8594BarHdrO", A8594BarHdrO);
         A9842BarObsF = T019V8_A9842BarObsF[0] ;
         n9842BarObsF = T019V8_n9842BarObsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9842BarObsF", A9842BarObsF);
         A457FasCod = T019V8_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A603MaqCodBis = T019V8_A603MaqCodBis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         zm19V15( -18) ;
      }
      pr_default.close(6);
      onLoadActions19V15( ) ;
   }

   public void onLoadActions19V15( )
   {
      AV63OldEst = O153BarFasEst ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63OldEst", GXutil.str( AV63OldEst, 1, 0));
      AV62OldMaq = O603MaqCodBis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldMaq", AV62OldMaq);
      if ( isUpd( )  && ( ( GXutil.strcmp(A603MaqCodBis, AV62OldMaq) != 0 ) || ( A153BarFasEst != AV63OldEst ) ) )
      {
         AV61Inc_obs = httpContext.getMessage( httpContext.getMessage( ">- Maq=", ""), "") + AV62OldMaq + httpContext.getMessage( httpContext.getMessage( "por Maq=", ""), "") + A603MaqCodBis + httpContext.getMessage( httpContext.getMessage( "Cambio Est=", ""), "") + GXutil.str( AV63OldEst, 1, 0) + httpContext.getMessage( httpContext.getMessage( " por Est=", ""), "") + GXutil.str( A153BarFasEst, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs", AV61Inc_obs);
      }
   }

   public void checkExtendedTable19V15( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T019V7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODBIS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      if ( ! ( ( A153BarFasEst == 0 ) || ( A153BarFasEst == 1 ) || ( A153BarFasEst == 2 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado Barcada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASEST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV63OldEst = O153BarFasEst ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63OldEst", GXutil.str( AV63OldEst, 1, 0));
      if ( ! ( ( GXutil.strcmp(A152BarFasCon, "S") == 0 ) || ( GXutil.strcmp(A152BarFasCon, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control (S/N)", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasCon_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV62OldMaq = O603MaqCodBis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldMaq", AV62OldMaq);
      if ( isUpd( )  && ( ( GXutil.strcmp(A603MaqCodBis, AV62OldMaq) != 0 ) || ( A153BarFasEst != AV63OldEst ) ) )
      {
         AV61Inc_obs = httpContext.getMessage( httpContext.getMessage( ">- Maq=", ""), "") + AV62OldMaq + httpContext.getMessage( httpContext.getMessage( "por Maq=", ""), "") + A603MaqCodBis + httpContext.getMessage( httpContext.getMessage( "Cambio Est=", ""), "") + GXutil.str( AV63OldEst, 1, 0) + httpContext.getMessage( httpContext.getMessage( " por Est=", ""), "") + GXutil.str( A153BarFasEst, 1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs", AV61Inc_obs);
      }
      if ( ! ( ( GXutil.strcmp(A150BarFacTin, "S") == 0 ) || ( GXutil.strcmp(A150BarFacTin, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "BarFacTin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFACTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFacTin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4287BarFasFor, "S") == 0 ) || ( GXutil.strcmp(A4287BarFasFor, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Formula Productos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASFOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasFor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4301BarFasCoP, "S") == 0 ) || ( GXutil.strcmp(A4301BarFasCoP, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control Planning", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASCOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasCoP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4905BarFasAcab, "S") == 0 ) || ( GXutil.strcmp(A4905BarFasAcab, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Fase de Acabado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASACAB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasAcab_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isUpd( )  && ( ( GXutil.strcmp(A603MaqCodBis, AV62OldMaq) != 0 ) || ( A153BarFasEst != AV63OldEst ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV64Pgmname, AV35UsurCod, AV38Station, AV61Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
   }

   public void closeExtendedTableCursors19V15( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          String A603MaqCodBis )
   {
      /* Using cursor T019V9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODBIS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey19V15( )
   {
      /* Using cursor T019V10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T019V3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T019V3_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T019V3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019V3_A129BarCod[0] == A129BarCod ) && ( T019V3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T019V3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T019V3_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm19V15( 18) ;
         RcdFound15 = (short)(1) ;
         A153BarFasEst = T019V3_A153BarFasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
         A152BarFasCon = T019V3_A152BarFasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
         A150BarFacTin = T019V3_A150BarFacTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
         A162BarFecTeo = T019V3_A162BarFecTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
         A160BarFecRea = T019V3_A160BarFecRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
         A216BarTieTeo = T019V3_A216BarTieTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
         A227BarUni = T019V3_A227BarUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
         A179BarLoc = T019V3_A179BarLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
         A165BarHorIni = T019V3_A165BarHorIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
         A164BarHorFin = T019V3_A164BarHorFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
         A215BarTieRea = T019V3_A215BarTieRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
         A4021BarFasBot = T019V3_A4021BarFasBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
         A4022BarNumBot = T019V3_A4022BarNumBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
         A4287BarFasFor = T019V3_A4287BarFasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
         A4636BarFasPzas = T019V3_A4636BarFasPzas[0] ;
         n4636BarFasPzas = T019V3_n4636BarFasPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4636BarFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4636BarFasPzas), 6, 0));
         A4301BarFasCoP = T019V3_A4301BarFasCoP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
         A4637BarFasCara = T019V3_A4637BarFasCara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
         A4905BarFasAcab = T019V3_A4905BarFasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
         A3298BarFecRIni = T019V3_A3298BarFecRIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
         A3837BarFasKgm = T019V3_A3837BarFasKgm[0] ;
         n3837BarFasKgm = T019V3_n3837BarFasKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3837BarFasKgm", GXutil.ltrimstr( A3837BarFasKgm, 9, 2));
         A3838BarFasMtr = T019V3_A3838BarFasMtr[0] ;
         n3838BarFasMtr = T019V3_n3838BarFasMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3838BarFasMtr", GXutil.ltrimstr( A3838BarFasMtr, 9, 2));
         A5719BarFasKgT = T019V3_A5719BarFasKgT[0] ;
         n5719BarFasKgT = T019V3_n5719BarFasKgT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5719BarFasKgT", GXutil.ltrimstr( A5719BarFasKgT, 9, 2));
         A5720BarFasMtT = T019V3_A5720BarFasMtT[0] ;
         n5720BarFasMtT = T019V3_n5720BarFasMtT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5720BarFasMtT", GXutil.ltrimstr( A5720BarFasMtT, 9, 2));
         A5369BarFasGral = T019V3_A5369BarFasGral[0] ;
         n5369BarFasGral = T019V3_n5369BarFasGral[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5369BarFasGral", A5369BarFasGral);
         A5896BarMaqPlan = T019V3_A5896BarMaqPlan[0] ;
         n5896BarMaqPlan = T019V3_n5896BarMaqPlan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5896BarMaqPlan", A5896BarMaqPlan);
         A6173BarFasSec = T019V3_A6173BarFasSec[0] ;
         n6173BarFasSec = T019V3_n6173BarFasSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6173BarFasSec", A6173BarFasSec);
         A5048BarFasUsu = T019V3_A5048BarFasUsu[0] ;
         n5048BarFasUsu = T019V3_n5048BarFasUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5048BarFasUsu", A5048BarFasUsu);
         A8938BarfasPri2 = T019V3_A8938BarfasPri2[0] ;
         n8938BarfasPri2 = T019V3_n8938BarfasPri2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8938BarfasPri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8938BarfasPri2), 3, 0));
         A8594BarHdrO = T019V3_A8594BarHdrO[0] ;
         n8594BarHdrO = T019V3_n8594BarHdrO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8594BarHdrO", A8594BarHdrO);
         A9842BarObsF = T019V3_A9842BarObsF[0] ;
         n9842BarObsF = T019V3_n9842BarObsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9842BarObsF", A9842BarObsF);
         A457FasCod = T019V3_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A603MaqCodBis = T019V3_A603MaqCodBis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         O153BarFasEst = A153BarFasEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
         O603MaqCodBis = A603MaqCodBis ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
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
         load19V15( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKey19V15( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKey19V15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey19V15( ) ;
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
      /* Using cursor T019V11 */
      pr_default.execute(9, new Object[] {Short.valueOf(A194BarOrdLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( T019V11_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T019V11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019V11_A129BarCod[0] == A129BarCod ) && ( T019V11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T019V11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T019V11_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( T019V11_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T019V11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019V11_A129BarCod[0] == A129BarCod ) && ( T019V11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T019V11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T019V11_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T019V12 */
      pr_default.execute(10, new Object[] {Short.valueOf(A194BarOrdLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( T019V12_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T019V12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019V12_A129BarCod[0] == A129BarCod ) && ( T019V12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T019V12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T019V12_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( T019V12_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T019V12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019V12_A129BarCod[0] == A129BarCod ) && ( T019V12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T019V12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T019V12_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey19V15( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarFasEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert19V15( ) ;
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
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarFasEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update19V15( ) ;
               GX_FocusControl = edtBarFasEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarFasEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert19V15( ) ;
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
                  GX_FocusControl = edtBarFasEst_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert19V15( ) ;
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
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarFasEst_Internalname ;
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
      getKey19V15( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfasesmodif");
      GX_FocusControl = edtBarFasEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_19V0( ) ;
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
      GX_FocusControl = edtBarFasEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart19V15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19V15( ) ;
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
      GX_FocusControl = edtBarFasEst_Internalname ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasEst_Internalname ;
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
      scanStart19V15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound15 != 0 )
         {
            scanNext19V15( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarFasEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19V15( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency19V15( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019V2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z153BarFasEst != T019V2_A153BarFasEst[0] ) || ( GXutil.strcmp(Z152BarFasCon, T019V2_A152BarFasCon[0]) != 0 ) || ( GXutil.strcmp(Z150BarFacTin, T019V2_A150BarFacTin[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T019V2_A162BarFecTeo[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T019V2_A160BarFecRea[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z216BarTieTeo, T019V2_A216BarTieTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z227BarUni, T019V2_A227BarUni[0]) != 0 ) || ( GXutil.strcmp(Z179BarLoc, T019V2_A179BarLoc[0]) != 0 ) || ( Z165BarHorIni != T019V2_A165BarHorIni[0] ) || ( Z164BarHorFin != T019V2_A164BarHorFin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z215BarTieRea, T019V2_A215BarTieRea[0]) != 0 ) || ( GXutil.strcmp(Z4021BarFasBot, T019V2_A4021BarFasBot[0]) != 0 ) || ( Z4022BarNumBot != T019V2_A4022BarNumBot[0] ) || ( GXutil.strcmp(Z4287BarFasFor, T019V2_A4287BarFasFor[0]) != 0 ) || ( Z4636BarFasPzas != T019V2_A4636BarFasPzas[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4301BarFasCoP, T019V2_A4301BarFasCoP[0]) != 0 ) || ( GXutil.strcmp(Z4637BarFasCara, T019V2_A4637BarFasCara[0]) != 0 ) || ( GXutil.strcmp(Z4905BarFasAcab, T019V2_A4905BarFasAcab[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3298BarFecRIni), GXutil.resetTime(T019V2_A3298BarFecRIni[0])) ) || ( DecimalUtil.compareTo(Z3837BarFasKgm, T019V2_A3837BarFasKgm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3838BarFasMtr, T019V2_A3838BarFasMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z5719BarFasKgT, T019V2_A5719BarFasKgT[0]) != 0 ) || ( DecimalUtil.compareTo(Z5720BarFasMtT, T019V2_A5720BarFasMtT[0]) != 0 ) || ( GXutil.strcmp(Z5369BarFasGral, T019V2_A5369BarFasGral[0]) != 0 ) || ( GXutil.strcmp(Z5896BarMaqPlan, T019V2_A5896BarMaqPlan[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6173BarFasSec, T019V2_A6173BarFasSec[0]) != 0 ) || ( GXutil.strcmp(Z5048BarFasUsu, T019V2_A5048BarFasUsu[0]) != 0 ) || ( Z8938BarfasPri2 != T019V2_A8938BarfasPri2[0] ) || ( GXutil.strcmp(Z8594BarHdrO, T019V2_A8594BarHdrO[0]) != 0 ) || ( GXutil.strcmp(Z9842BarObsF, T019V2_A9842BarObsF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z457FasCod, T019V2_A457FasCod[0]) != 0 ) || ( GXutil.strcmp(Z603MaqCodBis, T019V2_A603MaqCodBis[0]) != 0 ) )
         {
            if ( Z153BarFasEst != T019V2_A153BarFasEst[0] )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasEst");
               GXutil.writeLogRaw("Old: ",Z153BarFasEst);
               GXutil.writeLogRaw("Current: ",T019V2_A153BarFasEst[0]);
            }
            if ( GXutil.strcmp(Z152BarFasCon, T019V2_A152BarFasCon[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasCon");
               GXutil.writeLogRaw("Old: ",Z152BarFasCon);
               GXutil.writeLogRaw("Current: ",T019V2_A152BarFasCon[0]);
            }
            if ( GXutil.strcmp(Z150BarFacTin, T019V2_A150BarFacTin[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFacTin");
               GXutil.writeLogRaw("Old: ",Z150BarFacTin);
               GXutil.writeLogRaw("Current: ",T019V2_A150BarFacTin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T019V2_A162BarFecTeo[0])) ) )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFecTeo");
               GXutil.writeLogRaw("Old: ",Z162BarFecTeo);
               GXutil.writeLogRaw("Current: ",T019V2_A162BarFecTeo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T019V2_A160BarFecRea[0])) ) )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFecRea");
               GXutil.writeLogRaw("Old: ",Z160BarFecRea);
               GXutil.writeLogRaw("Current: ",T019V2_A160BarFecRea[0]);
            }
            if ( DecimalUtil.compareTo(Z216BarTieTeo, T019V2_A216BarTieTeo[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarTieTeo");
               GXutil.writeLogRaw("Old: ",Z216BarTieTeo);
               GXutil.writeLogRaw("Current: ",T019V2_A216BarTieTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z227BarUni, T019V2_A227BarUni[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarUni");
               GXutil.writeLogRaw("Old: ",Z227BarUni);
               GXutil.writeLogRaw("Current: ",T019V2_A227BarUni[0]);
            }
            if ( GXutil.strcmp(Z179BarLoc, T019V2_A179BarLoc[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarLoc");
               GXutil.writeLogRaw("Old: ",Z179BarLoc);
               GXutil.writeLogRaw("Current: ",T019V2_A179BarLoc[0]);
            }
            if ( Z165BarHorIni != T019V2_A165BarHorIni[0] )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarHorIni");
               GXutil.writeLogRaw("Old: ",Z165BarHorIni);
               GXutil.writeLogRaw("Current: ",T019V2_A165BarHorIni[0]);
            }
            if ( Z164BarHorFin != T019V2_A164BarHorFin[0] )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarHorFin");
               GXutil.writeLogRaw("Old: ",Z164BarHorFin);
               GXutil.writeLogRaw("Current: ",T019V2_A164BarHorFin[0]);
            }
            if ( DecimalUtil.compareTo(Z215BarTieRea, T019V2_A215BarTieRea[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarTieRea");
               GXutil.writeLogRaw("Old: ",Z215BarTieRea);
               GXutil.writeLogRaw("Current: ",T019V2_A215BarTieRea[0]);
            }
            if ( GXutil.strcmp(Z4021BarFasBot, T019V2_A4021BarFasBot[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasBot");
               GXutil.writeLogRaw("Old: ",Z4021BarFasBot);
               GXutil.writeLogRaw("Current: ",T019V2_A4021BarFasBot[0]);
            }
            if ( Z4022BarNumBot != T019V2_A4022BarNumBot[0] )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarNumBot");
               GXutil.writeLogRaw("Old: ",Z4022BarNumBot);
               GXutil.writeLogRaw("Current: ",T019V2_A4022BarNumBot[0]);
            }
            if ( GXutil.strcmp(Z4287BarFasFor, T019V2_A4287BarFasFor[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasFor");
               GXutil.writeLogRaw("Old: ",Z4287BarFasFor);
               GXutil.writeLogRaw("Current: ",T019V2_A4287BarFasFor[0]);
            }
            if ( Z4636BarFasPzas != T019V2_A4636BarFasPzas[0] )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasPzas");
               GXutil.writeLogRaw("Old: ",Z4636BarFasPzas);
               GXutil.writeLogRaw("Current: ",T019V2_A4636BarFasPzas[0]);
            }
            if ( GXutil.strcmp(Z4301BarFasCoP, T019V2_A4301BarFasCoP[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasCoP");
               GXutil.writeLogRaw("Old: ",Z4301BarFasCoP);
               GXutil.writeLogRaw("Current: ",T019V2_A4301BarFasCoP[0]);
            }
            if ( GXutil.strcmp(Z4637BarFasCara, T019V2_A4637BarFasCara[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasCara");
               GXutil.writeLogRaw("Old: ",Z4637BarFasCara);
               GXutil.writeLogRaw("Current: ",T019V2_A4637BarFasCara[0]);
            }
            if ( GXutil.strcmp(Z4905BarFasAcab, T019V2_A4905BarFasAcab[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasAcab");
               GXutil.writeLogRaw("Old: ",Z4905BarFasAcab);
               GXutil.writeLogRaw("Current: ",T019V2_A4905BarFasAcab[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3298BarFecRIni), GXutil.resetTime(T019V2_A3298BarFecRIni[0])) ) )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFecRIni");
               GXutil.writeLogRaw("Old: ",Z3298BarFecRIni);
               GXutil.writeLogRaw("Current: ",T019V2_A3298BarFecRIni[0]);
            }
            if ( DecimalUtil.compareTo(Z3837BarFasKgm, T019V2_A3837BarFasKgm[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasKgm");
               GXutil.writeLogRaw("Old: ",Z3837BarFasKgm);
               GXutil.writeLogRaw("Current: ",T019V2_A3837BarFasKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z3838BarFasMtr, T019V2_A3838BarFasMtr[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasMtr");
               GXutil.writeLogRaw("Old: ",Z3838BarFasMtr);
               GXutil.writeLogRaw("Current: ",T019V2_A3838BarFasMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z5719BarFasKgT, T019V2_A5719BarFasKgT[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasKgT");
               GXutil.writeLogRaw("Old: ",Z5719BarFasKgT);
               GXutil.writeLogRaw("Current: ",T019V2_A5719BarFasKgT[0]);
            }
            if ( DecimalUtil.compareTo(Z5720BarFasMtT, T019V2_A5720BarFasMtT[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasMtT");
               GXutil.writeLogRaw("Old: ",Z5720BarFasMtT);
               GXutil.writeLogRaw("Current: ",T019V2_A5720BarFasMtT[0]);
            }
            if ( GXutil.strcmp(Z5369BarFasGral, T019V2_A5369BarFasGral[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasGral");
               GXutil.writeLogRaw("Old: ",Z5369BarFasGral);
               GXutil.writeLogRaw("Current: ",T019V2_A5369BarFasGral[0]);
            }
            if ( GXutil.strcmp(Z5896BarMaqPlan, T019V2_A5896BarMaqPlan[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarMaqPlan");
               GXutil.writeLogRaw("Old: ",Z5896BarMaqPlan);
               GXutil.writeLogRaw("Current: ",T019V2_A5896BarMaqPlan[0]);
            }
            if ( GXutil.strcmp(Z6173BarFasSec, T019V2_A6173BarFasSec[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasSec");
               GXutil.writeLogRaw("Old: ",Z6173BarFasSec);
               GXutil.writeLogRaw("Current: ",T019V2_A6173BarFasSec[0]);
            }
            if ( GXutil.strcmp(Z5048BarFasUsu, T019V2_A5048BarFasUsu[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarFasUsu");
               GXutil.writeLogRaw("Old: ",Z5048BarFasUsu);
               GXutil.writeLogRaw("Current: ",T019V2_A5048BarFasUsu[0]);
            }
            if ( Z8938BarfasPri2 != T019V2_A8938BarfasPri2[0] )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarfasPri2");
               GXutil.writeLogRaw("Old: ",Z8938BarfasPri2);
               GXutil.writeLogRaw("Current: ",T019V2_A8938BarfasPri2[0]);
            }
            if ( GXutil.strcmp(Z8594BarHdrO, T019V2_A8594BarHdrO[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarHdrO");
               GXutil.writeLogRaw("Old: ",Z8594BarHdrO);
               GXutil.writeLogRaw("Current: ",T019V2_A8594BarHdrO[0]);
            }
            if ( GXutil.strcmp(Z9842BarObsF, T019V2_A9842BarObsF[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"BarObsF");
               GXutil.writeLogRaw("Old: ",Z9842BarObsF);
               GXutil.writeLogRaw("Current: ",T019V2_A9842BarObsF[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T019V2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T019V2_A457FasCod[0]);
            }
            if ( GXutil.strcmp(Z603MaqCodBis, T019V2_A603MaqCodBis[0]) != 0 )
            {
               GXutil.writeLogln("tfasesmodif:[seudo value changed for attri]"+"MaqCodBis");
               GXutil.writeLogRaw("Old: ",Z603MaqCodBis);
               GXutil.writeLogRaw("Current: ",T019V2_A603MaqCodBis[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19V15( )
   {
      beforeValidate19V15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19V15( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19V15( 0) ;
         checkOptimisticConcurrency19V15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19V15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19V15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019V13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A194BarOrdLin), Byte.valueOf(A153BarFasEst), A152BarFasCon, A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, A179BarLoc, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, Boolean.valueOf(n4636BarFasPzas), Integer.valueOf(A4636BarFasPzas), A4301BarFasCoP, A4637BarFasCara, A4905BarFasAcab, A3298BarFecRIni, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Boolean.valueOf(n8594BarHdrO), A8594BarHdrO, Boolean.valueOf(n9842BarObsF), A9842BarObsF, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, A457FasCod, A603MaqCodBis});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption19V0( ) ;
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
            load19V15( ) ;
         }
         endLevel19V15( ) ;
      }
      closeExtendedTableCursors19V15( ) ;
   }

   public void update19V15( )
   {
      beforeValidate19V15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19V15( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19V15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19V15( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate19V15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019V14 */
                  pr_default.execute(12, new Object[] {Byte.valueOf(A153BarFasEst), A152BarFasCon, A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, A179BarLoc, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, Boolean.valueOf(n4636BarFasPzas), Integer.valueOf(A4636BarFasPzas), A4301BarFasCoP, A4637BarFasCara, A4905BarFasAcab, A3298BarFecRIni, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Boolean.valueOf(n8594BarHdrO), A8594BarHdrO, Boolean.valueOf(n9842BarObsF), A9842BarObsF, A457FasCod, A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate19V15( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption19V0( ) ;
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
         endLevel19V15( ) ;
      }
      closeExtendedTableCursors19V15( ) ;
   }

   public void deferredUpdate19V15( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19V15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19V15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19V15( ) ;
         afterConfirm19V15( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19V15( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T019V15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
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
                        initAll19V15( ) ;
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
                     resetCaption19V0( ) ;
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
      endLevel19V15( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19V15( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV63OldEst = O153BarFasEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63OldEst", GXutil.str( AV63OldEst, 1, 0));
         AV62OldMaq = O603MaqCodBis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62OldMaq", AV62OldMaq);
         if ( isUpd( )  && ( ( GXutil.strcmp(A603MaqCodBis, AV62OldMaq) != 0 ) || ( A153BarFasEst != AV63OldEst ) ) )
         {
            AV61Inc_obs = httpContext.getMessage( httpContext.getMessage( ">- Maq=", ""), "") + AV62OldMaq + httpContext.getMessage( httpContext.getMessage( "por Maq=", ""), "") + A603MaqCodBis + httpContext.getMessage( httpContext.getMessage( "Cambio Est=", ""), "") + GXutil.str( AV63OldEst, 1, 0) + httpContext.getMessage( httpContext.getMessage( " por Est=", ""), "") + GXutil.str( A153BarFasEst, 1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs", AV61Inc_obs);
         }
      }
   }

   public void endLevel19V15( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete19V15( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfasesmodif");
         if ( AnyError == 0 )
         {
            confirmValues19V0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfasesmodif");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart19V15( )
   {
      /* Scan By routine */
      /* Using cursor T019V16 */
      pr_default.execute(14, new Object[] {Short.valueOf(A194BarOrdLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19V15( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
   }

   public void scanEnd19V15( )
   {
      pr_default.close(14);
   }

   public void afterConfirm19V15( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19V15( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19V15( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19V15( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19V15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19V15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19V15( )
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
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtBarFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst_Enabled), 5, 0), true);
      edtBarFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCon_Enabled), 5, 0), true);
      edtMaqCodBis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), true);
      edtBarFacTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFacTin_Enabled), 5, 0), true);
      edtBarFecTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecTeo_Enabled), 5, 0), true);
      edtBarFecRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea_Enabled), 5, 0), true);
      edtBarTieTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Enabled), 5, 0), true);
      edtBarUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni_Enabled), 5, 0), true);
      edtBarLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLoc_Enabled), 5, 0), true);
      edtBarHorIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorIni_Enabled), 5, 0), true);
      edtBarHorFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorFin_Enabled), 5, 0), true);
      edtBarTieRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Enabled), 5, 0), true);
      edtBarFasBot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasBot_Enabled), 5, 0), true);
      edtBarNumBot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumBot_Enabled), 5, 0), true);
      edtBarFasFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasFor_Enabled), 5, 0), true);
      edtBarFasPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasPzas_Enabled), 5, 0), true);
      edtBarFasCoP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCoP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCoP_Enabled), 5, 0), true);
      edtBarFasCara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasCara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCara_Enabled), 5, 0), true);
      edtBarFasAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasAcab_Enabled), 5, 0), true);
      edtBarFecRIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRIni_Enabled), 5, 0), true);
      edtBarFasKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasKgm_Enabled), 5, 0), true);
      edtBarFasMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasMtr_Enabled), 5, 0), true);
      edtBarFasKgT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasKgT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasKgT_Enabled), 5, 0), true);
      edtBarFasMtT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasMtT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasMtT_Enabled), 5, 0), true);
      edtBarFasGral_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasGral_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasGral_Enabled), 5, 0), true);
      edtBarMaqPlan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqPlan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqPlan_Enabled), 5, 0), true);
      edtBarFasSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasSec_Enabled), 5, 0), true);
      edtBarFasUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasUsu_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtFasDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc2_Enabled), 5, 0), true);
      edtBarfasPri2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarfasPri2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarfasPri2_Enabled), 5, 0), true);
      edtBarHdrO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHdrO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHdrO_Enabled), 5, 0), true);
      edtBarObsF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarObsF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarObsF_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes19V15( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues19V0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfasesmodif", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFASESModif");
      forbiddenHiddens.add("BarTieRea", localUtil.format( A215BarTieRea, "Z9.99"));
      forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
      forbiddenHiddens.add("BarFasSec", GXutil.rtrim( localUtil.format( A6173BarFasSec, "")));
      forbiddenHiddens.add("BarFasUsu", GXutil.rtrim( localUtil.format( A5048BarFasUsu, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfasesmodif:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z153BarFasEst", GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z152BarFasCon", GXutil.rtrim( Z152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z150BarFacTin", GXutil.rtrim( Z150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z162BarFecTeo", localUtil.dtoc( Z162BarFecTeo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z160BarFecRea", localUtil.dtoc( Z160BarFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z216BarTieTeo", GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z227BarUni", GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z179BarLoc", GXutil.rtrim( Z179BarLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z165BarHorIni", GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z164BarHorFin", GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z215BarTieRea", GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4021BarFasBot", GXutil.rtrim( Z4021BarFasBot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4022BarNumBot", GXutil.ltrim( localUtil.ntoc( Z4022BarNumBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4287BarFasFor", GXutil.rtrim( Z4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4636BarFasPzas", GXutil.ltrim( localUtil.ntoc( Z4636BarFasPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4301BarFasCoP", GXutil.rtrim( Z4301BarFasCoP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4637BarFasCara", GXutil.rtrim( Z4637BarFasCara));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4905BarFasAcab", GXutil.rtrim( Z4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3298BarFecRIni", localUtil.dtoc( Z3298BarFecRIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3837BarFasKgm", GXutil.ltrim( localUtil.ntoc( Z3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3838BarFasMtr", GXutil.ltrim( localUtil.ntoc( Z3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5719BarFasKgT", GXutil.ltrim( localUtil.ntoc( Z5719BarFasKgT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5720BarFasMtT", GXutil.ltrim( localUtil.ntoc( Z5720BarFasMtT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5369BarFasGral", GXutil.rtrim( Z5369BarFasGral));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5896BarMaqPlan", GXutil.rtrim( Z5896BarMaqPlan));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6173BarFasSec", GXutil.rtrim( Z6173BarFasSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5048BarFasUsu", GXutil.rtrim( Z5048BarFasUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8938BarfasPri2", GXutil.ltrim( localUtil.ntoc( Z8938BarfasPri2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8594BarHdrO", GXutil.rtrim( Z8594BarHdrO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9842BarObsF", Z9842BarObsF);
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z603MaqCodBis", GXutil.rtrim( Z603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "O153BarFasEst", GXutil.ltrim( localUtil.ntoc( O153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O603MaqCodBis", GXutil.rtrim( O603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDMAQ", GXutil.rtrim( AV62OldMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDEST", GXutil.ltrim( localUtil.ntoc( AV63OldEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV61Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV64Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV35UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV38Station));
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
      return formatLink("app.tfasesmodif", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"})  ;
   }

   public String getPgmname( )
   {
      return "TFASESModif" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FASESModif", "") ;
   }

   public void initializeNonKey19V15( )
   {
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      AV62OldMaq = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldMaq", AV62OldMaq);
      AV63OldEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63OldEst", GXutil.str( AV63OldEst, 1, 0));
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A153BarFasEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
      A152BarFasCon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
      A603MaqCodBis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      A150BarFacTin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
      A162BarFecTeo = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
      A160BarFecRea = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
      A216BarTieTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
      A227BarUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
      A179BarLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
      A165BarHorIni = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
      A164BarHorFin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
      A215BarTieRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
      A4021BarFasBot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
      A4022BarNumBot = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
      A4287BarFasFor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
      A4636BarFasPzas = 0 ;
      n4636BarFasPzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4636BarFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4636BarFasPzas), 6, 0));
      A4301BarFasCoP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
      A4637BarFasCara = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
      A4905BarFasAcab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
      A3298BarFecRIni = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
      A3837BarFasKgm = DecimalUtil.ZERO ;
      n3837BarFasKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3837BarFasKgm", GXutil.ltrimstr( A3837BarFasKgm, 9, 2));
      A3838BarFasMtr = DecimalUtil.ZERO ;
      n3838BarFasMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3838BarFasMtr", GXutil.ltrimstr( A3838BarFasMtr, 9, 2));
      A5719BarFasKgT = DecimalUtil.ZERO ;
      n5719BarFasKgT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5719BarFasKgT", GXutil.ltrimstr( A5719BarFasKgT, 9, 2));
      A5720BarFasMtT = DecimalUtil.ZERO ;
      n5720BarFasMtT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5720BarFasMtT", GXutil.ltrimstr( A5720BarFasMtT, 9, 2));
      A5369BarFasGral = "" ;
      n5369BarFasGral = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5369BarFasGral", A5369BarFasGral);
      A5896BarMaqPlan = "" ;
      n5896BarMaqPlan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5896BarMaqPlan", A5896BarMaqPlan);
      A6173BarFasSec = "" ;
      n6173BarFasSec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6173BarFasSec", A6173BarFasSec);
      A5048BarFasUsu = "" ;
      n5048BarFasUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5048BarFasUsu", A5048BarFasUsu);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4642FasDsc2 = "" ;
      n4642FasDsc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
      A8938BarfasPri2 = (short)(0) ;
      n8938BarfasPri2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8938BarfasPri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8938BarfasPri2), 3, 0));
      A8594BarHdrO = "" ;
      n8594BarHdrO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8594BarHdrO", A8594BarHdrO);
      A9842BarObsF = "" ;
      n9842BarObsF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9842BarObsF", A9842BarObsF);
      AV61Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs", AV61Inc_obs);
      O153BarFasEst = A153BarFasEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
      O603MaqCodBis = A603MaqCodBis ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      Z153BarFasEst = (byte)(0) ;
      Z152BarFasCon = "" ;
      Z150BarFacTin = "" ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z165BarHorIni = (short)(0) ;
      Z164BarHorFin = (short)(0) ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z4021BarFasBot = "" ;
      Z4022BarNumBot = 0 ;
      Z4287BarFasFor = "" ;
      Z4636BarFasPzas = 0 ;
      Z4301BarFasCoP = "" ;
      Z4637BarFasCara = "" ;
      Z4905BarFasAcab = "" ;
      Z3298BarFecRIni = GXutil.nullDate() ;
      Z3837BarFasKgm = DecimalUtil.ZERO ;
      Z3838BarFasMtr = DecimalUtil.ZERO ;
      Z5719BarFasKgT = DecimalUtil.ZERO ;
      Z5720BarFasMtT = DecimalUtil.ZERO ;
      Z5369BarFasGral = "" ;
      Z5896BarMaqPlan = "" ;
      Z6173BarFasSec = "" ;
      Z5048BarFasUsu = "" ;
      Z8938BarfasPri2 = (short)(0) ;
      Z8594BarHdrO = "" ;
      Z9842BarObsF = "" ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
   }

   public void initAll19V15( )
   {
      initializeNonKey19V15( ) ;
   }

   public void standaloneModalInsert( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156125", true, true);
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
      httpContext.AddJavascriptSource("tfasesmodif.js", "?2026824156125", false, true);
      /* End function include_jscripts */
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
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarFasEst_Internalname = "BARFASEST" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarFasCon_Internalname = "BARFASCON" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarFacTin_Internalname = "BARFACTIN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarFecTeo_Internalname = "BARFECTEO" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarFecRea_Internalname = "BARFECREA" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarTieTeo_Internalname = "BARTIETEO" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarUni_Internalname = "BARUNI" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarLoc_Internalname = "BARLOC" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarHorIni_Internalname = "BARHORINI" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarHorFin_Internalname = "BARHORFIN" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBarTieRea_Internalname = "BARTIEREA" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBarFasBot_Internalname = "BARFASBOT" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBarNumBot_Internalname = "BARNUMBOT" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtBarFasFor_Internalname = "BARFASFOR" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtBarFasPzas_Internalname = "BARFASPZAS" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtBarFasCoP_Internalname = "BARFASCOP" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtBarFasCara_Internalname = "BARFASCARA" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtBarFasAcab_Internalname = "BARFASACAB" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtBarFecRIni_Internalname = "BARFECRINI" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtBarFasKgm_Internalname = "BARFASKGM" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtBarFasMtr_Internalname = "BARFASMTR" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtBarFasKgT_Internalname = "BARFASKGT" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtBarFasMtT_Internalname = "BARFASMTT" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtBarFasGral_Internalname = "BARFASGRAL" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtBarMaqPlan_Internalname = "BARMAQPLAN" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtBarFasSec_Internalname = "BARFASSEC" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtBarFasUsu_Internalname = "BARFASUSU" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtFasDsc2_Internalname = "FASDSC2" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtBarfasPri2_Internalname = "BARFASPRI2" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtBarHdrO_Internalname = "BARHDRO" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtBarObsF_Internalname = "BAROBSF" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "FASESModif", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarObsF_Backcolor = (int)(0xFFFFFF) ;
      edtBarObsF_Enabled = 1 ;
      edtBarHdrO_Jsonclick = "" ;
      edtBarHdrO_Backcolor = (int)(0xFFFFFF) ;
      edtBarHdrO_Enabled = 1 ;
      edtBarfasPri2_Jsonclick = "" ;
      edtBarfasPri2_Backcolor = (int)(0xFFFFFF) ;
      edtBarfasPri2_Enabled = 1 ;
      edtFasDsc2_Jsonclick = "" ;
      edtFasDsc2_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc2_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtBarFasUsu_Jsonclick = "" ;
      edtBarFasUsu_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasUsu_Enabled = 0 ;
      edtBarFasSec_Jsonclick = "" ;
      edtBarFasSec_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasSec_Enabled = 0 ;
      edtBarMaqPlan_Jsonclick = "" ;
      edtBarMaqPlan_Backcolor = (int)(0xFFFFFF) ;
      edtBarMaqPlan_Enabled = 1 ;
      edtBarFasGral_Jsonclick = "" ;
      edtBarFasGral_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasGral_Enabled = 1 ;
      edtBarFasMtT_Jsonclick = "" ;
      edtBarFasMtT_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasMtT_Enabled = 1 ;
      edtBarFasKgT_Jsonclick = "" ;
      edtBarFasKgT_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasKgT_Enabled = 1 ;
      edtBarFasMtr_Jsonclick = "" ;
      edtBarFasMtr_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasMtr_Enabled = 1 ;
      edtBarFasKgm_Jsonclick = "" ;
      edtBarFasKgm_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasKgm_Enabled = 1 ;
      edtBarFecRIni_Jsonclick = "" ;
      edtBarFecRIni_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecRIni_Enabled = 1 ;
      edtBarFasAcab_Jsonclick = "" ;
      edtBarFasAcab_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasAcab_Enabled = 1 ;
      edtBarFasCara_Jsonclick = "" ;
      edtBarFasCara_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasCara_Enabled = 1 ;
      edtBarFasCoP_Jsonclick = "" ;
      edtBarFasCoP_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasCoP_Enabled = 1 ;
      edtBarFasPzas_Jsonclick = "" ;
      edtBarFasPzas_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasPzas_Enabled = 1 ;
      edtBarFasFor_Jsonclick = "" ;
      edtBarFasFor_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasFor_Enabled = 1 ;
      edtBarNumBot_Jsonclick = "" ;
      edtBarNumBot_Backcolor = (int)(0xFFFFFF) ;
      edtBarNumBot_Enabled = 1 ;
      edtBarFasBot_Jsonclick = "" ;
      edtBarFasBot_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasBot_Enabled = 1 ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarTieRea_Backcolor = (int)(0xFFFFFF) ;
      edtBarTieRea_Enabled = 0 ;
      edtBarHorFin_Jsonclick = "" ;
      edtBarHorFin_Backcolor = (int)(0xFFFFFF) ;
      edtBarHorFin_Enabled = 1 ;
      edtBarHorIni_Jsonclick = "" ;
      edtBarHorIni_Backcolor = (int)(0xFFFFFF) ;
      edtBarHorIni_Enabled = 1 ;
      edtBarLoc_Jsonclick = "" ;
      edtBarLoc_Backcolor = (int)(0xFFFFFF) ;
      edtBarLoc_Enabled = 1 ;
      edtBarUni_Jsonclick = "" ;
      edtBarUni_Backcolor = (int)(0xFFFFFF) ;
      edtBarUni_Enabled = 1 ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarTieTeo_Backcolor = (int)(0xFFFFFF) ;
      edtBarTieTeo_Enabled = 1 ;
      edtBarFecRea_Jsonclick = "" ;
      edtBarFecRea_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecRea_Enabled = 1 ;
      edtBarFecTeo_Jsonclick = "" ;
      edtBarFecTeo_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecTeo_Enabled = 1 ;
      edtBarFacTin_Jsonclick = "" ;
      edtBarFacTin_Backcolor = (int)(0xFFFFFF) ;
      edtBarFacTin_Enabled = 1 ;
      edtMaqCodBis_Jsonclick = "" ;
      edtMaqCodBis_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCodBis_Enabled = 1 ;
      edtBarFasCon_Jsonclick = "" ;
      edtBarFasCon_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasCon_Enabled = 1 ;
      edtBarFasEst_Jsonclick = "" ;
      edtBarFasEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasEst_Enabled = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
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

   public void xc_15_19V15( String Gx_mode ,
                            String A396EmprCod ,
                            String AV64Pgmname ,
                            String AV35UsurCod ,
                            String AV38Station ,
                            String AV61Inc_obs ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            String A603MaqCodBis ,
                            String AV62OldMaq ,
                            byte A153BarFasEst ,
                            byte AV63OldEst )
   {
      if ( isUpd( )  && ( ( GXutil.strcmp(A603MaqCodBis, AV62OldMaq) != 0 ) || ( A153BarFasEst != AV63OldEst ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV64Pgmname, AV35UsurCod, AV38Station, AV61Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T019V17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019V17_A407EmprNom[0] ;
      n407EmprNom = T019V17_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      /* Using cursor T019V18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(16);
      GX_FocusControl = edtBarFasEst_Internalname ;
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

   public void valid_Barordlin( )
   {
      n5048BarFasUsu = false ;
      n6173BarFasSec = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", GXutil.rtrim( A152BarFasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", GXutil.rtrim( A603MaqCodBis));
      httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", GXutil.rtrim( A150BarFacTin));
      httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", GXutil.rtrim( A179BarLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", GXutil.rtrim( A4021BarFasBot));
      httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrim( localUtil.ntoc( A4022BarNumBot, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", GXutil.rtrim( A4287BarFasFor));
      httpContext.ajax_rsp_assign_attri("", false, "A4636BarFasPzas", GXutil.ltrim( localUtil.ntoc( A4636BarFasPzas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", GXutil.rtrim( A4301BarFasCoP));
      httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", GXutil.rtrim( A4637BarFasCara));
      httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", GXutil.rtrim( A4905BarFasAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3837BarFasKgm", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3838BarFasMtr", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5719BarFasKgT", GXutil.ltrim( localUtil.ntoc( A5719BarFasKgT, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5720BarFasMtT", GXutil.ltrim( localUtil.ntoc( A5720BarFasMtT, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5369BarFasGral", GXutil.rtrim( A5369BarFasGral));
      httpContext.ajax_rsp_assign_attri("", false, "A5896BarMaqPlan", GXutil.rtrim( A5896BarMaqPlan));
      httpContext.ajax_rsp_assign_attri("", false, "A6173BarFasSec", GXutil.rtrim( A6173BarFasSec));
      httpContext.ajax_rsp_assign_attri("", false, "A5048BarFasUsu", GXutil.rtrim( A5048BarFasUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", GXutil.rtrim( A4642FasDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A8938BarfasPri2", GXutil.ltrim( localUtil.ntoc( A8938BarfasPri2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8594BarHdrO", GXutil.rtrim( A8594BarHdrO));
      httpContext.ajax_rsp_assign_attri("", false, "A9842BarObsF", A9842BarObsF);
      httpContext.ajax_rsp_assign_attri("", false, "AV63OldEst", GXutil.ltrim( localUtil.ntoc( AV63OldEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldMaq", GXutil.rtrim( AV62OldMaq));
      httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs", AV61Inc_obs);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z153BarFasEst", GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z152BarFasCon", GXutil.rtrim( Z152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z603MaqCodBis", GXutil.rtrim( Z603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z150BarFacTin", GXutil.rtrim( Z150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z162BarFecTeo", localUtil.format(Z162BarFecTeo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z160BarFecRea", localUtil.format(Z160BarFecRea, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z216BarTieTeo", GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z227BarUni", GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z179BarLoc", GXutil.rtrim( Z179BarLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z165BarHorIni", GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z164BarHorFin", GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z215BarTieRea", GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4021BarFasBot", GXutil.rtrim( Z4021BarFasBot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4022BarNumBot", GXutil.ltrim( localUtil.ntoc( Z4022BarNumBot, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4287BarFasFor", GXutil.rtrim( Z4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4636BarFasPzas", GXutil.ltrim( localUtil.ntoc( Z4636BarFasPzas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4301BarFasCoP", GXutil.rtrim( Z4301BarFasCoP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4637BarFasCara", GXutil.rtrim( Z4637BarFasCara));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4905BarFasAcab", GXutil.rtrim( Z4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3298BarFecRIni", localUtil.format(Z3298BarFecRIni, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3837BarFasKgm", GXutil.ltrim( localUtil.ntoc( Z3837BarFasKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3838BarFasMtr", GXutil.ltrim( localUtil.ntoc( Z3838BarFasMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5719BarFasKgT", GXutil.ltrim( localUtil.ntoc( Z5719BarFasKgT, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5720BarFasMtT", GXutil.ltrim( localUtil.ntoc( Z5720BarFasMtT, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5369BarFasGral", GXutil.rtrim( Z5369BarFasGral));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5896BarMaqPlan", GXutil.rtrim( Z5896BarMaqPlan));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6173BarFasSec", GXutil.rtrim( Z6173BarFasSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5048BarFasUsu", GXutil.rtrim( Z5048BarFasUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4642FasDsc2", GXutil.rtrim( Z4642FasDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8938BarfasPri2", GXutil.ltrim( localUtil.ntoc( Z8938BarfasPri2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8594BarHdrO", GXutil.rtrim( Z8594BarHdrO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9842BarObsF", Z9842BarObsF);
      app.GxWebStd.gx_hidden_field( httpContext, "ZV63OldEst", GXutil.ltrim( localUtil.ntoc( ZV63OldEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV62OldMaq", GXutil.rtrim( ZV62OldMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV61Inc_obs", ZV61Inc_obs);
      httpContext.ajax_rsp_assign_attri("", false, "O153BarFasEst", GXutil.ltrim( localUtil.ntoc( O153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O603MaqCodBis", GXutil.rtrim( O603MaqCodBis));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barfasest( )
   {
      if ( ! ( ( A153BarFasEst == 0 ) || ( A153BarFasEst == 1 ) || ( A153BarFasEst == 2 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado Barcada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARFASEST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasEst_Internalname ;
      }
      AV63OldEst = O153BarFasEst ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV63OldEst", GXutil.ltrim( localUtil.ntoc( AV63OldEst, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Maqcodbis( )
   {
      /* Using cursor T019V19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODBIS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodBis_Internalname ;
      }
      pr_default.close(17);
      AV62OldMaq = O603MaqCodBis ;
      if ( isUpd( )  && ( ( GXutil.strcmp(A603MaqCodBis, AV62OldMaq) != 0 ) || ( A153BarFasEst != AV63OldEst ) ) )
      {
         AV61Inc_obs = httpContext.getMessage( httpContext.getMessage( ">- Maq=", ""), "") + AV62OldMaq + httpContext.getMessage( httpContext.getMessage( "por Maq=", ""), "") + A603MaqCodBis + httpContext.getMessage( httpContext.getMessage( "Cambio Est=", ""), "") + GXutil.str( AV63OldEst, 1, 0) + httpContext.getMessage( httpContext.getMessage( " por Est=", ""), "") + GXutil.str( A153BarFasEst, 1, 0) ;
      }
      if ( isUpd( )  && ( ( GXutil.strcmp(A603MaqCodBis, AV62OldMaq) != 0 ) || ( A153BarFasEst != AV63OldEst ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV64Pgmname, AV35UsurCod, AV38Station, AV61Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldMaq", GXutil.rtrim( AV62OldMaq));
      httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs", AV61Inc_obs);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A5048BarFasUsu',fld:'BARFASUSU',pic:'@!'}]");
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
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'A5048BarFasUsu',fld:'BARFASUSU',pic:'@!'},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'AV35UsurCod',fld:'vUSURCOD',pic:''},{av:'AV38Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV63OldEst',fld:'vOLDEST',pic:'9'},{av:'AV62OldMaq',fld:'vOLDMAQ',pic:''},{av:'AV61Inc_obs',fld:'vINC_OBS',pic:''}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A162BarFecTeo',fld:'BARFECTEO',pic:''},{av:'A160BarFecRea',fld:'BARFECREA',pic:''},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A227BarUni',fld:'BARUNI',pic:'ZZZZZ9.99'},{av:'A179BarLoc',fld:'BARLOC',pic:''},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A4021BarFasBot',fld:'BARFASBOT',pic:''},{av:'A4022BarNumBot',fld:'BARNUMBOT',pic:'ZZZZZ9'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A4636BarFasPzas',fld:'BARFASPZAS',pic:'ZZZZZ9'},{av:'A4301BarFasCoP',fld:'BARFASCOP',pic:'@!'},{av:'A4637BarFasCara',fld:'BARFASCARA',pic:''},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A3298BarFecRIni',fld:'BARFECRINI',pic:''},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A5369BarFasGral',fld:'BARFASGRAL',pic:''},{av:'A5896BarMaqPlan',fld:'BARMAQPLAN',pic:''},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A5048BarFasUsu',fld:'BARFASUSU',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4642FasDsc2',fld:'FASDSC2',pic:''},{av:'A8938BarfasPri2',fld:'BARFASPRI2',pic:'ZZ9'},{av:'A8594BarHdrO',fld:'BARHDRO',pic:''},{av:'A9842BarObsF',fld:'BAROBSF',pic:''},{av:'AV63OldEst',fld:'vOLDEST',pic:'9'},{av:'AV62OldMaq',fld:'vOLDMAQ',pic:''},{av:'AV61Inc_obs',fld:'vINC_OBS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z602MaqCod'},{av:'Z407EmprNom'},{av:'Z457FasCod'},{av:'Z153BarFasEst'},{av:'Z152BarFasCon'},{av:'Z603MaqCodBis'},{av:'Z150BarFacTin'},{av:'Z162BarFecTeo'},{av:'Z160BarFecRea'},{av:'Z216BarTieTeo'},{av:'Z227BarUni'},{av:'Z179BarLoc'},{av:'Z165BarHorIni'},{av:'Z164BarHorFin'},{av:'Z215BarTieRea'},{av:'Z4021BarFasBot'},{av:'Z4022BarNumBot'},{av:'Z4287BarFasFor'},{av:'Z4636BarFasPzas'},{av:'Z4301BarFasCoP'},{av:'Z4637BarFasCara'},{av:'Z4905BarFasAcab'},{av:'Z3298BarFecRIni'},{av:'Z3837BarFasKgm'},{av:'Z3838BarFasMtr'},{av:'Z5719BarFasKgT'},{av:'Z5720BarFasMtT'},{av:'Z5369BarFasGral'},{av:'Z5896BarMaqPlan'},{av:'Z6173BarFasSec'},{av:'Z5048BarFasUsu'},{av:'Z460FasDsc'},{av:'Z4642FasDsc2'},{av:'Z8938BarfasPri2'},{av:'Z8594BarHdrO'},{av:'Z9842BarObsF'},{av:'ZV63OldEst'},{av:'ZV62OldMaq'},{av:'ZV61Inc_obs'},{av:'O153BarFasEst'},{av:'O603MaqCodBis'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_BARFASEST","{handler:'valid_Barfasest',iparms:[{av:'O153BarFasEst'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'AV63OldEst',fld:'vOLDEST',pic:'9'}]");
      setEventMetadata("VALID_BARFASEST",",oparms:[{av:'AV63OldEst',fld:'vOLDEST',pic:'9'}]}");
      setEventMetadata("VALID_BARFASCON","{handler:'valid_Barfascon',iparms:[]");
      setEventMetadata("VALID_BARFASCON",",oparms:[]}");
      setEventMetadata("VALID_MAQCODBIS","{handler:'valid_Maqcodbis',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O603MaqCodBis'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'AV62OldMaq',fld:'vOLDMAQ',pic:''},{av:'AV63OldEst',fld:'vOLDEST',pic:'9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35UsurCod',fld:'vUSURCOD',pic:''},{av:'AV38Station',fld:'vSTATION',pic:''},{av:'AV61Inc_obs',fld:'vINC_OBS',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_MAQCODBIS",",oparms:[{av:'AV62OldMaq',fld:'vOLDMAQ',pic:''},{av:'AV61Inc_obs',fld:'vINC_OBS',pic:''}]}");
      setEventMetadata("VALID_BARFACTIN","{handler:'valid_Barfactin',iparms:[]");
      setEventMetadata("VALID_BARFACTIN",",oparms:[]}");
      setEventMetadata("VALID_BARFASFOR","{handler:'valid_Barfasfor',iparms:[]");
      setEventMetadata("VALID_BARFASFOR",",oparms:[]}");
      setEventMetadata("VALID_BARFASCOP","{handler:'valid_Barfascop',iparms:[]");
      setEventMetadata("VALID_BARFASCOP",",oparms:[]}");
      setEventMetadata("VALID_BARFASACAB","{handler:'valid_Barfasacab',iparms:[]");
      setEventMetadata("VALID_BARFASACAB",",oparms:[]}");
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
      pr_default.close(16);
      pr_default.close(15);
      pr_default.close(17);
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
      Z152BarFasCon = "" ;
      Z150BarFacTin = "" ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z4021BarFasBot = "" ;
      Z4287BarFasFor = "" ;
      Z4301BarFasCoP = "" ;
      Z4637BarFasCara = "" ;
      Z4905BarFasAcab = "" ;
      Z3298BarFecRIni = GXutil.nullDate() ;
      Z3837BarFasKgm = DecimalUtil.ZERO ;
      Z3838BarFasMtr = DecimalUtil.ZERO ;
      Z5719BarFasKgT = DecimalUtil.ZERO ;
      Z5720BarFasMtT = DecimalUtil.ZERO ;
      Z5369BarFasGral = "" ;
      Z5896BarMaqPlan = "" ;
      Z6173BarFasSec = "" ;
      Z5048BarFasUsu = "" ;
      Z8594BarHdrO = "" ;
      Z9842BarObsF = "" ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
      O603MaqCodBis = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV64Pgmname = "" ;
      AV35UsurCod = "" ;
      AV38Station = "" ;
      AV61Inc_obs = "" ;
      A130BarCodPar = "" ;
      A603MaqCodBis = "" ;
      AV62OldMaq = "" ;
      A758ProCod = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A457FasCod = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A152BarFasCon = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A150BarFacTin = "" ;
      lblTextblock13_Jsonclick = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      lblTextblock15_Jsonclick = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A179BarLoc = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A4021BarFasBot = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A4287BarFasFor = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A4301BarFasCoP = "" ;
      lblTextblock26_Jsonclick = "" ;
      A4637BarFasCara = "" ;
      lblTextblock27_Jsonclick = "" ;
      A4905BarFasAcab = "" ;
      lblTextblock28_Jsonclick = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      lblTextblock29_Jsonclick = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      lblTextblock30_Jsonclick = "" ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      lblTextblock31_Jsonclick = "" ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      lblTextblock32_Jsonclick = "" ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      A5369BarFasGral = "" ;
      lblTextblock34_Jsonclick = "" ;
      A5896BarMaqPlan = "" ;
      lblTextblock35_Jsonclick = "" ;
      A6173BarFasSec = "" ;
      lblTextblock36_Jsonclick = "" ;
      A5048BarFasUsu = "" ;
      lblTextblock37_Jsonclick = "" ;
      A460FasDsc = "" ;
      lblTextblock38_Jsonclick = "" ;
      A4642FasDsc2 = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      A8594BarHdrO = "" ;
      lblTextblock41_Jsonclick = "" ;
      A9842BarObsF = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV36LitFe = "" ;
      AV16Lit0 = "" ;
      GXt_char1 = "" ;
      AV39emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV40emprnom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z460FasDsc = "" ;
      Z4642FasDsc2 = "" ;
      T019V4_A407EmprNom = new String[] {""} ;
      T019V4_n407EmprNom = new boolean[] {false} ;
      T019V5_A396EmprCod = new String[] {""} ;
      T019V6_A460FasDsc = new String[] {""} ;
      T019V6_A4642FasDsc2 = new String[] {""} ;
      T019V6_n4642FasDsc2 = new boolean[] {false} ;
      T019V8_A194BarOrdLin = new short[1] ;
      T019V8_A407EmprNom = new String[] {""} ;
      T019V8_n407EmprNom = new boolean[] {false} ;
      T019V8_A153BarFasEst = new byte[1] ;
      T019V8_A152BarFasCon = new String[] {""} ;
      T019V8_A150BarFacTin = new String[] {""} ;
      T019V8_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T019V8_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T019V8_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V8_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V8_A179BarLoc = new String[] {""} ;
      T019V8_A165BarHorIni = new short[1] ;
      T019V8_A164BarHorFin = new short[1] ;
      T019V8_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V8_A4021BarFasBot = new String[] {""} ;
      T019V8_A4022BarNumBot = new int[1] ;
      T019V8_A4287BarFasFor = new String[] {""} ;
      T019V8_A4636BarFasPzas = new int[1] ;
      T019V8_n4636BarFasPzas = new boolean[] {false} ;
      T019V8_A4301BarFasCoP = new String[] {""} ;
      T019V8_A4637BarFasCara = new String[] {""} ;
      T019V8_A4905BarFasAcab = new String[] {""} ;
      T019V8_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T019V8_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V8_n3837BarFasKgm = new boolean[] {false} ;
      T019V8_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V8_n3838BarFasMtr = new boolean[] {false} ;
      T019V8_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V8_n5719BarFasKgT = new boolean[] {false} ;
      T019V8_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V8_n5720BarFasMtT = new boolean[] {false} ;
      T019V8_A5369BarFasGral = new String[] {""} ;
      T019V8_n5369BarFasGral = new boolean[] {false} ;
      T019V8_A5896BarMaqPlan = new String[] {""} ;
      T019V8_n5896BarMaqPlan = new boolean[] {false} ;
      T019V8_A6173BarFasSec = new String[] {""} ;
      T019V8_n6173BarFasSec = new boolean[] {false} ;
      T019V8_A5048BarFasUsu = new String[] {""} ;
      T019V8_n5048BarFasUsu = new boolean[] {false} ;
      T019V8_A460FasDsc = new String[] {""} ;
      T019V8_A4642FasDsc2 = new String[] {""} ;
      T019V8_n4642FasDsc2 = new boolean[] {false} ;
      T019V8_A8938BarfasPri2 = new short[1] ;
      T019V8_n8938BarfasPri2 = new boolean[] {false} ;
      T019V8_A8594BarHdrO = new String[] {""} ;
      T019V8_n8594BarHdrO = new boolean[] {false} ;
      T019V8_A9842BarObsF = new String[] {""} ;
      T019V8_n9842BarObsF = new boolean[] {false} ;
      T019V8_A396EmprCod = new String[] {""} ;
      T019V8_A129BarCod = new int[1] ;
      T019V8_A132BarCodReo = new byte[1] ;
      T019V8_A130BarCodPar = new String[] {""} ;
      T019V8_A758ProCod = new String[] {""} ;
      T019V8_A457FasCod = new String[] {""} ;
      T019V8_A603MaqCodBis = new String[] {""} ;
      T019V7_A602MaqCod = new String[] {""} ;
      T019V9_A602MaqCod = new String[] {""} ;
      T019V10_A396EmprCod = new String[] {""} ;
      T019V10_A129BarCod = new int[1] ;
      T019V10_A132BarCodReo = new byte[1] ;
      T019V10_A130BarCodPar = new String[] {""} ;
      T019V10_A758ProCod = new String[] {""} ;
      T019V10_A194BarOrdLin = new short[1] ;
      T019V3_A194BarOrdLin = new short[1] ;
      T019V3_A153BarFasEst = new byte[1] ;
      T019V3_A152BarFasCon = new String[] {""} ;
      T019V3_A150BarFacTin = new String[] {""} ;
      T019V3_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T019V3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T019V3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V3_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V3_A179BarLoc = new String[] {""} ;
      T019V3_A165BarHorIni = new short[1] ;
      T019V3_A164BarHorFin = new short[1] ;
      T019V3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V3_A4021BarFasBot = new String[] {""} ;
      T019V3_A4022BarNumBot = new int[1] ;
      T019V3_A4287BarFasFor = new String[] {""} ;
      T019V3_A4636BarFasPzas = new int[1] ;
      T019V3_n4636BarFasPzas = new boolean[] {false} ;
      T019V3_A4301BarFasCoP = new String[] {""} ;
      T019V3_A4637BarFasCara = new String[] {""} ;
      T019V3_A4905BarFasAcab = new String[] {""} ;
      T019V3_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T019V3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V3_n3837BarFasKgm = new boolean[] {false} ;
      T019V3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V3_n3838BarFasMtr = new boolean[] {false} ;
      T019V3_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V3_n5719BarFasKgT = new boolean[] {false} ;
      T019V3_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V3_n5720BarFasMtT = new boolean[] {false} ;
      T019V3_A5369BarFasGral = new String[] {""} ;
      T019V3_n5369BarFasGral = new boolean[] {false} ;
      T019V3_A5896BarMaqPlan = new String[] {""} ;
      T019V3_n5896BarMaqPlan = new boolean[] {false} ;
      T019V3_A6173BarFasSec = new String[] {""} ;
      T019V3_n6173BarFasSec = new boolean[] {false} ;
      T019V3_A5048BarFasUsu = new String[] {""} ;
      T019V3_n5048BarFasUsu = new boolean[] {false} ;
      T019V3_A8938BarfasPri2 = new short[1] ;
      T019V3_n8938BarfasPri2 = new boolean[] {false} ;
      T019V3_A8594BarHdrO = new String[] {""} ;
      T019V3_n8594BarHdrO = new boolean[] {false} ;
      T019V3_A9842BarObsF = new String[] {""} ;
      T019V3_n9842BarObsF = new boolean[] {false} ;
      T019V3_A396EmprCod = new String[] {""} ;
      T019V3_A129BarCod = new int[1] ;
      T019V3_A132BarCodReo = new byte[1] ;
      T019V3_A130BarCodPar = new String[] {""} ;
      T019V3_A758ProCod = new String[] {""} ;
      T019V3_A457FasCod = new String[] {""} ;
      T019V3_A603MaqCodBis = new String[] {""} ;
      sMode15 = "" ;
      T019V11_A194BarOrdLin = new short[1] ;
      T019V11_A396EmprCod = new String[] {""} ;
      T019V11_A129BarCod = new int[1] ;
      T019V11_A132BarCodReo = new byte[1] ;
      T019V11_A130BarCodPar = new String[] {""} ;
      T019V11_A758ProCod = new String[] {""} ;
      T019V12_A194BarOrdLin = new short[1] ;
      T019V12_A396EmprCod = new String[] {""} ;
      T019V12_A129BarCod = new int[1] ;
      T019V12_A132BarCodReo = new byte[1] ;
      T019V12_A130BarCodPar = new String[] {""} ;
      T019V12_A758ProCod = new String[] {""} ;
      T019V2_A194BarOrdLin = new short[1] ;
      T019V2_A153BarFasEst = new byte[1] ;
      T019V2_A152BarFasCon = new String[] {""} ;
      T019V2_A150BarFacTin = new String[] {""} ;
      T019V2_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T019V2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T019V2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V2_A179BarLoc = new String[] {""} ;
      T019V2_A165BarHorIni = new short[1] ;
      T019V2_A164BarHorFin = new short[1] ;
      T019V2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V2_A4021BarFasBot = new String[] {""} ;
      T019V2_A4022BarNumBot = new int[1] ;
      T019V2_A4287BarFasFor = new String[] {""} ;
      T019V2_A4636BarFasPzas = new int[1] ;
      T019V2_n4636BarFasPzas = new boolean[] {false} ;
      T019V2_A4301BarFasCoP = new String[] {""} ;
      T019V2_A4637BarFasCara = new String[] {""} ;
      T019V2_A4905BarFasAcab = new String[] {""} ;
      T019V2_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T019V2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V2_n3837BarFasKgm = new boolean[] {false} ;
      T019V2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V2_n3838BarFasMtr = new boolean[] {false} ;
      T019V2_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V2_n5719BarFasKgT = new boolean[] {false} ;
      T019V2_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019V2_n5720BarFasMtT = new boolean[] {false} ;
      T019V2_A5369BarFasGral = new String[] {""} ;
      T019V2_n5369BarFasGral = new boolean[] {false} ;
      T019V2_A5896BarMaqPlan = new String[] {""} ;
      T019V2_n5896BarMaqPlan = new boolean[] {false} ;
      T019V2_A6173BarFasSec = new String[] {""} ;
      T019V2_n6173BarFasSec = new boolean[] {false} ;
      T019V2_A5048BarFasUsu = new String[] {""} ;
      T019V2_n5048BarFasUsu = new boolean[] {false} ;
      T019V2_A8938BarfasPri2 = new short[1] ;
      T019V2_n8938BarfasPri2 = new boolean[] {false} ;
      T019V2_A8594BarHdrO = new String[] {""} ;
      T019V2_n8594BarHdrO = new boolean[] {false} ;
      T019V2_A9842BarObsF = new String[] {""} ;
      T019V2_n9842BarObsF = new boolean[] {false} ;
      T019V2_A396EmprCod = new String[] {""} ;
      T019V2_A129BarCod = new int[1] ;
      T019V2_A132BarCodReo = new byte[1] ;
      T019V2_A130BarCodPar = new String[] {""} ;
      T019V2_A758ProCod = new String[] {""} ;
      T019V2_A457FasCod = new String[] {""} ;
      T019V2_A603MaqCodBis = new String[] {""} ;
      T019V16_A396EmprCod = new String[] {""} ;
      T019V16_A129BarCod = new int[1] ;
      T019V16_A132BarCodReo = new byte[1] ;
      T019V16_A130BarCodPar = new String[] {""} ;
      T019V16_A758ProCod = new String[] {""} ;
      T019V16_A194BarOrdLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A602MaqCod = "" ;
      T019V17_A407EmprNom = new String[] {""} ;
      T019V17_n407EmprNom = new boolean[] {false} ;
      T019V18_A396EmprCod = new String[] {""} ;
      Z602MaqCod = "" ;
      ZV62OldMaq = "" ;
      ZV61Inc_obs = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ457FasCod = "" ;
      ZZ152BarFasCon = "" ;
      ZZ603MaqCodBis = "" ;
      ZZ150BarFacTin = "" ;
      ZZ162BarFecTeo = GXutil.nullDate() ;
      ZZ160BarFecRea = GXutil.nullDate() ;
      ZZ216BarTieTeo = DecimalUtil.ZERO ;
      ZZ227BarUni = DecimalUtil.ZERO ;
      ZZ179BarLoc = "" ;
      ZZ215BarTieRea = DecimalUtil.ZERO ;
      ZZ4021BarFasBot = "" ;
      ZZ4287BarFasFor = "" ;
      ZZ4301BarFasCoP = "" ;
      ZZ4637BarFasCara = "" ;
      ZZ4905BarFasAcab = "" ;
      ZZ3298BarFecRIni = GXutil.nullDate() ;
      ZZ3837BarFasKgm = DecimalUtil.ZERO ;
      ZZ3838BarFasMtr = DecimalUtil.ZERO ;
      ZZ5719BarFasKgT = DecimalUtil.ZERO ;
      ZZ5720BarFasMtT = DecimalUtil.ZERO ;
      ZZ5369BarFasGral = "" ;
      ZZ5896BarMaqPlan = "" ;
      ZZ6173BarFasSec = "" ;
      ZZ5048BarFasUsu = "" ;
      ZZ460FasDsc = "" ;
      ZZ4642FasDsc2 = "" ;
      ZZ8594BarHdrO = "" ;
      ZZ9842BarObsF = "" ;
      ZZV62OldMaq = "" ;
      ZZV61Inc_obs = "" ;
      ZO603MaqCodBis = "" ;
      T019V19_A602MaqCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfasesmodif__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfasesmodif__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfasesmodif__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfasesmodif__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasesmodif__default(),
         new Object[] {
             new Object[] {
            T019V2_A194BarOrdLin, T019V2_A153BarFasEst, T019V2_A152BarFasCon, T019V2_A150BarFacTin, T019V2_A162BarFecTeo, T019V2_A160BarFecRea, T019V2_A216BarTieTeo, T019V2_A227BarUni, T019V2_A179BarLoc, T019V2_A165BarHorIni,
            T019V2_A164BarHorFin, T019V2_A215BarTieRea, T019V2_A4021BarFasBot, T019V2_A4022BarNumBot, T019V2_A4287BarFasFor, T019V2_A4636BarFasPzas, T019V2_n4636BarFasPzas, T019V2_A4301BarFasCoP, T019V2_A4637BarFasCara, T019V2_A4905BarFasAcab,
            T019V2_A3298BarFecRIni, T019V2_A3837BarFasKgm, T019V2_n3837BarFasKgm, T019V2_A3838BarFasMtr, T019V2_n3838BarFasMtr, T019V2_A5719BarFasKgT, T019V2_n5719BarFasKgT, T019V2_A5720BarFasMtT, T019V2_n5720BarFasMtT, T019V2_A5369BarFasGral,
            T019V2_n5369BarFasGral, T019V2_A5896BarMaqPlan, T019V2_n5896BarMaqPlan, T019V2_A6173BarFasSec, T019V2_n6173BarFasSec, T019V2_A5048BarFasUsu, T019V2_n5048BarFasUsu, T019V2_A8938BarfasPri2, T019V2_n8938BarfasPri2, T019V2_A8594BarHdrO,
            T019V2_n8594BarHdrO, T019V2_A9842BarObsF, T019V2_n9842BarObsF, T019V2_A396EmprCod, T019V2_A129BarCod, T019V2_A132BarCodReo, T019V2_A130BarCodPar, T019V2_A758ProCod, T019V2_A457FasCod, T019V2_A603MaqCodBis
            }
            , new Object[] {
            T019V3_A194BarOrdLin, T019V3_A153BarFasEst, T019V3_A152BarFasCon, T019V3_A150BarFacTin, T019V3_A162BarFecTeo, T019V3_A160BarFecRea, T019V3_A216BarTieTeo, T019V3_A227BarUni, T019V3_A179BarLoc, T019V3_A165BarHorIni,
            T019V3_A164BarHorFin, T019V3_A215BarTieRea, T019V3_A4021BarFasBot, T019V3_A4022BarNumBot, T019V3_A4287BarFasFor, T019V3_A4636BarFasPzas, T019V3_n4636BarFasPzas, T019V3_A4301BarFasCoP, T019V3_A4637BarFasCara, T019V3_A4905BarFasAcab,
            T019V3_A3298BarFecRIni, T019V3_A3837BarFasKgm, T019V3_n3837BarFasKgm, T019V3_A3838BarFasMtr, T019V3_n3838BarFasMtr, T019V3_A5719BarFasKgT, T019V3_n5719BarFasKgT, T019V3_A5720BarFasMtT, T019V3_n5720BarFasMtT, T019V3_A5369BarFasGral,
            T019V3_n5369BarFasGral, T019V3_A5896BarMaqPlan, T019V3_n5896BarMaqPlan, T019V3_A6173BarFasSec, T019V3_n6173BarFasSec, T019V3_A5048BarFasUsu, T019V3_n5048BarFasUsu, T019V3_A8938BarfasPri2, T019V3_n8938BarfasPri2, T019V3_A8594BarHdrO,
            T019V3_n8594BarHdrO, T019V3_A9842BarObsF, T019V3_n9842BarObsF, T019V3_A396EmprCod, T019V3_A129BarCod, T019V3_A132BarCodReo, T019V3_A130BarCodPar, T019V3_A758ProCod, T019V3_A457FasCod, T019V3_A603MaqCodBis
            }
            , new Object[] {
            T019V4_A407EmprNom, T019V4_n407EmprNom
            }
            , new Object[] {
            T019V5_A396EmprCod
            }
            , new Object[] {
            T019V6_A460FasDsc, T019V6_A4642FasDsc2, T019V6_n4642FasDsc2
            }
            , new Object[] {
            T019V7_A602MaqCod
            }
            , new Object[] {
            T019V8_A194BarOrdLin, T019V8_A407EmprNom, T019V8_n407EmprNom, T019V8_A153BarFasEst, T019V8_A152BarFasCon, T019V8_A150BarFacTin, T019V8_A162BarFecTeo, T019V8_A160BarFecRea, T019V8_A216BarTieTeo, T019V8_A227BarUni,
            T019V8_A179BarLoc, T019V8_A165BarHorIni, T019V8_A164BarHorFin, T019V8_A215BarTieRea, T019V8_A4021BarFasBot, T019V8_A4022BarNumBot, T019V8_A4287BarFasFor, T019V8_A4636BarFasPzas, T019V8_n4636BarFasPzas, T019V8_A4301BarFasCoP,
            T019V8_A4637BarFasCara, T019V8_A4905BarFasAcab, T019V8_A3298BarFecRIni, T019V8_A3837BarFasKgm, T019V8_n3837BarFasKgm, T019V8_A3838BarFasMtr, T019V8_n3838BarFasMtr, T019V8_A5719BarFasKgT, T019V8_n5719BarFasKgT, T019V8_A5720BarFasMtT,
            T019V8_n5720BarFasMtT, T019V8_A5369BarFasGral, T019V8_n5369BarFasGral, T019V8_A5896BarMaqPlan, T019V8_n5896BarMaqPlan, T019V8_A6173BarFasSec, T019V8_n6173BarFasSec, T019V8_A5048BarFasUsu, T019V8_n5048BarFasUsu, T019V8_A460FasDsc,
            T019V8_A4642FasDsc2, T019V8_n4642FasDsc2, T019V8_A8938BarfasPri2, T019V8_n8938BarfasPri2, T019V8_A8594BarHdrO, T019V8_n8594BarHdrO, T019V8_A9842BarObsF, T019V8_n9842BarObsF, T019V8_A396EmprCod, T019V8_A129BarCod,
            T019V8_A132BarCodReo, T019V8_A130BarCodPar, T019V8_A758ProCod, T019V8_A457FasCod, T019V8_A603MaqCodBis
            }
            , new Object[] {
            T019V9_A602MaqCod
            }
            , new Object[] {
            T019V10_A396EmprCod, T019V10_A129BarCod, T019V10_A132BarCodReo, T019V10_A130BarCodPar, T019V10_A758ProCod, T019V10_A194BarOrdLin
            }
            , new Object[] {
            T019V11_A194BarOrdLin, T019V11_A396EmprCod, T019V11_A129BarCod, T019V11_A132BarCodReo, T019V11_A130BarCodPar, T019V11_A758ProCod
            }
            , new Object[] {
            T019V12_A194BarOrdLin, T019V12_A396EmprCod, T019V12_A129BarCod, T019V12_A132BarCodReo, T019V12_A130BarCodPar, T019V12_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019V16_A396EmprCod, T019V16_A129BarCod, T019V16_A132BarCodReo, T019V16_A130BarCodPar, T019V16_A758ProCod, T019V16_A194BarOrdLin
            }
            , new Object[] {
            T019V17_A407EmprNom, T019V17_n407EmprNom
            }
            , new Object[] {
            T019V18_A396EmprCod
            }
            , new Object[] {
            T019V19_A602MaqCod
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
      AV64Pgmname = "TFASESModif" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z153BarFasEst ;
   private byte O153BarFasEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte AV63OldEst ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZV63OldEst ;
   private byte ZZ132BarCodReo ;
   private byte ZZ153BarFasEst ;
   private byte ZZV63OldEst ;
   private byte ZO153BarFasEst ;
   private short wcpOA194BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z165BarHorIni ;
   private short Z164BarHorFin ;
   private short Z8938BarfasPri2 ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A8938BarfasPri2 ;
   private short RcdFound15 ;
   private short nIsDirty_15 ;
   private short ZZ194BarOrdLin ;
   private short ZZ165BarHorIni ;
   private short ZZ164BarHorFin ;
   private short ZZ8938BarfasPri2 ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z4022BarNumBot ;
   private int Z4636BarFasPzas ;
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
   private int edtFasCod_Enabled ;
   private int edtBarFasEst_Enabled ;
   private int edtBarFasCon_Enabled ;
   private int edtMaqCodBis_Enabled ;
   private int edtBarFacTin_Enabled ;
   private int edtBarFecTeo_Enabled ;
   private int edtBarFecRea_Enabled ;
   private int edtBarTieTeo_Enabled ;
   private int edtBarUni_Enabled ;
   private int edtBarLoc_Enabled ;
   private int edtBarHorIni_Enabled ;
   private int edtBarHorFin_Enabled ;
   private int edtBarTieRea_Enabled ;
   private int edtBarFasBot_Enabled ;
   private int A4022BarNumBot ;
   private int edtBarNumBot_Enabled ;
   private int edtBarFasFor_Enabled ;
   private int A4636BarFasPzas ;
   private int edtBarFasPzas_Enabled ;
   private int edtBarFasCoP_Enabled ;
   private int edtBarFasCara_Enabled ;
   private int edtBarFasAcab_Enabled ;
   private int edtBarFecRIni_Enabled ;
   private int edtBarFasKgm_Enabled ;
   private int edtBarFasMtr_Enabled ;
   private int edtBarFasKgT_Enabled ;
   private int edtBarFasMtT_Enabled ;
   private int edtBarFasGral_Enabled ;
   private int edtBarMaqPlan_Enabled ;
   private int edtBarFasSec_Enabled ;
   private int edtBarFasUsu_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasDsc2_Enabled ;
   private int edtBarfasPri2_Enabled ;
   private int edtBarHdrO_Enabled ;
   private int edtBarObsF_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtBarObsF_Backcolor ;
   private int edtBarHdrO_Backcolor ;
   private int edtBarfasPri2_Backcolor ;
   private int edtFasDsc2_Backcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtBarFasUsu_Backcolor ;
   private int edtBarFasSec_Backcolor ;
   private int edtBarMaqPlan_Backcolor ;
   private int edtBarFasGral_Backcolor ;
   private int edtBarFasMtT_Backcolor ;
   private int edtBarFasKgT_Backcolor ;
   private int edtBarFasMtr_Backcolor ;
   private int edtBarFasKgm_Backcolor ;
   private int edtBarFecRIni_Backcolor ;
   private int edtBarFasAcab_Backcolor ;
   private int edtBarFasCara_Backcolor ;
   private int edtBarFasCoP_Backcolor ;
   private int edtBarFasPzas_Backcolor ;
   private int edtBarFasFor_Backcolor ;
   private int edtBarNumBot_Backcolor ;
   private int edtBarFasBot_Backcolor ;
   private int edtBarTieRea_Backcolor ;
   private int edtBarHorFin_Backcolor ;
   private int edtBarHorIni_Backcolor ;
   private int edtBarLoc_Backcolor ;
   private int edtBarUni_Backcolor ;
   private int edtBarTieTeo_Backcolor ;
   private int edtBarFecRea_Backcolor ;
   private int edtBarFecTeo_Backcolor ;
   private int edtBarFacTin_Backcolor ;
   private int edtMaqCodBis_Backcolor ;
   private int edtBarFasCon_Backcolor ;
   private int edtBarFasEst_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4022BarNumBot ;
   private int ZZ4636BarFasPzas ;
   private java.math.BigDecimal Z216BarTieTeo ;
   private java.math.BigDecimal Z227BarUni ;
   private java.math.BigDecimal Z215BarTieRea ;
   private java.math.BigDecimal Z3837BarFasKgm ;
   private java.math.BigDecimal Z3838BarFasMtr ;
   private java.math.BigDecimal Z5719BarFasKgT ;
   private java.math.BigDecimal Z5720BarFasMtT ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal ZZ216BarTieTeo ;
   private java.math.BigDecimal ZZ227BarUni ;
   private java.math.BigDecimal ZZ215BarTieRea ;
   private java.math.BigDecimal ZZ3837BarFasKgm ;
   private java.math.BigDecimal ZZ3838BarFasMtr ;
   private java.math.BigDecimal ZZ5719BarFasKgT ;
   private java.math.BigDecimal ZZ5720BarFasMtT ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z152BarFasCon ;
   private String Z150BarFacTin ;
   private String Z179BarLoc ;
   private String Z4021BarFasBot ;
   private String Z4287BarFasFor ;
   private String Z4301BarFasCoP ;
   private String Z4637BarFasCara ;
   private String Z4905BarFasAcab ;
   private String Z5369BarFasGral ;
   private String Z5896BarMaqPlan ;
   private String Z6173BarFasSec ;
   private String Z5048BarFasUsu ;
   private String Z8594BarHdrO ;
   private String Z457FasCod ;
   private String Z603MaqCodBis ;
   private String O603MaqCodBis ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV64Pgmname ;
   private String AV35UsurCod ;
   private String AV38Station ;
   private String A130BarCodPar ;
   private String A603MaqCodBis ;
   private String AV62OldMaq ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarFasEst_Internalname ;
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
   private String edtFasCod_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarFasEst_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarFasCon_Internalname ;
   private String A152BarFasCon ;
   private String edtBarFasCon_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMaqCodBis_Internalname ;
   private String edtMaqCodBis_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarFacTin_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFacTin_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarFecTeo_Internalname ;
   private String edtBarFecTeo_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarFecRea_Internalname ;
   private String edtBarFecRea_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarTieTeo_Internalname ;
   private String edtBarTieTeo_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarUni_Internalname ;
   private String edtBarUni_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarLoc_Internalname ;
   private String A179BarLoc ;
   private String edtBarLoc_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarHorIni_Internalname ;
   private String edtBarHorIni_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarHorFin_Internalname ;
   private String edtBarHorFin_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBarTieRea_Internalname ;
   private String edtBarTieRea_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBarFasBot_Internalname ;
   private String A4021BarFasBot ;
   private String edtBarFasBot_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBarNumBot_Internalname ;
   private String edtBarNumBot_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtBarFasFor_Internalname ;
   private String A4287BarFasFor ;
   private String edtBarFasFor_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtBarFasPzas_Internalname ;
   private String edtBarFasPzas_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtBarFasCoP_Internalname ;
   private String A4301BarFasCoP ;
   private String edtBarFasCoP_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtBarFasCara_Internalname ;
   private String A4637BarFasCara ;
   private String edtBarFasCara_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtBarFasAcab_Internalname ;
   private String A4905BarFasAcab ;
   private String edtBarFasAcab_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtBarFecRIni_Internalname ;
   private String edtBarFecRIni_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtBarFasKgm_Internalname ;
   private String edtBarFasKgm_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtBarFasMtr_Internalname ;
   private String edtBarFasMtr_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtBarFasKgT_Internalname ;
   private String edtBarFasKgT_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtBarFasMtT_Internalname ;
   private String edtBarFasMtT_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtBarFasGral_Internalname ;
   private String A5369BarFasGral ;
   private String edtBarFasGral_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtBarMaqPlan_Internalname ;
   private String A5896BarMaqPlan ;
   private String edtBarMaqPlan_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtBarFasSec_Internalname ;
   private String A6173BarFasSec ;
   private String edtBarFasSec_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtBarFasUsu_Internalname ;
   private String A5048BarFasUsu ;
   private String edtBarFasUsu_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtFasDsc2_Internalname ;
   private String A4642FasDsc2 ;
   private String edtFasDsc2_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtBarfasPri2_Internalname ;
   private String edtBarfasPri2_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtBarHdrO_Internalname ;
   private String A8594BarHdrO ;
   private String edtBarHdrO_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtBarObsF_Internalname ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV36LitFe ;
   private String AV16Lit0 ;
   private String GXt_char1 ;
   private String AV39emprcod ;
   private String GXv_char2[] ;
   private String AV40emprnom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String Z4642FasDsc2 ;
   private String sMode15 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A602MaqCod ;
   private String Z602MaqCod ;
   private String ZV62OldMaq ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ457FasCod ;
   private String ZZ152BarFasCon ;
   private String ZZ603MaqCodBis ;
   private String ZZ150BarFacTin ;
   private String ZZ179BarLoc ;
   private String ZZ4021BarFasBot ;
   private String ZZ4287BarFasFor ;
   private String ZZ4301BarFasCoP ;
   private String ZZ4637BarFasCara ;
   private String ZZ4905BarFasAcab ;
   private String ZZ5369BarFasGral ;
   private String ZZ5896BarMaqPlan ;
   private String ZZ6173BarFasSec ;
   private String ZZ5048BarFasUsu ;
   private String ZZ460FasDsc ;
   private String ZZ4642FasDsc2 ;
   private String ZZ8594BarHdrO ;
   private String ZZV62OldMaq ;
   private String ZO603MaqCodBis ;
   private java.util.Date Z162BarFecTeo ;
   private java.util.Date Z160BarFecRea ;
   private java.util.Date Z3298BarFecRIni ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date ZZ162BarFecTeo ;
   private java.util.Date ZZ160BarFecRea ;
   private java.util.Date ZZ3298BarFecRIni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n4636BarFasPzas ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean n5369BarFasGral ;
   private boolean n5896BarMaqPlan ;
   private boolean n6173BarFasSec ;
   private boolean n5048BarFasUsu ;
   private boolean n4642FasDsc2 ;
   private boolean n8938BarfasPri2 ;
   private boolean n8594BarHdrO ;
   private boolean n9842BarObsF ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z9842BarObsF ;
   private String AV61Inc_obs ;
   private String A9842BarObsF ;
   private String ZV61Inc_obs ;
   private String ZZ9842BarObsF ;
   private String ZZV61Inc_obs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T019V4_A407EmprNom ;
   private boolean[] T019V4_n407EmprNom ;
   private String[] T019V5_A396EmprCod ;
   private String[] T019V6_A460FasDsc ;
   private String[] T019V6_A4642FasDsc2 ;
   private boolean[] T019V6_n4642FasDsc2 ;
   private short[] T019V8_A194BarOrdLin ;
   private String[] T019V8_A407EmprNom ;
   private boolean[] T019V8_n407EmprNom ;
   private byte[] T019V8_A153BarFasEst ;
   private String[] T019V8_A152BarFasCon ;
   private String[] T019V8_A150BarFacTin ;
   private java.util.Date[] T019V8_A162BarFecTeo ;
   private java.util.Date[] T019V8_A160BarFecRea ;
   private java.math.BigDecimal[] T019V8_A216BarTieTeo ;
   private java.math.BigDecimal[] T019V8_A227BarUni ;
   private String[] T019V8_A179BarLoc ;
   private short[] T019V8_A165BarHorIni ;
   private short[] T019V8_A164BarHorFin ;
   private java.math.BigDecimal[] T019V8_A215BarTieRea ;
   private String[] T019V8_A4021BarFasBot ;
   private int[] T019V8_A4022BarNumBot ;
   private String[] T019V8_A4287BarFasFor ;
   private int[] T019V8_A4636BarFasPzas ;
   private boolean[] T019V8_n4636BarFasPzas ;
   private String[] T019V8_A4301BarFasCoP ;
   private String[] T019V8_A4637BarFasCara ;
   private String[] T019V8_A4905BarFasAcab ;
   private java.util.Date[] T019V8_A3298BarFecRIni ;
   private java.math.BigDecimal[] T019V8_A3837BarFasKgm ;
   private boolean[] T019V8_n3837BarFasKgm ;
   private java.math.BigDecimal[] T019V8_A3838BarFasMtr ;
   private boolean[] T019V8_n3838BarFasMtr ;
   private java.math.BigDecimal[] T019V8_A5719BarFasKgT ;
   private boolean[] T019V8_n5719BarFasKgT ;
   private java.math.BigDecimal[] T019V8_A5720BarFasMtT ;
   private boolean[] T019V8_n5720BarFasMtT ;
   private String[] T019V8_A5369BarFasGral ;
   private boolean[] T019V8_n5369BarFasGral ;
   private String[] T019V8_A5896BarMaqPlan ;
   private boolean[] T019V8_n5896BarMaqPlan ;
   private String[] T019V8_A6173BarFasSec ;
   private boolean[] T019V8_n6173BarFasSec ;
   private String[] T019V8_A5048BarFasUsu ;
   private boolean[] T019V8_n5048BarFasUsu ;
   private String[] T019V8_A460FasDsc ;
   private String[] T019V8_A4642FasDsc2 ;
   private boolean[] T019V8_n4642FasDsc2 ;
   private short[] T019V8_A8938BarfasPri2 ;
   private boolean[] T019V8_n8938BarfasPri2 ;
   private String[] T019V8_A8594BarHdrO ;
   private boolean[] T019V8_n8594BarHdrO ;
   private String[] T019V8_A9842BarObsF ;
   private boolean[] T019V8_n9842BarObsF ;
   private String[] T019V8_A396EmprCod ;
   private int[] T019V8_A129BarCod ;
   private byte[] T019V8_A132BarCodReo ;
   private String[] T019V8_A130BarCodPar ;
   private String[] T019V8_A758ProCod ;
   private String[] T019V8_A457FasCod ;
   private String[] T019V8_A603MaqCodBis ;
   private String[] T019V7_A602MaqCod ;
   private String[] T019V9_A602MaqCod ;
   private String[] T019V10_A396EmprCod ;
   private int[] T019V10_A129BarCod ;
   private byte[] T019V10_A132BarCodReo ;
   private String[] T019V10_A130BarCodPar ;
   private String[] T019V10_A758ProCod ;
   private short[] T019V10_A194BarOrdLin ;
   private short[] T019V3_A194BarOrdLin ;
   private byte[] T019V3_A153BarFasEst ;
   private String[] T019V3_A152BarFasCon ;
   private String[] T019V3_A150BarFacTin ;
   private java.util.Date[] T019V3_A162BarFecTeo ;
   private java.util.Date[] T019V3_A160BarFecRea ;
   private java.math.BigDecimal[] T019V3_A216BarTieTeo ;
   private java.math.BigDecimal[] T019V3_A227BarUni ;
   private String[] T019V3_A179BarLoc ;
   private short[] T019V3_A165BarHorIni ;
   private short[] T019V3_A164BarHorFin ;
   private java.math.BigDecimal[] T019V3_A215BarTieRea ;
   private String[] T019V3_A4021BarFasBot ;
   private int[] T019V3_A4022BarNumBot ;
   private String[] T019V3_A4287BarFasFor ;
   private int[] T019V3_A4636BarFasPzas ;
   private boolean[] T019V3_n4636BarFasPzas ;
   private String[] T019V3_A4301BarFasCoP ;
   private String[] T019V3_A4637BarFasCara ;
   private String[] T019V3_A4905BarFasAcab ;
   private java.util.Date[] T019V3_A3298BarFecRIni ;
   private java.math.BigDecimal[] T019V3_A3837BarFasKgm ;
   private boolean[] T019V3_n3837BarFasKgm ;
   private java.math.BigDecimal[] T019V3_A3838BarFasMtr ;
   private boolean[] T019V3_n3838BarFasMtr ;
   private java.math.BigDecimal[] T019V3_A5719BarFasKgT ;
   private boolean[] T019V3_n5719BarFasKgT ;
   private java.math.BigDecimal[] T019V3_A5720BarFasMtT ;
   private boolean[] T019V3_n5720BarFasMtT ;
   private String[] T019V3_A5369BarFasGral ;
   private boolean[] T019V3_n5369BarFasGral ;
   private String[] T019V3_A5896BarMaqPlan ;
   private boolean[] T019V3_n5896BarMaqPlan ;
   private String[] T019V3_A6173BarFasSec ;
   private boolean[] T019V3_n6173BarFasSec ;
   private String[] T019V3_A5048BarFasUsu ;
   private boolean[] T019V3_n5048BarFasUsu ;
   private short[] T019V3_A8938BarfasPri2 ;
   private boolean[] T019V3_n8938BarfasPri2 ;
   private String[] T019V3_A8594BarHdrO ;
   private boolean[] T019V3_n8594BarHdrO ;
   private String[] T019V3_A9842BarObsF ;
   private boolean[] T019V3_n9842BarObsF ;
   private String[] T019V3_A396EmprCod ;
   private int[] T019V3_A129BarCod ;
   private byte[] T019V3_A132BarCodReo ;
   private String[] T019V3_A130BarCodPar ;
   private String[] T019V3_A758ProCod ;
   private String[] T019V3_A457FasCod ;
   private String[] T019V3_A603MaqCodBis ;
   private short[] T019V11_A194BarOrdLin ;
   private String[] T019V11_A396EmprCod ;
   private int[] T019V11_A129BarCod ;
   private byte[] T019V11_A132BarCodReo ;
   private String[] T019V11_A130BarCodPar ;
   private String[] T019V11_A758ProCod ;
   private short[] T019V12_A194BarOrdLin ;
   private String[] T019V12_A396EmprCod ;
   private int[] T019V12_A129BarCod ;
   private byte[] T019V12_A132BarCodReo ;
   private String[] T019V12_A130BarCodPar ;
   private String[] T019V12_A758ProCod ;
   private short[] T019V2_A194BarOrdLin ;
   private byte[] T019V2_A153BarFasEst ;
   private String[] T019V2_A152BarFasCon ;
   private String[] T019V2_A150BarFacTin ;
   private java.util.Date[] T019V2_A162BarFecTeo ;
   private java.util.Date[] T019V2_A160BarFecRea ;
   private java.math.BigDecimal[] T019V2_A216BarTieTeo ;
   private java.math.BigDecimal[] T019V2_A227BarUni ;
   private String[] T019V2_A179BarLoc ;
   private short[] T019V2_A165BarHorIni ;
   private short[] T019V2_A164BarHorFin ;
   private java.math.BigDecimal[] T019V2_A215BarTieRea ;
   private String[] T019V2_A4021BarFasBot ;
   private int[] T019V2_A4022BarNumBot ;
   private String[] T019V2_A4287BarFasFor ;
   private int[] T019V2_A4636BarFasPzas ;
   private boolean[] T019V2_n4636BarFasPzas ;
   private String[] T019V2_A4301BarFasCoP ;
   private String[] T019V2_A4637BarFasCara ;
   private String[] T019V2_A4905BarFasAcab ;
   private java.util.Date[] T019V2_A3298BarFecRIni ;
   private java.math.BigDecimal[] T019V2_A3837BarFasKgm ;
   private boolean[] T019V2_n3837BarFasKgm ;
   private java.math.BigDecimal[] T019V2_A3838BarFasMtr ;
   private boolean[] T019V2_n3838BarFasMtr ;
   private java.math.BigDecimal[] T019V2_A5719BarFasKgT ;
   private boolean[] T019V2_n5719BarFasKgT ;
   private java.math.BigDecimal[] T019V2_A5720BarFasMtT ;
   private boolean[] T019V2_n5720BarFasMtT ;
   private String[] T019V2_A5369BarFasGral ;
   private boolean[] T019V2_n5369BarFasGral ;
   private String[] T019V2_A5896BarMaqPlan ;
   private boolean[] T019V2_n5896BarMaqPlan ;
   private String[] T019V2_A6173BarFasSec ;
   private boolean[] T019V2_n6173BarFasSec ;
   private String[] T019V2_A5048BarFasUsu ;
   private boolean[] T019V2_n5048BarFasUsu ;
   private short[] T019V2_A8938BarfasPri2 ;
   private boolean[] T019V2_n8938BarfasPri2 ;
   private String[] T019V2_A8594BarHdrO ;
   private boolean[] T019V2_n8594BarHdrO ;
   private String[] T019V2_A9842BarObsF ;
   private boolean[] T019V2_n9842BarObsF ;
   private String[] T019V2_A396EmprCod ;
   private int[] T019V2_A129BarCod ;
   private byte[] T019V2_A132BarCodReo ;
   private String[] T019V2_A130BarCodPar ;
   private String[] T019V2_A758ProCod ;
   private String[] T019V2_A457FasCod ;
   private String[] T019V2_A603MaqCodBis ;
   private String[] T019V16_A396EmprCod ;
   private int[] T019V16_A129BarCod ;
   private byte[] T019V16_A132BarCodReo ;
   private String[] T019V16_A130BarCodPar ;
   private String[] T019V16_A758ProCod ;
   private short[] T019V16_A194BarOrdLin ;
   private String[] T019V17_A407EmprNom ;
   private boolean[] T019V17_n407EmprNom ;
   private String[] T019V18_A396EmprCod ;
   private String[] T019V19_A602MaqCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfasesmodif__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasesmodif__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasesmodif__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasesmodif__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasesmodif__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T019V2", "SELECT BarOrdLin, BarFasEst, BarFasCon, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFasBot, BarNumBot, BarFasFor, BarFasPzas, BarFasCoP, BarFasCara, BarFasAcab, BarFecRIni, BarFasKgm, BarFasMtr, BarFasKgT, BarFasMtT, BarFasGral, BarMaqPlan, BarFasSec, BarFasUsu, BarfasPri2, BarHdrO, BarObsF, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF BarFasEst, BarFasCon, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFasBot, BarNumBot, BarFasFor, BarFasPzas, BarFasCoP, BarFasCara, BarFasAcab, BarFecRIni, BarFasKgm, BarFasMtr, BarFasKgT, BarFasMtT, BarFasGral, BarMaqPlan, BarFasSec, BarFasUsu, BarfasPri2, BarHdrO, BarObsF, FasCod, MaqCodBis NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V3", "SELECT BarOrdLin, BarFasEst, BarFasCon, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFasBot, BarNumBot, BarFasFor, BarFasPzas, BarFasCoP, BarFasCara, BarFasAcab, BarFecRIni, BarFasKgm, BarFasMtr, BarFasKgT, BarFasMtT, BarFasGral, BarMaqPlan, BarFasSec, BarFasUsu, BarfasPri2, BarHdrO, BarObsF, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V5", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V6", "SELECT FasDsc, FasDsc2 FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V7", "SELECT MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V8", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarOrdLin, T2.EmprNom, TM1.BarFasEst, TM1.BarFasCon, TM1.BarFacTin, TM1.BarFecTeo, TM1.BarFecRea, TM1.BarTieTeo, TM1.BarUni, TM1.BarLoc, TM1.BarHorIni, TM1.BarHorFin, TM1.BarTieRea, TM1.BarFasBot, TM1.BarNumBot, TM1.BarFasFor, TM1.BarFasPzas, TM1.BarFasCoP, TM1.BarFasCara, TM1.BarFasAcab, TM1.BarFecRIni, TM1.BarFasKgm, TM1.BarFasMtr, TM1.BarFasKgT, TM1.BarFasMtT, TM1.BarFasGral, TM1.BarMaqPlan, TM1.BarFasSec, TM1.BarFasUsu, T3.FasDsc, T3.FasDsc2, TM1.BarfasPri2, TM1.BarHdrO, TM1.BarObsF, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.FasCod, TM1.MaqCodBis FROM ((TXPBARFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V9", "SELECT MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarOrdLin = ? and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarOrdLin = ? and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T019V13", "INSERT INTO TXPBARFAS(BarOrdLin, BarFasEst, BarFasCon, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFasBot, BarNumBot, BarFasFor, BarFasPzas, BarFasCoP, BarFasCara, BarFasAcab, BarFecRIni, BarFasKgm, BarFasMtr, BarFasKgT, BarFasMtT, BarFasGral, BarMaqPlan, BarFasSec, BarFasUsu, BarfasPri2, BarHdrO, BarObsF, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis, BarNPzas, BarUltNlot, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, FasQuiUl, BarFasCR, BarFasTip, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T019V14", "UPDATE TXPBARFAS SET BarFasEst=?, BarFasCon=?, BarFacTin=?, BarFecTeo=?, BarFecRea=?, BarTieTeo=?, BarUni=?, BarLoc=?, BarHorIni=?, BarHorFin=?, BarTieRea=?, BarFasBot=?, BarNumBot=?, BarFasFor=?, BarFasPzas=?, BarFasCoP=?, BarFasCara=?, BarFasAcab=?, BarFecRIni=?, BarFasKgm=?, BarFasMtr=?, BarFasKgT=?, BarFasMtT=?, BarFasGral=?, BarMaqPlan=?, BarFasSec=?, BarFasUsu=?, BarfasPri2=?, BarHdrO=?, BarObsF=?, FasCod=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T019V15", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T019V16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE BarOrdLin = ? and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V18", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019V19", "SELECT MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(20);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(27, 2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(28, 8);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(29);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(30, 11);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(32, 3);
               ((int[]) buf[44])[0] = rslt.getInt(33);
               ((byte[]) buf[45])[0] = rslt.getByte(34);
               ((String[]) buf[46])[0] = rslt.getString(35, 1);
               ((String[]) buf[47])[0] = rslt.getString(36, 8);
               ((String[]) buf[48])[0] = rslt.getString(37, 8);
               ((String[]) buf[49])[0] = rslt.getString(38, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(20);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(27, 2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(28, 8);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(29);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(30, 11);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(32, 3);
               ((int[]) buf[44])[0] = rslt.getInt(33);
               ((byte[]) buf[45])[0] = rslt.getByte(34);
               ((String[]) buf[46])[0] = rslt.getString(35, 1);
               ((String[]) buf[47])[0] = rslt.getString(36, 8);
               ((String[]) buf[48])[0] = rslt.getString(37, 8);
               ((String[]) buf[49])[0] = rslt.getString(38, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(21);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(27, 6);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(28, 2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(29, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(30, 28);
               ((String[]) buf[40])[0] = rslt.getString(31, 60);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(32);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(33, 11);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(35, 3);
               ((int[]) buf[49])[0] = rslt.getInt(36);
               ((byte[]) buf[50])[0] = rslt.getByte(37);
               ((String[]) buf[51])[0] = rslt.getString(38, 1);
               ((String[]) buf[52])[0] = rslt.getString(39, 8);
               ((String[]) buf[53])[0] = rslt.getString(40, 8);
               ((String[]) buf[54])[0] = rslt.getString(41, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 1);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[16]).intValue());
               }
               stmt.setString(17, (String)parms[17], 1);
               stmt.setString(18, (String)parms[18], 1);
               stmt.setString(19, (String)parms[19], 1);
               stmt.setDate(20, (java.util.Date)parms[20]);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[32], 6);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[36], 8);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[40], 11);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[42], 3000);
               }
               stmt.setString(32, (String)parms[43], 3);
               stmt.setInt(33, ((Number) parms[44]).intValue());
               stmt.setByte(34, ((Number) parms[45]).byteValue());
               stmt.setString(35, (String)parms[46], 1);
               stmt.setString(36, (String)parms[47], 8);
               stmt.setString(37, (String)parms[48], 8);
               stmt.setString(38, (String)parms[49], 6);
               return;
            case 12 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 1);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[15]).intValue());
               }
               stmt.setString(16, (String)parms[16], 1);
               stmt.setString(17, (String)parms[17], 1);
               stmt.setString(18, (String)parms[18], 1);
               stmt.setDate(19, (java.util.Date)parms[19]);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[31], 6);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[35], 8);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[39], 11);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[41], 3000);
               }
               stmt.setString(31, (String)parms[42], 8);
               stmt.setString(32, (String)parms[43], 6);
               stmt.setString(33, (String)parms[44], 3);
               stmt.setInt(34, ((Number) parms[45]).intValue());
               stmt.setByte(35, ((Number) parms[46]).byteValue());
               stmt.setString(36, (String)parms[47], 1);
               stmt.setString(37, (String)parms[48], 8);
               stmt.setShort(38, ((Number) parms[49]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

