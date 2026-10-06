package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class texmvhd_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A2248ManCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A361DisCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MOVIMIENTOS HDR's, TRABAJ EXT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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

   public texmvhd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public texmvhd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( texmvhd_impl.class ));
   }

   public texmvhd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TEXMVHD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtManCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "", "", "", "", "", 1, edtManCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Operacion (=FasCod)", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtExHdrFas_Internalname, GXutil.rtrim( A2689ExHdrFas), GXutil.rtrim( localUtil.format( A2689ExHdrFas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExHdrFas_Jsonclick, 0, "", "", "", "", "", 1, edtExHdrFas_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Manuf", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtManNom_Internalname, GXutil.rtrim( A2249ManNom), GXutil.rtrim( localUtil.format( A2249ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManNom_Jsonclick, 0, "", "", "", "", "", 1, edtManNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Desc Operacion(=FasDsc)", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtExHdrFdc_Internalname, GXutil.rtrim( A2690ExHdrFdc), GXutil.rtrim( localUtil.format( A2690ExHdrFdc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExHdrFdc_Jsonclick, 0, "", "", "", "", "", 1, edtExHdrFdc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtExHdrUln_Internalname, GXutil.ltrim( localUtil.ntoc( A2691ExHdrUln, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtExHdrUln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2691ExHdrUln), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2691ExHdrUln), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExHdrUln_Jsonclick, 0, "", "", "", "", "", 1, edtExHdrUln_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXMVHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount382 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_382 = (short)(1) ;
            scanStart98382( ) ;
            while ( RcdFound382 != 0 )
            {
               init_level_properties382( ) ;
               getByPrimaryKey98382( ) ;
               addRow98382( ) ;
               scanNext98382( ) ;
            }
            scanEnd98382( ) ;
            nBlankRcdCount382 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal98382( ) ;
         standaloneModal98382( ) ;
         sMode382 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow98382( ) ;
            edtavnRcdDeleted_382_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_382_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_382_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_382_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRTIP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrTip_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPartCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPartCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarNMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNMTR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNMtr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarNumTen_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMTEN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumTen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumTen_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrAlb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRALB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrAlb_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrKgE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRKGE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrKgE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrKgE_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrCnE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRCNE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrCnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrCnE_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrFeE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRFEE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrFeE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrFeE_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrKgR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRKGR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrKgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrKgR_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrCnR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRCNR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrCnR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrCnR_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrFeR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRFER_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrFeR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrFeR_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrKRe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRKRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrKRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrKRe_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrCRe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRCRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrCRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrCRe_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRLOC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrLoc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrExL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDREXL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrExL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrExL_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRTIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrTin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtExHdrCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRCLI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExHdrCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrCli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_382 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal98382( ) ;
            }
            sendRow98382( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode382 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount382 = (short)(5) ;
         nRcdExists_382 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart98382( ) ;
            while ( RcdFound382 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_55382( ) ;
               init_level_properties382( ) ;
               standaloneNotModal98382( ) ;
               getByPrimaryKey98382( ) ;
               standaloneModal98382( ) ;
               addRow98382( ) ;
               scanNext98382( ) ;
            }
            scanEnd98382( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode382 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_55382( ) ;
      initAll98382( ) ;
      init_level_properties382( ) ;
      nRcdExists_382 = (short)(0) ;
      nIsMod_382 = (short)(0) ;
      nRcdDeleted_382 = (short)(0) ;
      nBlankRcdCount382 = (short)(nBlankRcdUsr382+nBlankRcdCount382) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount382 > 0 )
      {
         standaloneNotModal98382( ) ;
         standaloneModal98382( ) ;
         addRow98382( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtExHdrLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount382 = (short)(nBlankRcdCount382-1) ;
      }
      Gx_mode = sMode382 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXMVHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TEXMVHD.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2689ExHdrFas = httpContext.cgiGet( "Z2689ExHdrFas") ;
         Z2690ExHdrFdc = httpContext.cgiGet( "Z2690ExHdrFdc") ;
         Z2691ExHdrUln = (int)(localUtil.ctol( httpContext.cgiGet( "Z2691ExHdrUln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtManCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2248ManCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         else
         {
            A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         A2689ExHdrFas = httpContext.cgiGet( edtExHdrFas_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
         n2249ManNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A2690ExHdrFdc = httpContext.cgiGet( edtExHdrFdc_Internalname) ;
         n2690ExHdrFdc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2690ExHdrFdc", A2690ExHdrFdc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrUln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrUln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EXHDRULN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtExHdrUln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2691ExHdrUln = 0 ;
            n2691ExHdrUln = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2691ExHdrUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2691ExHdrUln), 8, 0));
         }
         else
         {
            A2691ExHdrUln = (int)(localUtil.ctol( httpContext.cgiGet( edtExHdrUln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2691ExHdrUln = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2691ExHdrUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2691ExHdrUln), 8, 0));
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
            A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2689ExHdrFas = httpContext.GetPar( "ExHdrFas") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll98381( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_382_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_382_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes98381( ) ;
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

   public void confirm_980( )
   {
      beforeValidate98381( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls98381( ) ;
         }
         else
         {
            checkExtendedTable98381( ) ;
            if ( AnyError == 0 )
            {
               zm98381( 2) ;
               zm98381( 3) ;
            }
            closeExtendedTableCursors98381( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode381 = Gx_mode ;
         confirm_98382( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode381 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode381 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues980( ) ;
      }
   }

   public void confirm_98382( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow98382( ) ;
         if ( ( nRcdExists_382 != 0 ) || ( nIsMod_382 != 0 ) )
         {
            getKey98382( ) ;
            if ( ( nRcdExists_382 == 0 ) && ( nRcdDeleted_382 == 0 ) )
            {
               if ( RcdFound382 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate98382( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable98382( ) ;
                     if ( AnyError == 0 )
                     {
                        zm98382( 5) ;
                        zm98382( 6) ;
                     }
                     closeExtendedTableCursors98382( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "EXHDRLIN_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtExHdrLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound382 != 0 )
               {
                  if ( nRcdDeleted_382 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey98382( ) ;
                     load98382( ) ;
                     beforeValidate98382( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls98382( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_382 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate98382( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable98382( ) ;
                           if ( AnyError == 0 )
                           {
                              zm98382( 5) ;
                              zm98382( 6) ;
                           }
                           closeExtendedTableCursors98382( ) ;
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
                  if ( nRcdDeleted_382 == 0 )
                  {
                     GXCCtl = "EXHDRLIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtExHdrLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_382_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2692ExHdrLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrTip_Internalname, GXutil.rtrim( A2693ExHdrTip)) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtPartCod_Internalname, GXutil.rtrim( A966PartCod)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNMtr_Internalname, GXutil.rtrim( A1500BarNMtr)) ;
         httpContext.changePostValue( edtBarNumTen_Internalname, GXutil.rtrim( A1878BarNumTen)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2694ExHdrAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrKgE_Internalname, GXutil.ltrim( localUtil.ntoc( A2695ExHdrKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrCnE_Internalname, GXutil.ltrim( localUtil.ntoc( A2696ExHdrCnE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrFeE_Internalname, localUtil.format(A2697ExHdrFeE, "99/99/99")) ;
         httpContext.changePostValue( edtExHdrKgR_Internalname, GXutil.ltrim( localUtil.ntoc( A2698ExHdrKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrCnR_Internalname, GXutil.ltrim( localUtil.ntoc( A2699ExHdrCnR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrFeR_Internalname, localUtil.format(A2700ExHdrFeR, "99/99/99")) ;
         httpContext.changePostValue( edtExHdrKRe_Internalname, GXutil.ltrim( localUtil.ntoc( A2701ExHdrKRe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrCRe_Internalname, GXutil.ltrim( localUtil.ntoc( A2702ExHdrCRe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrLoc_Internalname, GXutil.rtrim( A2703ExHdrLoc)) ;
         httpContext.changePostValue( edtExHdrExL_Internalname, GXutil.ltrim( localUtil.ntoc( A2704ExHdrExL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrTin_Internalname, GXutil.rtrim( A2705ExHdrTin)) ;
         httpContext.changePostValue( edtExHdrCli_Internalname, GXutil.ltrim( localUtil.ntoc( A2706ExHdrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2692ExHdrLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2692ExHdrLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2693ExHdrTip_"+sGXsfl_55_idx, GXutil.rtrim( Z2693ExHdrTip)) ;
         httpContext.changePostValue( "ZT_"+"Z2694ExHdrAlb_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2694ExHdrAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2695ExHdrKgE_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2695ExHdrKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2696ExHdrCnE_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2696ExHdrCnE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2697ExHdrFeE_"+sGXsfl_55_idx, localUtil.dtoc( Z2697ExHdrFeE, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z2698ExHdrKgR_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2698ExHdrKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2699ExHdrCnR_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2699ExHdrCnR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2700ExHdrFeR_"+sGXsfl_55_idx, localUtil.dtoc( Z2700ExHdrFeR, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z2701ExHdrKRe_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2701ExHdrKRe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2702ExHdrCRe_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2702ExHdrCRe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2703ExHdrLoc_"+sGXsfl_55_idx, GXutil.rtrim( Z2703ExHdrLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z2704ExHdrExL_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2704ExHdrExL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2705ExHdrTin_"+sGXsfl_55_idx, GXutil.rtrim( Z2705ExHdrTin)) ;
         httpContext.changePostValue( "ZT_"+"Z2706ExHdrCli_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2706ExHdrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "nRcdDeleted_382_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_382_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_382_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_382 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_382_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_382_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMTEN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTen_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRALB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrAlb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRKGE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKgE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRCNE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCnE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRFEE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrFeE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRKGR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKgR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRCNR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCnR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRFER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrFeR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRKRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKRe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRCRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCRe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRLOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDREXL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrExL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRTIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRCLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption980( )
   {
   }

   public void zm98381( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2690ExHdrFdc = T00987_A2690ExHdrFdc[0] ;
            Z2691ExHdrUln = T00987_A2691ExHdrUln[0] ;
         }
         else
         {
            Z2690ExHdrFdc = A2690ExHdrFdc ;
            Z2691ExHdrUln = A2691ExHdrUln ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z2689ExHdrFas = A2689ExHdrFas ;
         Z2690ExHdrFdc = A2690ExHdrFdc ;
         Z2691ExHdrUln = A2691ExHdrUln ;
         Z396EmprCod = A396EmprCod ;
         Z2248ManCod = A2248ManCod ;
         Z407EmprNom = A407EmprNom ;
         Z2249ManNom = A2249ManNom ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load98381( )
   {
      /* Using cursor T009810 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound381 = (short)(1) ;
         A407EmprNom = T009810_A407EmprNom[0] ;
         n407EmprNom = T009810_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2249ManNom = T009810_A2249ManNom[0] ;
         n2249ManNom = T009810_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A2690ExHdrFdc = T009810_A2690ExHdrFdc[0] ;
         n2690ExHdrFdc = T009810_n2690ExHdrFdc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2690ExHdrFdc", A2690ExHdrFdc);
         A2691ExHdrUln = T009810_A2691ExHdrUln[0] ;
         n2691ExHdrUln = T009810_n2691ExHdrUln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2691ExHdrUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2691ExHdrUln), 8, 0));
         zm98381( -1) ;
      }
      pr_default.close(8);
      onLoadActions98381( ) ;
   }

   public void onLoadActions98381( )
   {
   }

   public void checkExtendedTable98381( )
   {
      nIsDirty_381 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00988 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00988_A407EmprNom[0] ;
      n407EmprNom = T00988_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T00989 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T00989_A2249ManNom[0] ;
      n2249ManNom = T00989_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      pr_default.close(7);
   }

   public void closeExtendedTableCursors98381( )
   {
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T009811 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T009811_A407EmprNom[0] ;
      n407EmprNom = T009811_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_3( String A396EmprCod ,
                         short A2248ManCod )
   {
      /* Using cursor T009812 */
      pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T009812_A2249ManNom[0] ;
      n2249ManNom = T009812_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2249ManNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey98381( )
   {
      /* Using cursor T009813 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound381 = (short)(1) ;
      }
      else
      {
         RcdFound381 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00987 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm98381( 1) ;
         RcdFound381 = (short)(1) ;
         A2689ExHdrFas = T00987_A2689ExHdrFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
         A2690ExHdrFdc = T00987_A2690ExHdrFdc[0] ;
         n2690ExHdrFdc = T00987_n2690ExHdrFdc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2690ExHdrFdc", A2690ExHdrFdc);
         A2691ExHdrUln = T00987_A2691ExHdrUln[0] ;
         n2691ExHdrUln = T00987_n2691ExHdrUln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2691ExHdrUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2691ExHdrUln), 8, 0));
         A396EmprCod = T00987_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = T00987_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z2248ManCod = A2248ManCod ;
         Z2689ExHdrFas = A2689ExHdrFas ;
         sMode381 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load98381( ) ;
         if ( AnyError == 1 )
         {
            RcdFound381 = (short)(0) ;
            initializeNonKey98381( ) ;
         }
         Gx_mode = sMode381 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound381 = (short)(0) ;
         initializeNonKey98381( ) ;
         sMode381 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode381 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey98381( ) ;
      if ( RcdFound381 == 0 )
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
      RcdFound381 = (short)(0) ;
      /* Using cursor T009814 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A2248ManCod), Short.valueOf(A2248ManCod), A396EmprCod, A2689ExHdrFas});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T009814_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T009814_A396EmprCod[0], A396EmprCod) == 0 ) && ( T009814_A2248ManCod[0] < A2248ManCod ) || ( T009814_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T009814_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T009814_A2689ExHdrFas[0], A2689ExHdrFas) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T009814_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T009814_A396EmprCod[0], A396EmprCod) == 0 ) && ( T009814_A2248ManCod[0] > A2248ManCod ) || ( T009814_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T009814_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T009814_A2689ExHdrFas[0], A2689ExHdrFas) > 0 ) ) )
         {
            A396EmprCod = T009814_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2248ManCod = T009814_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2689ExHdrFas = T009814_A2689ExHdrFas[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
            RcdFound381 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound381 = (short)(0) ;
      /* Using cursor T009815 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A2248ManCod), Short.valueOf(A2248ManCod), A396EmprCod, A2689ExHdrFas});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T009815_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T009815_A396EmprCod[0], A396EmprCod) == 0 ) && ( T009815_A2248ManCod[0] > A2248ManCod ) || ( T009815_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T009815_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T009815_A2689ExHdrFas[0], A2689ExHdrFas) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T009815_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T009815_A396EmprCod[0], A396EmprCod) == 0 ) && ( T009815_A2248ManCod[0] < A2248ManCod ) || ( T009815_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T009815_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T009815_A2689ExHdrFas[0], A2689ExHdrFas) < 0 ) ) )
         {
            A396EmprCod = T009815_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2248ManCod = T009815_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2689ExHdrFas = T009815_A2689ExHdrFas[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
            RcdFound381 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey98381( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert98381( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound381 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || ( GXutil.strcmp(A2689ExHdrFas, Z2689ExHdrFas) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2248ManCod = Z2248ManCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
               A2689ExHdrFas = Z2689ExHdrFas ;
               httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update98381( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || ( GXutil.strcmp(A2689ExHdrFas, Z2689ExHdrFas) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert98381( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert98381( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || ( GXutil.strcmp(A2689ExHdrFas, Z2689ExHdrFas) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = Z2248ManCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2689ExHdrFas = Z2689ExHdrFas ;
         httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey98381( ) ;
      if ( RcdFound381 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || ( GXutil.strcmp(A2689ExHdrFas, Z2689ExHdrFas) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2248ManCod = Z2248ManCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2689ExHdrFas = Z2689ExHdrFas ;
            httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || ( GXutil.strcmp(A2689ExHdrFas, Z2689ExHdrFas) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "texmvhd");
      GX_FocusControl = edtExHdrFdc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_980( ) ;
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
      if ( RcdFound381 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtExHdrFdc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart98381( ) ;
      if ( RcdFound381 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtExHdrFdc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd98381( ) ;
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
      if ( RcdFound381 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtExHdrFdc_Internalname ;
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
      if ( RcdFound381 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtExHdrFdc_Internalname ;
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
      scanStart98381( ) ;
      if ( RcdFound381 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound381 != 0 )
         {
            scanNext98381( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtExHdrFdc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd98381( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency98381( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00986 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXMVH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z2690ExHdrFdc, T00986_A2690ExHdrFdc[0]) != 0 ) || ( Z2691ExHdrUln != T00986_A2691ExHdrUln[0] ) )
         {
            if ( GXutil.strcmp(Z2690ExHdrFdc, T00986_A2690ExHdrFdc[0]) != 0 )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrFdc");
               GXutil.writeLogRaw("Old: ",Z2690ExHdrFdc);
               GXutil.writeLogRaw("Current: ",T00986_A2690ExHdrFdc[0]);
            }
            if ( Z2691ExHdrUln != T00986_A2691ExHdrUln[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrUln");
               GXutil.writeLogRaw("Old: ",Z2691ExHdrUln);
               GXutil.writeLogRaw("Current: ",T00986_A2691ExHdrUln[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCEXMVH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert98381( )
   {
      beforeValidate98381( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable98381( ) ;
      }
      if ( AnyError == 0 )
      {
         zm98381( 0) ;
         checkOptimisticConcurrency98381( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm98381( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert98381( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T009816 */
                  pr_default.execute(14, new Object[] {A2689ExHdrFas, Boolean.valueOf(n2690ExHdrFdc), A2690ExHdrFdc, Boolean.valueOf(n2691ExHdrUln), Integer.valueOf(A2691ExHdrUln), A396EmprCod, Short.valueOf(A2248ManCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVH");
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
                        processLevel98381( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption980( ) ;
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
            load98381( ) ;
         }
         endLevel98381( ) ;
      }
      closeExtendedTableCursors98381( ) ;
   }

   public void update98381( )
   {
      beforeValidate98381( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable98381( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency98381( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm98381( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate98381( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T009817 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n2690ExHdrFdc), A2690ExHdrFdc, Boolean.valueOf(n2691ExHdrUln), Integer.valueOf(A2691ExHdrUln), A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVH");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXMVH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate98381( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel98381( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption980( ) ;
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
         endLevel98381( ) ;
      }
      closeExtendedTableCursors98381( ) ;
   }

   public void deferredUpdate98381( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate98381( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency98381( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls98381( ) ;
         afterConfirm98381( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete98381( ) ;
            if ( AnyError == 0 )
            {
               scanStart98382( ) ;
               while ( RcdFound382 != 0 )
               {
                  getByPrimaryKey98382( ) ;
                  delete98382( ) ;
                  scanNext98382( ) ;
               }
               scanEnd98382( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T009818 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVH");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound381 == 0 )
                        {
                           initAll98381( ) ;
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
                        resetCaption980( ) ;
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
      sMode381 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel98381( ) ;
      Gx_mode = sMode381 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls98381( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T009819 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T009819_A407EmprNom[0] ;
         n407EmprNom = T009819_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T009820 */
         pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T009820_A2249ManNom[0] ;
         n2249ManNom = T009820_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         pr_default.close(18);
      }
   }

   public void processNestedLevel98382( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow98382( ) ;
         if ( ( nRcdExists_382 != 0 ) || ( nIsMod_382 != 0 ) )
         {
            standaloneNotModal98382( ) ;
            getKey98382( ) ;
            if ( ( nRcdExists_382 == 0 ) && ( nRcdDeleted_382 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert98382( ) ;
            }
            else
            {
               if ( RcdFound382 != 0 )
               {
                  if ( ( nRcdDeleted_382 != 0 ) && ( nRcdExists_382 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete98382( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_382 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update98382( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_382 == 0 )
                  {
                     GXCCtl = "EXHDRLIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtExHdrLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_382_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2692ExHdrLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrTip_Internalname, GXutil.rtrim( A2693ExHdrTip)) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtPartCod_Internalname, GXutil.rtrim( A966PartCod)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNMtr_Internalname, GXutil.rtrim( A1500BarNMtr)) ;
         httpContext.changePostValue( edtBarNumTen_Internalname, GXutil.rtrim( A1878BarNumTen)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2694ExHdrAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrKgE_Internalname, GXutil.ltrim( localUtil.ntoc( A2695ExHdrKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrCnE_Internalname, GXutil.ltrim( localUtil.ntoc( A2696ExHdrCnE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrFeE_Internalname, localUtil.format(A2697ExHdrFeE, "99/99/99")) ;
         httpContext.changePostValue( edtExHdrKgR_Internalname, GXutil.ltrim( localUtil.ntoc( A2698ExHdrKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrCnR_Internalname, GXutil.ltrim( localUtil.ntoc( A2699ExHdrCnR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrFeR_Internalname, localUtil.format(A2700ExHdrFeR, "99/99/99")) ;
         httpContext.changePostValue( edtExHdrKRe_Internalname, GXutil.ltrim( localUtil.ntoc( A2701ExHdrKRe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrCRe_Internalname, GXutil.ltrim( localUtil.ntoc( A2702ExHdrCRe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrLoc_Internalname, GXutil.rtrim( A2703ExHdrLoc)) ;
         httpContext.changePostValue( edtExHdrExL_Internalname, GXutil.ltrim( localUtil.ntoc( A2704ExHdrExL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExHdrTin_Internalname, GXutil.rtrim( A2705ExHdrTin)) ;
         httpContext.changePostValue( edtExHdrCli_Internalname, GXutil.ltrim( localUtil.ntoc( A2706ExHdrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2692ExHdrLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2692ExHdrLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2693ExHdrTip_"+sGXsfl_55_idx, GXutil.rtrim( Z2693ExHdrTip)) ;
         httpContext.changePostValue( "ZT_"+"Z2694ExHdrAlb_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2694ExHdrAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2695ExHdrKgE_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2695ExHdrKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2696ExHdrCnE_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2696ExHdrCnE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2697ExHdrFeE_"+sGXsfl_55_idx, localUtil.dtoc( Z2697ExHdrFeE, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z2698ExHdrKgR_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2698ExHdrKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2699ExHdrCnR_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2699ExHdrCnR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2700ExHdrFeR_"+sGXsfl_55_idx, localUtil.dtoc( Z2700ExHdrFeR, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z2701ExHdrKRe_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2701ExHdrKRe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2702ExHdrCRe_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2702ExHdrCRe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2703ExHdrLoc_"+sGXsfl_55_idx, GXutil.rtrim( Z2703ExHdrLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z2704ExHdrExL_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2704ExHdrExL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2705ExHdrTin_"+sGXsfl_55_idx, GXutil.rtrim( Z2705ExHdrTin)) ;
         httpContext.changePostValue( "ZT_"+"Z2706ExHdrCli_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2706ExHdrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "nRcdDeleted_382_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_382_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_382_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_382 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_382_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_382_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMTEN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTen_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRALB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrAlb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRKGE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKgE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRCNE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCnE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRFEE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrFeE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRKGR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKgR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRCNR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCnR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRFER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrFeR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRKRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKRe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRCRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCRe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRLOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDREXL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrExL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRTIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHDRCLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll98382( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_382 = (short)(0) ;
      nIsMod_382 = (short)(0) ;
      nRcdDeleted_382 = (short)(0) ;
   }

   public void processLevel98381( )
   {
      /* Save parent mode. */
      sMode381 = Gx_mode ;
      processNestedLevel98382( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode381 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel98381( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete98381( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "texmvhd");
         if ( AnyError == 0 )
         {
            confirmValues980( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "texmvhd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart98381( )
   {
      /* Using cursor T009821 */
      pr_default.execute(19);
      RcdFound381 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound381 = (short)(1) ;
         A396EmprCod = T009821_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = T009821_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2689ExHdrFas = T009821_A2689ExHdrFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext98381( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound381 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound381 = (short)(1) ;
         A396EmprCod = T009821_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = T009821_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2689ExHdrFas = T009821_A2689ExHdrFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
      }
   }

   public void scanEnd98381( )
   {
      pr_default.close(19);
   }

   public void afterConfirm98381( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert98381( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate98381( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete98381( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete98381( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate98381( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes98381( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtExHdrFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrFas_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtManNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNom_Enabled), 5, 0), true);
      edtExHdrFdc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrFdc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrFdc_Enabled), 5, 0), true);
      edtExHdrUln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrUln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrUln_Enabled), 5, 0), true);
   }

   public void zm98382( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2693ExHdrTip = T00983_A2693ExHdrTip[0] ;
            Z2694ExHdrAlb = T00983_A2694ExHdrAlb[0] ;
            Z2695ExHdrKgE = T00983_A2695ExHdrKgE[0] ;
            Z2696ExHdrCnE = T00983_A2696ExHdrCnE[0] ;
            Z2697ExHdrFeE = T00983_A2697ExHdrFeE[0] ;
            Z2698ExHdrKgR = T00983_A2698ExHdrKgR[0] ;
            Z2699ExHdrCnR = T00983_A2699ExHdrCnR[0] ;
            Z2700ExHdrFeR = T00983_A2700ExHdrFeR[0] ;
            Z2701ExHdrKRe = T00983_A2701ExHdrKRe[0] ;
            Z2702ExHdrCRe = T00983_A2702ExHdrCRe[0] ;
            Z2703ExHdrLoc = T00983_A2703ExHdrLoc[0] ;
            Z2704ExHdrExL = T00983_A2704ExHdrExL[0] ;
            Z2705ExHdrTin = T00983_A2705ExHdrTin[0] ;
            Z2706ExHdrCli = T00983_A2706ExHdrCli[0] ;
            Z129BarCod = T00983_A129BarCod[0] ;
            Z132BarCodReo = T00983_A132BarCodReo[0] ;
            Z130BarCodPar = T00983_A130BarCodPar[0] ;
         }
         else
         {
            Z2693ExHdrTip = A2693ExHdrTip ;
            Z2694ExHdrAlb = A2694ExHdrAlb ;
            Z2695ExHdrKgE = A2695ExHdrKgE ;
            Z2696ExHdrCnE = A2696ExHdrCnE ;
            Z2697ExHdrFeE = A2697ExHdrFeE ;
            Z2698ExHdrKgR = A2698ExHdrKgR ;
            Z2699ExHdrCnR = A2699ExHdrCnR ;
            Z2700ExHdrFeR = A2700ExHdrFeR ;
            Z2701ExHdrKRe = A2701ExHdrKRe ;
            Z2702ExHdrCRe = A2702ExHdrCRe ;
            Z2703ExHdrLoc = A2703ExHdrLoc ;
            Z2704ExHdrExL = A2704ExHdrExL ;
            Z2705ExHdrTin = A2705ExHdrTin ;
            Z2706ExHdrCli = A2706ExHdrCli ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z2248ManCod = A2248ManCod ;
         Z2689ExHdrFas = A2689ExHdrFas ;
         Z2692ExHdrLin = A2692ExHdrLin ;
         Z2693ExHdrTip = A2693ExHdrTip ;
         Z2694ExHdrAlb = A2694ExHdrAlb ;
         Z2695ExHdrKgE = A2695ExHdrKgE ;
         Z2696ExHdrCnE = A2696ExHdrCnE ;
         Z2697ExHdrFeE = A2697ExHdrFeE ;
         Z2698ExHdrKgR = A2698ExHdrKgR ;
         Z2699ExHdrCnR = A2699ExHdrCnR ;
         Z2700ExHdrFeR = A2700ExHdrFeR ;
         Z2701ExHdrKRe = A2701ExHdrKRe ;
         Z2702ExHdrCRe = A2702ExHdrCRe ;
         Z2703ExHdrLoc = A2703ExHdrLoc ;
         Z2704ExHdrExL = A2704ExHdrExL ;
         Z2705ExHdrTin = A2705ExHdrTin ;
         Z2706ExHdrCli = A2706ExHdrCli ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z361DisCod = A361DisCod ;
         Z1500BarNMtr = A1500BarNMtr ;
         Z1878BarNumTen = A1878BarNumTen ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z252CliCod = A252CliCod ;
         Z966PartCod = A966PartCod ;
      }
   }

   public void standaloneNotModal98382( )
   {
   }

   public void standaloneModal98382( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtExHdrLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtExHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtExHdrLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtExHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load98382( )
   {
      /* Using cursor T009822 */
      pr_default.execute(20, new Object[] {Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin), A396EmprCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound382 = (short)(1) ;
         A361DisCod = T009822_A361DisCod[0] ;
         A2693ExHdrTip = T009822_A2693ExHdrTip[0] ;
         n2693ExHdrTip = T009822_n2693ExHdrTip[0] ;
         A1500BarNMtr = T009822_A1500BarNMtr[0] ;
         A1878BarNumTen = T009822_A1878BarNumTen[0] ;
         A135BarColNom = T009822_A135BarColNom[0] ;
         A136BarColNum = T009822_A136BarColNum[0] ;
         A2694ExHdrAlb = T009822_A2694ExHdrAlb[0] ;
         n2694ExHdrAlb = T009822_n2694ExHdrAlb[0] ;
         A2695ExHdrKgE = T009822_A2695ExHdrKgE[0] ;
         n2695ExHdrKgE = T009822_n2695ExHdrKgE[0] ;
         A2696ExHdrCnE = T009822_A2696ExHdrCnE[0] ;
         n2696ExHdrCnE = T009822_n2696ExHdrCnE[0] ;
         A2697ExHdrFeE = T009822_A2697ExHdrFeE[0] ;
         n2697ExHdrFeE = T009822_n2697ExHdrFeE[0] ;
         A2698ExHdrKgR = T009822_A2698ExHdrKgR[0] ;
         n2698ExHdrKgR = T009822_n2698ExHdrKgR[0] ;
         A2699ExHdrCnR = T009822_A2699ExHdrCnR[0] ;
         n2699ExHdrCnR = T009822_n2699ExHdrCnR[0] ;
         A2700ExHdrFeR = T009822_A2700ExHdrFeR[0] ;
         n2700ExHdrFeR = T009822_n2700ExHdrFeR[0] ;
         A2701ExHdrKRe = T009822_A2701ExHdrKRe[0] ;
         n2701ExHdrKRe = T009822_n2701ExHdrKRe[0] ;
         A2702ExHdrCRe = T009822_A2702ExHdrCRe[0] ;
         n2702ExHdrCRe = T009822_n2702ExHdrCRe[0] ;
         A2703ExHdrLoc = T009822_A2703ExHdrLoc[0] ;
         n2703ExHdrLoc = T009822_n2703ExHdrLoc[0] ;
         A2704ExHdrExL = T009822_A2704ExHdrExL[0] ;
         n2704ExHdrExL = T009822_n2704ExHdrExL[0] ;
         A2705ExHdrTin = T009822_A2705ExHdrTin[0] ;
         n2705ExHdrTin = T009822_n2705ExHdrTin[0] ;
         A2706ExHdrCli = T009822_A2706ExHdrCli[0] ;
         n2706ExHdrCli = T009822_n2706ExHdrCli[0] ;
         A129BarCod = T009822_A129BarCod[0] ;
         n129BarCod = T009822_n129BarCod[0] ;
         A132BarCodReo = T009822_A132BarCodReo[0] ;
         n132BarCodReo = T009822_n132BarCodReo[0] ;
         A130BarCodPar = T009822_A130BarCodPar[0] ;
         n130BarCodPar = T009822_n130BarCodPar[0] ;
         A966PartCod = T009822_A966PartCod[0] ;
         n966PartCod = T009822_n966PartCod[0] ;
         A252CliCod = T009822_A252CliCod[0] ;
         n252CliCod = T009822_n252CliCod[0] ;
         zm98382( -4) ;
      }
      pr_default.close(20);
      onLoadActions98382( ) ;
   }

   public void onLoadActions98382( )
   {
   }

   public void checkExtendedTable98382( )
   {
      nIsDirty_382 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal98382( ) ;
      /* Using cursor T00984 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T00984_A361DisCod[0] ;
      A1500BarNMtr = T00984_A1500BarNMtr[0] ;
      A1878BarNumTen = T00984_A1878BarNumTen[0] ;
      A135BarColNom = T00984_A135BarColNom[0] ;
      A136BarColNum = T00984_A136BarColNum[0] ;
      A252CliCod = T00984_A252CliCod[0] ;
      n252CliCod = T00984_n252CliCod[0] ;
      pr_default.close(2);
      /* Using cursor T00985 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A966PartCod = T00985_A966PartCod[0] ;
      n966PartCod = T00985_n966PartCod[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors98382( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable98382( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T009823 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T009823_A361DisCod[0] ;
      A1500BarNMtr = T009823_A1500BarNMtr[0] ;
      A1878BarNumTen = T009823_A1878BarNumTen[0] ;
      A135BarColNom = T009823_A135BarColNom[0] ;
      A136BarColNum = T009823_A136BarColNum[0] ;
      A252CliCod = T009823_A252CliCod[0] ;
      n252CliCod = T009823_n252CliCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1500BarNMtr))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1878BarNumTen))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_6( String A396EmprCod ,
                         int A361DisCod )
   {
      /* Using cursor T009824 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A966PartCod = T009824_A966PartCod[0] ;
      n966PartCod = T009824_n966PartCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A966PartCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey98382( )
   {
      /* Using cursor T009825 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound382 = (short)(1) ;
      }
      else
      {
         RcdFound382 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey98382( )
   {
      /* Using cursor T00983 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm98382( 4) ;
         RcdFound382 = (short)(1) ;
         initializeNonKey98382( ) ;
         A2692ExHdrLin = T00983_A2692ExHdrLin[0] ;
         A2693ExHdrTip = T00983_A2693ExHdrTip[0] ;
         n2693ExHdrTip = T00983_n2693ExHdrTip[0] ;
         A2694ExHdrAlb = T00983_A2694ExHdrAlb[0] ;
         n2694ExHdrAlb = T00983_n2694ExHdrAlb[0] ;
         A2695ExHdrKgE = T00983_A2695ExHdrKgE[0] ;
         n2695ExHdrKgE = T00983_n2695ExHdrKgE[0] ;
         A2696ExHdrCnE = T00983_A2696ExHdrCnE[0] ;
         n2696ExHdrCnE = T00983_n2696ExHdrCnE[0] ;
         A2697ExHdrFeE = T00983_A2697ExHdrFeE[0] ;
         n2697ExHdrFeE = T00983_n2697ExHdrFeE[0] ;
         A2698ExHdrKgR = T00983_A2698ExHdrKgR[0] ;
         n2698ExHdrKgR = T00983_n2698ExHdrKgR[0] ;
         A2699ExHdrCnR = T00983_A2699ExHdrCnR[0] ;
         n2699ExHdrCnR = T00983_n2699ExHdrCnR[0] ;
         A2700ExHdrFeR = T00983_A2700ExHdrFeR[0] ;
         n2700ExHdrFeR = T00983_n2700ExHdrFeR[0] ;
         A2701ExHdrKRe = T00983_A2701ExHdrKRe[0] ;
         n2701ExHdrKRe = T00983_n2701ExHdrKRe[0] ;
         A2702ExHdrCRe = T00983_A2702ExHdrCRe[0] ;
         n2702ExHdrCRe = T00983_n2702ExHdrCRe[0] ;
         A2703ExHdrLoc = T00983_A2703ExHdrLoc[0] ;
         n2703ExHdrLoc = T00983_n2703ExHdrLoc[0] ;
         A2704ExHdrExL = T00983_A2704ExHdrExL[0] ;
         n2704ExHdrExL = T00983_n2704ExHdrExL[0] ;
         A2705ExHdrTin = T00983_A2705ExHdrTin[0] ;
         n2705ExHdrTin = T00983_n2705ExHdrTin[0] ;
         A2706ExHdrCli = T00983_A2706ExHdrCli[0] ;
         n2706ExHdrCli = T00983_n2706ExHdrCli[0] ;
         A129BarCod = T00983_A129BarCod[0] ;
         n129BarCod = T00983_n129BarCod[0] ;
         A132BarCodReo = T00983_A132BarCodReo[0] ;
         n132BarCodReo = T00983_n132BarCodReo[0] ;
         A130BarCodPar = T00983_A130BarCodPar[0] ;
         n130BarCodPar = T00983_n130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z2248ManCod = A2248ManCod ;
         Z2689ExHdrFas = A2689ExHdrFas ;
         Z2692ExHdrLin = A2692ExHdrLin ;
         sMode382 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal98382( ) ;
         load98382( ) ;
         Gx_mode = sMode382 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound382 = (short)(0) ;
         initializeNonKey98382( ) ;
         sMode382 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal98382( ) ;
         Gx_mode = sMode382 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes98382( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency98382( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00982 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLEXMVH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z2693ExHdrTip, T00982_A2693ExHdrTip[0]) != 0 ) || ( Z2694ExHdrAlb != T00982_A2694ExHdrAlb[0] ) || ( DecimalUtil.compareTo(Z2695ExHdrKgE, T00982_A2695ExHdrKgE[0]) != 0 ) || ( Z2696ExHdrCnE != T00982_A2696ExHdrCnE[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z2697ExHdrFeE), GXutil.resetTime(T00982_A2697ExHdrFeE[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2698ExHdrKgR, T00982_A2698ExHdrKgR[0]) != 0 ) || ( Z2699ExHdrCnR != T00982_A2699ExHdrCnR[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z2700ExHdrFeR), GXutil.resetTime(T00982_A2700ExHdrFeR[0])) ) || ( DecimalUtil.compareTo(Z2701ExHdrKRe, T00982_A2701ExHdrKRe[0]) != 0 ) || ( Z2702ExHdrCRe != T00982_A2702ExHdrCRe[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2703ExHdrLoc, T00982_A2703ExHdrLoc[0]) != 0 ) || ( Z2704ExHdrExL != T00982_A2704ExHdrExL[0] ) || ( GXutil.strcmp(Z2705ExHdrTin, T00982_A2705ExHdrTin[0]) != 0 ) || ( Z2706ExHdrCli != T00982_A2706ExHdrCli[0] ) || ( Z129BarCod != T00982_A129BarCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z132BarCodReo != T00982_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T00982_A130BarCodPar[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z2693ExHdrTip, T00982_A2693ExHdrTip[0]) != 0 )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrTip");
               GXutil.writeLogRaw("Old: ",Z2693ExHdrTip);
               GXutil.writeLogRaw("Current: ",T00982_A2693ExHdrTip[0]);
            }
            if ( Z2694ExHdrAlb != T00982_A2694ExHdrAlb[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrAlb");
               GXutil.writeLogRaw("Old: ",Z2694ExHdrAlb);
               GXutil.writeLogRaw("Current: ",T00982_A2694ExHdrAlb[0]);
            }
            if ( DecimalUtil.compareTo(Z2695ExHdrKgE, T00982_A2695ExHdrKgE[0]) != 0 )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrKgE");
               GXutil.writeLogRaw("Old: ",Z2695ExHdrKgE);
               GXutil.writeLogRaw("Current: ",T00982_A2695ExHdrKgE[0]);
            }
            if ( Z2696ExHdrCnE != T00982_A2696ExHdrCnE[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrCnE");
               GXutil.writeLogRaw("Old: ",Z2696ExHdrCnE);
               GXutil.writeLogRaw("Current: ",T00982_A2696ExHdrCnE[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2697ExHdrFeE), GXutil.resetTime(T00982_A2697ExHdrFeE[0])) ) )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrFeE");
               GXutil.writeLogRaw("Old: ",Z2697ExHdrFeE);
               GXutil.writeLogRaw("Current: ",T00982_A2697ExHdrFeE[0]);
            }
            if ( DecimalUtil.compareTo(Z2698ExHdrKgR, T00982_A2698ExHdrKgR[0]) != 0 )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrKgR");
               GXutil.writeLogRaw("Old: ",Z2698ExHdrKgR);
               GXutil.writeLogRaw("Current: ",T00982_A2698ExHdrKgR[0]);
            }
            if ( Z2699ExHdrCnR != T00982_A2699ExHdrCnR[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrCnR");
               GXutil.writeLogRaw("Old: ",Z2699ExHdrCnR);
               GXutil.writeLogRaw("Current: ",T00982_A2699ExHdrCnR[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2700ExHdrFeR), GXutil.resetTime(T00982_A2700ExHdrFeR[0])) ) )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrFeR");
               GXutil.writeLogRaw("Old: ",Z2700ExHdrFeR);
               GXutil.writeLogRaw("Current: ",T00982_A2700ExHdrFeR[0]);
            }
            if ( DecimalUtil.compareTo(Z2701ExHdrKRe, T00982_A2701ExHdrKRe[0]) != 0 )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrKRe");
               GXutil.writeLogRaw("Old: ",Z2701ExHdrKRe);
               GXutil.writeLogRaw("Current: ",T00982_A2701ExHdrKRe[0]);
            }
            if ( Z2702ExHdrCRe != T00982_A2702ExHdrCRe[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrCRe");
               GXutil.writeLogRaw("Old: ",Z2702ExHdrCRe);
               GXutil.writeLogRaw("Current: ",T00982_A2702ExHdrCRe[0]);
            }
            if ( GXutil.strcmp(Z2703ExHdrLoc, T00982_A2703ExHdrLoc[0]) != 0 )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrLoc");
               GXutil.writeLogRaw("Old: ",Z2703ExHdrLoc);
               GXutil.writeLogRaw("Current: ",T00982_A2703ExHdrLoc[0]);
            }
            if ( Z2704ExHdrExL != T00982_A2704ExHdrExL[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrExL");
               GXutil.writeLogRaw("Old: ",Z2704ExHdrExL);
               GXutil.writeLogRaw("Current: ",T00982_A2704ExHdrExL[0]);
            }
            if ( GXutil.strcmp(Z2705ExHdrTin, T00982_A2705ExHdrTin[0]) != 0 )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrTin");
               GXutil.writeLogRaw("Old: ",Z2705ExHdrTin);
               GXutil.writeLogRaw("Current: ",T00982_A2705ExHdrTin[0]);
            }
            if ( Z2706ExHdrCli != T00982_A2706ExHdrCli[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"ExHdrCli");
               GXutil.writeLogRaw("Old: ",Z2706ExHdrCli);
               GXutil.writeLogRaw("Current: ",T00982_A2706ExHdrCli[0]);
            }
            if ( Z129BarCod != T00982_A129BarCod[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T00982_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T00982_A132BarCodReo[0] )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T00982_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T00982_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("texmvhd:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T00982_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLEXMVH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert98382( )
   {
      beforeValidate98382( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable98382( ) ;
      }
      if ( AnyError == 0 )
      {
         zm98382( 0) ;
         checkOptimisticConcurrency98382( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm98382( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert98382( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T009826 */
                  pr_default.execute(24, new Object[] {Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin), Boolean.valueOf(n2693ExHdrTip), A2693ExHdrTip, Boolean.valueOf(n2694ExHdrAlb), Integer.valueOf(A2694ExHdrAlb), Boolean.valueOf(n2695ExHdrKgE), A2695ExHdrKgE, Boolean.valueOf(n2696ExHdrCnE), Short.valueOf(A2696ExHdrCnE), Boolean.valueOf(n2697ExHdrFeE), A2697ExHdrFeE, Boolean.valueOf(n2698ExHdrKgR), A2698ExHdrKgR, Boolean.valueOf(n2699ExHdrCnR), Short.valueOf(A2699ExHdrCnR), Boolean.valueOf(n2700ExHdrFeR), A2700ExHdrFeR, Boolean.valueOf(n2701ExHdrKRe), A2701ExHdrKRe, Boolean.valueOf(n2702ExHdrCRe), Short.valueOf(A2702ExHdrCRe), Boolean.valueOf(n2703ExHdrLoc), A2703ExHdrLoc, Boolean.valueOf(n2704ExHdrExL), Short.valueOf(A2704ExHdrExL), Boolean.valueOf(n2705ExHdrTin), A2705ExHdrTin, Boolean.valueOf(n2706ExHdrCli), Integer.valueOf(A2706ExHdrCli), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load98382( ) ;
         }
         endLevel98382( ) ;
      }
      closeExtendedTableCursors98382( ) ;
   }

   public void update98382( )
   {
      beforeValidate98382( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable98382( ) ;
      }
      if ( ( nIsMod_382 != 0 ) || ( nIsDirty_382 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency98382( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm98382( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate98382( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T009827 */
                     pr_default.execute(25, new Object[] {Boolean.valueOf(n2693ExHdrTip), A2693ExHdrTip, Boolean.valueOf(n2694ExHdrAlb), Integer.valueOf(A2694ExHdrAlb), Boolean.valueOf(n2695ExHdrKgE), A2695ExHdrKgE, Boolean.valueOf(n2696ExHdrCnE), Short.valueOf(A2696ExHdrCnE), Boolean.valueOf(n2697ExHdrFeE), A2697ExHdrFeE, Boolean.valueOf(n2698ExHdrKgR), A2698ExHdrKgR, Boolean.valueOf(n2699ExHdrCnR), Short.valueOf(A2699ExHdrCnR), Boolean.valueOf(n2700ExHdrFeR), A2700ExHdrFeR, Boolean.valueOf(n2701ExHdrKRe), A2701ExHdrKRe, Boolean.valueOf(n2702ExHdrCRe), Short.valueOf(A2702ExHdrCRe), Boolean.valueOf(n2703ExHdrLoc), A2703ExHdrLoc, Boolean.valueOf(n2704ExHdrExL), Short.valueOf(A2704ExHdrExL), Boolean.valueOf(n2705ExHdrTin), A2705ExHdrTin, Boolean.valueOf(n2706ExHdrCli), Integer.valueOf(A2706ExHdrCli), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLEXMVH"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate98382( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey98382( ) ;
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
            endLevel98382( ) ;
         }
      }
      closeExtendedTableCursors98382( ) ;
   }

   public void deferredUpdate98382( )
   {
   }

   public void delete98382( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate98382( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency98382( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls98382( ) ;
         afterConfirm98382( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete98382( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T009828 */
               pr_default.execute(26, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
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
      sMode382 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel98382( ) ;
      Gx_mode = sMode382 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls98382( )
   {
      standaloneModal98382( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T009829 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         A361DisCod = T009829_A361DisCod[0] ;
         A1500BarNMtr = T009829_A1500BarNMtr[0] ;
         A1878BarNumTen = T009829_A1878BarNumTen[0] ;
         A135BarColNom = T009829_A135BarColNom[0] ;
         A136BarColNum = T009829_A136BarColNum[0] ;
         A252CliCod = T009829_A252CliCod[0] ;
         n252CliCod = T009829_n252CliCod[0] ;
         pr_default.close(27);
         /* Using cursor T009830 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A966PartCod = T009830_A966PartCod[0] ;
         n966PartCod = T009830_n966PartCod[0] ;
         pr_default.close(28);
      }
   }

   public void endLevel98382( )
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

   public void scanStart98382( )
   {
      /* Scan By routine */
      /* Using cursor T009831 */
      pr_default.execute(29, new Object[] {Short.valueOf(A2248ManCod), A2689ExHdrFas, A396EmprCod});
      RcdFound382 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound382 = (short)(1) ;
         A2692ExHdrLin = T009831_A2692ExHdrLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext98382( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound382 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound382 = (short)(1) ;
         A2692ExHdrLin = T009831_A2692ExHdrLin[0] ;
      }
   }

   public void scanEnd98382( )
   {
      pr_default.close(29);
   }

   public void afterConfirm98382( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert98382( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate98382( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete98382( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete98382( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate98382( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes98382( )
   {
      edtExHdrLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrTip_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPartCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPartCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarNMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNMtr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarNumTen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumTen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumTen_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrAlb_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrKgE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrKgE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrKgE_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrCnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrCnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrCnE_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrFeE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrFeE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrFeE_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrKgR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrKgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrKgR_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrCnR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrCnR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrCnR_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrFeR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrFeR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrFeR_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrKRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrKRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrKRe_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrCRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrCRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrCRe_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrLoc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrExL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrExL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrExL_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrTin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtExHdrCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrCli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes98382( )
   {
   }

   public void send_integrity_lvl_hashes98381( )
   {
   }

   public void subsflControlProps_55382( )
   {
      edtavnRcdDeleted_382_Internalname = "vNRCDDELETED_382_"+sGXsfl_55_idx ;
      edtExHdrLin_Internalname = "EXHDRLIN_"+sGXsfl_55_idx ;
      edtExHdrTip_Internalname = "EXHDRTIP_"+sGXsfl_55_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_idx ;
      edtPartCod_Internalname = "PARTCOD_"+sGXsfl_55_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_55_idx ;
      edtBarNMtr_Internalname = "BARNMTR_"+sGXsfl_55_idx ;
      edtBarNumTen_Internalname = "BARNUMTEN_"+sGXsfl_55_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_55_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_55_idx ;
      edtExHdrAlb_Internalname = "EXHDRALB_"+sGXsfl_55_idx ;
      edtExHdrKgE_Internalname = "EXHDRKGE_"+sGXsfl_55_idx ;
      edtExHdrCnE_Internalname = "EXHDRCNE_"+sGXsfl_55_idx ;
      edtExHdrFeE_Internalname = "EXHDRFEE_"+sGXsfl_55_idx ;
      edtExHdrKgR_Internalname = "EXHDRKGR_"+sGXsfl_55_idx ;
      edtExHdrCnR_Internalname = "EXHDRCNR_"+sGXsfl_55_idx ;
      edtExHdrFeR_Internalname = "EXHDRFER_"+sGXsfl_55_idx ;
      edtExHdrKRe_Internalname = "EXHDRKRE_"+sGXsfl_55_idx ;
      edtExHdrCRe_Internalname = "EXHDRCRE_"+sGXsfl_55_idx ;
      edtExHdrLoc_Internalname = "EXHDRLOC_"+sGXsfl_55_idx ;
      edtExHdrExL_Internalname = "EXHDREXL_"+sGXsfl_55_idx ;
      edtExHdrTin_Internalname = "EXHDRTIN_"+sGXsfl_55_idx ;
      edtExHdrCli_Internalname = "EXHDRCLI_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_55382( )
   {
      edtavnRcdDeleted_382_Internalname = "vNRCDDELETED_382_"+sGXsfl_55_fel_idx ;
      edtExHdrLin_Internalname = "EXHDRLIN_"+sGXsfl_55_fel_idx ;
      edtExHdrTip_Internalname = "EXHDRTIP_"+sGXsfl_55_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_fel_idx ;
      edtPartCod_Internalname = "PARTCOD_"+sGXsfl_55_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_55_fel_idx ;
      edtBarNMtr_Internalname = "BARNMTR_"+sGXsfl_55_fel_idx ;
      edtBarNumTen_Internalname = "BARNUMTEN_"+sGXsfl_55_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_55_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_55_fel_idx ;
      edtExHdrAlb_Internalname = "EXHDRALB_"+sGXsfl_55_fel_idx ;
      edtExHdrKgE_Internalname = "EXHDRKGE_"+sGXsfl_55_fel_idx ;
      edtExHdrCnE_Internalname = "EXHDRCNE_"+sGXsfl_55_fel_idx ;
      edtExHdrFeE_Internalname = "EXHDRFEE_"+sGXsfl_55_fel_idx ;
      edtExHdrKgR_Internalname = "EXHDRKGR_"+sGXsfl_55_fel_idx ;
      edtExHdrCnR_Internalname = "EXHDRCNR_"+sGXsfl_55_fel_idx ;
      edtExHdrFeR_Internalname = "EXHDRFER_"+sGXsfl_55_fel_idx ;
      edtExHdrKRe_Internalname = "EXHDRKRE_"+sGXsfl_55_fel_idx ;
      edtExHdrCRe_Internalname = "EXHDRCRE_"+sGXsfl_55_fel_idx ;
      edtExHdrLoc_Internalname = "EXHDRLOC_"+sGXsfl_55_fel_idx ;
      edtExHdrExL_Internalname = "EXHDREXL_"+sGXsfl_55_fel_idx ;
      edtExHdrTin_Internalname = "EXHDRTIN_"+sGXsfl_55_fel_idx ;
      edtExHdrCli_Internalname = "EXHDRCLI_"+sGXsfl_55_fel_idx ;
   }

   public void addRow98382( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55382( ) ;
      sendRow98382( ) ;
   }

   public void sendRow98382( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_382_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_382_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_382), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_382), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_382_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_382_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2692ExHdrLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2692ExHdrLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrTip_Internalname,GXutil.rtrim( A2693ExHdrTip),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrTip_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPartCod_Internalname,GXutil.rtrim( A966PartCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPartCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPartCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNMtr_Internalname,GXutil.rtrim( A1500BarNMtr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumTen_Internalname,GXutil.rtrim( A1878BarNumTen),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumTen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNumTen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrAlb_Internalname,GXutil.ltrim( localUtil.ntoc( A2694ExHdrAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2694ExHdrAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2694ExHdrAlb), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrAlb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrAlb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrKgE_Internalname,GXutil.ltrim( localUtil.ntoc( A2695ExHdrKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrKgE_Enabled!=0) ? localUtil.format( A2695ExHdrKgE, "ZZZZZ9.99") : localUtil.format( A2695ExHdrKgE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrKgE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrKgE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrCnE_Internalname,GXutil.ltrim( localUtil.ntoc( A2696ExHdrCnE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrCnE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2696ExHdrCnE), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2696ExHdrCnE), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrCnE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrCnE_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrFeE_Internalname,localUtil.format(A2697ExHdrFeE, "99/99/99"),localUtil.format( A2697ExHdrFeE, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrFeE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrFeE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrKgR_Internalname,GXutil.ltrim( localUtil.ntoc( A2698ExHdrKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrKgR_Enabled!=0) ? localUtil.format( A2698ExHdrKgR, "ZZZZZ9.99") : localUtil.format( A2698ExHdrKgR, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrKgR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrKgR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrCnR_Internalname,GXutil.ltrim( localUtil.ntoc( A2699ExHdrCnR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrCnR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2699ExHdrCnR), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2699ExHdrCnR), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrCnR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrCnR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrFeR_Internalname,localUtil.format(A2700ExHdrFeR, "99/99/99"),localUtil.format( A2700ExHdrFeR, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrFeR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrFeR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrKRe_Internalname,GXutil.ltrim( localUtil.ntoc( A2701ExHdrKRe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrKRe_Enabled!=0) ? localUtil.format( A2701ExHdrKRe, "ZZZZZ9.99") : localUtil.format( A2701ExHdrKRe, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrKRe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrKRe_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrCRe_Internalname,GXutil.ltrim( localUtil.ntoc( A2702ExHdrCRe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrCRe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2702ExHdrCRe), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2702ExHdrCRe), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrCRe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrCRe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrLoc_Internalname,GXutil.rtrim( A2703ExHdrLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrLoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrExL_Internalname,GXutil.ltrim( localUtil.ntoc( A2704ExHdrExL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrExL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2704ExHdrExL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2704ExHdrExL), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrExL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrExL_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrTin_Internalname,GXutil.rtrim( A2705ExHdrTin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_382_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExHdrCli_Internalname,GXutil.ltrim( localUtil.ntoc( A2706ExHdrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExHdrCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2706ExHdrCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2706ExHdrCli), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExHdrCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExHdrCli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes98382( ) ;
      GXCCtl = "Z2692ExHdrLin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2692ExHdrLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2693ExHdrTip_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2693ExHdrTip));
      GXCCtl = "Z2694ExHdrAlb_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2694ExHdrAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2695ExHdrKgE_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2695ExHdrKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2696ExHdrCnE_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2696ExHdrCnE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2697ExHdrFeE_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z2697ExHdrFeE, 0, "/"));
      GXCCtl = "Z2698ExHdrKgR_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2698ExHdrKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2699ExHdrCnR_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2699ExHdrCnR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2700ExHdrFeR_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z2700ExHdrFeR, 0, "/"));
      GXCCtl = "Z2701ExHdrKRe_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2701ExHdrKRe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2702ExHdrCRe_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2702ExHdrCRe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2703ExHdrLoc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2703ExHdrLoc));
      GXCCtl = "Z2704ExHdrExL_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2704ExHdrExL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2705ExHdrTin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2705ExHdrTin));
      GXCCtl = "Z2706ExHdrCli_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2706ExHdrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z129BarCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "nRcdDeleted_382_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_382_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_382_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_382, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_382_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_382_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMTEN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTen_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRALB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrAlb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRKGE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKgE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRCNE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCnE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRFEE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrFeE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRKGR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKgR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRCNR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCnR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRFER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrFeR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRKRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKRe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRCRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCRe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRLOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDREXL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrExL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRTIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRCLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow98382( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55382( ) ;
      edtavnRcdDeleted_382_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_382_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRTIP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPartCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNMTR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumTen_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMTEN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrAlb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRALB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrKgE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRKGE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrCnE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRCNE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrFeE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRFEE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrKgR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRKGR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrCnR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRCNR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrFeR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRFER_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrKRe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRKRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrCRe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRCRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRLOC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrExL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDREXL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRTIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExHdrCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHDRCLI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_382_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_382_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_382");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_382_Internalname ;
         wbErr = true ;
         nRcdDeleted_382 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_382 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_382_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "EXHDRLIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrLin_Internalname ;
         wbErr = true ;
         A2692ExHdrLin = 0 ;
      }
      else
      {
         A2692ExHdrLin = (int)(localUtil.ctol( httpContext.cgiGet( edtExHdrLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2693ExHdrTip = httpContext.cgiGet( edtExHdrTip_Internalname) ;
      n2693ExHdrTip = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         wbErr = true ;
         A129BarCod = 0 ;
         n129BarCod = false ;
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n129BarCod = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         wbErr = true ;
         A132BarCodReo = (byte)(0) ;
         n132BarCodReo = false ;
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n132BarCodReo = false ;
      }
      A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
      n130BarCodPar = false ;
      A966PartCod = httpContext.cgiGet( edtPartCod_Internalname) ;
      n966PartCod = false ;
      A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n252CliCod = false ;
      A1500BarNMtr = httpContext.cgiGet( edtBarNMtr_Internalname) ;
      A1878BarNumTen = httpContext.cgiGet( edtBarNumTen_Internalname) ;
      A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
      A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "EXHDRALB_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrAlb_Internalname ;
         wbErr = true ;
         A2694ExHdrAlb = 0 ;
         n2694ExHdrAlb = false ;
      }
      else
      {
         A2694ExHdrAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtExHdrAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2694ExHdrAlb = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtExHdrKgE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtExHdrKgE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "EXHDRKGE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrKgE_Internalname ;
         wbErr = true ;
         A2695ExHdrKgE = DecimalUtil.ZERO ;
         n2695ExHdrKgE = false ;
      }
      else
      {
         A2695ExHdrKgE = localUtil.ctond( httpContext.cgiGet( edtExHdrKgE_Internalname)) ;
         n2695ExHdrKgE = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrCnE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrCnE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "EXHDRCNE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrCnE_Internalname ;
         wbErr = true ;
         A2696ExHdrCnE = (short)(0) ;
         n2696ExHdrCnE = false ;
      }
      else
      {
         A2696ExHdrCnE = (short)(localUtil.ctol( httpContext.cgiGet( edtExHdrCnE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2696ExHdrCnE = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtExHdrFeE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "EXHDRFEE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrFeE_Internalname ;
         wbErr = true ;
         A2697ExHdrFeE = GXutil.nullDate() ;
         n2697ExHdrFeE = false ;
      }
      else
      {
         A2697ExHdrFeE = localUtil.ctod( httpContext.cgiGet( edtExHdrFeE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n2697ExHdrFeE = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtExHdrKgR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtExHdrKgR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "EXHDRKGR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrKgR_Internalname ;
         wbErr = true ;
         A2698ExHdrKgR = DecimalUtil.ZERO ;
         n2698ExHdrKgR = false ;
      }
      else
      {
         A2698ExHdrKgR = localUtil.ctond( httpContext.cgiGet( edtExHdrKgR_Internalname)) ;
         n2698ExHdrKgR = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrCnR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrCnR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "EXHDRCNR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrCnR_Internalname ;
         wbErr = true ;
         A2699ExHdrCnR = (short)(0) ;
         n2699ExHdrCnR = false ;
      }
      else
      {
         A2699ExHdrCnR = (short)(localUtil.ctol( httpContext.cgiGet( edtExHdrCnR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2699ExHdrCnR = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtExHdrFeR_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "EXHDRFER_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrFeR_Internalname ;
         wbErr = true ;
         A2700ExHdrFeR = GXutil.nullDate() ;
         n2700ExHdrFeR = false ;
      }
      else
      {
         A2700ExHdrFeR = localUtil.ctod( httpContext.cgiGet( edtExHdrFeR_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n2700ExHdrFeR = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtExHdrKRe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtExHdrKRe_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "EXHDRKRE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrKRe_Internalname ;
         wbErr = true ;
         A2701ExHdrKRe = DecimalUtil.ZERO ;
         n2701ExHdrKRe = false ;
      }
      else
      {
         A2701ExHdrKRe = localUtil.ctond( httpContext.cgiGet( edtExHdrKRe_Internalname)) ;
         n2701ExHdrKRe = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrCRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrCRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "EXHDRCRE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrCRe_Internalname ;
         wbErr = true ;
         A2702ExHdrCRe = (short)(0) ;
         n2702ExHdrCRe = false ;
      }
      else
      {
         A2702ExHdrCRe = (short)(localUtil.ctol( httpContext.cgiGet( edtExHdrCRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2702ExHdrCRe = false ;
      }
      A2703ExHdrLoc = httpContext.cgiGet( edtExHdrLoc_Internalname) ;
      n2703ExHdrLoc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrExL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrExL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "EXHDREXL_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrExL_Internalname ;
         wbErr = true ;
         A2704ExHdrExL = (short)(0) ;
         n2704ExHdrExL = false ;
      }
      else
      {
         A2704ExHdrExL = (short)(localUtil.ctol( httpContext.cgiGet( edtExHdrExL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2704ExHdrExL = false ;
      }
      A2705ExHdrTin = httpContext.cgiGet( edtExHdrTin_Internalname) ;
      n2705ExHdrTin = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExHdrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "EXHDRCLI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExHdrCli_Internalname ;
         wbErr = true ;
         A2706ExHdrCli = 0 ;
         n2706ExHdrCli = false ;
      }
      else
      {
         A2706ExHdrCli = (int)(localUtil.ctol( httpContext.cgiGet( edtExHdrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2706ExHdrCli = false ;
      }
      GXCCtl = "Z2692ExHdrLin_" + sGXsfl_55_idx ;
      Z2692ExHdrLin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2693ExHdrTip_" + sGXsfl_55_idx ;
      Z2693ExHdrTip = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2694ExHdrAlb_" + sGXsfl_55_idx ;
      Z2694ExHdrAlb = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2695ExHdrKgE_" + sGXsfl_55_idx ;
      Z2695ExHdrKgE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2696ExHdrCnE_" + sGXsfl_55_idx ;
      Z2696ExHdrCnE = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2697ExHdrFeE_" + sGXsfl_55_idx ;
      Z2697ExHdrFeE = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z2698ExHdrKgR_" + sGXsfl_55_idx ;
      Z2698ExHdrKgR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2699ExHdrCnR_" + sGXsfl_55_idx ;
      Z2699ExHdrCnR = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2700ExHdrFeR_" + sGXsfl_55_idx ;
      Z2700ExHdrFeR = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z2701ExHdrKRe_" + sGXsfl_55_idx ;
      Z2701ExHdrKRe = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2702ExHdrCRe_" + sGXsfl_55_idx ;
      Z2702ExHdrCRe = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2703ExHdrLoc_" + sGXsfl_55_idx ;
      Z2703ExHdrLoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2704ExHdrExL_" + sGXsfl_55_idx ;
      Z2704ExHdrExL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2705ExHdrTin_" + sGXsfl_55_idx ;
      Z2705ExHdrTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2706ExHdrCli_" + sGXsfl_55_idx ;
      Z2706ExHdrCli = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_55_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_55_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_55_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_382_" + sGXsfl_55_idx ;
      nRcdDeleted_382 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_382_" + sGXsfl_55_idx ;
      nRcdExists_382 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_382_" + sGXsfl_55_idx ;
      nIsMod_382 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtExHdrLin_Enabled = edtExHdrLin_Enabled ;
   }

   public void confirmValues980( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55382( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55382( ) ;
         httpContext.changePostValue( "Z2692ExHdrLin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2692ExHdrLin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2692ExHdrLin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2693ExHdrTip_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2693ExHdrTip_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2693ExHdrTip_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2694ExHdrAlb_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2694ExHdrAlb_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2694ExHdrAlb_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2695ExHdrKgE_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2695ExHdrKgE_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2695ExHdrKgE_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2696ExHdrCnE_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2696ExHdrCnE_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2696ExHdrCnE_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2697ExHdrFeE_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2697ExHdrFeE_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2697ExHdrFeE_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2698ExHdrKgR_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2698ExHdrKgR_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2698ExHdrKgR_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2699ExHdrCnR_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2699ExHdrCnR_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2699ExHdrCnR_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2700ExHdrFeR_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2700ExHdrFeR_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2700ExHdrFeR_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2701ExHdrKRe_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2701ExHdrKRe_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2701ExHdrKRe_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2702ExHdrCRe_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2702ExHdrCRe_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2702ExHdrCRe_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2703ExHdrLoc_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2703ExHdrLoc_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2703ExHdrLoc_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2704ExHdrExL_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2704ExHdrExL_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2704ExHdrExL_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2705ExHdrTin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2705ExHdrTin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2705ExHdrTin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2706ExHdrCli_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2706ExHdrCli_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2706ExHdrCli_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.texmvhd", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2689ExHdrFas", GXutil.rtrim( Z2689ExHdrFas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2690ExHdrFdc", GXutil.rtrim( Z2690ExHdrFdc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2691ExHdrUln", GXutil.ltrim( localUtil.ntoc( Z2691ExHdrUln, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.texmvhd", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TEXMVHD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MOVIMIENTOS HDR's, TRABAJ EXT", "") ;
   }

   public void initializeNonKey98381( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A2249ManNom = "" ;
      n2249ManNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      A2690ExHdrFdc = "" ;
      n2690ExHdrFdc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2690ExHdrFdc", A2690ExHdrFdc);
      A2691ExHdrUln = 0 ;
      n2691ExHdrUln = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2691ExHdrUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2691ExHdrUln), 8, 0));
      Z2690ExHdrFdc = "" ;
      Z2691ExHdrUln = 0 ;
   }

   public void initAll98381( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2248ManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      A2689ExHdrFas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2689ExHdrFas", A2689ExHdrFas);
      initializeNonKey98381( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey98382( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2693ExHdrTip = "" ;
      n2693ExHdrTip = false ;
      A129BarCod = 0 ;
      n129BarCod = false ;
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      A966PartCod = "" ;
      n966PartCod = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      A1500BarNMtr = "" ;
      A1878BarNumTen = "" ;
      A135BarColNom = "" ;
      A136BarColNum = 0 ;
      A2694ExHdrAlb = 0 ;
      n2694ExHdrAlb = false ;
      A2695ExHdrKgE = DecimalUtil.ZERO ;
      n2695ExHdrKgE = false ;
      A2696ExHdrCnE = (short)(0) ;
      n2696ExHdrCnE = false ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      n2697ExHdrFeE = false ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      n2698ExHdrKgR = false ;
      A2699ExHdrCnR = (short)(0) ;
      n2699ExHdrCnR = false ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      n2700ExHdrFeR = false ;
      A2701ExHdrKRe = DecimalUtil.ZERO ;
      n2701ExHdrKRe = false ;
      A2702ExHdrCRe = (short)(0) ;
      n2702ExHdrCRe = false ;
      A2703ExHdrLoc = "" ;
      n2703ExHdrLoc = false ;
      A2704ExHdrExL = (short)(0) ;
      n2704ExHdrExL = false ;
      A2705ExHdrTin = "" ;
      n2705ExHdrTin = false ;
      A2706ExHdrCli = 0 ;
      n2706ExHdrCli = false ;
      Z2693ExHdrTip = "" ;
      Z2694ExHdrAlb = 0 ;
      Z2695ExHdrKgE = DecimalUtil.ZERO ;
      Z2696ExHdrCnE = (short)(0) ;
      Z2697ExHdrFeE = GXutil.nullDate() ;
      Z2698ExHdrKgR = DecimalUtil.ZERO ;
      Z2699ExHdrCnR = (short)(0) ;
      Z2700ExHdrFeR = GXutil.nullDate() ;
      Z2701ExHdrKRe = DecimalUtil.ZERO ;
      Z2702ExHdrCRe = (short)(0) ;
      Z2703ExHdrLoc = "" ;
      Z2704ExHdrExL = (short)(0) ;
      Z2705ExHdrTin = "" ;
      Z2706ExHdrCli = 0 ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll98382( )
   {
      A2692ExHdrLin = 0 ;
      initializeNonKey98382( ) ;
   }

   public void standaloneModalInsert98382( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824151891", true, true);
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
      httpContext.AddJavascriptSource("texmvhd.js", "?2026824151891", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties382( )
   {
      edtExHdrLin_Enabled = defedtExHdrLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtExHdrLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExHdrLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_382, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_382_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2692ExHdrLin, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2693ExHdrTip));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A966PartCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1500BarNMtr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1878BarNumTen));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTen_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2694ExHdrAlb, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrAlb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2695ExHdrKgE, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKgE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2696ExHdrCnE, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCnE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A2697ExHdrFeE, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrFeE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2698ExHdrKgR, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKgR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2699ExHdrCnR, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCnR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A2700ExHdrFeR, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrFeR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2701ExHdrKRe, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrKRe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2702ExHdrCRe, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCRe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2703ExHdrLoc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2704ExHdrExL, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrExL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2705ExHdrTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2706ExHdrCli, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExHdrCli_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtManCod_Internalname = "MANCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtExHdrFas_Internalname = "EXHDRFAS" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtManNom_Internalname = "MANNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtExHdrFdc_Internalname = "EXHDRFDC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtExHdrUln_Internalname = "EXHDRULN" ;
      edtavnRcdDeleted_382_Internalname = "vNRCDDELETED_382" ;
      edtExHdrLin_Internalname = "EXHDRLIN" ;
      edtExHdrTip_Internalname = "EXHDRTIP" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtPartCod_Internalname = "PARTCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarNMtr_Internalname = "BARNMTR" ;
      edtBarNumTen_Internalname = "BARNUMTEN" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtExHdrAlb_Internalname = "EXHDRALB" ;
      edtExHdrKgE_Internalname = "EXHDRKGE" ;
      edtExHdrCnE_Internalname = "EXHDRCNE" ;
      edtExHdrFeE_Internalname = "EXHDRFEE" ;
      edtExHdrKgR_Internalname = "EXHDRKGR" ;
      edtExHdrCnR_Internalname = "EXHDRCNR" ;
      edtExHdrFeR_Internalname = "EXHDRFER" ;
      edtExHdrKRe_Internalname = "EXHDRKRE" ;
      edtExHdrCRe_Internalname = "EXHDRCRE" ;
      edtExHdrLoc_Internalname = "EXHDRLOC" ;
      edtExHdrExL_Internalname = "EXHDREXL" ;
      edtExHdrTin_Internalname = "EXHDRTIN" ;
      edtExHdrCli_Internalname = "EXHDRCLI" ;
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
      Form.setCaption( httpContext.getMessage( "MOVIMIENTOS HDR's, TRABAJ EXT", "") );
      edtExHdrCli_Jsonclick = "" ;
      edtExHdrTin_Jsonclick = "" ;
      edtExHdrExL_Jsonclick = "" ;
      edtExHdrLoc_Jsonclick = "" ;
      edtExHdrCRe_Jsonclick = "" ;
      edtExHdrKRe_Jsonclick = "" ;
      edtExHdrFeR_Jsonclick = "" ;
      edtExHdrCnR_Jsonclick = "" ;
      edtExHdrKgR_Jsonclick = "" ;
      edtExHdrFeE_Jsonclick = "" ;
      edtExHdrCnE_Jsonclick = "" ;
      edtExHdrKgE_Jsonclick = "" ;
      edtExHdrAlb_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarNumTen_Jsonclick = "" ;
      edtBarNMtr_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtPartCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtExHdrTip_Jsonclick = "" ;
      edtExHdrLin_Jsonclick = "" ;
      edtavnRcdDeleted_382_Jsonclick = "" ;
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
      edtExHdrCli_Enabled = 1 ;
      edtExHdrTin_Enabled = 1 ;
      edtExHdrExL_Enabled = 1 ;
      edtExHdrLoc_Enabled = 1 ;
      edtExHdrCRe_Enabled = 1 ;
      edtExHdrKRe_Enabled = 1 ;
      edtExHdrFeR_Enabled = 1 ;
      edtExHdrCnR_Enabled = 1 ;
      edtExHdrKgR_Enabled = 1 ;
      edtExHdrFeE_Enabled = 1 ;
      edtExHdrCnE_Enabled = 1 ;
      edtExHdrKgE_Enabled = 1 ;
      edtExHdrAlb_Enabled = 1 ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Enabled = 0 ;
      edtBarNumTen_Enabled = 0 ;
      edtBarNMtr_Enabled = 0 ;
      edtCliCod_Enabled = 0 ;
      edtPartCod_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtExHdrTip_Enabled = 1 ;
      edtExHdrLin_Enabled = 1 ;
      edtavnRcdDeleted_382_Enabled = 1 ;
      edtExHdrUln_Jsonclick = "" ;
      edtExHdrUln_Backcolor = (int)(0xFFFFFF) ;
      edtExHdrUln_Enabled = 1 ;
      edtExHdrFdc_Jsonclick = "" ;
      edtExHdrFdc_Backcolor = (int)(0xFFFFFF) ;
      edtExHdrFdc_Enabled = 1 ;
      edtManNom_Jsonclick = "" ;
      edtManNom_Backcolor = (int)(0xFFFFFF) ;
      edtManNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtExHdrFas_Jsonclick = "" ;
      edtExHdrFas_Backcolor = (int)(0xFFFFFF) ;
      edtExHdrFas_Enabled = 1 ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Backcolor = (int)(0xFFFFFF) ;
      edtManCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      subsflControlProps_55382( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal98382( ) ;
         standaloneModal98382( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow98382( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55382( ) ;
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
      /* Using cursor T009819 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T009819_A407EmprNom[0] ;
      n407EmprNom = T009819_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T009820 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T009820_A2249ManNom[0] ;
      n2249ManNom = T009820_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      pr_default.close(18);
      GX_FocusControl = edtExHdrFdc_Internalname ;
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
      /* Using cursor T009819 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T009819_A407EmprNom[0] ;
      n407EmprNom = T009819_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Mancod( )
   {
      n2249ManNom = false ;
      /* Using cursor T009820 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A2249ManNom = T009820_A2249ManNom[0] ;
      n2249ManNom = T009820_n2249ManNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
   }

   public void valid_Exhdrfas( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2690ExHdrFdc", GXutil.rtrim( A2690ExHdrFdc));
      httpContext.ajax_rsp_assign_attri("", false, "A2691ExHdrUln", GXutil.ltrim( localUtil.ntoc( A2691ExHdrUln, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2689ExHdrFas", GXutil.rtrim( Z2689ExHdrFas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2690ExHdrFdc", GXutil.rtrim( Z2690ExHdrFdc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2691ExHdrUln", GXutil.ltrim( localUtil.ntoc( Z2691ExHdrUln, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2249ManNom", GXutil.rtrim( Z2249ManNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      n252CliCod = false ;
      n966PartCod = false ;
      /* Using cursor T009829 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A361DisCod = T009829_A361DisCod[0] ;
      A1500BarNMtr = T009829_A1500BarNMtr[0] ;
      A1878BarNumTen = T009829_A1878BarNumTen[0] ;
      A135BarColNom = T009829_A135BarColNom[0] ;
      A136BarColNum = T009829_A136BarColNum[0] ;
      A252CliCod = T009829_A252CliCod[0] ;
      n252CliCod = T009829_n252CliCod[0] ;
      pr_default.close(27);
      /* Using cursor T009830 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A966PartCod = T009830_A966PartCod[0] ;
      n966PartCod = T009830_n966PartCod[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1500BarNMtr", GXutil.rtrim( A1500BarNMtr));
      httpContext.ajax_rsp_assign_attri("", false, "A1878BarNumTen", GXutil.rtrim( A1878BarNumTen));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A966PartCod", GXutil.rtrim( A966PartCod));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''}]");
      setEventMetadata("VALID_MANCOD",",oparms:[{av:'A2249ManNom',fld:'MANNOM',pic:''}]}");
      setEventMetadata("VALID_EXHDRFAS","{handler:'valid_Exhdrfas',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_EXHDRFAS",",oparms:[{av:'A2690ExHdrFdc',fld:'EXHDRFDC',pic:''},{av:'A2691ExHdrUln',fld:'EXHDRULN',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2249ManNom',fld:'MANNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2248ManCod'},{av:'Z2689ExHdrFas'},{av:'Z2690ExHdrFdc'},{av:'Z2691ExHdrUln'},{av:'Z407EmprNom'},{av:'Z2249ManNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_EXHDRLIN","{handler:'valid_Exhdrlin',iparms:[]");
      setEventMetadata("VALID_EXHDRLIN",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A1500BarNMtr',fld:'BARNMTR',pic:''},{av:'A1878BarNumTen',fld:'BARNUMTEN',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A966PartCod',fld:'PARTCOD',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A1500BarNMtr',fld:'BARNMTR',pic:''},{av:'A1878BarNumTen',fld:'BARNUMTEN',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A966PartCod',fld:'PARTCOD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Exhdrcli',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(28);
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2689ExHdrFas = "" ;
      Z2690ExHdrFdc = "" ;
      Z2693ExHdrTip = "" ;
      Z2695ExHdrKgE = DecimalUtil.ZERO ;
      Z2697ExHdrFeE = GXutil.nullDate() ;
      Z2698ExHdrKgR = DecimalUtil.ZERO ;
      Z2700ExHdrFeR = GXutil.nullDate() ;
      Z2701ExHdrKRe = DecimalUtil.ZERO ;
      Z2703ExHdrLoc = "" ;
      Z2705ExHdrTin = "" ;
      Z130BarCodPar = "" ;
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
      A2689ExHdrFas = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A2249ManNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A2690ExHdrFdc = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode382 = "" ;
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
      sMode381 = "" ;
      GXCCtl = "" ;
      A2693ExHdrTip = "" ;
      A966PartCod = "" ;
      A1500BarNMtr = "" ;
      A1878BarNumTen = "" ;
      A135BarColNom = "" ;
      A2695ExHdrKgE = DecimalUtil.ZERO ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A2701ExHdrKRe = DecimalUtil.ZERO ;
      A2703ExHdrLoc = "" ;
      A2705ExHdrTin = "" ;
      Z407EmprNom = "" ;
      Z2249ManNom = "" ;
      T009810_A2689ExHdrFas = new String[] {""} ;
      T009810_A407EmprNom = new String[] {""} ;
      T009810_n407EmprNom = new boolean[] {false} ;
      T009810_A2249ManNom = new String[] {""} ;
      T009810_n2249ManNom = new boolean[] {false} ;
      T009810_A2690ExHdrFdc = new String[] {""} ;
      T009810_n2690ExHdrFdc = new boolean[] {false} ;
      T009810_A2691ExHdrUln = new int[1] ;
      T009810_n2691ExHdrUln = new boolean[] {false} ;
      T009810_A396EmprCod = new String[] {""} ;
      T009810_A2248ManCod = new short[1] ;
      T00988_A407EmprNom = new String[] {""} ;
      T00988_n407EmprNom = new boolean[] {false} ;
      T00989_A2249ManNom = new String[] {""} ;
      T00989_n2249ManNom = new boolean[] {false} ;
      T009811_A407EmprNom = new String[] {""} ;
      T009811_n407EmprNom = new boolean[] {false} ;
      T009812_A2249ManNom = new String[] {""} ;
      T009812_n2249ManNom = new boolean[] {false} ;
      T009813_A396EmprCod = new String[] {""} ;
      T009813_A2248ManCod = new short[1] ;
      T009813_A2689ExHdrFas = new String[] {""} ;
      T00987_A2689ExHdrFas = new String[] {""} ;
      T00987_A2690ExHdrFdc = new String[] {""} ;
      T00987_n2690ExHdrFdc = new boolean[] {false} ;
      T00987_A2691ExHdrUln = new int[1] ;
      T00987_n2691ExHdrUln = new boolean[] {false} ;
      T00987_A396EmprCod = new String[] {""} ;
      T00987_A2248ManCod = new short[1] ;
      T009814_A396EmprCod = new String[] {""} ;
      T009814_A2248ManCod = new short[1] ;
      T009814_A2689ExHdrFas = new String[] {""} ;
      T009815_A396EmprCod = new String[] {""} ;
      T009815_A2248ManCod = new short[1] ;
      T009815_A2689ExHdrFas = new String[] {""} ;
      T00986_A2689ExHdrFas = new String[] {""} ;
      T00986_A2690ExHdrFdc = new String[] {""} ;
      T00986_n2690ExHdrFdc = new boolean[] {false} ;
      T00986_A2691ExHdrUln = new int[1] ;
      T00986_n2691ExHdrUln = new boolean[] {false} ;
      T00986_A396EmprCod = new String[] {""} ;
      T00986_A2248ManCod = new short[1] ;
      T009819_A407EmprNom = new String[] {""} ;
      T009819_n407EmprNom = new boolean[] {false} ;
      T009820_A2249ManNom = new String[] {""} ;
      T009820_n2249ManNom = new boolean[] {false} ;
      T009821_A396EmprCod = new String[] {""} ;
      T009821_A2248ManCod = new short[1] ;
      T009821_A2689ExHdrFas = new String[] {""} ;
      Z1500BarNMtr = "" ;
      Z1878BarNumTen = "" ;
      Z135BarColNom = "" ;
      Z966PartCod = "" ;
      T009822_A361DisCod = new int[1] ;
      T009822_A2248ManCod = new short[1] ;
      T009822_A2689ExHdrFas = new String[] {""} ;
      T009822_A2692ExHdrLin = new int[1] ;
      T009822_A2693ExHdrTip = new String[] {""} ;
      T009822_n2693ExHdrTip = new boolean[] {false} ;
      T009822_A1500BarNMtr = new String[] {""} ;
      T009822_A1878BarNumTen = new String[] {""} ;
      T009822_A135BarColNom = new String[] {""} ;
      T009822_A136BarColNum = new int[1] ;
      T009822_A2694ExHdrAlb = new int[1] ;
      T009822_n2694ExHdrAlb = new boolean[] {false} ;
      T009822_A2695ExHdrKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T009822_n2695ExHdrKgE = new boolean[] {false} ;
      T009822_A2696ExHdrCnE = new short[1] ;
      T009822_n2696ExHdrCnE = new boolean[] {false} ;
      T009822_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      T009822_n2697ExHdrFeE = new boolean[] {false} ;
      T009822_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T009822_n2698ExHdrKgR = new boolean[] {false} ;
      T009822_A2699ExHdrCnR = new short[1] ;
      T009822_n2699ExHdrCnR = new boolean[] {false} ;
      T009822_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T009822_n2700ExHdrFeR = new boolean[] {false} ;
      T009822_A2701ExHdrKRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T009822_n2701ExHdrKRe = new boolean[] {false} ;
      T009822_A2702ExHdrCRe = new short[1] ;
      T009822_n2702ExHdrCRe = new boolean[] {false} ;
      T009822_A2703ExHdrLoc = new String[] {""} ;
      T009822_n2703ExHdrLoc = new boolean[] {false} ;
      T009822_A2704ExHdrExL = new short[1] ;
      T009822_n2704ExHdrExL = new boolean[] {false} ;
      T009822_A2705ExHdrTin = new String[] {""} ;
      T009822_n2705ExHdrTin = new boolean[] {false} ;
      T009822_A2706ExHdrCli = new int[1] ;
      T009822_n2706ExHdrCli = new boolean[] {false} ;
      T009822_A396EmprCod = new String[] {""} ;
      T009822_A129BarCod = new int[1] ;
      T009822_n129BarCod = new boolean[] {false} ;
      T009822_A132BarCodReo = new byte[1] ;
      T009822_n132BarCodReo = new boolean[] {false} ;
      T009822_A130BarCodPar = new String[] {""} ;
      T009822_n130BarCodPar = new boolean[] {false} ;
      T009822_A966PartCod = new String[] {""} ;
      T009822_n966PartCod = new boolean[] {false} ;
      T009822_A252CliCod = new int[1] ;
      T009822_n252CliCod = new boolean[] {false} ;
      T00984_A361DisCod = new int[1] ;
      T00984_A1500BarNMtr = new String[] {""} ;
      T00984_A1878BarNumTen = new String[] {""} ;
      T00984_A135BarColNom = new String[] {""} ;
      T00984_A136BarColNum = new int[1] ;
      T00984_A252CliCod = new int[1] ;
      T00984_n252CliCod = new boolean[] {false} ;
      T00985_A966PartCod = new String[] {""} ;
      T00985_n966PartCod = new boolean[] {false} ;
      T009823_A361DisCod = new int[1] ;
      T009823_A1500BarNMtr = new String[] {""} ;
      T009823_A1878BarNumTen = new String[] {""} ;
      T009823_A135BarColNom = new String[] {""} ;
      T009823_A136BarColNum = new int[1] ;
      T009823_A252CliCod = new int[1] ;
      T009823_n252CliCod = new boolean[] {false} ;
      T009824_A966PartCod = new String[] {""} ;
      T009824_n966PartCod = new boolean[] {false} ;
      T009825_A396EmprCod = new String[] {""} ;
      T009825_A2248ManCod = new short[1] ;
      T009825_A2689ExHdrFas = new String[] {""} ;
      T009825_A2692ExHdrLin = new int[1] ;
      T00983_A2248ManCod = new short[1] ;
      T00983_A2689ExHdrFas = new String[] {""} ;
      T00983_A2692ExHdrLin = new int[1] ;
      T00983_A2693ExHdrTip = new String[] {""} ;
      T00983_n2693ExHdrTip = new boolean[] {false} ;
      T00983_A2694ExHdrAlb = new int[1] ;
      T00983_n2694ExHdrAlb = new boolean[] {false} ;
      T00983_A2695ExHdrKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00983_n2695ExHdrKgE = new boolean[] {false} ;
      T00983_A2696ExHdrCnE = new short[1] ;
      T00983_n2696ExHdrCnE = new boolean[] {false} ;
      T00983_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      T00983_n2697ExHdrFeE = new boolean[] {false} ;
      T00983_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00983_n2698ExHdrKgR = new boolean[] {false} ;
      T00983_A2699ExHdrCnR = new short[1] ;
      T00983_n2699ExHdrCnR = new boolean[] {false} ;
      T00983_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T00983_n2700ExHdrFeR = new boolean[] {false} ;
      T00983_A2701ExHdrKRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00983_n2701ExHdrKRe = new boolean[] {false} ;
      T00983_A2702ExHdrCRe = new short[1] ;
      T00983_n2702ExHdrCRe = new boolean[] {false} ;
      T00983_A2703ExHdrLoc = new String[] {""} ;
      T00983_n2703ExHdrLoc = new boolean[] {false} ;
      T00983_A2704ExHdrExL = new short[1] ;
      T00983_n2704ExHdrExL = new boolean[] {false} ;
      T00983_A2705ExHdrTin = new String[] {""} ;
      T00983_n2705ExHdrTin = new boolean[] {false} ;
      T00983_A2706ExHdrCli = new int[1] ;
      T00983_n2706ExHdrCli = new boolean[] {false} ;
      T00983_A396EmprCod = new String[] {""} ;
      T00983_A129BarCod = new int[1] ;
      T00983_n129BarCod = new boolean[] {false} ;
      T00983_A132BarCodReo = new byte[1] ;
      T00983_n132BarCodReo = new boolean[] {false} ;
      T00983_A130BarCodPar = new String[] {""} ;
      T00983_n130BarCodPar = new boolean[] {false} ;
      T00982_A2248ManCod = new short[1] ;
      T00982_A2689ExHdrFas = new String[] {""} ;
      T00982_A2692ExHdrLin = new int[1] ;
      T00982_A2693ExHdrTip = new String[] {""} ;
      T00982_n2693ExHdrTip = new boolean[] {false} ;
      T00982_A2694ExHdrAlb = new int[1] ;
      T00982_n2694ExHdrAlb = new boolean[] {false} ;
      T00982_A2695ExHdrKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00982_n2695ExHdrKgE = new boolean[] {false} ;
      T00982_A2696ExHdrCnE = new short[1] ;
      T00982_n2696ExHdrCnE = new boolean[] {false} ;
      T00982_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      T00982_n2697ExHdrFeE = new boolean[] {false} ;
      T00982_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00982_n2698ExHdrKgR = new boolean[] {false} ;
      T00982_A2699ExHdrCnR = new short[1] ;
      T00982_n2699ExHdrCnR = new boolean[] {false} ;
      T00982_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T00982_n2700ExHdrFeR = new boolean[] {false} ;
      T00982_A2701ExHdrKRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00982_n2701ExHdrKRe = new boolean[] {false} ;
      T00982_A2702ExHdrCRe = new short[1] ;
      T00982_n2702ExHdrCRe = new boolean[] {false} ;
      T00982_A2703ExHdrLoc = new String[] {""} ;
      T00982_n2703ExHdrLoc = new boolean[] {false} ;
      T00982_A2704ExHdrExL = new short[1] ;
      T00982_n2704ExHdrExL = new boolean[] {false} ;
      T00982_A2705ExHdrTin = new String[] {""} ;
      T00982_n2705ExHdrTin = new boolean[] {false} ;
      T00982_A2706ExHdrCli = new int[1] ;
      T00982_n2706ExHdrCli = new boolean[] {false} ;
      T00982_A396EmprCod = new String[] {""} ;
      T00982_A129BarCod = new int[1] ;
      T00982_n129BarCod = new boolean[] {false} ;
      T00982_A132BarCodReo = new byte[1] ;
      T00982_n132BarCodReo = new boolean[] {false} ;
      T00982_A130BarCodPar = new String[] {""} ;
      T00982_n130BarCodPar = new boolean[] {false} ;
      T009829_A361DisCod = new int[1] ;
      T009829_A1500BarNMtr = new String[] {""} ;
      T009829_A1878BarNumTen = new String[] {""} ;
      T009829_A135BarColNom = new String[] {""} ;
      T009829_A136BarColNum = new int[1] ;
      T009829_A252CliCod = new int[1] ;
      T009829_n252CliCod = new boolean[] {false} ;
      T009830_A966PartCod = new String[] {""} ;
      T009830_n966PartCod = new boolean[] {false} ;
      T009831_A396EmprCod = new String[] {""} ;
      T009831_A2248ManCod = new short[1] ;
      T009831_A2689ExHdrFas = new String[] {""} ;
      T009831_A2692ExHdrLin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ2689ExHdrFas = "" ;
      ZZ2690ExHdrFdc = "" ;
      ZZ407EmprNom = "" ;
      ZZ2249ManNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.texmvhd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.texmvhd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.texmvhd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.texmvhd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.texmvhd__default(),
         new Object[] {
             new Object[] {
            T00982_A2248ManCod, T00982_A2689ExHdrFas, T00982_A2692ExHdrLin, T00982_A2693ExHdrTip, T00982_n2693ExHdrTip, T00982_A2694ExHdrAlb, T00982_n2694ExHdrAlb, T00982_A2695ExHdrKgE, T00982_n2695ExHdrKgE, T00982_A2696ExHdrCnE,
            T00982_n2696ExHdrCnE, T00982_A2697ExHdrFeE, T00982_n2697ExHdrFeE, T00982_A2698ExHdrKgR, T00982_n2698ExHdrKgR, T00982_A2699ExHdrCnR, T00982_n2699ExHdrCnR, T00982_A2700ExHdrFeR, T00982_n2700ExHdrFeR, T00982_A2701ExHdrKRe,
            T00982_n2701ExHdrKRe, T00982_A2702ExHdrCRe, T00982_n2702ExHdrCRe, T00982_A2703ExHdrLoc, T00982_n2703ExHdrLoc, T00982_A2704ExHdrExL, T00982_n2704ExHdrExL, T00982_A2705ExHdrTin, T00982_n2705ExHdrTin, T00982_A2706ExHdrCli,
            T00982_n2706ExHdrCli, T00982_A396EmprCod, T00982_A129BarCod, T00982_n129BarCod, T00982_A132BarCodReo, T00982_n132BarCodReo, T00982_A130BarCodPar, T00982_n130BarCodPar
            }
            , new Object[] {
            T00983_A2248ManCod, T00983_A2689ExHdrFas, T00983_A2692ExHdrLin, T00983_A2693ExHdrTip, T00983_n2693ExHdrTip, T00983_A2694ExHdrAlb, T00983_n2694ExHdrAlb, T00983_A2695ExHdrKgE, T00983_n2695ExHdrKgE, T00983_A2696ExHdrCnE,
            T00983_n2696ExHdrCnE, T00983_A2697ExHdrFeE, T00983_n2697ExHdrFeE, T00983_A2698ExHdrKgR, T00983_n2698ExHdrKgR, T00983_A2699ExHdrCnR, T00983_n2699ExHdrCnR, T00983_A2700ExHdrFeR, T00983_n2700ExHdrFeR, T00983_A2701ExHdrKRe,
            T00983_n2701ExHdrKRe, T00983_A2702ExHdrCRe, T00983_n2702ExHdrCRe, T00983_A2703ExHdrLoc, T00983_n2703ExHdrLoc, T00983_A2704ExHdrExL, T00983_n2704ExHdrExL, T00983_A2705ExHdrTin, T00983_n2705ExHdrTin, T00983_A2706ExHdrCli,
            T00983_n2706ExHdrCli, T00983_A396EmprCod, T00983_A129BarCod, T00983_n129BarCod, T00983_A132BarCodReo, T00983_n132BarCodReo, T00983_A130BarCodPar, T00983_n130BarCodPar
            }
            , new Object[] {
            T00984_A361DisCod, T00984_A1500BarNMtr, T00984_A1878BarNumTen, T00984_A135BarColNom, T00984_A136BarColNum, T00984_A252CliCod, T00984_n252CliCod
            }
            , new Object[] {
            T00985_A966PartCod, T00985_n966PartCod
            }
            , new Object[] {
            T00986_A2689ExHdrFas, T00986_A2690ExHdrFdc, T00986_n2690ExHdrFdc, T00986_A2691ExHdrUln, T00986_n2691ExHdrUln, T00986_A396EmprCod, T00986_A2248ManCod
            }
            , new Object[] {
            T00987_A2689ExHdrFas, T00987_A2690ExHdrFdc, T00987_n2690ExHdrFdc, T00987_A2691ExHdrUln, T00987_n2691ExHdrUln, T00987_A396EmprCod, T00987_A2248ManCod
            }
            , new Object[] {
            T00988_A407EmprNom, T00988_n407EmprNom
            }
            , new Object[] {
            T00989_A2249ManNom, T00989_n2249ManNom
            }
            , new Object[] {
            T009810_A2689ExHdrFas, T009810_A407EmprNom, T009810_n407EmprNom, T009810_A2249ManNom, T009810_n2249ManNom, T009810_A2690ExHdrFdc, T009810_n2690ExHdrFdc, T009810_A2691ExHdrUln, T009810_n2691ExHdrUln, T009810_A396EmprCod,
            T009810_A2248ManCod
            }
            , new Object[] {
            T009811_A407EmprNom, T009811_n407EmprNom
            }
            , new Object[] {
            T009812_A2249ManNom, T009812_n2249ManNom
            }
            , new Object[] {
            T009813_A396EmprCod, T009813_A2248ManCod, T009813_A2689ExHdrFas
            }
            , new Object[] {
            T009814_A396EmprCod, T009814_A2248ManCod, T009814_A2689ExHdrFas
            }
            , new Object[] {
            T009815_A396EmprCod, T009815_A2248ManCod, T009815_A2689ExHdrFas
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T009819_A407EmprNom, T009819_n407EmprNom
            }
            , new Object[] {
            T009820_A2249ManNom, T009820_n2249ManNom
            }
            , new Object[] {
            T009821_A396EmprCod, T009821_A2248ManCod, T009821_A2689ExHdrFas
            }
            , new Object[] {
            T009822_A361DisCod, T009822_A2248ManCod, T009822_A2689ExHdrFas, T009822_A2692ExHdrLin, T009822_A2693ExHdrTip, T009822_n2693ExHdrTip, T009822_A1500BarNMtr, T009822_A1878BarNumTen, T009822_A135BarColNom, T009822_A136BarColNum,
            T009822_A2694ExHdrAlb, T009822_n2694ExHdrAlb, T009822_A2695ExHdrKgE, T009822_n2695ExHdrKgE, T009822_A2696ExHdrCnE, T009822_n2696ExHdrCnE, T009822_A2697ExHdrFeE, T009822_n2697ExHdrFeE, T009822_A2698ExHdrKgR, T009822_n2698ExHdrKgR,
            T009822_A2699ExHdrCnR, T009822_n2699ExHdrCnR, T009822_A2700ExHdrFeR, T009822_n2700ExHdrFeR, T009822_A2701ExHdrKRe, T009822_n2701ExHdrKRe, T009822_A2702ExHdrCRe, T009822_n2702ExHdrCRe, T009822_A2703ExHdrLoc, T009822_n2703ExHdrLoc,
            T009822_A2704ExHdrExL, T009822_n2704ExHdrExL, T009822_A2705ExHdrTin, T009822_n2705ExHdrTin, T009822_A2706ExHdrCli, T009822_n2706ExHdrCli, T009822_A396EmprCod, T009822_A129BarCod, T009822_n129BarCod, T009822_A132BarCodReo,
            T009822_n132BarCodReo, T009822_A130BarCodPar, T009822_n130BarCodPar, T009822_A966PartCod, T009822_n966PartCod, T009822_A252CliCod, T009822_n252CliCod
            }
            , new Object[] {
            T009823_A361DisCod, T009823_A1500BarNMtr, T009823_A1878BarNumTen, T009823_A135BarColNom, T009823_A136BarColNum, T009823_A252CliCod, T009823_n252CliCod
            }
            , new Object[] {
            T009824_A966PartCod, T009824_n966PartCod
            }
            , new Object[] {
            T009825_A396EmprCod, T009825_A2248ManCod, T009825_A2689ExHdrFas, T009825_A2692ExHdrLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T009829_A361DisCod, T009829_A1500BarNMtr, T009829_A1878BarNumTen, T009829_A135BarColNom, T009829_A136BarColNum, T009829_A252CliCod, T009829_n252CliCod
            }
            , new Object[] {
            T009830_A966PartCod, T009830_n966PartCod
            }
            , new Object[] {
            T009831_A396EmprCod, T009831_A2248ManCod, T009831_A2689ExHdrFas, T009831_A2692ExHdrLin
            }
         }
      );
   }

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
   private short Z2248ManCod ;
   private short Z2696ExHdrCnE ;
   private short Z2699ExHdrCnR ;
   private short Z2702ExHdrCRe ;
   private short Z2704ExHdrExL ;
   private short nRcdDeleted_382 ;
   private short nRcdExists_382 ;
   private short nIsMod_382 ;
   private short A2248ManCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount382 ;
   private short RcdFound382 ;
   private short nBlankRcdUsr382 ;
   private short A2696ExHdrCnE ;
   private short A2699ExHdrCnR ;
   private short A2702ExHdrCRe ;
   private short A2704ExHdrExL ;
   private short RcdFound381 ;
   private short nIsDirty_381 ;
   private short nIsDirty_382 ;
   private short ZZ2248ManCod ;
   private int Z2691ExHdrUln ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z2692ExHdrLin ;
   private int Z2694ExHdrAlb ;
   private int Z2706ExHdrCli ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtManCod_Enabled ;
   private int edtExHdrFas_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtManNom_Enabled ;
   private int edtExHdrFdc_Enabled ;
   private int A2691ExHdrUln ;
   private int edtExHdrUln_Enabled ;
   private int edtavnRcdDeleted_382_Enabled ;
   private int edtExHdrLin_Enabled ;
   private int edtExHdrTip_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtPartCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtBarNMtr_Enabled ;
   private int edtBarNumTen_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarColNum_Enabled ;
   private int edtExHdrAlb_Enabled ;
   private int edtExHdrKgE_Enabled ;
   private int edtExHdrCnE_Enabled ;
   private int edtExHdrFeE_Enabled ;
   private int edtExHdrKgR_Enabled ;
   private int edtExHdrCnR_Enabled ;
   private int edtExHdrFeR_Enabled ;
   private int edtExHdrKRe_Enabled ;
   private int edtExHdrCRe_Enabled ;
   private int edtExHdrLoc_Enabled ;
   private int edtExHdrExL_Enabled ;
   private int edtExHdrTin_Enabled ;
   private int edtExHdrCli_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A2692ExHdrLin ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A2694ExHdrAlb ;
   private int A2706ExHdrCli ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtExHdrLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtExHdrUln_Backcolor ;
   private int edtExHdrFdc_Backcolor ;
   private int edtManNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtExHdrFas_Backcolor ;
   private int edtManCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ2691ExHdrUln ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2695ExHdrKgE ;
   private java.math.BigDecimal Z2698ExHdrKgR ;
   private java.math.BigDecimal Z2701ExHdrKRe ;
   private java.math.BigDecimal A2695ExHdrKgE ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private java.math.BigDecimal A2701ExHdrKRe ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2689ExHdrFas ;
   private String Z2690ExHdrFdc ;
   private String Z2693ExHdrTip ;
   private String Z2703ExHdrLoc ;
   private String Z2705ExHdrTin ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtExHdrFas_Internalname ;
   private String A2689ExHdrFas ;
   private String edtExHdrFas_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtManNom_Internalname ;
   private String A2249ManNom ;
   private String edtManNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtExHdrFdc_Internalname ;
   private String A2690ExHdrFdc ;
   private String edtExHdrFdc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtExHdrUln_Internalname ;
   private String edtExHdrUln_Jsonclick ;
   private String sMode382 ;
   private String edtavnRcdDeleted_382_Internalname ;
   private String edtExHdrLin_Internalname ;
   private String edtExHdrTip_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtPartCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtBarNMtr_Internalname ;
   private String edtBarNumTen_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtExHdrAlb_Internalname ;
   private String edtExHdrKgE_Internalname ;
   private String edtExHdrCnE_Internalname ;
   private String edtExHdrFeE_Internalname ;
   private String edtExHdrKgR_Internalname ;
   private String edtExHdrCnR_Internalname ;
   private String edtExHdrFeR_Internalname ;
   private String edtExHdrKRe_Internalname ;
   private String edtExHdrCRe_Internalname ;
   private String edtExHdrLoc_Internalname ;
   private String edtExHdrExL_Internalname ;
   private String edtExHdrTin_Internalname ;
   private String edtExHdrCli_Internalname ;
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
   private String sMode381 ;
   private String GXCCtl ;
   private String A2693ExHdrTip ;
   private String A966PartCod ;
   private String A1500BarNMtr ;
   private String A1878BarNumTen ;
   private String A135BarColNom ;
   private String A2703ExHdrLoc ;
   private String A2705ExHdrTin ;
   private String Z407EmprNom ;
   private String Z2249ManNom ;
   private String Z1500BarNMtr ;
   private String Z1878BarNumTen ;
   private String Z135BarColNom ;
   private String Z966PartCod ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_382_Jsonclick ;
   private String edtExHdrLin_Jsonclick ;
   private String edtExHdrTip_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtPartCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarNMtr_Jsonclick ;
   private String edtBarNumTen_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtExHdrAlb_Jsonclick ;
   private String edtExHdrKgE_Jsonclick ;
   private String edtExHdrCnE_Jsonclick ;
   private String edtExHdrFeE_Jsonclick ;
   private String edtExHdrKgR_Jsonclick ;
   private String edtExHdrCnR_Jsonclick ;
   private String edtExHdrFeR_Jsonclick ;
   private String edtExHdrKRe_Jsonclick ;
   private String edtExHdrCRe_Jsonclick ;
   private String edtExHdrLoc_Jsonclick ;
   private String edtExHdrExL_Jsonclick ;
   private String edtExHdrTin_Jsonclick ;
   private String edtExHdrCli_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2689ExHdrFas ;
   private String ZZ2690ExHdrFdc ;
   private String ZZ407EmprNom ;
   private String ZZ2249ManNom ;
   private java.util.Date Z2697ExHdrFeE ;
   private java.util.Date Z2700ExHdrFeR ;
   private java.util.Date A2697ExHdrFeE ;
   private java.util.Date A2700ExHdrFeR ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n2249ManNom ;
   private boolean n2690ExHdrFdc ;
   private boolean n2691ExHdrUln ;
   private boolean n2693ExHdrTip ;
   private boolean n2694ExHdrAlb ;
   private boolean n2695ExHdrKgE ;
   private boolean n2696ExHdrCnE ;
   private boolean n2697ExHdrFeE ;
   private boolean n2698ExHdrKgR ;
   private boolean n2699ExHdrCnR ;
   private boolean n2700ExHdrFeR ;
   private boolean n2701ExHdrKRe ;
   private boolean n2702ExHdrCRe ;
   private boolean n2703ExHdrLoc ;
   private boolean n2704ExHdrExL ;
   private boolean n2705ExHdrTin ;
   private boolean n2706ExHdrCli ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T009810_A2689ExHdrFas ;
   private String[] T009810_A407EmprNom ;
   private boolean[] T009810_n407EmprNom ;
   private String[] T009810_A2249ManNom ;
   private boolean[] T009810_n2249ManNom ;
   private String[] T009810_A2690ExHdrFdc ;
   private boolean[] T009810_n2690ExHdrFdc ;
   private int[] T009810_A2691ExHdrUln ;
   private boolean[] T009810_n2691ExHdrUln ;
   private String[] T009810_A396EmprCod ;
   private short[] T009810_A2248ManCod ;
   private String[] T00988_A407EmprNom ;
   private boolean[] T00988_n407EmprNom ;
   private String[] T00989_A2249ManNom ;
   private boolean[] T00989_n2249ManNom ;
   private String[] T009811_A407EmprNom ;
   private boolean[] T009811_n407EmprNom ;
   private String[] T009812_A2249ManNom ;
   private boolean[] T009812_n2249ManNom ;
   private String[] T009813_A396EmprCod ;
   private short[] T009813_A2248ManCod ;
   private String[] T009813_A2689ExHdrFas ;
   private String[] T00987_A2689ExHdrFas ;
   private String[] T00987_A2690ExHdrFdc ;
   private boolean[] T00987_n2690ExHdrFdc ;
   private int[] T00987_A2691ExHdrUln ;
   private boolean[] T00987_n2691ExHdrUln ;
   private String[] T00987_A396EmprCod ;
   private short[] T00987_A2248ManCod ;
   private String[] T009814_A396EmprCod ;
   private short[] T009814_A2248ManCod ;
   private String[] T009814_A2689ExHdrFas ;
   private String[] T009815_A396EmprCod ;
   private short[] T009815_A2248ManCod ;
   private String[] T009815_A2689ExHdrFas ;
   private String[] T00986_A2689ExHdrFas ;
   private String[] T00986_A2690ExHdrFdc ;
   private boolean[] T00986_n2690ExHdrFdc ;
   private int[] T00986_A2691ExHdrUln ;
   private boolean[] T00986_n2691ExHdrUln ;
   private String[] T00986_A396EmprCod ;
   private short[] T00986_A2248ManCod ;
   private String[] T009819_A407EmprNom ;
   private boolean[] T009819_n407EmprNom ;
   private String[] T009820_A2249ManNom ;
   private boolean[] T009820_n2249ManNom ;
   private String[] T009821_A396EmprCod ;
   private short[] T009821_A2248ManCod ;
   private String[] T009821_A2689ExHdrFas ;
   private int[] T009822_A361DisCod ;
   private short[] T009822_A2248ManCod ;
   private String[] T009822_A2689ExHdrFas ;
   private int[] T009822_A2692ExHdrLin ;
   private String[] T009822_A2693ExHdrTip ;
   private boolean[] T009822_n2693ExHdrTip ;
   private String[] T009822_A1500BarNMtr ;
   private String[] T009822_A1878BarNumTen ;
   private String[] T009822_A135BarColNom ;
   private int[] T009822_A136BarColNum ;
   private int[] T009822_A2694ExHdrAlb ;
   private boolean[] T009822_n2694ExHdrAlb ;
   private java.math.BigDecimal[] T009822_A2695ExHdrKgE ;
   private boolean[] T009822_n2695ExHdrKgE ;
   private short[] T009822_A2696ExHdrCnE ;
   private boolean[] T009822_n2696ExHdrCnE ;
   private java.util.Date[] T009822_A2697ExHdrFeE ;
   private boolean[] T009822_n2697ExHdrFeE ;
   private java.math.BigDecimal[] T009822_A2698ExHdrKgR ;
   private boolean[] T009822_n2698ExHdrKgR ;
   private short[] T009822_A2699ExHdrCnR ;
   private boolean[] T009822_n2699ExHdrCnR ;
   private java.util.Date[] T009822_A2700ExHdrFeR ;
   private boolean[] T009822_n2700ExHdrFeR ;
   private java.math.BigDecimal[] T009822_A2701ExHdrKRe ;
   private boolean[] T009822_n2701ExHdrKRe ;
   private short[] T009822_A2702ExHdrCRe ;
   private boolean[] T009822_n2702ExHdrCRe ;
   private String[] T009822_A2703ExHdrLoc ;
   private boolean[] T009822_n2703ExHdrLoc ;
   private short[] T009822_A2704ExHdrExL ;
   private boolean[] T009822_n2704ExHdrExL ;
   private String[] T009822_A2705ExHdrTin ;
   private boolean[] T009822_n2705ExHdrTin ;
   private int[] T009822_A2706ExHdrCli ;
   private boolean[] T009822_n2706ExHdrCli ;
   private String[] T009822_A396EmprCod ;
   private int[] T009822_A129BarCod ;
   private boolean[] T009822_n129BarCod ;
   private byte[] T009822_A132BarCodReo ;
   private boolean[] T009822_n132BarCodReo ;
   private String[] T009822_A130BarCodPar ;
   private boolean[] T009822_n130BarCodPar ;
   private String[] T009822_A966PartCod ;
   private boolean[] T009822_n966PartCod ;
   private int[] T009822_A252CliCod ;
   private boolean[] T009822_n252CliCod ;
   private int[] T00984_A361DisCod ;
   private String[] T00984_A1500BarNMtr ;
   private String[] T00984_A1878BarNumTen ;
   private String[] T00984_A135BarColNom ;
   private int[] T00984_A136BarColNum ;
   private int[] T00984_A252CliCod ;
   private boolean[] T00984_n252CliCod ;
   private String[] T00985_A966PartCod ;
   private boolean[] T00985_n966PartCod ;
   private int[] T009823_A361DisCod ;
   private String[] T009823_A1500BarNMtr ;
   private String[] T009823_A1878BarNumTen ;
   private String[] T009823_A135BarColNom ;
   private int[] T009823_A136BarColNum ;
   private int[] T009823_A252CliCod ;
   private boolean[] T009823_n252CliCod ;
   private String[] T009824_A966PartCod ;
   private boolean[] T009824_n966PartCod ;
   private String[] T009825_A396EmprCod ;
   private short[] T009825_A2248ManCod ;
   private String[] T009825_A2689ExHdrFas ;
   private int[] T009825_A2692ExHdrLin ;
   private short[] T00983_A2248ManCod ;
   private String[] T00983_A2689ExHdrFas ;
   private int[] T00983_A2692ExHdrLin ;
   private String[] T00983_A2693ExHdrTip ;
   private boolean[] T00983_n2693ExHdrTip ;
   private int[] T00983_A2694ExHdrAlb ;
   private boolean[] T00983_n2694ExHdrAlb ;
   private java.math.BigDecimal[] T00983_A2695ExHdrKgE ;
   private boolean[] T00983_n2695ExHdrKgE ;
   private short[] T00983_A2696ExHdrCnE ;
   private boolean[] T00983_n2696ExHdrCnE ;
   private java.util.Date[] T00983_A2697ExHdrFeE ;
   private boolean[] T00983_n2697ExHdrFeE ;
   private java.math.BigDecimal[] T00983_A2698ExHdrKgR ;
   private boolean[] T00983_n2698ExHdrKgR ;
   private short[] T00983_A2699ExHdrCnR ;
   private boolean[] T00983_n2699ExHdrCnR ;
   private java.util.Date[] T00983_A2700ExHdrFeR ;
   private boolean[] T00983_n2700ExHdrFeR ;
   private java.math.BigDecimal[] T00983_A2701ExHdrKRe ;
   private boolean[] T00983_n2701ExHdrKRe ;
   private short[] T00983_A2702ExHdrCRe ;
   private boolean[] T00983_n2702ExHdrCRe ;
   private String[] T00983_A2703ExHdrLoc ;
   private boolean[] T00983_n2703ExHdrLoc ;
   private short[] T00983_A2704ExHdrExL ;
   private boolean[] T00983_n2704ExHdrExL ;
   private String[] T00983_A2705ExHdrTin ;
   private boolean[] T00983_n2705ExHdrTin ;
   private int[] T00983_A2706ExHdrCli ;
   private boolean[] T00983_n2706ExHdrCli ;
   private String[] T00983_A396EmprCod ;
   private int[] T00983_A129BarCod ;
   private boolean[] T00983_n129BarCod ;
   private byte[] T00983_A132BarCodReo ;
   private boolean[] T00983_n132BarCodReo ;
   private String[] T00983_A130BarCodPar ;
   private boolean[] T00983_n130BarCodPar ;
   private short[] T00982_A2248ManCod ;
   private String[] T00982_A2689ExHdrFas ;
   private int[] T00982_A2692ExHdrLin ;
   private String[] T00982_A2693ExHdrTip ;
   private boolean[] T00982_n2693ExHdrTip ;
   private int[] T00982_A2694ExHdrAlb ;
   private boolean[] T00982_n2694ExHdrAlb ;
   private java.math.BigDecimal[] T00982_A2695ExHdrKgE ;
   private boolean[] T00982_n2695ExHdrKgE ;
   private short[] T00982_A2696ExHdrCnE ;
   private boolean[] T00982_n2696ExHdrCnE ;
   private java.util.Date[] T00982_A2697ExHdrFeE ;
   private boolean[] T00982_n2697ExHdrFeE ;
   private java.math.BigDecimal[] T00982_A2698ExHdrKgR ;
   private boolean[] T00982_n2698ExHdrKgR ;
   private short[] T00982_A2699ExHdrCnR ;
   private boolean[] T00982_n2699ExHdrCnR ;
   private java.util.Date[] T00982_A2700ExHdrFeR ;
   private boolean[] T00982_n2700ExHdrFeR ;
   private java.math.BigDecimal[] T00982_A2701ExHdrKRe ;
   private boolean[] T00982_n2701ExHdrKRe ;
   private short[] T00982_A2702ExHdrCRe ;
   private boolean[] T00982_n2702ExHdrCRe ;
   private String[] T00982_A2703ExHdrLoc ;
   private boolean[] T00982_n2703ExHdrLoc ;
   private short[] T00982_A2704ExHdrExL ;
   private boolean[] T00982_n2704ExHdrExL ;
   private String[] T00982_A2705ExHdrTin ;
   private boolean[] T00982_n2705ExHdrTin ;
   private int[] T00982_A2706ExHdrCli ;
   private boolean[] T00982_n2706ExHdrCli ;
   private String[] T00982_A396EmprCod ;
   private int[] T00982_A129BarCod ;
   private boolean[] T00982_n129BarCod ;
   private byte[] T00982_A132BarCodReo ;
   private boolean[] T00982_n132BarCodReo ;
   private String[] T00982_A130BarCodPar ;
   private boolean[] T00982_n130BarCodPar ;
   private int[] T009829_A361DisCod ;
   private String[] T009829_A1500BarNMtr ;
   private String[] T009829_A1878BarNumTen ;
   private String[] T009829_A135BarColNom ;
   private int[] T009829_A136BarColNum ;
   private int[] T009829_A252CliCod ;
   private boolean[] T009829_n252CliCod ;
   private String[] T009830_A966PartCod ;
   private boolean[] T009830_n966PartCod ;
   private String[] T009831_A396EmprCod ;
   private short[] T009831_A2248ManCod ;
   private String[] T009831_A2689ExHdrFas ;
   private int[] T009831_A2692ExHdrLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class texmvhd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class texmvhd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class texmvhd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class texmvhd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class texmvhd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00982", "SELECT ManCod, ExHdrFas, ExHdrLin, ExHdrTip, ExHdrAlb, ExHdrKgE, ExHdrCnE, ExHdrFeE, ExHdrKgR, ExHdrCnR, ExHdrFeR, ExHdrKRe, ExHdrCRe, ExHdrLoc, ExHdrExL, ExHdrTin, ExHdrCli, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXMVH WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ?  FOR UPDATE OF ExHdrTip, ExHdrAlb, ExHdrKgE, ExHdrCnE, ExHdrFeE, ExHdrKgR, ExHdrCnR, ExHdrFeR, ExHdrKRe, ExHdrCRe, ExHdrLoc, ExHdrExL, ExHdrTin, ExHdrCli, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00983", "SELECT ManCod, ExHdrFas, ExHdrLin, ExHdrTip, ExHdrAlb, ExHdrKgE, ExHdrCnE, ExHdrFeE, ExHdrKgR, ExHdrCnR, ExHdrFeR, ExHdrKRe, ExHdrCRe, ExHdrLoc, ExHdrExL, ExHdrTin, ExHdrCli, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXMVH WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00984", "SELECT DisCod, BarNMtr, BarNumTen, BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00985", "SELECT PartCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00986", "SELECT ExHdrFas, ExHdrFdc, ExHdrUln, EmprCod, ManCod FROM TXPCEXMVH WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ?  FOR UPDATE OF ExHdrFdc, ExHdrUln NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00987", "SELECT ExHdrFas, ExHdrFdc, ExHdrUln, EmprCod, ManCod FROM TXPCEXMVH WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00988", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00989", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009810", "SELECT /*+ FIRST_ROWS(100) */ TM1.ExHdrFas, T2.EmprNom, T3.ManNom, TM1.ExHdrFdc, TM1.ExHdrUln, TM1.EmprCod, TM1.ManCod FROM ((TXPCEXMVH TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = TM1.EmprCod AND T3.ManCod = TM1.ManCod) WHERE TM1.EmprCod = ? and TM1.ManCod = ? and TM1.ExHdrFas = ? ORDER BY TM1.EmprCod, TM1.ManCod, TM1.ExHdrFas ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009811", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009812", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009813", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, ExHdrFas FROM TXPCEXMVH WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009814", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, ExHdrFas FROM TXPCEXMVH WHERE ( EmprCod > ? or EmprCod = ? and ManCod > ? or ManCod = ? and EmprCod = ? and ExHdrFas > ?) ORDER BY EmprCod, ManCod, ExHdrFas) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T009815", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, ExHdrFas FROM TXPCEXMVH WHERE ( EmprCod < ? or EmprCod = ? and ManCod < ? or ManCod = ? and EmprCod = ? and ExHdrFas < ?) ORDER BY EmprCod DESC, ManCod DESC, ExHdrFas DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T009816", "INSERT INTO TXPCEXMVH(ExHdrFas, ExHdrFdc, ExHdrUln, EmprCod, ManCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCEXMVH")
         ,new UpdateCursor("T009817", "UPDATE TXPCEXMVH SET ExHdrFdc=?, ExHdrUln=?  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ?", GX_NOMASK, "TXPCEXMVH")
         ,new UpdateCursor("T009818", "DELETE FROM TXPCEXMVH  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ?", GX_NOMASK, "TXPCEXMVH")
         ,new ForEachCursor("T009819", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009820", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009821", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ManCod, ExHdrFas FROM TXPCEXMVH ORDER BY EmprCod, ManCod, ExHdrFas ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009822", "SELECT T2.DisCod, T1.ManCod, T1.ExHdrFas, T1.ExHdrLin, T1.ExHdrTip, T2.BarNMtr, T2.BarNumTen, T2.BarColNom, T2.BarColNum, T1.ExHdrAlb, T1.ExHdrKgE, T1.ExHdrCnE, T1.ExHdrFeE, T1.ExHdrKgR, T1.ExHdrCnR, T1.ExHdrFeR, T1.ExHdrKRe, T1.ExHdrCRe, T1.ExHdrLoc, T1.ExHdrExL, T1.ExHdrTin, T1.ExHdrCli, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.PartCod, T2.CliCod FROM ((TXPLEXMVH T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) WHERE T1.ManCod = ? and T1.ExHdrFas = ? and T1.ExHdrLin = ? and T1.EmprCod = ? ORDER BY T1.EmprCod, T1.ManCod, T1.ExHdrFas, T1.ExHdrLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009823", "SELECT DisCod, BarNMtr, BarNumTen, BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009824", "SELECT PartCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009825", "SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T009826", "INSERT INTO TXPLEXMVH(ManCod, ExHdrFas, ExHdrLin, ExHdrTip, ExHdrAlb, ExHdrKgE, ExHdrCnE, ExHdrFeE, ExHdrKgR, ExHdrCnR, ExHdrFeR, ExHdrKRe, ExHdrCRe, ExHdrLoc, ExHdrExL, ExHdrTin, ExHdrCli, EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrMtE, ExHdrMtR, ExtHdrLS) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPLEXMVH")
         ,new UpdateCursor("T009827", "UPDATE TXPLEXMVH SET ExHdrTip=?, ExHdrAlb=?, ExHdrKgE=?, ExHdrCnE=?, ExHdrFeE=?, ExHdrKgR=?, ExHdrCnR=?, ExHdrFeR=?, ExHdrKRe=?, ExHdrCRe=?, ExHdrLoc=?, ExHdrExL=?, ExHdrTin=?, ExHdrCli=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ?", GX_NOMASK, "TXPLEXMVH")
         ,new UpdateCursor("T009828", "DELETE FROM TXPLEXMVH  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ?", GX_NOMASK, "TXPLEXMVH")
         ,new ForEachCursor("T009829", "SELECT DisCod, BarNMtr, BarNumTen, BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009830", "SELECT PartCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T009831", "SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE ManCod = ? and ExHdrFas = ? and EmprCod = ? ORDER BY EmprCod, ManCod, ExHdrFas, ExHdrLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 3);
               ((int[]) buf[32])[0] = rslt.getInt(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 3);
               ((int[]) buf[32])[0] = rslt.getInt(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 28);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((short[]) buf[10])[0] = rslt.getShort(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(20);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(22);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(23, 3);
               ((int[]) buf[37])[0] = rslt.getInt(24);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(25);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(27, 16);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(28);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 28);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 28);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 24 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 10);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 10);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[30]).intValue());
               }
               stmt.setString(18, (String)parms[31], 3);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[33]).intValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[37], 1);
               }
               return;
            case 25 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 10);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
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
                  stmt.setString(17, (String)parms[33], 1);
               }
               stmt.setString(18, (String)parms[34], 3);
               stmt.setShort(19, ((Number) parms[35]).shortValue());
               stmt.setString(20, (String)parms[36], 8);
               stmt.setInt(21, ((Number) parms[37]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 3);
               return;
      }
   }

}

