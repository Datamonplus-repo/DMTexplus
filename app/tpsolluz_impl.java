package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpsolluz_impl extends GXDataArea
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
            AV56BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56BarCod), 8, 0));
            AV57BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57BarCodReo", GXutil.str( AV57BarCodReo, 1, 0));
            AV58BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58BarCodPar", AV58BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Llamada con parametro", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSolLuzCod_Internalname ;
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
      nRC_GXsfl_130 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_130"))) ;
      nGXsfl_130_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_130_idx"))) ;
      sGXsfl_130_idx = httpContext.GetPar( "sGXsfl_130_idx") ;
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

   public tpsolluz_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpsolluz_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpsolluz_impl.class ));
   }

   public tpsolluz_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpSOLLUZ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Num Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3218SolLuzCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3218SolLuzCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3218SolLuzCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzCod_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzMat_Internalname, GXutil.rtrim( A3219SolLuzMat), GXutil.rtrim( localUtil.format( A3219SolLuzMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzMat_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzSer_Internalname, GXutil.rtrim( A3220SolLuzSer), GXutil.rtrim( localUtil.format( A3220SolLuzSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzSer_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo ARticulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzTip_Internalname, GXutil.ltrim( localUtil.ntoc( A3221SolLuzTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3221SolLuzTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3221SolLuzTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzTip_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Disp Cli", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzDisN_Internalname, GXutil.rtrim( A3222SolLuzDisN), GXutil.rtrim( localUtil.format( A3222SolLuzDisN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzDisN_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzDisN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzNom_Internalname, GXutil.rtrim( A3223SolLuzNom), GXutil.rtrim( localUtil.format( A3223SolLuzNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzNom_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3224SolLuzNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3224SolLuzNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3224SolLuzNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzNum_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Test", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSolLuzFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzFec_Internalname, localUtil.format(A3225SolLuzFec, "99/99/99"), localUtil.format( A3225SolLuzFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzFec_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSolLuzFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSolLuzFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cliente Codigo", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A3226SolLuzCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzCliC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3226SolLuzCliC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3226SolLuzCliC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzCliC_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzCliC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzCliN_Internalname, GXutil.rtrim( A3227SolLuzCliN), GXutil.rtrim( localUtil.format( A3227SolLuzCliN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzCliN_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Valor Resultado", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzSol_Internalname, GXutil.rtrim( A3228SolLuzSol), GXutil.rtrim( localUtil.format( A3228SolLuzSol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzSol_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzSol_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Norma Iso", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzNor_Internalname, GXutil.rtrim( A3229SolLuzNor), GXutil.rtrim( localUtil.format( A3229SolLuzNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzNor_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzNor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzMaq_Internalname, GXutil.rtrim( A3230SolLuzMaq), GXutil.rtrim( localUtil.format( A3230SolLuzMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzMaq_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A3231SolLuzUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolLuzUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3231SolLuzUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3231SolLuzUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzUlin_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "SolLuzRef", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolLuzRef_Internalname, GXutil.rtrim( A3232SolLuzRef), GXutil.rtrim( localUtil.format( A3232SolLuzRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolLuzRef_Jsonclick, 0, "", "", "", "", "", 1, edtSolLuzRef_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLLUZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol130( ) ;
      nGXsfl_130_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount468 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_468 = (short)(1) ;
            scanStart1IC468( ) ;
            while ( RcdFound468 != 0 )
            {
               init_level_properties468( ) ;
               getByPrimaryKey1IC468( ) ;
               addRow1IC468( ) ;
               scanNext1IC468( ) ;
            }
            scanEnd1IC468( ) ;
            nBlankRcdCount468 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1IC468( ) ;
         standaloneModal1IC468( ) ;
         sMode468 = Gx_mode ;
         while ( nGXsfl_130_idx < nRC_GXsfl_130 )
         {
            bGXsfl_130_Refreshing = true ;
            readRow1IC468( ) ;
            edtavnRcdDeleted_468_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_468_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_468_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtSolLuzLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtSolLuzObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolLuzObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzObs_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            if ( ( nRcdExists_468 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1IC468( ) ;
            }
            sendRow1IC468( ) ;
            bGXsfl_130_Refreshing = false ;
         }
         Gx_mode = sMode468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount468 = (short)(5) ;
         nRcdExists_468 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1IC468( ) ;
            while ( RcdFound468 != 0 )
            {
               sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_130468( ) ;
               init_level_properties468( ) ;
               standaloneNotModal1IC468( ) ;
               getByPrimaryKey1IC468( ) ;
               standaloneModal1IC468( ) ;
               addRow1IC468( ) ;
               scanNext1IC468( ) ;
            }
            scanEnd1IC468( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode468 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_130468( ) ;
      initAll1IC468( ) ;
      init_level_properties468( ) ;
      nRcdExists_468 = (short)(0) ;
      nIsMod_468 = (short)(0) ;
      nRcdDeleted_468 = (short)(0) ;
      nBlankRcdCount468 = (short)(nBlankRcdUsr468+nBlankRcdCount468) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount468 > 0 )
      {
         standaloneNotModal1IC468( ) ;
         standaloneModal1IC468( ) ;
         addRow1IC468( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtSolLuzLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount468 = (short)(nBlankRcdCount468-1) ;
      }
      Gx_mode = sMode468 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLLUZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpSOLLUZ.htm");
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
         Z3218SolLuzCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3218SolLuzCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3219SolLuzMat = httpContext.cgiGet( "Z3219SolLuzMat") ;
         Z3220SolLuzSer = httpContext.cgiGet( "Z3220SolLuzSer") ;
         Z3221SolLuzTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z3221SolLuzTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3222SolLuzDisN = httpContext.cgiGet( "Z3222SolLuzDisN") ;
         Z3223SolLuzNom = httpContext.cgiGet( "Z3223SolLuzNom") ;
         Z3224SolLuzNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z3224SolLuzNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3225SolLuzFec = localUtil.ctod( httpContext.cgiGet( "Z3225SolLuzFec"), 0) ;
         Z3226SolLuzCliC = (int)(localUtil.ctol( httpContext.cgiGet( "Z3226SolLuzCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3227SolLuzCliN = httpContext.cgiGet( "Z3227SolLuzCliN") ;
         Z3228SolLuzSol = httpContext.cgiGet( "Z3228SolLuzSol") ;
         Z3229SolLuzNor = httpContext.cgiGet( "Z3229SolLuzNor") ;
         Z3230SolLuzMaq = httpContext.cgiGet( "Z3230SolLuzMaq") ;
         Z3231SolLuzUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3231SolLuzUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3232SolLuzRef = httpContext.cgiGet( "Z3232SolLuzRef") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_130 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_130"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLLUZCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolLuzCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3218SolLuzCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
         }
         else
         {
            A3218SolLuzCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSolLuzCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
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
         A3219SolLuzMat = httpContext.cgiGet( edtSolLuzMat_Internalname) ;
         n3219SolLuzMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
         A3220SolLuzSer = httpContext.cgiGet( edtSolLuzSer_Internalname) ;
         n3220SolLuzSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLLUZTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolLuzTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3221SolLuzTip = (short)(0) ;
            n3221SolLuzTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         }
         else
         {
            A3221SolLuzTip = (short)(localUtil.ctol( httpContext.cgiGet( edtSolLuzTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3221SolLuzTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         }
         A3222SolLuzDisN = httpContext.cgiGet( edtSolLuzDisN_Internalname) ;
         n3222SolLuzDisN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
         A3223SolLuzNom = httpContext.cgiGet( edtSolLuzNom_Internalname) ;
         n3223SolLuzNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLLUZNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolLuzNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3224SolLuzNum = 0 ;
            n3224SolLuzNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         }
         else
         {
            A3224SolLuzNum = (int)(localUtil.ctol( httpContext.cgiGet( edtSolLuzNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3224SolLuzNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtSolLuzFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SOLLUZFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolLuzFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3225SolLuzFec = GXutil.nullDate() ;
            n3225SolLuzFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
         }
         else
         {
            A3225SolLuzFec = localUtil.ctod( httpContext.cgiGet( edtSolLuzFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3225SolLuzFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLLUZCLIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolLuzCliC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3226SolLuzCliC = 0 ;
            n3226SolLuzCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         }
         else
         {
            A3226SolLuzCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtSolLuzCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3226SolLuzCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         }
         A3227SolLuzCliN = httpContext.cgiGet( edtSolLuzCliN_Internalname) ;
         n3227SolLuzCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
         A3228SolLuzSol = httpContext.cgiGet( edtSolLuzSol_Internalname) ;
         n3228SolLuzSol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", A3228SolLuzSol);
         A3229SolLuzNor = httpContext.cgiGet( edtSolLuzNor_Internalname) ;
         n3229SolLuzNor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", A3229SolLuzNor);
         A3230SolLuzMaq = httpContext.cgiGet( edtSolLuzMaq_Internalname) ;
         n3230SolLuzMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLLUZULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolLuzUlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3231SolLuzUlin = (byte)(0) ;
            n3231SolLuzUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         }
         else
         {
            A3231SolLuzUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolLuzUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3231SolLuzUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         }
         A3232SolLuzRef = httpContext.cgiGet( edtSolLuzRef_Internalname) ;
         n3232SolLuzRef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
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
            A3218SolLuzCod = (int)(GXutil.lval( httpContext.GetPar( "SolLuzCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
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
            initAll1IC467( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_468_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_468_Enabled), 5, 0), !bGXsfl_130_Refreshing);
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
      disableAttributes1IC467( ) ;
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

   public void confirm_1IC0( )
   {
      beforeValidate1IC467( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IC467( ) ;
         }
         else
         {
            checkExtendedTable1IC467( ) ;
            if ( AnyError == 0 )
            {
               zm1IC467( 2) ;
               zm1IC467( 3) ;
               zm1IC467( 4) ;
            }
            closeExtendedTableCursors1IC467( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode467 = Gx_mode ;
         confirm_1IC468( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode467 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode467 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1IC0( ) ;
      }
   }

   public void confirm_1IC468( )
   {
      nGXsfl_130_idx = 0 ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         readRow1IC468( ) ;
         if ( ( nRcdExists_468 != 0 ) || ( nIsMod_468 != 0 ) )
         {
            getKey1IC468( ) ;
            if ( ( nRcdExists_468 == 0 ) && ( nRcdDeleted_468 == 0 ) )
            {
               if ( RcdFound468 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1IC468( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1IC468( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1IC468( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "SOLLUZLIN_" + sGXsfl_130_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSolLuzLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound468 != 0 )
               {
                  if ( nRcdDeleted_468 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1IC468( ) ;
                     load1IC468( ) ;
                     beforeValidate1IC468( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1IC468( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_468 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1IC468( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1IC468( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1IC468( ) ;
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
                  if ( nRcdDeleted_468 == 0 )
                  {
                     GXCCtl = "SOLLUZLIN_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolLuzLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_468_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolLuzLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolLuzObs_Internalname, GXutil.rtrim( A3234SolLuzObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3233SolLuzLin_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3234SolLuzObs_"+sGXsfl_130_idx, GXutil.rtrim( Z3234SolLuzObs)) ;
         httpContext.changePostValue( "nRcdDeleted_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_468 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_468_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1IC0( )
   {
   }

   public void zm1IC467( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3219SolLuzMat = T01IC5_A3219SolLuzMat[0] ;
            Z3220SolLuzSer = T01IC5_A3220SolLuzSer[0] ;
            Z3221SolLuzTip = T01IC5_A3221SolLuzTip[0] ;
            Z3222SolLuzDisN = T01IC5_A3222SolLuzDisN[0] ;
            Z3223SolLuzNom = T01IC5_A3223SolLuzNom[0] ;
            Z3224SolLuzNum = T01IC5_A3224SolLuzNum[0] ;
            Z3225SolLuzFec = T01IC5_A3225SolLuzFec[0] ;
            Z3226SolLuzCliC = T01IC5_A3226SolLuzCliC[0] ;
            Z3227SolLuzCliN = T01IC5_A3227SolLuzCliN[0] ;
            Z3228SolLuzSol = T01IC5_A3228SolLuzSol[0] ;
            Z3229SolLuzNor = T01IC5_A3229SolLuzNor[0] ;
            Z3230SolLuzMaq = T01IC5_A3230SolLuzMaq[0] ;
            Z3231SolLuzUlin = T01IC5_A3231SolLuzUlin[0] ;
            Z3232SolLuzRef = T01IC5_A3232SolLuzRef[0] ;
            Z129BarCod = T01IC5_A129BarCod[0] ;
            Z132BarCodReo = T01IC5_A132BarCodReo[0] ;
            Z130BarCodPar = T01IC5_A130BarCodPar[0] ;
            Z652OpeCod = T01IC5_A652OpeCod[0] ;
         }
         else
         {
            Z3219SolLuzMat = A3219SolLuzMat ;
            Z3220SolLuzSer = A3220SolLuzSer ;
            Z3221SolLuzTip = A3221SolLuzTip ;
            Z3222SolLuzDisN = A3222SolLuzDisN ;
            Z3223SolLuzNom = A3223SolLuzNom ;
            Z3224SolLuzNum = A3224SolLuzNum ;
            Z3225SolLuzFec = A3225SolLuzFec ;
            Z3226SolLuzCliC = A3226SolLuzCliC ;
            Z3227SolLuzCliN = A3227SolLuzCliN ;
            Z3228SolLuzSol = A3228SolLuzSol ;
            Z3229SolLuzNor = A3229SolLuzNor ;
            Z3230SolLuzMaq = A3230SolLuzMaq ;
            Z3231SolLuzUlin = A3231SolLuzUlin ;
            Z3232SolLuzRef = A3232SolLuzRef ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z3218SolLuzCod = A3218SolLuzCod ;
         Z3219SolLuzMat = A3219SolLuzMat ;
         Z3220SolLuzSer = A3220SolLuzSer ;
         Z3221SolLuzTip = A3221SolLuzTip ;
         Z3222SolLuzDisN = A3222SolLuzDisN ;
         Z3223SolLuzNom = A3223SolLuzNom ;
         Z3224SolLuzNum = A3224SolLuzNum ;
         Z3225SolLuzFec = A3225SolLuzFec ;
         Z3226SolLuzCliC = A3226SolLuzCliC ;
         Z3227SolLuzCliN = A3227SolLuzCliN ;
         Z3228SolLuzSol = A3228SolLuzSol ;
         Z3229SolLuzNor = A3229SolLuzNor ;
         Z3230SolLuzMaq = A3230SolLuzMaq ;
         Z3231SolLuzUlin = A3231SolLuzUlin ;
         Z3232SolLuzRef = A3232SolLuzRef ;
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
      /* Using cursor T01IC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IC6_A407EmprNom[0] ;
      n407EmprNom = T01IC6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void load1IC467( )
   {
      /* Using cursor T01IC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound467 = (short)(1) ;
         A407EmprNom = T01IC9_A407EmprNom[0] ;
         n407EmprNom = T01IC9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3219SolLuzMat = T01IC9_A3219SolLuzMat[0] ;
         n3219SolLuzMat = T01IC9_n3219SolLuzMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
         A3220SolLuzSer = T01IC9_A3220SolLuzSer[0] ;
         n3220SolLuzSer = T01IC9_n3220SolLuzSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
         A3221SolLuzTip = T01IC9_A3221SolLuzTip[0] ;
         n3221SolLuzTip = T01IC9_n3221SolLuzTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         A3222SolLuzDisN = T01IC9_A3222SolLuzDisN[0] ;
         n3222SolLuzDisN = T01IC9_n3222SolLuzDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
         A3223SolLuzNom = T01IC9_A3223SolLuzNom[0] ;
         n3223SolLuzNom = T01IC9_n3223SolLuzNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
         A3224SolLuzNum = T01IC9_A3224SolLuzNum[0] ;
         n3224SolLuzNum = T01IC9_n3224SolLuzNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         A3225SolLuzFec = T01IC9_A3225SolLuzFec[0] ;
         n3225SolLuzFec = T01IC9_n3225SolLuzFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
         A653OpeNom = T01IC9_A653OpeNom[0] ;
         n653OpeNom = T01IC9_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A3226SolLuzCliC = T01IC9_A3226SolLuzCliC[0] ;
         n3226SolLuzCliC = T01IC9_n3226SolLuzCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         A3227SolLuzCliN = T01IC9_A3227SolLuzCliN[0] ;
         n3227SolLuzCliN = T01IC9_n3227SolLuzCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
         A3228SolLuzSol = T01IC9_A3228SolLuzSol[0] ;
         n3228SolLuzSol = T01IC9_n3228SolLuzSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", A3228SolLuzSol);
         A3229SolLuzNor = T01IC9_A3229SolLuzNor[0] ;
         n3229SolLuzNor = T01IC9_n3229SolLuzNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", A3229SolLuzNor);
         A3230SolLuzMaq = T01IC9_A3230SolLuzMaq[0] ;
         n3230SolLuzMaq = T01IC9_n3230SolLuzMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
         A3231SolLuzUlin = T01IC9_A3231SolLuzUlin[0] ;
         n3231SolLuzUlin = T01IC9_n3231SolLuzUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         A3232SolLuzRef = T01IC9_A3232SolLuzRef[0] ;
         n3232SolLuzRef = T01IC9_n3232SolLuzRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
         A129BarCod = T01IC9_A129BarCod[0] ;
         n129BarCod = T01IC9_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01IC9_A132BarCodReo[0] ;
         n132BarCodReo = T01IC9_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01IC9_A130BarCodPar[0] ;
         n130BarCodPar = T01IC9_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01IC9_A652OpeCod[0] ;
         n652OpeCod = T01IC9_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zm1IC467( -1) ;
      }
      pr_default.close(7);
      onLoadActions1IC467( ) ;
   }

   public void onLoadActions1IC467( )
   {
   }

   public void checkExtendedTable1IC467( )
   {
      nIsDirty_467 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T01IC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01IC8_A653OpeNom[0] ;
      n653OpeNom = T01IC8_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1IC467( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01IC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_4( String A396EmprCod ,
                         int A652OpeCod )
   {
      /* Using cursor T01IC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01IC11_A653OpeNom[0] ;
      n653OpeNom = T01IC11_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1IC467( )
   {
      /* Using cursor T01IC12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound467 = (short)(1) ;
      }
      else
      {
         RcdFound467 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01IC5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1IC467( 1) ;
         RcdFound467 = (short)(1) ;
         A3218SolLuzCod = T01IC5_A3218SolLuzCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
         A3219SolLuzMat = T01IC5_A3219SolLuzMat[0] ;
         n3219SolLuzMat = T01IC5_n3219SolLuzMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
         A3220SolLuzSer = T01IC5_A3220SolLuzSer[0] ;
         n3220SolLuzSer = T01IC5_n3220SolLuzSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
         A3221SolLuzTip = T01IC5_A3221SolLuzTip[0] ;
         n3221SolLuzTip = T01IC5_n3221SolLuzTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
         A3222SolLuzDisN = T01IC5_A3222SolLuzDisN[0] ;
         n3222SolLuzDisN = T01IC5_n3222SolLuzDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
         A3223SolLuzNom = T01IC5_A3223SolLuzNom[0] ;
         n3223SolLuzNom = T01IC5_n3223SolLuzNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
         A3224SolLuzNum = T01IC5_A3224SolLuzNum[0] ;
         n3224SolLuzNum = T01IC5_n3224SolLuzNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
         A3225SolLuzFec = T01IC5_A3225SolLuzFec[0] ;
         n3225SolLuzFec = T01IC5_n3225SolLuzFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
         A3226SolLuzCliC = T01IC5_A3226SolLuzCliC[0] ;
         n3226SolLuzCliC = T01IC5_n3226SolLuzCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
         A3227SolLuzCliN = T01IC5_A3227SolLuzCliN[0] ;
         n3227SolLuzCliN = T01IC5_n3227SolLuzCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
         A3228SolLuzSol = T01IC5_A3228SolLuzSol[0] ;
         n3228SolLuzSol = T01IC5_n3228SolLuzSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", A3228SolLuzSol);
         A3229SolLuzNor = T01IC5_A3229SolLuzNor[0] ;
         n3229SolLuzNor = T01IC5_n3229SolLuzNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", A3229SolLuzNor);
         A3230SolLuzMaq = T01IC5_A3230SolLuzMaq[0] ;
         n3230SolLuzMaq = T01IC5_n3230SolLuzMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
         A3231SolLuzUlin = T01IC5_A3231SolLuzUlin[0] ;
         n3231SolLuzUlin = T01IC5_n3231SolLuzUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
         A3232SolLuzRef = T01IC5_A3232SolLuzRef[0] ;
         n3232SolLuzRef = T01IC5_n3232SolLuzRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
         A129BarCod = T01IC5_A129BarCod[0] ;
         n129BarCod = T01IC5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01IC5_A132BarCodReo[0] ;
         n132BarCodReo = T01IC5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01IC5_A130BarCodPar[0] ;
         n130BarCodPar = T01IC5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01IC5_A652OpeCod[0] ;
         n652OpeCod = T01IC5_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z3218SolLuzCod = A3218SolLuzCod ;
         sMode467 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IC467( ) ;
         if ( AnyError == 1 )
         {
            RcdFound467 = (short)(0) ;
            initializeNonKey1IC467( ) ;
         }
         Gx_mode = sMode467 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound467 = (short)(0) ;
         initializeNonKey1IC467( ) ;
         sMode467 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode467 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1IC467( ) ;
      if ( RcdFound467 == 0 )
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
      RcdFound467 = (short)(0) ;
      /* Using cursor T01IC13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A3218SolLuzCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01IC13_A3218SolLuzCod[0] < A3218SolLuzCod ) ) && ( GXutil.strcmp(T01IC13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01IC13_A3218SolLuzCod[0] > A3218SolLuzCod ) ) && ( GXutil.strcmp(T01IC13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3218SolLuzCod = T01IC13_A3218SolLuzCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
            RcdFound467 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound467 = (short)(0) ;
      /* Using cursor T01IC14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A3218SolLuzCod), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01IC14_A3218SolLuzCod[0] > A3218SolLuzCod ) ) && ( GXutil.strcmp(T01IC14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01IC14_A3218SolLuzCod[0] < A3218SolLuzCod ) ) && ( GXutil.strcmp(T01IC14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3218SolLuzCod = T01IC14_A3218SolLuzCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
            RcdFound467 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IC467( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSolLuzCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IC467( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound467 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
            {
               A3218SolLuzCod = Z3218SolLuzCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSolLuzCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1IC467( ) ;
               GX_FocusControl = edtSolLuzCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtSolLuzCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IC467( ) ;
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
                  GX_FocusControl = edtSolLuzCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1IC467( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
      {
         A3218SolLuzCod = Z3218SolLuzCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSolLuzCod_Internalname ;
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
      getKey1IC467( ) ;
      if ( RcdFound467 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
         {
            A3218SolLuzCod = Z3218SolLuzCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3218SolLuzCod != Z3218SolLuzCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpsolluz");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IC0( ) ;
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
      if ( RcdFound467 == 0 )
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
      scanStart1IC467( ) ;
      if ( RcdFound467 == 0 )
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
      scanEnd1IC467( ) ;
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
      if ( RcdFound467 == 0 )
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
      if ( RcdFound467 == 0 )
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
      scanStart1IC467( ) ;
      if ( RcdFound467 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound467 != 0 )
         {
            scanNext1IC467( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IC467( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IC467( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IC4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCSOLLU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z3219SolLuzMat, T01IC4_A3219SolLuzMat[0]) != 0 ) || ( GXutil.strcmp(Z3220SolLuzSer, T01IC4_A3220SolLuzSer[0]) != 0 ) || ( Z3221SolLuzTip != T01IC4_A3221SolLuzTip[0] ) || ( GXutil.strcmp(Z3222SolLuzDisN, T01IC4_A3222SolLuzDisN[0]) != 0 ) || ( GXutil.strcmp(Z3223SolLuzNom, T01IC4_A3223SolLuzNom[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3224SolLuzNum != T01IC4_A3224SolLuzNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z3225SolLuzFec), GXutil.resetTime(T01IC4_A3225SolLuzFec[0])) ) || ( Z3226SolLuzCliC != T01IC4_A3226SolLuzCliC[0] ) || ( GXutil.strcmp(Z3227SolLuzCliN, T01IC4_A3227SolLuzCliN[0]) != 0 ) || ( GXutil.strcmp(Z3228SolLuzSol, T01IC4_A3228SolLuzSol[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3229SolLuzNor, T01IC4_A3229SolLuzNor[0]) != 0 ) || ( GXutil.strcmp(Z3230SolLuzMaq, T01IC4_A3230SolLuzMaq[0]) != 0 ) || ( Z3231SolLuzUlin != T01IC4_A3231SolLuzUlin[0] ) || ( GXutil.strcmp(Z3232SolLuzRef, T01IC4_A3232SolLuzRef[0]) != 0 ) || ( Z129BarCod != T01IC4_A129BarCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z132BarCodReo != T01IC4_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01IC4_A130BarCodPar[0]) != 0 ) || ( Z652OpeCod != T01IC4_A652OpeCod[0] ) )
         {
            if ( GXutil.strcmp(Z3219SolLuzMat, T01IC4_A3219SolLuzMat[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzMat");
               GXutil.writeLogRaw("Old: ",Z3219SolLuzMat);
               GXutil.writeLogRaw("Current: ",T01IC4_A3219SolLuzMat[0]);
            }
            if ( GXutil.strcmp(Z3220SolLuzSer, T01IC4_A3220SolLuzSer[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzSer");
               GXutil.writeLogRaw("Old: ",Z3220SolLuzSer);
               GXutil.writeLogRaw("Current: ",T01IC4_A3220SolLuzSer[0]);
            }
            if ( Z3221SolLuzTip != T01IC4_A3221SolLuzTip[0] )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzTip");
               GXutil.writeLogRaw("Old: ",Z3221SolLuzTip);
               GXutil.writeLogRaw("Current: ",T01IC4_A3221SolLuzTip[0]);
            }
            if ( GXutil.strcmp(Z3222SolLuzDisN, T01IC4_A3222SolLuzDisN[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzDisN");
               GXutil.writeLogRaw("Old: ",Z3222SolLuzDisN);
               GXutil.writeLogRaw("Current: ",T01IC4_A3222SolLuzDisN[0]);
            }
            if ( GXutil.strcmp(Z3223SolLuzNom, T01IC4_A3223SolLuzNom[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzNom");
               GXutil.writeLogRaw("Old: ",Z3223SolLuzNom);
               GXutil.writeLogRaw("Current: ",T01IC4_A3223SolLuzNom[0]);
            }
            if ( Z3224SolLuzNum != T01IC4_A3224SolLuzNum[0] )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzNum");
               GXutil.writeLogRaw("Old: ",Z3224SolLuzNum);
               GXutil.writeLogRaw("Current: ",T01IC4_A3224SolLuzNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3225SolLuzFec), GXutil.resetTime(T01IC4_A3225SolLuzFec[0])) ) )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzFec");
               GXutil.writeLogRaw("Old: ",Z3225SolLuzFec);
               GXutil.writeLogRaw("Current: ",T01IC4_A3225SolLuzFec[0]);
            }
            if ( Z3226SolLuzCliC != T01IC4_A3226SolLuzCliC[0] )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzCliC");
               GXutil.writeLogRaw("Old: ",Z3226SolLuzCliC);
               GXutil.writeLogRaw("Current: ",T01IC4_A3226SolLuzCliC[0]);
            }
            if ( GXutil.strcmp(Z3227SolLuzCliN, T01IC4_A3227SolLuzCliN[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzCliN");
               GXutil.writeLogRaw("Old: ",Z3227SolLuzCliN);
               GXutil.writeLogRaw("Current: ",T01IC4_A3227SolLuzCliN[0]);
            }
            if ( GXutil.strcmp(Z3228SolLuzSol, T01IC4_A3228SolLuzSol[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzSol");
               GXutil.writeLogRaw("Old: ",Z3228SolLuzSol);
               GXutil.writeLogRaw("Current: ",T01IC4_A3228SolLuzSol[0]);
            }
            if ( GXutil.strcmp(Z3229SolLuzNor, T01IC4_A3229SolLuzNor[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzNor");
               GXutil.writeLogRaw("Old: ",Z3229SolLuzNor);
               GXutil.writeLogRaw("Current: ",T01IC4_A3229SolLuzNor[0]);
            }
            if ( GXutil.strcmp(Z3230SolLuzMaq, T01IC4_A3230SolLuzMaq[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzMaq");
               GXutil.writeLogRaw("Old: ",Z3230SolLuzMaq);
               GXutil.writeLogRaw("Current: ",T01IC4_A3230SolLuzMaq[0]);
            }
            if ( Z3231SolLuzUlin != T01IC4_A3231SolLuzUlin[0] )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzUlin");
               GXutil.writeLogRaw("Old: ",Z3231SolLuzUlin);
               GXutil.writeLogRaw("Current: ",T01IC4_A3231SolLuzUlin[0]);
            }
            if ( GXutil.strcmp(Z3232SolLuzRef, T01IC4_A3232SolLuzRef[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzRef");
               GXutil.writeLogRaw("Old: ",Z3232SolLuzRef);
               GXutil.writeLogRaw("Current: ",T01IC4_A3232SolLuzRef[0]);
            }
            if ( Z129BarCod != T01IC4_A129BarCod[0] )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01IC4_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01IC4_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01IC4_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01IC4_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01IC4_A130BarCodPar[0]);
            }
            if ( Z652OpeCod != T01IC4_A652OpeCod[0] )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T01IC4_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCSOLLU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IC467( )
   {
      beforeValidate1IC467( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IC467( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IC467( 0) ;
         checkOptimisticConcurrency1IC467( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IC467( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IC467( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IC15 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A3218SolLuzCod), Boolean.valueOf(n3219SolLuzMat), A3219SolLuzMat, Boolean.valueOf(n3220SolLuzSer), A3220SolLuzSer, Boolean.valueOf(n3221SolLuzTip), Short.valueOf(A3221SolLuzTip), Boolean.valueOf(n3222SolLuzDisN), A3222SolLuzDisN, Boolean.valueOf(n3223SolLuzNom), A3223SolLuzNom, Boolean.valueOf(n3224SolLuzNum), Integer.valueOf(A3224SolLuzNum), Boolean.valueOf(n3225SolLuzFec), A3225SolLuzFec, Boolean.valueOf(n3226SolLuzCliC), Integer.valueOf(A3226SolLuzCliC), Boolean.valueOf(n3227SolLuzCliN), A3227SolLuzCliN, Boolean.valueOf(n3228SolLuzSol), A3228SolLuzSol, Boolean.valueOf(n3229SolLuzNor), A3229SolLuzNor, Boolean.valueOf(n3230SolLuzMaq), A3230SolLuzMaq, Boolean.valueOf(n3231SolLuzUlin), Byte.valueOf(A3231SolLuzUlin), Boolean.valueOf(n3232SolLuzRef), A3232SolLuzRef, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLLU");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1IC467( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1IC0( ) ;
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
            load1IC467( ) ;
         }
         endLevel1IC467( ) ;
      }
      closeExtendedTableCursors1IC467( ) ;
   }

   public void update1IC467( )
   {
      beforeValidate1IC467( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IC467( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IC467( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IC467( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IC467( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IC16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n3219SolLuzMat), A3219SolLuzMat, Boolean.valueOf(n3220SolLuzSer), A3220SolLuzSer, Boolean.valueOf(n3221SolLuzTip), Short.valueOf(A3221SolLuzTip), Boolean.valueOf(n3222SolLuzDisN), A3222SolLuzDisN, Boolean.valueOf(n3223SolLuzNom), A3223SolLuzNom, Boolean.valueOf(n3224SolLuzNum), Integer.valueOf(A3224SolLuzNum), Boolean.valueOf(n3225SolLuzFec), A3225SolLuzFec, Boolean.valueOf(n3226SolLuzCliC), Integer.valueOf(A3226SolLuzCliC), Boolean.valueOf(n3227SolLuzCliN), A3227SolLuzCliN, Boolean.valueOf(n3228SolLuzSol), A3228SolLuzSol, Boolean.valueOf(n3229SolLuzNor), A3229SolLuzNor, Boolean.valueOf(n3230SolLuzMaq), A3230SolLuzMaq, Boolean.valueOf(n3231SolLuzUlin), Byte.valueOf(A3231SolLuzUlin), Boolean.valueOf(n3232SolLuzRef), A3232SolLuzRef, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLLU");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCSOLLU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IC467( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1IC467( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1IC0( ) ;
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
         endLevel1IC467( ) ;
      }
      closeExtendedTableCursors1IC467( ) ;
   }

   public void deferredUpdate1IC467( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IC467( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IC467( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IC467( ) ;
         afterConfirm1IC467( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IC467( ) ;
            if ( AnyError == 0 )
            {
               scanStart1IC468( ) ;
               while ( RcdFound468 != 0 )
               {
                  getByPrimaryKey1IC468( ) ;
                  delete1IC468( ) ;
                  scanNext1IC468( ) ;
               }
               scanEnd1IC468( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IC17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCSOLLU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound467 == 0 )
                        {
                           initAll1IC467( ) ;
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
                        resetCaption1IC0( ) ;
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
      sMode467 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IC467( ) ;
      Gx_mode = sMode467 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IC467( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01IC18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T01IC18_A653OpeNom[0] ;
         n653OpeNom = T01IC18_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(16);
      }
   }

   public void processNestedLevel1IC468( )
   {
      nGXsfl_130_idx = 0 ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         readRow1IC468( ) ;
         if ( ( nRcdExists_468 != 0 ) || ( nIsMod_468 != 0 ) )
         {
            standaloneNotModal1IC468( ) ;
            getKey1IC468( ) ;
            if ( ( nRcdExists_468 == 0 ) && ( nRcdDeleted_468 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1IC468( ) ;
            }
            else
            {
               if ( RcdFound468 != 0 )
               {
                  if ( ( nRcdDeleted_468 != 0 ) && ( nRcdExists_468 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1IC468( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_468 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1IC468( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_468 == 0 )
                  {
                     GXCCtl = "SOLLUZLIN_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolLuzLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_468_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolLuzLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolLuzObs_Internalname, GXutil.rtrim( A3234SolLuzObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3233SolLuzLin_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3234SolLuzObs_"+sGXsfl_130_idx, GXutil.rtrim( Z3234SolLuzObs)) ;
         httpContext.changePostValue( "nRcdDeleted_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_468_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_468 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_468_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1IC468( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_468 = (short)(0) ;
      nIsMod_468 = (short)(0) ;
      nRcdDeleted_468 = (short)(0) ;
   }

   public void processLevel1IC467( )
   {
      /* Save parent mode. */
      sMode467 = Gx_mode ;
      processNestedLevel1IC468( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode467 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1IC467( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IC467( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpsolluz");
         if ( AnyError == 0 )
         {
            confirmValues1IC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpsolluz");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IC467( )
   {
      this.A396EmprCod = A396EmprCod ;
      /* Scan By routine */
      /* Using cursor T01IC19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound467 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound467 = (short)(1) ;
         A3218SolLuzCod = T01IC19_A3218SolLuzCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IC467( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound467 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound467 = (short)(1) ;
         A3218SolLuzCod = T01IC19_A3218SolLuzCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
      }
   }

   public void scanEnd1IC467( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1IC467( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IC467( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IC467( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IC467( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IC467( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IC467( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IC467( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolLuzCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtSolLuzMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzMat_Enabled), 5, 0), true);
      edtSolLuzSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzSer_Enabled), 5, 0), true);
      edtSolLuzTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzTip_Enabled), 5, 0), true);
      edtSolLuzDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzDisN_Enabled), 5, 0), true);
      edtSolLuzNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNom_Enabled), 5, 0), true);
      edtSolLuzNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNum_Enabled), 5, 0), true);
      edtSolLuzFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzFec_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtSolLuzCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCliC_Enabled), 5, 0), true);
      edtSolLuzCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzCliN_Enabled), 5, 0), true);
      edtSolLuzSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzSol_Enabled), 5, 0), true);
      edtSolLuzNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzNor_Enabled), 5, 0), true);
      edtSolLuzMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzMaq_Enabled), 5, 0), true);
      edtSolLuzUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzUlin_Enabled), 5, 0), true);
      edtSolLuzRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzRef_Enabled), 5, 0), true);
   }

   public void zm1IC468( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3234SolLuzObs = T01IC3_A3234SolLuzObs[0] ;
         }
         else
         {
            Z3234SolLuzObs = A3234SolLuzObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z3218SolLuzCod = A3218SolLuzCod ;
         Z3233SolLuzLin = A3233SolLuzLin ;
         Z3234SolLuzObs = A3234SolLuzObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1IC468( )
   {
   }

   public void standaloneModal1IC468( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSolLuzLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      }
      else
      {
         edtSolLuzLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      }
   }

   public void load1IC468( )
   {
      /* Using cursor T01IC20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound468 = (short)(1) ;
         A3234SolLuzObs = T01IC20_A3234SolLuzObs[0] ;
         n3234SolLuzObs = T01IC20_n3234SolLuzObs[0] ;
         zm1IC468( -5) ;
      }
      pr_default.close(18);
      onLoadActions1IC468( ) ;
   }

   public void onLoadActions1IC468( )
   {
   }

   public void checkExtendedTable1IC468( )
   {
      nIsDirty_468 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1IC468( ) ;
   }

   public void closeExtendedTableCursors1IC468( )
   {
   }

   public void enableDisable1IC468( )
   {
   }

   public void getKey1IC468( )
   {
      /* Using cursor T01IC21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound468 = (short)(1) ;
      }
      else
      {
         RcdFound468 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1IC468( )
   {
      /* Using cursor T01IC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01IC3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1IC468( 5) ;
         RcdFound468 = (short)(1) ;
         initializeNonKey1IC468( ) ;
         A3233SolLuzLin = T01IC3_A3233SolLuzLin[0] ;
         A3234SolLuzObs = T01IC3_A3234SolLuzObs[0] ;
         n3234SolLuzObs = T01IC3_n3234SolLuzObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3218SolLuzCod = A3218SolLuzCod ;
         Z3233SolLuzLin = A3233SolLuzLin ;
         sMode468 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IC468( ) ;
         load1IC468( ) ;
         Gx_mode = sMode468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound468 = (short)(0) ;
         initializeNonKey1IC468( ) ;
         sMode468 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IC468( ) ;
         Gx_mode = sMode468 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1IC468( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1IC468( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLSOLLU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3234SolLuzObs, T01IC2_A3234SolLuzObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3234SolLuzObs, T01IC2_A3234SolLuzObs[0]) != 0 )
            {
               GXutil.writeLogln("tpsolluz:[seudo value changed for attri]"+"SolLuzObs");
               GXutil.writeLogRaw("Old: ",Z3234SolLuzObs);
               GXutil.writeLogRaw("Current: ",T01IC2_A3234SolLuzObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLSOLLU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IC468( )
   {
      beforeValidate1IC468( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IC468( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IC468( 0) ;
         checkOptimisticConcurrency1IC468( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IC468( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IC468( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IC22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin), Boolean.valueOf(n3234SolLuzObs), A3234SolLuzObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLLU");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1IC468( ) ;
         }
         endLevel1IC468( ) ;
      }
      closeExtendedTableCursors1IC468( ) ;
   }

   public void update1IC468( )
   {
      beforeValidate1IC468( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IC468( ) ;
      }
      if ( ( nIsMod_468 != 0 ) || ( nIsDirty_468 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1IC468( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1IC468( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1IC468( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01IC23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n3234SolLuzObs), A3234SolLuzObs, A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLLU");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLSOLLU"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1IC468( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1IC468( ) ;
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
            endLevel1IC468( ) ;
         }
      }
      closeExtendedTableCursors1IC468( ) ;
   }

   public void deferredUpdate1IC468( )
   {
   }

   public void delete1IC468( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IC468( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IC468( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IC468( ) ;
         afterConfirm1IC468( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IC468( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IC24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod), Byte.valueOf(A3233SolLuzLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLSOLLU");
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
      sMode468 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IC468( ) ;
      Gx_mode = sMode468 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IC468( )
   {
      standaloneModal1IC468( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1IC468( )
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

   public void scanStart1IC468( )
   {
      /* Scan By routine */
      /* Using cursor T01IC25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A3218SolLuzCod)});
      RcdFound468 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound468 = (short)(1) ;
         A3233SolLuzLin = T01IC25_A3233SolLuzLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IC468( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound468 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound468 = (short)(1) ;
         A3233SolLuzLin = T01IC25_A3233SolLuzLin[0] ;
      }
   }

   public void scanEnd1IC468( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1IC468( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IC468( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IC468( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IC468( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IC468( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IC468( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IC468( )
   {
      edtSolLuzLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtSolLuzObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzObs_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void send_integrity_lvl_hashes1IC468( )
   {
   }

   public void send_integrity_lvl_hashes1IC467( )
   {
   }

   public void subsflControlProps_130468( )
   {
      edtavnRcdDeleted_468_Internalname = "vNRCDDELETED_468_"+sGXsfl_130_idx ;
      edtSolLuzLin_Internalname = "SOLLUZLIN_"+sGXsfl_130_idx ;
      edtSolLuzObs_Internalname = "SOLLUZOBS_"+sGXsfl_130_idx ;
   }

   public void subsflControlProps_fel_130468( )
   {
      edtavnRcdDeleted_468_Internalname = "vNRCDDELETED_468_"+sGXsfl_130_fel_idx ;
      edtSolLuzLin_Internalname = "SOLLUZLIN_"+sGXsfl_130_fel_idx ;
      edtSolLuzObs_Internalname = "SOLLUZOBS_"+sGXsfl_130_fel_idx ;
   }

   public void addRow1IC468( )
   {
      nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130468( ) ;
      sendRow1IC468( ) ;
   }

   public void sendRow1IC468( )
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
         if ( ((int)((nGXsfl_130_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_468_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_468_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_468_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_468), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_468), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_468_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_468_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_468_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolLuzLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3233SolLuzLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolLuzLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolLuzLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_468_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolLuzObs_Internalname,GXutil.rtrim( A3234SolLuzObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolLuzObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolLuzObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1IC468( ) ;
      GXCCtl = "Z3233SolLuzLin_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3233SolLuzLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3234SolLuzObs_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3234SolLuzObs));
      GXCCtl = "nRcdDeleted_468_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_468_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_468_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_468, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCOD_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV56BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV57BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV58BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_468_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1IC468( )
   {
      nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130468( ) ;
      edtavnRcdDeleted_468_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_468_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolLuzLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLLUZLIN_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolLuzObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLLUZOBS_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_468_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_468_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_468");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_468_Internalname ;
         wbErr = true ;
         nRcdDeleted_468 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_468 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_468_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolLuzLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "SOLLUZLIN_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolLuzLin_Internalname ;
         wbErr = true ;
         A3233SolLuzLin = (byte)(0) ;
      }
      else
      {
         A3233SolLuzLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolLuzLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3234SolLuzObs = httpContext.cgiGet( edtSolLuzObs_Internalname) ;
      n3234SolLuzObs = false ;
      GXCCtl = "Z3233SolLuzLin_" + sGXsfl_130_idx ;
      Z3233SolLuzLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3234SolLuzObs_" + sGXsfl_130_idx ;
      Z3234SolLuzObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_468_" + sGXsfl_130_idx ;
      nRcdDeleted_468 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_468_" + sGXsfl_130_idx ;
      nRcdExists_468 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_468_" + sGXsfl_130_idx ;
      nIsMod_468 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtSolLuzLin_Enabled = edtSolLuzLin_Enabled ;
   }

   public void confirmValues1IC0( )
   {
      nGXsfl_130_idx = 0 ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130468( ) ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_130468( ) ;
         httpContext.changePostValue( "Z3233SolLuzLin_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z3233SolLuzLin_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3233SolLuzLin_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z3234SolLuzObs_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z3234SolLuzObs_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3234SolLuzObs_"+sGXsfl_130_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpsolluz", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV56BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV58BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3218SolLuzCod", GXutil.ltrim( localUtil.ntoc( Z3218SolLuzCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3219SolLuzMat", GXutil.rtrim( Z3219SolLuzMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3220SolLuzSer", GXutil.rtrim( Z3220SolLuzSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3221SolLuzTip", GXutil.ltrim( localUtil.ntoc( Z3221SolLuzTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3222SolLuzDisN", GXutil.rtrim( Z3222SolLuzDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3223SolLuzNom", GXutil.rtrim( Z3223SolLuzNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3224SolLuzNum", GXutil.ltrim( localUtil.ntoc( Z3224SolLuzNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3225SolLuzFec", localUtil.dtoc( Z3225SolLuzFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3226SolLuzCliC", GXutil.ltrim( localUtil.ntoc( Z3226SolLuzCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3227SolLuzCliN", GXutil.rtrim( Z3227SolLuzCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3228SolLuzSol", GXutil.rtrim( Z3228SolLuzSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3229SolLuzNor", GXutil.rtrim( Z3229SolLuzNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3230SolLuzMaq", GXutil.rtrim( Z3230SolLuzMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3231SolLuzUlin", GXutil.ltrim( localUtil.ntoc( Z3231SolLuzUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3232SolLuzRef", GXutil.rtrim( Z3232SolLuzRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_130", GXutil.ltrim( localUtil.ntoc( nGXsfl_130_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV56BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV57BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV58BarCodPar));
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
      return formatLink("app.tpsolluz", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV56BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV58BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TpSOLLUZ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Llamada con parametro", "") ;
   }

   public void initializeNonKey1IC467( )
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
      A3219SolLuzMat = "" ;
      n3219SolLuzMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", A3219SolLuzMat);
      A3220SolLuzSer = "" ;
      n3220SolLuzSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", A3220SolLuzSer);
      A3221SolLuzTip = (short)(0) ;
      n3221SolLuzTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3221SolLuzTip), 4, 0));
      A3222SolLuzDisN = "" ;
      n3222SolLuzDisN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", A3222SolLuzDisN);
      A3223SolLuzNom = "" ;
      n3223SolLuzNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", A3223SolLuzNom);
      A3224SolLuzNum = 0 ;
      n3224SolLuzNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3224SolLuzNum), 6, 0));
      A3225SolLuzFec = GXutil.nullDate() ;
      n3225SolLuzFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A3226SolLuzCliC = 0 ;
      n3226SolLuzCliC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3226SolLuzCliC), 6, 0));
      A3227SolLuzCliN = "" ;
      n3227SolLuzCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", A3227SolLuzCliN);
      A3228SolLuzSol = "" ;
      n3228SolLuzSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", A3228SolLuzSol);
      A3229SolLuzNor = "" ;
      n3229SolLuzNor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", A3229SolLuzNor);
      A3230SolLuzMaq = "" ;
      n3230SolLuzMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", A3230SolLuzMaq);
      A3231SolLuzUlin = (byte)(0) ;
      n3231SolLuzUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3231SolLuzUlin), 2, 0));
      A3232SolLuzRef = "" ;
      n3232SolLuzRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", A3232SolLuzRef);
      Z3219SolLuzMat = "" ;
      Z3220SolLuzSer = "" ;
      Z3221SolLuzTip = (short)(0) ;
      Z3222SolLuzDisN = "" ;
      Z3223SolLuzNom = "" ;
      Z3224SolLuzNum = 0 ;
      Z3225SolLuzFec = GXutil.nullDate() ;
      Z3226SolLuzCliC = 0 ;
      Z3227SolLuzCliN = "" ;
      Z3228SolLuzSol = "" ;
      Z3229SolLuzNor = "" ;
      Z3230SolLuzMaq = "" ;
      Z3231SolLuzUlin = (byte)(0) ;
      Z3232SolLuzRef = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAll1IC467( )
   {
      A3218SolLuzCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3218SolLuzCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3218SolLuzCod), 8, 0));
      initializeNonKey1IC467( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1IC468( )
   {
      A3234SolLuzObs = "" ;
      n3234SolLuzObs = false ;
      Z3234SolLuzObs = "" ;
   }

   public void initAll1IC468( )
   {
      A3233SolLuzLin = (byte)(0) ;
      initializeNonKey1IC468( ) ;
   }

   public void standaloneModalInsert1IC468( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241581362", true, true);
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
      httpContext.AddJavascriptSource("tpsolluz.js", "?20268241581362", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties468( )
   {
      edtSolLuzLin_Enabled = defedtSolLuzLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolLuzLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolLuzLin_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void startgridcontrol130( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_468, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_468_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3233SolLuzLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3234SolLuzObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolLuzObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSolLuzCod_Internalname = "SOLLUZCOD" ;
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
      edtSolLuzMat_Internalname = "SOLLUZMAT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSolLuzSer_Internalname = "SOLLUZSER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSolLuzTip_Internalname = "SOLLUZTIP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSolLuzDisN_Internalname = "SOLLUZDISN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSolLuzNom_Internalname = "SOLLUZNOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtSolLuzNum_Internalname = "SOLLUZNUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtSolLuzFec_Internalname = "SOLLUZFEC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtSolLuzCliC_Internalname = "SOLLUZCLIC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtSolLuzCliN_Internalname = "SOLLUZCLIN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtSolLuzSol_Internalname = "SOLLUZSOL" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtSolLuzNor_Internalname = "SOLLUZNOR" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtSolLuzMaq_Internalname = "SOLLUZMAQ" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtSolLuzUlin_Internalname = "SOLLUZULIN" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtSolLuzRef_Internalname = "SOLLUZREF" ;
      edtavnRcdDeleted_468_Internalname = "vNRCDDELETED_468" ;
      edtSolLuzLin_Internalname = "SOLLUZLIN" ;
      edtSolLuzObs_Internalname = "SOLLUZOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Llamada con parametro", "") );
      edtSolLuzObs_Jsonclick = "" ;
      edtSolLuzLin_Jsonclick = "" ;
      edtavnRcdDeleted_468_Jsonclick = "" ;
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
      edtSolLuzObs_Enabled = 1 ;
      edtSolLuzLin_Enabled = 1 ;
      edtavnRcdDeleted_468_Enabled = 1 ;
      edtSolLuzRef_Jsonclick = "" ;
      edtSolLuzRef_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzRef_Enabled = 1 ;
      edtSolLuzUlin_Jsonclick = "" ;
      edtSolLuzUlin_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzUlin_Enabled = 1 ;
      edtSolLuzMaq_Jsonclick = "" ;
      edtSolLuzMaq_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzMaq_Enabled = 1 ;
      edtSolLuzNor_Jsonclick = "" ;
      edtSolLuzNor_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzNor_Enabled = 1 ;
      edtSolLuzSol_Jsonclick = "" ;
      edtSolLuzSol_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzSol_Enabled = 1 ;
      edtSolLuzCliN_Jsonclick = "" ;
      edtSolLuzCliN_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzCliN_Enabled = 1 ;
      edtSolLuzCliC_Jsonclick = "" ;
      edtSolLuzCliC_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzCliC_Enabled = 1 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtSolLuzFec_Jsonclick = "" ;
      edtSolLuzFec_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzFec_Enabled = 1 ;
      edtSolLuzNum_Jsonclick = "" ;
      edtSolLuzNum_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzNum_Enabled = 1 ;
      edtSolLuzNom_Jsonclick = "" ;
      edtSolLuzNom_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzNom_Enabled = 1 ;
      edtSolLuzDisN_Jsonclick = "" ;
      edtSolLuzDisN_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzDisN_Enabled = 1 ;
      edtSolLuzTip_Jsonclick = "" ;
      edtSolLuzTip_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzTip_Enabled = 1 ;
      edtSolLuzSer_Jsonclick = "" ;
      edtSolLuzSer_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzSer_Enabled = 1 ;
      edtSolLuzMat_Jsonclick = "" ;
      edtSolLuzMat_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzMat_Enabled = 1 ;
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
      edtSolLuzCod_Jsonclick = "" ;
      edtSolLuzCod_Backcolor = (int)(0xFFFFFF) ;
      edtSolLuzCod_Enabled = 1 ;
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
      subsflControlProps_130468( ) ;
      while ( nGXsfl_130_idx <= nRC_GXsfl_130 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1IC468( ) ;
         standaloneModal1IC468( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1IC468( ) ;
         nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_130468( ) ;
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
      /* Using cursor T01IC26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IC26_A407EmprNom[0] ;
      n407EmprNom = T01IC26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
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

   public void valid_Solluzcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A3219SolLuzMat", GXutil.rtrim( A3219SolLuzMat));
      httpContext.ajax_rsp_assign_attri("", false, "A3220SolLuzSer", GXutil.rtrim( A3220SolLuzSer));
      httpContext.ajax_rsp_assign_attri("", false, "A3221SolLuzTip", GXutil.ltrim( localUtil.ntoc( A3221SolLuzTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3222SolLuzDisN", GXutil.rtrim( A3222SolLuzDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A3223SolLuzNom", GXutil.rtrim( A3223SolLuzNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3224SolLuzNum", GXutil.ltrim( localUtil.ntoc( A3224SolLuzNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3225SolLuzFec", localUtil.format(A3225SolLuzFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3226SolLuzCliC", GXutil.ltrim( localUtil.ntoc( A3226SolLuzCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3227SolLuzCliN", GXutil.rtrim( A3227SolLuzCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A3228SolLuzSol", GXutil.rtrim( A3228SolLuzSol));
      httpContext.ajax_rsp_assign_attri("", false, "A3229SolLuzNor", GXutil.rtrim( A3229SolLuzNor));
      httpContext.ajax_rsp_assign_attri("", false, "A3230SolLuzMaq", GXutil.rtrim( A3230SolLuzMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A3231SolLuzUlin", GXutil.ltrim( localUtil.ntoc( A3231SolLuzUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3232SolLuzRef", GXutil.rtrim( A3232SolLuzRef));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3218SolLuzCod", GXutil.ltrim( localUtil.ntoc( Z3218SolLuzCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3219SolLuzMat", GXutil.rtrim( Z3219SolLuzMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3220SolLuzSer", GXutil.rtrim( Z3220SolLuzSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3221SolLuzTip", GXutil.ltrim( localUtil.ntoc( Z3221SolLuzTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3222SolLuzDisN", GXutil.rtrim( Z3222SolLuzDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3223SolLuzNom", GXutil.rtrim( Z3223SolLuzNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3224SolLuzNum", GXutil.ltrim( localUtil.ntoc( Z3224SolLuzNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3225SolLuzFec", localUtil.format(Z3225SolLuzFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3226SolLuzCliC", GXutil.ltrim( localUtil.ntoc( Z3226SolLuzCliC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3227SolLuzCliN", GXutil.rtrim( Z3227SolLuzCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3228SolLuzSol", GXutil.rtrim( Z3228SolLuzSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3229SolLuzNor", GXutil.rtrim( Z3229SolLuzNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3230SolLuzMaq", GXutil.rtrim( Z3230SolLuzMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3231SolLuzUlin", GXutil.ltrim( localUtil.ntoc( Z3231SolLuzUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3232SolLuzRef", GXutil.rtrim( Z3232SolLuzRef));
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
      /* Using cursor T01IC27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T01IC18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T01IC18_A653OpeNom[0] ;
      n653OpeNom = T01IC18_n653OpeNom[0] ;
      pr_default.close(16);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_SOLLUZCOD","{handler:'valid_Solluzcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3218SolLuzCod',fld:'SOLLUZCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_SOLLUZCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3219SolLuzMat',fld:'SOLLUZMAT',pic:''},{av:'A3220SolLuzSer',fld:'SOLLUZSER',pic:''},{av:'A3221SolLuzTip',fld:'SOLLUZTIP',pic:'ZZZ9'},{av:'A3222SolLuzDisN',fld:'SOLLUZDISN',pic:''},{av:'A3223SolLuzNom',fld:'SOLLUZNOM',pic:''},{av:'A3224SolLuzNum',fld:'SOLLUZNUM',pic:'ZZZZZ9'},{av:'A3225SolLuzFec',fld:'SOLLUZFEC',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A3226SolLuzCliC',fld:'SOLLUZCLIC',pic:'ZZZZZ9'},{av:'A3227SolLuzCliN',fld:'SOLLUZCLIN',pic:''},{av:'A3228SolLuzSol',fld:'SOLLUZSOL',pic:''},{av:'A3229SolLuzNor',fld:'SOLLUZNOR',pic:''},{av:'A3230SolLuzMaq',fld:'SOLLUZMAQ',pic:''},{av:'A3231SolLuzUlin',fld:'SOLLUZULIN',pic:'Z9'},{av:'A3232SolLuzRef',fld:'SOLLUZREF',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3218SolLuzCod'},{av:'Z407EmprNom'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z3219SolLuzMat'},{av:'Z3220SolLuzSer'},{av:'Z3221SolLuzTip'},{av:'Z3222SolLuzDisN'},{av:'Z3223SolLuzNom'},{av:'Z3224SolLuzNum'},{av:'Z3225SolLuzFec'},{av:'Z652OpeCod'},{av:'Z3226SolLuzCliC'},{av:'Z3227SolLuzCliN'},{av:'Z3228SolLuzSol'},{av:'Z3229SolLuzNor'},{av:'Z3230SolLuzMaq'},{av:'Z3231SolLuzUlin'},{av:'Z3232SolLuzRef'},{av:'Z653OpeNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_SOLLUZLIN","{handler:'valid_Solluzlin',iparms:[]");
      setEventMetadata("VALID_SOLLUZLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Solluzobs',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(24);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOAV58BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z3219SolLuzMat = "" ;
      Z3220SolLuzSer = "" ;
      Z3222SolLuzDisN = "" ;
      Z3223SolLuzNom = "" ;
      Z3225SolLuzFec = GXutil.nullDate() ;
      Z3227SolLuzCliN = "" ;
      Z3228SolLuzSol = "" ;
      Z3229SolLuzNor = "" ;
      Z3230SolLuzMaq = "" ;
      Z3232SolLuzRef = "" ;
      Z130BarCodPar = "" ;
      Z3234SolLuzObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV58BarCodPar = "" ;
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
      A3219SolLuzMat = "" ;
      lblTextblock8_Jsonclick = "" ;
      A3220SolLuzSer = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3222SolLuzDisN = "" ;
      lblTextblock11_Jsonclick = "" ;
      A3223SolLuzNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A3225SolLuzFec = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A3227SolLuzCliN = "" ;
      lblTextblock18_Jsonclick = "" ;
      A3228SolLuzSol = "" ;
      lblTextblock19_Jsonclick = "" ;
      A3229SolLuzNor = "" ;
      lblTextblock20_Jsonclick = "" ;
      A3230SolLuzMaq = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A3232SolLuzRef = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode468 = "" ;
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
      sMode467 = "" ;
      GXCCtl = "" ;
      A3234SolLuzObs = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T01IC6_A407EmprNom = new String[] {""} ;
      T01IC6_n407EmprNom = new boolean[] {false} ;
      T01IC9_A3218SolLuzCod = new int[1] ;
      T01IC9_A407EmprNom = new String[] {""} ;
      T01IC9_n407EmprNom = new boolean[] {false} ;
      T01IC9_A3219SolLuzMat = new String[] {""} ;
      T01IC9_n3219SolLuzMat = new boolean[] {false} ;
      T01IC9_A3220SolLuzSer = new String[] {""} ;
      T01IC9_n3220SolLuzSer = new boolean[] {false} ;
      T01IC9_A3221SolLuzTip = new short[1] ;
      T01IC9_n3221SolLuzTip = new boolean[] {false} ;
      T01IC9_A3222SolLuzDisN = new String[] {""} ;
      T01IC9_n3222SolLuzDisN = new boolean[] {false} ;
      T01IC9_A3223SolLuzNom = new String[] {""} ;
      T01IC9_n3223SolLuzNom = new boolean[] {false} ;
      T01IC9_A3224SolLuzNum = new int[1] ;
      T01IC9_n3224SolLuzNum = new boolean[] {false} ;
      T01IC9_A3225SolLuzFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IC9_n3225SolLuzFec = new boolean[] {false} ;
      T01IC9_A653OpeNom = new String[] {""} ;
      T01IC9_n653OpeNom = new boolean[] {false} ;
      T01IC9_A3226SolLuzCliC = new int[1] ;
      T01IC9_n3226SolLuzCliC = new boolean[] {false} ;
      T01IC9_A3227SolLuzCliN = new String[] {""} ;
      T01IC9_n3227SolLuzCliN = new boolean[] {false} ;
      T01IC9_A3228SolLuzSol = new String[] {""} ;
      T01IC9_n3228SolLuzSol = new boolean[] {false} ;
      T01IC9_A3229SolLuzNor = new String[] {""} ;
      T01IC9_n3229SolLuzNor = new boolean[] {false} ;
      T01IC9_A3230SolLuzMaq = new String[] {""} ;
      T01IC9_n3230SolLuzMaq = new boolean[] {false} ;
      T01IC9_A3231SolLuzUlin = new byte[1] ;
      T01IC9_n3231SolLuzUlin = new boolean[] {false} ;
      T01IC9_A3232SolLuzRef = new String[] {""} ;
      T01IC9_n3232SolLuzRef = new boolean[] {false} ;
      T01IC9_A396EmprCod = new String[] {""} ;
      T01IC9_A129BarCod = new int[1] ;
      T01IC9_n129BarCod = new boolean[] {false} ;
      T01IC9_A132BarCodReo = new byte[1] ;
      T01IC9_n132BarCodReo = new boolean[] {false} ;
      T01IC9_A130BarCodPar = new String[] {""} ;
      T01IC9_n130BarCodPar = new boolean[] {false} ;
      T01IC9_A652OpeCod = new int[1] ;
      T01IC9_n652OpeCod = new boolean[] {false} ;
      T01IC7_A396EmprCod = new String[] {""} ;
      T01IC8_A653OpeNom = new String[] {""} ;
      T01IC8_n653OpeNom = new boolean[] {false} ;
      T01IC10_A396EmprCod = new String[] {""} ;
      T01IC11_A653OpeNom = new String[] {""} ;
      T01IC11_n653OpeNom = new boolean[] {false} ;
      T01IC12_A396EmprCod = new String[] {""} ;
      T01IC12_A3218SolLuzCod = new int[1] ;
      T01IC5_A3218SolLuzCod = new int[1] ;
      T01IC5_A3219SolLuzMat = new String[] {""} ;
      T01IC5_n3219SolLuzMat = new boolean[] {false} ;
      T01IC5_A3220SolLuzSer = new String[] {""} ;
      T01IC5_n3220SolLuzSer = new boolean[] {false} ;
      T01IC5_A3221SolLuzTip = new short[1] ;
      T01IC5_n3221SolLuzTip = new boolean[] {false} ;
      T01IC5_A3222SolLuzDisN = new String[] {""} ;
      T01IC5_n3222SolLuzDisN = new boolean[] {false} ;
      T01IC5_A3223SolLuzNom = new String[] {""} ;
      T01IC5_n3223SolLuzNom = new boolean[] {false} ;
      T01IC5_A3224SolLuzNum = new int[1] ;
      T01IC5_n3224SolLuzNum = new boolean[] {false} ;
      T01IC5_A3225SolLuzFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IC5_n3225SolLuzFec = new boolean[] {false} ;
      T01IC5_A3226SolLuzCliC = new int[1] ;
      T01IC5_n3226SolLuzCliC = new boolean[] {false} ;
      T01IC5_A3227SolLuzCliN = new String[] {""} ;
      T01IC5_n3227SolLuzCliN = new boolean[] {false} ;
      T01IC5_A3228SolLuzSol = new String[] {""} ;
      T01IC5_n3228SolLuzSol = new boolean[] {false} ;
      T01IC5_A3229SolLuzNor = new String[] {""} ;
      T01IC5_n3229SolLuzNor = new boolean[] {false} ;
      T01IC5_A3230SolLuzMaq = new String[] {""} ;
      T01IC5_n3230SolLuzMaq = new boolean[] {false} ;
      T01IC5_A3231SolLuzUlin = new byte[1] ;
      T01IC5_n3231SolLuzUlin = new boolean[] {false} ;
      T01IC5_A3232SolLuzRef = new String[] {""} ;
      T01IC5_n3232SolLuzRef = new boolean[] {false} ;
      T01IC5_A396EmprCod = new String[] {""} ;
      T01IC5_A129BarCod = new int[1] ;
      T01IC5_n129BarCod = new boolean[] {false} ;
      T01IC5_A132BarCodReo = new byte[1] ;
      T01IC5_n132BarCodReo = new boolean[] {false} ;
      T01IC5_A130BarCodPar = new String[] {""} ;
      T01IC5_n130BarCodPar = new boolean[] {false} ;
      T01IC5_A652OpeCod = new int[1] ;
      T01IC5_n652OpeCod = new boolean[] {false} ;
      T01IC13_A396EmprCod = new String[] {""} ;
      T01IC13_A3218SolLuzCod = new int[1] ;
      T01IC14_A396EmprCod = new String[] {""} ;
      T01IC14_A3218SolLuzCod = new int[1] ;
      T01IC4_A3218SolLuzCod = new int[1] ;
      T01IC4_A3219SolLuzMat = new String[] {""} ;
      T01IC4_n3219SolLuzMat = new boolean[] {false} ;
      T01IC4_A3220SolLuzSer = new String[] {""} ;
      T01IC4_n3220SolLuzSer = new boolean[] {false} ;
      T01IC4_A3221SolLuzTip = new short[1] ;
      T01IC4_n3221SolLuzTip = new boolean[] {false} ;
      T01IC4_A3222SolLuzDisN = new String[] {""} ;
      T01IC4_n3222SolLuzDisN = new boolean[] {false} ;
      T01IC4_A3223SolLuzNom = new String[] {""} ;
      T01IC4_n3223SolLuzNom = new boolean[] {false} ;
      T01IC4_A3224SolLuzNum = new int[1] ;
      T01IC4_n3224SolLuzNum = new boolean[] {false} ;
      T01IC4_A3225SolLuzFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IC4_n3225SolLuzFec = new boolean[] {false} ;
      T01IC4_A3226SolLuzCliC = new int[1] ;
      T01IC4_n3226SolLuzCliC = new boolean[] {false} ;
      T01IC4_A3227SolLuzCliN = new String[] {""} ;
      T01IC4_n3227SolLuzCliN = new boolean[] {false} ;
      T01IC4_A3228SolLuzSol = new String[] {""} ;
      T01IC4_n3228SolLuzSol = new boolean[] {false} ;
      T01IC4_A3229SolLuzNor = new String[] {""} ;
      T01IC4_n3229SolLuzNor = new boolean[] {false} ;
      T01IC4_A3230SolLuzMaq = new String[] {""} ;
      T01IC4_n3230SolLuzMaq = new boolean[] {false} ;
      T01IC4_A3231SolLuzUlin = new byte[1] ;
      T01IC4_n3231SolLuzUlin = new boolean[] {false} ;
      T01IC4_A3232SolLuzRef = new String[] {""} ;
      T01IC4_n3232SolLuzRef = new boolean[] {false} ;
      T01IC4_A396EmprCod = new String[] {""} ;
      T01IC4_A129BarCod = new int[1] ;
      T01IC4_n129BarCod = new boolean[] {false} ;
      T01IC4_A132BarCodReo = new byte[1] ;
      T01IC4_n132BarCodReo = new boolean[] {false} ;
      T01IC4_A130BarCodPar = new String[] {""} ;
      T01IC4_n130BarCodPar = new boolean[] {false} ;
      T01IC4_A652OpeCod = new int[1] ;
      T01IC4_n652OpeCod = new boolean[] {false} ;
      T01IC18_A653OpeNom = new String[] {""} ;
      T01IC18_n653OpeNom = new boolean[] {false} ;
      T01IC19_A396EmprCod = new String[] {""} ;
      T01IC19_A3218SolLuzCod = new int[1] ;
      T01IC20_A3218SolLuzCod = new int[1] ;
      T01IC20_A3233SolLuzLin = new byte[1] ;
      T01IC20_A3234SolLuzObs = new String[] {""} ;
      T01IC20_n3234SolLuzObs = new boolean[] {false} ;
      T01IC20_A396EmprCod = new String[] {""} ;
      T01IC21_A396EmprCod = new String[] {""} ;
      T01IC21_A3218SolLuzCod = new int[1] ;
      T01IC21_A3233SolLuzLin = new byte[1] ;
      T01IC3_A3218SolLuzCod = new int[1] ;
      T01IC3_A3233SolLuzLin = new byte[1] ;
      T01IC3_A3234SolLuzObs = new String[] {""} ;
      T01IC3_n3234SolLuzObs = new boolean[] {false} ;
      T01IC3_A396EmprCod = new String[] {""} ;
      T01IC2_A3218SolLuzCod = new int[1] ;
      T01IC2_A3233SolLuzLin = new byte[1] ;
      T01IC2_A3234SolLuzObs = new String[] {""} ;
      T01IC2_n3234SolLuzObs = new boolean[] {false} ;
      T01IC2_A396EmprCod = new String[] {""} ;
      T01IC25_A396EmprCod = new String[] {""} ;
      T01IC25_A3218SolLuzCod = new int[1] ;
      T01IC25_A3233SolLuzLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01IC26_A407EmprNom = new String[] {""} ;
      T01IC26_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ130BarCodPar = "" ;
      ZZ3219SolLuzMat = "" ;
      ZZ3220SolLuzSer = "" ;
      ZZ3222SolLuzDisN = "" ;
      ZZ3223SolLuzNom = "" ;
      ZZ3225SolLuzFec = GXutil.nullDate() ;
      ZZ3227SolLuzCliN = "" ;
      ZZ3228SolLuzSol = "" ;
      ZZ3229SolLuzNor = "" ;
      ZZ3230SolLuzMaq = "" ;
      ZZ3232SolLuzRef = "" ;
      ZZ653OpeNom = "" ;
      T01IC27_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpsolluz__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpsolluz__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpsolluz__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpsolluz__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpsolluz__default(),
         new Object[] {
             new Object[] {
            T01IC2_A3218SolLuzCod, T01IC2_A3233SolLuzLin, T01IC2_A3234SolLuzObs, T01IC2_n3234SolLuzObs, T01IC2_A396EmprCod
            }
            , new Object[] {
            T01IC3_A3218SolLuzCod, T01IC3_A3233SolLuzLin, T01IC3_A3234SolLuzObs, T01IC3_n3234SolLuzObs, T01IC3_A396EmprCod
            }
            , new Object[] {
            T01IC4_A3218SolLuzCod, T01IC4_A3219SolLuzMat, T01IC4_n3219SolLuzMat, T01IC4_A3220SolLuzSer, T01IC4_n3220SolLuzSer, T01IC4_A3221SolLuzTip, T01IC4_n3221SolLuzTip, T01IC4_A3222SolLuzDisN, T01IC4_n3222SolLuzDisN, T01IC4_A3223SolLuzNom,
            T01IC4_n3223SolLuzNom, T01IC4_A3224SolLuzNum, T01IC4_n3224SolLuzNum, T01IC4_A3225SolLuzFec, T01IC4_n3225SolLuzFec, T01IC4_A3226SolLuzCliC, T01IC4_n3226SolLuzCliC, T01IC4_A3227SolLuzCliN, T01IC4_n3227SolLuzCliN, T01IC4_A3228SolLuzSol,
            T01IC4_n3228SolLuzSol, T01IC4_A3229SolLuzNor, T01IC4_n3229SolLuzNor, T01IC4_A3230SolLuzMaq, T01IC4_n3230SolLuzMaq, T01IC4_A3231SolLuzUlin, T01IC4_n3231SolLuzUlin, T01IC4_A3232SolLuzRef, T01IC4_n3232SolLuzRef, T01IC4_A396EmprCod,
            T01IC4_A129BarCod, T01IC4_n129BarCod, T01IC4_A132BarCodReo, T01IC4_n132BarCodReo, T01IC4_A130BarCodPar, T01IC4_n130BarCodPar, T01IC4_A652OpeCod, T01IC4_n652OpeCod
            }
            , new Object[] {
            T01IC5_A3218SolLuzCod, T01IC5_A3219SolLuzMat, T01IC5_n3219SolLuzMat, T01IC5_A3220SolLuzSer, T01IC5_n3220SolLuzSer, T01IC5_A3221SolLuzTip, T01IC5_n3221SolLuzTip, T01IC5_A3222SolLuzDisN, T01IC5_n3222SolLuzDisN, T01IC5_A3223SolLuzNom,
            T01IC5_n3223SolLuzNom, T01IC5_A3224SolLuzNum, T01IC5_n3224SolLuzNum, T01IC5_A3225SolLuzFec, T01IC5_n3225SolLuzFec, T01IC5_A3226SolLuzCliC, T01IC5_n3226SolLuzCliC, T01IC5_A3227SolLuzCliN, T01IC5_n3227SolLuzCliN, T01IC5_A3228SolLuzSol,
            T01IC5_n3228SolLuzSol, T01IC5_A3229SolLuzNor, T01IC5_n3229SolLuzNor, T01IC5_A3230SolLuzMaq, T01IC5_n3230SolLuzMaq, T01IC5_A3231SolLuzUlin, T01IC5_n3231SolLuzUlin, T01IC5_A3232SolLuzRef, T01IC5_n3232SolLuzRef, T01IC5_A396EmprCod,
            T01IC5_A129BarCod, T01IC5_n129BarCod, T01IC5_A132BarCodReo, T01IC5_n132BarCodReo, T01IC5_A130BarCodPar, T01IC5_n130BarCodPar, T01IC5_A652OpeCod, T01IC5_n652OpeCod
            }
            , new Object[] {
            T01IC6_A407EmprNom, T01IC6_n407EmprNom
            }
            , new Object[] {
            T01IC7_A396EmprCod
            }
            , new Object[] {
            T01IC8_A653OpeNom, T01IC8_n653OpeNom
            }
            , new Object[] {
            T01IC9_A3218SolLuzCod, T01IC9_A407EmprNom, T01IC9_n407EmprNom, T01IC9_A3219SolLuzMat, T01IC9_n3219SolLuzMat, T01IC9_A3220SolLuzSer, T01IC9_n3220SolLuzSer, T01IC9_A3221SolLuzTip, T01IC9_n3221SolLuzTip, T01IC9_A3222SolLuzDisN,
            T01IC9_n3222SolLuzDisN, T01IC9_A3223SolLuzNom, T01IC9_n3223SolLuzNom, T01IC9_A3224SolLuzNum, T01IC9_n3224SolLuzNum, T01IC9_A3225SolLuzFec, T01IC9_n3225SolLuzFec, T01IC9_A653OpeNom, T01IC9_n653OpeNom, T01IC9_A3226SolLuzCliC,
            T01IC9_n3226SolLuzCliC, T01IC9_A3227SolLuzCliN, T01IC9_n3227SolLuzCliN, T01IC9_A3228SolLuzSol, T01IC9_n3228SolLuzSol, T01IC9_A3229SolLuzNor, T01IC9_n3229SolLuzNor, T01IC9_A3230SolLuzMaq, T01IC9_n3230SolLuzMaq, T01IC9_A3231SolLuzUlin,
            T01IC9_n3231SolLuzUlin, T01IC9_A3232SolLuzRef, T01IC9_n3232SolLuzRef, T01IC9_A396EmprCod, T01IC9_A129BarCod, T01IC9_n129BarCod, T01IC9_A132BarCodReo, T01IC9_n132BarCodReo, T01IC9_A130BarCodPar, T01IC9_n130BarCodPar,
            T01IC9_A652OpeCod, T01IC9_n652OpeCod
            }
            , new Object[] {
            T01IC10_A396EmprCod
            }
            , new Object[] {
            T01IC11_A653OpeNom, T01IC11_n653OpeNom
            }
            , new Object[] {
            T01IC12_A396EmprCod, T01IC12_A3218SolLuzCod
            }
            , new Object[] {
            T01IC13_A396EmprCod, T01IC13_A3218SolLuzCod
            }
            , new Object[] {
            T01IC14_A396EmprCod, T01IC14_A3218SolLuzCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IC18_A653OpeNom, T01IC18_n653OpeNom
            }
            , new Object[] {
            T01IC19_A396EmprCod, T01IC19_A3218SolLuzCod
            }
            , new Object[] {
            T01IC20_A3218SolLuzCod, T01IC20_A3233SolLuzLin, T01IC20_A3234SolLuzObs, T01IC20_n3234SolLuzObs, T01IC20_A396EmprCod
            }
            , new Object[] {
            T01IC21_A396EmprCod, T01IC21_A3218SolLuzCod, T01IC21_A3233SolLuzLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IC25_A396EmprCod, T01IC25_A3218SolLuzCod, T01IC25_A3233SolLuzLin
            }
            , new Object[] {
            T01IC26_A407EmprNom, T01IC26_n407EmprNom
            }
            , new Object[] {
            T01IC27_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOAV57BarCodReo ;
   private byte Z3231SolLuzUlin ;
   private byte Z132BarCodReo ;
   private byte Z3233SolLuzLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV57BarCodReo ;
   private byte nKeyPressed ;
   private byte A3231SolLuzUlin ;
   private byte A3233SolLuzLin ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3231SolLuzUlin ;
   private short Z3221SolLuzTip ;
   private short nRcdDeleted_468 ;
   private short nRcdExists_468 ;
   private short nIsMod_468 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3221SolLuzTip ;
   private short nBlankRcdCount468 ;
   private short RcdFound468 ;
   private short nBlankRcdUsr468 ;
   private short RcdFound467 ;
   private short nIsDirty_467 ;
   private short nIsDirty_468 ;
   private short ZZ3221SolLuzTip ;
   private int wcpOAV56BarCod ;
   private int Z3218SolLuzCod ;
   private int Z3224SolLuzNum ;
   private int Z3226SolLuzCliC ;
   private int Z129BarCod ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_130 ;
   private int nGXsfl_130_idx=1 ;
   private int A129BarCod ;
   private int A652OpeCod ;
   private int AV56BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A3218SolLuzCod ;
   private int edtSolLuzCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtSolLuzMat_Enabled ;
   private int edtSolLuzSer_Enabled ;
   private int edtSolLuzTip_Enabled ;
   private int edtSolLuzDisN_Enabled ;
   private int edtSolLuzNom_Enabled ;
   private int A3224SolLuzNum ;
   private int edtSolLuzNum_Enabled ;
   private int edtSolLuzFec_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int A3226SolLuzCliC ;
   private int edtSolLuzCliC_Enabled ;
   private int edtSolLuzCliN_Enabled ;
   private int edtSolLuzSol_Enabled ;
   private int edtSolLuzNor_Enabled ;
   private int edtSolLuzMaq_Enabled ;
   private int edtSolLuzUlin_Enabled ;
   private int edtSolLuzRef_Enabled ;
   private int edtavnRcdDeleted_468_Enabled ;
   private int edtSolLuzLin_Enabled ;
   private int edtSolLuzObs_Enabled ;
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
   private int defedtSolLuzLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSolLuzRef_Backcolor ;
   private int edtSolLuzUlin_Backcolor ;
   private int edtSolLuzMaq_Backcolor ;
   private int edtSolLuzNor_Backcolor ;
   private int edtSolLuzSol_Backcolor ;
   private int edtSolLuzCliN_Backcolor ;
   private int edtSolLuzCliC_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtSolLuzFec_Backcolor ;
   private int edtSolLuzNum_Backcolor ;
   private int edtSolLuzNom_Backcolor ;
   private int edtSolLuzDisN_Backcolor ;
   private int edtSolLuzTip_Backcolor ;
   private int edtSolLuzSer_Backcolor ;
   private int edtSolLuzMat_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtSolLuzCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ3218SolLuzCod ;
   private int ZZ129BarCod ;
   private int ZZ3224SolLuzNum ;
   private int ZZ652OpeCod ;
   private int ZZ3226SolLuzCliC ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV58BarCodPar ;
   private String Z396EmprCod ;
   private String Z3219SolLuzMat ;
   private String Z3220SolLuzSer ;
   private String Z3222SolLuzDisN ;
   private String Z3223SolLuzNom ;
   private String Z3227SolLuzCliN ;
   private String Z3228SolLuzSol ;
   private String Z3229SolLuzNor ;
   private String Z3230SolLuzMaq ;
   private String Z3232SolLuzRef ;
   private String Z130BarCodPar ;
   private String Z3234SolLuzObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV58BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSolLuzCod_Internalname ;
   private String sGXsfl_130_idx="0001" ;
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
   private String edtSolLuzCod_Jsonclick ;
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
   private String edtSolLuzMat_Internalname ;
   private String A3219SolLuzMat ;
   private String edtSolLuzMat_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSolLuzSer_Internalname ;
   private String A3220SolLuzSer ;
   private String edtSolLuzSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSolLuzTip_Internalname ;
   private String edtSolLuzTip_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSolLuzDisN_Internalname ;
   private String A3222SolLuzDisN ;
   private String edtSolLuzDisN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSolLuzNom_Internalname ;
   private String A3223SolLuzNom ;
   private String edtSolLuzNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtSolLuzNum_Internalname ;
   private String edtSolLuzNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtSolLuzFec_Internalname ;
   private String edtSolLuzFec_Jsonclick ;
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
   private String edtSolLuzCliC_Internalname ;
   private String edtSolLuzCliC_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtSolLuzCliN_Internalname ;
   private String A3227SolLuzCliN ;
   private String edtSolLuzCliN_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtSolLuzSol_Internalname ;
   private String A3228SolLuzSol ;
   private String edtSolLuzSol_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtSolLuzNor_Internalname ;
   private String A3229SolLuzNor ;
   private String edtSolLuzNor_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtSolLuzMaq_Internalname ;
   private String A3230SolLuzMaq ;
   private String edtSolLuzMaq_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtSolLuzUlin_Internalname ;
   private String edtSolLuzUlin_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtSolLuzRef_Internalname ;
   private String A3232SolLuzRef ;
   private String edtSolLuzRef_Jsonclick ;
   private String sMode468 ;
   private String edtavnRcdDeleted_468_Internalname ;
   private String edtSolLuzLin_Internalname ;
   private String edtSolLuzObs_Internalname ;
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
   private String sMode467 ;
   private String GXCCtl ;
   private String A3234SolLuzObs ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String sGXsfl_130_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_468_Jsonclick ;
   private String edtSolLuzLin_Jsonclick ;
   private String edtSolLuzObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ130BarCodPar ;
   private String ZZ3219SolLuzMat ;
   private String ZZ3220SolLuzSer ;
   private String ZZ3222SolLuzDisN ;
   private String ZZ3223SolLuzNom ;
   private String ZZ3227SolLuzCliN ;
   private String ZZ3228SolLuzSol ;
   private String ZZ3229SolLuzNor ;
   private String ZZ3230SolLuzMaq ;
   private String ZZ3232SolLuzRef ;
   private String ZZ653OpeNom ;
   private java.util.Date Z3225SolLuzFec ;
   private java.util.Date A3225SolLuzFec ;
   private java.util.Date ZZ3225SolLuzFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_130_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3219SolLuzMat ;
   private boolean n3220SolLuzSer ;
   private boolean n3221SolLuzTip ;
   private boolean n3222SolLuzDisN ;
   private boolean n3223SolLuzNom ;
   private boolean n3224SolLuzNum ;
   private boolean n3225SolLuzFec ;
   private boolean n653OpeNom ;
   private boolean n3226SolLuzCliC ;
   private boolean n3227SolLuzCliN ;
   private boolean n3228SolLuzSol ;
   private boolean n3229SolLuzNor ;
   private boolean n3230SolLuzMaq ;
   private boolean n3231SolLuzUlin ;
   private boolean n3232SolLuzRef ;
   private boolean Gx_longc ;
   private boolean n3234SolLuzObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01IC6_A407EmprNom ;
   private boolean[] T01IC6_n407EmprNom ;
   private int[] T01IC9_A3218SolLuzCod ;
   private String[] T01IC9_A407EmprNom ;
   private boolean[] T01IC9_n407EmprNom ;
   private String[] T01IC9_A3219SolLuzMat ;
   private boolean[] T01IC9_n3219SolLuzMat ;
   private String[] T01IC9_A3220SolLuzSer ;
   private boolean[] T01IC9_n3220SolLuzSer ;
   private short[] T01IC9_A3221SolLuzTip ;
   private boolean[] T01IC9_n3221SolLuzTip ;
   private String[] T01IC9_A3222SolLuzDisN ;
   private boolean[] T01IC9_n3222SolLuzDisN ;
   private String[] T01IC9_A3223SolLuzNom ;
   private boolean[] T01IC9_n3223SolLuzNom ;
   private int[] T01IC9_A3224SolLuzNum ;
   private boolean[] T01IC9_n3224SolLuzNum ;
   private java.util.Date[] T01IC9_A3225SolLuzFec ;
   private boolean[] T01IC9_n3225SolLuzFec ;
   private String[] T01IC9_A653OpeNom ;
   private boolean[] T01IC9_n653OpeNom ;
   private int[] T01IC9_A3226SolLuzCliC ;
   private boolean[] T01IC9_n3226SolLuzCliC ;
   private String[] T01IC9_A3227SolLuzCliN ;
   private boolean[] T01IC9_n3227SolLuzCliN ;
   private String[] T01IC9_A3228SolLuzSol ;
   private boolean[] T01IC9_n3228SolLuzSol ;
   private String[] T01IC9_A3229SolLuzNor ;
   private boolean[] T01IC9_n3229SolLuzNor ;
   private String[] T01IC9_A3230SolLuzMaq ;
   private boolean[] T01IC9_n3230SolLuzMaq ;
   private byte[] T01IC9_A3231SolLuzUlin ;
   private boolean[] T01IC9_n3231SolLuzUlin ;
   private String[] T01IC9_A3232SolLuzRef ;
   private boolean[] T01IC9_n3232SolLuzRef ;
   private String[] T01IC9_A396EmprCod ;
   private int[] T01IC9_A129BarCod ;
   private boolean[] T01IC9_n129BarCod ;
   private byte[] T01IC9_A132BarCodReo ;
   private boolean[] T01IC9_n132BarCodReo ;
   private String[] T01IC9_A130BarCodPar ;
   private boolean[] T01IC9_n130BarCodPar ;
   private int[] T01IC9_A652OpeCod ;
   private boolean[] T01IC9_n652OpeCod ;
   private String[] T01IC7_A396EmprCod ;
   private String[] T01IC8_A653OpeNom ;
   private boolean[] T01IC8_n653OpeNom ;
   private String[] T01IC10_A396EmprCod ;
   private String[] T01IC11_A653OpeNom ;
   private boolean[] T01IC11_n653OpeNom ;
   private String[] T01IC12_A396EmprCod ;
   private int[] T01IC12_A3218SolLuzCod ;
   private int[] T01IC5_A3218SolLuzCod ;
   private String[] T01IC5_A3219SolLuzMat ;
   private boolean[] T01IC5_n3219SolLuzMat ;
   private String[] T01IC5_A3220SolLuzSer ;
   private boolean[] T01IC5_n3220SolLuzSer ;
   private short[] T01IC5_A3221SolLuzTip ;
   private boolean[] T01IC5_n3221SolLuzTip ;
   private String[] T01IC5_A3222SolLuzDisN ;
   private boolean[] T01IC5_n3222SolLuzDisN ;
   private String[] T01IC5_A3223SolLuzNom ;
   private boolean[] T01IC5_n3223SolLuzNom ;
   private int[] T01IC5_A3224SolLuzNum ;
   private boolean[] T01IC5_n3224SolLuzNum ;
   private java.util.Date[] T01IC5_A3225SolLuzFec ;
   private boolean[] T01IC5_n3225SolLuzFec ;
   private int[] T01IC5_A3226SolLuzCliC ;
   private boolean[] T01IC5_n3226SolLuzCliC ;
   private String[] T01IC5_A3227SolLuzCliN ;
   private boolean[] T01IC5_n3227SolLuzCliN ;
   private String[] T01IC5_A3228SolLuzSol ;
   private boolean[] T01IC5_n3228SolLuzSol ;
   private String[] T01IC5_A3229SolLuzNor ;
   private boolean[] T01IC5_n3229SolLuzNor ;
   private String[] T01IC5_A3230SolLuzMaq ;
   private boolean[] T01IC5_n3230SolLuzMaq ;
   private byte[] T01IC5_A3231SolLuzUlin ;
   private boolean[] T01IC5_n3231SolLuzUlin ;
   private String[] T01IC5_A3232SolLuzRef ;
   private boolean[] T01IC5_n3232SolLuzRef ;
   private String[] T01IC5_A396EmprCod ;
   private int[] T01IC5_A129BarCod ;
   private boolean[] T01IC5_n129BarCod ;
   private byte[] T01IC5_A132BarCodReo ;
   private boolean[] T01IC5_n132BarCodReo ;
   private String[] T01IC5_A130BarCodPar ;
   private boolean[] T01IC5_n130BarCodPar ;
   private int[] T01IC5_A652OpeCod ;
   private boolean[] T01IC5_n652OpeCod ;
   private String[] T01IC13_A396EmprCod ;
   private int[] T01IC13_A3218SolLuzCod ;
   private String[] T01IC14_A396EmprCod ;
   private int[] T01IC14_A3218SolLuzCod ;
   private int[] T01IC4_A3218SolLuzCod ;
   private String[] T01IC4_A3219SolLuzMat ;
   private boolean[] T01IC4_n3219SolLuzMat ;
   private String[] T01IC4_A3220SolLuzSer ;
   private boolean[] T01IC4_n3220SolLuzSer ;
   private short[] T01IC4_A3221SolLuzTip ;
   private boolean[] T01IC4_n3221SolLuzTip ;
   private String[] T01IC4_A3222SolLuzDisN ;
   private boolean[] T01IC4_n3222SolLuzDisN ;
   private String[] T01IC4_A3223SolLuzNom ;
   private boolean[] T01IC4_n3223SolLuzNom ;
   private int[] T01IC4_A3224SolLuzNum ;
   private boolean[] T01IC4_n3224SolLuzNum ;
   private java.util.Date[] T01IC4_A3225SolLuzFec ;
   private boolean[] T01IC4_n3225SolLuzFec ;
   private int[] T01IC4_A3226SolLuzCliC ;
   private boolean[] T01IC4_n3226SolLuzCliC ;
   private String[] T01IC4_A3227SolLuzCliN ;
   private boolean[] T01IC4_n3227SolLuzCliN ;
   private String[] T01IC4_A3228SolLuzSol ;
   private boolean[] T01IC4_n3228SolLuzSol ;
   private String[] T01IC4_A3229SolLuzNor ;
   private boolean[] T01IC4_n3229SolLuzNor ;
   private String[] T01IC4_A3230SolLuzMaq ;
   private boolean[] T01IC4_n3230SolLuzMaq ;
   private byte[] T01IC4_A3231SolLuzUlin ;
   private boolean[] T01IC4_n3231SolLuzUlin ;
   private String[] T01IC4_A3232SolLuzRef ;
   private boolean[] T01IC4_n3232SolLuzRef ;
   private String[] T01IC4_A396EmprCod ;
   private int[] T01IC4_A129BarCod ;
   private boolean[] T01IC4_n129BarCod ;
   private byte[] T01IC4_A132BarCodReo ;
   private boolean[] T01IC4_n132BarCodReo ;
   private String[] T01IC4_A130BarCodPar ;
   private boolean[] T01IC4_n130BarCodPar ;
   private int[] T01IC4_A652OpeCod ;
   private boolean[] T01IC4_n652OpeCod ;
   private String[] T01IC18_A653OpeNom ;
   private boolean[] T01IC18_n653OpeNom ;
   private String[] T01IC19_A396EmprCod ;
   private int[] T01IC19_A3218SolLuzCod ;
   private int[] T01IC20_A3218SolLuzCod ;
   private byte[] T01IC20_A3233SolLuzLin ;
   private String[] T01IC20_A3234SolLuzObs ;
   private boolean[] T01IC20_n3234SolLuzObs ;
   private String[] T01IC20_A396EmprCod ;
   private String[] T01IC21_A396EmprCod ;
   private int[] T01IC21_A3218SolLuzCod ;
   private byte[] T01IC21_A3233SolLuzLin ;
   private int[] T01IC3_A3218SolLuzCod ;
   private byte[] T01IC3_A3233SolLuzLin ;
   private String[] T01IC3_A3234SolLuzObs ;
   private boolean[] T01IC3_n3234SolLuzObs ;
   private String[] T01IC3_A396EmprCod ;
   private int[] T01IC2_A3218SolLuzCod ;
   private byte[] T01IC2_A3233SolLuzLin ;
   private String[] T01IC2_A3234SolLuzObs ;
   private boolean[] T01IC2_n3234SolLuzObs ;
   private String[] T01IC2_A396EmprCod ;
   private String[] T01IC25_A396EmprCod ;
   private int[] T01IC25_A3218SolLuzCod ;
   private byte[] T01IC25_A3233SolLuzLin ;
   private String[] T01IC26_A407EmprNom ;
   private boolean[] T01IC26_n407EmprNom ;
   private String[] T01IC27_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpsolluz__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolluz__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolluz__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolluz__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolluz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IC2", "SELECT SolLuzCod, SolLuzLin, SolLuzObs, EmprCod FROM TXPLSOLLU WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ?  FOR UPDATE OF SolLuzObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC3", "SELECT SolLuzCod, SolLuzLin, SolLuzObs, EmprCod FROM TXPLSOLLU WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC4", "SELECT SolLuzCod, SolLuzMat, SolLuzSer, SolLuzTip, SolLuzDisN, SolLuzNom, SolLuzNum, SolLuzFec, SolLuzCliC, SolLuzCliN, SolLuzSol, SolLuzNor, SolLuzMaq, SolLuzUlin, SolLuzRef, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCSOLLU WHERE EmprCod = ? AND SolLuzCod = ?  FOR UPDATE OF SolLuzMat, SolLuzSer, SolLuzTip, SolLuzDisN, SolLuzNom, SolLuzNum, SolLuzFec, SolLuzCliC, SolLuzCliN, SolLuzSol, SolLuzNor, SolLuzMaq, SolLuzUlin, SolLuzRef, BarCod, BarCodReo, BarCodPar, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC5", "SELECT SolLuzCod, SolLuzMat, SolLuzSer, SolLuzTip, SolLuzDisN, SolLuzNom, SolLuzNum, SolLuzFec, SolLuzCliC, SolLuzCliN, SolLuzSol, SolLuzNor, SolLuzMaq, SolLuzUlin, SolLuzRef, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCSOLLU WHERE EmprCod = ? AND SolLuzCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC8", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC9", "SELECT /*+ FIRST_ROWS(100) */ TM1.SolLuzCod, T2.EmprNom, TM1.SolLuzMat, TM1.SolLuzSer, TM1.SolLuzTip, TM1.SolLuzDisN, TM1.SolLuzNom, TM1.SolLuzNum, TM1.SolLuzFec, T3.OpeNom, TM1.SolLuzCliC, TM1.SolLuzCliN, TM1.SolLuzSol, TM1.SolLuzNor, TM1.SolLuzMaq, TM1.SolLuzUlin, TM1.SolLuzRef, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.OpeCod FROM ((TXPCSOLLU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.SolLuzCod = ? ORDER BY TM1.EmprCod, TM1.SolLuzCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC10", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC11", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND SolLuzCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolLuzCod FROM TXPCSOLLU WHERE ( SolLuzCod > ?) and EmprCod = ? ORDER BY EmprCod, SolLuzCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IC14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolLuzCod FROM TXPCSOLLU WHERE ( SolLuzCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, SolLuzCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IC15", "INSERT INTO TXPCSOLLU(SolLuzCod, SolLuzMat, SolLuzSer, SolLuzTip, SolLuzDisN, SolLuzNom, SolLuzNum, SolLuzFec, SolLuzCliC, SolLuzCliN, SolLuzSol, SolLuzNor, SolLuzMaq, SolLuzUlin, SolLuzRef, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCSOLLU")
         ,new UpdateCursor("T01IC16", "UPDATE TXPCSOLLU SET SolLuzMat=?, SolLuzSer=?, SolLuzTip=?, SolLuzDisN=?, SolLuzNom=?, SolLuzNum=?, SolLuzFec=?, SolLuzCliC=?, SolLuzCliN=?, SolLuzSol=?, SolLuzNor=?, SolLuzMaq=?, SolLuzUlin=?, SolLuzRef=?, BarCod=?, BarCodReo=?, BarCodPar=?, OpeCod=?  WHERE EmprCod = ? AND SolLuzCod = ?", GX_NOMASK, "TXPCSOLLU")
         ,new UpdateCursor("T01IC17", "DELETE FROM TXPCSOLLU  WHERE EmprCod = ? AND SolLuzCod = ?", GX_NOMASK, "TXPCSOLLU")
         ,new ForEachCursor("T01IC18", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? ORDER BY EmprCod, SolLuzCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC20", "SELECT SolLuzCod, SolLuzLin, SolLuzObs, EmprCod FROM TXPLSOLLU WHERE EmprCod = ? and SolLuzCod = ? and SolLuzLin = ? ORDER BY EmprCod, SolLuzCod, SolLuzLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC21", "SELECT EmprCod, SolLuzCod, SolLuzLin FROM TXPLSOLLU WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01IC22", "INSERT INTO TXPLSOLLU(SolLuzCod, SolLuzLin, SolLuzObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLSOLLU")
         ,new UpdateCursor("T01IC23", "UPDATE TXPLSOLLU SET SolLuzObs=?  WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ?", GX_NOMASK, "TXPLSOLLU")
         ,new UpdateCursor("T01IC24", "DELETE FROM TXPLSOLLU  WHERE EmprCod = ? AND SolLuzCod = ? AND SolLuzLin = ?", GX_NOMASK, "TXPLSOLLU")
         ,new ForEachCursor("T01IC25", "SELECT EmprCod, SolLuzCod, SolLuzLin FROM TXPLSOLLU WHERE EmprCod = ? and SolLuzCod = ? ORDER BY EmprCod, SolLuzCod, SolLuzLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IC27", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
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
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
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
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 15);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
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
                  stmt.setString(12, (String)parms[22], 20);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 6);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 15);
               }
               stmt.setString(16, (String)parms[29], 3);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[37]).intValue());
               }
               return;
            case 14 :
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
                  stmt.setString(11, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
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
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[35]).intValue());
               }
               stmt.setString(19, (String)parms[36], 3);
               stmt.setInt(20, ((Number) parms[37]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
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
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 20 :
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
            case 21 :
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
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

