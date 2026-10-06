package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tsolcor_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TEST SOLIDEZ PARA LAVADO", ""), (short)(0)) ;
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
      nRC_GXsfl_190 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_190"))) ;
      nGXsfl_190_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_190_idx"))) ;
      sGXsfl_190_idx = httpContext.GetPar( "sGXsfl_190_idx") ;
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

   public tsolcor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tsolcor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tsolcor_impl.class ));
   }

   public tsolcor_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TSOLCOR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero de Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1348SolColCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1348SolColCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1348SolColCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColCod_Jsonclick, 0, "", "", "", "", "", 1, edtSolColCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia Serie", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColMat_Internalname, GXutil.rtrim( A1352SolColMat), GXutil.rtrim( localUtil.format( A1352SolColMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColMat_Jsonclick, 0, "", "", "", "", "", 1, edtSolColMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColSer_Internalname, GXutil.rtrim( A1356SolColSer), GXutil.rtrim( localUtil.format( A1356SolColSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColSer_Jsonclick, 0, "", "", "", "", "", 1, edtSolColSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo de Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColTip_Internalname, GXutil.ltrim( localUtil.ntoc( A1358SolColTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1358SolColTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1358SolColTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColTip_Jsonclick, 0, "", "", "", "", "", 1, edtSolColTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColDisN_Internalname, GXutil.rtrim( A1349SolColDisN), GXutil.rtrim( localUtil.format( A1349SolColDisN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColDisN_Jsonclick, 0, "", "", "", "", "", 1, edtSolColDisN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColNom_Internalname, GXutil.rtrim( A1353SolColNom), GXutil.rtrim( localUtil.format( A1353SolColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColNom_Jsonclick, 0, "", "", "", "", "", 1, edtSolColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A1354SolColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1354SolColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1354SolColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColNum_Jsonclick, 0, "", "", "", "", "", 1, edtSolColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Test", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSolColFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColFec_Internalname, localUtil.format(A1350SolColFec, "99/99/99"), localUtil.format( A1350SolColFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColFec_Jsonclick, 0, "", "", "", "", "", 1, edtSolColFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSolColFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSolColFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TSOLCOR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Norma Iso", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColNor_Internalname, GXutil.rtrim( A3187SolColNor), GXutil.rtrim( localUtil.format( A3187SolColNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColNor_Jsonclick, 0, "", "", "", "", "", 1, edtSolColNor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColMaq_Internalname, GXutil.rtrim( A3188SolColMaq), GXutil.rtrim( localUtil.format( A3188SolColMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColMaq_Jsonclick, 0, "", "", "", "", "", 1, edtSolColMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Valor fibra Tac(Poliamida)", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColTac_Internalname, GXutil.rtrim( A3189SolColTac), GXutil.rtrim( localUtil.format( A3189SolColTac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColTac_Jsonclick, 0, "", "", "", "", "", 1, edtSolColTac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Valor Fibra Coto", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColCo_Internalname, GXutil.rtrim( A3190SolColCo), GXutil.rtrim( localUtil.format( A3190SolColCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColCo_Jsonclick, 0, "", "", "", "", "", 1, edtSolColCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Valor Fibra Pa6", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColPa6_Internalname, GXutil.rtrim( A3191SolColPa6), GXutil.rtrim( localUtil.format( A3191SolColPa6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColPa6_Jsonclick, 0, "", "", "", "", "", 1, edtSolColPa6_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Valor Fibra Pes", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColPes_Internalname, GXutil.rtrim( A3192SolColPes), GXutil.rtrim( localUtil.format( A3192SolColPes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColPes_Jsonclick, 0, "", "", "", "", "", 1, edtSolColPes_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Valor Fibra Pac", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColPac_Internalname, GXutil.rtrim( A3193SolColPac), GXutil.rtrim( localUtil.format( A3193SolColPac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColPac_Jsonclick, 0, "", "", "", "", "", 1, edtSolColPac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Valor Fibra Wool", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColWo_Internalname, GXutil.rtrim( A3194SolColWo), GXutil.rtrim( localUtil.format( A3194SolColWo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColWo_Jsonclick, 0, "", "", "", "", "", 1, edtSolColWo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "SolColCliCod", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A1346SolColCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColCliC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1346SolColCliC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1346SolColCliC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColCliC_Jsonclick, 0, "", "", "", "", "", 1, edtSolColCliC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Nombre Clliente", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColCliN_Internalname, GXutil.rtrim( A1347SolColCliN), GXutil.rtrim( localUtil.format( A1347SolColCliN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColCliN_Jsonclick, 0, "", "", "", "", "", 1, edtSolColCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Solidez del Color", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColSol_Internalname, GXutil.rtrim( A1357SolColSol), GXutil.rtrim( localUtil.format( A1357SolColSol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColSol_Jsonclick, 0, "", "", "", "", "", 1, edtSolColSol_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Alteracion del Color en Grados", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColAlt_Internalname, GXutil.rtrim( A1345SolColAlt), GXutil.rtrim( localUtil.format( A1345SolColAlt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColAlt_Jsonclick, 0, "", "", "", "", "", 1, edtSolColAlt_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Ultima Linea de Observaciones", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A1359SolColUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1359SolColUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1359SolColUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColUlin_Jsonclick, 0, "", "", "", "", "", 1, edtSolColUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "SolColRef", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColRef_Internalname, GXutil.rtrim( A3195SolColRef), GXutil.rtrim( localUtil.format( A3195SolColRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColRef_Jsonclick, 0, "", "", "", "", "", 1, edtSolColRef_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Temperatura", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColTmp_Internalname, GXutil.ltrim( localUtil.ntoc( A10918SolColTmp, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColTmp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10918SolColTmp), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10918SolColTmp), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColTmp_Jsonclick, 0, "", "", "", "", "", 1, edtSolColTmp_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Rq Minimo", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColRqM_Internalname, GXutil.rtrim( A11803SolColRqM), GXutil.rtrim( localUtil.format( A11803SolColRqM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColRqM_Jsonclick, 0, "", "", "", "", "", 1, edtSolColRqM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Evaulacion 0 fallo 1 ok", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColSt_Internalname, GXutil.ltrim( localUtil.ntoc( A11804SolColSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolColSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11804SolColSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11804SolColSt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColSt_Jsonclick, 0, "", "", "", "", "", 1, edtSolColSt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Metodo", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColMetd_Internalname, GXutil.rtrim( A11925SolColMetd), GXutil.rtrim( localUtil.format( A11925SolColMetd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColMetd_Jsonclick, 0, "", "", "", "", "", 1, edtSolColMetd_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Esferas", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TSOLCOR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolColEsfe_Internalname, GXutil.rtrim( A11924SolColEsfe), GXutil.rtrim( localUtil.format( A11924SolColEsfe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolColEsfe_Jsonclick, 0, "", "", "", "", "", 1, edtSolColEsfe_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSOLCOR.htm");
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
            scanStart4M189( ) ;
            while ( RcdFound189 != 0 )
            {
               init_level_properties189( ) ;
               getByPrimaryKey4M189( ) ;
               addRow4M189( ) ;
               scanNext4M189( ) ;
            }
            scanEnd4M189( ) ;
            nBlankRcdCount189 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal4M189( ) ;
         standaloneModal4M189( ) ;
         sMode189 = Gx_mode ;
         while ( nGXsfl_190_idx < nRC_GXsfl_190 )
         {
            bGXsfl_190_Refreshing = true ;
            readRow4M189( ) ;
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
               standaloneModal4M189( ) ;
            }
            sendRow4M189( ) ;
            bGXsfl_190_Refreshing = false ;
         }
         Gx_mode = sMode189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount189 = (short)(5) ;
         nRcdExists_189 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart4M189( ) ;
            while ( RcdFound189 != 0 )
            {
               sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_190189( ) ;
               init_level_properties189( ) ;
               standaloneNotModal4M189( ) ;
               getByPrimaryKey4M189( ) ;
               standaloneModal4M189( ) ;
               addRow4M189( ) ;
               scanNext4M189( ) ;
            }
            scanEnd4M189( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode189 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_190189( ) ;
      initAll4M189( ) ;
      init_level_properties189( ) ;
      nRcdExists_189 = (short)(0) ;
      nIsMod_189 = (short)(0) ;
      nRcdDeleted_189 = (short)(0) ;
      nBlankRcdCount189 = (short)(nBlankRcdUsr189+nBlankRcdCount189) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount189 > 0 )
      {
         standaloneNotModal4M189( ) ;
         standaloneModal4M189( ) ;
         addRow4M189( ) ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSOLCOR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TSOLCOR.htm");
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
         Z1348SolColCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1348SolColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Z11925SolColMetd = httpContext.cgiGet( "Z11925SolColMetd") ;
         Z11924SolColEsfe = httpContext.cgiGet( "Z11924SolColEsfe") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_190 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_190"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolColTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolColTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLCOLTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolColTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1358SolColTip = (short)(0) ;
            n1358SolColTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         }
         else
         {
            A1358SolColTip = (short)(localUtil.ctol( httpContext.cgiGet( edtSolColTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1358SolColTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         }
         A1349SolColDisN = httpContext.cgiGet( edtSolColDisN_Internalname) ;
         n1349SolColDisN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
         A1353SolColNom = httpContext.cgiGet( edtSolColNom_Internalname) ;
         n1353SolColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1354SolColNum = 0 ;
            n1354SolColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         }
         else
         {
            A1354SolColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtSolColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1354SolColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         }
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolColCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolColCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLCOLCLIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolColCliC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1346SolColCliC = 0 ;
            n1346SolColCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         }
         else
         {
            A1346SolColCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtSolColCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1346SolColCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         }
         A1347SolColCliN = httpContext.cgiGet( edtSolColCliN_Internalname) ;
         n1347SolColCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
         A1357SolColSol = httpContext.cgiGet( edtSolColSol_Internalname) ;
         n1357SolColSol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1357SolColSol", A1357SolColSol);
         A1345SolColAlt = httpContext.cgiGet( edtSolColAlt_Internalname) ;
         n1345SolColAlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1345SolColAlt", A1345SolColAlt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolColUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolColUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLCOLULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolColUlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1359SolColUlin = (byte)(0) ;
            n1359SolColUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         }
         else
         {
            A1359SolColUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolColUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1359SolColUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         }
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
         A11925SolColMetd = httpContext.cgiGet( edtSolColMetd_Internalname) ;
         n11925SolColMetd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
         A11924SolColEsfe = httpContext.cgiGet( edtSolColEsfe_Internalname) ;
         n11924SolColEsfe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", A11924SolColEsfe);
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
            initAll4M188( ) ;
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
      disableAttributes4M188( ) ;
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

   public void confirm_4M0( )
   {
      beforeValidate4M188( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls4M188( ) ;
         }
         else
         {
            checkExtendedTable4M188( ) ;
            if ( AnyError == 0 )
            {
               zm4M188( 2) ;
               zm4M188( 3) ;
               zm4M188( 4) ;
            }
            closeExtendedTableCursors4M188( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode188 = Gx_mode ;
         confirm_4M189( ) ;
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
         confirmValues4M0( ) ;
      }
   }

   public void confirm_4M189( )
   {
      nGXsfl_190_idx = 0 ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         readRow4M189( ) ;
         if ( ( nRcdExists_189 != 0 ) || ( nIsMod_189 != 0 ) )
         {
            getKey4M189( ) ;
            if ( ( nRcdExists_189 == 0 ) && ( nRcdDeleted_189 == 0 ) )
            {
               if ( RcdFound189 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate4M189( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable4M189( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors4M189( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
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
                     getByPrimaryKey4M189( ) ;
                     load4M189( ) ;
                     beforeValidate4M189( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls4M189( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_189 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate4M189( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable4M189( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors4M189( ) ;
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
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption4M0( )
   {
   }

   public void zm4M188( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1352SolColMat = T004M5_A1352SolColMat[0] ;
            Z1356SolColSer = T004M5_A1356SolColSer[0] ;
            Z1358SolColTip = T004M5_A1358SolColTip[0] ;
            Z1349SolColDisN = T004M5_A1349SolColDisN[0] ;
            Z1353SolColNom = T004M5_A1353SolColNom[0] ;
            Z1354SolColNum = T004M5_A1354SolColNum[0] ;
            Z1350SolColFec = T004M5_A1350SolColFec[0] ;
            Z3187SolColNor = T004M5_A3187SolColNor[0] ;
            Z3188SolColMaq = T004M5_A3188SolColMaq[0] ;
            Z3189SolColTac = T004M5_A3189SolColTac[0] ;
            Z3190SolColCo = T004M5_A3190SolColCo[0] ;
            Z3191SolColPa6 = T004M5_A3191SolColPa6[0] ;
            Z3192SolColPes = T004M5_A3192SolColPes[0] ;
            Z3193SolColPac = T004M5_A3193SolColPac[0] ;
            Z3194SolColWo = T004M5_A3194SolColWo[0] ;
            Z1346SolColCliC = T004M5_A1346SolColCliC[0] ;
            Z1347SolColCliN = T004M5_A1347SolColCliN[0] ;
            Z1357SolColSol = T004M5_A1357SolColSol[0] ;
            Z1345SolColAlt = T004M5_A1345SolColAlt[0] ;
            Z1359SolColUlin = T004M5_A1359SolColUlin[0] ;
            Z3195SolColRef = T004M5_A3195SolColRef[0] ;
            Z10918SolColTmp = T004M5_A10918SolColTmp[0] ;
            Z11803SolColRqM = T004M5_A11803SolColRqM[0] ;
            Z11804SolColSt = T004M5_A11804SolColSt[0] ;
            Z11925SolColMetd = T004M5_A11925SolColMetd[0] ;
            Z11924SolColEsfe = T004M5_A11924SolColEsfe[0] ;
            Z129BarCod = T004M5_A129BarCod[0] ;
            Z132BarCodReo = T004M5_A132BarCodReo[0] ;
            Z130BarCodPar = T004M5_A130BarCodPar[0] ;
            Z652OpeCod = T004M5_A652OpeCod[0] ;
         }
         else
         {
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
            Z11925SolColMetd = A11925SolColMetd ;
            Z11924SolColEsfe = A11924SolColEsfe ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z1348SolColCod = A1348SolColCod ;
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
         Z11925SolColMetd = A11925SolColMetd ;
         Z11924SolColEsfe = A11924SolColEsfe ;
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

   public void load4M188( )
   {
      /* Using cursor T004M9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound188 = (short)(1) ;
         A407EmprNom = T004M9_A407EmprNom[0] ;
         n407EmprNom = T004M9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1352SolColMat = T004M9_A1352SolColMat[0] ;
         n1352SolColMat = T004M9_n1352SolColMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
         A1356SolColSer = T004M9_A1356SolColSer[0] ;
         n1356SolColSer = T004M9_n1356SolColSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
         A1358SolColTip = T004M9_A1358SolColTip[0] ;
         n1358SolColTip = T004M9_n1358SolColTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         A1349SolColDisN = T004M9_A1349SolColDisN[0] ;
         n1349SolColDisN = T004M9_n1349SolColDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
         A1353SolColNom = T004M9_A1353SolColNom[0] ;
         n1353SolColNom = T004M9_n1353SolColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
         A1354SolColNum = T004M9_A1354SolColNum[0] ;
         n1354SolColNum = T004M9_n1354SolColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         A1350SolColFec = T004M9_A1350SolColFec[0] ;
         n1350SolColFec = T004M9_n1350SolColFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
         A3187SolColNor = T004M9_A3187SolColNor[0] ;
         n3187SolColNor = T004M9_n3187SolColNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3187SolColNor", A3187SolColNor);
         A3188SolColMaq = T004M9_A3188SolColMaq[0] ;
         n3188SolColMaq = T004M9_n3188SolColMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
         A3189SolColTac = T004M9_A3189SolColTac[0] ;
         n3189SolColTac = T004M9_n3189SolColTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3189SolColTac", A3189SolColTac);
         A3190SolColCo = T004M9_A3190SolColCo[0] ;
         n3190SolColCo = T004M9_n3190SolColCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3190SolColCo", A3190SolColCo);
         A3191SolColPa6 = T004M9_A3191SolColPa6[0] ;
         n3191SolColPa6 = T004M9_n3191SolColPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3191SolColPa6", A3191SolColPa6);
         A3192SolColPes = T004M9_A3192SolColPes[0] ;
         n3192SolColPes = T004M9_n3192SolColPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3192SolColPes", A3192SolColPes);
         A3193SolColPac = T004M9_A3193SolColPac[0] ;
         n3193SolColPac = T004M9_n3193SolColPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3193SolColPac", A3193SolColPac);
         A3194SolColWo = T004M9_A3194SolColWo[0] ;
         n3194SolColWo = T004M9_n3194SolColWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3194SolColWo", A3194SolColWo);
         A653OpeNom = T004M9_A653OpeNom[0] ;
         n653OpeNom = T004M9_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A1346SolColCliC = T004M9_A1346SolColCliC[0] ;
         n1346SolColCliC = T004M9_n1346SolColCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         A1347SolColCliN = T004M9_A1347SolColCliN[0] ;
         n1347SolColCliN = T004M9_n1347SolColCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
         A1357SolColSol = T004M9_A1357SolColSol[0] ;
         n1357SolColSol = T004M9_n1357SolColSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1357SolColSol", A1357SolColSol);
         A1345SolColAlt = T004M9_A1345SolColAlt[0] ;
         n1345SolColAlt = T004M9_n1345SolColAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1345SolColAlt", A1345SolColAlt);
         A1359SolColUlin = T004M9_A1359SolColUlin[0] ;
         n1359SolColUlin = T004M9_n1359SolColUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         A3195SolColRef = T004M9_A3195SolColRef[0] ;
         n3195SolColRef = T004M9_n3195SolColRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
         A10918SolColTmp = T004M9_A10918SolColTmp[0] ;
         n10918SolColTmp = T004M9_n10918SolColTmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
         A11803SolColRqM = T004M9_A11803SolColRqM[0] ;
         n11803SolColRqM = T004M9_n11803SolColRqM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
         A11804SolColSt = T004M9_A11804SolColSt[0] ;
         n11804SolColSt = T004M9_n11804SolColSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
         A11925SolColMetd = T004M9_A11925SolColMetd[0] ;
         n11925SolColMetd = T004M9_n11925SolColMetd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
         A11924SolColEsfe = T004M9_A11924SolColEsfe[0] ;
         n11924SolColEsfe = T004M9_n11924SolColEsfe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", A11924SolColEsfe);
         A129BarCod = T004M9_A129BarCod[0] ;
         n129BarCod = T004M9_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T004M9_A132BarCodReo[0] ;
         n132BarCodReo = T004M9_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T004M9_A130BarCodPar[0] ;
         n130BarCodPar = T004M9_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T004M9_A652OpeCod[0] ;
         n652OpeCod = T004M9_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zm4M188( -1) ;
      }
      pr_default.close(7);
      onLoadActions4M188( ) ;
   }

   public void onLoadActions4M188( )
   {
   }

   public void checkExtendedTable4M188( )
   {
      nIsDirty_188 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T004M6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T004M6_A407EmprNom[0] ;
      n407EmprNom = T004M6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T004M7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T004M8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T004M8_A653OpeNom[0] ;
      n653OpeNom = T004M8_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors4M188( )
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
      /* Using cursor T004M10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T004M10_A407EmprNom[0] ;
      n407EmprNom = T004M10_n407EmprNom[0] ;
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
      /* Using cursor T004M11 */
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
      /* Using cursor T004M12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T004M12_A653OpeNom[0] ;
      n653OpeNom = T004M12_n653OpeNom[0] ;
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

   public void getKey4M188( )
   {
      /* Using cursor T004M13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound188 = (short)(1) ;
      }
      else
      {
         RcdFound188 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T004M5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm4M188( 1) ;
         RcdFound188 = (short)(1) ;
         A1348SolColCod = T004M5_A1348SolColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
         A1352SolColMat = T004M5_A1352SolColMat[0] ;
         n1352SolColMat = T004M5_n1352SolColMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1352SolColMat", A1352SolColMat);
         A1356SolColSer = T004M5_A1356SolColSer[0] ;
         n1356SolColSer = T004M5_n1356SolColSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1356SolColSer", A1356SolColSer);
         A1358SolColTip = T004M5_A1358SolColTip[0] ;
         n1358SolColTip = T004M5_n1358SolColTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1358SolColTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1358SolColTip), 4, 0));
         A1349SolColDisN = T004M5_A1349SolColDisN[0] ;
         n1349SolColDisN = T004M5_n1349SolColDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1349SolColDisN", A1349SolColDisN);
         A1353SolColNom = T004M5_A1353SolColNom[0] ;
         n1353SolColNom = T004M5_n1353SolColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1353SolColNom", A1353SolColNom);
         A1354SolColNum = T004M5_A1354SolColNum[0] ;
         n1354SolColNum = T004M5_n1354SolColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1354SolColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1354SolColNum), 6, 0));
         A1350SolColFec = T004M5_A1350SolColFec[0] ;
         n1350SolColFec = T004M5_n1350SolColFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
         A3187SolColNor = T004M5_A3187SolColNor[0] ;
         n3187SolColNor = T004M5_n3187SolColNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3187SolColNor", A3187SolColNor);
         A3188SolColMaq = T004M5_A3188SolColMaq[0] ;
         n3188SolColMaq = T004M5_n3188SolColMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3188SolColMaq", A3188SolColMaq);
         A3189SolColTac = T004M5_A3189SolColTac[0] ;
         n3189SolColTac = T004M5_n3189SolColTac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3189SolColTac", A3189SolColTac);
         A3190SolColCo = T004M5_A3190SolColCo[0] ;
         n3190SolColCo = T004M5_n3190SolColCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3190SolColCo", A3190SolColCo);
         A3191SolColPa6 = T004M5_A3191SolColPa6[0] ;
         n3191SolColPa6 = T004M5_n3191SolColPa6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3191SolColPa6", A3191SolColPa6);
         A3192SolColPes = T004M5_A3192SolColPes[0] ;
         n3192SolColPes = T004M5_n3192SolColPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3192SolColPes", A3192SolColPes);
         A3193SolColPac = T004M5_A3193SolColPac[0] ;
         n3193SolColPac = T004M5_n3193SolColPac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3193SolColPac", A3193SolColPac);
         A3194SolColWo = T004M5_A3194SolColWo[0] ;
         n3194SolColWo = T004M5_n3194SolColWo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3194SolColWo", A3194SolColWo);
         A1346SolColCliC = T004M5_A1346SolColCliC[0] ;
         n1346SolColCliC = T004M5_n1346SolColCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1346SolColCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1346SolColCliC), 6, 0));
         A1347SolColCliN = T004M5_A1347SolColCliN[0] ;
         n1347SolColCliN = T004M5_n1347SolColCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1347SolColCliN", A1347SolColCliN);
         A1357SolColSol = T004M5_A1357SolColSol[0] ;
         n1357SolColSol = T004M5_n1357SolColSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1357SolColSol", A1357SolColSol);
         A1345SolColAlt = T004M5_A1345SolColAlt[0] ;
         n1345SolColAlt = T004M5_n1345SolColAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1345SolColAlt", A1345SolColAlt);
         A1359SolColUlin = T004M5_A1359SolColUlin[0] ;
         n1359SolColUlin = T004M5_n1359SolColUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1359SolColUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1359SolColUlin), 2, 0));
         A3195SolColRef = T004M5_A3195SolColRef[0] ;
         n3195SolColRef = T004M5_n3195SolColRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3195SolColRef", A3195SolColRef);
         A10918SolColTmp = T004M5_A10918SolColTmp[0] ;
         n10918SolColTmp = T004M5_n10918SolColTmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
         A11803SolColRqM = T004M5_A11803SolColRqM[0] ;
         n11803SolColRqM = T004M5_n11803SolColRqM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
         A11804SolColSt = T004M5_A11804SolColSt[0] ;
         n11804SolColSt = T004M5_n11804SolColSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
         A11925SolColMetd = T004M5_A11925SolColMetd[0] ;
         n11925SolColMetd = T004M5_n11925SolColMetd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
         A11924SolColEsfe = T004M5_A11924SolColEsfe[0] ;
         n11924SolColEsfe = T004M5_n11924SolColEsfe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", A11924SolColEsfe);
         A396EmprCod = T004M5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T004M5_A129BarCod[0] ;
         n129BarCod = T004M5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T004M5_A132BarCodReo[0] ;
         n132BarCodReo = T004M5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T004M5_A130BarCodPar[0] ;
         n130BarCodPar = T004M5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T004M5_A652OpeCod[0] ;
         n652OpeCod = T004M5_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z1348SolColCod = A1348SolColCod ;
         sMode188 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load4M188( ) ;
         if ( AnyError == 1 )
         {
            RcdFound188 = (short)(0) ;
            initializeNonKey4M188( ) ;
         }
         Gx_mode = sMode188 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound188 = (short)(0) ;
         initializeNonKey4M188( ) ;
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
      getKey4M188( ) ;
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
      /* Using cursor T004M14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A1348SolColCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T004M14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T004M14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004M14_A1348SolColCod[0] < A1348SolColCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T004M14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T004M14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004M14_A1348SolColCod[0] > A1348SolColCod ) ) )
         {
            A396EmprCod = T004M14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1348SolColCod = T004M14_A1348SolColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
            RcdFound188 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound188 = (short)(0) ;
      /* Using cursor T004M15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A1348SolColCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T004M15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T004M15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004M15_A1348SolColCod[0] > A1348SolColCod ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T004M15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T004M15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T004M15_A1348SolColCod[0] < A1348SolColCod ) ) )
         {
            A396EmprCod = T004M15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1348SolColCod = T004M15_A1348SolColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
            RcdFound188 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey4M188( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert4M188( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A1348SolColCod = Z1348SolColCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
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
               update4M188( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert4M188( ) ;
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
                  insert4M188( ) ;
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
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1348SolColCod = Z1348SolColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
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
      getKey4M188( ) ;
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
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tsolcor");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_4M0( ) ;
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
      scanStart4M188( ) ;
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
      scanEnd4M188( ) ;
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
      scanStart4M188( ) ;
      if ( RcdFound188 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound188 != 0 )
         {
            scanNext4M188( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd4M188( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency4M188( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T004M4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCSOLCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z1352SolColMat, T004M4_A1352SolColMat[0]) != 0 ) || ( GXutil.strcmp(Z1356SolColSer, T004M4_A1356SolColSer[0]) != 0 ) || ( Z1358SolColTip != T004M4_A1358SolColTip[0] ) || ( GXutil.strcmp(Z1349SolColDisN, T004M4_A1349SolColDisN[0]) != 0 ) || ( GXutil.strcmp(Z1353SolColNom, T004M4_A1353SolColNom[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1354SolColNum != T004M4_A1354SolColNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z1350SolColFec), GXutil.resetTime(T004M4_A1350SolColFec[0])) ) || ( GXutil.strcmp(Z3187SolColNor, T004M4_A3187SolColNor[0]) != 0 ) || ( GXutil.strcmp(Z3188SolColMaq, T004M4_A3188SolColMaq[0]) != 0 ) || ( GXutil.strcmp(Z3189SolColTac, T004M4_A3189SolColTac[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3190SolColCo, T004M4_A3190SolColCo[0]) != 0 ) || ( GXutil.strcmp(Z3191SolColPa6, T004M4_A3191SolColPa6[0]) != 0 ) || ( GXutil.strcmp(Z3192SolColPes, T004M4_A3192SolColPes[0]) != 0 ) || ( GXutil.strcmp(Z3193SolColPac, T004M4_A3193SolColPac[0]) != 0 ) || ( GXutil.strcmp(Z3194SolColWo, T004M4_A3194SolColWo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1346SolColCliC != T004M4_A1346SolColCliC[0] ) || ( GXutil.strcmp(Z1347SolColCliN, T004M4_A1347SolColCliN[0]) != 0 ) || ( GXutil.strcmp(Z1357SolColSol, T004M4_A1357SolColSol[0]) != 0 ) || ( GXutil.strcmp(Z1345SolColAlt, T004M4_A1345SolColAlt[0]) != 0 ) || ( Z1359SolColUlin != T004M4_A1359SolColUlin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3195SolColRef, T004M4_A3195SolColRef[0]) != 0 ) || ( Z10918SolColTmp != T004M4_A10918SolColTmp[0] ) || ( GXutil.strcmp(Z11803SolColRqM, T004M4_A11803SolColRqM[0]) != 0 ) || ( Z11804SolColSt != T004M4_A11804SolColSt[0] ) || ( GXutil.strcmp(Z11925SolColMetd, T004M4_A11925SolColMetd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11924SolColEsfe, T004M4_A11924SolColEsfe[0]) != 0 ) || ( Z129BarCod != T004M4_A129BarCod[0] ) || ( Z132BarCodReo != T004M4_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T004M4_A130BarCodPar[0]) != 0 ) || ( Z652OpeCod != T004M4_A652OpeCod[0] ) )
         {
            if ( GXutil.strcmp(Z1352SolColMat, T004M4_A1352SolColMat[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColMat");
               GXutil.writeLogRaw("Old: ",Z1352SolColMat);
               GXutil.writeLogRaw("Current: ",T004M4_A1352SolColMat[0]);
            }
            if ( GXutil.strcmp(Z1356SolColSer, T004M4_A1356SolColSer[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColSer");
               GXutil.writeLogRaw("Old: ",Z1356SolColSer);
               GXutil.writeLogRaw("Current: ",T004M4_A1356SolColSer[0]);
            }
            if ( Z1358SolColTip != T004M4_A1358SolColTip[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColTip");
               GXutil.writeLogRaw("Old: ",Z1358SolColTip);
               GXutil.writeLogRaw("Current: ",T004M4_A1358SolColTip[0]);
            }
            if ( GXutil.strcmp(Z1349SolColDisN, T004M4_A1349SolColDisN[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColDisN");
               GXutil.writeLogRaw("Old: ",Z1349SolColDisN);
               GXutil.writeLogRaw("Current: ",T004M4_A1349SolColDisN[0]);
            }
            if ( GXutil.strcmp(Z1353SolColNom, T004M4_A1353SolColNom[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColNom");
               GXutil.writeLogRaw("Old: ",Z1353SolColNom);
               GXutil.writeLogRaw("Current: ",T004M4_A1353SolColNom[0]);
            }
            if ( Z1354SolColNum != T004M4_A1354SolColNum[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColNum");
               GXutil.writeLogRaw("Old: ",Z1354SolColNum);
               GXutil.writeLogRaw("Current: ",T004M4_A1354SolColNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z1350SolColFec), GXutil.resetTime(T004M4_A1350SolColFec[0])) ) )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColFec");
               GXutil.writeLogRaw("Old: ",Z1350SolColFec);
               GXutil.writeLogRaw("Current: ",T004M4_A1350SolColFec[0]);
            }
            if ( GXutil.strcmp(Z3187SolColNor, T004M4_A3187SolColNor[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColNor");
               GXutil.writeLogRaw("Old: ",Z3187SolColNor);
               GXutil.writeLogRaw("Current: ",T004M4_A3187SolColNor[0]);
            }
            if ( GXutil.strcmp(Z3188SolColMaq, T004M4_A3188SolColMaq[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColMaq");
               GXutil.writeLogRaw("Old: ",Z3188SolColMaq);
               GXutil.writeLogRaw("Current: ",T004M4_A3188SolColMaq[0]);
            }
            if ( GXutil.strcmp(Z3189SolColTac, T004M4_A3189SolColTac[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColTac");
               GXutil.writeLogRaw("Old: ",Z3189SolColTac);
               GXutil.writeLogRaw("Current: ",T004M4_A3189SolColTac[0]);
            }
            if ( GXutil.strcmp(Z3190SolColCo, T004M4_A3190SolColCo[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColCo");
               GXutil.writeLogRaw("Old: ",Z3190SolColCo);
               GXutil.writeLogRaw("Current: ",T004M4_A3190SolColCo[0]);
            }
            if ( GXutil.strcmp(Z3191SolColPa6, T004M4_A3191SolColPa6[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColPa6");
               GXutil.writeLogRaw("Old: ",Z3191SolColPa6);
               GXutil.writeLogRaw("Current: ",T004M4_A3191SolColPa6[0]);
            }
            if ( GXutil.strcmp(Z3192SolColPes, T004M4_A3192SolColPes[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColPes");
               GXutil.writeLogRaw("Old: ",Z3192SolColPes);
               GXutil.writeLogRaw("Current: ",T004M4_A3192SolColPes[0]);
            }
            if ( GXutil.strcmp(Z3193SolColPac, T004M4_A3193SolColPac[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColPac");
               GXutil.writeLogRaw("Old: ",Z3193SolColPac);
               GXutil.writeLogRaw("Current: ",T004M4_A3193SolColPac[0]);
            }
            if ( GXutil.strcmp(Z3194SolColWo, T004M4_A3194SolColWo[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColWo");
               GXutil.writeLogRaw("Old: ",Z3194SolColWo);
               GXutil.writeLogRaw("Current: ",T004M4_A3194SolColWo[0]);
            }
            if ( Z1346SolColCliC != T004M4_A1346SolColCliC[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColCliC");
               GXutil.writeLogRaw("Old: ",Z1346SolColCliC);
               GXutil.writeLogRaw("Current: ",T004M4_A1346SolColCliC[0]);
            }
            if ( GXutil.strcmp(Z1347SolColCliN, T004M4_A1347SolColCliN[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColCliN");
               GXutil.writeLogRaw("Old: ",Z1347SolColCliN);
               GXutil.writeLogRaw("Current: ",T004M4_A1347SolColCliN[0]);
            }
            if ( GXutil.strcmp(Z1357SolColSol, T004M4_A1357SolColSol[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColSol");
               GXutil.writeLogRaw("Old: ",Z1357SolColSol);
               GXutil.writeLogRaw("Current: ",T004M4_A1357SolColSol[0]);
            }
            if ( GXutil.strcmp(Z1345SolColAlt, T004M4_A1345SolColAlt[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColAlt");
               GXutil.writeLogRaw("Old: ",Z1345SolColAlt);
               GXutil.writeLogRaw("Current: ",T004M4_A1345SolColAlt[0]);
            }
            if ( Z1359SolColUlin != T004M4_A1359SolColUlin[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColUlin");
               GXutil.writeLogRaw("Old: ",Z1359SolColUlin);
               GXutil.writeLogRaw("Current: ",T004M4_A1359SolColUlin[0]);
            }
            if ( GXutil.strcmp(Z3195SolColRef, T004M4_A3195SolColRef[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColRef");
               GXutil.writeLogRaw("Old: ",Z3195SolColRef);
               GXutil.writeLogRaw("Current: ",T004M4_A3195SolColRef[0]);
            }
            if ( Z10918SolColTmp != T004M4_A10918SolColTmp[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColTmp");
               GXutil.writeLogRaw("Old: ",Z10918SolColTmp);
               GXutil.writeLogRaw("Current: ",T004M4_A10918SolColTmp[0]);
            }
            if ( GXutil.strcmp(Z11803SolColRqM, T004M4_A11803SolColRqM[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColRqM");
               GXutil.writeLogRaw("Old: ",Z11803SolColRqM);
               GXutil.writeLogRaw("Current: ",T004M4_A11803SolColRqM[0]);
            }
            if ( Z11804SolColSt != T004M4_A11804SolColSt[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColSt");
               GXutil.writeLogRaw("Old: ",Z11804SolColSt);
               GXutil.writeLogRaw("Current: ",T004M4_A11804SolColSt[0]);
            }
            if ( GXutil.strcmp(Z11925SolColMetd, T004M4_A11925SolColMetd[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColMetd");
               GXutil.writeLogRaw("Old: ",Z11925SolColMetd);
               GXutil.writeLogRaw("Current: ",T004M4_A11925SolColMetd[0]);
            }
            if ( GXutil.strcmp(Z11924SolColEsfe, T004M4_A11924SolColEsfe[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColEsfe");
               GXutil.writeLogRaw("Old: ",Z11924SolColEsfe);
               GXutil.writeLogRaw("Current: ",T004M4_A11924SolColEsfe[0]);
            }
            if ( Z129BarCod != T004M4_A129BarCod[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T004M4_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T004M4_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T004M4_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T004M4_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T004M4_A130BarCodPar[0]);
            }
            if ( Z652OpeCod != T004M4_A652OpeCod[0] )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T004M4_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCSOLCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert4M188( )
   {
      beforeValidate4M188( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable4M188( ) ;
      }
      if ( AnyError == 0 )
      {
         zm4M188( 0) ;
         checkOptimisticConcurrency4M188( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm4M188( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert4M188( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004M16 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A1348SolColCod), Boolean.valueOf(n1352SolColMat), A1352SolColMat, Boolean.valueOf(n1356SolColSer), A1356SolColSer, Boolean.valueOf(n1358SolColTip), Short.valueOf(A1358SolColTip), Boolean.valueOf(n1349SolColDisN), A1349SolColDisN, Boolean.valueOf(n1353SolColNom), A1353SolColNom, Boolean.valueOf(n1354SolColNum), Integer.valueOf(A1354SolColNum), Boolean.valueOf(n1350SolColFec), A1350SolColFec, Boolean.valueOf(n3187SolColNor), A3187SolColNor, Boolean.valueOf(n3188SolColMaq), A3188SolColMaq, Boolean.valueOf(n3189SolColTac), A3189SolColTac, Boolean.valueOf(n3190SolColCo), A3190SolColCo, Boolean.valueOf(n3191SolColPa6), A3191SolColPa6, Boolean.valueOf(n3192SolColPes), A3192SolColPes, Boolean.valueOf(n3193SolColPac), A3193SolColPac, Boolean.valueOf(n3194SolColWo), A3194SolColWo, Boolean.valueOf(n1346SolColCliC), Integer.valueOf(A1346SolColCliC), Boolean.valueOf(n1347SolColCliN), A1347SolColCliN, Boolean.valueOf(n1357SolColSol), A1357SolColSol, Boolean.valueOf(n1345SolColAlt), A1345SolColAlt, Boolean.valueOf(n1359SolColUlin), Byte.valueOf(A1359SolColUlin), Boolean.valueOf(n3195SolColRef), A3195SolColRef, Boolean.valueOf(n10918SolColTmp), Short.valueOf(A10918SolColTmp), Boolean.valueOf(n11803SolColRqM), A11803SolColRqM, Boolean.valueOf(n11804SolColSt), Byte.valueOf(A11804SolColSt), Boolean.valueOf(n11925SolColMetd), A11925SolColMetd, Boolean.valueOf(n11924SolColEsfe), A11924SolColEsfe, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLCO");
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
                        processLevel4M188( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption4M0( ) ;
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
            load4M188( ) ;
         }
         endLevel4M188( ) ;
      }
      closeExtendedTableCursors4M188( ) ;
   }

   public void update4M188( )
   {
      beforeValidate4M188( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable4M188( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency4M188( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm4M188( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate4M188( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004M17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n1352SolColMat), A1352SolColMat, Boolean.valueOf(n1356SolColSer), A1356SolColSer, Boolean.valueOf(n1358SolColTip), Short.valueOf(A1358SolColTip), Boolean.valueOf(n1349SolColDisN), A1349SolColDisN, Boolean.valueOf(n1353SolColNom), A1353SolColNom, Boolean.valueOf(n1354SolColNum), Integer.valueOf(A1354SolColNum), Boolean.valueOf(n1350SolColFec), A1350SolColFec, Boolean.valueOf(n3187SolColNor), A3187SolColNor, Boolean.valueOf(n3188SolColMaq), A3188SolColMaq, Boolean.valueOf(n3189SolColTac), A3189SolColTac, Boolean.valueOf(n3190SolColCo), A3190SolColCo, Boolean.valueOf(n3191SolColPa6), A3191SolColPa6, Boolean.valueOf(n3192SolColPes), A3192SolColPes, Boolean.valueOf(n3193SolColPac), A3193SolColPac, Boolean.valueOf(n3194SolColWo), A3194SolColWo, Boolean.valueOf(n1346SolColCliC), Integer.valueOf(A1346SolColCliC), Boolean.valueOf(n1347SolColCliN), A1347SolColCliN, Boolean.valueOf(n1357SolColSol), A1357SolColSol, Boolean.valueOf(n1345SolColAlt), A1345SolColAlt, Boolean.valueOf(n1359SolColUlin), Byte.valueOf(A1359SolColUlin), Boolean.valueOf(n3195SolColRef), A3195SolColRef, Boolean.valueOf(n10918SolColTmp), Short.valueOf(A10918SolColTmp), Boolean.valueOf(n11803SolColRqM), A11803SolColRqM, Boolean.valueOf(n11804SolColSt), Byte.valueOf(A11804SolColSt), Boolean.valueOf(n11925SolColMetd), A11925SolColMetd, Boolean.valueOf(n11924SolColEsfe), A11924SolColEsfe, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A1348SolColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLCO");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCSOLCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate4M188( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel4M188( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption4M0( ) ;
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
         endLevel4M188( ) ;
      }
      closeExtendedTableCursors4M188( ) ;
   }

   public void deferredUpdate4M188( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate4M188( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency4M188( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls4M188( ) ;
         afterConfirm4M188( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete4M188( ) ;
            if ( AnyError == 0 )
            {
               scanStart4M189( ) ;
               while ( RcdFound189 != 0 )
               {
                  getByPrimaryKey4M189( ) ;
                  delete4M189( ) ;
                  scanNext4M189( ) ;
               }
               scanEnd4M189( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004M18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
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
                           initAll4M188( ) ;
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
                        resetCaption4M0( ) ;
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
      endLevel4M188( ) ;
      Gx_mode = sMode188 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls4M188( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T004M19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T004M19_A407EmprNom[0] ;
         n407EmprNom = T004M19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T004M20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T004M20_A653OpeNom[0] ;
         n653OpeNom = T004M20_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(18);
      }
   }

   public void processNestedLevel4M189( )
   {
      nGXsfl_190_idx = 0 ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         readRow4M189( ) ;
         if ( ( nRcdExists_189 != 0 ) || ( nIsMod_189 != 0 ) )
         {
            standaloneNotModal4M189( ) ;
            getKey4M189( ) ;
            if ( ( nRcdExists_189 == 0 ) && ( nRcdDeleted_189 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert4M189( ) ;
            }
            else
            {
               if ( RcdFound189 != 0 )
               {
                  if ( ( nRcdDeleted_189 != 0 ) && ( nRcdExists_189 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete4M189( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_189 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update4M189( ) ;
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
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll4M189( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_189 = (short)(0) ;
      nIsMod_189 = (short)(0) ;
      nRcdDeleted_189 = (short)(0) ;
   }

   public void processLevel4M188( )
   {
      /* Save parent mode. */
      sMode188 = Gx_mode ;
      processNestedLevel4M189( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode188 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel4M188( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete4M188( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tsolcor");
         if ( AnyError == 0 )
         {
            confirmValues4M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tsolcor");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart4M188( )
   {
      /* Using cursor T004M21 */
      pr_default.execute(19);
      RcdFound188 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound188 = (short)(1) ;
         A396EmprCod = T004M21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1348SolColCod = T004M21_A1348SolColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext4M188( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound188 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound188 = (short)(1) ;
         A396EmprCod = T004M21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1348SolColCod = T004M21_A1348SolColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
      }
   }

   public void scanEnd4M188( )
   {
      pr_default.close(19);
   }

   public void afterConfirm4M188( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert4M188( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate4M188( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete4M188( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete4M188( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate4M188( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes4M188( )
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
      edtSolColMetd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColMetd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColMetd_Enabled), 5, 0), true);
      edtSolColEsfe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColEsfe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColEsfe_Enabled), 5, 0), true);
   }

   public void zm4M189( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1355SolColObs = T004M3_A1355SolColObs[0] ;
         }
         else
         {
            Z1355SolColObs = A1355SolColObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z1348SolColCod = A1348SolColCod ;
         Z1351SolColLin = A1351SolColLin ;
         Z1355SolColObs = A1355SolColObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal4M189( )
   {
   }

   public void standaloneModal4M189( )
   {
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

   public void load4M189( )
   {
      /* Using cursor T004M22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound189 = (short)(1) ;
         A1355SolColObs = T004M22_A1355SolColObs[0] ;
         n1355SolColObs = T004M22_n1355SolColObs[0] ;
         zm4M189( -5) ;
      }
      pr_default.close(20);
      onLoadActions4M189( ) ;
   }

   public void onLoadActions4M189( )
   {
   }

   public void checkExtendedTable4M189( )
   {
      nIsDirty_189 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal4M189( ) ;
   }

   public void closeExtendedTableCursors4M189( )
   {
   }

   public void enableDisable4M189( )
   {
   }

   public void getKey4M189( )
   {
      /* Using cursor T004M23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound189 = (short)(1) ;
      }
      else
      {
         RcdFound189 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey4M189( )
   {
      /* Using cursor T004M3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm4M189( 5) ;
         RcdFound189 = (short)(1) ;
         initializeNonKey4M189( ) ;
         A1351SolColLin = T004M3_A1351SolColLin[0] ;
         A1355SolColObs = T004M3_A1355SolColObs[0] ;
         n1355SolColObs = T004M3_n1355SolColObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1348SolColCod = A1348SolColCod ;
         Z1351SolColLin = A1351SolColLin ;
         sMode189 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal4M189( ) ;
         load4M189( ) ;
         Gx_mode = sMode189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound189 = (short)(0) ;
         initializeNonKey4M189( ) ;
         sMode189 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal4M189( ) ;
         Gx_mode = sMode189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes4M189( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency4M189( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T004M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLSOLCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1355SolColObs, T004M2_A1355SolColObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1355SolColObs, T004M2_A1355SolColObs[0]) != 0 )
            {
               GXutil.writeLogln("tsolcor:[seudo value changed for attri]"+"SolColObs");
               GXutil.writeLogRaw("Old: ",Z1355SolColObs);
               GXutil.writeLogRaw("Current: ",T004M2_A1355SolColObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLSOLCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert4M189( )
   {
      beforeValidate4M189( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable4M189( ) ;
      }
      if ( AnyError == 0 )
      {
         zm4M189( 0) ;
         checkOptimisticConcurrency4M189( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm4M189( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert4M189( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004M24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin), Boolean.valueOf(n1355SolColObs), A1355SolColObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLCO");
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
            load4M189( ) ;
         }
         endLevel4M189( ) ;
      }
      closeExtendedTableCursors4M189( ) ;
   }

   public void update4M189( )
   {
      beforeValidate4M189( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable4M189( ) ;
      }
      if ( ( nIsMod_189 != 0 ) || ( nIsDirty_189 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency4M189( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm4M189( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate4M189( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T004M25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n1355SolColObs), A1355SolColObs, A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLCO");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLSOLCO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate4M189( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey4M189( ) ;
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
            endLevel4M189( ) ;
         }
      }
      closeExtendedTableCursors4M189( ) ;
   }

   public void deferredUpdate4M189( )
   {
   }

   public void delete4M189( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate4M189( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency4M189( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls4M189( ) ;
         afterConfirm4M189( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete4M189( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T004M26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod), Byte.valueOf(A1351SolColLin)});
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
      endLevel4M189( ) ;
      Gx_mode = sMode189 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls4M189( )
   {
      standaloneModal4M189( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel4M189( )
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

   public void scanStart4M189( )
   {
      /* Scan By routine */
      /* Using cursor T004M27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A1348SolColCod)});
      RcdFound189 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound189 = (short)(1) ;
         A1351SolColLin = T004M27_A1351SolColLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext4M189( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound189 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound189 = (short)(1) ;
         A1351SolColLin = T004M27_A1351SolColLin[0] ;
      }
   }

   public void scanEnd4M189( )
   {
      pr_default.close(25);
   }

   public void afterConfirm4M189( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert4M189( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate4M189( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete4M189( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete4M189( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate4M189( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes4M189( )
   {
      edtSolColLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      edtSolColObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolColObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolColObs_Enabled), 5, 0), !bGXsfl_190_Refreshing);
   }

   public void send_integrity_lvl_hashes4M189( )
   {
   }

   public void send_integrity_lvl_hashes4M188( )
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

   public void addRow4M189( )
   {
      nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_190189( ) ;
      sendRow4M189( ) ;
   }

   public void sendRow4M189( )
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
      send_integrity_lvl_hashes4M189( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_189_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_189_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLCOLLIN_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLCOLOBS_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolColObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow4M189( )
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

   public void confirmValues4M0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tsolcor", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11925SolColMetd", GXutil.rtrim( Z11925SolColMetd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11924SolColEsfe", GXutil.rtrim( Z11924SolColEsfe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_190", GXutil.ltrim( localUtil.ntoc( nGXsfl_190_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tsolcor", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TSOLCOR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TEST SOLIDEZ PARA LAVADO", "") ;
   }

   public void initializeNonKey4M188( )
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
      A1350SolColFec = GXutil.nullDate() ;
      n1350SolColFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1350SolColFec", localUtil.format(A1350SolColFec, "99/99/99"));
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
      A10918SolColTmp = (short)(0) ;
      n10918SolColTmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10918SolColTmp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10918SolColTmp), 3, 0));
      A11803SolColRqM = "" ;
      n11803SolColRqM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11803SolColRqM", A11803SolColRqM);
      A11804SolColSt = (byte)(0) ;
      n11804SolColSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11804SolColSt", GXutil.str( A11804SolColSt, 1, 0));
      A11925SolColMetd = "" ;
      n11925SolColMetd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", A11925SolColMetd);
      A11924SolColEsfe = "" ;
      n11924SolColEsfe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", A11924SolColEsfe);
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
      Z11925SolColMetd = "" ;
      Z11924SolColEsfe = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAll4M188( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1348SolColCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1348SolColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1348SolColCod), 8, 0));
      initializeNonKey4M188( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey4M189( )
   {
      A1355SolColObs = "" ;
      n1355SolColObs = false ;
      Z1355SolColObs = "" ;
   }

   public void initAll4M189( )
   {
      A1351SolColLin = (byte)(0) ;
      initializeNonKey4M189( ) ;
   }

   public void standaloneModalInsert4M189( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241504727", true, true);
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
      httpContext.AddJavascriptSource("tsolcor.js", "?20268241504727", false, true);
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
      edtSolColMetd_Internalname = "SOLCOLMETD" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtSolColEsfe_Internalname = "SOLCOLESFE" ;
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
      Form.setCaption( httpContext.getMessage( "TEST SOLIDEZ PARA LAVADO", "") );
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
      edtSolColEsfe_Jsonclick = "" ;
      edtSolColEsfe_Backcolor = (int)(0xFFFFFF) ;
      edtSolColEsfe_Enabled = 1 ;
      edtSolColMetd_Jsonclick = "" ;
      edtSolColMetd_Backcolor = (int)(0xFFFFFF) ;
      edtSolColMetd_Enabled = 1 ;
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
      edtSolColUlin_Enabled = 1 ;
      edtSolColAlt_Jsonclick = "" ;
      edtSolColAlt_Backcolor = (int)(0xFFFFFF) ;
      edtSolColAlt_Enabled = 1 ;
      edtSolColSol_Jsonclick = "" ;
      edtSolColSol_Backcolor = (int)(0xFFFFFF) ;
      edtSolColSol_Enabled = 1 ;
      edtSolColCliN_Jsonclick = "" ;
      edtSolColCliN_Backcolor = (int)(0xFFFFFF) ;
      edtSolColCliN_Enabled = 1 ;
      edtSolColCliC_Jsonclick = "" ;
      edtSolColCliC_Backcolor = (int)(0xFFFFFF) ;
      edtSolColCliC_Enabled = 1 ;
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
      edtSolColNum_Enabled = 1 ;
      edtSolColNom_Jsonclick = "" ;
      edtSolColNom_Backcolor = (int)(0xFFFFFF) ;
      edtSolColNom_Enabled = 1 ;
      edtSolColDisN_Jsonclick = "" ;
      edtSolColDisN_Backcolor = (int)(0xFFFFFF) ;
      edtSolColDisN_Enabled = 1 ;
      edtSolColTip_Jsonclick = "" ;
      edtSolColTip_Backcolor = (int)(0xFFFFFF) ;
      edtSolColTip_Enabled = 1 ;
      edtSolColSer_Jsonclick = "" ;
      edtSolColSer_Backcolor = (int)(0xFFFFFF) ;
      edtSolColSer_Enabled = 1 ;
      edtSolColMat_Jsonclick = "" ;
      edtSolColMat_Backcolor = (int)(0xFFFFFF) ;
      edtSolColMat_Enabled = 1 ;
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
      subsflControlProps_190189( ) ;
      while ( nGXsfl_190_idx <= nRC_GXsfl_190 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal4M189( ) ;
         standaloneModal4M189( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow4M189( ) ;
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
      /* Using cursor T004M19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T004M19_A407EmprNom[0] ;
      n407EmprNom = T004M19_n407EmprNom[0] ;
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
      /* Using cursor T004M19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T004M19_A407EmprNom[0] ;
      n407EmprNom = T004M19_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Solcolcod( )
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
      httpContext.ajax_rsp_assign_attri("", false, "A11925SolColMetd", GXutil.rtrim( A11925SolColMetd));
      httpContext.ajax_rsp_assign_attri("", false, "A11924SolColEsfe", GXutil.rtrim( A11924SolColEsfe));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1348SolColCod", GXutil.ltrim( localUtil.ntoc( Z1348SolColCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11925SolColMetd", GXutil.rtrim( Z11925SolColMetd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11924SolColEsfe", GXutil.rtrim( Z11924SolColEsfe));
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
      /* Using cursor T004M28 */
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
      /* Using cursor T004M20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A653OpeNom = T004M20_A653OpeNom[0] ;
      n653OpeNom = T004M20_n653OpeNom[0] ;
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
      setEventMetadata("VALID_SOLCOLCOD","{handler:'valid_Solcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1348SolColCod',fld:'SOLCOLCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_SOLCOLCOD",",oparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1352SolColMat',fld:'SOLCOLMAT',pic:''},{av:'A1356SolColSer',fld:'SOLCOLSER',pic:''},{av:'A1358SolColTip',fld:'SOLCOLTIP',pic:'ZZZ9'},{av:'A1349SolColDisN',fld:'SOLCOLDISN',pic:''},{av:'A1353SolColNom',fld:'SOLCOLNOM',pic:''},{av:'A1354SolColNum',fld:'SOLCOLNUM',pic:'ZZZZZ9'},{av:'A1350SolColFec',fld:'SOLCOLFEC',pic:''},{av:'A3187SolColNor',fld:'SOLCOLNOR',pic:''},{av:'A3188SolColMaq',fld:'SOLCOLMAQ',pic:''},{av:'A3189SolColTac',fld:'SOLCOLTAC',pic:''},{av:'A3190SolColCo',fld:'SOLCOLCO',pic:''},{av:'A3191SolColPa6',fld:'SOLCOLPA6',pic:''},{av:'A3192SolColPes',fld:'SOLCOLPES',pic:''},{av:'A3193SolColPac',fld:'SOLCOLPAC',pic:''},{av:'A3194SolColWo',fld:'SOLCOLWO',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A1346SolColCliC',fld:'SOLCOLCLIC',pic:'ZZZZZ9'},{av:'A1347SolColCliN',fld:'SOLCOLCLIN',pic:''},{av:'A1357SolColSol',fld:'SOLCOLSOL',pic:''},{av:'A1345SolColAlt',fld:'SOLCOLALT',pic:''},{av:'A1359SolColUlin',fld:'SOLCOLULIN',pic:'Z9'},{av:'A3195SolColRef',fld:'SOLCOLREF',pic:''},{av:'A10918SolColTmp',fld:'SOLCOLTMP',pic:'ZZ9'},{av:'A11803SolColRqM',fld:'SOLCOLRQM',pic:''},{av:'A11804SolColSt',fld:'SOLCOLST',pic:'9'},{av:'A11925SolColMetd',fld:'SOLCOLMETD',pic:''},{av:'A11924SolColEsfe',fld:'SOLCOLESFE',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1348SolColCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z1352SolColMat'},{av:'Z1356SolColSer'},{av:'Z1358SolColTip'},{av:'Z1349SolColDisN'},{av:'Z1353SolColNom'},{av:'Z1354SolColNum'},{av:'Z1350SolColFec'},{av:'Z3187SolColNor'},{av:'Z3188SolColMaq'},{av:'Z3189SolColTac'},{av:'Z3190SolColCo'},{av:'Z3191SolColPa6'},{av:'Z3192SolColPes'},{av:'Z3193SolColPac'},{av:'Z3194SolColWo'},{av:'Z652OpeCod'},{av:'Z1346SolColCliC'},{av:'Z1347SolColCliN'},{av:'Z1357SolColSol'},{av:'Z1345SolColAlt'},{av:'Z1359SolColUlin'},{av:'Z3195SolColRef'},{av:'Z10918SolColTmp'},{av:'Z11803SolColRqM'},{av:'Z11804SolColSt'},{av:'Z11925SolColMetd'},{av:'Z11924SolColEsfe'},{av:'Z407EmprNom'},{av:'Z653OpeNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
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
      pr_default.close(26);
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
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
      Z11925SolColMetd = "" ;
      Z11924SolColEsfe = "" ;
      Z130BarCodPar = "" ;
      Z1355SolColObs = "" ;
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
      A1352SolColMat = "" ;
      lblTextblock8_Jsonclick = "" ;
      A1356SolColSer = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A1349SolColDisN = "" ;
      lblTextblock11_Jsonclick = "" ;
      A1353SolColNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A1350SolColFec = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      A3187SolColNor = "" ;
      lblTextblock15_Jsonclick = "" ;
      A3188SolColMaq = "" ;
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
      A1347SolColCliN = "" ;
      lblTextblock26_Jsonclick = "" ;
      A1357SolColSol = "" ;
      lblTextblock27_Jsonclick = "" ;
      A1345SolColAlt = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A3195SolColRef = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A11803SolColRqM = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      A11925SolColMetd = "" ;
      lblTextblock34_Jsonclick = "" ;
      A11924SolColEsfe = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode189 = "" ;
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
      sMode188 = "" ;
      GXCCtl = "" ;
      A1355SolColObs = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T004M9_A1348SolColCod = new int[1] ;
      T004M9_A407EmprNom = new String[] {""} ;
      T004M9_n407EmprNom = new boolean[] {false} ;
      T004M9_A1352SolColMat = new String[] {""} ;
      T004M9_n1352SolColMat = new boolean[] {false} ;
      T004M9_A1356SolColSer = new String[] {""} ;
      T004M9_n1356SolColSer = new boolean[] {false} ;
      T004M9_A1358SolColTip = new short[1] ;
      T004M9_n1358SolColTip = new boolean[] {false} ;
      T004M9_A1349SolColDisN = new String[] {""} ;
      T004M9_n1349SolColDisN = new boolean[] {false} ;
      T004M9_A1353SolColNom = new String[] {""} ;
      T004M9_n1353SolColNom = new boolean[] {false} ;
      T004M9_A1354SolColNum = new int[1] ;
      T004M9_n1354SolColNum = new boolean[] {false} ;
      T004M9_A1350SolColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T004M9_n1350SolColFec = new boolean[] {false} ;
      T004M9_A3187SolColNor = new String[] {""} ;
      T004M9_n3187SolColNor = new boolean[] {false} ;
      T004M9_A3188SolColMaq = new String[] {""} ;
      T004M9_n3188SolColMaq = new boolean[] {false} ;
      T004M9_A3189SolColTac = new String[] {""} ;
      T004M9_n3189SolColTac = new boolean[] {false} ;
      T004M9_A3190SolColCo = new String[] {""} ;
      T004M9_n3190SolColCo = new boolean[] {false} ;
      T004M9_A3191SolColPa6 = new String[] {""} ;
      T004M9_n3191SolColPa6 = new boolean[] {false} ;
      T004M9_A3192SolColPes = new String[] {""} ;
      T004M9_n3192SolColPes = new boolean[] {false} ;
      T004M9_A3193SolColPac = new String[] {""} ;
      T004M9_n3193SolColPac = new boolean[] {false} ;
      T004M9_A3194SolColWo = new String[] {""} ;
      T004M9_n3194SolColWo = new boolean[] {false} ;
      T004M9_A653OpeNom = new String[] {""} ;
      T004M9_n653OpeNom = new boolean[] {false} ;
      T004M9_A1346SolColCliC = new int[1] ;
      T004M9_n1346SolColCliC = new boolean[] {false} ;
      T004M9_A1347SolColCliN = new String[] {""} ;
      T004M9_n1347SolColCliN = new boolean[] {false} ;
      T004M9_A1357SolColSol = new String[] {""} ;
      T004M9_n1357SolColSol = new boolean[] {false} ;
      T004M9_A1345SolColAlt = new String[] {""} ;
      T004M9_n1345SolColAlt = new boolean[] {false} ;
      T004M9_A1359SolColUlin = new byte[1] ;
      T004M9_n1359SolColUlin = new boolean[] {false} ;
      T004M9_A3195SolColRef = new String[] {""} ;
      T004M9_n3195SolColRef = new boolean[] {false} ;
      T004M9_A10918SolColTmp = new short[1] ;
      T004M9_n10918SolColTmp = new boolean[] {false} ;
      T004M9_A11803SolColRqM = new String[] {""} ;
      T004M9_n11803SolColRqM = new boolean[] {false} ;
      T004M9_A11804SolColSt = new byte[1] ;
      T004M9_n11804SolColSt = new boolean[] {false} ;
      T004M9_A11925SolColMetd = new String[] {""} ;
      T004M9_n11925SolColMetd = new boolean[] {false} ;
      T004M9_A11924SolColEsfe = new String[] {""} ;
      T004M9_n11924SolColEsfe = new boolean[] {false} ;
      T004M9_A396EmprCod = new String[] {""} ;
      T004M9_A129BarCod = new int[1] ;
      T004M9_n129BarCod = new boolean[] {false} ;
      T004M9_A132BarCodReo = new byte[1] ;
      T004M9_n132BarCodReo = new boolean[] {false} ;
      T004M9_A130BarCodPar = new String[] {""} ;
      T004M9_n130BarCodPar = new boolean[] {false} ;
      T004M9_A652OpeCod = new int[1] ;
      T004M9_n652OpeCod = new boolean[] {false} ;
      T004M6_A407EmprNom = new String[] {""} ;
      T004M6_n407EmprNom = new boolean[] {false} ;
      T004M7_A396EmprCod = new String[] {""} ;
      T004M8_A653OpeNom = new String[] {""} ;
      T004M8_n653OpeNom = new boolean[] {false} ;
      T004M10_A407EmprNom = new String[] {""} ;
      T004M10_n407EmprNom = new boolean[] {false} ;
      T004M11_A396EmprCod = new String[] {""} ;
      T004M12_A653OpeNom = new String[] {""} ;
      T004M12_n653OpeNom = new boolean[] {false} ;
      T004M13_A396EmprCod = new String[] {""} ;
      T004M13_A1348SolColCod = new int[1] ;
      T004M5_A1348SolColCod = new int[1] ;
      T004M5_A1352SolColMat = new String[] {""} ;
      T004M5_n1352SolColMat = new boolean[] {false} ;
      T004M5_A1356SolColSer = new String[] {""} ;
      T004M5_n1356SolColSer = new boolean[] {false} ;
      T004M5_A1358SolColTip = new short[1] ;
      T004M5_n1358SolColTip = new boolean[] {false} ;
      T004M5_A1349SolColDisN = new String[] {""} ;
      T004M5_n1349SolColDisN = new boolean[] {false} ;
      T004M5_A1353SolColNom = new String[] {""} ;
      T004M5_n1353SolColNom = new boolean[] {false} ;
      T004M5_A1354SolColNum = new int[1] ;
      T004M5_n1354SolColNum = new boolean[] {false} ;
      T004M5_A1350SolColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T004M5_n1350SolColFec = new boolean[] {false} ;
      T004M5_A3187SolColNor = new String[] {""} ;
      T004M5_n3187SolColNor = new boolean[] {false} ;
      T004M5_A3188SolColMaq = new String[] {""} ;
      T004M5_n3188SolColMaq = new boolean[] {false} ;
      T004M5_A3189SolColTac = new String[] {""} ;
      T004M5_n3189SolColTac = new boolean[] {false} ;
      T004M5_A3190SolColCo = new String[] {""} ;
      T004M5_n3190SolColCo = new boolean[] {false} ;
      T004M5_A3191SolColPa6 = new String[] {""} ;
      T004M5_n3191SolColPa6 = new boolean[] {false} ;
      T004M5_A3192SolColPes = new String[] {""} ;
      T004M5_n3192SolColPes = new boolean[] {false} ;
      T004M5_A3193SolColPac = new String[] {""} ;
      T004M5_n3193SolColPac = new boolean[] {false} ;
      T004M5_A3194SolColWo = new String[] {""} ;
      T004M5_n3194SolColWo = new boolean[] {false} ;
      T004M5_A1346SolColCliC = new int[1] ;
      T004M5_n1346SolColCliC = new boolean[] {false} ;
      T004M5_A1347SolColCliN = new String[] {""} ;
      T004M5_n1347SolColCliN = new boolean[] {false} ;
      T004M5_A1357SolColSol = new String[] {""} ;
      T004M5_n1357SolColSol = new boolean[] {false} ;
      T004M5_A1345SolColAlt = new String[] {""} ;
      T004M5_n1345SolColAlt = new boolean[] {false} ;
      T004M5_A1359SolColUlin = new byte[1] ;
      T004M5_n1359SolColUlin = new boolean[] {false} ;
      T004M5_A3195SolColRef = new String[] {""} ;
      T004M5_n3195SolColRef = new boolean[] {false} ;
      T004M5_A10918SolColTmp = new short[1] ;
      T004M5_n10918SolColTmp = new boolean[] {false} ;
      T004M5_A11803SolColRqM = new String[] {""} ;
      T004M5_n11803SolColRqM = new boolean[] {false} ;
      T004M5_A11804SolColSt = new byte[1] ;
      T004M5_n11804SolColSt = new boolean[] {false} ;
      T004M5_A11925SolColMetd = new String[] {""} ;
      T004M5_n11925SolColMetd = new boolean[] {false} ;
      T004M5_A11924SolColEsfe = new String[] {""} ;
      T004M5_n11924SolColEsfe = new boolean[] {false} ;
      T004M5_A396EmprCod = new String[] {""} ;
      T004M5_A129BarCod = new int[1] ;
      T004M5_n129BarCod = new boolean[] {false} ;
      T004M5_A132BarCodReo = new byte[1] ;
      T004M5_n132BarCodReo = new boolean[] {false} ;
      T004M5_A130BarCodPar = new String[] {""} ;
      T004M5_n130BarCodPar = new boolean[] {false} ;
      T004M5_A652OpeCod = new int[1] ;
      T004M5_n652OpeCod = new boolean[] {false} ;
      T004M14_A396EmprCod = new String[] {""} ;
      T004M14_A1348SolColCod = new int[1] ;
      T004M15_A396EmprCod = new String[] {""} ;
      T004M15_A1348SolColCod = new int[1] ;
      T004M4_A1348SolColCod = new int[1] ;
      T004M4_A1352SolColMat = new String[] {""} ;
      T004M4_n1352SolColMat = new boolean[] {false} ;
      T004M4_A1356SolColSer = new String[] {""} ;
      T004M4_n1356SolColSer = new boolean[] {false} ;
      T004M4_A1358SolColTip = new short[1] ;
      T004M4_n1358SolColTip = new boolean[] {false} ;
      T004M4_A1349SolColDisN = new String[] {""} ;
      T004M4_n1349SolColDisN = new boolean[] {false} ;
      T004M4_A1353SolColNom = new String[] {""} ;
      T004M4_n1353SolColNom = new boolean[] {false} ;
      T004M4_A1354SolColNum = new int[1] ;
      T004M4_n1354SolColNum = new boolean[] {false} ;
      T004M4_A1350SolColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T004M4_n1350SolColFec = new boolean[] {false} ;
      T004M4_A3187SolColNor = new String[] {""} ;
      T004M4_n3187SolColNor = new boolean[] {false} ;
      T004M4_A3188SolColMaq = new String[] {""} ;
      T004M4_n3188SolColMaq = new boolean[] {false} ;
      T004M4_A3189SolColTac = new String[] {""} ;
      T004M4_n3189SolColTac = new boolean[] {false} ;
      T004M4_A3190SolColCo = new String[] {""} ;
      T004M4_n3190SolColCo = new boolean[] {false} ;
      T004M4_A3191SolColPa6 = new String[] {""} ;
      T004M4_n3191SolColPa6 = new boolean[] {false} ;
      T004M4_A3192SolColPes = new String[] {""} ;
      T004M4_n3192SolColPes = new boolean[] {false} ;
      T004M4_A3193SolColPac = new String[] {""} ;
      T004M4_n3193SolColPac = new boolean[] {false} ;
      T004M4_A3194SolColWo = new String[] {""} ;
      T004M4_n3194SolColWo = new boolean[] {false} ;
      T004M4_A1346SolColCliC = new int[1] ;
      T004M4_n1346SolColCliC = new boolean[] {false} ;
      T004M4_A1347SolColCliN = new String[] {""} ;
      T004M4_n1347SolColCliN = new boolean[] {false} ;
      T004M4_A1357SolColSol = new String[] {""} ;
      T004M4_n1357SolColSol = new boolean[] {false} ;
      T004M4_A1345SolColAlt = new String[] {""} ;
      T004M4_n1345SolColAlt = new boolean[] {false} ;
      T004M4_A1359SolColUlin = new byte[1] ;
      T004M4_n1359SolColUlin = new boolean[] {false} ;
      T004M4_A3195SolColRef = new String[] {""} ;
      T004M4_n3195SolColRef = new boolean[] {false} ;
      T004M4_A10918SolColTmp = new short[1] ;
      T004M4_n10918SolColTmp = new boolean[] {false} ;
      T004M4_A11803SolColRqM = new String[] {""} ;
      T004M4_n11803SolColRqM = new boolean[] {false} ;
      T004M4_A11804SolColSt = new byte[1] ;
      T004M4_n11804SolColSt = new boolean[] {false} ;
      T004M4_A11925SolColMetd = new String[] {""} ;
      T004M4_n11925SolColMetd = new boolean[] {false} ;
      T004M4_A11924SolColEsfe = new String[] {""} ;
      T004M4_n11924SolColEsfe = new boolean[] {false} ;
      T004M4_A396EmprCod = new String[] {""} ;
      T004M4_A129BarCod = new int[1] ;
      T004M4_n129BarCod = new boolean[] {false} ;
      T004M4_A132BarCodReo = new byte[1] ;
      T004M4_n132BarCodReo = new boolean[] {false} ;
      T004M4_A130BarCodPar = new String[] {""} ;
      T004M4_n130BarCodPar = new boolean[] {false} ;
      T004M4_A652OpeCod = new int[1] ;
      T004M4_n652OpeCod = new boolean[] {false} ;
      T004M19_A407EmprNom = new String[] {""} ;
      T004M19_n407EmprNom = new boolean[] {false} ;
      T004M20_A653OpeNom = new String[] {""} ;
      T004M20_n653OpeNom = new boolean[] {false} ;
      T004M21_A396EmprCod = new String[] {""} ;
      T004M21_A1348SolColCod = new int[1] ;
      T004M22_A1348SolColCod = new int[1] ;
      T004M22_A1351SolColLin = new byte[1] ;
      T004M22_A1355SolColObs = new String[] {""} ;
      T004M22_n1355SolColObs = new boolean[] {false} ;
      T004M22_A396EmprCod = new String[] {""} ;
      T004M23_A396EmprCod = new String[] {""} ;
      T004M23_A1348SolColCod = new int[1] ;
      T004M23_A1351SolColLin = new byte[1] ;
      T004M3_A1348SolColCod = new int[1] ;
      T004M3_A1351SolColLin = new byte[1] ;
      T004M3_A1355SolColObs = new String[] {""} ;
      T004M3_n1355SolColObs = new boolean[] {false} ;
      T004M3_A396EmprCod = new String[] {""} ;
      T004M2_A1348SolColCod = new int[1] ;
      T004M2_A1351SolColLin = new byte[1] ;
      T004M2_A1355SolColObs = new String[] {""} ;
      T004M2_n1355SolColObs = new boolean[] {false} ;
      T004M2_A396EmprCod = new String[] {""} ;
      T004M27_A396EmprCod = new String[] {""} ;
      T004M27_A1348SolColCod = new int[1] ;
      T004M27_A1351SolColLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
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
      ZZ11925SolColMetd = "" ;
      ZZ11924SolColEsfe = "" ;
      ZZ407EmprNom = "" ;
      ZZ653OpeNom = "" ;
      T004M28_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tsolcor__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tsolcor__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tsolcor__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tsolcor__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tsolcor__default(),
         new Object[] {
             new Object[] {
            T004M2_A1348SolColCod, T004M2_A1351SolColLin, T004M2_A1355SolColObs, T004M2_n1355SolColObs, T004M2_A396EmprCod
            }
            , new Object[] {
            T004M3_A1348SolColCod, T004M3_A1351SolColLin, T004M3_A1355SolColObs, T004M3_n1355SolColObs, T004M3_A396EmprCod
            }
            , new Object[] {
            T004M4_A1348SolColCod, T004M4_A1352SolColMat, T004M4_n1352SolColMat, T004M4_A1356SolColSer, T004M4_n1356SolColSer, T004M4_A1358SolColTip, T004M4_n1358SolColTip, T004M4_A1349SolColDisN, T004M4_n1349SolColDisN, T004M4_A1353SolColNom,
            T004M4_n1353SolColNom, T004M4_A1354SolColNum, T004M4_n1354SolColNum, T004M4_A1350SolColFec, T004M4_n1350SolColFec, T004M4_A3187SolColNor, T004M4_n3187SolColNor, T004M4_A3188SolColMaq, T004M4_n3188SolColMaq, T004M4_A3189SolColTac,
            T004M4_n3189SolColTac, T004M4_A3190SolColCo, T004M4_n3190SolColCo, T004M4_A3191SolColPa6, T004M4_n3191SolColPa6, T004M4_A3192SolColPes, T004M4_n3192SolColPes, T004M4_A3193SolColPac, T004M4_n3193SolColPac, T004M4_A3194SolColWo,
            T004M4_n3194SolColWo, T004M4_A1346SolColCliC, T004M4_n1346SolColCliC, T004M4_A1347SolColCliN, T004M4_n1347SolColCliN, T004M4_A1357SolColSol, T004M4_n1357SolColSol, T004M4_A1345SolColAlt, T004M4_n1345SolColAlt, T004M4_A1359SolColUlin,
            T004M4_n1359SolColUlin, T004M4_A3195SolColRef, T004M4_n3195SolColRef, T004M4_A10918SolColTmp, T004M4_n10918SolColTmp, T004M4_A11803SolColRqM, T004M4_n11803SolColRqM, T004M4_A11804SolColSt, T004M4_n11804SolColSt, T004M4_A11925SolColMetd,
            T004M4_n11925SolColMetd, T004M4_A11924SolColEsfe, T004M4_n11924SolColEsfe, T004M4_A396EmprCod, T004M4_A129BarCod, T004M4_n129BarCod, T004M4_A132BarCodReo, T004M4_n132BarCodReo, T004M4_A130BarCodPar, T004M4_n130BarCodPar,
            T004M4_A652OpeCod, T004M4_n652OpeCod
            }
            , new Object[] {
            T004M5_A1348SolColCod, T004M5_A1352SolColMat, T004M5_n1352SolColMat, T004M5_A1356SolColSer, T004M5_n1356SolColSer, T004M5_A1358SolColTip, T004M5_n1358SolColTip, T004M5_A1349SolColDisN, T004M5_n1349SolColDisN, T004M5_A1353SolColNom,
            T004M5_n1353SolColNom, T004M5_A1354SolColNum, T004M5_n1354SolColNum, T004M5_A1350SolColFec, T004M5_n1350SolColFec, T004M5_A3187SolColNor, T004M5_n3187SolColNor, T004M5_A3188SolColMaq, T004M5_n3188SolColMaq, T004M5_A3189SolColTac,
            T004M5_n3189SolColTac, T004M5_A3190SolColCo, T004M5_n3190SolColCo, T004M5_A3191SolColPa6, T004M5_n3191SolColPa6, T004M5_A3192SolColPes, T004M5_n3192SolColPes, T004M5_A3193SolColPac, T004M5_n3193SolColPac, T004M5_A3194SolColWo,
            T004M5_n3194SolColWo, T004M5_A1346SolColCliC, T004M5_n1346SolColCliC, T004M5_A1347SolColCliN, T004M5_n1347SolColCliN, T004M5_A1357SolColSol, T004M5_n1357SolColSol, T004M5_A1345SolColAlt, T004M5_n1345SolColAlt, T004M5_A1359SolColUlin,
            T004M5_n1359SolColUlin, T004M5_A3195SolColRef, T004M5_n3195SolColRef, T004M5_A10918SolColTmp, T004M5_n10918SolColTmp, T004M5_A11803SolColRqM, T004M5_n11803SolColRqM, T004M5_A11804SolColSt, T004M5_n11804SolColSt, T004M5_A11925SolColMetd,
            T004M5_n11925SolColMetd, T004M5_A11924SolColEsfe, T004M5_n11924SolColEsfe, T004M5_A396EmprCod, T004M5_A129BarCod, T004M5_n129BarCod, T004M5_A132BarCodReo, T004M5_n132BarCodReo, T004M5_A130BarCodPar, T004M5_n130BarCodPar,
            T004M5_A652OpeCod, T004M5_n652OpeCod
            }
            , new Object[] {
            T004M6_A407EmprNom, T004M6_n407EmprNom
            }
            , new Object[] {
            T004M7_A396EmprCod
            }
            , new Object[] {
            T004M8_A653OpeNom, T004M8_n653OpeNom
            }
            , new Object[] {
            T004M9_A1348SolColCod, T004M9_A407EmprNom, T004M9_n407EmprNom, T004M9_A1352SolColMat, T004M9_n1352SolColMat, T004M9_A1356SolColSer, T004M9_n1356SolColSer, T004M9_A1358SolColTip, T004M9_n1358SolColTip, T004M9_A1349SolColDisN,
            T004M9_n1349SolColDisN, T004M9_A1353SolColNom, T004M9_n1353SolColNom, T004M9_A1354SolColNum, T004M9_n1354SolColNum, T004M9_A1350SolColFec, T004M9_n1350SolColFec, T004M9_A3187SolColNor, T004M9_n3187SolColNor, T004M9_A3188SolColMaq,
            T004M9_n3188SolColMaq, T004M9_A3189SolColTac, T004M9_n3189SolColTac, T004M9_A3190SolColCo, T004M9_n3190SolColCo, T004M9_A3191SolColPa6, T004M9_n3191SolColPa6, T004M9_A3192SolColPes, T004M9_n3192SolColPes, T004M9_A3193SolColPac,
            T004M9_n3193SolColPac, T004M9_A3194SolColWo, T004M9_n3194SolColWo, T004M9_A653OpeNom, T004M9_n653OpeNom, T004M9_A1346SolColCliC, T004M9_n1346SolColCliC, T004M9_A1347SolColCliN, T004M9_n1347SolColCliN, T004M9_A1357SolColSol,
            T004M9_n1357SolColSol, T004M9_A1345SolColAlt, T004M9_n1345SolColAlt, T004M9_A1359SolColUlin, T004M9_n1359SolColUlin, T004M9_A3195SolColRef, T004M9_n3195SolColRef, T004M9_A10918SolColTmp, T004M9_n10918SolColTmp, T004M9_A11803SolColRqM,
            T004M9_n11803SolColRqM, T004M9_A11804SolColSt, T004M9_n11804SolColSt, T004M9_A11925SolColMetd, T004M9_n11925SolColMetd, T004M9_A11924SolColEsfe, T004M9_n11924SolColEsfe, T004M9_A396EmprCod, T004M9_A129BarCod, T004M9_n129BarCod,
            T004M9_A132BarCodReo, T004M9_n132BarCodReo, T004M9_A130BarCodPar, T004M9_n130BarCodPar, T004M9_A652OpeCod, T004M9_n652OpeCod
            }
            , new Object[] {
            T004M10_A407EmprNom, T004M10_n407EmprNom
            }
            , new Object[] {
            T004M11_A396EmprCod
            }
            , new Object[] {
            T004M12_A653OpeNom, T004M12_n653OpeNom
            }
            , new Object[] {
            T004M13_A396EmprCod, T004M13_A1348SolColCod
            }
            , new Object[] {
            T004M14_A396EmprCod, T004M14_A1348SolColCod
            }
            , new Object[] {
            T004M15_A396EmprCod, T004M15_A1348SolColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T004M19_A407EmprNom, T004M19_n407EmprNom
            }
            , new Object[] {
            T004M20_A653OpeNom, T004M20_n653OpeNom
            }
            , new Object[] {
            T004M21_A396EmprCod, T004M21_A1348SolColCod
            }
            , new Object[] {
            T004M22_A1348SolColCod, T004M22_A1351SolColLin, T004M22_A1355SolColObs, T004M22_n1355SolColObs, T004M22_A396EmprCod
            }
            , new Object[] {
            T004M23_A396EmprCod, T004M23_A1348SolColCod, T004M23_A1351SolColLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T004M27_A396EmprCod, T004M27_A1348SolColCod, T004M27_A1351SolColLin
            }
            , new Object[] {
            T004M28_A396EmprCod
            }
         }
      );
   }

   private byte Z1359SolColUlin ;
   private byte Z11804SolColSt ;
   private byte Z132BarCodReo ;
   private byte Z1351SolColLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A1359SolColUlin ;
   private byte A11804SolColSt ;
   private byte A1351SolColLin ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ1359SolColUlin ;
   private byte ZZ11804SolColSt ;
   private short Z1358SolColTip ;
   private short Z10918SolColTmp ;
   private short nRcdDeleted_189 ;
   private short nRcdExists_189 ;
   private short nIsMod_189 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1358SolColTip ;
   private short A10918SolColTmp ;
   private short nBlankRcdCount189 ;
   private short RcdFound189 ;
   private short nBlankRcdUsr189 ;
   private short RcdFound188 ;
   private short nIsDirty_188 ;
   private short nIsDirty_189 ;
   private short ZZ1358SolColTip ;
   private short ZZ10918SolColTmp ;
   private int Z1348SolColCod ;
   private int Z1354SolColNum ;
   private int Z1346SolColCliC ;
   private int Z129BarCod ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_190 ;
   private int nGXsfl_190_idx=1 ;
   private int A129BarCod ;
   private int A652OpeCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A1348SolColCod ;
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
   private int A1354SolColNum ;
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
   private int A1346SolColCliC ;
   private int edtSolColCliC_Enabled ;
   private int edtSolColCliN_Enabled ;
   private int edtSolColSol_Enabled ;
   private int edtSolColAlt_Enabled ;
   private int edtSolColUlin_Enabled ;
   private int edtSolColRef_Enabled ;
   private int edtSolColTmp_Enabled ;
   private int edtSolColRqM_Enabled ;
   private int edtSolColSt_Enabled ;
   private int edtSolColMetd_Enabled ;
   private int edtSolColEsfe_Enabled ;
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
   private int edtSolColEsfe_Backcolor ;
   private int edtSolColMetd_Backcolor ;
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
   private int ZZ1348SolColCod ;
   private int ZZ129BarCod ;
   private int ZZ1354SolColNum ;
   private int ZZ652OpeCod ;
   private int ZZ1346SolColCliC ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
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
   private String Z11925SolColMetd ;
   private String Z11924SolColEsfe ;
   private String Z130BarCodPar ;
   private String Z1355SolColObs ;
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
   private String sGXsfl_190_idx="0001" ;
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
   private String edtSolColCod_Internalname ;
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
   private String A1352SolColMat ;
   private String edtSolColMat_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSolColSer_Internalname ;
   private String A1356SolColSer ;
   private String edtSolColSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSolColTip_Internalname ;
   private String edtSolColTip_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSolColDisN_Internalname ;
   private String A1349SolColDisN ;
   private String edtSolColDisN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSolColNom_Internalname ;
   private String A1353SolColNom ;
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
   private String A3188SolColMaq ;
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
   private String A1347SolColCliN ;
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
   private String A3195SolColRef ;
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
   private String edtSolColMetd_Internalname ;
   private String A11925SolColMetd ;
   private String edtSolColMetd_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtSolColEsfe_Internalname ;
   private String A11924SolColEsfe ;
   private String edtSolColEsfe_Jsonclick ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode188 ;
   private String GXCCtl ;
   private String A1355SolColObs ;
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
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
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
   private String ZZ11925SolColMetd ;
   private String ZZ11924SolColEsfe ;
   private String ZZ407EmprNom ;
   private String ZZ653OpeNom ;
   private java.util.Date Z1350SolColFec ;
   private java.util.Date A1350SolColFec ;
   private java.util.Date ZZ1350SolColFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_190_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n1352SolColMat ;
   private boolean n1356SolColSer ;
   private boolean n1358SolColTip ;
   private boolean n1349SolColDisN ;
   private boolean n1353SolColNom ;
   private boolean n1354SolColNum ;
   private boolean n1350SolColFec ;
   private boolean n3187SolColNor ;
   private boolean n3188SolColMaq ;
   private boolean n3189SolColTac ;
   private boolean n3190SolColCo ;
   private boolean n3191SolColPa6 ;
   private boolean n3192SolColPes ;
   private boolean n3193SolColPac ;
   private boolean n3194SolColWo ;
   private boolean n653OpeNom ;
   private boolean n1346SolColCliC ;
   private boolean n1347SolColCliN ;
   private boolean n1357SolColSol ;
   private boolean n1345SolColAlt ;
   private boolean n1359SolColUlin ;
   private boolean n3195SolColRef ;
   private boolean n10918SolColTmp ;
   private boolean n11803SolColRqM ;
   private boolean n11804SolColSt ;
   private boolean n11925SolColMetd ;
   private boolean n11924SolColEsfe ;
   private boolean Gx_longc ;
   private boolean n1355SolColObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T004M9_A1348SolColCod ;
   private String[] T004M9_A407EmprNom ;
   private boolean[] T004M9_n407EmprNom ;
   private String[] T004M9_A1352SolColMat ;
   private boolean[] T004M9_n1352SolColMat ;
   private String[] T004M9_A1356SolColSer ;
   private boolean[] T004M9_n1356SolColSer ;
   private short[] T004M9_A1358SolColTip ;
   private boolean[] T004M9_n1358SolColTip ;
   private String[] T004M9_A1349SolColDisN ;
   private boolean[] T004M9_n1349SolColDisN ;
   private String[] T004M9_A1353SolColNom ;
   private boolean[] T004M9_n1353SolColNom ;
   private int[] T004M9_A1354SolColNum ;
   private boolean[] T004M9_n1354SolColNum ;
   private java.util.Date[] T004M9_A1350SolColFec ;
   private boolean[] T004M9_n1350SolColFec ;
   private String[] T004M9_A3187SolColNor ;
   private boolean[] T004M9_n3187SolColNor ;
   private String[] T004M9_A3188SolColMaq ;
   private boolean[] T004M9_n3188SolColMaq ;
   private String[] T004M9_A3189SolColTac ;
   private boolean[] T004M9_n3189SolColTac ;
   private String[] T004M9_A3190SolColCo ;
   private boolean[] T004M9_n3190SolColCo ;
   private String[] T004M9_A3191SolColPa6 ;
   private boolean[] T004M9_n3191SolColPa6 ;
   private String[] T004M9_A3192SolColPes ;
   private boolean[] T004M9_n3192SolColPes ;
   private String[] T004M9_A3193SolColPac ;
   private boolean[] T004M9_n3193SolColPac ;
   private String[] T004M9_A3194SolColWo ;
   private boolean[] T004M9_n3194SolColWo ;
   private String[] T004M9_A653OpeNom ;
   private boolean[] T004M9_n653OpeNom ;
   private int[] T004M9_A1346SolColCliC ;
   private boolean[] T004M9_n1346SolColCliC ;
   private String[] T004M9_A1347SolColCliN ;
   private boolean[] T004M9_n1347SolColCliN ;
   private String[] T004M9_A1357SolColSol ;
   private boolean[] T004M9_n1357SolColSol ;
   private String[] T004M9_A1345SolColAlt ;
   private boolean[] T004M9_n1345SolColAlt ;
   private byte[] T004M9_A1359SolColUlin ;
   private boolean[] T004M9_n1359SolColUlin ;
   private String[] T004M9_A3195SolColRef ;
   private boolean[] T004M9_n3195SolColRef ;
   private short[] T004M9_A10918SolColTmp ;
   private boolean[] T004M9_n10918SolColTmp ;
   private String[] T004M9_A11803SolColRqM ;
   private boolean[] T004M9_n11803SolColRqM ;
   private byte[] T004M9_A11804SolColSt ;
   private boolean[] T004M9_n11804SolColSt ;
   private String[] T004M9_A11925SolColMetd ;
   private boolean[] T004M9_n11925SolColMetd ;
   private String[] T004M9_A11924SolColEsfe ;
   private boolean[] T004M9_n11924SolColEsfe ;
   private String[] T004M9_A396EmprCod ;
   private int[] T004M9_A129BarCod ;
   private boolean[] T004M9_n129BarCod ;
   private byte[] T004M9_A132BarCodReo ;
   private boolean[] T004M9_n132BarCodReo ;
   private String[] T004M9_A130BarCodPar ;
   private boolean[] T004M9_n130BarCodPar ;
   private int[] T004M9_A652OpeCod ;
   private boolean[] T004M9_n652OpeCod ;
   private String[] T004M6_A407EmprNom ;
   private boolean[] T004M6_n407EmprNom ;
   private String[] T004M7_A396EmprCod ;
   private String[] T004M8_A653OpeNom ;
   private boolean[] T004M8_n653OpeNom ;
   private String[] T004M10_A407EmprNom ;
   private boolean[] T004M10_n407EmprNom ;
   private String[] T004M11_A396EmprCod ;
   private String[] T004M12_A653OpeNom ;
   private boolean[] T004M12_n653OpeNom ;
   private String[] T004M13_A396EmprCod ;
   private int[] T004M13_A1348SolColCod ;
   private int[] T004M5_A1348SolColCod ;
   private String[] T004M5_A1352SolColMat ;
   private boolean[] T004M5_n1352SolColMat ;
   private String[] T004M5_A1356SolColSer ;
   private boolean[] T004M5_n1356SolColSer ;
   private short[] T004M5_A1358SolColTip ;
   private boolean[] T004M5_n1358SolColTip ;
   private String[] T004M5_A1349SolColDisN ;
   private boolean[] T004M5_n1349SolColDisN ;
   private String[] T004M5_A1353SolColNom ;
   private boolean[] T004M5_n1353SolColNom ;
   private int[] T004M5_A1354SolColNum ;
   private boolean[] T004M5_n1354SolColNum ;
   private java.util.Date[] T004M5_A1350SolColFec ;
   private boolean[] T004M5_n1350SolColFec ;
   private String[] T004M5_A3187SolColNor ;
   private boolean[] T004M5_n3187SolColNor ;
   private String[] T004M5_A3188SolColMaq ;
   private boolean[] T004M5_n3188SolColMaq ;
   private String[] T004M5_A3189SolColTac ;
   private boolean[] T004M5_n3189SolColTac ;
   private String[] T004M5_A3190SolColCo ;
   private boolean[] T004M5_n3190SolColCo ;
   private String[] T004M5_A3191SolColPa6 ;
   private boolean[] T004M5_n3191SolColPa6 ;
   private String[] T004M5_A3192SolColPes ;
   private boolean[] T004M5_n3192SolColPes ;
   private String[] T004M5_A3193SolColPac ;
   private boolean[] T004M5_n3193SolColPac ;
   private String[] T004M5_A3194SolColWo ;
   private boolean[] T004M5_n3194SolColWo ;
   private int[] T004M5_A1346SolColCliC ;
   private boolean[] T004M5_n1346SolColCliC ;
   private String[] T004M5_A1347SolColCliN ;
   private boolean[] T004M5_n1347SolColCliN ;
   private String[] T004M5_A1357SolColSol ;
   private boolean[] T004M5_n1357SolColSol ;
   private String[] T004M5_A1345SolColAlt ;
   private boolean[] T004M5_n1345SolColAlt ;
   private byte[] T004M5_A1359SolColUlin ;
   private boolean[] T004M5_n1359SolColUlin ;
   private String[] T004M5_A3195SolColRef ;
   private boolean[] T004M5_n3195SolColRef ;
   private short[] T004M5_A10918SolColTmp ;
   private boolean[] T004M5_n10918SolColTmp ;
   private String[] T004M5_A11803SolColRqM ;
   private boolean[] T004M5_n11803SolColRqM ;
   private byte[] T004M5_A11804SolColSt ;
   private boolean[] T004M5_n11804SolColSt ;
   private String[] T004M5_A11925SolColMetd ;
   private boolean[] T004M5_n11925SolColMetd ;
   private String[] T004M5_A11924SolColEsfe ;
   private boolean[] T004M5_n11924SolColEsfe ;
   private String[] T004M5_A396EmprCod ;
   private int[] T004M5_A129BarCod ;
   private boolean[] T004M5_n129BarCod ;
   private byte[] T004M5_A132BarCodReo ;
   private boolean[] T004M5_n132BarCodReo ;
   private String[] T004M5_A130BarCodPar ;
   private boolean[] T004M5_n130BarCodPar ;
   private int[] T004M5_A652OpeCod ;
   private boolean[] T004M5_n652OpeCod ;
   private String[] T004M14_A396EmprCod ;
   private int[] T004M14_A1348SolColCod ;
   private String[] T004M15_A396EmprCod ;
   private int[] T004M15_A1348SolColCod ;
   private int[] T004M4_A1348SolColCod ;
   private String[] T004M4_A1352SolColMat ;
   private boolean[] T004M4_n1352SolColMat ;
   private String[] T004M4_A1356SolColSer ;
   private boolean[] T004M4_n1356SolColSer ;
   private short[] T004M4_A1358SolColTip ;
   private boolean[] T004M4_n1358SolColTip ;
   private String[] T004M4_A1349SolColDisN ;
   private boolean[] T004M4_n1349SolColDisN ;
   private String[] T004M4_A1353SolColNom ;
   private boolean[] T004M4_n1353SolColNom ;
   private int[] T004M4_A1354SolColNum ;
   private boolean[] T004M4_n1354SolColNum ;
   private java.util.Date[] T004M4_A1350SolColFec ;
   private boolean[] T004M4_n1350SolColFec ;
   private String[] T004M4_A3187SolColNor ;
   private boolean[] T004M4_n3187SolColNor ;
   private String[] T004M4_A3188SolColMaq ;
   private boolean[] T004M4_n3188SolColMaq ;
   private String[] T004M4_A3189SolColTac ;
   private boolean[] T004M4_n3189SolColTac ;
   private String[] T004M4_A3190SolColCo ;
   private boolean[] T004M4_n3190SolColCo ;
   private String[] T004M4_A3191SolColPa6 ;
   private boolean[] T004M4_n3191SolColPa6 ;
   private String[] T004M4_A3192SolColPes ;
   private boolean[] T004M4_n3192SolColPes ;
   private String[] T004M4_A3193SolColPac ;
   private boolean[] T004M4_n3193SolColPac ;
   private String[] T004M4_A3194SolColWo ;
   private boolean[] T004M4_n3194SolColWo ;
   private int[] T004M4_A1346SolColCliC ;
   private boolean[] T004M4_n1346SolColCliC ;
   private String[] T004M4_A1347SolColCliN ;
   private boolean[] T004M4_n1347SolColCliN ;
   private String[] T004M4_A1357SolColSol ;
   private boolean[] T004M4_n1357SolColSol ;
   private String[] T004M4_A1345SolColAlt ;
   private boolean[] T004M4_n1345SolColAlt ;
   private byte[] T004M4_A1359SolColUlin ;
   private boolean[] T004M4_n1359SolColUlin ;
   private String[] T004M4_A3195SolColRef ;
   private boolean[] T004M4_n3195SolColRef ;
   private short[] T004M4_A10918SolColTmp ;
   private boolean[] T004M4_n10918SolColTmp ;
   private String[] T004M4_A11803SolColRqM ;
   private boolean[] T004M4_n11803SolColRqM ;
   private byte[] T004M4_A11804SolColSt ;
   private boolean[] T004M4_n11804SolColSt ;
   private String[] T004M4_A11925SolColMetd ;
   private boolean[] T004M4_n11925SolColMetd ;
   private String[] T004M4_A11924SolColEsfe ;
   private boolean[] T004M4_n11924SolColEsfe ;
   private String[] T004M4_A396EmprCod ;
   private int[] T004M4_A129BarCod ;
   private boolean[] T004M4_n129BarCod ;
   private byte[] T004M4_A132BarCodReo ;
   private boolean[] T004M4_n132BarCodReo ;
   private String[] T004M4_A130BarCodPar ;
   private boolean[] T004M4_n130BarCodPar ;
   private int[] T004M4_A652OpeCod ;
   private boolean[] T004M4_n652OpeCod ;
   private String[] T004M19_A407EmprNom ;
   private boolean[] T004M19_n407EmprNom ;
   private String[] T004M20_A653OpeNom ;
   private boolean[] T004M20_n653OpeNom ;
   private String[] T004M21_A396EmprCod ;
   private int[] T004M21_A1348SolColCod ;
   private int[] T004M22_A1348SolColCod ;
   private byte[] T004M22_A1351SolColLin ;
   private String[] T004M22_A1355SolColObs ;
   private boolean[] T004M22_n1355SolColObs ;
   private String[] T004M22_A396EmprCod ;
   private String[] T004M23_A396EmprCod ;
   private int[] T004M23_A1348SolColCod ;
   private byte[] T004M23_A1351SolColLin ;
   private int[] T004M3_A1348SolColCod ;
   private byte[] T004M3_A1351SolColLin ;
   private String[] T004M3_A1355SolColObs ;
   private boolean[] T004M3_n1355SolColObs ;
   private String[] T004M3_A396EmprCod ;
   private int[] T004M2_A1348SolColCod ;
   private byte[] T004M2_A1351SolColLin ;
   private String[] T004M2_A1355SolColObs ;
   private boolean[] T004M2_n1355SolColObs ;
   private String[] T004M2_A396EmprCod ;
   private String[] T004M27_A396EmprCod ;
   private int[] T004M27_A1348SolColCod ;
   private byte[] T004M27_A1351SolColLin ;
   private String[] T004M28_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tsolcor__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tsolcor__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tsolcor__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tsolcor__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tsolcor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T004M2", "SELECT SolColCod, SolColLin, SolColObs, EmprCod FROM TXPLSOLCO WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ?  FOR UPDATE OF SolColObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M3", "SELECT SolColCod, SolColLin, SolColObs, EmprCod FROM TXPLSOLCO WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M4", "SELECT SolColCod, SolColMat, SolColSer, SolColTip, SolColDisN, SolColNom, SolColNum, SolColFec, SolColNor, SolColMaq, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColCliC, SolColCliN, SolColSol, SolColAlt, SolColUlin, SolColRef, SolColTmp, SolColRqM, SolColSt, SolColMetd, SolColEsfe, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCSOLCO WHERE EmprCod = ? AND SolColCod = ?  FOR UPDATE OF SolColMat, SolColSer, SolColTip, SolColDisN, SolColNom, SolColNum, SolColFec, SolColNor, SolColMaq, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColCliC, SolColCliN, SolColSol, SolColAlt, SolColUlin, SolColRef, SolColTmp, SolColRqM, SolColSt, SolColMetd, SolColEsfe, BarCod, BarCodReo, BarCodPar, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M5", "SELECT SolColCod, SolColMat, SolColSer, SolColTip, SolColDisN, SolColNom, SolColNum, SolColFec, SolColNor, SolColMaq, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColCliC, SolColCliN, SolColSol, SolColAlt, SolColUlin, SolColRef, SolColTmp, SolColRqM, SolColSt, SolColMetd, SolColEsfe, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCSOLCO WHERE EmprCod = ? AND SolColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M8", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M9", "SELECT /*+ FIRST_ROWS(100) */ TM1.SolColCod, T2.EmprNom, TM1.SolColMat, TM1.SolColSer, TM1.SolColTip, TM1.SolColDisN, TM1.SolColNom, TM1.SolColNum, TM1.SolColFec, TM1.SolColNor, TM1.SolColMaq, TM1.SolColTac, TM1.SolColCo, TM1.SolColPa6, TM1.SolColPes, TM1.SolColPac, TM1.SolColWo, T3.OpeNom, TM1.SolColCliC, TM1.SolColCliN, TM1.SolColSol, TM1.SolColAlt, TM1.SolColUlin, TM1.SolColRef, TM1.SolColTmp, TM1.SolColRqM, TM1.SolColSt, TM1.SolColMetd, TM1.SolColEsfe, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.OpeCod FROM ((TXPCSOLCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.SolColCod = ? ORDER BY TM1.EmprCod, TM1.SolColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M11", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M12", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND SolColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolColCod FROM TXPCSOLCO WHERE ( EmprCod > ? or EmprCod = ? and SolColCod > ?) ORDER BY EmprCod, SolColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T004M15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolColCod FROM TXPCSOLCO WHERE ( EmprCod < ? or EmprCod = ? and SolColCod < ?) ORDER BY EmprCod DESC, SolColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T004M16", "INSERT INTO TXPCSOLCO(SolColCod, SolColMat, SolColSer, SolColTip, SolColDisN, SolColNom, SolColNum, SolColFec, SolColNor, SolColMaq, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColCliC, SolColCliN, SolColSol, SolColAlt, SolColUlin, SolColRef, SolColTmp, SolColRqM, SolColSt, SolColMetd, SolColEsfe, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCSOLCO")
         ,new UpdateCursor("T004M17", "UPDATE TXPCSOLCO SET SolColMat=?, SolColSer=?, SolColTip=?, SolColDisN=?, SolColNom=?, SolColNum=?, SolColFec=?, SolColNor=?, SolColMaq=?, SolColTac=?, SolColCo=?, SolColPa6=?, SolColPes=?, SolColPac=?, SolColWo=?, SolColCliC=?, SolColCliN=?, SolColSol=?, SolColAlt=?, SolColUlin=?, SolColRef=?, SolColTmp=?, SolColRqM=?, SolColSt=?, SolColMetd=?, SolColEsfe=?, BarCod=?, BarCodReo=?, BarCodPar=?, OpeCod=?  WHERE EmprCod = ? AND SolColCod = ?", GX_NOMASK, "TXPCSOLCO")
         ,new UpdateCursor("T004M18", "DELETE FROM TXPCSOLCO  WHERE EmprCod = ? AND SolColCod = ?", GX_NOMASK, "TXPCSOLCO")
         ,new ForEachCursor("T004M19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M20", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SolColCod FROM TXPCSOLCO ORDER BY EmprCod, SolColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M22", "SELECT SolColCod, SolColLin, SolColObs, EmprCod FROM TXPLSOLCO WHERE EmprCod = ? and SolColCod = ? and SolColLin = ? ORDER BY EmprCod, SolColCod, SolColLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M23", "SELECT EmprCod, SolColCod, SolColLin FROM TXPLSOLCO WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T004M24", "INSERT INTO TXPLSOLCO(SolColCod, SolColLin, SolColObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLSOLCO")
         ,new UpdateCursor("T004M25", "UPDATE TXPLSOLCO SET SolColObs=?  WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ?", GX_NOMASK, "TXPLSOLCO")
         ,new UpdateCursor("T004M26", "DELETE FROM TXPLSOLCO  WHERE EmprCod = ? AND SolColCod = ? AND SolColLin = ?", GX_NOMASK, "TXPLSOLCO")
         ,new ForEachCursor("T004M27", "SELECT EmprCod, SolColCod, SolColLin FROM TXPLSOLCO WHERE EmprCod = ? and SolColCod = ? ORDER BY EmprCod, SolColCod, SolColLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004M28", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[15])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 15);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((int[]) buf[54])[0] = rslt.getInt(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(30);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
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
               ((String[]) buf[15])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 15);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((int[]) buf[54])[0] = rslt.getInt(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(30);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
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
               ((String[]) buf[17])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 4);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 15);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 10);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 20);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 20);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 3);
               ((int[]) buf[58])[0] = rslt.getInt(31);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(34);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 6);
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
                  stmt.setString(13, (String)parms[24], 3);
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
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[32]).intValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 30);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 30);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 4);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[40]).byteValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 15);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 10);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 20);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 20);
               }
               stmt.setString(28, (String)parms[53], 3);
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[55]).intValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[57]).byteValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[61]).intValue());
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 6);
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
                  stmt.setString(12, (String)parms[23], 3);
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
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 30);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 30);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 4);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 15);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 10);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 20);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 20);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[53]).intValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[55]).byteValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 1);
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

