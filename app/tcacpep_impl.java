package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcacpep_impl extends GXDataArea
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
            A9878Pe_cod = httpContext.GetPar( "Pe_cod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
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
         GX_FocusControl = edtPe_ult_Internalname ;
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

   public tcacpep_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcacpep_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcacpep_impl.class ));
   }

   public tcacpep_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCACPEp.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Codigo actividad seccion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_cod_Internalname, GXutil.rtrim( A9878Pe_cod), GXutil.rtrim( localUtil.format( A9878Pe_cod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_cod_Jsonclick, 0, "", "", "", "", "", 1, edtPe_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCACPEp.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_ult_Internalname, GXutil.ltrim( localUtil.ntoc( A9905Pe_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPe_ult_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9905Pe_ult), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9905Pe_ult), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_ult_Jsonclick, 0, "", "", "", "", "", 1, edtPe_ult_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCACPEp.htm");
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
         nBlankRcdCount1315 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1315 = (short)(1) ;
            scanStart15S1315( ) ;
            while ( RcdFound1315 != 0 )
            {
               init_level_properties1315( ) ;
               getByPrimaryKey15S1315( ) ;
               addRow15S1315( ) ;
               scanNext15S1315( ) ;
            }
            scanEnd15S1315( ) ;
            nBlankRcdCount1315 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal15S1315( ) ;
         standaloneModal15S1315( ) ;
         sMode1315 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow15S1315( ) ;
            edtavnRcdDeleted_1315_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1315_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1315_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1315_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPe_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_LIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPe_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPe_cat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_CAT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPe_cat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_cat_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPe_cta_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_CTA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPe_cta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_cta_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPe_c1221_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_C1221_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPe_c1221_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_c1221_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPe_dia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_DIA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPe_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_dia_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1315 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal15S1315( ) ;
            }
            sendRow15S1315( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1315 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1315 = (short)(5) ;
         nRcdExists_1315 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart15S1315( ) ;
            while ( RcdFound1315 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801315( ) ;
               init_level_properties1315( ) ;
               standaloneNotModal15S1315( ) ;
               getByPrimaryKey15S1315( ) ;
               standaloneModal15S1315( ) ;
               addRow15S1315( ) ;
               scanNext15S1315( ) ;
            }
            scanEnd15S1315( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1315 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801315( ) ;
      initAll15S1315( ) ;
      init_level_properties1315( ) ;
      nRcdExists_1315 = (short)(0) ;
      nIsMod_1315 = (short)(0) ;
      nRcdDeleted_1315 = (short)(0) ;
      nBlankRcdCount1315 = (short)(nBlankRcdUsr1315+nBlankRcdCount1315) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1315 > 0 )
      {
         standaloneNotModal15S1315( ) ;
         standaloneModal15S1315( ) ;
         addRow15S1315( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPe_lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1315 = (short)(nBlankRcdCount1315-1) ;
      }
      Gx_mode = sMode1315 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCACPEp.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCACPEp.htm");
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
      e1115S2 ();
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
            Z9878Pe_cod = httpContext.cgiGet( "Z9878Pe_cod") ;
            Z9905Pe_ult = (int)(localUtil.ctol( httpContext.cgiGet( "Z9905Pe_ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A9878Pe_cod = httpContext.cgiGet( edtPe_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPe_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPe_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PE_ULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPe_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9905Pe_ult = 0 ;
               n9905Pe_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9905Pe_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9905Pe_ult), 6, 0));
            }
            else
            {
               A9905Pe_ult = (int)(localUtil.ctol( httpContext.cgiGet( edtPe_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9905Pe_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9905Pe_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9905Pe_ult), 6, 0));
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
               A9878Pe_cod = httpContext.GetPar( "Pe_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
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
                        e1115S2 ();
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
            initAll15S1314( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1315_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1315_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes15S1314( ) ;
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

   public void confirm_15S0( )
   {
      beforeValidate15S1314( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15S1314( ) ;
         }
         else
         {
            checkExtendedTable15S1314( ) ;
            if ( AnyError == 0 )
            {
               zm15S1314( 2) ;
               zm15S1314( 3) ;
               zm15S1314( 4) ;
               zm15S1314( 5) ;
               zm15S1314( 6) ;
            }
            closeExtendedTableCursors15S1314( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1314 = Gx_mode ;
         confirm_15S1315( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1314 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1314 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues15S0( ) ;
      }
   }

   public void confirm_15S1315( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow15S1315( ) ;
         if ( ( nRcdExists_1315 != 0 ) || ( nIsMod_1315 != 0 ) )
         {
            getKey15S1315( ) ;
            if ( ( nRcdExists_1315 == 0 ) && ( nRcdDeleted_1315 == 0 ) )
            {
               if ( RcdFound1315 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate15S1315( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable15S1315( ) ;
                     if ( AnyError == 0 )
                     {
                        zm15S1315( 8) ;
                     }
                     closeExtendedTableCursors15S1315( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PE_LIN_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPe_lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1315 != 0 )
               {
                  if ( nRcdDeleted_1315 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey15S1315( ) ;
                     load15S1315( ) ;
                     beforeValidate15S1315( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls15S1315( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1315 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate15S1315( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable15S1315( ) ;
                           if ( AnyError == 0 )
                           {
                              zm15S1315( 8) ;
                           }
                           closeExtendedTableCursors15S1315( ) ;
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
                  if ( nRcdDeleted_1315 == 0 )
                  {
                     GXCCtl = "PE_LIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPe_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1315_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPe_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A9906Pe_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPe_cat_Internalname, GXutil.rtrim( A9907Pe_cat)) ;
         httpContext.changePostValue( edtPe_cta_Internalname, GXutil.rtrim( A9908Pe_cta)) ;
         httpContext.changePostValue( edtPe_c1221_Internalname, GXutil.ltrim( localUtil.ntoc( A9909Pe_c1221, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPe_dia_Internalname, localUtil.ttoc( A9910Pe_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9906Pe_lin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9906Pe_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9907Pe_cat_"+sGXsfl_80_idx, GXutil.rtrim( Z9907Pe_cat)) ;
         httpContext.changePostValue( "ZT_"+"Z9908Pe_cta_"+sGXsfl_80_idx, GXutil.rtrim( Z9908Pe_cta)) ;
         httpContext.changePostValue( "ZT_"+"Z9909Pe_c1221_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9909Pe_c1221, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9910Pe_dia_"+sGXsfl_80_idx, localUtil.ttoc( Z9910Pe_dia, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1315_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1315_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1315_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1315 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1315_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1315_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_LIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_CAT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_cat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_CTA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_cta_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_C1221_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_c1221_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_DIA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_dia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption15S0( )
   {
   }

   public void e1115S2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "BARCODC", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT15_", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASCODC", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "PARFASCODC", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN461_", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      tcacpep_impl.this.GXt_char1 = GXv_char2[0] ;
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
      tcacpep_impl.this.A396EmprCod = GXv_char2[0] ;
      tcacpep_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcacpep_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm15S1314( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9905Pe_ult = T015S6_A9905Pe_ult[0] ;
         }
         else
         {
            Z9905Pe_ult = A9905Pe_ult ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z9905Pe_ult = A9905Pe_ult ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z9878Pe_cod = A9878Pe_cod ;
         Z407EmprNom = A407EmprNom ;
         Z759ProDsc = A759ProDsc ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TCACPEp" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      /* Using cursor T015S7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015S7_A407EmprNom[0] ;
      n407EmprNom = T015S7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T015S8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T015S8_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
      /* Using cursor T015S9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      /* Using cursor T015S10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A9878Pe_cod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ACTPE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PE_COD");
         AnyError = (short)(1) ;
      }
      pr_default.close(8);
      /* Using cursor T015S11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T015S11_A460FasDsc[0] ;
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

   public void load15S1314( )
   {
      /* Using cursor T015S12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1314 = (short)(1) ;
         A407EmprNom = T015S12_A407EmprNom[0] ;
         n407EmprNom = T015S12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A759ProDsc = T015S12_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T015S12_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A9905Pe_ult = T015S12_A9905Pe_ult[0] ;
         n9905Pe_ult = T015S12_n9905Pe_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9905Pe_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9905Pe_ult), 6, 0));
         zm15S1314( -1) ;
      }
      pr_default.close(10);
      onLoadActions15S1314( ) ;
   }

   public void onLoadActions15S1314( )
   {
   }

   public void checkExtendedTable15S1314( )
   {
      nIsDirty_1314 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors15S1314( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15S1314( )
   {
      /* Using cursor T015S13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1314 = (short)(1) ;
      }
      else
      {
         RcdFound1314 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015S6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T015S6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015S6_A129BarCod[0] == A129BarCod ) && ( T015S6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015S6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015S6_A758ProCod[0], A758ProCod) == 0 ) && ( T015S6_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015S6_A9878Pe_cod[0], A9878Pe_cod) == 0 ) )
      {
         zm15S1314( 1) ;
         RcdFound1314 = (short)(1) ;
         A9905Pe_ult = T015S6_A9905Pe_ult[0] ;
         n9905Pe_ult = T015S6_n9905Pe_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9905Pe_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9905Pe_ult), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z9878Pe_cod = A9878Pe_cod ;
         sMode1314 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15S1314( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1314 = (short)(0) ;
            initializeNonKey15S1314( ) ;
         }
         Gx_mode = sMode1314 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1314 = (short)(0) ;
         initializeNonKey15S1314( ) ;
         sMode1314 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1314 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey15S1314( ) ;
      if ( RcdFound1314 == 0 )
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
      RcdFound1314 = (short)(0) ;
      /* Using cursor T015S14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T015S14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015S14_A129BarCod[0] == A129BarCod ) && ( T015S14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015S14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015S14_A758ProCod[0], A758ProCod) == 0 ) && ( T015S14_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015S14_A9878Pe_cod[0], A9878Pe_cod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T015S14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015S14_A129BarCod[0] == A129BarCod ) && ( T015S14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015S14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015S14_A758ProCod[0], A758ProCod) == 0 ) && ( T015S14_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015S14_A9878Pe_cod[0], A9878Pe_cod) == 0 ) )
         {
            RcdFound1314 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1314 = (short)(0) ;
      /* Using cursor T015S15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T015S15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015S15_A129BarCod[0] == A129BarCod ) && ( T015S15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015S15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015S15_A758ProCod[0], A758ProCod) == 0 ) && ( T015S15_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015S15_A9878Pe_cod[0], A9878Pe_cod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T015S15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015S15_A129BarCod[0] == A129BarCod ) && ( T015S15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015S15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T015S15_A758ProCod[0], A758ProCod) == 0 ) && ( T015S15_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015S15_A9878Pe_cod[0], A9878Pe_cod) == 0 ) )
         {
            RcdFound1314 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15S1314( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPe_ult_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15S1314( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1314 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
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
               GX_FocusControl = edtPe_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15S1314( ) ;
               GX_FocusControl = edtPe_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPe_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15S1314( ) ;
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
                  GX_FocusControl = edtPe_ult_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15S1314( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
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
         GX_FocusControl = edtPe_ult_Internalname ;
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
      getKey15S1314( ) ;
      if ( RcdFound1314 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcacpep");
      GX_FocusControl = edtPe_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15S0( ) ;
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
      if ( RcdFound1314 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPe_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15S1314( ) ;
      if ( RcdFound1314 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPe_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15S1314( ) ;
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
      if ( RcdFound1314 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPe_ult_Internalname ;
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
      if ( RcdFound1314 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPe_ult_Internalname ;
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
      scanStart15S1314( ) ;
      if ( RcdFound1314 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1314 != 0 )
         {
            scanNext15S1314( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPe_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15S1314( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15S1314( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015S5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCACPEp"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z9905Pe_ult != T015S5_A9905Pe_ult[0] ) )
         {
            if ( Z9905Pe_ult != T015S5_A9905Pe_ult[0] )
            {
               GXutil.writeLogln("tcacpep:[seudo value changed for attri]"+"Pe_ult");
               GXutil.writeLogRaw("Old: ",Z9905Pe_ult);
               GXutil.writeLogRaw("Current: ",T015S5_A9905Pe_ult[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCACPEp"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15S1314( )
   {
      beforeValidate15S1314( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15S1314( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15S1314( 0) ;
         checkOptimisticConcurrency15S1314( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15S1314( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15S1314( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015S16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n9905Pe_ult), Integer.valueOf(A9905Pe_ult), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACPEp");
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
                        processLevel15S1314( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption15S0( ) ;
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
            load15S1314( ) ;
         }
         endLevel15S1314( ) ;
      }
      closeExtendedTableCursors15S1314( ) ;
   }

   public void update15S1314( )
   {
      beforeValidate15S1314( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15S1314( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15S1314( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15S1314( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15S1314( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015S17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n9905Pe_ult), Integer.valueOf(A9905Pe_ult), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACPEp");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCACPEp"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15S1314( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15S1314( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption15S0( ) ;
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
         endLevel15S1314( ) ;
      }
      closeExtendedTableCursors15S1314( ) ;
   }

   public void deferredUpdate15S1314( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15S1314( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15S1314( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15S1314( ) ;
         afterConfirm15S1314( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15S1314( ) ;
            if ( AnyError == 0 )
            {
               scanStart15S1315( ) ;
               while ( RcdFound1315 != 0 )
               {
                  getByPrimaryKey15S1315( ) ;
                  delete15S1315( ) ;
                  scanNext15S1315( ) ;
               }
               scanEnd15S1315( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015S18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACPEp");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1314 == 0 )
                        {
                           initAll15S1314( ) ;
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
                        resetCaption15S0( ) ;
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
      sMode1314 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15S1314( ) ;
      Gx_mode = sMode1314 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15S1314( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel15S1315( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow15S1315( ) ;
         if ( ( nRcdExists_1315 != 0 ) || ( nIsMod_1315 != 0 ) )
         {
            standaloneNotModal15S1315( ) ;
            getKey15S1315( ) ;
            if ( ( nRcdExists_1315 == 0 ) && ( nRcdDeleted_1315 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert15S1315( ) ;
            }
            else
            {
               if ( RcdFound1315 != 0 )
               {
                  if ( ( nRcdDeleted_1315 != 0 ) && ( nRcdExists_1315 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete15S1315( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1315 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update15S1315( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1315 == 0 )
                  {
                     GXCCtl = "PE_LIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPe_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1315_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPe_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A9906Pe_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPe_cat_Internalname, GXutil.rtrim( A9907Pe_cat)) ;
         httpContext.changePostValue( edtPe_cta_Internalname, GXutil.rtrim( A9908Pe_cta)) ;
         httpContext.changePostValue( edtPe_c1221_Internalname, GXutil.ltrim( localUtil.ntoc( A9909Pe_c1221, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPe_dia_Internalname, localUtil.ttoc( A9910Pe_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9906Pe_lin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9906Pe_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9907Pe_cat_"+sGXsfl_80_idx, GXutil.rtrim( Z9907Pe_cat)) ;
         httpContext.changePostValue( "ZT_"+"Z9908Pe_cta_"+sGXsfl_80_idx, GXutil.rtrim( Z9908Pe_cta)) ;
         httpContext.changePostValue( "ZT_"+"Z9909Pe_c1221_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9909Pe_c1221, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9910Pe_dia_"+sGXsfl_80_idx, localUtil.ttoc( Z9910Pe_dia, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1315_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1315_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1315_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1315 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1315_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1315_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_LIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_CAT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_cat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_CTA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_cta_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_C1221_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_c1221_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PE_DIA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_dia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll15S1315( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1315 = (short)(0) ;
      nIsMod_1315 = (short)(0) ;
      nRcdDeleted_1315 = (short)(0) ;
   }

   public void processLevel15S1314( )
   {
      /* Save parent mode. */
      sMode1314 = Gx_mode ;
      processNestedLevel15S1315( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1314 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel15S1314( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15S1314( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcacpep");
         if ( AnyError == 0 )
         {
            confirmValues15S0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcacpep");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15S1314( )
   {
      /* Scan By routine */
      /* Using cursor T015S19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
      RcdFound1314 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1314 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15S1314( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1314 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1314 = (short)(1) ;
      }
   }

   public void scanEnd15S1314( )
   {
      pr_default.close(17);
   }

   public void afterConfirm15S1314( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15S1314( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15S1314( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15S1314( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15S1314( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15S1314( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15S1314( )
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
      edtPe_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_cod_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtPe_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_ult_Enabled), 5, 0), true);
   }

   public void zm15S1315( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9907Pe_cat = T015S3_A9907Pe_cat[0] ;
            Z9908Pe_cta = T015S3_A9908Pe_cta[0] ;
            Z9909Pe_c1221 = T015S3_A9909Pe_c1221[0] ;
            Z9910Pe_dia = T015S3_A9910Pe_dia[0] ;
            Z652OpeCod = T015S3_A652OpeCod[0] ;
         }
         else
         {
            Z9907Pe_cat = A9907Pe_cat ;
            Z9908Pe_cta = A9908Pe_cta ;
            Z9909Pe_c1221 = A9909Pe_c1221 ;
            Z9910Pe_dia = A9910Pe_dia ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z9878Pe_cod = A9878Pe_cod ;
         Z9906Pe_lin = A9906Pe_lin ;
         Z9907Pe_cat = A9907Pe_cat ;
         Z9908Pe_cta = A9908Pe_cta ;
         Z9909Pe_c1221 = A9909Pe_c1221 ;
         Z9910Pe_dia = A9910Pe_dia ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModal15S1315( )
   {
   }

   public void standaloneModal15S1315( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPe_lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPe_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtPe_lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPe_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load15S1315( )
   {
      /* Using cursor T015S20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod, Integer.valueOf(A9906Pe_lin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1315 = (short)(1) ;
         A9907Pe_cat = T015S20_A9907Pe_cat[0] ;
         n9907Pe_cat = T015S20_n9907Pe_cat[0] ;
         A9908Pe_cta = T015S20_A9908Pe_cta[0] ;
         n9908Pe_cta = T015S20_n9908Pe_cta[0] ;
         A9909Pe_c1221 = T015S20_A9909Pe_c1221[0] ;
         n9909Pe_c1221 = T015S20_n9909Pe_c1221[0] ;
         A9910Pe_dia = T015S20_A9910Pe_dia[0] ;
         n9910Pe_dia = T015S20_n9910Pe_dia[0] ;
         A652OpeCod = T015S20_A652OpeCod[0] ;
         n652OpeCod = T015S20_n652OpeCod[0] ;
         zm15S1315( -7) ;
      }
      pr_default.close(18);
      onLoadActions15S1315( ) ;
   }

   public void onLoadActions15S1315( )
   {
   }

   public void checkExtendedTable15S1315( )
   {
      nIsDirty_1315 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal15S1315( ) ;
      /* Using cursor T015S4 */
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

   public void closeExtendedTableCursors15S1315( )
   {
      pr_default.close(2);
   }

   public void enableDisable15S1315( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A652OpeCod )
   {
      /* Using cursor T015S21 */
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

   public void getKey15S1315( )
   {
      /* Using cursor T015S22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod, Integer.valueOf(A9906Pe_lin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1315 = (short)(1) ;
      }
      else
      {
         RcdFound1315 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey15S1315( )
   {
      /* Using cursor T015S3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod, Integer.valueOf(A9906Pe_lin)});
      if ( (pr_default.getStatus(1) != 101) && ( T015S3_A129BarCod[0] == A129BarCod ) && ( T015S3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T015S3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T015S3_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T015S3_A9878Pe_cod[0], A9878Pe_cod) == 0 ) && ( GXutil.strcmp(T015S3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015S3_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm15S1315( 7) ;
         RcdFound1315 = (short)(1) ;
         initializeNonKey15S1315( ) ;
         A9906Pe_lin = T015S3_A9906Pe_lin[0] ;
         A9907Pe_cat = T015S3_A9907Pe_cat[0] ;
         n9907Pe_cat = T015S3_n9907Pe_cat[0] ;
         A9908Pe_cta = T015S3_A9908Pe_cta[0] ;
         n9908Pe_cta = T015S3_n9908Pe_cta[0] ;
         A9909Pe_c1221 = T015S3_A9909Pe_c1221[0] ;
         n9909Pe_c1221 = T015S3_n9909Pe_c1221[0] ;
         A9910Pe_dia = T015S3_A9910Pe_dia[0] ;
         n9910Pe_dia = T015S3_n9910Pe_dia[0] ;
         A652OpeCod = T015S3_A652OpeCod[0] ;
         n652OpeCod = T015S3_n652OpeCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z9878Pe_cod = A9878Pe_cod ;
         Z9906Pe_lin = A9906Pe_lin ;
         sMode1315 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15S1315( ) ;
         load15S1315( ) ;
         Gx_mode = sMode1315 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1315 = (short)(0) ;
         initializeNonKey15S1315( ) ;
         sMode1315 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15S1315( ) ;
         Gx_mode = sMode1315 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes15S1315( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency15S1315( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015S2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod, Integer.valueOf(A9906Pe_lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCACPE1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9907Pe_cat, T015S2_A9907Pe_cat[0]) != 0 ) || ( GXutil.strcmp(Z9908Pe_cta, T015S2_A9908Pe_cta[0]) != 0 ) || ( Z9909Pe_c1221 != T015S2_A9909Pe_c1221[0] ) || !( GXutil.dateCompare(Z9910Pe_dia, T015S2_A9910Pe_dia[0]) ) || ( Z652OpeCod != T015S2_A652OpeCod[0] ) )
         {
            if ( GXutil.strcmp(Z9907Pe_cat, T015S2_A9907Pe_cat[0]) != 0 )
            {
               GXutil.writeLogln("tcacpep:[seudo value changed for attri]"+"Pe_cat");
               GXutil.writeLogRaw("Old: ",Z9907Pe_cat);
               GXutil.writeLogRaw("Current: ",T015S2_A9907Pe_cat[0]);
            }
            if ( GXutil.strcmp(Z9908Pe_cta, T015S2_A9908Pe_cta[0]) != 0 )
            {
               GXutil.writeLogln("tcacpep:[seudo value changed for attri]"+"Pe_cta");
               GXutil.writeLogRaw("Old: ",Z9908Pe_cta);
               GXutil.writeLogRaw("Current: ",T015S2_A9908Pe_cta[0]);
            }
            if ( Z9909Pe_c1221 != T015S2_A9909Pe_c1221[0] )
            {
               GXutil.writeLogln("tcacpep:[seudo value changed for attri]"+"Pe_c1221");
               GXutil.writeLogRaw("Old: ",Z9909Pe_c1221);
               GXutil.writeLogRaw("Current: ",T015S2_A9909Pe_c1221[0]);
            }
            if ( !( GXutil.dateCompare(Z9910Pe_dia, T015S2_A9910Pe_dia[0]) ) )
            {
               GXutil.writeLogln("tcacpep:[seudo value changed for attri]"+"Pe_dia");
               GXutil.writeLogRaw("Old: ",Z9910Pe_dia);
               GXutil.writeLogRaw("Current: ",T015S2_A9910Pe_dia[0]);
            }
            if ( Z652OpeCod != T015S2_A652OpeCod[0] )
            {
               GXutil.writeLogln("tcacpep:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T015S2_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCACPE1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15S1315( )
   {
      beforeValidate15S1315( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15S1315( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15S1315( 0) ;
         checkOptimisticConcurrency15S1315( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15S1315( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15S1315( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015S23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), A9878Pe_cod, Integer.valueOf(A9906Pe_lin), Boolean.valueOf(n9907Pe_cat), A9907Pe_cat, Boolean.valueOf(n9908Pe_cta), A9908Pe_cta, Boolean.valueOf(n9909Pe_c1221), Byte.valueOf(A9909Pe_c1221), Boolean.valueOf(n9910Pe_dia), A9910Pe_dia, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACPE1");
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
            load15S1315( ) ;
         }
         endLevel15S1315( ) ;
      }
      closeExtendedTableCursors15S1315( ) ;
   }

   public void update15S1315( )
   {
      beforeValidate15S1315( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15S1315( ) ;
      }
      if ( ( nIsMod_1315 != 0 ) || ( nIsDirty_1315 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency15S1315( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm15S1315( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate15S1315( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015S24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n9907Pe_cat), A9907Pe_cat, Boolean.valueOf(n9908Pe_cta), A9908Pe_cta, Boolean.valueOf(n9909Pe_c1221), Byte.valueOf(A9909Pe_c1221), Boolean.valueOf(n9910Pe_dia), A9910Pe_dia, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod, Integer.valueOf(A9906Pe_lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACPE1");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCACPE1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate15S1315( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey15S1315( ) ;
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
            endLevel15S1315( ) ;
         }
      }
      closeExtendedTableCursors15S1315( ) ;
   }

   public void deferredUpdate15S1315( )
   {
   }

   public void delete15S1315( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15S1315( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15S1315( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15S1315( ) ;
         afterConfirm15S1315( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15S1315( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015S25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod, Integer.valueOf(A9906Pe_lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCACPE1");
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
      sMode1315 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15S1315( ) ;
      Gx_mode = sMode1315 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15S1315( )
   {
      standaloneModal15S1315( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel15S1315( )
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

   public void scanStart15S1315( )
   {
      /* Scan By routine */
      /* Using cursor T015S26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A9878Pe_cod});
      RcdFound1315 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1315 = (short)(1) ;
         A9906Pe_lin = T015S26_A9906Pe_lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15S1315( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1315 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1315 = (short)(1) ;
         A9906Pe_lin = T015S26_A9906Pe_lin[0] ;
      }
   }

   public void scanEnd15S1315( )
   {
      pr_default.close(24);
   }

   public void afterConfirm15S1315( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15S1315( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15S1315( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15S1315( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15S1315( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15S1315( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15S1315( )
   {
      edtPe_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPe_cat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_cat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_cat_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPe_cta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_cta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_cta_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPe_c1221_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_c1221_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_c1221_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPe_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_dia_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes15S1315( )
   {
   }

   public void send_integrity_lvl_hashes15S1314( )
   {
   }

   public void subsflControlProps_801315( )
   {
      edtavnRcdDeleted_1315_Internalname = "vNRCDDELETED_1315_"+sGXsfl_80_idx ;
      edtPe_lin_Internalname = "PE_LIN_"+sGXsfl_80_idx ;
      edtPe_cat_Internalname = "PE_CAT_"+sGXsfl_80_idx ;
      edtPe_cta_Internalname = "PE_CTA_"+sGXsfl_80_idx ;
      edtPe_c1221_Internalname = "PE_C1221_"+sGXsfl_80_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_80_idx ;
      edtPe_dia_Internalname = "PE_DIA_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801315( )
   {
      edtavnRcdDeleted_1315_Internalname = "vNRCDDELETED_1315_"+sGXsfl_80_fel_idx ;
      edtPe_lin_Internalname = "PE_LIN_"+sGXsfl_80_fel_idx ;
      edtPe_cat_Internalname = "PE_CAT_"+sGXsfl_80_fel_idx ;
      edtPe_cta_Internalname = "PE_CTA_"+sGXsfl_80_fel_idx ;
      edtPe_c1221_Internalname = "PE_C1221_"+sGXsfl_80_fel_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_80_fel_idx ;
      edtPe_dia_Internalname = "PE_DIA_"+sGXsfl_80_fel_idx ;
   }

   public void addRow15S1315( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801315( ) ;
      sendRow15S1315( ) ;
   }

   public void sendRow15S1315( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1315_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1315_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1315_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1315), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1315), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1315_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1315_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1315_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPe_lin_Internalname,GXutil.ltrim( localUtil.ntoc( A9906Pe_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9906Pe_lin), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPe_lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPe_lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1315_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPe_cat_Internalname,GXutil.rtrim( A9907Pe_cat),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPe_cat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPe_cat_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1315_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPe_cta_Internalname,GXutil.rtrim( A9908Pe_cta),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPe_cta_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPe_cta_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1315_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPe_c1221_Internalname,GXutil.ltrim( localUtil.ntoc( A9909Pe_c1221, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPe_c1221_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9909Pe_c1221), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A9909Pe_c1221), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPe_c1221_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPe_c1221_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1315_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOpeCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1315_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPe_dia_Internalname,localUtil.ttoc( A9910Pe_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9910Pe_dia, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPe_dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPe_dia_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes15S1315( ) ;
      GXCCtl = "Z9906Pe_lin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9906Pe_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9907Pe_cat_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9907Pe_cat));
      GXCCtl = "Z9908Pe_cta_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9908Pe_cta));
      GXCCtl = "Z9909Pe_c1221_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9909Pe_c1221, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9910Pe_dia_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z9910Pe_dia, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z652OpeCod_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1315_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1315_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1315_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1315, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1315_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1315_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PE_LIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PE_CAT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_cat_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PE_CTA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_cta_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PE_C1221_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_c1221_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PE_DIA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_dia_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow15S1315( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801315( ) ;
      edtavnRcdDeleted_1315_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1315_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPe_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_LIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPe_cat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_CAT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPe_cta_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_CTA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPe_c1221_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_C1221_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPe_dia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PE_DIA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1315_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1315_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1315");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1315_Internalname ;
         wbErr = true ;
         nRcdDeleted_1315 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1315 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1315_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPe_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPe_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PE_LIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPe_lin_Internalname ;
         wbErr = true ;
         A9906Pe_lin = 0 ;
      }
      else
      {
         A9906Pe_lin = (int)(localUtil.ctol( httpContext.cgiGet( edtPe_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9907Pe_cat = httpContext.cgiGet( edtPe_cat_Internalname) ;
      n9907Pe_cat = false ;
      A9908Pe_cta = httpContext.cgiGet( edtPe_cta_Internalname) ;
      n9908Pe_cta = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPe_c1221_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPe_c1221_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PE_C1221_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPe_c1221_Internalname ;
         wbErr = true ;
         A9909Pe_c1221 = (byte)(0) ;
         n9909Pe_c1221 = false ;
      }
      else
      {
         A9909Pe_c1221 = (byte)(localUtil.ctol( httpContext.cgiGet( edtPe_c1221_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9909Pe_c1221 = false ;
      }
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
      if ( localUtil.vcdtime( httpContext.cgiGet( edtPe_dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "PE_DIA_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPe_dia_Internalname ;
         wbErr = true ;
         A9910Pe_dia = GXutil.resetTime( GXutil.nullDate() );
         n9910Pe_dia = false ;
      }
      else
      {
         A9910Pe_dia = localUtil.ctot( httpContext.cgiGet( edtPe_dia_Internalname)) ;
         n9910Pe_dia = false ;
      }
      GXCCtl = "Z9906Pe_lin_" + sGXsfl_80_idx ;
      Z9906Pe_lin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9907Pe_cat_" + sGXsfl_80_idx ;
      Z9907Pe_cat = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9908Pe_cta_" + sGXsfl_80_idx ;
      Z9908Pe_cta = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9909Pe_c1221_" + sGXsfl_80_idx ;
      Z9909Pe_c1221 = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9910Pe_dia_" + sGXsfl_80_idx ;
      Z9910Pe_dia = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z652OpeCod_" + sGXsfl_80_idx ;
      Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1315_" + sGXsfl_80_idx ;
      nRcdDeleted_1315 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1315_" + sGXsfl_80_idx ;
      nRcdExists_1315 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1315_" + sGXsfl_80_idx ;
      nIsMod_1315 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPe_lin_Enabled = edtPe_lin_Enabled ;
   }

   public void confirmValues15S0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801315( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801315( ) ;
         httpContext.changePostValue( "Z9906Pe_lin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9906Pe_lin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9906Pe_lin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9907Pe_cat_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9907Pe_cat_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9907Pe_cat_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9908Pe_cta_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9908Pe_cta_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9908Pe_cta_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9909Pe_c1221_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9909Pe_c1221_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9909Pe_c1221_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9910Pe_dia_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9910Pe_dia_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9910Pe_dia_"+sGXsfl_80_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcacpep", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A9878Pe_cod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","Pe_cod","FasCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9878Pe_cod", GXutil.rtrim( Z9878Pe_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9905Pe_ult", GXutil.ltrim( localUtil.ntoc( Z9905Pe_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcacpep", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A9878Pe_cod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","Pe_cod","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCACPEp" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CAPTURA PARAMETROS PERCHA", "") ;
   }

   public void initializeNonKey15S1314( )
   {
      A9905Pe_ult = 0 ;
      n9905Pe_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9905Pe_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9905Pe_ult), 6, 0));
      Z9905Pe_ult = 0 ;
   }

   public void initAll15S1314( )
   {
      initializeNonKey15S1314( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey15S1315( )
   {
      A9907Pe_cat = "" ;
      n9907Pe_cat = false ;
      A9908Pe_cta = "" ;
      n9908Pe_cta = false ;
      A9909Pe_c1221 = (byte)(0) ;
      n9909Pe_c1221 = false ;
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      A9910Pe_dia = GXutil.resetTime( GXutil.nullDate() );
      n9910Pe_dia = false ;
      Z9907Pe_cat = "" ;
      Z9908Pe_cta = "" ;
      Z9909Pe_c1221 = (byte)(0) ;
      Z9910Pe_dia = GXutil.resetTime( GXutil.nullDate() );
      Z652OpeCod = 0 ;
   }

   public void initAll15S1315( )
   {
      A9906Pe_lin = 0 ;
      initializeNonKey15S1315( ) ;
   }

   public void standaloneModalInsert15S1315( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543859", true, true);
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
      httpContext.AddJavascriptSource("tcacpep.js", "?20268241543859", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1315( )
   {
      edtPe_lin_Enabled = defedtPe_lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_lin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1315, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1315_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9906Pe_lin, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9907Pe_cat));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_cat_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9908Pe_cta));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_cta_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9909Pe_c1221, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_c1221_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A9910Pe_dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPe_dia_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPe_cod_Internalname = "PE_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPe_ult_Internalname = "PE_ULT" ;
      edtavnRcdDeleted_1315_Internalname = "vNRCDDELETED_1315" ;
      edtPe_lin_Internalname = "PE_LIN" ;
      edtPe_cat_Internalname = "PE_CAT" ;
      edtPe_cta_Internalname = "PE_CTA" ;
      edtPe_c1221_Internalname = "PE_C1221" ;
      edtOpeCod_Internalname = "OPECOD" ;
      edtPe_dia_Internalname = "PE_DIA" ;
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
      edtPe_dia_Jsonclick = "" ;
      edtOpeCod_Jsonclick = "" ;
      edtPe_c1221_Jsonclick = "" ;
      edtPe_cta_Jsonclick = "" ;
      edtPe_cat_Jsonclick = "" ;
      edtPe_lin_Jsonclick = "" ;
      edtavnRcdDeleted_1315_Jsonclick = "" ;
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
      edtPe_dia_Enabled = 1 ;
      edtOpeCod_Enabled = 1 ;
      edtPe_c1221_Enabled = 1 ;
      edtPe_cta_Enabled = 1 ;
      edtPe_cat_Enabled = 1 ;
      edtPe_lin_Enabled = 1 ;
      edtavnRcdDeleted_1315_Enabled = 1 ;
      edtPe_ult_Jsonclick = "" ;
      edtPe_ult_Backcolor = (int)(0xFFFFFF) ;
      edtPe_ult_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPe_cod_Jsonclick = "" ;
      edtPe_cod_Backcolor = (int)(0xFFFFFF) ;
      edtPe_cod_Enabled = 0 ;
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
      subsflControlProps_801315( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal15S1315( ) ;
         standaloneModal15S1315( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow15S1315( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801315( ) ;
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
      /* Using cursor T015S27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015S27_A407EmprNom[0] ;
      n407EmprNom = T015S27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T015S28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T015S28_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(26);
      /* Using cursor T015S29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      A457FasCod = T015S29_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      pr_default.close(27);
      /* Using cursor T015S30 */
      pr_default.execute(28, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T015S30_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(28);
      /* Using cursor T015S31 */
      pr_default.execute(29, new Object[] {A396EmprCod, A9878Pe_cod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ACTPE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PE_COD");
         AnyError = (short)(1) ;
      }
      pr_default.close(29);
      GX_FocusControl = edtPe_ult_Internalname ;
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

   public void valid_Pe_cod( )
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
      httpContext.ajax_rsp_assign_attri("", false, "A9905Pe_ult", GXutil.ltrim( localUtil.ntoc( A9905Pe_ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9878Pe_cod", GXutil.rtrim( Z9878Pe_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9905Pe_ult", GXutil.ltrim( localUtil.ntoc( Z9905Pe_ult, (byte)(6), (byte)(0), ".", "")));
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
      /* Using cursor T015S32 */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A9878Pe_cod',fld:'PE_COD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
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
      setEventMetadata("VALID_PE_COD","{handler:'valid_Pe_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A9878Pe_cod',fld:'PE_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("VALID_PE_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A9905Pe_ult',fld:'PE_ULT',pic:'ZZZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z9878Pe_cod'},{av:'Z407EmprNom'},{av:'Z759ProDsc'},{av:'Z460FasDsc'},{av:'Z9905Pe_ult'},{av:'Z457FasCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_PE_LIN","{handler:'valid_Pe_lin',iparms:[]");
      setEventMetadata("VALID_PE_LIN",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_OPECOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pe_dia',iparms:[]");
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
      wcpOA9878Pe_cod = "" ;
      wcpOA457FasCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z9878Pe_cod = "" ;
      Z9907Pe_cat = "" ;
      Z9908Pe_cta = "" ;
      Z9910Pe_dia = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A9878Pe_cod = "" ;
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
      sMode1315 = "" ;
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
      sMode1314 = "" ;
      GXCCtl = "" ;
      A9907Pe_cat = "" ;
      A9908Pe_cta = "" ;
      A9910Pe_dia = GXutil.resetTime( GXutil.nullDate() );
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
      T015S7_A407EmprNom = new String[] {""} ;
      T015S7_n407EmprNom = new boolean[] {false} ;
      T015S8_A759ProDsc = new String[] {""} ;
      T015S9_A457FasCod = new String[] {""} ;
      T015S10_A396EmprCod = new String[] {""} ;
      T015S11_A460FasDsc = new String[] {""} ;
      T015S12_A457FasCod = new String[] {""} ;
      T015S12_A407EmprNom = new String[] {""} ;
      T015S12_n407EmprNom = new boolean[] {false} ;
      T015S12_A759ProDsc = new String[] {""} ;
      T015S12_A460FasDsc = new String[] {""} ;
      T015S12_A9905Pe_ult = new int[1] ;
      T015S12_n9905Pe_ult = new boolean[] {false} ;
      T015S12_A396EmprCod = new String[] {""} ;
      T015S12_A129BarCod = new int[1] ;
      T015S12_A132BarCodReo = new byte[1] ;
      T015S12_A130BarCodPar = new String[] {""} ;
      T015S12_A758ProCod = new String[] {""} ;
      T015S12_A194BarOrdLin = new short[1] ;
      T015S12_A9878Pe_cod = new String[] {""} ;
      T015S13_A396EmprCod = new String[] {""} ;
      T015S13_A129BarCod = new int[1] ;
      T015S13_A132BarCodReo = new byte[1] ;
      T015S13_A130BarCodPar = new String[] {""} ;
      T015S13_A758ProCod = new String[] {""} ;
      T015S13_A194BarOrdLin = new short[1] ;
      T015S13_A9878Pe_cod = new String[] {""} ;
      T015S6_A9905Pe_ult = new int[1] ;
      T015S6_n9905Pe_ult = new boolean[] {false} ;
      T015S6_A396EmprCod = new String[] {""} ;
      T015S6_A129BarCod = new int[1] ;
      T015S6_A132BarCodReo = new byte[1] ;
      T015S6_A130BarCodPar = new String[] {""} ;
      T015S6_A758ProCod = new String[] {""} ;
      T015S6_A194BarOrdLin = new short[1] ;
      T015S6_A9878Pe_cod = new String[] {""} ;
      T015S14_A396EmprCod = new String[] {""} ;
      T015S14_A129BarCod = new int[1] ;
      T015S14_A132BarCodReo = new byte[1] ;
      T015S14_A130BarCodPar = new String[] {""} ;
      T015S14_A758ProCod = new String[] {""} ;
      T015S14_A194BarOrdLin = new short[1] ;
      T015S14_A9878Pe_cod = new String[] {""} ;
      T015S15_A396EmprCod = new String[] {""} ;
      T015S15_A129BarCod = new int[1] ;
      T015S15_A132BarCodReo = new byte[1] ;
      T015S15_A130BarCodPar = new String[] {""} ;
      T015S15_A758ProCod = new String[] {""} ;
      T015S15_A194BarOrdLin = new short[1] ;
      T015S15_A9878Pe_cod = new String[] {""} ;
      T015S5_A9905Pe_ult = new int[1] ;
      T015S5_n9905Pe_ult = new boolean[] {false} ;
      T015S5_A396EmprCod = new String[] {""} ;
      T015S5_A129BarCod = new int[1] ;
      T015S5_A132BarCodReo = new byte[1] ;
      T015S5_A130BarCodPar = new String[] {""} ;
      T015S5_A758ProCod = new String[] {""} ;
      T015S5_A194BarOrdLin = new short[1] ;
      T015S5_A9878Pe_cod = new String[] {""} ;
      T015S19_A396EmprCod = new String[] {""} ;
      T015S19_A129BarCod = new int[1] ;
      T015S19_A132BarCodReo = new byte[1] ;
      T015S19_A130BarCodPar = new String[] {""} ;
      T015S19_A758ProCod = new String[] {""} ;
      T015S19_A194BarOrdLin = new short[1] ;
      T015S19_A9878Pe_cod = new String[] {""} ;
      T015S20_A129BarCod = new int[1] ;
      T015S20_A132BarCodReo = new byte[1] ;
      T015S20_A130BarCodPar = new String[] {""} ;
      T015S20_A194BarOrdLin = new short[1] ;
      T015S20_A9878Pe_cod = new String[] {""} ;
      T015S20_A9906Pe_lin = new int[1] ;
      T015S20_A9907Pe_cat = new String[] {""} ;
      T015S20_n9907Pe_cat = new boolean[] {false} ;
      T015S20_A9908Pe_cta = new String[] {""} ;
      T015S20_n9908Pe_cta = new boolean[] {false} ;
      T015S20_A9909Pe_c1221 = new byte[1] ;
      T015S20_n9909Pe_c1221 = new boolean[] {false} ;
      T015S20_A9910Pe_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T015S20_n9910Pe_dia = new boolean[] {false} ;
      T015S20_A396EmprCod = new String[] {""} ;
      T015S20_A652OpeCod = new int[1] ;
      T015S20_n652OpeCod = new boolean[] {false} ;
      T015S20_A758ProCod = new String[] {""} ;
      T015S4_A396EmprCod = new String[] {""} ;
      T015S21_A396EmprCod = new String[] {""} ;
      T015S22_A396EmprCod = new String[] {""} ;
      T015S22_A129BarCod = new int[1] ;
      T015S22_A132BarCodReo = new byte[1] ;
      T015S22_A130BarCodPar = new String[] {""} ;
      T015S22_A758ProCod = new String[] {""} ;
      T015S22_A194BarOrdLin = new short[1] ;
      T015S22_A9878Pe_cod = new String[] {""} ;
      T015S22_A9906Pe_lin = new int[1] ;
      T015S3_A129BarCod = new int[1] ;
      T015S3_A132BarCodReo = new byte[1] ;
      T015S3_A130BarCodPar = new String[] {""} ;
      T015S3_A194BarOrdLin = new short[1] ;
      T015S3_A9878Pe_cod = new String[] {""} ;
      T015S3_A9906Pe_lin = new int[1] ;
      T015S3_A9907Pe_cat = new String[] {""} ;
      T015S3_n9907Pe_cat = new boolean[] {false} ;
      T015S3_A9908Pe_cta = new String[] {""} ;
      T015S3_n9908Pe_cta = new boolean[] {false} ;
      T015S3_A9909Pe_c1221 = new byte[1] ;
      T015S3_n9909Pe_c1221 = new boolean[] {false} ;
      T015S3_A9910Pe_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T015S3_n9910Pe_dia = new boolean[] {false} ;
      T015S3_A396EmprCod = new String[] {""} ;
      T015S3_A652OpeCod = new int[1] ;
      T015S3_n652OpeCod = new boolean[] {false} ;
      T015S3_A758ProCod = new String[] {""} ;
      T015S2_A129BarCod = new int[1] ;
      T015S2_A132BarCodReo = new byte[1] ;
      T015S2_A130BarCodPar = new String[] {""} ;
      T015S2_A194BarOrdLin = new short[1] ;
      T015S2_A9878Pe_cod = new String[] {""} ;
      T015S2_A9906Pe_lin = new int[1] ;
      T015S2_A9907Pe_cat = new String[] {""} ;
      T015S2_n9907Pe_cat = new boolean[] {false} ;
      T015S2_A9908Pe_cta = new String[] {""} ;
      T015S2_n9908Pe_cta = new boolean[] {false} ;
      T015S2_A9909Pe_c1221 = new byte[1] ;
      T015S2_n9909Pe_c1221 = new boolean[] {false} ;
      T015S2_A9910Pe_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T015S2_n9910Pe_dia = new boolean[] {false} ;
      T015S2_A396EmprCod = new String[] {""} ;
      T015S2_A652OpeCod = new int[1] ;
      T015S2_n652OpeCod = new boolean[] {false} ;
      T015S2_A758ProCod = new String[] {""} ;
      T015S26_A396EmprCod = new String[] {""} ;
      T015S26_A129BarCod = new int[1] ;
      T015S26_A132BarCodReo = new byte[1] ;
      T015S26_A130BarCodPar = new String[] {""} ;
      T015S26_A758ProCod = new String[] {""} ;
      T015S26_A194BarOrdLin = new short[1] ;
      T015S26_A9878Pe_cod = new String[] {""} ;
      T015S26_A9906Pe_lin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T015S27_A407EmprNom = new String[] {""} ;
      T015S27_n407EmprNom = new boolean[] {false} ;
      T015S28_A759ProDsc = new String[] {""} ;
      T015S29_A457FasCod = new String[] {""} ;
      T015S30_A460FasDsc = new String[] {""} ;
      T015S31_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ9878Pe_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ759ProDsc = "" ;
      ZZ460FasDsc = "" ;
      ZZ457FasCod = "" ;
      T015S32_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcacpep__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcacpep__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcacpep__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcacpep__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcacpep__default(),
         new Object[] {
             new Object[] {
            T015S2_A129BarCod, T015S2_A132BarCodReo, T015S2_A130BarCodPar, T015S2_A194BarOrdLin, T015S2_A9878Pe_cod, T015S2_A9906Pe_lin, T015S2_A9907Pe_cat, T015S2_n9907Pe_cat, T015S2_A9908Pe_cta, T015S2_n9908Pe_cta,
            T015S2_A9909Pe_c1221, T015S2_n9909Pe_c1221, T015S2_A9910Pe_dia, T015S2_n9910Pe_dia, T015S2_A396EmprCod, T015S2_A652OpeCod, T015S2_n652OpeCod, T015S2_A758ProCod
            }
            , new Object[] {
            T015S3_A129BarCod, T015S3_A132BarCodReo, T015S3_A130BarCodPar, T015S3_A194BarOrdLin, T015S3_A9878Pe_cod, T015S3_A9906Pe_lin, T015S3_A9907Pe_cat, T015S3_n9907Pe_cat, T015S3_A9908Pe_cta, T015S3_n9908Pe_cta,
            T015S3_A9909Pe_c1221, T015S3_n9909Pe_c1221, T015S3_A9910Pe_dia, T015S3_n9910Pe_dia, T015S3_A396EmprCod, T015S3_A652OpeCod, T015S3_n652OpeCod, T015S3_A758ProCod
            }
            , new Object[] {
            T015S4_A396EmprCod
            }
            , new Object[] {
            T015S5_A9905Pe_ult, T015S5_n9905Pe_ult, T015S5_A396EmprCod, T015S5_A129BarCod, T015S5_A132BarCodReo, T015S5_A130BarCodPar, T015S5_A758ProCod, T015S5_A194BarOrdLin, T015S5_A9878Pe_cod
            }
            , new Object[] {
            T015S6_A9905Pe_ult, T015S6_n9905Pe_ult, T015S6_A396EmprCod, T015S6_A129BarCod, T015S6_A132BarCodReo, T015S6_A130BarCodPar, T015S6_A758ProCod, T015S6_A194BarOrdLin, T015S6_A9878Pe_cod
            }
            , new Object[] {
            T015S7_A407EmprNom, T015S7_n407EmprNom
            }
            , new Object[] {
            T015S8_A759ProDsc
            }
            , new Object[] {
            T015S9_A457FasCod
            }
            , new Object[] {
            T015S10_A396EmprCod
            }
            , new Object[] {
            T015S11_A460FasDsc
            }
            , new Object[] {
            T015S12_A457FasCod, T015S12_A407EmprNom, T015S12_n407EmprNom, T015S12_A759ProDsc, T015S12_A460FasDsc, T015S12_A9905Pe_ult, T015S12_n9905Pe_ult, T015S12_A396EmprCod, T015S12_A129BarCod, T015S12_A132BarCodReo,
            T015S12_A130BarCodPar, T015S12_A758ProCod, T015S12_A194BarOrdLin, T015S12_A9878Pe_cod
            }
            , new Object[] {
            T015S13_A396EmprCod, T015S13_A129BarCod, T015S13_A132BarCodReo, T015S13_A130BarCodPar, T015S13_A758ProCod, T015S13_A194BarOrdLin, T015S13_A9878Pe_cod
            }
            , new Object[] {
            T015S14_A396EmprCod, T015S14_A129BarCod, T015S14_A132BarCodReo, T015S14_A130BarCodPar, T015S14_A758ProCod, T015S14_A194BarOrdLin, T015S14_A9878Pe_cod
            }
            , new Object[] {
            T015S15_A396EmprCod, T015S15_A129BarCod, T015S15_A132BarCodReo, T015S15_A130BarCodPar, T015S15_A758ProCod, T015S15_A194BarOrdLin, T015S15_A9878Pe_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015S19_A396EmprCod, T015S19_A129BarCod, T015S19_A132BarCodReo, T015S19_A130BarCodPar, T015S19_A758ProCod, T015S19_A194BarOrdLin, T015S19_A9878Pe_cod
            }
            , new Object[] {
            T015S20_A129BarCod, T015S20_A132BarCodReo, T015S20_A130BarCodPar, T015S20_A194BarOrdLin, T015S20_A9878Pe_cod, T015S20_A9906Pe_lin, T015S20_A9907Pe_cat, T015S20_n9907Pe_cat, T015S20_A9908Pe_cta, T015S20_n9908Pe_cta,
            T015S20_A9909Pe_c1221, T015S20_n9909Pe_c1221, T015S20_A9910Pe_dia, T015S20_n9910Pe_dia, T015S20_A396EmprCod, T015S20_A652OpeCod, T015S20_n652OpeCod, T015S20_A758ProCod
            }
            , new Object[] {
            T015S21_A396EmprCod
            }
            , new Object[] {
            T015S22_A396EmprCod, T015S22_A129BarCod, T015S22_A132BarCodReo, T015S22_A130BarCodPar, T015S22_A758ProCod, T015S22_A194BarOrdLin, T015S22_A9878Pe_cod, T015S22_A9906Pe_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015S26_A396EmprCod, T015S26_A129BarCod, T015S26_A132BarCodReo, T015S26_A130BarCodPar, T015S26_A758ProCod, T015S26_A194BarOrdLin, T015S26_A9878Pe_cod, T015S26_A9906Pe_lin
            }
            , new Object[] {
            T015S27_A407EmprNom, T015S27_n407EmprNom
            }
            , new Object[] {
            T015S28_A759ProDsc
            }
            , new Object[] {
            T015S29_A457FasCod
            }
            , new Object[] {
            T015S30_A460FasDsc
            }
            , new Object[] {
            T015S31_A396EmprCod
            }
            , new Object[] {
            T015S32_A396EmprCod
            }
         }
      );
      Z457FasCod = "" ;
      A457FasCod = "" ;
      Z9878Pe_cod = "" ;
      A9878Pe_cod = "" ;
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
      AV36Pgmname = "TCACPEp" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z9909Pe_c1221 ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A9909Pe_c1221 ;
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
   private short nRcdDeleted_1315 ;
   private short nRcdExists_1315 ;
   private short nIsMod_1315 ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1315 ;
   private short RcdFound1315 ;
   private short nBlankRcdUsr1315 ;
   private short RcdFound1314 ;
   private short nIsDirty_1314 ;
   private short nIsDirty_1315 ;
   private short ZZ194BarOrdLin ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z9905Pe_ult ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z9906Pe_lin ;
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
   private int edtPe_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int A9905Pe_ult ;
   private int edtPe_ult_Enabled ;
   private int edtavnRcdDeleted_1315_Enabled ;
   private int edtPe_lin_Enabled ;
   private int edtPe_cat_Enabled ;
   private int edtPe_cta_Enabled ;
   private int edtPe_c1221_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtPe_dia_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A9906Pe_lin ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtPe_lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPe_ult_Backcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtPe_cod_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ9905Pe_ult ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String wcpOA9878Pe_cod ;
   private String wcpOA457FasCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z9878Pe_cod ;
   private String Z9907Pe_cat ;
   private String Z9908Pe_cta ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A9878Pe_cod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPe_ult_Internalname ;
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
   private String edtPe_cod_Internalname ;
   private String edtPe_cod_Jsonclick ;
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
   private String edtPe_ult_Jsonclick ;
   private String sMode1315 ;
   private String edtavnRcdDeleted_1315_Internalname ;
   private String edtPe_lin_Internalname ;
   private String edtPe_cat_Internalname ;
   private String edtPe_cta_Internalname ;
   private String edtPe_c1221_Internalname ;
   private String edtOpeCod_Internalname ;
   private String edtPe_dia_Internalname ;
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
   private String sMode1314 ;
   private String GXCCtl ;
   private String A9907Pe_cat ;
   private String A9908Pe_cta ;
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
   private String edtavnRcdDeleted_1315_Jsonclick ;
   private String edtPe_lin_Jsonclick ;
   private String edtPe_cat_Jsonclick ;
   private String edtPe_cta_Jsonclick ;
   private String edtPe_c1221_Jsonclick ;
   private String edtOpeCod_Jsonclick ;
   private String edtPe_dia_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ9878Pe_cod ;
   private String ZZ407EmprNom ;
   private String ZZ759ProDsc ;
   private String ZZ460FasDsc ;
   private String ZZ457FasCod ;
   private java.util.Date Z9910Pe_dia ;
   private java.util.Date A9910Pe_dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9905Pe_ult ;
   private boolean returnInSub ;
   private boolean n9907Pe_cat ;
   private boolean n9908Pe_cta ;
   private boolean n9909Pe_c1221 ;
   private boolean n9910Pe_dia ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T015S7_A407EmprNom ;
   private boolean[] T015S7_n407EmprNom ;
   private String[] T015S8_A759ProDsc ;
   private String[] T015S9_A457FasCod ;
   private String[] T015S10_A396EmprCod ;
   private String[] T015S11_A460FasDsc ;
   private String[] T015S12_A457FasCod ;
   private String[] T015S12_A407EmprNom ;
   private boolean[] T015S12_n407EmprNom ;
   private String[] T015S12_A759ProDsc ;
   private String[] T015S12_A460FasDsc ;
   private int[] T015S12_A9905Pe_ult ;
   private boolean[] T015S12_n9905Pe_ult ;
   private String[] T015S12_A396EmprCod ;
   private int[] T015S12_A129BarCod ;
   private byte[] T015S12_A132BarCodReo ;
   private String[] T015S12_A130BarCodPar ;
   private String[] T015S12_A758ProCod ;
   private short[] T015S12_A194BarOrdLin ;
   private String[] T015S12_A9878Pe_cod ;
   private String[] T015S13_A396EmprCod ;
   private int[] T015S13_A129BarCod ;
   private byte[] T015S13_A132BarCodReo ;
   private String[] T015S13_A130BarCodPar ;
   private String[] T015S13_A758ProCod ;
   private short[] T015S13_A194BarOrdLin ;
   private String[] T015S13_A9878Pe_cod ;
   private int[] T015S6_A9905Pe_ult ;
   private boolean[] T015S6_n9905Pe_ult ;
   private String[] T015S6_A396EmprCod ;
   private int[] T015S6_A129BarCod ;
   private byte[] T015S6_A132BarCodReo ;
   private String[] T015S6_A130BarCodPar ;
   private String[] T015S6_A758ProCod ;
   private short[] T015S6_A194BarOrdLin ;
   private String[] T015S6_A9878Pe_cod ;
   private String[] T015S14_A396EmprCod ;
   private int[] T015S14_A129BarCod ;
   private byte[] T015S14_A132BarCodReo ;
   private String[] T015S14_A130BarCodPar ;
   private String[] T015S14_A758ProCod ;
   private short[] T015S14_A194BarOrdLin ;
   private String[] T015S14_A9878Pe_cod ;
   private String[] T015S15_A396EmprCod ;
   private int[] T015S15_A129BarCod ;
   private byte[] T015S15_A132BarCodReo ;
   private String[] T015S15_A130BarCodPar ;
   private String[] T015S15_A758ProCod ;
   private short[] T015S15_A194BarOrdLin ;
   private String[] T015S15_A9878Pe_cod ;
   private int[] T015S5_A9905Pe_ult ;
   private boolean[] T015S5_n9905Pe_ult ;
   private String[] T015S5_A396EmprCod ;
   private int[] T015S5_A129BarCod ;
   private byte[] T015S5_A132BarCodReo ;
   private String[] T015S5_A130BarCodPar ;
   private String[] T015S5_A758ProCod ;
   private short[] T015S5_A194BarOrdLin ;
   private String[] T015S5_A9878Pe_cod ;
   private String[] T015S19_A396EmprCod ;
   private int[] T015S19_A129BarCod ;
   private byte[] T015S19_A132BarCodReo ;
   private String[] T015S19_A130BarCodPar ;
   private String[] T015S19_A758ProCod ;
   private short[] T015S19_A194BarOrdLin ;
   private String[] T015S19_A9878Pe_cod ;
   private int[] T015S20_A129BarCod ;
   private byte[] T015S20_A132BarCodReo ;
   private String[] T015S20_A130BarCodPar ;
   private short[] T015S20_A194BarOrdLin ;
   private String[] T015S20_A9878Pe_cod ;
   private int[] T015S20_A9906Pe_lin ;
   private String[] T015S20_A9907Pe_cat ;
   private boolean[] T015S20_n9907Pe_cat ;
   private String[] T015S20_A9908Pe_cta ;
   private boolean[] T015S20_n9908Pe_cta ;
   private byte[] T015S20_A9909Pe_c1221 ;
   private boolean[] T015S20_n9909Pe_c1221 ;
   private java.util.Date[] T015S20_A9910Pe_dia ;
   private boolean[] T015S20_n9910Pe_dia ;
   private String[] T015S20_A396EmprCod ;
   private int[] T015S20_A652OpeCod ;
   private boolean[] T015S20_n652OpeCod ;
   private String[] T015S20_A758ProCod ;
   private String[] T015S4_A396EmprCod ;
   private String[] T015S21_A396EmprCod ;
   private String[] T015S22_A396EmprCod ;
   private int[] T015S22_A129BarCod ;
   private byte[] T015S22_A132BarCodReo ;
   private String[] T015S22_A130BarCodPar ;
   private String[] T015S22_A758ProCod ;
   private short[] T015S22_A194BarOrdLin ;
   private String[] T015S22_A9878Pe_cod ;
   private int[] T015S22_A9906Pe_lin ;
   private int[] T015S3_A129BarCod ;
   private byte[] T015S3_A132BarCodReo ;
   private String[] T015S3_A130BarCodPar ;
   private short[] T015S3_A194BarOrdLin ;
   private String[] T015S3_A9878Pe_cod ;
   private int[] T015S3_A9906Pe_lin ;
   private String[] T015S3_A9907Pe_cat ;
   private boolean[] T015S3_n9907Pe_cat ;
   private String[] T015S3_A9908Pe_cta ;
   private boolean[] T015S3_n9908Pe_cta ;
   private byte[] T015S3_A9909Pe_c1221 ;
   private boolean[] T015S3_n9909Pe_c1221 ;
   private java.util.Date[] T015S3_A9910Pe_dia ;
   private boolean[] T015S3_n9910Pe_dia ;
   private String[] T015S3_A396EmprCod ;
   private int[] T015S3_A652OpeCod ;
   private boolean[] T015S3_n652OpeCod ;
   private String[] T015S3_A758ProCod ;
   private int[] T015S2_A129BarCod ;
   private byte[] T015S2_A132BarCodReo ;
   private String[] T015S2_A130BarCodPar ;
   private short[] T015S2_A194BarOrdLin ;
   private String[] T015S2_A9878Pe_cod ;
   private int[] T015S2_A9906Pe_lin ;
   private String[] T015S2_A9907Pe_cat ;
   private boolean[] T015S2_n9907Pe_cat ;
   private String[] T015S2_A9908Pe_cta ;
   private boolean[] T015S2_n9908Pe_cta ;
   private byte[] T015S2_A9909Pe_c1221 ;
   private boolean[] T015S2_n9909Pe_c1221 ;
   private java.util.Date[] T015S2_A9910Pe_dia ;
   private boolean[] T015S2_n9910Pe_dia ;
   private String[] T015S2_A396EmprCod ;
   private int[] T015S2_A652OpeCod ;
   private boolean[] T015S2_n652OpeCod ;
   private String[] T015S2_A758ProCod ;
   private String[] T015S26_A396EmprCod ;
   private int[] T015S26_A129BarCod ;
   private byte[] T015S26_A132BarCodReo ;
   private String[] T015S26_A130BarCodPar ;
   private String[] T015S26_A758ProCod ;
   private short[] T015S26_A194BarOrdLin ;
   private String[] T015S26_A9878Pe_cod ;
   private int[] T015S26_A9906Pe_lin ;
   private String[] T015S27_A407EmprNom ;
   private boolean[] T015S27_n407EmprNom ;
   private String[] T015S28_A759ProDsc ;
   private String[] T015S29_A457FasCod ;
   private String[] T015S30_A460FasDsc ;
   private String[] T015S31_A396EmprCod ;
   private String[] T015S32_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcacpep__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcacpep__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcacpep__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcacpep__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcacpep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015S2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Pe_cod, Pe_lin, Pe_cat, Pe_cta, Pe_c1221, Pe_dia, EmprCod, OpeCod, ProCod FROM TXPCACPE1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ? AND Pe_lin = ?  FOR UPDATE OF Pe_cat, Pe_cta, Pe_c1221, Pe_dia, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015S3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Pe_cod, Pe_lin, Pe_cat, Pe_cta, Pe_c1221, Pe_dia, EmprCod, OpeCod, ProCod FROM TXPCACPE1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ? AND Pe_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015S4", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S5", "SELECT Pe_ult, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ?  FOR UPDATE OF Pe_ult NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S6", "SELECT Pe_ult, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S8", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S9", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S10", "SELECT EmprCod FROM TXPACTPE WHERE EmprCod = ? AND Pe_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S11", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S12", "SELECT /*+ FIRST_ROWS(1) */ T4.FasCod, T2.EmprNom, T3.ProDsc, T5.FasDsc, TM1.Pe_ult, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.Pe_cod FROM ((((TXPCACPEp TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) INNER JOIN TXPBARFAS T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar AND T4.ProCod = TM1.ProCod AND T4.BarOrdLin = TM1.BarOrdLin) LEFT JOIN TXPFASPRO T5 ON T5.EmprCod = TM1.EmprCod AND T5.FasCod = T4.FasCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.Pe_cod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.Pe_cod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Pe_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Pe_cod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, Pe_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015S16", "INSERT INTO TXPCACPEp(Pe_ult, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCACPEp")
         ,new UpdateCursor("T015S17", "UPDATE TXPCACPEp SET Pe_ult=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ?", GX_NOMASK, "TXPCACPEp")
         ,new UpdateCursor("T015S18", "DELETE FROM TXPCACPEp  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ?", GX_NOMASK, "TXPCACPEp")
         ,new ForEachCursor("T015S19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Pe_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S20", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, Pe_cod, Pe_lin, Pe_cat, Pe_cta, Pe_c1221, Pe_dia, EmprCod, OpeCod, ProCod FROM TXPCACPE1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Pe_cod = ? and Pe_lin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod, Pe_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015S21", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod, Pe_lin FROM TXPCACPE1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ? AND Pe_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015S23", "INSERT INTO TXPCACPE1(BarCod, BarCodReo, BarCodPar, BarOrdLin, Pe_cod, Pe_lin, Pe_cat, Pe_cta, Pe_c1221, Pe_dia, EmprCod, OpeCod, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCACPE1")
         ,new UpdateCursor("T015S24", "UPDATE TXPCACPE1 SET Pe_cat=?, Pe_cta=?, Pe_c1221=?, Pe_dia=?, OpeCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ? AND Pe_lin = ?", GX_NOMASK, "TXPCACPE1")
         ,new UpdateCursor("T015S25", "DELETE FROM TXPCACPE1  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Pe_cod = ? AND Pe_lin = ?", GX_NOMASK, "TXPCACPE1")
         ,new ForEachCursor("T015S26", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod, Pe_lin FROM TXPCACPE1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Pe_cod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod, Pe_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015S27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S28", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S29", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S30", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S31", "SELECT EmprCod FROM TXPACTPE WHERE EmprCod = ? AND Pe_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015S32", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[10])[0] = rslt.getByte(9);
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
               ((byte[]) buf[10])[0] = rslt.getByte(9);
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
               ((byte[]) buf[10])[0] = rslt.getByte(9);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[11]).byteValue());
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
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

