package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttraspi_impl extends GXDataArea
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
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
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
         gxload_4( A396EmprCod, A652OpeCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TEST DE TRANSPIRACION/AGUA", ""), (short)(0)) ;
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
      nRC_GXsfl_340 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_340"))) ;
      nGXsfl_340_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_340_idx"))) ;
      sGXsfl_340_idx = httpContext.GetPar( "sGXsfl_340_idx") ;
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

   public ttraspi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttraspi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttraspi_impl.class ));
   }

   public ttraspi_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTRASPI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3253SolTraCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolTraCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3253SolTraCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3253SolTraCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraCod_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraMat_Internalname, GXutil.rtrim( A3254SolTraMat), GXutil.rtrim( localUtil.format( A3254SolTraMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraMat_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraSer_Internalname, GXutil.rtrim( A3255SolTraSer), GXutil.rtrim( localUtil.format( A3255SolTraSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraSer_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraTip_Internalname, GXutil.ltrim( localUtil.ntoc( A3256SolTraTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolTraTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3256SolTraTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3256SolTraTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraTip_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Disp Cli", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraDisN_Internalname, GXutil.rtrim( A3257SolTraDisN), GXutil.rtrim( localUtil.format( A3257SolTraDisN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraDisN_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraDisN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Color Nombre", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraNom_Internalname, GXutil.rtrim( A3258SolTraNom), GXutil.rtrim( localUtil.format( A3258SolTraNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraNom_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3259SolTraNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolTraNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3259SolTraNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3259SolTraNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraNum_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Test", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSolTraFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraFec_Internalname, localUtil.format(A3260SolTraFec, "99/99/99"), localUtil.format( A3260SolTraFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraFec_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSolTraFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSolTraFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTRASPI.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A3261SolTraCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolTraCliC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3261SolTraCliC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3261SolTraCliC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraCliC_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraCliC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraCliN_Internalname, GXutil.rtrim( A3262SolTraCliN), GXutil.rtrim( localUtil.format( A3262SolTraCliN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraCliN_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Alteracion Color", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraAc_Internalname, GXutil.rtrim( A3263SolTraAc), GXutil.rtrim( localUtil.format( A3263SolTraAc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraAc_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraAc_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Manchado", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraMa_Internalname, GXutil.rtrim( A3264SolTraMa), GXutil.rtrim( localUtil.format( A3264SolTraMa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraMa_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraMa_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Norma Iso", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraNor_Internalname, GXutil.rtrim( A3265SolTraNor), GXutil.rtrim( localUtil.format( A3265SolTraNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraNor_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraNor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraMaq_Internalname, GXutil.rtrim( A3266SolTraMaq), GXutil.rtrim( localUtil.format( A3266SolTraMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraMaq_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Referencia Empesa Exterior", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraRef_Internalname, GXutil.rtrim( A3267SolTraRef), GXutil.rtrim( localUtil.format( A3267SolTraRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraRef_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraRef_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A3268SolTraUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolTraUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3268SolTraUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3268SolTraUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraUlin_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Valor Fibra Tac (Poliamida)", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAciTac_Internalname, GXutil.rtrim( A3759SolAciTac), GXutil.rtrim( localUtil.format( A3759SolAciTac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAciTac_Jsonclick, 0, "", "", "", "", "", 1, edtSolAciTac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Valor Fibra Coto", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAciCo_Internalname, GXutil.rtrim( A3760SolAciCo), GXutil.rtrim( localUtil.format( A3760SolAciCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAciCo_Jsonclick, 0, "", "", "", "", "", 1, edtSolAciCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Valor Fibra Pa6", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAciPa6_Internalname, GXutil.rtrim( A3761SolAciPa6), GXutil.rtrim( localUtil.format( A3761SolAciPa6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAciPa6_Jsonclick, 0, "", "", "", "", "", 1, edtSolAciPa6_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Valor Fibra Pes", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAciPes_Internalname, GXutil.rtrim( A3762SolAciPes), GXutil.rtrim( localUtil.format( A3762SolAciPes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAciPes_Jsonclick, 0, "", "", "", "", "", 1, edtSolAciPes_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Valor Fibra Pac", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAciPac_Internalname, GXutil.rtrim( A3763SolAciPac), GXutil.rtrim( localUtil.format( A3763SolAciPac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAciPac_Jsonclick, 0, "", "", "", "", "", 1, edtSolAciPac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Valor Fibra Wool", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAciWo_Internalname, GXutil.rtrim( A3764SolAciWo), GXutil.rtrim( localUtil.format( A3764SolAciWo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAciWo_Jsonclick, 0, "", "", "", "", "", 1, edtSolAciWo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Norma", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAciNorm_Internalname, GXutil.rtrim( A3765SolAciNorm), GXutil.rtrim( localUtil.format( A3765SolAciNorm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAciNorm_Jsonclick, 0, "", "", "", "", "", 1, edtSolAciNorm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Valor Fibra Tac (Poliamida)", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAlcTac_Internalname, GXutil.rtrim( A3766SolAlcTac), GXutil.rtrim( localUtil.format( A3766SolAlcTac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAlcTac_Jsonclick, 0, "", "", "", "", "", 1, edtSolAlcTac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Valor Fibra Coto", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAlcCo_Internalname, GXutil.rtrim( A3767SolAlcCo), GXutil.rtrim( localUtil.format( A3767SolAlcCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAlcCo_Jsonclick, 0, "", "", "", "", "", 1, edtSolAlcCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Valor Fibra Pa6", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAlcPa6_Internalname, GXutil.rtrim( A3768SolAlcPa6), GXutil.rtrim( localUtil.format( A3768SolAlcPa6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAlcPa6_Jsonclick, 0, "", "", "", "", "", 1, edtSolAlcPa6_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Valor Fibra Pes", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAlcPes_Internalname, GXutil.rtrim( A3769SolAlcPes), GXutil.rtrim( localUtil.format( A3769SolAlcPes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAlcPes_Jsonclick, 0, "", "", "", "", "", 1, edtSolAlcPes_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Valor Fibra Pac", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAlcPac_Internalname, GXutil.rtrim( A3770SolAlcPac), GXutil.rtrim( localUtil.format( A3770SolAlcPac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAlcPac_Jsonclick, 0, "", "", "", "", "", 1, edtSolAlcPac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Valor Fibra Wool", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAlcWo_Internalname, GXutil.rtrim( A3771SolAlcWo), GXutil.rtrim( localUtil.format( A3771SolAlcWo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAlcWo_Jsonclick, 0, "", "", "", "", "", 1, edtSolAlcWo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Norma", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAlcNorm_Internalname, GXutil.rtrim( A3772SolAlcNorm), GXutil.rtrim( localUtil.format( A3772SolAlcNorm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAlcNorm_Jsonclick, 0, "", "", "", "", "", 1, edtSolAlcNorm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Valor Fibra Tac (Poliamida)", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAquTac_Internalname, GXutil.rtrim( A3773SolAquTac), GXutil.rtrim( localUtil.format( A3773SolAquTac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAquTac_Jsonclick, 0, "", "", "", "", "", 1, edtSolAquTac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Valor Fibra Coto", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAquCo_Internalname, GXutil.rtrim( A3774SolAquCo), GXutil.rtrim( localUtil.format( A3774SolAquCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAquCo_Jsonclick, 0, "", "", "", "", "", 1, edtSolAquCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Valor Fibra Pa6", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAquPa6_Internalname, GXutil.rtrim( A3775SolAquPa6), GXutil.rtrim( localUtil.format( A3775SolAquPa6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAquPa6_Jsonclick, 0, "", "", "", "", "", 1, edtSolAquPa6_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Valor Fibra Pes", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAquPes_Internalname, GXutil.rtrim( A3776SolAquPes), GXutil.rtrim( localUtil.format( A3776SolAquPes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAquPes_Jsonclick, 0, "", "", "", "", "", 1, edtSolAquPes_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Valor Fibra Pac", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAquPac_Internalname, GXutil.rtrim( A3777SolAquPac), GXutil.rtrim( localUtil.format( A3777SolAquPac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAquPac_Jsonclick, 0, "", "", "", "", "", 1, edtSolAquPac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Valor Fibra Wool", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAquWo_Internalname, GXutil.rtrim( A3778SolAquWo), GXutil.rtrim( localUtil.format( A3778SolAquWo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAquWo_Jsonclick, 0, "", "", "", "", "", 1, edtSolAquWo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Norma", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolAquNorm_Internalname, GXutil.rtrim( A3779SolAquNorm), GXutil.rtrim( localUtil.format( A3779SolAquNorm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolAquNorm_Jsonclick, 0, "", "", "", "", "", 1, edtSolAquNorm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Alteracion Color", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraAcAl_Internalname, GXutil.rtrim( A4025SolTraAcAl), GXutil.rtrim( localUtil.format( A4025SolTraAcAl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraAcAl_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraAcAl_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Manchado", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraMaAl_Internalname, GXutil.rtrim( A4026SolTraMaAl), GXutil.rtrim( localUtil.format( A4026SolTraMaAl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraMaAl_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraMaAl_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Alteracion Color", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraAcAc_Internalname, GXutil.rtrim( A4027SolTraAcAc), GXutil.rtrim( localUtil.format( A4027SolTraAcAc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraAcAc_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraAcAc_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Manchado", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraMaAc_Internalname, GXutil.rtrim( A4028SolTraMaAc), GXutil.rtrim( localUtil.format( A4028SolTraMaAc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraMaAc_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraMaAc_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Alteracion Color", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraAcAq_Internalname, GXutil.rtrim( A4029SolTraAcAq), GXutil.rtrim( localUtil.format( A4029SolTraAcAq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraAcAq_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraAcAq_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Manchado", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraMaAq_Internalname, GXutil.rtrim( A4030SolTraMaAq), GXutil.rtrim( localUtil.format( A4030SolTraMaAq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraMaAq_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraMaAq_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Alteracion Color en Agua", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraCoAq_Internalname, GXutil.rtrim( A4381SolTraCoAq), GXutil.rtrim( localUtil.format( A4381SolTraCoAq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraCoAq_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraCoAq_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Alteracion Color en Acido", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraCoAc_Internalname, GXutil.rtrim( A4382SolTraCoAc), GXutil.rtrim( localUtil.format( A4382SolTraCoAc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraCoAc_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraCoAc_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Alteracion Color en Alcali", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraCoAl_Internalname, GXutil.rtrim( A4383SolTraCoAl), GXutil.rtrim( localUtil.format( A4383SolTraCoAl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraCoAl_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraCoAl_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Tac", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolMarTac_Internalname, GXutil.rtrim( A4952SolMarTac), GXutil.rtrim( localUtil.format( A4952SolMarTac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolMarTac_Jsonclick, 0, "", "", "", "", "", 1, edtSolMarTac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Co", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolMarCo_Internalname, GXutil.rtrim( A4953SolMarCo), GXutil.rtrim( localUtil.format( A4953SolMarCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolMarCo_Jsonclick, 0, "", "", "", "", "", 1, edtSolMarCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Pa6", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolMarPa6_Internalname, GXutil.rtrim( A4954SolMarPa6), GXutil.rtrim( localUtil.format( A4954SolMarPa6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolMarPa6_Jsonclick, 0, "", "", "", "", "", 1, edtSolMarPa6_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Pes", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolMarPes_Internalname, GXutil.rtrim( A4955SolMarPes), GXutil.rtrim( localUtil.format( A4955SolMarPes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolMarPes_Jsonclick, 0, "", "", "", "", "", 1, edtSolMarPes_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Pac", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolMarPac_Internalname, GXutil.rtrim( A4956SolMarPac), GXutil.rtrim( localUtil.format( A4956SolMarPac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,306);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolMarPac_Jsonclick, 0, "", "", "", "", "", 1, edtSolMarPac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Wo", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolMarWo_Internalname, GXutil.rtrim( A4957SolMarWo), GXutil.rtrim( localUtil.format( A4957SolMarWo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolMarWo_Jsonclick, 0, "", "", "", "", "", 1, edtSolMarWo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Norma", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolMarNorm_Internalname, GXutil.rtrim( A4958SolMarNorm), GXutil.rtrim( localUtil.format( A4958SolMarNorm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolMarNorm_Jsonclick, 0, "", "", "", "", "", 1, edtSolMarNorm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "SolTraCoMar", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolTraCoMa_Internalname, GXutil.rtrim( A4959SolTraCoMa), GXutil.rtrim( localUtil.format( A4959SolTraCoMa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolTraCoMa_Jsonclick, 0, "", "", "", "", "", 1, edtSolTraCoMa_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Rq Minimo", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolRqMn_Internalname, GXutil.rtrim( A11796SolRqMn), GXutil.rtrim( localUtil.format( A11796SolRqMn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolRqMn_Jsonclick, 0, "", "", "", "", "", 1, edtSolRqMn_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Evaulacion 0=Fallo 1=Ok", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolRqMnSt_Internalname, GXutil.ltrim( localUtil.ntoc( A11797SolRqMnSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolRqMnSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11797SolRqMnSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11797SolRqMnSt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,331);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolRqMnSt_Jsonclick, 0, "", "", "", "", "", 1, edtSolRqMnSt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Metodo", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolMetodo_Internalname, GXutil.rtrim( A11926SolMetodo), GXutil.rtrim( localUtil.format( A11926SolMetodo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolMetodo_Jsonclick, 0, "", "", "", "", "", 1, edtSolMetodo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRASPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol340( ) ;
      nGXsfl_340_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount472 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_472 = (short)(1) ;
            scanStartBG472( ) ;
            while ( RcdFound472 != 0 )
            {
               init_level_properties472( ) ;
               getByPrimaryKeyBG472( ) ;
               addRowBG472( ) ;
               scanNextBG472( ) ;
            }
            scanEndBG472( ) ;
            nBlankRcdCount472 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalBG472( ) ;
         standaloneModalBG472( ) ;
         sMode472 = Gx_mode ;
         while ( nGXsfl_340_idx < nRC_GXsfl_340 )
         {
            bGXsfl_340_Refreshing = true ;
            readRowBG472( ) ;
            edtavnRcdDeleted_472_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_472_"+sGXsfl_340_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_472_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_472_Enabled), 5, 0), !bGXsfl_340_Refreshing);
            edtSolTraLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLTRALIN_"+sGXsfl_340_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolTraLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraLin_Enabled), 5, 0), !bGXsfl_340_Refreshing);
            edtSolTraObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLTRAOBS_"+sGXsfl_340_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolTraObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraObs_Enabled), 5, 0), !bGXsfl_340_Refreshing);
            if ( ( nRcdExists_472 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalBG472( ) ;
            }
            sendRowBG472( ) ;
            bGXsfl_340_Refreshing = false ;
         }
         Gx_mode = sMode472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount472 = (short)(5) ;
         nRcdExists_472 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartBG472( ) ;
            while ( RcdFound472 != 0 )
            {
               sGXsfl_340_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_340_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_340472( ) ;
               init_level_properties472( ) ;
               standaloneNotModalBG472( ) ;
               getByPrimaryKeyBG472( ) ;
               standaloneModalBG472( ) ;
               addRowBG472( ) ;
               scanNextBG472( ) ;
            }
            scanEndBG472( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode472 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_340_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_340_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_340472( ) ;
      initAllBG472( ) ;
      init_level_properties472( ) ;
      nRcdExists_472 = (short)(0) ;
      nIsMod_472 = (short)(0) ;
      nRcdDeleted_472 = (short)(0) ;
      nBlankRcdCount472 = (short)(nBlankRcdUsr472+nBlankRcdCount472) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount472 > 0 )
      {
         standaloneNotModalBG472( ) ;
         standaloneModalBG472( ) ;
         addRowBG472( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtSolTraLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount472 = (short)(nBlankRcdCount472-1) ;
      }
      Gx_mode = sMode472 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 347,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 348,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 349,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRASPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 350,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTRASPI.htm");
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
         Z3253SolTraCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3253SolTraCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3254SolTraMat = httpContext.cgiGet( "Z3254SolTraMat") ;
         Z3255SolTraSer = httpContext.cgiGet( "Z3255SolTraSer") ;
         Z3256SolTraTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z3256SolTraTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3257SolTraDisN = httpContext.cgiGet( "Z3257SolTraDisN") ;
         Z3258SolTraNom = httpContext.cgiGet( "Z3258SolTraNom") ;
         Z3259SolTraNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z3259SolTraNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3260SolTraFec = localUtil.ctod( httpContext.cgiGet( "Z3260SolTraFec"), 0) ;
         Z3261SolTraCliC = (int)(localUtil.ctol( httpContext.cgiGet( "Z3261SolTraCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3262SolTraCliN = httpContext.cgiGet( "Z3262SolTraCliN") ;
         Z3263SolTraAc = httpContext.cgiGet( "Z3263SolTraAc") ;
         Z3264SolTraMa = httpContext.cgiGet( "Z3264SolTraMa") ;
         Z3265SolTraNor = httpContext.cgiGet( "Z3265SolTraNor") ;
         Z3266SolTraMaq = httpContext.cgiGet( "Z3266SolTraMaq") ;
         Z3267SolTraRef = httpContext.cgiGet( "Z3267SolTraRef") ;
         Z3268SolTraUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3268SolTraUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3759SolAciTac = httpContext.cgiGet( "Z3759SolAciTac") ;
         Z3760SolAciCo = httpContext.cgiGet( "Z3760SolAciCo") ;
         Z3761SolAciPa6 = httpContext.cgiGet( "Z3761SolAciPa6") ;
         Z3762SolAciPes = httpContext.cgiGet( "Z3762SolAciPes") ;
         Z3763SolAciPac = httpContext.cgiGet( "Z3763SolAciPac") ;
         Z3764SolAciWo = httpContext.cgiGet( "Z3764SolAciWo") ;
         Z3765SolAciNorm = httpContext.cgiGet( "Z3765SolAciNorm") ;
         Z3766SolAlcTac = httpContext.cgiGet( "Z3766SolAlcTac") ;
         Z3767SolAlcCo = httpContext.cgiGet( "Z3767SolAlcCo") ;
         Z3768SolAlcPa6 = httpContext.cgiGet( "Z3768SolAlcPa6") ;
         Z3769SolAlcPes = httpContext.cgiGet( "Z3769SolAlcPes") ;
         Z3770SolAlcPac = httpContext.cgiGet( "Z3770SolAlcPac") ;
         Z3771SolAlcWo = httpContext.cgiGet( "Z3771SolAlcWo") ;
         Z3772SolAlcNorm = httpContext.cgiGet( "Z3772SolAlcNorm") ;
         Z3773SolAquTac = httpContext.cgiGet( "Z3773SolAquTac") ;
         Z3774SolAquCo = httpContext.cgiGet( "Z3774SolAquCo") ;
         Z3775SolAquPa6 = httpContext.cgiGet( "Z3775SolAquPa6") ;
         Z3776SolAquPes = httpContext.cgiGet( "Z3776SolAquPes") ;
         Z3777SolAquPac = httpContext.cgiGet( "Z3777SolAquPac") ;
         Z3778SolAquWo = httpContext.cgiGet( "Z3778SolAquWo") ;
         Z3779SolAquNorm = httpContext.cgiGet( "Z3779SolAquNorm") ;
         Z4025SolTraAcAl = httpContext.cgiGet( "Z4025SolTraAcAl") ;
         Z4026SolTraMaAl = httpContext.cgiGet( "Z4026SolTraMaAl") ;
         Z4027SolTraAcAc = httpContext.cgiGet( "Z4027SolTraAcAc") ;
         Z4028SolTraMaAc = httpContext.cgiGet( "Z4028SolTraMaAc") ;
         Z4029SolTraAcAq = httpContext.cgiGet( "Z4029SolTraAcAq") ;
         Z4030SolTraMaAq = httpContext.cgiGet( "Z4030SolTraMaAq") ;
         Z4381SolTraCoAq = httpContext.cgiGet( "Z4381SolTraCoAq") ;
         Z4382SolTraCoAc = httpContext.cgiGet( "Z4382SolTraCoAc") ;
         Z4383SolTraCoAl = httpContext.cgiGet( "Z4383SolTraCoAl") ;
         Z4952SolMarTac = httpContext.cgiGet( "Z4952SolMarTac") ;
         Z4953SolMarCo = httpContext.cgiGet( "Z4953SolMarCo") ;
         Z4954SolMarPa6 = httpContext.cgiGet( "Z4954SolMarPa6") ;
         Z4955SolMarPes = httpContext.cgiGet( "Z4955SolMarPes") ;
         Z4956SolMarPac = httpContext.cgiGet( "Z4956SolMarPac") ;
         Z4957SolMarWo = httpContext.cgiGet( "Z4957SolMarWo") ;
         Z4958SolMarNorm = httpContext.cgiGet( "Z4958SolMarNorm") ;
         Z4959SolTraCoMa = httpContext.cgiGet( "Z4959SolTraCoMa") ;
         Z11796SolRqMn = httpContext.cgiGet( "Z11796SolRqMn") ;
         Z11797SolRqMnSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11797SolRqMnSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11926SolMetodo = httpContext.cgiGet( "Z11926SolMetodo") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_340 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_340"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLTRACOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolTraCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3253SolTraCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
         }
         else
         {
            A3253SolTraCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSolTraCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
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
         A3254SolTraMat = httpContext.cgiGet( edtSolTraMat_Internalname) ;
         n3254SolTraMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3254SolTraMat", A3254SolTraMat);
         A3255SolTraSer = httpContext.cgiGet( edtSolTraSer_Internalname) ;
         n3255SolTraSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3255SolTraSer", A3255SolTraSer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLTRATIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolTraTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3256SolTraTip = (short)(0) ;
            n3256SolTraTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3256SolTraTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3256SolTraTip), 4, 0));
         }
         else
         {
            A3256SolTraTip = (short)(localUtil.ctol( httpContext.cgiGet( edtSolTraTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3256SolTraTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3256SolTraTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3256SolTraTip), 4, 0));
         }
         A3257SolTraDisN = httpContext.cgiGet( edtSolTraDisN_Internalname) ;
         n3257SolTraDisN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3257SolTraDisN", A3257SolTraDisN);
         A3258SolTraNom = httpContext.cgiGet( edtSolTraNom_Internalname) ;
         n3258SolTraNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3258SolTraNom", A3258SolTraNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLTRANUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolTraNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3259SolTraNum = 0 ;
            n3259SolTraNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3259SolTraNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3259SolTraNum), 6, 0));
         }
         else
         {
            A3259SolTraNum = (int)(localUtil.ctol( httpContext.cgiGet( edtSolTraNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3259SolTraNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3259SolTraNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3259SolTraNum), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtSolTraFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SOLTRAFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolTraFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3260SolTraFec = GXutil.nullDate() ;
            n3260SolTraFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3260SolTraFec", localUtil.format(A3260SolTraFec, "99/99/99"));
         }
         else
         {
            A3260SolTraFec = localUtil.ctod( httpContext.cgiGet( edtSolTraFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3260SolTraFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3260SolTraFec", localUtil.format(A3260SolTraFec, "99/99/99"));
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLTRACLIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolTraCliC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3261SolTraCliC = 0 ;
            n3261SolTraCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3261SolTraCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3261SolTraCliC), 6, 0));
         }
         else
         {
            A3261SolTraCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtSolTraCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3261SolTraCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3261SolTraCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3261SolTraCliC), 6, 0));
         }
         A3262SolTraCliN = httpContext.cgiGet( edtSolTraCliN_Internalname) ;
         n3262SolTraCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3262SolTraCliN", A3262SolTraCliN);
         A3263SolTraAc = httpContext.cgiGet( edtSolTraAc_Internalname) ;
         n3263SolTraAc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3263SolTraAc", A3263SolTraAc);
         A3264SolTraMa = httpContext.cgiGet( edtSolTraMa_Internalname) ;
         n3264SolTraMa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3264SolTraMa", A3264SolTraMa);
         A3265SolTraNor = httpContext.cgiGet( edtSolTraNor_Internalname) ;
         n3265SolTraNor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3265SolTraNor", A3265SolTraNor);
         A3266SolTraMaq = httpContext.cgiGet( edtSolTraMaq_Internalname) ;
         n3266SolTraMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3266SolTraMaq", A3266SolTraMaq);
         A3267SolTraRef = httpContext.cgiGet( edtSolTraRef_Internalname) ;
         n3267SolTraRef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3267SolTraRef", A3267SolTraRef);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLTRAULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolTraUlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3268SolTraUlin = (byte)(0) ;
            n3268SolTraUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3268SolTraUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3268SolTraUlin), 2, 0));
         }
         else
         {
            A3268SolTraUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolTraUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3268SolTraUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3268SolTraUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3268SolTraUlin), 2, 0));
         }
         A3759SolAciTac = httpContext.cgiGet( edtSolAciTac_Internalname) ;
         n3759SolAciTac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3759SolAciTac", A3759SolAciTac);
         A3760SolAciCo = httpContext.cgiGet( edtSolAciCo_Internalname) ;
         n3760SolAciCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3760SolAciCo", A3760SolAciCo);
         A3761SolAciPa6 = httpContext.cgiGet( edtSolAciPa6_Internalname) ;
         n3761SolAciPa6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3761SolAciPa6", A3761SolAciPa6);
         A3762SolAciPes = httpContext.cgiGet( edtSolAciPes_Internalname) ;
         n3762SolAciPes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3762SolAciPes", A3762SolAciPes);
         A3763SolAciPac = httpContext.cgiGet( edtSolAciPac_Internalname) ;
         n3763SolAciPac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3763SolAciPac", A3763SolAciPac);
         A3764SolAciWo = httpContext.cgiGet( edtSolAciWo_Internalname) ;
         n3764SolAciWo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3764SolAciWo", A3764SolAciWo);
         A3765SolAciNorm = httpContext.cgiGet( edtSolAciNorm_Internalname) ;
         n3765SolAciNorm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3765SolAciNorm", A3765SolAciNorm);
         A3766SolAlcTac = httpContext.cgiGet( edtSolAlcTac_Internalname) ;
         n3766SolAlcTac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3766SolAlcTac", A3766SolAlcTac);
         A3767SolAlcCo = httpContext.cgiGet( edtSolAlcCo_Internalname) ;
         n3767SolAlcCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3767SolAlcCo", A3767SolAlcCo);
         A3768SolAlcPa6 = httpContext.cgiGet( edtSolAlcPa6_Internalname) ;
         n3768SolAlcPa6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3768SolAlcPa6", A3768SolAlcPa6);
         A3769SolAlcPes = httpContext.cgiGet( edtSolAlcPes_Internalname) ;
         n3769SolAlcPes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3769SolAlcPes", A3769SolAlcPes);
         A3770SolAlcPac = httpContext.cgiGet( edtSolAlcPac_Internalname) ;
         n3770SolAlcPac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3770SolAlcPac", A3770SolAlcPac);
         A3771SolAlcWo = httpContext.cgiGet( edtSolAlcWo_Internalname) ;
         n3771SolAlcWo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3771SolAlcWo", A3771SolAlcWo);
         A3772SolAlcNorm = httpContext.cgiGet( edtSolAlcNorm_Internalname) ;
         n3772SolAlcNorm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3772SolAlcNorm", A3772SolAlcNorm);
         A3773SolAquTac = httpContext.cgiGet( edtSolAquTac_Internalname) ;
         n3773SolAquTac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3773SolAquTac", A3773SolAquTac);
         A3774SolAquCo = httpContext.cgiGet( edtSolAquCo_Internalname) ;
         n3774SolAquCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3774SolAquCo", A3774SolAquCo);
         A3775SolAquPa6 = httpContext.cgiGet( edtSolAquPa6_Internalname) ;
         n3775SolAquPa6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3775SolAquPa6", A3775SolAquPa6);
         A3776SolAquPes = httpContext.cgiGet( edtSolAquPes_Internalname) ;
         n3776SolAquPes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3776SolAquPes", A3776SolAquPes);
         A3777SolAquPac = httpContext.cgiGet( edtSolAquPac_Internalname) ;
         n3777SolAquPac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3777SolAquPac", A3777SolAquPac);
         A3778SolAquWo = httpContext.cgiGet( edtSolAquWo_Internalname) ;
         n3778SolAquWo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3778SolAquWo", A3778SolAquWo);
         A3779SolAquNorm = httpContext.cgiGet( edtSolAquNorm_Internalname) ;
         n3779SolAquNorm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3779SolAquNorm", A3779SolAquNorm);
         A4025SolTraAcAl = httpContext.cgiGet( edtSolTraAcAl_Internalname) ;
         n4025SolTraAcAl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4025SolTraAcAl", A4025SolTraAcAl);
         A4026SolTraMaAl = httpContext.cgiGet( edtSolTraMaAl_Internalname) ;
         n4026SolTraMaAl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4026SolTraMaAl", A4026SolTraMaAl);
         A4027SolTraAcAc = httpContext.cgiGet( edtSolTraAcAc_Internalname) ;
         n4027SolTraAcAc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4027SolTraAcAc", A4027SolTraAcAc);
         A4028SolTraMaAc = httpContext.cgiGet( edtSolTraMaAc_Internalname) ;
         n4028SolTraMaAc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4028SolTraMaAc", A4028SolTraMaAc);
         A4029SolTraAcAq = httpContext.cgiGet( edtSolTraAcAq_Internalname) ;
         n4029SolTraAcAq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4029SolTraAcAq", A4029SolTraAcAq);
         A4030SolTraMaAq = httpContext.cgiGet( edtSolTraMaAq_Internalname) ;
         n4030SolTraMaAq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4030SolTraMaAq", A4030SolTraMaAq);
         A4381SolTraCoAq = httpContext.cgiGet( edtSolTraCoAq_Internalname) ;
         n4381SolTraCoAq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4381SolTraCoAq", A4381SolTraCoAq);
         A4382SolTraCoAc = httpContext.cgiGet( edtSolTraCoAc_Internalname) ;
         n4382SolTraCoAc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4382SolTraCoAc", A4382SolTraCoAc);
         A4383SolTraCoAl = httpContext.cgiGet( edtSolTraCoAl_Internalname) ;
         n4383SolTraCoAl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4383SolTraCoAl", A4383SolTraCoAl);
         A4952SolMarTac = httpContext.cgiGet( edtSolMarTac_Internalname) ;
         n4952SolMarTac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4952SolMarTac", A4952SolMarTac);
         A4953SolMarCo = httpContext.cgiGet( edtSolMarCo_Internalname) ;
         n4953SolMarCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4953SolMarCo", A4953SolMarCo);
         A4954SolMarPa6 = httpContext.cgiGet( edtSolMarPa6_Internalname) ;
         n4954SolMarPa6 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4954SolMarPa6", A4954SolMarPa6);
         A4955SolMarPes = httpContext.cgiGet( edtSolMarPes_Internalname) ;
         n4955SolMarPes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4955SolMarPes", A4955SolMarPes);
         A4956SolMarPac = httpContext.cgiGet( edtSolMarPac_Internalname) ;
         n4956SolMarPac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4956SolMarPac", A4956SolMarPac);
         A4957SolMarWo = httpContext.cgiGet( edtSolMarWo_Internalname) ;
         n4957SolMarWo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4957SolMarWo", A4957SolMarWo);
         A4958SolMarNorm = httpContext.cgiGet( edtSolMarNorm_Internalname) ;
         n4958SolMarNorm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4958SolMarNorm", A4958SolMarNorm);
         A4959SolTraCoMa = httpContext.cgiGet( edtSolTraCoMa_Internalname) ;
         n4959SolTraCoMa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4959SolTraCoMa", A4959SolTraCoMa);
         A11796SolRqMn = httpContext.cgiGet( edtSolRqMn_Internalname) ;
         n11796SolRqMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11796SolRqMn", A11796SolRqMn);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolRqMnSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolRqMnSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLRQMNST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolRqMnSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11797SolRqMnSt = (byte)(0) ;
            n11797SolRqMnSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11797SolRqMnSt", GXutil.str( A11797SolRqMnSt, 1, 0));
         }
         else
         {
            A11797SolRqMnSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolRqMnSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11797SolRqMnSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11797SolRqMnSt", GXutil.str( A11797SolRqMnSt, 1, 0));
         }
         A11926SolMetodo = httpContext.cgiGet( edtSolMetodo_Internalname) ;
         n11926SolMetodo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11926SolMetodo", A11926SolMetodo);
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
            A3253SolTraCod = (int)(GXutil.lval( httpContext.GetPar( "SolTraCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
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
            initAllBG471( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_472_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_472_Enabled), 5, 0), !bGXsfl_340_Refreshing);
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
      disableAttributesBG471( ) ;
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

   public void confirm_BG0( )
   {
      beforeValidateBG471( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsBG471( ) ;
         }
         else
         {
            checkExtendedTableBG471( ) ;
            if ( AnyError == 0 )
            {
               zmBG471( 2) ;
               zmBG471( 3) ;
               zmBG471( 4) ;
            }
            closeExtendedTableCursorsBG471( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode471 = Gx_mode ;
         confirm_BG472( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode471 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode471 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesBG0( ) ;
      }
   }

   public void confirm_BG472( )
   {
      nGXsfl_340_idx = 0 ;
      while ( nGXsfl_340_idx < nRC_GXsfl_340 )
      {
         readRowBG472( ) ;
         if ( ( nRcdExists_472 != 0 ) || ( nIsMod_472 != 0 ) )
         {
            getKeyBG472( ) ;
            if ( ( nRcdExists_472 == 0 ) && ( nRcdDeleted_472 == 0 ) )
            {
               if ( RcdFound472 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateBG472( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableBG472( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsBG472( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "SOLTRALIN_" + sGXsfl_340_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSolTraLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound472 != 0 )
               {
                  if ( nRcdDeleted_472 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyBG472( ) ;
                     loadBG472( ) ;
                     beforeValidateBG472( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsBG472( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_472 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateBG472( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableBG472( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsBG472( ) ;
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
                  if ( nRcdDeleted_472 == 0 )
                  {
                     GXCCtl = "SOLTRALIN_" + sGXsfl_340_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolTraLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_472_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolTraLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3269SolTraLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolTraObs_Internalname, GXutil.rtrim( A3270SolTraObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3269SolTraLin_"+sGXsfl_340_idx, GXutil.ltrim( localUtil.ntoc( Z3269SolTraLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3270SolTraObs_"+sGXsfl_340_idx, GXutil.rtrim( Z3270SolTraObs)) ;
         httpContext.changePostValue( "nRcdDeleted_472_"+sGXsfl_340_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_472_"+sGXsfl_340_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_472_"+sGXsfl_340_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_472 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_472_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_472_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLTRALIN_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolTraLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLTRAOBS_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolTraObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionBG0( )
   {
   }

   public void zmBG471( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3254SolTraMat = T00BG5_A3254SolTraMat[0] ;
            Z3255SolTraSer = T00BG5_A3255SolTraSer[0] ;
            Z3256SolTraTip = T00BG5_A3256SolTraTip[0] ;
            Z3257SolTraDisN = T00BG5_A3257SolTraDisN[0] ;
            Z3258SolTraNom = T00BG5_A3258SolTraNom[0] ;
            Z3259SolTraNum = T00BG5_A3259SolTraNum[0] ;
            Z3260SolTraFec = T00BG5_A3260SolTraFec[0] ;
            Z3261SolTraCliC = T00BG5_A3261SolTraCliC[0] ;
            Z3262SolTraCliN = T00BG5_A3262SolTraCliN[0] ;
            Z3263SolTraAc = T00BG5_A3263SolTraAc[0] ;
            Z3264SolTraMa = T00BG5_A3264SolTraMa[0] ;
            Z3265SolTraNor = T00BG5_A3265SolTraNor[0] ;
            Z3266SolTraMaq = T00BG5_A3266SolTraMaq[0] ;
            Z3267SolTraRef = T00BG5_A3267SolTraRef[0] ;
            Z3268SolTraUlin = T00BG5_A3268SolTraUlin[0] ;
            Z3759SolAciTac = T00BG5_A3759SolAciTac[0] ;
            Z3760SolAciCo = T00BG5_A3760SolAciCo[0] ;
            Z3761SolAciPa6 = T00BG5_A3761SolAciPa6[0] ;
            Z3762SolAciPes = T00BG5_A3762SolAciPes[0] ;
            Z3763SolAciPac = T00BG5_A3763SolAciPac[0] ;
            Z3764SolAciWo = T00BG5_A3764SolAciWo[0] ;
            Z3765SolAciNorm = T00BG5_A3765SolAciNorm[0] ;
            Z3766SolAlcTac = T00BG5_A3766SolAlcTac[0] ;
            Z3767SolAlcCo = T00BG5_A3767SolAlcCo[0] ;
            Z3768SolAlcPa6 = T00BG5_A3768SolAlcPa6[0] ;
            Z3769SolAlcPes = T00BG5_A3769SolAlcPes[0] ;
            Z3770SolAlcPac = T00BG5_A3770SolAlcPac[0] ;
            Z3771SolAlcWo = T00BG5_A3771SolAlcWo[0] ;
            Z3772SolAlcNorm = T00BG5_A3772SolAlcNorm[0] ;
            Z3773SolAquTac = T00BG5_A3773SolAquTac[0] ;
            Z3774SolAquCo = T00BG5_A3774SolAquCo[0] ;
            Z3775SolAquPa6 = T00BG5_A3775SolAquPa6[0] ;
            Z3776SolAquPes = T00BG5_A3776SolAquPes[0] ;
            Z3777SolAquPac = T00BG5_A3777SolAquPac[0] ;
            Z3778SolAquWo = T00BG5_A3778SolAquWo[0] ;
            Z3779SolAquNorm = T00BG5_A3779SolAquNorm[0] ;
            Z4025SolTraAcAl = T00BG5_A4025SolTraAcAl[0] ;
            Z4026SolTraMaAl = T00BG5_A4026SolTraMaAl[0] ;
            Z4027SolTraAcAc = T00BG5_A4027SolTraAcAc[0] ;
            Z4028SolTraMaAc = T00BG5_A4028SolTraMaAc[0] ;
            Z4029SolTraAcAq = T00BG5_A4029SolTraAcAq[0] ;
            Z4030SolTraMaAq = T00BG5_A4030SolTraMaAq[0] ;
            Z4381SolTraCoAq = T00BG5_A4381SolTraCoAq[0] ;
            Z4382SolTraCoAc = T00BG5_A4382SolTraCoAc[0] ;
            Z4383SolTraCoAl = T00BG5_A4383SolTraCoAl[0] ;
            Z4952SolMarTac = T00BG5_A4952SolMarTac[0] ;
            Z4953SolMarCo = T00BG5_A4953SolMarCo[0] ;
            Z4954SolMarPa6 = T00BG5_A4954SolMarPa6[0] ;
            Z4955SolMarPes = T00BG5_A4955SolMarPes[0] ;
            Z4956SolMarPac = T00BG5_A4956SolMarPac[0] ;
            Z4957SolMarWo = T00BG5_A4957SolMarWo[0] ;
            Z4958SolMarNorm = T00BG5_A4958SolMarNorm[0] ;
            Z4959SolTraCoMa = T00BG5_A4959SolTraCoMa[0] ;
            Z11796SolRqMn = T00BG5_A11796SolRqMn[0] ;
            Z11797SolRqMnSt = T00BG5_A11797SolRqMnSt[0] ;
            Z11926SolMetodo = T00BG5_A11926SolMetodo[0] ;
            Z129BarCod = T00BG5_A129BarCod[0] ;
            Z132BarCodReo = T00BG5_A132BarCodReo[0] ;
            Z130BarCodPar = T00BG5_A130BarCodPar[0] ;
            Z652OpeCod = T00BG5_A652OpeCod[0] ;
         }
         else
         {
            Z3254SolTraMat = A3254SolTraMat ;
            Z3255SolTraSer = A3255SolTraSer ;
            Z3256SolTraTip = A3256SolTraTip ;
            Z3257SolTraDisN = A3257SolTraDisN ;
            Z3258SolTraNom = A3258SolTraNom ;
            Z3259SolTraNum = A3259SolTraNum ;
            Z3260SolTraFec = A3260SolTraFec ;
            Z3261SolTraCliC = A3261SolTraCliC ;
            Z3262SolTraCliN = A3262SolTraCliN ;
            Z3263SolTraAc = A3263SolTraAc ;
            Z3264SolTraMa = A3264SolTraMa ;
            Z3265SolTraNor = A3265SolTraNor ;
            Z3266SolTraMaq = A3266SolTraMaq ;
            Z3267SolTraRef = A3267SolTraRef ;
            Z3268SolTraUlin = A3268SolTraUlin ;
            Z3759SolAciTac = A3759SolAciTac ;
            Z3760SolAciCo = A3760SolAciCo ;
            Z3761SolAciPa6 = A3761SolAciPa6 ;
            Z3762SolAciPes = A3762SolAciPes ;
            Z3763SolAciPac = A3763SolAciPac ;
            Z3764SolAciWo = A3764SolAciWo ;
            Z3765SolAciNorm = A3765SolAciNorm ;
            Z3766SolAlcTac = A3766SolAlcTac ;
            Z3767SolAlcCo = A3767SolAlcCo ;
            Z3768SolAlcPa6 = A3768SolAlcPa6 ;
            Z3769SolAlcPes = A3769SolAlcPes ;
            Z3770SolAlcPac = A3770SolAlcPac ;
            Z3771SolAlcWo = A3771SolAlcWo ;
            Z3772SolAlcNorm = A3772SolAlcNorm ;
            Z3773SolAquTac = A3773SolAquTac ;
            Z3774SolAquCo = A3774SolAquCo ;
            Z3775SolAquPa6 = A3775SolAquPa6 ;
            Z3776SolAquPes = A3776SolAquPes ;
            Z3777SolAquPac = A3777SolAquPac ;
            Z3778SolAquWo = A3778SolAquWo ;
            Z3779SolAquNorm = A3779SolAquNorm ;
            Z4025SolTraAcAl = A4025SolTraAcAl ;
            Z4026SolTraMaAl = A4026SolTraMaAl ;
            Z4027SolTraAcAc = A4027SolTraAcAc ;
            Z4028SolTraMaAc = A4028SolTraMaAc ;
            Z4029SolTraAcAq = A4029SolTraAcAq ;
            Z4030SolTraMaAq = A4030SolTraMaAq ;
            Z4381SolTraCoAq = A4381SolTraCoAq ;
            Z4382SolTraCoAc = A4382SolTraCoAc ;
            Z4383SolTraCoAl = A4383SolTraCoAl ;
            Z4952SolMarTac = A4952SolMarTac ;
            Z4953SolMarCo = A4953SolMarCo ;
            Z4954SolMarPa6 = A4954SolMarPa6 ;
            Z4955SolMarPes = A4955SolMarPes ;
            Z4956SolMarPac = A4956SolMarPac ;
            Z4957SolMarWo = A4957SolMarWo ;
            Z4958SolMarNorm = A4958SolMarNorm ;
            Z4959SolTraCoMa = A4959SolTraCoMa ;
            Z11796SolRqMn = A11796SolRqMn ;
            Z11797SolRqMnSt = A11797SolRqMnSt ;
            Z11926SolMetodo = A11926SolMetodo ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z3253SolTraCod = A3253SolTraCod ;
         Z3254SolTraMat = A3254SolTraMat ;
         Z3255SolTraSer = A3255SolTraSer ;
         Z3256SolTraTip = A3256SolTraTip ;
         Z3257SolTraDisN = A3257SolTraDisN ;
         Z3258SolTraNom = A3258SolTraNom ;
         Z3259SolTraNum = A3259SolTraNum ;
         Z3260SolTraFec = A3260SolTraFec ;
         Z3261SolTraCliC = A3261SolTraCliC ;
         Z3262SolTraCliN = A3262SolTraCliN ;
         Z3263SolTraAc = A3263SolTraAc ;
         Z3264SolTraMa = A3264SolTraMa ;
         Z3265SolTraNor = A3265SolTraNor ;
         Z3266SolTraMaq = A3266SolTraMaq ;
         Z3267SolTraRef = A3267SolTraRef ;
         Z3268SolTraUlin = A3268SolTraUlin ;
         Z3759SolAciTac = A3759SolAciTac ;
         Z3760SolAciCo = A3760SolAciCo ;
         Z3761SolAciPa6 = A3761SolAciPa6 ;
         Z3762SolAciPes = A3762SolAciPes ;
         Z3763SolAciPac = A3763SolAciPac ;
         Z3764SolAciWo = A3764SolAciWo ;
         Z3765SolAciNorm = A3765SolAciNorm ;
         Z3766SolAlcTac = A3766SolAlcTac ;
         Z3767SolAlcCo = A3767SolAlcCo ;
         Z3768SolAlcPa6 = A3768SolAlcPa6 ;
         Z3769SolAlcPes = A3769SolAlcPes ;
         Z3770SolAlcPac = A3770SolAlcPac ;
         Z3771SolAlcWo = A3771SolAlcWo ;
         Z3772SolAlcNorm = A3772SolAlcNorm ;
         Z3773SolAquTac = A3773SolAquTac ;
         Z3774SolAquCo = A3774SolAquCo ;
         Z3775SolAquPa6 = A3775SolAquPa6 ;
         Z3776SolAquPes = A3776SolAquPes ;
         Z3777SolAquPac = A3777SolAquPac ;
         Z3778SolAquWo = A3778SolAquWo ;
         Z3779SolAquNorm = A3779SolAquNorm ;
         Z4025SolTraAcAl = A4025SolTraAcAl ;
         Z4026SolTraMaAl = A4026SolTraMaAl ;
         Z4027SolTraAcAc = A4027SolTraAcAc ;
         Z4028SolTraMaAc = A4028SolTraMaAc ;
         Z4029SolTraAcAq = A4029SolTraAcAq ;
         Z4030SolTraMaAq = A4030SolTraMaAq ;
         Z4381SolTraCoAq = A4381SolTraCoAq ;
         Z4382SolTraCoAc = A4382SolTraCoAc ;
         Z4383SolTraCoAl = A4383SolTraCoAl ;
         Z4952SolMarTac = A4952SolMarTac ;
         Z4953SolMarCo = A4953SolMarCo ;
         Z4954SolMarPa6 = A4954SolMarPa6 ;
         Z4955SolMarPes = A4955SolMarPes ;
         Z4956SolMarPac = A4956SolMarPac ;
         Z4957SolMarWo = A4957SolMarWo ;
         Z4958SolMarNorm = A4958SolMarNorm ;
         Z4959SolTraCoMa = A4959SolTraCoMa ;
         Z11796SolRqMn = A11796SolRqMn ;
         Z11797SolRqMnSt = A11797SolRqMnSt ;
         Z11926SolMetodo = A11926SolMetodo ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z652OpeCod = A652OpeCod ;
         Z407EmprNom = A407EmprNom ;
         Z653OpeNom = A653OpeNom ;
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

   public void loadBG471( )
   {
      /* Using cursor T00BG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound471 = (short)(1) ;
         A407EmprNom = T00BG9_A407EmprNom[0] ;
         n407EmprNom = T00BG9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3254SolTraMat = T00BG9_A3254SolTraMat[0] ;
         n3254SolTraMat = T00BG9_n3254SolTraMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3254SolTraMat", A3254SolTraMat);
         A3255SolTraSer = T00BG9_A3255SolTraSer[0] ;
         n3255SolTraSer = T00BG9_n3255SolTraSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3255SolTraSer", A3255SolTraSer);
         A3256SolTraTip = T00BG9_A3256SolTraTip[0] ;
         n3256SolTraTip = T00BG9_n3256SolTraTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3256SolTraTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3256SolTraTip), 4, 0));
         A3257SolTraDisN = T00BG9_A3257SolTraDisN[0] ;
         n3257SolTraDisN = T00BG9_n3257SolTraDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3257SolTraDisN", A3257SolTraDisN);
         A3258SolTraNom = T00BG9_A3258SolTraNom[0] ;
         n3258SolTraNom = T00BG9_n3258SolTraNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3258SolTraNom", A3258SolTraNom);
         A3259SolTraNum = T00BG9_A3259SolTraNum[0] ;
         n3259SolTraNum = T00BG9_n3259SolTraNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3259SolTraNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3259SolTraNum), 6, 0));
         A3260SolTraFec = T00BG9_A3260SolTraFec[0] ;
         n3260SolTraFec = T00BG9_n3260SolTraFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3260SolTraFec", localUtil.format(A3260SolTraFec, "99/99/99"));
         A653OpeNom = T00BG9_A653OpeNom[0] ;
         n653OpeNom = T00BG9_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A3261SolTraCliC = T00BG9_A3261SolTraCliC[0] ;
         n3261SolTraCliC = T00BG9_n3261SolTraCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3261SolTraCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3261SolTraCliC), 6, 0));
         A3262SolTraCliN = T00BG9_A3262SolTraCliN[0] ;
         n3262SolTraCliN = T00BG9_n3262SolTraCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3262SolTraCliN", A3262SolTraCliN);
         A3263SolTraAc = T00BG9_A3263SolTraAc[0] ;
         n3263SolTraAc = T00BG9_n3263SolTraAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3263SolTraAc", A3263SolTraAc);
         A3264SolTraMa = T00BG9_A3264SolTraMa[0] ;
         n3264SolTraMa = T00BG9_n3264SolTraMa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3264SolTraMa", A3264SolTraMa);
         A3265SolTraNor = T00BG9_A3265SolTraNor[0] ;
         n3265SolTraNor = T00BG9_n3265SolTraNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3265SolTraNor", A3265SolTraNor);
         A3266SolTraMaq = T00BG9_A3266SolTraMaq[0] ;
         n3266SolTraMaq = T00BG9_n3266SolTraMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3266SolTraMaq", A3266SolTraMaq);
         A3267SolTraRef = T00BG9_A3267SolTraRef[0] ;
         n3267SolTraRef = T00BG9_n3267SolTraRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3267SolTraRef", A3267SolTraRef);
         A3268SolTraUlin = T00BG9_A3268SolTraUlin[0] ;
         n3268SolTraUlin = T00BG9_n3268SolTraUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3268SolTraUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3268SolTraUlin), 2, 0));
         A3759SolAciTac = T00BG9_A3759SolAciTac[0] ;
         n3759SolAciTac = T00BG9_n3759SolAciTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3759SolAciTac", A3759SolAciTac);
         A3760SolAciCo = T00BG9_A3760SolAciCo[0] ;
         n3760SolAciCo = T00BG9_n3760SolAciCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3760SolAciCo", A3760SolAciCo);
         A3761SolAciPa6 = T00BG9_A3761SolAciPa6[0] ;
         n3761SolAciPa6 = T00BG9_n3761SolAciPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3761SolAciPa6", A3761SolAciPa6);
         A3762SolAciPes = T00BG9_A3762SolAciPes[0] ;
         n3762SolAciPes = T00BG9_n3762SolAciPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3762SolAciPes", A3762SolAciPes);
         A3763SolAciPac = T00BG9_A3763SolAciPac[0] ;
         n3763SolAciPac = T00BG9_n3763SolAciPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3763SolAciPac", A3763SolAciPac);
         A3764SolAciWo = T00BG9_A3764SolAciWo[0] ;
         n3764SolAciWo = T00BG9_n3764SolAciWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3764SolAciWo", A3764SolAciWo);
         A3765SolAciNorm = T00BG9_A3765SolAciNorm[0] ;
         n3765SolAciNorm = T00BG9_n3765SolAciNorm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3765SolAciNorm", A3765SolAciNorm);
         A3766SolAlcTac = T00BG9_A3766SolAlcTac[0] ;
         n3766SolAlcTac = T00BG9_n3766SolAlcTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3766SolAlcTac", A3766SolAlcTac);
         A3767SolAlcCo = T00BG9_A3767SolAlcCo[0] ;
         n3767SolAlcCo = T00BG9_n3767SolAlcCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3767SolAlcCo", A3767SolAlcCo);
         A3768SolAlcPa6 = T00BG9_A3768SolAlcPa6[0] ;
         n3768SolAlcPa6 = T00BG9_n3768SolAlcPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3768SolAlcPa6", A3768SolAlcPa6);
         A3769SolAlcPes = T00BG9_A3769SolAlcPes[0] ;
         n3769SolAlcPes = T00BG9_n3769SolAlcPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3769SolAlcPes", A3769SolAlcPes);
         A3770SolAlcPac = T00BG9_A3770SolAlcPac[0] ;
         n3770SolAlcPac = T00BG9_n3770SolAlcPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3770SolAlcPac", A3770SolAlcPac);
         A3771SolAlcWo = T00BG9_A3771SolAlcWo[0] ;
         n3771SolAlcWo = T00BG9_n3771SolAlcWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3771SolAlcWo", A3771SolAlcWo);
         A3772SolAlcNorm = T00BG9_A3772SolAlcNorm[0] ;
         n3772SolAlcNorm = T00BG9_n3772SolAlcNorm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3772SolAlcNorm", A3772SolAlcNorm);
         A3773SolAquTac = T00BG9_A3773SolAquTac[0] ;
         n3773SolAquTac = T00BG9_n3773SolAquTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3773SolAquTac", A3773SolAquTac);
         A3774SolAquCo = T00BG9_A3774SolAquCo[0] ;
         n3774SolAquCo = T00BG9_n3774SolAquCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3774SolAquCo", A3774SolAquCo);
         A3775SolAquPa6 = T00BG9_A3775SolAquPa6[0] ;
         n3775SolAquPa6 = T00BG9_n3775SolAquPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3775SolAquPa6", A3775SolAquPa6);
         A3776SolAquPes = T00BG9_A3776SolAquPes[0] ;
         n3776SolAquPes = T00BG9_n3776SolAquPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3776SolAquPes", A3776SolAquPes);
         A3777SolAquPac = T00BG9_A3777SolAquPac[0] ;
         n3777SolAquPac = T00BG9_n3777SolAquPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3777SolAquPac", A3777SolAquPac);
         A3778SolAquWo = T00BG9_A3778SolAquWo[0] ;
         n3778SolAquWo = T00BG9_n3778SolAquWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3778SolAquWo", A3778SolAquWo);
         A3779SolAquNorm = T00BG9_A3779SolAquNorm[0] ;
         n3779SolAquNorm = T00BG9_n3779SolAquNorm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3779SolAquNorm", A3779SolAquNorm);
         A4025SolTraAcAl = T00BG9_A4025SolTraAcAl[0] ;
         n4025SolTraAcAl = T00BG9_n4025SolTraAcAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4025SolTraAcAl", A4025SolTraAcAl);
         A4026SolTraMaAl = T00BG9_A4026SolTraMaAl[0] ;
         n4026SolTraMaAl = T00BG9_n4026SolTraMaAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4026SolTraMaAl", A4026SolTraMaAl);
         A4027SolTraAcAc = T00BG9_A4027SolTraAcAc[0] ;
         n4027SolTraAcAc = T00BG9_n4027SolTraAcAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4027SolTraAcAc", A4027SolTraAcAc);
         A4028SolTraMaAc = T00BG9_A4028SolTraMaAc[0] ;
         n4028SolTraMaAc = T00BG9_n4028SolTraMaAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4028SolTraMaAc", A4028SolTraMaAc);
         A4029SolTraAcAq = T00BG9_A4029SolTraAcAq[0] ;
         n4029SolTraAcAq = T00BG9_n4029SolTraAcAq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4029SolTraAcAq", A4029SolTraAcAq);
         A4030SolTraMaAq = T00BG9_A4030SolTraMaAq[0] ;
         n4030SolTraMaAq = T00BG9_n4030SolTraMaAq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4030SolTraMaAq", A4030SolTraMaAq);
         A4381SolTraCoAq = T00BG9_A4381SolTraCoAq[0] ;
         n4381SolTraCoAq = T00BG9_n4381SolTraCoAq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4381SolTraCoAq", A4381SolTraCoAq);
         A4382SolTraCoAc = T00BG9_A4382SolTraCoAc[0] ;
         n4382SolTraCoAc = T00BG9_n4382SolTraCoAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4382SolTraCoAc", A4382SolTraCoAc);
         A4383SolTraCoAl = T00BG9_A4383SolTraCoAl[0] ;
         n4383SolTraCoAl = T00BG9_n4383SolTraCoAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4383SolTraCoAl", A4383SolTraCoAl);
         A4952SolMarTac = T00BG9_A4952SolMarTac[0] ;
         n4952SolMarTac = T00BG9_n4952SolMarTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4952SolMarTac", A4952SolMarTac);
         A4953SolMarCo = T00BG9_A4953SolMarCo[0] ;
         n4953SolMarCo = T00BG9_n4953SolMarCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4953SolMarCo", A4953SolMarCo);
         A4954SolMarPa6 = T00BG9_A4954SolMarPa6[0] ;
         n4954SolMarPa6 = T00BG9_n4954SolMarPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4954SolMarPa6", A4954SolMarPa6);
         A4955SolMarPes = T00BG9_A4955SolMarPes[0] ;
         n4955SolMarPes = T00BG9_n4955SolMarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4955SolMarPes", A4955SolMarPes);
         A4956SolMarPac = T00BG9_A4956SolMarPac[0] ;
         n4956SolMarPac = T00BG9_n4956SolMarPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4956SolMarPac", A4956SolMarPac);
         A4957SolMarWo = T00BG9_A4957SolMarWo[0] ;
         n4957SolMarWo = T00BG9_n4957SolMarWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4957SolMarWo", A4957SolMarWo);
         A4958SolMarNorm = T00BG9_A4958SolMarNorm[0] ;
         n4958SolMarNorm = T00BG9_n4958SolMarNorm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4958SolMarNorm", A4958SolMarNorm);
         A4959SolTraCoMa = T00BG9_A4959SolTraCoMa[0] ;
         n4959SolTraCoMa = T00BG9_n4959SolTraCoMa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4959SolTraCoMa", A4959SolTraCoMa);
         A11796SolRqMn = T00BG9_A11796SolRqMn[0] ;
         n11796SolRqMn = T00BG9_n11796SolRqMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11796SolRqMn", A11796SolRqMn);
         A11797SolRqMnSt = T00BG9_A11797SolRqMnSt[0] ;
         n11797SolRqMnSt = T00BG9_n11797SolRqMnSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11797SolRqMnSt", GXutil.str( A11797SolRqMnSt, 1, 0));
         A11926SolMetodo = T00BG9_A11926SolMetodo[0] ;
         n11926SolMetodo = T00BG9_n11926SolMetodo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11926SolMetodo", A11926SolMetodo);
         A129BarCod = T00BG9_A129BarCod[0] ;
         n129BarCod = T00BG9_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00BG9_A132BarCodReo[0] ;
         n132BarCodReo = T00BG9_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00BG9_A130BarCodPar[0] ;
         n130BarCodPar = T00BG9_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T00BG9_A652OpeCod[0] ;
         n652OpeCod = T00BG9_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zmBG471( -1) ;
      }
      pr_default.close(7);
      onLoadActionsBG471( ) ;
   }

   public void onLoadActionsBG471( )
   {
   }

   public void checkExtendedTableBG471( )
   {
      nIsDirty_471 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00BG6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00BG6_A407EmprNom[0] ;
      n407EmprNom = T00BG6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00BG7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T00BG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T00BG8_A653OpeNom[0] ;
      n653OpeNom = T00BG8_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursorsBG471( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T00BG10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00BG10_A407EmprNom[0] ;
      n407EmprNom = T00BG10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T00BG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
                         int A652OpeCod )
   {
      /* Using cursor T00BG12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T00BG12_A653OpeNom[0] ;
      n653OpeNom = T00BG12_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKeyBG471( )
   {
      /* Using cursor T00BG13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound471 = (short)(1) ;
      }
      else
      {
         RcdFound471 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00BG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmBG471( 1) ;
         RcdFound471 = (short)(1) ;
         A3253SolTraCod = T00BG5_A3253SolTraCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
         A3254SolTraMat = T00BG5_A3254SolTraMat[0] ;
         n3254SolTraMat = T00BG5_n3254SolTraMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3254SolTraMat", A3254SolTraMat);
         A3255SolTraSer = T00BG5_A3255SolTraSer[0] ;
         n3255SolTraSer = T00BG5_n3255SolTraSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3255SolTraSer", A3255SolTraSer);
         A3256SolTraTip = T00BG5_A3256SolTraTip[0] ;
         n3256SolTraTip = T00BG5_n3256SolTraTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3256SolTraTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3256SolTraTip), 4, 0));
         A3257SolTraDisN = T00BG5_A3257SolTraDisN[0] ;
         n3257SolTraDisN = T00BG5_n3257SolTraDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3257SolTraDisN", A3257SolTraDisN);
         A3258SolTraNom = T00BG5_A3258SolTraNom[0] ;
         n3258SolTraNom = T00BG5_n3258SolTraNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3258SolTraNom", A3258SolTraNom);
         A3259SolTraNum = T00BG5_A3259SolTraNum[0] ;
         n3259SolTraNum = T00BG5_n3259SolTraNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3259SolTraNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3259SolTraNum), 6, 0));
         A3260SolTraFec = T00BG5_A3260SolTraFec[0] ;
         n3260SolTraFec = T00BG5_n3260SolTraFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3260SolTraFec", localUtil.format(A3260SolTraFec, "99/99/99"));
         A3261SolTraCliC = T00BG5_A3261SolTraCliC[0] ;
         n3261SolTraCliC = T00BG5_n3261SolTraCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3261SolTraCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3261SolTraCliC), 6, 0));
         A3262SolTraCliN = T00BG5_A3262SolTraCliN[0] ;
         n3262SolTraCliN = T00BG5_n3262SolTraCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3262SolTraCliN", A3262SolTraCliN);
         A3263SolTraAc = T00BG5_A3263SolTraAc[0] ;
         n3263SolTraAc = T00BG5_n3263SolTraAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3263SolTraAc", A3263SolTraAc);
         A3264SolTraMa = T00BG5_A3264SolTraMa[0] ;
         n3264SolTraMa = T00BG5_n3264SolTraMa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3264SolTraMa", A3264SolTraMa);
         A3265SolTraNor = T00BG5_A3265SolTraNor[0] ;
         n3265SolTraNor = T00BG5_n3265SolTraNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3265SolTraNor", A3265SolTraNor);
         A3266SolTraMaq = T00BG5_A3266SolTraMaq[0] ;
         n3266SolTraMaq = T00BG5_n3266SolTraMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3266SolTraMaq", A3266SolTraMaq);
         A3267SolTraRef = T00BG5_A3267SolTraRef[0] ;
         n3267SolTraRef = T00BG5_n3267SolTraRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3267SolTraRef", A3267SolTraRef);
         A3268SolTraUlin = T00BG5_A3268SolTraUlin[0] ;
         n3268SolTraUlin = T00BG5_n3268SolTraUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3268SolTraUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3268SolTraUlin), 2, 0));
         A3759SolAciTac = T00BG5_A3759SolAciTac[0] ;
         n3759SolAciTac = T00BG5_n3759SolAciTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3759SolAciTac", A3759SolAciTac);
         A3760SolAciCo = T00BG5_A3760SolAciCo[0] ;
         n3760SolAciCo = T00BG5_n3760SolAciCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3760SolAciCo", A3760SolAciCo);
         A3761SolAciPa6 = T00BG5_A3761SolAciPa6[0] ;
         n3761SolAciPa6 = T00BG5_n3761SolAciPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3761SolAciPa6", A3761SolAciPa6);
         A3762SolAciPes = T00BG5_A3762SolAciPes[0] ;
         n3762SolAciPes = T00BG5_n3762SolAciPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3762SolAciPes", A3762SolAciPes);
         A3763SolAciPac = T00BG5_A3763SolAciPac[0] ;
         n3763SolAciPac = T00BG5_n3763SolAciPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3763SolAciPac", A3763SolAciPac);
         A3764SolAciWo = T00BG5_A3764SolAciWo[0] ;
         n3764SolAciWo = T00BG5_n3764SolAciWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3764SolAciWo", A3764SolAciWo);
         A3765SolAciNorm = T00BG5_A3765SolAciNorm[0] ;
         n3765SolAciNorm = T00BG5_n3765SolAciNorm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3765SolAciNorm", A3765SolAciNorm);
         A3766SolAlcTac = T00BG5_A3766SolAlcTac[0] ;
         n3766SolAlcTac = T00BG5_n3766SolAlcTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3766SolAlcTac", A3766SolAlcTac);
         A3767SolAlcCo = T00BG5_A3767SolAlcCo[0] ;
         n3767SolAlcCo = T00BG5_n3767SolAlcCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3767SolAlcCo", A3767SolAlcCo);
         A3768SolAlcPa6 = T00BG5_A3768SolAlcPa6[0] ;
         n3768SolAlcPa6 = T00BG5_n3768SolAlcPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3768SolAlcPa6", A3768SolAlcPa6);
         A3769SolAlcPes = T00BG5_A3769SolAlcPes[0] ;
         n3769SolAlcPes = T00BG5_n3769SolAlcPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3769SolAlcPes", A3769SolAlcPes);
         A3770SolAlcPac = T00BG5_A3770SolAlcPac[0] ;
         n3770SolAlcPac = T00BG5_n3770SolAlcPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3770SolAlcPac", A3770SolAlcPac);
         A3771SolAlcWo = T00BG5_A3771SolAlcWo[0] ;
         n3771SolAlcWo = T00BG5_n3771SolAlcWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3771SolAlcWo", A3771SolAlcWo);
         A3772SolAlcNorm = T00BG5_A3772SolAlcNorm[0] ;
         n3772SolAlcNorm = T00BG5_n3772SolAlcNorm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3772SolAlcNorm", A3772SolAlcNorm);
         A3773SolAquTac = T00BG5_A3773SolAquTac[0] ;
         n3773SolAquTac = T00BG5_n3773SolAquTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3773SolAquTac", A3773SolAquTac);
         A3774SolAquCo = T00BG5_A3774SolAquCo[0] ;
         n3774SolAquCo = T00BG5_n3774SolAquCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3774SolAquCo", A3774SolAquCo);
         A3775SolAquPa6 = T00BG5_A3775SolAquPa6[0] ;
         n3775SolAquPa6 = T00BG5_n3775SolAquPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3775SolAquPa6", A3775SolAquPa6);
         A3776SolAquPes = T00BG5_A3776SolAquPes[0] ;
         n3776SolAquPes = T00BG5_n3776SolAquPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3776SolAquPes", A3776SolAquPes);
         A3777SolAquPac = T00BG5_A3777SolAquPac[0] ;
         n3777SolAquPac = T00BG5_n3777SolAquPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3777SolAquPac", A3777SolAquPac);
         A3778SolAquWo = T00BG5_A3778SolAquWo[0] ;
         n3778SolAquWo = T00BG5_n3778SolAquWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3778SolAquWo", A3778SolAquWo);
         A3779SolAquNorm = T00BG5_A3779SolAquNorm[0] ;
         n3779SolAquNorm = T00BG5_n3779SolAquNorm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3779SolAquNorm", A3779SolAquNorm);
         A4025SolTraAcAl = T00BG5_A4025SolTraAcAl[0] ;
         n4025SolTraAcAl = T00BG5_n4025SolTraAcAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4025SolTraAcAl", A4025SolTraAcAl);
         A4026SolTraMaAl = T00BG5_A4026SolTraMaAl[0] ;
         n4026SolTraMaAl = T00BG5_n4026SolTraMaAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4026SolTraMaAl", A4026SolTraMaAl);
         A4027SolTraAcAc = T00BG5_A4027SolTraAcAc[0] ;
         n4027SolTraAcAc = T00BG5_n4027SolTraAcAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4027SolTraAcAc", A4027SolTraAcAc);
         A4028SolTraMaAc = T00BG5_A4028SolTraMaAc[0] ;
         n4028SolTraMaAc = T00BG5_n4028SolTraMaAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4028SolTraMaAc", A4028SolTraMaAc);
         A4029SolTraAcAq = T00BG5_A4029SolTraAcAq[0] ;
         n4029SolTraAcAq = T00BG5_n4029SolTraAcAq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4029SolTraAcAq", A4029SolTraAcAq);
         A4030SolTraMaAq = T00BG5_A4030SolTraMaAq[0] ;
         n4030SolTraMaAq = T00BG5_n4030SolTraMaAq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4030SolTraMaAq", A4030SolTraMaAq);
         A4381SolTraCoAq = T00BG5_A4381SolTraCoAq[0] ;
         n4381SolTraCoAq = T00BG5_n4381SolTraCoAq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4381SolTraCoAq", A4381SolTraCoAq);
         A4382SolTraCoAc = T00BG5_A4382SolTraCoAc[0] ;
         n4382SolTraCoAc = T00BG5_n4382SolTraCoAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4382SolTraCoAc", A4382SolTraCoAc);
         A4383SolTraCoAl = T00BG5_A4383SolTraCoAl[0] ;
         n4383SolTraCoAl = T00BG5_n4383SolTraCoAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4383SolTraCoAl", A4383SolTraCoAl);
         A4952SolMarTac = T00BG5_A4952SolMarTac[0] ;
         n4952SolMarTac = T00BG5_n4952SolMarTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4952SolMarTac", A4952SolMarTac);
         A4953SolMarCo = T00BG5_A4953SolMarCo[0] ;
         n4953SolMarCo = T00BG5_n4953SolMarCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4953SolMarCo", A4953SolMarCo);
         A4954SolMarPa6 = T00BG5_A4954SolMarPa6[0] ;
         n4954SolMarPa6 = T00BG5_n4954SolMarPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4954SolMarPa6", A4954SolMarPa6);
         A4955SolMarPes = T00BG5_A4955SolMarPes[0] ;
         n4955SolMarPes = T00BG5_n4955SolMarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4955SolMarPes", A4955SolMarPes);
         A4956SolMarPac = T00BG5_A4956SolMarPac[0] ;
         n4956SolMarPac = T00BG5_n4956SolMarPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4956SolMarPac", A4956SolMarPac);
         A4957SolMarWo = T00BG5_A4957SolMarWo[0] ;
         n4957SolMarWo = T00BG5_n4957SolMarWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4957SolMarWo", A4957SolMarWo);
         A4958SolMarNorm = T00BG5_A4958SolMarNorm[0] ;
         n4958SolMarNorm = T00BG5_n4958SolMarNorm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4958SolMarNorm", A4958SolMarNorm);
         A4959SolTraCoMa = T00BG5_A4959SolTraCoMa[0] ;
         n4959SolTraCoMa = T00BG5_n4959SolTraCoMa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4959SolTraCoMa", A4959SolTraCoMa);
         A11796SolRqMn = T00BG5_A11796SolRqMn[0] ;
         n11796SolRqMn = T00BG5_n11796SolRqMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11796SolRqMn", A11796SolRqMn);
         A11797SolRqMnSt = T00BG5_A11797SolRqMnSt[0] ;
         n11797SolRqMnSt = T00BG5_n11797SolRqMnSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11797SolRqMnSt", GXutil.str( A11797SolRqMnSt, 1, 0));
         A11926SolMetodo = T00BG5_A11926SolMetodo[0] ;
         n11926SolMetodo = T00BG5_n11926SolMetodo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11926SolMetodo", A11926SolMetodo);
         A396EmprCod = T00BG5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T00BG5_A129BarCod[0] ;
         n129BarCod = T00BG5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00BG5_A132BarCodReo[0] ;
         n132BarCodReo = T00BG5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00BG5_A130BarCodPar[0] ;
         n130BarCodPar = T00BG5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T00BG5_A652OpeCod[0] ;
         n652OpeCod = T00BG5_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z3253SolTraCod = A3253SolTraCod ;
         sMode471 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadBG471( ) ;
         if ( AnyError == 1 )
         {
            RcdFound471 = (short)(0) ;
            initializeNonKeyBG471( ) ;
         }
         Gx_mode = sMode471 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound471 = (short)(0) ;
         initializeNonKeyBG471( ) ;
         sMode471 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode471 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyBG471( ) ;
      if ( RcdFound471 == 0 )
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
      RcdFound471 = (short)(0) ;
      /* Using cursor T00BG14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A3253SolTraCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00BG14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00BG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00BG14_A3253SolTraCod[0] < A3253SolTraCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00BG14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00BG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00BG14_A3253SolTraCod[0] > A3253SolTraCod ) ) )
         {
            A396EmprCod = T00BG14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3253SolTraCod = T00BG14_A3253SolTraCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
            RcdFound471 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound471 = (short)(0) ;
      /* Using cursor T00BG15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A3253SolTraCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00BG15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00BG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00BG15_A3253SolTraCod[0] > A3253SolTraCod ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00BG15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00BG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00BG15_A3253SolTraCod[0] < A3253SolTraCod ) ) )
         {
            A396EmprCod = T00BG15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3253SolTraCod = T00BG15_A3253SolTraCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
            RcdFound471 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyBG471( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertBG471( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound471 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3253SolTraCod != Z3253SolTraCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A3253SolTraCod = Z3253SolTraCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
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
               updateBG471( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3253SolTraCod != Z3253SolTraCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertBG471( ) ;
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
                  insertBG471( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3253SolTraCod != Z3253SolTraCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3253SolTraCod = Z3253SolTraCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
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
      getKeyBG471( ) ;
      if ( RcdFound471 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3253SolTraCod != Z3253SolTraCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3253SolTraCod = Z3253SolTraCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3253SolTraCod != Z3253SolTraCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttraspi");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_BG0( ) ;
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
      if ( RcdFound471 == 0 )
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
      scanStartBG471( ) ;
      if ( RcdFound471 == 0 )
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
      scanEndBG471( ) ;
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
      if ( RcdFound471 == 0 )
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
      if ( RcdFound471 == 0 )
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
      scanStartBG471( ) ;
      if ( RcdFound471 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound471 != 0 )
         {
            scanNextBG471( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndBG471( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyBG471( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00BG4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCTRASP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z3254SolTraMat, T00BG4_A3254SolTraMat[0]) != 0 ) || ( GXutil.strcmp(Z3255SolTraSer, T00BG4_A3255SolTraSer[0]) != 0 ) || ( Z3256SolTraTip != T00BG4_A3256SolTraTip[0] ) || ( GXutil.strcmp(Z3257SolTraDisN, T00BG4_A3257SolTraDisN[0]) != 0 ) || ( GXutil.strcmp(Z3258SolTraNom, T00BG4_A3258SolTraNom[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3259SolTraNum != T00BG4_A3259SolTraNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z3260SolTraFec), GXutil.resetTime(T00BG4_A3260SolTraFec[0])) ) || ( Z3261SolTraCliC != T00BG4_A3261SolTraCliC[0] ) || ( GXutil.strcmp(Z3262SolTraCliN, T00BG4_A3262SolTraCliN[0]) != 0 ) || ( GXutil.strcmp(Z3263SolTraAc, T00BG4_A3263SolTraAc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3264SolTraMa, T00BG4_A3264SolTraMa[0]) != 0 ) || ( GXutil.strcmp(Z3265SolTraNor, T00BG4_A3265SolTraNor[0]) != 0 ) || ( GXutil.strcmp(Z3266SolTraMaq, T00BG4_A3266SolTraMaq[0]) != 0 ) || ( GXutil.strcmp(Z3267SolTraRef, T00BG4_A3267SolTraRef[0]) != 0 ) || ( Z3268SolTraUlin != T00BG4_A3268SolTraUlin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3759SolAciTac, T00BG4_A3759SolAciTac[0]) != 0 ) || ( GXutil.strcmp(Z3760SolAciCo, T00BG4_A3760SolAciCo[0]) != 0 ) || ( GXutil.strcmp(Z3761SolAciPa6, T00BG4_A3761SolAciPa6[0]) != 0 ) || ( GXutil.strcmp(Z3762SolAciPes, T00BG4_A3762SolAciPes[0]) != 0 ) || ( GXutil.strcmp(Z3763SolAciPac, T00BG4_A3763SolAciPac[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3764SolAciWo, T00BG4_A3764SolAciWo[0]) != 0 ) || ( GXutil.strcmp(Z3765SolAciNorm, T00BG4_A3765SolAciNorm[0]) != 0 ) || ( GXutil.strcmp(Z3766SolAlcTac, T00BG4_A3766SolAlcTac[0]) != 0 ) || ( GXutil.strcmp(Z3767SolAlcCo, T00BG4_A3767SolAlcCo[0]) != 0 ) || ( GXutil.strcmp(Z3768SolAlcPa6, T00BG4_A3768SolAlcPa6[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3769SolAlcPes, T00BG4_A3769SolAlcPes[0]) != 0 ) || ( GXutil.strcmp(Z3770SolAlcPac, T00BG4_A3770SolAlcPac[0]) != 0 ) || ( GXutil.strcmp(Z3771SolAlcWo, T00BG4_A3771SolAlcWo[0]) != 0 ) || ( GXutil.strcmp(Z3772SolAlcNorm, T00BG4_A3772SolAlcNorm[0]) != 0 ) || ( GXutil.strcmp(Z3773SolAquTac, T00BG4_A3773SolAquTac[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3774SolAquCo, T00BG4_A3774SolAquCo[0]) != 0 ) || ( GXutil.strcmp(Z3775SolAquPa6, T00BG4_A3775SolAquPa6[0]) != 0 ) || ( GXutil.strcmp(Z3776SolAquPes, T00BG4_A3776SolAquPes[0]) != 0 ) || ( GXutil.strcmp(Z3777SolAquPac, T00BG4_A3777SolAquPac[0]) != 0 ) || ( GXutil.strcmp(Z3778SolAquWo, T00BG4_A3778SolAquWo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3779SolAquNorm, T00BG4_A3779SolAquNorm[0]) != 0 ) || ( GXutil.strcmp(Z4025SolTraAcAl, T00BG4_A4025SolTraAcAl[0]) != 0 ) || ( GXutil.strcmp(Z4026SolTraMaAl, T00BG4_A4026SolTraMaAl[0]) != 0 ) || ( GXutil.strcmp(Z4027SolTraAcAc, T00BG4_A4027SolTraAcAc[0]) != 0 ) || ( GXutil.strcmp(Z4028SolTraMaAc, T00BG4_A4028SolTraMaAc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4029SolTraAcAq, T00BG4_A4029SolTraAcAq[0]) != 0 ) || ( GXutil.strcmp(Z4030SolTraMaAq, T00BG4_A4030SolTraMaAq[0]) != 0 ) || ( GXutil.strcmp(Z4381SolTraCoAq, T00BG4_A4381SolTraCoAq[0]) != 0 ) || ( GXutil.strcmp(Z4382SolTraCoAc, T00BG4_A4382SolTraCoAc[0]) != 0 ) || ( GXutil.strcmp(Z4383SolTraCoAl, T00BG4_A4383SolTraCoAl[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4952SolMarTac, T00BG4_A4952SolMarTac[0]) != 0 ) || ( GXutil.strcmp(Z4953SolMarCo, T00BG4_A4953SolMarCo[0]) != 0 ) || ( GXutil.strcmp(Z4954SolMarPa6, T00BG4_A4954SolMarPa6[0]) != 0 ) || ( GXutil.strcmp(Z4955SolMarPes, T00BG4_A4955SolMarPes[0]) != 0 ) || ( GXutil.strcmp(Z4956SolMarPac, T00BG4_A4956SolMarPac[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4957SolMarWo, T00BG4_A4957SolMarWo[0]) != 0 ) || ( GXutil.strcmp(Z4958SolMarNorm, T00BG4_A4958SolMarNorm[0]) != 0 ) || ( GXutil.strcmp(Z4959SolTraCoMa, T00BG4_A4959SolTraCoMa[0]) != 0 ) || ( GXutil.strcmp(Z11796SolRqMn, T00BG4_A11796SolRqMn[0]) != 0 ) || ( Z11797SolRqMnSt != T00BG4_A11797SolRqMnSt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11926SolMetodo, T00BG4_A11926SolMetodo[0]) != 0 ) || ( Z129BarCod != T00BG4_A129BarCod[0] ) || ( Z132BarCodReo != T00BG4_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T00BG4_A130BarCodPar[0]) != 0 ) || ( Z652OpeCod != T00BG4_A652OpeCod[0] ) )
         {
            if ( GXutil.strcmp(Z3254SolTraMat, T00BG4_A3254SolTraMat[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraMat");
               GXutil.writeLogRaw("Old: ",Z3254SolTraMat);
               GXutil.writeLogRaw("Current: ",T00BG4_A3254SolTraMat[0]);
            }
            if ( GXutil.strcmp(Z3255SolTraSer, T00BG4_A3255SolTraSer[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraSer");
               GXutil.writeLogRaw("Old: ",Z3255SolTraSer);
               GXutil.writeLogRaw("Current: ",T00BG4_A3255SolTraSer[0]);
            }
            if ( Z3256SolTraTip != T00BG4_A3256SolTraTip[0] )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraTip");
               GXutil.writeLogRaw("Old: ",Z3256SolTraTip);
               GXutil.writeLogRaw("Current: ",T00BG4_A3256SolTraTip[0]);
            }
            if ( GXutil.strcmp(Z3257SolTraDisN, T00BG4_A3257SolTraDisN[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraDisN");
               GXutil.writeLogRaw("Old: ",Z3257SolTraDisN);
               GXutil.writeLogRaw("Current: ",T00BG4_A3257SolTraDisN[0]);
            }
            if ( GXutil.strcmp(Z3258SolTraNom, T00BG4_A3258SolTraNom[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraNom");
               GXutil.writeLogRaw("Old: ",Z3258SolTraNom);
               GXutil.writeLogRaw("Current: ",T00BG4_A3258SolTraNom[0]);
            }
            if ( Z3259SolTraNum != T00BG4_A3259SolTraNum[0] )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraNum");
               GXutil.writeLogRaw("Old: ",Z3259SolTraNum);
               GXutil.writeLogRaw("Current: ",T00BG4_A3259SolTraNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3260SolTraFec), GXutil.resetTime(T00BG4_A3260SolTraFec[0])) ) )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraFec");
               GXutil.writeLogRaw("Old: ",Z3260SolTraFec);
               GXutil.writeLogRaw("Current: ",T00BG4_A3260SolTraFec[0]);
            }
            if ( Z3261SolTraCliC != T00BG4_A3261SolTraCliC[0] )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraCliC");
               GXutil.writeLogRaw("Old: ",Z3261SolTraCliC);
               GXutil.writeLogRaw("Current: ",T00BG4_A3261SolTraCliC[0]);
            }
            if ( GXutil.strcmp(Z3262SolTraCliN, T00BG4_A3262SolTraCliN[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraCliN");
               GXutil.writeLogRaw("Old: ",Z3262SolTraCliN);
               GXutil.writeLogRaw("Current: ",T00BG4_A3262SolTraCliN[0]);
            }
            if ( GXutil.strcmp(Z3263SolTraAc, T00BG4_A3263SolTraAc[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraAc");
               GXutil.writeLogRaw("Old: ",Z3263SolTraAc);
               GXutil.writeLogRaw("Current: ",T00BG4_A3263SolTraAc[0]);
            }
            if ( GXutil.strcmp(Z3264SolTraMa, T00BG4_A3264SolTraMa[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraMa");
               GXutil.writeLogRaw("Old: ",Z3264SolTraMa);
               GXutil.writeLogRaw("Current: ",T00BG4_A3264SolTraMa[0]);
            }
            if ( GXutil.strcmp(Z3265SolTraNor, T00BG4_A3265SolTraNor[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraNor");
               GXutil.writeLogRaw("Old: ",Z3265SolTraNor);
               GXutil.writeLogRaw("Current: ",T00BG4_A3265SolTraNor[0]);
            }
            if ( GXutil.strcmp(Z3266SolTraMaq, T00BG4_A3266SolTraMaq[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraMaq");
               GXutil.writeLogRaw("Old: ",Z3266SolTraMaq);
               GXutil.writeLogRaw("Current: ",T00BG4_A3266SolTraMaq[0]);
            }
            if ( GXutil.strcmp(Z3267SolTraRef, T00BG4_A3267SolTraRef[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraRef");
               GXutil.writeLogRaw("Old: ",Z3267SolTraRef);
               GXutil.writeLogRaw("Current: ",T00BG4_A3267SolTraRef[0]);
            }
            if ( Z3268SolTraUlin != T00BG4_A3268SolTraUlin[0] )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraUlin");
               GXutil.writeLogRaw("Old: ",Z3268SolTraUlin);
               GXutil.writeLogRaw("Current: ",T00BG4_A3268SolTraUlin[0]);
            }
            if ( GXutil.strcmp(Z3759SolAciTac, T00BG4_A3759SolAciTac[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAciTac");
               GXutil.writeLogRaw("Old: ",Z3759SolAciTac);
               GXutil.writeLogRaw("Current: ",T00BG4_A3759SolAciTac[0]);
            }
            if ( GXutil.strcmp(Z3760SolAciCo, T00BG4_A3760SolAciCo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAciCo");
               GXutil.writeLogRaw("Old: ",Z3760SolAciCo);
               GXutil.writeLogRaw("Current: ",T00BG4_A3760SolAciCo[0]);
            }
            if ( GXutil.strcmp(Z3761SolAciPa6, T00BG4_A3761SolAciPa6[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAciPa6");
               GXutil.writeLogRaw("Old: ",Z3761SolAciPa6);
               GXutil.writeLogRaw("Current: ",T00BG4_A3761SolAciPa6[0]);
            }
            if ( GXutil.strcmp(Z3762SolAciPes, T00BG4_A3762SolAciPes[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAciPes");
               GXutil.writeLogRaw("Old: ",Z3762SolAciPes);
               GXutil.writeLogRaw("Current: ",T00BG4_A3762SolAciPes[0]);
            }
            if ( GXutil.strcmp(Z3763SolAciPac, T00BG4_A3763SolAciPac[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAciPac");
               GXutil.writeLogRaw("Old: ",Z3763SolAciPac);
               GXutil.writeLogRaw("Current: ",T00BG4_A3763SolAciPac[0]);
            }
            if ( GXutil.strcmp(Z3764SolAciWo, T00BG4_A3764SolAciWo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAciWo");
               GXutil.writeLogRaw("Old: ",Z3764SolAciWo);
               GXutil.writeLogRaw("Current: ",T00BG4_A3764SolAciWo[0]);
            }
            if ( GXutil.strcmp(Z3765SolAciNorm, T00BG4_A3765SolAciNorm[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAciNorm");
               GXutil.writeLogRaw("Old: ",Z3765SolAciNorm);
               GXutil.writeLogRaw("Current: ",T00BG4_A3765SolAciNorm[0]);
            }
            if ( GXutil.strcmp(Z3766SolAlcTac, T00BG4_A3766SolAlcTac[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAlcTac");
               GXutil.writeLogRaw("Old: ",Z3766SolAlcTac);
               GXutil.writeLogRaw("Current: ",T00BG4_A3766SolAlcTac[0]);
            }
            if ( GXutil.strcmp(Z3767SolAlcCo, T00BG4_A3767SolAlcCo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAlcCo");
               GXutil.writeLogRaw("Old: ",Z3767SolAlcCo);
               GXutil.writeLogRaw("Current: ",T00BG4_A3767SolAlcCo[0]);
            }
            if ( GXutil.strcmp(Z3768SolAlcPa6, T00BG4_A3768SolAlcPa6[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAlcPa6");
               GXutil.writeLogRaw("Old: ",Z3768SolAlcPa6);
               GXutil.writeLogRaw("Current: ",T00BG4_A3768SolAlcPa6[0]);
            }
            if ( GXutil.strcmp(Z3769SolAlcPes, T00BG4_A3769SolAlcPes[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAlcPes");
               GXutil.writeLogRaw("Old: ",Z3769SolAlcPes);
               GXutil.writeLogRaw("Current: ",T00BG4_A3769SolAlcPes[0]);
            }
            if ( GXutil.strcmp(Z3770SolAlcPac, T00BG4_A3770SolAlcPac[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAlcPac");
               GXutil.writeLogRaw("Old: ",Z3770SolAlcPac);
               GXutil.writeLogRaw("Current: ",T00BG4_A3770SolAlcPac[0]);
            }
            if ( GXutil.strcmp(Z3771SolAlcWo, T00BG4_A3771SolAlcWo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAlcWo");
               GXutil.writeLogRaw("Old: ",Z3771SolAlcWo);
               GXutil.writeLogRaw("Current: ",T00BG4_A3771SolAlcWo[0]);
            }
            if ( GXutil.strcmp(Z3772SolAlcNorm, T00BG4_A3772SolAlcNorm[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAlcNorm");
               GXutil.writeLogRaw("Old: ",Z3772SolAlcNorm);
               GXutil.writeLogRaw("Current: ",T00BG4_A3772SolAlcNorm[0]);
            }
            if ( GXutil.strcmp(Z3773SolAquTac, T00BG4_A3773SolAquTac[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAquTac");
               GXutil.writeLogRaw("Old: ",Z3773SolAquTac);
               GXutil.writeLogRaw("Current: ",T00BG4_A3773SolAquTac[0]);
            }
            if ( GXutil.strcmp(Z3774SolAquCo, T00BG4_A3774SolAquCo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAquCo");
               GXutil.writeLogRaw("Old: ",Z3774SolAquCo);
               GXutil.writeLogRaw("Current: ",T00BG4_A3774SolAquCo[0]);
            }
            if ( GXutil.strcmp(Z3775SolAquPa6, T00BG4_A3775SolAquPa6[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAquPa6");
               GXutil.writeLogRaw("Old: ",Z3775SolAquPa6);
               GXutil.writeLogRaw("Current: ",T00BG4_A3775SolAquPa6[0]);
            }
            if ( GXutil.strcmp(Z3776SolAquPes, T00BG4_A3776SolAquPes[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAquPes");
               GXutil.writeLogRaw("Old: ",Z3776SolAquPes);
               GXutil.writeLogRaw("Current: ",T00BG4_A3776SolAquPes[0]);
            }
            if ( GXutil.strcmp(Z3777SolAquPac, T00BG4_A3777SolAquPac[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAquPac");
               GXutil.writeLogRaw("Old: ",Z3777SolAquPac);
               GXutil.writeLogRaw("Current: ",T00BG4_A3777SolAquPac[0]);
            }
            if ( GXutil.strcmp(Z3778SolAquWo, T00BG4_A3778SolAquWo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAquWo");
               GXutil.writeLogRaw("Old: ",Z3778SolAquWo);
               GXutil.writeLogRaw("Current: ",T00BG4_A3778SolAquWo[0]);
            }
            if ( GXutil.strcmp(Z3779SolAquNorm, T00BG4_A3779SolAquNorm[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolAquNorm");
               GXutil.writeLogRaw("Old: ",Z3779SolAquNorm);
               GXutil.writeLogRaw("Current: ",T00BG4_A3779SolAquNorm[0]);
            }
            if ( GXutil.strcmp(Z4025SolTraAcAl, T00BG4_A4025SolTraAcAl[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraAcAl");
               GXutil.writeLogRaw("Old: ",Z4025SolTraAcAl);
               GXutil.writeLogRaw("Current: ",T00BG4_A4025SolTraAcAl[0]);
            }
            if ( GXutil.strcmp(Z4026SolTraMaAl, T00BG4_A4026SolTraMaAl[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraMaAl");
               GXutil.writeLogRaw("Old: ",Z4026SolTraMaAl);
               GXutil.writeLogRaw("Current: ",T00BG4_A4026SolTraMaAl[0]);
            }
            if ( GXutil.strcmp(Z4027SolTraAcAc, T00BG4_A4027SolTraAcAc[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraAcAc");
               GXutil.writeLogRaw("Old: ",Z4027SolTraAcAc);
               GXutil.writeLogRaw("Current: ",T00BG4_A4027SolTraAcAc[0]);
            }
            if ( GXutil.strcmp(Z4028SolTraMaAc, T00BG4_A4028SolTraMaAc[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraMaAc");
               GXutil.writeLogRaw("Old: ",Z4028SolTraMaAc);
               GXutil.writeLogRaw("Current: ",T00BG4_A4028SolTraMaAc[0]);
            }
            if ( GXutil.strcmp(Z4029SolTraAcAq, T00BG4_A4029SolTraAcAq[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraAcAq");
               GXutil.writeLogRaw("Old: ",Z4029SolTraAcAq);
               GXutil.writeLogRaw("Current: ",T00BG4_A4029SolTraAcAq[0]);
            }
            if ( GXutil.strcmp(Z4030SolTraMaAq, T00BG4_A4030SolTraMaAq[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraMaAq");
               GXutil.writeLogRaw("Old: ",Z4030SolTraMaAq);
               GXutil.writeLogRaw("Current: ",T00BG4_A4030SolTraMaAq[0]);
            }
            if ( GXutil.strcmp(Z4381SolTraCoAq, T00BG4_A4381SolTraCoAq[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraCoAq");
               GXutil.writeLogRaw("Old: ",Z4381SolTraCoAq);
               GXutil.writeLogRaw("Current: ",T00BG4_A4381SolTraCoAq[0]);
            }
            if ( GXutil.strcmp(Z4382SolTraCoAc, T00BG4_A4382SolTraCoAc[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraCoAc");
               GXutil.writeLogRaw("Old: ",Z4382SolTraCoAc);
               GXutil.writeLogRaw("Current: ",T00BG4_A4382SolTraCoAc[0]);
            }
            if ( GXutil.strcmp(Z4383SolTraCoAl, T00BG4_A4383SolTraCoAl[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraCoAl");
               GXutil.writeLogRaw("Old: ",Z4383SolTraCoAl);
               GXutil.writeLogRaw("Current: ",T00BG4_A4383SolTraCoAl[0]);
            }
            if ( GXutil.strcmp(Z4952SolMarTac, T00BG4_A4952SolMarTac[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolMarTac");
               GXutil.writeLogRaw("Old: ",Z4952SolMarTac);
               GXutil.writeLogRaw("Current: ",T00BG4_A4952SolMarTac[0]);
            }
            if ( GXutil.strcmp(Z4953SolMarCo, T00BG4_A4953SolMarCo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolMarCo");
               GXutil.writeLogRaw("Old: ",Z4953SolMarCo);
               GXutil.writeLogRaw("Current: ",T00BG4_A4953SolMarCo[0]);
            }
            if ( GXutil.strcmp(Z4954SolMarPa6, T00BG4_A4954SolMarPa6[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolMarPa6");
               GXutil.writeLogRaw("Old: ",Z4954SolMarPa6);
               GXutil.writeLogRaw("Current: ",T00BG4_A4954SolMarPa6[0]);
            }
            if ( GXutil.strcmp(Z4955SolMarPes, T00BG4_A4955SolMarPes[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolMarPes");
               GXutil.writeLogRaw("Old: ",Z4955SolMarPes);
               GXutil.writeLogRaw("Current: ",T00BG4_A4955SolMarPes[0]);
            }
            if ( GXutil.strcmp(Z4956SolMarPac, T00BG4_A4956SolMarPac[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolMarPac");
               GXutil.writeLogRaw("Old: ",Z4956SolMarPac);
               GXutil.writeLogRaw("Current: ",T00BG4_A4956SolMarPac[0]);
            }
            if ( GXutil.strcmp(Z4957SolMarWo, T00BG4_A4957SolMarWo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolMarWo");
               GXutil.writeLogRaw("Old: ",Z4957SolMarWo);
               GXutil.writeLogRaw("Current: ",T00BG4_A4957SolMarWo[0]);
            }
            if ( GXutil.strcmp(Z4958SolMarNorm, T00BG4_A4958SolMarNorm[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolMarNorm");
               GXutil.writeLogRaw("Old: ",Z4958SolMarNorm);
               GXutil.writeLogRaw("Current: ",T00BG4_A4958SolMarNorm[0]);
            }
            if ( GXutil.strcmp(Z4959SolTraCoMa, T00BG4_A4959SolTraCoMa[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraCoMa");
               GXutil.writeLogRaw("Old: ",Z4959SolTraCoMa);
               GXutil.writeLogRaw("Current: ",T00BG4_A4959SolTraCoMa[0]);
            }
            if ( GXutil.strcmp(Z11796SolRqMn, T00BG4_A11796SolRqMn[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolRqMn");
               GXutil.writeLogRaw("Old: ",Z11796SolRqMn);
               GXutil.writeLogRaw("Current: ",T00BG4_A11796SolRqMn[0]);
            }
            if ( Z11797SolRqMnSt != T00BG4_A11797SolRqMnSt[0] )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolRqMnSt");
               GXutil.writeLogRaw("Old: ",Z11797SolRqMnSt);
               GXutil.writeLogRaw("Current: ",T00BG4_A11797SolRqMnSt[0]);
            }
            if ( GXutil.strcmp(Z11926SolMetodo, T00BG4_A11926SolMetodo[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolMetodo");
               GXutil.writeLogRaw("Old: ",Z11926SolMetodo);
               GXutil.writeLogRaw("Current: ",T00BG4_A11926SolMetodo[0]);
            }
            if ( Z129BarCod != T00BG4_A129BarCod[0] )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T00BG4_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T00BG4_A132BarCodReo[0] )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T00BG4_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T00BG4_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T00BG4_A130BarCodPar[0]);
            }
            if ( Z652OpeCod != T00BG4_A652OpeCod[0] )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T00BG4_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCTRASP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertBG471( )
   {
      beforeValidateBG471( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBG471( ) ;
      }
      if ( AnyError == 0 )
      {
         zmBG471( 0) ;
         checkOptimisticConcurrencyBG471( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmBG471( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertBG471( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BG16 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A3253SolTraCod), Boolean.valueOf(n3254SolTraMat), A3254SolTraMat, Boolean.valueOf(n3255SolTraSer), A3255SolTraSer, Boolean.valueOf(n3256SolTraTip), Short.valueOf(A3256SolTraTip), Boolean.valueOf(n3257SolTraDisN), A3257SolTraDisN, Boolean.valueOf(n3258SolTraNom), A3258SolTraNom, Boolean.valueOf(n3259SolTraNum), Integer.valueOf(A3259SolTraNum), Boolean.valueOf(n3260SolTraFec), A3260SolTraFec, Boolean.valueOf(n3261SolTraCliC), Integer.valueOf(A3261SolTraCliC), Boolean.valueOf(n3262SolTraCliN), A3262SolTraCliN, Boolean.valueOf(n3263SolTraAc), A3263SolTraAc, Boolean.valueOf(n3264SolTraMa), A3264SolTraMa, Boolean.valueOf(n3265SolTraNor), A3265SolTraNor, Boolean.valueOf(n3266SolTraMaq), A3266SolTraMaq, Boolean.valueOf(n3267SolTraRef), A3267SolTraRef, Boolean.valueOf(n3268SolTraUlin), Byte.valueOf(A3268SolTraUlin), Boolean.valueOf(n3759SolAciTac), A3759SolAciTac, Boolean.valueOf(n3760SolAciCo), A3760SolAciCo, Boolean.valueOf(n3761SolAciPa6), A3761SolAciPa6, Boolean.valueOf(n3762SolAciPes), A3762SolAciPes, Boolean.valueOf(n3763SolAciPac), A3763SolAciPac, Boolean.valueOf(n3764SolAciWo), A3764SolAciWo, Boolean.valueOf(n3765SolAciNorm), A3765SolAciNorm, Boolean.valueOf(n3766SolAlcTac), A3766SolAlcTac, Boolean.valueOf(n3767SolAlcCo), A3767SolAlcCo, Boolean.valueOf(n3768SolAlcPa6), A3768SolAlcPa6, Boolean.valueOf(n3769SolAlcPes), A3769SolAlcPes, Boolean.valueOf(n3770SolAlcPac), A3770SolAlcPac, Boolean.valueOf(n3771SolAlcWo), A3771SolAlcWo, Boolean.valueOf(n3772SolAlcNorm), A3772SolAlcNorm, Boolean.valueOf(n3773SolAquTac), A3773SolAquTac, Boolean.valueOf(n3774SolAquCo), A3774SolAquCo, Boolean.valueOf(n3775SolAquPa6), A3775SolAquPa6, Boolean.valueOf(n3776SolAquPes), A3776SolAquPes, Boolean.valueOf(n3777SolAquPac), A3777SolAquPac, Boolean.valueOf(n3778SolAquWo), A3778SolAquWo, Boolean.valueOf(n3779SolAquNorm), A3779SolAquNorm, Boolean.valueOf(n4025SolTraAcAl), A4025SolTraAcAl, Boolean.valueOf(n4026SolTraMaAl), A4026SolTraMaAl, Boolean.valueOf(n4027SolTraAcAc), A4027SolTraAcAc, Boolean.valueOf(n4028SolTraMaAc), A4028SolTraMaAc, Boolean.valueOf(n4029SolTraAcAq), A4029SolTraAcAq, Boolean.valueOf(n4030SolTraMaAq), A4030SolTraMaAq, Boolean.valueOf(n4381SolTraCoAq), A4381SolTraCoAq, Boolean.valueOf(n4382SolTraCoAc), A4382SolTraCoAc, Boolean.valueOf(n4383SolTraCoAl), A4383SolTraCoAl, Boolean.valueOf(n4952SolMarTac), A4952SolMarTac, Boolean.valueOf(n4953SolMarCo), A4953SolMarCo, Boolean.valueOf(n4954SolMarPa6), A4954SolMarPa6, Boolean.valueOf(n4955SolMarPes), A4955SolMarPes, Boolean.valueOf(n4956SolMarPac), A4956SolMarPac, Boolean.valueOf(n4957SolMarWo), A4957SolMarWo, Boolean.valueOf(n4958SolMarNorm), A4958SolMarNorm, Boolean.valueOf(n4959SolTraCoMa), A4959SolTraCoMa, Boolean.valueOf(n11796SolRqMn), A11796SolRqMn, Boolean.valueOf(n11797SolRqMnSt), Byte.valueOf(A11797SolRqMnSt), Boolean.valueOf(n11926SolMetodo), A11926SolMetodo, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)})
                  ;
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCTRASP");
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
                        processLevelBG471( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionBG0( ) ;
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
            loadBG471( ) ;
         }
         endLevelBG471( ) ;
      }
      closeExtendedTableCursorsBG471( ) ;
   }

   public void updateBG471( )
   {
      beforeValidateBG471( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBG471( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyBG471( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmBG471( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateBG471( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BG17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n3254SolTraMat), A3254SolTraMat, Boolean.valueOf(n3255SolTraSer), A3255SolTraSer, Boolean.valueOf(n3256SolTraTip), Short.valueOf(A3256SolTraTip), Boolean.valueOf(n3257SolTraDisN), A3257SolTraDisN, Boolean.valueOf(n3258SolTraNom), A3258SolTraNom, Boolean.valueOf(n3259SolTraNum), Integer.valueOf(A3259SolTraNum), Boolean.valueOf(n3260SolTraFec), A3260SolTraFec, Boolean.valueOf(n3261SolTraCliC), Integer.valueOf(A3261SolTraCliC), Boolean.valueOf(n3262SolTraCliN), A3262SolTraCliN, Boolean.valueOf(n3263SolTraAc), A3263SolTraAc, Boolean.valueOf(n3264SolTraMa), A3264SolTraMa, Boolean.valueOf(n3265SolTraNor), A3265SolTraNor, Boolean.valueOf(n3266SolTraMaq), A3266SolTraMaq, Boolean.valueOf(n3267SolTraRef), A3267SolTraRef, Boolean.valueOf(n3268SolTraUlin), Byte.valueOf(A3268SolTraUlin), Boolean.valueOf(n3759SolAciTac), A3759SolAciTac, Boolean.valueOf(n3760SolAciCo), A3760SolAciCo, Boolean.valueOf(n3761SolAciPa6), A3761SolAciPa6, Boolean.valueOf(n3762SolAciPes), A3762SolAciPes, Boolean.valueOf(n3763SolAciPac), A3763SolAciPac, Boolean.valueOf(n3764SolAciWo), A3764SolAciWo, Boolean.valueOf(n3765SolAciNorm), A3765SolAciNorm, Boolean.valueOf(n3766SolAlcTac), A3766SolAlcTac, Boolean.valueOf(n3767SolAlcCo), A3767SolAlcCo, Boolean.valueOf(n3768SolAlcPa6), A3768SolAlcPa6, Boolean.valueOf(n3769SolAlcPes), A3769SolAlcPes, Boolean.valueOf(n3770SolAlcPac), A3770SolAlcPac, Boolean.valueOf(n3771SolAlcWo), A3771SolAlcWo, Boolean.valueOf(n3772SolAlcNorm), A3772SolAlcNorm, Boolean.valueOf(n3773SolAquTac), A3773SolAquTac, Boolean.valueOf(n3774SolAquCo), A3774SolAquCo, Boolean.valueOf(n3775SolAquPa6), A3775SolAquPa6, Boolean.valueOf(n3776SolAquPes), A3776SolAquPes, Boolean.valueOf(n3777SolAquPac), A3777SolAquPac, Boolean.valueOf(n3778SolAquWo), A3778SolAquWo, Boolean.valueOf(n3779SolAquNorm), A3779SolAquNorm, Boolean.valueOf(n4025SolTraAcAl), A4025SolTraAcAl, Boolean.valueOf(n4026SolTraMaAl), A4026SolTraMaAl, Boolean.valueOf(n4027SolTraAcAc), A4027SolTraAcAc, Boolean.valueOf(n4028SolTraMaAc), A4028SolTraMaAc, Boolean.valueOf(n4029SolTraAcAq), A4029SolTraAcAq, Boolean.valueOf(n4030SolTraMaAq), A4030SolTraMaAq, Boolean.valueOf(n4381SolTraCoAq), A4381SolTraCoAq, Boolean.valueOf(n4382SolTraCoAc), A4382SolTraCoAc, Boolean.valueOf(n4383SolTraCoAl), A4383SolTraCoAl, Boolean.valueOf(n4952SolMarTac), A4952SolMarTac, Boolean.valueOf(n4953SolMarCo), A4953SolMarCo, Boolean.valueOf(n4954SolMarPa6), A4954SolMarPa6, Boolean.valueOf(n4955SolMarPes), A4955SolMarPes, Boolean.valueOf(n4956SolMarPac), A4956SolMarPac, Boolean.valueOf(n4957SolMarWo), A4957SolMarWo, Boolean.valueOf(n4958SolMarNorm), A4958SolMarNorm, Boolean.valueOf(n4959SolTraCoMa), A4959SolTraCoMa, Boolean.valueOf(n11796SolRqMn), A11796SolRqMn, Boolean.valueOf(n11797SolRqMnSt), Byte.valueOf(A11797SolRqMnSt), Boolean.valueOf(n11926SolMetodo), A11926SolMetodo, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A3253SolTraCod)})
                  ;
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCTRASP");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCTRASP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateBG471( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelBG471( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionBG0( ) ;
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
         endLevelBG471( ) ;
      }
      closeExtendedTableCursorsBG471( ) ;
   }

   public void deferredUpdateBG471( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateBG471( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyBG471( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsBG471( ) ;
         afterConfirmBG471( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteBG471( ) ;
            if ( AnyError == 0 )
            {
               scanStartBG472( ) ;
               while ( RcdFound472 != 0 )
               {
                  getByPrimaryKeyBG472( ) ;
                  deleteBG472( ) ;
                  scanNextBG472( ) ;
               }
               scanEndBG472( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BG18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCTRASP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound471 == 0 )
                        {
                           initAllBG471( ) ;
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
                        resetCaptionBG0( ) ;
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
      sMode471 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelBG471( ) ;
      Gx_mode = sMode471 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsBG471( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00BG19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T00BG19_A407EmprNom[0] ;
         n407EmprNom = T00BG19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T00BG20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T00BG20_A653OpeNom[0] ;
         n653OpeNom = T00BG20_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(18);
      }
   }

   public void processNestedLevelBG472( )
   {
      nGXsfl_340_idx = 0 ;
      while ( nGXsfl_340_idx < nRC_GXsfl_340 )
      {
         readRowBG472( ) ;
         if ( ( nRcdExists_472 != 0 ) || ( nIsMod_472 != 0 ) )
         {
            standaloneNotModalBG472( ) ;
            getKeyBG472( ) ;
            if ( ( nRcdExists_472 == 0 ) && ( nRcdDeleted_472 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertBG472( ) ;
            }
            else
            {
               if ( RcdFound472 != 0 )
               {
                  if ( ( nRcdDeleted_472 != 0 ) && ( nRcdExists_472 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteBG472( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_472 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateBG472( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_472 == 0 )
                  {
                     GXCCtl = "SOLTRALIN_" + sGXsfl_340_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolTraLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_472_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolTraLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3269SolTraLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolTraObs_Internalname, GXutil.rtrim( A3270SolTraObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3269SolTraLin_"+sGXsfl_340_idx, GXutil.ltrim( localUtil.ntoc( Z3269SolTraLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3270SolTraObs_"+sGXsfl_340_idx, GXutil.rtrim( Z3270SolTraObs)) ;
         httpContext.changePostValue( "nRcdDeleted_472_"+sGXsfl_340_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_472_"+sGXsfl_340_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_472_"+sGXsfl_340_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_472 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_472_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_472_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLTRALIN_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolTraLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLTRAOBS_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolTraObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllBG472( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_472 = (short)(0) ;
      nIsMod_472 = (short)(0) ;
      nRcdDeleted_472 = (short)(0) ;
   }

   public void processLevelBG471( )
   {
      /* Save parent mode. */
      sMode471 = Gx_mode ;
      processNestedLevelBG472( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode471 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelBG471( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteBG471( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttraspi");
         if ( AnyError == 0 )
         {
            confirmValuesBG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttraspi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartBG471( )
   {
      /* Using cursor T00BG21 */
      pr_default.execute(19);
      RcdFound471 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound471 = (short)(1) ;
         A396EmprCod = T00BG21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3253SolTraCod = T00BG21_A3253SolTraCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextBG471( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound471 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound471 = (short)(1) ;
         A396EmprCod = T00BG21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3253SolTraCod = T00BG21_A3253SolTraCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
      }
   }

   public void scanEndBG471( )
   {
      pr_default.close(19);
   }

   public void afterConfirmBG471( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertBG471( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateBG471( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteBG471( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteBG471( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateBG471( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesBG471( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolTraCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtSolTraMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraMat_Enabled), 5, 0), true);
      edtSolTraSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraSer_Enabled), 5, 0), true);
      edtSolTraTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraTip_Enabled), 5, 0), true);
      edtSolTraDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraDisN_Enabled), 5, 0), true);
      edtSolTraNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraNom_Enabled), 5, 0), true);
      edtSolTraNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraNum_Enabled), 5, 0), true);
      edtSolTraFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraFec_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtSolTraCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraCliC_Enabled), 5, 0), true);
      edtSolTraCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraCliN_Enabled), 5, 0), true);
      edtSolTraAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraAc_Enabled), 5, 0), true);
      edtSolTraMa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraMa_Enabled), 5, 0), true);
      edtSolTraNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraNor_Enabled), 5, 0), true);
      edtSolTraMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraMaq_Enabled), 5, 0), true);
      edtSolTraRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraRef_Enabled), 5, 0), true);
      edtSolTraUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraUlin_Enabled), 5, 0), true);
      edtSolAciTac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAciTac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAciTac_Enabled), 5, 0), true);
      edtSolAciCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAciCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAciCo_Enabled), 5, 0), true);
      edtSolAciPa6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAciPa6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAciPa6_Enabled), 5, 0), true);
      edtSolAciPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAciPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAciPes_Enabled), 5, 0), true);
      edtSolAciPac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAciPac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAciPac_Enabled), 5, 0), true);
      edtSolAciWo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAciWo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAciWo_Enabled), 5, 0), true);
      edtSolAciNorm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAciNorm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAciNorm_Enabled), 5, 0), true);
      edtSolAlcTac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAlcTac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAlcTac_Enabled), 5, 0), true);
      edtSolAlcCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAlcCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAlcCo_Enabled), 5, 0), true);
      edtSolAlcPa6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAlcPa6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAlcPa6_Enabled), 5, 0), true);
      edtSolAlcPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAlcPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAlcPes_Enabled), 5, 0), true);
      edtSolAlcPac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAlcPac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAlcPac_Enabled), 5, 0), true);
      edtSolAlcWo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAlcWo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAlcWo_Enabled), 5, 0), true);
      edtSolAlcNorm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAlcNorm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAlcNorm_Enabled), 5, 0), true);
      edtSolAquTac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAquTac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAquTac_Enabled), 5, 0), true);
      edtSolAquCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAquCo_Enabled), 5, 0), true);
      edtSolAquPa6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAquPa6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAquPa6_Enabled), 5, 0), true);
      edtSolAquPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAquPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAquPes_Enabled), 5, 0), true);
      edtSolAquPac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAquPac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAquPac_Enabled), 5, 0), true);
      edtSolAquWo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAquWo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAquWo_Enabled), 5, 0), true);
      edtSolAquNorm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolAquNorm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolAquNorm_Enabled), 5, 0), true);
      edtSolTraAcAl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraAcAl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraAcAl_Enabled), 5, 0), true);
      edtSolTraMaAl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraMaAl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraMaAl_Enabled), 5, 0), true);
      edtSolTraAcAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraAcAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraAcAc_Enabled), 5, 0), true);
      edtSolTraMaAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraMaAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraMaAc_Enabled), 5, 0), true);
      edtSolTraAcAq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraAcAq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraAcAq_Enabled), 5, 0), true);
      edtSolTraMaAq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraMaAq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraMaAq_Enabled), 5, 0), true);
      edtSolTraCoAq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraCoAq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraCoAq_Enabled), 5, 0), true);
      edtSolTraCoAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraCoAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraCoAc_Enabled), 5, 0), true);
      edtSolTraCoAl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraCoAl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraCoAl_Enabled), 5, 0), true);
      edtSolMarTac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolMarTac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolMarTac_Enabled), 5, 0), true);
      edtSolMarCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolMarCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolMarCo_Enabled), 5, 0), true);
      edtSolMarPa6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolMarPa6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolMarPa6_Enabled), 5, 0), true);
      edtSolMarPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolMarPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolMarPes_Enabled), 5, 0), true);
      edtSolMarPac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolMarPac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolMarPac_Enabled), 5, 0), true);
      edtSolMarWo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolMarWo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolMarWo_Enabled), 5, 0), true);
      edtSolMarNorm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolMarNorm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolMarNorm_Enabled), 5, 0), true);
      edtSolTraCoMa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraCoMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraCoMa_Enabled), 5, 0), true);
      edtSolRqMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolRqMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolRqMn_Enabled), 5, 0), true);
      edtSolRqMnSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolRqMnSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolRqMnSt_Enabled), 5, 0), true);
      edtSolMetodo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolMetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolMetodo_Enabled), 5, 0), true);
   }

   public void zmBG472( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3270SolTraObs = T00BG3_A3270SolTraObs[0] ;
         }
         else
         {
            Z3270SolTraObs = A3270SolTraObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z3253SolTraCod = A3253SolTraCod ;
         Z3269SolTraLin = A3269SolTraLin ;
         Z3270SolTraObs = A3270SolTraObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalBG472( )
   {
   }

   public void standaloneModalBG472( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSolTraLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolTraLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraLin_Enabled), 5, 0), !bGXsfl_340_Refreshing);
      }
      else
      {
         edtSolTraLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolTraLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraLin_Enabled), 5, 0), !bGXsfl_340_Refreshing);
      }
   }

   public void loadBG472( )
   {
      /* Using cursor T00BG22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod), Byte.valueOf(A3269SolTraLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound472 = (short)(1) ;
         A3270SolTraObs = T00BG22_A3270SolTraObs[0] ;
         n3270SolTraObs = T00BG22_n3270SolTraObs[0] ;
         zmBG472( -5) ;
      }
      pr_default.close(20);
      onLoadActionsBG472( ) ;
   }

   public void onLoadActionsBG472( )
   {
   }

   public void checkExtendedTableBG472( )
   {
      nIsDirty_472 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalBG472( ) ;
   }

   public void closeExtendedTableCursorsBG472( )
   {
   }

   public void enableDisableBG472( )
   {
   }

   public void getKeyBG472( )
   {
      /* Using cursor T00BG23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod), Byte.valueOf(A3269SolTraLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound472 = (short)(1) ;
      }
      else
      {
         RcdFound472 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKeyBG472( )
   {
      /* Using cursor T00BG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod), Byte.valueOf(A3269SolTraLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmBG472( 5) ;
         RcdFound472 = (short)(1) ;
         initializeNonKeyBG472( ) ;
         A3269SolTraLin = T00BG3_A3269SolTraLin[0] ;
         A3270SolTraObs = T00BG3_A3270SolTraObs[0] ;
         n3270SolTraObs = T00BG3_n3270SolTraObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3253SolTraCod = A3253SolTraCod ;
         Z3269SolTraLin = A3269SolTraLin ;
         sMode472 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalBG472( ) ;
         loadBG472( ) ;
         Gx_mode = sMode472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound472 = (short)(0) ;
         initializeNonKeyBG472( ) ;
         sMode472 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalBG472( ) ;
         Gx_mode = sMode472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesBG472( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyBG472( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00BG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod), Byte.valueOf(A3269SolTraLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLTRASP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3270SolTraObs, T00BG2_A3270SolTraObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3270SolTraObs, T00BG2_A3270SolTraObs[0]) != 0 )
            {
               GXutil.writeLogln("ttraspi:[seudo value changed for attri]"+"SolTraObs");
               GXutil.writeLogRaw("Old: ",Z3270SolTraObs);
               GXutil.writeLogRaw("Current: ",T00BG2_A3270SolTraObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLTRASP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertBG472( )
   {
      beforeValidateBG472( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBG472( ) ;
      }
      if ( AnyError == 0 )
      {
         zmBG472( 0) ;
         checkOptimisticConcurrencyBG472( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmBG472( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertBG472( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BG24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A3253SolTraCod), Byte.valueOf(A3269SolTraLin), Boolean.valueOf(n3270SolTraObs), A3270SolTraObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLTRASP");
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
            loadBG472( ) ;
         }
         endLevelBG472( ) ;
      }
      closeExtendedTableCursorsBG472( ) ;
   }

   public void updateBG472( )
   {
      beforeValidateBG472( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBG472( ) ;
      }
      if ( ( nIsMod_472 != 0 ) || ( nIsDirty_472 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyBG472( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmBG472( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateBG472( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00BG25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n3270SolTraObs), A3270SolTraObs, A396EmprCod, Integer.valueOf(A3253SolTraCod), Byte.valueOf(A3269SolTraLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLTRASP");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLTRASP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateBG472( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyBG472( ) ;
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
            endLevelBG472( ) ;
         }
      }
      closeExtendedTableCursorsBG472( ) ;
   }

   public void deferredUpdateBG472( )
   {
   }

   public void deleteBG472( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateBG472( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyBG472( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsBG472( ) ;
         afterConfirmBG472( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteBG472( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00BG26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod), Byte.valueOf(A3269SolTraLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLTRASP");
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
      sMode472 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelBG472( ) ;
      Gx_mode = sMode472 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsBG472( )
   {
      standaloneModalBG472( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelBG472( )
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

   public void scanStartBG472( )
   {
      /* Scan By routine */
      /* Using cursor T00BG27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A3253SolTraCod)});
      RcdFound472 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound472 = (short)(1) ;
         A3269SolTraLin = T00BG27_A3269SolTraLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextBG472( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound472 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound472 = (short)(1) ;
         A3269SolTraLin = T00BG27_A3269SolTraLin[0] ;
      }
   }

   public void scanEndBG472( )
   {
      pr_default.close(25);
   }

   public void afterConfirmBG472( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertBG472( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateBG472( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteBG472( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteBG472( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateBG472( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesBG472( )
   {
      edtSolTraLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraLin_Enabled), 5, 0), !bGXsfl_340_Refreshing);
      edtSolTraObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraObs_Enabled), 5, 0), !bGXsfl_340_Refreshing);
   }

   public void send_integrity_lvl_hashesBG472( )
   {
   }

   public void send_integrity_lvl_hashesBG471( )
   {
   }

   public void subsflControlProps_340472( )
   {
      edtavnRcdDeleted_472_Internalname = "vNRCDDELETED_472_"+sGXsfl_340_idx ;
      edtSolTraLin_Internalname = "SOLTRALIN_"+sGXsfl_340_idx ;
      edtSolTraObs_Internalname = "SOLTRAOBS_"+sGXsfl_340_idx ;
   }

   public void subsflControlProps_fel_340472( )
   {
      edtavnRcdDeleted_472_Internalname = "vNRCDDELETED_472_"+sGXsfl_340_fel_idx ;
      edtSolTraLin_Internalname = "SOLTRALIN_"+sGXsfl_340_fel_idx ;
      edtSolTraObs_Internalname = "SOLTRAOBS_"+sGXsfl_340_fel_idx ;
   }

   public void addRowBG472( )
   {
      nGXsfl_340_idx = (int)(nGXsfl_340_idx+1) ;
      sGXsfl_340_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_340_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_340472( ) ;
      sendRowBG472( ) ;
   }

   public void sendRowBG472( )
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
         if ( ((int)((nGXsfl_340_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_472_" + sGXsfl_340_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 341,'',false,'" + sGXsfl_340_idx + "',340)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_472_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_472_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_472), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_472), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,341);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_472_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_472_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(340),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_472_" + sGXsfl_340_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 342,'',false,'" + sGXsfl_340_idx + "',340)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolTraLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3269SolTraLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3269SolTraLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,342);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolTraLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolTraLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(340),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_472_" + sGXsfl_340_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 343,'',false,'" + sGXsfl_340_idx + "',340)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolTraObs_Internalname,GXutil.rtrim( A3270SolTraObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,343);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolTraObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolTraObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(340),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesBG472( ) ;
      GXCCtl = "Z3269SolTraLin_" + sGXsfl_340_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3269SolTraLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3270SolTraObs_" + sGXsfl_340_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3270SolTraObs));
      GXCCtl = "nRcdDeleted_472_" + sGXsfl_340_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_472_" + sGXsfl_340_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_472_" + sGXsfl_340_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_472_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_472_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLTRALIN_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolTraLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLTRAOBS_"+sGXsfl_340_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolTraObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowBG472( )
   {
      nGXsfl_340_idx = (int)(nGXsfl_340_idx+1) ;
      sGXsfl_340_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_340_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_340472( ) ;
      edtavnRcdDeleted_472_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_472_"+sGXsfl_340_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolTraLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLTRALIN_"+sGXsfl_340_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolTraObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLTRAOBS_"+sGXsfl_340_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_472_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_472_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_472");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_472_Internalname ;
         wbErr = true ;
         nRcdDeleted_472 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_472 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_472_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolTraLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "SOLTRALIN_" + sGXsfl_340_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolTraLin_Internalname ;
         wbErr = true ;
         A3269SolTraLin = (byte)(0) ;
      }
      else
      {
         A3269SolTraLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolTraLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3270SolTraObs = httpContext.cgiGet( edtSolTraObs_Internalname) ;
      n3270SolTraObs = false ;
      GXCCtl = "Z3269SolTraLin_" + sGXsfl_340_idx ;
      Z3269SolTraLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3270SolTraObs_" + sGXsfl_340_idx ;
      Z3270SolTraObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_472_" + sGXsfl_340_idx ;
      nRcdDeleted_472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_472_" + sGXsfl_340_idx ;
      nRcdExists_472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_472_" + sGXsfl_340_idx ;
      nIsMod_472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtSolTraLin_Enabled = edtSolTraLin_Enabled ;
   }

   public void confirmValuesBG0( )
   {
      nGXsfl_340_idx = 0 ;
      sGXsfl_340_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_340_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_340472( ) ;
      while ( nGXsfl_340_idx < nRC_GXsfl_340 )
      {
         nGXsfl_340_idx = (int)(nGXsfl_340_idx+1) ;
         sGXsfl_340_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_340_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_340472( ) ;
         httpContext.changePostValue( "Z3269SolTraLin_"+sGXsfl_340_idx, httpContext.cgiGet( "ZT_"+"Z3269SolTraLin_"+sGXsfl_340_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3269SolTraLin_"+sGXsfl_340_idx) ;
         httpContext.changePostValue( "Z3270SolTraObs_"+sGXsfl_340_idx, httpContext.cgiGet( "ZT_"+"Z3270SolTraObs_"+sGXsfl_340_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3270SolTraObs_"+sGXsfl_340_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttraspi", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3253SolTraCod", GXutil.ltrim( localUtil.ntoc( Z3253SolTraCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3254SolTraMat", GXutil.rtrim( Z3254SolTraMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3255SolTraSer", GXutil.rtrim( Z3255SolTraSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3256SolTraTip", GXutil.ltrim( localUtil.ntoc( Z3256SolTraTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3257SolTraDisN", GXutil.rtrim( Z3257SolTraDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3258SolTraNom", GXutil.rtrim( Z3258SolTraNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3259SolTraNum", GXutil.ltrim( localUtil.ntoc( Z3259SolTraNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3260SolTraFec", localUtil.dtoc( Z3260SolTraFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3261SolTraCliC", GXutil.ltrim( localUtil.ntoc( Z3261SolTraCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3262SolTraCliN", GXutil.rtrim( Z3262SolTraCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3263SolTraAc", GXutil.rtrim( Z3263SolTraAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3264SolTraMa", GXutil.rtrim( Z3264SolTraMa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3265SolTraNor", GXutil.rtrim( Z3265SolTraNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3266SolTraMaq", GXutil.rtrim( Z3266SolTraMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3267SolTraRef", GXutil.rtrim( Z3267SolTraRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3268SolTraUlin", GXutil.ltrim( localUtil.ntoc( Z3268SolTraUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3759SolAciTac", GXutil.rtrim( Z3759SolAciTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3760SolAciCo", GXutil.rtrim( Z3760SolAciCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3761SolAciPa6", GXutil.rtrim( Z3761SolAciPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3762SolAciPes", GXutil.rtrim( Z3762SolAciPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3763SolAciPac", GXutil.rtrim( Z3763SolAciPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3764SolAciWo", GXutil.rtrim( Z3764SolAciWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3765SolAciNorm", GXutil.rtrim( Z3765SolAciNorm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3766SolAlcTac", GXutil.rtrim( Z3766SolAlcTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3767SolAlcCo", GXutil.rtrim( Z3767SolAlcCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3768SolAlcPa6", GXutil.rtrim( Z3768SolAlcPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3769SolAlcPes", GXutil.rtrim( Z3769SolAlcPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3770SolAlcPac", GXutil.rtrim( Z3770SolAlcPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3771SolAlcWo", GXutil.rtrim( Z3771SolAlcWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3772SolAlcNorm", GXutil.rtrim( Z3772SolAlcNorm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3773SolAquTac", GXutil.rtrim( Z3773SolAquTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3774SolAquCo", GXutil.rtrim( Z3774SolAquCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3775SolAquPa6", GXutil.rtrim( Z3775SolAquPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3776SolAquPes", GXutil.rtrim( Z3776SolAquPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3777SolAquPac", GXutil.rtrim( Z3777SolAquPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3778SolAquWo", GXutil.rtrim( Z3778SolAquWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3779SolAquNorm", GXutil.rtrim( Z3779SolAquNorm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4025SolTraAcAl", GXutil.rtrim( Z4025SolTraAcAl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4026SolTraMaAl", GXutil.rtrim( Z4026SolTraMaAl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4027SolTraAcAc", GXutil.rtrim( Z4027SolTraAcAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4028SolTraMaAc", GXutil.rtrim( Z4028SolTraMaAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4029SolTraAcAq", GXutil.rtrim( Z4029SolTraAcAq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4030SolTraMaAq", GXutil.rtrim( Z4030SolTraMaAq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4381SolTraCoAq", GXutil.rtrim( Z4381SolTraCoAq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4382SolTraCoAc", GXutil.rtrim( Z4382SolTraCoAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4383SolTraCoAl", GXutil.rtrim( Z4383SolTraCoAl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4952SolMarTac", GXutil.rtrim( Z4952SolMarTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4953SolMarCo", GXutil.rtrim( Z4953SolMarCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4954SolMarPa6", GXutil.rtrim( Z4954SolMarPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4955SolMarPes", GXutil.rtrim( Z4955SolMarPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4956SolMarPac", GXutil.rtrim( Z4956SolMarPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4957SolMarWo", GXutil.rtrim( Z4957SolMarWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4958SolMarNorm", GXutil.rtrim( Z4958SolMarNorm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4959SolTraCoMa", GXutil.rtrim( Z4959SolTraCoMa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11796SolRqMn", GXutil.rtrim( Z11796SolRqMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11797SolRqMnSt", GXutil.ltrim( localUtil.ntoc( Z11797SolRqMnSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11926SolMetodo", GXutil.rtrim( Z11926SolMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_340", GXutil.ltrim( localUtil.ntoc( nGXsfl_340_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttraspi", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTRASPI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TEST DE TRANSPIRACION/AGUA", "") ;
   }

   public void initializeNonKeyBG471( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A3254SolTraMat = "" ;
      n3254SolTraMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3254SolTraMat", A3254SolTraMat);
      A3255SolTraSer = "" ;
      n3255SolTraSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3255SolTraSer", A3255SolTraSer);
      A3256SolTraTip = (short)(0) ;
      n3256SolTraTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3256SolTraTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3256SolTraTip), 4, 0));
      A3257SolTraDisN = "" ;
      n3257SolTraDisN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3257SolTraDisN", A3257SolTraDisN);
      A3258SolTraNom = "" ;
      n3258SolTraNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3258SolTraNom", A3258SolTraNom);
      A3259SolTraNum = 0 ;
      n3259SolTraNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3259SolTraNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3259SolTraNum), 6, 0));
      A3260SolTraFec = GXutil.nullDate() ;
      n3260SolTraFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3260SolTraFec", localUtil.format(A3260SolTraFec, "99/99/99"));
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A3261SolTraCliC = 0 ;
      n3261SolTraCliC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3261SolTraCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3261SolTraCliC), 6, 0));
      A3262SolTraCliN = "" ;
      n3262SolTraCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3262SolTraCliN", A3262SolTraCliN);
      A3263SolTraAc = "" ;
      n3263SolTraAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3263SolTraAc", A3263SolTraAc);
      A3264SolTraMa = "" ;
      n3264SolTraMa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3264SolTraMa", A3264SolTraMa);
      A3265SolTraNor = "" ;
      n3265SolTraNor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3265SolTraNor", A3265SolTraNor);
      A3266SolTraMaq = "" ;
      n3266SolTraMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3266SolTraMaq", A3266SolTraMaq);
      A3267SolTraRef = "" ;
      n3267SolTraRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3267SolTraRef", A3267SolTraRef);
      A3268SolTraUlin = (byte)(0) ;
      n3268SolTraUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3268SolTraUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3268SolTraUlin), 2, 0));
      A3759SolAciTac = "" ;
      n3759SolAciTac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3759SolAciTac", A3759SolAciTac);
      A3760SolAciCo = "" ;
      n3760SolAciCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3760SolAciCo", A3760SolAciCo);
      A3761SolAciPa6 = "" ;
      n3761SolAciPa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3761SolAciPa6", A3761SolAciPa6);
      A3762SolAciPes = "" ;
      n3762SolAciPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3762SolAciPes", A3762SolAciPes);
      A3763SolAciPac = "" ;
      n3763SolAciPac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3763SolAciPac", A3763SolAciPac);
      A3764SolAciWo = "" ;
      n3764SolAciWo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3764SolAciWo", A3764SolAciWo);
      A3765SolAciNorm = "" ;
      n3765SolAciNorm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3765SolAciNorm", A3765SolAciNorm);
      A3766SolAlcTac = "" ;
      n3766SolAlcTac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3766SolAlcTac", A3766SolAlcTac);
      A3767SolAlcCo = "" ;
      n3767SolAlcCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3767SolAlcCo", A3767SolAlcCo);
      A3768SolAlcPa6 = "" ;
      n3768SolAlcPa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3768SolAlcPa6", A3768SolAlcPa6);
      A3769SolAlcPes = "" ;
      n3769SolAlcPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3769SolAlcPes", A3769SolAlcPes);
      A3770SolAlcPac = "" ;
      n3770SolAlcPac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3770SolAlcPac", A3770SolAlcPac);
      A3771SolAlcWo = "" ;
      n3771SolAlcWo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3771SolAlcWo", A3771SolAlcWo);
      A3772SolAlcNorm = "" ;
      n3772SolAlcNorm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3772SolAlcNorm", A3772SolAlcNorm);
      A3773SolAquTac = "" ;
      n3773SolAquTac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3773SolAquTac", A3773SolAquTac);
      A3774SolAquCo = "" ;
      n3774SolAquCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3774SolAquCo", A3774SolAquCo);
      A3775SolAquPa6 = "" ;
      n3775SolAquPa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3775SolAquPa6", A3775SolAquPa6);
      A3776SolAquPes = "" ;
      n3776SolAquPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3776SolAquPes", A3776SolAquPes);
      A3777SolAquPac = "" ;
      n3777SolAquPac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3777SolAquPac", A3777SolAquPac);
      A3778SolAquWo = "" ;
      n3778SolAquWo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3778SolAquWo", A3778SolAquWo);
      A3779SolAquNorm = "" ;
      n3779SolAquNorm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3779SolAquNorm", A3779SolAquNorm);
      A4025SolTraAcAl = "" ;
      n4025SolTraAcAl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4025SolTraAcAl", A4025SolTraAcAl);
      A4026SolTraMaAl = "" ;
      n4026SolTraMaAl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4026SolTraMaAl", A4026SolTraMaAl);
      A4027SolTraAcAc = "" ;
      n4027SolTraAcAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4027SolTraAcAc", A4027SolTraAcAc);
      A4028SolTraMaAc = "" ;
      n4028SolTraMaAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4028SolTraMaAc", A4028SolTraMaAc);
      A4029SolTraAcAq = "" ;
      n4029SolTraAcAq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4029SolTraAcAq", A4029SolTraAcAq);
      A4030SolTraMaAq = "" ;
      n4030SolTraMaAq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4030SolTraMaAq", A4030SolTraMaAq);
      A4381SolTraCoAq = "" ;
      n4381SolTraCoAq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4381SolTraCoAq", A4381SolTraCoAq);
      A4382SolTraCoAc = "" ;
      n4382SolTraCoAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4382SolTraCoAc", A4382SolTraCoAc);
      A4383SolTraCoAl = "" ;
      n4383SolTraCoAl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4383SolTraCoAl", A4383SolTraCoAl);
      A4952SolMarTac = "" ;
      n4952SolMarTac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4952SolMarTac", A4952SolMarTac);
      A4953SolMarCo = "" ;
      n4953SolMarCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4953SolMarCo", A4953SolMarCo);
      A4954SolMarPa6 = "" ;
      n4954SolMarPa6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4954SolMarPa6", A4954SolMarPa6);
      A4955SolMarPes = "" ;
      n4955SolMarPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4955SolMarPes", A4955SolMarPes);
      A4956SolMarPac = "" ;
      n4956SolMarPac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4956SolMarPac", A4956SolMarPac);
      A4957SolMarWo = "" ;
      n4957SolMarWo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4957SolMarWo", A4957SolMarWo);
      A4958SolMarNorm = "" ;
      n4958SolMarNorm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4958SolMarNorm", A4958SolMarNorm);
      A4959SolTraCoMa = "" ;
      n4959SolTraCoMa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4959SolTraCoMa", A4959SolTraCoMa);
      A11796SolRqMn = "" ;
      n11796SolRqMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11796SolRqMn", A11796SolRqMn);
      A11797SolRqMnSt = (byte)(0) ;
      n11797SolRqMnSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11797SolRqMnSt", GXutil.str( A11797SolRqMnSt, 1, 0));
      A11926SolMetodo = "" ;
      n11926SolMetodo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11926SolMetodo", A11926SolMetodo);
      Z3254SolTraMat = "" ;
      Z3255SolTraSer = "" ;
      Z3256SolTraTip = (short)(0) ;
      Z3257SolTraDisN = "" ;
      Z3258SolTraNom = "" ;
      Z3259SolTraNum = 0 ;
      Z3260SolTraFec = GXutil.nullDate() ;
      Z3261SolTraCliC = 0 ;
      Z3262SolTraCliN = "" ;
      Z3263SolTraAc = "" ;
      Z3264SolTraMa = "" ;
      Z3265SolTraNor = "" ;
      Z3266SolTraMaq = "" ;
      Z3267SolTraRef = "" ;
      Z3268SolTraUlin = (byte)(0) ;
      Z3759SolAciTac = "" ;
      Z3760SolAciCo = "" ;
      Z3761SolAciPa6 = "" ;
      Z3762SolAciPes = "" ;
      Z3763SolAciPac = "" ;
      Z3764SolAciWo = "" ;
      Z3765SolAciNorm = "" ;
      Z3766SolAlcTac = "" ;
      Z3767SolAlcCo = "" ;
      Z3768SolAlcPa6 = "" ;
      Z3769SolAlcPes = "" ;
      Z3770SolAlcPac = "" ;
      Z3771SolAlcWo = "" ;
      Z3772SolAlcNorm = "" ;
      Z3773SolAquTac = "" ;
      Z3774SolAquCo = "" ;
      Z3775SolAquPa6 = "" ;
      Z3776SolAquPes = "" ;
      Z3777SolAquPac = "" ;
      Z3778SolAquWo = "" ;
      Z3779SolAquNorm = "" ;
      Z4025SolTraAcAl = "" ;
      Z4026SolTraMaAl = "" ;
      Z4027SolTraAcAc = "" ;
      Z4028SolTraMaAc = "" ;
      Z4029SolTraAcAq = "" ;
      Z4030SolTraMaAq = "" ;
      Z4381SolTraCoAq = "" ;
      Z4382SolTraCoAc = "" ;
      Z4383SolTraCoAl = "" ;
      Z4952SolMarTac = "" ;
      Z4953SolMarCo = "" ;
      Z4954SolMarPa6 = "" ;
      Z4955SolMarPes = "" ;
      Z4956SolMarPac = "" ;
      Z4957SolMarWo = "" ;
      Z4958SolMarNorm = "" ;
      Z4959SolTraCoMa = "" ;
      Z11796SolRqMn = "" ;
      Z11797SolRqMnSt = (byte)(0) ;
      Z11926SolMetodo = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAllBG471( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A3253SolTraCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3253SolTraCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3253SolTraCod), 8, 0));
      initializeNonKeyBG471( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyBG472( )
   {
      A3270SolTraObs = "" ;
      n3270SolTraObs = false ;
      Z3270SolTraObs = "" ;
   }

   public void initAllBG472( )
   {
      A3269SolTraLin = (byte)(0) ;
      initializeNonKeyBG472( ) ;
   }

   public void standaloneModalInsertBG472( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513579", true, true);
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
      httpContext.AddJavascriptSource("ttraspi.js", "?20268241513579", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties472( )
   {
      edtSolTraLin_Enabled = defedtSolTraLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolTraLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolTraLin_Enabled), 5, 0), !bGXsfl_340_Refreshing);
   }

   public void startgridcontrol340( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_472, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_472_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3269SolTraLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolTraLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3270SolTraObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolTraObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSolTraCod_Internalname = "SOLTRACOD" ;
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
      edtSolTraMat_Internalname = "SOLTRAMAT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSolTraSer_Internalname = "SOLTRASER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSolTraTip_Internalname = "SOLTRATIP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSolTraDisN_Internalname = "SOLTRADISN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSolTraNom_Internalname = "SOLTRANOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtSolTraNum_Internalname = "SOLTRANUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtSolTraFec_Internalname = "SOLTRAFEC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtSolTraCliC_Internalname = "SOLTRACLIC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtSolTraCliN_Internalname = "SOLTRACLIN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtSolTraAc_Internalname = "SOLTRAAC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtSolTraMa_Internalname = "SOLTRAMA" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtSolTraNor_Internalname = "SOLTRANOR" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtSolTraMaq_Internalname = "SOLTRAMAQ" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtSolTraRef_Internalname = "SOLTRAREF" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtSolTraUlin_Internalname = "SOLTRAULIN" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtSolAciTac_Internalname = "SOLACITAC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtSolAciCo_Internalname = "SOLACICO" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtSolAciPa6_Internalname = "SOLACIPA6" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtSolAciPes_Internalname = "SOLACIPES" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtSolAciPac_Internalname = "SOLACIPAC" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtSolAciWo_Internalname = "SOLACIWO" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtSolAciNorm_Internalname = "SOLACINORM" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtSolAlcTac_Internalname = "SOLALCTAC" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtSolAlcCo_Internalname = "SOLALCCO" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtSolAlcPa6_Internalname = "SOLALCPA6" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtSolAlcPes_Internalname = "SOLALCPES" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtSolAlcPac_Internalname = "SOLALCPAC" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtSolAlcWo_Internalname = "SOLALCWO" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtSolAlcNorm_Internalname = "SOLALCNORM" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtSolAquTac_Internalname = "SOLAQUTAC" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtSolAquCo_Internalname = "SOLAQUCO" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtSolAquPa6_Internalname = "SOLAQUPA6" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtSolAquPes_Internalname = "SOLAQUPES" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtSolAquPac_Internalname = "SOLAQUPAC" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtSolAquWo_Internalname = "SOLAQUWO" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtSolAquNorm_Internalname = "SOLAQUNORM" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtSolTraAcAl_Internalname = "SOLTRAACAL" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtSolTraMaAl_Internalname = "SOLTRAMAAL" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtSolTraAcAc_Internalname = "SOLTRAACAC" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtSolTraMaAc_Internalname = "SOLTRAMAAC" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtSolTraAcAq_Internalname = "SOLTRAACAQ" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtSolTraMaAq_Internalname = "SOLTRAMAAQ" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtSolTraCoAq_Internalname = "SOLTRACOAQ" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtSolTraCoAc_Internalname = "SOLTRACOAC" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtSolTraCoAl_Internalname = "SOLTRACOAL" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtSolMarTac_Internalname = "SOLMARTAC" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtSolMarCo_Internalname = "SOLMARCO" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtSolMarPa6_Internalname = "SOLMARPA6" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtSolMarPes_Internalname = "SOLMARPES" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtSolMarPac_Internalname = "SOLMARPAC" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtSolMarWo_Internalname = "SOLMARWO" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtSolMarNorm_Internalname = "SOLMARNORM" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtSolTraCoMa_Internalname = "SOLTRACOMA" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtSolRqMn_Internalname = "SOLRQMN" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtSolRqMnSt_Internalname = "SOLRQMNST" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtSolMetodo_Internalname = "SOLMETODO" ;
      edtavnRcdDeleted_472_Internalname = "vNRCDDELETED_472" ;
      edtSolTraLin_Internalname = "SOLTRALIN" ;
      edtSolTraObs_Internalname = "SOLTRAOBS" ;
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
      Form.setCaption( httpContext.getMessage( "TEST DE TRANSPIRACION/AGUA", "") );
      edtSolTraObs_Jsonclick = "" ;
      edtSolTraLin_Jsonclick = "" ;
      edtavnRcdDeleted_472_Jsonclick = "" ;
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
      edtSolTraObs_Enabled = 1 ;
      edtSolTraLin_Enabled = 1 ;
      edtavnRcdDeleted_472_Enabled = 1 ;
      edtSolMetodo_Jsonclick = "" ;
      edtSolMetodo_Backcolor = (int)(0xFFFFFF) ;
      edtSolMetodo_Enabled = 1 ;
      edtSolRqMnSt_Jsonclick = "" ;
      edtSolRqMnSt_Backcolor = (int)(0xFFFFFF) ;
      edtSolRqMnSt_Enabled = 1 ;
      edtSolRqMn_Jsonclick = "" ;
      edtSolRqMn_Backcolor = (int)(0xFFFFFF) ;
      edtSolRqMn_Enabled = 1 ;
      edtSolTraCoMa_Jsonclick = "" ;
      edtSolTraCoMa_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraCoMa_Enabled = 1 ;
      edtSolMarNorm_Jsonclick = "" ;
      edtSolMarNorm_Backcolor = (int)(0xFFFFFF) ;
      edtSolMarNorm_Enabled = 1 ;
      edtSolMarWo_Jsonclick = "" ;
      edtSolMarWo_Backcolor = (int)(0xFFFFFF) ;
      edtSolMarWo_Enabled = 1 ;
      edtSolMarPac_Jsonclick = "" ;
      edtSolMarPac_Backcolor = (int)(0xFFFFFF) ;
      edtSolMarPac_Enabled = 1 ;
      edtSolMarPes_Jsonclick = "" ;
      edtSolMarPes_Backcolor = (int)(0xFFFFFF) ;
      edtSolMarPes_Enabled = 1 ;
      edtSolMarPa6_Jsonclick = "" ;
      edtSolMarPa6_Backcolor = (int)(0xFFFFFF) ;
      edtSolMarPa6_Enabled = 1 ;
      edtSolMarCo_Jsonclick = "" ;
      edtSolMarCo_Backcolor = (int)(0xFFFFFF) ;
      edtSolMarCo_Enabled = 1 ;
      edtSolMarTac_Jsonclick = "" ;
      edtSolMarTac_Backcolor = (int)(0xFFFFFF) ;
      edtSolMarTac_Enabled = 1 ;
      edtSolTraCoAl_Jsonclick = "" ;
      edtSolTraCoAl_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraCoAl_Enabled = 1 ;
      edtSolTraCoAc_Jsonclick = "" ;
      edtSolTraCoAc_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraCoAc_Enabled = 1 ;
      edtSolTraCoAq_Jsonclick = "" ;
      edtSolTraCoAq_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraCoAq_Enabled = 1 ;
      edtSolTraMaAq_Jsonclick = "" ;
      edtSolTraMaAq_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraMaAq_Enabled = 1 ;
      edtSolTraAcAq_Jsonclick = "" ;
      edtSolTraAcAq_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraAcAq_Enabled = 1 ;
      edtSolTraMaAc_Jsonclick = "" ;
      edtSolTraMaAc_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraMaAc_Enabled = 1 ;
      edtSolTraAcAc_Jsonclick = "" ;
      edtSolTraAcAc_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraAcAc_Enabled = 1 ;
      edtSolTraMaAl_Jsonclick = "" ;
      edtSolTraMaAl_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraMaAl_Enabled = 1 ;
      edtSolTraAcAl_Jsonclick = "" ;
      edtSolTraAcAl_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraAcAl_Enabled = 1 ;
      edtSolAquNorm_Jsonclick = "" ;
      edtSolAquNorm_Backcolor = (int)(0xFFFFFF) ;
      edtSolAquNorm_Enabled = 1 ;
      edtSolAquWo_Jsonclick = "" ;
      edtSolAquWo_Backcolor = (int)(0xFFFFFF) ;
      edtSolAquWo_Enabled = 1 ;
      edtSolAquPac_Jsonclick = "" ;
      edtSolAquPac_Backcolor = (int)(0xFFFFFF) ;
      edtSolAquPac_Enabled = 1 ;
      edtSolAquPes_Jsonclick = "" ;
      edtSolAquPes_Backcolor = (int)(0xFFFFFF) ;
      edtSolAquPes_Enabled = 1 ;
      edtSolAquPa6_Jsonclick = "" ;
      edtSolAquPa6_Backcolor = (int)(0xFFFFFF) ;
      edtSolAquPa6_Enabled = 1 ;
      edtSolAquCo_Jsonclick = "" ;
      edtSolAquCo_Backcolor = (int)(0xFFFFFF) ;
      edtSolAquCo_Enabled = 1 ;
      edtSolAquTac_Jsonclick = "" ;
      edtSolAquTac_Backcolor = (int)(0xFFFFFF) ;
      edtSolAquTac_Enabled = 1 ;
      edtSolAlcNorm_Jsonclick = "" ;
      edtSolAlcNorm_Backcolor = (int)(0xFFFFFF) ;
      edtSolAlcNorm_Enabled = 1 ;
      edtSolAlcWo_Jsonclick = "" ;
      edtSolAlcWo_Backcolor = (int)(0xFFFFFF) ;
      edtSolAlcWo_Enabled = 1 ;
      edtSolAlcPac_Jsonclick = "" ;
      edtSolAlcPac_Backcolor = (int)(0xFFFFFF) ;
      edtSolAlcPac_Enabled = 1 ;
      edtSolAlcPes_Jsonclick = "" ;
      edtSolAlcPes_Backcolor = (int)(0xFFFFFF) ;
      edtSolAlcPes_Enabled = 1 ;
      edtSolAlcPa6_Jsonclick = "" ;
      edtSolAlcPa6_Backcolor = (int)(0xFFFFFF) ;
      edtSolAlcPa6_Enabled = 1 ;
      edtSolAlcCo_Jsonclick = "" ;
      edtSolAlcCo_Backcolor = (int)(0xFFFFFF) ;
      edtSolAlcCo_Enabled = 1 ;
      edtSolAlcTac_Jsonclick = "" ;
      edtSolAlcTac_Backcolor = (int)(0xFFFFFF) ;
      edtSolAlcTac_Enabled = 1 ;
      edtSolAciNorm_Jsonclick = "" ;
      edtSolAciNorm_Backcolor = (int)(0xFFFFFF) ;
      edtSolAciNorm_Enabled = 1 ;
      edtSolAciWo_Jsonclick = "" ;
      edtSolAciWo_Backcolor = (int)(0xFFFFFF) ;
      edtSolAciWo_Enabled = 1 ;
      edtSolAciPac_Jsonclick = "" ;
      edtSolAciPac_Backcolor = (int)(0xFFFFFF) ;
      edtSolAciPac_Enabled = 1 ;
      edtSolAciPes_Jsonclick = "" ;
      edtSolAciPes_Backcolor = (int)(0xFFFFFF) ;
      edtSolAciPes_Enabled = 1 ;
      edtSolAciPa6_Jsonclick = "" ;
      edtSolAciPa6_Backcolor = (int)(0xFFFFFF) ;
      edtSolAciPa6_Enabled = 1 ;
      edtSolAciCo_Jsonclick = "" ;
      edtSolAciCo_Backcolor = (int)(0xFFFFFF) ;
      edtSolAciCo_Enabled = 1 ;
      edtSolAciTac_Jsonclick = "" ;
      edtSolAciTac_Backcolor = (int)(0xFFFFFF) ;
      edtSolAciTac_Enabled = 1 ;
      edtSolTraUlin_Jsonclick = "" ;
      edtSolTraUlin_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraUlin_Enabled = 1 ;
      edtSolTraRef_Jsonclick = "" ;
      edtSolTraRef_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraRef_Enabled = 1 ;
      edtSolTraMaq_Jsonclick = "" ;
      edtSolTraMaq_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraMaq_Enabled = 1 ;
      edtSolTraNor_Jsonclick = "" ;
      edtSolTraNor_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraNor_Enabled = 1 ;
      edtSolTraMa_Jsonclick = "" ;
      edtSolTraMa_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraMa_Enabled = 1 ;
      edtSolTraAc_Jsonclick = "" ;
      edtSolTraAc_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraAc_Enabled = 1 ;
      edtSolTraCliN_Jsonclick = "" ;
      edtSolTraCliN_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraCliN_Enabled = 1 ;
      edtSolTraCliC_Jsonclick = "" ;
      edtSolTraCliC_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraCliC_Enabled = 1 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtSolTraFec_Jsonclick = "" ;
      edtSolTraFec_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraFec_Enabled = 1 ;
      edtSolTraNum_Jsonclick = "" ;
      edtSolTraNum_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraNum_Enabled = 1 ;
      edtSolTraNom_Jsonclick = "" ;
      edtSolTraNom_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraNom_Enabled = 1 ;
      edtSolTraDisN_Jsonclick = "" ;
      edtSolTraDisN_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraDisN_Enabled = 1 ;
      edtSolTraTip_Jsonclick = "" ;
      edtSolTraTip_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraTip_Enabled = 1 ;
      edtSolTraSer_Jsonclick = "" ;
      edtSolTraSer_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraSer_Enabled = 1 ;
      edtSolTraMat_Jsonclick = "" ;
      edtSolTraMat_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraMat_Enabled = 1 ;
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
      edtSolTraCod_Jsonclick = "" ;
      edtSolTraCod_Backcolor = (int)(0xFFFFFF) ;
      edtSolTraCod_Enabled = 1 ;
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
      subsflControlProps_340472( ) ;
      while ( nGXsfl_340_idx <= nRC_GXsfl_340 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalBG472( ) ;
         standaloneModalBG472( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowBG472( ) ;
         nGXsfl_340_idx = (int)(nGXsfl_340_idx+1) ;
         sGXsfl_340_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_340_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_340472( ) ;
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
      /* Using cursor T00BG19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00BG19_A407EmprNom[0] ;
      n407EmprNom = T00BG19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T00BG19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00BG19_A407EmprNom[0] ;
      n407EmprNom = T00BG19_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Soltracod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A3254SolTraMat", GXutil.rtrim( A3254SolTraMat));
      httpContext.ajax_rsp_assign_attri("", false, "A3255SolTraSer", GXutil.rtrim( A3255SolTraSer));
      httpContext.ajax_rsp_assign_attri("", false, "A3256SolTraTip", GXutil.ltrim( localUtil.ntoc( A3256SolTraTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3257SolTraDisN", GXutil.rtrim( A3257SolTraDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A3258SolTraNom", GXutil.rtrim( A3258SolTraNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3259SolTraNum", GXutil.ltrim( localUtil.ntoc( A3259SolTraNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3260SolTraFec", localUtil.format(A3260SolTraFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3261SolTraCliC", GXutil.ltrim( localUtil.ntoc( A3261SolTraCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3262SolTraCliN", GXutil.rtrim( A3262SolTraCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A3263SolTraAc", GXutil.rtrim( A3263SolTraAc));
      httpContext.ajax_rsp_assign_attri("", false, "A3264SolTraMa", GXutil.rtrim( A3264SolTraMa));
      httpContext.ajax_rsp_assign_attri("", false, "A3265SolTraNor", GXutil.rtrim( A3265SolTraNor));
      httpContext.ajax_rsp_assign_attri("", false, "A3266SolTraMaq", GXutil.rtrim( A3266SolTraMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A3267SolTraRef", GXutil.rtrim( A3267SolTraRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3268SolTraUlin", GXutil.ltrim( localUtil.ntoc( A3268SolTraUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3759SolAciTac", GXutil.rtrim( A3759SolAciTac));
      httpContext.ajax_rsp_assign_attri("", false, "A3760SolAciCo", GXutil.rtrim( A3760SolAciCo));
      httpContext.ajax_rsp_assign_attri("", false, "A3761SolAciPa6", GXutil.rtrim( A3761SolAciPa6));
      httpContext.ajax_rsp_assign_attri("", false, "A3762SolAciPes", GXutil.rtrim( A3762SolAciPes));
      httpContext.ajax_rsp_assign_attri("", false, "A3763SolAciPac", GXutil.rtrim( A3763SolAciPac));
      httpContext.ajax_rsp_assign_attri("", false, "A3764SolAciWo", GXutil.rtrim( A3764SolAciWo));
      httpContext.ajax_rsp_assign_attri("", false, "A3765SolAciNorm", GXutil.rtrim( A3765SolAciNorm));
      httpContext.ajax_rsp_assign_attri("", false, "A3766SolAlcTac", GXutil.rtrim( A3766SolAlcTac));
      httpContext.ajax_rsp_assign_attri("", false, "A3767SolAlcCo", GXutil.rtrim( A3767SolAlcCo));
      httpContext.ajax_rsp_assign_attri("", false, "A3768SolAlcPa6", GXutil.rtrim( A3768SolAlcPa6));
      httpContext.ajax_rsp_assign_attri("", false, "A3769SolAlcPes", GXutil.rtrim( A3769SolAlcPes));
      httpContext.ajax_rsp_assign_attri("", false, "A3770SolAlcPac", GXutil.rtrim( A3770SolAlcPac));
      httpContext.ajax_rsp_assign_attri("", false, "A3771SolAlcWo", GXutil.rtrim( A3771SolAlcWo));
      httpContext.ajax_rsp_assign_attri("", false, "A3772SolAlcNorm", GXutil.rtrim( A3772SolAlcNorm));
      httpContext.ajax_rsp_assign_attri("", false, "A3773SolAquTac", GXutil.rtrim( A3773SolAquTac));
      httpContext.ajax_rsp_assign_attri("", false, "A3774SolAquCo", GXutil.rtrim( A3774SolAquCo));
      httpContext.ajax_rsp_assign_attri("", false, "A3775SolAquPa6", GXutil.rtrim( A3775SolAquPa6));
      httpContext.ajax_rsp_assign_attri("", false, "A3776SolAquPes", GXutil.rtrim( A3776SolAquPes));
      httpContext.ajax_rsp_assign_attri("", false, "A3777SolAquPac", GXutil.rtrim( A3777SolAquPac));
      httpContext.ajax_rsp_assign_attri("", false, "A3778SolAquWo", GXutil.rtrim( A3778SolAquWo));
      httpContext.ajax_rsp_assign_attri("", false, "A3779SolAquNorm", GXutil.rtrim( A3779SolAquNorm));
      httpContext.ajax_rsp_assign_attri("", false, "A4025SolTraAcAl", GXutil.rtrim( A4025SolTraAcAl));
      httpContext.ajax_rsp_assign_attri("", false, "A4026SolTraMaAl", GXutil.rtrim( A4026SolTraMaAl));
      httpContext.ajax_rsp_assign_attri("", false, "A4027SolTraAcAc", GXutil.rtrim( A4027SolTraAcAc));
      httpContext.ajax_rsp_assign_attri("", false, "A4028SolTraMaAc", GXutil.rtrim( A4028SolTraMaAc));
      httpContext.ajax_rsp_assign_attri("", false, "A4029SolTraAcAq", GXutil.rtrim( A4029SolTraAcAq));
      httpContext.ajax_rsp_assign_attri("", false, "A4030SolTraMaAq", GXutil.rtrim( A4030SolTraMaAq));
      httpContext.ajax_rsp_assign_attri("", false, "A4381SolTraCoAq", GXutil.rtrim( A4381SolTraCoAq));
      httpContext.ajax_rsp_assign_attri("", false, "A4382SolTraCoAc", GXutil.rtrim( A4382SolTraCoAc));
      httpContext.ajax_rsp_assign_attri("", false, "A4383SolTraCoAl", GXutil.rtrim( A4383SolTraCoAl));
      httpContext.ajax_rsp_assign_attri("", false, "A4952SolMarTac", GXutil.rtrim( A4952SolMarTac));
      httpContext.ajax_rsp_assign_attri("", false, "A4953SolMarCo", GXutil.rtrim( A4953SolMarCo));
      httpContext.ajax_rsp_assign_attri("", false, "A4954SolMarPa6", GXutil.rtrim( A4954SolMarPa6));
      httpContext.ajax_rsp_assign_attri("", false, "A4955SolMarPes", GXutil.rtrim( A4955SolMarPes));
      httpContext.ajax_rsp_assign_attri("", false, "A4956SolMarPac", GXutil.rtrim( A4956SolMarPac));
      httpContext.ajax_rsp_assign_attri("", false, "A4957SolMarWo", GXutil.rtrim( A4957SolMarWo));
      httpContext.ajax_rsp_assign_attri("", false, "A4958SolMarNorm", GXutil.rtrim( A4958SolMarNorm));
      httpContext.ajax_rsp_assign_attri("", false, "A4959SolTraCoMa", GXutil.rtrim( A4959SolTraCoMa));
      httpContext.ajax_rsp_assign_attri("", false, "A11796SolRqMn", GXutil.rtrim( A11796SolRqMn));
      httpContext.ajax_rsp_assign_attri("", false, "A11797SolRqMnSt", GXutil.ltrim( localUtil.ntoc( A11797SolRqMnSt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11926SolMetodo", GXutil.rtrim( A11926SolMetodo));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3253SolTraCod", GXutil.ltrim( localUtil.ntoc( Z3253SolTraCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3254SolTraMat", GXutil.rtrim( Z3254SolTraMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3255SolTraSer", GXutil.rtrim( Z3255SolTraSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3256SolTraTip", GXutil.ltrim( localUtil.ntoc( Z3256SolTraTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3257SolTraDisN", GXutil.rtrim( Z3257SolTraDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3258SolTraNom", GXutil.rtrim( Z3258SolTraNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3259SolTraNum", GXutil.ltrim( localUtil.ntoc( Z3259SolTraNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3260SolTraFec", localUtil.format(Z3260SolTraFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3261SolTraCliC", GXutil.ltrim( localUtil.ntoc( Z3261SolTraCliC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3262SolTraCliN", GXutil.rtrim( Z3262SolTraCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3263SolTraAc", GXutil.rtrim( Z3263SolTraAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3264SolTraMa", GXutil.rtrim( Z3264SolTraMa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3265SolTraNor", GXutil.rtrim( Z3265SolTraNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3266SolTraMaq", GXutil.rtrim( Z3266SolTraMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3267SolTraRef", GXutil.rtrim( Z3267SolTraRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3268SolTraUlin", GXutil.ltrim( localUtil.ntoc( Z3268SolTraUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3759SolAciTac", GXutil.rtrim( Z3759SolAciTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3760SolAciCo", GXutil.rtrim( Z3760SolAciCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3761SolAciPa6", GXutil.rtrim( Z3761SolAciPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3762SolAciPes", GXutil.rtrim( Z3762SolAciPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3763SolAciPac", GXutil.rtrim( Z3763SolAciPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3764SolAciWo", GXutil.rtrim( Z3764SolAciWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3765SolAciNorm", GXutil.rtrim( Z3765SolAciNorm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3766SolAlcTac", GXutil.rtrim( Z3766SolAlcTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3767SolAlcCo", GXutil.rtrim( Z3767SolAlcCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3768SolAlcPa6", GXutil.rtrim( Z3768SolAlcPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3769SolAlcPes", GXutil.rtrim( Z3769SolAlcPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3770SolAlcPac", GXutil.rtrim( Z3770SolAlcPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3771SolAlcWo", GXutil.rtrim( Z3771SolAlcWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3772SolAlcNorm", GXutil.rtrim( Z3772SolAlcNorm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3773SolAquTac", GXutil.rtrim( Z3773SolAquTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3774SolAquCo", GXutil.rtrim( Z3774SolAquCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3775SolAquPa6", GXutil.rtrim( Z3775SolAquPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3776SolAquPes", GXutil.rtrim( Z3776SolAquPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3777SolAquPac", GXutil.rtrim( Z3777SolAquPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3778SolAquWo", GXutil.rtrim( Z3778SolAquWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3779SolAquNorm", GXutil.rtrim( Z3779SolAquNorm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4025SolTraAcAl", GXutil.rtrim( Z4025SolTraAcAl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4026SolTraMaAl", GXutil.rtrim( Z4026SolTraMaAl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4027SolTraAcAc", GXutil.rtrim( Z4027SolTraAcAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4028SolTraMaAc", GXutil.rtrim( Z4028SolTraMaAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4029SolTraAcAq", GXutil.rtrim( Z4029SolTraAcAq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4030SolTraMaAq", GXutil.rtrim( Z4030SolTraMaAq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4381SolTraCoAq", GXutil.rtrim( Z4381SolTraCoAq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4382SolTraCoAc", GXutil.rtrim( Z4382SolTraCoAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4383SolTraCoAl", GXutil.rtrim( Z4383SolTraCoAl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4952SolMarTac", GXutil.rtrim( Z4952SolMarTac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4953SolMarCo", GXutil.rtrim( Z4953SolMarCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4954SolMarPa6", GXutil.rtrim( Z4954SolMarPa6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4955SolMarPes", GXutil.rtrim( Z4955SolMarPes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4956SolMarPac", GXutil.rtrim( Z4956SolMarPac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4957SolMarWo", GXutil.rtrim( Z4957SolMarWo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4958SolMarNorm", GXutil.rtrim( Z4958SolMarNorm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4959SolTraCoMa", GXutil.rtrim( Z4959SolTraCoMa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11796SolRqMn", GXutil.rtrim( Z11796SolRqMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11797SolRqMnSt", GXutil.ltrim( localUtil.ntoc( Z11797SolRqMnSt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11926SolMetodo", GXutil.rtrim( Z11926SolMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
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
      /* Using cursor T00BG28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T00BG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A653OpeNom = T00BG20_A653OpeNom[0] ;
      n653OpeNom = T00BG20_n653OpeNom[0] ;
      pr_default.close(18);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_SOLTRACOD","{handler:'valid_Soltracod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3253SolTraCod',fld:'SOLTRACOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_SOLTRACOD",",oparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3254SolTraMat',fld:'SOLTRAMAT',pic:''},{av:'A3255SolTraSer',fld:'SOLTRASER',pic:''},{av:'A3256SolTraTip',fld:'SOLTRATIP',pic:'ZZZ9'},{av:'A3257SolTraDisN',fld:'SOLTRADISN',pic:''},{av:'A3258SolTraNom',fld:'SOLTRANOM',pic:''},{av:'A3259SolTraNum',fld:'SOLTRANUM',pic:'ZZZZZ9'},{av:'A3260SolTraFec',fld:'SOLTRAFEC',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A3261SolTraCliC',fld:'SOLTRACLIC',pic:'ZZZZZ9'},{av:'A3262SolTraCliN',fld:'SOLTRACLIN',pic:''},{av:'A3263SolTraAc',fld:'SOLTRAAC',pic:''},{av:'A3264SolTraMa',fld:'SOLTRAMA',pic:''},{av:'A3265SolTraNor',fld:'SOLTRANOR',pic:''},{av:'A3266SolTraMaq',fld:'SOLTRAMAQ',pic:''},{av:'A3267SolTraRef',fld:'SOLTRAREF',pic:''},{av:'A3268SolTraUlin',fld:'SOLTRAULIN',pic:'Z9'},{av:'A3759SolAciTac',fld:'SOLACITAC',pic:''},{av:'A3760SolAciCo',fld:'SOLACICO',pic:''},{av:'A3761SolAciPa6',fld:'SOLACIPA6',pic:''},{av:'A3762SolAciPes',fld:'SOLACIPES',pic:''},{av:'A3763SolAciPac',fld:'SOLACIPAC',pic:''},{av:'A3764SolAciWo',fld:'SOLACIWO',pic:''},{av:'A3765SolAciNorm',fld:'SOLACINORM',pic:''},{av:'A3766SolAlcTac',fld:'SOLALCTAC',pic:''},{av:'A3767SolAlcCo',fld:'SOLALCCO',pic:''},{av:'A3768SolAlcPa6',fld:'SOLALCPA6',pic:''},{av:'A3769SolAlcPes',fld:'SOLALCPES',pic:''},{av:'A3770SolAlcPac',fld:'SOLALCPAC',pic:''},{av:'A3771SolAlcWo',fld:'SOLALCWO',pic:''},{av:'A3772SolAlcNorm',fld:'SOLALCNORM',pic:''},{av:'A3773SolAquTac',fld:'SOLAQUTAC',pic:''},{av:'A3774SolAquCo',fld:'SOLAQUCO',pic:''},{av:'A3775SolAquPa6',fld:'SOLAQUPA6',pic:''},{av:'A3776SolAquPes',fld:'SOLAQUPES',pic:''},{av:'A3777SolAquPac',fld:'SOLAQUPAC',pic:''},{av:'A3778SolAquWo',fld:'SOLAQUWO',pic:''},{av:'A3779SolAquNorm',fld:'SOLAQUNORM',pic:''},{av:'A4025SolTraAcAl',fld:'SOLTRAACAL',pic:''},{av:'A4026SolTraMaAl',fld:'SOLTRAMAAL',pic:''},{av:'A4027SolTraAcAc',fld:'SOLTRAACAC',pic:''},{av:'A4028SolTraMaAc',fld:'SOLTRAMAAC',pic:''},{av:'A4029SolTraAcAq',fld:'SOLTRAACAQ',pic:''},{av:'A4030SolTraMaAq',fld:'SOLTRAMAAQ',pic:''},{av:'A4381SolTraCoAq',fld:'SOLTRACOAQ',pic:''},{av:'A4382SolTraCoAc',fld:'SOLTRACOAC',pic:''},{av:'A4383SolTraCoAl',fld:'SOLTRACOAL',pic:''},{av:'A4952SolMarTac',fld:'SOLMARTAC',pic:''},{av:'A4953SolMarCo',fld:'SOLMARCO',pic:''},{av:'A4954SolMarPa6',fld:'SOLMARPA6',pic:''},{av:'A4955SolMarPes',fld:'SOLMARPES',pic:''},{av:'A4956SolMarPac',fld:'SOLMARPAC',pic:''},{av:'A4957SolMarWo',fld:'SOLMARWO',pic:''},{av:'A4958SolMarNorm',fld:'SOLMARNORM',pic:''},{av:'A4959SolTraCoMa',fld:'SOLTRACOMA',pic:''},{av:'A11796SolRqMn',fld:'SOLRQMN',pic:''},{av:'A11797SolRqMnSt',fld:'SOLRQMNST',pic:'9'},{av:'A11926SolMetodo',fld:'SOLMETODO',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3253SolTraCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z3254SolTraMat'},{av:'Z3255SolTraSer'},{av:'Z3256SolTraTip'},{av:'Z3257SolTraDisN'},{av:'Z3258SolTraNom'},{av:'Z3259SolTraNum'},{av:'Z3260SolTraFec'},{av:'Z652OpeCod'},{av:'Z3261SolTraCliC'},{av:'Z3262SolTraCliN'},{av:'Z3263SolTraAc'},{av:'Z3264SolTraMa'},{av:'Z3265SolTraNor'},{av:'Z3266SolTraMaq'},{av:'Z3267SolTraRef'},{av:'Z3268SolTraUlin'},{av:'Z3759SolAciTac'},{av:'Z3760SolAciCo'},{av:'Z3761SolAciPa6'},{av:'Z3762SolAciPes'},{av:'Z3763SolAciPac'},{av:'Z3764SolAciWo'},{av:'Z3765SolAciNorm'},{av:'Z3766SolAlcTac'},{av:'Z3767SolAlcCo'},{av:'Z3768SolAlcPa6'},{av:'Z3769SolAlcPes'},{av:'Z3770SolAlcPac'},{av:'Z3771SolAlcWo'},{av:'Z3772SolAlcNorm'},{av:'Z3773SolAquTac'},{av:'Z3774SolAquCo'},{av:'Z3775SolAquPa6'},{av:'Z3776SolAquPes'},{av:'Z3777SolAquPac'},{av:'Z3778SolAquWo'},{av:'Z3779SolAquNorm'},{av:'Z4025SolTraAcAl'},{av:'Z4026SolTraMaAl'},{av:'Z4027SolTraAcAc'},{av:'Z4028SolTraMaAc'},{av:'Z4029SolTraAcAq'},{av:'Z4030SolTraMaAq'},{av:'Z4381SolTraCoAq'},{av:'Z4382SolTraCoAc'},{av:'Z4383SolTraCoAl'},{av:'Z4952SolMarTac'},{av:'Z4953SolMarCo'},{av:'Z4954SolMarPa6'},{av:'Z4955SolMarPes'},{av:'Z4956SolMarPac'},{av:'Z4957SolMarWo'},{av:'Z4958SolMarNorm'},{av:'Z4959SolTraCoMa'},{av:'Z11796SolRqMn'},{av:'Z11797SolRqMnSt'},{av:'Z11926SolMetodo'},{av:'Z407EmprNom'},{av:'Z653OpeNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_SOLTRALIN","{handler:'valid_Soltralin',iparms:[]");
      setEventMetadata("VALID_SOLTRALIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Soltraobs',iparms:[]");
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
      pr_default.close(26);
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z3254SolTraMat = "" ;
      Z3255SolTraSer = "" ;
      Z3257SolTraDisN = "" ;
      Z3258SolTraNom = "" ;
      Z3260SolTraFec = GXutil.nullDate() ;
      Z3262SolTraCliN = "" ;
      Z3263SolTraAc = "" ;
      Z3264SolTraMa = "" ;
      Z3265SolTraNor = "" ;
      Z3266SolTraMaq = "" ;
      Z3267SolTraRef = "" ;
      Z3759SolAciTac = "" ;
      Z3760SolAciCo = "" ;
      Z3761SolAciPa6 = "" ;
      Z3762SolAciPes = "" ;
      Z3763SolAciPac = "" ;
      Z3764SolAciWo = "" ;
      Z3765SolAciNorm = "" ;
      Z3766SolAlcTac = "" ;
      Z3767SolAlcCo = "" ;
      Z3768SolAlcPa6 = "" ;
      Z3769SolAlcPes = "" ;
      Z3770SolAlcPac = "" ;
      Z3771SolAlcWo = "" ;
      Z3772SolAlcNorm = "" ;
      Z3773SolAquTac = "" ;
      Z3774SolAquCo = "" ;
      Z3775SolAquPa6 = "" ;
      Z3776SolAquPes = "" ;
      Z3777SolAquPac = "" ;
      Z3778SolAquWo = "" ;
      Z3779SolAquNorm = "" ;
      Z4025SolTraAcAl = "" ;
      Z4026SolTraMaAl = "" ;
      Z4027SolTraAcAc = "" ;
      Z4028SolTraMaAc = "" ;
      Z4029SolTraAcAq = "" ;
      Z4030SolTraMaAq = "" ;
      Z4381SolTraCoAq = "" ;
      Z4382SolTraCoAc = "" ;
      Z4383SolTraCoAl = "" ;
      Z4952SolMarTac = "" ;
      Z4953SolMarCo = "" ;
      Z4954SolMarPa6 = "" ;
      Z4955SolMarPes = "" ;
      Z4956SolMarPac = "" ;
      Z4957SolMarWo = "" ;
      Z4958SolMarNorm = "" ;
      Z4959SolTraCoMa = "" ;
      Z11796SolRqMn = "" ;
      Z11926SolMetodo = "" ;
      Z130BarCodPar = "" ;
      Z3270SolTraObs = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A3254SolTraMat = "" ;
      lblTextblock8_Jsonclick = "" ;
      A3255SolTraSer = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3257SolTraDisN = "" ;
      lblTextblock11_Jsonclick = "" ;
      A3258SolTraNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A3260SolTraFec = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A3262SolTraCliN = "" ;
      lblTextblock18_Jsonclick = "" ;
      A3263SolTraAc = "" ;
      lblTextblock19_Jsonclick = "" ;
      A3264SolTraMa = "" ;
      lblTextblock20_Jsonclick = "" ;
      A3265SolTraNor = "" ;
      lblTextblock21_Jsonclick = "" ;
      A3266SolTraMaq = "" ;
      lblTextblock22_Jsonclick = "" ;
      A3267SolTraRef = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      A3759SolAciTac = "" ;
      lblTextblock25_Jsonclick = "" ;
      A3760SolAciCo = "" ;
      lblTextblock26_Jsonclick = "" ;
      A3761SolAciPa6 = "" ;
      lblTextblock27_Jsonclick = "" ;
      A3762SolAciPes = "" ;
      lblTextblock28_Jsonclick = "" ;
      A3763SolAciPac = "" ;
      lblTextblock29_Jsonclick = "" ;
      A3764SolAciWo = "" ;
      lblTextblock30_Jsonclick = "" ;
      A3765SolAciNorm = "" ;
      lblTextblock31_Jsonclick = "" ;
      A3766SolAlcTac = "" ;
      lblTextblock32_Jsonclick = "" ;
      A3767SolAlcCo = "" ;
      lblTextblock33_Jsonclick = "" ;
      A3768SolAlcPa6 = "" ;
      lblTextblock34_Jsonclick = "" ;
      A3769SolAlcPes = "" ;
      lblTextblock35_Jsonclick = "" ;
      A3770SolAlcPac = "" ;
      lblTextblock36_Jsonclick = "" ;
      A3771SolAlcWo = "" ;
      lblTextblock37_Jsonclick = "" ;
      A3772SolAlcNorm = "" ;
      lblTextblock38_Jsonclick = "" ;
      A3773SolAquTac = "" ;
      lblTextblock39_Jsonclick = "" ;
      A3774SolAquCo = "" ;
      lblTextblock40_Jsonclick = "" ;
      A3775SolAquPa6 = "" ;
      lblTextblock41_Jsonclick = "" ;
      A3776SolAquPes = "" ;
      lblTextblock42_Jsonclick = "" ;
      A3777SolAquPac = "" ;
      lblTextblock43_Jsonclick = "" ;
      A3778SolAquWo = "" ;
      lblTextblock44_Jsonclick = "" ;
      A3779SolAquNorm = "" ;
      lblTextblock45_Jsonclick = "" ;
      A4025SolTraAcAl = "" ;
      lblTextblock46_Jsonclick = "" ;
      A4026SolTraMaAl = "" ;
      lblTextblock47_Jsonclick = "" ;
      A4027SolTraAcAc = "" ;
      lblTextblock48_Jsonclick = "" ;
      A4028SolTraMaAc = "" ;
      lblTextblock49_Jsonclick = "" ;
      A4029SolTraAcAq = "" ;
      lblTextblock50_Jsonclick = "" ;
      A4030SolTraMaAq = "" ;
      lblTextblock51_Jsonclick = "" ;
      A4381SolTraCoAq = "" ;
      lblTextblock52_Jsonclick = "" ;
      A4382SolTraCoAc = "" ;
      lblTextblock53_Jsonclick = "" ;
      A4383SolTraCoAl = "" ;
      lblTextblock54_Jsonclick = "" ;
      A4952SolMarTac = "" ;
      lblTextblock55_Jsonclick = "" ;
      A4953SolMarCo = "" ;
      lblTextblock56_Jsonclick = "" ;
      A4954SolMarPa6 = "" ;
      lblTextblock57_Jsonclick = "" ;
      A4955SolMarPes = "" ;
      lblTextblock58_Jsonclick = "" ;
      A4956SolMarPac = "" ;
      lblTextblock59_Jsonclick = "" ;
      A4957SolMarWo = "" ;
      lblTextblock60_Jsonclick = "" ;
      A4958SolMarNorm = "" ;
      lblTextblock61_Jsonclick = "" ;
      A4959SolTraCoMa = "" ;
      lblTextblock62_Jsonclick = "" ;
      A11796SolRqMn = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock64_Jsonclick = "" ;
      A11926SolMetodo = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode472 = "" ;
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
      sMode471 = "" ;
      GXCCtl = "" ;
      A3270SolTraObs = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T00BG9_A3253SolTraCod = new int[1] ;
      T00BG9_A407EmprNom = new String[] {""} ;
      T00BG9_n407EmprNom = new boolean[] {false} ;
      T00BG9_A3254SolTraMat = new String[] {""} ;
      T00BG9_n3254SolTraMat = new boolean[] {false} ;
      T00BG9_A3255SolTraSer = new String[] {""} ;
      T00BG9_n3255SolTraSer = new boolean[] {false} ;
      T00BG9_A3256SolTraTip = new short[1] ;
      T00BG9_n3256SolTraTip = new boolean[] {false} ;
      T00BG9_A3257SolTraDisN = new String[] {""} ;
      T00BG9_n3257SolTraDisN = new boolean[] {false} ;
      T00BG9_A3258SolTraNom = new String[] {""} ;
      T00BG9_n3258SolTraNom = new boolean[] {false} ;
      T00BG9_A3259SolTraNum = new int[1] ;
      T00BG9_n3259SolTraNum = new boolean[] {false} ;
      T00BG9_A3260SolTraFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00BG9_n3260SolTraFec = new boolean[] {false} ;
      T00BG9_A653OpeNom = new String[] {""} ;
      T00BG9_n653OpeNom = new boolean[] {false} ;
      T00BG9_A3261SolTraCliC = new int[1] ;
      T00BG9_n3261SolTraCliC = new boolean[] {false} ;
      T00BG9_A3262SolTraCliN = new String[] {""} ;
      T00BG9_n3262SolTraCliN = new boolean[] {false} ;
      T00BG9_A3263SolTraAc = new String[] {""} ;
      T00BG9_n3263SolTraAc = new boolean[] {false} ;
      T00BG9_A3264SolTraMa = new String[] {""} ;
      T00BG9_n3264SolTraMa = new boolean[] {false} ;
      T00BG9_A3265SolTraNor = new String[] {""} ;
      T00BG9_n3265SolTraNor = new boolean[] {false} ;
      T00BG9_A3266SolTraMaq = new String[] {""} ;
      T00BG9_n3266SolTraMaq = new boolean[] {false} ;
      T00BG9_A3267SolTraRef = new String[] {""} ;
      T00BG9_n3267SolTraRef = new boolean[] {false} ;
      T00BG9_A3268SolTraUlin = new byte[1] ;
      T00BG9_n3268SolTraUlin = new boolean[] {false} ;
      T00BG9_A3759SolAciTac = new String[] {""} ;
      T00BG9_n3759SolAciTac = new boolean[] {false} ;
      T00BG9_A3760SolAciCo = new String[] {""} ;
      T00BG9_n3760SolAciCo = new boolean[] {false} ;
      T00BG9_A3761SolAciPa6 = new String[] {""} ;
      T00BG9_n3761SolAciPa6 = new boolean[] {false} ;
      T00BG9_A3762SolAciPes = new String[] {""} ;
      T00BG9_n3762SolAciPes = new boolean[] {false} ;
      T00BG9_A3763SolAciPac = new String[] {""} ;
      T00BG9_n3763SolAciPac = new boolean[] {false} ;
      T00BG9_A3764SolAciWo = new String[] {""} ;
      T00BG9_n3764SolAciWo = new boolean[] {false} ;
      T00BG9_A3765SolAciNorm = new String[] {""} ;
      T00BG9_n3765SolAciNorm = new boolean[] {false} ;
      T00BG9_A3766SolAlcTac = new String[] {""} ;
      T00BG9_n3766SolAlcTac = new boolean[] {false} ;
      T00BG9_A3767SolAlcCo = new String[] {""} ;
      T00BG9_n3767SolAlcCo = new boolean[] {false} ;
      T00BG9_A3768SolAlcPa6 = new String[] {""} ;
      T00BG9_n3768SolAlcPa6 = new boolean[] {false} ;
      T00BG9_A3769SolAlcPes = new String[] {""} ;
      T00BG9_n3769SolAlcPes = new boolean[] {false} ;
      T00BG9_A3770SolAlcPac = new String[] {""} ;
      T00BG9_n3770SolAlcPac = new boolean[] {false} ;
      T00BG9_A3771SolAlcWo = new String[] {""} ;
      T00BG9_n3771SolAlcWo = new boolean[] {false} ;
      T00BG9_A3772SolAlcNorm = new String[] {""} ;
      T00BG9_n3772SolAlcNorm = new boolean[] {false} ;
      T00BG9_A3773SolAquTac = new String[] {""} ;
      T00BG9_n3773SolAquTac = new boolean[] {false} ;
      T00BG9_A3774SolAquCo = new String[] {""} ;
      T00BG9_n3774SolAquCo = new boolean[] {false} ;
      T00BG9_A3775SolAquPa6 = new String[] {""} ;
      T00BG9_n3775SolAquPa6 = new boolean[] {false} ;
      T00BG9_A3776SolAquPes = new String[] {""} ;
      T00BG9_n3776SolAquPes = new boolean[] {false} ;
      T00BG9_A3777SolAquPac = new String[] {""} ;
      T00BG9_n3777SolAquPac = new boolean[] {false} ;
      T00BG9_A3778SolAquWo = new String[] {""} ;
      T00BG9_n3778SolAquWo = new boolean[] {false} ;
      T00BG9_A3779SolAquNorm = new String[] {""} ;
      T00BG9_n3779SolAquNorm = new boolean[] {false} ;
      T00BG9_A4025SolTraAcAl = new String[] {""} ;
      T00BG9_n4025SolTraAcAl = new boolean[] {false} ;
      T00BG9_A4026SolTraMaAl = new String[] {""} ;
      T00BG9_n4026SolTraMaAl = new boolean[] {false} ;
      T00BG9_A4027SolTraAcAc = new String[] {""} ;
      T00BG9_n4027SolTraAcAc = new boolean[] {false} ;
      T00BG9_A4028SolTraMaAc = new String[] {""} ;
      T00BG9_n4028SolTraMaAc = new boolean[] {false} ;
      T00BG9_A4029SolTraAcAq = new String[] {""} ;
      T00BG9_n4029SolTraAcAq = new boolean[] {false} ;
      T00BG9_A4030SolTraMaAq = new String[] {""} ;
      T00BG9_n4030SolTraMaAq = new boolean[] {false} ;
      T00BG9_A4381SolTraCoAq = new String[] {""} ;
      T00BG9_n4381SolTraCoAq = new boolean[] {false} ;
      T00BG9_A4382SolTraCoAc = new String[] {""} ;
      T00BG9_n4382SolTraCoAc = new boolean[] {false} ;
      T00BG9_A4383SolTraCoAl = new String[] {""} ;
      T00BG9_n4383SolTraCoAl = new boolean[] {false} ;
      T00BG9_A4952SolMarTac = new String[] {""} ;
      T00BG9_n4952SolMarTac = new boolean[] {false} ;
      T00BG9_A4953SolMarCo = new String[] {""} ;
      T00BG9_n4953SolMarCo = new boolean[] {false} ;
      T00BG9_A4954SolMarPa6 = new String[] {""} ;
      T00BG9_n4954SolMarPa6 = new boolean[] {false} ;
      T00BG9_A4955SolMarPes = new String[] {""} ;
      T00BG9_n4955SolMarPes = new boolean[] {false} ;
      T00BG9_A4956SolMarPac = new String[] {""} ;
      T00BG9_n4956SolMarPac = new boolean[] {false} ;
      T00BG9_A4957SolMarWo = new String[] {""} ;
      T00BG9_n4957SolMarWo = new boolean[] {false} ;
      T00BG9_A4958SolMarNorm = new String[] {""} ;
      T00BG9_n4958SolMarNorm = new boolean[] {false} ;
      T00BG9_A4959SolTraCoMa = new String[] {""} ;
      T00BG9_n4959SolTraCoMa = new boolean[] {false} ;
      T00BG9_A11796SolRqMn = new String[] {""} ;
      T00BG9_n11796SolRqMn = new boolean[] {false} ;
      T00BG9_A11797SolRqMnSt = new byte[1] ;
      T00BG9_n11797SolRqMnSt = new boolean[] {false} ;
      T00BG9_A11926SolMetodo = new String[] {""} ;
      T00BG9_n11926SolMetodo = new boolean[] {false} ;
      T00BG9_A396EmprCod = new String[] {""} ;
      T00BG9_A129BarCod = new int[1] ;
      T00BG9_n129BarCod = new boolean[] {false} ;
      T00BG9_A132BarCodReo = new byte[1] ;
      T00BG9_n132BarCodReo = new boolean[] {false} ;
      T00BG9_A130BarCodPar = new String[] {""} ;
      T00BG9_n130BarCodPar = new boolean[] {false} ;
      T00BG9_A652OpeCod = new int[1] ;
      T00BG9_n652OpeCod = new boolean[] {false} ;
      T00BG6_A407EmprNom = new String[] {""} ;
      T00BG6_n407EmprNom = new boolean[] {false} ;
      T00BG7_A396EmprCod = new String[] {""} ;
      T00BG8_A653OpeNom = new String[] {""} ;
      T00BG8_n653OpeNom = new boolean[] {false} ;
      T00BG10_A407EmprNom = new String[] {""} ;
      T00BG10_n407EmprNom = new boolean[] {false} ;
      T00BG11_A396EmprCod = new String[] {""} ;
      T00BG12_A653OpeNom = new String[] {""} ;
      T00BG12_n653OpeNom = new boolean[] {false} ;
      T00BG13_A396EmprCod = new String[] {""} ;
      T00BG13_A3253SolTraCod = new int[1] ;
      T00BG5_A3253SolTraCod = new int[1] ;
      T00BG5_A3254SolTraMat = new String[] {""} ;
      T00BG5_n3254SolTraMat = new boolean[] {false} ;
      T00BG5_A3255SolTraSer = new String[] {""} ;
      T00BG5_n3255SolTraSer = new boolean[] {false} ;
      T00BG5_A3256SolTraTip = new short[1] ;
      T00BG5_n3256SolTraTip = new boolean[] {false} ;
      T00BG5_A3257SolTraDisN = new String[] {""} ;
      T00BG5_n3257SolTraDisN = new boolean[] {false} ;
      T00BG5_A3258SolTraNom = new String[] {""} ;
      T00BG5_n3258SolTraNom = new boolean[] {false} ;
      T00BG5_A3259SolTraNum = new int[1] ;
      T00BG5_n3259SolTraNum = new boolean[] {false} ;
      T00BG5_A3260SolTraFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00BG5_n3260SolTraFec = new boolean[] {false} ;
      T00BG5_A3261SolTraCliC = new int[1] ;
      T00BG5_n3261SolTraCliC = new boolean[] {false} ;
      T00BG5_A3262SolTraCliN = new String[] {""} ;
      T00BG5_n3262SolTraCliN = new boolean[] {false} ;
      T00BG5_A3263SolTraAc = new String[] {""} ;
      T00BG5_n3263SolTraAc = new boolean[] {false} ;
      T00BG5_A3264SolTraMa = new String[] {""} ;
      T00BG5_n3264SolTraMa = new boolean[] {false} ;
      T00BG5_A3265SolTraNor = new String[] {""} ;
      T00BG5_n3265SolTraNor = new boolean[] {false} ;
      T00BG5_A3266SolTraMaq = new String[] {""} ;
      T00BG5_n3266SolTraMaq = new boolean[] {false} ;
      T00BG5_A3267SolTraRef = new String[] {""} ;
      T00BG5_n3267SolTraRef = new boolean[] {false} ;
      T00BG5_A3268SolTraUlin = new byte[1] ;
      T00BG5_n3268SolTraUlin = new boolean[] {false} ;
      T00BG5_A3759SolAciTac = new String[] {""} ;
      T00BG5_n3759SolAciTac = new boolean[] {false} ;
      T00BG5_A3760SolAciCo = new String[] {""} ;
      T00BG5_n3760SolAciCo = new boolean[] {false} ;
      T00BG5_A3761SolAciPa6 = new String[] {""} ;
      T00BG5_n3761SolAciPa6 = new boolean[] {false} ;
      T00BG5_A3762SolAciPes = new String[] {""} ;
      T00BG5_n3762SolAciPes = new boolean[] {false} ;
      T00BG5_A3763SolAciPac = new String[] {""} ;
      T00BG5_n3763SolAciPac = new boolean[] {false} ;
      T00BG5_A3764SolAciWo = new String[] {""} ;
      T00BG5_n3764SolAciWo = new boolean[] {false} ;
      T00BG5_A3765SolAciNorm = new String[] {""} ;
      T00BG5_n3765SolAciNorm = new boolean[] {false} ;
      T00BG5_A3766SolAlcTac = new String[] {""} ;
      T00BG5_n3766SolAlcTac = new boolean[] {false} ;
      T00BG5_A3767SolAlcCo = new String[] {""} ;
      T00BG5_n3767SolAlcCo = new boolean[] {false} ;
      T00BG5_A3768SolAlcPa6 = new String[] {""} ;
      T00BG5_n3768SolAlcPa6 = new boolean[] {false} ;
      T00BG5_A3769SolAlcPes = new String[] {""} ;
      T00BG5_n3769SolAlcPes = new boolean[] {false} ;
      T00BG5_A3770SolAlcPac = new String[] {""} ;
      T00BG5_n3770SolAlcPac = new boolean[] {false} ;
      T00BG5_A3771SolAlcWo = new String[] {""} ;
      T00BG5_n3771SolAlcWo = new boolean[] {false} ;
      T00BG5_A3772SolAlcNorm = new String[] {""} ;
      T00BG5_n3772SolAlcNorm = new boolean[] {false} ;
      T00BG5_A3773SolAquTac = new String[] {""} ;
      T00BG5_n3773SolAquTac = new boolean[] {false} ;
      T00BG5_A3774SolAquCo = new String[] {""} ;
      T00BG5_n3774SolAquCo = new boolean[] {false} ;
      T00BG5_A3775SolAquPa6 = new String[] {""} ;
      T00BG5_n3775SolAquPa6 = new boolean[] {false} ;
      T00BG5_A3776SolAquPes = new String[] {""} ;
      T00BG5_n3776SolAquPes = new boolean[] {false} ;
      T00BG5_A3777SolAquPac = new String[] {""} ;
      T00BG5_n3777SolAquPac = new boolean[] {false} ;
      T00BG5_A3778SolAquWo = new String[] {""} ;
      T00BG5_n3778SolAquWo = new boolean[] {false} ;
      T00BG5_A3779SolAquNorm = new String[] {""} ;
      T00BG5_n3779SolAquNorm = new boolean[] {false} ;
      T00BG5_A4025SolTraAcAl = new String[] {""} ;
      T00BG5_n4025SolTraAcAl = new boolean[] {false} ;
      T00BG5_A4026SolTraMaAl = new String[] {""} ;
      T00BG5_n4026SolTraMaAl = new boolean[] {false} ;
      T00BG5_A4027SolTraAcAc = new String[] {""} ;
      T00BG5_n4027SolTraAcAc = new boolean[] {false} ;
      T00BG5_A4028SolTraMaAc = new String[] {""} ;
      T00BG5_n4028SolTraMaAc = new boolean[] {false} ;
      T00BG5_A4029SolTraAcAq = new String[] {""} ;
      T00BG5_n4029SolTraAcAq = new boolean[] {false} ;
      T00BG5_A4030SolTraMaAq = new String[] {""} ;
      T00BG5_n4030SolTraMaAq = new boolean[] {false} ;
      T00BG5_A4381SolTraCoAq = new String[] {""} ;
      T00BG5_n4381SolTraCoAq = new boolean[] {false} ;
      T00BG5_A4382SolTraCoAc = new String[] {""} ;
      T00BG5_n4382SolTraCoAc = new boolean[] {false} ;
      T00BG5_A4383SolTraCoAl = new String[] {""} ;
      T00BG5_n4383SolTraCoAl = new boolean[] {false} ;
      T00BG5_A4952SolMarTac = new String[] {""} ;
      T00BG5_n4952SolMarTac = new boolean[] {false} ;
      T00BG5_A4953SolMarCo = new String[] {""} ;
      T00BG5_n4953SolMarCo = new boolean[] {false} ;
      T00BG5_A4954SolMarPa6 = new String[] {""} ;
      T00BG5_n4954SolMarPa6 = new boolean[] {false} ;
      T00BG5_A4955SolMarPes = new String[] {""} ;
      T00BG5_n4955SolMarPes = new boolean[] {false} ;
      T00BG5_A4956SolMarPac = new String[] {""} ;
      T00BG5_n4956SolMarPac = new boolean[] {false} ;
      T00BG5_A4957SolMarWo = new String[] {""} ;
      T00BG5_n4957SolMarWo = new boolean[] {false} ;
      T00BG5_A4958SolMarNorm = new String[] {""} ;
      T00BG5_n4958SolMarNorm = new boolean[] {false} ;
      T00BG5_A4959SolTraCoMa = new String[] {""} ;
      T00BG5_n4959SolTraCoMa = new boolean[] {false} ;
      T00BG5_A11796SolRqMn = new String[] {""} ;
      T00BG5_n11796SolRqMn = new boolean[] {false} ;
      T00BG5_A11797SolRqMnSt = new byte[1] ;
      T00BG5_n11797SolRqMnSt = new boolean[] {false} ;
      T00BG5_A11926SolMetodo = new String[] {""} ;
      T00BG5_n11926SolMetodo = new boolean[] {false} ;
      T00BG5_A396EmprCod = new String[] {""} ;
      T00BG5_A129BarCod = new int[1] ;
      T00BG5_n129BarCod = new boolean[] {false} ;
      T00BG5_A132BarCodReo = new byte[1] ;
      T00BG5_n132BarCodReo = new boolean[] {false} ;
      T00BG5_A130BarCodPar = new String[] {""} ;
      T00BG5_n130BarCodPar = new boolean[] {false} ;
      T00BG5_A652OpeCod = new int[1] ;
      T00BG5_n652OpeCod = new boolean[] {false} ;
      T00BG14_A396EmprCod = new String[] {""} ;
      T00BG14_A3253SolTraCod = new int[1] ;
      T00BG15_A396EmprCod = new String[] {""} ;
      T00BG15_A3253SolTraCod = new int[1] ;
      T00BG4_A3253SolTraCod = new int[1] ;
      T00BG4_A3254SolTraMat = new String[] {""} ;
      T00BG4_n3254SolTraMat = new boolean[] {false} ;
      T00BG4_A3255SolTraSer = new String[] {""} ;
      T00BG4_n3255SolTraSer = new boolean[] {false} ;
      T00BG4_A3256SolTraTip = new short[1] ;
      T00BG4_n3256SolTraTip = new boolean[] {false} ;
      T00BG4_A3257SolTraDisN = new String[] {""} ;
      T00BG4_n3257SolTraDisN = new boolean[] {false} ;
      T00BG4_A3258SolTraNom = new String[] {""} ;
      T00BG4_n3258SolTraNom = new boolean[] {false} ;
      T00BG4_A3259SolTraNum = new int[1] ;
      T00BG4_n3259SolTraNum = new boolean[] {false} ;
      T00BG4_A3260SolTraFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00BG4_n3260SolTraFec = new boolean[] {false} ;
      T00BG4_A3261SolTraCliC = new int[1] ;
      T00BG4_n3261SolTraCliC = new boolean[] {false} ;
      T00BG4_A3262SolTraCliN = new String[] {""} ;
      T00BG4_n3262SolTraCliN = new boolean[] {false} ;
      T00BG4_A3263SolTraAc = new String[] {""} ;
      T00BG4_n3263SolTraAc = new boolean[] {false} ;
      T00BG4_A3264SolTraMa = new String[] {""} ;
      T00BG4_n3264SolTraMa = new boolean[] {false} ;
      T00BG4_A3265SolTraNor = new String[] {""} ;
      T00BG4_n3265SolTraNor = new boolean[] {false} ;
      T00BG4_A3266SolTraMaq = new String[] {""} ;
      T00BG4_n3266SolTraMaq = new boolean[] {false} ;
      T00BG4_A3267SolTraRef = new String[] {""} ;
      T00BG4_n3267SolTraRef = new boolean[] {false} ;
      T00BG4_A3268SolTraUlin = new byte[1] ;
      T00BG4_n3268SolTraUlin = new boolean[] {false} ;
      T00BG4_A3759SolAciTac = new String[] {""} ;
      T00BG4_n3759SolAciTac = new boolean[] {false} ;
      T00BG4_A3760SolAciCo = new String[] {""} ;
      T00BG4_n3760SolAciCo = new boolean[] {false} ;
      T00BG4_A3761SolAciPa6 = new String[] {""} ;
      T00BG4_n3761SolAciPa6 = new boolean[] {false} ;
      T00BG4_A3762SolAciPes = new String[] {""} ;
      T00BG4_n3762SolAciPes = new boolean[] {false} ;
      T00BG4_A3763SolAciPac = new String[] {""} ;
      T00BG4_n3763SolAciPac = new boolean[] {false} ;
      T00BG4_A3764SolAciWo = new String[] {""} ;
      T00BG4_n3764SolAciWo = new boolean[] {false} ;
      T00BG4_A3765SolAciNorm = new String[] {""} ;
      T00BG4_n3765SolAciNorm = new boolean[] {false} ;
      T00BG4_A3766SolAlcTac = new String[] {""} ;
      T00BG4_n3766SolAlcTac = new boolean[] {false} ;
      T00BG4_A3767SolAlcCo = new String[] {""} ;
      T00BG4_n3767SolAlcCo = new boolean[] {false} ;
      T00BG4_A3768SolAlcPa6 = new String[] {""} ;
      T00BG4_n3768SolAlcPa6 = new boolean[] {false} ;
      T00BG4_A3769SolAlcPes = new String[] {""} ;
      T00BG4_n3769SolAlcPes = new boolean[] {false} ;
      T00BG4_A3770SolAlcPac = new String[] {""} ;
      T00BG4_n3770SolAlcPac = new boolean[] {false} ;
      T00BG4_A3771SolAlcWo = new String[] {""} ;
      T00BG4_n3771SolAlcWo = new boolean[] {false} ;
      T00BG4_A3772SolAlcNorm = new String[] {""} ;
      T00BG4_n3772SolAlcNorm = new boolean[] {false} ;
      T00BG4_A3773SolAquTac = new String[] {""} ;
      T00BG4_n3773SolAquTac = new boolean[] {false} ;
      T00BG4_A3774SolAquCo = new String[] {""} ;
      T00BG4_n3774SolAquCo = new boolean[] {false} ;
      T00BG4_A3775SolAquPa6 = new String[] {""} ;
      T00BG4_n3775SolAquPa6 = new boolean[] {false} ;
      T00BG4_A3776SolAquPes = new String[] {""} ;
      T00BG4_n3776SolAquPes = new boolean[] {false} ;
      T00BG4_A3777SolAquPac = new String[] {""} ;
      T00BG4_n3777SolAquPac = new boolean[] {false} ;
      T00BG4_A3778SolAquWo = new String[] {""} ;
      T00BG4_n3778SolAquWo = new boolean[] {false} ;
      T00BG4_A3779SolAquNorm = new String[] {""} ;
      T00BG4_n3779SolAquNorm = new boolean[] {false} ;
      T00BG4_A4025SolTraAcAl = new String[] {""} ;
      T00BG4_n4025SolTraAcAl = new boolean[] {false} ;
      T00BG4_A4026SolTraMaAl = new String[] {""} ;
      T00BG4_n4026SolTraMaAl = new boolean[] {false} ;
      T00BG4_A4027SolTraAcAc = new String[] {""} ;
      T00BG4_n4027SolTraAcAc = new boolean[] {false} ;
      T00BG4_A4028SolTraMaAc = new String[] {""} ;
      T00BG4_n4028SolTraMaAc = new boolean[] {false} ;
      T00BG4_A4029SolTraAcAq = new String[] {""} ;
      T00BG4_n4029SolTraAcAq = new boolean[] {false} ;
      T00BG4_A4030SolTraMaAq = new String[] {""} ;
      T00BG4_n4030SolTraMaAq = new boolean[] {false} ;
      T00BG4_A4381SolTraCoAq = new String[] {""} ;
      T00BG4_n4381SolTraCoAq = new boolean[] {false} ;
      T00BG4_A4382SolTraCoAc = new String[] {""} ;
      T00BG4_n4382SolTraCoAc = new boolean[] {false} ;
      T00BG4_A4383SolTraCoAl = new String[] {""} ;
      T00BG4_n4383SolTraCoAl = new boolean[] {false} ;
      T00BG4_A4952SolMarTac = new String[] {""} ;
      T00BG4_n4952SolMarTac = new boolean[] {false} ;
      T00BG4_A4953SolMarCo = new String[] {""} ;
      T00BG4_n4953SolMarCo = new boolean[] {false} ;
      T00BG4_A4954SolMarPa6 = new String[] {""} ;
      T00BG4_n4954SolMarPa6 = new boolean[] {false} ;
      T00BG4_A4955SolMarPes = new String[] {""} ;
      T00BG4_n4955SolMarPes = new boolean[] {false} ;
      T00BG4_A4956SolMarPac = new String[] {""} ;
      T00BG4_n4956SolMarPac = new boolean[] {false} ;
      T00BG4_A4957SolMarWo = new String[] {""} ;
      T00BG4_n4957SolMarWo = new boolean[] {false} ;
      T00BG4_A4958SolMarNorm = new String[] {""} ;
      T00BG4_n4958SolMarNorm = new boolean[] {false} ;
      T00BG4_A4959SolTraCoMa = new String[] {""} ;
      T00BG4_n4959SolTraCoMa = new boolean[] {false} ;
      T00BG4_A11796SolRqMn = new String[] {""} ;
      T00BG4_n11796SolRqMn = new boolean[] {false} ;
      T00BG4_A11797SolRqMnSt = new byte[1] ;
      T00BG4_n11797SolRqMnSt = new boolean[] {false} ;
      T00BG4_A11926SolMetodo = new String[] {""} ;
      T00BG4_n11926SolMetodo = new boolean[] {false} ;
      T00BG4_A396EmprCod = new String[] {""} ;
      T00BG4_A129BarCod = new int[1] ;
      T00BG4_n129BarCod = new boolean[] {false} ;
      T00BG4_A132BarCodReo = new byte[1] ;
      T00BG4_n132BarCodReo = new boolean[] {false} ;
      T00BG4_A130BarCodPar = new String[] {""} ;
      T00BG4_n130BarCodPar = new boolean[] {false} ;
      T00BG4_A652OpeCod = new int[1] ;
      T00BG4_n652OpeCod = new boolean[] {false} ;
      T00BG19_A407EmprNom = new String[] {""} ;
      T00BG19_n407EmprNom = new boolean[] {false} ;
      T00BG20_A653OpeNom = new String[] {""} ;
      T00BG20_n653OpeNom = new boolean[] {false} ;
      T00BG21_A396EmprCod = new String[] {""} ;
      T00BG21_A3253SolTraCod = new int[1] ;
      T00BG22_A3253SolTraCod = new int[1] ;
      T00BG22_A3269SolTraLin = new byte[1] ;
      T00BG22_A3270SolTraObs = new String[] {""} ;
      T00BG22_n3270SolTraObs = new boolean[] {false} ;
      T00BG22_A396EmprCod = new String[] {""} ;
      T00BG23_A396EmprCod = new String[] {""} ;
      T00BG23_A3253SolTraCod = new int[1] ;
      T00BG23_A3269SolTraLin = new byte[1] ;
      T00BG3_A3253SolTraCod = new int[1] ;
      T00BG3_A3269SolTraLin = new byte[1] ;
      T00BG3_A3270SolTraObs = new String[] {""} ;
      T00BG3_n3270SolTraObs = new boolean[] {false} ;
      T00BG3_A396EmprCod = new String[] {""} ;
      T00BG2_A3253SolTraCod = new int[1] ;
      T00BG2_A3269SolTraLin = new byte[1] ;
      T00BG2_A3270SolTraObs = new String[] {""} ;
      T00BG2_n3270SolTraObs = new boolean[] {false} ;
      T00BG2_A396EmprCod = new String[] {""} ;
      T00BG27_A396EmprCod = new String[] {""} ;
      T00BG27_A3253SolTraCod = new int[1] ;
      T00BG27_A3269SolTraLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ3254SolTraMat = "" ;
      ZZ3255SolTraSer = "" ;
      ZZ3257SolTraDisN = "" ;
      ZZ3258SolTraNom = "" ;
      ZZ3260SolTraFec = GXutil.nullDate() ;
      ZZ3262SolTraCliN = "" ;
      ZZ3263SolTraAc = "" ;
      ZZ3264SolTraMa = "" ;
      ZZ3265SolTraNor = "" ;
      ZZ3266SolTraMaq = "" ;
      ZZ3267SolTraRef = "" ;
      ZZ3759SolAciTac = "" ;
      ZZ3760SolAciCo = "" ;
      ZZ3761SolAciPa6 = "" ;
      ZZ3762SolAciPes = "" ;
      ZZ3763SolAciPac = "" ;
      ZZ3764SolAciWo = "" ;
      ZZ3765SolAciNorm = "" ;
      ZZ3766SolAlcTac = "" ;
      ZZ3767SolAlcCo = "" ;
      ZZ3768SolAlcPa6 = "" ;
      ZZ3769SolAlcPes = "" ;
      ZZ3770SolAlcPac = "" ;
      ZZ3771SolAlcWo = "" ;
      ZZ3772SolAlcNorm = "" ;
      ZZ3773SolAquTac = "" ;
      ZZ3774SolAquCo = "" ;
      ZZ3775SolAquPa6 = "" ;
      ZZ3776SolAquPes = "" ;
      ZZ3777SolAquPac = "" ;
      ZZ3778SolAquWo = "" ;
      ZZ3779SolAquNorm = "" ;
      ZZ4025SolTraAcAl = "" ;
      ZZ4026SolTraMaAl = "" ;
      ZZ4027SolTraAcAc = "" ;
      ZZ4028SolTraMaAc = "" ;
      ZZ4029SolTraAcAq = "" ;
      ZZ4030SolTraMaAq = "" ;
      ZZ4381SolTraCoAq = "" ;
      ZZ4382SolTraCoAc = "" ;
      ZZ4383SolTraCoAl = "" ;
      ZZ4952SolMarTac = "" ;
      ZZ4953SolMarCo = "" ;
      ZZ4954SolMarPa6 = "" ;
      ZZ4955SolMarPes = "" ;
      ZZ4956SolMarPac = "" ;
      ZZ4957SolMarWo = "" ;
      ZZ4958SolMarNorm = "" ;
      ZZ4959SolTraCoMa = "" ;
      ZZ11796SolRqMn = "" ;
      ZZ11926SolMetodo = "" ;
      ZZ407EmprNom = "" ;
      ZZ653OpeNom = "" ;
      T00BG28_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttraspi__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttraspi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttraspi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttraspi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttraspi__default(),
         new Object[] {
             new Object[] {
            T00BG2_A3253SolTraCod, T00BG2_A3269SolTraLin, T00BG2_A3270SolTraObs, T00BG2_n3270SolTraObs, T00BG2_A396EmprCod
            }
            , new Object[] {
            T00BG3_A3253SolTraCod, T00BG3_A3269SolTraLin, T00BG3_A3270SolTraObs, T00BG3_n3270SolTraObs, T00BG3_A396EmprCod
            }
            , new Object[] {
            T00BG4_A3253SolTraCod, T00BG4_A3254SolTraMat, T00BG4_n3254SolTraMat, T00BG4_A3255SolTraSer, T00BG4_n3255SolTraSer, T00BG4_A3256SolTraTip, T00BG4_n3256SolTraTip, T00BG4_A3257SolTraDisN, T00BG4_n3257SolTraDisN, T00BG4_A3258SolTraNom,
            T00BG4_n3258SolTraNom, T00BG4_A3259SolTraNum, T00BG4_n3259SolTraNum, T00BG4_A3260SolTraFec, T00BG4_n3260SolTraFec, T00BG4_A3261SolTraCliC, T00BG4_n3261SolTraCliC, T00BG4_A3262SolTraCliN, T00BG4_n3262SolTraCliN, T00BG4_A3263SolTraAc,
            T00BG4_n3263SolTraAc, T00BG4_A3264SolTraMa, T00BG4_n3264SolTraMa, T00BG4_A3265SolTraNor, T00BG4_n3265SolTraNor, T00BG4_A3266SolTraMaq, T00BG4_n3266SolTraMaq, T00BG4_A3267SolTraRef, T00BG4_n3267SolTraRef, T00BG4_A3268SolTraUlin,
            T00BG4_n3268SolTraUlin, T00BG4_A3759SolAciTac, T00BG4_n3759SolAciTac, T00BG4_A3760SolAciCo, T00BG4_n3760SolAciCo, T00BG4_A3761SolAciPa6, T00BG4_n3761SolAciPa6, T00BG4_A3762SolAciPes, T00BG4_n3762SolAciPes, T00BG4_A3763SolAciPac,
            T00BG4_n3763SolAciPac, T00BG4_A3764SolAciWo, T00BG4_n3764SolAciWo, T00BG4_A3765SolAciNorm, T00BG4_n3765SolAciNorm, T00BG4_A3766SolAlcTac, T00BG4_n3766SolAlcTac, T00BG4_A3767SolAlcCo, T00BG4_n3767SolAlcCo, T00BG4_A3768SolAlcPa6,
            T00BG4_n3768SolAlcPa6, T00BG4_A3769SolAlcPes, T00BG4_n3769SolAlcPes, T00BG4_A3770SolAlcPac, T00BG4_n3770SolAlcPac, T00BG4_A3771SolAlcWo, T00BG4_n3771SolAlcWo, T00BG4_A3772SolAlcNorm, T00BG4_n3772SolAlcNorm, T00BG4_A3773SolAquTac,
            T00BG4_n3773SolAquTac, T00BG4_A3774SolAquCo, T00BG4_n3774SolAquCo, T00BG4_A3775SolAquPa6, T00BG4_n3775SolAquPa6, T00BG4_A3776SolAquPes, T00BG4_n3776SolAquPes, T00BG4_A3777SolAquPac, T00BG4_n3777SolAquPac, T00BG4_A3778SolAquWo,
            T00BG4_n3778SolAquWo, T00BG4_A3779SolAquNorm, T00BG4_n3779SolAquNorm, T00BG4_A4025SolTraAcAl, T00BG4_n4025SolTraAcAl, T00BG4_A4026SolTraMaAl, T00BG4_n4026SolTraMaAl, T00BG4_A4027SolTraAcAc, T00BG4_n4027SolTraAcAc, T00BG4_A4028SolTraMaAc,
            T00BG4_n4028SolTraMaAc, T00BG4_A4029SolTraAcAq, T00BG4_n4029SolTraAcAq, T00BG4_A4030SolTraMaAq, T00BG4_n4030SolTraMaAq, T00BG4_A4381SolTraCoAq, T00BG4_n4381SolTraCoAq, T00BG4_A4382SolTraCoAc, T00BG4_n4382SolTraCoAc, T00BG4_A4383SolTraCoAl,
            T00BG4_n4383SolTraCoAl, T00BG4_A4952SolMarTac, T00BG4_n4952SolMarTac, T00BG4_A4953SolMarCo, T00BG4_n4953SolMarCo, T00BG4_A4954SolMarPa6, T00BG4_n4954SolMarPa6, T00BG4_A4955SolMarPes, T00BG4_n4955SolMarPes, T00BG4_A4956SolMarPac,
            T00BG4_n4956SolMarPac, T00BG4_A4957SolMarWo, T00BG4_n4957SolMarWo, T00BG4_A4958SolMarNorm, T00BG4_n4958SolMarNorm, T00BG4_A4959SolTraCoMa, T00BG4_n4959SolTraCoMa, T00BG4_A11796SolRqMn, T00BG4_n11796SolRqMn, T00BG4_A11797SolRqMnSt,
            T00BG4_n11797SolRqMnSt, T00BG4_A11926SolMetodo, T00BG4_n11926SolMetodo, T00BG4_A396EmprCod, T00BG4_A129BarCod, T00BG4_n129BarCod, T00BG4_A132BarCodReo, T00BG4_n132BarCodReo, T00BG4_A130BarCodPar, T00BG4_n130BarCodPar,
            T00BG4_A652OpeCod, T00BG4_n652OpeCod
            }
            , new Object[] {
            T00BG5_A3253SolTraCod, T00BG5_A3254SolTraMat, T00BG5_n3254SolTraMat, T00BG5_A3255SolTraSer, T00BG5_n3255SolTraSer, T00BG5_A3256SolTraTip, T00BG5_n3256SolTraTip, T00BG5_A3257SolTraDisN, T00BG5_n3257SolTraDisN, T00BG5_A3258SolTraNom,
            T00BG5_n3258SolTraNom, T00BG5_A3259SolTraNum, T00BG5_n3259SolTraNum, T00BG5_A3260SolTraFec, T00BG5_n3260SolTraFec, T00BG5_A3261SolTraCliC, T00BG5_n3261SolTraCliC, T00BG5_A3262SolTraCliN, T00BG5_n3262SolTraCliN, T00BG5_A3263SolTraAc,
            T00BG5_n3263SolTraAc, T00BG5_A3264SolTraMa, T00BG5_n3264SolTraMa, T00BG5_A3265SolTraNor, T00BG5_n3265SolTraNor, T00BG5_A3266SolTraMaq, T00BG5_n3266SolTraMaq, T00BG5_A3267SolTraRef, T00BG5_n3267SolTraRef, T00BG5_A3268SolTraUlin,
            T00BG5_n3268SolTraUlin, T00BG5_A3759SolAciTac, T00BG5_n3759SolAciTac, T00BG5_A3760SolAciCo, T00BG5_n3760SolAciCo, T00BG5_A3761SolAciPa6, T00BG5_n3761SolAciPa6, T00BG5_A3762SolAciPes, T00BG5_n3762SolAciPes, T00BG5_A3763SolAciPac,
            T00BG5_n3763SolAciPac, T00BG5_A3764SolAciWo, T00BG5_n3764SolAciWo, T00BG5_A3765SolAciNorm, T00BG5_n3765SolAciNorm, T00BG5_A3766SolAlcTac, T00BG5_n3766SolAlcTac, T00BG5_A3767SolAlcCo, T00BG5_n3767SolAlcCo, T00BG5_A3768SolAlcPa6,
            T00BG5_n3768SolAlcPa6, T00BG5_A3769SolAlcPes, T00BG5_n3769SolAlcPes, T00BG5_A3770SolAlcPac, T00BG5_n3770SolAlcPac, T00BG5_A3771SolAlcWo, T00BG5_n3771SolAlcWo, T00BG5_A3772SolAlcNorm, T00BG5_n3772SolAlcNorm, T00BG5_A3773SolAquTac,
            T00BG5_n3773SolAquTac, T00BG5_A3774SolAquCo, T00BG5_n3774SolAquCo, T00BG5_A3775SolAquPa6, T00BG5_n3775SolAquPa6, T00BG5_A3776SolAquPes, T00BG5_n3776SolAquPes, T00BG5_A3777SolAquPac, T00BG5_n3777SolAquPac, T00BG5_A3778SolAquWo,
            T00BG5_n3778SolAquWo, T00BG5_A3779SolAquNorm, T00BG5_n3779SolAquNorm, T00BG5_A4025SolTraAcAl, T00BG5_n4025SolTraAcAl, T00BG5_A4026SolTraMaAl, T00BG5_n4026SolTraMaAl, T00BG5_A4027SolTraAcAc, T00BG5_n4027SolTraAcAc, T00BG5_A4028SolTraMaAc,
            T00BG5_n4028SolTraMaAc, T00BG5_A4029SolTraAcAq, T00BG5_n4029SolTraAcAq, T00BG5_A4030SolTraMaAq, T00BG5_n4030SolTraMaAq, T00BG5_A4381SolTraCoAq, T00BG5_n4381SolTraCoAq, T00BG5_A4382SolTraCoAc, T00BG5_n4382SolTraCoAc, T00BG5_A4383SolTraCoAl,
            T00BG5_n4383SolTraCoAl, T00BG5_A4952SolMarTac, T00BG5_n4952SolMarTac, T00BG5_A4953SolMarCo, T00BG5_n4953SolMarCo, T00BG5_A4954SolMarPa6, T00BG5_n4954SolMarPa6, T00BG5_A4955SolMarPes, T00BG5_n4955SolMarPes, T00BG5_A4956SolMarPac,
            T00BG5_n4956SolMarPac, T00BG5_A4957SolMarWo, T00BG5_n4957SolMarWo, T00BG5_A4958SolMarNorm, T00BG5_n4958SolMarNorm, T00BG5_A4959SolTraCoMa, T00BG5_n4959SolTraCoMa, T00BG5_A11796SolRqMn, T00BG5_n11796SolRqMn, T00BG5_A11797SolRqMnSt,
            T00BG5_n11797SolRqMnSt, T00BG5_A11926SolMetodo, T00BG5_n11926SolMetodo, T00BG5_A396EmprCod, T00BG5_A129BarCod, T00BG5_n129BarCod, T00BG5_A132BarCodReo, T00BG5_n132BarCodReo, T00BG5_A130BarCodPar, T00BG5_n130BarCodPar,
            T00BG5_A652OpeCod, T00BG5_n652OpeCod
            }
            , new Object[] {
            T00BG6_A407EmprNom, T00BG6_n407EmprNom
            }
            , new Object[] {
            T00BG7_A396EmprCod
            }
            , new Object[] {
            T00BG8_A653OpeNom, T00BG8_n653OpeNom
            }
            , new Object[] {
            T00BG9_A3253SolTraCod, T00BG9_A407EmprNom, T00BG9_n407EmprNom, T00BG9_A3254SolTraMat, T00BG9_n3254SolTraMat, T00BG9_A3255SolTraSer, T00BG9_n3255SolTraSer, T00BG9_A3256SolTraTip, T00BG9_n3256SolTraTip, T00BG9_A3257SolTraDisN,
            T00BG9_n3257SolTraDisN, T00BG9_A3258SolTraNom, T00BG9_n3258SolTraNom, T00BG9_A3259SolTraNum, T00BG9_n3259SolTraNum, T00BG9_A3260SolTraFec, T00BG9_n3260SolTraFec, T00BG9_A653OpeNom, T00BG9_n653OpeNom, T00BG9_A3261SolTraCliC,
            T00BG9_n3261SolTraCliC, T00BG9_A3262SolTraCliN, T00BG9_n3262SolTraCliN, T00BG9_A3263SolTraAc, T00BG9_n3263SolTraAc, T00BG9_A3264SolTraMa, T00BG9_n3264SolTraMa, T00BG9_A3265SolTraNor, T00BG9_n3265SolTraNor, T00BG9_A3266SolTraMaq,
            T00BG9_n3266SolTraMaq, T00BG9_A3267SolTraRef, T00BG9_n3267SolTraRef, T00BG9_A3268SolTraUlin, T00BG9_n3268SolTraUlin, T00BG9_A3759SolAciTac, T00BG9_n3759SolAciTac, T00BG9_A3760SolAciCo, T00BG9_n3760SolAciCo, T00BG9_A3761SolAciPa6,
            T00BG9_n3761SolAciPa6, T00BG9_A3762SolAciPes, T00BG9_n3762SolAciPes, T00BG9_A3763SolAciPac, T00BG9_n3763SolAciPac, T00BG9_A3764SolAciWo, T00BG9_n3764SolAciWo, T00BG9_A3765SolAciNorm, T00BG9_n3765SolAciNorm, T00BG9_A3766SolAlcTac,
            T00BG9_n3766SolAlcTac, T00BG9_A3767SolAlcCo, T00BG9_n3767SolAlcCo, T00BG9_A3768SolAlcPa6, T00BG9_n3768SolAlcPa6, T00BG9_A3769SolAlcPes, T00BG9_n3769SolAlcPes, T00BG9_A3770SolAlcPac, T00BG9_n3770SolAlcPac, T00BG9_A3771SolAlcWo,
            T00BG9_n3771SolAlcWo, T00BG9_A3772SolAlcNorm, T00BG9_n3772SolAlcNorm, T00BG9_A3773SolAquTac, T00BG9_n3773SolAquTac, T00BG9_A3774SolAquCo, T00BG9_n3774SolAquCo, T00BG9_A3775SolAquPa6, T00BG9_n3775SolAquPa6, T00BG9_A3776SolAquPes,
            T00BG9_n3776SolAquPes, T00BG9_A3777SolAquPac, T00BG9_n3777SolAquPac, T00BG9_A3778SolAquWo, T00BG9_n3778SolAquWo, T00BG9_A3779SolAquNorm, T00BG9_n3779SolAquNorm, T00BG9_A4025SolTraAcAl, T00BG9_n4025SolTraAcAl, T00BG9_A4026SolTraMaAl,
            T00BG9_n4026SolTraMaAl, T00BG9_A4027SolTraAcAc, T00BG9_n4027SolTraAcAc, T00BG9_A4028SolTraMaAc, T00BG9_n4028SolTraMaAc, T00BG9_A4029SolTraAcAq, T00BG9_n4029SolTraAcAq, T00BG9_A4030SolTraMaAq, T00BG9_n4030SolTraMaAq, T00BG9_A4381SolTraCoAq,
            T00BG9_n4381SolTraCoAq, T00BG9_A4382SolTraCoAc, T00BG9_n4382SolTraCoAc, T00BG9_A4383SolTraCoAl, T00BG9_n4383SolTraCoAl, T00BG9_A4952SolMarTac, T00BG9_n4952SolMarTac, T00BG9_A4953SolMarCo, T00BG9_n4953SolMarCo, T00BG9_A4954SolMarPa6,
            T00BG9_n4954SolMarPa6, T00BG9_A4955SolMarPes, T00BG9_n4955SolMarPes, T00BG9_A4956SolMarPac, T00BG9_n4956SolMarPac, T00BG9_A4957SolMarWo, T00BG9_n4957SolMarWo, T00BG9_A4958SolMarNorm, T00BG9_n4958SolMarNorm, T00BG9_A4959SolTraCoMa,
            T00BG9_n4959SolTraCoMa, T00BG9_A11796SolRqMn, T00BG9_n11796SolRqMn, T00BG9_A11797SolRqMnSt, T00BG9_n11797SolRqMnSt, T00BG9_A11926SolMetodo, T00BG9_n11926SolMetodo, T00BG9_A396EmprCod, T00BG9_A129BarCod, T00BG9_n129BarCod,
            T00BG9_A132BarCodReo, T00BG9_n132BarCodReo, T00BG9_A130BarCodPar, T00BG9_n130BarCodPar, T00BG9_A652OpeCod, T00BG9_n652OpeCod
            }
            , new Object[] {
            T00BG10_A407EmprNom, T00BG10_n407EmprNom
            }
            , new Object[] {
            T00BG11_A396EmprCod
            }
            , new Object[] {
            T00BG12_A653OpeNom, T00BG12_n653OpeNom
            }
            , new Object[] {
            T00BG13_A396EmprCod, T00BG13_A3253SolTraCod
            }
            , new Object[] {
            T00BG14_A396EmprCod, T00BG14_A3253SolTraCod
            }
            , new Object[] {
            T00BG15_A396EmprCod, T00BG15_A3253SolTraCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00BG19_A407EmprNom, T00BG19_n407EmprNom
            }
            , new Object[] {
            T00BG20_A653OpeNom, T00BG20_n653OpeNom
            }
            , new Object[] {
            T00BG21_A396EmprCod, T00BG21_A3253SolTraCod
            }
            , new Object[] {
            T00BG22_A3253SolTraCod, T00BG22_A3269SolTraLin, T00BG22_A3270SolTraObs, T00BG22_n3270SolTraObs, T00BG22_A396EmprCod
            }
            , new Object[] {
            T00BG23_A396EmprCod, T00BG23_A3253SolTraCod, T00BG23_A3269SolTraLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00BG27_A396EmprCod, T00BG27_A3253SolTraCod, T00BG27_A3269SolTraLin
            }
            , new Object[] {
            T00BG28_A396EmprCod
            }
         }
      );
   }

   private byte Z3268SolTraUlin ;
   private byte Z11797SolRqMnSt ;
   private byte Z132BarCodReo ;
   private byte Z3269SolTraLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A3268SolTraUlin ;
   private byte A11797SolRqMnSt ;
   private byte A3269SolTraLin ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3268SolTraUlin ;
   private byte ZZ11797SolRqMnSt ;
   private short Z3256SolTraTip ;
   private short nRcdDeleted_472 ;
   private short nRcdExists_472 ;
   private short nIsMod_472 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3256SolTraTip ;
   private short nBlankRcdCount472 ;
   private short RcdFound472 ;
   private short nBlankRcdUsr472 ;
   private short RcdFound471 ;
   private short nIsDirty_471 ;
   private short nIsDirty_472 ;
   private short ZZ3256SolTraTip ;
   private int Z3253SolTraCod ;
   private int Z3259SolTraNum ;
   private int Z3261SolTraCliC ;
   private int Z129BarCod ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_340 ;
   private int nGXsfl_340_idx=1 ;
   private int A129BarCod ;
   private int A652OpeCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A3253SolTraCod ;
   private int edtSolTraCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtSolTraMat_Enabled ;
   private int edtSolTraSer_Enabled ;
   private int edtSolTraTip_Enabled ;
   private int edtSolTraDisN_Enabled ;
   private int edtSolTraNom_Enabled ;
   private int A3259SolTraNum ;
   private int edtSolTraNum_Enabled ;
   private int edtSolTraFec_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int A3261SolTraCliC ;
   private int edtSolTraCliC_Enabled ;
   private int edtSolTraCliN_Enabled ;
   private int edtSolTraAc_Enabled ;
   private int edtSolTraMa_Enabled ;
   private int edtSolTraNor_Enabled ;
   private int edtSolTraMaq_Enabled ;
   private int edtSolTraRef_Enabled ;
   private int edtSolTraUlin_Enabled ;
   private int edtSolAciTac_Enabled ;
   private int edtSolAciCo_Enabled ;
   private int edtSolAciPa6_Enabled ;
   private int edtSolAciPes_Enabled ;
   private int edtSolAciPac_Enabled ;
   private int edtSolAciWo_Enabled ;
   private int edtSolAciNorm_Enabled ;
   private int edtSolAlcTac_Enabled ;
   private int edtSolAlcCo_Enabled ;
   private int edtSolAlcPa6_Enabled ;
   private int edtSolAlcPes_Enabled ;
   private int edtSolAlcPac_Enabled ;
   private int edtSolAlcWo_Enabled ;
   private int edtSolAlcNorm_Enabled ;
   private int edtSolAquTac_Enabled ;
   private int edtSolAquCo_Enabled ;
   private int edtSolAquPa6_Enabled ;
   private int edtSolAquPes_Enabled ;
   private int edtSolAquPac_Enabled ;
   private int edtSolAquWo_Enabled ;
   private int edtSolAquNorm_Enabled ;
   private int edtSolTraAcAl_Enabled ;
   private int edtSolTraMaAl_Enabled ;
   private int edtSolTraAcAc_Enabled ;
   private int edtSolTraMaAc_Enabled ;
   private int edtSolTraAcAq_Enabled ;
   private int edtSolTraMaAq_Enabled ;
   private int edtSolTraCoAq_Enabled ;
   private int edtSolTraCoAc_Enabled ;
   private int edtSolTraCoAl_Enabled ;
   private int edtSolMarTac_Enabled ;
   private int edtSolMarCo_Enabled ;
   private int edtSolMarPa6_Enabled ;
   private int edtSolMarPes_Enabled ;
   private int edtSolMarPac_Enabled ;
   private int edtSolMarWo_Enabled ;
   private int edtSolMarNorm_Enabled ;
   private int edtSolTraCoMa_Enabled ;
   private int edtSolRqMn_Enabled ;
   private int edtSolRqMnSt_Enabled ;
   private int edtSolMetodo_Enabled ;
   private int edtavnRcdDeleted_472_Enabled ;
   private int edtSolTraLin_Enabled ;
   private int edtSolTraObs_Enabled ;
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
   private int defedtSolTraLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSolMetodo_Backcolor ;
   private int edtSolRqMnSt_Backcolor ;
   private int edtSolRqMn_Backcolor ;
   private int edtSolTraCoMa_Backcolor ;
   private int edtSolMarNorm_Backcolor ;
   private int edtSolMarWo_Backcolor ;
   private int edtSolMarPac_Backcolor ;
   private int edtSolMarPes_Backcolor ;
   private int edtSolMarPa6_Backcolor ;
   private int edtSolMarCo_Backcolor ;
   private int edtSolMarTac_Backcolor ;
   private int edtSolTraCoAl_Backcolor ;
   private int edtSolTraCoAc_Backcolor ;
   private int edtSolTraCoAq_Backcolor ;
   private int edtSolTraMaAq_Backcolor ;
   private int edtSolTraAcAq_Backcolor ;
   private int edtSolTraMaAc_Backcolor ;
   private int edtSolTraAcAc_Backcolor ;
   private int edtSolTraMaAl_Backcolor ;
   private int edtSolTraAcAl_Backcolor ;
   private int edtSolAquNorm_Backcolor ;
   private int edtSolAquWo_Backcolor ;
   private int edtSolAquPac_Backcolor ;
   private int edtSolAquPes_Backcolor ;
   private int edtSolAquPa6_Backcolor ;
   private int edtSolAquCo_Backcolor ;
   private int edtSolAquTac_Backcolor ;
   private int edtSolAlcNorm_Backcolor ;
   private int edtSolAlcWo_Backcolor ;
   private int edtSolAlcPac_Backcolor ;
   private int edtSolAlcPes_Backcolor ;
   private int edtSolAlcPa6_Backcolor ;
   private int edtSolAlcCo_Backcolor ;
   private int edtSolAlcTac_Backcolor ;
   private int edtSolAciNorm_Backcolor ;
   private int edtSolAciWo_Backcolor ;
   private int edtSolAciPac_Backcolor ;
   private int edtSolAciPes_Backcolor ;
   private int edtSolAciPa6_Backcolor ;
   private int edtSolAciCo_Backcolor ;
   private int edtSolAciTac_Backcolor ;
   private int edtSolTraUlin_Backcolor ;
   private int edtSolTraRef_Backcolor ;
   private int edtSolTraMaq_Backcolor ;
   private int edtSolTraNor_Backcolor ;
   private int edtSolTraMa_Backcolor ;
   private int edtSolTraAc_Backcolor ;
   private int edtSolTraCliN_Backcolor ;
   private int edtSolTraCliC_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtSolTraFec_Backcolor ;
   private int edtSolTraNum_Backcolor ;
   private int edtSolTraNom_Backcolor ;
   private int edtSolTraDisN_Backcolor ;
   private int edtSolTraTip_Backcolor ;
   private int edtSolTraSer_Backcolor ;
   private int edtSolTraMat_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtSolTraCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ3253SolTraCod ;
   private int ZZ129BarCod ;
   private int ZZ3259SolTraNum ;
   private int ZZ652OpeCod ;
   private int ZZ3261SolTraCliC ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z3254SolTraMat ;
   private String Z3255SolTraSer ;
   private String Z3257SolTraDisN ;
   private String Z3258SolTraNom ;
   private String Z3262SolTraCliN ;
   private String Z3263SolTraAc ;
   private String Z3264SolTraMa ;
   private String Z3265SolTraNor ;
   private String Z3266SolTraMaq ;
   private String Z3267SolTraRef ;
   private String Z3759SolAciTac ;
   private String Z3760SolAciCo ;
   private String Z3761SolAciPa6 ;
   private String Z3762SolAciPes ;
   private String Z3763SolAciPac ;
   private String Z3764SolAciWo ;
   private String Z3765SolAciNorm ;
   private String Z3766SolAlcTac ;
   private String Z3767SolAlcCo ;
   private String Z3768SolAlcPa6 ;
   private String Z3769SolAlcPes ;
   private String Z3770SolAlcPac ;
   private String Z3771SolAlcWo ;
   private String Z3772SolAlcNorm ;
   private String Z3773SolAquTac ;
   private String Z3774SolAquCo ;
   private String Z3775SolAquPa6 ;
   private String Z3776SolAquPes ;
   private String Z3777SolAquPac ;
   private String Z3778SolAquWo ;
   private String Z3779SolAquNorm ;
   private String Z4025SolTraAcAl ;
   private String Z4026SolTraMaAl ;
   private String Z4027SolTraAcAc ;
   private String Z4028SolTraMaAc ;
   private String Z4029SolTraAcAq ;
   private String Z4030SolTraMaAq ;
   private String Z4381SolTraCoAq ;
   private String Z4382SolTraCoAc ;
   private String Z4383SolTraCoAl ;
   private String Z4952SolMarTac ;
   private String Z4953SolMarCo ;
   private String Z4954SolMarPa6 ;
   private String Z4955SolMarPes ;
   private String Z4956SolMarPac ;
   private String Z4957SolMarWo ;
   private String Z4958SolMarNorm ;
   private String Z4959SolTraCoMa ;
   private String Z11796SolRqMn ;
   private String Z11926SolMetodo ;
   private String Z130BarCodPar ;
   private String Z3270SolTraObs ;
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
   private String sGXsfl_340_idx="0001" ;
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
   private String edtSolTraCod_Internalname ;
   private String edtSolTraCod_Jsonclick ;
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
   private String edtSolTraMat_Internalname ;
   private String A3254SolTraMat ;
   private String edtSolTraMat_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSolTraSer_Internalname ;
   private String A3255SolTraSer ;
   private String edtSolTraSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSolTraTip_Internalname ;
   private String edtSolTraTip_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSolTraDisN_Internalname ;
   private String A3257SolTraDisN ;
   private String edtSolTraDisN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSolTraNom_Internalname ;
   private String A3258SolTraNom ;
   private String edtSolTraNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtSolTraNum_Internalname ;
   private String edtSolTraNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtSolTraFec_Internalname ;
   private String edtSolTraFec_Jsonclick ;
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
   private String edtSolTraCliC_Internalname ;
   private String edtSolTraCliC_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtSolTraCliN_Internalname ;
   private String A3262SolTraCliN ;
   private String edtSolTraCliN_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtSolTraAc_Internalname ;
   private String A3263SolTraAc ;
   private String edtSolTraAc_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtSolTraMa_Internalname ;
   private String A3264SolTraMa ;
   private String edtSolTraMa_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtSolTraNor_Internalname ;
   private String A3265SolTraNor ;
   private String edtSolTraNor_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtSolTraMaq_Internalname ;
   private String A3266SolTraMaq ;
   private String edtSolTraMaq_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtSolTraRef_Internalname ;
   private String A3267SolTraRef ;
   private String edtSolTraRef_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtSolTraUlin_Internalname ;
   private String edtSolTraUlin_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtSolAciTac_Internalname ;
   private String A3759SolAciTac ;
   private String edtSolAciTac_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtSolAciCo_Internalname ;
   private String A3760SolAciCo ;
   private String edtSolAciCo_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtSolAciPa6_Internalname ;
   private String A3761SolAciPa6 ;
   private String edtSolAciPa6_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtSolAciPes_Internalname ;
   private String A3762SolAciPes ;
   private String edtSolAciPes_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtSolAciPac_Internalname ;
   private String A3763SolAciPac ;
   private String edtSolAciPac_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtSolAciWo_Internalname ;
   private String A3764SolAciWo ;
   private String edtSolAciWo_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtSolAciNorm_Internalname ;
   private String A3765SolAciNorm ;
   private String edtSolAciNorm_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtSolAlcTac_Internalname ;
   private String A3766SolAlcTac ;
   private String edtSolAlcTac_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtSolAlcCo_Internalname ;
   private String A3767SolAlcCo ;
   private String edtSolAlcCo_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtSolAlcPa6_Internalname ;
   private String A3768SolAlcPa6 ;
   private String edtSolAlcPa6_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtSolAlcPes_Internalname ;
   private String A3769SolAlcPes ;
   private String edtSolAlcPes_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtSolAlcPac_Internalname ;
   private String A3770SolAlcPac ;
   private String edtSolAlcPac_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtSolAlcWo_Internalname ;
   private String A3771SolAlcWo ;
   private String edtSolAlcWo_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtSolAlcNorm_Internalname ;
   private String A3772SolAlcNorm ;
   private String edtSolAlcNorm_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtSolAquTac_Internalname ;
   private String A3773SolAquTac ;
   private String edtSolAquTac_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtSolAquCo_Internalname ;
   private String A3774SolAquCo ;
   private String edtSolAquCo_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtSolAquPa6_Internalname ;
   private String A3775SolAquPa6 ;
   private String edtSolAquPa6_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtSolAquPes_Internalname ;
   private String A3776SolAquPes ;
   private String edtSolAquPes_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtSolAquPac_Internalname ;
   private String A3777SolAquPac ;
   private String edtSolAquPac_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtSolAquWo_Internalname ;
   private String A3778SolAquWo ;
   private String edtSolAquWo_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtSolAquNorm_Internalname ;
   private String A3779SolAquNorm ;
   private String edtSolAquNorm_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtSolTraAcAl_Internalname ;
   private String A4025SolTraAcAl ;
   private String edtSolTraAcAl_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtSolTraMaAl_Internalname ;
   private String A4026SolTraMaAl ;
   private String edtSolTraMaAl_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtSolTraAcAc_Internalname ;
   private String A4027SolTraAcAc ;
   private String edtSolTraAcAc_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtSolTraMaAc_Internalname ;
   private String A4028SolTraMaAc ;
   private String edtSolTraMaAc_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtSolTraAcAq_Internalname ;
   private String A4029SolTraAcAq ;
   private String edtSolTraAcAq_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtSolTraMaAq_Internalname ;
   private String A4030SolTraMaAq ;
   private String edtSolTraMaAq_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtSolTraCoAq_Internalname ;
   private String A4381SolTraCoAq ;
   private String edtSolTraCoAq_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtSolTraCoAc_Internalname ;
   private String A4382SolTraCoAc ;
   private String edtSolTraCoAc_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtSolTraCoAl_Internalname ;
   private String A4383SolTraCoAl ;
   private String edtSolTraCoAl_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtSolMarTac_Internalname ;
   private String A4952SolMarTac ;
   private String edtSolMarTac_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtSolMarCo_Internalname ;
   private String A4953SolMarCo ;
   private String edtSolMarCo_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtSolMarPa6_Internalname ;
   private String A4954SolMarPa6 ;
   private String edtSolMarPa6_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtSolMarPes_Internalname ;
   private String A4955SolMarPes ;
   private String edtSolMarPes_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtSolMarPac_Internalname ;
   private String A4956SolMarPac ;
   private String edtSolMarPac_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtSolMarWo_Internalname ;
   private String A4957SolMarWo ;
   private String edtSolMarWo_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtSolMarNorm_Internalname ;
   private String A4958SolMarNorm ;
   private String edtSolMarNorm_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtSolTraCoMa_Internalname ;
   private String A4959SolTraCoMa ;
   private String edtSolTraCoMa_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtSolRqMn_Internalname ;
   private String A11796SolRqMn ;
   private String edtSolRqMn_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtSolRqMnSt_Internalname ;
   private String edtSolRqMnSt_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtSolMetodo_Internalname ;
   private String A11926SolMetodo ;
   private String edtSolMetodo_Jsonclick ;
   private String sMode472 ;
   private String edtavnRcdDeleted_472_Internalname ;
   private String edtSolTraLin_Internalname ;
   private String edtSolTraObs_Internalname ;
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
   private String sMode471 ;
   private String GXCCtl ;
   private String A3270SolTraObs ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String sGXsfl_340_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_472_Jsonclick ;
   private String edtSolTraLin_Jsonclick ;
   private String edtSolTraObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ3254SolTraMat ;
   private String ZZ3255SolTraSer ;
   private String ZZ3257SolTraDisN ;
   private String ZZ3258SolTraNom ;
   private String ZZ3262SolTraCliN ;
   private String ZZ3263SolTraAc ;
   private String ZZ3264SolTraMa ;
   private String ZZ3265SolTraNor ;
   private String ZZ3266SolTraMaq ;
   private String ZZ3267SolTraRef ;
   private String ZZ3759SolAciTac ;
   private String ZZ3760SolAciCo ;
   private String ZZ3761SolAciPa6 ;
   private String ZZ3762SolAciPes ;
   private String ZZ3763SolAciPac ;
   private String ZZ3764SolAciWo ;
   private String ZZ3765SolAciNorm ;
   private String ZZ3766SolAlcTac ;
   private String ZZ3767SolAlcCo ;
   private String ZZ3768SolAlcPa6 ;
   private String ZZ3769SolAlcPes ;
   private String ZZ3770SolAlcPac ;
   private String ZZ3771SolAlcWo ;
   private String ZZ3772SolAlcNorm ;
   private String ZZ3773SolAquTac ;
   private String ZZ3774SolAquCo ;
   private String ZZ3775SolAquPa6 ;
   private String ZZ3776SolAquPes ;
   private String ZZ3777SolAquPac ;
   private String ZZ3778SolAquWo ;
   private String ZZ3779SolAquNorm ;
   private String ZZ4025SolTraAcAl ;
   private String ZZ4026SolTraMaAl ;
   private String ZZ4027SolTraAcAc ;
   private String ZZ4028SolTraMaAc ;
   private String ZZ4029SolTraAcAq ;
   private String ZZ4030SolTraMaAq ;
   private String ZZ4381SolTraCoAq ;
   private String ZZ4382SolTraCoAc ;
   private String ZZ4383SolTraCoAl ;
   private String ZZ4952SolMarTac ;
   private String ZZ4953SolMarCo ;
   private String ZZ4954SolMarPa6 ;
   private String ZZ4955SolMarPes ;
   private String ZZ4956SolMarPac ;
   private String ZZ4957SolMarWo ;
   private String ZZ4958SolMarNorm ;
   private String ZZ4959SolTraCoMa ;
   private String ZZ11796SolRqMn ;
   private String ZZ11926SolMetodo ;
   private String ZZ407EmprNom ;
   private String ZZ653OpeNom ;
   private java.util.Date Z3260SolTraFec ;
   private java.util.Date A3260SolTraFec ;
   private java.util.Date ZZ3260SolTraFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_340_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3254SolTraMat ;
   private boolean n3255SolTraSer ;
   private boolean n3256SolTraTip ;
   private boolean n3257SolTraDisN ;
   private boolean n3258SolTraNom ;
   private boolean n3259SolTraNum ;
   private boolean n3260SolTraFec ;
   private boolean n653OpeNom ;
   private boolean n3261SolTraCliC ;
   private boolean n3262SolTraCliN ;
   private boolean n3263SolTraAc ;
   private boolean n3264SolTraMa ;
   private boolean n3265SolTraNor ;
   private boolean n3266SolTraMaq ;
   private boolean n3267SolTraRef ;
   private boolean n3268SolTraUlin ;
   private boolean n3759SolAciTac ;
   private boolean n3760SolAciCo ;
   private boolean n3761SolAciPa6 ;
   private boolean n3762SolAciPes ;
   private boolean n3763SolAciPac ;
   private boolean n3764SolAciWo ;
   private boolean n3765SolAciNorm ;
   private boolean n3766SolAlcTac ;
   private boolean n3767SolAlcCo ;
   private boolean n3768SolAlcPa6 ;
   private boolean n3769SolAlcPes ;
   private boolean n3770SolAlcPac ;
   private boolean n3771SolAlcWo ;
   private boolean n3772SolAlcNorm ;
   private boolean n3773SolAquTac ;
   private boolean n3774SolAquCo ;
   private boolean n3775SolAquPa6 ;
   private boolean n3776SolAquPes ;
   private boolean n3777SolAquPac ;
   private boolean n3778SolAquWo ;
   private boolean n3779SolAquNorm ;
   private boolean n4025SolTraAcAl ;
   private boolean n4026SolTraMaAl ;
   private boolean n4027SolTraAcAc ;
   private boolean n4028SolTraMaAc ;
   private boolean n4029SolTraAcAq ;
   private boolean n4030SolTraMaAq ;
   private boolean n4381SolTraCoAq ;
   private boolean n4382SolTraCoAc ;
   private boolean n4383SolTraCoAl ;
   private boolean n4952SolMarTac ;
   private boolean n4953SolMarCo ;
   private boolean n4954SolMarPa6 ;
   private boolean n4955SolMarPes ;
   private boolean n4956SolMarPac ;
   private boolean n4957SolMarWo ;
   private boolean n4958SolMarNorm ;
   private boolean n4959SolTraCoMa ;
   private boolean n11796SolRqMn ;
   private boolean n11797SolRqMnSt ;
   private boolean n11926SolMetodo ;
   private boolean Gx_longc ;
   private boolean n3270SolTraObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T00BG9_A3253SolTraCod ;
   private String[] T00BG9_A407EmprNom ;
   private boolean[] T00BG9_n407EmprNom ;
   private String[] T00BG9_A3254SolTraMat ;
   private boolean[] T00BG9_n3254SolTraMat ;
   private String[] T00BG9_A3255SolTraSer ;
   private boolean[] T00BG9_n3255SolTraSer ;
   private short[] T00BG9_A3256SolTraTip ;
   private boolean[] T00BG9_n3256SolTraTip ;
   private String[] T00BG9_A3257SolTraDisN ;
   private boolean[] T00BG9_n3257SolTraDisN ;
   private String[] T00BG9_A3258SolTraNom ;
   private boolean[] T00BG9_n3258SolTraNom ;
   private int[] T00BG9_A3259SolTraNum ;
   private boolean[] T00BG9_n3259SolTraNum ;
   private java.util.Date[] T00BG9_A3260SolTraFec ;
   private boolean[] T00BG9_n3260SolTraFec ;
   private String[] T00BG9_A653OpeNom ;
   private boolean[] T00BG9_n653OpeNom ;
   private int[] T00BG9_A3261SolTraCliC ;
   private boolean[] T00BG9_n3261SolTraCliC ;
   private String[] T00BG9_A3262SolTraCliN ;
   private boolean[] T00BG9_n3262SolTraCliN ;
   private String[] T00BG9_A3263SolTraAc ;
   private boolean[] T00BG9_n3263SolTraAc ;
   private String[] T00BG9_A3264SolTraMa ;
   private boolean[] T00BG9_n3264SolTraMa ;
   private String[] T00BG9_A3265SolTraNor ;
   private boolean[] T00BG9_n3265SolTraNor ;
   private String[] T00BG9_A3266SolTraMaq ;
   private boolean[] T00BG9_n3266SolTraMaq ;
   private String[] T00BG9_A3267SolTraRef ;
   private boolean[] T00BG9_n3267SolTraRef ;
   private byte[] T00BG9_A3268SolTraUlin ;
   private boolean[] T00BG9_n3268SolTraUlin ;
   private String[] T00BG9_A3759SolAciTac ;
   private boolean[] T00BG9_n3759SolAciTac ;
   private String[] T00BG9_A3760SolAciCo ;
   private boolean[] T00BG9_n3760SolAciCo ;
   private String[] T00BG9_A3761SolAciPa6 ;
   private boolean[] T00BG9_n3761SolAciPa6 ;
   private String[] T00BG9_A3762SolAciPes ;
   private boolean[] T00BG9_n3762SolAciPes ;
   private String[] T00BG9_A3763SolAciPac ;
   private boolean[] T00BG9_n3763SolAciPac ;
   private String[] T00BG9_A3764SolAciWo ;
   private boolean[] T00BG9_n3764SolAciWo ;
   private String[] T00BG9_A3765SolAciNorm ;
   private boolean[] T00BG9_n3765SolAciNorm ;
   private String[] T00BG9_A3766SolAlcTac ;
   private boolean[] T00BG9_n3766SolAlcTac ;
   private String[] T00BG9_A3767SolAlcCo ;
   private boolean[] T00BG9_n3767SolAlcCo ;
   private String[] T00BG9_A3768SolAlcPa6 ;
   private boolean[] T00BG9_n3768SolAlcPa6 ;
   private String[] T00BG9_A3769SolAlcPes ;
   private boolean[] T00BG9_n3769SolAlcPes ;
   private String[] T00BG9_A3770SolAlcPac ;
   private boolean[] T00BG9_n3770SolAlcPac ;
   private String[] T00BG9_A3771SolAlcWo ;
   private boolean[] T00BG9_n3771SolAlcWo ;
   private String[] T00BG9_A3772SolAlcNorm ;
   private boolean[] T00BG9_n3772SolAlcNorm ;
   private String[] T00BG9_A3773SolAquTac ;
   private boolean[] T00BG9_n3773SolAquTac ;
   private String[] T00BG9_A3774SolAquCo ;
   private boolean[] T00BG9_n3774SolAquCo ;
   private String[] T00BG9_A3775SolAquPa6 ;
   private boolean[] T00BG9_n3775SolAquPa6 ;
   private String[] T00BG9_A3776SolAquPes ;
   private boolean[] T00BG9_n3776SolAquPes ;
   private String[] T00BG9_A3777SolAquPac ;
   private boolean[] T00BG9_n3777SolAquPac ;
   private String[] T00BG9_A3778SolAquWo ;
   private boolean[] T00BG9_n3778SolAquWo ;
   private String[] T00BG9_A3779SolAquNorm ;
   private boolean[] T00BG9_n3779SolAquNorm ;
   private String[] T00BG9_A4025SolTraAcAl ;
   private boolean[] T00BG9_n4025SolTraAcAl ;
   private String[] T00BG9_A4026SolTraMaAl ;
   private boolean[] T00BG9_n4026SolTraMaAl ;
   private String[] T00BG9_A4027SolTraAcAc ;
   private boolean[] T00BG9_n4027SolTraAcAc ;
   private String[] T00BG9_A4028SolTraMaAc ;
   private boolean[] T00BG9_n4028SolTraMaAc ;
   private String[] T00BG9_A4029SolTraAcAq ;
   private boolean[] T00BG9_n4029SolTraAcAq ;
   private String[] T00BG9_A4030SolTraMaAq ;
   private boolean[] T00BG9_n4030SolTraMaAq ;
   private String[] T00BG9_A4381SolTraCoAq ;
   private boolean[] T00BG9_n4381SolTraCoAq ;
   private String[] T00BG9_A4382SolTraCoAc ;
   private boolean[] T00BG9_n4382SolTraCoAc ;
   private String[] T00BG9_A4383SolTraCoAl ;
   private boolean[] T00BG9_n4383SolTraCoAl ;
   private String[] T00BG9_A4952SolMarTac ;
   private boolean[] T00BG9_n4952SolMarTac ;
   private String[] T00BG9_A4953SolMarCo ;
   private boolean[] T00BG9_n4953SolMarCo ;
   private String[] T00BG9_A4954SolMarPa6 ;
   private boolean[] T00BG9_n4954SolMarPa6 ;
   private String[] T00BG9_A4955SolMarPes ;
   private boolean[] T00BG9_n4955SolMarPes ;
   private String[] T00BG9_A4956SolMarPac ;
   private boolean[] T00BG9_n4956SolMarPac ;
   private String[] T00BG9_A4957SolMarWo ;
   private boolean[] T00BG9_n4957SolMarWo ;
   private String[] T00BG9_A4958SolMarNorm ;
   private boolean[] T00BG9_n4958SolMarNorm ;
   private String[] T00BG9_A4959SolTraCoMa ;
   private boolean[] T00BG9_n4959SolTraCoMa ;
   private String[] T00BG9_A11796SolRqMn ;
   private boolean[] T00BG9_n11796SolRqMn ;
   private byte[] T00BG9_A11797SolRqMnSt ;
   private boolean[] T00BG9_n11797SolRqMnSt ;
   private String[] T00BG9_A11926SolMetodo ;
   private boolean[] T00BG9_n11926SolMetodo ;
   private String[] T00BG9_A396EmprCod ;
   private int[] T00BG9_A129BarCod ;
   private boolean[] T00BG9_n129BarCod ;
   private byte[] T00BG9_A132BarCodReo ;
   private boolean[] T00BG9_n132BarCodReo ;
   private String[] T00BG9_A130BarCodPar ;
   private boolean[] T00BG9_n130BarCodPar ;
   private int[] T00BG9_A652OpeCod ;
   private boolean[] T00BG9_n652OpeCod ;
   private String[] T00BG6_A407EmprNom ;
   private boolean[] T00BG6_n407EmprNom ;
   private String[] T00BG7_A396EmprCod ;
   private String[] T00BG8_A653OpeNom ;
   private boolean[] T00BG8_n653OpeNom ;
   private String[] T00BG10_A407EmprNom ;
   private boolean[] T00BG10_n407EmprNom ;
   private String[] T00BG11_A396EmprCod ;
   private String[] T00BG12_A653OpeNom ;
   private boolean[] T00BG12_n653OpeNom ;
   private String[] T00BG13_A396EmprCod ;
   private int[] T00BG13_A3253SolTraCod ;
   private int[] T00BG5_A3253SolTraCod ;
   private String[] T00BG5_A3254SolTraMat ;
   private boolean[] T00BG5_n3254SolTraMat ;
   private String[] T00BG5_A3255SolTraSer ;
   private boolean[] T00BG5_n3255SolTraSer ;
   private short[] T00BG5_A3256SolTraTip ;
   private boolean[] T00BG5_n3256SolTraTip ;
   private String[] T00BG5_A3257SolTraDisN ;
   private boolean[] T00BG5_n3257SolTraDisN ;
   private String[] T00BG5_A3258SolTraNom ;
   private boolean[] T00BG5_n3258SolTraNom ;
   private int[] T00BG5_A3259SolTraNum ;
   private boolean[] T00BG5_n3259SolTraNum ;
   private java.util.Date[] T00BG5_A3260SolTraFec ;
   private boolean[] T00BG5_n3260SolTraFec ;
   private int[] T00BG5_A3261SolTraCliC ;
   private boolean[] T00BG5_n3261SolTraCliC ;
   private String[] T00BG5_A3262SolTraCliN ;
   private boolean[] T00BG5_n3262SolTraCliN ;
   private String[] T00BG5_A3263SolTraAc ;
   private boolean[] T00BG5_n3263SolTraAc ;
   private String[] T00BG5_A3264SolTraMa ;
   private boolean[] T00BG5_n3264SolTraMa ;
   private String[] T00BG5_A3265SolTraNor ;
   private boolean[] T00BG5_n3265SolTraNor ;
   private String[] T00BG5_A3266SolTraMaq ;
   private boolean[] T00BG5_n3266SolTraMaq ;
   private String[] T00BG5_A3267SolTraRef ;
   private boolean[] T00BG5_n3267SolTraRef ;
   private byte[] T00BG5_A3268SolTraUlin ;
   private boolean[] T00BG5_n3268SolTraUlin ;
   private String[] T00BG5_A3759SolAciTac ;
   private boolean[] T00BG5_n3759SolAciTac ;
   private String[] T00BG5_A3760SolAciCo ;
   private boolean[] T00BG5_n3760SolAciCo ;
   private String[] T00BG5_A3761SolAciPa6 ;
   private boolean[] T00BG5_n3761SolAciPa6 ;
   private String[] T00BG5_A3762SolAciPes ;
   private boolean[] T00BG5_n3762SolAciPes ;
   private String[] T00BG5_A3763SolAciPac ;
   private boolean[] T00BG5_n3763SolAciPac ;
   private String[] T00BG5_A3764SolAciWo ;
   private boolean[] T00BG5_n3764SolAciWo ;
   private String[] T00BG5_A3765SolAciNorm ;
   private boolean[] T00BG5_n3765SolAciNorm ;
   private String[] T00BG5_A3766SolAlcTac ;
   private boolean[] T00BG5_n3766SolAlcTac ;
   private String[] T00BG5_A3767SolAlcCo ;
   private boolean[] T00BG5_n3767SolAlcCo ;
   private String[] T00BG5_A3768SolAlcPa6 ;
   private boolean[] T00BG5_n3768SolAlcPa6 ;
   private String[] T00BG5_A3769SolAlcPes ;
   private boolean[] T00BG5_n3769SolAlcPes ;
   private String[] T00BG5_A3770SolAlcPac ;
   private boolean[] T00BG5_n3770SolAlcPac ;
   private String[] T00BG5_A3771SolAlcWo ;
   private boolean[] T00BG5_n3771SolAlcWo ;
   private String[] T00BG5_A3772SolAlcNorm ;
   private boolean[] T00BG5_n3772SolAlcNorm ;
   private String[] T00BG5_A3773SolAquTac ;
   private boolean[] T00BG5_n3773SolAquTac ;
   private String[] T00BG5_A3774SolAquCo ;
   private boolean[] T00BG5_n3774SolAquCo ;
   private String[] T00BG5_A3775SolAquPa6 ;
   private boolean[] T00BG5_n3775SolAquPa6 ;
   private String[] T00BG5_A3776SolAquPes ;
   private boolean[] T00BG5_n3776SolAquPes ;
   private String[] T00BG5_A3777SolAquPac ;
   private boolean[] T00BG5_n3777SolAquPac ;
   private String[] T00BG5_A3778SolAquWo ;
   private boolean[] T00BG5_n3778SolAquWo ;
   private String[] T00BG5_A3779SolAquNorm ;
   private boolean[] T00BG5_n3779SolAquNorm ;
   private String[] T00BG5_A4025SolTraAcAl ;
   private boolean[] T00BG5_n4025SolTraAcAl ;
   private String[] T00BG5_A4026SolTraMaAl ;
   private boolean[] T00BG5_n4026SolTraMaAl ;
   private String[] T00BG5_A4027SolTraAcAc ;
   private boolean[] T00BG5_n4027SolTraAcAc ;
   private String[] T00BG5_A4028SolTraMaAc ;
   private boolean[] T00BG5_n4028SolTraMaAc ;
   private String[] T00BG5_A4029SolTraAcAq ;
   private boolean[] T00BG5_n4029SolTraAcAq ;
   private String[] T00BG5_A4030SolTraMaAq ;
   private boolean[] T00BG5_n4030SolTraMaAq ;
   private String[] T00BG5_A4381SolTraCoAq ;
   private boolean[] T00BG5_n4381SolTraCoAq ;
   private String[] T00BG5_A4382SolTraCoAc ;
   private boolean[] T00BG5_n4382SolTraCoAc ;
   private String[] T00BG5_A4383SolTraCoAl ;
   private boolean[] T00BG5_n4383SolTraCoAl ;
   private String[] T00BG5_A4952SolMarTac ;
   private boolean[] T00BG5_n4952SolMarTac ;
   private String[] T00BG5_A4953SolMarCo ;
   private boolean[] T00BG5_n4953SolMarCo ;
   private String[] T00BG5_A4954SolMarPa6 ;
   private boolean[] T00BG5_n4954SolMarPa6 ;
   private String[] T00BG5_A4955SolMarPes ;
   private boolean[] T00BG5_n4955SolMarPes ;
   private String[] T00BG5_A4956SolMarPac ;
   private boolean[] T00BG5_n4956SolMarPac ;
   private String[] T00BG5_A4957SolMarWo ;
   private boolean[] T00BG5_n4957SolMarWo ;
   private String[] T00BG5_A4958SolMarNorm ;
   private boolean[] T00BG5_n4958SolMarNorm ;
   private String[] T00BG5_A4959SolTraCoMa ;
   private boolean[] T00BG5_n4959SolTraCoMa ;
   private String[] T00BG5_A11796SolRqMn ;
   private boolean[] T00BG5_n11796SolRqMn ;
   private byte[] T00BG5_A11797SolRqMnSt ;
   private boolean[] T00BG5_n11797SolRqMnSt ;
   private String[] T00BG5_A11926SolMetodo ;
   private boolean[] T00BG5_n11926SolMetodo ;
   private String[] T00BG5_A396EmprCod ;
   private int[] T00BG5_A129BarCod ;
   private boolean[] T00BG5_n129BarCod ;
   private byte[] T00BG5_A132BarCodReo ;
   private boolean[] T00BG5_n132BarCodReo ;
   private String[] T00BG5_A130BarCodPar ;
   private boolean[] T00BG5_n130BarCodPar ;
   private int[] T00BG5_A652OpeCod ;
   private boolean[] T00BG5_n652OpeCod ;
   private String[] T00BG14_A396EmprCod ;
   private int[] T00BG14_A3253SolTraCod ;
   private String[] T00BG15_A396EmprCod ;
   private int[] T00BG15_A3253SolTraCod ;
   private int[] T00BG4_A3253SolTraCod ;
   private String[] T00BG4_A3254SolTraMat ;
   private boolean[] T00BG4_n3254SolTraMat ;
   private String[] T00BG4_A3255SolTraSer ;
   private boolean[] T00BG4_n3255SolTraSer ;
   private short[] T00BG4_A3256SolTraTip ;
   private boolean[] T00BG4_n3256SolTraTip ;
   private String[] T00BG4_A3257SolTraDisN ;
   private boolean[] T00BG4_n3257SolTraDisN ;
   private String[] T00BG4_A3258SolTraNom ;
   private boolean[] T00BG4_n3258SolTraNom ;
   private int[] T00BG4_A3259SolTraNum ;
   private boolean[] T00BG4_n3259SolTraNum ;
   private java.util.Date[] T00BG4_A3260SolTraFec ;
   private boolean[] T00BG4_n3260SolTraFec ;
   private int[] T00BG4_A3261SolTraCliC ;
   private boolean[] T00BG4_n3261SolTraCliC ;
   private String[] T00BG4_A3262SolTraCliN ;
   private boolean[] T00BG4_n3262SolTraCliN ;
   private String[] T00BG4_A3263SolTraAc ;
   private boolean[] T00BG4_n3263SolTraAc ;
   private String[] T00BG4_A3264SolTraMa ;
   private boolean[] T00BG4_n3264SolTraMa ;
   private String[] T00BG4_A3265SolTraNor ;
   private boolean[] T00BG4_n3265SolTraNor ;
   private String[] T00BG4_A3266SolTraMaq ;
   private boolean[] T00BG4_n3266SolTraMaq ;
   private String[] T00BG4_A3267SolTraRef ;
   private boolean[] T00BG4_n3267SolTraRef ;
   private byte[] T00BG4_A3268SolTraUlin ;
   private boolean[] T00BG4_n3268SolTraUlin ;
   private String[] T00BG4_A3759SolAciTac ;
   private boolean[] T00BG4_n3759SolAciTac ;
   private String[] T00BG4_A3760SolAciCo ;
   private boolean[] T00BG4_n3760SolAciCo ;
   private String[] T00BG4_A3761SolAciPa6 ;
   private boolean[] T00BG4_n3761SolAciPa6 ;
   private String[] T00BG4_A3762SolAciPes ;
   private boolean[] T00BG4_n3762SolAciPes ;
   private String[] T00BG4_A3763SolAciPac ;
   private boolean[] T00BG4_n3763SolAciPac ;
   private String[] T00BG4_A3764SolAciWo ;
   private boolean[] T00BG4_n3764SolAciWo ;
   private String[] T00BG4_A3765SolAciNorm ;
   private boolean[] T00BG4_n3765SolAciNorm ;
   private String[] T00BG4_A3766SolAlcTac ;
   private boolean[] T00BG4_n3766SolAlcTac ;
   private String[] T00BG4_A3767SolAlcCo ;
   private boolean[] T00BG4_n3767SolAlcCo ;
   private String[] T00BG4_A3768SolAlcPa6 ;
   private boolean[] T00BG4_n3768SolAlcPa6 ;
   private String[] T00BG4_A3769SolAlcPes ;
   private boolean[] T00BG4_n3769SolAlcPes ;
   private String[] T00BG4_A3770SolAlcPac ;
   private boolean[] T00BG4_n3770SolAlcPac ;
   private String[] T00BG4_A3771SolAlcWo ;
   private boolean[] T00BG4_n3771SolAlcWo ;
   private String[] T00BG4_A3772SolAlcNorm ;
   private boolean[] T00BG4_n3772SolAlcNorm ;
   private String[] T00BG4_A3773SolAquTac ;
   private boolean[] T00BG4_n3773SolAquTac ;
   private String[] T00BG4_A3774SolAquCo ;
   private boolean[] T00BG4_n3774SolAquCo ;
   private String[] T00BG4_A3775SolAquPa6 ;
   private boolean[] T00BG4_n3775SolAquPa6 ;
   private String[] T00BG4_A3776SolAquPes ;
   private boolean[] T00BG4_n3776SolAquPes ;
   private String[] T00BG4_A3777SolAquPac ;
   private boolean[] T00BG4_n3777SolAquPac ;
   private String[] T00BG4_A3778SolAquWo ;
   private boolean[] T00BG4_n3778SolAquWo ;
   private String[] T00BG4_A3779SolAquNorm ;
   private boolean[] T00BG4_n3779SolAquNorm ;
   private String[] T00BG4_A4025SolTraAcAl ;
   private boolean[] T00BG4_n4025SolTraAcAl ;
   private String[] T00BG4_A4026SolTraMaAl ;
   private boolean[] T00BG4_n4026SolTraMaAl ;
   private String[] T00BG4_A4027SolTraAcAc ;
   private boolean[] T00BG4_n4027SolTraAcAc ;
   private String[] T00BG4_A4028SolTraMaAc ;
   private boolean[] T00BG4_n4028SolTraMaAc ;
   private String[] T00BG4_A4029SolTraAcAq ;
   private boolean[] T00BG4_n4029SolTraAcAq ;
   private String[] T00BG4_A4030SolTraMaAq ;
   private boolean[] T00BG4_n4030SolTraMaAq ;
   private String[] T00BG4_A4381SolTraCoAq ;
   private boolean[] T00BG4_n4381SolTraCoAq ;
   private String[] T00BG4_A4382SolTraCoAc ;
   private boolean[] T00BG4_n4382SolTraCoAc ;
   private String[] T00BG4_A4383SolTraCoAl ;
   private boolean[] T00BG4_n4383SolTraCoAl ;
   private String[] T00BG4_A4952SolMarTac ;
   private boolean[] T00BG4_n4952SolMarTac ;
   private String[] T00BG4_A4953SolMarCo ;
   private boolean[] T00BG4_n4953SolMarCo ;
   private String[] T00BG4_A4954SolMarPa6 ;
   private boolean[] T00BG4_n4954SolMarPa6 ;
   private String[] T00BG4_A4955SolMarPes ;
   private boolean[] T00BG4_n4955SolMarPes ;
   private String[] T00BG4_A4956SolMarPac ;
   private boolean[] T00BG4_n4956SolMarPac ;
   private String[] T00BG4_A4957SolMarWo ;
   private boolean[] T00BG4_n4957SolMarWo ;
   private String[] T00BG4_A4958SolMarNorm ;
   private boolean[] T00BG4_n4958SolMarNorm ;
   private String[] T00BG4_A4959SolTraCoMa ;
   private boolean[] T00BG4_n4959SolTraCoMa ;
   private String[] T00BG4_A11796SolRqMn ;
   private boolean[] T00BG4_n11796SolRqMn ;
   private byte[] T00BG4_A11797SolRqMnSt ;
   private boolean[] T00BG4_n11797SolRqMnSt ;
   private String[] T00BG4_A11926SolMetodo ;
   private boolean[] T00BG4_n11926SolMetodo ;
   private String[] T00BG4_A396EmprCod ;
   private int[] T00BG4_A129BarCod ;
   private boolean[] T00BG4_n129BarCod ;
   private byte[] T00BG4_A132BarCodReo ;
   private boolean[] T00BG4_n132BarCodReo ;
   private String[] T00BG4_A130BarCodPar ;
   private boolean[] T00BG4_n130BarCodPar ;
   private int[] T00BG4_A652OpeCod ;
   private boolean[] T00BG4_n652OpeCod ;
   private String[] T00BG19_A407EmprNom ;
   private boolean[] T00BG19_n407EmprNom ;
   private String[] T00BG20_A653OpeNom ;
   private boolean[] T00BG20_n653OpeNom ;
   private String[] T00BG21_A396EmprCod ;
   private int[] T00BG21_A3253SolTraCod ;
   private int[] T00BG22_A3253SolTraCod ;
   private byte[] T00BG22_A3269SolTraLin ;
   private String[] T00BG22_A3270SolTraObs ;
   private boolean[] T00BG22_n3270SolTraObs ;
   private String[] T00BG22_A396EmprCod ;
   private String[] T00BG23_A396EmprCod ;
   private int[] T00BG23_A3253SolTraCod ;
   private byte[] T00BG23_A3269SolTraLin ;
   private int[] T00BG3_A3253SolTraCod ;
   private byte[] T00BG3_A3269SolTraLin ;
   private String[] T00BG3_A3270SolTraObs ;
   private boolean[] T00BG3_n3270SolTraObs ;
   private String[] T00BG3_A396EmprCod ;
   private int[] T00BG2_A3253SolTraCod ;
   private byte[] T00BG2_A3269SolTraLin ;
   private String[] T00BG2_A3270SolTraObs ;
   private boolean[] T00BG2_n3270SolTraObs ;
   private String[] T00BG2_A396EmprCod ;
   private String[] T00BG27_A396EmprCod ;
   private int[] T00BG27_A3253SolTraCod ;
   private byte[] T00BG27_A3269SolTraLin ;
   private String[] T00BG28_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttraspi__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttraspi__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttraspi__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttraspi__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttraspi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00BG2", "SELECT SolTraCod, SolTraLin, SolTraObs, EmprCod FROM TXPLTRASP WHERE EmprCod = ? AND SolTraCod = ? AND SolTraLin = ?  FOR UPDATE OF SolTraObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG3", "SELECT SolTraCod, SolTraLin, SolTraObs, EmprCod FROM TXPLTRASP WHERE EmprCod = ? AND SolTraCod = ? AND SolTraLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG4", "SELECT SolTraCod, SolTraMat, SolTraSer, SolTraTip, SolTraDisN, SolTraNom, SolTraNum, SolTraFec, SolTraCliC, SolTraCliN, SolTraAc, SolTraMa, SolTraNor, SolTraMaq, SolTraRef, SolTraUlin, SolAciTac, SolAciCo, SolAciPa6, SolAciPes, SolAciPac, SolAciWo, SolAciNorm, SolAlcTac, SolAlcCo, SolAlcPa6, SolAlcPes, SolAlcPac, SolAlcWo, SolAlcNorm, SolAquTac, SolAquCo, SolAquPa6, SolAquPes, SolAquPac, SolAquWo, SolAquNorm, SolTraAcAl, SolTraMaAl, SolTraAcAc, SolTraMaAc, SolTraAcAq, SolTraMaAq, SolTraCoAq, SolTraCoAc, SolTraCoAl, SolMarTac, SolMarCo, SolMarPa6, SolMarPes, SolMarPac, SolMarWo, SolMarNorm, SolTraCoMa, SolRqMn, SolRqMnSt, SolMetodo, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCTRASP WHERE EmprCod = ? AND SolTraCod = ?  FOR UPDATE OF SolTraMat, SolTraSer, SolTraTip, SolTraDisN, SolTraNom, SolTraNum, SolTraFec, SolTraCliC, SolTraCliN, SolTraAc, SolTraMa, SolTraNor, SolTraMaq, SolTraRef, SolTraUlin, SolAciTac, SolAciCo, SolAciPa6, SolAciPes, SolAciPac, SolAciWo, SolAciNorm, SolAlcTac, SolAlcCo, SolAlcPa6, SolAlcPes, SolAlcPac, SolAlcWo, SolAlcNorm, SolAquTac, SolAquCo, SolAquPa6, SolAquPes, SolAquPac, SolAquWo, SolAquNorm, SolTraAcAl, SolTraMaAl, SolTraAcAc, SolTraMaAc, SolTraAcAq, SolTraMaAq, SolTraCoAq, SolTraCoAc, SolTraCoAl, SolMarTac, SolMarCo, SolMarPa6, SolMarPes, SolMarPac, SolMarWo, SolMarNorm, SolTraCoMa, SolRqMn, SolRqMnSt, SolMetodo, BarCod, BarCodReo, BarCodPar, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG5", "SELECT SolTraCod, SolTraMat, SolTraSer, SolTraTip, SolTraDisN, SolTraNom, SolTraNum, SolTraFec, SolTraCliC, SolTraCliN, SolTraAc, SolTraMa, SolTraNor, SolTraMaq, SolTraRef, SolTraUlin, SolAciTac, SolAciCo, SolAciPa6, SolAciPes, SolAciPac, SolAciWo, SolAciNorm, SolAlcTac, SolAlcCo, SolAlcPa6, SolAlcPes, SolAlcPac, SolAlcWo, SolAlcNorm, SolAquTac, SolAquCo, SolAquPa6, SolAquPes, SolAquPac, SolAquWo, SolAquNorm, SolTraAcAl, SolTraMaAl, SolTraAcAc, SolTraMaAc, SolTraAcAq, SolTraMaAq, SolTraCoAq, SolTraCoAc, SolTraCoAl, SolMarTac, SolMarCo, SolMarPa6, SolMarPes, SolMarPac, SolMarWo, SolMarNorm, SolTraCoMa, SolRqMn, SolRqMnSt, SolMetodo, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCTRASP WHERE EmprCod = ? AND SolTraCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG8", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG9", "SELECT /*+ FIRST_ROWS(100) */ TM1.SolTraCod, T2.EmprNom, TM1.SolTraMat, TM1.SolTraSer, TM1.SolTraTip, TM1.SolTraDisN, TM1.SolTraNom, TM1.SolTraNum, TM1.SolTraFec, T3.OpeNom, TM1.SolTraCliC, TM1.SolTraCliN, TM1.SolTraAc, TM1.SolTraMa, TM1.SolTraNor, TM1.SolTraMaq, TM1.SolTraRef, TM1.SolTraUlin, TM1.SolAciTac, TM1.SolAciCo, TM1.SolAciPa6, TM1.SolAciPes, TM1.SolAciPac, TM1.SolAciWo, TM1.SolAciNorm, TM1.SolAlcTac, TM1.SolAlcCo, TM1.SolAlcPa6, TM1.SolAlcPes, TM1.SolAlcPac, TM1.SolAlcWo, TM1.SolAlcNorm, TM1.SolAquTac, TM1.SolAquCo, TM1.SolAquPa6, TM1.SolAquPes, TM1.SolAquPac, TM1.SolAquWo, TM1.SolAquNorm, TM1.SolTraAcAl, TM1.SolTraMaAl, TM1.SolTraAcAc, TM1.SolTraMaAc, TM1.SolTraAcAq, TM1.SolTraMaAq, TM1.SolTraCoAq, TM1.SolTraCoAc, TM1.SolTraCoAl, TM1.SolMarTac, TM1.SolMarCo, TM1.SolMarPa6, TM1.SolMarPes, TM1.SolMarPac, TM1.SolMarWo, TM1.SolMarNorm, TM1.SolTraCoMa, TM1.SolRqMn, TM1.SolRqMnSt, TM1.SolMetodo, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.OpeCod FROM ((TXPCTRASP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.SolTraCod = ? ORDER BY TM1.EmprCod, TM1.SolTraCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG11", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG12", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND SolTraCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolTraCod FROM TXPCTRASP WHERE ( EmprCod > ? or EmprCod = ? and SolTraCod > ?) ORDER BY EmprCod, SolTraCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00BG15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolTraCod FROM TXPCTRASP WHERE ( EmprCod < ? or EmprCod = ? and SolTraCod < ?) ORDER BY EmprCod DESC, SolTraCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00BG16", "INSERT INTO TXPCTRASP(SolTraCod, SolTraMat, SolTraSer, SolTraTip, SolTraDisN, SolTraNom, SolTraNum, SolTraFec, SolTraCliC, SolTraCliN, SolTraAc, SolTraMa, SolTraNor, SolTraMaq, SolTraRef, SolTraUlin, SolAciTac, SolAciCo, SolAciPa6, SolAciPes, SolAciPac, SolAciWo, SolAciNorm, SolAlcTac, SolAlcCo, SolAlcPa6, SolAlcPes, SolAlcPac, SolAlcWo, SolAlcNorm, SolAquTac, SolAquCo, SolAquPa6, SolAquPes, SolAquPac, SolAquWo, SolAquNorm, SolTraAcAl, SolTraMaAl, SolTraAcAc, SolTraMaAc, SolTraAcAq, SolTraMaAq, SolTraCoAq, SolTraCoAc, SolTraCoAl, SolMarTac, SolMarCo, SolMarPa6, SolMarPes, SolMarPac, SolMarWo, SolMarNorm, SolTraCoMa, SolRqMn, SolRqMnSt, SolMetodo, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCTRASP")
         ,new UpdateCursor("T00BG17", "UPDATE TXPCTRASP SET SolTraMat=?, SolTraSer=?, SolTraTip=?, SolTraDisN=?, SolTraNom=?, SolTraNum=?, SolTraFec=?, SolTraCliC=?, SolTraCliN=?, SolTraAc=?, SolTraMa=?, SolTraNor=?, SolTraMaq=?, SolTraRef=?, SolTraUlin=?, SolAciTac=?, SolAciCo=?, SolAciPa6=?, SolAciPes=?, SolAciPac=?, SolAciWo=?, SolAciNorm=?, SolAlcTac=?, SolAlcCo=?, SolAlcPa6=?, SolAlcPes=?, SolAlcPac=?, SolAlcWo=?, SolAlcNorm=?, SolAquTac=?, SolAquCo=?, SolAquPa6=?, SolAquPes=?, SolAquPac=?, SolAquWo=?, SolAquNorm=?, SolTraAcAl=?, SolTraMaAl=?, SolTraAcAc=?, SolTraMaAc=?, SolTraAcAq=?, SolTraMaAq=?, SolTraCoAq=?, SolTraCoAc=?, SolTraCoAl=?, SolMarTac=?, SolMarCo=?, SolMarPa6=?, SolMarPes=?, SolMarPac=?, SolMarWo=?, SolMarNorm=?, SolTraCoMa=?, SolRqMn=?, SolRqMnSt=?, SolMetodo=?, BarCod=?, BarCodReo=?, BarCodPar=?, OpeCod=?  WHERE EmprCod = ? AND SolTraCod = ?", GX_NOMASK, "TXPCTRASP")
         ,new UpdateCursor("T00BG18", "DELETE FROM TXPCTRASP  WHERE EmprCod = ? AND SolTraCod = ?", GX_NOMASK, "TXPCTRASP")
         ,new ForEachCursor("T00BG19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG20", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SolTraCod FROM TXPCTRASP ORDER BY EmprCod, SolTraCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG22", "SELECT SolTraCod, SolTraLin, SolTraObs, EmprCod FROM TXPLTRASP WHERE EmprCod = ? and SolTraCod = ? and SolTraLin = ? ORDER BY EmprCod, SolTraCod, SolTraLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG23", "SELECT EmprCod, SolTraCod, SolTraLin FROM TXPLTRASP WHERE EmprCod = ? AND SolTraCod = ? AND SolTraLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00BG24", "INSERT INTO TXPLTRASP(SolTraCod, SolTraLin, SolTraObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLTRASP")
         ,new UpdateCursor("T00BG25", "UPDATE TXPLTRASP SET SolTraObs=?  WHERE EmprCod = ? AND SolTraCod = ? AND SolTraLin = ?", GX_NOMASK, "TXPLTRASP")
         ,new UpdateCursor("T00BG26", "DELETE FROM TXPLTRASP  WHERE EmprCod = ? AND SolTraCod = ? AND SolTraLin = ?", GX_NOMASK, "TXPLTRASP")
         ,new ForEachCursor("T00BG27", "SELECT EmprCod, SolTraCod, SolTraLin FROM TXPLTRASP WHERE EmprCod = ? and SolTraCod = ? ORDER BY EmprCod, SolTraCod, SolTraLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BG28", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 3);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 3);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 3);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 3);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 3);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 3);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 3);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 3);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 3);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 3);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 3);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 20);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 3);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 3);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 3);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 3);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 3);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(43, 3);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 3);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(45, 3);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 3);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(47, 3);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 3);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(49, 3);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(50, 3);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(51, 3);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(52, 3);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 20);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(54, 3);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(55, 10);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((byte[]) buf[109])[0] = rslt.getByte(56);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(57, 20);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(58, 3);
               ((int[]) buf[114])[0] = rslt.getInt(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((byte[]) buf[116])[0] = rslt.getByte(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((int[]) buf[120])[0] = rslt.getInt(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 3);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 3);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 3);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 3);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 3);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 3);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 3);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 3);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 3);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 3);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 3);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 20);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 3);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 3);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 3);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 3);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 3);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(43, 3);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 3);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(45, 3);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 3);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(47, 3);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 3);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(49, 3);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(50, 3);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(51, 3);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(52, 3);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 20);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(54, 3);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(55, 10);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((byte[]) buf[109])[0] = rslt.getByte(56);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(57, 20);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(58, 3);
               ((int[]) buf[114])[0] = rslt.getInt(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((byte[]) buf[116])[0] = rslt.getByte(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((int[]) buf[120])[0] = rslt.getInt(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 15);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 3);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 3);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 3);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 3);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 3);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 3);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 3);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 3);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 3);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 3);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 3);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 3);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 20);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 3);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 3);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 3);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(43, 3);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 3);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(45, 3);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 3);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(47, 3);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 3);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(49, 3);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getString(50, 3);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(51, 3);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(52, 3);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 3);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(54, 3);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(55, 20);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(56, 3);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(57, 10);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((byte[]) buf[113])[0] = rslt.getByte(58);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getString(59, 20);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getString(60, 3);
               ((int[]) buf[118])[0] = rslt.getInt(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((byte[]) buf[120])[0] = rslt.getByte(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((int[]) buf[124])[0] = rslt.getInt(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 26 :
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
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
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
            case 10 :
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
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 13);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[14]);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 30);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 3);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 3);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 6);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 15);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[30]).byteValue());
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
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 3);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 3);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 3);
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
                  stmt.setString(24, (String)parms[46], 3);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 3);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 3);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 3);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 3);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 3);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 20);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[60], 3);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[62], 3);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 3);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[66], 3);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[68], 3);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[70], 3);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[72], 20);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[74], 3);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[76], 3);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[78], 3);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[80], 3);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[82], 3);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[84], 3);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[86], 3);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[88], 3);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[90], 3);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[92], 3);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[94], 3);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[96], 3);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[98], 3);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[100], 3);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[102], 3);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[104], 20);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[106], 3);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[108], 10);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(56, ((Number) parms[110]).byteValue());
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[112], 20);
               }
               stmt.setString(58, (String)parms[113], 3);
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(59, ((Number) parms[115]).intValue());
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(60, ((Number) parms[117]).byteValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[119], 1);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(62, ((Number) parms[121]).intValue());
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
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
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 13);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 30);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 3);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 3);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 15);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
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
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 3);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 3);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 3);
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
                  stmt.setString(23, (String)parms[45], 3);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 3);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 3);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 3);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 3);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 3);
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
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 3);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 3);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 3);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 3);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 3);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 3);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 20);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 3);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 3);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 3);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[79], 3);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[81], 3);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[83], 3);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[85], 3);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[87], 3);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[89], 3);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[91], 3);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[93], 3);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[95], 3);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[97], 3);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[99], 3);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[101], 3);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 20);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 3);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[107], 10);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(55, ((Number) parms[109]).byteValue());
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[111], 20);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(57, ((Number) parms[113]).intValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(58, ((Number) parms[115]).byteValue());
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[117], 1);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(60, ((Number) parms[119]).intValue());
               }
               stmt.setString(61, (String)parms[120], 3);
               stmt.setInt(62, ((Number) parms[121]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
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
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 22 :
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
            case 23 :
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
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
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
      }
   }

}

