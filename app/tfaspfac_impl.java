package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfaspfac_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action3") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_3_16Y1368( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10084BarPFcod = (short)(GXutil.lval( httpContext.GetPar( "BarPFcod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A10084BarPFcod) ;
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4643BarFasLot = (int)(GXutil.lval( httpContext.GetPar( "BarFasLot"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS POR ANCHO", ""), (short)(0)) ;
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

   public tfaspfac_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfaspfac_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfaspfac_impl.class ));
   }

   public tfaspfac_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFASPFAC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero de Lote", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasLot_Internalname, GXutil.ltrim( localUtil.ntoc( A4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFasLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4643BarFasLot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4643BarFasLot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasLot_Jsonclick, 0, "", "", "", "", "", 1, edtBarFasLot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1368 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1368 = (short)(1) ;
            scanStart16Y1368( ) ;
            while ( RcdFound1368 != 0 )
            {
               init_level_properties1368( ) ;
               getByPrimaryKey16Y1368( ) ;
               addRow16Y1368( ) ;
               scanNext16Y1368( ) ;
            }
            scanEnd16Y1368( ) ;
            nBlankRcdCount1368 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal16Y1368( ) ;
         standaloneModal16Y1368( ) ;
         sMode1368 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow16Y1368( ) ;
            edtavnRcdDeleted_1368_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1368_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1368_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1368_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarPFcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPFcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFcod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarPFdsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPFdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFdsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarPFVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFVAL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFVal_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarPFob1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFOB1_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPFob1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFob1_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarPFTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFTXT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPFTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtBarPFVin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFVIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPFVin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFVin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtItm_ord3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD3_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtItm_ord3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord3_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1368 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16Y1368( ) ;
            }
            sendRow16Y1368( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1368 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1368 = (short)(5) ;
         nRcdExists_1368 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16Y1368( ) ;
            while ( RcdFound1368 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601368( ) ;
               init_level_properties1368( ) ;
               standaloneNotModal16Y1368( ) ;
               getByPrimaryKey16Y1368( ) ;
               standaloneModal16Y1368( ) ;
               addRow16Y1368( ) ;
               scanNext16Y1368( ) ;
            }
            scanEnd16Y1368( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1368 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601368( ) ;
      initAll16Y1368( ) ;
      init_level_properties1368( ) ;
      nRcdExists_1368 = (short)(0) ;
      nIsMod_1368 = (short)(0) ;
      nRcdDeleted_1368 = (short)(0) ;
      nBlankRcdCount1368 = (short)(nBlankRcdUsr1368+nBlankRcdCount1368) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1368 > 0 )
      {
         standaloneNotModal16Y1368( ) ;
         standaloneModal16Y1368( ) ;
         addRow16Y1368( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarPFcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1368 = (short)(nBlankRcdCount1368-1) ;
      }
      Gx_mode = sMode1368 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFASPFAC.htm");
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
      e1116Y2 ();
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
            Z4643BarFasLot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4643BarFasLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV32OldVal = httpContext.cgiGet( "vOLDVAL") ;
            AV33Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
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
            A4643BarFasLot = (int)(localUtil.ctol( httpContext.cgiGet( edtBarFasLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               A4643BarFasLot = (int)(GXutil.lval( httpContext.GetPar( "BarFasLot"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4643BarFasLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4643BarFasLot), 6, 0));
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
                        e1116Y2 ();
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
            initAll16Y688( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1368_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1368_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes16Y688( ) ;
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

   public void confirm_16Y0( )
   {
      beforeValidate16Y688( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16Y688( ) ;
         }
         else
         {
            checkExtendedTable16Y688( ) ;
            if ( AnyError == 0 )
            {
               zm16Y688( 5) ;
               zm16Y688( 6) ;
            }
            closeExtendedTableCursors16Y688( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode688 = Gx_mode ;
         confirm_16Y1368( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode688 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues16Y0( ) ;
      }
   }

   public void confirm_16Y1368( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow16Y1368( ) ;
         if ( ( nRcdExists_1368 != 0 ) || ( nIsMod_1368 != 0 ) )
         {
            getKey16Y1368( ) ;
            if ( ( nRcdExists_1368 == 0 ) && ( nRcdDeleted_1368 == 0 ) )
            {
               if ( RcdFound1368 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16Y1368( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16Y1368( ) ;
                     if ( AnyError == 0 )
                     {
                        zm16Y1368( 8) ;
                     }
                     closeExtendedTableCursors16Y1368( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARPFCOD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarPFcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1368 != 0 )
               {
                  if ( nRcdDeleted_1368 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16Y1368( ) ;
                     load16Y1368( ) ;
                     beforeValidate16Y1368( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16Y1368( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1368 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16Y1368( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16Y1368( ) ;
                           if ( AnyError == 0 )
                           {
                              zm16Y1368( 8) ;
                           }
                           closeExtendedTableCursors16Y1368( ) ;
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
                  if ( nRcdDeleted_1368 == 0 )
                  {
                     GXCCtl = "BARPFCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarPFcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1368_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPFcod_Internalname, GXutil.ltrim( localUtil.ntoc( A10084BarPFcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPFdsc_Internalname, GXutil.rtrim( A10085BarPFdsc)) ;
         httpContext.changePostValue( edtBarPFVal_Internalname, GXutil.rtrim( A10086BarPFVal)) ;
         httpContext.changePostValue( edtBarPFob1_Internalname, GXutil.rtrim( A10087BarPFob1)) ;
         httpContext.changePostValue( edtBarPFTxt_Internalname, A10088BarPFTxt) ;
         httpContext.changePostValue( edtBarPFVin_Internalname, GXutil.rtrim( A10089BarPFVin)) ;
         httpContext.changePostValue( edtItm_ord3_Internalname, GXutil.ltrim( localUtil.ntoc( A10258Itm_ord3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10084BarPFcod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10084BarPFcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10086BarPFVal_"+sGXsfl_60_idx, GXutil.rtrim( Z10086BarPFVal)) ;
         httpContext.changePostValue( "ZT_"+"Z10087BarPFob1_"+sGXsfl_60_idx, GXutil.rtrim( Z10087BarPFob1)) ;
         httpContext.changePostValue( "ZT_"+"Z10088BarPFTxt_"+sGXsfl_60_idx, Z10088BarPFTxt) ;
         httpContext.changePostValue( "ZT_"+"Z10089BarPFVin_"+sGXsfl_60_idx, GXutil.rtrim( Z10089BarPFVin)) ;
         httpContext.changePostValue( "ZT_"+"Z10258Itm_ord3_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10258Itm_ord3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10086BarPFVal_"+sGXsfl_60_idx, GXutil.rtrim( O10086BarPFVal)) ;
         httpContext.changePostValue( "nRcdDeleted_1368_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1368_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1368_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1368 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1368_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1368_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFdsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFOB1_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFob1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFVIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFVin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD3_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16Y0( )
   {
   }

   public void e1116Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tfaspfac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tfaspfac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tfaspfac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Ancho", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfaspfac_impl.this.A396EmprCod = GXv_char2[0] ;
      tfaspfac_impl.this.AV11EmprNom = GXv_char3[0] ;
      tfaspfac_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm16Y688( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -4 )
      {
         Z4643BarFasLot = A4643BarFasLot ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TFASPFAC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T016Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016Y7_A407EmprNom[0] ;
      n407EmprNom = T016Y7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T016Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
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

   public void load16Y688( )
   {
      /* Using cursor T016Y9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound688 = (short)(1) ;
         A407EmprNom = T016Y9_A407EmprNom[0] ;
         n407EmprNom = T016Y9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm16Y688( -4) ;
      }
      pr_default.close(7);
      onLoadActions16Y688( ) ;
   }

   public void onLoadActions16Y688( )
   {
   }

   public void checkExtendedTable16Y688( )
   {
      nIsDirty_688 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors16Y688( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey16Y688( )
   {
      /* Using cursor T016Y10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound688 = (short)(1) ;
      }
      else
      {
         RcdFound688 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016Y6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(4) != 101) && ( T016Y6_A4643BarFasLot[0] == A4643BarFasLot ) && ( GXutil.strcmp(T016Y6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016Y6_A129BarCod[0] == A129BarCod ) && ( T016Y6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016Y6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T016Y6_A758ProCod[0], A758ProCod) == 0 ) && ( T016Y6_A194BarOrdLin[0] == A194BarOrdLin ) )
      {
         zm16Y688( 4) ;
         RcdFound688 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4643BarFasLot = A4643BarFasLot ;
         sMode688 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16Y688( ) ;
         if ( AnyError == 1 )
         {
            RcdFound688 = (short)(0) ;
            initializeNonKey16Y688( ) ;
         }
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound688 = (short)(0) ;
         initializeNonKey16Y688( ) ;
         sMode688 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16Y688( ) ;
      if ( RcdFound688 == 0 )
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
      RcdFound688 = (short)(0) ;
      /* Using cursor T016Y11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T016Y11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016Y11_A129BarCod[0] == A129BarCod ) && ( T016Y11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016Y11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T016Y11_A758ProCod[0], A758ProCod) == 0 ) && ( T016Y11_A194BarOrdLin[0] == A194BarOrdLin ) && ( T016Y11_A4643BarFasLot[0] == A4643BarFasLot ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T016Y11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016Y11_A129BarCod[0] == A129BarCod ) && ( T016Y11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016Y11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T016Y11_A758ProCod[0], A758ProCod) == 0 ) && ( T016Y11_A194BarOrdLin[0] == A194BarOrdLin ) && ( T016Y11_A4643BarFasLot[0] == A4643BarFasLot ) )
         {
            RcdFound688 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound688 = (short)(0) ;
      /* Using cursor T016Y12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016Y12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016Y12_A129BarCod[0] == A129BarCod ) && ( T016Y12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016Y12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T016Y12_A758ProCod[0], A758ProCod) == 0 ) && ( T016Y12_A194BarOrdLin[0] == A194BarOrdLin ) && ( T016Y12_A4643BarFasLot[0] == A4643BarFasLot ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016Y12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016Y12_A129BarCod[0] == A129BarCod ) && ( T016Y12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016Y12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T016Y12_A758ProCod[0], A758ProCod) == 0 ) && ( T016Y12_A194BarOrdLin[0] == A194BarOrdLin ) && ( T016Y12_A4643BarFasLot[0] == A4643BarFasLot ) )
         {
            RcdFound688 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16Y688( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert16Y688( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound688 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
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
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update16Y688( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert16Y688( ) ;
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
                  insert16Y688( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
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
      getKey16Y688( ) ;
      if ( RcdFound688 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4643BarFasLot != Z4643BarFasLot ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfaspfac");
   }

   public void insert_check( )
   {
      confirm_16Y0( ) ;
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
      if ( RcdFound688 == 0 )
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
      scanStart16Y688( ) ;
      if ( RcdFound688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16Y688( ) ;
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
      if ( RcdFound688 == 0 )
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
      if ( RcdFound688 == 0 )
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
      scanStart16Y688( ) ;
      if ( RcdFound688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound688 != 0 )
         {
            scanNext16Y688( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16Y688( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16Y688( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016Y5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASMAQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASMAQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16Y688( )
   {
      beforeValidate16Y688( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16Y688( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16Y688( 0) ;
         checkOptimisticConcurrency16Y688( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16Y688( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16Y688( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016Y13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A4643BarFasLot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
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
                        processLevel16Y688( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16Y0( ) ;
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
            load16Y688( ) ;
         }
         endLevel16Y688( ) ;
      }
      closeExtendedTableCursors16Y688( ) ;
   }

   public void update16Y688( )
   {
      beforeValidate16Y688( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16Y688( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16Y688( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16Y688( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16Y688( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPFASMAQ */
                  deferredUpdate16Y688( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16Y688( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16Y0( ) ;
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
         endLevel16Y688( ) ;
      }
      closeExtendedTableCursors16Y688( ) ;
   }

   public void deferredUpdate16Y688( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16Y688( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16Y688( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16Y688( ) ;
         afterConfirm16Y688( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16Y688( ) ;
            if ( AnyError == 0 )
            {
               scanStart16Y1368( ) ;
               while ( RcdFound1368 != 0 )
               {
                  getByPrimaryKey16Y1368( ) ;
                  delete16Y1368( ) ;
                  scanNext16Y1368( ) ;
               }
               scanEnd16Y1368( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016Y14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound688 == 0 )
                        {
                           initAll16Y688( ) ;
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
                        resetCaption16Y0( ) ;
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
      sMode688 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16Y688( ) ;
      Gx_mode = sMode688 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16Y688( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T016Y15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ContPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T016Y16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGHDFP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel16Y1368( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow16Y1368( ) ;
         if ( ( nRcdExists_1368 != 0 ) || ( nIsMod_1368 != 0 ) )
         {
            standaloneNotModal16Y1368( ) ;
            getKey16Y1368( ) ;
            if ( ( nRcdExists_1368 == 0 ) && ( nRcdDeleted_1368 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16Y1368( ) ;
            }
            else
            {
               if ( RcdFound1368 != 0 )
               {
                  if ( ( nRcdDeleted_1368 != 0 ) && ( nRcdExists_1368 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16Y1368( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1368 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16Y1368( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1368 == 0 )
                  {
                     GXCCtl = "BARPFCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarPFcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1368_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPFcod_Internalname, GXutil.ltrim( localUtil.ntoc( A10084BarPFcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPFdsc_Internalname, GXutil.rtrim( A10085BarPFdsc)) ;
         httpContext.changePostValue( edtBarPFVal_Internalname, GXutil.rtrim( A10086BarPFVal)) ;
         httpContext.changePostValue( edtBarPFob1_Internalname, GXutil.rtrim( A10087BarPFob1)) ;
         httpContext.changePostValue( edtBarPFTxt_Internalname, A10088BarPFTxt) ;
         httpContext.changePostValue( edtBarPFVin_Internalname, GXutil.rtrim( A10089BarPFVin)) ;
         httpContext.changePostValue( edtItm_ord3_Internalname, GXutil.ltrim( localUtil.ntoc( A10258Itm_ord3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10084BarPFcod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10084BarPFcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10086BarPFVal_"+sGXsfl_60_idx, GXutil.rtrim( Z10086BarPFVal)) ;
         httpContext.changePostValue( "ZT_"+"Z10087BarPFob1_"+sGXsfl_60_idx, GXutil.rtrim( Z10087BarPFob1)) ;
         httpContext.changePostValue( "ZT_"+"Z10088BarPFTxt_"+sGXsfl_60_idx, Z10088BarPFTxt) ;
         httpContext.changePostValue( "ZT_"+"Z10089BarPFVin_"+sGXsfl_60_idx, GXutil.rtrim( Z10089BarPFVin)) ;
         httpContext.changePostValue( "ZT_"+"Z10258Itm_ord3_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z10258Itm_ord3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10086BarPFVal_"+sGXsfl_60_idx, GXutil.rtrim( O10086BarPFVal)) ;
         httpContext.changePostValue( "nRcdDeleted_1368_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1368_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1368_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1368 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1368_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1368_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFdsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFOB1_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFob1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPFVIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFVin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD3_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16Y1368( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1368 = (short)(0) ;
      nIsMod_1368 = (short)(0) ;
      nRcdDeleted_1368 = (short)(0) ;
   }

   public void processLevel16Y688( )
   {
      /* Save parent mode. */
      sMode688 = Gx_mode ;
      processNestedLevel16Y1368( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode688 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16Y688( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16Y688( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfaspfac");
         if ( AnyError == 0 )
         {
            confirmValues16Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfaspfac");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16Y688( )
   {
      /* Scan By routine */
      /* Using cursor T016Y17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      RcdFound688 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound688 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16Y688( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound688 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound688 = (short)(1) ;
      }
   }

   public void scanEnd16Y688( )
   {
      pr_default.close(15);
   }

   public void afterConfirm16Y688( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16Y688( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16Y688( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16Y688( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16Y688( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16Y688( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16Y688( )
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
      edtBarFasLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasLot_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm16Y1368( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10086BarPFVal = T016Y3_A10086BarPFVal[0] ;
            Z10087BarPFob1 = T016Y3_A10087BarPFob1[0] ;
            Z10088BarPFTxt = T016Y3_A10088BarPFTxt[0] ;
            Z10089BarPFVin = T016Y3_A10089BarPFVin[0] ;
            Z10258Itm_ord3 = T016Y3_A10258Itm_ord3[0] ;
         }
         else
         {
            Z10086BarPFVal = A10086BarPFVal ;
            Z10087BarPFob1 = A10087BarPFob1 ;
            Z10088BarPFTxt = A10088BarPFTxt ;
            Z10089BarPFVin = A10089BarPFVin ;
            Z10258Itm_ord3 = A10258Itm_ord3 ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4643BarFasLot = A4643BarFasLot ;
         Z10086BarPFVal = A10086BarPFVal ;
         Z10087BarPFob1 = A10087BarPFob1 ;
         Z10088BarPFTxt = A10088BarPFTxt ;
         Z10089BarPFVin = A10089BarPFVin ;
         Z10258Itm_ord3 = A10258Itm_ord3 ;
         Z396EmprCod = A396EmprCod ;
         Z10084BarPFcod = A10084BarPFcod ;
         Z758ProCod = A758ProCod ;
         Z10085BarPFdsc = A10085BarPFdsc ;
      }
   }

   public void standaloneNotModal16Y1368( )
   {
   }

   public void standaloneModal16Y1368( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarPFcod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPFcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFcod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtBarPFcod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPFcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFcod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load16Y1368( )
   {
      /* Using cursor T016Y18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Short.valueOf(A10084BarPFcod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1368 = (short)(1) ;
         A10085BarPFdsc = T016Y18_A10085BarPFdsc[0] ;
         n10085BarPFdsc = T016Y18_n10085BarPFdsc[0] ;
         A10086BarPFVal = T016Y18_A10086BarPFVal[0] ;
         n10086BarPFVal = T016Y18_n10086BarPFVal[0] ;
         A10087BarPFob1 = T016Y18_A10087BarPFob1[0] ;
         n10087BarPFob1 = T016Y18_n10087BarPFob1[0] ;
         A10088BarPFTxt = T016Y18_A10088BarPFTxt[0] ;
         n10088BarPFTxt = T016Y18_n10088BarPFTxt[0] ;
         A10089BarPFVin = T016Y18_A10089BarPFVin[0] ;
         n10089BarPFVin = T016Y18_n10089BarPFVin[0] ;
         A10258Itm_ord3 = T016Y18_A10258Itm_ord3[0] ;
         n10258Itm_ord3 = T016Y18_n10258Itm_ord3[0] ;
         zm16Y1368( -7) ;
      }
      pr_default.close(16);
      onLoadActions16Y1368( ) ;
   }

   public void onLoadActions16Y1368( )
   {
      AV32OldVal = O10086BarPFVal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldVal", AV32OldVal);
      if ( GXutil.strcmp(AV32OldVal, A10086BarPFVal) != 0 )
      {
         AV33Texto_i = httpContext.getMessage( httpContext.getMessage( "TFASPFAC-PARAMETROS POR ANCHO. CAMBIO VALORES INCICIALES. VALOR FT OLD= ", ""), "") + AV32OldVal + httpContext.getMessage( httpContext.getMessage( " VALOR FT NEW=", ""), "") + A10086BarPFVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Texto_i", AV33Texto_i);
      }
   }

   public void checkExtendedTable16Y1368( )
   {
      nIsDirty_1368 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal16Y1368( ) ;
      /* Using cursor T016Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A10084BarPFcod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARPFCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Sub Parfascod", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPFcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10085BarPFdsc = T016Y4_A10085BarPFdsc[0] ;
      n10085BarPFdsc = T016Y4_n10085BarPFdsc[0] ;
      pr_default.close(2);
      AV32OldVal = O10086BarPFVal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldVal", AV32OldVal);
      if ( GXutil.strcmp(AV32OldVal, A10086BarPFVal) != 0 )
      {
         AV33Texto_i = httpContext.getMessage( httpContext.getMessage( "TFASPFAC-PARAMETROS POR ANCHO. CAMBIO VALORES INCICIALES. VALOR FT OLD= ", ""), "") + AV32OldVal + httpContext.getMessage( httpContext.getMessage( " VALOR FT NEW=", ""), "") + A10086BarPFVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Texto_i", AV33Texto_i);
      }
      if ( GXutil.strcmp(AV32OldVal, A10086BarPFVal) != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TFASPFAC", ""), AV8UsurCod, AV12Station, AV33Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
   }

   public void closeExtendedTableCursors16Y1368( )
   {
      pr_default.close(2);
   }

   public void enableDisable16Y1368( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         short A10084BarPFcod )
   {
      /* Using cursor T016Y19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A10084BarPFcod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "BARPFCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Sub Parfascod", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPFcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10085BarPFdsc = T016Y19_A10085BarPFdsc[0] ;
      n10085BarPFdsc = T016Y19_n10085BarPFdsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10085BarPFdsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey16Y1368( )
   {
      /* Using cursor T016Y20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Short.valueOf(A10084BarPFcod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1368 = (short)(1) ;
      }
      else
      {
         RcdFound1368 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey16Y1368( )
   {
      /* Using cursor T016Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Short.valueOf(A10084BarPFcod)});
      if ( (pr_default.getStatus(1) != 101) && ( T016Y3_A129BarCod[0] == A129BarCod ) && ( T016Y3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T016Y3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016Y3_A194BarOrdLin[0] == A194BarOrdLin ) && ( T016Y3_A4643BarFasLot[0] == A4643BarFasLot ) && ( GXutil.strcmp(T016Y3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T016Y3_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm16Y1368( 7) ;
         RcdFound1368 = (short)(1) ;
         initializeNonKey16Y1368( ) ;
         A10086BarPFVal = T016Y3_A10086BarPFVal[0] ;
         n10086BarPFVal = T016Y3_n10086BarPFVal[0] ;
         A10087BarPFob1 = T016Y3_A10087BarPFob1[0] ;
         n10087BarPFob1 = T016Y3_n10087BarPFob1[0] ;
         A10088BarPFTxt = T016Y3_A10088BarPFTxt[0] ;
         n10088BarPFTxt = T016Y3_n10088BarPFTxt[0] ;
         A10089BarPFVin = T016Y3_A10089BarPFVin[0] ;
         n10089BarPFVin = T016Y3_n10089BarPFVin[0] ;
         A10258Itm_ord3 = T016Y3_A10258Itm_ord3[0] ;
         n10258Itm_ord3 = T016Y3_n10258Itm_ord3[0] ;
         A10084BarPFcod = T016Y3_A10084BarPFcod[0] ;
         O10086BarPFVal = A10086BarPFVal ;
         n10086BarPFVal = false ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4643BarFasLot = A4643BarFasLot ;
         Z10084BarPFcod = A10084BarPFcod ;
         sMode1368 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16Y1368( ) ;
         load16Y1368( ) ;
         Gx_mode = sMode1368 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1368 = (short)(0) ;
         initializeNonKey16Y1368( ) ;
         sMode1368 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16Y1368( ) ;
         Gx_mode = sMode1368 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16Y1368( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16Y1368( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Short.valueOf(A10084BarPFcod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPFA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10086BarPFVal, T016Y2_A10086BarPFVal[0]) != 0 ) || ( GXutil.strcmp(Z10087BarPFob1, T016Y2_A10087BarPFob1[0]) != 0 ) || ( GXutil.strcmp(Z10088BarPFTxt, T016Y2_A10088BarPFTxt[0]) != 0 ) || ( GXutil.strcmp(Z10089BarPFVin, T016Y2_A10089BarPFVin[0]) != 0 ) || ( Z10258Itm_ord3 != T016Y2_A10258Itm_ord3[0] ) )
         {
            if ( GXutil.strcmp(Z10086BarPFVal, T016Y2_A10086BarPFVal[0]) != 0 )
            {
               GXutil.writeLogln("tfaspfac:[seudo value changed for attri]"+"BarPFVal");
               GXutil.writeLogRaw("Old: ",Z10086BarPFVal);
               GXutil.writeLogRaw("Current: ",T016Y2_A10086BarPFVal[0]);
            }
            if ( GXutil.strcmp(Z10087BarPFob1, T016Y2_A10087BarPFob1[0]) != 0 )
            {
               GXutil.writeLogln("tfaspfac:[seudo value changed for attri]"+"BarPFob1");
               GXutil.writeLogRaw("Old: ",Z10087BarPFob1);
               GXutil.writeLogRaw("Current: ",T016Y2_A10087BarPFob1[0]);
            }
            if ( GXutil.strcmp(Z10088BarPFTxt, T016Y2_A10088BarPFTxt[0]) != 0 )
            {
               GXutil.writeLogln("tfaspfac:[seudo value changed for attri]"+"BarPFTxt");
               GXutil.writeLogRaw("Old: ",Z10088BarPFTxt);
               GXutil.writeLogRaw("Current: ",T016Y2_A10088BarPFTxt[0]);
            }
            if ( GXutil.strcmp(Z10089BarPFVin, T016Y2_A10089BarPFVin[0]) != 0 )
            {
               GXutil.writeLogln("tfaspfac:[seudo value changed for attri]"+"BarPFVin");
               GXutil.writeLogRaw("Old: ",Z10089BarPFVin);
               GXutil.writeLogRaw("Current: ",T016Y2_A10089BarPFVin[0]);
            }
            if ( Z10258Itm_ord3 != T016Y2_A10258Itm_ord3[0] )
            {
               GXutil.writeLogln("tfaspfac:[seudo value changed for attri]"+"Itm_ord3");
               GXutil.writeLogRaw("Old: ",Z10258Itm_ord3);
               GXutil.writeLogRaw("Current: ",T016Y2_A10258Itm_ord3[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASPFA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16Y1368( )
   {
      beforeValidate16Y1368( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16Y1368( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16Y1368( 0) ;
         checkOptimisticConcurrency16Y1368( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16Y1368( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16Y1368( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016Y21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Boolean.valueOf(n10086BarPFVal), A10086BarPFVal, Boolean.valueOf(n10087BarPFob1), A10087BarPFob1, Boolean.valueOf(n10088BarPFTxt), A10088BarPFTxt, Boolean.valueOf(n10089BarPFVin), A10089BarPFVin, Boolean.valueOf(n10258Itm_ord3), Short.valueOf(A10258Itm_ord3), A396EmprCod, Short.valueOf(A10084BarPFcod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPFA");
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
            load16Y1368( ) ;
         }
         endLevel16Y1368( ) ;
      }
      closeExtendedTableCursors16Y1368( ) ;
   }

   public void update16Y1368( )
   {
      beforeValidate16Y1368( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16Y1368( ) ;
      }
      if ( ( nIsMod_1368 != 0 ) || ( nIsDirty_1368 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16Y1368( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16Y1368( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16Y1368( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016Y22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n10086BarPFVal), A10086BarPFVal, Boolean.valueOf(n10087BarPFob1), A10087BarPFob1, Boolean.valueOf(n10088BarPFTxt), A10088BarPFTxt, Boolean.valueOf(n10089BarPFVin), A10089BarPFVin, Boolean.valueOf(n10258Itm_ord3), Short.valueOf(A10258Itm_ord3), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Short.valueOf(A10084BarPFcod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPFA");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPFA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16Y1368( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16Y1368( ) ;
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
            endLevel16Y1368( ) ;
         }
      }
      closeExtendedTableCursors16Y1368( ) ;
   }

   public void deferredUpdate16Y1368( )
   {
   }

   public void delete16Y1368( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16Y1368( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16Y1368( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16Y1368( ) ;
         afterConfirm16Y1368( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16Y1368( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016Y23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Short.valueOf(A10084BarPFcod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPFA");
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
      sMode1368 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16Y1368( ) ;
      Gx_mode = sMode1368 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16Y1368( )
   {
      standaloneModal16Y1368( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016Y24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(A10084BarPFcod)});
         A10085BarPFdsc = T016Y24_A10085BarPFdsc[0] ;
         n10085BarPFdsc = T016Y24_n10085BarPFdsc[0] ;
         pr_default.close(22);
         AV32OldVal = O10086BarPFVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OldVal", AV32OldVal);
         if ( GXutil.strcmp(AV32OldVal, A10086BarPFVal) != 0 )
         {
            AV33Texto_i = httpContext.getMessage( httpContext.getMessage( "TFASPFAC-PARAMETROS POR ANCHO. CAMBIO VALORES INCICIALES. VALOR FT OLD= ", ""), "") + AV32OldVal + httpContext.getMessage( httpContext.getMessage( " VALOR FT NEW=", ""), "") + A10086BarPFVal ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Texto_i", AV33Texto_i);
         }
      }
   }

   public void endLevel16Y1368( )
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

   public void scanStart16Y1368( )
   {
      /* Scan By routine */
      /* Using cursor T016Y25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      RcdFound1368 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1368 = (short)(1) ;
         A10084BarPFcod = T016Y25_A10084BarPFcod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16Y1368( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1368 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1368 = (short)(1) ;
         A10084BarPFcod = T016Y25_A10084BarPFcod[0] ;
      }
   }

   public void scanEnd16Y1368( )
   {
      pr_default.close(23);
   }

   public void afterConfirm16Y1368( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16Y1368( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16Y1368( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16Y1368( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16Y1368( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16Y1368( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16Y1368( )
   {
      edtBarPFcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPFcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFcod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarPFdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPFdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFdsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarPFVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFVal_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarPFob1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPFob1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFob1_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarPFTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPFTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtBarPFVin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPFVin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFVin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtItm_ord3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItm_ord3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord3_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes16Y1368( )
   {
   }

   public void send_integrity_lvl_hashes16Y688( )
   {
   }

   public void subsflControlProps_601368( )
   {
      edtavnRcdDeleted_1368_Internalname = "vNRCDDELETED_1368_"+sGXsfl_60_idx ;
      edtBarPFcod_Internalname = "BARPFCOD_"+sGXsfl_60_idx ;
      edtBarPFdsc_Internalname = "BARPFDSC_"+sGXsfl_60_idx ;
      edtBarPFVal_Internalname = "BARPFVAL_"+sGXsfl_60_idx ;
      edtBarPFob1_Internalname = "BARPFOB1_"+sGXsfl_60_idx ;
      edtBarPFTxt_Internalname = "BARPFTXT_"+sGXsfl_60_idx ;
      edtBarPFVin_Internalname = "BARPFVIN_"+sGXsfl_60_idx ;
      edtItm_ord3_Internalname = "ITM_ORD3_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601368( )
   {
      edtavnRcdDeleted_1368_Internalname = "vNRCDDELETED_1368_"+sGXsfl_60_fel_idx ;
      edtBarPFcod_Internalname = "BARPFCOD_"+sGXsfl_60_fel_idx ;
      edtBarPFdsc_Internalname = "BARPFDSC_"+sGXsfl_60_fel_idx ;
      edtBarPFVal_Internalname = "BARPFVAL_"+sGXsfl_60_fel_idx ;
      edtBarPFob1_Internalname = "BARPFOB1_"+sGXsfl_60_fel_idx ;
      edtBarPFTxt_Internalname = "BARPFTXT_"+sGXsfl_60_fel_idx ;
      edtBarPFVin_Internalname = "BARPFVIN_"+sGXsfl_60_fel_idx ;
      edtItm_ord3_Internalname = "ITM_ORD3_"+sGXsfl_60_fel_idx ;
   }

   public void addRow16Y1368( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601368( ) ;
      sendRow16Y1368( ) ;
   }

   public void sendRow16Y1368( )
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
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1368_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1368_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1368_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1368), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1368), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1368_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1368_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1368_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPFcod_Internalname,GXutil.ltrim( localUtil.ntoc( A10084BarPFcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10084BarPFcod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPFcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPFcod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPFdsc_Internalname,GXutil.rtrim( A10085BarPFdsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPFdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPFdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1368_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPFVal_Internalname,GXutil.rtrim( A10086BarPFVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPFVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPFVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1368_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPFob1_Internalname,GXutil.rtrim( A10087BarPFob1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPFob1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPFob1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1368_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPFTxt_Internalname,A10088BarPFTxt,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPFTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPFTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1368_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPFVin_Internalname,GXutil.rtrim( A10089BarPFVin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPFVin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPFVin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1368_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItm_ord3_Internalname,GXutil.ltrim( localUtil.ntoc( A10258Itm_ord3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtItm_ord3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10258Itm_ord3), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10258Itm_ord3), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtItm_ord3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtItm_ord3_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes16Y1368( ) ;
      GXCCtl = "Z10084BarPFcod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10084BarPFcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10086BarPFVal_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10086BarPFVal));
      GXCCtl = "Z10087BarPFob1_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10087BarPFob1));
      GXCCtl = "Z10088BarPFTxt_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z10088BarPFTxt);
      GXCCtl = "Z10089BarPFVin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10089BarPFVin));
      GXCCtl = "Z10258Itm_ord3_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10258Itm_ord3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O10086BarPFVal_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O10086BarPFVal));
      GXCCtl = "nRcdDeleted_1368_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1368_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1368_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1368, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1368_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1368_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPFCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPFDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPFVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPFOB1_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFob1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPFTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPFVIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFVin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ITM_ORD3_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord3_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow16Y1368( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601368( ) ;
      edtavnRcdDeleted_1368_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1368_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPFcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPFdsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPFVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFVAL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPFob1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFOB1_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPFTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFTXT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPFVin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPFVIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtItm_ord3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD3_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1368_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1368_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1368");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1368_Internalname ;
         wbErr = true ;
         nRcdDeleted_1368 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1368 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1368_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPFcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPFcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARPFCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPFcod_Internalname ;
         wbErr = true ;
         A10084BarPFcod = (short)(0) ;
      }
      else
      {
         A10084BarPFcod = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPFcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10085BarPFdsc = httpContext.cgiGet( edtBarPFdsc_Internalname) ;
      n10085BarPFdsc = false ;
      A10086BarPFVal = httpContext.cgiGet( edtBarPFVal_Internalname) ;
      n10086BarPFVal = false ;
      A10087BarPFob1 = httpContext.cgiGet( edtBarPFob1_Internalname) ;
      n10087BarPFob1 = false ;
      A10088BarPFTxt = httpContext.cgiGet( edtBarPFTxt_Internalname) ;
      n10088BarPFTxt = false ;
      A10089BarPFVin = httpContext.cgiGet( edtBarPFVin_Internalname) ;
      n10089BarPFVin = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtItm_ord3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtItm_ord3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ITM_ORD3_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtItm_ord3_Internalname ;
         wbErr = true ;
         A10258Itm_ord3 = (short)(0) ;
         n10258Itm_ord3 = false ;
      }
      else
      {
         A10258Itm_ord3 = (short)(localUtil.ctol( httpContext.cgiGet( edtItm_ord3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10258Itm_ord3 = false ;
      }
      GXCCtl = "Z10084BarPFcod_" + sGXsfl_60_idx ;
      Z10084BarPFcod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10086BarPFVal_" + sGXsfl_60_idx ;
      Z10086BarPFVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10087BarPFob1_" + sGXsfl_60_idx ;
      Z10087BarPFob1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10088BarPFTxt_" + sGXsfl_60_idx ;
      Z10088BarPFTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10089BarPFVin_" + sGXsfl_60_idx ;
      Z10089BarPFVin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10258Itm_ord3_" + sGXsfl_60_idx ;
      Z10258Itm_ord3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O10086BarPFVal_" + sGXsfl_60_idx ;
      O10086BarPFVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1368_" + sGXsfl_60_idx ;
      nRcdDeleted_1368 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1368_" + sGXsfl_60_idx ;
      nRcdExists_1368 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1368_" + sGXsfl_60_idx ;
      nIsMod_1368 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarPFcod_Enabled = edtBarPFcod_Enabled ;
   }

   public void confirmValues16Y0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601368( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601368( ) ;
         httpContext.changePostValue( "Z10084BarPFcod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10084BarPFcod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10084BarPFcod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10086BarPFVal_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10086BarPFVal_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10086BarPFVal_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10087BarPFob1_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10087BarPFob1_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10087BarPFob1_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10088BarPFTxt_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10088BarPFTxt_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10088BarPFTxt_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10089BarPFVin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10089BarPFVin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10089BarPFVin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z10258Itm_ord3_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z10258Itm_ord3_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10258Itm_ord3_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O10086BarPFVal", httpContext.cgiGet( "T10086BarPFVal")) ;
      httpContext.deletePostValue( "T10086BarPFVal") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfaspfac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4643BarFasLot,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","BarFasLot"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4643BarFasLot", GXutil.ltrim( localUtil.ntoc( Z4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDVAL", GXutil.rtrim( AV32OldVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV33Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
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
      return formatLink("app.tfaspfac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4643BarFasLot,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","BarFasLot"})  ;
   }

   public String getPgmname( )
   {
      return "TFASPFAC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS POR ANCHO", "") ;
   }

   public void initializeNonKey16Y688( )
   {
   }

   public void initAll16Y688( )
   {
      initializeNonKey16Y688( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16Y1368( )
   {
      AV32OldVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldVal", AV32OldVal);
      A10085BarPFdsc = "" ;
      n10085BarPFdsc = false ;
      A10086BarPFVal = "" ;
      n10086BarPFVal = false ;
      A10087BarPFob1 = "" ;
      n10087BarPFob1 = false ;
      A10088BarPFTxt = "" ;
      n10088BarPFTxt = false ;
      A10089BarPFVin = "" ;
      n10089BarPFVin = false ;
      A10258Itm_ord3 = (short)(0) ;
      n10258Itm_ord3 = false ;
      AV33Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Texto_i", AV33Texto_i);
      O10086BarPFVal = A10086BarPFVal ;
      n10086BarPFVal = false ;
      Z10086BarPFVal = "" ;
      Z10087BarPFob1 = "" ;
      Z10088BarPFTxt = "" ;
      Z10089BarPFVin = "" ;
      Z10258Itm_ord3 = (short)(0) ;
   }

   public void initAll16Y1368( )
   {
      A10084BarPFcod = (short)(0) ;
      initializeNonKey16Y1368( ) ;
   }

   public void standaloneModalInsert16Y1368( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824155195", true, true);
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
      httpContext.AddJavascriptSource("tfaspfac.js", "?2026824155195", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1368( )
   {
      edtBarPFcod_Enabled = defedtBarPFcod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPFcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPFcod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1368, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1368_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10084BarPFcod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10085BarPFdsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10086BarPFVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10087BarPFob1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFob1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A10088BarPFTxt);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10089BarPFVin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPFVin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10258Itm_ord3, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord3_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarFasLot_Internalname = "BARFASLOT" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1368_Internalname = "vNRCDDELETED_1368" ;
      edtBarPFcod_Internalname = "BARPFCOD" ;
      edtBarPFdsc_Internalname = "BARPFDSC" ;
      edtBarPFVal_Internalname = "BARPFVAL" ;
      edtBarPFob1_Internalname = "BARPFOB1" ;
      edtBarPFTxt_Internalname = "BARPFTXT" ;
      edtBarPFVin_Internalname = "BARPFVIN" ;
      edtItm_ord3_Internalname = "ITM_ORD3" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS POR ANCHO", "") );
      edtItm_ord3_Jsonclick = "" ;
      edtBarPFVin_Jsonclick = "" ;
      edtBarPFTxt_Jsonclick = "" ;
      edtBarPFob1_Jsonclick = "" ;
      edtBarPFVal_Jsonclick = "" ;
      edtBarPFdsc_Jsonclick = "" ;
      edtBarPFcod_Jsonclick = "" ;
      edtavnRcdDeleted_1368_Jsonclick = "" ;
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
      edtItm_ord3_Enabled = 1 ;
      edtBarPFVin_Enabled = 1 ;
      edtBarPFTxt_Enabled = 1 ;
      edtBarPFob1_Enabled = 1 ;
      edtBarPFVal_Enabled = 1 ;
      edtBarPFdsc_Enabled = 0 ;
      edtBarPFcod_Enabled = 1 ;
      edtavnRcdDeleted_1368_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarFasLot_Jsonclick = "" ;
      edtBarFasLot_Backcolor = (int)(0xFFFFFF) ;
      edtBarFasLot_Enabled = 0 ;
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

   public void xc_3_16Y1368( )
   {
      if ( GXutil.strcmp(AV32OldVal, A10086BarPFVal) != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TFASPFAC", ""), AV8UsurCod, AV12Station, AV33Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_601368( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16Y1368( ) ;
         standaloneModal16Y1368( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16Y1368( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601368( ) ;
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
      /* Using cursor T016Y26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016Y26_A407EmprNom[0] ;
      n407EmprNom = T016Y26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      /* Using cursor T016Y27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      pr_default.close(25);
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

   public void valid_Barfaslot( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4643BarFasLot", GXutil.ltrim( localUtil.ntoc( Z4643BarFasLot, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barpfcod( )
   {
      n10085BarPFdsc = false ;
      /* Using cursor T016Y24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(A10084BarPFcod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Sub Parfascod", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPFcod_Internalname ;
      }
      A10085BarPFdsc = T016Y24_A10085BarPFdsc[0] ;
      n10085BarPFdsc = T016Y24_n10085BarPFdsc[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10085BarPFdsc", GXutil.rtrim( A10085BarPFdsc));
   }

   public void valid_Barpfval( )
   {
      n10086BarPFVal = false ;
      AV32OldVal = O10086BarPFVal ;
      if ( GXutil.strcmp(AV32OldVal, A10086BarPFVal) != 0 )
      {
         AV33Texto_i = httpContext.getMessage( httpContext.getMessage( "TFASPFAC-PARAMETROS POR ANCHO. CAMBIO VALORES INCICIALES. VALOR FT OLD= ", ""), "") + AV32OldVal + httpContext.getMessage( httpContext.getMessage( " VALOR FT NEW=", ""), "") + A10086BarPFVal ;
      }
      if ( GXutil.strcmp(AV32OldVal, A10086BarPFVal) != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TFASPFAC", ""), AV8UsurCod, AV12Station, AV33Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV32OldVal", GXutil.rtrim( AV32OldVal));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Texto_i", AV33Texto_i);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4643BarFasLot',fld:'BARFASLOT',pic:'ZZZZZ9'}]");
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
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_BARFASLOT","{handler:'valid_Barfaslot',iparms:[{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4643BarFasLot',fld:'BARFASLOT',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARFASLOT",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z4643BarFasLot'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARPFCOD","{handler:'valid_Barpfcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10084BarPFcod',fld:'BARPFCOD',pic:'ZZZ9'},{av:'A10085BarPFdsc',fld:'BARPFDSC',pic:''}]");
      setEventMetadata("VALID_BARPFCOD",",oparms:[{av:'A10085BarPFdsc',fld:'BARPFDSC',pic:''}]}");
      setEventMetadata("VALID_BARPFVAL","{handler:'valid_Barpfval',iparms:[{av:'O10086BarPFVal'},{av:'A10086BarPFVal',fld:'BARPFVAL',pic:''},{av:'AV32OldVal',fld:'vOLDVAL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV33Texto_i',fld:'vTEXTO_I',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARPFVAL",",oparms:[{av:'AV32OldVal',fld:'vOLDVAL',pic:''},{av:'AV33Texto_i',fld:'vTEXTO_I',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Itm_ord3',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(24);
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
      Z10086BarPFVal = "" ;
      Z10087BarPFob1 = "" ;
      Z10088BarPFTxt = "" ;
      Z10089BarPFVin = "" ;
      O10086BarPFVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1368 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      AV32OldVal = "" ;
      AV33Texto_i = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode688 = "" ;
      GXCCtl = "" ;
      A10085BarPFdsc = "" ;
      A10086BarPFVal = "" ;
      A10087BarPFob1 = "" ;
      A10088BarPFTxt = "" ;
      A10089BarPFVin = "" ;
      T10086BarPFVal = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T016Y7_A407EmprNom = new String[] {""} ;
      T016Y7_n407EmprNom = new boolean[] {false} ;
      T016Y8_A396EmprCod = new String[] {""} ;
      T016Y9_A4643BarFasLot = new int[1] ;
      T016Y9_A407EmprNom = new String[] {""} ;
      T016Y9_n407EmprNom = new boolean[] {false} ;
      T016Y9_A396EmprCod = new String[] {""} ;
      T016Y9_A129BarCod = new int[1] ;
      T016Y9_A132BarCodReo = new byte[1] ;
      T016Y9_A130BarCodPar = new String[] {""} ;
      T016Y9_A758ProCod = new String[] {""} ;
      T016Y9_A194BarOrdLin = new short[1] ;
      T016Y10_A396EmprCod = new String[] {""} ;
      T016Y10_A129BarCod = new int[1] ;
      T016Y10_A132BarCodReo = new byte[1] ;
      T016Y10_A130BarCodPar = new String[] {""} ;
      T016Y10_A758ProCod = new String[] {""} ;
      T016Y10_A194BarOrdLin = new short[1] ;
      T016Y10_A4643BarFasLot = new int[1] ;
      T016Y6_A4643BarFasLot = new int[1] ;
      T016Y6_A396EmprCod = new String[] {""} ;
      T016Y6_A129BarCod = new int[1] ;
      T016Y6_A132BarCodReo = new byte[1] ;
      T016Y6_A130BarCodPar = new String[] {""} ;
      T016Y6_A758ProCod = new String[] {""} ;
      T016Y6_A194BarOrdLin = new short[1] ;
      T016Y11_A396EmprCod = new String[] {""} ;
      T016Y11_A129BarCod = new int[1] ;
      T016Y11_A132BarCodReo = new byte[1] ;
      T016Y11_A130BarCodPar = new String[] {""} ;
      T016Y11_A758ProCod = new String[] {""} ;
      T016Y11_A194BarOrdLin = new short[1] ;
      T016Y11_A4643BarFasLot = new int[1] ;
      T016Y12_A396EmprCod = new String[] {""} ;
      T016Y12_A129BarCod = new int[1] ;
      T016Y12_A132BarCodReo = new byte[1] ;
      T016Y12_A130BarCodPar = new String[] {""} ;
      T016Y12_A758ProCod = new String[] {""} ;
      T016Y12_A194BarOrdLin = new short[1] ;
      T016Y12_A4643BarFasLot = new int[1] ;
      T016Y5_A4643BarFasLot = new int[1] ;
      T016Y5_A396EmprCod = new String[] {""} ;
      T016Y5_A129BarCod = new int[1] ;
      T016Y5_A132BarCodReo = new byte[1] ;
      T016Y5_A130BarCodPar = new String[] {""} ;
      T016Y5_A758ProCod = new String[] {""} ;
      T016Y5_A194BarOrdLin = new short[1] ;
      T016Y15_A396EmprCod = new String[] {""} ;
      T016Y15_A129BarCod = new int[1] ;
      T016Y15_A132BarCodReo = new byte[1] ;
      T016Y15_A130BarCodPar = new String[] {""} ;
      T016Y15_A758ProCod = new String[] {""} ;
      T016Y15_A194BarOrdLin = new short[1] ;
      T016Y15_A4643BarFasLot = new int[1] ;
      T016Y15_A6579DataReg = new java.util.Date[] {GXutil.nullDate()} ;
      T016Y15_A6574Turno = new byte[1] ;
      T016Y15_A6580Seccao = new byte[1] ;
      T016Y15_A6577FuncCod = new int[1] ;
      T016Y16_A396EmprCod = new String[] {""} ;
      T016Y16_A129BarCod = new int[1] ;
      T016Y16_A132BarCodReo = new byte[1] ;
      T016Y16_A130BarCodPar = new String[] {""} ;
      T016Y16_A758ProCod = new String[] {""} ;
      T016Y16_A194BarOrdLin = new short[1] ;
      T016Y16_A4643BarFasLot = new int[1] ;
      T016Y16_A5954Ap_Barcod = new int[1] ;
      T016Y16_A5955Ap_BarReo = new byte[1] ;
      T016Y16_A5956Ap_BarPar = new String[] {""} ;
      T016Y16_A5957Ap_ProCod = new String[] {""} ;
      T016Y16_A5958Ap_BarOrd = new short[1] ;
      T016Y17_A396EmprCod = new String[] {""} ;
      T016Y17_A129BarCod = new int[1] ;
      T016Y17_A132BarCodReo = new byte[1] ;
      T016Y17_A130BarCodPar = new String[] {""} ;
      T016Y17_A758ProCod = new String[] {""} ;
      T016Y17_A194BarOrdLin = new short[1] ;
      T016Y17_A4643BarFasLot = new int[1] ;
      Z10085BarPFdsc = "" ;
      T016Y18_A129BarCod = new int[1] ;
      T016Y18_A132BarCodReo = new byte[1] ;
      T016Y18_A130BarCodPar = new String[] {""} ;
      T016Y18_A194BarOrdLin = new short[1] ;
      T016Y18_A4643BarFasLot = new int[1] ;
      T016Y18_A10085BarPFdsc = new String[] {""} ;
      T016Y18_n10085BarPFdsc = new boolean[] {false} ;
      T016Y18_A10086BarPFVal = new String[] {""} ;
      T016Y18_n10086BarPFVal = new boolean[] {false} ;
      T016Y18_A10087BarPFob1 = new String[] {""} ;
      T016Y18_n10087BarPFob1 = new boolean[] {false} ;
      T016Y18_A10088BarPFTxt = new String[] {""} ;
      T016Y18_n10088BarPFTxt = new boolean[] {false} ;
      T016Y18_A10089BarPFVin = new String[] {""} ;
      T016Y18_n10089BarPFVin = new boolean[] {false} ;
      T016Y18_A10258Itm_ord3 = new short[1] ;
      T016Y18_n10258Itm_ord3 = new boolean[] {false} ;
      T016Y18_A396EmprCod = new String[] {""} ;
      T016Y18_A10084BarPFcod = new short[1] ;
      T016Y18_A758ProCod = new String[] {""} ;
      T016Y4_A10085BarPFdsc = new String[] {""} ;
      T016Y4_n10085BarPFdsc = new boolean[] {false} ;
      T016Y19_A10085BarPFdsc = new String[] {""} ;
      T016Y19_n10085BarPFdsc = new boolean[] {false} ;
      T016Y20_A396EmprCod = new String[] {""} ;
      T016Y20_A129BarCod = new int[1] ;
      T016Y20_A132BarCodReo = new byte[1] ;
      T016Y20_A130BarCodPar = new String[] {""} ;
      T016Y20_A758ProCod = new String[] {""} ;
      T016Y20_A194BarOrdLin = new short[1] ;
      T016Y20_A4643BarFasLot = new int[1] ;
      T016Y20_A10084BarPFcod = new short[1] ;
      T016Y3_A129BarCod = new int[1] ;
      T016Y3_A132BarCodReo = new byte[1] ;
      T016Y3_A130BarCodPar = new String[] {""} ;
      T016Y3_A194BarOrdLin = new short[1] ;
      T016Y3_A4643BarFasLot = new int[1] ;
      T016Y3_A10086BarPFVal = new String[] {""} ;
      T016Y3_n10086BarPFVal = new boolean[] {false} ;
      T016Y3_A10087BarPFob1 = new String[] {""} ;
      T016Y3_n10087BarPFob1 = new boolean[] {false} ;
      T016Y3_A10088BarPFTxt = new String[] {""} ;
      T016Y3_n10088BarPFTxt = new boolean[] {false} ;
      T016Y3_A10089BarPFVin = new String[] {""} ;
      T016Y3_n10089BarPFVin = new boolean[] {false} ;
      T016Y3_A10258Itm_ord3 = new short[1] ;
      T016Y3_n10258Itm_ord3 = new boolean[] {false} ;
      T016Y3_A396EmprCod = new String[] {""} ;
      T016Y3_A10084BarPFcod = new short[1] ;
      T016Y3_A758ProCod = new String[] {""} ;
      T016Y2_A129BarCod = new int[1] ;
      T016Y2_A132BarCodReo = new byte[1] ;
      T016Y2_A130BarCodPar = new String[] {""} ;
      T016Y2_A194BarOrdLin = new short[1] ;
      T016Y2_A4643BarFasLot = new int[1] ;
      T016Y2_A10086BarPFVal = new String[] {""} ;
      T016Y2_n10086BarPFVal = new boolean[] {false} ;
      T016Y2_A10087BarPFob1 = new String[] {""} ;
      T016Y2_n10087BarPFob1 = new boolean[] {false} ;
      T016Y2_A10088BarPFTxt = new String[] {""} ;
      T016Y2_n10088BarPFTxt = new boolean[] {false} ;
      T016Y2_A10089BarPFVin = new String[] {""} ;
      T016Y2_n10089BarPFVin = new boolean[] {false} ;
      T016Y2_A10258Itm_ord3 = new short[1] ;
      T016Y2_n10258Itm_ord3 = new boolean[] {false} ;
      T016Y2_A396EmprCod = new String[] {""} ;
      T016Y2_A10084BarPFcod = new short[1] ;
      T016Y2_A758ProCod = new String[] {""} ;
      T016Y24_A10085BarPFdsc = new String[] {""} ;
      T016Y24_n10085BarPFdsc = new boolean[] {false} ;
      T016Y25_A396EmprCod = new String[] {""} ;
      T016Y25_A129BarCod = new int[1] ;
      T016Y25_A132BarCodReo = new byte[1] ;
      T016Y25_A130BarCodPar = new String[] {""} ;
      T016Y25_A758ProCod = new String[] {""} ;
      T016Y25_A194BarOrdLin = new short[1] ;
      T016Y25_A4643BarFasLot = new int[1] ;
      T016Y25_A10084BarPFcod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T016Y26_A407EmprNom = new String[] {""} ;
      T016Y26_n407EmprNom = new boolean[] {false} ;
      T016Y27_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZV32OldVal = "" ;
      ZV33Texto_i = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfaspfac__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfaspfac__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfaspfac__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfaspfac__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfaspfac__default(),
         new Object[] {
             new Object[] {
            T016Y2_A129BarCod, T016Y2_A132BarCodReo, T016Y2_A130BarCodPar, T016Y2_A194BarOrdLin, T016Y2_A4643BarFasLot, T016Y2_A10086BarPFVal, T016Y2_n10086BarPFVal, T016Y2_A10087BarPFob1, T016Y2_n10087BarPFob1, T016Y2_A10088BarPFTxt,
            T016Y2_n10088BarPFTxt, T016Y2_A10089BarPFVin, T016Y2_n10089BarPFVin, T016Y2_A10258Itm_ord3, T016Y2_n10258Itm_ord3, T016Y2_A396EmprCod, T016Y2_A10084BarPFcod, T016Y2_A758ProCod
            }
            , new Object[] {
            T016Y3_A129BarCod, T016Y3_A132BarCodReo, T016Y3_A130BarCodPar, T016Y3_A194BarOrdLin, T016Y3_A4643BarFasLot, T016Y3_A10086BarPFVal, T016Y3_n10086BarPFVal, T016Y3_A10087BarPFob1, T016Y3_n10087BarPFob1, T016Y3_A10088BarPFTxt,
            T016Y3_n10088BarPFTxt, T016Y3_A10089BarPFVin, T016Y3_n10089BarPFVin, T016Y3_A10258Itm_ord3, T016Y3_n10258Itm_ord3, T016Y3_A396EmprCod, T016Y3_A10084BarPFcod, T016Y3_A758ProCod
            }
            , new Object[] {
            T016Y4_A10085BarPFdsc, T016Y4_n10085BarPFdsc
            }
            , new Object[] {
            T016Y5_A4643BarFasLot, T016Y5_A396EmprCod, T016Y5_A129BarCod, T016Y5_A132BarCodReo, T016Y5_A130BarCodPar, T016Y5_A758ProCod, T016Y5_A194BarOrdLin
            }
            , new Object[] {
            T016Y6_A4643BarFasLot, T016Y6_A396EmprCod, T016Y6_A129BarCod, T016Y6_A132BarCodReo, T016Y6_A130BarCodPar, T016Y6_A758ProCod, T016Y6_A194BarOrdLin
            }
            , new Object[] {
            T016Y7_A407EmprNom, T016Y7_n407EmprNom
            }
            , new Object[] {
            T016Y8_A396EmprCod
            }
            , new Object[] {
            T016Y9_A4643BarFasLot, T016Y9_A407EmprNom, T016Y9_n407EmprNom, T016Y9_A396EmprCod, T016Y9_A129BarCod, T016Y9_A132BarCodReo, T016Y9_A130BarCodPar, T016Y9_A758ProCod, T016Y9_A194BarOrdLin
            }
            , new Object[] {
            T016Y10_A396EmprCod, T016Y10_A129BarCod, T016Y10_A132BarCodReo, T016Y10_A130BarCodPar, T016Y10_A758ProCod, T016Y10_A194BarOrdLin, T016Y10_A4643BarFasLot
            }
            , new Object[] {
            T016Y11_A396EmprCod, T016Y11_A129BarCod, T016Y11_A132BarCodReo, T016Y11_A130BarCodPar, T016Y11_A758ProCod, T016Y11_A194BarOrdLin, T016Y11_A4643BarFasLot
            }
            , new Object[] {
            T016Y12_A396EmprCod, T016Y12_A129BarCod, T016Y12_A132BarCodReo, T016Y12_A130BarCodPar, T016Y12_A758ProCod, T016Y12_A194BarOrdLin, T016Y12_A4643BarFasLot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016Y15_A396EmprCod, T016Y15_A129BarCod, T016Y15_A132BarCodReo, T016Y15_A130BarCodPar, T016Y15_A758ProCod, T016Y15_A194BarOrdLin, T016Y15_A4643BarFasLot, T016Y15_A6579DataReg, T016Y15_A6574Turno, T016Y15_A6580Seccao,
            T016Y15_A6577FuncCod
            }
            , new Object[] {
            T016Y16_A396EmprCod, T016Y16_A129BarCod, T016Y16_A132BarCodReo, T016Y16_A130BarCodPar, T016Y16_A758ProCod, T016Y16_A194BarOrdLin, T016Y16_A4643BarFasLot, T016Y16_A5954Ap_Barcod, T016Y16_A5955Ap_BarReo, T016Y16_A5956Ap_BarPar,
            T016Y16_A5957Ap_ProCod, T016Y16_A5958Ap_BarOrd
            }
            , new Object[] {
            T016Y17_A396EmprCod, T016Y17_A129BarCod, T016Y17_A132BarCodReo, T016Y17_A130BarCodPar, T016Y17_A758ProCod, T016Y17_A194BarOrdLin, T016Y17_A4643BarFasLot
            }
            , new Object[] {
            T016Y18_A129BarCod, T016Y18_A132BarCodReo, T016Y18_A130BarCodPar, T016Y18_A194BarOrdLin, T016Y18_A4643BarFasLot, T016Y18_A10085BarPFdsc, T016Y18_n10085BarPFdsc, T016Y18_A10086BarPFVal, T016Y18_n10086BarPFVal, T016Y18_A10087BarPFob1,
            T016Y18_n10087BarPFob1, T016Y18_A10088BarPFTxt, T016Y18_n10088BarPFTxt, T016Y18_A10089BarPFVin, T016Y18_n10089BarPFVin, T016Y18_A10258Itm_ord3, T016Y18_n10258Itm_ord3, T016Y18_A396EmprCod, T016Y18_A10084BarPFcod, T016Y18_A758ProCod
            }
            , new Object[] {
            T016Y19_A10085BarPFdsc, T016Y19_n10085BarPFdsc
            }
            , new Object[] {
            T016Y20_A396EmprCod, T016Y20_A129BarCod, T016Y20_A132BarCodReo, T016Y20_A130BarCodPar, T016Y20_A758ProCod, T016Y20_A194BarOrdLin, T016Y20_A4643BarFasLot, T016Y20_A10084BarPFcod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016Y24_A10085BarPFdsc, T016Y24_n10085BarPFdsc
            }
            , new Object[] {
            T016Y25_A396EmprCod, T016Y25_A129BarCod, T016Y25_A132BarCodReo, T016Y25_A130BarCodPar, T016Y25_A758ProCod, T016Y25_A194BarOrdLin, T016Y25_A4643BarFasLot, T016Y25_A10084BarPFcod
            }
            , new Object[] {
            T016Y26_A407EmprNom, T016Y26_n407EmprNom
            }
            , new Object[] {
            T016Y27_A396EmprCod
            }
         }
      );
      Z4643BarFasLot = 0 ;
      A4643BarFasLot = 0 ;
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
      AV34Pgmname = "TFASPFAC" ;
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
   private short wcpOA194BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z10084BarPFcod ;
   private short Z10258Itm_ord3 ;
   private short nRcdDeleted_1368 ;
   private short nRcdExists_1368 ;
   private short nIsMod_1368 ;
   private short A10084BarPFcod ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1368 ;
   private short RcdFound1368 ;
   private short nBlankRcdUsr1368 ;
   private short A10258Itm_ord3 ;
   private short RcdFound688 ;
   private short nIsDirty_688 ;
   private short nIsDirty_1368 ;
   private short ZZ194BarOrdLin ;
   private int wcpOA129BarCod ;
   private int wcpOA4643BarFasLot ;
   private int Z129BarCod ;
   private int Z4643BarFasLot ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int A129BarCod ;
   private int A4643BarFasLot ;
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
   private int edtBarFasLot_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1368_Enabled ;
   private int edtBarPFcod_Enabled ;
   private int edtBarPFdsc_Enabled ;
   private int edtBarPFVal_Enabled ;
   private int edtBarPFob1_Enabled ;
   private int edtBarPFTxt_Enabled ;
   private int edtBarPFVin_Enabled ;
   private int edtItm_ord3_Enabled ;
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
   private int defedtBarPFcod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarFasLot_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4643BarFasLot ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z10086BarPFVal ;
   private String Z10087BarPFob1 ;
   private String Z10089BarPFVin ;
   private String O10086BarPFVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarFasLot_Internalname ;
   private String edtBarFasLot_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1368 ;
   private String edtavnRcdDeleted_1368_Internalname ;
   private String edtBarPFcod_Internalname ;
   private String edtBarPFdsc_Internalname ;
   private String edtBarPFVal_Internalname ;
   private String edtBarPFob1_Internalname ;
   private String edtBarPFTxt_Internalname ;
   private String edtBarPFVin_Internalname ;
   private String edtItm_ord3_Internalname ;
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
   private String AV34Pgmname ;
   private String AV32OldVal ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode688 ;
   private String GXCCtl ;
   private String A10085BarPFdsc ;
   private String A10086BarPFVal ;
   private String A10087BarPFob1 ;
   private String A10089BarPFVin ;
   private String T10086BarPFVal ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z10085BarPFdsc ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1368_Jsonclick ;
   private String edtBarPFcod_Jsonclick ;
   private String edtBarPFdsc_Jsonclick ;
   private String edtBarPFVal_Jsonclick ;
   private String edtBarPFob1_Jsonclick ;
   private String edtBarPFTxt_Jsonclick ;
   private String edtBarPFVin_Jsonclick ;
   private String edtItm_ord3_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZV32OldVal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10085BarPFdsc ;
   private boolean n10086BarPFVal ;
   private boolean n10087BarPFob1 ;
   private boolean n10088BarPFTxt ;
   private boolean n10089BarPFVin ;
   private boolean n10258Itm_ord3 ;
   private String Z10088BarPFTxt ;
   private String AV33Texto_i ;
   private String A10088BarPFTxt ;
   private String ZV33Texto_i ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T016Y7_A407EmprNom ;
   private boolean[] T016Y7_n407EmprNom ;
   private String[] T016Y8_A396EmprCod ;
   private int[] T016Y9_A4643BarFasLot ;
   private String[] T016Y9_A407EmprNom ;
   private boolean[] T016Y9_n407EmprNom ;
   private String[] T016Y9_A396EmprCod ;
   private int[] T016Y9_A129BarCod ;
   private byte[] T016Y9_A132BarCodReo ;
   private String[] T016Y9_A130BarCodPar ;
   private String[] T016Y9_A758ProCod ;
   private short[] T016Y9_A194BarOrdLin ;
   private String[] T016Y10_A396EmprCod ;
   private int[] T016Y10_A129BarCod ;
   private byte[] T016Y10_A132BarCodReo ;
   private String[] T016Y10_A130BarCodPar ;
   private String[] T016Y10_A758ProCod ;
   private short[] T016Y10_A194BarOrdLin ;
   private int[] T016Y10_A4643BarFasLot ;
   private int[] T016Y6_A4643BarFasLot ;
   private String[] T016Y6_A396EmprCod ;
   private int[] T016Y6_A129BarCod ;
   private byte[] T016Y6_A132BarCodReo ;
   private String[] T016Y6_A130BarCodPar ;
   private String[] T016Y6_A758ProCod ;
   private short[] T016Y6_A194BarOrdLin ;
   private String[] T016Y11_A396EmprCod ;
   private int[] T016Y11_A129BarCod ;
   private byte[] T016Y11_A132BarCodReo ;
   private String[] T016Y11_A130BarCodPar ;
   private String[] T016Y11_A758ProCod ;
   private short[] T016Y11_A194BarOrdLin ;
   private int[] T016Y11_A4643BarFasLot ;
   private String[] T016Y12_A396EmprCod ;
   private int[] T016Y12_A129BarCod ;
   private byte[] T016Y12_A132BarCodReo ;
   private String[] T016Y12_A130BarCodPar ;
   private String[] T016Y12_A758ProCod ;
   private short[] T016Y12_A194BarOrdLin ;
   private int[] T016Y12_A4643BarFasLot ;
   private int[] T016Y5_A4643BarFasLot ;
   private String[] T016Y5_A396EmprCod ;
   private int[] T016Y5_A129BarCod ;
   private byte[] T016Y5_A132BarCodReo ;
   private String[] T016Y5_A130BarCodPar ;
   private String[] T016Y5_A758ProCod ;
   private short[] T016Y5_A194BarOrdLin ;
   private String[] T016Y15_A396EmprCod ;
   private int[] T016Y15_A129BarCod ;
   private byte[] T016Y15_A132BarCodReo ;
   private String[] T016Y15_A130BarCodPar ;
   private String[] T016Y15_A758ProCod ;
   private short[] T016Y15_A194BarOrdLin ;
   private int[] T016Y15_A4643BarFasLot ;
   private java.util.Date[] T016Y15_A6579DataReg ;
   private byte[] T016Y15_A6574Turno ;
   private byte[] T016Y15_A6580Seccao ;
   private int[] T016Y15_A6577FuncCod ;
   private String[] T016Y16_A396EmprCod ;
   private int[] T016Y16_A129BarCod ;
   private byte[] T016Y16_A132BarCodReo ;
   private String[] T016Y16_A130BarCodPar ;
   private String[] T016Y16_A758ProCod ;
   private short[] T016Y16_A194BarOrdLin ;
   private int[] T016Y16_A4643BarFasLot ;
   private int[] T016Y16_A5954Ap_Barcod ;
   private byte[] T016Y16_A5955Ap_BarReo ;
   private String[] T016Y16_A5956Ap_BarPar ;
   private String[] T016Y16_A5957Ap_ProCod ;
   private short[] T016Y16_A5958Ap_BarOrd ;
   private String[] T016Y17_A396EmprCod ;
   private int[] T016Y17_A129BarCod ;
   private byte[] T016Y17_A132BarCodReo ;
   private String[] T016Y17_A130BarCodPar ;
   private String[] T016Y17_A758ProCod ;
   private short[] T016Y17_A194BarOrdLin ;
   private int[] T016Y17_A4643BarFasLot ;
   private int[] T016Y18_A129BarCod ;
   private byte[] T016Y18_A132BarCodReo ;
   private String[] T016Y18_A130BarCodPar ;
   private short[] T016Y18_A194BarOrdLin ;
   private int[] T016Y18_A4643BarFasLot ;
   private String[] T016Y18_A10085BarPFdsc ;
   private boolean[] T016Y18_n10085BarPFdsc ;
   private String[] T016Y18_A10086BarPFVal ;
   private boolean[] T016Y18_n10086BarPFVal ;
   private String[] T016Y18_A10087BarPFob1 ;
   private boolean[] T016Y18_n10087BarPFob1 ;
   private String[] T016Y18_A10088BarPFTxt ;
   private boolean[] T016Y18_n10088BarPFTxt ;
   private String[] T016Y18_A10089BarPFVin ;
   private boolean[] T016Y18_n10089BarPFVin ;
   private short[] T016Y18_A10258Itm_ord3 ;
   private boolean[] T016Y18_n10258Itm_ord3 ;
   private String[] T016Y18_A396EmprCod ;
   private short[] T016Y18_A10084BarPFcod ;
   private String[] T016Y18_A758ProCod ;
   private String[] T016Y4_A10085BarPFdsc ;
   private boolean[] T016Y4_n10085BarPFdsc ;
   private String[] T016Y19_A10085BarPFdsc ;
   private boolean[] T016Y19_n10085BarPFdsc ;
   private String[] T016Y20_A396EmprCod ;
   private int[] T016Y20_A129BarCod ;
   private byte[] T016Y20_A132BarCodReo ;
   private String[] T016Y20_A130BarCodPar ;
   private String[] T016Y20_A758ProCod ;
   private short[] T016Y20_A194BarOrdLin ;
   private int[] T016Y20_A4643BarFasLot ;
   private short[] T016Y20_A10084BarPFcod ;
   private int[] T016Y3_A129BarCod ;
   private byte[] T016Y3_A132BarCodReo ;
   private String[] T016Y3_A130BarCodPar ;
   private short[] T016Y3_A194BarOrdLin ;
   private int[] T016Y3_A4643BarFasLot ;
   private String[] T016Y3_A10086BarPFVal ;
   private boolean[] T016Y3_n10086BarPFVal ;
   private String[] T016Y3_A10087BarPFob1 ;
   private boolean[] T016Y3_n10087BarPFob1 ;
   private String[] T016Y3_A10088BarPFTxt ;
   private boolean[] T016Y3_n10088BarPFTxt ;
   private String[] T016Y3_A10089BarPFVin ;
   private boolean[] T016Y3_n10089BarPFVin ;
   private short[] T016Y3_A10258Itm_ord3 ;
   private boolean[] T016Y3_n10258Itm_ord3 ;
   private String[] T016Y3_A396EmprCod ;
   private short[] T016Y3_A10084BarPFcod ;
   private String[] T016Y3_A758ProCod ;
   private int[] T016Y2_A129BarCod ;
   private byte[] T016Y2_A132BarCodReo ;
   private String[] T016Y2_A130BarCodPar ;
   private short[] T016Y2_A194BarOrdLin ;
   private int[] T016Y2_A4643BarFasLot ;
   private String[] T016Y2_A10086BarPFVal ;
   private boolean[] T016Y2_n10086BarPFVal ;
   private String[] T016Y2_A10087BarPFob1 ;
   private boolean[] T016Y2_n10087BarPFob1 ;
   private String[] T016Y2_A10088BarPFTxt ;
   private boolean[] T016Y2_n10088BarPFTxt ;
   private String[] T016Y2_A10089BarPFVin ;
   private boolean[] T016Y2_n10089BarPFVin ;
   private short[] T016Y2_A10258Itm_ord3 ;
   private boolean[] T016Y2_n10258Itm_ord3 ;
   private String[] T016Y2_A396EmprCod ;
   private short[] T016Y2_A10084BarPFcod ;
   private String[] T016Y2_A758ProCod ;
   private String[] T016Y24_A10085BarPFdsc ;
   private boolean[] T016Y24_n10085BarPFdsc ;
   private String[] T016Y25_A396EmprCod ;
   private int[] T016Y25_A129BarCod ;
   private byte[] T016Y25_A132BarCodReo ;
   private String[] T016Y25_A130BarCodPar ;
   private String[] T016Y25_A758ProCod ;
   private short[] T016Y25_A194BarOrdLin ;
   private int[] T016Y25_A4643BarFasLot ;
   private short[] T016Y25_A10084BarPFcod ;
   private String[] T016Y26_A407EmprNom ;
   private boolean[] T016Y26_n407EmprNom ;
   private String[] T016Y27_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfaspfac__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspfac__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspfac__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspfac__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspfac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016Y2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarPFVal, BarPFob1, BarPFTxt, BarPFVin, Itm_ord3, EmprCod, BarPFcod, ProCod FROM TXPFASPFA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND BarPFcod = ?  FOR UPDATE OF BarPFVal, BarPFob1, BarPFTxt, BarPFVin, Itm_ord3 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Y3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarPFVal, BarPFob1, BarPFTxt, BarPFVin, Itm_ord3, EmprCod, BarPFcod, ProCod FROM TXPFASPFA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND BarPFcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Y4", "SELECT ParFasDsc AS BarPFdsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y5", "SELECT BarFasLot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?  FOR UPDATE OF BarFasLot NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y6", "SELECT BarFasLot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y8", "SELECT EmprCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y9", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarFasLot, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin FROM (TXPFASMAQ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.BarFasLot = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.BarFasLot ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, BarFasLot DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016Y13", "INSERT INTO TXPFASMAQ(BarFasLot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ')", GX_NOMASK, "TXPFASMAQ")
         ,new UpdateCursor("T016Y14", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK, "TXPFASMAQ")
         ,new ForEachCursor("T016Y15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, DataReg, Turno, Seccao, FuncCod FROM TXPContPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd FROM TXPAGHDFP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Y18", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.BarFasLot, T2.ParFasDsc AS BarPFdsc, T1.BarPFVal, T1.BarPFob1, T1.BarPFTxt, T1.BarPFVin, T1.Itm_ord3, T1.EmprCod, T1.BarPFcod AS BarPFcod, T1.ProCod FROM (TXPFASPFA T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.BarPFcod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.BarFasLot = ? and T1.BarPFcod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.BarFasLot, T1.BarPFcod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Y19", "SELECT ParFasDsc AS BarPFdsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Y20", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod FROM TXPFASPFA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND BarPFcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016Y21", "INSERT INTO TXPFASPFA(BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarPFVal, BarPFob1, BarPFTxt, BarPFVin, Itm_ord3, EmprCod, BarPFcod, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFASPFA")
         ,new UpdateCursor("T016Y22", "UPDATE TXPFASPFA SET BarPFVal=?, BarPFob1=?, BarPFTxt=?, BarPFVin=?, Itm_ord3=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND BarPFcod = ?", GX_NOMASK, "TXPFASPFA")
         ,new UpdateCursor("T016Y23", "DELETE FROM TXPFASPFA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND BarPFcod = ?", GX_NOMASK, "TXPFASPFA")
         ,new ForEachCursor("T016Y24", "SELECT ParFasDsc AS BarPFdsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Y25", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod FROM TXPFASPFA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Y26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Y27", "SELECT EmprCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 3);
               ((short[]) buf[18])[0] = rslt.getShort(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
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
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 60);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[10], 400);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               stmt.setString(11, (String)parms[15], 3);
               stmt.setShort(12, ((Number) parms[16]).shortValue());
               stmt.setString(13, (String)parms[17], 8);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 60);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 400);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setString(10, (String)parms[14], 8);
               stmt.setShort(11, ((Number) parms[15]).shortValue());
               stmt.setInt(12, ((Number) parms[16]).intValue());
               stmt.setShort(13, ((Number) parms[17]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

