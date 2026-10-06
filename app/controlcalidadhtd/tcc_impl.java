package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcc_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A4031CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control de Calidad", ""), (short)(0)) ;
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
      nRC_GXsfl_95 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_95"))) ;
      nGXsfl_95_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_95_idx"))) ;
      sGXsfl_95_idx = httpContext.GetPar( "sGXsfl_95_idx") ;
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

   public tcc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcc_impl.class ));
   }

   public tcc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFch_Internalname, localUtil.format(A4033CCFch, "99/99/99"), localUtil.format( A4033CCFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFch_Jsonclick, 0, "", "", "", "", "", 1, edtCCFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Disparador", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcDisp_Internalname, GXutil.rtrim( A4405CcDisp), GXutil.rtrim( localUtil.format( A4405CcDisp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcDisp_Jsonclick, 0, "", "", "", "", "", 1, edtCcDisp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Obs", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCcObs_Internalname, A3281CcObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtCcObs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "CCOk", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOk_Internalname, GXutil.ltrim( localUtil.ntoc( A11472CCOk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCOk_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11472CCOk), "9") : localUtil.format( DecimalUtil.doubleToDec(A11472CCOk), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOk_Jsonclick, 0, "", "", "", "", "", 1, edtCCOk_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "CCOk Fch", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCOkFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOkFch_Internalname, localUtil.ttoc( A11473CCOkFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11473CCOkFch, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOkFch_Jsonclick, 0, "", "", "", "", "", 1, edtCCOkFch_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCOkFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCOkFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "CCOk Usu", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOkUsu_Internalname, GXutil.rtrim( A11474CCOkUsu), GXutil.rtrim( localUtil.format( A11474CCOkUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOkUsu_Jsonclick, 0, "", "", "", "", "", 1, edtCCOkUsu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol95( ) ;
      nGXsfl_95_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount620 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_620 = (short)(1) ;
            scanStartI9620( ) ;
            while ( RcdFound620 != 0 )
            {
               init_level_properties620( ) ;
               getByPrimaryKeyI9620( ) ;
               addRowI9620( ) ;
               scanNextI9620( ) ;
            }
            scanEndI9620( ) ;
            nBlankRcdCount620 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalI9620( ) ;
         standaloneModalI9620( ) ;
         sMode620 = Gx_mode ;
         while ( nGXsfl_95_idx < nRC_GXsfl_95 )
         {
            bGXsfl_95_Refreshing = true ;
            readRowI9620( ) ;
            edtavnRcdDeleted_620_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_620_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_620_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_620_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtCCVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVAL_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVal_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtCCOkLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKLIN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCOkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtCCOkDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKDSC_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCOkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkDsc_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            if ( ( nRcdExists_620 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalI9620( ) ;
            }
            sendRowI9620( ) ;
            bGXsfl_95_Refreshing = false ;
         }
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount620 = (short)(5) ;
         nRcdExists_620 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartI9620( ) ;
            while ( RcdFound620 != 0 )
            {
               sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_95620( ) ;
               init_level_properties620( ) ;
               standaloneNotModalI9620( ) ;
               getByPrimaryKeyI9620( ) ;
               standaloneModalI9620( ) ;
               addRowI9620( ) ;
               scanNextI9620( ) ;
            }
            scanEndI9620( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode620 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_95620( ) ;
      initAllI9620( ) ;
      init_level_properties620( ) ;
      nRcdExists_620 = (short)(0) ;
      nIsMod_620 = (short)(0) ;
      nRcdDeleted_620 = (short)(0) ;
      nBlankRcdCount620 = (short)(nBlankRcdUsr620+nBlankRcdCount620) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount620 > 0 )
      {
         standaloneNotModalI9620( ) ;
         standaloneModalI9620( ) ;
         addRowI9620( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCCTLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount620 = (short)(nBlankRcdCount620-1) ;
      }
      Gx_mode = sMode620 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCC.htm");
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
      e11I92 ();
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
            Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4032CCOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4033CCFch = localUtil.ctod( httpContext.cgiGet( "Z4033CCFch"), 0) ;
            Z4405CcDisp = httpContext.cgiGet( "Z4405CcDisp") ;
            Z3281CcObs = httpContext.cgiGet( "Z3281CcObs") ;
            Z11472CCOk = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11472CCOk"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11473CCOkFch = localUtil.ctot( httpContext.cgiGet( "Z11473CCOkFch"), 0) ;
            Z11474CCOkUsu = httpContext.cgiGet( "Z11474CCOkUsu") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_95 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARORDLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarOrdLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A194BarOrdLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            else
            {
               A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4031CCTCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            }
            else
            {
               A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4032CCOpeCod = 0 ;
               n4032CCOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
            }
            else
            {
               A4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4032CCOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCCFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CCFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4033CCFch = GXutil.nullDate() ;
               n4033CCFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
            }
            else
            {
               A4033CCFch = localUtil.ctod( httpContext.cgiGet( edtCCFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4033CCFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
            }
            A4405CcDisp = httpContext.cgiGet( edtCcDisp_Internalname) ;
            n4405CcDisp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
            A3281CcObs = httpContext.cgiGet( edtCcObs_Internalname) ;
            n3281CcObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCOk_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11472CCOk = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11472CCOk", GXutil.str( A11472CCOk, 1, 0));
            }
            else
            {
               A11472CCOk = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11472CCOk", GXutil.str( A11472CCOk, 1, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtCCOkFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CCOKFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCOkFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11473CCOkFch = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A11473CCOkFch", localUtil.ttoc( A11473CCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A11473CCOkFch = localUtil.ctot( httpContext.cgiGet( edtCCOkFch_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11473CCOkFch", localUtil.ttoc( A11473CCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A11474CCOkUsu = httpContext.cgiGet( edtCCOkUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11474CCOkUsu", A11474CCOkUsu);
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
               A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
                        e11I92 ();
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
            initAllI9619( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_620_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_620_Enabled), 5, 0), !bGXsfl_95_Refreshing);
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
      disableAttributesI9619( ) ;
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

   public void confirm_I90( )
   {
      beforeValidateI9619( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsI9619( ) ;
         }
         else
         {
            checkExtendedTableI9619( ) ;
            if ( AnyError == 0 )
            {
               zmI9619( 2) ;
               zmI9619( 3) ;
               zmI9619( 4) ;
            }
            closeExtendedTableCursorsI9619( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode619 = Gx_mode ;
         confirm_I9620( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode619 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesI90( ) ;
      }
   }

   public void confirm_I9620( )
   {
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRowI9620( ) ;
         if ( ( nRcdExists_620 != 0 ) || ( nIsMod_620 != 0 ) )
         {
            getKeyI9620( ) ;
            if ( ( nRcdExists_620 == 0 ) && ( nRcdDeleted_620 == 0 ) )
            {
               if ( RcdFound620 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateI9620( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableI9620( ) ;
                     if ( AnyError == 0 )
                     {
                        zmI9620( 6) ;
                     }
                     closeExtendedTableCursorsI9620( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCTLIN_" + sGXsfl_95_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound620 != 0 )
               {
                  if ( nRcdDeleted_620 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyI9620( ) ;
                     loadI9620( ) ;
                     beforeValidateI9620( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsI9620( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_620 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateI9620( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableI9620( ) ;
                           if ( AnyError == 0 )
                           {
                              zmI9620( 6) ;
                           }
                           closeExtendedTableCursorsI9620( ) ;
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
                  if ( nRcdDeleted_620 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_620_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCVal_Internalname, GXutil.rtrim( A4035CCVal)) ;
         httpContext.changePostValue( edtCCOkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCOkDsc_Internalname, A12751CCOkDsc) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_95_idx, GXutil.rtrim( Z4035CCVal)) ;
         httpContext.changePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_95_idx, Z12751CCOkDsc) ;
         httpContext.changePostValue( "nRcdDeleted_620_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_620_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_620_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_620 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_620_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVAL_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKDSC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionI90( )
   {
   }

   public void e11I92( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV29Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV30Emprnom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char1, GXv_char2, GXv_char3) ;
      tcc_impl.this.A396EmprCod = GXv_char1[0] ;
      tcc_impl.this.AV30Emprnom = GXv_char2[0] ;
      tcc_impl.this.AV8UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30Emprnom", AV30Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char4 = AV7Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV7Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char4 = AV9LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tcc_impl.this.GXt_char4 = GXv_char3[0] ;
      AV9LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
   }

   public void zmI9619( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4032CCOpeCod = T00I96_A4032CCOpeCod[0] ;
            Z4033CCFch = T00I96_A4033CCFch[0] ;
            Z4405CcDisp = T00I96_A4405CcDisp[0] ;
            Z3281CcObs = T00I96_A3281CcObs[0] ;
            Z11472CCOk = T00I96_A11472CCOk[0] ;
            Z11473CCOkFch = T00I96_A11473CCOkFch[0] ;
            Z11474CCOkUsu = T00I96_A11474CCOkUsu[0] ;
         }
         else
         {
            Z4032CCOpeCod = A4032CCOpeCod ;
            Z4033CCFch = A4033CCFch ;
            Z4405CcDisp = A4405CcDisp ;
            Z3281CcObs = A3281CcObs ;
            Z11472CCOk = A11472CCOk ;
            Z11473CCOkFch = A11473CCOkFch ;
            Z11474CCOkUsu = A11474CCOkUsu ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4032CCOpeCod = A4032CCOpeCod ;
         Z4033CCFch = A4033CCFch ;
         Z4405CcDisp = A4405CcDisp ;
         Z3281CcObs = A3281CcObs ;
         Z11472CCOk = A11472CCOk ;
         Z11473CCOkFch = A11473CCOkFch ;
         Z11474CCOkUsu = A11474CCOkUsu ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00I97 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00I97_A407EmprNom[0] ;
      n407EmprNom = T00I97_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
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

   public void loadI9619( )
   {
      /* Using cursor T00I910 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A407EmprNom = T00I910_A407EmprNom[0] ;
         n407EmprNom = T00I910_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4032CCOpeCod = T00I910_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T00I910_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T00I910_A4033CCFch[0] ;
         n4033CCFch = T00I910_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T00I910_A4405CcDisp[0] ;
         n4405CcDisp = T00I910_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T00I910_A3281CcObs[0] ;
         n3281CcObs = T00I910_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A11472CCOk = T00I910_A11472CCOk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11472CCOk", GXutil.str( A11472CCOk, 1, 0));
         A11473CCOkFch = T00I910_A11473CCOkFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11473CCOkFch", localUtil.ttoc( A11473CCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11474CCOkUsu = T00I910_A11474CCOkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11474CCOkUsu", A11474CCOkUsu);
         zmI9619( -1) ;
      }
      pr_default.close(8);
      onLoadActionsI9619( ) ;
   }

   public void onLoadActionsI9619( )
   {
   }

   public void checkExtendedTableI9619( )
   {
      nIsDirty_619 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00I98 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      /* Using cursor T00I99 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursorsI9619( )
   {
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         String A758ProCod ,
                         short A194BarOrdLin )
   {
      /* Using cursor T00I911 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_4( String A396EmprCod ,
                         int A4031CCTCod )
   {
      /* Using cursor T00I912 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKeyI9619( )
   {
      /* Using cursor T00I913 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
      else
      {
         RcdFound619 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00I96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00I96_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmI9619( 1) ;
         RcdFound619 = (short)(1) ;
         A4032CCOpeCod = T00I96_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T00I96_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T00I96_A4033CCFch[0] ;
         n4033CCFch = T00I96_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T00I96_A4405CcDisp[0] ;
         n4405CcDisp = T00I96_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T00I96_A3281CcObs[0] ;
         n3281CcObs = T00I96_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A11472CCOk = T00I96_A11472CCOk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11472CCOk", GXutil.str( A11472CCOk, 1, 0));
         A11473CCOkFch = T00I96_A11473CCOkFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11473CCOkFch", localUtil.ttoc( A11473CCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11474CCOkUsu = T00I96_A11474CCOkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11474CCOkUsu", A11474CCOkUsu);
         A129BarCod = T00I96_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00I96_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00I96_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T00I96_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T00I96_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T00I96_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadI9619( ) ;
         if ( AnyError == 1 )
         {
            RcdFound619 = (short)(0) ;
            initializeNonKeyI9619( ) ;
         }
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound619 = (short)(0) ;
         initializeNonKeyI9619( ) ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyI9619( ) ;
      if ( RcdFound619 == 0 )
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
      RcdFound619 = (short)(0) ;
      /* Using cursor T00I914 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Integer.valueOf(A4031CCTCod), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T00I914_A129BarCod[0] < A129BarCod ) || ( T00I914_A129BarCod[0] == A129BarCod ) && ( T00I914_A132BarCodReo[0] < A132BarCodReo ) || ( T00I914_A132BarCodReo[0] == A132BarCodReo ) && ( T00I914_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00I914_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00I914_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I914_A132BarCodReo[0] == A132BarCodReo ) && ( T00I914_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00I914_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T00I914_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00I914_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I914_A132BarCodReo[0] == A132BarCodReo ) && ( T00I914_A129BarCod[0] == A129BarCod ) && ( T00I914_A194BarOrdLin[0] < A194BarOrdLin ) || ( T00I914_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00I914_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00I914_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I914_A132BarCodReo[0] == A132BarCodReo ) && ( T00I914_A129BarCod[0] == A129BarCod ) && ( T00I914_A4031CCTCod[0] < A4031CCTCod ) ) && ( GXutil.strcmp(T00I914_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T00I914_A129BarCod[0] > A129BarCod ) || ( T00I914_A129BarCod[0] == A129BarCod ) && ( T00I914_A132BarCodReo[0] > A132BarCodReo ) || ( T00I914_A132BarCodReo[0] == A132BarCodReo ) && ( T00I914_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00I914_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00I914_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I914_A132BarCodReo[0] == A132BarCodReo ) && ( T00I914_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00I914_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T00I914_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00I914_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I914_A132BarCodReo[0] == A132BarCodReo ) && ( T00I914_A129BarCod[0] == A129BarCod ) && ( T00I914_A194BarOrdLin[0] > A194BarOrdLin ) || ( T00I914_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00I914_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00I914_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I914_A132BarCodReo[0] == A132BarCodReo ) && ( T00I914_A129BarCod[0] == A129BarCod ) && ( T00I914_A4031CCTCod[0] > A4031CCTCod ) ) && ( GXutil.strcmp(T00I914_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T00I914_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T00I914_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T00I914_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T00I914_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T00I914_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = T00I914_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound619 = (short)(0) ;
      /* Using cursor T00I915 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Integer.valueOf(A4031CCTCod), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T00I915_A129BarCod[0] > A129BarCod ) || ( T00I915_A129BarCod[0] == A129BarCod ) && ( T00I915_A132BarCodReo[0] > A132BarCodReo ) || ( T00I915_A132BarCodReo[0] == A132BarCodReo ) && ( T00I915_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00I915_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00I915_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I915_A132BarCodReo[0] == A132BarCodReo ) && ( T00I915_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00I915_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T00I915_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00I915_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I915_A132BarCodReo[0] == A132BarCodReo ) && ( T00I915_A129BarCod[0] == A129BarCod ) && ( T00I915_A194BarOrdLin[0] > A194BarOrdLin ) || ( T00I915_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00I915_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00I915_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I915_A132BarCodReo[0] == A132BarCodReo ) && ( T00I915_A129BarCod[0] == A129BarCod ) && ( T00I915_A4031CCTCod[0] > A4031CCTCod ) ) && ( GXutil.strcmp(T00I915_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T00I915_A129BarCod[0] < A129BarCod ) || ( T00I915_A129BarCod[0] == A129BarCod ) && ( T00I915_A132BarCodReo[0] < A132BarCodReo ) || ( T00I915_A132BarCodReo[0] == A132BarCodReo ) && ( T00I915_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00I915_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00I915_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I915_A132BarCodReo[0] == A132BarCodReo ) && ( T00I915_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00I915_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T00I915_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00I915_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I915_A132BarCodReo[0] == A132BarCodReo ) && ( T00I915_A129BarCod[0] == A129BarCod ) && ( T00I915_A194BarOrdLin[0] < A194BarOrdLin ) || ( T00I915_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00I915_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00I915_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00I915_A132BarCodReo[0] == A132BarCodReo ) && ( T00I915_A129BarCod[0] == A129BarCod ) && ( T00I915_A4031CCTCod[0] < A4031CCTCod ) ) && ( GXutil.strcmp(T00I915_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T00I915_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T00I915_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T00I915_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T00I915_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T00I915_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = T00I915_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyI9619( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertI9619( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound619 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = Z194BarOrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
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
               updateI9619( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertI9619( ) ;
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
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertI9619( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
      {
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = Z194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
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
      getKeyI9619( ) ;
      if ( RcdFound619 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
         {
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = Z758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = Z194BarOrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = Z4031CCTCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tcc");
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_I90( ) ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartI9619( ) ;
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndI9619( ) ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
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
      scanStartI9619( ) ;
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound619 != 0 )
         {
            scanNextI9619( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndI9619( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyI9619( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00I95 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( Z4032CCOpeCod != T00I95_A4032CCOpeCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T00I95_A4033CCFch[0])) ) || ( GXutil.strcmp(Z4405CcDisp, T00I95_A4405CcDisp[0]) != 0 ) || ( GXutil.strcmp(Z3281CcObs, T00I95_A3281CcObs[0]) != 0 ) || ( Z11472CCOk != T00I95_A11472CCOk[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z11473CCOkFch, T00I95_A11473CCOkFch[0]) ) || ( GXutil.strcmp(Z11474CCOkUsu, T00I95_A11474CCOkUsu[0]) != 0 ) )
         {
            if ( Z4032CCOpeCod != T00I95_A4032CCOpeCod[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CCOpeCod");
               GXutil.writeLogRaw("Old: ",Z4032CCOpeCod);
               GXutil.writeLogRaw("Current: ",T00I95_A4032CCOpeCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T00I95_A4033CCFch[0])) ) )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CCFch");
               GXutil.writeLogRaw("Old: ",Z4033CCFch);
               GXutil.writeLogRaw("Current: ",T00I95_A4033CCFch[0]);
            }
            if ( GXutil.strcmp(Z4405CcDisp, T00I95_A4405CcDisp[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CcDisp");
               GXutil.writeLogRaw("Old: ",Z4405CcDisp);
               GXutil.writeLogRaw("Current: ",T00I95_A4405CcDisp[0]);
            }
            if ( GXutil.strcmp(Z3281CcObs, T00I95_A3281CcObs[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CcObs");
               GXutil.writeLogRaw("Old: ",Z3281CcObs);
               GXutil.writeLogRaw("Current: ",T00I95_A3281CcObs[0]);
            }
            if ( Z11472CCOk != T00I95_A11472CCOk[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CCOk");
               GXutil.writeLogRaw("Old: ",Z11472CCOk);
               GXutil.writeLogRaw("Current: ",T00I95_A11472CCOk[0]);
            }
            if ( !( GXutil.dateCompare(Z11473CCOkFch, T00I95_A11473CCOkFch[0]) ) )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CCOkFch");
               GXutil.writeLogRaw("Old: ",Z11473CCOkFch);
               GXutil.writeLogRaw("Current: ",T00I95_A11473CCOkFch[0]);
            }
            if ( GXutil.strcmp(Z11474CCOkUsu, T00I95_A11474CCOkUsu[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CCOkUsu");
               GXutil.writeLogRaw("Old: ",Z11474CCOkUsu);
               GXutil.writeLogRaw("Current: ",T00I95_A11474CCOkUsu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertI9619( )
   {
      beforeValidateI9619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableI9619( ) ;
      }
      if ( AnyError == 0 )
      {
         zmI9619( 0) ;
         checkOptimisticConcurrencyI9619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmI9619( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertI9619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00I916 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, Byte.valueOf(A11472CCOk), A11473CCOkFch, A11474CCOkUsu, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
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
                        processLevelI9619( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionI90( ) ;
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
            loadI9619( ) ;
         }
         endLevelI9619( ) ;
      }
      closeExtendedTableCursorsI9619( ) ;
   }

   public void updateI9619( )
   {
      beforeValidateI9619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableI9619( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyI9619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmI9619( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateI9619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00I917 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, Byte.valueOf(A11472CCOk), A11473CCOkFch, A11474CCOkUsu, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateI9619( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelI9619( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionI90( ) ;
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
         endLevelI9619( ) ;
      }
      closeExtendedTableCursorsI9619( ) ;
   }

   public void deferredUpdateI9619( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateI9619( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyI9619( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsI9619( ) ;
         afterConfirmI9619( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteI9619( ) ;
            if ( AnyError == 0 )
            {
               scanStartI9620( ) ;
               while ( RcdFound620 != 0 )
               {
                  getByPrimaryKeyI9620( ) ;
                  deleteI9620( ) ;
                  scanNextI9620( ) ;
               }
               scanEndI9620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00I918 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound619 == 0 )
                        {
                           initAllI9619( ) ;
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
                        resetCaptionI90( ) ;
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
      sMode619 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelI9619( ) ;
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsI9619( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00I919 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Nveces Test", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevelI9620( )
   {
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRowI9620( ) ;
         if ( ( nRcdExists_620 != 0 ) || ( nIsMod_620 != 0 ) )
         {
            standaloneNotModalI9620( ) ;
            getKeyI9620( ) ;
            if ( ( nRcdExists_620 == 0 ) && ( nRcdDeleted_620 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertI9620( ) ;
            }
            else
            {
               if ( RcdFound620 != 0 )
               {
                  if ( ( nRcdDeleted_620 != 0 ) && ( nRcdExists_620 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteI9620( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_620 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateI9620( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_620 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_620_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCVal_Internalname, GXutil.rtrim( A4035CCVal)) ;
         httpContext.changePostValue( edtCCOkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCOkDsc_Internalname, A12751CCOkDsc) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_95_idx, GXutil.rtrim( Z4035CCVal)) ;
         httpContext.changePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_95_idx, Z12751CCOkDsc) ;
         httpContext.changePostValue( "nRcdDeleted_620_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_620_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_620_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_620 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_620_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVAL_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKDSC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllI9620( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_620 = (short)(0) ;
      nIsMod_620 = (short)(0) ;
      nRcdDeleted_620 = (short)(0) ;
   }

   public void processLevelI9619( )
   {
      /* Save parent mode. */
      sMode619 = Gx_mode ;
      processNestedLevelI9620( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelI9619( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteI9619( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tcc");
         if ( AnyError == 0 )
         {
            confirmValuesI90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tcc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartI9619( )
   {
      /* Scan By routine */
      /* Using cursor T00I920 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A129BarCod = T00I920_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00I920_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00I920_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T00I920_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T00I920_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T00I920_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextI9619( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A129BarCod = T00I920_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00I920_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00I920_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T00I920_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T00I920_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T00I920_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
   }

   public void scanEndI9619( )
   {
      pr_default.close(18);
   }

   public void afterConfirmI9619( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertI9619( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateI9619( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteI9619( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteI9619( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateI9619( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesI9619( )
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
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOpeCod_Enabled), 5, 0), true);
      edtCCFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFch_Enabled), 5, 0), true);
      edtCcDisp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcDisp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcDisp_Enabled), 5, 0), true);
      edtCcObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcObs_Enabled), 5, 0), true);
      edtCCOk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOk_Enabled), 5, 0), true);
      edtCCOkFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkFch_Enabled), 5, 0), true);
      edtCCOkUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkUsu_Enabled), 5, 0), true);
   }

   public void zmI9620( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4035CCVal = T00I93_A4035CCVal[0] ;
            Z12750CCOkLin = T00I93_A12750CCOkLin[0] ;
            Z12751CCOkDsc = T00I93_A12751CCOkDsc[0] ;
         }
         else
         {
            Z4035CCVal = A4035CCVal ;
            Z12750CCOkLin = A12750CCOkLin ;
            Z12751CCOkDsc = A12751CCOkDsc ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4035CCVal = A4035CCVal ;
         Z12750CCOkLin = A12750CCOkLin ;
         Z12751CCOkDsc = A12751CCOkDsc ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModalI9620( )
   {
   }

   public void standaloneModalI9620( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtCCTLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
   }

   public void loadI9620( )
   {
      /* Using cursor T00I921 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4035CCVal = T00I921_A4035CCVal[0] ;
         A12750CCOkLin = T00I921_A12750CCOkLin[0] ;
         A12751CCOkDsc = T00I921_A12751CCOkDsc[0] ;
         zmI9620( -5) ;
      }
      pr_default.close(19);
      onLoadActionsI9620( ) ;
   }

   public void onLoadActionsI9620( )
   {
   }

   public void checkExtendedTableI9620( )
   {
      nIsDirty_620 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalI9620( ) ;
      /* Using cursor T00I94 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsI9620( )
   {
      pr_default.close(2);
   }

   public void enableDisableI9620( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         int A4031CCTCod ,
                         short A4034CCTLin )
   {
      /* Using cursor T00I922 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKeyI9620( )
   {
      /* Using cursor T00I923 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound620 = (short)(1) ;
      }
      else
      {
         RcdFound620 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKeyI9620( )
   {
      /* Using cursor T00I93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00I93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmI9620( 5) ;
         RcdFound620 = (short)(1) ;
         initializeNonKeyI9620( ) ;
         A4035CCVal = T00I93_A4035CCVal[0] ;
         A12750CCOkLin = T00I93_A12750CCOkLin[0] ;
         A12751CCOkDsc = T00I93_A12751CCOkDsc[0] ;
         A4034CCTLin = T00I93_A4034CCTLin[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalI9620( ) ;
         loadI9620( ) ;
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound620 = (short)(0) ;
         initializeNonKeyI9620( ) ;
         sMode620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalI9620( ) ;
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesI9620( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyI9620( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00I92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4035CCVal, T00I92_A4035CCVal[0]) != 0 ) || ( Z12750CCOkLin != T00I92_A12750CCOkLin[0] ) || ( GXutil.strcmp(Z12751CCOkDsc, T00I92_A12751CCOkDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4035CCVal, T00I92_A4035CCVal[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CCVal");
               GXutil.writeLogRaw("Old: ",Z4035CCVal);
               GXutil.writeLogRaw("Current: ",T00I92_A4035CCVal[0]);
            }
            if ( Z12750CCOkLin != T00I92_A12750CCOkLin[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CCOkLin");
               GXutil.writeLogRaw("Old: ",Z12750CCOkLin);
               GXutil.writeLogRaw("Current: ",T00I92_A12750CCOkLin[0]);
            }
            if ( GXutil.strcmp(Z12751CCOkDsc, T00I92_A12751CCOkDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tcc:[seudo value changed for attri]"+"CCOkDsc");
               GXutil.writeLogRaw("Old: ",Z12751CCOkDsc);
               GXutil.writeLogRaw("Current: ",T00I92_A12751CCOkDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertI9620( )
   {
      beforeValidateI9620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableI9620( ) ;
      }
      if ( AnyError == 0 )
      {
         zmI9620( 0) ;
         checkOptimisticConcurrencyI9620( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmI9620( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertI9620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00I924 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), A4035CCVal, Byte.valueOf(A12750CCOkLin), A12751CCOkDsc, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                  if ( (pr_default.getStatus(22) == 1) )
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
            loadI9620( ) ;
         }
         endLevelI9620( ) ;
      }
      closeExtendedTableCursorsI9620( ) ;
   }

   public void updateI9620( )
   {
      beforeValidateI9620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableI9620( ) ;
      }
      if ( ( nIsMod_620 != 0 ) || ( nIsDirty_620 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyI9620( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmI9620( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateI9620( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00I925 */
                     pr_default.execute(23, new Object[] {A4035CCVal, Byte.valueOf(A12750CCOkLin), A12751CCOkDsc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateI9620( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyI9620( ) ;
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
            endLevelI9620( ) ;
         }
      }
      closeExtendedTableCursorsI9620( ) ;
   }

   public void deferredUpdateI9620( )
   {
   }

   public void deleteI9620( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateI9620( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyI9620( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsI9620( ) ;
         afterConfirmI9620( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteI9620( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00I926 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
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
      sMode620 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelI9620( ) ;
      Gx_mode = sMode620 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsI9620( )
   {
      standaloneModalI9620( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelI9620( )
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

   public void scanStartI9620( )
   {
      /* Scan By routine */
      /* Using cursor T00I927 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      RcdFound620 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4034CCTLin = T00I927_A4034CCTLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextI9620( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound620 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4034CCTLin = T00I927_A4034CCTLin[0] ;
      }
   }

   public void scanEndI9620( )
   {
      pr_default.close(25);
   }

   public void afterConfirmI9620( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertI9620( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateI9620( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteI9620( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteI9620( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateI9620( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesI9620( )
   {
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtCCVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVal_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtCCOkLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtCCOkDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkDsc_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void send_integrity_lvl_hashesI9620( )
   {
   }

   public void send_integrity_lvl_hashesI9619( )
   {
   }

   public void subsflControlProps_95620( )
   {
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620_"+sGXsfl_95_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_95_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_95_idx ;
      edtCCOkLin_Internalname = "CCOKLIN_"+sGXsfl_95_idx ;
      edtCCOkDsc_Internalname = "CCOKDSC_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_95620( )
   {
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620_"+sGXsfl_95_fel_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_95_fel_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_95_fel_idx ;
      edtCCOkLin_Internalname = "CCOKLIN_"+sGXsfl_95_fel_idx ;
      edtCCOkDsc_Internalname = "CCOKDSC_"+sGXsfl_95_fel_idx ;
   }

   public void addRowI9620( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_95620( ) ;
      sendRowI9620( ) ;
   }

   public void sendRowI9620( )
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
         if ( ((int)((nGXsfl_95_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_620_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_620_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_620), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_620), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_620_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_620_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVal_Internalname,GXutil.rtrim( A4035CCVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCOkLin_Internalname,GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCCOkLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12750CCOkLin), "9") : localUtil.format( DecimalUtil.doubleToDec(A12750CCOkLin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCOkLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCOkLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCOkDsc_Internalname,A12751CCOkDsc,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCOkDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCOkDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesI9620( ) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4035CCVal_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4035CCVal));
      GXCCtl = "Z12750CCOkLin_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12751CCOkDsc_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z12751CCOkDsc);
      GXCCtl = "nRcdDeleted_620_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_620_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_620_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_620_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVAL_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOKLIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOKDSC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowI9620( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_95620( ) ;
      edtavnRcdDeleted_620_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_620_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVAL_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCOkLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKLIN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCOkDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKDSC_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_620");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_620_Internalname ;
         wbErr = true ;
         nRcdDeleted_620 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_620 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         wbErr = true ;
         A4034CCTLin = (short)(0) ;
      }
      else
      {
         A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4035CCVal = httpContext.cgiGet( edtCCVal_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCOkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCOkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "CCOKLIN_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCOkLin_Internalname ;
         wbErr = true ;
         A12750CCOkLin = (byte)(0) ;
      }
      else
      {
         A12750CCOkLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCOkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12751CCOkDsc = httpContext.cgiGet( edtCCOkDsc_Internalname) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_95_idx ;
      Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4035CCVal_" + sGXsfl_95_idx ;
      Z4035CCVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12750CCOkLin_" + sGXsfl_95_idx ;
      Z12750CCOkLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12751CCOkDsc_" + sGXsfl_95_idx ;
      Z12751CCOkDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_620_" + sGXsfl_95_idx ;
      nRcdDeleted_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_620_" + sGXsfl_95_idx ;
      nRcdExists_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_620_" + sGXsfl_95_idx ;
      nIsMod_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCCTLin_Enabled = edtCCTLin_Enabled ;
   }

   public void confirmValuesI90( )
   {
      nGXsfl_95_idx = 0 ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_95620( ) ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_95620( ) ;
         httpContext.changePostValue( "Z4034CCTLin_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z4034CCTLin_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z4035CCVal_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z4035CCVal_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z12750CCOkLin_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12750CCOkLin_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z12751CCOkDsc_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_95_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.tcc", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.dtoc( Z4033CCFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4405CcDisp", GXutil.rtrim( Z4405CcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3281CcObs", Z3281CcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11472CCOk", GXutil.ltrim( localUtil.ntoc( Z11472CCOk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11473CCOkFch", localUtil.ttoc( Z11473CCOkFch, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11474CCOkUsu", GXutil.rtrim( Z11474CCOkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nGXsfl_95_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.controlcalidadhtd.tcc", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.TCC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control de Calidad", "") ;
   }

   public void initializeNonKeyI9619( )
   {
      A4032CCOpeCod = 0 ;
      n4032CCOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
      A4033CCFch = GXutil.nullDate() ;
      n4033CCFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      A4405CcDisp = "" ;
      n4405CcDisp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
      A3281CcObs = "" ;
      n3281CcObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
      A11472CCOk = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11472CCOk", GXutil.str( A11472CCOk, 1, 0));
      A11473CCOkFch = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11473CCOkFch", localUtil.ttoc( A11473CCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11474CCOkUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11474CCOkUsu", A11474CCOkUsu);
      Z4032CCOpeCod = 0 ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
      Z11472CCOk = (byte)(0) ;
      Z11473CCOkFch = GXutil.resetTime( GXutil.nullDate() );
      Z11474CCOkUsu = "" ;
   }

   public void initAllI9619( )
   {
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A194BarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      initializeNonKeyI9619( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyI9620( )
   {
      A4035CCVal = "" ;
      A12750CCOkLin = (byte)(0) ;
      A12751CCOkDsc = "" ;
      Z4035CCVal = "" ;
      Z12750CCOkLin = (byte)(0) ;
      Z12751CCOkDsc = "" ;
   }

   public void initAllI9620( )
   {
      A4034CCTLin = (short)(0) ;
      initializeNonKeyI9620( ) ;
   }

   public void standaloneModalInsertI9620( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241514943", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/tcc.js", "?20268241514943", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties620( )
   {
      edtCCTLin_Enabled = defedtCCTLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void startgridcontrol95( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4035CCVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A12751CCOkDsc);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCCOpeCod_Internalname = "CCOPECOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCCFch_Internalname = "CCFCH" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCcDisp_Internalname = "CCDISP" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCcObs_Internalname = "CCOBS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtCCOk_Internalname = "CCOK" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtCCOkFch_Internalname = "CCOKFCH" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtCCOkUsu_Internalname = "CCOKUSU" ;
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCVal_Internalname = "CCVAL" ;
      edtCCOkLin_Internalname = "CCOKLIN" ;
      edtCCOkDsc_Internalname = "CCOKDSC" ;
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
      Form.setCaption( httpContext.getMessage( "Control de Calidad", "") );
      edtCCOkDsc_Jsonclick = "" ;
      edtCCOkLin_Jsonclick = "" ;
      edtCCVal_Jsonclick = "" ;
      edtCCTLin_Jsonclick = "" ;
      edtavnRcdDeleted_620_Jsonclick = "" ;
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
      edtCCOkDsc_Enabled = 1 ;
      edtCCOkLin_Enabled = 1 ;
      edtCCVal_Enabled = 1 ;
      edtCCTLin_Enabled = 1 ;
      edtavnRcdDeleted_620_Enabled = 1 ;
      edtCCOkUsu_Jsonclick = "" ;
      edtCCOkUsu_Backcolor = (int)(0xFFFFFF) ;
      edtCCOkUsu_Enabled = 1 ;
      edtCCOkFch_Jsonclick = "" ;
      edtCCOkFch_Backcolor = (int)(0xFFFFFF) ;
      edtCCOkFch_Enabled = 1 ;
      edtCCOk_Jsonclick = "" ;
      edtCCOk_Backcolor = (int)(0xFFFFFF) ;
      edtCCOk_Enabled = 1 ;
      edtCcObs_Backcolor = (int)(0xFFFFFF) ;
      edtCcObs_Enabled = 1 ;
      edtCcDisp_Jsonclick = "" ;
      edtCcDisp_Backcolor = (int)(0xFFFFFF) ;
      edtCcDisp_Enabled = 1 ;
      edtCCFch_Jsonclick = "" ;
      edtCCFch_Backcolor = (int)(0xFFFFFF) ;
      edtCCFch_Enabled = 1 ;
      edtCCOpeCod_Jsonclick = "" ;
      edtCCOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCOpeCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCTCod_Enabled = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 1 ;
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
      subsflControlProps_95620( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalI9620( ) ;
         standaloneModalI9620( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowI9620( ) ;
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_95620( ) ;
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
      /* Using cursor T00I928 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00I928_A407EmprNom[0] ;
      n407EmprNom = T00I928_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      /* Using cursor T00I929 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(27);
      /* Using cursor T00I930 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(28);
      GX_FocusControl = edtCCOpeCod_Internalname ;
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
      /* Using cursor T00I929 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Cctcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00I930 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
      }
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", GXutil.rtrim( A4405CcDisp));
      httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
      httpContext.ajax_rsp_assign_attri("", false, "A11472CCOk", GXutil.ltrim( localUtil.ntoc( A11472CCOk, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11473CCOkFch", localUtil.ttoc( A11473CCOkFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11474CCOkUsu", GXutil.rtrim( A11474CCOkUsu));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.format(Z4033CCFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4405CcDisp", GXutil.rtrim( Z4405CcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3281CcObs", Z3281CcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11472CCOk", GXutil.ltrim( localUtil.ntoc( Z11472CCOk, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11473CCOkFch", localUtil.ttoc( Z11473CCOkFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11474CCOkUsu", GXutil.rtrim( Z11474CCOkUsu));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cctlin( )
   {
      /* Using cursor T00I931 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
      }
      pr_default.close(29);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
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
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A4405CcDisp',fld:'CCDISP',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'A11472CCOk',fld:'CCOK',pic:'9'},{av:'A11473CCOkFch',fld:'CCOKFCH',pic:'99/99/99 99:99'},{av:'A11474CCOkUsu',fld:'CCOKUSU',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z4031CCTCod'},{av:'Z407EmprNom'},{av:'Z4032CCOpeCod'},{av:'Z4033CCFch'},{av:'Z4405CcDisp'},{av:'Z3281CcObs'},{av:'Z11472CCOk'},{av:'Z11473CCOkFch'},{av:'Z11474CCOkUsu'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ccokdsc',iparms:[]");
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
      pr_default.close(29);
      pr_default.close(27);
      pr_default.close(26);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
      Z11473CCOkFch = GXutil.resetTime( GXutil.nullDate() );
      Z11474CCOkUsu = "" ;
      Z4035CCVal = "" ;
      Z12751CCOkDsc = "" ;
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
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A4033CCFch = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A4405CcDisp = "" ;
      lblTextblock12_Jsonclick = "" ;
      A3281CcObs = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A11473CCOkFch = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock15_Jsonclick = "" ;
      A11474CCOkUsu = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode620 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode619 = "" ;
      GXCCtl = "" ;
      A4035CCVal = "" ;
      A12751CCOkDsc = "" ;
      AV29Station = "" ;
      GXv_char1 = new String[1] ;
      AV30Emprnom = "" ;
      GXv_char2 = new String[1] ;
      AV8UsurCod = "" ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      T00I97_A407EmprNom = new String[] {""} ;
      T00I97_n407EmprNom = new boolean[] {false} ;
      T00I910_A407EmprNom = new String[] {""} ;
      T00I910_n407EmprNom = new boolean[] {false} ;
      T00I910_A4032CCOpeCod = new int[1] ;
      T00I910_n4032CCOpeCod = new boolean[] {false} ;
      T00I910_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00I910_n4033CCFch = new boolean[] {false} ;
      T00I910_A4405CcDisp = new String[] {""} ;
      T00I910_n4405CcDisp = new boolean[] {false} ;
      T00I910_A3281CcObs = new String[] {""} ;
      T00I910_n3281CcObs = new boolean[] {false} ;
      T00I910_A11472CCOk = new byte[1] ;
      T00I910_A11473CCOkFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00I910_A11474CCOkUsu = new String[] {""} ;
      T00I910_A396EmprCod = new String[] {""} ;
      T00I910_A129BarCod = new int[1] ;
      T00I910_A132BarCodReo = new byte[1] ;
      T00I910_A130BarCodPar = new String[] {""} ;
      T00I910_A758ProCod = new String[] {""} ;
      T00I910_A194BarOrdLin = new short[1] ;
      T00I910_A4031CCTCod = new int[1] ;
      T00I98_A396EmprCod = new String[] {""} ;
      T00I99_A396EmprCod = new String[] {""} ;
      T00I911_A396EmprCod = new String[] {""} ;
      T00I912_A396EmprCod = new String[] {""} ;
      T00I913_A396EmprCod = new String[] {""} ;
      T00I913_A129BarCod = new int[1] ;
      T00I913_A132BarCodReo = new byte[1] ;
      T00I913_A130BarCodPar = new String[] {""} ;
      T00I913_A758ProCod = new String[] {""} ;
      T00I913_A194BarOrdLin = new short[1] ;
      T00I913_A4031CCTCod = new int[1] ;
      T00I96_A4032CCOpeCod = new int[1] ;
      T00I96_n4032CCOpeCod = new boolean[] {false} ;
      T00I96_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00I96_n4033CCFch = new boolean[] {false} ;
      T00I96_A4405CcDisp = new String[] {""} ;
      T00I96_n4405CcDisp = new boolean[] {false} ;
      T00I96_A3281CcObs = new String[] {""} ;
      T00I96_n3281CcObs = new boolean[] {false} ;
      T00I96_A11472CCOk = new byte[1] ;
      T00I96_A11473CCOkFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00I96_A11474CCOkUsu = new String[] {""} ;
      T00I96_A396EmprCod = new String[] {""} ;
      T00I96_A129BarCod = new int[1] ;
      T00I96_A132BarCodReo = new byte[1] ;
      T00I96_A130BarCodPar = new String[] {""} ;
      T00I96_A758ProCod = new String[] {""} ;
      T00I96_A194BarOrdLin = new short[1] ;
      T00I96_A4031CCTCod = new int[1] ;
      T00I914_A396EmprCod = new String[] {""} ;
      T00I914_A129BarCod = new int[1] ;
      T00I914_A132BarCodReo = new byte[1] ;
      T00I914_A130BarCodPar = new String[] {""} ;
      T00I914_A758ProCod = new String[] {""} ;
      T00I914_A194BarOrdLin = new short[1] ;
      T00I914_A4031CCTCod = new int[1] ;
      T00I915_A396EmprCod = new String[] {""} ;
      T00I915_A129BarCod = new int[1] ;
      T00I915_A132BarCodReo = new byte[1] ;
      T00I915_A130BarCodPar = new String[] {""} ;
      T00I915_A758ProCod = new String[] {""} ;
      T00I915_A194BarOrdLin = new short[1] ;
      T00I915_A4031CCTCod = new int[1] ;
      T00I95_A4032CCOpeCod = new int[1] ;
      T00I95_n4032CCOpeCod = new boolean[] {false} ;
      T00I95_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00I95_n4033CCFch = new boolean[] {false} ;
      T00I95_A4405CcDisp = new String[] {""} ;
      T00I95_n4405CcDisp = new boolean[] {false} ;
      T00I95_A3281CcObs = new String[] {""} ;
      T00I95_n3281CcObs = new boolean[] {false} ;
      T00I95_A11472CCOk = new byte[1] ;
      T00I95_A11473CCOkFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00I95_A11474CCOkUsu = new String[] {""} ;
      T00I95_A396EmprCod = new String[] {""} ;
      T00I95_A129BarCod = new int[1] ;
      T00I95_A132BarCodReo = new byte[1] ;
      T00I95_A130BarCodPar = new String[] {""} ;
      T00I95_A758ProCod = new String[] {""} ;
      T00I95_A194BarOrdLin = new short[1] ;
      T00I95_A4031CCTCod = new int[1] ;
      T00I919_A396EmprCod = new String[] {""} ;
      T00I919_A129BarCod = new int[1] ;
      T00I919_A132BarCodReo = new byte[1] ;
      T00I919_A130BarCodPar = new String[] {""} ;
      T00I919_A758ProCod = new String[] {""} ;
      T00I919_A194BarOrdLin = new short[1] ;
      T00I919_A4031CCTCod = new int[1] ;
      T00I919_A11294CcLn = new short[1] ;
      T00I920_A396EmprCod = new String[] {""} ;
      T00I920_A129BarCod = new int[1] ;
      T00I920_A132BarCodReo = new byte[1] ;
      T00I920_A130BarCodPar = new String[] {""} ;
      T00I920_A758ProCod = new String[] {""} ;
      T00I920_A194BarOrdLin = new short[1] ;
      T00I920_A4031CCTCod = new int[1] ;
      T00I921_A129BarCod = new int[1] ;
      T00I921_A132BarCodReo = new byte[1] ;
      T00I921_A130BarCodPar = new String[] {""} ;
      T00I921_A194BarOrdLin = new short[1] ;
      T00I921_A4035CCVal = new String[] {""} ;
      T00I921_A12750CCOkLin = new byte[1] ;
      T00I921_A12751CCOkDsc = new String[] {""} ;
      T00I921_A396EmprCod = new String[] {""} ;
      T00I921_A4031CCTCod = new int[1] ;
      T00I921_A4034CCTLin = new short[1] ;
      T00I921_A758ProCod = new String[] {""} ;
      T00I94_A396EmprCod = new String[] {""} ;
      T00I922_A396EmprCod = new String[] {""} ;
      T00I923_A396EmprCod = new String[] {""} ;
      T00I923_A129BarCod = new int[1] ;
      T00I923_A132BarCodReo = new byte[1] ;
      T00I923_A130BarCodPar = new String[] {""} ;
      T00I923_A758ProCod = new String[] {""} ;
      T00I923_A194BarOrdLin = new short[1] ;
      T00I923_A4031CCTCod = new int[1] ;
      T00I923_A4034CCTLin = new short[1] ;
      T00I93_A129BarCod = new int[1] ;
      T00I93_A132BarCodReo = new byte[1] ;
      T00I93_A130BarCodPar = new String[] {""} ;
      T00I93_A194BarOrdLin = new short[1] ;
      T00I93_A4035CCVal = new String[] {""} ;
      T00I93_A12750CCOkLin = new byte[1] ;
      T00I93_A12751CCOkDsc = new String[] {""} ;
      T00I93_A396EmprCod = new String[] {""} ;
      T00I93_A4031CCTCod = new int[1] ;
      T00I93_A4034CCTLin = new short[1] ;
      T00I93_A758ProCod = new String[] {""} ;
      T00I92_A129BarCod = new int[1] ;
      T00I92_A132BarCodReo = new byte[1] ;
      T00I92_A130BarCodPar = new String[] {""} ;
      T00I92_A194BarOrdLin = new short[1] ;
      T00I92_A4035CCVal = new String[] {""} ;
      T00I92_A12750CCOkLin = new byte[1] ;
      T00I92_A12751CCOkDsc = new String[] {""} ;
      T00I92_A396EmprCod = new String[] {""} ;
      T00I92_A4031CCTCod = new int[1] ;
      T00I92_A4034CCTLin = new short[1] ;
      T00I92_A758ProCod = new String[] {""} ;
      T00I927_A396EmprCod = new String[] {""} ;
      T00I927_A129BarCod = new int[1] ;
      T00I927_A132BarCodReo = new byte[1] ;
      T00I927_A130BarCodPar = new String[] {""} ;
      T00I927_A758ProCod = new String[] {""} ;
      T00I927_A194BarOrdLin = new short[1] ;
      T00I927_A4031CCTCod = new int[1] ;
      T00I927_A4034CCTLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00I928_A407EmprNom = new String[] {""} ;
      T00I928_n407EmprNom = new boolean[] {false} ;
      T00I929_A396EmprCod = new String[] {""} ;
      T00I930_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4033CCFch = GXutil.nullDate() ;
      ZZ4405CcDisp = "" ;
      ZZ3281CcObs = "" ;
      ZZ11473CCOkFch = GXutil.resetTime( GXutil.nullDate() );
      ZZ11474CCOkUsu = "" ;
      T00I931_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tcc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tcc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tcc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tcc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tcc__default(),
         new Object[] {
             new Object[] {
            T00I92_A129BarCod, T00I92_A132BarCodReo, T00I92_A130BarCodPar, T00I92_A194BarOrdLin, T00I92_A4035CCVal, T00I92_A12750CCOkLin, T00I92_A12751CCOkDsc, T00I92_A396EmprCod, T00I92_A4031CCTCod, T00I92_A4034CCTLin,
            T00I92_A758ProCod
            }
            , new Object[] {
            T00I93_A129BarCod, T00I93_A132BarCodReo, T00I93_A130BarCodPar, T00I93_A194BarOrdLin, T00I93_A4035CCVal, T00I93_A12750CCOkLin, T00I93_A12751CCOkDsc, T00I93_A396EmprCod, T00I93_A4031CCTCod, T00I93_A4034CCTLin,
            T00I93_A758ProCod
            }
            , new Object[] {
            T00I94_A396EmprCod
            }
            , new Object[] {
            T00I95_A4032CCOpeCod, T00I95_n4032CCOpeCod, T00I95_A4033CCFch, T00I95_n4033CCFch, T00I95_A4405CcDisp, T00I95_n4405CcDisp, T00I95_A3281CcObs, T00I95_n3281CcObs, T00I95_A11472CCOk, T00I95_A11473CCOkFch,
            T00I95_A11474CCOkUsu, T00I95_A396EmprCod, T00I95_A129BarCod, T00I95_A132BarCodReo, T00I95_A130BarCodPar, T00I95_A758ProCod, T00I95_A194BarOrdLin, T00I95_A4031CCTCod
            }
            , new Object[] {
            T00I96_A4032CCOpeCod, T00I96_n4032CCOpeCod, T00I96_A4033CCFch, T00I96_n4033CCFch, T00I96_A4405CcDisp, T00I96_n4405CcDisp, T00I96_A3281CcObs, T00I96_n3281CcObs, T00I96_A11472CCOk, T00I96_A11473CCOkFch,
            T00I96_A11474CCOkUsu, T00I96_A396EmprCod, T00I96_A129BarCod, T00I96_A132BarCodReo, T00I96_A130BarCodPar, T00I96_A758ProCod, T00I96_A194BarOrdLin, T00I96_A4031CCTCod
            }
            , new Object[] {
            T00I97_A407EmprNom, T00I97_n407EmprNom
            }
            , new Object[] {
            T00I98_A396EmprCod
            }
            , new Object[] {
            T00I99_A396EmprCod
            }
            , new Object[] {
            T00I910_A407EmprNom, T00I910_n407EmprNom, T00I910_A4032CCOpeCod, T00I910_n4032CCOpeCod, T00I910_A4033CCFch, T00I910_n4033CCFch, T00I910_A4405CcDisp, T00I910_n4405CcDisp, T00I910_A3281CcObs, T00I910_n3281CcObs,
            T00I910_A11472CCOk, T00I910_A11473CCOkFch, T00I910_A11474CCOkUsu, T00I910_A396EmprCod, T00I910_A129BarCod, T00I910_A132BarCodReo, T00I910_A130BarCodPar, T00I910_A758ProCod, T00I910_A194BarOrdLin, T00I910_A4031CCTCod
            }
            , new Object[] {
            T00I911_A396EmprCod
            }
            , new Object[] {
            T00I912_A396EmprCod
            }
            , new Object[] {
            T00I913_A396EmprCod, T00I913_A129BarCod, T00I913_A132BarCodReo, T00I913_A130BarCodPar, T00I913_A758ProCod, T00I913_A194BarOrdLin, T00I913_A4031CCTCod
            }
            , new Object[] {
            T00I914_A396EmprCod, T00I914_A129BarCod, T00I914_A132BarCodReo, T00I914_A130BarCodPar, T00I914_A758ProCod, T00I914_A194BarOrdLin, T00I914_A4031CCTCod
            }
            , new Object[] {
            T00I915_A396EmprCod, T00I915_A129BarCod, T00I915_A132BarCodReo, T00I915_A130BarCodPar, T00I915_A758ProCod, T00I915_A194BarOrdLin, T00I915_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00I919_A396EmprCod, T00I919_A129BarCod, T00I919_A132BarCodReo, T00I919_A130BarCodPar, T00I919_A758ProCod, T00I919_A194BarOrdLin, T00I919_A4031CCTCod, T00I919_A11294CcLn
            }
            , new Object[] {
            T00I920_A396EmprCod, T00I920_A129BarCod, T00I920_A132BarCodReo, T00I920_A130BarCodPar, T00I920_A758ProCod, T00I920_A194BarOrdLin, T00I920_A4031CCTCod
            }
            , new Object[] {
            T00I921_A129BarCod, T00I921_A132BarCodReo, T00I921_A130BarCodPar, T00I921_A194BarOrdLin, T00I921_A4035CCVal, T00I921_A12750CCOkLin, T00I921_A12751CCOkDsc, T00I921_A396EmprCod, T00I921_A4031CCTCod, T00I921_A4034CCTLin,
            T00I921_A758ProCod
            }
            , new Object[] {
            T00I922_A396EmprCod
            }
            , new Object[] {
            T00I923_A396EmprCod, T00I923_A129BarCod, T00I923_A132BarCodReo, T00I923_A130BarCodPar, T00I923_A758ProCod, T00I923_A194BarOrdLin, T00I923_A4031CCTCod, T00I923_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00I927_A396EmprCod, T00I927_A129BarCod, T00I927_A132BarCodReo, T00I927_A130BarCodPar, T00I927_A758ProCod, T00I927_A194BarOrdLin, T00I927_A4031CCTCod, T00I927_A4034CCTLin
            }
            , new Object[] {
            T00I928_A407EmprNom, T00I928_n407EmprNom
            }
            , new Object[] {
            T00I929_A396EmprCod
            }
            , new Object[] {
            T00I930_A396EmprCod
            }
            , new Object[] {
            T00I931_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z132BarCodReo ;
   private byte Z11472CCOk ;
   private byte Z12750CCOkLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A11472CCOk ;
   private byte A12750CCOkLin ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ11472CCOk ;
   private short Z194BarOrdLin ;
   private short Z4034CCTLin ;
   private short nRcdDeleted_620 ;
   private short nRcdExists_620 ;
   private short nIsMod_620 ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount620 ;
   private short RcdFound620 ;
   private short nBlankRcdUsr620 ;
   private short RcdFound619 ;
   private short nIsDirty_619 ;
   private short nIsDirty_620 ;
   private short ZZ194BarOrdLin ;
   private int Z129BarCod ;
   private int Z4031CCTCod ;
   private int Z4032CCOpeCod ;
   private int nRC_GXsfl_95 ;
   private int nGXsfl_95_idx=1 ;
   private int A129BarCod ;
   private int A4031CCTCod ;
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
   private int edtBarOrdLin_Enabled ;
   private int edtCCTCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A4032CCOpeCod ;
   private int edtCCOpeCod_Enabled ;
   private int edtCCFch_Enabled ;
   private int edtCcDisp_Enabled ;
   private int edtCcObs_Enabled ;
   private int edtCCOk_Enabled ;
   private int edtCCOkFch_Enabled ;
   private int edtCCOkUsu_Enabled ;
   private int edtavnRcdDeleted_620_Enabled ;
   private int edtCCTLin_Enabled ;
   private int edtCCVal_Enabled ;
   private int edtCCOkLin_Enabled ;
   private int edtCCOkDsc_Enabled ;
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
   private int defedtCCTLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCCOkUsu_Backcolor ;
   private int edtCCOkFch_Backcolor ;
   private int edtCCOk_Backcolor ;
   private int edtCcObs_Backcolor ;
   private int edtCcDisp_Backcolor ;
   private int edtCCFch_Backcolor ;
   private int edtCCOpeCod_Backcolor ;
   private int edtCCTCod_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4031CCTCod ;
   private int ZZ4032CCOpeCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z4405CcDisp ;
   private String Z11474CCOkUsu ;
   private String Z4035CCVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
   private String sGXsfl_95_idx="0001" ;
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
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCCOpeCod_Internalname ;
   private String edtCCOpeCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCCFch_Internalname ;
   private String edtCCFch_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCcDisp_Internalname ;
   private String A4405CcDisp ;
   private String edtCcDisp_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCcObs_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtCCOk_Internalname ;
   private String edtCCOk_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtCCOkFch_Internalname ;
   private String edtCCOkFch_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtCCOkUsu_Internalname ;
   private String A11474CCOkUsu ;
   private String edtCCOkUsu_Jsonclick ;
   private String sMode620 ;
   private String edtavnRcdDeleted_620_Internalname ;
   private String edtCCTLin_Internalname ;
   private String edtCCVal_Internalname ;
   private String edtCCOkLin_Internalname ;
   private String edtCCOkDsc_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode619 ;
   private String GXCCtl ;
   private String A4035CCVal ;
   private String AV29Station ;
   private String GXv_char1[] ;
   private String AV30Emprnom ;
   private String GXv_char2[] ;
   private String AV8UsurCod ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_620_Jsonclick ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCVal_Jsonclick ;
   private String edtCCOkLin_Jsonclick ;
   private String edtCCOkDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ4405CcDisp ;
   private String ZZ11474CCOkUsu ;
   private java.util.Date Z11473CCOkFch ;
   private java.util.Date A11473CCOkFch ;
   private java.util.Date ZZ11473CCOkFch ;
   private java.util.Date Z4033CCFch ;
   private java.util.Date A4033CCFch ;
   private java.util.Date ZZ4033CCFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4032CCOpeCod ;
   private boolean n4033CCFch ;
   private boolean n4405CcDisp ;
   private boolean n3281CcObs ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z3281CcObs ;
   private String Z12751CCOkDsc ;
   private String A3281CcObs ;
   private String A12751CCOkDsc ;
   private String ZZ3281CcObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00I97_A407EmprNom ;
   private boolean[] T00I97_n407EmprNom ;
   private String[] T00I910_A407EmprNom ;
   private boolean[] T00I910_n407EmprNom ;
   private int[] T00I910_A4032CCOpeCod ;
   private boolean[] T00I910_n4032CCOpeCod ;
   private java.util.Date[] T00I910_A4033CCFch ;
   private boolean[] T00I910_n4033CCFch ;
   private String[] T00I910_A4405CcDisp ;
   private boolean[] T00I910_n4405CcDisp ;
   private String[] T00I910_A3281CcObs ;
   private boolean[] T00I910_n3281CcObs ;
   private byte[] T00I910_A11472CCOk ;
   private java.util.Date[] T00I910_A11473CCOkFch ;
   private String[] T00I910_A11474CCOkUsu ;
   private String[] T00I910_A396EmprCod ;
   private int[] T00I910_A129BarCod ;
   private byte[] T00I910_A132BarCodReo ;
   private String[] T00I910_A130BarCodPar ;
   private String[] T00I910_A758ProCod ;
   private short[] T00I910_A194BarOrdLin ;
   private int[] T00I910_A4031CCTCod ;
   private String[] T00I98_A396EmprCod ;
   private String[] T00I99_A396EmprCod ;
   private String[] T00I911_A396EmprCod ;
   private String[] T00I912_A396EmprCod ;
   private String[] T00I913_A396EmprCod ;
   private int[] T00I913_A129BarCod ;
   private byte[] T00I913_A132BarCodReo ;
   private String[] T00I913_A130BarCodPar ;
   private String[] T00I913_A758ProCod ;
   private short[] T00I913_A194BarOrdLin ;
   private int[] T00I913_A4031CCTCod ;
   private int[] T00I96_A4032CCOpeCod ;
   private boolean[] T00I96_n4032CCOpeCod ;
   private java.util.Date[] T00I96_A4033CCFch ;
   private boolean[] T00I96_n4033CCFch ;
   private String[] T00I96_A4405CcDisp ;
   private boolean[] T00I96_n4405CcDisp ;
   private String[] T00I96_A3281CcObs ;
   private boolean[] T00I96_n3281CcObs ;
   private byte[] T00I96_A11472CCOk ;
   private java.util.Date[] T00I96_A11473CCOkFch ;
   private String[] T00I96_A11474CCOkUsu ;
   private String[] T00I96_A396EmprCod ;
   private int[] T00I96_A129BarCod ;
   private byte[] T00I96_A132BarCodReo ;
   private String[] T00I96_A130BarCodPar ;
   private String[] T00I96_A758ProCod ;
   private short[] T00I96_A194BarOrdLin ;
   private int[] T00I96_A4031CCTCod ;
   private String[] T00I914_A396EmprCod ;
   private int[] T00I914_A129BarCod ;
   private byte[] T00I914_A132BarCodReo ;
   private String[] T00I914_A130BarCodPar ;
   private String[] T00I914_A758ProCod ;
   private short[] T00I914_A194BarOrdLin ;
   private int[] T00I914_A4031CCTCod ;
   private String[] T00I915_A396EmprCod ;
   private int[] T00I915_A129BarCod ;
   private byte[] T00I915_A132BarCodReo ;
   private String[] T00I915_A130BarCodPar ;
   private String[] T00I915_A758ProCod ;
   private short[] T00I915_A194BarOrdLin ;
   private int[] T00I915_A4031CCTCod ;
   private int[] T00I95_A4032CCOpeCod ;
   private boolean[] T00I95_n4032CCOpeCod ;
   private java.util.Date[] T00I95_A4033CCFch ;
   private boolean[] T00I95_n4033CCFch ;
   private String[] T00I95_A4405CcDisp ;
   private boolean[] T00I95_n4405CcDisp ;
   private String[] T00I95_A3281CcObs ;
   private boolean[] T00I95_n3281CcObs ;
   private byte[] T00I95_A11472CCOk ;
   private java.util.Date[] T00I95_A11473CCOkFch ;
   private String[] T00I95_A11474CCOkUsu ;
   private String[] T00I95_A396EmprCod ;
   private int[] T00I95_A129BarCod ;
   private byte[] T00I95_A132BarCodReo ;
   private String[] T00I95_A130BarCodPar ;
   private String[] T00I95_A758ProCod ;
   private short[] T00I95_A194BarOrdLin ;
   private int[] T00I95_A4031CCTCod ;
   private String[] T00I919_A396EmprCod ;
   private int[] T00I919_A129BarCod ;
   private byte[] T00I919_A132BarCodReo ;
   private String[] T00I919_A130BarCodPar ;
   private String[] T00I919_A758ProCod ;
   private short[] T00I919_A194BarOrdLin ;
   private int[] T00I919_A4031CCTCod ;
   private short[] T00I919_A11294CcLn ;
   private String[] T00I920_A396EmprCod ;
   private int[] T00I920_A129BarCod ;
   private byte[] T00I920_A132BarCodReo ;
   private String[] T00I920_A130BarCodPar ;
   private String[] T00I920_A758ProCod ;
   private short[] T00I920_A194BarOrdLin ;
   private int[] T00I920_A4031CCTCod ;
   private int[] T00I921_A129BarCod ;
   private byte[] T00I921_A132BarCodReo ;
   private String[] T00I921_A130BarCodPar ;
   private short[] T00I921_A194BarOrdLin ;
   private String[] T00I921_A4035CCVal ;
   private byte[] T00I921_A12750CCOkLin ;
   private String[] T00I921_A12751CCOkDsc ;
   private String[] T00I921_A396EmprCod ;
   private int[] T00I921_A4031CCTCod ;
   private short[] T00I921_A4034CCTLin ;
   private String[] T00I921_A758ProCod ;
   private String[] T00I94_A396EmprCod ;
   private String[] T00I922_A396EmprCod ;
   private String[] T00I923_A396EmprCod ;
   private int[] T00I923_A129BarCod ;
   private byte[] T00I923_A132BarCodReo ;
   private String[] T00I923_A130BarCodPar ;
   private String[] T00I923_A758ProCod ;
   private short[] T00I923_A194BarOrdLin ;
   private int[] T00I923_A4031CCTCod ;
   private short[] T00I923_A4034CCTLin ;
   private int[] T00I93_A129BarCod ;
   private byte[] T00I93_A132BarCodReo ;
   private String[] T00I93_A130BarCodPar ;
   private short[] T00I93_A194BarOrdLin ;
   private String[] T00I93_A4035CCVal ;
   private byte[] T00I93_A12750CCOkLin ;
   private String[] T00I93_A12751CCOkDsc ;
   private String[] T00I93_A396EmprCod ;
   private int[] T00I93_A4031CCTCod ;
   private short[] T00I93_A4034CCTLin ;
   private String[] T00I93_A758ProCod ;
   private int[] T00I92_A129BarCod ;
   private byte[] T00I92_A132BarCodReo ;
   private String[] T00I92_A130BarCodPar ;
   private short[] T00I92_A194BarOrdLin ;
   private String[] T00I92_A4035CCVal ;
   private byte[] T00I92_A12750CCOkLin ;
   private String[] T00I92_A12751CCOkDsc ;
   private String[] T00I92_A396EmprCod ;
   private int[] T00I92_A4031CCTCod ;
   private short[] T00I92_A4034CCTLin ;
   private String[] T00I92_A758ProCod ;
   private String[] T00I927_A396EmprCod ;
   private int[] T00I927_A129BarCod ;
   private byte[] T00I927_A132BarCodReo ;
   private String[] T00I927_A130BarCodPar ;
   private String[] T00I927_A758ProCod ;
   private short[] T00I927_A194BarOrdLin ;
   private int[] T00I927_A4031CCTCod ;
   private short[] T00I927_A4034CCTLin ;
   private String[] T00I928_A407EmprNom ;
   private boolean[] T00I928_n407EmprNom ;
   private String[] T00I929_A396EmprCod ;
   private String[] T00I930_A396EmprCod ;
   private String[] T00I931_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00I92", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCVal, CCOkLin, CCOkDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I93", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I94", "SELECT EmprCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I95", "SELECT CCOpeCod, CCFch, CcDisp, CcObs, CCOk, CCOkFch, CCOkUsu, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?  FOR UPDATE OF CCOpeCod, CCFch, CcDisp, CcObs, CCOk, CCOkFch, CCOkUsu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I96", "SELECT CCOpeCod, CCFch, CcDisp, CcObs, CCOk, CCOkFch, CCOkUsu, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I97", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I98", "SELECT EmprCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I99", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I910", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, TM1.CCOpeCod, TM1.CCFch, TM1.CcDisp, TM1.CcObs, TM1.CCOk, TM1.CCOkFch, TM1.CCOkUsu, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod FROM (TXPCC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.CCTCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I911", "SELECT EmprCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I912", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I913", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I914", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and ProCod > ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarOrdLin > ? or BarOrdLin = ? and ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and CCTCod > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00I915", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and ProCod < ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarOrdLin < ? or BarOrdLin = ? and ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and CCTCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00I916", "INSERT INTO TXPCC(CCOpeCod, CCFch, CcDisp, CcObs, CCOk, CCOkFch, CCOkUsu, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCFchUti, CcUltn, CCobs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ')", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T00I917", "UPDATE TXPCC SET CCOpeCod=?, CCFch=?, CcDisp=?, CcObs=?, CCOk=?, CCOkFch=?, CCOkUsu=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T00I918", "DELETE FROM TXPCC  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new ForEachCursor("T00I919", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00I920", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I921", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I922", "SELECT EmprCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I923", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00I924", "INSERT INTO TXPCC1(BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, EmprCod, CCTCod, CCTLin, ProCod, CCMetodo, CCEspecif, CCEspecif2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ')", GX_NOMASK, "TXPCC1")
         ,new UpdateCursor("T00I925", "UPDATE TXPCC1 SET CCVal=?, CCOkLin=?, CCOkDsc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCC1")
         ,new UpdateCursor("T00I926", "DELETE FROM TXPCC1  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCC1")
         ,new ForEachCursor("T00I927", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I928", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I929", "SELECT EmprCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I930", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00I931", "SELECT EmprCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 10);
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((String[]) buf[15])[0] = rslt.getString(12, 8);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 10);
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((String[]) buf[15])[0] = rslt.getString(12, 8);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 12 :
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
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 29 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 3);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
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
                  stmt.setVarchar(4, (String)parms[7], 400);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               stmt.setDateTime(6, (java.util.Date)parms[9], false);
               stmt.setString(7, (String)parms[10], 10);
               stmt.setString(8, (String)parms[11], 3);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setString(11, (String)parms[14], 1);
               stmt.setString(12, (String)parms[15], 8);
               stmt.setShort(13, ((Number) parms[16]).shortValue());
               stmt.setInt(14, ((Number) parms[17]).intValue());
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
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
                  stmt.setVarchar(4, (String)parms[7], 400);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               stmt.setDateTime(6, (java.util.Date)parms[9], false);
               stmt.setString(7, (String)parms[10], 10);
               stmt.setString(8, (String)parms[11], 3);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setString(11, (String)parms[14], 1);
               stmt.setString(12, (String)parms[15], 8);
               stmt.setShort(13, ((Number) parms[16]).shortValue());
               stmt.setInt(14, ((Number) parms[17]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 40);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 200, false);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 8);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setVarchar(3, (String)parms[2], 200, false);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

