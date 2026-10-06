package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tccn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "N Controles Calidad", ""), (short)(0)) ;
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
      nRC_GXsfl_85 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_85"))) ;
      nGXsfl_85_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_85_idx"))) ;
      sGXsfl_85_idx = httpContext.GetPar( "sGXsfl_85_idx") ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_97 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_97"))) ;
      nGXsfl_97_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_97_idx"))) ;
      sGXsfl_97_idx = httpContext.GetPar( "sGXsfl_97_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tccn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tccn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccn_impl.class ));
   }

   public tccn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCCn.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFch_Internalname, localUtil.format(A4033CCFch, "99/99/99"), localUtil.format( A4033CCFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFch_Jsonclick, 0, "", "", "", "", "", 1, edtCCFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Disparador", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcDisp_Internalname, GXutil.rtrim( A4405CcDisp), GXutil.rtrim( localUtil.format( A4405CcDisp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcDisp_Jsonclick, 0, "", "", "", "", "", 1, edtCcDisp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Obs", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCcObs_Internalname, A3281CcObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtCcObs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Ultimo Test", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcUltn_Internalname, GXutil.ltrim( localUtil.ntoc( A11293CcUltn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcUltn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11293CcUltn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11293CcUltn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcUltn_Jsonclick, 0, "", "", "", "", "", 1, edtCcUltn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol85( ) ;
      /* Save parent mode. */
      sMode1508 = Gx_mode ;
      nGXsfl_85_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1508 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1508 = (short)(1) ;
            scanStart1BI1508( ) ;
            while ( RcdFound1508 != 0 )
            {
               init_level_properties1508( ) ;
               getByPrimaryKey1BI1508( ) ;
               addRow1BI1508( ) ;
               scanNext1BI1508( ) ;
            }
            scanEnd1BI1508( ) ;
            nBlankRcdCount1508 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1BI1508( ) ;
         standaloneModal1BI1508( ) ;
         sMode1508 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRow1BI1508( ) ;
            edtCcLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLN_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCcLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLn_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_1508 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BI1508( ) ;
            }
            sendRow1BI1508( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode1508 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1508 = (short)(5) ;
         nRcdExists_1508 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BI1508( ) ;
            while ( RcdFound1508 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_851508( ) ;
               init_level_properties1508( ) ;
               standaloneNotModal1BI1508( ) ;
               getByPrimaryKey1BI1508( ) ;
               standaloneModal1BI1508( ) ;
               addRow1BI1508( ) ;
               scanNext1BI1508( ) ;
            }
            scanEnd1BI1508( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1508 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_851508( ) ;
      initAll1BI1508( ) ;
      init_level_properties1508( ) ;
      nRcdExists_1508 = (short)(0) ;
      nIsMod_1508 = (short)(0) ;
      nRcdDeleted_1508 = (short)(0) ;
      nBlankRcdCount1508 = (short)(nBlankRcdUsr1508+nBlankRcdCount1508) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1508 > 0 )
      {
         standaloneNotModal1BI1508( ) ;
         standaloneModal1BI1508( ) ;
         addRow1BI1508( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCcLn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1508 = (short)(nBlankRcdCount1508-1) ;
      }
      Gx_mode = sMode1508 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1508 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCCn.htm");
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
      e111BI2 ();
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
            Z11293CcUltn = (short)(localUtil.ctol( httpContext.cgiGet( "Z11293CcUltn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCULTN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCcUltn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11293CcUltn = (short)(0) ;
               n11293CcUltn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
            }
            else
            {
               A11293CcUltn = (short)(localUtil.ctol( httpContext.cgiGet( edtCcUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11293CcUltn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
                        e111BI2 ();
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
            initAll1BI619( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1509_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1509_Enabled), 5, 0), !bGXsfl_97_Refreshing);
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
      disableAttributes1BI619( ) ;
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

   public void confirm_1BI0( )
   {
      beforeValidate1BI619( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BI619( ) ;
         }
         else
         {
            checkExtendedTable1BI619( ) ;
            if ( AnyError == 0 )
            {
               zm1BI619( 2) ;
               zm1BI619( 3) ;
               zm1BI619( 4) ;
            }
            closeExtendedTableCursors1BI619( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode619 = Gx_mode ;
         confirm_1BI1508( ) ;
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
         confirmValues1BI0( ) ;
      }
   }

   public void confirm_1BI1509( )
   {
      nGXsfl_97_idx = 0 ;
      while ( nGXsfl_97_idx < nRC_GXsfl_97 )
      {
         readRow1BI1509( ) ;
         if ( ( nRcdExists_1509 != 0 ) || ( nIsMod_1509 != 0 ) )
         {
            getKey1BI1509( ) ;
            if ( ( nRcdExists_1509 == 0 ) && ( nRcdDeleted_1509 == 0 ) )
            {
               if ( RcdFound1509 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BI1509( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BI1509( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BI1509( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCLN_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCcLn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1509 != 0 )
               {
                  if ( nRcdDeleted_1509 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BI1509( ) ;
                     load1BI1509( ) ;
                     beforeValidate1BI1509( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BI1509( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1509 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BI1509( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BI1509( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BI1509( ) ;
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
                  if ( nRcdDeleted_1509 == 0 )
                  {
                     GXCCtl = "CCLN_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCcLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1509_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCcLnT_Internalname, GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCcLnV_Internalname, GXutil.rtrim( A11296CcLnV)) ;
         httpContext.changePostValue( edtCcLnFc_Internalname, localUtil.format(A11297CcLnFc, "99/99/99")) ;
         httpContext.changePostValue( edtCcLnOp_Internalname, GXutil.ltrim( localUtil.ntoc( A11298CcLnOp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11295CcLnT_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( Z11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11296CcLnV_"+sGXsfl_97_idx, GXutil.rtrim( Z11296CcLnV)) ;
         httpContext.changePostValue( "ZT_"+"Z11297CcLnFc_"+sGXsfl_97_idx, localUtil.dtoc( Z11297CcLnFc, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z11298CcLnOp_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( Z11298CcLnOp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1509_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1509_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1509_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1509 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1509_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1509_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNT_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNV_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNFC_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnFc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNOP_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnOp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1BI1508( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow1BI1508( ) ;
         if ( ( nRcdExists_1508 != 0 ) || ( nIsMod_1508 != 0 ) )
         {
            getKey1BI1508( ) ;
            if ( ( nRcdExists_1508 == 0 ) && ( nRcdDeleted_1508 == 0 ) )
            {
               if ( RcdFound1508 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BI1508( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BI1508( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BI1508( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1508 = Gx_mode ;
                        confirm_1BI1509( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1508 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1508 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCLN_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCcLn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1508 != 0 )
               {
                  if ( nRcdDeleted_1508 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BI1508( ) ;
                     load1BI1508( ) ;
                     beforeValidate1BI1508( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BI1508( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1508 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BI1508( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BI1508( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BI1508( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1508 = Gx_mode ;
                              confirm_1BI1509( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1508 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1508 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1508 == 0 )
                  {
                     GXCCtl = "CCLN_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCcLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCcLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11294CcLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11294CcLn_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11294CcLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_97_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_97, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1508_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1508_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1508_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1508 != 0 )
         {
            httpContext.changePostValue( "CCLN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BI0( )
   {
   }

   public void e111BI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV29Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV30Emprnom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char1, GXv_char2, GXv_char3) ;
      tccn_impl.this.A396EmprCod = GXv_char1[0] ;
      tccn_impl.this.AV30Emprnom = GXv_char2[0] ;
      tccn_impl.this.AV8UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30Emprnom", AV30Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char4 = AV7Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tccn_impl.this.GXt_char4 = GXv_char3[0] ;
      AV7Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char4 = AV9LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tccn_impl.this.GXt_char4 = GXv_char3[0] ;
      AV9LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
   }

   public void zm1BI619( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4032CCOpeCod = T01BI7_A4032CCOpeCod[0] ;
            Z4033CCFch = T01BI7_A4033CCFch[0] ;
            Z4405CcDisp = T01BI7_A4405CcDisp[0] ;
            Z3281CcObs = T01BI7_A3281CcObs[0] ;
            Z11293CcUltn = T01BI7_A11293CcUltn[0] ;
         }
         else
         {
            Z4032CCOpeCod = A4032CCOpeCod ;
            Z4033CCFch = A4033CCFch ;
            Z4405CcDisp = A4405CcDisp ;
            Z3281CcObs = A3281CcObs ;
            Z11293CcUltn = A11293CcUltn ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4032CCOpeCod = A4032CCOpeCod ;
         Z4033CCFch = A4033CCFch ;
         Z4405CcDisp = A4405CcDisp ;
         Z3281CcObs = A3281CcObs ;
         Z11293CcUltn = A11293CcUltn ;
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
      /* Using cursor T01BI8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BI8_A407EmprNom[0] ;
      n407EmprNom = T01BI8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void load1BI619( )
   {
      /* Using cursor T01BI11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A407EmprNom = T01BI11_A407EmprNom[0] ;
         n407EmprNom = T01BI11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4032CCOpeCod = T01BI11_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T01BI11_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T01BI11_A4033CCFch[0] ;
         n4033CCFch = T01BI11_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T01BI11_A4405CcDisp[0] ;
         n4405CcDisp = T01BI11_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T01BI11_A3281CcObs[0] ;
         n3281CcObs = T01BI11_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A11293CcUltn = T01BI11_A11293CcUltn[0] ;
         n11293CcUltn = T01BI11_n11293CcUltn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
         zm1BI619( -1) ;
      }
      pr_default.close(9);
      onLoadActions1BI619( ) ;
   }

   public void onLoadActions1BI619( )
   {
   }

   public void checkExtendedTable1BI619( )
   {
      nIsDirty_619 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01BI9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      /* Using cursor T01BI10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1BI619( )
   {
      pr_default.close(7);
      pr_default.close(8);
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
      /* Using cursor T01BI12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
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

   public void gxload_4( String A396EmprCod ,
                         int A4031CCTCod )
   {
      /* Using cursor T01BI13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1BI619( )
   {
      /* Using cursor T01BI14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
      else
      {
         RcdFound619 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BI7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01BI7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BI619( 1) ;
         RcdFound619 = (short)(1) ;
         A4032CCOpeCod = T01BI7_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T01BI7_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T01BI7_A4033CCFch[0] ;
         n4033CCFch = T01BI7_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T01BI7_A4405CcDisp[0] ;
         n4405CcDisp = T01BI7_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T01BI7_A3281CcObs[0] ;
         n3281CcObs = T01BI7_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A11293CcUltn = T01BI7_A11293CcUltn[0] ;
         n11293CcUltn = T01BI7_n11293CcUltn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
         A129BarCod = T01BI7_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01BI7_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01BI7_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01BI7_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01BI7_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T01BI7_A4031CCTCod[0] ;
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
         load1BI619( ) ;
         if ( AnyError == 1 )
         {
            RcdFound619 = (short)(0) ;
            initializeNonKey1BI619( ) ;
         }
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound619 = (short)(0) ;
         initializeNonKey1BI619( ) ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1BI619( ) ;
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
      /* Using cursor T01BI15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Integer.valueOf(A4031CCTCod), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01BI15_A129BarCod[0] < A129BarCod ) || ( T01BI15_A129BarCod[0] == A129BarCod ) && ( T01BI15_A132BarCodReo[0] < A132BarCodReo ) || ( T01BI15_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01BI15_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01BI15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI15_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01BI15_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01BI15_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01BI15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI15_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI15_A129BarCod[0] == A129BarCod ) && ( T01BI15_A194BarOrdLin[0] < A194BarOrdLin ) || ( T01BI15_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01BI15_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01BI15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI15_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI15_A129BarCod[0] == A129BarCod ) && ( T01BI15_A4031CCTCod[0] < A4031CCTCod ) ) && ( GXutil.strcmp(T01BI15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01BI15_A129BarCod[0] > A129BarCod ) || ( T01BI15_A129BarCod[0] == A129BarCod ) && ( T01BI15_A132BarCodReo[0] > A132BarCodReo ) || ( T01BI15_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01BI15_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01BI15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI15_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01BI15_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01BI15_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01BI15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI15_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI15_A129BarCod[0] == A129BarCod ) && ( T01BI15_A194BarOrdLin[0] > A194BarOrdLin ) || ( T01BI15_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01BI15_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01BI15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI15_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI15_A129BarCod[0] == A129BarCod ) && ( T01BI15_A4031CCTCod[0] > A4031CCTCod ) ) && ( GXutil.strcmp(T01BI15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01BI15_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01BI15_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01BI15_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T01BI15_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T01BI15_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = T01BI15_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound619 = (short)(0) ;
      /* Using cursor T01BI16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Integer.valueOf(A4031CCTCod), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01BI16_A129BarCod[0] > A129BarCod ) || ( T01BI16_A129BarCod[0] == A129BarCod ) && ( T01BI16_A132BarCodReo[0] > A132BarCodReo ) || ( T01BI16_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01BI16_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01BI16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI16_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01BI16_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01BI16_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01BI16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI16_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI16_A129BarCod[0] == A129BarCod ) && ( T01BI16_A194BarOrdLin[0] > A194BarOrdLin ) || ( T01BI16_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01BI16_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01BI16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI16_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI16_A129BarCod[0] == A129BarCod ) && ( T01BI16_A4031CCTCod[0] > A4031CCTCod ) ) && ( GXutil.strcmp(T01BI16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01BI16_A129BarCod[0] < A129BarCod ) || ( T01BI16_A129BarCod[0] == A129BarCod ) && ( T01BI16_A132BarCodReo[0] < A132BarCodReo ) || ( T01BI16_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01BI16_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01BI16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI16_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01BI16_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01BI16_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01BI16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI16_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI16_A129BarCod[0] == A129BarCod ) && ( T01BI16_A194BarOrdLin[0] < A194BarOrdLin ) || ( T01BI16_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01BI16_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01BI16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01BI16_A132BarCodReo[0] == A132BarCodReo ) && ( T01BI16_A129BarCod[0] == A129BarCod ) && ( T01BI16_A4031CCTCod[0] < A4031CCTCod ) ) && ( GXutil.strcmp(T01BI16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01BI16_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01BI16_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01BI16_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T01BI16_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T01BI16_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = T01BI16_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BI619( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BI619( ) ;
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
               update1BI619( ) ;
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
               insert1BI619( ) ;
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
                  insert1BI619( ) ;
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
      getKey1BI619( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccn");
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1BI0( ) ;
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
      scanStart1BI619( ) ;
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
      scanEnd1BI619( ) ;
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
      scanStart1BI619( ) ;
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound619 != 0 )
         {
            scanNext1BI619( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BI619( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BI619( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BI6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( Z4032CCOpeCod != T01BI6_A4032CCOpeCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T01BI6_A4033CCFch[0])) ) || ( GXutil.strcmp(Z4405CcDisp, T01BI6_A4405CcDisp[0]) != 0 ) || ( GXutil.strcmp(Z3281CcObs, T01BI6_A3281CcObs[0]) != 0 ) || ( Z11293CcUltn != T01BI6_A11293CcUltn[0] ) )
         {
            if ( Z4032CCOpeCod != T01BI6_A4032CCOpeCod[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccn:[seudo value changed for attri]"+"CCOpeCod");
               GXutil.writeLogRaw("Old: ",Z4032CCOpeCod);
               GXutil.writeLogRaw("Current: ",T01BI6_A4032CCOpeCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T01BI6_A4033CCFch[0])) ) )
            {
               GXutil.writeLogln("controlcalidadhtd.tccn:[seudo value changed for attri]"+"CCFch");
               GXutil.writeLogRaw("Old: ",Z4033CCFch);
               GXutil.writeLogRaw("Current: ",T01BI6_A4033CCFch[0]);
            }
            if ( GXutil.strcmp(Z4405CcDisp, T01BI6_A4405CcDisp[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccn:[seudo value changed for attri]"+"CcDisp");
               GXutil.writeLogRaw("Old: ",Z4405CcDisp);
               GXutil.writeLogRaw("Current: ",T01BI6_A4405CcDisp[0]);
            }
            if ( GXutil.strcmp(Z3281CcObs, T01BI6_A3281CcObs[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccn:[seudo value changed for attri]"+"CcObs");
               GXutil.writeLogRaw("Old: ",Z3281CcObs);
               GXutil.writeLogRaw("Current: ",T01BI6_A3281CcObs[0]);
            }
            if ( Z11293CcUltn != T01BI6_A11293CcUltn[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccn:[seudo value changed for attri]"+"CcUltn");
               GXutil.writeLogRaw("Old: ",Z11293CcUltn);
               GXutil.writeLogRaw("Current: ",T01BI6_A11293CcUltn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BI619( )
   {
      beforeValidate1BI619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BI619( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BI619( 0) ;
         checkOptimisticConcurrency1BI619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BI619( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BI619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BI17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, Boolean.valueOf(n11293CcUltn), Short.valueOf(A11293CcUltn), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevel1BI619( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BI0( ) ;
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
            load1BI619( ) ;
         }
         endLevel1BI619( ) ;
      }
      closeExtendedTableCursors1BI619( ) ;
   }

   public void update1BI619( )
   {
      beforeValidate1BI619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BI619( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BI619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BI619( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BI619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BI18 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, Boolean.valueOf(n11293CcUltn), Short.valueOf(A11293CcUltn), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BI619( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BI619( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BI0( ) ;
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
         endLevel1BI619( ) ;
      }
      closeExtendedTableCursors1BI619( ) ;
   }

   public void deferredUpdate1BI619( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BI619( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BI619( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BI619( ) ;
         afterConfirm1BI619( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BI619( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BI19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
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
                        initAll1BI619( ) ;
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
                     resetCaption1BI0( ) ;
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
      sMode619 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BI619( ) ;
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BI619( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01BI20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Nveces Test", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01BI21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevel1BI1508( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow1BI1508( ) ;
         if ( ( nRcdExists_1508 != 0 ) || ( nIsMod_1508 != 0 ) )
         {
            standaloneNotModal1BI1508( ) ;
            getKey1BI1508( ) ;
            if ( ( nRcdExists_1508 == 0 ) && ( nRcdDeleted_1508 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BI1508( ) ;
            }
            else
            {
               if ( RcdFound1508 != 0 )
               {
                  if ( ( nRcdDeleted_1508 != 0 ) && ( nRcdExists_1508 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BI1508( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1508 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BI1508( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1508 == 0 )
                  {
                     GXCCtl = "CCLN_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCcLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCcLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11294CcLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11294CcLn_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11294CcLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_97_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_97, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1508_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1508_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1508_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1508 != 0 )
         {
            httpContext.changePostValue( "CCLN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BI1508( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1508 = (short)(0) ;
      nIsMod_1508 = (short)(0) ;
      nRcdDeleted_1508 = (short)(0) ;
   }

   public void processLevel1BI619( )
   {
      /* Save parent mode. */
      sMode619 = Gx_mode ;
      processNestedLevel1BI1508( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BI619( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BI619( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccn");
         if ( AnyError == 0 )
         {
            confirmValues1BI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BI619( )
   {
      /* Scan By routine */
      /* Using cursor T01BI22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A129BarCod = T01BI22_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01BI22_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01BI22_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01BI22_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01BI22_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T01BI22_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BI619( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A129BarCod = T01BI22_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01BI22_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01BI22_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01BI22_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01BI22_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = T01BI22_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
   }

   public void scanEnd1BI619( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1BI619( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BI619( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BI619( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BI619( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BI619( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BI619( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BI619( )
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
      edtCcUltn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcUltn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcUltn_Enabled), 5, 0), true);
   }

   public void zm1BI1508( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -5 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z11294CcLn = A11294CcLn ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModal1BI1508( )
   {
   }

   public void standaloneModal1BI1508( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCcLn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCcLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLn_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtCcLn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCcLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLn_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void load1BI1508( )
   {
      /* Using cursor T01BI23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1508 = (short)(1) ;
         zm1BI1508( -5) ;
      }
      pr_default.close(21);
      onLoadActions1BI1508( ) ;
   }

   public void onLoadActions1BI1508( )
   {
   }

   public void checkExtendedTable1BI1508( )
   {
      nIsDirty_1508 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BI1508( ) ;
   }

   public void closeExtendedTableCursors1BI1508( )
   {
   }

   public void enableDisable1BI1508( )
   {
   }

   public void getKey1BI1508( )
   {
      /* Using cursor T01BI24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1508 = (short)(1) ;
      }
      else
      {
         RcdFound1508 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1BI1508( )
   {
      /* Using cursor T01BI5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01BI5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BI1508( 5) ;
         RcdFound1508 = (short)(1) ;
         initializeNonKey1BI1508( ) ;
         A11294CcLn = T01BI5_A11294CcLn[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z11294CcLn = A11294CcLn ;
         sMode1508 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BI1508( ) ;
         load1BI1508( ) ;
         Gx_mode = sMode1508 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1508 = (short)(0) ;
         initializeNonKey1BI1508( ) ;
         sMode1508 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BI1508( ) ;
         Gx_mode = sMode1508 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BI1508( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1BI1508( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BI4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCn"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCn"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BI1508( )
   {
      beforeValidate1BI1508( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BI1508( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BI1508( 0) ;
         checkOptimisticConcurrency1BI1508( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BI1508( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BI1508( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BI25 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Short.valueOf(A11294CcLn), A396EmprCod, Integer.valueOf(A4031CCTCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCn");
                  if ( (pr_default.getStatus(23) == 1) )
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
                        processLevel1BI1508( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load1BI1508( ) ;
         }
         endLevel1BI1508( ) ;
      }
      closeExtendedTableCursors1BI1508( ) ;
   }

   public void update1BI1508( )
   {
      beforeValidate1BI1508( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BI1508( ) ;
      }
      if ( ( nIsMod_1508 != 0 ) || ( nIsDirty_1508 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BI1508( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BI1508( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BI1508( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPCCn */
                     deferredUpdate1BI1508( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1BI1508( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1BI1508( ) ;
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
            endLevel1BI1508( ) ;
         }
      }
      closeExtendedTableCursors1BI1508( ) ;
   }

   public void deferredUpdate1BI1508( )
   {
   }

   public void delete1BI1508( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BI1508( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BI1508( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BI1508( ) ;
         afterConfirm1BI1508( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BI1508( ) ;
            if ( AnyError == 0 )
            {
               scanStart1BI1509( ) ;
               while ( RcdFound1509 != 0 )
               {
                  getByPrimaryKey1BI1509( ) ;
                  delete1BI1509( ) ;
                  scanNext1BI1509( ) ;
               }
               scanEnd1BI1509( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BI26 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCn");
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
      }
      sMode1508 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BI1508( ) ;
      Gx_mode = sMode1508 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BI1508( )
   {
      standaloneModal1BI1508( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1BI1509( )
   {
      nGXsfl_97_idx = 0 ;
      while ( nGXsfl_97_idx < nRC_GXsfl_97 )
      {
         readRow1BI1509( ) ;
         if ( ( nRcdExists_1509 != 0 ) || ( nIsMod_1509 != 0 ) )
         {
            standaloneNotModal1BI1509( ) ;
            getKey1BI1509( ) ;
            if ( ( nRcdExists_1509 == 0 ) && ( nRcdDeleted_1509 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BI1509( ) ;
            }
            else
            {
               if ( RcdFound1509 != 0 )
               {
                  if ( ( nRcdDeleted_1509 != 0 ) && ( nRcdExists_1509 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BI1509( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1509 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BI1509( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1509 == 0 )
                  {
                     GXCCtl = "CCLN_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCcLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1509_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCcLnT_Internalname, GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCcLnV_Internalname, GXutil.rtrim( A11296CcLnV)) ;
         httpContext.changePostValue( edtCcLnFc_Internalname, localUtil.format(A11297CcLnFc, "99/99/99")) ;
         httpContext.changePostValue( edtCcLnOp_Internalname, GXutil.ltrim( localUtil.ntoc( A11298CcLnOp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11295CcLnT_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( Z11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11296CcLnV_"+sGXsfl_97_idx, GXutil.rtrim( Z11296CcLnV)) ;
         httpContext.changePostValue( "ZT_"+"Z11297CcLnFc_"+sGXsfl_97_idx, localUtil.dtoc( Z11297CcLnFc, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z11298CcLnOp_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( Z11298CcLnOp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1509_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1509_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1509_"+sGXsfl_97_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1509 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1509_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1509_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNT_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNV_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNFC_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnFc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCLNOP_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnOp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BI1509( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1509 = (short)(0) ;
      nIsMod_1509 = (short)(0) ;
      nRcdDeleted_1509 = (short)(0) ;
   }

   public void processLevel1BI1508( )
   {
      /* Save parent mode. */
      sMode1508 = Gx_mode ;
      processNestedLevel1BI1509( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1508 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BI1508( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BI1508( )
   {
      /* Scan By routine */
      /* Using cursor T01BI27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      RcdFound1508 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1508 = (short)(1) ;
         A11294CcLn = T01BI27_A11294CcLn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BI1508( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1508 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1508 = (short)(1) ;
         A11294CcLn = T01BI27_A11294CcLn[0] ;
      }
   }

   public void scanEnd1BI1508( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1BI1508( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BI1508( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BI1508( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BI1508( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BI1508( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BI1508( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BI1508( )
   {
      edtCcLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLn_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void zm1BI1509( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11296CcLnV = T01BI3_A11296CcLnV[0] ;
            Z11297CcLnFc = T01BI3_A11297CcLnFc[0] ;
            Z11298CcLnOp = T01BI3_A11298CcLnOp[0] ;
         }
         else
         {
            Z11296CcLnV = A11296CcLnV ;
            Z11297CcLnFc = A11297CcLnFc ;
            Z11298CcLnOp = A11298CcLnOp ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z11294CcLn = A11294CcLn ;
         Z11295CcLnT = A11295CcLnT ;
         Z11296CcLnV = A11296CcLnV ;
         Z11297CcLnFc = A11297CcLnFc ;
         Z11298CcLnOp = A11298CcLnOp ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModal1BI1509( )
   {
   }

   public void standaloneModal1BI1509( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCcLnT_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      }
      else
      {
         edtCcLnT_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      }
   }

   public void load1BI1509( )
   {
      /* Using cursor T01BI28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1509 = (short)(1) ;
         A11296CcLnV = T01BI28_A11296CcLnV[0] ;
         n11296CcLnV = T01BI28_n11296CcLnV[0] ;
         A11297CcLnFc = T01BI28_A11297CcLnFc[0] ;
         n11297CcLnFc = T01BI28_n11297CcLnFc[0] ;
         A11298CcLnOp = T01BI28_A11298CcLnOp[0] ;
         n11298CcLnOp = T01BI28_n11298CcLnOp[0] ;
         zm1BI1509( -6) ;
      }
      pr_default.close(26);
      onLoadActions1BI1509( ) ;
   }

   public void onLoadActions1BI1509( )
   {
   }

   public void checkExtendedTable1BI1509( )
   {
      nIsDirty_1509 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BI1509( ) ;
   }

   public void closeExtendedTableCursors1BI1509( )
   {
   }

   public void enableDisable1BI1509( )
   {
   }

   public void getKey1BI1509( )
   {
      /* Using cursor T01BI29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1509 = (short)(1) ;
      }
      else
      {
         RcdFound1509 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey1BI1509( )
   {
      /* Using cursor T01BI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01BI3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BI1509( 6) ;
         RcdFound1509 = (short)(1) ;
         initializeNonKey1BI1509( ) ;
         A11295CcLnT = T01BI3_A11295CcLnT[0] ;
         A11296CcLnV = T01BI3_A11296CcLnV[0] ;
         n11296CcLnV = T01BI3_n11296CcLnV[0] ;
         A11297CcLnFc = T01BI3_A11297CcLnFc[0] ;
         n11297CcLnFc = T01BI3_n11297CcLnFc[0] ;
         A11298CcLnOp = T01BI3_A11298CcLnOp[0] ;
         n11298CcLnOp = T01BI3_n11298CcLnOp[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z11294CcLn = A11294CcLn ;
         Z11295CcLnT = A11295CcLnT ;
         sMode1509 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BI1509( ) ;
         load1BI1509( ) ;
         Gx_mode = sMode1509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1509 = (short)(0) ;
         initializeNonKey1BI1509( ) ;
         sMode1509 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BI1509( ) ;
         Gx_mode = sMode1509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BI1509( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BI1509( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCnT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11296CcLnV, T01BI2_A11296CcLnV[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z11297CcLnFc), GXutil.resetTime(T01BI2_A11297CcLnFc[0])) ) || ( Z11298CcLnOp != T01BI2_A11298CcLnOp[0] ) )
         {
            if ( GXutil.strcmp(Z11296CcLnV, T01BI2_A11296CcLnV[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccn:[seudo value changed for attri]"+"CcLnV");
               GXutil.writeLogRaw("Old: ",Z11296CcLnV);
               GXutil.writeLogRaw("Current: ",T01BI2_A11296CcLnV[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11297CcLnFc), GXutil.resetTime(T01BI2_A11297CcLnFc[0])) ) )
            {
               GXutil.writeLogln("controlcalidadhtd.tccn:[seudo value changed for attri]"+"CcLnFc");
               GXutil.writeLogRaw("Old: ",Z11297CcLnFc);
               GXutil.writeLogRaw("Current: ",T01BI2_A11297CcLnFc[0]);
            }
            if ( Z11298CcLnOp != T01BI2_A11298CcLnOp[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccn:[seudo value changed for attri]"+"CcLnOp");
               GXutil.writeLogRaw("Old: ",Z11298CcLnOp);
               GXutil.writeLogRaw("Current: ",T01BI2_A11298CcLnOp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCnT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BI1509( )
   {
      beforeValidate1BI1509( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BI1509( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BI1509( 0) ;
         checkOptimisticConcurrency1BI1509( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BI1509( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BI1509( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BI30 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT), Boolean.valueOf(n11296CcLnV), A11296CcLnV, Boolean.valueOf(n11297CcLnFc), A11297CcLnFc, Boolean.valueOf(n11298CcLnOp), Integer.valueOf(A11298CcLnOp), A396EmprCod, Integer.valueOf(A4031CCTCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
                  if ( (pr_default.getStatus(28) == 1) )
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
            load1BI1509( ) ;
         }
         endLevel1BI1509( ) ;
      }
      closeExtendedTableCursors1BI1509( ) ;
   }

   public void update1BI1509( )
   {
      beforeValidate1BI1509( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BI1509( ) ;
      }
      if ( ( nIsMod_1509 != 0 ) || ( nIsDirty_1509 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BI1509( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BI1509( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BI1509( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BI31 */
                     pr_default.execute(29, new Object[] {Boolean.valueOf(n11296CcLnV), A11296CcLnV, Boolean.valueOf(n11297CcLnFc), A11297CcLnFc, Boolean.valueOf(n11298CcLnOp), Integer.valueOf(A11298CcLnOp), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCnT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BI1509( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BI1509( ) ;
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
            endLevel1BI1509( ) ;
         }
      }
      closeExtendedTableCursors1BI1509( ) ;
   }

   public void deferredUpdate1BI1509( )
   {
   }

   public void delete1BI1509( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BI1509( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BI1509( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BI1509( ) ;
         afterConfirm1BI1509( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BI1509( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BI32 */
               pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
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
      sMode1509 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BI1509( ) ;
      Gx_mode = sMode1509 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BI1509( )
   {
      standaloneModal1BI1509( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1BI1509( )
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

   public void scanStart1BI1509( )
   {
      /* Scan By routine */
      /* Using cursor T01BI33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
      RcdFound1509 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1509 = (short)(1) ;
         A11295CcLnT = T01BI33_A11295CcLnT[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BI1509( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1509 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1509 = (short)(1) ;
         A11295CcLnT = T01BI33_A11295CcLnT[0] ;
      }
   }

   public void scanEnd1BI1509( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1BI1509( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BI1509( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BI1509( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BI1509( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BI1509( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BI1509( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BI1509( )
   {
      edtCcLnT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtCcLnV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnV_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtCcLnFc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnFc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnFc_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtCcLnOp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnOp_Enabled), 5, 0), !bGXsfl_97_Refreshing);
   }

   public void send_integrity_lvl_hashes1BI1509( )
   {
   }

   public void send_integrity_lvl_hashes1BI1508( )
   {
   }

   public void send_integrity_lvl_hashes1BI619( )
   {
   }

   public void subsflControlProps_851508( )
   {
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_85_idx ;
      edtCcLn_Internalname = "CCLN_"+sGXsfl_85_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_851508( )
   {
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_85_fel_idx ;
      edtCcLn_Internalname = "CCLN_"+sGXsfl_85_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_85_fel_idx ;
   }

   public void addRow1BI1508( )
   {
      nRC_GXsfl_97 = 0 ;
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851508( ) ;
      sendRow1BI1508( ) ;
   }

   public void sendRow1BI1508( )
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
         if ( ((int)((nGXsfl_85_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_85_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_85_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_85_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "Linea", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1508_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCcLn_Internalname,GXutil.ltrim( localUtil.ntoc( A11294CcLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11294CcLn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCcLn_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCcLn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol97( ) ;
      nGXsfl_97_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1509 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1509 = (short)(1) ;
            scanStart1BI1509( ) ;
            while ( RcdFound1509 != 0 )
            {
               init_level_properties1509( ) ;
               getByPrimaryKey1BI1509( ) ;
               addRow1BI1509( ) ;
               scanNext1BI1509( ) ;
            }
            scanEnd1BI1509( ) ;
            nBlankRcdCount1509 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1BI1509( ) ;
         standaloneModal1BI1509( ) ;
         sMode1509 = Gx_mode ;
         while ( nGXsfl_97_idx < nRC_GXsfl_97 )
         {
            bGXsfl_97_Refreshing = true ;
            readRow1BI1509( ) ;
            edtavnRcdDeleted_1509_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1509_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1509_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1509_Enabled), 5, 0), !bGXsfl_97_Refreshing);
            edtCcLnT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNT_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_97_Refreshing);
            edtCcLnV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNV_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCcLnV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnV_Enabled), 5, 0), !bGXsfl_97_Refreshing);
            edtCcLnFc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNFC_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCcLnFc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnFc_Enabled), 5, 0), !bGXsfl_97_Refreshing);
            edtCcLnOp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNOP_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCcLnOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnOp_Enabled), 5, 0), !bGXsfl_97_Refreshing);
            if ( ( nRcdExists_1509 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BI1509( ) ;
            }
            sendRow1BI1509( ) ;
            bGXsfl_97_Refreshing = false ;
         }
         Gx_mode = sMode1509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1509 = (short)(5) ;
         nRcdExists_1509 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BI1509( ) ;
            while ( RcdFound1509 != 0 )
            {
               sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx+1), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
               subsflControlProps_971509( ) ;
               init_level_properties1509( ) ;
               standaloneNotModal1BI1509( ) ;
               getByPrimaryKey1BI1509( ) ;
               standaloneModal1BI1509( ) ;
               addRow1BI1509( ) ;
               scanNext1BI1509( ) ;
            }
            scanEnd1BI1509( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1509 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx+1), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
      subsflControlProps_971509( ) ;
      initAll1BI1509( ) ;
      init_level_properties1509( ) ;
      nRcdExists_1509 = (short)(0) ;
      nIsMod_1509 = (short)(0) ;
      nRcdDeleted_1509 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 85 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_85_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1509 = (short)(nBlankRcdUsr1509+nBlankRcdCount1509) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1509 > 0 )
      {
         standaloneNotModal1BI1509( ) ;
         standaloneModal1BI1509( ) ;
         addRow1BI1509( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCcLnT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1509 = (short)(nBlankRcdCount1509-1) ;
      }
      Gx_mode = sMode1509 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_85_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_85_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_85_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BI1508( ) ;
      GXCCtl = "Z11294CcLn_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11294CcLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_97_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_97_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1508_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1508_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1508_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1508, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCLN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_85_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BI1508( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851508( ) ;
      edtCcLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLN_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CCLN_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcLn_Internalname ;
         wbErr = true ;
         A11294CcLn = (short)(0) ;
      }
      else
      {
         A11294CcLn = (short)(localUtil.ctol( httpContext.cgiGet( edtCcLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z11294CcLn_" + sGXsfl_85_idx ;
      Z11294CcLn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_97_" + sGXsfl_85_idx ;
      nRC_GXsfl_97 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1508_" + sGXsfl_85_idx ;
      nRcdDeleted_1508 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1508_" + sGXsfl_85_idx ;
      nRcdExists_1508 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1508_" + sGXsfl_85_idx ;
      nIsMod_1508 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_97_" + sGXsfl_85_idx ;
      nRC_GXsfl_97 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_971509( )
   {
      edtavnRcdDeleted_1509_Internalname = "vNRCDDELETED_1509_"+sGXsfl_97_idx ;
      edtCcLnT_Internalname = "CCLNT_"+sGXsfl_97_idx ;
      edtCcLnV_Internalname = "CCLNV_"+sGXsfl_97_idx ;
      edtCcLnFc_Internalname = "CCLNFC_"+sGXsfl_97_idx ;
      edtCcLnOp_Internalname = "CCLNOP_"+sGXsfl_97_idx ;
   }

   public void subsflControlProps_fel_971509( )
   {
      edtavnRcdDeleted_1509_Internalname = "vNRCDDELETED_1509_"+sGXsfl_97_fel_idx ;
      edtCcLnT_Internalname = "CCLNT_"+sGXsfl_97_fel_idx ;
      edtCcLnV_Internalname = "CCLNV_"+sGXsfl_97_fel_idx ;
      edtCcLnFc_Internalname = "CCLNFC_"+sGXsfl_97_fel_idx ;
      edtCcLnOp_Internalname = "CCLNOP_"+sGXsfl_97_fel_idx ;
   }

   public void addRow1BI1509( )
   {
      nGXsfl_97_idx = (int)(nGXsfl_97_idx+1) ;
      sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
      subsflControlProps_971509( ) ;
      sendRow1BI1509( ) ;
   }

   public void sendRow1BI1509( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_97_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1509_" + sGXsfl_97_idx + "',1);gx.fn.setControlValue('nIsMod_1508_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_97_idx + "',97)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1509_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1509_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1509), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1509), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1509_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1509_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1509_" + sGXsfl_97_idx + "',1);gx.fn.setControlValue('nIsMod_1508_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_97_idx + "',97)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCcLnT_Internalname,GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11295CcLnT), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCcLnT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCcLnT_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1509_" + sGXsfl_97_idx + "',1);gx.fn.setControlValue('nIsMod_1508_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_97_idx + "',97)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCcLnV_Internalname,GXutil.rtrim( A11296CcLnV),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCcLnV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCcLnV_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1509_" + sGXsfl_97_idx + "',1);gx.fn.setControlValue('nIsMod_1508_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_97_idx + "',97)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCcLnFc_Internalname,localUtil.format(A11297CcLnFc, "99/99/99"),localUtil.format( A11297CcLnFc, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCcLnFc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCcLnFc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1509_" + sGXsfl_97_idx + "',1);gx.fn.setControlValue('nIsMod_1508_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_97_idx + "',97)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCcLnOp_Internalname,GXutil.ltrim( localUtil.ntoc( A11298CcLnOp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCcLnOp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11298CcLnOp), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11298CcLnOp), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCcLnOp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCcLnOp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1BI1509( ) ;
      GXCCtl = "Z11295CcLnT_" + sGXsfl_97_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11295CcLnT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11296CcLnV_" + sGXsfl_97_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11296CcLnV));
      GXCCtl = "Z11297CcLnFc_" + sGXsfl_97_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z11297CcLnFc, 0, "/"));
      GXCCtl = "Z11298CcLnOp_" + sGXsfl_97_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11298CcLnOp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1509_" + sGXsfl_97_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1509_" + sGXsfl_97_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1509_" + sGXsfl_97_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1509, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1509_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1509_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCLNT_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCLNV_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCLNFC_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnFc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCLNOP_"+sGXsfl_97_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnOp_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1BI1509( )
   {
      nGXsfl_97_idx = (int)(nGXsfl_97_idx+1) ;
      sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
      subsflControlProps_971509( ) ;
      edtavnRcdDeleted_1509_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1509_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCcLnT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNT_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCcLnV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNV_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCcLnFc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNFC_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCcLnOp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCLNOP_"+sGXsfl_97_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1509_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1509_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1509");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1509_Internalname ;
         wbErr = true ;
         nRcdDeleted_1509 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1509 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1509_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcLnT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcLnT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CCLNT_" + sGXsfl_97_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcLnT_Internalname ;
         wbErr = true ;
         A11295CcLnT = (short)(0) ;
      }
      else
      {
         A11295CcLnT = (short)(localUtil.ctol( httpContext.cgiGet( edtCcLnT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11296CcLnV = httpContext.cgiGet( edtCcLnV_Internalname) ;
      n11296CcLnV = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtCcLnFc_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "CCLNFC_" + sGXsfl_97_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcLnFc_Internalname ;
         wbErr = true ;
         A11297CcLnFc = GXutil.nullDate() ;
         n11297CcLnFc = false ;
      }
      else
      {
         A11297CcLnFc = localUtil.ctod( httpContext.cgiGet( edtCcLnFc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n11297CcLnFc = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcLnOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcLnOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CCLNOP_" + sGXsfl_97_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcLnOp_Internalname ;
         wbErr = true ;
         A11298CcLnOp = 0 ;
         n11298CcLnOp = false ;
      }
      else
      {
         A11298CcLnOp = (int)(localUtil.ctol( httpContext.cgiGet( edtCcLnOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11298CcLnOp = false ;
      }
      GXCCtl = "Z11295CcLnT_" + sGXsfl_97_idx ;
      Z11295CcLnT = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11296CcLnV_" + sGXsfl_97_idx ;
      Z11296CcLnV = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11297CcLnFc_" + sGXsfl_97_idx ;
      Z11297CcLnFc = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11298CcLnOp_" + sGXsfl_97_idx ;
      Z11298CcLnOp = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1509_" + sGXsfl_97_idx ;
      nRcdDeleted_1509 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1509_" + sGXsfl_97_idx ;
      nRcdExists_1509 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1509_" + sGXsfl_97_idx ;
      nIsMod_1509 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCcLnT_Enabled = edtCcLnT_Enabled ;
      defedtCcLn_Enabled = edtCcLn_Enabled ;
   }

   public void confirmValues1BI0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851508( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851508( ) ;
         httpContext.changePostValue( "Z11294CcLn_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z11294CcLn_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11294CcLn_"+sGXsfl_85_idx) ;
      }
      nGXsfl_97_idx = 0 ;
      sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
      subsflControlProps_971509( ) ;
      while ( nGXsfl_97_idx < nRC_GXsfl_97 )
      {
         nGXsfl_97_idx = (int)(nGXsfl_97_idx+1) ;
         sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
         subsflControlProps_971509( ) ;
         httpContext.changePostValue( "Z11295CcLnT_"+sGXsfl_97_idx, httpContext.cgiGet( "ZT_"+"Z11295CcLnT_"+sGXsfl_97_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11295CcLnT_"+sGXsfl_97_idx) ;
         httpContext.changePostValue( "Z11296CcLnV_"+sGXsfl_97_idx, httpContext.cgiGet( "ZT_"+"Z11296CcLnV_"+sGXsfl_97_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11296CcLnV_"+sGXsfl_97_idx) ;
         httpContext.changePostValue( "Z11297CcLnFc_"+sGXsfl_97_idx, httpContext.cgiGet( "ZT_"+"Z11297CcLnFc_"+sGXsfl_97_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11297CcLnFc_"+sGXsfl_97_idx) ;
         httpContext.changePostValue( "Z11298CcLnOp_"+sGXsfl_97_idx, httpContext.cgiGet( "ZT_"+"Z11298CcLnOp_"+sGXsfl_97_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11298CcLnOp_"+sGXsfl_97_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.tccn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11293CcUltn", GXutil.ltrim( localUtil.ntoc( Z11293CcUltn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.controlcalidadhtd.tccn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.TCCn" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "N Controles Calidad", "") ;
   }

   public void initializeNonKey1BI619( )
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
      A11293CcUltn = (short)(0) ;
      n11293CcUltn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
      Z4032CCOpeCod = 0 ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
      Z11293CcUltn = (short)(0) ;
   }

   public void initAll1BI619( )
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
      initializeNonKey1BI619( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BI1508( )
   {
   }

   public void initAll1BI1508( )
   {
      A11294CcLn = (short)(0) ;
      initializeNonKey1BI1508( ) ;
   }

   public void standaloneModalInsert1BI1508( )
   {
   }

   public void initializeNonKey1BI1509( )
   {
      A11296CcLnV = "" ;
      n11296CcLnV = false ;
      A11297CcLnFc = GXutil.nullDate() ;
      n11297CcLnFc = false ;
      A11298CcLnOp = 0 ;
      n11298CcLnOp = false ;
      Z11296CcLnV = "" ;
      Z11297CcLnFc = GXutil.nullDate() ;
      Z11298CcLnOp = 0 ;
   }

   public void initAll1BI1509( )
   {
      A11295CcLnT = (short)(0) ;
      initializeNonKey1BI1509( ) ;
   }

   public void standaloneModalInsert1BI1509( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565019", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/tccn.js", "?20268241565019", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1508( )
   {
      edtCcLn_Enabled = defedtCcLn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLn_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void init_level_properties1509( )
   {
      edtCcLnT_Enabled = defedtCcLnT_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcLnT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcLnT_Enabled), 5, 0), !bGXsfl_97_Refreshing);
   }

   public void startgridcontrol85( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock14_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11294CcLn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol97( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1509, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1509_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11295CcLnT, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A11296CcLnV));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A11297CcLnFc, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnFc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11298CcLnOp, (byte)(6), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCcLnOp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtCcUltn_Internalname = "CCULTN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtCcLn_Internalname = "CCLN" ;
      edtavnRcdDeleted_1509_Internalname = "vNRCDDELETED_1509" ;
      edtCcLnT_Internalname = "CCLNT" ;
      edtCcLnV_Internalname = "CCLNV" ;
      edtCcLnFc_Internalname = "CCLNFC" ;
      edtCcLnOp_Internalname = "CCLNOP" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock14_Caption = httpContext.getMessage( "Linea", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "N Controles Calidad", "") );
      edtCcLnOp_Jsonclick = "" ;
      edtCcLnFc_Jsonclick = "" ;
      edtCcLnV_Jsonclick = "" ;
      edtCcLnT_Jsonclick = "" ;
      edtavnRcdDeleted_1509_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtCcLn_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtCcLnOp_Enabled = 1 ;
      edtCcLnFc_Enabled = 1 ;
      edtCcLnV_Enabled = 1 ;
      edtCcLnT_Enabled = 1 ;
      edtavnRcdDeleted_1509_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCcLn_Enabled = 1 ;
      edtCcUltn_Jsonclick = "" ;
      edtCcUltn_Backcolor = (int)(0xFFFFFF) ;
      edtCcUltn_Enabled = 1 ;
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
      subsflControlProps_851508( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BI1508( ) ;
         standaloneModal1BI1508( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BI1508( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851508( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_971509( ) ;
      while ( nGXsfl_97_idx <= nRC_GXsfl_97 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BI1508( ) ;
         standaloneModal1BI1508( ) ;
         standaloneNotModal1BI1509( ) ;
         standaloneModal1BI1509( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BI1509( ) ;
         nGXsfl_97_idx = (int)(nGXsfl_97_idx+1) ;
         sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
         subsflControlProps_971509( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T01BI34 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BI34_A407EmprNom[0] ;
      n407EmprNom = T01BI34_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(32);
      /* Using cursor T01BI35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(33);
      /* Using cursor T01BI36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(34);
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
      /* Using cursor T01BI35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(33);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Cctcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01BI36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
      }
      pr_default.close(34);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", GXutil.rtrim( A4405CcDisp));
      httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
      httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrim( localUtil.ntoc( A11293CcUltn, (byte)(4), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11293CcUltn", GXutil.ltrim( localUtil.ntoc( Z11293CcUltn, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A4405CcDisp',fld:'CCDISP',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'A11293CcUltn',fld:'CCULTN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z4031CCTCod'},{av:'Z407EmprNom'},{av:'Z4032CCOpeCod'},{av:'Z4033CCFch'},{av:'Z4405CcDisp'},{av:'Z3281CcObs'},{av:'Z11293CcUltn'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CCLN","{handler:'valid_Ccln',iparms:[]");
      setEventMetadata("VALID_CCLN",",oparms:[]}");
      setEventMetadata("VALID_CCLNT","{handler:'valid_Cclnt',iparms:[]");
      setEventMetadata("VALID_CCLNT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cclnop',iparms:[]");
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
      pr_default.close(33);
      pr_default.close(32);
      pr_default.close(34);
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
      Z11296CcLnV = "" ;
      Z11297CcLnFc = GXutil.nullDate() ;
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
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1508 = "" ;
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
      A11296CcLnV = "" ;
      A11297CcLnFc = GXutil.nullDate() ;
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
      T01BI8_A407EmprNom = new String[] {""} ;
      T01BI8_n407EmprNom = new boolean[] {false} ;
      T01BI11_A407EmprNom = new String[] {""} ;
      T01BI11_n407EmprNom = new boolean[] {false} ;
      T01BI11_A4032CCOpeCod = new int[1] ;
      T01BI11_n4032CCOpeCod = new boolean[] {false} ;
      T01BI11_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01BI11_n4033CCFch = new boolean[] {false} ;
      T01BI11_A4405CcDisp = new String[] {""} ;
      T01BI11_n4405CcDisp = new boolean[] {false} ;
      T01BI11_A3281CcObs = new String[] {""} ;
      T01BI11_n3281CcObs = new boolean[] {false} ;
      T01BI11_A11293CcUltn = new short[1] ;
      T01BI11_n11293CcUltn = new boolean[] {false} ;
      T01BI11_A396EmprCod = new String[] {""} ;
      T01BI11_A129BarCod = new int[1] ;
      T01BI11_A132BarCodReo = new byte[1] ;
      T01BI11_A130BarCodPar = new String[] {""} ;
      T01BI11_A758ProCod = new String[] {""} ;
      T01BI11_A194BarOrdLin = new short[1] ;
      T01BI11_A4031CCTCod = new int[1] ;
      T01BI9_A396EmprCod = new String[] {""} ;
      T01BI10_A396EmprCod = new String[] {""} ;
      T01BI12_A396EmprCod = new String[] {""} ;
      T01BI13_A396EmprCod = new String[] {""} ;
      T01BI14_A396EmprCod = new String[] {""} ;
      T01BI14_A129BarCod = new int[1] ;
      T01BI14_A132BarCodReo = new byte[1] ;
      T01BI14_A130BarCodPar = new String[] {""} ;
      T01BI14_A758ProCod = new String[] {""} ;
      T01BI14_A194BarOrdLin = new short[1] ;
      T01BI14_A4031CCTCod = new int[1] ;
      T01BI7_A4032CCOpeCod = new int[1] ;
      T01BI7_n4032CCOpeCod = new boolean[] {false} ;
      T01BI7_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01BI7_n4033CCFch = new boolean[] {false} ;
      T01BI7_A4405CcDisp = new String[] {""} ;
      T01BI7_n4405CcDisp = new boolean[] {false} ;
      T01BI7_A3281CcObs = new String[] {""} ;
      T01BI7_n3281CcObs = new boolean[] {false} ;
      T01BI7_A11293CcUltn = new short[1] ;
      T01BI7_n11293CcUltn = new boolean[] {false} ;
      T01BI7_A396EmprCod = new String[] {""} ;
      T01BI7_A129BarCod = new int[1] ;
      T01BI7_A132BarCodReo = new byte[1] ;
      T01BI7_A130BarCodPar = new String[] {""} ;
      T01BI7_A758ProCod = new String[] {""} ;
      T01BI7_A194BarOrdLin = new short[1] ;
      T01BI7_A4031CCTCod = new int[1] ;
      T01BI15_A396EmprCod = new String[] {""} ;
      T01BI15_A129BarCod = new int[1] ;
      T01BI15_A132BarCodReo = new byte[1] ;
      T01BI15_A130BarCodPar = new String[] {""} ;
      T01BI15_A758ProCod = new String[] {""} ;
      T01BI15_A194BarOrdLin = new short[1] ;
      T01BI15_A4031CCTCod = new int[1] ;
      T01BI16_A396EmprCod = new String[] {""} ;
      T01BI16_A129BarCod = new int[1] ;
      T01BI16_A132BarCodReo = new byte[1] ;
      T01BI16_A130BarCodPar = new String[] {""} ;
      T01BI16_A758ProCod = new String[] {""} ;
      T01BI16_A194BarOrdLin = new short[1] ;
      T01BI16_A4031CCTCod = new int[1] ;
      T01BI6_A4032CCOpeCod = new int[1] ;
      T01BI6_n4032CCOpeCod = new boolean[] {false} ;
      T01BI6_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01BI6_n4033CCFch = new boolean[] {false} ;
      T01BI6_A4405CcDisp = new String[] {""} ;
      T01BI6_n4405CcDisp = new boolean[] {false} ;
      T01BI6_A3281CcObs = new String[] {""} ;
      T01BI6_n3281CcObs = new boolean[] {false} ;
      T01BI6_A11293CcUltn = new short[1] ;
      T01BI6_n11293CcUltn = new boolean[] {false} ;
      T01BI6_A396EmprCod = new String[] {""} ;
      T01BI6_A129BarCod = new int[1] ;
      T01BI6_A132BarCodReo = new byte[1] ;
      T01BI6_A130BarCodPar = new String[] {""} ;
      T01BI6_A758ProCod = new String[] {""} ;
      T01BI6_A194BarOrdLin = new short[1] ;
      T01BI6_A4031CCTCod = new int[1] ;
      T01BI20_A396EmprCod = new String[] {""} ;
      T01BI20_A129BarCod = new int[1] ;
      T01BI20_A132BarCodReo = new byte[1] ;
      T01BI20_A130BarCodPar = new String[] {""} ;
      T01BI20_A758ProCod = new String[] {""} ;
      T01BI20_A194BarOrdLin = new short[1] ;
      T01BI20_A4031CCTCod = new int[1] ;
      T01BI20_A11294CcLn = new short[1] ;
      T01BI21_A396EmprCod = new String[] {""} ;
      T01BI21_A129BarCod = new int[1] ;
      T01BI21_A132BarCodReo = new byte[1] ;
      T01BI21_A130BarCodPar = new String[] {""} ;
      T01BI21_A758ProCod = new String[] {""} ;
      T01BI21_A194BarOrdLin = new short[1] ;
      T01BI21_A4031CCTCod = new int[1] ;
      T01BI21_A4034CCTLin = new short[1] ;
      T01BI22_A396EmprCod = new String[] {""} ;
      T01BI22_A129BarCod = new int[1] ;
      T01BI22_A132BarCodReo = new byte[1] ;
      T01BI22_A130BarCodPar = new String[] {""} ;
      T01BI22_A758ProCod = new String[] {""} ;
      T01BI22_A194BarOrdLin = new short[1] ;
      T01BI22_A4031CCTCod = new int[1] ;
      T01BI23_A129BarCod = new int[1] ;
      T01BI23_A132BarCodReo = new byte[1] ;
      T01BI23_A130BarCodPar = new String[] {""} ;
      T01BI23_A194BarOrdLin = new short[1] ;
      T01BI23_A11294CcLn = new short[1] ;
      T01BI23_A396EmprCod = new String[] {""} ;
      T01BI23_A4031CCTCod = new int[1] ;
      T01BI23_A758ProCod = new String[] {""} ;
      T01BI24_A396EmprCod = new String[] {""} ;
      T01BI24_A129BarCod = new int[1] ;
      T01BI24_A132BarCodReo = new byte[1] ;
      T01BI24_A130BarCodPar = new String[] {""} ;
      T01BI24_A758ProCod = new String[] {""} ;
      T01BI24_A194BarOrdLin = new short[1] ;
      T01BI24_A4031CCTCod = new int[1] ;
      T01BI24_A11294CcLn = new short[1] ;
      T01BI5_A129BarCod = new int[1] ;
      T01BI5_A132BarCodReo = new byte[1] ;
      T01BI5_A130BarCodPar = new String[] {""} ;
      T01BI5_A194BarOrdLin = new short[1] ;
      T01BI5_A11294CcLn = new short[1] ;
      T01BI5_A396EmprCod = new String[] {""} ;
      T01BI5_A4031CCTCod = new int[1] ;
      T01BI5_A758ProCod = new String[] {""} ;
      T01BI4_A129BarCod = new int[1] ;
      T01BI4_A132BarCodReo = new byte[1] ;
      T01BI4_A130BarCodPar = new String[] {""} ;
      T01BI4_A194BarOrdLin = new short[1] ;
      T01BI4_A11294CcLn = new short[1] ;
      T01BI4_A396EmprCod = new String[] {""} ;
      T01BI4_A4031CCTCod = new int[1] ;
      T01BI4_A758ProCod = new String[] {""} ;
      T01BI27_A396EmprCod = new String[] {""} ;
      T01BI27_A129BarCod = new int[1] ;
      T01BI27_A132BarCodReo = new byte[1] ;
      T01BI27_A130BarCodPar = new String[] {""} ;
      T01BI27_A758ProCod = new String[] {""} ;
      T01BI27_A194BarOrdLin = new short[1] ;
      T01BI27_A4031CCTCod = new int[1] ;
      T01BI27_A11294CcLn = new short[1] ;
      T01BI28_A129BarCod = new int[1] ;
      T01BI28_A132BarCodReo = new byte[1] ;
      T01BI28_A130BarCodPar = new String[] {""} ;
      T01BI28_A194BarOrdLin = new short[1] ;
      T01BI28_A11294CcLn = new short[1] ;
      T01BI28_A11295CcLnT = new short[1] ;
      T01BI28_A11296CcLnV = new String[] {""} ;
      T01BI28_n11296CcLnV = new boolean[] {false} ;
      T01BI28_A11297CcLnFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01BI28_n11297CcLnFc = new boolean[] {false} ;
      T01BI28_A11298CcLnOp = new int[1] ;
      T01BI28_n11298CcLnOp = new boolean[] {false} ;
      T01BI28_A396EmprCod = new String[] {""} ;
      T01BI28_A4031CCTCod = new int[1] ;
      T01BI28_A758ProCod = new String[] {""} ;
      T01BI29_A396EmprCod = new String[] {""} ;
      T01BI29_A129BarCod = new int[1] ;
      T01BI29_A132BarCodReo = new byte[1] ;
      T01BI29_A130BarCodPar = new String[] {""} ;
      T01BI29_A758ProCod = new String[] {""} ;
      T01BI29_A194BarOrdLin = new short[1] ;
      T01BI29_A4031CCTCod = new int[1] ;
      T01BI29_A11294CcLn = new short[1] ;
      T01BI29_A11295CcLnT = new short[1] ;
      T01BI3_A129BarCod = new int[1] ;
      T01BI3_A132BarCodReo = new byte[1] ;
      T01BI3_A130BarCodPar = new String[] {""} ;
      T01BI3_A194BarOrdLin = new short[1] ;
      T01BI3_A11294CcLn = new short[1] ;
      T01BI3_A11295CcLnT = new short[1] ;
      T01BI3_A11296CcLnV = new String[] {""} ;
      T01BI3_n11296CcLnV = new boolean[] {false} ;
      T01BI3_A11297CcLnFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01BI3_n11297CcLnFc = new boolean[] {false} ;
      T01BI3_A11298CcLnOp = new int[1] ;
      T01BI3_n11298CcLnOp = new boolean[] {false} ;
      T01BI3_A396EmprCod = new String[] {""} ;
      T01BI3_A4031CCTCod = new int[1] ;
      T01BI3_A758ProCod = new String[] {""} ;
      sMode1509 = "" ;
      T01BI2_A129BarCod = new int[1] ;
      T01BI2_A132BarCodReo = new byte[1] ;
      T01BI2_A130BarCodPar = new String[] {""} ;
      T01BI2_A194BarOrdLin = new short[1] ;
      T01BI2_A11294CcLn = new short[1] ;
      T01BI2_A11295CcLnT = new short[1] ;
      T01BI2_A11296CcLnV = new String[] {""} ;
      T01BI2_n11296CcLnV = new boolean[] {false} ;
      T01BI2_A11297CcLnFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01BI2_n11297CcLnFc = new boolean[] {false} ;
      T01BI2_A11298CcLnOp = new int[1] ;
      T01BI2_n11298CcLnOp = new boolean[] {false} ;
      T01BI2_A396EmprCod = new String[] {""} ;
      T01BI2_A4031CCTCod = new int[1] ;
      T01BI2_A758ProCod = new String[] {""} ;
      T01BI33_A396EmprCod = new String[] {""} ;
      T01BI33_A129BarCod = new int[1] ;
      T01BI33_A132BarCodReo = new byte[1] ;
      T01BI33_A130BarCodPar = new String[] {""} ;
      T01BI33_A758ProCod = new String[] {""} ;
      T01BI33_A194BarOrdLin = new short[1] ;
      T01BI33_A4031CCTCod = new int[1] ;
      T01BI33_A11294CcLn = new short[1] ;
      T01BI33_A11295CcLnT = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock14_Jsonclick = "" ;
      ROClassString = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01BI34_A407EmprNom = new String[] {""} ;
      T01BI34_n407EmprNom = new boolean[] {false} ;
      T01BI35_A396EmprCod = new String[] {""} ;
      T01BI36_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4033CCFch = GXutil.nullDate() ;
      ZZ4405CcDisp = "" ;
      ZZ3281CcObs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccn__default(),
         new Object[] {
             new Object[] {
            T01BI2_A129BarCod, T01BI2_A132BarCodReo, T01BI2_A130BarCodPar, T01BI2_A194BarOrdLin, T01BI2_A11294CcLn, T01BI2_A11295CcLnT, T01BI2_A11296CcLnV, T01BI2_n11296CcLnV, T01BI2_A11297CcLnFc, T01BI2_n11297CcLnFc,
            T01BI2_A11298CcLnOp, T01BI2_n11298CcLnOp, T01BI2_A396EmprCod, T01BI2_A4031CCTCod, T01BI2_A758ProCod
            }
            , new Object[] {
            T01BI3_A129BarCod, T01BI3_A132BarCodReo, T01BI3_A130BarCodPar, T01BI3_A194BarOrdLin, T01BI3_A11294CcLn, T01BI3_A11295CcLnT, T01BI3_A11296CcLnV, T01BI3_n11296CcLnV, T01BI3_A11297CcLnFc, T01BI3_n11297CcLnFc,
            T01BI3_A11298CcLnOp, T01BI3_n11298CcLnOp, T01BI3_A396EmprCod, T01BI3_A4031CCTCod, T01BI3_A758ProCod
            }
            , new Object[] {
            T01BI4_A129BarCod, T01BI4_A132BarCodReo, T01BI4_A130BarCodPar, T01BI4_A194BarOrdLin, T01BI4_A11294CcLn, T01BI4_A396EmprCod, T01BI4_A4031CCTCod, T01BI4_A758ProCod
            }
            , new Object[] {
            T01BI5_A129BarCod, T01BI5_A132BarCodReo, T01BI5_A130BarCodPar, T01BI5_A194BarOrdLin, T01BI5_A11294CcLn, T01BI5_A396EmprCod, T01BI5_A4031CCTCod, T01BI5_A758ProCod
            }
            , new Object[] {
            T01BI6_A4032CCOpeCod, T01BI6_n4032CCOpeCod, T01BI6_A4033CCFch, T01BI6_n4033CCFch, T01BI6_A4405CcDisp, T01BI6_n4405CcDisp, T01BI6_A3281CcObs, T01BI6_n3281CcObs, T01BI6_A11293CcUltn, T01BI6_n11293CcUltn,
            T01BI6_A396EmprCod, T01BI6_A129BarCod, T01BI6_A132BarCodReo, T01BI6_A130BarCodPar, T01BI6_A758ProCod, T01BI6_A194BarOrdLin, T01BI6_A4031CCTCod
            }
            , new Object[] {
            T01BI7_A4032CCOpeCod, T01BI7_n4032CCOpeCod, T01BI7_A4033CCFch, T01BI7_n4033CCFch, T01BI7_A4405CcDisp, T01BI7_n4405CcDisp, T01BI7_A3281CcObs, T01BI7_n3281CcObs, T01BI7_A11293CcUltn, T01BI7_n11293CcUltn,
            T01BI7_A396EmprCod, T01BI7_A129BarCod, T01BI7_A132BarCodReo, T01BI7_A130BarCodPar, T01BI7_A758ProCod, T01BI7_A194BarOrdLin, T01BI7_A4031CCTCod
            }
            , new Object[] {
            T01BI8_A407EmprNom, T01BI8_n407EmprNom
            }
            , new Object[] {
            T01BI9_A396EmprCod
            }
            , new Object[] {
            T01BI10_A396EmprCod
            }
            , new Object[] {
            T01BI11_A407EmprNom, T01BI11_n407EmprNom, T01BI11_A4032CCOpeCod, T01BI11_n4032CCOpeCod, T01BI11_A4033CCFch, T01BI11_n4033CCFch, T01BI11_A4405CcDisp, T01BI11_n4405CcDisp, T01BI11_A3281CcObs, T01BI11_n3281CcObs,
            T01BI11_A11293CcUltn, T01BI11_n11293CcUltn, T01BI11_A396EmprCod, T01BI11_A129BarCod, T01BI11_A132BarCodReo, T01BI11_A130BarCodPar, T01BI11_A758ProCod, T01BI11_A194BarOrdLin, T01BI11_A4031CCTCod
            }
            , new Object[] {
            T01BI12_A396EmprCod
            }
            , new Object[] {
            T01BI13_A396EmprCod
            }
            , new Object[] {
            T01BI14_A396EmprCod, T01BI14_A129BarCod, T01BI14_A132BarCodReo, T01BI14_A130BarCodPar, T01BI14_A758ProCod, T01BI14_A194BarOrdLin, T01BI14_A4031CCTCod
            }
            , new Object[] {
            T01BI15_A396EmprCod, T01BI15_A129BarCod, T01BI15_A132BarCodReo, T01BI15_A130BarCodPar, T01BI15_A758ProCod, T01BI15_A194BarOrdLin, T01BI15_A4031CCTCod
            }
            , new Object[] {
            T01BI16_A396EmprCod, T01BI16_A129BarCod, T01BI16_A132BarCodReo, T01BI16_A130BarCodPar, T01BI16_A758ProCod, T01BI16_A194BarOrdLin, T01BI16_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BI20_A396EmprCod, T01BI20_A129BarCod, T01BI20_A132BarCodReo, T01BI20_A130BarCodPar, T01BI20_A758ProCod, T01BI20_A194BarOrdLin, T01BI20_A4031CCTCod, T01BI20_A11294CcLn
            }
            , new Object[] {
            T01BI21_A396EmprCod, T01BI21_A129BarCod, T01BI21_A132BarCodReo, T01BI21_A130BarCodPar, T01BI21_A758ProCod, T01BI21_A194BarOrdLin, T01BI21_A4031CCTCod, T01BI21_A4034CCTLin
            }
            , new Object[] {
            T01BI22_A396EmprCod, T01BI22_A129BarCod, T01BI22_A132BarCodReo, T01BI22_A130BarCodPar, T01BI22_A758ProCod, T01BI22_A194BarOrdLin, T01BI22_A4031CCTCod
            }
            , new Object[] {
            T01BI23_A129BarCod, T01BI23_A132BarCodReo, T01BI23_A130BarCodPar, T01BI23_A194BarOrdLin, T01BI23_A11294CcLn, T01BI23_A396EmprCod, T01BI23_A4031CCTCod, T01BI23_A758ProCod
            }
            , new Object[] {
            T01BI24_A396EmprCod, T01BI24_A129BarCod, T01BI24_A132BarCodReo, T01BI24_A130BarCodPar, T01BI24_A758ProCod, T01BI24_A194BarOrdLin, T01BI24_A4031CCTCod, T01BI24_A11294CcLn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BI27_A396EmprCod, T01BI27_A129BarCod, T01BI27_A132BarCodReo, T01BI27_A130BarCodPar, T01BI27_A758ProCod, T01BI27_A194BarOrdLin, T01BI27_A4031CCTCod, T01BI27_A11294CcLn
            }
            , new Object[] {
            T01BI28_A129BarCod, T01BI28_A132BarCodReo, T01BI28_A130BarCodPar, T01BI28_A194BarOrdLin, T01BI28_A11294CcLn, T01BI28_A11295CcLnT, T01BI28_A11296CcLnV, T01BI28_n11296CcLnV, T01BI28_A11297CcLnFc, T01BI28_n11297CcLnFc,
            T01BI28_A11298CcLnOp, T01BI28_n11298CcLnOp, T01BI28_A396EmprCod, T01BI28_A4031CCTCod, T01BI28_A758ProCod
            }
            , new Object[] {
            T01BI29_A396EmprCod, T01BI29_A129BarCod, T01BI29_A132BarCodReo, T01BI29_A130BarCodPar, T01BI29_A758ProCod, T01BI29_A194BarOrdLin, T01BI29_A4031CCTCod, T01BI29_A11294CcLn, T01BI29_A11295CcLnT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BI33_A396EmprCod, T01BI33_A129BarCod, T01BI33_A132BarCodReo, T01BI33_A130BarCodPar, T01BI33_A758ProCod, T01BI33_A194BarOrdLin, T01BI33_A4031CCTCod, T01BI33_A11294CcLn, T01BI33_A11295CcLnT
            }
            , new Object[] {
            T01BI34_A407EmprNom, T01BI34_n407EmprNom
            }
            , new Object[] {
            T01BI35_A396EmprCod
            }
            , new Object[] {
            T01BI36_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z194BarOrdLin ;
   private short Z11293CcUltn ;
   private short Z11294CcLn ;
   private short nRcdDeleted_1508 ;
   private short nRcdExists_1508 ;
   private short nIsMod_1508 ;
   private short Z11295CcLnT ;
   private short nRcdDeleted_1509 ;
   private short nRcdExists_1509 ;
   private short nIsMod_1509 ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11293CcUltn ;
   private short nBlankRcdCount1508 ;
   private short RcdFound1508 ;
   private short nBlankRcdUsr1508 ;
   private short RcdFound1509 ;
   private short A11295CcLnT ;
   private short A11294CcLn ;
   private short RcdFound619 ;
   private short nIsDirty_619 ;
   private short nIsDirty_1508 ;
   private short nIsDirty_1509 ;
   private short nBlankRcdCount1509 ;
   private short nBlankRcdUsr1509 ;
   private short subGrid1_Borderwidth ;
   private short ZZ194BarOrdLin ;
   private short ZZ11293CcUltn ;
   private int Z129BarCod ;
   private int Z4031CCTCod ;
   private int Z4032CCOpeCod ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
   private int nRC_GXsfl_97 ;
   private int nGXsfl_97_idx=1 ;
   private int Z11298CcLnOp ;
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
   private int edtCcUltn_Enabled ;
   private int edtCcLn_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1509_Enabled ;
   private int A11298CcLnOp ;
   private int edtCcLnT_Enabled ;
   private int edtCcLnV_Enabled ;
   private int edtCcLnFc_Enabled ;
   private int edtCcLnOp_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtCcLnT_Enabled ;
   private int defedtCcLn_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtCcUltn_Backcolor ;
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
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z4405CcDisp ;
   private String Z11296CcLnV ;
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
   private String sGXsfl_85_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_97_idx="0001" ;
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
   private String edtCcUltn_Internalname ;
   private String edtCcUltn_Jsonclick ;
   private String sMode1508 ;
   private String edtCcLn_Internalname ;
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
   private String edtavnRcdDeleted_1509_Internalname ;
   private String sMode619 ;
   private String GXCCtl ;
   private String edtCcLnT_Internalname ;
   private String edtCcLnV_Internalname ;
   private String A11296CcLnV ;
   private String edtCcLnFc_Internalname ;
   private String edtCcLnOp_Internalname ;
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
   private String sMode1509 ;
   private String lblTextblock14_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String ROClassString ;
   private String edtCcLn_Jsonclick ;
   private String sGXsfl_97_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1509_Jsonclick ;
   private String edtCcLnT_Jsonclick ;
   private String edtCcLnV_Jsonclick ;
   private String edtCcLnFc_Jsonclick ;
   private String edtCcLnOp_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock14_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ4405CcDisp ;
   private java.util.Date Z4033CCFch ;
   private java.util.Date Z11297CcLnFc ;
   private java.util.Date A4033CCFch ;
   private java.util.Date A11297CcLnFc ;
   private java.util.Date ZZ4033CCFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4032CCOpeCod ;
   private boolean n4033CCFch ;
   private boolean n4405CcDisp ;
   private boolean n3281CcObs ;
   private boolean n11293CcUltn ;
   private boolean bGXsfl_97_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n11296CcLnV ;
   private boolean n11297CcLnFc ;
   private boolean n11298CcLnOp ;
   private String Z3281CcObs ;
   private String A3281CcObs ;
   private String ZZ3281CcObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01BI8_A407EmprNom ;
   private boolean[] T01BI8_n407EmprNom ;
   private String[] T01BI11_A407EmprNom ;
   private boolean[] T01BI11_n407EmprNom ;
   private int[] T01BI11_A4032CCOpeCod ;
   private boolean[] T01BI11_n4032CCOpeCod ;
   private java.util.Date[] T01BI11_A4033CCFch ;
   private boolean[] T01BI11_n4033CCFch ;
   private String[] T01BI11_A4405CcDisp ;
   private boolean[] T01BI11_n4405CcDisp ;
   private String[] T01BI11_A3281CcObs ;
   private boolean[] T01BI11_n3281CcObs ;
   private short[] T01BI11_A11293CcUltn ;
   private boolean[] T01BI11_n11293CcUltn ;
   private String[] T01BI11_A396EmprCod ;
   private int[] T01BI11_A129BarCod ;
   private byte[] T01BI11_A132BarCodReo ;
   private String[] T01BI11_A130BarCodPar ;
   private String[] T01BI11_A758ProCod ;
   private short[] T01BI11_A194BarOrdLin ;
   private int[] T01BI11_A4031CCTCod ;
   private String[] T01BI9_A396EmprCod ;
   private String[] T01BI10_A396EmprCod ;
   private String[] T01BI12_A396EmprCod ;
   private String[] T01BI13_A396EmprCod ;
   private String[] T01BI14_A396EmprCod ;
   private int[] T01BI14_A129BarCod ;
   private byte[] T01BI14_A132BarCodReo ;
   private String[] T01BI14_A130BarCodPar ;
   private String[] T01BI14_A758ProCod ;
   private short[] T01BI14_A194BarOrdLin ;
   private int[] T01BI14_A4031CCTCod ;
   private int[] T01BI7_A4032CCOpeCod ;
   private boolean[] T01BI7_n4032CCOpeCod ;
   private java.util.Date[] T01BI7_A4033CCFch ;
   private boolean[] T01BI7_n4033CCFch ;
   private String[] T01BI7_A4405CcDisp ;
   private boolean[] T01BI7_n4405CcDisp ;
   private String[] T01BI7_A3281CcObs ;
   private boolean[] T01BI7_n3281CcObs ;
   private short[] T01BI7_A11293CcUltn ;
   private boolean[] T01BI7_n11293CcUltn ;
   private String[] T01BI7_A396EmprCod ;
   private int[] T01BI7_A129BarCod ;
   private byte[] T01BI7_A132BarCodReo ;
   private String[] T01BI7_A130BarCodPar ;
   private String[] T01BI7_A758ProCod ;
   private short[] T01BI7_A194BarOrdLin ;
   private int[] T01BI7_A4031CCTCod ;
   private String[] T01BI15_A396EmprCod ;
   private int[] T01BI15_A129BarCod ;
   private byte[] T01BI15_A132BarCodReo ;
   private String[] T01BI15_A130BarCodPar ;
   private String[] T01BI15_A758ProCod ;
   private short[] T01BI15_A194BarOrdLin ;
   private int[] T01BI15_A4031CCTCod ;
   private String[] T01BI16_A396EmprCod ;
   private int[] T01BI16_A129BarCod ;
   private byte[] T01BI16_A132BarCodReo ;
   private String[] T01BI16_A130BarCodPar ;
   private String[] T01BI16_A758ProCod ;
   private short[] T01BI16_A194BarOrdLin ;
   private int[] T01BI16_A4031CCTCod ;
   private int[] T01BI6_A4032CCOpeCod ;
   private boolean[] T01BI6_n4032CCOpeCod ;
   private java.util.Date[] T01BI6_A4033CCFch ;
   private boolean[] T01BI6_n4033CCFch ;
   private String[] T01BI6_A4405CcDisp ;
   private boolean[] T01BI6_n4405CcDisp ;
   private String[] T01BI6_A3281CcObs ;
   private boolean[] T01BI6_n3281CcObs ;
   private short[] T01BI6_A11293CcUltn ;
   private boolean[] T01BI6_n11293CcUltn ;
   private String[] T01BI6_A396EmprCod ;
   private int[] T01BI6_A129BarCod ;
   private byte[] T01BI6_A132BarCodReo ;
   private String[] T01BI6_A130BarCodPar ;
   private String[] T01BI6_A758ProCod ;
   private short[] T01BI6_A194BarOrdLin ;
   private int[] T01BI6_A4031CCTCod ;
   private String[] T01BI20_A396EmprCod ;
   private int[] T01BI20_A129BarCod ;
   private byte[] T01BI20_A132BarCodReo ;
   private String[] T01BI20_A130BarCodPar ;
   private String[] T01BI20_A758ProCod ;
   private short[] T01BI20_A194BarOrdLin ;
   private int[] T01BI20_A4031CCTCod ;
   private short[] T01BI20_A11294CcLn ;
   private String[] T01BI21_A396EmprCod ;
   private int[] T01BI21_A129BarCod ;
   private byte[] T01BI21_A132BarCodReo ;
   private String[] T01BI21_A130BarCodPar ;
   private String[] T01BI21_A758ProCod ;
   private short[] T01BI21_A194BarOrdLin ;
   private int[] T01BI21_A4031CCTCod ;
   private short[] T01BI21_A4034CCTLin ;
   private String[] T01BI22_A396EmprCod ;
   private int[] T01BI22_A129BarCod ;
   private byte[] T01BI22_A132BarCodReo ;
   private String[] T01BI22_A130BarCodPar ;
   private String[] T01BI22_A758ProCod ;
   private short[] T01BI22_A194BarOrdLin ;
   private int[] T01BI22_A4031CCTCod ;
   private int[] T01BI23_A129BarCod ;
   private byte[] T01BI23_A132BarCodReo ;
   private String[] T01BI23_A130BarCodPar ;
   private short[] T01BI23_A194BarOrdLin ;
   private short[] T01BI23_A11294CcLn ;
   private String[] T01BI23_A396EmprCod ;
   private int[] T01BI23_A4031CCTCod ;
   private String[] T01BI23_A758ProCod ;
   private String[] T01BI24_A396EmprCod ;
   private int[] T01BI24_A129BarCod ;
   private byte[] T01BI24_A132BarCodReo ;
   private String[] T01BI24_A130BarCodPar ;
   private String[] T01BI24_A758ProCod ;
   private short[] T01BI24_A194BarOrdLin ;
   private int[] T01BI24_A4031CCTCod ;
   private short[] T01BI24_A11294CcLn ;
   private int[] T01BI5_A129BarCod ;
   private byte[] T01BI5_A132BarCodReo ;
   private String[] T01BI5_A130BarCodPar ;
   private short[] T01BI5_A194BarOrdLin ;
   private short[] T01BI5_A11294CcLn ;
   private String[] T01BI5_A396EmprCod ;
   private int[] T01BI5_A4031CCTCod ;
   private String[] T01BI5_A758ProCod ;
   private int[] T01BI4_A129BarCod ;
   private byte[] T01BI4_A132BarCodReo ;
   private String[] T01BI4_A130BarCodPar ;
   private short[] T01BI4_A194BarOrdLin ;
   private short[] T01BI4_A11294CcLn ;
   private String[] T01BI4_A396EmprCod ;
   private int[] T01BI4_A4031CCTCod ;
   private String[] T01BI4_A758ProCod ;
   private String[] T01BI27_A396EmprCod ;
   private int[] T01BI27_A129BarCod ;
   private byte[] T01BI27_A132BarCodReo ;
   private String[] T01BI27_A130BarCodPar ;
   private String[] T01BI27_A758ProCod ;
   private short[] T01BI27_A194BarOrdLin ;
   private int[] T01BI27_A4031CCTCod ;
   private short[] T01BI27_A11294CcLn ;
   private int[] T01BI28_A129BarCod ;
   private byte[] T01BI28_A132BarCodReo ;
   private String[] T01BI28_A130BarCodPar ;
   private short[] T01BI28_A194BarOrdLin ;
   private short[] T01BI28_A11294CcLn ;
   private short[] T01BI28_A11295CcLnT ;
   private String[] T01BI28_A11296CcLnV ;
   private boolean[] T01BI28_n11296CcLnV ;
   private java.util.Date[] T01BI28_A11297CcLnFc ;
   private boolean[] T01BI28_n11297CcLnFc ;
   private int[] T01BI28_A11298CcLnOp ;
   private boolean[] T01BI28_n11298CcLnOp ;
   private String[] T01BI28_A396EmprCod ;
   private int[] T01BI28_A4031CCTCod ;
   private String[] T01BI28_A758ProCod ;
   private String[] T01BI29_A396EmprCod ;
   private int[] T01BI29_A129BarCod ;
   private byte[] T01BI29_A132BarCodReo ;
   private String[] T01BI29_A130BarCodPar ;
   private String[] T01BI29_A758ProCod ;
   private short[] T01BI29_A194BarOrdLin ;
   private int[] T01BI29_A4031CCTCod ;
   private short[] T01BI29_A11294CcLn ;
   private short[] T01BI29_A11295CcLnT ;
   private int[] T01BI3_A129BarCod ;
   private byte[] T01BI3_A132BarCodReo ;
   private String[] T01BI3_A130BarCodPar ;
   private short[] T01BI3_A194BarOrdLin ;
   private short[] T01BI3_A11294CcLn ;
   private short[] T01BI3_A11295CcLnT ;
   private String[] T01BI3_A11296CcLnV ;
   private boolean[] T01BI3_n11296CcLnV ;
   private java.util.Date[] T01BI3_A11297CcLnFc ;
   private boolean[] T01BI3_n11297CcLnFc ;
   private int[] T01BI3_A11298CcLnOp ;
   private boolean[] T01BI3_n11298CcLnOp ;
   private String[] T01BI3_A396EmprCod ;
   private int[] T01BI3_A4031CCTCod ;
   private String[] T01BI3_A758ProCod ;
   private int[] T01BI2_A129BarCod ;
   private byte[] T01BI2_A132BarCodReo ;
   private String[] T01BI2_A130BarCodPar ;
   private short[] T01BI2_A194BarOrdLin ;
   private short[] T01BI2_A11294CcLn ;
   private short[] T01BI2_A11295CcLnT ;
   private String[] T01BI2_A11296CcLnV ;
   private boolean[] T01BI2_n11296CcLnV ;
   private java.util.Date[] T01BI2_A11297CcLnFc ;
   private boolean[] T01BI2_n11297CcLnFc ;
   private int[] T01BI2_A11298CcLnOp ;
   private boolean[] T01BI2_n11298CcLnOp ;
   private String[] T01BI2_A396EmprCod ;
   private int[] T01BI2_A4031CCTCod ;
   private String[] T01BI2_A758ProCod ;
   private String[] T01BI33_A396EmprCod ;
   private int[] T01BI33_A129BarCod ;
   private byte[] T01BI33_A132BarCodReo ;
   private String[] T01BI33_A130BarCodPar ;
   private String[] T01BI33_A758ProCod ;
   private short[] T01BI33_A194BarOrdLin ;
   private int[] T01BI33_A4031CCTCod ;
   private short[] T01BI33_A11294CcLn ;
   private short[] T01BI33_A11295CcLnT ;
   private String[] T01BI34_A407EmprNom ;
   private boolean[] T01BI34_n407EmprNom ;
   private String[] T01BI35_A396EmprCod ;
   private String[] T01BI36_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tccn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BI2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, CcLnT, CcLnV, CcLnFc, CcLnOp, EmprCod, CCTCod, ProCod FROM TXPCCnT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ?  FOR UPDATE OF CcLnV, CcLnFc, CcLnOp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, CcLnT, CcLnV, CcLnFc, CcLnOp, EmprCod, CCTCod, ProCod FROM TXPCCnT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI4", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, EmprCod, CCTCod, ProCod FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ?  FOR UPDATE OF BarCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI5", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, EmprCod, CCTCod, ProCod FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI6", "SELECT CCOpeCod, CCFch, CcDisp, CcObs, CcUltn, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?  FOR UPDATE OF CCOpeCod, CCFch, CcDisp, CcObs, CcUltn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI7", "SELECT CCOpeCod, CCFch, CcDisp, CcObs, CcUltn, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI9", "SELECT EmprCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI10", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI11", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, TM1.CCOpeCod, TM1.CCFch, TM1.CcDisp, TM1.CcObs, TM1.CcUltn, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod FROM (TXPCC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.CCTCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI12", "SELECT EmprCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI13", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and ProCod > ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarOrdLin > ? or BarOrdLin = ? and ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and CCTCod > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BI16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and ProCod < ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarOrdLin < ? or BarOrdLin = ? and ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and CCTCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BI17", "INSERT INTO TXPCC(CCOpeCod, CCFch, CcDisp, CcObs, CcUltn, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCFchUti, CCOk, CCOkFch, CCOkUsu, CCobs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T01BI18", "UPDATE TXPCC SET CCOpeCod=?, CCFch=?, CcDisp=?, CcObs=?, CcUltn=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T01BI19", "DELETE FROM TXPCC  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new ForEachCursor("T01BI20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BI21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BI22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI23", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, EmprCod, CCTCod, ProCod FROM TXPCCn WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI24", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BI25", "INSERT INTO TXPCCn(BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, EmprCod, CCTCod, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCn")
         ,new UpdateCursor("T01BI26", "DELETE FROM TXPCCn  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ?", GX_NOMASK, "TXPCCn")
         ,new ForEachCursor("T01BI27", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI28", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, CcLnT, CcLnV, CcLnFc, CcLnOp, EmprCod, CCTCod, ProCod FROM TXPCCnT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? and CcLnT = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI29", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT FROM TXPCCnT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BI30", "INSERT INTO TXPCCnT(BarCod, BarCodReo, BarCodPar, BarOrdLin, CcLn, CcLnT, CcLnV, CcLnFc, CcLnOp, EmprCod, CCTCod, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCnT")
         ,new UpdateCursor("T01BI31", "UPDATE TXPCCnT SET CcLnV=?, CcLnFc=?, CcLnOp=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ?", GX_NOMASK, "TXPCCnT")
         ,new UpdateCursor("T01BI32", "DELETE FROM TXPCCnT  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ?", GX_NOMASK, "TXPCCnT")
         ,new ForEachCursor("T01BI33", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT FROM TXPCCnT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI35", "SELECT EmprCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BI36", "SELECT EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 3);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((String[]) buf[14])[0] = rslt.getString(10, 8);
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 3);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((String[]) buf[14])[0] = rslt.getString(10, 8);
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
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
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 3);
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 1);
               ((String[]) buf[16])[0] = rslt.getString(11, 8);
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((int[]) buf[18])[0] = rslt.getInt(13);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 22 :
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 34 :
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
               stmt.setShort(9, ((Number) parms[8]).shortValue());
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
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 16 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[11]).intValue());
               }
               stmt.setString(10, (String)parms[12], 3);
               stmt.setInt(11, ((Number) parms[13]).intValue());
               stmt.setString(12, (String)parms[14], 8);
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
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
               stmt.setString(8, (String)parms[10], 8);
               stmt.setShort(9, ((Number) parms[11]).shortValue());
               stmt.setInt(10, ((Number) parms[12]).intValue());
               stmt.setShort(11, ((Number) parms[13]).shortValue());
               stmt.setShort(12, ((Number) parms[14]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

