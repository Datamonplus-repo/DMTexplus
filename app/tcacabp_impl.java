package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcacabp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         n652OpeCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A652OpeCod) ;
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
            A9940Ab_cod = httpContext.GetPar( "Ab_cod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
            A457FasCod = httpContext.GetPar( "FasCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CAPTURA PARAMETROS PERCHA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAb_ult_Internalname ;
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

   public tcacabp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcacabp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcacabp_impl.class ));
   }

   public tcacabp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCACABp.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Codigo Seccion Actividad", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_cod_Internalname, GXutil.rtrim( A9940Ab_cod), GXutil.rtrim( localUtil.format( A9940Ab_cod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_cod_Jsonclick, 0, "", "", "", "", "", 1, edtAb_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACABp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_ult_Internalname, GXutil.ltrim( localUtil.ntoc( A9960Ab_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_ult_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9960Ab_ult), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9960Ab_ult), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_ult_Jsonclick, 0, "", "", "", "", "", 1, edtAb_ult_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCACABp.htm");
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
         nBlankRcdCount1323 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1323 = (short)(1) ;
            scanStart15Y1323( ) ;
            while ( RcdFound1323 != 0 )
            {
               init_level_properties1323( ) ;
               getByPrimaryKey15Y1323( ) ;
               addRow15Y1323( ) ;
               scanNext15Y1323( ) ;
            }
            scanEnd15Y1323( ) ;
            nBlankRcdCount1323 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal15Y1323( ) ;
         standaloneModal15Y1323( ) ;
         sMode1323 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow15Y1323( ) ;
            edtavnRcdDeleted_1323_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1323_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1323_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1323_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAb_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_LIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAb_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAb_car_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_CAR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAb_car_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_car_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAb_des_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_DES_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAb_des_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_des_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAb_lmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_LMP_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAb_lmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_lmp_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtAb_dia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_DIA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAb_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_dia_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1323 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal15Y1323( ) ;
            }
            sendRow15Y1323( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1323 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1323 = (short)(5) ;
         nRcdExists_1323 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart15Y1323( ) ;
            while ( RcdFound1323 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801323( ) ;
               init_level_properties1323( ) ;
               standaloneNotModal15Y1323( ) ;
               getByPrimaryKey15Y1323( ) ;
               standaloneModal15Y1323( ) ;
               addRow15Y1323( ) ;
               scanNext15Y1323( ) ;
            }
            scanEnd15Y1323( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1323 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801323( ) ;
      initAll15Y1323( ) ;
      init_level_properties1323( ) ;
      nRcdExists_1323 = (short)(0) ;
      nIsMod_1323 = (short)(0) ;
      nRcdDeleted_1323 = (short)(0) ;
      nBlankRcdCount1323 = (short)(nBlankRcdUsr1323+nBlankRcdCount1323) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1323 > 0 )
      {
         standaloneNotModal15Y1323( ) ;
         standaloneModal15Y1323( ) ;
         addRow15Y1323( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAb_lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1323 = (short)(nBlankRcdCount1323-1) ;
      }
      Gx_mode = sMode1323 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACABp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCACABp.htm");
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
      e1115Y2 ();
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
            Z9940Ab_cod = httpContext.cgiGet( "Z9940Ab_cod") ;
            Z9960Ab_ult = (int)(localUtil.ctol( httpContext.cgiGet( "Z9960Ab_ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A9940Ab_cod = httpContext.cgiGet( edtAb_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAb_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAb_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_ULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9960Ab_ult = 0 ;
               n9960Ab_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9960Ab_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9960Ab_ult), 6, 0));
            }
            else
            {
               A9960Ab_ult = (int)(localUtil.ctol( httpContext.cgiGet( edtAb_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9960Ab_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9960Ab_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9960Ab_ult), 6, 0));
            }
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
               A9940Ab_cod = httpContext.GetPar( "Ab_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
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
                        e1115Y2 ();
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
            initAll15Y1322( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1323_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1323_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes15Y1322( ) ;
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

   public void confirm_15Y0( )
   {
      beforeValidate15Y1322( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15Y1322( ) ;
         }
         else
         {
            checkExtendedTable15Y1322( ) ;
            if ( AnyError == 0 )
            {
               zm15Y1322( 2) ;
               zm15Y1322( 3) ;
               zm15Y1322( 4) ;
               zm15Y1322( 5) ;
               zm15Y1322( 6) ;
            }
            closeExtendedTableCursors15Y1322( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1322 = Gx_mode ;
         confirm_15Y1323( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1322 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1322 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues15Y0( ) ;
      }
   }

   public void confirm_15Y1323( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow15Y1323( ) ;
         if ( ( nRcdExists_1323 != 0 ) || ( nIsMod_1323 != 0 ) )
         {
            getKey15Y1323( ) ;
            if ( ( nRcdExists_1323 == 0 ) && ( nRcdDeleted_1323 == 0 ) )
            {
               if ( RcdFound1323 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate15Y1323( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable15Y1323( ) ;
                     if ( AnyError == 0 )
                     {
                        zm15Y1323( 8) ;
                     }
                     closeExtendedTableCursors15Y1323( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "AB_LIN_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAb_lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1323 != 0 )
               {
                  if ( nRcdDeleted_1323 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey15Y1323( ) ;
                     load15Y1323( ) ;
                     beforeValidate15Y1323( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls15Y1323( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1323 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate15Y1323( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable15Y1323( ) ;
                           if ( AnyError == 0 )
                           {
                              zm15Y1323( 8) ;
                           }
                           closeExtendedTableCursors15Y1323( ) ;
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
                  if ( nRcdDeleted_1323 == 0 )
                  {
                     GXCCtl = "AB_LIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAb_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1323_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAb_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A9961Ab_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAb_car_Internalname, GXutil.rtrim( A9962Ab_car)) ;
         httpContext.changePostValue( edtAb_des_Internalname, GXutil.rtrim( A9963Ab_des)) ;
         httpContext.changePostValue( edtAb_lmp_Internalname, GXutil.rtrim( A9964Ab_lmp)) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAb_dia_Internalname, localUtil.ttoc( A9965Ab_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9961Ab_lin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9961Ab_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9962Ab_car_"+sGXsfl_80_idx, GXutil.rtrim( Z9962Ab_car)) ;
         httpContext.changePostValue( "ZT_"+"Z9963Ab_des_"+sGXsfl_80_idx, GXutil.rtrim( Z9963Ab_des)) ;
         httpContext.changePostValue( "ZT_"+"Z9964Ab_lmp_"+sGXsfl_80_idx, GXutil.rtrim( Z9964Ab_lmp)) ;
         httpContext.changePostValue( "ZT_"+"Z9965Ab_dia_"+sGXsfl_80_idx, localUtil.ttoc( Z9965Ab_dia, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1323_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1323_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1323_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1323 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1323_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1323_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_LIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_CAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_car_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_DES_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_des_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_LMP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_lmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_DIA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_dia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption15Y0( )
   {
   }

   public void e1115Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "BARCODC", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT15_", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASCODC", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "PARFASCODC", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN461_", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      tcacabp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit10", AV21Lit10);
      AV22Lit11 = httpContext.getMessage( "Nº de veces limpiar  baño", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit11", AV22Lit11);
      AV23Lit12 = httpContext.getMessage( "Nº de veces cambiar cuchillas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit12", AV23Lit12);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcacabp_impl.this.A396EmprCod = GXv_char2[0] ;
      tcacabp_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcacabp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm15Y1322( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9960Ab_ult = T015Y6_A9960Ab_ult[0] ;
         }
         else
         {
            Z9960Ab_ult = A9960Ab_ult ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z9960Ab_ult = A9960Ab_ult ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z9940Ab_cod = A9940Ab_cod ;
         Z407EmprNom = A407EmprNom ;
         Z759ProDsc = A759ProDsc ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TCACABp" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      /* Using cursor T015Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015Y7_A407EmprNom[0] ;
      n407EmprNom = T015Y7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T015Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T015Y8_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
      /* Using cursor T015Y9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      /* Using cursor T015Y10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A9940Ab_cod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ACTAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "AB_COD");
         AnyError = (short)(1) ;
      }
      pr_default.close(8);
      /* Using cursor T015Y11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T015Y11_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
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

   public void load15Y1322( )
   {
      /* Using cursor T015Y12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1322 = (short)(1) ;
         A407EmprNom = T015Y12_A407EmprNom[0] ;
         n407EmprNom = T015Y12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A759ProDsc = T015Y12_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T015Y12_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A9960Ab_ult = T015Y12_A9960Ab_ult[0] ;
         n9960Ab_ult = T015Y12_n9960Ab_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9960Ab_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9960Ab_ult), 6, 0));
         zm15Y1322( -1) ;
      }
      pr_default.close(10);
      onLoadActions15Y1322( ) ;
   }

   public void onLoadActions15Y1322( )
   {
   }

   public void checkExtendedTable15Y1322( )
   {
      nIsDirty_1322 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors15Y1322( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15Y1322( )
   {
      /* Using cursor T015Y13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1322 = (short)(1) ;
      }
      else
      {
         RcdFound1322 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015Y6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T015Y6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015Y6_A129BarCod[0] == A129BarCod ) && ( T015Y6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015Y6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015Y6_A758ProCod[0], A758ProCod) == 0 ) && ( T015Y6_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015Y6_A9940Ab_cod[0], A9940Ab_cod) == 0 ) )
      {
         zm15Y1322( 1) ;
         RcdFound1322 = (short)(1) ;
         A9960Ab_ult = T015Y6_A9960Ab_ult[0] ;
         n9960Ab_ult = T015Y6_n9960Ab_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9960Ab_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9960Ab_ult), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z9940Ab_cod = A9940Ab_cod ;
         sMode1322 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15Y1322( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1322 = (short)(0) ;
            initializeNonKey15Y1322( ) ;
         }
         Gx_mode = sMode1322 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1322 = (short)(0) ;
         initializeNonKey15Y1322( ) ;
         sMode1322 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1322 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey15Y1322( ) ;
      if ( RcdFound1322 == 0 )
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
      RcdFound1322 = (short)(0) ;
      /* Using cursor T015Y14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T015Y14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015Y14_A129BarCod[0] == A129BarCod ) && ( T015Y14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015Y14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015Y14_A758ProCod[0], A758ProCod) == 0 ) && ( T015Y14_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015Y14_A9940Ab_cod[0], A9940Ab_cod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T015Y14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015Y14_A129BarCod[0] == A129BarCod ) && ( T015Y14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015Y14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015Y14_A758ProCod[0], A758ProCod) == 0 ) && ( T015Y14_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015Y14_A9940Ab_cod[0], A9940Ab_cod) == 0 ) )
         {
            RcdFound1322 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1322 = (short)(0) ;
      /* Using cursor T015Y15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T015Y15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015Y15_A129BarCod[0] == A129BarCod ) && ( T015Y15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015Y15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015Y15_A758ProCod[0], A758ProCod) == 0 ) && ( T015Y15_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015Y15_A9940Ab_cod[0], A9940Ab_cod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T015Y15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015Y15_A129BarCod[0] == A129BarCod ) && ( T015Y15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015Y15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015Y15_A758ProCod[0], A758ProCod) == 0 ) && ( T015Y15_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015Y15_A9940Ab_cod[0], A9940Ab_cod) == 0 ) )
         {
            RcdFound1322 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15Y1322( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAb_ult_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15Y1322( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1322 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
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
               GX_FocusControl = edtAb_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15Y1322( ) ;
               GX_FocusControl = edtAb_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtAb_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15Y1322( ) ;
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
                  GX_FocusControl = edtAb_ult_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15Y1322( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
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
         GX_FocusControl = edtAb_ult_Internalname ;
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
      getKey15Y1322( ) ;
      if ( RcdFound1322 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcacabp");
      GX_FocusControl = edtAb_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15Y0( ) ;
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
      if ( RcdFound1322 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAb_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15Y1322( ) ;
      if ( RcdFound1322 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAb_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15Y1322( ) ;
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
      if ( RcdFound1322 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAb_ult_Internalname ;
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
      if ( RcdFound1322 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAb_ult_Internalname ;
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
      scanStart15Y1322( ) ;
      if ( RcdFound1322 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1322 != 0 )
         {
            scanNext15Y1322( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAb_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15Y1322( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15Y1322( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015Y5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCACABp"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z9960Ab_ult != T015Y5_A9960Ab_ult[0] ) )
         {
            if ( Z9960Ab_ult != T015Y5_A9960Ab_ult[0] )
            {
               GXutil.writeLogln("tcacabp:[seudo value changed for attri]"+"Ab_ult");
               GXutil.writeLogRaw("Old: ",Z9960Ab_ult);
               GXutil.writeLogRaw("Current: ",T015Y5_A9960Ab_ult[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCACABp"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15Y1322( )
   {
      beforeValidate15Y1322( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15Y1322( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15Y1322( 0) ;
         checkOptimisticConcurrency15Y1322( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15Y1322( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15Y1322( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015Y16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n9960Ab_ult), Integer.valueOf(A9960Ab_ult), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACABp");
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
                        processLevel15Y1322( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption15Y0( ) ;
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
            load15Y1322( ) ;
         }
         endLevel15Y1322( ) ;
      }
      closeExtendedTableCursors15Y1322( ) ;
   }

   public void update15Y1322( )
   {
      beforeValidate15Y1322( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15Y1322( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15Y1322( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15Y1322( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15Y1322( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015Y17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n9960Ab_ult), Integer.valueOf(A9960Ab_ult), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACABp");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCACABp"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15Y1322( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15Y1322( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption15Y0( ) ;
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
         endLevel15Y1322( ) ;
      }
      closeExtendedTableCursors15Y1322( ) ;
   }

   public void deferredUpdate15Y1322( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15Y1322( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15Y1322( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15Y1322( ) ;
         afterConfirm15Y1322( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15Y1322( ) ;
            if ( AnyError == 0 )
            {
               scanStart15Y1323( ) ;
               while ( RcdFound1323 != 0 )
               {
                  getByPrimaryKey15Y1323( ) ;
                  delete15Y1323( ) ;
                  scanNext15Y1323( ) ;
               }
               scanEnd15Y1323( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015Y18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACABp");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1322 == 0 )
                        {
                           initAll15Y1322( ) ;
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
                        resetCaption15Y0( ) ;
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
      sMode1322 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15Y1322( ) ;
      Gx_mode = sMode1322 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15Y1322( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel15Y1323( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow15Y1323( ) ;
         if ( ( nRcdExists_1323 != 0 ) || ( nIsMod_1323 != 0 ) )
         {
            standaloneNotModal15Y1323( ) ;
            getKey15Y1323( ) ;
            if ( ( nRcdExists_1323 == 0 ) && ( nRcdDeleted_1323 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert15Y1323( ) ;
            }
            else
            {
               if ( RcdFound1323 != 0 )
               {
                  if ( ( nRcdDeleted_1323 != 0 ) && ( nRcdExists_1323 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete15Y1323( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1323 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update15Y1323( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1323 == 0 )
                  {
                     GXCCtl = "AB_LIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAb_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1323_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAb_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A9961Ab_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAb_car_Internalname, GXutil.rtrim( A9962Ab_car)) ;
         httpContext.changePostValue( edtAb_des_Internalname, GXutil.rtrim( A9963Ab_des)) ;
         httpContext.changePostValue( edtAb_lmp_Internalname, GXutil.rtrim( A9964Ab_lmp)) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAb_dia_Internalname, localUtil.ttoc( A9965Ab_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9961Ab_lin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9961Ab_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9962Ab_car_"+sGXsfl_80_idx, GXutil.rtrim( Z9962Ab_car)) ;
         httpContext.changePostValue( "ZT_"+"Z9963Ab_des_"+sGXsfl_80_idx, GXutil.rtrim( Z9963Ab_des)) ;
         httpContext.changePostValue( "ZT_"+"Z9964Ab_lmp_"+sGXsfl_80_idx, GXutil.rtrim( Z9964Ab_lmp)) ;
         httpContext.changePostValue( "ZT_"+"Z9965Ab_dia_"+sGXsfl_80_idx, localUtil.ttoc( Z9965Ab_dia, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1323_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1323_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1323_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1323 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1323_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1323_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_LIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_CAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_car_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_DES_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_des_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_LMP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_lmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AB_DIA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_dia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll15Y1323( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1323 = (short)(0) ;
      nIsMod_1323 = (short)(0) ;
      nRcdDeleted_1323 = (short)(0) ;
   }

   public void processLevel15Y1322( )
   {
      /* Save parent mode. */
      sMode1322 = Gx_mode ;
      processNestedLevel15Y1323( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1322 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel15Y1322( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15Y1322( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcacabp");
         if ( AnyError == 0 )
         {
            confirmValues15Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcacabp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15Y1322( )
   {
      /* Scan By routine */
      /* Using cursor T015Y19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
      RcdFound1322 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1322 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15Y1322( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1322 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1322 = (short)(1) ;
      }
   }

   public void scanEnd15Y1322( )
   {
      pr_default.close(17);
   }

   public void afterConfirm15Y1322( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15Y1322( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15Y1322( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15Y1322( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15Y1322( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15Y1322( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15Y1322( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtAb_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_cod_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtAb_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_ult_Enabled), 5, 0), true);
   }

   public void zm15Y1323( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9962Ab_car = T015Y3_A9962Ab_car[0] ;
            Z9963Ab_des = T015Y3_A9963Ab_des[0] ;
            Z9964Ab_lmp = T015Y3_A9964Ab_lmp[0] ;
            Z9965Ab_dia = T015Y3_A9965Ab_dia[0] ;
            Z652OpeCod = T015Y3_A652OpeCod[0] ;
         }
         else
         {
            Z9962Ab_car = A9962Ab_car ;
            Z9963Ab_des = A9963Ab_des ;
            Z9964Ab_lmp = A9964Ab_lmp ;
            Z9965Ab_dia = A9965Ab_dia ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z9940Ab_cod = A9940Ab_cod ;
         Z9961Ab_lin = A9961Ab_lin ;
         Z9962Ab_car = A9962Ab_car ;
         Z9963Ab_des = A9963Ab_des ;
         Z9964Ab_lmp = A9964Ab_lmp ;
         Z9965Ab_dia = A9965Ab_dia ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModal15Y1323( )
   {
   }

   public void standaloneModal15Y1323( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAb_lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAb_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtAb_lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAb_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load15Y1323( )
   {
      /* Using cursor T015Y20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod, Integer.valueOf(A9961Ab_lin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1323 = (short)(1) ;
         A9962Ab_car = T015Y20_A9962Ab_car[0] ;
         n9962Ab_car = T015Y20_n9962Ab_car[0] ;
         A9963Ab_des = T015Y20_A9963Ab_des[0] ;
         n9963Ab_des = T015Y20_n9963Ab_des[0] ;
         A9964Ab_lmp = T015Y20_A9964Ab_lmp[0] ;
         n9964Ab_lmp = T015Y20_n9964Ab_lmp[0] ;
         A9965Ab_dia = T015Y20_A9965Ab_dia[0] ;
         n9965Ab_dia = T015Y20_n9965Ab_dia[0] ;
         A652OpeCod = T015Y20_A652OpeCod[0] ;
         n652OpeCod = T015Y20_n652OpeCod[0] ;
         zm15Y1323( -7) ;
      }
      pr_default.close(18);
      onLoadActions15Y1323( ) ;
   }

   public void onLoadActions15Y1323( )
   {
   }

   public void checkExtendedTable15Y1323( )
   {
      nIsDirty_1323 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal15Y1323( ) ;
      /* Using cursor T015Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors15Y1323( )
   {
      pr_default.close(2);
   }

   public void enableDisable15Y1323( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A652OpeCod )
   {
      /* Using cursor T015Y21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey15Y1323( )
   {
      /* Using cursor T015Y22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod, Integer.valueOf(A9961Ab_lin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1323 = (short)(1) ;
      }
      else
      {
         RcdFound1323 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey15Y1323( )
   {
      /* Using cursor T015Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod, Integer.valueOf(A9961Ab_lin)});
      if ( (pr_default.getStatus(1) != 101) && ( T015Y3_A129BarCod[0] == A129BarCod ) && ( T015Y3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015Y3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T015Y3_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015Y3_A9940Ab_cod[0], A9940Ab_cod) == 0 ) && ( GXutil.strcmp(T015Y3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015Y3_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm15Y1323( 7) ;
         RcdFound1323 = (short)(1) ;
         initializeNonKey15Y1323( ) ;
         A9961Ab_lin = T015Y3_A9961Ab_lin[0] ;
         A9962Ab_car = T015Y3_A9962Ab_car[0] ;
         n9962Ab_car = T015Y3_n9962Ab_car[0] ;
         A9963Ab_des = T015Y3_A9963Ab_des[0] ;
         n9963Ab_des = T015Y3_n9963Ab_des[0] ;
         A9964Ab_lmp = T015Y3_A9964Ab_lmp[0] ;
         n9964Ab_lmp = T015Y3_n9964Ab_lmp[0] ;
         A9965Ab_dia = T015Y3_A9965Ab_dia[0] ;
         n9965Ab_dia = T015Y3_n9965Ab_dia[0] ;
         A652OpeCod = T015Y3_A652OpeCod[0] ;
         n652OpeCod = T015Y3_n652OpeCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z9940Ab_cod = A9940Ab_cod ;
         Z9961Ab_lin = A9961Ab_lin ;
         sMode1323 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15Y1323( ) ;
         load15Y1323( ) ;
         Gx_mode = sMode1323 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1323 = (short)(0) ;
         initializeNonKey15Y1323( ) ;
         sMode1323 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15Y1323( ) ;
         Gx_mode = sMode1323 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes15Y1323( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency15Y1323( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod, Integer.valueOf(A9961Ab_lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCACAB1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9962Ab_car, T015Y2_A9962Ab_car[0]) != 0 ) || ( GXutil.strcmp(Z9963Ab_des, T015Y2_A9963Ab_des[0]) != 0 ) || ( GXutil.strcmp(Z9964Ab_lmp, T015Y2_A9964Ab_lmp[0]) != 0 ) || !( GXutil.dateCompare(Z9965Ab_dia, T015Y2_A9965Ab_dia[0]) ) || ( Z652OpeCod != T015Y2_A652OpeCod[0] ) )
         {
            if ( GXutil.strcmp(Z9962Ab_car, T015Y2_A9962Ab_car[0]) != 0 )
            {
               GXutil.writeLogln("tcacabp:[seudo value changed for attri]"+"Ab_car");
               GXutil.writeLogRaw("Old: ",Z9962Ab_car);
               GXutil.writeLogRaw("Current: ",T015Y2_A9962Ab_car[0]);
            }
            if ( GXutil.strcmp(Z9963Ab_des, T015Y2_A9963Ab_des[0]) != 0 )
            {
               GXutil.writeLogln("tcacabp:[seudo value changed for attri]"+"Ab_des");
               GXutil.writeLogRaw("Old: ",Z9963Ab_des);
               GXutil.writeLogRaw("Current: ",T015Y2_A9963Ab_des[0]);
            }
            if ( GXutil.strcmp(Z9964Ab_lmp, T015Y2_A9964Ab_lmp[0]) != 0 )
            {
               GXutil.writeLogln("tcacabp:[seudo value changed for attri]"+"Ab_lmp");
               GXutil.writeLogRaw("Old: ",Z9964Ab_lmp);
               GXutil.writeLogRaw("Current: ",T015Y2_A9964Ab_lmp[0]);
            }
            if ( !( GXutil.dateCompare(Z9965Ab_dia, T015Y2_A9965Ab_dia[0]) ) )
            {
               GXutil.writeLogln("tcacabp:[seudo value changed for attri]"+"Ab_dia");
               GXutil.writeLogRaw("Old: ",Z9965Ab_dia);
               GXutil.writeLogRaw("Current: ",T015Y2_A9965Ab_dia[0]);
            }
            if ( Z652OpeCod != T015Y2_A652OpeCod[0] )
            {
               GXutil.writeLogln("tcacabp:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T015Y2_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCACAB1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15Y1323( )
   {
      beforeValidate15Y1323( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15Y1323( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15Y1323( 0) ;
         checkOptimisticConcurrency15Y1323( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15Y1323( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15Y1323( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015Y23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), A9940Ab_cod, Integer.valueOf(A9961Ab_lin), Boolean.valueOf(n9962Ab_car), A9962Ab_car, Boolean.valueOf(n9963Ab_des), A9963Ab_des, Boolean.valueOf(n9964Ab_lmp), A9964Ab_lmp, Boolean.valueOf(n9965Ab_dia), A9965Ab_dia, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACAB1");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load15Y1323( ) ;
         }
         endLevel15Y1323( ) ;
      }
      closeExtendedTableCursors15Y1323( ) ;
   }

   public void update15Y1323( )
   {
      beforeValidate15Y1323( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15Y1323( ) ;
      }
      if ( ( nIsMod_1323 != 0 ) || ( nIsDirty_1323 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency15Y1323( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm15Y1323( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate15Y1323( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015Y24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n9962Ab_car), A9962Ab_car, Boolean.valueOf(n9963Ab_des), A9963Ab_des, Boolean.valueOf(n9964Ab_lmp), A9964Ab_lmp, Boolean.valueOf(n9965Ab_dia), A9965Ab_dia, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod, Integer.valueOf(A9961Ab_lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACAB1");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCACAB1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate15Y1323( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey15Y1323( ) ;
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
            endLevel15Y1323( ) ;
         }
      }
      closeExtendedTableCursors15Y1323( ) ;
   }

   public void deferredUpdate15Y1323( )
   {
   }

   public void delete15Y1323( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15Y1323( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15Y1323( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15Y1323( ) ;
         afterConfirm15Y1323( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15Y1323( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015Y25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod, Integer.valueOf(A9961Ab_lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACAB1");
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
      sMode1323 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15Y1323( ) ;
      Gx_mode = sMode1323 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15Y1323( )
   {
      standaloneModal15Y1323( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel15Y1323( )
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

   public void scanStart15Y1323( )
   {
      /* Scan By routine */
      /* Using cursor T015Y26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9940Ab_cod});
      RcdFound1323 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1323 = (short)(1) ;
         A9961Ab_lin = T015Y26_A9961Ab_lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15Y1323( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1323 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1323 = (short)(1) ;
         A9961Ab_lin = T015Y26_A9961Ab_lin[0] ;
      }
   }

   public void scanEnd15Y1323( )
   {
      pr_default.close(24);
   }

   public void afterConfirm15Y1323( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15Y1323( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15Y1323( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15Y1323( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15Y1323( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15Y1323( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15Y1323( )
   {
      edtAb_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAb_car_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_car_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_car_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAb_des_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_des_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_des_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAb_lmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_lmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_lmp_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtAb_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_dia_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes15Y1323( )
   {
   }

   public void send_integrity_lvl_hashes15Y1322( )
   {
   }

   public void subsflControlProps_801323( )
   {
      edtavnRcdDeleted_1323_Internalname = "vNRCDDELETED_1323_"+sGXsfl_80_idx ;
      edtAb_lin_Internalname = "AB_LIN_"+sGXsfl_80_idx ;
      edtAb_car_Internalname = "AB_CAR_"+sGXsfl_80_idx ;
      edtAb_des_Internalname = "AB_DES_"+sGXsfl_80_idx ;
      edtAb_lmp_Internalname = "AB_LMP_"+sGXsfl_80_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_80_idx ;
      edtAb_dia_Internalname = "AB_DIA_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801323( )
   {
      edtavnRcdDeleted_1323_Internalname = "vNRCDDELETED_1323_"+sGXsfl_80_fel_idx ;
      edtAb_lin_Internalname = "AB_LIN_"+sGXsfl_80_fel_idx ;
      edtAb_car_Internalname = "AB_CAR_"+sGXsfl_80_fel_idx ;
      edtAb_des_Internalname = "AB_DES_"+sGXsfl_80_fel_idx ;
      edtAb_lmp_Internalname = "AB_LMP_"+sGXsfl_80_fel_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_80_fel_idx ;
      edtAb_dia_Internalname = "AB_DIA_"+sGXsfl_80_fel_idx ;
   }

   public void addRow15Y1323( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801323( ) ;
      sendRow15Y1323( ) ;
   }

   public void sendRow15Y1323( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1323_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1323_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1323_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1323), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1323), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1323_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1323_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1323_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAb_lin_Internalname,GXutil.ltrim( localUtil.ntoc( A9961Ab_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9961Ab_lin), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAb_lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAb_lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1323_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAb_car_Internalname,GXutil.rtrim( A9962Ab_car),GXutil.rtrim( localUtil.format( A9962Ab_car, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAb_car_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAb_car_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1323_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAb_des_Internalname,GXutil.rtrim( A9963Ab_des),GXutil.rtrim( localUtil.format( A9963Ab_des, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAb_des_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAb_des_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1323_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAb_lmp_Internalname,GXutil.rtrim( A9964Ab_lmp),GXutil.rtrim( localUtil.format( A9964Ab_lmp, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAb_lmp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAb_lmp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1323_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOpeCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1323_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAb_dia_Internalname,localUtil.ttoc( A9965Ab_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9965Ab_dia, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAb_dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAb_dia_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes15Y1323( ) ;
      GXCCtl = "Z9961Ab_lin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9961Ab_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9962Ab_car_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9962Ab_car));
      GXCCtl = "Z9963Ab_des_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9963Ab_des));
      GXCCtl = "Z9964Ab_lmp_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9964Ab_lmp));
      GXCCtl = "Z9965Ab_dia_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z9965Ab_dia, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z652OpeCod_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1323_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1323_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1323_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1323, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1323_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1323_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AB_LIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AB_CAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_car_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AB_DES_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_des_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AB_LMP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_lmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AB_DIA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_dia_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow15Y1323( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801323( ) ;
      edtavnRcdDeleted_1323_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1323_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAb_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_LIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAb_car_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_CAR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAb_des_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_DES_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAb_lmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_LMP_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAb_dia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AB_DIA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1323_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1323_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1323");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1323_Internalname ;
         wbErr = true ;
         nRcdDeleted_1323 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1323 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1323_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAb_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAb_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AB_LIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAb_lin_Internalname ;
         wbErr = true ;
         A9961Ab_lin = 0 ;
      }
      else
      {
         A9961Ab_lin = (int)(localUtil.ctol( httpContext.cgiGet( edtAb_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9962Ab_car = GXutil.upper( httpContext.cgiGet( edtAb_car_Internalname)) ;
      n9962Ab_car = false ;
      A9963Ab_des = GXutil.upper( httpContext.cgiGet( edtAb_des_Internalname)) ;
      n9963Ab_des = false ;
      A9964Ab_lmp = GXutil.upper( httpContext.cgiGet( edtAb_lmp_Internalname)) ;
      n9964Ab_lmp = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         wbErr = true ;
         A652OpeCod = 0 ;
         n652OpeCod = false ;
      }
      else
      {
         A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n652OpeCod = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtAb_dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "AB_DIA_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAb_dia_Internalname ;
         wbErr = true ;
         A9965Ab_dia = GXutil.resetTime( GXutil.nullDate() );
         n9965Ab_dia = false ;
      }
      else
      {
         A9965Ab_dia = localUtil.ctot( httpContext.cgiGet( edtAb_dia_Internalname)) ;
         n9965Ab_dia = false ;
      }
      GXCCtl = "Z9961Ab_lin_" + sGXsfl_80_idx ;
      Z9961Ab_lin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9962Ab_car_" + sGXsfl_80_idx ;
      Z9962Ab_car = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9963Ab_des_" + sGXsfl_80_idx ;
      Z9963Ab_des = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9964Ab_lmp_" + sGXsfl_80_idx ;
      Z9964Ab_lmp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9965Ab_dia_" + sGXsfl_80_idx ;
      Z9965Ab_dia = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z652OpeCod_" + sGXsfl_80_idx ;
      Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1323_" + sGXsfl_80_idx ;
      nRcdDeleted_1323 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1323_" + sGXsfl_80_idx ;
      nRcdExists_1323 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1323_" + sGXsfl_80_idx ;
      nIsMod_1323 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAb_lin_Enabled = edtAb_lin_Enabled ;
   }

   public void confirmValues15Y0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801323( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801323( ) ;
         httpContext.changePostValue( "Z9961Ab_lin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9961Ab_lin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9961Ab_lin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9962Ab_car_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9962Ab_car_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9962Ab_car_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9963Ab_des_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9963Ab_des_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9963Ab_des_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9964Ab_lmp_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9964Ab_lmp_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9964Ab_lmp_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9965Ab_dia_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9965Ab_dia_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9965Ab_dia_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z652OpeCod_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z652OpeCod_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_80_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcacabp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A9940Ab_cod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","Ab_cod","FasCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9940Ab_cod", GXutil.rtrim( Z9940Ab_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9960Ab_ult", GXutil.ltrim( localUtil.ntoc( Z9960Ab_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
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
      return formatLink("app.tcacabp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A9940Ab_cod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","Ab_cod","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCACABp" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CAPTURA PARAMETROS PERCHA", "") ;
   }

   public void initializeNonKey15Y1322( )
   {
      A9960Ab_ult = 0 ;
      n9960Ab_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9960Ab_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9960Ab_ult), 6, 0));
      Z9960Ab_ult = 0 ;
   }

   public void initAll15Y1322( )
   {
      initializeNonKey15Y1322( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey15Y1323( )
   {
      A9962Ab_car = "" ;
      n9962Ab_car = false ;
      A9963Ab_des = "" ;
      n9963Ab_des = false ;
      A9964Ab_lmp = "" ;
      n9964Ab_lmp = false ;
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      A9965Ab_dia = GXutil.resetTime( GXutil.nullDate() );
      n9965Ab_dia = false ;
      Z9962Ab_car = "" ;
      Z9963Ab_des = "" ;
      Z9964Ab_lmp = "" ;
      Z9965Ab_dia = GXutil.resetTime( GXutil.nullDate() );
      Z652OpeCod = 0 ;
   }

   public void initAll15Y1323( )
   {
      A9961Ab_lin = 0 ;
      initializeNonKey15Y1323( ) ;
   }

   public void standaloneModalInsert15Y1323( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241544291", true, true);
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
      httpContext.AddJavascriptSource("tcacabp.js", "?20268241544291", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1323( )
   {
      edtAb_lin_Enabled = defedtAb_lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1323, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1323_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9961Ab_lin, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9962Ab_car));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_car_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9963Ab_des));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_des_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9964Ab_lmp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_lmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A9965Ab_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAb_dia_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAb_cod_Internalname = "AB_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAb_ult_Internalname = "AB_ULT" ;
      edtavnRcdDeleted_1323_Internalname = "vNRCDDELETED_1323" ;
      edtAb_lin_Internalname = "AB_LIN" ;
      edtAb_car_Internalname = "AB_CAR" ;
      edtAb_des_Internalname = "AB_DES" ;
      edtAb_lmp_Internalname = "AB_LMP" ;
      edtOpeCod_Internalname = "OPECOD" ;
      edtAb_dia_Internalname = "AB_DIA" ;
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
      Form.setCaption( httpContext.getMessage( "CAPTURA PARAMETROS PERCHA", "") );
      edtAb_dia_Jsonclick = "" ;
      edtOpeCod_Jsonclick = "" ;
      edtAb_lmp_Jsonclick = "" ;
      edtAb_des_Jsonclick = "" ;
      edtAb_car_Jsonclick = "" ;
      edtAb_lin_Jsonclick = "" ;
      edtavnRcdDeleted_1323_Jsonclick = "" ;
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
      edtAb_dia_Enabled = 1 ;
      edtOpeCod_Enabled = 1 ;
      edtAb_lmp_Enabled = 1 ;
      edtAb_des_Enabled = 1 ;
      edtAb_car_Enabled = 1 ;
      edtAb_lin_Enabled = 1 ;
      edtavnRcdDeleted_1323_Enabled = 1 ;
      edtAb_ult_Jsonclick = "" ;
      edtAb_ult_Backcolor = (int)(0xFFFFFF) ;
      edtAb_ult_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAb_cod_Jsonclick = "" ;
      edtAb_cod_Backcolor = (int)(0xFFFFFF) ;
      edtAb_cod_Enabled = 0 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
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
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_801323( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal15Y1323( ) ;
         standaloneModal15Y1323( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow15Y1323( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801323( ) ;
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
      /* Using cursor T015Y27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015Y27_A407EmprNom[0] ;
      n407EmprNom = T015Y27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T015Y28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T015Y28_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(26);
      /* Using cursor T015Y29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      A457FasCod = T015Y29_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      pr_default.close(27);
      /* Using cursor T015Y30 */
      pr_default.execute(28, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T015Y30_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(28);
      /* Using cursor T015Y31 */
      pr_default.execute(29, new Object[] {A396EmprCod, A9940Ab_cod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ACTAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "AB_COD");
         AnyError = (short)(1) ;
      }
      pr_default.close(29);
      GX_FocusControl = edtAb_ult_Internalname ;
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

   public void valid_Ab_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9960Ab_ult", GXutil.ltrim( localUtil.ntoc( A9960Ab_ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9940Ab_cod", GXutil.rtrim( Z9940Ab_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9960Ab_ult", GXutil.ltrim( localUtil.ntoc( Z9960Ab_ult, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      /* Using cursor T015Y32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A9940Ab_cod',fld:'AB_COD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
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
      setEventMetadata("VALID_AB_COD","{handler:'valid_Ab_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A9940Ab_cod',fld:'AB_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("VALID_AB_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A9960Ab_ult',fld:'AB_ULT',pic:'ZZZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z9940Ab_cod'},{av:'Z407EmprNom'},{av:'Z759ProDsc'},{av:'Z460FasDsc'},{av:'Z9960Ab_ult'},{av:'Z457FasCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_AB_LIN","{handler:'valid_Ab_lin',iparms:[]");
      setEventMetadata("VALID_AB_LIN",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_OPECOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ab_dia',iparms:[]");
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
      pr_default.close(30);
      pr_default.close(27);
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(29);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA758ProCod = "" ;
      wcpOA9940Ab_cod = "" ;
      wcpOA457FasCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z9940Ab_cod = "" ;
      Z9962Ab_car = "" ;
      Z9963Ab_des = "" ;
      Z9964Ab_lmp = "" ;
      Z9965Ab_dia = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A9940Ab_cod = "" ;
      A457FasCod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A460FasDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1323 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV36Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1322 = "" ;
      GXCCtl = "" ;
      A9962Ab_car = "" ;
      A9963Ab_des = "" ;
      A9964Ab_lmp = "" ;
      A9965Ab_dia = GXutil.resetTime( GXutil.nullDate() );
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV13Lit9 = "" ;
      AV21Lit10 = "" ;
      GXt_char1 = "" ;
      AV22Lit11 = "" ;
      AV23Lit12 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z759ProDsc = "" ;
      Z457FasCod = "" ;
      Z460FasDsc = "" ;
      T015Y7_A407EmprNom = new String[] {""} ;
      T015Y7_n407EmprNom = new boolean[] {false} ;
      T015Y8_A759ProDsc = new String[] {""} ;
      T015Y9_A457FasCod = new String[] {""} ;
      T015Y10_A396EmprCod = new String[] {""} ;
      T015Y11_A460FasDsc = new String[] {""} ;
      T015Y12_A457FasCod = new String[] {""} ;
      T015Y12_A407EmprNom = new String[] {""} ;
      T015Y12_n407EmprNom = new boolean[] {false} ;
      T015Y12_A759ProDsc = new String[] {""} ;
      T015Y12_A460FasDsc = new String[] {""} ;
      T015Y12_A9960Ab_ult = new int[1] ;
      T015Y12_n9960Ab_ult = new boolean[] {false} ;
      T015Y12_A396EmprCod = new String[] {""} ;
      T015Y12_A129BarCod = new int[1] ;
      T015Y12_A132BarCodReo = new byte[1] ;
      T015Y12_A130BarCodPar = new String[] {""} ;
      T015Y12_A758ProCod = new String[] {""} ;
      T015Y12_A194BarOrdLin = new short[1] ;
      T015Y12_A9940Ab_cod = new String[] {""} ;
      T015Y13_A396EmprCod = new String[] {""} ;
      T015Y13_A129BarCod = new int[1] ;
      T015Y13_A132BarCodReo = new byte[1] ;
      T015Y13_A130BarCodPar = new String[] {""} ;
      T015Y13_A758ProCod = new String[] {""} ;
      T015Y13_A194BarOrdLin = new short[1] ;
      T015Y13_A9940Ab_cod = new String[] {""} ;
      T015Y6_A9960Ab_ult = new int[1] ;
      T015Y6_n9960Ab_ult = new boolean[] {false} ;
      T015Y6_A396EmprCod = new String[] {""} ;
      T015Y6_A129BarCod = new int[1] ;
      T015Y6_A132BarCodReo = new byte[1] ;
      T015Y6_A130BarCodPar = new String[] {""} ;
      T015Y6_A758ProCod = new String[] {""} ;
      T015Y6_A194BarOrdLin = new short[1] ;
      T015Y6_A9940Ab_cod = new String[] {""} ;
      T015Y14_A396EmprCod = new String[] {""} ;
      T015Y14_A129BarCod = new int[1] ;
      T015Y14_A132BarCodReo = new byte[1] ;
      T015Y14_A130BarCodPar = new String[] {""} ;
      T015Y14_A758ProCod = new String[] {""} ;
      T015Y14_A194BarOrdLin = new short[1] ;
      T015Y14_A9940Ab_cod = new String[] {""} ;
      T015Y15_A396EmprCod = new String[] {""} ;
      T015Y15_A129BarCod = new int[1] ;
      T015Y15_A132BarCodReo = new byte[1] ;
      T015Y15_A130BarCodPar = new String[] {""} ;
      T015Y15_A758ProCod = new String[] {""} ;
      T015Y15_A194BarOrdLin = new short[1] ;
      T015Y15_A9940Ab_cod = new String[] {""} ;
      T015Y5_A9960Ab_ult = new int[1] ;
      T015Y5_n9960Ab_ult = new boolean[] {false} ;
      T015Y5_A396EmprCod = new String[] {""} ;
      T015Y5_A129BarCod = new int[1] ;
      T015Y5_A132BarCodReo = new byte[1] ;
      T015Y5_A130BarCodPar = new String[] {""} ;
      T015Y5_A758ProCod = new String[] {""} ;
      T015Y5_A194BarOrdLin = new short[1] ;
      T015Y5_A9940Ab_cod = new String[] {""} ;
      T015Y19_A396EmprCod = new String[] {""} ;
      T015Y19_A129BarCod = new int[1] ;
      T015Y19_A132BarCodReo = new byte[1] ;
      T015Y19_A130BarCodPar = new String[] {""} ;
      T015Y19_A758ProCod = new String[] {""} ;
      T015Y19_A194BarOrdLin = new short[1] ;
      T015Y19_A9940Ab_cod = new String[] {""} ;
      T015Y20_A129BarCod = new int[1] ;
      T015Y20_A132BarCodReo = new byte[1] ;
      T015Y20_A130BarCodPar = new String[] {""} ;
      T015Y20_A194BarOrdLin = new short[1] ;
      T015Y20_A9940Ab_cod = new String[] {""} ;
      T015Y20_A9961Ab_lin = new int[1] ;
      T015Y20_A9962Ab_car = new String[] {""} ;
      T015Y20_n9962Ab_car = new boolean[] {false} ;
      T015Y20_A9963Ab_des = new String[] {""} ;
      T015Y20_n9963Ab_des = new boolean[] {false} ;
      T015Y20_A9964Ab_lmp = new String[] {""} ;
      T015Y20_n9964Ab_lmp = new boolean[] {false} ;
      T015Y20_A9965Ab_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T015Y20_n9965Ab_dia = new boolean[] {false} ;
      T015Y20_A396EmprCod = new String[] {""} ;
      T015Y20_A652OpeCod = new int[1] ;
      T015Y20_n652OpeCod = new boolean[] {false} ;
      T015Y20_A758ProCod = new String[] {""} ;
      T015Y4_A396EmprCod = new String[] {""} ;
      T015Y21_A396EmprCod = new String[] {""} ;
      T015Y22_A396EmprCod = new String[] {""} ;
      T015Y22_A129BarCod = new int[1] ;
      T015Y22_A132BarCodReo = new byte[1] ;
      T015Y22_A130BarCodPar = new String[] {""} ;
      T015Y22_A758ProCod = new String[] {""} ;
      T015Y22_A194BarOrdLin = new short[1] ;
      T015Y22_A9940Ab_cod = new String[] {""} ;
      T015Y22_A9961Ab_lin = new int[1] ;
      T015Y3_A129BarCod = new int[1] ;
      T015Y3_A132BarCodReo = new byte[1] ;
      T015Y3_A130BarCodPar = new String[] {""} ;
      T015Y3_A194BarOrdLin = new short[1] ;
      T015Y3_A9940Ab_cod = new String[] {""} ;
      T015Y3_A9961Ab_lin = new int[1] ;
      T015Y3_A9962Ab_car = new String[] {""} ;
      T015Y3_n9962Ab_car = new boolean[] {false} ;
      T015Y3_A9963Ab_des = new String[] {""} ;
      T015Y3_n9963Ab_des = new boolean[] {false} ;
      T015Y3_A9964Ab_lmp = new String[] {""} ;
      T015Y3_n9964Ab_lmp = new boolean[] {false} ;
      T015Y3_A9965Ab_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T015Y3_n9965Ab_dia = new boolean[] {false} ;
      T015Y3_A396EmprCod = new String[] {""} ;
      T015Y3_A652OpeCod = new int[1] ;
      T015Y3_n652OpeCod = new boolean[] {false} ;
      T015Y3_A758ProCod = new String[] {""} ;
      T015Y2_A129BarCod = new int[1] ;
      T015Y2_A132BarCodReo = new byte[1] ;
      T015Y2_A130BarCodPar = new String[] {""} ;
      T015Y2_A194BarOrdLin = new short[1] ;
      T015Y2_A9940Ab_cod = new String[] {""} ;
      T015Y2_A9961Ab_lin = new int[1] ;
      T015Y2_A9962Ab_car = new String[] {""} ;
      T015Y2_n9962Ab_car = new boolean[] {false} ;
      T015Y2_A9963Ab_des = new String[] {""} ;
      T015Y2_n9963Ab_des = new boolean[] {false} ;
      T015Y2_A9964Ab_lmp = new String[] {""} ;
      T015Y2_n9964Ab_lmp = new boolean[] {false} ;
      T015Y2_A9965Ab_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T015Y2_n9965Ab_dia = new boolean[] {false} ;
      T015Y2_A396EmprCod = new String[] {""} ;
      T015Y2_A652OpeCod = new int[1] ;
      T015Y2_n652OpeCod = new boolean[] {false} ;
      T015Y2_A758ProCod = new String[] {""} ;
      T015Y26_A396EmprCod = new String[] {""} ;
      T015Y26_A129BarCod = new int[1] ;
      T015Y26_A132BarCodReo = new byte[1] ;
      T015Y26_A130BarCodPar = new String[] {""} ;
      T015Y26_A758ProCod = new String[] {""} ;
      T015Y26_A194BarOrdLin = new short[1] ;
      T015Y26_A9940Ab_cod = new String[] {""} ;
      T015Y26_A9961Ab_lin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T015Y27_A407EmprNom = new String[] {""} ;
      T015Y27_n407EmprNom = new boolean[] {false} ;
      T015Y28_A759ProDsc = new String[] {""} ;
      T015Y29_A457FasCod = new String[] {""} ;
      T015Y30_A460FasDsc = new String[] {""} ;
      T015Y31_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ9940Ab_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ759ProDsc = "" ;
      ZZ460FasDsc = "" ;
      ZZ457FasCod = "" ;
      T015Y32_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcacabp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcacabp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcacabp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcacabp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcacabp__default(),
         new Object[] {
             new Object[] {
            T015Y2_A129BarCod, T015Y2_A132BarCodReo, T015Y2_A130BarCodPar, T015Y2_A194BarOrdLin, T015Y2_A9940Ab_cod, T015Y2_A9961Ab_lin, T015Y2_A9962Ab_car, T015Y2_n9962Ab_car, T015Y2_A9963Ab_des, T015Y2_n9963Ab_des,
            T015Y2_A9964Ab_lmp, T015Y2_n9964Ab_lmp, T015Y2_A9965Ab_dia, T015Y2_n9965Ab_dia, T015Y2_A396EmprCod, T015Y2_A652OpeCod, T015Y2_n652OpeCod, T015Y2_A758ProCod
            }
            , new Object[] {
            T015Y3_A129BarCod, T015Y3_A132BarCodReo, T015Y3_A130BarCodPar, T015Y3_A194BarOrdLin, T015Y3_A9940Ab_cod, T015Y3_A9961Ab_lin, T015Y3_A9962Ab_car, T015Y3_n9962Ab_car, T015Y3_A9963Ab_des, T015Y3_n9963Ab_des,
            T015Y3_A9964Ab_lmp, T015Y3_n9964Ab_lmp, T015Y3_A9965Ab_dia, T015Y3_n9965Ab_dia, T015Y3_A396EmprCod, T015Y3_A652OpeCod, T015Y3_n652OpeCod, T015Y3_A758ProCod
            }
            , new Object[] {
            T015Y4_A396EmprCod
            }
            , new Object[] {
            T015Y5_A9960Ab_ult, T015Y5_n9960Ab_ult, T015Y5_A396EmprCod, T015Y5_A129BarCod, T015Y5_A132BarCodReo, T015Y5_A130BarCodPar, T015Y5_A758ProCod, T015Y5_A194BarOrdLin, T015Y5_A9940Ab_cod
            }
            , new Object[] {
            T015Y6_A9960Ab_ult, T015Y6_n9960Ab_ult, T015Y6_A396EmprCod, T015Y6_A129BarCod, T015Y6_A132BarCodReo, T015Y6_A130BarCodPar, T015Y6_A758ProCod, T015Y6_A194BarOrdLin, T015Y6_A9940Ab_cod
            }
            , new Object[] {
            T015Y7_A407EmprNom, T015Y7_n407EmprNom
            }
            , new Object[] {
            T015Y8_A759ProDsc
            }
            , new Object[] {
            T015Y9_A457FasCod
            }
            , new Object[] {
            T015Y10_A396EmprCod
            }
            , new Object[] {
            T015Y11_A460FasDsc
            }
            , new Object[] {
            T015Y12_A457FasCod, T015Y12_A407EmprNom, T015Y12_n407EmprNom, T015Y12_A759ProDsc, T015Y12_A460FasDsc, T015Y12_A9960Ab_ult, T015Y12_n9960Ab_ult, T015Y12_A396EmprCod, T015Y12_A129BarCod, T015Y12_A132BarCodReo,
            T015Y12_A130BarCodPar, T015Y12_A758ProCod, T015Y12_A194BarOrdLin, T015Y12_A9940Ab_cod
            }
            , new Object[] {
            T015Y13_A396EmprCod, T015Y13_A129BarCod, T015Y13_A132BarCodReo, T015Y13_A130BarCodPar, T015Y13_A758ProCod, T015Y13_A194BarOrdLin, T015Y13_A9940Ab_cod
            }
            , new Object[] {
            T015Y14_A396EmprCod, T015Y14_A129BarCod, T015Y14_A132BarCodReo, T015Y14_A130BarCodPar, T015Y14_A758ProCod, T015Y14_A194BarOrdLin, T015Y14_A9940Ab_cod
            }
            , new Object[] {
            T015Y15_A396EmprCod, T015Y15_A129BarCod, T015Y15_A132BarCodReo, T015Y15_A130BarCodPar, T015Y15_A758ProCod, T015Y15_A194BarOrdLin, T015Y15_A9940Ab_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015Y19_A396EmprCod, T015Y19_A129BarCod, T015Y19_A132BarCodReo, T015Y19_A130BarCodPar, T015Y19_A758ProCod, T015Y19_A194BarOrdLin, T015Y19_A9940Ab_cod
            }
            , new Object[] {
            T015Y20_A129BarCod, T015Y20_A132BarCodReo, T015Y20_A130BarCodPar, T015Y20_A194BarOrdLin, T015Y20_A9940Ab_cod, T015Y20_A9961Ab_lin, T015Y20_A9962Ab_car, T015Y20_n9962Ab_car, T015Y20_A9963Ab_des, T015Y20_n9963Ab_des,
            T015Y20_A9964Ab_lmp, T015Y20_n9964Ab_lmp, T015Y20_A9965Ab_dia, T015Y20_n9965Ab_dia, T015Y20_A396EmprCod, T015Y20_A652OpeCod, T015Y20_n652OpeCod, T015Y20_A758ProCod
            }
            , new Object[] {
            T015Y21_A396EmprCod
            }
            , new Object[] {
            T015Y22_A396EmprCod, T015Y22_A129BarCod, T015Y22_A132BarCodReo, T015Y22_A130BarCodPar, T015Y22_A758ProCod, T015Y22_A194BarOrdLin, T015Y22_A9940Ab_cod, T015Y22_A9961Ab_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015Y26_A396EmprCod, T015Y26_A129BarCod, T015Y26_A132BarCodReo, T015Y26_A130BarCodPar, T015Y26_A758ProCod, T015Y26_A194BarOrdLin, T015Y26_A9940Ab_cod, T015Y26_A9961Ab_lin
            }
            , new Object[] {
            T015Y27_A407EmprNom, T015Y27_n407EmprNom
            }
            , new Object[] {
            T015Y28_A759ProDsc
            }
            , new Object[] {
            T015Y29_A457FasCod
            }
            , new Object[] {
            T015Y30_A460FasDsc
            }
            , new Object[] {
            T015Y31_A396EmprCod
            }
            , new Object[] {
            T015Y32_A396EmprCod
            }
         }
      );
      Z457FasCod = "" ;
      A457FasCod = "" ;
      Z9940Ab_cod = "" ;
      A9940Ab_cod = "" ;
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
      AV36Pgmname = "TCACABp" ;
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
   private short nRcdDeleted_1323 ;
   private short nRcdExists_1323 ;
   private short nIsMod_1323 ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1323 ;
   private short RcdFound1323 ;
   private short nBlankRcdUsr1323 ;
   private short RcdFound1322 ;
   private short nIsDirty_1322 ;
   private short nIsDirty_1323 ;
   private short ZZ194BarOrdLin ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z9960Ab_ult ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z9961Ab_lin ;
   private int Z652OpeCod ;
   private int A652OpeCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtAb_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int A9960Ab_ult ;
   private int edtAb_ult_Enabled ;
   private int edtavnRcdDeleted_1323_Enabled ;
   private int edtAb_lin_Enabled ;
   private int edtAb_car_Enabled ;
   private int edtAb_des_Enabled ;
   private int edtAb_lmp_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtAb_dia_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A9961Ab_lin ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAb_lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAb_ult_Backcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtAb_cod_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ9960Ab_ult ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String wcpOA9940Ab_cod ;
   private String wcpOA457FasCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z9940Ab_cod ;
   private String Z9962Ab_car ;
   private String Z9963Ab_des ;
   private String Z9964Ab_lmp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A9940Ab_cod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAb_ult_Internalname ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAb_cod_Internalname ;
   private String edtAb_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAb_ult_Jsonclick ;
   private String sMode1323 ;
   private String edtavnRcdDeleted_1323_Internalname ;
   private String edtAb_lin_Internalname ;
   private String edtAb_car_Internalname ;
   private String edtAb_des_Internalname ;
   private String edtAb_lmp_Internalname ;
   private String edtOpeCod_Internalname ;
   private String edtAb_dia_Internalname ;
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
   private String AV36Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1322 ;
   private String GXCCtl ;
   private String A9962Ab_car ;
   private String A9963Ab_des ;
   private String A9964Ab_lmp ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV13Lit9 ;
   private String AV21Lit10 ;
   private String GXt_char1 ;
   private String AV22Lit11 ;
   private String AV23Lit12 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z759ProDsc ;
   private String Z457FasCod ;
   private String Z460FasDsc ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1323_Jsonclick ;
   private String edtAb_lin_Jsonclick ;
   private String edtAb_car_Jsonclick ;
   private String edtAb_des_Jsonclick ;
   private String edtAb_lmp_Jsonclick ;
   private String edtOpeCod_Jsonclick ;
   private String edtAb_dia_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ9940Ab_cod ;
   private String ZZ407EmprNom ;
   private String ZZ759ProDsc ;
   private String ZZ460FasDsc ;
   private String ZZ457FasCod ;
   private java.util.Date Z9965Ab_dia ;
   private java.util.Date A9965Ab_dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9960Ab_ult ;
   private boolean returnInSub ;
   private boolean n9962Ab_car ;
   private boolean n9963Ab_des ;
   private boolean n9964Ab_lmp ;
   private boolean n9965Ab_dia ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T015Y7_A407EmprNom ;
   private boolean[] T015Y7_n407EmprNom ;
   private String[] T015Y8_A759ProDsc ;
   private String[] T015Y9_A457FasCod ;
   private String[] T015Y10_A396EmprCod ;
   private String[] T015Y11_A460FasDsc ;
   private String[] T015Y12_A457FasCod ;
   private String[] T015Y12_A407EmprNom ;
   private boolean[] T015Y12_n407EmprNom ;
   private String[] T015Y12_A759ProDsc ;
   private String[] T015Y12_A460FasDsc ;
   private int[] T015Y12_A9960Ab_ult ;
   private boolean[] T015Y12_n9960Ab_ult ;
   private String[] T015Y12_A396EmprCod ;
   private int[] T015Y12_A129BarCod ;
   private byte[] T015Y12_A132BarCodReo ;
   private String[] T015Y12_A130BarCodPar ;
   private String[] T015Y12_A758ProCod ;
   private short[] T015Y12_A194BarOrdLin ;
   private String[] T015Y12_A9940Ab_cod ;
   private String[] T015Y13_A396EmprCod ;
   private int[] T015Y13_A129BarCod ;
   private byte[] T015Y13_A132BarCodReo ;
   private String[] T015Y13_A130BarCodPar ;
   private String[] T015Y13_A758ProCod ;
   private short[] T015Y13_A194BarOrdLin ;
   private String[] T015Y13_A9940Ab_cod ;
   private int[] T015Y6_A9960Ab_ult ;
   private boolean[] T015Y6_n9960Ab_ult ;
   private String[] T015Y6_A396EmprCod ;
   private int[] T015Y6_A129BarCod ;
   private byte[] T015Y6_A132BarCodReo ;
   private String[] T015Y6_A130BarCodPar ;
   private String[] T015Y6_A758ProCod ;
   private short[] T015Y6_A194BarOrdLin ;
   private String[] T015Y6_A9940Ab_cod ;
   private String[] T015Y14_A396EmprCod ;
   private int[] T015Y14_A129BarCod ;
   private byte[] T015Y14_A132BarCodReo ;
   private String[] T015Y14_A130BarCodPar ;
   private String[] T015Y14_A758ProCod ;
   private short[] T015Y14_A194BarOrdLin ;
   private String[] T015Y14_A9940Ab_cod ;
   private String[] T015Y15_A396EmprCod ;
   private int[] T015Y15_A129BarCod ;
   private byte[] T015Y15_A132BarCodReo ;
   private String[] T015Y15_A130BarCodPar ;
   private String[] T015Y15_A758ProCod ;
   private short[] T015Y15_A194BarOrdLin ;
   private String[] T015Y15_A9940Ab_cod ;
   private int[] T015Y5_A9960Ab_ult ;
   private boolean[] T015Y5_n9960Ab_ult ;
   private String[] T015Y5_A396EmprCod ;
   private int[] T015Y5_A129BarCod ;
   private byte[] T015Y5_A132BarCodReo ;
   private String[] T015Y5_A130BarCodPar ;
   private String[] T015Y5_A758ProCod ;
   private short[] T015Y5_A194BarOrdLin ;
   private String[] T015Y5_A9940Ab_cod ;
   private String[] T015Y19_A396EmprCod ;
   private int[] T015Y19_A129BarCod ;
   private byte[] T015Y19_A132BarCodReo ;
   private String[] T015Y19_A130BarCodPar ;
   private String[] T015Y19_A758ProCod ;
   private short[] T015Y19_A194BarOrdLin ;
   private String[] T015Y19_A9940Ab_cod ;
   private int[] T015Y20_A129BarCod ;
   private byte[] T015Y20_A132BarCodReo ;
   private String[] T015Y20_A130BarCodPar ;
   private short[] T015Y20_A194BarOrdLin ;
   private String[] T015Y20_A9940Ab_cod ;
   private int[] T015Y20_A9961Ab_lin ;
   private String[] T015Y20_A9962Ab_car ;
   private boolean[] T015Y20_n9962Ab_car ;
   private String[] T015Y20_A9963Ab_des ;
   private boolean[] T015Y20_n9963Ab_des ;
   private String[] T015Y20_A9964Ab_lmp ;
   private boolean[] T015Y20_n9964Ab_lmp ;
   private java.util.Date[] T015Y20_A9965Ab_dia ;
   private boolean[] T015Y20_n9965Ab_dia ;
   private String[] T015Y20_A396EmprCod ;
   private int[] T015Y20_A652OpeCod ;
   private boolean[] T015Y20_n652OpeCod ;
   private String[] T015Y20_A758ProCod ;
   private String[] T015Y4_A396EmprCod ;
   private String[] T015Y21_A396EmprCod ;
   private String[] T015Y22_A396EmprCod ;
   private int[] T015Y22_A129BarCod ;
   private byte[] T015Y22_A132BarCodReo ;
   private String[] T015Y22_A130BarCodPar ;
   private String[] T015Y22_A758ProCod ;
   private short[] T015Y22_A194BarOrdLin ;
   private String[] T015Y22_A9940Ab_cod ;
   private int[] T015Y22_A9961Ab_lin ;
   private int[] T015Y3_A129BarCod ;
   private byte[] T015Y3_A132BarCodReo ;
   private String[] T015Y3_A130BarCodPar ;
   private short[] T015Y3_A194BarOrdLin ;
   private String[] T015Y3_A9940Ab_cod ;
   private int[] T015Y3_A9961Ab_lin ;
   private String[] T015Y3_A9962Ab_car ;
   private boolean[] T015Y3_n9962Ab_car ;
   private String[] T015Y3_A9963Ab_des ;
   private boolean[] T015Y3_n9963Ab_des ;
   private String[] T015Y3_A9964Ab_lmp ;
   private boolean[] T015Y3_n9964Ab_lmp ;
   private java.util.Date[] T015Y3_A9965Ab_dia ;
   private boolean[] T015Y3_n9965Ab_dia ;
   private String[] T015Y3_A396EmprCod ;
   private int[] T015Y3_A652OpeCod ;
   private boolean[] T015Y3_n652OpeCod ;
   private String[] T015Y3_A758ProCod ;
   private int[] T015Y2_A129BarCod ;
   private byte[] T015Y2_A132BarCodReo ;
   private String[] T015Y2_A130BarCodPar ;
   private short[] T015Y2_A194BarOrdLin ;
   private String[] T015Y2_A9940Ab_cod ;
   private int[] T015Y2_A9961Ab_lin ;
   private String[] T015Y2_A9962Ab_car ;
   private boolean[] T015Y2_n9962Ab_car ;
   private String[] T015Y2_A9963Ab_des ;
   private boolean[] T015Y2_n9963Ab_des ;
   private String[] T015Y2_A9964Ab_lmp ;
   private boolean[] T015Y2_n9964Ab_lmp ;
   private java.util.Date[] T015Y2_A9965Ab_dia ;
   private boolean[] T015Y2_n9965Ab_dia ;
   private String[] T015Y2_A396EmprCod ;
   private int[] T015Y2_A652OpeCod ;
   private boolean[] T015Y2_n652OpeCod ;
   private String[] T015Y2_A758ProCod ;
   private String[] T015Y26_A396EmprCod ;
   private int[] T015Y26_A129BarCod ;
   private byte[] T015Y26_A132BarCodReo ;
   private String[] T015Y26_A130BarCodPar ;
   private String[] T015Y26_A758ProCod ;
   private short[] T015Y26_A194BarOrdLin ;
   private String[] T015Y26_A9940Ab_cod ;
   private int[] T015Y26_A9961Ab_lin ;
   private String[] T015Y27_A407EmprNom ;
   private boolean[] T015Y27_n407EmprNom ;
   private String[] T015Y28_A759ProDsc ;
   private String[] T015Y29_A457FasCod ;
   private String[] T015Y30_A460FasDsc ;
   private String[] T015Y31_A396EmprCod ;
   private String[] T015Y32_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcacabp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcacabp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcacabp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcacabp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcacabp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015Y2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Ab_cod, Ab_lin, Ab_car, Ab_des, Ab_lmp, Ab_dia, EmprCod, OpeCod, ProCod FROM TXPCACAB1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ? AND Ab_lin = ?  FOR UPDATE OF Ab_car, Ab_des, Ab_lmp, Ab_dia, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Y3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Ab_cod, Ab_lin, Ab_car, Ab_des, Ab_lmp, Ab_dia, EmprCod, OpeCod, ProCod FROM TXPCACAB1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ? AND Ab_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Y4", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y5", "SELECT Ab_ult, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ?  FOR UPDATE OF Ab_ult NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y6", "SELECT Ab_ult, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y8", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y9", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y10", "SELECT EmprCod FROM TXPACTAB WHERE EmprCod = ? AND Ab_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y11", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y12", "SELECT /*+ FIRST_ROWS(1) */ T4.FasCod, T2.EmprNom, T3.ProDsc, T5.FasDsc, TM1.Ab_ult, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.Ab_cod FROM ((((TXPCACABp TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) INNER JOIN TXPBARFAS T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar AND T4.ProCod = TM1.ProCod AND T4.BarOrdLin = TM1.BarOrdLin) LEFT JOIN TXPFASPRO T5 ON T5.EmprCod = TM1.EmprCod AND T5.FasCod = T4.FasCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.Ab_cod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.Ab_cod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Ab_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Ab_cod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, Ab_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015Y16", "INSERT INTO TXPCACABp(Ab_ult, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCACABp")
         ,new UpdateCursor("T015Y17", "UPDATE TXPCACABp SET Ab_ult=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ?", GX_NOMASK, "TXPCACABp")
         ,new UpdateCursor("T015Y18", "DELETE FROM TXPCACABp  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ?", GX_NOMASK, "TXPCACABp")
         ,new ForEachCursor("T015Y19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Ab_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y20", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Ab_cod, Ab_lin, Ab_car, Ab_des, Ab_lmp, Ab_dia, EmprCod, OpeCod, ProCod FROM TXPCACAB1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Ab_cod = ? and Ab_lin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod, Ab_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Y21", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod, Ab_lin FROM TXPCACAB1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ? AND Ab_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015Y23", "INSERT INTO TXPCACAB1(BarCod, BarCodReo, BarCodPar, BarOrdLin, Ab_cod, Ab_lin, Ab_car, Ab_des, Ab_lmp, Ab_dia, EmprCod, OpeCod, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCACAB1")
         ,new UpdateCursor("T015Y24", "UPDATE TXPCACAB1 SET Ab_car=?, Ab_des=?, Ab_lmp=?, Ab_dia=?, OpeCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ? AND Ab_lin = ?", GX_NOMASK, "TXPCACAB1")
         ,new UpdateCursor("T015Y25", "DELETE FROM TXPCACAB1  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Ab_cod = ? AND Ab_lin = ?", GX_NOMASK, "TXPCACAB1")
         ,new ForEachCursor("T015Y26", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod, Ab_lin FROM TXPCACAB1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Ab_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod, Ab_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Y27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y28", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y29", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y30", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y31", "SELECT EmprCod FROM TXPACTAB WHERE EmprCod = ? AND Ab_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Y32", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 2 :
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 6);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 1);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
               }
               stmt.setString(11, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[16]).intValue());
               }
               stmt.setString(13, (String)parms[17], 8);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setString(10, (String)parms[14], 8);
               stmt.setShort(11, ((Number) parms[15]).shortValue());
               stmt.setString(12, (String)parms[16], 6);
               stmt.setInt(13, ((Number) parms[17]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

