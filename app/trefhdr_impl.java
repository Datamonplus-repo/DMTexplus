package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trefhdr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "REFERENCIAS HOJAS DE RUTA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarCod_Internalname ;
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

   public trefhdr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trefhdr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trefhdr_impl.class ));
   }

   public trefhdr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TREFHDR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Total Kilos Ref", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotRefKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A3432TotRefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotRefKgs_Enabled!=0) ? localUtil.format( A3432TotRefKgs, "ZZZZZ9.99") : localUtil.format( A3432TotRefKgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotRefKgs_Jsonclick, 0, "", "", "", "", "", 1, edtTotRefKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Total Metros Ref.", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotRefMts_Internalname, GXutil.ltrim( localUtil.ntoc( A3433TotRefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotRefMts_Enabled!=0) ? localUtil.format( A3433TotRefMts, "ZZZZZ9.99") : localUtil.format( A3433TotRefMts, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotRefMts_Jsonclick, 0, "", "", "", "", "", 1, edtTotRefMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Total Piezas Ref", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREFHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotRefPie_Internalname, GXutil.ltrim( localUtil.ntoc( A3434TotRefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotRefPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3434TotRefPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3434TotRefPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotRefPie_Jsonclick, 0, "", "", "", "", "", 1, edtTotRefPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREFHDR.htm");
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
         nBlankRcdCount1549 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1549 = (short)(1) ;
            scanStart1EO1549( ) ;
            while ( RcdFound1549 != 0 )
            {
               init_level_properties1549( ) ;
               getByPrimaryKey1EO1549( ) ;
               addRow1EO1549( ) ;
               scanNext1EO1549( ) ;
            }
            scanEnd1EO1549( ) ;
            nBlankRcdCount1549 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3434TotRefPie = A3434TotRefPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         B3433TotRefMts = A3433TotRefMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         B3432TotRefKgs = A3432TotRefKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         standaloneNotModal1EO1549( ) ;
         standaloneModal1EO1549( ) ;
         sMode1549 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1EO1549( ) ;
            edtavnRcdDeleted_1549_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1549_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1549_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1549_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtRefBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFBARCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRefBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtRefBarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFBARREO_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRefBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtRefBarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFBARPAR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRefBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtRefKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFKGS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRefKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefKgs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtRefMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFMTS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRefMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefMts_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtRefPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFPIE_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRefPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefPie_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1549 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1EO1549( ) ;
            }
            sendRow1EO1549( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1549 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3434TotRefPie = B3434TotRefPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         A3433TotRefMts = B3433TotRefMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3432TotRefKgs = B3432TotRefKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1549 = (short)(5) ;
         nRcdExists_1549 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1EO1549( ) ;
            while ( RcdFound1549 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601549( ) ;
               init_level_properties1549( ) ;
               standaloneNotModal1EO1549( ) ;
               getByPrimaryKey1EO1549( ) ;
               standaloneModal1EO1549( ) ;
               addRow1EO1549( ) ;
               scanNext1EO1549( ) ;
            }
            scanEnd1EO1549( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1549 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601549( ) ;
      initAll1EO1549( ) ;
      init_level_properties1549( ) ;
      B3434TotRefPie = A3434TotRefPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      B3433TotRefMts = A3433TotRefMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      B3432TotRefKgs = A3432TotRefKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      nRcdExists_1549 = (short)(0) ;
      nIsMod_1549 = (short)(0) ;
      nRcdDeleted_1549 = (short)(0) ;
      nBlankRcdCount1549 = (short)(nBlankRcdUsr1549+nBlankRcdCount1549) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1549 > 0 )
      {
         standaloneNotModal1EO1549( ) ;
         standaloneModal1EO1549( ) ;
         addRow1EO1549( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRefBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1549 = (short)(nBlankRcdCount1549-1) ;
      }
      Gx_mode = sMode1549 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3434TotRefPie = B3434TotRefPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      A3433TotRefMts = B3433TotRefMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      A3432TotRefKgs = B3432TotRefKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREFHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TREFHDR.htm");
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
      e111EO2 ();
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
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            O3434TotRefPie = (short)(localUtil.ctol( httpContext.cgiGet( "O3434TotRefPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3433TotRefMts = localUtil.ctond( httpContext.cgiGet( "O3433TotRefMts")) ;
            O3432TotRefKgs = localUtil.ctond( httpContext.cgiGet( "O3432TotRefKgs")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A3432TotRefKgs = localUtil.ctond( httpContext.cgiGet( edtTotRefKgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
            A3433TotRefMts = localUtil.ctond( httpContext.cgiGet( edtTotRefMts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
            A3434TotRefPie = (short)(localUtil.ctol( httpContext.cgiGet( edtTotRefPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TREFHDR");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
            forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("trefhdr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               n396EmprCod = false ;
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
                        e111EO2 ();
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
            initAll1EO12( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1549_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1549_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1EO12( ) ;
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

   public void confirm_1EO0( )
   {
      beforeValidate1EO12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EO12( ) ;
         }
         else
         {
            checkExtendedTable1EO12( ) ;
            if ( AnyError == 0 )
            {
               zm1EO12( 6) ;
               zm1EO12( 7) ;
               zm1EO12( 8) ;
            }
            closeExtendedTableCursors1EO12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1EO1549( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1EO0( ) ;
      }
   }

   public void confirm_1EO1549( )
   {
      s3434TotRefPie = O3434TotRefPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      s3433TotRefMts = O3433TotRefMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      s3432TotRefKgs = O3432TotRefKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1EO1549( ) ;
         if ( ( nRcdExists_1549 != 0 ) || ( nIsMod_1549 != 0 ) )
         {
            getKey1EO1549( ) ;
            if ( ( nRcdExists_1549 == 0 ) && ( nRcdDeleted_1549 == 0 ) )
            {
               if ( RcdFound1549 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1EO1549( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1EO1549( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1EO1549( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3434TotRefPie = A3434TotRefPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
                     O3433TotRefMts = A3433TotRefMts ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
                     O3432TotRefKgs = A3432TotRefKgs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "REFBARCOD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRefBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1549 != 0 )
               {
                  if ( nRcdDeleted_1549 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1EO1549( ) ;
                     load1EO1549( ) ;
                     beforeValidate1EO1549( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1EO1549( ) ;
                        O3434TotRefPie = A3434TotRefPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
                        O3433TotRefMts = A3433TotRefMts ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
                        O3432TotRefKgs = A3432TotRefKgs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1549 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1EO1549( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1EO1549( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1EO1549( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3434TotRefPie = A3434TotRefPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
                           O3433TotRefMts = A3433TotRefMts ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
                           O3432TotRefKgs = A3432TotRefKgs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1549 == 0 )
                  {
                     GXCCtl = "REFBARCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRefBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1549_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3384RefBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A3385RefBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefBarPar_Internalname, GXutil.rtrim( A3386RefBarPar)) ;
         httpContext.changePostValue( edtRefKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefMts_Internalname, GXutil.ltrim( localUtil.ntoc( A3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefPie_Internalname, GXutil.ltrim( localUtil.ntoc( A3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3384RefBarCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3384RefBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3385RefBarReo_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3385RefBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3386RefBarPar_"+sGXsfl_60_idx, GXutil.rtrim( Z3386RefBarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z3387RefKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3388RefMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3389RefPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3389RefPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3388RefMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3387RefKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1549_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1549_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1549_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1549 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1549_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1549_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFBARCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFBARREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFBARPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3434TotRefPie = s3434TotRefPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      O3433TotRefMts = s3433TotRefMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      O3432TotRefKgs = s3432TotRefKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1EO0( )
   {
   }

   public void e111EO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV20station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20station", AV20station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = A407EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20station, GXv_char1, GXv_char2, GXv_char3) ;
      trefhdr_impl.this.A396EmprCod = GXv_char1[0] ;
      trefhdr_impl.this.A407EmprNom = GXv_char2[0] ;
      trefhdr_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV16Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      trefhdr_impl.this.GXt_char4 = GXv_char3[0] ;
      AV16Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char4 = AV18LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      trefhdr_impl.this.GXt_char4 = GXv_char3[0] ;
      AV18LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18LitFe", AV18LitFe);
      GXt_char4 = AV21lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT137_", ""), (byte)(99), GXv_char3) ;
      trefhdr_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21lit1", AV21lit1);
   }

   public void zm1EO12( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T01EO5_A361DisCod[0] ;
            Z2759BarMaqGru = T01EO5_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T01EO5_A180BarMaqCod[0] ;
            Z252CliCod = T01EO5_A252CliCod[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z252CliCod = A252CliCod ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z3432TotRefKgs = A3432TotRefKgs ;
         Z3433TotRefMts = A3433TotRefMts ;
         Z3434TotRefPie = A3434TotRefPie ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01EO6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
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
      /* Using cursor T01EO7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01EO7_A252CliCod[0] ;
      n252CliCod = T01EO7_n252CliCod[0] ;
      A365DisDes = T01EO7_A365DisDes[0] ;
      pr_default.close(5);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
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

   public void load1EO12( )
   {
      /* Using cursor T01EO11 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T01EO11_A361DisCod[0] ;
         A2759BarMaqGru = T01EO11_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01EO11_A180BarMaqCod[0] ;
         A252CliCod = T01EO11_A252CliCod[0] ;
         n252CliCod = T01EO11_n252CliCod[0] ;
         A252CliCod = T01EO11_A252CliCod[0] ;
         n252CliCod = T01EO11_n252CliCod[0] ;
         A365DisDes = T01EO11_A365DisDes[0] ;
         A3432TotRefKgs = T01EO11_A3432TotRefKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         A3433TotRefMts = T01EO11_A3433TotRefMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3434TotRefPie = T01EO11_A3434TotRefPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         zm1EO12( -5) ;
      }
      pr_default.close(7);
      onLoadActions1EO12( ) ;
   }

   public void onLoadActions1EO12( )
   {
      O3434TotRefPie = A3434TotRefPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      O3433TotRefMts = A3433TotRefMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      O3432TotRefKgs = A3432TotRefKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
   }

   public void checkExtendedTable1EO12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01EO9 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A3432TotRefKgs = T01EO9_A3432TotRefKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         A3433TotRefMts = T01EO9_A3433TotRefMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3434TotRefPie = T01EO9_A3434TotRefPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A3432TotRefKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         nIsDirty_12 = (short)(1) ;
         A3433TotRefMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         nIsDirty_12 = (short)(1) ;
         A3434TotRefPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1EO12( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01EO13 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A3432TotRefKgs = T01EO13_A3432TotRefKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         A3433TotRefMts = T01EO13_A3433TotRefMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3434TotRefPie = T01EO13_A3434TotRefPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      }
      else
      {
         A3432TotRefKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         A3433TotRefMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3434TotRefPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3432TotRefKgs, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3433TotRefMts, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3434TotRefPie, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1EO12( )
   {
      /* Using cursor T01EO14 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EO5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01EO5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1EO12( 5) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T01EO5_A361DisCod[0] ;
         A2759BarMaqGru = T01EO5_A2759BarMaqGru[0] ;
         A129BarCod = T01EO5_A129BarCod[0] ;
         n129BarCod = T01EO5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01EO5_A132BarCodReo[0] ;
         n132BarCodReo = T01EO5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01EO5_A130BarCodPar[0] ;
         n130BarCodPar = T01EO5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A180BarMaqCod = T01EO5_A180BarMaqCod[0] ;
         A252CliCod = T01EO5_A252CliCod[0] ;
         n252CliCod = T01EO5_n252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1EO12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1EO12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1EO12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1EO12( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T01EO15 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01EO15_A129BarCod[0] < A129BarCod ) || ( T01EO15_A129BarCod[0] == A129BarCod ) && ( T01EO15_A132BarCodReo[0] < A132BarCodReo ) || ( T01EO15_A132BarCodReo[0] == A132BarCodReo ) && ( T01EO15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EO15_A130BarCodPar[0], A130BarCodPar) < 0 ) ) && ( GXutil.strcmp(T01EO15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01EO15_A129BarCod[0] > A129BarCod ) || ( T01EO15_A129BarCod[0] == A129BarCod ) && ( T01EO15_A132BarCodReo[0] > A132BarCodReo ) || ( T01EO15_A132BarCodReo[0] == A132BarCodReo ) && ( T01EO15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EO15_A130BarCodPar[0], A130BarCodPar) > 0 ) ) && ( GXutil.strcmp(T01EO15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01EO15_A129BarCod[0] ;
            n129BarCod = T01EO15_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01EO15_A132BarCodReo[0] ;
            n132BarCodReo = T01EO15_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01EO15_A130BarCodPar[0] ;
            n130BarCodPar = T01EO15_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01EO16 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01EO16_A129BarCod[0] > A129BarCod ) || ( T01EO16_A129BarCod[0] == A129BarCod ) && ( T01EO16_A132BarCodReo[0] > A132BarCodReo ) || ( T01EO16_A132BarCodReo[0] == A132BarCodReo ) && ( T01EO16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EO16_A130BarCodPar[0], A130BarCodPar) > 0 ) ) && ( GXutil.strcmp(T01EO16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01EO16_A129BarCod[0] < A129BarCod ) || ( T01EO16_A129BarCod[0] == A129BarCod ) && ( T01EO16_A132BarCodReo[0] < A132BarCodReo ) || ( T01EO16_A132BarCodReo[0] == A132BarCodReo ) && ( T01EO16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01EO16_A130BarCodPar[0], A130BarCodPar) < 0 ) ) && ( GXutil.strcmp(T01EO16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01EO16_A129BarCod[0] ;
            n129BarCod = T01EO16_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01EO16_A132BarCodReo[0] ;
            n132BarCodReo = T01EO16_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01EO16_A130BarCodPar[0] ;
            n130BarCodPar = T01EO16_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EO12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3434TotRefPie = O3434TotRefPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         A3433TotRefMts = O3433TotRefMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3432TotRefKgs = O3432TotRefKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1EO12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A129BarCod = Z129BarCod ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3434TotRefPie = O3434TotRefPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
               A3433TotRefMts = O3433TotRefMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
               A3432TotRefKgs = O3432TotRefKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3434TotRefPie = O3434TotRefPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
               A3433TotRefMts = O3433TotRefMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
               A3432TotRefKgs = O3432TotRefKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
               update1EO12( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3434TotRefPie = O3434TotRefPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
               A3433TotRefMts = O3433TotRefMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
               A3432TotRefKgs = O3432TotRefKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1EO12( ) ;
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
                  A3434TotRefPie = O3434TotRefPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
                  A3433TotRefMts = O3433TotRefMts ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
                  A3432TotRefKgs = O3432TotRefKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1EO12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A129BarCod = Z129BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3434TotRefPie = O3434TotRefPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         A3433TotRefMts = O3433TotRefMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3432TotRefKgs = O3432TotRefKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarCod_Internalname ;
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
      getKey1EO12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
         {
            A129BarCod = Z129BarCod ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trefhdr");
   }

   public void insert_check( )
   {
      confirm_1EO0( ) ;
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
      if ( RcdFound12 == 0 )
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
      scanStart1EO12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1EO12( ) ;
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
      if ( RcdFound12 == 0 )
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
      if ( RcdFound12 == 0 )
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
      scanStart1EO12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext1EO12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1EO12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1EO12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EO4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z361DisCod != T01EO4_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T01EO4_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01EO4_A180BarMaqCod[0]) != 0 ) || ( Z252CliCod != T01EO4_A252CliCod[0] ) )
         {
            if ( Z361DisCod != T01EO4_A361DisCod[0] )
            {
               GXutil.writeLogln("trefhdr:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01EO4_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T01EO4_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("trefhdr:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01EO4_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01EO4_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("trefhdr:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01EO4_A180BarMaqCod[0]);
            }
            if ( Z252CliCod != T01EO4_A252CliCod[0] )
            {
               GXutil.writeLogln("trefhdr:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01EO4_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EO12( )
   {
      beforeValidate1EO12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EO12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EO12( 0) ;
         checkOptimisticConcurrency1EO12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EO12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EO12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EO17 */
                  pr_default.execute(12, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(12) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11EO12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1EO12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1EO0( ) ;
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
            load1EO12( ) ;
         }
         endLevel1EO12( ) ;
      }
      closeExtendedTableCursors1EO12( ) ;
   }

   public void update1EO12( )
   {
      beforeValidate1EO12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EO12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EO12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EO12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EO12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EO18 */
                  pr_default.execute(13, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1EO12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char3[0] = A396EmprCod ;
                     GXv_int5[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char2[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_char2) ;
                     trefhdr_impl.this.A396EmprCod = GXv_char3[0] ;
                     trefhdr_impl.this.A129BarCod = GXv_int5[0] ;
                     trefhdr_impl.this.A132BarCodReo = GXv_int6[0] ;
                     trefhdr_impl.this.A130BarCodPar = GXv_char2[0] ;
                     updateTablesN11EO12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1EO12( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1EO0( ) ;
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
         endLevel1EO12( ) ;
      }
      closeExtendedTableCursors1EO12( ) ;
   }

   public void deferredUpdate1EO12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EO12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EO12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EO12( ) ;
         afterConfirm1EO12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EO12( ) ;
            if ( AnyError == 0 )
            {
               A3434TotRefPie = O3434TotRefPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
               A3433TotRefMts = O3433TotRefMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
               A3432TotRefKgs = O3432TotRefKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
               scanStart1EO1549( ) ;
               while ( RcdFound1549 != 0 )
               {
                  getByPrimaryKey1EO1549( ) ;
                  delete1EO1549( ) ;
                  scanNext1EO1549( ) ;
                  O3434TotRefPie = A3434TotRefPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
                  O3433TotRefMts = A3433TotRefMts ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
                  O3432TotRefKgs = A3432TotRefKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
               }
               scanEnd1EO1549( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EO19 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11EO12( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll1EO12( ) ;
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
                        resetCaption1EO0( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EO12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EO12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01EO21 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A3432TotRefKgs = T01EO21_A3432TotRefKgs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
            A3433TotRefMts = T01EO21_A3433TotRefMts[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
            A3434TotRefPie = T01EO21_A3434TotRefPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         }
         else
         {
            A3432TotRefKgs = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
            A3433TotRefMts = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
            A3434TotRefPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         }
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01EO22 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01EO23 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01EO24 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01EO25 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01EO26 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01EO27 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01EO28 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01EO29 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01EO30 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01EO31 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01EO32 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01EO33 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01EO34 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01EO35 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01EO36 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01EO37 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01EO38 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01EO39 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01EO40 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01EO41 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01EO42 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01EO43 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01EO44 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01EO45 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01EO46 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01EO47 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01EO48 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01EO49 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01EO50 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01EO51 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01EO52 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01EO53 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01EO54 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01EO55 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01EO56 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01EO57 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01EO58 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01EO59 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01EO60 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01EO61 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01EO62 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01EO63 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01EO64 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01EO65 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01EO66 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01EO67 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01EO68 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01EO69 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01EO70 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01EO71 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01EO72 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01EO73 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01EO74 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01EO75 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01EO76 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01EO77 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01EO78 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01EO79 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01EO80 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01EO81 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01EO82 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01EO83 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
      }
   }

   public void processNestedLevel1EO1549( )
   {
      s3434TotRefPie = O3434TotRefPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      s3433TotRefMts = O3433TotRefMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      s3432TotRefKgs = O3432TotRefKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1EO1549( ) ;
         if ( ( nRcdExists_1549 != 0 ) || ( nIsMod_1549 != 0 ) )
         {
            standaloneNotModal1EO1549( ) ;
            getKey1EO1549( ) ;
            if ( ( nRcdExists_1549 == 0 ) && ( nRcdDeleted_1549 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1EO1549( ) ;
            }
            else
            {
               if ( RcdFound1549 != 0 )
               {
                  if ( ( nRcdDeleted_1549 != 0 ) && ( nRcdExists_1549 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1EO1549( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1549 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1EO1549( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1549 == 0 )
                  {
                     GXCCtl = "REFBARCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRefBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3434TotRefPie = A3434TotRefPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
            O3433TotRefMts = A3433TotRefMts ;
            httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
            O3432TotRefKgs = A3432TotRefKgs ;
            httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1549_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3384RefBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A3385RefBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefBarPar_Internalname, GXutil.rtrim( A3386RefBarPar)) ;
         httpContext.changePostValue( edtRefKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefMts_Internalname, GXutil.ltrim( localUtil.ntoc( A3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRefPie_Internalname, GXutil.ltrim( localUtil.ntoc( A3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3384RefBarCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3384RefBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3385RefBarReo_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3385RefBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3386RefBarPar_"+sGXsfl_60_idx, GXutil.rtrim( Z3386RefBarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z3387RefKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3388RefMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3389RefPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3389RefPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3388RefMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3387RefKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( O3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1549_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1549_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1549_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1549 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1549_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1549_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFBARCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFBARREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFBARPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REFPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1EO1549( ) ;
      if ( AnyError != 0 )
      {
         O3434TotRefPie = s3434TotRefPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         O3433TotRefMts = s3433TotRefMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         O3432TotRefKgs = s3432TotRefKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      }
      nRcdExists_1549 = (short)(0) ;
      nIsMod_1549 = (short)(0) ;
      nRcdDeleted_1549 = (short)(0) ;
   }

   public void processLevel1EO12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1EO1549( ) ;
      if ( AnyError != 0 )
      {
         O3434TotRefPie = s3434TotRefPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         O3433TotRefMts = s3433TotRefMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         O3432TotRefKgs = s3432TotRefKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11EO12( )
   {
      /* Using cursor T01EO84 */
      pr_default.execute(78, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1EO12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1EO12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trefhdr");
         if ( AnyError == 0 )
         {
            confirmValues1EO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trefhdr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EO12( )
   {
      /* Scan By routine */
      /* Using cursor T01EO85 */
      pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A129BarCod = T01EO85_A129BarCod[0] ;
         n129BarCod = T01EO85_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01EO85_A132BarCodReo[0] ;
         n132BarCodReo = T01EO85_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01EO85_A130BarCodPar[0] ;
         n130BarCodPar = T01EO85_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EO12( )
   {
      /* Scan next routine */
      pr_default.readNext(79);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A129BarCod = T01EO85_A129BarCod[0] ;
         n129BarCod = T01EO85_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01EO85_A132BarCodReo[0] ;
         n132BarCodReo = T01EO85_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01EO85_A130BarCodPar[0] ;
         n130BarCodPar = T01EO85_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1EO12( )
   {
      pr_default.close(79);
   }

   public void afterConfirm1EO12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EO12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EO12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EO12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EO12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EO12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EO12( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTotRefKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotRefKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotRefKgs_Enabled), 5, 0), true);
      edtTotRefMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotRefMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotRefMts_Enabled), 5, 0), true);
      edtTotRefPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotRefPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotRefPie_Enabled), 5, 0), true);
   }

   public void zm1EO1549( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3387RefKgs = T01EO3_A3387RefKgs[0] ;
            Z3388RefMts = T01EO3_A3388RefMts[0] ;
            Z3389RefPie = T01EO3_A3389RefPie[0] ;
         }
         else
         {
            Z3387RefKgs = A3387RefKgs ;
            Z3388RefMts = A3388RefMts ;
            Z3389RefPie = A3389RefPie ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z3384RefBarCod = A3384RefBarCod ;
         Z3385RefBarReo = A3385RefBarReo ;
         Z3386RefBarPar = A3386RefBarPar ;
         Z3387RefKgs = A3387RefKgs ;
         Z3388RefMts = A3388RefMts ;
         Z3389RefPie = A3389RefPie ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1EO1549( )
   {
   }

   public void standaloneModal1EO1549( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRefBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRefBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtRefBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRefBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRefBarReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRefBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtRefBarReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRefBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRefBarPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRefBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtRefBarPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRefBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1EO1549( )
   {
      /* Using cursor T01EO86 */
      pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A3384RefBarCod), Byte.valueOf(A3385RefBarReo), A3386RefBarPar});
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound1549 = (short)(1) ;
         A3387RefKgs = T01EO86_A3387RefKgs[0] ;
         n3387RefKgs = T01EO86_n3387RefKgs[0] ;
         A3388RefMts = T01EO86_A3388RefMts[0] ;
         n3388RefMts = T01EO86_n3388RefMts[0] ;
         A3389RefPie = T01EO86_A3389RefPie[0] ;
         n3389RefPie = T01EO86_n3389RefPie[0] ;
         zm1EO1549( -9) ;
      }
      pr_default.close(80);
      onLoadActions1EO1549( ) ;
   }

   public void onLoadActions1EO1549( )
   {
      if ( isIns( )  )
      {
         A3432TotRefKgs = O3432TotRefKgs.add(A3387RefKgs) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A3432TotRefKgs = O3432TotRefKgs.add(A3387RefKgs).subtract(O3387RefKgs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A3432TotRefKgs = O3432TotRefKgs.subtract(O3387RefKgs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A3433TotRefMts = O3433TotRefMts.add(A3388RefMts) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A3433TotRefMts = O3433TotRefMts.add(A3388RefMts).subtract(O3388RefMts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A3433TotRefMts = O3433TotRefMts.subtract(O3388RefMts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A3434TotRefPie = (short)(O3434TotRefPie+A3389RefPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A3434TotRefPie = (short)(O3434TotRefPie+A3389RefPie-O3389RefPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A3434TotRefPie = (short)(O3434TotRefPie-O3389RefPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
            }
         }
      }
   }

   public void checkExtendedTable1EO1549( )
   {
      nIsDirty_1549 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1EO1549( ) ;
      if ( isIns( )  )
      {
         nIsDirty_1549 = (short)(1) ;
         A3432TotRefKgs = O3432TotRefKgs.add(A3387RefKgs) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1549 = (short)(1) ;
            A3432TotRefKgs = O3432TotRefKgs.add(A3387RefKgs).subtract(O3387RefKgs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1549 = (short)(1) ;
               A3432TotRefKgs = O3432TotRefKgs.subtract(O3387RefKgs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1549 = (short)(1) ;
         A3433TotRefMts = O3433TotRefMts.add(A3388RefMts) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1549 = (short)(1) ;
            A3433TotRefMts = O3433TotRefMts.add(A3388RefMts).subtract(O3388RefMts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1549 = (short)(1) ;
               A3433TotRefMts = O3433TotRefMts.subtract(O3388RefMts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1549 = (short)(1) ;
         A3434TotRefPie = (short)(O3434TotRefPie+A3389RefPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1549 = (short)(1) ;
            A3434TotRefPie = (short)(O3434TotRefPie+A3389RefPie-O3389RefPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1549 = (short)(1) ;
               A3434TotRefPie = (short)(O3434TotRefPie-O3389RefPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors1EO1549( )
   {
   }

   public void enableDisable1EO1549( )
   {
   }

   public void getKey1EO1549( )
   {
      /* Using cursor T01EO87 */
      pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A3384RefBarCod), Byte.valueOf(A3385RefBarReo), A3386RefBarPar});
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound1549 = (short)(1) ;
      }
      else
      {
         RcdFound1549 = (short)(0) ;
      }
      pr_default.close(81);
   }

   public void getByPrimaryKey1EO1549( )
   {
      /* Using cursor T01EO3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A3384RefBarCod), Byte.valueOf(A3385RefBarReo), A3386RefBarPar});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01EO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1EO1549( 9) ;
         RcdFound1549 = (short)(1) ;
         initializeNonKey1EO1549( ) ;
         A3384RefBarCod = T01EO3_A3384RefBarCod[0] ;
         A3385RefBarReo = T01EO3_A3385RefBarReo[0] ;
         A3386RefBarPar = T01EO3_A3386RefBarPar[0] ;
         A3387RefKgs = T01EO3_A3387RefKgs[0] ;
         n3387RefKgs = T01EO3_n3387RefKgs[0] ;
         A3388RefMts = T01EO3_A3388RefMts[0] ;
         n3388RefMts = T01EO3_n3388RefMts[0] ;
         A3389RefPie = T01EO3_A3389RefPie[0] ;
         n3389RefPie = T01EO3_n3389RefPie[0] ;
         O3389RefPie = A3389RefPie ;
         n3389RefPie = false ;
         O3388RefMts = A3388RefMts ;
         n3388RefMts = false ;
         O3387RefKgs = A3387RefKgs ;
         n3387RefKgs = false ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z3384RefBarCod = A3384RefBarCod ;
         Z3385RefBarReo = A3385RefBarReo ;
         Z3386RefBarPar = A3386RefBarPar ;
         sMode1549 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EO1549( ) ;
         load1EO1549( ) ;
         Gx_mode = sMode1549 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1549 = (short)(0) ;
         initializeNonKey1EO1549( ) ;
         sMode1549 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EO1549( ) ;
         Gx_mode = sMode1549 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1EO1549( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1EO1549( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EO2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A3384RefBarCod), Byte.valueOf(A3385RefBarReo), A3386RefBarPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREFHDR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3387RefKgs, T01EO2_A3387RefKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z3388RefMts, T01EO2_A3388RefMts[0]) != 0 ) || ( Z3389RefPie != T01EO2_A3389RefPie[0] ) )
         {
            if ( DecimalUtil.compareTo(Z3387RefKgs, T01EO2_A3387RefKgs[0]) != 0 )
            {
               GXutil.writeLogln("trefhdr:[seudo value changed for attri]"+"RefKgs");
               GXutil.writeLogRaw("Old: ",Z3387RefKgs);
               GXutil.writeLogRaw("Current: ",T01EO2_A3387RefKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z3388RefMts, T01EO2_A3388RefMts[0]) != 0 )
            {
               GXutil.writeLogln("trefhdr:[seudo value changed for attri]"+"RefMts");
               GXutil.writeLogRaw("Old: ",Z3388RefMts);
               GXutil.writeLogRaw("Current: ",T01EO2_A3388RefMts[0]);
            }
            if ( Z3389RefPie != T01EO2_A3389RefPie[0] )
            {
               GXutil.writeLogln("trefhdr:[seudo value changed for attri]"+"RefPie");
               GXutil.writeLogRaw("Old: ",Z3389RefPie);
               GXutil.writeLogRaw("Current: ",T01EO2_A3389RefPie[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPREFHDR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EO1549( )
   {
      beforeValidate1EO1549( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EO1549( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EO1549( 0) ;
         checkOptimisticConcurrency1EO1549( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EO1549( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EO1549( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EO88 */
                  pr_default.execute(82, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A3384RefBarCod), Byte.valueOf(A3385RefBarReo), A3386RefBarPar, Boolean.valueOf(n3387RefKgs), A3387RefKgs, Boolean.valueOf(n3388RefMts), A3388RefMts, Boolean.valueOf(n3389RefPie), Short.valueOf(A3389RefPie), Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREFHDR");
                  if ( (pr_default.getStatus(82) == 1) )
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
            load1EO1549( ) ;
         }
         endLevel1EO1549( ) ;
      }
      closeExtendedTableCursors1EO1549( ) ;
   }

   public void update1EO1549( )
   {
      beforeValidate1EO1549( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EO1549( ) ;
      }
      if ( ( nIsMod_1549 != 0 ) || ( nIsDirty_1549 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1EO1549( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1EO1549( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1EO1549( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01EO89 */
                     pr_default.execute(83, new Object[] {Boolean.valueOf(n3387RefKgs), A3387RefKgs, Boolean.valueOf(n3388RefMts), A3388RefMts, Boolean.valueOf(n3389RefPie), Short.valueOf(A3389RefPie), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A3384RefBarCod), Byte.valueOf(A3385RefBarReo), A3386RefBarPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREFHDR");
                     if ( (pr_default.getStatus(83) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREFHDR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1EO1549( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char3[0] = A396EmprCod ;
                        GXv_int5[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char2[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_char2) ;
                        trefhdr_impl.this.A396EmprCod = GXv_char3[0] ;
                        trefhdr_impl.this.A129BarCod = GXv_int5[0] ;
                        trefhdr_impl.this.A132BarCodReo = GXv_int6[0] ;
                        trefhdr_impl.this.A130BarCodPar = GXv_char2[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1EO1549( ) ;
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
            endLevel1EO1549( ) ;
         }
      }
      closeExtendedTableCursors1EO1549( ) ;
   }

   public void deferredUpdate1EO1549( )
   {
   }

   public void delete1EO1549( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EO1549( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EO1549( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EO1549( ) ;
         afterConfirm1EO1549( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EO1549( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EO90 */
               pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A3384RefBarCod), Byte.valueOf(A3385RefBarReo), A3386RefBarPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREFHDR");
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
      sMode1549 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EO1549( ) ;
      Gx_mode = sMode1549 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EO1549( )
   {
      standaloneModal1EO1549( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A3432TotRefKgs = O3432TotRefKgs.add(A3387RefKgs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A3432TotRefKgs = O3432TotRefKgs.add(A3387RefKgs).subtract(O3387RefKgs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3432TotRefKgs = O3432TotRefKgs.subtract(O3387RefKgs) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A3433TotRefMts = O3433TotRefMts.add(A3388RefMts) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A3433TotRefMts = O3433TotRefMts.add(A3388RefMts).subtract(O3388RefMts) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3433TotRefMts = O3433TotRefMts.subtract(O3388RefMts) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A3434TotRefPie = (short)(O3434TotRefPie+A3389RefPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A3434TotRefPie = (short)(O3434TotRefPie+A3389RefPie-O3389RefPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3434TotRefPie = (short)(O3434TotRefPie-O3389RefPie) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
               }
            }
         }
      }
   }

   public void endLevel1EO1549( )
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

   public void scanStart1EO1549( )
   {
      /* Scan By routine */
      /* Using cursor T01EO91 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound1549 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound1549 = (short)(1) ;
         A3384RefBarCod = T01EO91_A3384RefBarCod[0] ;
         A3385RefBarReo = T01EO91_A3385RefBarReo[0] ;
         A3386RefBarPar = T01EO91_A3386RefBarPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EO1549( )
   {
      /* Scan next routine */
      pr_default.readNext(85);
      RcdFound1549 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound1549 = (short)(1) ;
         A3384RefBarCod = T01EO91_A3384RefBarCod[0] ;
         A3385RefBarReo = T01EO91_A3385RefBarReo[0] ;
         A3386RefBarPar = T01EO91_A3386RefBarPar[0] ;
      }
   }

   public void scanEnd1EO1549( )
   {
      pr_default.close(85);
   }

   public void afterConfirm1EO1549( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EO1549( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EO1549( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EO1549( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EO1549( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EO1549( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EO1549( )
   {
      edtRefBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtRefBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtRefBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtRefKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefKgs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtRefMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefMts_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtRefPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefPie_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1EO1549( )
   {
   }

   public void send_integrity_lvl_hashes1EO12( )
   {
   }

   public void subsflControlProps_601549( )
   {
      edtavnRcdDeleted_1549_Internalname = "vNRCDDELETED_1549_"+sGXsfl_60_idx ;
      edtRefBarCod_Internalname = "REFBARCOD_"+sGXsfl_60_idx ;
      edtRefBarReo_Internalname = "REFBARREO_"+sGXsfl_60_idx ;
      edtRefBarPar_Internalname = "REFBARPAR_"+sGXsfl_60_idx ;
      edtRefKgs_Internalname = "REFKGS_"+sGXsfl_60_idx ;
      edtRefMts_Internalname = "REFMTS_"+sGXsfl_60_idx ;
      edtRefPie_Internalname = "REFPIE_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601549( )
   {
      edtavnRcdDeleted_1549_Internalname = "vNRCDDELETED_1549_"+sGXsfl_60_fel_idx ;
      edtRefBarCod_Internalname = "REFBARCOD_"+sGXsfl_60_fel_idx ;
      edtRefBarReo_Internalname = "REFBARREO_"+sGXsfl_60_fel_idx ;
      edtRefBarPar_Internalname = "REFBARPAR_"+sGXsfl_60_fel_idx ;
      edtRefKgs_Internalname = "REFKGS_"+sGXsfl_60_fel_idx ;
      edtRefMts_Internalname = "REFMTS_"+sGXsfl_60_fel_idx ;
      edtRefPie_Internalname = "REFPIE_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1EO1549( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601549( ) ;
      sendRow1EO1549( ) ;
   }

   public void sendRow1EO1549( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1549_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1549_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1549_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1549), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1549), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1549_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1549_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1549_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRefBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A3384RefBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3384RefBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRefBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRefBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1549_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRefBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A3385RefBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3385RefBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRefBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRefBarReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1549_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRefBarPar_Internalname,GXutil.rtrim( A3386RefBarPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRefBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRefBarPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1549_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRefKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRefKgs_Enabled!=0) ? localUtil.format( A3387RefKgs, "ZZZZZ9.99") : localUtil.format( A3387RefKgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRefKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRefKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1549_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRefMts_Internalname,GXutil.ltrim( localUtil.ntoc( A3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRefMts_Enabled!=0) ? localUtil.format( A3388RefMts, "ZZZZZ9.99") : localUtil.format( A3388RefMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRefMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRefMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1549_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRefPie_Internalname,GXutil.ltrim( localUtil.ntoc( A3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRefPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3389RefPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3389RefPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRefPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRefPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1EO1549( ) ;
      GXCCtl = "Z3384RefBarCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3384RefBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3385RefBarReo_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3385RefBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3386RefBarPar_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3386RefBarPar));
      GXCCtl = "Z3387RefKgs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3388RefMts_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3389RefPie_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O3389RefPie_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3389RefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O3388RefMts_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3388RefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O3387RefKgs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3387RefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1549_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1549_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1549_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1549, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1549_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1549_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REFBARCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REFBARREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REFBARPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REFKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REFMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REFPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRefPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1EO1549( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601549( ) ;
      edtavnRcdDeleted_1549_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1549_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRefBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFBARCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRefBarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFBARREO_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRefBarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFBARPAR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRefKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFKGS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRefMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFMTS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRefPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REFPIE_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1549_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1549_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1549");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1549_Internalname ;
         wbErr = true ;
         nRcdDeleted_1549 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1549 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1549_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRefBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRefBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "REFBARCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRefBarCod_Internalname ;
         wbErr = true ;
         A3384RefBarCod = 0 ;
      }
      else
      {
         A3384RefBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtRefBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRefBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRefBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "REFBARREO_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRefBarReo_Internalname ;
         wbErr = true ;
         A3385RefBarReo = (byte)(0) ;
      }
      else
      {
         A3385RefBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtRefBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3386RefBarPar = httpContext.cgiGet( edtRefBarPar_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRefKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRefKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "REFKGS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRefKgs_Internalname ;
         wbErr = true ;
         A3387RefKgs = DecimalUtil.ZERO ;
         n3387RefKgs = false ;
      }
      else
      {
         A3387RefKgs = localUtil.ctond( httpContext.cgiGet( edtRefKgs_Internalname)) ;
         n3387RefKgs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRefMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRefMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "REFMTS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRefMts_Internalname ;
         wbErr = true ;
         A3388RefMts = DecimalUtil.ZERO ;
         n3388RefMts = false ;
      }
      else
      {
         A3388RefMts = localUtil.ctond( httpContext.cgiGet( edtRefMts_Internalname)) ;
         n3388RefMts = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRefPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRefPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "REFPIE_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRefPie_Internalname ;
         wbErr = true ;
         A3389RefPie = (short)(0) ;
         n3389RefPie = false ;
      }
      else
      {
         A3389RefPie = (short)(localUtil.ctol( httpContext.cgiGet( edtRefPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3389RefPie = false ;
      }
      GXCCtl = "Z3384RefBarCod_" + sGXsfl_60_idx ;
      Z3384RefBarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3385RefBarReo_" + sGXsfl_60_idx ;
      Z3385RefBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3386RefBarPar_" + sGXsfl_60_idx ;
      Z3386RefBarPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3387RefKgs_" + sGXsfl_60_idx ;
      Z3387RefKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3388RefMts_" + sGXsfl_60_idx ;
      Z3388RefMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3389RefPie_" + sGXsfl_60_idx ;
      Z3389RefPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O3389RefPie_" + sGXsfl_60_idx ;
      O3389RefPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O3388RefMts_" + sGXsfl_60_idx ;
      O3388RefMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O3387RefKgs_" + sGXsfl_60_idx ;
      O3387RefKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1549_" + sGXsfl_60_idx ;
      nRcdDeleted_1549 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1549_" + sGXsfl_60_idx ;
      nRcdExists_1549 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1549_" + sGXsfl_60_idx ;
      nIsMod_1549 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRefBarPar_Enabled = edtRefBarPar_Enabled ;
      defedtRefBarReo_Enabled = edtRefBarReo_Enabled ;
      defedtRefBarCod_Enabled = edtRefBarCod_Enabled ;
   }

   public void confirmValues1EO0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601549( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601549( ) ;
         httpContext.changePostValue( "Z3384RefBarCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3384RefBarCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3384RefBarCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3385RefBarReo_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3385RefBarReo_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3385RefBarReo_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3386RefBarPar_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3386RefBarPar_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3386RefBarPar_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3387RefKgs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3387RefKgs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3387RefKgs_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3388RefMts_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3388RefMts_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3388RefMts_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3389RefPie_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3389RefPie_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3389RefPie_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O3389RefPie", httpContext.cgiGet( "T3389RefPie")) ;
      httpContext.deletePostValue( "T3389RefPie") ;
      httpContext.changePostValue( "O3388RefMts", httpContext.cgiGet( "T3388RefMts")) ;
      httpContext.deletePostValue( "T3388RefMts") ;
      httpContext.changePostValue( "O3387RefKgs", httpContext.cgiGet( "T3387RefKgs")) ;
      httpContext.deletePostValue( "T3387RefKgs") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trefhdr", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TREFHDR");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trefhdr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3434TotRefPie", GXutil.ltrim( localUtil.ntoc( O3434TotRefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3433TotRefMts", GXutil.ltrim( localUtil.ntoc( O3433TotRefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3432TotRefKgs", GXutil.ltrim( localUtil.ntoc( O3432TotRefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.trefhdr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TREFHDR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "REFERENCIAS HOJAS DE RUTA", "") ;
   }

   public void initializeNonKey1EO12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A3432TotRefKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      A3433TotRefMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      A3434TotRefPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O3434TotRefPie = A3434TotRefPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      O3433TotRefMts = A3433TotRefMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
      O3432TotRefKgs = A3432TotRefKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1EO12( )
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
      initializeNonKey1EO12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1EO1549( )
   {
      A3387RefKgs = DecimalUtil.ZERO ;
      n3387RefKgs = false ;
      A3388RefMts = DecimalUtil.ZERO ;
      n3388RefMts = false ;
      A3389RefPie = (short)(0) ;
      n3389RefPie = false ;
      O3389RefPie = A3389RefPie ;
      n3389RefPie = false ;
      O3388RefMts = A3388RefMts ;
      n3388RefMts = false ;
      O3387RefKgs = A3387RefKgs ;
      n3387RefKgs = false ;
      Z3387RefKgs = DecimalUtil.ZERO ;
      Z3388RefMts = DecimalUtil.ZERO ;
      Z3389RefPie = (short)(0) ;
   }

   public void initAll1EO1549( )
   {
      A3384RefBarCod = 0 ;
      A3385RefBarReo = (byte)(0) ;
      A3386RefBarPar = "" ;
      initializeNonKey1EO1549( ) ;
   }

   public void standaloneModalInsert1EO1549( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573035", true, true);
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
      httpContext.AddJavascriptSource("trefhdr.js", "?20268241573035", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1549( )
   {
      edtRefBarPar_Enabled = defedtRefBarPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtRefBarReo_Enabled = defedtRefBarReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtRefBarCod_Enabled = defedtRefBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefBarCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1549, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1549_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3384RefBarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3385RefBarReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3386RefBarPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRefBarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3387RefKgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRefKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3388RefMts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRefMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3389RefPie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRefPie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTotRefKgs_Internalname = "TOTREFKGS" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTotRefMts_Internalname = "TOTREFMTS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTotRefPie_Internalname = "TOTREFPIE" ;
      edtavnRcdDeleted_1549_Internalname = "vNRCDDELETED_1549" ;
      edtRefBarCod_Internalname = "REFBARCOD" ;
      edtRefBarReo_Internalname = "REFBARREO" ;
      edtRefBarPar_Internalname = "REFBARPAR" ;
      edtRefKgs_Internalname = "REFKGS" ;
      edtRefMts_Internalname = "REFMTS" ;
      edtRefPie_Internalname = "REFPIE" ;
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
      Form.setCaption( httpContext.getMessage( "REFERENCIAS HOJAS DE RUTA", "") );
      edtRefPie_Jsonclick = "" ;
      edtRefMts_Jsonclick = "" ;
      edtRefKgs_Jsonclick = "" ;
      edtRefBarPar_Jsonclick = "" ;
      edtRefBarReo_Jsonclick = "" ;
      edtRefBarCod_Jsonclick = "" ;
      edtavnRcdDeleted_1549_Jsonclick = "" ;
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
      edtRefPie_Enabled = 1 ;
      edtRefMts_Enabled = 1 ;
      edtRefKgs_Enabled = 1 ;
      edtRefBarPar_Enabled = 1 ;
      edtRefBarReo_Enabled = 1 ;
      edtRefBarCod_Enabled = 1 ;
      edtavnRcdDeleted_1549_Enabled = 1 ;
      edtTotRefPie_Jsonclick = "" ;
      edtTotRefPie_Backcolor = (int)(0xFFFFFF) ;
      edtTotRefPie_Enabled = 0 ;
      edtTotRefMts_Jsonclick = "" ;
      edtTotRefMts_Backcolor = (int)(0xFFFFFF) ;
      edtTotRefMts_Enabled = 0 ;
      edtTotRefKgs_Jsonclick = "" ;
      edtTotRefKgs_Backcolor = (int)(0xFFFFFF) ;
      edtTotRefKgs_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
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
      subsflControlProps_601549( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1EO1549( ) ;
         standaloneModal1EO1549( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1EO1549( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601549( ) ;
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
      /* Using cursor T01EO92 */
      pr_default.execute(86, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(86) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EO92_A407EmprNom[0] ;
      n407EmprNom = T01EO92_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(86);
      /* Using cursor T01EO21 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A3432TotRefKgs = T01EO21_A3432TotRefKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         A3433TotRefMts = T01EO21_A3433TotRefMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3434TotRefPie = T01EO21_A3434TotRefPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      }
      else
      {
         A3432TotRefKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrimstr( A3432TotRefKgs, 9, 2));
         A3433TotRefMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrimstr( A3433TotRefMts, 9, 2));
         A3434TotRefPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3434TotRefPie), 4, 0));
      }
      pr_default.close(15);
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

   public void valid_Barcodpar( )
   {
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01EO21 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A3432TotRefKgs = T01EO21_A3432TotRefKgs[0] ;
         A3433TotRefMts = T01EO21_A3433TotRefMts[0] ;
         A3434TotRefPie = T01EO21_A3434TotRefPie[0] ;
      }
      else
      {
         A3432TotRefKgs = DecimalUtil.doubleToDec(0) ;
         A3433TotRefMts = DecimalUtil.doubleToDec(0) ;
         A3434TotRefPie = (short)(0) ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3432TotRefKgs", GXutil.ltrim( localUtil.ntoc( A3432TotRefKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3433TotRefMts", GXutil.ltrim( localUtil.ntoc( A3433TotRefMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3434TotRefPie", GXutil.ltrim( localUtil.ntoc( A3434TotRefPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3432TotRefKgs", GXutil.ltrim( localUtil.ntoc( Z3432TotRefKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3433TotRefMts", GXutil.ltrim( localUtil.ntoc( Z3433TotRefMts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3434TotRefPie", GXutil.ltrim( localUtil.ntoc( Z3434TotRefPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3434TotRefPie", GXutil.ltrim( localUtil.ntoc( O3434TotRefPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3433TotRefMts", GXutil.ltrim( localUtil.ntoc( O3433TotRefMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3432TotRefKgs", GXutil.ltrim( localUtil.ntoc( O3432TotRefKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3432TotRefKgs',fld:'TOTREFKGS',pic:'ZZZZZ9.99'},{av:'A3433TotRefMts',fld:'TOTREFMTS',pic:'ZZZZZ9.99'},{av:'A3434TotRefPie',fld:'TOTREFPIE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z252CliCod'},{av:'Z365DisDes'},{av:'Z407EmprNom'},{av:'Z3432TotRefKgs'},{av:'Z3433TotRefMts'},{av:'Z3434TotRefPie'},{av:'O3434TotRefPie'},{av:'O3433TotRefMts'},{av:'O3432TotRefKgs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_REFBARCOD","{handler:'valid_Refbarcod',iparms:[]");
      setEventMetadata("VALID_REFBARCOD",",oparms:[]}");
      setEventMetadata("VALID_REFBARREO","{handler:'valid_Refbarreo',iparms:[]");
      setEventMetadata("VALID_REFBARREO",",oparms:[]}");
      setEventMetadata("VALID_REFBARPAR","{handler:'valid_Refbarpar',iparms:[]");
      setEventMetadata("VALID_REFBARPAR",",oparms:[]}");
      setEventMetadata("VALID_REFKGS","{handler:'valid_Refkgs',iparms:[]");
      setEventMetadata("VALID_REFKGS",",oparms:[]}");
      setEventMetadata("VALID_REFMTS","{handler:'valid_Refmts',iparms:[]");
      setEventMetadata("VALID_REFMTS",",oparms:[]}");
      setEventMetadata("VALID_REFPIE","{handler:'valid_Refpie',iparms:[]");
      setEventMetadata("VALID_REFPIE",",oparms:[]}");
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
      pr_default.close(86);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      O3433TotRefMts = DecimalUtil.ZERO ;
      O3432TotRefKgs = DecimalUtil.ZERO ;
      Z3386RefBarPar = "" ;
      Z3387RefKgs = DecimalUtil.ZERO ;
      Z3388RefMts = DecimalUtil.ZERO ;
      O3388RefMts = DecimalUtil.ZERO ;
      O3387RefKgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A3432TotRefKgs = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A3433TotRefMts = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B3433TotRefMts = DecimalUtil.ZERO ;
      B3432TotRefKgs = DecimalUtil.ZERO ;
      sMode1549 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      s3433TotRefMts = DecimalUtil.ZERO ;
      s3432TotRefKgs = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A3386RefBarPar = "" ;
      A3387RefKgs = DecimalUtil.ZERO ;
      A3388RefMts = DecimalUtil.ZERO ;
      T3388RefMts = DecimalUtil.ZERO ;
      T3387RefKgs = DecimalUtil.ZERO ;
      AV20station = "" ;
      GXv_char1 = new String[1] ;
      AV17UsurCod = "" ;
      AV16Lit0 = "" ;
      AV18LitFe = "" ;
      AV21lit1 = "" ;
      GXt_char4 = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z3432TotRefKgs = DecimalUtil.ZERO ;
      Z3433TotRefMts = DecimalUtil.ZERO ;
      T01EO6_A407EmprNom = new String[] {""} ;
      T01EO6_n407EmprNom = new boolean[] {false} ;
      T01EO7_A252CliCod = new int[1] ;
      T01EO7_n252CliCod = new boolean[] {false} ;
      T01EO7_A365DisDes = new String[] {""} ;
      T01EO11_A361DisCod = new int[1] ;
      T01EO11_A2759BarMaqGru = new String[] {""} ;
      T01EO11_A407EmprNom = new String[] {""} ;
      T01EO11_n407EmprNom = new boolean[] {false} ;
      T01EO11_A129BarCod = new int[1] ;
      T01EO11_n129BarCod = new boolean[] {false} ;
      T01EO11_A132BarCodReo = new byte[1] ;
      T01EO11_n132BarCodReo = new boolean[] {false} ;
      T01EO11_A130BarCodPar = new String[] {""} ;
      T01EO11_n130BarCodPar = new boolean[] {false} ;
      T01EO11_A180BarMaqCod = new String[] {""} ;
      T01EO11_A252CliCod = new int[1] ;
      T01EO11_n252CliCod = new boolean[] {false} ;
      T01EO11_A365DisDes = new String[] {""} ;
      T01EO11_A396EmprCod = new String[] {""} ;
      T01EO11_n396EmprCod = new boolean[] {false} ;
      T01EO11_A3432TotRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO11_A3433TotRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO11_A3434TotRefPie = new short[1] ;
      T01EO9_A3432TotRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO9_A3433TotRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO9_A3434TotRefPie = new short[1] ;
      T01EO13_A3432TotRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO13_A3433TotRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO13_A3434TotRefPie = new short[1] ;
      T01EO14_A396EmprCod = new String[] {""} ;
      T01EO14_n396EmprCod = new boolean[] {false} ;
      T01EO14_A129BarCod = new int[1] ;
      T01EO14_n129BarCod = new boolean[] {false} ;
      T01EO14_A132BarCodReo = new byte[1] ;
      T01EO14_n132BarCodReo = new boolean[] {false} ;
      T01EO14_A130BarCodPar = new String[] {""} ;
      T01EO14_n130BarCodPar = new boolean[] {false} ;
      T01EO5_A361DisCod = new int[1] ;
      T01EO5_A2759BarMaqGru = new String[] {""} ;
      T01EO5_A129BarCod = new int[1] ;
      T01EO5_n129BarCod = new boolean[] {false} ;
      T01EO5_A132BarCodReo = new byte[1] ;
      T01EO5_n132BarCodReo = new boolean[] {false} ;
      T01EO5_A130BarCodPar = new String[] {""} ;
      T01EO5_n130BarCodPar = new boolean[] {false} ;
      T01EO5_A180BarMaqCod = new String[] {""} ;
      T01EO5_A396EmprCod = new String[] {""} ;
      T01EO5_n396EmprCod = new boolean[] {false} ;
      T01EO5_A252CliCod = new int[1] ;
      T01EO5_n252CliCod = new boolean[] {false} ;
      T01EO5_A365DisDes = new String[] {""} ;
      T01EO15_A396EmprCod = new String[] {""} ;
      T01EO15_n396EmprCod = new boolean[] {false} ;
      T01EO15_A129BarCod = new int[1] ;
      T01EO15_n129BarCod = new boolean[] {false} ;
      T01EO15_A132BarCodReo = new byte[1] ;
      T01EO15_n132BarCodReo = new boolean[] {false} ;
      T01EO15_A130BarCodPar = new String[] {""} ;
      T01EO15_n130BarCodPar = new boolean[] {false} ;
      T01EO16_A396EmprCod = new String[] {""} ;
      T01EO16_n396EmprCod = new boolean[] {false} ;
      T01EO16_A129BarCod = new int[1] ;
      T01EO16_n129BarCod = new boolean[] {false} ;
      T01EO16_A132BarCodReo = new byte[1] ;
      T01EO16_n132BarCodReo = new boolean[] {false} ;
      T01EO16_A130BarCodPar = new String[] {""} ;
      T01EO16_n130BarCodPar = new boolean[] {false} ;
      T01EO4_A361DisCod = new int[1] ;
      T01EO4_A2759BarMaqGru = new String[] {""} ;
      T01EO4_A129BarCod = new int[1] ;
      T01EO4_n129BarCod = new boolean[] {false} ;
      T01EO4_A132BarCodReo = new byte[1] ;
      T01EO4_n132BarCodReo = new boolean[] {false} ;
      T01EO4_A130BarCodPar = new String[] {""} ;
      T01EO4_n130BarCodPar = new boolean[] {false} ;
      T01EO4_A180BarMaqCod = new String[] {""} ;
      T01EO4_A396EmprCod = new String[] {""} ;
      T01EO4_n396EmprCod = new boolean[] {false} ;
      T01EO4_A252CliCod = new int[1] ;
      T01EO4_n252CliCod = new boolean[] {false} ;
      T01EO4_A365DisDes = new String[] {""} ;
      T01EO21_A3432TotRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO21_A3433TotRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO21_A3434TotRefPie = new short[1] ;
      T01EO22_A14681MRPrId = new long[1] ;
      T01EO23_A5921XCjaDis = new String[] {""} ;
      T01EO23_A5922XCjaCod = new long[1] ;
      T01EO24_A396EmprCod = new String[] {""} ;
      T01EO24_n396EmprCod = new boolean[] {false} ;
      T01EO24_A129BarCod = new int[1] ;
      T01EO24_n129BarCod = new boolean[] {false} ;
      T01EO24_A132BarCodReo = new byte[1] ;
      T01EO24_n132BarCodReo = new boolean[] {false} ;
      T01EO24_A130BarCodPar = new String[] {""} ;
      T01EO24_n130BarCodPar = new boolean[] {false} ;
      T01EO24_A14152MEnvOrd = new short[1] ;
      T01EO25_A396EmprCod = new String[] {""} ;
      T01EO25_n396EmprCod = new boolean[] {false} ;
      T01EO25_A129BarCod = new int[1] ;
      T01EO25_n129BarCod = new boolean[] {false} ;
      T01EO25_A132BarCodReo = new byte[1] ;
      T01EO25_n132BarCodReo = new boolean[] {false} ;
      T01EO25_A130BarCodPar = new String[] {""} ;
      T01EO25_n130BarCodPar = new boolean[] {false} ;
      T01EO25_A13905BarTraID = new String[] {""} ;
      T01EO26_A396EmprCod = new String[] {""} ;
      T01EO26_n396EmprCod = new boolean[] {false} ;
      T01EO26_A129BarCod = new int[1] ;
      T01EO26_n129BarCod = new boolean[] {false} ;
      T01EO26_A132BarCodReo = new byte[1] ;
      T01EO26_n132BarCodReo = new boolean[] {false} ;
      T01EO26_A130BarCodPar = new String[] {""} ;
      T01EO26_n130BarCodPar = new boolean[] {false} ;
      T01EO26_A13093BarDGLin = new byte[1] ;
      T01EO26_A13094BarDGDibCl = new String[] {""} ;
      T01EO26_A13095BarDGDibIn = new int[1] ;
      T01EO26_A13096BarDGComb = new String[] {""} ;
      T01EO26_A13097BarDGFOndo = new String[] {""} ;
      T01EO27_A396EmprCod = new String[] {""} ;
      T01EO27_n396EmprCod = new boolean[] {false} ;
      T01EO27_A11917Ebd_numero = new int[1] ;
      T01EO28_A396EmprCod = new String[] {""} ;
      T01EO28_n396EmprCod = new boolean[] {false} ;
      T01EO28_A11898Prd_numero = new int[1] ;
      T01EO29_A396EmprCod = new String[] {""} ;
      T01EO29_n396EmprCod = new boolean[] {false} ;
      T01EO29_A11849Cte_numero = new int[1] ;
      T01EO30_A396EmprCod = new String[] {""} ;
      T01EO30_n396EmprCod = new boolean[] {false} ;
      T01EO30_A11791Ap_numero = new int[1] ;
      T01EO31_A396EmprCod = new String[] {""} ;
      T01EO31_n396EmprCod = new boolean[] {false} ;
      T01EO31_A3985CalBarCod = new int[1] ;
      T01EO31_A3986CalBarCodR = new byte[1] ;
      T01EO31_A3987CalBarCodP = new String[] {""} ;
      T01EO32_A396EmprCod = new String[] {""} ;
      T01EO32_n396EmprCod = new boolean[] {false} ;
      T01EO32_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01EO32_A652OpeCod = new int[1] ;
      T01EO33_A396EmprCod = new String[] {""} ;
      T01EO33_n396EmprCod = new boolean[] {false} ;
      T01EO33_A129BarCod = new int[1] ;
      T01EO33_n129BarCod = new boolean[] {false} ;
      T01EO33_A132BarCodReo = new byte[1] ;
      T01EO33_n132BarCodReo = new boolean[] {false} ;
      T01EO33_A130BarCodPar = new String[] {""} ;
      T01EO33_n130BarCodPar = new boolean[] {false} ;
      T01EO33_A4118tinagrcod = new int[1] ;
      T01EO33_A4119tinagrreo = new byte[1] ;
      T01EO33_A4120tinagrpar = new String[] {""} ;
      T01EO34_A396EmprCod = new String[] {""} ;
      T01EO34_n396EmprCod = new boolean[] {false} ;
      T01EO34_A129BarCod = new int[1] ;
      T01EO34_n129BarCod = new boolean[] {false} ;
      T01EO34_A132BarCodReo = new byte[1] ;
      T01EO34_n132BarCodReo = new boolean[] {false} ;
      T01EO34_A130BarCodPar = new String[] {""} ;
      T01EO34_n130BarCodPar = new boolean[] {false} ;
      T01EO34_A4080estagrcod = new int[1] ;
      T01EO34_A4081estagrreo = new byte[1] ;
      T01EO34_A4082estagrpar = new String[] {""} ;
      T01EO35_A396EmprCod = new String[] {""} ;
      T01EO35_n396EmprCod = new boolean[] {false} ;
      T01EO35_A129BarCod = new int[1] ;
      T01EO35_n129BarCod = new boolean[] {false} ;
      T01EO35_A132BarCodReo = new byte[1] ;
      T01EO35_n132BarCodReo = new boolean[] {false} ;
      T01EO35_A130BarCodPar = new String[] {""} ;
      T01EO35_n130BarCodPar = new boolean[] {false} ;
      T01EO35_A4075recestncol = new byte[1] ;
      T01EO35_A4076recestnpro = new byte[1] ;
      T01EO36_A396EmprCod = new String[] {""} ;
      T01EO36_n396EmprCod = new boolean[] {false} ;
      T01EO36_A602MaqCod = new String[] {""} ;
      T01EO36_A1142MaqFCod = new String[] {""} ;
      T01EO36_A3068PlaEtaOrd = new short[1] ;
      T01EO36_A3069PlaEtaOrdA = new byte[1] ;
      T01EO36_A129BarCod = new int[1] ;
      T01EO36_n129BarCod = new boolean[] {false} ;
      T01EO36_A132BarCodReo = new byte[1] ;
      T01EO36_n132BarCodReo = new boolean[] {false} ;
      T01EO36_A130BarCodPar = new String[] {""} ;
      T01EO36_n130BarCodPar = new boolean[] {false} ;
      T01EO37_A396EmprCod = new String[] {""} ;
      T01EO37_n396EmprCod = new boolean[] {false} ;
      T01EO37_A129BarCod = new int[1] ;
      T01EO37_n129BarCod = new boolean[] {false} ;
      T01EO37_A132BarCodReo = new byte[1] ;
      T01EO37_n132BarCodReo = new boolean[] {false} ;
      T01EO37_A130BarCodPar = new String[] {""} ;
      T01EO37_n130BarCodPar = new boolean[] {false} ;
      T01EO37_A4846BarAudLin = new short[1] ;
      T01EO38_A396EmprCod = new String[] {""} ;
      T01EO38_n396EmprCod = new boolean[] {false} ;
      T01EO38_A129BarCod = new int[1] ;
      T01EO38_n129BarCod = new boolean[] {false} ;
      T01EO38_A132BarCodReo = new byte[1] ;
      T01EO38_n132BarCodReo = new boolean[] {false} ;
      T01EO38_A130BarCodPar = new String[] {""} ;
      T01EO38_n130BarCodPar = new boolean[] {false} ;
      T01EO38_A3940BarEnsLin = new short[1] ;
      T01EO39_A396EmprCod = new String[] {""} ;
      T01EO39_n396EmprCod = new boolean[] {false} ;
      T01EO39_A10914SolSalCod = new int[1] ;
      T01EO40_A396EmprCod = new String[] {""} ;
      T01EO40_n396EmprCod = new boolean[] {false} ;
      T01EO40_A10364Ph_numero = new int[1] ;
      T01EO41_A396EmprCod = new String[] {""} ;
      T01EO41_n396EmprCod = new boolean[] {false} ;
      T01EO41_A129BarCod = new int[1] ;
      T01EO41_n129BarCod = new boolean[] {false} ;
      T01EO41_A132BarCodReo = new byte[1] ;
      T01EO41_n132BarCodReo = new boolean[] {false} ;
      T01EO41_A130BarCodPar = new String[] {""} ;
      T01EO41_n130BarCodPar = new boolean[] {false} ;
      T01EO41_A10197ProEspCod = new String[] {""} ;
      T01EO42_A396EmprCod = new String[] {""} ;
      T01EO42_n396EmprCod = new boolean[] {false} ;
      T01EO42_A129BarCod = new int[1] ;
      T01EO42_n129BarCod = new boolean[] {false} ;
      T01EO42_A132BarCodReo = new byte[1] ;
      T01EO42_n132BarCodReo = new boolean[] {false} ;
      T01EO42_A130BarCodPar = new String[] {""} ;
      T01EO42_n130BarCodPar = new boolean[] {false} ;
      T01EO42_A5322Dp_Nrecep = new int[1] ;
      T01EO43_A396EmprCod = new String[] {""} ;
      T01EO43_n396EmprCod = new boolean[] {false} ;
      T01EO43_A129BarCod = new int[1] ;
      T01EO43_n129BarCod = new boolean[] {false} ;
      T01EO43_A132BarCodReo = new byte[1] ;
      T01EO43_n132BarCodReo = new boolean[] {false} ;
      T01EO43_A130BarCodPar = new String[] {""} ;
      T01EO43_n130BarCodPar = new boolean[] {false} ;
      T01EO43_A8569EntSecLn = new int[1] ;
      T01EO44_A396EmprCod = new String[] {""} ;
      T01EO44_n396EmprCod = new boolean[] {false} ;
      T01EO44_A7434PLLNro = new int[1] ;
      T01EO44_A7443LPLNro = new short[1] ;
      T01EO44_A7459CPLCom = new short[1] ;
      T01EO44_A129BarCod = new int[1] ;
      T01EO44_n129BarCod = new boolean[] {false} ;
      T01EO44_A132BarCodReo = new byte[1] ;
      T01EO44_n132BarCodReo = new boolean[] {false} ;
      T01EO44_A130BarCodPar = new String[] {""} ;
      T01EO44_n130BarCodPar = new boolean[] {false} ;
      T01EO45_A396EmprCod = new String[] {""} ;
      T01EO45_n396EmprCod = new boolean[] {false} ;
      T01EO45_A7145OSSCod = new int[1] ;
      T01EO46_A396EmprCod = new String[] {""} ;
      T01EO46_n396EmprCod = new boolean[] {false} ;
      T01EO46_A7049OGSCod = new int[1] ;
      T01EO47_A396EmprCod = new String[] {""} ;
      T01EO47_n396EmprCod = new boolean[] {false} ;
      T01EO47_A129BarCod = new int[1] ;
      T01EO47_n129BarCod = new boolean[] {false} ;
      T01EO47_A132BarCodReo = new byte[1] ;
      T01EO47_n132BarCodReo = new boolean[] {false} ;
      T01EO47_A130BarCodPar = new String[] {""} ;
      T01EO47_n130BarCodPar = new boolean[] {false} ;
      T01EO47_A6031Ac_Barcod = new int[1] ;
      T01EO47_A6032Ac_BarReo = new byte[1] ;
      T01EO47_A6033Ac_BarPar = new String[] {""} ;
      T01EO48_A396EmprCod = new String[] {""} ;
      T01EO48_n396EmprCod = new boolean[] {false} ;
      T01EO48_A129BarCod = new int[1] ;
      T01EO48_n129BarCod = new boolean[] {false} ;
      T01EO48_A132BarCodReo = new byte[1] ;
      T01EO48_n132BarCodReo = new boolean[] {false} ;
      T01EO48_A130BarCodPar = new String[] {""} ;
      T01EO48_n130BarCodPar = new boolean[] {false} ;
      T01EO48_A5908PartPal = new int[1] ;
      T01EO49_A396EmprCod = new String[] {""} ;
      T01EO49_n396EmprCod = new boolean[] {false} ;
      T01EO49_A129BarCod = new int[1] ;
      T01EO49_n129BarCod = new boolean[] {false} ;
      T01EO49_A132BarCodReo = new byte[1] ;
      T01EO49_n132BarCodReo = new boolean[] {false} ;
      T01EO49_A130BarCodPar = new String[] {""} ;
      T01EO49_n130BarCodPar = new boolean[] {false} ;
      T01EO49_A2524DisComLin = new byte[1] ;
      T01EO49_A1056DisComCod = new String[] {""} ;
      T01EO49_A1032FonCod = new String[] {""} ;
      T01EO50_A396EmprCod = new String[] {""} ;
      T01EO50_n396EmprCod = new boolean[] {false} ;
      T01EO50_A1736AlbExtCod = new long[1] ;
      T01EO50_A129BarCod = new int[1] ;
      T01EO50_n129BarCod = new boolean[] {false} ;
      T01EO50_A132BarCodReo = new byte[1] ;
      T01EO50_n132BarCodReo = new boolean[] {false} ;
      T01EO50_A130BarCodPar = new String[] {""} ;
      T01EO50_n130BarCodPar = new boolean[] {false} ;
      T01EO51_A396EmprCod = new String[] {""} ;
      T01EO51_n396EmprCod = new boolean[] {false} ;
      T01EO51_A129BarCod = new int[1] ;
      T01EO51_n129BarCod = new boolean[] {false} ;
      T01EO51_A132BarCodReo = new byte[1] ;
      T01EO51_n132BarCodReo = new boolean[] {false} ;
      T01EO51_A130BarCodPar = new String[] {""} ;
      T01EO51_n130BarCodPar = new boolean[] {false} ;
      T01EO51_A3753BarFoaCod = new int[1] ;
      T01EO51_A3754BarFoaReo = new byte[1] ;
      T01EO51_A3755BarFoaPar = new String[] {""} ;
      T01EO52_A396EmprCod = new String[] {""} ;
      T01EO52_n396EmprCod = new boolean[] {false} ;
      T01EO52_A129BarCod = new int[1] ;
      T01EO52_n129BarCod = new boolean[] {false} ;
      T01EO52_A132BarCodReo = new byte[1] ;
      T01EO52_n132BarCodReo = new boolean[] {false} ;
      T01EO52_A130BarCodPar = new String[] {""} ;
      T01EO52_n130BarCodPar = new boolean[] {false} ;
      T01EO52_A3747BarPegCod = new int[1] ;
      T01EO52_A3748BarPegReo = new byte[1] ;
      T01EO52_A3749BarPegPar = new String[] {""} ;
      T01EO53_A396EmprCod = new String[] {""} ;
      T01EO53_n396EmprCod = new boolean[] {false} ;
      T01EO53_A3253SolTraCod = new int[1] ;
      T01EO54_A396EmprCod = new String[] {""} ;
      T01EO54_n396EmprCod = new boolean[] {false} ;
      T01EO54_A3235SolSubCod = new int[1] ;
      T01EO55_A396EmprCod = new String[] {""} ;
      T01EO55_n396EmprCod = new boolean[] {false} ;
      T01EO55_A3218SolLuzCod = new int[1] ;
      T01EO56_A396EmprCod = new String[] {""} ;
      T01EO56_n396EmprCod = new boolean[] {false} ;
      T01EO56_A3196SolFriCod = new int[1] ;
      T01EO57_A396EmprCod = new String[] {""} ;
      T01EO57_n396EmprCod = new boolean[] {false} ;
      T01EO57_A3165SolPilCod = new int[1] ;
      T01EO58_A396EmprCod = new String[] {""} ;
      T01EO58_n396EmprCod = new boolean[] {false} ;
      T01EO58_A129BarCod = new int[1] ;
      T01EO58_n129BarCod = new boolean[] {false} ;
      T01EO58_A132BarCodReo = new byte[1] ;
      T01EO58_n132BarCodReo = new boolean[] {false} ;
      T01EO58_A130BarCodPar = new String[] {""} ;
      T01EO58_n130BarCodPar = new boolean[] {false} ;
      T01EO58_A2872HAnRLinMaq = new short[1] ;
      T01EO58_A2873HAnRLinPro = new byte[1] ;
      T01EO58_A2874HAnRLin = new short[1] ;
      T01EO58_A2875HAnNumAny = new byte[1] ;
      T01EO59_A396EmprCod = new String[] {""} ;
      T01EO59_n396EmprCod = new boolean[] {false} ;
      T01EO59_A2817PlaTer = new String[] {""} ;
      T01EO59_A2818PlaOrd = new short[1] ;
      T01EO60_A396EmprCod = new String[] {""} ;
      T01EO60_n396EmprCod = new boolean[] {false} ;
      T01EO60_A2809MetTerCod = new String[] {""} ;
      T01EO60_A129BarCod = new int[1] ;
      T01EO60_n129BarCod = new boolean[] {false} ;
      T01EO60_A132BarCodReo = new byte[1] ;
      T01EO60_n132BarCodReo = new boolean[] {false} ;
      T01EO60_A130BarCodPar = new String[] {""} ;
      T01EO60_n130BarCodPar = new boolean[] {false} ;
      T01EO61_A396EmprCod = new String[] {""} ;
      T01EO61_n396EmprCod = new boolean[] {false} ;
      T01EO61_A129BarCod = new int[1] ;
      T01EO61_n129BarCod = new boolean[] {false} ;
      T01EO61_A132BarCodReo = new byte[1] ;
      T01EO61_n132BarCodReo = new boolean[] {false} ;
      T01EO61_A130BarCodPar = new String[] {""} ;
      T01EO61_n130BarCodPar = new boolean[] {false} ;
      T01EO61_A2808RecLinMAL = new short[1] ;
      T01EO61_A1377RecNumAny = new byte[1] ;
      T01EO61_A719PrdNum = new String[] {""} ;
      T01EO62_A396EmprCod = new String[] {""} ;
      T01EO62_n396EmprCod = new boolean[] {false} ;
      T01EO62_A129BarCod = new int[1] ;
      T01EO62_n129BarCod = new boolean[] {false} ;
      T01EO62_A132BarCodReo = new byte[1] ;
      T01EO62_n132BarCodReo = new boolean[] {false} ;
      T01EO62_A130BarCodPar = new String[] {""} ;
      T01EO62_n130BarCodPar = new boolean[] {false} ;
      T01EO62_A2804RecLinMaq = new short[1] ;
      T01EO63_A396EmprCod = new String[] {""} ;
      T01EO63_n396EmprCod = new boolean[] {false} ;
      T01EO63_A2792TermiCod = new String[] {""} ;
      T01EO63_A129BarCod = new int[1] ;
      T01EO63_n129BarCod = new boolean[] {false} ;
      T01EO63_A132BarCodReo = new byte[1] ;
      T01EO63_n132BarCodReo = new boolean[] {false} ;
      T01EO63_A130BarCodPar = new String[] {""} ;
      T01EO63_n130BarCodPar = new boolean[] {false} ;
      T01EO64_A396EmprCod = new String[] {""} ;
      T01EO64_n396EmprCod = new boolean[] {false} ;
      T01EO64_A2248ManCod = new short[1] ;
      T01EO64_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01EO64_A2713RpExHdLi = new short[1] ;
      T01EO65_A396EmprCod = new String[] {""} ;
      T01EO65_n396EmprCod = new boolean[] {false} ;
      T01EO65_A2248ManCod = new short[1] ;
      T01EO65_A2689ExHdrFas = new String[] {""} ;
      T01EO65_A2692ExHdrLin = new int[1] ;
      T01EO66_A396EmprCod = new String[] {""} ;
      T01EO66_n396EmprCod = new boolean[] {false} ;
      T01EO66_A129BarCod = new int[1] ;
      T01EO66_n129BarCod = new boolean[] {false} ;
      T01EO66_A132BarCodReo = new byte[1] ;
      T01EO66_n132BarCodReo = new boolean[] {false} ;
      T01EO66_A130BarCodPar = new String[] {""} ;
      T01EO66_n130BarCodPar = new boolean[] {false} ;
      T01EO66_A2494BarDosPro = new String[] {""} ;
      T01EO66_A719PrdNum = new String[] {""} ;
      T01EO67_A396EmprCod = new String[] {""} ;
      T01EO67_n396EmprCod = new boolean[] {false} ;
      T01EO67_A602MaqCod = new String[] {""} ;
      T01EO67_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01EO67_A129BarCod = new int[1] ;
      T01EO67_n129BarCod = new boolean[] {false} ;
      T01EO67_A132BarCodReo = new byte[1] ;
      T01EO67_n132BarCodReo = new boolean[] {false} ;
      T01EO67_A130BarCodPar = new String[] {""} ;
      T01EO67_n130BarCodPar = new boolean[] {false} ;
      T01EO68_A396EmprCod = new String[] {""} ;
      T01EO68_n396EmprCod = new boolean[] {false} ;
      T01EO68_A129BarCod = new int[1] ;
      T01EO68_n129BarCod = new boolean[] {false} ;
      T01EO68_A132BarCodReo = new byte[1] ;
      T01EO68_n132BarCodReo = new boolean[] {false} ;
      T01EO68_A130BarCodPar = new String[] {""} ;
      T01EO68_n130BarCodPar = new boolean[] {false} ;
      T01EO68_A2457BarObLin = new short[1] ;
      T01EO69_A396EmprCod = new String[] {""} ;
      T01EO69_n396EmprCod = new boolean[] {false} ;
      T01EO69_A129BarCod = new int[1] ;
      T01EO69_n129BarCod = new boolean[] {false} ;
      T01EO69_A132BarCodReo = new byte[1] ;
      T01EO69_n132BarCodReo = new boolean[] {false} ;
      T01EO69_A130BarCodPar = new String[] {""} ;
      T01EO69_n130BarCodPar = new boolean[] {false} ;
      T01EO69_A2444BarEnLin = new short[1] ;
      T01EO70_A396EmprCod = new String[] {""} ;
      T01EO70_n396EmprCod = new boolean[] {false} ;
      T01EO70_A2406ExhAlbCod = new int[1] ;
      T01EO70_A129BarCod = new int[1] ;
      T01EO70_n129BarCod = new boolean[] {false} ;
      T01EO70_A132BarCodReo = new byte[1] ;
      T01EO70_n132BarCodReo = new boolean[] {false} ;
      T01EO70_A130BarCodPar = new String[] {""} ;
      T01EO70_n130BarCodPar = new boolean[] {false} ;
      T01EO71_A396EmprCod = new String[] {""} ;
      T01EO71_n396EmprCod = new boolean[] {false} ;
      T01EO71_A2253SalExtAlb = new int[1] ;
      T01EO71_A129BarCod = new int[1] ;
      T01EO71_n129BarCod = new boolean[] {false} ;
      T01EO71_A132BarCodReo = new byte[1] ;
      T01EO71_n132BarCodReo = new boolean[] {false} ;
      T01EO71_A130BarCodPar = new String[] {""} ;
      T01EO71_n130BarCodPar = new boolean[] {false} ;
      T01EO72_A396EmprCod = new String[] {""} ;
      T01EO72_n396EmprCod = new boolean[] {false} ;
      T01EO72_A30AlbProCod = new long[1] ;
      T01EO72_A129BarCod = new int[1] ;
      T01EO72_n129BarCod = new boolean[] {false} ;
      T01EO72_A132BarCodReo = new byte[1] ;
      T01EO72_n132BarCodReo = new boolean[] {false} ;
      T01EO72_A130BarCodPar = new String[] {""} ;
      T01EO72_n130BarCodPar = new boolean[] {false} ;
      T01EO73_A396EmprCod = new String[] {""} ;
      T01EO73_n396EmprCod = new boolean[] {false} ;
      T01EO73_A1348SolColCod = new int[1] ;
      T01EO74_A396EmprCod = new String[] {""} ;
      T01EO74_n396EmprCod = new boolean[] {false} ;
      T01EO74_A1333EstDimCod = new int[1] ;
      T01EO75_A396EmprCod = new String[] {""} ;
      T01EO75_n396EmprCod = new boolean[] {false} ;
      T01EO75_A1314EnsLabCod = new int[1] ;
      T01EO76_A396EmprCod = new String[] {""} ;
      T01EO76_n396EmprCod = new boolean[] {false} ;
      T01EO76_A129BarCod = new int[1] ;
      T01EO76_n129BarCod = new boolean[] {false} ;
      T01EO76_A132BarCodReo = new byte[1] ;
      T01EO76_n132BarCodReo = new boolean[] {false} ;
      T01EO76_A130BarCodPar = new String[] {""} ;
      T01EO76_n130BarCodPar = new boolean[] {false} ;
      T01EO76_A906ObsReoLin = new byte[1] ;
      T01EO77_A396EmprCod = new String[] {""} ;
      T01EO77_n396EmprCod = new boolean[] {false} ;
      T01EO77_A859CumCodCont = new int[1] ;
      T01EO78_A396EmprCod = new String[] {""} ;
      T01EO78_n396EmprCod = new boolean[] {false} ;
      T01EO78_A602MaqCod = new String[] {""} ;
      T01EO78_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01EO78_A561HisProLin = new int[1] ;
      T01EO79_A396EmprCod = new String[] {""} ;
      T01EO79_n396EmprCod = new boolean[] {false} ;
      T01EO79_A252CliCod = new int[1] ;
      T01EO79_n252CliCod = new boolean[] {false} ;
      T01EO79_A494ForSer = new String[] {""} ;
      T01EO79_A482ForColNom = new String[] {""} ;
      T01EO79_A483ForColNum = new int[1] ;
      T01EO79_A831TipColCod = new byte[1] ;
      T01EO80_A396EmprCod = new String[] {""} ;
      T01EO80_n396EmprCod = new boolean[] {false} ;
      T01EO80_A129BarCod = new int[1] ;
      T01EO80_n129BarCod = new boolean[] {false} ;
      T01EO80_A132BarCodReo = new byte[1] ;
      T01EO80_n132BarCodReo = new boolean[] {false} ;
      T01EO80_A130BarCodPar = new String[] {""} ;
      T01EO80_n130BarCodPar = new boolean[] {false} ;
      T01EO80_A200BarPieCod = new String[] {""} ;
      T01EO81_A396EmprCod = new String[] {""} ;
      T01EO81_n396EmprCod = new boolean[] {false} ;
      T01EO81_A129BarCod = new int[1] ;
      T01EO81_n129BarCod = new boolean[] {false} ;
      T01EO81_A132BarCodReo = new byte[1] ;
      T01EO81_n132BarCodReo = new boolean[] {false} ;
      T01EO81_A130BarCodPar = new String[] {""} ;
      T01EO81_n130BarCodPar = new boolean[] {false} ;
      T01EO81_A188BarNotLin = new byte[1] ;
      T01EO82_A396EmprCod = new String[] {""} ;
      T01EO82_n396EmprCod = new boolean[] {false} ;
      T01EO82_A129BarCod = new int[1] ;
      T01EO82_n129BarCod = new boolean[] {false} ;
      T01EO82_A132BarCodReo = new byte[1] ;
      T01EO82_n132BarCodReo = new boolean[] {false} ;
      T01EO82_A130BarCodPar = new String[] {""} ;
      T01EO82_n130BarCodPar = new boolean[] {false} ;
      T01EO82_A758ProCod = new String[] {""} ;
      T01EO83_A396EmprCod = new String[] {""} ;
      T01EO83_n396EmprCod = new boolean[] {false} ;
      T01EO83_A129BarCod = new int[1] ;
      T01EO83_n129BarCod = new boolean[] {false} ;
      T01EO83_A132BarCodReo = new byte[1] ;
      T01EO83_n132BarCodReo = new boolean[] {false} ;
      T01EO83_A130BarCodPar = new String[] {""} ;
      T01EO83_n130BarCodPar = new boolean[] {false} ;
      T01EO83_A119BarAgrCod = new int[1] ;
      T01EO83_A124BarAgrReo = new byte[1] ;
      T01EO83_A122BarAgrPar = new String[] {""} ;
      T01EO85_A396EmprCod = new String[] {""} ;
      T01EO85_n396EmprCod = new boolean[] {false} ;
      T01EO85_A129BarCod = new int[1] ;
      T01EO85_n129BarCod = new boolean[] {false} ;
      T01EO85_A132BarCodReo = new byte[1] ;
      T01EO85_n132BarCodReo = new boolean[] {false} ;
      T01EO85_A130BarCodPar = new String[] {""} ;
      T01EO85_n130BarCodPar = new boolean[] {false} ;
      T01EO86_A129BarCod = new int[1] ;
      T01EO86_n129BarCod = new boolean[] {false} ;
      T01EO86_A132BarCodReo = new byte[1] ;
      T01EO86_n132BarCodReo = new boolean[] {false} ;
      T01EO86_A130BarCodPar = new String[] {""} ;
      T01EO86_n130BarCodPar = new boolean[] {false} ;
      T01EO86_A3384RefBarCod = new int[1] ;
      T01EO86_A3385RefBarReo = new byte[1] ;
      T01EO86_A3386RefBarPar = new String[] {""} ;
      T01EO86_A3387RefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO86_n3387RefKgs = new boolean[] {false} ;
      T01EO86_A3388RefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO86_n3388RefMts = new boolean[] {false} ;
      T01EO86_A3389RefPie = new short[1] ;
      T01EO86_n3389RefPie = new boolean[] {false} ;
      T01EO86_A396EmprCod = new String[] {""} ;
      T01EO86_n396EmprCod = new boolean[] {false} ;
      T01EO87_A396EmprCod = new String[] {""} ;
      T01EO87_n396EmprCod = new boolean[] {false} ;
      T01EO87_A129BarCod = new int[1] ;
      T01EO87_n129BarCod = new boolean[] {false} ;
      T01EO87_A132BarCodReo = new byte[1] ;
      T01EO87_n132BarCodReo = new boolean[] {false} ;
      T01EO87_A130BarCodPar = new String[] {""} ;
      T01EO87_n130BarCodPar = new boolean[] {false} ;
      T01EO87_A3384RefBarCod = new int[1] ;
      T01EO87_A3385RefBarReo = new byte[1] ;
      T01EO87_A3386RefBarPar = new String[] {""} ;
      T01EO3_A129BarCod = new int[1] ;
      T01EO3_n129BarCod = new boolean[] {false} ;
      T01EO3_A132BarCodReo = new byte[1] ;
      T01EO3_n132BarCodReo = new boolean[] {false} ;
      T01EO3_A130BarCodPar = new String[] {""} ;
      T01EO3_n130BarCodPar = new boolean[] {false} ;
      T01EO3_A3384RefBarCod = new int[1] ;
      T01EO3_A3385RefBarReo = new byte[1] ;
      T01EO3_A3386RefBarPar = new String[] {""} ;
      T01EO3_A3387RefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO3_n3387RefKgs = new boolean[] {false} ;
      T01EO3_A3388RefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO3_n3388RefMts = new boolean[] {false} ;
      T01EO3_A3389RefPie = new short[1] ;
      T01EO3_n3389RefPie = new boolean[] {false} ;
      T01EO3_A396EmprCod = new String[] {""} ;
      T01EO3_n396EmprCod = new boolean[] {false} ;
      T01EO2_A129BarCod = new int[1] ;
      T01EO2_n129BarCod = new boolean[] {false} ;
      T01EO2_A132BarCodReo = new byte[1] ;
      T01EO2_n132BarCodReo = new boolean[] {false} ;
      T01EO2_A130BarCodPar = new String[] {""} ;
      T01EO2_n130BarCodPar = new boolean[] {false} ;
      T01EO2_A3384RefBarCod = new int[1] ;
      T01EO2_A3385RefBarReo = new byte[1] ;
      T01EO2_A3386RefBarPar = new String[] {""} ;
      T01EO2_A3387RefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO2_n3387RefKgs = new boolean[] {false} ;
      T01EO2_A3388RefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EO2_n3388RefMts = new boolean[] {false} ;
      T01EO2_A3389RefPie = new short[1] ;
      T01EO2_n3389RefPie = new boolean[] {false} ;
      T01EO2_A396EmprCod = new String[] {""} ;
      T01EO2_n396EmprCod = new boolean[] {false} ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      T01EO91_A396EmprCod = new String[] {""} ;
      T01EO91_n396EmprCod = new boolean[] {false} ;
      T01EO91_A129BarCod = new int[1] ;
      T01EO91_n129BarCod = new boolean[] {false} ;
      T01EO91_A132BarCodReo = new byte[1] ;
      T01EO91_n132BarCodReo = new boolean[] {false} ;
      T01EO91_A130BarCodPar = new String[] {""} ;
      T01EO91_n130BarCodPar = new boolean[] {false} ;
      T01EO91_A3384RefBarCod = new int[1] ;
      T01EO91_A3385RefBarReo = new byte[1] ;
      T01EO91_A3386RefBarPar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01EO92_A407EmprNom = new String[] {""} ;
      T01EO92_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ365DisDes = "" ;
      ZZ407EmprNom = "" ;
      ZZ3432TotRefKgs = DecimalUtil.ZERO ;
      ZZ3433TotRefMts = DecimalUtil.ZERO ;
      ZO3433TotRefMts = DecimalUtil.ZERO ;
      ZO3432TotRefKgs = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trefhdr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trefhdr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trefhdr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trefhdr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trefhdr__default(),
         new Object[] {
             new Object[] {
            T01EO2_A129BarCod, T01EO2_A132BarCodReo, T01EO2_A130BarCodPar, T01EO2_A3384RefBarCod, T01EO2_A3385RefBarReo, T01EO2_A3386RefBarPar, T01EO2_A3387RefKgs, T01EO2_n3387RefKgs, T01EO2_A3388RefMts, T01EO2_n3388RefMts,
            T01EO2_A3389RefPie, T01EO2_n3389RefPie, T01EO2_A396EmprCod
            }
            , new Object[] {
            T01EO3_A129BarCod, T01EO3_A132BarCodReo, T01EO3_A130BarCodPar, T01EO3_A3384RefBarCod, T01EO3_A3385RefBarReo, T01EO3_A3386RefBarPar, T01EO3_A3387RefKgs, T01EO3_n3387RefKgs, T01EO3_A3388RefMts, T01EO3_n3388RefMts,
            T01EO3_A3389RefPie, T01EO3_n3389RefPie, T01EO3_A396EmprCod
            }
            , new Object[] {
            T01EO4_A361DisCod, T01EO4_A2759BarMaqGru, T01EO4_A129BarCod, T01EO4_A132BarCodReo, T01EO4_A130BarCodPar, T01EO4_A180BarMaqCod, T01EO4_A396EmprCod, T01EO4_A252CliCod, T01EO4_n252CliCod, T01EO4_A365DisDes
            }
            , new Object[] {
            T01EO5_A361DisCod, T01EO5_A2759BarMaqGru, T01EO5_A129BarCod, T01EO5_A132BarCodReo, T01EO5_A130BarCodPar, T01EO5_A180BarMaqCod, T01EO5_A396EmprCod, T01EO5_A252CliCod, T01EO5_n252CliCod, T01EO5_A365DisDes
            }
            , new Object[] {
            T01EO6_A407EmprNom, T01EO6_n407EmprNom
            }
            , new Object[] {
            T01EO7_A252CliCod, T01EO7_A365DisDes
            }
            , new Object[] {
            T01EO9_A3432TotRefKgs, T01EO9_A3433TotRefMts, T01EO9_A3434TotRefPie
            }
            , new Object[] {
            T01EO11_A361DisCod, T01EO11_A2759BarMaqGru, T01EO11_A407EmprNom, T01EO11_n407EmprNom, T01EO11_A129BarCod, T01EO11_A132BarCodReo, T01EO11_A130BarCodPar, T01EO11_A180BarMaqCod, T01EO11_A252CliCod, T01EO11_n252CliCod,
            T01EO11_A365DisDes, T01EO11_A396EmprCod, T01EO11_A3432TotRefKgs, T01EO11_A3433TotRefMts, T01EO11_A3434TotRefPie
            }
            , new Object[] {
            T01EO13_A3432TotRefKgs, T01EO13_A3433TotRefMts, T01EO13_A3434TotRefPie
            }
            , new Object[] {
            T01EO14_A396EmprCod, T01EO14_A129BarCod, T01EO14_A132BarCodReo, T01EO14_A130BarCodPar
            }
            , new Object[] {
            T01EO15_A396EmprCod, T01EO15_A129BarCod, T01EO15_A132BarCodReo, T01EO15_A130BarCodPar
            }
            , new Object[] {
            T01EO16_A396EmprCod, T01EO16_A129BarCod, T01EO16_A132BarCodReo, T01EO16_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EO21_A3432TotRefKgs, T01EO21_A3433TotRefMts, T01EO21_A3434TotRefPie
            }
            , new Object[] {
            T01EO22_A14681MRPrId
            }
            , new Object[] {
            T01EO23_A5921XCjaDis, T01EO23_A5922XCjaCod
            }
            , new Object[] {
            T01EO24_A396EmprCod, T01EO24_A129BarCod, T01EO24_A132BarCodReo, T01EO24_A130BarCodPar, T01EO24_A14152MEnvOrd
            }
            , new Object[] {
            T01EO25_A396EmprCod, T01EO25_A129BarCod, T01EO25_A132BarCodReo, T01EO25_A130BarCodPar, T01EO25_A13905BarTraID
            }
            , new Object[] {
            T01EO26_A396EmprCod, T01EO26_A129BarCod, T01EO26_A132BarCodReo, T01EO26_A130BarCodPar, T01EO26_A13093BarDGLin, T01EO26_A13094BarDGDibCl, T01EO26_A13095BarDGDibIn, T01EO26_A13096BarDGComb, T01EO26_A13097BarDGFOndo
            }
            , new Object[] {
            T01EO27_A396EmprCod, T01EO27_A11917Ebd_numero
            }
            , new Object[] {
            T01EO28_A396EmprCod, T01EO28_A11898Prd_numero
            }
            , new Object[] {
            T01EO29_A396EmprCod, T01EO29_A11849Cte_numero
            }
            , new Object[] {
            T01EO30_A396EmprCod, T01EO30_A11791Ap_numero
            }
            , new Object[] {
            T01EO31_A396EmprCod, T01EO31_A3985CalBarCod, T01EO31_A3986CalBarCodR, T01EO31_A3987CalBarCodP
            }
            , new Object[] {
            T01EO32_A396EmprCod, T01EO32_A5294InPTime, T01EO32_A652OpeCod
            }
            , new Object[] {
            T01EO33_A396EmprCod, T01EO33_A129BarCod, T01EO33_A132BarCodReo, T01EO33_A130BarCodPar, T01EO33_A4118tinagrcod, T01EO33_A4119tinagrreo, T01EO33_A4120tinagrpar
            }
            , new Object[] {
            T01EO34_A396EmprCod, T01EO34_A129BarCod, T01EO34_A132BarCodReo, T01EO34_A130BarCodPar, T01EO34_A4080estagrcod, T01EO34_A4081estagrreo, T01EO34_A4082estagrpar
            }
            , new Object[] {
            T01EO35_A396EmprCod, T01EO35_A129BarCod, T01EO35_A132BarCodReo, T01EO35_A130BarCodPar, T01EO35_A4075recestncol, T01EO35_A4076recestnpro
            }
            , new Object[] {
            T01EO36_A396EmprCod, T01EO36_A602MaqCod, T01EO36_A1142MaqFCod, T01EO36_A3068PlaEtaOrd, T01EO36_A3069PlaEtaOrdA, T01EO36_A129BarCod, T01EO36_A132BarCodReo, T01EO36_A130BarCodPar
            }
            , new Object[] {
            T01EO37_A396EmprCod, T01EO37_A129BarCod, T01EO37_A132BarCodReo, T01EO37_A130BarCodPar, T01EO37_A4846BarAudLin
            }
            , new Object[] {
            T01EO38_A396EmprCod, T01EO38_A129BarCod, T01EO38_A132BarCodReo, T01EO38_A130BarCodPar, T01EO38_A3940BarEnsLin
            }
            , new Object[] {
            T01EO39_A396EmprCod, T01EO39_A10914SolSalCod
            }
            , new Object[] {
            T01EO40_A396EmprCod, T01EO40_A10364Ph_numero
            }
            , new Object[] {
            T01EO41_A396EmprCod, T01EO41_A129BarCod, T01EO41_A132BarCodReo, T01EO41_A130BarCodPar, T01EO41_A10197ProEspCod
            }
            , new Object[] {
            T01EO42_A396EmprCod, T01EO42_A129BarCod, T01EO42_A132BarCodReo, T01EO42_A130BarCodPar, T01EO42_A5322Dp_Nrecep
            }
            , new Object[] {
            T01EO43_A396EmprCod, T01EO43_A129BarCod, T01EO43_A132BarCodReo, T01EO43_A130BarCodPar, T01EO43_A8569EntSecLn
            }
            , new Object[] {
            T01EO44_A396EmprCod, T01EO44_A7434PLLNro, T01EO44_A7443LPLNro, T01EO44_A7459CPLCom, T01EO44_A129BarCod, T01EO44_A132BarCodReo, T01EO44_A130BarCodPar
            }
            , new Object[] {
            T01EO45_A396EmprCod, T01EO45_A7145OSSCod
            }
            , new Object[] {
            T01EO46_A396EmprCod, T01EO46_A7049OGSCod
            }
            , new Object[] {
            T01EO47_A396EmprCod, T01EO47_A129BarCod, T01EO47_A132BarCodReo, T01EO47_A130BarCodPar, T01EO47_A6031Ac_Barcod, T01EO47_A6032Ac_BarReo, T01EO47_A6033Ac_BarPar
            }
            , new Object[] {
            T01EO48_A396EmprCod, T01EO48_A129BarCod, T01EO48_A132BarCodReo, T01EO48_A130BarCodPar, T01EO48_A5908PartPal
            }
            , new Object[] {
            T01EO49_A396EmprCod, T01EO49_A129BarCod, T01EO49_A132BarCodReo, T01EO49_A130BarCodPar, T01EO49_A2524DisComLin, T01EO49_A1056DisComCod, T01EO49_A1032FonCod
            }
            , new Object[] {
            T01EO50_A396EmprCod, T01EO50_A1736AlbExtCod, T01EO50_A129BarCod, T01EO50_A132BarCodReo, T01EO50_A130BarCodPar
            }
            , new Object[] {
            T01EO51_A396EmprCod, T01EO51_A129BarCod, T01EO51_A132BarCodReo, T01EO51_A130BarCodPar, T01EO51_A3753BarFoaCod, T01EO51_A3754BarFoaReo, T01EO51_A3755BarFoaPar
            }
            , new Object[] {
            T01EO52_A396EmprCod, T01EO52_A129BarCod, T01EO52_A132BarCodReo, T01EO52_A130BarCodPar, T01EO52_A3747BarPegCod, T01EO52_A3748BarPegReo, T01EO52_A3749BarPegPar
            }
            , new Object[] {
            T01EO53_A396EmprCod, T01EO53_A3253SolTraCod
            }
            , new Object[] {
            T01EO54_A396EmprCod, T01EO54_A3235SolSubCod
            }
            , new Object[] {
            T01EO55_A396EmprCod, T01EO55_A3218SolLuzCod
            }
            , new Object[] {
            T01EO56_A396EmprCod, T01EO56_A3196SolFriCod
            }
            , new Object[] {
            T01EO57_A396EmprCod, T01EO57_A3165SolPilCod
            }
            , new Object[] {
            T01EO58_A396EmprCod, T01EO58_A129BarCod, T01EO58_A132BarCodReo, T01EO58_A130BarCodPar, T01EO58_A2872HAnRLinMaq, T01EO58_A2873HAnRLinPro, T01EO58_A2874HAnRLin, T01EO58_A2875HAnNumAny
            }
            , new Object[] {
            T01EO59_A396EmprCod, T01EO59_A2817PlaTer, T01EO59_A2818PlaOrd
            }
            , new Object[] {
            T01EO60_A396EmprCod, T01EO60_A2809MetTerCod, T01EO60_A129BarCod, T01EO60_A132BarCodReo, T01EO60_A130BarCodPar
            }
            , new Object[] {
            T01EO61_A396EmprCod, T01EO61_A129BarCod, T01EO61_A132BarCodReo, T01EO61_A130BarCodPar, T01EO61_A2808RecLinMAL, T01EO61_A1377RecNumAny, T01EO61_A719PrdNum
            }
            , new Object[] {
            T01EO62_A396EmprCod, T01EO62_A129BarCod, T01EO62_A132BarCodReo, T01EO62_A130BarCodPar, T01EO62_A2804RecLinMaq
            }
            , new Object[] {
            T01EO63_A396EmprCod, T01EO63_A2792TermiCod, T01EO63_A129BarCod, T01EO63_A132BarCodReo, T01EO63_A130BarCodPar
            }
            , new Object[] {
            T01EO64_A396EmprCod, T01EO64_A2248ManCod, T01EO64_A2711RpExHdFe, T01EO64_A2713RpExHdLi
            }
            , new Object[] {
            T01EO65_A396EmprCod, T01EO65_A2248ManCod, T01EO65_A2689ExHdrFas, T01EO65_A2692ExHdrLin
            }
            , new Object[] {
            T01EO66_A396EmprCod, T01EO66_A129BarCod, T01EO66_A132BarCodReo, T01EO66_A130BarCodPar, T01EO66_A2494BarDosPro, T01EO66_A719PrdNum
            }
            , new Object[] {
            T01EO67_A396EmprCod, T01EO67_A602MaqCod, T01EO67_A2461PlaFecTin, T01EO67_A129BarCod, T01EO67_A132BarCodReo, T01EO67_A130BarCodPar
            }
            , new Object[] {
            T01EO68_A396EmprCod, T01EO68_A129BarCod, T01EO68_A132BarCodReo, T01EO68_A130BarCodPar, T01EO68_A2457BarObLin
            }
            , new Object[] {
            T01EO69_A396EmprCod, T01EO69_A129BarCod, T01EO69_A132BarCodReo, T01EO69_A130BarCodPar, T01EO69_A2444BarEnLin
            }
            , new Object[] {
            T01EO70_A396EmprCod, T01EO70_A2406ExhAlbCod, T01EO70_A129BarCod, T01EO70_A132BarCodReo, T01EO70_A130BarCodPar
            }
            , new Object[] {
            T01EO71_A396EmprCod, T01EO71_A2253SalExtAlb, T01EO71_A129BarCod, T01EO71_A132BarCodReo, T01EO71_A130BarCodPar
            }
            , new Object[] {
            T01EO72_A396EmprCod, T01EO72_A30AlbProCod, T01EO72_A129BarCod, T01EO72_A132BarCodReo, T01EO72_A130BarCodPar
            }
            , new Object[] {
            T01EO73_A396EmprCod, T01EO73_A1348SolColCod
            }
            , new Object[] {
            T01EO74_A396EmprCod, T01EO74_A1333EstDimCod
            }
            , new Object[] {
            T01EO75_A396EmprCod, T01EO75_A1314EnsLabCod
            }
            , new Object[] {
            T01EO76_A396EmprCod, T01EO76_A129BarCod, T01EO76_A132BarCodReo, T01EO76_A130BarCodPar, T01EO76_A906ObsReoLin
            }
            , new Object[] {
            T01EO77_A396EmprCod, T01EO77_A859CumCodCont
            }
            , new Object[] {
            T01EO78_A396EmprCod, T01EO78_A602MaqCod, T01EO78_A558HisProFec, T01EO78_A561HisProLin
            }
            , new Object[] {
            T01EO79_A396EmprCod, T01EO79_A252CliCod, T01EO79_A494ForSer, T01EO79_A482ForColNom, T01EO79_A483ForColNum, T01EO79_A831TipColCod
            }
            , new Object[] {
            T01EO80_A396EmprCod, T01EO80_A129BarCod, T01EO80_A132BarCodReo, T01EO80_A130BarCodPar, T01EO80_A200BarPieCod
            }
            , new Object[] {
            T01EO81_A396EmprCod, T01EO81_A129BarCod, T01EO81_A132BarCodReo, T01EO81_A130BarCodPar, T01EO81_A188BarNotLin
            }
            , new Object[] {
            T01EO82_A396EmprCod, T01EO82_A129BarCod, T01EO82_A132BarCodReo, T01EO82_A130BarCodPar, T01EO82_A758ProCod
            }
            , new Object[] {
            T01EO83_A396EmprCod, T01EO83_A129BarCod, T01EO83_A132BarCodReo, T01EO83_A130BarCodPar, T01EO83_A119BarAgrCod, T01EO83_A124BarAgrReo, T01EO83_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01EO85_A396EmprCod, T01EO85_A129BarCod, T01EO85_A132BarCodReo, T01EO85_A130BarCodPar
            }
            , new Object[] {
            T01EO86_A129BarCod, T01EO86_A132BarCodReo, T01EO86_A130BarCodPar, T01EO86_A3384RefBarCod, T01EO86_A3385RefBarReo, T01EO86_A3386RefBarPar, T01EO86_A3387RefKgs, T01EO86_n3387RefKgs, T01EO86_A3388RefMts, T01EO86_n3388RefMts,
            T01EO86_A3389RefPie, T01EO86_n3389RefPie, T01EO86_A396EmprCod
            }
            , new Object[] {
            T01EO87_A396EmprCod, T01EO87_A129BarCod, T01EO87_A132BarCodReo, T01EO87_A130BarCodPar, T01EO87_A3384RefBarCod, T01EO87_A3385RefBarReo, T01EO87_A3386RefBarPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EO91_A396EmprCod, T01EO91_A129BarCod, T01EO91_A132BarCodReo, T01EO91_A130BarCodPar, T01EO91_A3384RefBarCod, T01EO91_A3385RefBarReo, T01EO91_A3386RefBarPar
            }
            , new Object[] {
            T01EO92_A407EmprNom, T01EO92_n407EmprNom
            }
         }
      );
      A407EmprNom = "" ;
      n407EmprNom = false ;
      Z407EmprNom = "" ;
      n407EmprNom = false ;
      Z396EmprCod = "" ;
      n396EmprCod = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
   }

   private byte Z132BarCodReo ;
   private byte Z3385RefBarReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A3385RefBarReo ;
   private byte Gx_BScreen ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short O3434TotRefPie ;
   private short Z3389RefPie ;
   private short O3389RefPie ;
   private short nRcdDeleted_1549 ;
   private short nRcdExists_1549 ;
   private short nIsMod_1549 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3434TotRefPie ;
   private short nBlankRcdCount1549 ;
   private short RcdFound1549 ;
   private short B3434TotRefPie ;
   private short nBlankRcdUsr1549 ;
   private short s3434TotRefPie ;
   private short A3389RefPie ;
   private short T3389RefPie ;
   private short Z3434TotRefPie ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_1549 ;
   private short ZZ3434TotRefPie ;
   private short ZO3434TotRefPie ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int Z3384RefBarCod ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTotRefKgs_Enabled ;
   private int edtTotRefMts_Enabled ;
   private int edtTotRefPie_Enabled ;
   private int edtavnRcdDeleted_1549_Enabled ;
   private int edtRefBarCod_Enabled ;
   private int edtRefBarReo_Enabled ;
   private int edtRefBarPar_Enabled ;
   private int edtRefKgs_Enabled ;
   private int edtRefMts_Enabled ;
   private int edtRefPie_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A3384RefBarCod ;
   private int GX_JID ;
   private int GXv_int5[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtRefBarPar_Enabled ;
   private int defedtRefBarReo_Enabled ;
   private int defedtRefBarCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTotRefPie_Backcolor ;
   private int edtTotRefMts_Backcolor ;
   private int edtTotRefKgs_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O3433TotRefMts ;
   private java.math.BigDecimal O3432TotRefKgs ;
   private java.math.BigDecimal Z3387RefKgs ;
   private java.math.BigDecimal Z3388RefMts ;
   private java.math.BigDecimal O3388RefMts ;
   private java.math.BigDecimal O3387RefKgs ;
   private java.math.BigDecimal A3432TotRefKgs ;
   private java.math.BigDecimal A3433TotRefMts ;
   private java.math.BigDecimal B3433TotRefMts ;
   private java.math.BigDecimal B3432TotRefKgs ;
   private java.math.BigDecimal s3433TotRefMts ;
   private java.math.BigDecimal s3432TotRefKgs ;
   private java.math.BigDecimal A3387RefKgs ;
   private java.math.BigDecimal A3388RefMts ;
   private java.math.BigDecimal T3388RefMts ;
   private java.math.BigDecimal T3387RefKgs ;
   private java.math.BigDecimal Z3432TotRefKgs ;
   private java.math.BigDecimal Z3433TotRefMts ;
   private java.math.BigDecimal ZZ3432TotRefKgs ;
   private java.math.BigDecimal ZZ3433TotRefMts ;
   private java.math.BigDecimal ZO3433TotRefMts ;
   private java.math.BigDecimal ZO3432TotRefKgs ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z3386RefBarPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
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
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTotRefKgs_Internalname ;
   private String edtTotRefKgs_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTotRefMts_Internalname ;
   private String edtTotRefMts_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTotRefPie_Internalname ;
   private String edtTotRefPie_Jsonclick ;
   private String sMode1549 ;
   private String edtavnRcdDeleted_1549_Internalname ;
   private String edtRefBarCod_Internalname ;
   private String edtRefBarReo_Internalname ;
   private String edtRefBarPar_Internalname ;
   private String edtRefKgs_Internalname ;
   private String edtRefMts_Internalname ;
   private String edtRefPie_Internalname ;
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
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A365DisDes ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String A3386RefBarPar ;
   private String AV20station ;
   private String GXv_char1[] ;
   private String AV17UsurCod ;
   private String AV16Lit0 ;
   private String AV18LitFe ;
   private String AV21lit1 ;
   private String GXt_char4 ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1549_Jsonclick ;
   private String edtRefBarCod_Jsonclick ;
   private String edtRefBarReo_Jsonclick ;
   private String edtRefBarPar_Jsonclick ;
   private String edtRefKgs_Jsonclick ;
   private String edtRefMts_Jsonclick ;
   private String edtRefPie_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ365DisDes ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3387RefKgs ;
   private boolean n3388RefMts ;
   private boolean n3389RefPie ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01EO6_A407EmprNom ;
   private boolean[] T01EO6_n407EmprNom ;
   private int[] T01EO7_A252CliCod ;
   private boolean[] T01EO7_n252CliCod ;
   private String[] T01EO7_A365DisDes ;
   private int[] T01EO11_A361DisCod ;
   private String[] T01EO11_A2759BarMaqGru ;
   private String[] T01EO11_A407EmprNom ;
   private boolean[] T01EO11_n407EmprNom ;
   private int[] T01EO11_A129BarCod ;
   private boolean[] T01EO11_n129BarCod ;
   private byte[] T01EO11_A132BarCodReo ;
   private boolean[] T01EO11_n132BarCodReo ;
   private String[] T01EO11_A130BarCodPar ;
   private boolean[] T01EO11_n130BarCodPar ;
   private String[] T01EO11_A180BarMaqCod ;
   private int[] T01EO11_A252CliCod ;
   private boolean[] T01EO11_n252CliCod ;
   private String[] T01EO11_A365DisDes ;
   private String[] T01EO11_A396EmprCod ;
   private boolean[] T01EO11_n396EmprCod ;
   private java.math.BigDecimal[] T01EO11_A3432TotRefKgs ;
   private java.math.BigDecimal[] T01EO11_A3433TotRefMts ;
   private short[] T01EO11_A3434TotRefPie ;
   private java.math.BigDecimal[] T01EO9_A3432TotRefKgs ;
   private java.math.BigDecimal[] T01EO9_A3433TotRefMts ;
   private short[] T01EO9_A3434TotRefPie ;
   private java.math.BigDecimal[] T01EO13_A3432TotRefKgs ;
   private java.math.BigDecimal[] T01EO13_A3433TotRefMts ;
   private short[] T01EO13_A3434TotRefPie ;
   private String[] T01EO14_A396EmprCod ;
   private boolean[] T01EO14_n396EmprCod ;
   private int[] T01EO14_A129BarCod ;
   private boolean[] T01EO14_n129BarCod ;
   private byte[] T01EO14_A132BarCodReo ;
   private boolean[] T01EO14_n132BarCodReo ;
   private String[] T01EO14_A130BarCodPar ;
   private boolean[] T01EO14_n130BarCodPar ;
   private int[] T01EO5_A361DisCod ;
   private String[] T01EO5_A2759BarMaqGru ;
   private int[] T01EO5_A129BarCod ;
   private boolean[] T01EO5_n129BarCod ;
   private byte[] T01EO5_A132BarCodReo ;
   private boolean[] T01EO5_n132BarCodReo ;
   private String[] T01EO5_A130BarCodPar ;
   private boolean[] T01EO5_n130BarCodPar ;
   private String[] T01EO5_A180BarMaqCod ;
   private String[] T01EO5_A396EmprCod ;
   private boolean[] T01EO5_n396EmprCod ;
   private int[] T01EO5_A252CliCod ;
   private boolean[] T01EO5_n252CliCod ;
   private String[] T01EO5_A365DisDes ;
   private String[] T01EO15_A396EmprCod ;
   private boolean[] T01EO15_n396EmprCod ;
   private int[] T01EO15_A129BarCod ;
   private boolean[] T01EO15_n129BarCod ;
   private byte[] T01EO15_A132BarCodReo ;
   private boolean[] T01EO15_n132BarCodReo ;
   private String[] T01EO15_A130BarCodPar ;
   private boolean[] T01EO15_n130BarCodPar ;
   private String[] T01EO16_A396EmprCod ;
   private boolean[] T01EO16_n396EmprCod ;
   private int[] T01EO16_A129BarCod ;
   private boolean[] T01EO16_n129BarCod ;
   private byte[] T01EO16_A132BarCodReo ;
   private boolean[] T01EO16_n132BarCodReo ;
   private String[] T01EO16_A130BarCodPar ;
   private boolean[] T01EO16_n130BarCodPar ;
   private int[] T01EO4_A361DisCod ;
   private String[] T01EO4_A2759BarMaqGru ;
   private int[] T01EO4_A129BarCod ;
   private boolean[] T01EO4_n129BarCod ;
   private byte[] T01EO4_A132BarCodReo ;
   private boolean[] T01EO4_n132BarCodReo ;
   private String[] T01EO4_A130BarCodPar ;
   private boolean[] T01EO4_n130BarCodPar ;
   private String[] T01EO4_A180BarMaqCod ;
   private String[] T01EO4_A396EmprCod ;
   private boolean[] T01EO4_n396EmprCod ;
   private int[] T01EO4_A252CliCod ;
   private boolean[] T01EO4_n252CliCod ;
   private String[] T01EO4_A365DisDes ;
   private java.math.BigDecimal[] T01EO21_A3432TotRefKgs ;
   private java.math.BigDecimal[] T01EO21_A3433TotRefMts ;
   private short[] T01EO21_A3434TotRefPie ;
   private long[] T01EO22_A14681MRPrId ;
   private String[] T01EO23_A5921XCjaDis ;
   private long[] T01EO23_A5922XCjaCod ;
   private String[] T01EO24_A396EmprCod ;
   private boolean[] T01EO24_n396EmprCod ;
   private int[] T01EO24_A129BarCod ;
   private boolean[] T01EO24_n129BarCod ;
   private byte[] T01EO24_A132BarCodReo ;
   private boolean[] T01EO24_n132BarCodReo ;
   private String[] T01EO24_A130BarCodPar ;
   private boolean[] T01EO24_n130BarCodPar ;
   private short[] T01EO24_A14152MEnvOrd ;
   private String[] T01EO25_A396EmprCod ;
   private boolean[] T01EO25_n396EmprCod ;
   private int[] T01EO25_A129BarCod ;
   private boolean[] T01EO25_n129BarCod ;
   private byte[] T01EO25_A132BarCodReo ;
   private boolean[] T01EO25_n132BarCodReo ;
   private String[] T01EO25_A130BarCodPar ;
   private boolean[] T01EO25_n130BarCodPar ;
   private String[] T01EO25_A13905BarTraID ;
   private String[] T01EO26_A396EmprCod ;
   private boolean[] T01EO26_n396EmprCod ;
   private int[] T01EO26_A129BarCod ;
   private boolean[] T01EO26_n129BarCod ;
   private byte[] T01EO26_A132BarCodReo ;
   private boolean[] T01EO26_n132BarCodReo ;
   private String[] T01EO26_A130BarCodPar ;
   private boolean[] T01EO26_n130BarCodPar ;
   private byte[] T01EO26_A13093BarDGLin ;
   private String[] T01EO26_A13094BarDGDibCl ;
   private int[] T01EO26_A13095BarDGDibIn ;
   private String[] T01EO26_A13096BarDGComb ;
   private String[] T01EO26_A13097BarDGFOndo ;
   private String[] T01EO27_A396EmprCod ;
   private boolean[] T01EO27_n396EmprCod ;
   private int[] T01EO27_A11917Ebd_numero ;
   private String[] T01EO28_A396EmprCod ;
   private boolean[] T01EO28_n396EmprCod ;
   private int[] T01EO28_A11898Prd_numero ;
   private String[] T01EO29_A396EmprCod ;
   private boolean[] T01EO29_n396EmprCod ;
   private int[] T01EO29_A11849Cte_numero ;
   private String[] T01EO30_A396EmprCod ;
   private boolean[] T01EO30_n396EmprCod ;
   private int[] T01EO30_A11791Ap_numero ;
   private String[] T01EO31_A396EmprCod ;
   private boolean[] T01EO31_n396EmprCod ;
   private int[] T01EO31_A3985CalBarCod ;
   private byte[] T01EO31_A3986CalBarCodR ;
   private String[] T01EO31_A3987CalBarCodP ;
   private String[] T01EO32_A396EmprCod ;
   private boolean[] T01EO32_n396EmprCod ;
   private java.util.Date[] T01EO32_A5294InPTime ;
   private int[] T01EO32_A652OpeCod ;
   private String[] T01EO33_A396EmprCod ;
   private boolean[] T01EO33_n396EmprCod ;
   private int[] T01EO33_A129BarCod ;
   private boolean[] T01EO33_n129BarCod ;
   private byte[] T01EO33_A132BarCodReo ;
   private boolean[] T01EO33_n132BarCodReo ;
   private String[] T01EO33_A130BarCodPar ;
   private boolean[] T01EO33_n130BarCodPar ;
   private int[] T01EO33_A4118tinagrcod ;
   private byte[] T01EO33_A4119tinagrreo ;
   private String[] T01EO33_A4120tinagrpar ;
   private String[] T01EO34_A396EmprCod ;
   private boolean[] T01EO34_n396EmprCod ;
   private int[] T01EO34_A129BarCod ;
   private boolean[] T01EO34_n129BarCod ;
   private byte[] T01EO34_A132BarCodReo ;
   private boolean[] T01EO34_n132BarCodReo ;
   private String[] T01EO34_A130BarCodPar ;
   private boolean[] T01EO34_n130BarCodPar ;
   private int[] T01EO34_A4080estagrcod ;
   private byte[] T01EO34_A4081estagrreo ;
   private String[] T01EO34_A4082estagrpar ;
   private String[] T01EO35_A396EmprCod ;
   private boolean[] T01EO35_n396EmprCod ;
   private int[] T01EO35_A129BarCod ;
   private boolean[] T01EO35_n129BarCod ;
   private byte[] T01EO35_A132BarCodReo ;
   private boolean[] T01EO35_n132BarCodReo ;
   private String[] T01EO35_A130BarCodPar ;
   private boolean[] T01EO35_n130BarCodPar ;
   private byte[] T01EO35_A4075recestncol ;
   private byte[] T01EO35_A4076recestnpro ;
   private String[] T01EO36_A396EmprCod ;
   private boolean[] T01EO36_n396EmprCod ;
   private String[] T01EO36_A602MaqCod ;
   private String[] T01EO36_A1142MaqFCod ;
   private short[] T01EO36_A3068PlaEtaOrd ;
   private byte[] T01EO36_A3069PlaEtaOrdA ;
   private int[] T01EO36_A129BarCod ;
   private boolean[] T01EO36_n129BarCod ;
   private byte[] T01EO36_A132BarCodReo ;
   private boolean[] T01EO36_n132BarCodReo ;
   private String[] T01EO36_A130BarCodPar ;
   private boolean[] T01EO36_n130BarCodPar ;
   private String[] T01EO37_A396EmprCod ;
   private boolean[] T01EO37_n396EmprCod ;
   private int[] T01EO37_A129BarCod ;
   private boolean[] T01EO37_n129BarCod ;
   private byte[] T01EO37_A132BarCodReo ;
   private boolean[] T01EO37_n132BarCodReo ;
   private String[] T01EO37_A130BarCodPar ;
   private boolean[] T01EO37_n130BarCodPar ;
   private short[] T01EO37_A4846BarAudLin ;
   private String[] T01EO38_A396EmprCod ;
   private boolean[] T01EO38_n396EmprCod ;
   private int[] T01EO38_A129BarCod ;
   private boolean[] T01EO38_n129BarCod ;
   private byte[] T01EO38_A132BarCodReo ;
   private boolean[] T01EO38_n132BarCodReo ;
   private String[] T01EO38_A130BarCodPar ;
   private boolean[] T01EO38_n130BarCodPar ;
   private short[] T01EO38_A3940BarEnsLin ;
   private String[] T01EO39_A396EmprCod ;
   private boolean[] T01EO39_n396EmprCod ;
   private int[] T01EO39_A10914SolSalCod ;
   private String[] T01EO40_A396EmprCod ;
   private boolean[] T01EO40_n396EmprCod ;
   private int[] T01EO40_A10364Ph_numero ;
   private String[] T01EO41_A396EmprCod ;
   private boolean[] T01EO41_n396EmprCod ;
   private int[] T01EO41_A129BarCod ;
   private boolean[] T01EO41_n129BarCod ;
   private byte[] T01EO41_A132BarCodReo ;
   private boolean[] T01EO41_n132BarCodReo ;
   private String[] T01EO41_A130BarCodPar ;
   private boolean[] T01EO41_n130BarCodPar ;
   private String[] T01EO41_A10197ProEspCod ;
   private String[] T01EO42_A396EmprCod ;
   private boolean[] T01EO42_n396EmprCod ;
   private int[] T01EO42_A129BarCod ;
   private boolean[] T01EO42_n129BarCod ;
   private byte[] T01EO42_A132BarCodReo ;
   private boolean[] T01EO42_n132BarCodReo ;
   private String[] T01EO42_A130BarCodPar ;
   private boolean[] T01EO42_n130BarCodPar ;
   private int[] T01EO42_A5322Dp_Nrecep ;
   private String[] T01EO43_A396EmprCod ;
   private boolean[] T01EO43_n396EmprCod ;
   private int[] T01EO43_A129BarCod ;
   private boolean[] T01EO43_n129BarCod ;
   private byte[] T01EO43_A132BarCodReo ;
   private boolean[] T01EO43_n132BarCodReo ;
   private String[] T01EO43_A130BarCodPar ;
   private boolean[] T01EO43_n130BarCodPar ;
   private int[] T01EO43_A8569EntSecLn ;
   private String[] T01EO44_A396EmprCod ;
   private boolean[] T01EO44_n396EmprCod ;
   private int[] T01EO44_A7434PLLNro ;
   private short[] T01EO44_A7443LPLNro ;
   private short[] T01EO44_A7459CPLCom ;
   private int[] T01EO44_A129BarCod ;
   private boolean[] T01EO44_n129BarCod ;
   private byte[] T01EO44_A132BarCodReo ;
   private boolean[] T01EO44_n132BarCodReo ;
   private String[] T01EO44_A130BarCodPar ;
   private boolean[] T01EO44_n130BarCodPar ;
   private String[] T01EO45_A396EmprCod ;
   private boolean[] T01EO45_n396EmprCod ;
   private int[] T01EO45_A7145OSSCod ;
   private String[] T01EO46_A396EmprCod ;
   private boolean[] T01EO46_n396EmprCod ;
   private int[] T01EO46_A7049OGSCod ;
   private String[] T01EO47_A396EmprCod ;
   private boolean[] T01EO47_n396EmprCod ;
   private int[] T01EO47_A129BarCod ;
   private boolean[] T01EO47_n129BarCod ;
   private byte[] T01EO47_A132BarCodReo ;
   private boolean[] T01EO47_n132BarCodReo ;
   private String[] T01EO47_A130BarCodPar ;
   private boolean[] T01EO47_n130BarCodPar ;
   private int[] T01EO47_A6031Ac_Barcod ;
   private byte[] T01EO47_A6032Ac_BarReo ;
   private String[] T01EO47_A6033Ac_BarPar ;
   private String[] T01EO48_A396EmprCod ;
   private boolean[] T01EO48_n396EmprCod ;
   private int[] T01EO48_A129BarCod ;
   private boolean[] T01EO48_n129BarCod ;
   private byte[] T01EO48_A132BarCodReo ;
   private boolean[] T01EO48_n132BarCodReo ;
   private String[] T01EO48_A130BarCodPar ;
   private boolean[] T01EO48_n130BarCodPar ;
   private int[] T01EO48_A5908PartPal ;
   private String[] T01EO49_A396EmprCod ;
   private boolean[] T01EO49_n396EmprCod ;
   private int[] T01EO49_A129BarCod ;
   private boolean[] T01EO49_n129BarCod ;
   private byte[] T01EO49_A132BarCodReo ;
   private boolean[] T01EO49_n132BarCodReo ;
   private String[] T01EO49_A130BarCodPar ;
   private boolean[] T01EO49_n130BarCodPar ;
   private byte[] T01EO49_A2524DisComLin ;
   private String[] T01EO49_A1056DisComCod ;
   private String[] T01EO49_A1032FonCod ;
   private String[] T01EO50_A396EmprCod ;
   private boolean[] T01EO50_n396EmprCod ;
   private long[] T01EO50_A1736AlbExtCod ;
   private int[] T01EO50_A129BarCod ;
   private boolean[] T01EO50_n129BarCod ;
   private byte[] T01EO50_A132BarCodReo ;
   private boolean[] T01EO50_n132BarCodReo ;
   private String[] T01EO50_A130BarCodPar ;
   private boolean[] T01EO50_n130BarCodPar ;
   private String[] T01EO51_A396EmprCod ;
   private boolean[] T01EO51_n396EmprCod ;
   private int[] T01EO51_A129BarCod ;
   private boolean[] T01EO51_n129BarCod ;
   private byte[] T01EO51_A132BarCodReo ;
   private boolean[] T01EO51_n132BarCodReo ;
   private String[] T01EO51_A130BarCodPar ;
   private boolean[] T01EO51_n130BarCodPar ;
   private int[] T01EO51_A3753BarFoaCod ;
   private byte[] T01EO51_A3754BarFoaReo ;
   private String[] T01EO51_A3755BarFoaPar ;
   private String[] T01EO52_A396EmprCod ;
   private boolean[] T01EO52_n396EmprCod ;
   private int[] T01EO52_A129BarCod ;
   private boolean[] T01EO52_n129BarCod ;
   private byte[] T01EO52_A132BarCodReo ;
   private boolean[] T01EO52_n132BarCodReo ;
   private String[] T01EO52_A130BarCodPar ;
   private boolean[] T01EO52_n130BarCodPar ;
   private int[] T01EO52_A3747BarPegCod ;
   private byte[] T01EO52_A3748BarPegReo ;
   private String[] T01EO52_A3749BarPegPar ;
   private String[] T01EO53_A396EmprCod ;
   private boolean[] T01EO53_n396EmprCod ;
   private int[] T01EO53_A3253SolTraCod ;
   private String[] T01EO54_A396EmprCod ;
   private boolean[] T01EO54_n396EmprCod ;
   private int[] T01EO54_A3235SolSubCod ;
   private String[] T01EO55_A396EmprCod ;
   private boolean[] T01EO55_n396EmprCod ;
   private int[] T01EO55_A3218SolLuzCod ;
   private String[] T01EO56_A396EmprCod ;
   private boolean[] T01EO56_n396EmprCod ;
   private int[] T01EO56_A3196SolFriCod ;
   private String[] T01EO57_A396EmprCod ;
   private boolean[] T01EO57_n396EmprCod ;
   private int[] T01EO57_A3165SolPilCod ;
   private String[] T01EO58_A396EmprCod ;
   private boolean[] T01EO58_n396EmprCod ;
   private int[] T01EO58_A129BarCod ;
   private boolean[] T01EO58_n129BarCod ;
   private byte[] T01EO58_A132BarCodReo ;
   private boolean[] T01EO58_n132BarCodReo ;
   private String[] T01EO58_A130BarCodPar ;
   private boolean[] T01EO58_n130BarCodPar ;
   private short[] T01EO58_A2872HAnRLinMaq ;
   private byte[] T01EO58_A2873HAnRLinPro ;
   private short[] T01EO58_A2874HAnRLin ;
   private byte[] T01EO58_A2875HAnNumAny ;
   private String[] T01EO59_A396EmprCod ;
   private boolean[] T01EO59_n396EmprCod ;
   private String[] T01EO59_A2817PlaTer ;
   private short[] T01EO59_A2818PlaOrd ;
   private String[] T01EO60_A396EmprCod ;
   private boolean[] T01EO60_n396EmprCod ;
   private String[] T01EO60_A2809MetTerCod ;
   private int[] T01EO60_A129BarCod ;
   private boolean[] T01EO60_n129BarCod ;
   private byte[] T01EO60_A132BarCodReo ;
   private boolean[] T01EO60_n132BarCodReo ;
   private String[] T01EO60_A130BarCodPar ;
   private boolean[] T01EO60_n130BarCodPar ;
   private String[] T01EO61_A396EmprCod ;
   private boolean[] T01EO61_n396EmprCod ;
   private int[] T01EO61_A129BarCod ;
   private boolean[] T01EO61_n129BarCod ;
   private byte[] T01EO61_A132BarCodReo ;
   private boolean[] T01EO61_n132BarCodReo ;
   private String[] T01EO61_A130BarCodPar ;
   private boolean[] T01EO61_n130BarCodPar ;
   private short[] T01EO61_A2808RecLinMAL ;
   private byte[] T01EO61_A1377RecNumAny ;
   private String[] T01EO61_A719PrdNum ;
   private String[] T01EO62_A396EmprCod ;
   private boolean[] T01EO62_n396EmprCod ;
   private int[] T01EO62_A129BarCod ;
   private boolean[] T01EO62_n129BarCod ;
   private byte[] T01EO62_A132BarCodReo ;
   private boolean[] T01EO62_n132BarCodReo ;
   private String[] T01EO62_A130BarCodPar ;
   private boolean[] T01EO62_n130BarCodPar ;
   private short[] T01EO62_A2804RecLinMaq ;
   private String[] T01EO63_A396EmprCod ;
   private boolean[] T01EO63_n396EmprCod ;
   private String[] T01EO63_A2792TermiCod ;
   private int[] T01EO63_A129BarCod ;
   private boolean[] T01EO63_n129BarCod ;
   private byte[] T01EO63_A132BarCodReo ;
   private boolean[] T01EO63_n132BarCodReo ;
   private String[] T01EO63_A130BarCodPar ;
   private boolean[] T01EO63_n130BarCodPar ;
   private String[] T01EO64_A396EmprCod ;
   private boolean[] T01EO64_n396EmprCod ;
   private short[] T01EO64_A2248ManCod ;
   private java.util.Date[] T01EO64_A2711RpExHdFe ;
   private short[] T01EO64_A2713RpExHdLi ;
   private String[] T01EO65_A396EmprCod ;
   private boolean[] T01EO65_n396EmprCod ;
   private short[] T01EO65_A2248ManCod ;
   private String[] T01EO65_A2689ExHdrFas ;
   private int[] T01EO65_A2692ExHdrLin ;
   private String[] T01EO66_A396EmprCod ;
   private boolean[] T01EO66_n396EmprCod ;
   private int[] T01EO66_A129BarCod ;
   private boolean[] T01EO66_n129BarCod ;
   private byte[] T01EO66_A132BarCodReo ;
   private boolean[] T01EO66_n132BarCodReo ;
   private String[] T01EO66_A130BarCodPar ;
   private boolean[] T01EO66_n130BarCodPar ;
   private String[] T01EO66_A2494BarDosPro ;
   private String[] T01EO66_A719PrdNum ;
   private String[] T01EO67_A396EmprCod ;
   private boolean[] T01EO67_n396EmprCod ;
   private String[] T01EO67_A602MaqCod ;
   private java.util.Date[] T01EO67_A2461PlaFecTin ;
   private int[] T01EO67_A129BarCod ;
   private boolean[] T01EO67_n129BarCod ;
   private byte[] T01EO67_A132BarCodReo ;
   private boolean[] T01EO67_n132BarCodReo ;
   private String[] T01EO67_A130BarCodPar ;
   private boolean[] T01EO67_n130BarCodPar ;
   private String[] T01EO68_A396EmprCod ;
   private boolean[] T01EO68_n396EmprCod ;
   private int[] T01EO68_A129BarCod ;
   private boolean[] T01EO68_n129BarCod ;
   private byte[] T01EO68_A132BarCodReo ;
   private boolean[] T01EO68_n132BarCodReo ;
   private String[] T01EO68_A130BarCodPar ;
   private boolean[] T01EO68_n130BarCodPar ;
   private short[] T01EO68_A2457BarObLin ;
   private String[] T01EO69_A396EmprCod ;
   private boolean[] T01EO69_n396EmprCod ;
   private int[] T01EO69_A129BarCod ;
   private boolean[] T01EO69_n129BarCod ;
   private byte[] T01EO69_A132BarCodReo ;
   private boolean[] T01EO69_n132BarCodReo ;
   private String[] T01EO69_A130BarCodPar ;
   private boolean[] T01EO69_n130BarCodPar ;
   private short[] T01EO69_A2444BarEnLin ;
   private String[] T01EO70_A396EmprCod ;
   private boolean[] T01EO70_n396EmprCod ;
   private int[] T01EO70_A2406ExhAlbCod ;
   private int[] T01EO70_A129BarCod ;
   private boolean[] T01EO70_n129BarCod ;
   private byte[] T01EO70_A132BarCodReo ;
   private boolean[] T01EO70_n132BarCodReo ;
   private String[] T01EO70_A130BarCodPar ;
   private boolean[] T01EO70_n130BarCodPar ;
   private String[] T01EO71_A396EmprCod ;
   private boolean[] T01EO71_n396EmprCod ;
   private int[] T01EO71_A2253SalExtAlb ;
   private int[] T01EO71_A129BarCod ;
   private boolean[] T01EO71_n129BarCod ;
   private byte[] T01EO71_A132BarCodReo ;
   private boolean[] T01EO71_n132BarCodReo ;
   private String[] T01EO71_A130BarCodPar ;
   private boolean[] T01EO71_n130BarCodPar ;
   private String[] T01EO72_A396EmprCod ;
   private boolean[] T01EO72_n396EmprCod ;
   private long[] T01EO72_A30AlbProCod ;
   private int[] T01EO72_A129BarCod ;
   private boolean[] T01EO72_n129BarCod ;
   private byte[] T01EO72_A132BarCodReo ;
   private boolean[] T01EO72_n132BarCodReo ;
   private String[] T01EO72_A130BarCodPar ;
   private boolean[] T01EO72_n130BarCodPar ;
   private String[] T01EO73_A396EmprCod ;
   private boolean[] T01EO73_n396EmprCod ;
   private int[] T01EO73_A1348SolColCod ;
   private String[] T01EO74_A396EmprCod ;
   private boolean[] T01EO74_n396EmprCod ;
   private int[] T01EO74_A1333EstDimCod ;
   private String[] T01EO75_A396EmprCod ;
   private boolean[] T01EO75_n396EmprCod ;
   private int[] T01EO75_A1314EnsLabCod ;
   private String[] T01EO76_A396EmprCod ;
   private boolean[] T01EO76_n396EmprCod ;
   private int[] T01EO76_A129BarCod ;
   private boolean[] T01EO76_n129BarCod ;
   private byte[] T01EO76_A132BarCodReo ;
   private boolean[] T01EO76_n132BarCodReo ;
   private String[] T01EO76_A130BarCodPar ;
   private boolean[] T01EO76_n130BarCodPar ;
   private byte[] T01EO76_A906ObsReoLin ;
   private String[] T01EO77_A396EmprCod ;
   private boolean[] T01EO77_n396EmprCod ;
   private int[] T01EO77_A859CumCodCont ;
   private String[] T01EO78_A396EmprCod ;
   private boolean[] T01EO78_n396EmprCod ;
   private String[] T01EO78_A602MaqCod ;
   private java.util.Date[] T01EO78_A558HisProFec ;
   private int[] T01EO78_A561HisProLin ;
   private String[] T01EO79_A396EmprCod ;
   private boolean[] T01EO79_n396EmprCod ;
   private int[] T01EO79_A252CliCod ;
   private boolean[] T01EO79_n252CliCod ;
   private String[] T01EO79_A494ForSer ;
   private String[] T01EO79_A482ForColNom ;
   private int[] T01EO79_A483ForColNum ;
   private byte[] T01EO79_A831TipColCod ;
   private String[] T01EO80_A396EmprCod ;
   private boolean[] T01EO80_n396EmprCod ;
   private int[] T01EO80_A129BarCod ;
   private boolean[] T01EO80_n129BarCod ;
   private byte[] T01EO80_A132BarCodReo ;
   private boolean[] T01EO80_n132BarCodReo ;
   private String[] T01EO80_A130BarCodPar ;
   private boolean[] T01EO80_n130BarCodPar ;
   private String[] T01EO80_A200BarPieCod ;
   private String[] T01EO81_A396EmprCod ;
   private boolean[] T01EO81_n396EmprCod ;
   private int[] T01EO81_A129BarCod ;
   private boolean[] T01EO81_n129BarCod ;
   private byte[] T01EO81_A132BarCodReo ;
   private boolean[] T01EO81_n132BarCodReo ;
   private String[] T01EO81_A130BarCodPar ;
   private boolean[] T01EO81_n130BarCodPar ;
   private byte[] T01EO81_A188BarNotLin ;
   private String[] T01EO82_A396EmprCod ;
   private boolean[] T01EO82_n396EmprCod ;
   private int[] T01EO82_A129BarCod ;
   private boolean[] T01EO82_n129BarCod ;
   private byte[] T01EO82_A132BarCodReo ;
   private boolean[] T01EO82_n132BarCodReo ;
   private String[] T01EO82_A130BarCodPar ;
   private boolean[] T01EO82_n130BarCodPar ;
   private String[] T01EO82_A758ProCod ;
   private String[] T01EO83_A396EmprCod ;
   private boolean[] T01EO83_n396EmprCod ;
   private int[] T01EO83_A129BarCod ;
   private boolean[] T01EO83_n129BarCod ;
   private byte[] T01EO83_A132BarCodReo ;
   private boolean[] T01EO83_n132BarCodReo ;
   private String[] T01EO83_A130BarCodPar ;
   private boolean[] T01EO83_n130BarCodPar ;
   private int[] T01EO83_A119BarAgrCod ;
   private byte[] T01EO83_A124BarAgrReo ;
   private String[] T01EO83_A122BarAgrPar ;
   private String[] T01EO85_A396EmprCod ;
   private boolean[] T01EO85_n396EmprCod ;
   private int[] T01EO85_A129BarCod ;
   private boolean[] T01EO85_n129BarCod ;
   private byte[] T01EO85_A132BarCodReo ;
   private boolean[] T01EO85_n132BarCodReo ;
   private String[] T01EO85_A130BarCodPar ;
   private boolean[] T01EO85_n130BarCodPar ;
   private int[] T01EO86_A129BarCod ;
   private boolean[] T01EO86_n129BarCod ;
   private byte[] T01EO86_A132BarCodReo ;
   private boolean[] T01EO86_n132BarCodReo ;
   private String[] T01EO86_A130BarCodPar ;
   private boolean[] T01EO86_n130BarCodPar ;
   private int[] T01EO86_A3384RefBarCod ;
   private byte[] T01EO86_A3385RefBarReo ;
   private String[] T01EO86_A3386RefBarPar ;
   private java.math.BigDecimal[] T01EO86_A3387RefKgs ;
   private boolean[] T01EO86_n3387RefKgs ;
   private java.math.BigDecimal[] T01EO86_A3388RefMts ;
   private boolean[] T01EO86_n3388RefMts ;
   private short[] T01EO86_A3389RefPie ;
   private boolean[] T01EO86_n3389RefPie ;
   private String[] T01EO86_A396EmprCod ;
   private boolean[] T01EO86_n396EmprCod ;
   private String[] T01EO87_A396EmprCod ;
   private boolean[] T01EO87_n396EmprCod ;
   private int[] T01EO87_A129BarCod ;
   private boolean[] T01EO87_n129BarCod ;
   private byte[] T01EO87_A132BarCodReo ;
   private boolean[] T01EO87_n132BarCodReo ;
   private String[] T01EO87_A130BarCodPar ;
   private boolean[] T01EO87_n130BarCodPar ;
   private int[] T01EO87_A3384RefBarCod ;
   private byte[] T01EO87_A3385RefBarReo ;
   private String[] T01EO87_A3386RefBarPar ;
   private int[] T01EO3_A129BarCod ;
   private boolean[] T01EO3_n129BarCod ;
   private byte[] T01EO3_A132BarCodReo ;
   private boolean[] T01EO3_n132BarCodReo ;
   private String[] T01EO3_A130BarCodPar ;
   private boolean[] T01EO3_n130BarCodPar ;
   private int[] T01EO3_A3384RefBarCod ;
   private byte[] T01EO3_A3385RefBarReo ;
   private String[] T01EO3_A3386RefBarPar ;
   private java.math.BigDecimal[] T01EO3_A3387RefKgs ;
   private boolean[] T01EO3_n3387RefKgs ;
   private java.math.BigDecimal[] T01EO3_A3388RefMts ;
   private boolean[] T01EO3_n3388RefMts ;
   private short[] T01EO3_A3389RefPie ;
   private boolean[] T01EO3_n3389RefPie ;
   private String[] T01EO3_A396EmprCod ;
   private boolean[] T01EO3_n396EmprCod ;
   private int[] T01EO2_A129BarCod ;
   private boolean[] T01EO2_n129BarCod ;
   private byte[] T01EO2_A132BarCodReo ;
   private boolean[] T01EO2_n132BarCodReo ;
   private String[] T01EO2_A130BarCodPar ;
   private boolean[] T01EO2_n130BarCodPar ;
   private int[] T01EO2_A3384RefBarCod ;
   private byte[] T01EO2_A3385RefBarReo ;
   private String[] T01EO2_A3386RefBarPar ;
   private java.math.BigDecimal[] T01EO2_A3387RefKgs ;
   private boolean[] T01EO2_n3387RefKgs ;
   private java.math.BigDecimal[] T01EO2_A3388RefMts ;
   private boolean[] T01EO2_n3388RefMts ;
   private short[] T01EO2_A3389RefPie ;
   private boolean[] T01EO2_n3389RefPie ;
   private String[] T01EO2_A396EmprCod ;
   private boolean[] T01EO2_n396EmprCod ;
   private String[] T01EO91_A396EmprCod ;
   private boolean[] T01EO91_n396EmprCod ;
   private int[] T01EO91_A129BarCod ;
   private boolean[] T01EO91_n129BarCod ;
   private byte[] T01EO91_A132BarCodReo ;
   private boolean[] T01EO91_n132BarCodReo ;
   private String[] T01EO91_A130BarCodPar ;
   private boolean[] T01EO91_n130BarCodPar ;
   private int[] T01EO91_A3384RefBarCod ;
   private byte[] T01EO91_A3385RefBarReo ;
   private String[] T01EO91_A3386RefBarPar ;
   private String[] T01EO92_A407EmprNom ;
   private boolean[] T01EO92_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trefhdr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trefhdr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trefhdr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trefhdr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trefhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EO2", "SELECT BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar, RefKgs, RefMts, RefPie, EmprCod FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RefBarCod = ? AND RefBarReo = ? AND RefBarPar = ?  FOR UPDATE OF RefKgs, RefMts, RefPie NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO3", "SELECT BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar, RefKgs, RefMts, RefPie, EmprCod FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RefBarCod = ? AND RefBarReo = ? AND RefBarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO4", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO5", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO7", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO9", "SELECT COALESCE( T1.TotRefKgs, 0) AS TotRefKgs, COALESCE( T1.TotRefMts, 0) AS TotRefMts, COALESCE( T1.TotRefPie, 0) AS TotRefPie FROM (SELECT SUM(RefKgs) AS TotRefKgs, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(RefMts) AS TotRefMts, SUM(RefPie) AS TotRefPie FROM TXPREFHDR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO11", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.BarMaqGru, T2.EmprNom, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, TM1.CliCod, TM1.DisDes, TM1.EmprCod, COALESCE( T3.TotRefKgs, 0) AS TotRefKgs, COALESCE( T3.TotRefMts, 0) AS TotRefMts, COALESCE( T3.TotRefPie, 0) AS TotRefPie FROM ((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(RefKgs) AS TotRefKgs, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(RefMts) AS TotRefMts, SUM(RefPie) AS TotRefPie FROM TXPREFHDR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO13", "SELECT COALESCE( T1.TotRefKgs, 0) AS TotRefKgs, COALESCE( T1.TotRefMts, 0) AS TotRefMts, COALESCE( T1.TotRefPie, 0) AS TotRefPie FROM (SELECT SUM(RefKgs) AS TotRefKgs, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(RefMts) AS TotRefMts, SUM(RefPie) AS TotRefPie FROM TXPREFHDR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EO17", "INSERT INTO TXPBARCAD(DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, BarAgrEst, BarVolMaq, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01EO18", "UPDATE TXPBARCAD SET DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01EO19", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01EO21", "SELECT COALESCE( T1.TotRefKgs, 0) AS TotRefKgs, COALESCE( T1.TotRefMts, 0) AS TotRefMts, COALESCE( T1.TotRefPie, 0) AS TotRefPie FROM (SELECT SUM(RefKgs) AS TotRefKgs, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(RefMts) AS TotRefMts, SUM(RefPie) AS TotRefPie FROM TXPREFHDR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO22", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO23", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO24", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO25", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO27", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO28", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO29", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO30", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO31", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO32", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO33", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO36", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO38", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO39", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO40", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO41", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO42", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO43", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO44", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO45", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO46", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO47", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO50", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO51", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO52", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO53", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO54", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO55", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO56", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO57", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO58", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO59", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO60", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO61", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO63", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO64", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO65", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO66", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO67", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO68", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO69", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO70", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO71", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO72", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO73", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO74", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO75", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO77", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO78", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO79", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO80", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO81", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO82", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EO83", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EO84", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01EO85", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO86", "SELECT BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar, RefKgs, RefMts, RefPie, EmprCod FROM TXPREFHDR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RefBarCod = ? and RefBarReo = ? and RefBarPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO87", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RefBarCod = ? AND RefBarReo = ? AND RefBarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01EO88", "INSERT INTO TXPREFHDR(BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar, RefKgs, RefMts, RefPie, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPREFHDR")
         ,new UpdateCursor("T01EO89", "UPDATE TXPREFHDR SET RefKgs=?, RefMts=?, RefPie=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RefBarCod = ? AND RefBarReo = ? AND RefBarPar = ?", GX_NOMASK, "TXPREFHDR")
         ,new UpdateCursor("T01EO90", "DELETE FROM TXPREFHDR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RefBarCod = ? AND RefBarReo = ? AND RefBarPar = ?", GX_NOMASK, "TXPREFHDR")
         ,new ForEachCursor("T01EO91", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EO92", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 80 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 86 :
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 10 :
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
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 3);
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
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 3);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setString(7, (String)parms[9], 6);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 1);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 82 :
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
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setString(6, (String)parms[8], 1);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 3);
               }
               return;
            case 83 :
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               stmt.setInt(8, ((Number) parms[14]).intValue());
               stmt.setByte(9, ((Number) parms[15]).byteValue());
               stmt.setString(10, (String)parms[16], 1);
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 86 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

