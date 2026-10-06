package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpsolfri_impl extends GXDataArea
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
            AV48BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarCod), 8, 0));
            AV49BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49BarCodReo", GXutil.str( AV49BarCodReo, 1, 0));
            AV50BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50BarCodPar", AV50BarCodPar);
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
         GX_FocusControl = edtSolFriCod_Internalname ;
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

   public tpsolfri_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpsolfri_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpsolfri_impl.class ));
   }

   public tpsolfri_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpSOLFRI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3196SolFriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolFriCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3196SolFriCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3196SolFriCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriCod_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriMat_Internalname, GXutil.rtrim( A3197SolFriMat), GXutil.rtrim( localUtil.format( A3197SolFriMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriMat_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriSer_Internalname, GXutil.rtrim( A3198SolFriSer), GXutil.rtrim( localUtil.format( A3198SolFriSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriSer_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriTip_Internalname, GXutil.ltrim( localUtil.ntoc( A3199SolFriTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolFriTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3199SolFriTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3199SolFriTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriTip_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Disp Cli", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriDisN_Internalname, GXutil.rtrim( A3200SolFriDisN), GXutil.rtrim( localUtil.format( A3200SolFriDisN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriDisN_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriDisN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Color Nombre", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriNom_Internalname, GXutil.rtrim( A3201SolFriNom), GXutil.rtrim( localUtil.format( A3201SolFriNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriNom_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3202SolFriNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolFriNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3202SolFriNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3202SolFriNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriNum_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Test", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSolFriFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriFec_Internalname, localUtil.format(A3203SolFriFec, "99/99/99"), localUtil.format( A3203SolFriFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriFec_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSolFriFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSolFriFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "SolFriCliCod", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A3204SolFriCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolFriCliC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3204SolFriCliC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3204SolFriCliC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriCliC_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriCliC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre Cli", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriCliN_Internalname, GXutil.rtrim( A3205SolFriCliN), GXutil.rtrim( localUtil.format( A3205SolFriCliN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriCliN_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "SolFriSol", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriSol_Internalname, GXutil.rtrim( A3206SolFriSol), GXutil.rtrim( localUtil.format( A3206SolFriSol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriSol_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriSol_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "SolFriAlt", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriAlt_Internalname, GXutil.rtrim( A3207SolFriAlt), GXutil.rtrim( localUtil.format( A3207SolFriAlt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriAlt_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriAlt_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "SolFriUlin", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A3208SolFriUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolFriUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3208SolFriUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3208SolFriUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriUlin_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Alteracion Cor Seco", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriAcS_Internalname, GXutil.rtrim( A3209SolFriAcS), GXutil.rtrim( localUtil.format( A3209SolFriAcS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriAcS_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriAcS_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Alteracion Color Humedo", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriAcH_Internalname, GXutil.rtrim( A3210SolFriAcH), GXutil.rtrim( localUtil.format( A3210SolFriAcH, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriAcH_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriAcH_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Manchado en Seco", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriMaS_Internalname, GXutil.rtrim( A3211SolFriMaS), GXutil.rtrim( localUtil.format( A3211SolFriMaS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriMaS_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriMaS_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Manchado en Humedo", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriMaH_Internalname, GXutil.rtrim( A3212SolFriMaH), GXutil.rtrim( localUtil.format( A3212SolFriMaH, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriMaH_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriMaH_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Norma Iso", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriNor_Internalname, GXutil.rtrim( A3213SolFriNor), GXutil.rtrim( localUtil.format( A3213SolFriNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriNor_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriNor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriMaq_Internalname, GXutil.rtrim( A3214SolFriMaq), GXutil.rtrim( localUtil.format( A3214SolFriMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriMaq_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "SolFriRef", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriRef_Internalname, GXutil.rtrim( A3215SolFriRef), GXutil.rtrim( localUtil.format( A3215SolFriRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriRef_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriRef_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Largura Color seco", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriLcs_Internalname, GXutil.rtrim( A11057SolFriLcs), GXutil.rtrim( localUtil.format( A11057SolFriLcs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriLcs_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriLcs_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Largura Color Humedo", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriLch_Internalname, GXutil.rtrim( A11058SolFriLch), GXutil.rtrim( localUtil.format( A11058SolFriLch, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriLch_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriLch_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Largura Manchado seco", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriLms_Internalname, GXutil.rtrim( A11059SolFriLms), GXutil.rtrim( localUtil.format( A11059SolFriLms, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriLms_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriLms_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Largura Manchado humedo", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriLmh_Internalname, GXutil.rtrim( A11060SolFriLmh), GXutil.rtrim( localUtil.format( A11060SolFriLmh, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriLmh_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriLmh_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Evaulacion 0 fallo 1 Ok", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriSt_Internalname, GXutil.ltrim( localUtil.ntoc( A11805SolFriSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSolFriSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11805SolFriSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11805SolFriSt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriSt_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriSt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Requisito Dry", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriRqMn_Internalname, GXutil.rtrim( A11922SolFriRqMn), GXutil.rtrim( localUtil.format( A11922SolFriRqMn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriRqMn_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriRqMn_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Metodo", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpSOLFRI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSolFriMtdo_Internalname, GXutil.rtrim( A11923SolFriMtdo), GXutil.rtrim( localUtil.format( A11923SolFriMtdo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSolFriMtdo_Jsonclick, 0, "", "", "", "", "", 1, edtSolFriMtdo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpSOLFRI.htm");
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
         nBlankRcdCount466 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_466 = (short)(1) ;
            scanStart1IB466( ) ;
            while ( RcdFound466 != 0 )
            {
               init_level_properties466( ) ;
               getByPrimaryKey1IB466( ) ;
               addRow1IB466( ) ;
               scanNext1IB466( ) ;
            }
            scanEnd1IB466( ) ;
            nBlankRcdCount466 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1IB466( ) ;
         standaloneModal1IB466( ) ;
         sMode466 = Gx_mode ;
         while ( nGXsfl_190_idx < nRC_GXsfl_190 )
         {
            bGXsfl_190_Refreshing = true ;
            readRow1IB466( ) ;
            edtavnRcdDeleted_466_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_466_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_466_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_466_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            edtSolFriLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLFRILIN_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolFriLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            edtSolFriObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLFRIOBS_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSolFriObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriObs_Enabled), 5, 0), !bGXsfl_190_Refreshing);
            if ( ( nRcdExists_466 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1IB466( ) ;
            }
            sendRow1IB466( ) ;
            bGXsfl_190_Refreshing = false ;
         }
         Gx_mode = sMode466 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount466 = (short)(5) ;
         nRcdExists_466 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1IB466( ) ;
            while ( RcdFound466 != 0 )
            {
               sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_190466( ) ;
               init_level_properties466( ) ;
               standaloneNotModal1IB466( ) ;
               getByPrimaryKey1IB466( ) ;
               standaloneModal1IB466( ) ;
               addRow1IB466( ) ;
               scanNext1IB466( ) ;
            }
            scanEnd1IB466( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode466 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_190466( ) ;
      initAll1IB466( ) ;
      init_level_properties466( ) ;
      nRcdExists_466 = (short)(0) ;
      nIsMod_466 = (short)(0) ;
      nRcdDeleted_466 = (short)(0) ;
      nBlankRcdCount466 = (short)(nBlankRcdUsr466+nBlankRcdCount466) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount466 > 0 )
      {
         standaloneNotModal1IB466( ) ;
         standaloneModal1IB466( ) ;
         addRow1IB466( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtSolFriLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount466 = (short)(nBlankRcdCount466-1) ;
      }
      Gx_mode = sMode466 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpSOLFRI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpSOLFRI.htm");
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
         Z3196SolFriCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3196SolFriCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3197SolFriMat = httpContext.cgiGet( "Z3197SolFriMat") ;
         Z3198SolFriSer = httpContext.cgiGet( "Z3198SolFriSer") ;
         Z3199SolFriTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z3199SolFriTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3200SolFriDisN = httpContext.cgiGet( "Z3200SolFriDisN") ;
         Z3201SolFriNom = httpContext.cgiGet( "Z3201SolFriNom") ;
         Z3202SolFriNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z3202SolFriNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3203SolFriFec = localUtil.ctod( httpContext.cgiGet( "Z3203SolFriFec"), 0) ;
         Z3204SolFriCliC = (int)(localUtil.ctol( httpContext.cgiGet( "Z3204SolFriCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3205SolFriCliN = httpContext.cgiGet( "Z3205SolFriCliN") ;
         Z3206SolFriSol = httpContext.cgiGet( "Z3206SolFriSol") ;
         Z3207SolFriAlt = httpContext.cgiGet( "Z3207SolFriAlt") ;
         Z3208SolFriUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3208SolFriUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3209SolFriAcS = httpContext.cgiGet( "Z3209SolFriAcS") ;
         Z3210SolFriAcH = httpContext.cgiGet( "Z3210SolFriAcH") ;
         Z3211SolFriMaS = httpContext.cgiGet( "Z3211SolFriMaS") ;
         Z3212SolFriMaH = httpContext.cgiGet( "Z3212SolFriMaH") ;
         Z3213SolFriNor = httpContext.cgiGet( "Z3213SolFriNor") ;
         Z3214SolFriMaq = httpContext.cgiGet( "Z3214SolFriMaq") ;
         Z3215SolFriRef = httpContext.cgiGet( "Z3215SolFriRef") ;
         Z11057SolFriLcs = httpContext.cgiGet( "Z11057SolFriLcs") ;
         Z11058SolFriLch = httpContext.cgiGet( "Z11058SolFriLch") ;
         Z11059SolFriLms = httpContext.cgiGet( "Z11059SolFriLms") ;
         Z11060SolFriLmh = httpContext.cgiGet( "Z11060SolFriLmh") ;
         Z11805SolFriSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11805SolFriSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11922SolFriRqMn = httpContext.cgiGet( "Z11922SolFriRqMn") ;
         Z11923SolFriMtdo = httpContext.cgiGet( "Z11923SolFriMtdo") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLFRICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolFriCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3196SolFriCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
         }
         else
         {
            A3196SolFriCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSolFriCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
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
         A3197SolFriMat = httpContext.cgiGet( edtSolFriMat_Internalname) ;
         n3197SolFriMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3197SolFriMat", A3197SolFriMat);
         A3198SolFriSer = httpContext.cgiGet( edtSolFriSer_Internalname) ;
         n3198SolFriSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3198SolFriSer", A3198SolFriSer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLFRITIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolFriTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3199SolFriTip = (short)(0) ;
            n3199SolFriTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3199SolFriTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3199SolFriTip), 4, 0));
         }
         else
         {
            A3199SolFriTip = (short)(localUtil.ctol( httpContext.cgiGet( edtSolFriTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3199SolFriTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3199SolFriTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3199SolFriTip), 4, 0));
         }
         A3200SolFriDisN = httpContext.cgiGet( edtSolFriDisN_Internalname) ;
         n3200SolFriDisN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3200SolFriDisN", A3200SolFriDisN);
         A3201SolFriNom = httpContext.cgiGet( edtSolFriNom_Internalname) ;
         n3201SolFriNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3201SolFriNom", A3201SolFriNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLFRINUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolFriNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3202SolFriNum = 0 ;
            n3202SolFriNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3202SolFriNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3202SolFriNum), 6, 0));
         }
         else
         {
            A3202SolFriNum = (int)(localUtil.ctol( httpContext.cgiGet( edtSolFriNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3202SolFriNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3202SolFriNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3202SolFriNum), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtSolFriFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SOLFRIFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolFriFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3203SolFriFec = GXutil.nullDate() ;
            n3203SolFriFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3203SolFriFec", localUtil.format(A3203SolFriFec, "99/99/99"));
         }
         else
         {
            A3203SolFriFec = localUtil.ctod( httpContext.cgiGet( edtSolFriFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3203SolFriFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3203SolFriFec", localUtil.format(A3203SolFriFec, "99/99/99"));
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLFRICLIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolFriCliC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3204SolFriCliC = 0 ;
            n3204SolFriCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3204SolFriCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3204SolFriCliC), 6, 0));
         }
         else
         {
            A3204SolFriCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtSolFriCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3204SolFriCliC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3204SolFriCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3204SolFriCliC), 6, 0));
         }
         A3205SolFriCliN = httpContext.cgiGet( edtSolFriCliN_Internalname) ;
         n3205SolFriCliN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3205SolFriCliN", A3205SolFriCliN);
         A3206SolFriSol = httpContext.cgiGet( edtSolFriSol_Internalname) ;
         n3206SolFriSol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3206SolFriSol", A3206SolFriSol);
         A3207SolFriAlt = httpContext.cgiGet( edtSolFriAlt_Internalname) ;
         n3207SolFriAlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3207SolFriAlt", A3207SolFriAlt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLFRIULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolFriUlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3208SolFriUlin = (byte)(0) ;
            n3208SolFriUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3208SolFriUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3208SolFriUlin), 2, 0));
         }
         else
         {
            A3208SolFriUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolFriUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3208SolFriUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3208SolFriUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3208SolFriUlin), 2, 0));
         }
         A3209SolFriAcS = httpContext.cgiGet( edtSolFriAcS_Internalname) ;
         n3209SolFriAcS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3209SolFriAcS", A3209SolFriAcS);
         A3210SolFriAcH = httpContext.cgiGet( edtSolFriAcH_Internalname) ;
         n3210SolFriAcH = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3210SolFriAcH", A3210SolFriAcH);
         A3211SolFriMaS = httpContext.cgiGet( edtSolFriMaS_Internalname) ;
         n3211SolFriMaS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3211SolFriMaS", A3211SolFriMaS);
         A3212SolFriMaH = httpContext.cgiGet( edtSolFriMaH_Internalname) ;
         n3212SolFriMaH = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3212SolFriMaH", A3212SolFriMaH);
         A3213SolFriNor = httpContext.cgiGet( edtSolFriNor_Internalname) ;
         n3213SolFriNor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3213SolFriNor", A3213SolFriNor);
         A3214SolFriMaq = httpContext.cgiGet( edtSolFriMaq_Internalname) ;
         n3214SolFriMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3214SolFriMaq", A3214SolFriMaq);
         A3215SolFriRef = httpContext.cgiGet( edtSolFriRef_Internalname) ;
         n3215SolFriRef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3215SolFriRef", A3215SolFriRef);
         A11057SolFriLcs = httpContext.cgiGet( edtSolFriLcs_Internalname) ;
         n11057SolFriLcs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11057SolFriLcs", A11057SolFriLcs);
         A11058SolFriLch = httpContext.cgiGet( edtSolFriLch_Internalname) ;
         n11058SolFriLch = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11058SolFriLch", A11058SolFriLch);
         A11059SolFriLms = httpContext.cgiGet( edtSolFriLms_Internalname) ;
         n11059SolFriLms = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11059SolFriLms", A11059SolFriLms);
         A11060SolFriLmh = httpContext.cgiGet( edtSolFriLmh_Internalname) ;
         n11060SolFriLmh = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11060SolFriLmh", A11060SolFriLmh);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SOLFRIST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSolFriSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11805SolFriSt = (byte)(0) ;
            n11805SolFriSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11805SolFriSt", GXutil.str( A11805SolFriSt, 1, 0));
         }
         else
         {
            A11805SolFriSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolFriSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11805SolFriSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11805SolFriSt", GXutil.str( A11805SolFriSt, 1, 0));
         }
         A11922SolFriRqMn = httpContext.cgiGet( edtSolFriRqMn_Internalname) ;
         n11922SolFriRqMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11922SolFriRqMn", A11922SolFriRqMn);
         A11923SolFriMtdo = httpContext.cgiGet( edtSolFriMtdo_Internalname) ;
         n11923SolFriMtdo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11923SolFriMtdo", A11923SolFriMtdo);
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
            A3196SolFriCod = (int)(GXutil.lval( httpContext.GetPar( "SolFriCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
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
            initAll1IB465( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_466_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_466_Enabled), 5, 0), !bGXsfl_190_Refreshing);
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
      disableAttributes1IB465( ) ;
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

   public void confirm_1IB0( )
   {
      beforeValidate1IB465( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IB465( ) ;
         }
         else
         {
            checkExtendedTable1IB465( ) ;
            if ( AnyError == 0 )
            {
               zm1IB465( 2) ;
               zm1IB465( 3) ;
               zm1IB465( 4) ;
            }
            closeExtendedTableCursors1IB465( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode465 = Gx_mode ;
         confirm_1IB466( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode465 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode465 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1IB0( ) ;
      }
   }

   public void confirm_1IB466( )
   {
      nGXsfl_190_idx = 0 ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         readRow1IB466( ) ;
         if ( ( nRcdExists_466 != 0 ) || ( nIsMod_466 != 0 ) )
         {
            getKey1IB466( ) ;
            if ( ( nRcdExists_466 == 0 ) && ( nRcdDeleted_466 == 0 ) )
            {
               if ( RcdFound466 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1IB466( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1IB466( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1IB466( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "SOLFRILIN_" + sGXsfl_190_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSolFriLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound466 != 0 )
               {
                  if ( nRcdDeleted_466 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1IB466( ) ;
                     load1IB466( ) ;
                     beforeValidate1IB466( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1IB466( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_466 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1IB466( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1IB466( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1IB466( ) ;
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
                  if ( nRcdDeleted_466 == 0 )
                  {
                     GXCCtl = "SOLFRILIN_" + sGXsfl_190_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolFriLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_466_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolFriLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3216SolFriLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolFriObs_Internalname, GXutil.rtrim( A3217SolFriObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3216SolFriLin_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( Z3216SolFriLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3217SolFriObs_"+sGXsfl_190_idx, GXutil.rtrim( Z3217SolFriObs)) ;
         httpContext.changePostValue( "nRcdDeleted_466_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_466_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_466_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_466 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_466_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_466_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLFRILIN_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolFriLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLFRIOBS_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolFriObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1IB0( )
   {
   }

   public void zm1IB465( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3197SolFriMat = T01IB5_A3197SolFriMat[0] ;
            Z3198SolFriSer = T01IB5_A3198SolFriSer[0] ;
            Z3199SolFriTip = T01IB5_A3199SolFriTip[0] ;
            Z3200SolFriDisN = T01IB5_A3200SolFriDisN[0] ;
            Z3201SolFriNom = T01IB5_A3201SolFriNom[0] ;
            Z3202SolFriNum = T01IB5_A3202SolFriNum[0] ;
            Z3203SolFriFec = T01IB5_A3203SolFriFec[0] ;
            Z3204SolFriCliC = T01IB5_A3204SolFriCliC[0] ;
            Z3205SolFriCliN = T01IB5_A3205SolFriCliN[0] ;
            Z3206SolFriSol = T01IB5_A3206SolFriSol[0] ;
            Z3207SolFriAlt = T01IB5_A3207SolFriAlt[0] ;
            Z3208SolFriUlin = T01IB5_A3208SolFriUlin[0] ;
            Z3209SolFriAcS = T01IB5_A3209SolFriAcS[0] ;
            Z3210SolFriAcH = T01IB5_A3210SolFriAcH[0] ;
            Z3211SolFriMaS = T01IB5_A3211SolFriMaS[0] ;
            Z3212SolFriMaH = T01IB5_A3212SolFriMaH[0] ;
            Z3213SolFriNor = T01IB5_A3213SolFriNor[0] ;
            Z3214SolFriMaq = T01IB5_A3214SolFriMaq[0] ;
            Z3215SolFriRef = T01IB5_A3215SolFriRef[0] ;
            Z11057SolFriLcs = T01IB5_A11057SolFriLcs[0] ;
            Z11058SolFriLch = T01IB5_A11058SolFriLch[0] ;
            Z11059SolFriLms = T01IB5_A11059SolFriLms[0] ;
            Z11060SolFriLmh = T01IB5_A11060SolFriLmh[0] ;
            Z11805SolFriSt = T01IB5_A11805SolFriSt[0] ;
            Z11922SolFriRqMn = T01IB5_A11922SolFriRqMn[0] ;
            Z11923SolFriMtdo = T01IB5_A11923SolFriMtdo[0] ;
            Z129BarCod = T01IB5_A129BarCod[0] ;
            Z132BarCodReo = T01IB5_A132BarCodReo[0] ;
            Z130BarCodPar = T01IB5_A130BarCodPar[0] ;
            Z652OpeCod = T01IB5_A652OpeCod[0] ;
         }
         else
         {
            Z3197SolFriMat = A3197SolFriMat ;
            Z3198SolFriSer = A3198SolFriSer ;
            Z3199SolFriTip = A3199SolFriTip ;
            Z3200SolFriDisN = A3200SolFriDisN ;
            Z3201SolFriNom = A3201SolFriNom ;
            Z3202SolFriNum = A3202SolFriNum ;
            Z3203SolFriFec = A3203SolFriFec ;
            Z3204SolFriCliC = A3204SolFriCliC ;
            Z3205SolFriCliN = A3205SolFriCliN ;
            Z3206SolFriSol = A3206SolFriSol ;
            Z3207SolFriAlt = A3207SolFriAlt ;
            Z3208SolFriUlin = A3208SolFriUlin ;
            Z3209SolFriAcS = A3209SolFriAcS ;
            Z3210SolFriAcH = A3210SolFriAcH ;
            Z3211SolFriMaS = A3211SolFriMaS ;
            Z3212SolFriMaH = A3212SolFriMaH ;
            Z3213SolFriNor = A3213SolFriNor ;
            Z3214SolFriMaq = A3214SolFriMaq ;
            Z3215SolFriRef = A3215SolFriRef ;
            Z11057SolFriLcs = A11057SolFriLcs ;
            Z11058SolFriLch = A11058SolFriLch ;
            Z11059SolFriLms = A11059SolFriLms ;
            Z11060SolFriLmh = A11060SolFriLmh ;
            Z11805SolFriSt = A11805SolFriSt ;
            Z11922SolFriRqMn = A11922SolFriRqMn ;
            Z11923SolFriMtdo = A11923SolFriMtdo ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z3196SolFriCod = A3196SolFriCod ;
         Z3197SolFriMat = A3197SolFriMat ;
         Z3198SolFriSer = A3198SolFriSer ;
         Z3199SolFriTip = A3199SolFriTip ;
         Z3200SolFriDisN = A3200SolFriDisN ;
         Z3201SolFriNom = A3201SolFriNom ;
         Z3202SolFriNum = A3202SolFriNum ;
         Z3203SolFriFec = A3203SolFriFec ;
         Z3204SolFriCliC = A3204SolFriCliC ;
         Z3205SolFriCliN = A3205SolFriCliN ;
         Z3206SolFriSol = A3206SolFriSol ;
         Z3207SolFriAlt = A3207SolFriAlt ;
         Z3208SolFriUlin = A3208SolFriUlin ;
         Z3209SolFriAcS = A3209SolFriAcS ;
         Z3210SolFriAcH = A3210SolFriAcH ;
         Z3211SolFriMaS = A3211SolFriMaS ;
         Z3212SolFriMaH = A3212SolFriMaH ;
         Z3213SolFriNor = A3213SolFriNor ;
         Z3214SolFriMaq = A3214SolFriMaq ;
         Z3215SolFriRef = A3215SolFriRef ;
         Z11057SolFriLcs = A11057SolFriLcs ;
         Z11058SolFriLch = A11058SolFriLch ;
         Z11059SolFriLms = A11059SolFriLms ;
         Z11060SolFriLmh = A11060SolFriLmh ;
         Z11805SolFriSt = A11805SolFriSt ;
         Z11922SolFriRqMn = A11922SolFriRqMn ;
         Z11923SolFriMtdo = A11923SolFriMtdo ;
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
      /* Using cursor T01IB6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IB6_A407EmprNom[0] ;
      n407EmprNom = T01IB6_n407EmprNom[0] ;
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

   public void load1IB465( )
   {
      /* Using cursor T01IB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound465 = (short)(1) ;
         A407EmprNom = T01IB9_A407EmprNom[0] ;
         n407EmprNom = T01IB9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3197SolFriMat = T01IB9_A3197SolFriMat[0] ;
         n3197SolFriMat = T01IB9_n3197SolFriMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3197SolFriMat", A3197SolFriMat);
         A3198SolFriSer = T01IB9_A3198SolFriSer[0] ;
         n3198SolFriSer = T01IB9_n3198SolFriSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3198SolFriSer", A3198SolFriSer);
         A3199SolFriTip = T01IB9_A3199SolFriTip[0] ;
         n3199SolFriTip = T01IB9_n3199SolFriTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3199SolFriTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3199SolFriTip), 4, 0));
         A3200SolFriDisN = T01IB9_A3200SolFriDisN[0] ;
         n3200SolFriDisN = T01IB9_n3200SolFriDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3200SolFriDisN", A3200SolFriDisN);
         A3201SolFriNom = T01IB9_A3201SolFriNom[0] ;
         n3201SolFriNom = T01IB9_n3201SolFriNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3201SolFriNom", A3201SolFriNom);
         A3202SolFriNum = T01IB9_A3202SolFriNum[0] ;
         n3202SolFriNum = T01IB9_n3202SolFriNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3202SolFriNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3202SolFriNum), 6, 0));
         A3203SolFriFec = T01IB9_A3203SolFriFec[0] ;
         n3203SolFriFec = T01IB9_n3203SolFriFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3203SolFriFec", localUtil.format(A3203SolFriFec, "99/99/99"));
         A653OpeNom = T01IB9_A653OpeNom[0] ;
         n653OpeNom = T01IB9_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A3204SolFriCliC = T01IB9_A3204SolFriCliC[0] ;
         n3204SolFriCliC = T01IB9_n3204SolFriCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3204SolFriCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3204SolFriCliC), 6, 0));
         A3205SolFriCliN = T01IB9_A3205SolFriCliN[0] ;
         n3205SolFriCliN = T01IB9_n3205SolFriCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3205SolFriCliN", A3205SolFriCliN);
         A3206SolFriSol = T01IB9_A3206SolFriSol[0] ;
         n3206SolFriSol = T01IB9_n3206SolFriSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3206SolFriSol", A3206SolFriSol);
         A3207SolFriAlt = T01IB9_A3207SolFriAlt[0] ;
         n3207SolFriAlt = T01IB9_n3207SolFriAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3207SolFriAlt", A3207SolFriAlt);
         A3208SolFriUlin = T01IB9_A3208SolFriUlin[0] ;
         n3208SolFriUlin = T01IB9_n3208SolFriUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3208SolFriUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3208SolFriUlin), 2, 0));
         A3209SolFriAcS = T01IB9_A3209SolFriAcS[0] ;
         n3209SolFriAcS = T01IB9_n3209SolFriAcS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3209SolFriAcS", A3209SolFriAcS);
         A3210SolFriAcH = T01IB9_A3210SolFriAcH[0] ;
         n3210SolFriAcH = T01IB9_n3210SolFriAcH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3210SolFriAcH", A3210SolFriAcH);
         A3211SolFriMaS = T01IB9_A3211SolFriMaS[0] ;
         n3211SolFriMaS = T01IB9_n3211SolFriMaS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3211SolFriMaS", A3211SolFriMaS);
         A3212SolFriMaH = T01IB9_A3212SolFriMaH[0] ;
         n3212SolFriMaH = T01IB9_n3212SolFriMaH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3212SolFriMaH", A3212SolFriMaH);
         A3213SolFriNor = T01IB9_A3213SolFriNor[0] ;
         n3213SolFriNor = T01IB9_n3213SolFriNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3213SolFriNor", A3213SolFriNor);
         A3214SolFriMaq = T01IB9_A3214SolFriMaq[0] ;
         n3214SolFriMaq = T01IB9_n3214SolFriMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3214SolFriMaq", A3214SolFriMaq);
         A3215SolFriRef = T01IB9_A3215SolFriRef[0] ;
         n3215SolFriRef = T01IB9_n3215SolFriRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3215SolFriRef", A3215SolFriRef);
         A11057SolFriLcs = T01IB9_A11057SolFriLcs[0] ;
         n11057SolFriLcs = T01IB9_n11057SolFriLcs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11057SolFriLcs", A11057SolFriLcs);
         A11058SolFriLch = T01IB9_A11058SolFriLch[0] ;
         n11058SolFriLch = T01IB9_n11058SolFriLch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11058SolFriLch", A11058SolFriLch);
         A11059SolFriLms = T01IB9_A11059SolFriLms[0] ;
         n11059SolFriLms = T01IB9_n11059SolFriLms[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11059SolFriLms", A11059SolFriLms);
         A11060SolFriLmh = T01IB9_A11060SolFriLmh[0] ;
         n11060SolFriLmh = T01IB9_n11060SolFriLmh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11060SolFriLmh", A11060SolFriLmh);
         A11805SolFriSt = T01IB9_A11805SolFriSt[0] ;
         n11805SolFriSt = T01IB9_n11805SolFriSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11805SolFriSt", GXutil.str( A11805SolFriSt, 1, 0));
         A11922SolFriRqMn = T01IB9_A11922SolFriRqMn[0] ;
         n11922SolFriRqMn = T01IB9_n11922SolFriRqMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11922SolFriRqMn", A11922SolFriRqMn);
         A11923SolFriMtdo = T01IB9_A11923SolFriMtdo[0] ;
         n11923SolFriMtdo = T01IB9_n11923SolFriMtdo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11923SolFriMtdo", A11923SolFriMtdo);
         A129BarCod = T01IB9_A129BarCod[0] ;
         n129BarCod = T01IB9_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01IB9_A132BarCodReo[0] ;
         n132BarCodReo = T01IB9_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01IB9_A130BarCodPar[0] ;
         n130BarCodPar = T01IB9_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01IB9_A652OpeCod[0] ;
         n652OpeCod = T01IB9_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zm1IB465( -1) ;
      }
      pr_default.close(7);
      onLoadActions1IB465( ) ;
   }

   public void onLoadActions1IB465( )
   {
   }

   public void checkExtendedTable1IB465( )
   {
      nIsDirty_465 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T01IB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01IB8_A653OpeNom[0] ;
      n653OpeNom = T01IB8_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1IB465( )
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
      /* Using cursor T01IB10 */
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
      /* Using cursor T01IB11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01IB11_A653OpeNom[0] ;
      n653OpeNom = T01IB11_n653OpeNom[0] ;
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

   public void getKey1IB465( )
   {
      /* Using cursor T01IB12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound465 = (short)(1) ;
      }
      else
      {
         RcdFound465 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01IB5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1IB465( 1) ;
         RcdFound465 = (short)(1) ;
         A3196SolFriCod = T01IB5_A3196SolFriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
         A3197SolFriMat = T01IB5_A3197SolFriMat[0] ;
         n3197SolFriMat = T01IB5_n3197SolFriMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3197SolFriMat", A3197SolFriMat);
         A3198SolFriSer = T01IB5_A3198SolFriSer[0] ;
         n3198SolFriSer = T01IB5_n3198SolFriSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3198SolFriSer", A3198SolFriSer);
         A3199SolFriTip = T01IB5_A3199SolFriTip[0] ;
         n3199SolFriTip = T01IB5_n3199SolFriTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3199SolFriTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3199SolFriTip), 4, 0));
         A3200SolFriDisN = T01IB5_A3200SolFriDisN[0] ;
         n3200SolFriDisN = T01IB5_n3200SolFriDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3200SolFriDisN", A3200SolFriDisN);
         A3201SolFriNom = T01IB5_A3201SolFriNom[0] ;
         n3201SolFriNom = T01IB5_n3201SolFriNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3201SolFriNom", A3201SolFriNom);
         A3202SolFriNum = T01IB5_A3202SolFriNum[0] ;
         n3202SolFriNum = T01IB5_n3202SolFriNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3202SolFriNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3202SolFriNum), 6, 0));
         A3203SolFriFec = T01IB5_A3203SolFriFec[0] ;
         n3203SolFriFec = T01IB5_n3203SolFriFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3203SolFriFec", localUtil.format(A3203SolFriFec, "99/99/99"));
         A3204SolFriCliC = T01IB5_A3204SolFriCliC[0] ;
         n3204SolFriCliC = T01IB5_n3204SolFriCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3204SolFriCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3204SolFriCliC), 6, 0));
         A3205SolFriCliN = T01IB5_A3205SolFriCliN[0] ;
         n3205SolFriCliN = T01IB5_n3205SolFriCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3205SolFriCliN", A3205SolFriCliN);
         A3206SolFriSol = T01IB5_A3206SolFriSol[0] ;
         n3206SolFriSol = T01IB5_n3206SolFriSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3206SolFriSol", A3206SolFriSol);
         A3207SolFriAlt = T01IB5_A3207SolFriAlt[0] ;
         n3207SolFriAlt = T01IB5_n3207SolFriAlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3207SolFriAlt", A3207SolFriAlt);
         A3208SolFriUlin = T01IB5_A3208SolFriUlin[0] ;
         n3208SolFriUlin = T01IB5_n3208SolFriUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3208SolFriUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3208SolFriUlin), 2, 0));
         A3209SolFriAcS = T01IB5_A3209SolFriAcS[0] ;
         n3209SolFriAcS = T01IB5_n3209SolFriAcS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3209SolFriAcS", A3209SolFriAcS);
         A3210SolFriAcH = T01IB5_A3210SolFriAcH[0] ;
         n3210SolFriAcH = T01IB5_n3210SolFriAcH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3210SolFriAcH", A3210SolFriAcH);
         A3211SolFriMaS = T01IB5_A3211SolFriMaS[0] ;
         n3211SolFriMaS = T01IB5_n3211SolFriMaS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3211SolFriMaS", A3211SolFriMaS);
         A3212SolFriMaH = T01IB5_A3212SolFriMaH[0] ;
         n3212SolFriMaH = T01IB5_n3212SolFriMaH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3212SolFriMaH", A3212SolFriMaH);
         A3213SolFriNor = T01IB5_A3213SolFriNor[0] ;
         n3213SolFriNor = T01IB5_n3213SolFriNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3213SolFriNor", A3213SolFriNor);
         A3214SolFriMaq = T01IB5_A3214SolFriMaq[0] ;
         n3214SolFriMaq = T01IB5_n3214SolFriMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3214SolFriMaq", A3214SolFriMaq);
         A3215SolFriRef = T01IB5_A3215SolFriRef[0] ;
         n3215SolFriRef = T01IB5_n3215SolFriRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3215SolFriRef", A3215SolFriRef);
         A11057SolFriLcs = T01IB5_A11057SolFriLcs[0] ;
         n11057SolFriLcs = T01IB5_n11057SolFriLcs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11057SolFriLcs", A11057SolFriLcs);
         A11058SolFriLch = T01IB5_A11058SolFriLch[0] ;
         n11058SolFriLch = T01IB5_n11058SolFriLch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11058SolFriLch", A11058SolFriLch);
         A11059SolFriLms = T01IB5_A11059SolFriLms[0] ;
         n11059SolFriLms = T01IB5_n11059SolFriLms[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11059SolFriLms", A11059SolFriLms);
         A11060SolFriLmh = T01IB5_A11060SolFriLmh[0] ;
         n11060SolFriLmh = T01IB5_n11060SolFriLmh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11060SolFriLmh", A11060SolFriLmh);
         A11805SolFriSt = T01IB5_A11805SolFriSt[0] ;
         n11805SolFriSt = T01IB5_n11805SolFriSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11805SolFriSt", GXutil.str( A11805SolFriSt, 1, 0));
         A11922SolFriRqMn = T01IB5_A11922SolFriRqMn[0] ;
         n11922SolFriRqMn = T01IB5_n11922SolFriRqMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11922SolFriRqMn", A11922SolFriRqMn);
         A11923SolFriMtdo = T01IB5_A11923SolFriMtdo[0] ;
         n11923SolFriMtdo = T01IB5_n11923SolFriMtdo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11923SolFriMtdo", A11923SolFriMtdo);
         A129BarCod = T01IB5_A129BarCod[0] ;
         n129BarCod = T01IB5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01IB5_A132BarCodReo[0] ;
         n132BarCodReo = T01IB5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01IB5_A130BarCodPar[0] ;
         n130BarCodPar = T01IB5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01IB5_A652OpeCod[0] ;
         n652OpeCod = T01IB5_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z3196SolFriCod = A3196SolFriCod ;
         sMode465 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IB465( ) ;
         if ( AnyError == 1 )
         {
            RcdFound465 = (short)(0) ;
            initializeNonKey1IB465( ) ;
         }
         Gx_mode = sMode465 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound465 = (short)(0) ;
         initializeNonKey1IB465( ) ;
         sMode465 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode465 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1IB465( ) ;
      if ( RcdFound465 == 0 )
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
      RcdFound465 = (short)(0) ;
      /* Using cursor T01IB13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A3196SolFriCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01IB13_A3196SolFriCod[0] < A3196SolFriCod ) ) && ( GXutil.strcmp(T01IB13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01IB13_A3196SolFriCod[0] > A3196SolFriCod ) ) && ( GXutil.strcmp(T01IB13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3196SolFriCod = T01IB13_A3196SolFriCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
            RcdFound465 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound465 = (short)(0) ;
      /* Using cursor T01IB14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A3196SolFriCod), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01IB14_A3196SolFriCod[0] > A3196SolFriCod ) ) && ( GXutil.strcmp(T01IB14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01IB14_A3196SolFriCod[0] < A3196SolFriCod ) ) && ( GXutil.strcmp(T01IB14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3196SolFriCod = T01IB14_A3196SolFriCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
            RcdFound465 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IB465( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSolFriCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IB465( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound465 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3196SolFriCod != Z3196SolFriCod ) )
            {
               A3196SolFriCod = Z3196SolFriCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSolFriCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1IB465( ) ;
               GX_FocusControl = edtSolFriCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3196SolFriCod != Z3196SolFriCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtSolFriCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IB465( ) ;
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
                  GX_FocusControl = edtSolFriCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1IB465( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3196SolFriCod != Z3196SolFriCod ) )
      {
         A3196SolFriCod = Z3196SolFriCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSolFriCod_Internalname ;
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
      getKey1IB465( ) ;
      if ( RcdFound465 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3196SolFriCod != Z3196SolFriCod ) )
         {
            A3196SolFriCod = Z3196SolFriCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3196SolFriCod != Z3196SolFriCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpsolfri");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IB0( ) ;
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
      if ( RcdFound465 == 0 )
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
      scanStart1IB465( ) ;
      if ( RcdFound465 == 0 )
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
      scanEnd1IB465( ) ;
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
      if ( RcdFound465 == 0 )
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
      if ( RcdFound465 == 0 )
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
      scanStart1IB465( ) ;
      if ( RcdFound465 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound465 != 0 )
         {
            scanNext1IB465( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IB465( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IB465( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFRICC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z3197SolFriMat, T01IB4_A3197SolFriMat[0]) != 0 ) || ( GXutil.strcmp(Z3198SolFriSer, T01IB4_A3198SolFriSer[0]) != 0 ) || ( Z3199SolFriTip != T01IB4_A3199SolFriTip[0] ) || ( GXutil.strcmp(Z3200SolFriDisN, T01IB4_A3200SolFriDisN[0]) != 0 ) || ( GXutil.strcmp(Z3201SolFriNom, T01IB4_A3201SolFriNom[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3202SolFriNum != T01IB4_A3202SolFriNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z3203SolFriFec), GXutil.resetTime(T01IB4_A3203SolFriFec[0])) ) || ( Z3204SolFriCliC != T01IB4_A3204SolFriCliC[0] ) || ( GXutil.strcmp(Z3205SolFriCliN, T01IB4_A3205SolFriCliN[0]) != 0 ) || ( GXutil.strcmp(Z3206SolFriSol, T01IB4_A3206SolFriSol[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3207SolFriAlt, T01IB4_A3207SolFriAlt[0]) != 0 ) || ( Z3208SolFriUlin != T01IB4_A3208SolFriUlin[0] ) || ( GXutil.strcmp(Z3209SolFriAcS, T01IB4_A3209SolFriAcS[0]) != 0 ) || ( GXutil.strcmp(Z3210SolFriAcH, T01IB4_A3210SolFriAcH[0]) != 0 ) || ( GXutil.strcmp(Z3211SolFriMaS, T01IB4_A3211SolFriMaS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3212SolFriMaH, T01IB4_A3212SolFriMaH[0]) != 0 ) || ( GXutil.strcmp(Z3213SolFriNor, T01IB4_A3213SolFriNor[0]) != 0 ) || ( GXutil.strcmp(Z3214SolFriMaq, T01IB4_A3214SolFriMaq[0]) != 0 ) || ( GXutil.strcmp(Z3215SolFriRef, T01IB4_A3215SolFriRef[0]) != 0 ) || ( GXutil.strcmp(Z11057SolFriLcs, T01IB4_A11057SolFriLcs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11058SolFriLch, T01IB4_A11058SolFriLch[0]) != 0 ) || ( GXutil.strcmp(Z11059SolFriLms, T01IB4_A11059SolFriLms[0]) != 0 ) || ( GXutil.strcmp(Z11060SolFriLmh, T01IB4_A11060SolFriLmh[0]) != 0 ) || ( Z11805SolFriSt != T01IB4_A11805SolFriSt[0] ) || ( GXutil.strcmp(Z11922SolFriRqMn, T01IB4_A11922SolFriRqMn[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11923SolFriMtdo, T01IB4_A11923SolFriMtdo[0]) != 0 ) || ( Z129BarCod != T01IB4_A129BarCod[0] ) || ( Z132BarCodReo != T01IB4_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01IB4_A130BarCodPar[0]) != 0 ) || ( Z652OpeCod != T01IB4_A652OpeCod[0] ) )
         {
            if ( GXutil.strcmp(Z3197SolFriMat, T01IB4_A3197SolFriMat[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriMat");
               GXutil.writeLogRaw("Old: ",Z3197SolFriMat);
               GXutil.writeLogRaw("Current: ",T01IB4_A3197SolFriMat[0]);
            }
            if ( GXutil.strcmp(Z3198SolFriSer, T01IB4_A3198SolFriSer[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriSer");
               GXutil.writeLogRaw("Old: ",Z3198SolFriSer);
               GXutil.writeLogRaw("Current: ",T01IB4_A3198SolFriSer[0]);
            }
            if ( Z3199SolFriTip != T01IB4_A3199SolFriTip[0] )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriTip");
               GXutil.writeLogRaw("Old: ",Z3199SolFriTip);
               GXutil.writeLogRaw("Current: ",T01IB4_A3199SolFriTip[0]);
            }
            if ( GXutil.strcmp(Z3200SolFriDisN, T01IB4_A3200SolFriDisN[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriDisN");
               GXutil.writeLogRaw("Old: ",Z3200SolFriDisN);
               GXutil.writeLogRaw("Current: ",T01IB4_A3200SolFriDisN[0]);
            }
            if ( GXutil.strcmp(Z3201SolFriNom, T01IB4_A3201SolFriNom[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriNom");
               GXutil.writeLogRaw("Old: ",Z3201SolFriNom);
               GXutil.writeLogRaw("Current: ",T01IB4_A3201SolFriNom[0]);
            }
            if ( Z3202SolFriNum != T01IB4_A3202SolFriNum[0] )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriNum");
               GXutil.writeLogRaw("Old: ",Z3202SolFriNum);
               GXutil.writeLogRaw("Current: ",T01IB4_A3202SolFriNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3203SolFriFec), GXutil.resetTime(T01IB4_A3203SolFriFec[0])) ) )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriFec");
               GXutil.writeLogRaw("Old: ",Z3203SolFriFec);
               GXutil.writeLogRaw("Current: ",T01IB4_A3203SolFriFec[0]);
            }
            if ( Z3204SolFriCliC != T01IB4_A3204SolFriCliC[0] )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriCliC");
               GXutil.writeLogRaw("Old: ",Z3204SolFriCliC);
               GXutil.writeLogRaw("Current: ",T01IB4_A3204SolFriCliC[0]);
            }
            if ( GXutil.strcmp(Z3205SolFriCliN, T01IB4_A3205SolFriCliN[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriCliN");
               GXutil.writeLogRaw("Old: ",Z3205SolFriCliN);
               GXutil.writeLogRaw("Current: ",T01IB4_A3205SolFriCliN[0]);
            }
            if ( GXutil.strcmp(Z3206SolFriSol, T01IB4_A3206SolFriSol[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriSol");
               GXutil.writeLogRaw("Old: ",Z3206SolFriSol);
               GXutil.writeLogRaw("Current: ",T01IB4_A3206SolFriSol[0]);
            }
            if ( GXutil.strcmp(Z3207SolFriAlt, T01IB4_A3207SolFriAlt[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriAlt");
               GXutil.writeLogRaw("Old: ",Z3207SolFriAlt);
               GXutil.writeLogRaw("Current: ",T01IB4_A3207SolFriAlt[0]);
            }
            if ( Z3208SolFriUlin != T01IB4_A3208SolFriUlin[0] )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriUlin");
               GXutil.writeLogRaw("Old: ",Z3208SolFriUlin);
               GXutil.writeLogRaw("Current: ",T01IB4_A3208SolFriUlin[0]);
            }
            if ( GXutil.strcmp(Z3209SolFriAcS, T01IB4_A3209SolFriAcS[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriAcS");
               GXutil.writeLogRaw("Old: ",Z3209SolFriAcS);
               GXutil.writeLogRaw("Current: ",T01IB4_A3209SolFriAcS[0]);
            }
            if ( GXutil.strcmp(Z3210SolFriAcH, T01IB4_A3210SolFriAcH[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriAcH");
               GXutil.writeLogRaw("Old: ",Z3210SolFriAcH);
               GXutil.writeLogRaw("Current: ",T01IB4_A3210SolFriAcH[0]);
            }
            if ( GXutil.strcmp(Z3211SolFriMaS, T01IB4_A3211SolFriMaS[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriMaS");
               GXutil.writeLogRaw("Old: ",Z3211SolFriMaS);
               GXutil.writeLogRaw("Current: ",T01IB4_A3211SolFriMaS[0]);
            }
            if ( GXutil.strcmp(Z3212SolFriMaH, T01IB4_A3212SolFriMaH[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriMaH");
               GXutil.writeLogRaw("Old: ",Z3212SolFriMaH);
               GXutil.writeLogRaw("Current: ",T01IB4_A3212SolFriMaH[0]);
            }
            if ( GXutil.strcmp(Z3213SolFriNor, T01IB4_A3213SolFriNor[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriNor");
               GXutil.writeLogRaw("Old: ",Z3213SolFriNor);
               GXutil.writeLogRaw("Current: ",T01IB4_A3213SolFriNor[0]);
            }
            if ( GXutil.strcmp(Z3214SolFriMaq, T01IB4_A3214SolFriMaq[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriMaq");
               GXutil.writeLogRaw("Old: ",Z3214SolFriMaq);
               GXutil.writeLogRaw("Current: ",T01IB4_A3214SolFriMaq[0]);
            }
            if ( GXutil.strcmp(Z3215SolFriRef, T01IB4_A3215SolFriRef[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriRef");
               GXutil.writeLogRaw("Old: ",Z3215SolFriRef);
               GXutil.writeLogRaw("Current: ",T01IB4_A3215SolFriRef[0]);
            }
            if ( GXutil.strcmp(Z11057SolFriLcs, T01IB4_A11057SolFriLcs[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriLcs");
               GXutil.writeLogRaw("Old: ",Z11057SolFriLcs);
               GXutil.writeLogRaw("Current: ",T01IB4_A11057SolFriLcs[0]);
            }
            if ( GXutil.strcmp(Z11058SolFriLch, T01IB4_A11058SolFriLch[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriLch");
               GXutil.writeLogRaw("Old: ",Z11058SolFriLch);
               GXutil.writeLogRaw("Current: ",T01IB4_A11058SolFriLch[0]);
            }
            if ( GXutil.strcmp(Z11059SolFriLms, T01IB4_A11059SolFriLms[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriLms");
               GXutil.writeLogRaw("Old: ",Z11059SolFriLms);
               GXutil.writeLogRaw("Current: ",T01IB4_A11059SolFriLms[0]);
            }
            if ( GXutil.strcmp(Z11060SolFriLmh, T01IB4_A11060SolFriLmh[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriLmh");
               GXutil.writeLogRaw("Old: ",Z11060SolFriLmh);
               GXutil.writeLogRaw("Current: ",T01IB4_A11060SolFriLmh[0]);
            }
            if ( Z11805SolFriSt != T01IB4_A11805SolFriSt[0] )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriSt");
               GXutil.writeLogRaw("Old: ",Z11805SolFriSt);
               GXutil.writeLogRaw("Current: ",T01IB4_A11805SolFriSt[0]);
            }
            if ( GXutil.strcmp(Z11922SolFriRqMn, T01IB4_A11922SolFriRqMn[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriRqMn");
               GXutil.writeLogRaw("Old: ",Z11922SolFriRqMn);
               GXutil.writeLogRaw("Current: ",T01IB4_A11922SolFriRqMn[0]);
            }
            if ( GXutil.strcmp(Z11923SolFriMtdo, T01IB4_A11923SolFriMtdo[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriMtdo");
               GXutil.writeLogRaw("Old: ",Z11923SolFriMtdo);
               GXutil.writeLogRaw("Current: ",T01IB4_A11923SolFriMtdo[0]);
            }
            if ( Z129BarCod != T01IB4_A129BarCod[0] )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01IB4_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01IB4_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01IB4_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01IB4_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01IB4_A130BarCodPar[0]);
            }
            if ( Z652OpeCod != T01IB4_A652OpeCod[0] )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T01IB4_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFRICC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IB465( )
   {
      beforeValidate1IB465( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IB465( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IB465( 0) ;
         checkOptimisticConcurrency1IB465( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IB465( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IB465( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IB15 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A3196SolFriCod), Boolean.valueOf(n3197SolFriMat), A3197SolFriMat, Boolean.valueOf(n3198SolFriSer), A3198SolFriSer, Boolean.valueOf(n3199SolFriTip), Short.valueOf(A3199SolFriTip), Boolean.valueOf(n3200SolFriDisN), A3200SolFriDisN, Boolean.valueOf(n3201SolFriNom), A3201SolFriNom, Boolean.valueOf(n3202SolFriNum), Integer.valueOf(A3202SolFriNum), Boolean.valueOf(n3203SolFriFec), A3203SolFriFec, Boolean.valueOf(n3204SolFriCliC), Integer.valueOf(A3204SolFriCliC), Boolean.valueOf(n3205SolFriCliN), A3205SolFriCliN, Boolean.valueOf(n3206SolFriSol), A3206SolFriSol, Boolean.valueOf(n3207SolFriAlt), A3207SolFriAlt, Boolean.valueOf(n3208SolFriUlin), Byte.valueOf(A3208SolFriUlin), Boolean.valueOf(n3209SolFriAcS), A3209SolFriAcS, Boolean.valueOf(n3210SolFriAcH), A3210SolFriAcH, Boolean.valueOf(n3211SolFriMaS), A3211SolFriMaS, Boolean.valueOf(n3212SolFriMaH), A3212SolFriMaH, Boolean.valueOf(n3213SolFriNor), A3213SolFriNor, Boolean.valueOf(n3214SolFriMaq), A3214SolFriMaq, Boolean.valueOf(n3215SolFriRef), A3215SolFriRef, Boolean.valueOf(n11057SolFriLcs), A11057SolFriLcs, Boolean.valueOf(n11058SolFriLch), A11058SolFriLch, Boolean.valueOf(n11059SolFriLms), A11059SolFriLms, Boolean.valueOf(n11060SolFriLmh), A11060SolFriLmh, Boolean.valueOf(n11805SolFriSt), Byte.valueOf(A11805SolFriSt), Boolean.valueOf(n11922SolFriRqMn), A11922SolFriRqMn, Boolean.valueOf(n11923SolFriMtdo), A11923SolFriMtdo, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFRICC");
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
                        processLevel1IB465( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1IB0( ) ;
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
            load1IB465( ) ;
         }
         endLevel1IB465( ) ;
      }
      closeExtendedTableCursors1IB465( ) ;
   }

   public void update1IB465( )
   {
      beforeValidate1IB465( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IB465( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IB465( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IB465( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IB465( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IB16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n3197SolFriMat), A3197SolFriMat, Boolean.valueOf(n3198SolFriSer), A3198SolFriSer, Boolean.valueOf(n3199SolFriTip), Short.valueOf(A3199SolFriTip), Boolean.valueOf(n3200SolFriDisN), A3200SolFriDisN, Boolean.valueOf(n3201SolFriNom), A3201SolFriNom, Boolean.valueOf(n3202SolFriNum), Integer.valueOf(A3202SolFriNum), Boolean.valueOf(n3203SolFriFec), A3203SolFriFec, Boolean.valueOf(n3204SolFriCliC), Integer.valueOf(A3204SolFriCliC), Boolean.valueOf(n3205SolFriCliN), A3205SolFriCliN, Boolean.valueOf(n3206SolFriSol), A3206SolFriSol, Boolean.valueOf(n3207SolFriAlt), A3207SolFriAlt, Boolean.valueOf(n3208SolFriUlin), Byte.valueOf(A3208SolFriUlin), Boolean.valueOf(n3209SolFriAcS), A3209SolFriAcS, Boolean.valueOf(n3210SolFriAcH), A3210SolFriAcH, Boolean.valueOf(n3211SolFriMaS), A3211SolFriMaS, Boolean.valueOf(n3212SolFriMaH), A3212SolFriMaH, Boolean.valueOf(n3213SolFriNor), A3213SolFriNor, Boolean.valueOf(n3214SolFriMaq), A3214SolFriMaq, Boolean.valueOf(n3215SolFriRef), A3215SolFriRef, Boolean.valueOf(n11057SolFriLcs), A11057SolFriLcs, Boolean.valueOf(n11058SolFriLch), A11058SolFriLch, Boolean.valueOf(n11059SolFriLms), A11059SolFriLms, Boolean.valueOf(n11060SolFriLmh), A11060SolFriLmh, Boolean.valueOf(n11805SolFriSt), Byte.valueOf(A11805SolFriSt), Boolean.valueOf(n11922SolFriRqMn), A11922SolFriRqMn, Boolean.valueOf(n11923SolFriMtdo), A11923SolFriMtdo, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A3196SolFriCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFRICC");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFRICC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IB465( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1IB465( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1IB0( ) ;
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
         endLevel1IB465( ) ;
      }
      closeExtendedTableCursors1IB465( ) ;
   }

   public void deferredUpdate1IB465( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IB465( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IB465( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IB465( ) ;
         afterConfirm1IB465( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IB465( ) ;
            if ( AnyError == 0 )
            {
               scanStart1IB466( ) ;
               while ( RcdFound466 != 0 )
               {
                  getByPrimaryKey1IB466( ) ;
                  delete1IB466( ) ;
                  scanNext1IB466( ) ;
               }
               scanEnd1IB466( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IB17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFRICC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound465 == 0 )
                        {
                           initAll1IB465( ) ;
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
                        resetCaption1IB0( ) ;
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
      sMode465 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IB465( ) ;
      Gx_mode = sMode465 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IB465( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01IB18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T01IB18_A653OpeNom[0] ;
         n653OpeNom = T01IB18_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(16);
      }
   }

   public void processNestedLevel1IB466( )
   {
      nGXsfl_190_idx = 0 ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         readRow1IB466( ) ;
         if ( ( nRcdExists_466 != 0 ) || ( nIsMod_466 != 0 ) )
         {
            standaloneNotModal1IB466( ) ;
            getKey1IB466( ) ;
            if ( ( nRcdExists_466 == 0 ) && ( nRcdDeleted_466 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1IB466( ) ;
            }
            else
            {
               if ( RcdFound466 != 0 )
               {
                  if ( ( nRcdDeleted_466 != 0 ) && ( nRcdExists_466 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1IB466( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_466 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1IB466( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_466 == 0 )
                  {
                     GXCCtl = "SOLFRILIN_" + sGXsfl_190_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSolFriLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_466_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolFriLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3216SolFriLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSolFriObs_Internalname, GXutil.rtrim( A3217SolFriObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3216SolFriLin_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( Z3216SolFriLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3217SolFriObs_"+sGXsfl_190_idx, GXutil.rtrim( Z3217SolFriObs)) ;
         httpContext.changePostValue( "nRcdDeleted_466_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_466_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_466_"+sGXsfl_190_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_466 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_466_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_466_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLFRILIN_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolFriLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SOLFRIOBS_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolFriObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1IB466( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_466 = (short)(0) ;
      nIsMod_466 = (short)(0) ;
      nRcdDeleted_466 = (short)(0) ;
   }

   public void processLevel1IB465( )
   {
      /* Save parent mode. */
      sMode465 = Gx_mode ;
      processNestedLevel1IB466( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode465 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1IB465( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IB465( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpsolfri");
         if ( AnyError == 0 )
         {
            confirmValues1IB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpsolfri");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IB465( )
   {
      this.A396EmprCod = A396EmprCod ;
      /* Scan By routine */
      /* Using cursor T01IB19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound465 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound465 = (short)(1) ;
         A3196SolFriCod = T01IB19_A3196SolFriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IB465( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound465 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound465 = (short)(1) ;
         A3196SolFriCod = T01IB19_A3196SolFriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
      }
   }

   public void scanEnd1IB465( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1IB465( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IB465( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IB465( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IB465( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IB465( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IB465( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IB465( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSolFriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtSolFriMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriMat_Enabled), 5, 0), true);
      edtSolFriSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriSer_Enabled), 5, 0), true);
      edtSolFriTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriTip_Enabled), 5, 0), true);
      edtSolFriDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriDisN_Enabled), 5, 0), true);
      edtSolFriNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriNom_Enabled), 5, 0), true);
      edtSolFriNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriNum_Enabled), 5, 0), true);
      edtSolFriFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriFec_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtSolFriCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriCliC_Enabled), 5, 0), true);
      edtSolFriCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriCliN_Enabled), 5, 0), true);
      edtSolFriSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriSol_Enabled), 5, 0), true);
      edtSolFriAlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriAlt_Enabled), 5, 0), true);
      edtSolFriUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriUlin_Enabled), 5, 0), true);
      edtSolFriAcS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriAcS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriAcS_Enabled), 5, 0), true);
      edtSolFriAcH_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriAcH_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriAcH_Enabled), 5, 0), true);
      edtSolFriMaS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriMaS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriMaS_Enabled), 5, 0), true);
      edtSolFriMaH_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriMaH_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriMaH_Enabled), 5, 0), true);
      edtSolFriNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriNor_Enabled), 5, 0), true);
      edtSolFriMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriMaq_Enabled), 5, 0), true);
      edtSolFriRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriRef_Enabled), 5, 0), true);
      edtSolFriLcs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriLcs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLcs_Enabled), 5, 0), true);
      edtSolFriLch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriLch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLch_Enabled), 5, 0), true);
      edtSolFriLms_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriLms_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLms_Enabled), 5, 0), true);
      edtSolFriLmh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriLmh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLmh_Enabled), 5, 0), true);
      edtSolFriSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriSt_Enabled), 5, 0), true);
      edtSolFriRqMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriRqMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriRqMn_Enabled), 5, 0), true);
      edtSolFriMtdo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriMtdo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriMtdo_Enabled), 5, 0), true);
   }

   public void zm1IB466( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3217SolFriObs = T01IB3_A3217SolFriObs[0] ;
         }
         else
         {
            Z3217SolFriObs = A3217SolFriObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z3196SolFriCod = A3196SolFriCod ;
         Z3216SolFriLin = A3216SolFriLin ;
         Z3217SolFriObs = A3217SolFriObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1IB466( )
   {
   }

   public void standaloneModal1IB466( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSolFriLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolFriLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      }
      else
      {
         edtSolFriLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSolFriLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      }
   }

   public void load1IB466( )
   {
      /* Using cursor T01IB20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod), Byte.valueOf(A3216SolFriLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound466 = (short)(1) ;
         A3217SolFriObs = T01IB20_A3217SolFriObs[0] ;
         n3217SolFriObs = T01IB20_n3217SolFriObs[0] ;
         zm1IB466( -5) ;
      }
      pr_default.close(18);
      onLoadActions1IB466( ) ;
   }

   public void onLoadActions1IB466( )
   {
   }

   public void checkExtendedTable1IB466( )
   {
      nIsDirty_466 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1IB466( ) ;
   }

   public void closeExtendedTableCursors1IB466( )
   {
   }

   public void enableDisable1IB466( )
   {
   }

   public void getKey1IB466( )
   {
      /* Using cursor T01IB21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod), Byte.valueOf(A3216SolFriLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound466 = (short)(1) ;
      }
      else
      {
         RcdFound466 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1IB466( )
   {
      /* Using cursor T01IB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod), Byte.valueOf(A3216SolFriLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01IB3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1IB466( 5) ;
         RcdFound466 = (short)(1) ;
         initializeNonKey1IB466( ) ;
         A3216SolFriLin = T01IB3_A3216SolFriLin[0] ;
         A3217SolFriObs = T01IB3_A3217SolFriObs[0] ;
         n3217SolFriObs = T01IB3_n3217SolFriObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3196SolFriCod = A3196SolFriCod ;
         Z3216SolFriLin = A3216SolFriLin ;
         sMode466 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IB466( ) ;
         load1IB466( ) ;
         Gx_mode = sMode466 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound466 = (short)(0) ;
         initializeNonKey1IB466( ) ;
         sMode466 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IB466( ) ;
         Gx_mode = sMode466 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1IB466( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1IB466( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod), Byte.valueOf(A3216SolFriLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFRICC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3217SolFriObs, T01IB2_A3217SolFriObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3217SolFriObs, T01IB2_A3217SolFriObs[0]) != 0 )
            {
               GXutil.writeLogln("tpsolfri:[seudo value changed for attri]"+"SolFriObs");
               GXutil.writeLogRaw("Old: ",Z3217SolFriObs);
               GXutil.writeLogRaw("Current: ",T01IB2_A3217SolFriObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLFRICC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IB466( )
   {
      beforeValidate1IB466( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IB466( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IB466( 0) ;
         checkOptimisticConcurrency1IB466( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IB466( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IB466( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IB22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A3196SolFriCod), Byte.valueOf(A3216SolFriLin), Boolean.valueOf(n3217SolFriObs), A3217SolFriObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFRICC");
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
            load1IB466( ) ;
         }
         endLevel1IB466( ) ;
      }
      closeExtendedTableCursors1IB466( ) ;
   }

   public void update1IB466( )
   {
      beforeValidate1IB466( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IB466( ) ;
      }
      if ( ( nIsMod_466 != 0 ) || ( nIsDirty_466 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1IB466( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1IB466( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1IB466( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01IB23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n3217SolFriObs), A3217SolFriObs, A396EmprCod, Integer.valueOf(A3196SolFriCod), Byte.valueOf(A3216SolFriLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFRICC");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFRICC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1IB466( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1IB466( ) ;
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
            endLevel1IB466( ) ;
         }
      }
      closeExtendedTableCursors1IB466( ) ;
   }

   public void deferredUpdate1IB466( )
   {
   }

   public void delete1IB466( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IB466( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IB466( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IB466( ) ;
         afterConfirm1IB466( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IB466( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IB24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod), Byte.valueOf(A3216SolFriLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFRICC");
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
      sMode466 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IB466( ) ;
      Gx_mode = sMode466 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IB466( )
   {
      standaloneModal1IB466( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1IB466( )
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

   public void scanStart1IB466( )
   {
      /* Scan By routine */
      /* Using cursor T01IB25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A3196SolFriCod)});
      RcdFound466 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound466 = (short)(1) ;
         A3216SolFriLin = T01IB25_A3216SolFriLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IB466( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound466 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound466 = (short)(1) ;
         A3216SolFriLin = T01IB25_A3216SolFriLin[0] ;
      }
   }

   public void scanEnd1IB466( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1IB466( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IB466( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IB466( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IB466( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IB466( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IB466( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IB466( )
   {
      edtSolFriLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
      edtSolFriObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriObs_Enabled), 5, 0), !bGXsfl_190_Refreshing);
   }

   public void send_integrity_lvl_hashes1IB466( )
   {
   }

   public void send_integrity_lvl_hashes1IB465( )
   {
   }

   public void subsflControlProps_190466( )
   {
      edtavnRcdDeleted_466_Internalname = "vNRCDDELETED_466_"+sGXsfl_190_idx ;
      edtSolFriLin_Internalname = "SOLFRILIN_"+sGXsfl_190_idx ;
      edtSolFriObs_Internalname = "SOLFRIOBS_"+sGXsfl_190_idx ;
   }

   public void subsflControlProps_fel_190466( )
   {
      edtavnRcdDeleted_466_Internalname = "vNRCDDELETED_466_"+sGXsfl_190_fel_idx ;
      edtSolFriLin_Internalname = "SOLFRILIN_"+sGXsfl_190_fel_idx ;
      edtSolFriObs_Internalname = "SOLFRIOBS_"+sGXsfl_190_fel_idx ;
   }

   public void addRow1IB466( )
   {
      nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_190466( ) ;
      sendRow1IB466( ) ;
   }

   public void sendRow1IB466( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_466_" + sGXsfl_190_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_190_idx + "',190)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_466_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_466_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_466), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_466), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_466_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_466_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_466_" + sGXsfl_190_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 192,'',false,'" + sGXsfl_190_idx + "',190)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolFriLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3216SolFriLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3216SolFriLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,192);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolFriLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolFriLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_466_" + sGXsfl_190_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 193,'',false,'" + sGXsfl_190_idx + "',190)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSolFriObs_Internalname,GXutil.rtrim( A3217SolFriObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,193);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSolFriObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSolFriObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(190),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1IB466( ) ;
      GXCCtl = "Z3216SolFriLin_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3216SolFriLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3217SolFriObs_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3217SolFriObs));
      GXCCtl = "nRcdDeleted_466_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_466_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_466_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_466, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCOD_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV48BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV49BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_190_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV50BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_466_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_466_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLFRILIN_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolFriLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SOLFRIOBS_"+sGXsfl_190_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSolFriObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1IB466( )
   {
      nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_190466( ) ;
      edtavnRcdDeleted_466_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_466_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolFriLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLFRILIN_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSolFriObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SOLFRIOBS_"+sGXsfl_190_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_466_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_466_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_466");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_466_Internalname ;
         wbErr = true ;
         nRcdDeleted_466 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_466 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_466_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSolFriLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "SOLFRILIN_" + sGXsfl_190_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSolFriLin_Internalname ;
         wbErr = true ;
         A3216SolFriLin = (byte)(0) ;
      }
      else
      {
         A3216SolFriLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtSolFriLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3217SolFriObs = httpContext.cgiGet( edtSolFriObs_Internalname) ;
      n3217SolFriObs = false ;
      GXCCtl = "Z3216SolFriLin_" + sGXsfl_190_idx ;
      Z3216SolFriLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3217SolFriObs_" + sGXsfl_190_idx ;
      Z3217SolFriObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_466_" + sGXsfl_190_idx ;
      nRcdDeleted_466 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_466_" + sGXsfl_190_idx ;
      nRcdExists_466 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_466_" + sGXsfl_190_idx ;
      nIsMod_466 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtSolFriLin_Enabled = edtSolFriLin_Enabled ;
   }

   public void confirmValues1IB0( )
   {
      nGXsfl_190_idx = 0 ;
      sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_190466( ) ;
      while ( nGXsfl_190_idx < nRC_GXsfl_190 )
      {
         nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
         sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_190466( ) ;
         httpContext.changePostValue( "Z3216SolFriLin_"+sGXsfl_190_idx, httpContext.cgiGet( "ZT_"+"Z3216SolFriLin_"+sGXsfl_190_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3216SolFriLin_"+sGXsfl_190_idx) ;
         httpContext.changePostValue( "Z3217SolFriObs_"+sGXsfl_190_idx, httpContext.cgiGet( "ZT_"+"Z3217SolFriObs_"+sGXsfl_190_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3217SolFriObs_"+sGXsfl_190_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpsolfri", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3196SolFriCod", GXutil.ltrim( localUtil.ntoc( Z3196SolFriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3197SolFriMat", GXutil.rtrim( Z3197SolFriMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3198SolFriSer", GXutil.rtrim( Z3198SolFriSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3199SolFriTip", GXutil.ltrim( localUtil.ntoc( Z3199SolFriTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3200SolFriDisN", GXutil.rtrim( Z3200SolFriDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3201SolFriNom", GXutil.rtrim( Z3201SolFriNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3202SolFriNum", GXutil.ltrim( localUtil.ntoc( Z3202SolFriNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3203SolFriFec", localUtil.dtoc( Z3203SolFriFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3204SolFriCliC", GXutil.ltrim( localUtil.ntoc( Z3204SolFriCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3205SolFriCliN", GXutil.rtrim( Z3205SolFriCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3206SolFriSol", GXutil.rtrim( Z3206SolFriSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3207SolFriAlt", GXutil.rtrim( Z3207SolFriAlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3208SolFriUlin", GXutil.ltrim( localUtil.ntoc( Z3208SolFriUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3209SolFriAcS", GXutil.rtrim( Z3209SolFriAcS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3210SolFriAcH", GXutil.rtrim( Z3210SolFriAcH));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3211SolFriMaS", GXutil.rtrim( Z3211SolFriMaS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3212SolFriMaH", GXutil.rtrim( Z3212SolFriMaH));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3213SolFriNor", GXutil.rtrim( Z3213SolFriNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3214SolFriMaq", GXutil.rtrim( Z3214SolFriMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3215SolFriRef", GXutil.rtrim( Z3215SolFriRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11057SolFriLcs", GXutil.rtrim( Z11057SolFriLcs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11058SolFriLch", GXutil.rtrim( Z11058SolFriLch));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11059SolFriLms", GXutil.rtrim( Z11059SolFriLms));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11060SolFriLmh", GXutil.rtrim( Z11060SolFriLmh));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11805SolFriSt", GXutil.ltrim( localUtil.ntoc( Z11805SolFriSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11922SolFriRqMn", GXutil.rtrim( Z11922SolFriRqMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11923SolFriMtdo", GXutil.rtrim( Z11923SolFriMtdo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_190", GXutil.ltrim( localUtil.ntoc( nGXsfl_190_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV48BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV49BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV50BarCodPar));
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
      return formatLink("app.tpsolfri", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TpSOLFRI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Llamada con parametro", "") ;
   }

   public void initializeNonKey1IB465( )
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
      A3197SolFriMat = "" ;
      n3197SolFriMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3197SolFriMat", A3197SolFriMat);
      A3198SolFriSer = "" ;
      n3198SolFriSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3198SolFriSer", A3198SolFriSer);
      A3199SolFriTip = (short)(0) ;
      n3199SolFriTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3199SolFriTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3199SolFriTip), 4, 0));
      A3200SolFriDisN = "" ;
      n3200SolFriDisN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3200SolFriDisN", A3200SolFriDisN);
      A3201SolFriNom = "" ;
      n3201SolFriNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3201SolFriNom", A3201SolFriNom);
      A3202SolFriNum = 0 ;
      n3202SolFriNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3202SolFriNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3202SolFriNum), 6, 0));
      A3203SolFriFec = GXutil.nullDate() ;
      n3203SolFriFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3203SolFriFec", localUtil.format(A3203SolFriFec, "99/99/99"));
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A3204SolFriCliC = 0 ;
      n3204SolFriCliC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3204SolFriCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3204SolFriCliC), 6, 0));
      A3205SolFriCliN = "" ;
      n3205SolFriCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3205SolFriCliN", A3205SolFriCliN);
      A3206SolFriSol = "" ;
      n3206SolFriSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3206SolFriSol", A3206SolFriSol);
      A3207SolFriAlt = "" ;
      n3207SolFriAlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3207SolFriAlt", A3207SolFriAlt);
      A3208SolFriUlin = (byte)(0) ;
      n3208SolFriUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3208SolFriUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3208SolFriUlin), 2, 0));
      A3209SolFriAcS = "" ;
      n3209SolFriAcS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3209SolFriAcS", A3209SolFriAcS);
      A3210SolFriAcH = "" ;
      n3210SolFriAcH = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3210SolFriAcH", A3210SolFriAcH);
      A3211SolFriMaS = "" ;
      n3211SolFriMaS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3211SolFriMaS", A3211SolFriMaS);
      A3212SolFriMaH = "" ;
      n3212SolFriMaH = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3212SolFriMaH", A3212SolFriMaH);
      A3213SolFriNor = "" ;
      n3213SolFriNor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3213SolFriNor", A3213SolFriNor);
      A3214SolFriMaq = "" ;
      n3214SolFriMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3214SolFriMaq", A3214SolFriMaq);
      A3215SolFriRef = "" ;
      n3215SolFriRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3215SolFriRef", A3215SolFriRef);
      A11057SolFriLcs = "" ;
      n11057SolFriLcs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11057SolFriLcs", A11057SolFriLcs);
      A11058SolFriLch = "" ;
      n11058SolFriLch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11058SolFriLch", A11058SolFriLch);
      A11059SolFriLms = "" ;
      n11059SolFriLms = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11059SolFriLms", A11059SolFriLms);
      A11060SolFriLmh = "" ;
      n11060SolFriLmh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11060SolFriLmh", A11060SolFriLmh);
      A11805SolFriSt = (byte)(0) ;
      n11805SolFriSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11805SolFriSt", GXutil.str( A11805SolFriSt, 1, 0));
      A11922SolFriRqMn = "" ;
      n11922SolFriRqMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11922SolFriRqMn", A11922SolFriRqMn);
      A11923SolFriMtdo = "" ;
      n11923SolFriMtdo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11923SolFriMtdo", A11923SolFriMtdo);
      Z3197SolFriMat = "" ;
      Z3198SolFriSer = "" ;
      Z3199SolFriTip = (short)(0) ;
      Z3200SolFriDisN = "" ;
      Z3201SolFriNom = "" ;
      Z3202SolFriNum = 0 ;
      Z3203SolFriFec = GXutil.nullDate() ;
      Z3204SolFriCliC = 0 ;
      Z3205SolFriCliN = "" ;
      Z3206SolFriSol = "" ;
      Z3207SolFriAlt = "" ;
      Z3208SolFriUlin = (byte)(0) ;
      Z3209SolFriAcS = "" ;
      Z3210SolFriAcH = "" ;
      Z3211SolFriMaS = "" ;
      Z3212SolFriMaH = "" ;
      Z3213SolFriNor = "" ;
      Z3214SolFriMaq = "" ;
      Z3215SolFriRef = "" ;
      Z11057SolFriLcs = "" ;
      Z11058SolFriLch = "" ;
      Z11059SolFriLms = "" ;
      Z11060SolFriLmh = "" ;
      Z11805SolFriSt = (byte)(0) ;
      Z11922SolFriRqMn = "" ;
      Z11923SolFriMtdo = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAll1IB465( )
   {
      A3196SolFriCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3196SolFriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3196SolFriCod), 8, 0));
      initializeNonKey1IB465( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1IB466( )
   {
      A3217SolFriObs = "" ;
      n3217SolFriObs = false ;
      Z3217SolFriObs = "" ;
   }

   public void initAll1IB466( )
   {
      A3216SolFriLin = (byte)(0) ;
      initializeNonKey1IB466( ) ;
   }

   public void standaloneModalInsert1IB466( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241581054", true, true);
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
      httpContext.AddJavascriptSource("tpsolfri.js", "?20268241581054", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties466( )
   {
      edtSolFriLin_Enabled = defedtSolFriLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSolFriLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSolFriLin_Enabled), 5, 0), !bGXsfl_190_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_466, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_466_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3216SolFriLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolFriLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3217SolFriObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSolFriObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSolFriCod_Internalname = "SOLFRICOD" ;
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
      edtSolFriMat_Internalname = "SOLFRIMAT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSolFriSer_Internalname = "SOLFRISER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSolFriTip_Internalname = "SOLFRITIP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSolFriDisN_Internalname = "SOLFRIDISN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSolFriNom_Internalname = "SOLFRINOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtSolFriNum_Internalname = "SOLFRINUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtSolFriFec_Internalname = "SOLFRIFEC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtSolFriCliC_Internalname = "SOLFRICLIC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtSolFriCliN_Internalname = "SOLFRICLIN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtSolFriSol_Internalname = "SOLFRISOL" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtSolFriAlt_Internalname = "SOLFRIALT" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtSolFriUlin_Internalname = "SOLFRIULIN" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtSolFriAcS_Internalname = "SOLFRIACS" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtSolFriAcH_Internalname = "SOLFRIACH" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtSolFriMaS_Internalname = "SOLFRIMAS" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtSolFriMaH_Internalname = "SOLFRIMAH" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtSolFriNor_Internalname = "SOLFRINOR" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtSolFriMaq_Internalname = "SOLFRIMAQ" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtSolFriRef_Internalname = "SOLFRIREF" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtSolFriLcs_Internalname = "SOLFRILCS" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtSolFriLch_Internalname = "SOLFRILCH" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtSolFriLms_Internalname = "SOLFRILMS" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtSolFriLmh_Internalname = "SOLFRILMH" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtSolFriSt_Internalname = "SOLFRIST" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtSolFriRqMn_Internalname = "SOLFRIRQMN" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtSolFriMtdo_Internalname = "SOLFRIMTDO" ;
      edtavnRcdDeleted_466_Internalname = "vNRCDDELETED_466" ;
      edtSolFriLin_Internalname = "SOLFRILIN" ;
      edtSolFriObs_Internalname = "SOLFRIOBS" ;
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
      edtSolFriObs_Jsonclick = "" ;
      edtSolFriLin_Jsonclick = "" ;
      edtavnRcdDeleted_466_Jsonclick = "" ;
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
      edtSolFriObs_Enabled = 1 ;
      edtSolFriLin_Enabled = 1 ;
      edtavnRcdDeleted_466_Enabled = 1 ;
      edtSolFriMtdo_Jsonclick = "" ;
      edtSolFriMtdo_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriMtdo_Enabled = 1 ;
      edtSolFriRqMn_Jsonclick = "" ;
      edtSolFriRqMn_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriRqMn_Enabled = 1 ;
      edtSolFriSt_Jsonclick = "" ;
      edtSolFriSt_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriSt_Enabled = 1 ;
      edtSolFriLmh_Jsonclick = "" ;
      edtSolFriLmh_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriLmh_Enabled = 1 ;
      edtSolFriLms_Jsonclick = "" ;
      edtSolFriLms_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriLms_Enabled = 1 ;
      edtSolFriLch_Jsonclick = "" ;
      edtSolFriLch_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriLch_Enabled = 1 ;
      edtSolFriLcs_Jsonclick = "" ;
      edtSolFriLcs_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriLcs_Enabled = 1 ;
      edtSolFriRef_Jsonclick = "" ;
      edtSolFriRef_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriRef_Enabled = 1 ;
      edtSolFriMaq_Jsonclick = "" ;
      edtSolFriMaq_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriMaq_Enabled = 1 ;
      edtSolFriNor_Jsonclick = "" ;
      edtSolFriNor_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriNor_Enabled = 1 ;
      edtSolFriMaH_Jsonclick = "" ;
      edtSolFriMaH_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriMaH_Enabled = 1 ;
      edtSolFriMaS_Jsonclick = "" ;
      edtSolFriMaS_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriMaS_Enabled = 1 ;
      edtSolFriAcH_Jsonclick = "" ;
      edtSolFriAcH_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriAcH_Enabled = 1 ;
      edtSolFriAcS_Jsonclick = "" ;
      edtSolFriAcS_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriAcS_Enabled = 1 ;
      edtSolFriUlin_Jsonclick = "" ;
      edtSolFriUlin_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriUlin_Enabled = 1 ;
      edtSolFriAlt_Jsonclick = "" ;
      edtSolFriAlt_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriAlt_Enabled = 1 ;
      edtSolFriSol_Jsonclick = "" ;
      edtSolFriSol_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriSol_Enabled = 1 ;
      edtSolFriCliN_Jsonclick = "" ;
      edtSolFriCliN_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriCliN_Enabled = 1 ;
      edtSolFriCliC_Jsonclick = "" ;
      edtSolFriCliC_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriCliC_Enabled = 1 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtSolFriFec_Jsonclick = "" ;
      edtSolFriFec_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriFec_Enabled = 1 ;
      edtSolFriNum_Jsonclick = "" ;
      edtSolFriNum_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriNum_Enabled = 1 ;
      edtSolFriNom_Jsonclick = "" ;
      edtSolFriNom_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriNom_Enabled = 1 ;
      edtSolFriDisN_Jsonclick = "" ;
      edtSolFriDisN_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriDisN_Enabled = 1 ;
      edtSolFriTip_Jsonclick = "" ;
      edtSolFriTip_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriTip_Enabled = 1 ;
      edtSolFriSer_Jsonclick = "" ;
      edtSolFriSer_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriSer_Enabled = 1 ;
      edtSolFriMat_Jsonclick = "" ;
      edtSolFriMat_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriMat_Enabled = 1 ;
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
      edtSolFriCod_Jsonclick = "" ;
      edtSolFriCod_Backcolor = (int)(0xFFFFFF) ;
      edtSolFriCod_Enabled = 1 ;
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
      subsflControlProps_190466( ) ;
      while ( nGXsfl_190_idx <= nRC_GXsfl_190 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1IB466( ) ;
         standaloneModal1IB466( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1IB466( ) ;
         nGXsfl_190_idx = (int)(nGXsfl_190_idx+1) ;
         sGXsfl_190_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_190_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_190466( ) ;
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
      /* Using cursor T01IB26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IB26_A407EmprNom[0] ;
      n407EmprNom = T01IB26_n407EmprNom[0] ;
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

   public void valid_Solfricod( )
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
      httpContext.ajax_rsp_assign_attri("", false, "A3197SolFriMat", GXutil.rtrim( A3197SolFriMat));
      httpContext.ajax_rsp_assign_attri("", false, "A3198SolFriSer", GXutil.rtrim( A3198SolFriSer));
      httpContext.ajax_rsp_assign_attri("", false, "A3199SolFriTip", GXutil.ltrim( localUtil.ntoc( A3199SolFriTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3200SolFriDisN", GXutil.rtrim( A3200SolFriDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A3201SolFriNom", GXutil.rtrim( A3201SolFriNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3202SolFriNum", GXutil.ltrim( localUtil.ntoc( A3202SolFriNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3203SolFriFec", localUtil.format(A3203SolFriFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3204SolFriCliC", GXutil.ltrim( localUtil.ntoc( A3204SolFriCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3205SolFriCliN", GXutil.rtrim( A3205SolFriCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A3206SolFriSol", GXutil.rtrim( A3206SolFriSol));
      httpContext.ajax_rsp_assign_attri("", false, "A3207SolFriAlt", GXutil.rtrim( A3207SolFriAlt));
      httpContext.ajax_rsp_assign_attri("", false, "A3208SolFriUlin", GXutil.ltrim( localUtil.ntoc( A3208SolFriUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3209SolFriAcS", GXutil.rtrim( A3209SolFriAcS));
      httpContext.ajax_rsp_assign_attri("", false, "A3210SolFriAcH", GXutil.rtrim( A3210SolFriAcH));
      httpContext.ajax_rsp_assign_attri("", false, "A3211SolFriMaS", GXutil.rtrim( A3211SolFriMaS));
      httpContext.ajax_rsp_assign_attri("", false, "A3212SolFriMaH", GXutil.rtrim( A3212SolFriMaH));
      httpContext.ajax_rsp_assign_attri("", false, "A3213SolFriNor", GXutil.rtrim( A3213SolFriNor));
      httpContext.ajax_rsp_assign_attri("", false, "A3214SolFriMaq", GXutil.rtrim( A3214SolFriMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A3215SolFriRef", GXutil.rtrim( A3215SolFriRef));
      httpContext.ajax_rsp_assign_attri("", false, "A11057SolFriLcs", GXutil.rtrim( A11057SolFriLcs));
      httpContext.ajax_rsp_assign_attri("", false, "A11058SolFriLch", GXutil.rtrim( A11058SolFriLch));
      httpContext.ajax_rsp_assign_attri("", false, "A11059SolFriLms", GXutil.rtrim( A11059SolFriLms));
      httpContext.ajax_rsp_assign_attri("", false, "A11060SolFriLmh", GXutil.rtrim( A11060SolFriLmh));
      httpContext.ajax_rsp_assign_attri("", false, "A11805SolFriSt", GXutil.ltrim( localUtil.ntoc( A11805SolFriSt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11922SolFriRqMn", GXutil.rtrim( A11922SolFriRqMn));
      httpContext.ajax_rsp_assign_attri("", false, "A11923SolFriMtdo", GXutil.rtrim( A11923SolFriMtdo));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3196SolFriCod", GXutil.ltrim( localUtil.ntoc( Z3196SolFriCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3197SolFriMat", GXutil.rtrim( Z3197SolFriMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3198SolFriSer", GXutil.rtrim( Z3198SolFriSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3199SolFriTip", GXutil.ltrim( localUtil.ntoc( Z3199SolFriTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3200SolFriDisN", GXutil.rtrim( Z3200SolFriDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3201SolFriNom", GXutil.rtrim( Z3201SolFriNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3202SolFriNum", GXutil.ltrim( localUtil.ntoc( Z3202SolFriNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3203SolFriFec", localUtil.format(Z3203SolFriFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3204SolFriCliC", GXutil.ltrim( localUtil.ntoc( Z3204SolFriCliC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3205SolFriCliN", GXutil.rtrim( Z3205SolFriCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3206SolFriSol", GXutil.rtrim( Z3206SolFriSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3207SolFriAlt", GXutil.rtrim( Z3207SolFriAlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3208SolFriUlin", GXutil.ltrim( localUtil.ntoc( Z3208SolFriUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3209SolFriAcS", GXutil.rtrim( Z3209SolFriAcS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3210SolFriAcH", GXutil.rtrim( Z3210SolFriAcH));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3211SolFriMaS", GXutil.rtrim( Z3211SolFriMaS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3212SolFriMaH", GXutil.rtrim( Z3212SolFriMaH));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3213SolFriNor", GXutil.rtrim( Z3213SolFriNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3214SolFriMaq", GXutil.rtrim( Z3214SolFriMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3215SolFriRef", GXutil.rtrim( Z3215SolFriRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11057SolFriLcs", GXutil.rtrim( Z11057SolFriLcs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11058SolFriLch", GXutil.rtrim( Z11058SolFriLch));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11059SolFriLms", GXutil.rtrim( Z11059SolFriLms));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11060SolFriLmh", GXutil.rtrim( Z11060SolFriLmh));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11805SolFriSt", GXutil.ltrim( localUtil.ntoc( Z11805SolFriSt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11922SolFriRqMn", GXutil.rtrim( Z11922SolFriRqMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11923SolFriMtdo", GXutil.rtrim( Z11923SolFriMtdo));
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
      /* Using cursor T01IB27 */
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
      /* Using cursor T01IB18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T01IB18_A653OpeNom[0] ;
      n653OpeNom = T01IB18_n653OpeNom[0] ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV48BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_SOLFRICOD","{handler:'valid_Solfricod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3196SolFriCod',fld:'SOLFRICOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_SOLFRICOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3197SolFriMat',fld:'SOLFRIMAT',pic:''},{av:'A3198SolFriSer',fld:'SOLFRISER',pic:''},{av:'A3199SolFriTip',fld:'SOLFRITIP',pic:'ZZZ9'},{av:'A3200SolFriDisN',fld:'SOLFRIDISN',pic:''},{av:'A3201SolFriNom',fld:'SOLFRINOM',pic:''},{av:'A3202SolFriNum',fld:'SOLFRINUM',pic:'ZZZZZ9'},{av:'A3203SolFriFec',fld:'SOLFRIFEC',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A3204SolFriCliC',fld:'SOLFRICLIC',pic:'ZZZZZ9'},{av:'A3205SolFriCliN',fld:'SOLFRICLIN',pic:''},{av:'A3206SolFriSol',fld:'SOLFRISOL',pic:''},{av:'A3207SolFriAlt',fld:'SOLFRIALT',pic:''},{av:'A3208SolFriUlin',fld:'SOLFRIULIN',pic:'Z9'},{av:'A3209SolFriAcS',fld:'SOLFRIACS',pic:''},{av:'A3210SolFriAcH',fld:'SOLFRIACH',pic:''},{av:'A3211SolFriMaS',fld:'SOLFRIMAS',pic:''},{av:'A3212SolFriMaH',fld:'SOLFRIMAH',pic:''},{av:'A3213SolFriNor',fld:'SOLFRINOR',pic:''},{av:'A3214SolFriMaq',fld:'SOLFRIMAQ',pic:''},{av:'A3215SolFriRef',fld:'SOLFRIREF',pic:''},{av:'A11057SolFriLcs',fld:'SOLFRILCS',pic:''},{av:'A11058SolFriLch',fld:'SOLFRILCH',pic:''},{av:'A11059SolFriLms',fld:'SOLFRILMS',pic:''},{av:'A11060SolFriLmh',fld:'SOLFRILMH',pic:''},{av:'A11805SolFriSt',fld:'SOLFRIST',pic:'9'},{av:'A11922SolFriRqMn',fld:'SOLFRIRQMN',pic:''},{av:'A11923SolFriMtdo',fld:'SOLFRIMTDO',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3196SolFriCod'},{av:'Z407EmprNom'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z3197SolFriMat'},{av:'Z3198SolFriSer'},{av:'Z3199SolFriTip'},{av:'Z3200SolFriDisN'},{av:'Z3201SolFriNom'},{av:'Z3202SolFriNum'},{av:'Z3203SolFriFec'},{av:'Z652OpeCod'},{av:'Z3204SolFriCliC'},{av:'Z3205SolFriCliN'},{av:'Z3206SolFriSol'},{av:'Z3207SolFriAlt'},{av:'Z3208SolFriUlin'},{av:'Z3209SolFriAcS'},{av:'Z3210SolFriAcH'},{av:'Z3211SolFriMaS'},{av:'Z3212SolFriMaH'},{av:'Z3213SolFriNor'},{av:'Z3214SolFriMaq'},{av:'Z3215SolFriRef'},{av:'Z11057SolFriLcs'},{av:'Z11058SolFriLch'},{av:'Z11059SolFriLms'},{av:'Z11060SolFriLmh'},{av:'Z11805SolFriSt'},{av:'Z11922SolFriRqMn'},{av:'Z11923SolFriMtdo'},{av:'Z653OpeNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_SOLFRILIN","{handler:'valid_Solfrilin',iparms:[]");
      setEventMetadata("VALID_SOLFRILIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Solfriobs',iparms:[]");
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
      wcpOAV50BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z3197SolFriMat = "" ;
      Z3198SolFriSer = "" ;
      Z3200SolFriDisN = "" ;
      Z3201SolFriNom = "" ;
      Z3203SolFriFec = GXutil.nullDate() ;
      Z3205SolFriCliN = "" ;
      Z3206SolFriSol = "" ;
      Z3207SolFriAlt = "" ;
      Z3209SolFriAcS = "" ;
      Z3210SolFriAcH = "" ;
      Z3211SolFriMaS = "" ;
      Z3212SolFriMaH = "" ;
      Z3213SolFriNor = "" ;
      Z3214SolFriMaq = "" ;
      Z3215SolFriRef = "" ;
      Z11057SolFriLcs = "" ;
      Z11058SolFriLch = "" ;
      Z11059SolFriLms = "" ;
      Z11060SolFriLmh = "" ;
      Z11922SolFriRqMn = "" ;
      Z11923SolFriMtdo = "" ;
      Z130BarCodPar = "" ;
      Z3217SolFriObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV50BarCodPar = "" ;
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
      A3197SolFriMat = "" ;
      lblTextblock8_Jsonclick = "" ;
      A3198SolFriSer = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3200SolFriDisN = "" ;
      lblTextblock11_Jsonclick = "" ;
      A3201SolFriNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A3203SolFriFec = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A3205SolFriCliN = "" ;
      lblTextblock18_Jsonclick = "" ;
      A3206SolFriSol = "" ;
      lblTextblock19_Jsonclick = "" ;
      A3207SolFriAlt = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A3209SolFriAcS = "" ;
      lblTextblock22_Jsonclick = "" ;
      A3210SolFriAcH = "" ;
      lblTextblock23_Jsonclick = "" ;
      A3211SolFriMaS = "" ;
      lblTextblock24_Jsonclick = "" ;
      A3212SolFriMaH = "" ;
      lblTextblock25_Jsonclick = "" ;
      A3213SolFriNor = "" ;
      lblTextblock26_Jsonclick = "" ;
      A3214SolFriMaq = "" ;
      lblTextblock27_Jsonclick = "" ;
      A3215SolFriRef = "" ;
      lblTextblock28_Jsonclick = "" ;
      A11057SolFriLcs = "" ;
      lblTextblock29_Jsonclick = "" ;
      A11058SolFriLch = "" ;
      lblTextblock30_Jsonclick = "" ;
      A11059SolFriLms = "" ;
      lblTextblock31_Jsonclick = "" ;
      A11060SolFriLmh = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      A11922SolFriRqMn = "" ;
      lblTextblock34_Jsonclick = "" ;
      A11923SolFriMtdo = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode466 = "" ;
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
      sMode465 = "" ;
      GXCCtl = "" ;
      A3217SolFriObs = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T01IB6_A407EmprNom = new String[] {""} ;
      T01IB6_n407EmprNom = new boolean[] {false} ;
      T01IB9_A3196SolFriCod = new int[1] ;
      T01IB9_A407EmprNom = new String[] {""} ;
      T01IB9_n407EmprNom = new boolean[] {false} ;
      T01IB9_A3197SolFriMat = new String[] {""} ;
      T01IB9_n3197SolFriMat = new boolean[] {false} ;
      T01IB9_A3198SolFriSer = new String[] {""} ;
      T01IB9_n3198SolFriSer = new boolean[] {false} ;
      T01IB9_A3199SolFriTip = new short[1] ;
      T01IB9_n3199SolFriTip = new boolean[] {false} ;
      T01IB9_A3200SolFriDisN = new String[] {""} ;
      T01IB9_n3200SolFriDisN = new boolean[] {false} ;
      T01IB9_A3201SolFriNom = new String[] {""} ;
      T01IB9_n3201SolFriNom = new boolean[] {false} ;
      T01IB9_A3202SolFriNum = new int[1] ;
      T01IB9_n3202SolFriNum = new boolean[] {false} ;
      T01IB9_A3203SolFriFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IB9_n3203SolFriFec = new boolean[] {false} ;
      T01IB9_A653OpeNom = new String[] {""} ;
      T01IB9_n653OpeNom = new boolean[] {false} ;
      T01IB9_A3204SolFriCliC = new int[1] ;
      T01IB9_n3204SolFriCliC = new boolean[] {false} ;
      T01IB9_A3205SolFriCliN = new String[] {""} ;
      T01IB9_n3205SolFriCliN = new boolean[] {false} ;
      T01IB9_A3206SolFriSol = new String[] {""} ;
      T01IB9_n3206SolFriSol = new boolean[] {false} ;
      T01IB9_A3207SolFriAlt = new String[] {""} ;
      T01IB9_n3207SolFriAlt = new boolean[] {false} ;
      T01IB9_A3208SolFriUlin = new byte[1] ;
      T01IB9_n3208SolFriUlin = new boolean[] {false} ;
      T01IB9_A3209SolFriAcS = new String[] {""} ;
      T01IB9_n3209SolFriAcS = new boolean[] {false} ;
      T01IB9_A3210SolFriAcH = new String[] {""} ;
      T01IB9_n3210SolFriAcH = new boolean[] {false} ;
      T01IB9_A3211SolFriMaS = new String[] {""} ;
      T01IB9_n3211SolFriMaS = new boolean[] {false} ;
      T01IB9_A3212SolFriMaH = new String[] {""} ;
      T01IB9_n3212SolFriMaH = new boolean[] {false} ;
      T01IB9_A3213SolFriNor = new String[] {""} ;
      T01IB9_n3213SolFriNor = new boolean[] {false} ;
      T01IB9_A3214SolFriMaq = new String[] {""} ;
      T01IB9_n3214SolFriMaq = new boolean[] {false} ;
      T01IB9_A3215SolFriRef = new String[] {""} ;
      T01IB9_n3215SolFriRef = new boolean[] {false} ;
      T01IB9_A11057SolFriLcs = new String[] {""} ;
      T01IB9_n11057SolFriLcs = new boolean[] {false} ;
      T01IB9_A11058SolFriLch = new String[] {""} ;
      T01IB9_n11058SolFriLch = new boolean[] {false} ;
      T01IB9_A11059SolFriLms = new String[] {""} ;
      T01IB9_n11059SolFriLms = new boolean[] {false} ;
      T01IB9_A11060SolFriLmh = new String[] {""} ;
      T01IB9_n11060SolFriLmh = new boolean[] {false} ;
      T01IB9_A11805SolFriSt = new byte[1] ;
      T01IB9_n11805SolFriSt = new boolean[] {false} ;
      T01IB9_A11922SolFriRqMn = new String[] {""} ;
      T01IB9_n11922SolFriRqMn = new boolean[] {false} ;
      T01IB9_A11923SolFriMtdo = new String[] {""} ;
      T01IB9_n11923SolFriMtdo = new boolean[] {false} ;
      T01IB9_A396EmprCod = new String[] {""} ;
      T01IB9_A129BarCod = new int[1] ;
      T01IB9_n129BarCod = new boolean[] {false} ;
      T01IB9_A132BarCodReo = new byte[1] ;
      T01IB9_n132BarCodReo = new boolean[] {false} ;
      T01IB9_A130BarCodPar = new String[] {""} ;
      T01IB9_n130BarCodPar = new boolean[] {false} ;
      T01IB9_A652OpeCod = new int[1] ;
      T01IB9_n652OpeCod = new boolean[] {false} ;
      T01IB7_A396EmprCod = new String[] {""} ;
      T01IB8_A653OpeNom = new String[] {""} ;
      T01IB8_n653OpeNom = new boolean[] {false} ;
      T01IB10_A396EmprCod = new String[] {""} ;
      T01IB11_A653OpeNom = new String[] {""} ;
      T01IB11_n653OpeNom = new boolean[] {false} ;
      T01IB12_A396EmprCod = new String[] {""} ;
      T01IB12_A3196SolFriCod = new int[1] ;
      T01IB5_A3196SolFriCod = new int[1] ;
      T01IB5_A3197SolFriMat = new String[] {""} ;
      T01IB5_n3197SolFriMat = new boolean[] {false} ;
      T01IB5_A3198SolFriSer = new String[] {""} ;
      T01IB5_n3198SolFriSer = new boolean[] {false} ;
      T01IB5_A3199SolFriTip = new short[1] ;
      T01IB5_n3199SolFriTip = new boolean[] {false} ;
      T01IB5_A3200SolFriDisN = new String[] {""} ;
      T01IB5_n3200SolFriDisN = new boolean[] {false} ;
      T01IB5_A3201SolFriNom = new String[] {""} ;
      T01IB5_n3201SolFriNom = new boolean[] {false} ;
      T01IB5_A3202SolFriNum = new int[1] ;
      T01IB5_n3202SolFriNum = new boolean[] {false} ;
      T01IB5_A3203SolFriFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IB5_n3203SolFriFec = new boolean[] {false} ;
      T01IB5_A3204SolFriCliC = new int[1] ;
      T01IB5_n3204SolFriCliC = new boolean[] {false} ;
      T01IB5_A3205SolFriCliN = new String[] {""} ;
      T01IB5_n3205SolFriCliN = new boolean[] {false} ;
      T01IB5_A3206SolFriSol = new String[] {""} ;
      T01IB5_n3206SolFriSol = new boolean[] {false} ;
      T01IB5_A3207SolFriAlt = new String[] {""} ;
      T01IB5_n3207SolFriAlt = new boolean[] {false} ;
      T01IB5_A3208SolFriUlin = new byte[1] ;
      T01IB5_n3208SolFriUlin = new boolean[] {false} ;
      T01IB5_A3209SolFriAcS = new String[] {""} ;
      T01IB5_n3209SolFriAcS = new boolean[] {false} ;
      T01IB5_A3210SolFriAcH = new String[] {""} ;
      T01IB5_n3210SolFriAcH = new boolean[] {false} ;
      T01IB5_A3211SolFriMaS = new String[] {""} ;
      T01IB5_n3211SolFriMaS = new boolean[] {false} ;
      T01IB5_A3212SolFriMaH = new String[] {""} ;
      T01IB5_n3212SolFriMaH = new boolean[] {false} ;
      T01IB5_A3213SolFriNor = new String[] {""} ;
      T01IB5_n3213SolFriNor = new boolean[] {false} ;
      T01IB5_A3214SolFriMaq = new String[] {""} ;
      T01IB5_n3214SolFriMaq = new boolean[] {false} ;
      T01IB5_A3215SolFriRef = new String[] {""} ;
      T01IB5_n3215SolFriRef = new boolean[] {false} ;
      T01IB5_A11057SolFriLcs = new String[] {""} ;
      T01IB5_n11057SolFriLcs = new boolean[] {false} ;
      T01IB5_A11058SolFriLch = new String[] {""} ;
      T01IB5_n11058SolFriLch = new boolean[] {false} ;
      T01IB5_A11059SolFriLms = new String[] {""} ;
      T01IB5_n11059SolFriLms = new boolean[] {false} ;
      T01IB5_A11060SolFriLmh = new String[] {""} ;
      T01IB5_n11060SolFriLmh = new boolean[] {false} ;
      T01IB5_A11805SolFriSt = new byte[1] ;
      T01IB5_n11805SolFriSt = new boolean[] {false} ;
      T01IB5_A11922SolFriRqMn = new String[] {""} ;
      T01IB5_n11922SolFriRqMn = new boolean[] {false} ;
      T01IB5_A11923SolFriMtdo = new String[] {""} ;
      T01IB5_n11923SolFriMtdo = new boolean[] {false} ;
      T01IB5_A396EmprCod = new String[] {""} ;
      T01IB5_A129BarCod = new int[1] ;
      T01IB5_n129BarCod = new boolean[] {false} ;
      T01IB5_A132BarCodReo = new byte[1] ;
      T01IB5_n132BarCodReo = new boolean[] {false} ;
      T01IB5_A130BarCodPar = new String[] {""} ;
      T01IB5_n130BarCodPar = new boolean[] {false} ;
      T01IB5_A652OpeCod = new int[1] ;
      T01IB5_n652OpeCod = new boolean[] {false} ;
      T01IB13_A396EmprCod = new String[] {""} ;
      T01IB13_A3196SolFriCod = new int[1] ;
      T01IB14_A396EmprCod = new String[] {""} ;
      T01IB14_A3196SolFriCod = new int[1] ;
      T01IB4_A3196SolFriCod = new int[1] ;
      T01IB4_A3197SolFriMat = new String[] {""} ;
      T01IB4_n3197SolFriMat = new boolean[] {false} ;
      T01IB4_A3198SolFriSer = new String[] {""} ;
      T01IB4_n3198SolFriSer = new boolean[] {false} ;
      T01IB4_A3199SolFriTip = new short[1] ;
      T01IB4_n3199SolFriTip = new boolean[] {false} ;
      T01IB4_A3200SolFriDisN = new String[] {""} ;
      T01IB4_n3200SolFriDisN = new boolean[] {false} ;
      T01IB4_A3201SolFriNom = new String[] {""} ;
      T01IB4_n3201SolFriNom = new boolean[] {false} ;
      T01IB4_A3202SolFriNum = new int[1] ;
      T01IB4_n3202SolFriNum = new boolean[] {false} ;
      T01IB4_A3203SolFriFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IB4_n3203SolFriFec = new boolean[] {false} ;
      T01IB4_A3204SolFriCliC = new int[1] ;
      T01IB4_n3204SolFriCliC = new boolean[] {false} ;
      T01IB4_A3205SolFriCliN = new String[] {""} ;
      T01IB4_n3205SolFriCliN = new boolean[] {false} ;
      T01IB4_A3206SolFriSol = new String[] {""} ;
      T01IB4_n3206SolFriSol = new boolean[] {false} ;
      T01IB4_A3207SolFriAlt = new String[] {""} ;
      T01IB4_n3207SolFriAlt = new boolean[] {false} ;
      T01IB4_A3208SolFriUlin = new byte[1] ;
      T01IB4_n3208SolFriUlin = new boolean[] {false} ;
      T01IB4_A3209SolFriAcS = new String[] {""} ;
      T01IB4_n3209SolFriAcS = new boolean[] {false} ;
      T01IB4_A3210SolFriAcH = new String[] {""} ;
      T01IB4_n3210SolFriAcH = new boolean[] {false} ;
      T01IB4_A3211SolFriMaS = new String[] {""} ;
      T01IB4_n3211SolFriMaS = new boolean[] {false} ;
      T01IB4_A3212SolFriMaH = new String[] {""} ;
      T01IB4_n3212SolFriMaH = new boolean[] {false} ;
      T01IB4_A3213SolFriNor = new String[] {""} ;
      T01IB4_n3213SolFriNor = new boolean[] {false} ;
      T01IB4_A3214SolFriMaq = new String[] {""} ;
      T01IB4_n3214SolFriMaq = new boolean[] {false} ;
      T01IB4_A3215SolFriRef = new String[] {""} ;
      T01IB4_n3215SolFriRef = new boolean[] {false} ;
      T01IB4_A11057SolFriLcs = new String[] {""} ;
      T01IB4_n11057SolFriLcs = new boolean[] {false} ;
      T01IB4_A11058SolFriLch = new String[] {""} ;
      T01IB4_n11058SolFriLch = new boolean[] {false} ;
      T01IB4_A11059SolFriLms = new String[] {""} ;
      T01IB4_n11059SolFriLms = new boolean[] {false} ;
      T01IB4_A11060SolFriLmh = new String[] {""} ;
      T01IB4_n11060SolFriLmh = new boolean[] {false} ;
      T01IB4_A11805SolFriSt = new byte[1] ;
      T01IB4_n11805SolFriSt = new boolean[] {false} ;
      T01IB4_A11922SolFriRqMn = new String[] {""} ;
      T01IB4_n11922SolFriRqMn = new boolean[] {false} ;
      T01IB4_A11923SolFriMtdo = new String[] {""} ;
      T01IB4_n11923SolFriMtdo = new boolean[] {false} ;
      T01IB4_A396EmprCod = new String[] {""} ;
      T01IB4_A129BarCod = new int[1] ;
      T01IB4_n129BarCod = new boolean[] {false} ;
      T01IB4_A132BarCodReo = new byte[1] ;
      T01IB4_n132BarCodReo = new boolean[] {false} ;
      T01IB4_A130BarCodPar = new String[] {""} ;
      T01IB4_n130BarCodPar = new boolean[] {false} ;
      T01IB4_A652OpeCod = new int[1] ;
      T01IB4_n652OpeCod = new boolean[] {false} ;
      T01IB18_A653OpeNom = new String[] {""} ;
      T01IB18_n653OpeNom = new boolean[] {false} ;
      T01IB19_A396EmprCod = new String[] {""} ;
      T01IB19_A3196SolFriCod = new int[1] ;
      T01IB20_A3196SolFriCod = new int[1] ;
      T01IB20_A3216SolFriLin = new byte[1] ;
      T01IB20_A3217SolFriObs = new String[] {""} ;
      T01IB20_n3217SolFriObs = new boolean[] {false} ;
      T01IB20_A396EmprCod = new String[] {""} ;
      T01IB21_A396EmprCod = new String[] {""} ;
      T01IB21_A3196SolFriCod = new int[1] ;
      T01IB21_A3216SolFriLin = new byte[1] ;
      T01IB3_A3196SolFriCod = new int[1] ;
      T01IB3_A3216SolFriLin = new byte[1] ;
      T01IB3_A3217SolFriObs = new String[] {""} ;
      T01IB3_n3217SolFriObs = new boolean[] {false} ;
      T01IB3_A396EmprCod = new String[] {""} ;
      T01IB2_A3196SolFriCod = new int[1] ;
      T01IB2_A3216SolFriLin = new byte[1] ;
      T01IB2_A3217SolFriObs = new String[] {""} ;
      T01IB2_n3217SolFriObs = new boolean[] {false} ;
      T01IB2_A396EmprCod = new String[] {""} ;
      T01IB25_A396EmprCod = new String[] {""} ;
      T01IB25_A3196SolFriCod = new int[1] ;
      T01IB25_A3216SolFriLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01IB26_A407EmprNom = new String[] {""} ;
      T01IB26_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ130BarCodPar = "" ;
      ZZ3197SolFriMat = "" ;
      ZZ3198SolFriSer = "" ;
      ZZ3200SolFriDisN = "" ;
      ZZ3201SolFriNom = "" ;
      ZZ3203SolFriFec = GXutil.nullDate() ;
      ZZ3205SolFriCliN = "" ;
      ZZ3206SolFriSol = "" ;
      ZZ3207SolFriAlt = "" ;
      ZZ3209SolFriAcS = "" ;
      ZZ3210SolFriAcH = "" ;
      ZZ3211SolFriMaS = "" ;
      ZZ3212SolFriMaH = "" ;
      ZZ3213SolFriNor = "" ;
      ZZ3214SolFriMaq = "" ;
      ZZ3215SolFriRef = "" ;
      ZZ11057SolFriLcs = "" ;
      ZZ11058SolFriLch = "" ;
      ZZ11059SolFriLms = "" ;
      ZZ11060SolFriLmh = "" ;
      ZZ11922SolFriRqMn = "" ;
      ZZ11923SolFriMtdo = "" ;
      ZZ653OpeNom = "" ;
      T01IB27_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpsolfri__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpsolfri__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpsolfri__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpsolfri__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpsolfri__default(),
         new Object[] {
             new Object[] {
            T01IB2_A3196SolFriCod, T01IB2_A3216SolFriLin, T01IB2_A3217SolFriObs, T01IB2_n3217SolFriObs, T01IB2_A396EmprCod
            }
            , new Object[] {
            T01IB3_A3196SolFriCod, T01IB3_A3216SolFriLin, T01IB3_A3217SolFriObs, T01IB3_n3217SolFriObs, T01IB3_A396EmprCod
            }
            , new Object[] {
            T01IB4_A3196SolFriCod, T01IB4_A3197SolFriMat, T01IB4_n3197SolFriMat, T01IB4_A3198SolFriSer, T01IB4_n3198SolFriSer, T01IB4_A3199SolFriTip, T01IB4_n3199SolFriTip, T01IB4_A3200SolFriDisN, T01IB4_n3200SolFriDisN, T01IB4_A3201SolFriNom,
            T01IB4_n3201SolFriNom, T01IB4_A3202SolFriNum, T01IB4_n3202SolFriNum, T01IB4_A3203SolFriFec, T01IB4_n3203SolFriFec, T01IB4_A3204SolFriCliC, T01IB4_n3204SolFriCliC, T01IB4_A3205SolFriCliN, T01IB4_n3205SolFriCliN, T01IB4_A3206SolFriSol,
            T01IB4_n3206SolFriSol, T01IB4_A3207SolFriAlt, T01IB4_n3207SolFriAlt, T01IB4_A3208SolFriUlin, T01IB4_n3208SolFriUlin, T01IB4_A3209SolFriAcS, T01IB4_n3209SolFriAcS, T01IB4_A3210SolFriAcH, T01IB4_n3210SolFriAcH, T01IB4_A3211SolFriMaS,
            T01IB4_n3211SolFriMaS, T01IB4_A3212SolFriMaH, T01IB4_n3212SolFriMaH, T01IB4_A3213SolFriNor, T01IB4_n3213SolFriNor, T01IB4_A3214SolFriMaq, T01IB4_n3214SolFriMaq, T01IB4_A3215SolFriRef, T01IB4_n3215SolFriRef, T01IB4_A11057SolFriLcs,
            T01IB4_n11057SolFriLcs, T01IB4_A11058SolFriLch, T01IB4_n11058SolFriLch, T01IB4_A11059SolFriLms, T01IB4_n11059SolFriLms, T01IB4_A11060SolFriLmh, T01IB4_n11060SolFriLmh, T01IB4_A11805SolFriSt, T01IB4_n11805SolFriSt, T01IB4_A11922SolFriRqMn,
            T01IB4_n11922SolFriRqMn, T01IB4_A11923SolFriMtdo, T01IB4_n11923SolFriMtdo, T01IB4_A396EmprCod, T01IB4_A129BarCod, T01IB4_n129BarCod, T01IB4_A132BarCodReo, T01IB4_n132BarCodReo, T01IB4_A130BarCodPar, T01IB4_n130BarCodPar,
            T01IB4_A652OpeCod, T01IB4_n652OpeCod
            }
            , new Object[] {
            T01IB5_A3196SolFriCod, T01IB5_A3197SolFriMat, T01IB5_n3197SolFriMat, T01IB5_A3198SolFriSer, T01IB5_n3198SolFriSer, T01IB5_A3199SolFriTip, T01IB5_n3199SolFriTip, T01IB5_A3200SolFriDisN, T01IB5_n3200SolFriDisN, T01IB5_A3201SolFriNom,
            T01IB5_n3201SolFriNom, T01IB5_A3202SolFriNum, T01IB5_n3202SolFriNum, T01IB5_A3203SolFriFec, T01IB5_n3203SolFriFec, T01IB5_A3204SolFriCliC, T01IB5_n3204SolFriCliC, T01IB5_A3205SolFriCliN, T01IB5_n3205SolFriCliN, T01IB5_A3206SolFriSol,
            T01IB5_n3206SolFriSol, T01IB5_A3207SolFriAlt, T01IB5_n3207SolFriAlt, T01IB5_A3208SolFriUlin, T01IB5_n3208SolFriUlin, T01IB5_A3209SolFriAcS, T01IB5_n3209SolFriAcS, T01IB5_A3210SolFriAcH, T01IB5_n3210SolFriAcH, T01IB5_A3211SolFriMaS,
            T01IB5_n3211SolFriMaS, T01IB5_A3212SolFriMaH, T01IB5_n3212SolFriMaH, T01IB5_A3213SolFriNor, T01IB5_n3213SolFriNor, T01IB5_A3214SolFriMaq, T01IB5_n3214SolFriMaq, T01IB5_A3215SolFriRef, T01IB5_n3215SolFriRef, T01IB5_A11057SolFriLcs,
            T01IB5_n11057SolFriLcs, T01IB5_A11058SolFriLch, T01IB5_n11058SolFriLch, T01IB5_A11059SolFriLms, T01IB5_n11059SolFriLms, T01IB5_A11060SolFriLmh, T01IB5_n11060SolFriLmh, T01IB5_A11805SolFriSt, T01IB5_n11805SolFriSt, T01IB5_A11922SolFriRqMn,
            T01IB5_n11922SolFriRqMn, T01IB5_A11923SolFriMtdo, T01IB5_n11923SolFriMtdo, T01IB5_A396EmprCod, T01IB5_A129BarCod, T01IB5_n129BarCod, T01IB5_A132BarCodReo, T01IB5_n132BarCodReo, T01IB5_A130BarCodPar, T01IB5_n130BarCodPar,
            T01IB5_A652OpeCod, T01IB5_n652OpeCod
            }
            , new Object[] {
            T01IB6_A407EmprNom, T01IB6_n407EmprNom
            }
            , new Object[] {
            T01IB7_A396EmprCod
            }
            , new Object[] {
            T01IB8_A653OpeNom, T01IB8_n653OpeNom
            }
            , new Object[] {
            T01IB9_A3196SolFriCod, T01IB9_A407EmprNom, T01IB9_n407EmprNom, T01IB9_A3197SolFriMat, T01IB9_n3197SolFriMat, T01IB9_A3198SolFriSer, T01IB9_n3198SolFriSer, T01IB9_A3199SolFriTip, T01IB9_n3199SolFriTip, T01IB9_A3200SolFriDisN,
            T01IB9_n3200SolFriDisN, T01IB9_A3201SolFriNom, T01IB9_n3201SolFriNom, T01IB9_A3202SolFriNum, T01IB9_n3202SolFriNum, T01IB9_A3203SolFriFec, T01IB9_n3203SolFriFec, T01IB9_A653OpeNom, T01IB9_n653OpeNom, T01IB9_A3204SolFriCliC,
            T01IB9_n3204SolFriCliC, T01IB9_A3205SolFriCliN, T01IB9_n3205SolFriCliN, T01IB9_A3206SolFriSol, T01IB9_n3206SolFriSol, T01IB9_A3207SolFriAlt, T01IB9_n3207SolFriAlt, T01IB9_A3208SolFriUlin, T01IB9_n3208SolFriUlin, T01IB9_A3209SolFriAcS,
            T01IB9_n3209SolFriAcS, T01IB9_A3210SolFriAcH, T01IB9_n3210SolFriAcH, T01IB9_A3211SolFriMaS, T01IB9_n3211SolFriMaS, T01IB9_A3212SolFriMaH, T01IB9_n3212SolFriMaH, T01IB9_A3213SolFriNor, T01IB9_n3213SolFriNor, T01IB9_A3214SolFriMaq,
            T01IB9_n3214SolFriMaq, T01IB9_A3215SolFriRef, T01IB9_n3215SolFriRef, T01IB9_A11057SolFriLcs, T01IB9_n11057SolFriLcs, T01IB9_A11058SolFriLch, T01IB9_n11058SolFriLch, T01IB9_A11059SolFriLms, T01IB9_n11059SolFriLms, T01IB9_A11060SolFriLmh,
            T01IB9_n11060SolFriLmh, T01IB9_A11805SolFriSt, T01IB9_n11805SolFriSt, T01IB9_A11922SolFriRqMn, T01IB9_n11922SolFriRqMn, T01IB9_A11923SolFriMtdo, T01IB9_n11923SolFriMtdo, T01IB9_A396EmprCod, T01IB9_A129BarCod, T01IB9_n129BarCod,
            T01IB9_A132BarCodReo, T01IB9_n132BarCodReo, T01IB9_A130BarCodPar, T01IB9_n130BarCodPar, T01IB9_A652OpeCod, T01IB9_n652OpeCod
            }
            , new Object[] {
            T01IB10_A396EmprCod
            }
            , new Object[] {
            T01IB11_A653OpeNom, T01IB11_n653OpeNom
            }
            , new Object[] {
            T01IB12_A396EmprCod, T01IB12_A3196SolFriCod
            }
            , new Object[] {
            T01IB13_A396EmprCod, T01IB13_A3196SolFriCod
            }
            , new Object[] {
            T01IB14_A396EmprCod, T01IB14_A3196SolFriCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IB18_A653OpeNom, T01IB18_n653OpeNom
            }
            , new Object[] {
            T01IB19_A396EmprCod, T01IB19_A3196SolFriCod
            }
            , new Object[] {
            T01IB20_A3196SolFriCod, T01IB20_A3216SolFriLin, T01IB20_A3217SolFriObs, T01IB20_n3217SolFriObs, T01IB20_A396EmprCod
            }
            , new Object[] {
            T01IB21_A396EmprCod, T01IB21_A3196SolFriCod, T01IB21_A3216SolFriLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IB25_A396EmprCod, T01IB25_A3196SolFriCod, T01IB25_A3216SolFriLin
            }
            , new Object[] {
            T01IB26_A407EmprNom, T01IB26_n407EmprNom
            }
            , new Object[] {
            T01IB27_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOAV49BarCodReo ;
   private byte Z3208SolFriUlin ;
   private byte Z11805SolFriSt ;
   private byte Z132BarCodReo ;
   private byte Z3216SolFriLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV49BarCodReo ;
   private byte nKeyPressed ;
   private byte A3208SolFriUlin ;
   private byte A11805SolFriSt ;
   private byte A3216SolFriLin ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3208SolFriUlin ;
   private byte ZZ11805SolFriSt ;
   private short Z3199SolFriTip ;
   private short nRcdDeleted_466 ;
   private short nRcdExists_466 ;
   private short nIsMod_466 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3199SolFriTip ;
   private short nBlankRcdCount466 ;
   private short RcdFound466 ;
   private short nBlankRcdUsr466 ;
   private short RcdFound465 ;
   private short nIsDirty_465 ;
   private short nIsDirty_466 ;
   private short ZZ3199SolFriTip ;
   private int wcpOAV48BarCod ;
   private int Z3196SolFriCod ;
   private int Z3202SolFriNum ;
   private int Z3204SolFriCliC ;
   private int Z129BarCod ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_190 ;
   private int nGXsfl_190_idx=1 ;
   private int A129BarCod ;
   private int A652OpeCod ;
   private int AV48BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A3196SolFriCod ;
   private int edtSolFriCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtSolFriMat_Enabled ;
   private int edtSolFriSer_Enabled ;
   private int edtSolFriTip_Enabled ;
   private int edtSolFriDisN_Enabled ;
   private int edtSolFriNom_Enabled ;
   private int A3202SolFriNum ;
   private int edtSolFriNum_Enabled ;
   private int edtSolFriFec_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int A3204SolFriCliC ;
   private int edtSolFriCliC_Enabled ;
   private int edtSolFriCliN_Enabled ;
   private int edtSolFriSol_Enabled ;
   private int edtSolFriAlt_Enabled ;
   private int edtSolFriUlin_Enabled ;
   private int edtSolFriAcS_Enabled ;
   private int edtSolFriAcH_Enabled ;
   private int edtSolFriMaS_Enabled ;
   private int edtSolFriMaH_Enabled ;
   private int edtSolFriNor_Enabled ;
   private int edtSolFriMaq_Enabled ;
   private int edtSolFriRef_Enabled ;
   private int edtSolFriLcs_Enabled ;
   private int edtSolFriLch_Enabled ;
   private int edtSolFriLms_Enabled ;
   private int edtSolFriLmh_Enabled ;
   private int edtSolFriSt_Enabled ;
   private int edtSolFriRqMn_Enabled ;
   private int edtSolFriMtdo_Enabled ;
   private int edtavnRcdDeleted_466_Enabled ;
   private int edtSolFriLin_Enabled ;
   private int edtSolFriObs_Enabled ;
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
   private int defedtSolFriLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSolFriMtdo_Backcolor ;
   private int edtSolFriRqMn_Backcolor ;
   private int edtSolFriSt_Backcolor ;
   private int edtSolFriLmh_Backcolor ;
   private int edtSolFriLms_Backcolor ;
   private int edtSolFriLch_Backcolor ;
   private int edtSolFriLcs_Backcolor ;
   private int edtSolFriRef_Backcolor ;
   private int edtSolFriMaq_Backcolor ;
   private int edtSolFriNor_Backcolor ;
   private int edtSolFriMaH_Backcolor ;
   private int edtSolFriMaS_Backcolor ;
   private int edtSolFriAcH_Backcolor ;
   private int edtSolFriAcS_Backcolor ;
   private int edtSolFriUlin_Backcolor ;
   private int edtSolFriAlt_Backcolor ;
   private int edtSolFriSol_Backcolor ;
   private int edtSolFriCliN_Backcolor ;
   private int edtSolFriCliC_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtSolFriFec_Backcolor ;
   private int edtSolFriNum_Backcolor ;
   private int edtSolFriNom_Backcolor ;
   private int edtSolFriDisN_Backcolor ;
   private int edtSolFriTip_Backcolor ;
   private int edtSolFriSer_Backcolor ;
   private int edtSolFriMat_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtSolFriCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ3196SolFriCod ;
   private int ZZ129BarCod ;
   private int ZZ3202SolFriNum ;
   private int ZZ652OpeCod ;
   private int ZZ3204SolFriCliC ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV50BarCodPar ;
   private String Z396EmprCod ;
   private String Z3197SolFriMat ;
   private String Z3198SolFriSer ;
   private String Z3200SolFriDisN ;
   private String Z3201SolFriNom ;
   private String Z3205SolFriCliN ;
   private String Z3206SolFriSol ;
   private String Z3207SolFriAlt ;
   private String Z3209SolFriAcS ;
   private String Z3210SolFriAcH ;
   private String Z3211SolFriMaS ;
   private String Z3212SolFriMaH ;
   private String Z3213SolFriNor ;
   private String Z3214SolFriMaq ;
   private String Z3215SolFriRef ;
   private String Z11057SolFriLcs ;
   private String Z11058SolFriLch ;
   private String Z11059SolFriLms ;
   private String Z11060SolFriLmh ;
   private String Z11922SolFriRqMn ;
   private String Z11923SolFriMtdo ;
   private String Z130BarCodPar ;
   private String Z3217SolFriObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV50BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSolFriCod_Internalname ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtSolFriCod_Jsonclick ;
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
   private String edtSolFriMat_Internalname ;
   private String A3197SolFriMat ;
   private String edtSolFriMat_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSolFriSer_Internalname ;
   private String A3198SolFriSer ;
   private String edtSolFriSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSolFriTip_Internalname ;
   private String edtSolFriTip_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSolFriDisN_Internalname ;
   private String A3200SolFriDisN ;
   private String edtSolFriDisN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSolFriNom_Internalname ;
   private String A3201SolFriNom ;
   private String edtSolFriNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtSolFriNum_Internalname ;
   private String edtSolFriNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtSolFriFec_Internalname ;
   private String edtSolFriFec_Jsonclick ;
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
   private String edtSolFriCliC_Internalname ;
   private String edtSolFriCliC_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtSolFriCliN_Internalname ;
   private String A3205SolFriCliN ;
   private String edtSolFriCliN_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtSolFriSol_Internalname ;
   private String A3206SolFriSol ;
   private String edtSolFriSol_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtSolFriAlt_Internalname ;
   private String A3207SolFriAlt ;
   private String edtSolFriAlt_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtSolFriUlin_Internalname ;
   private String edtSolFriUlin_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtSolFriAcS_Internalname ;
   private String A3209SolFriAcS ;
   private String edtSolFriAcS_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtSolFriAcH_Internalname ;
   private String A3210SolFriAcH ;
   private String edtSolFriAcH_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtSolFriMaS_Internalname ;
   private String A3211SolFriMaS ;
   private String edtSolFriMaS_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtSolFriMaH_Internalname ;
   private String A3212SolFriMaH ;
   private String edtSolFriMaH_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtSolFriNor_Internalname ;
   private String A3213SolFriNor ;
   private String edtSolFriNor_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtSolFriMaq_Internalname ;
   private String A3214SolFriMaq ;
   private String edtSolFriMaq_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtSolFriRef_Internalname ;
   private String A3215SolFriRef ;
   private String edtSolFriRef_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtSolFriLcs_Internalname ;
   private String A11057SolFriLcs ;
   private String edtSolFriLcs_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtSolFriLch_Internalname ;
   private String A11058SolFriLch ;
   private String edtSolFriLch_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtSolFriLms_Internalname ;
   private String A11059SolFriLms ;
   private String edtSolFriLms_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtSolFriLmh_Internalname ;
   private String A11060SolFriLmh ;
   private String edtSolFriLmh_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtSolFriSt_Internalname ;
   private String edtSolFriSt_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtSolFriRqMn_Internalname ;
   private String A11922SolFriRqMn ;
   private String edtSolFriRqMn_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtSolFriMtdo_Internalname ;
   private String A11923SolFriMtdo ;
   private String edtSolFriMtdo_Jsonclick ;
   private String sMode466 ;
   private String edtavnRcdDeleted_466_Internalname ;
   private String edtSolFriLin_Internalname ;
   private String edtSolFriObs_Internalname ;
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
   private String sMode465 ;
   private String GXCCtl ;
   private String A3217SolFriObs ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String sGXsfl_190_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_466_Jsonclick ;
   private String edtSolFriLin_Jsonclick ;
   private String edtSolFriObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ130BarCodPar ;
   private String ZZ3197SolFriMat ;
   private String ZZ3198SolFriSer ;
   private String ZZ3200SolFriDisN ;
   private String ZZ3201SolFriNom ;
   private String ZZ3205SolFriCliN ;
   private String ZZ3206SolFriSol ;
   private String ZZ3207SolFriAlt ;
   private String ZZ3209SolFriAcS ;
   private String ZZ3210SolFriAcH ;
   private String ZZ3211SolFriMaS ;
   private String ZZ3212SolFriMaH ;
   private String ZZ3213SolFriNor ;
   private String ZZ3214SolFriMaq ;
   private String ZZ3215SolFriRef ;
   private String ZZ11057SolFriLcs ;
   private String ZZ11058SolFriLch ;
   private String ZZ11059SolFriLms ;
   private String ZZ11060SolFriLmh ;
   private String ZZ11922SolFriRqMn ;
   private String ZZ11923SolFriMtdo ;
   private String ZZ653OpeNom ;
   private java.util.Date Z3203SolFriFec ;
   private java.util.Date A3203SolFriFec ;
   private java.util.Date ZZ3203SolFriFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_190_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3197SolFriMat ;
   private boolean n3198SolFriSer ;
   private boolean n3199SolFriTip ;
   private boolean n3200SolFriDisN ;
   private boolean n3201SolFriNom ;
   private boolean n3202SolFriNum ;
   private boolean n3203SolFriFec ;
   private boolean n653OpeNom ;
   private boolean n3204SolFriCliC ;
   private boolean n3205SolFriCliN ;
   private boolean n3206SolFriSol ;
   private boolean n3207SolFriAlt ;
   private boolean n3208SolFriUlin ;
   private boolean n3209SolFriAcS ;
   private boolean n3210SolFriAcH ;
   private boolean n3211SolFriMaS ;
   private boolean n3212SolFriMaH ;
   private boolean n3213SolFriNor ;
   private boolean n3214SolFriMaq ;
   private boolean n3215SolFriRef ;
   private boolean n11057SolFriLcs ;
   private boolean n11058SolFriLch ;
   private boolean n11059SolFriLms ;
   private boolean n11060SolFriLmh ;
   private boolean n11805SolFriSt ;
   private boolean n11922SolFriRqMn ;
   private boolean n11923SolFriMtdo ;
   private boolean Gx_longc ;
   private boolean n3217SolFriObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01IB6_A407EmprNom ;
   private boolean[] T01IB6_n407EmprNom ;
   private int[] T01IB9_A3196SolFriCod ;
   private String[] T01IB9_A407EmprNom ;
   private boolean[] T01IB9_n407EmprNom ;
   private String[] T01IB9_A3197SolFriMat ;
   private boolean[] T01IB9_n3197SolFriMat ;
   private String[] T01IB9_A3198SolFriSer ;
   private boolean[] T01IB9_n3198SolFriSer ;
   private short[] T01IB9_A3199SolFriTip ;
   private boolean[] T01IB9_n3199SolFriTip ;
   private String[] T01IB9_A3200SolFriDisN ;
   private boolean[] T01IB9_n3200SolFriDisN ;
   private String[] T01IB9_A3201SolFriNom ;
   private boolean[] T01IB9_n3201SolFriNom ;
   private int[] T01IB9_A3202SolFriNum ;
   private boolean[] T01IB9_n3202SolFriNum ;
   private java.util.Date[] T01IB9_A3203SolFriFec ;
   private boolean[] T01IB9_n3203SolFriFec ;
   private String[] T01IB9_A653OpeNom ;
   private boolean[] T01IB9_n653OpeNom ;
   private int[] T01IB9_A3204SolFriCliC ;
   private boolean[] T01IB9_n3204SolFriCliC ;
   private String[] T01IB9_A3205SolFriCliN ;
   private boolean[] T01IB9_n3205SolFriCliN ;
   private String[] T01IB9_A3206SolFriSol ;
   private boolean[] T01IB9_n3206SolFriSol ;
   private String[] T01IB9_A3207SolFriAlt ;
   private boolean[] T01IB9_n3207SolFriAlt ;
   private byte[] T01IB9_A3208SolFriUlin ;
   private boolean[] T01IB9_n3208SolFriUlin ;
   private String[] T01IB9_A3209SolFriAcS ;
   private boolean[] T01IB9_n3209SolFriAcS ;
   private String[] T01IB9_A3210SolFriAcH ;
   private boolean[] T01IB9_n3210SolFriAcH ;
   private String[] T01IB9_A3211SolFriMaS ;
   private boolean[] T01IB9_n3211SolFriMaS ;
   private String[] T01IB9_A3212SolFriMaH ;
   private boolean[] T01IB9_n3212SolFriMaH ;
   private String[] T01IB9_A3213SolFriNor ;
   private boolean[] T01IB9_n3213SolFriNor ;
   private String[] T01IB9_A3214SolFriMaq ;
   private boolean[] T01IB9_n3214SolFriMaq ;
   private String[] T01IB9_A3215SolFriRef ;
   private boolean[] T01IB9_n3215SolFriRef ;
   private String[] T01IB9_A11057SolFriLcs ;
   private boolean[] T01IB9_n11057SolFriLcs ;
   private String[] T01IB9_A11058SolFriLch ;
   private boolean[] T01IB9_n11058SolFriLch ;
   private String[] T01IB9_A11059SolFriLms ;
   private boolean[] T01IB9_n11059SolFriLms ;
   private String[] T01IB9_A11060SolFriLmh ;
   private boolean[] T01IB9_n11060SolFriLmh ;
   private byte[] T01IB9_A11805SolFriSt ;
   private boolean[] T01IB9_n11805SolFriSt ;
   private String[] T01IB9_A11922SolFriRqMn ;
   private boolean[] T01IB9_n11922SolFriRqMn ;
   private String[] T01IB9_A11923SolFriMtdo ;
   private boolean[] T01IB9_n11923SolFriMtdo ;
   private String[] T01IB9_A396EmprCod ;
   private int[] T01IB9_A129BarCod ;
   private boolean[] T01IB9_n129BarCod ;
   private byte[] T01IB9_A132BarCodReo ;
   private boolean[] T01IB9_n132BarCodReo ;
   private String[] T01IB9_A130BarCodPar ;
   private boolean[] T01IB9_n130BarCodPar ;
   private int[] T01IB9_A652OpeCod ;
   private boolean[] T01IB9_n652OpeCod ;
   private String[] T01IB7_A396EmprCod ;
   private String[] T01IB8_A653OpeNom ;
   private boolean[] T01IB8_n653OpeNom ;
   private String[] T01IB10_A396EmprCod ;
   private String[] T01IB11_A653OpeNom ;
   private boolean[] T01IB11_n653OpeNom ;
   private String[] T01IB12_A396EmprCod ;
   private int[] T01IB12_A3196SolFriCod ;
   private int[] T01IB5_A3196SolFriCod ;
   private String[] T01IB5_A3197SolFriMat ;
   private boolean[] T01IB5_n3197SolFriMat ;
   private String[] T01IB5_A3198SolFriSer ;
   private boolean[] T01IB5_n3198SolFriSer ;
   private short[] T01IB5_A3199SolFriTip ;
   private boolean[] T01IB5_n3199SolFriTip ;
   private String[] T01IB5_A3200SolFriDisN ;
   private boolean[] T01IB5_n3200SolFriDisN ;
   private String[] T01IB5_A3201SolFriNom ;
   private boolean[] T01IB5_n3201SolFriNom ;
   private int[] T01IB5_A3202SolFriNum ;
   private boolean[] T01IB5_n3202SolFriNum ;
   private java.util.Date[] T01IB5_A3203SolFriFec ;
   private boolean[] T01IB5_n3203SolFriFec ;
   private int[] T01IB5_A3204SolFriCliC ;
   private boolean[] T01IB5_n3204SolFriCliC ;
   private String[] T01IB5_A3205SolFriCliN ;
   private boolean[] T01IB5_n3205SolFriCliN ;
   private String[] T01IB5_A3206SolFriSol ;
   private boolean[] T01IB5_n3206SolFriSol ;
   private String[] T01IB5_A3207SolFriAlt ;
   private boolean[] T01IB5_n3207SolFriAlt ;
   private byte[] T01IB5_A3208SolFriUlin ;
   private boolean[] T01IB5_n3208SolFriUlin ;
   private String[] T01IB5_A3209SolFriAcS ;
   private boolean[] T01IB5_n3209SolFriAcS ;
   private String[] T01IB5_A3210SolFriAcH ;
   private boolean[] T01IB5_n3210SolFriAcH ;
   private String[] T01IB5_A3211SolFriMaS ;
   private boolean[] T01IB5_n3211SolFriMaS ;
   private String[] T01IB5_A3212SolFriMaH ;
   private boolean[] T01IB5_n3212SolFriMaH ;
   private String[] T01IB5_A3213SolFriNor ;
   private boolean[] T01IB5_n3213SolFriNor ;
   private String[] T01IB5_A3214SolFriMaq ;
   private boolean[] T01IB5_n3214SolFriMaq ;
   private String[] T01IB5_A3215SolFriRef ;
   private boolean[] T01IB5_n3215SolFriRef ;
   private String[] T01IB5_A11057SolFriLcs ;
   private boolean[] T01IB5_n11057SolFriLcs ;
   private String[] T01IB5_A11058SolFriLch ;
   private boolean[] T01IB5_n11058SolFriLch ;
   private String[] T01IB5_A11059SolFriLms ;
   private boolean[] T01IB5_n11059SolFriLms ;
   private String[] T01IB5_A11060SolFriLmh ;
   private boolean[] T01IB5_n11060SolFriLmh ;
   private byte[] T01IB5_A11805SolFriSt ;
   private boolean[] T01IB5_n11805SolFriSt ;
   private String[] T01IB5_A11922SolFriRqMn ;
   private boolean[] T01IB5_n11922SolFriRqMn ;
   private String[] T01IB5_A11923SolFriMtdo ;
   private boolean[] T01IB5_n11923SolFriMtdo ;
   private String[] T01IB5_A396EmprCod ;
   private int[] T01IB5_A129BarCod ;
   private boolean[] T01IB5_n129BarCod ;
   private byte[] T01IB5_A132BarCodReo ;
   private boolean[] T01IB5_n132BarCodReo ;
   private String[] T01IB5_A130BarCodPar ;
   private boolean[] T01IB5_n130BarCodPar ;
   private int[] T01IB5_A652OpeCod ;
   private boolean[] T01IB5_n652OpeCod ;
   private String[] T01IB13_A396EmprCod ;
   private int[] T01IB13_A3196SolFriCod ;
   private String[] T01IB14_A396EmprCod ;
   private int[] T01IB14_A3196SolFriCod ;
   private int[] T01IB4_A3196SolFriCod ;
   private String[] T01IB4_A3197SolFriMat ;
   private boolean[] T01IB4_n3197SolFriMat ;
   private String[] T01IB4_A3198SolFriSer ;
   private boolean[] T01IB4_n3198SolFriSer ;
   private short[] T01IB4_A3199SolFriTip ;
   private boolean[] T01IB4_n3199SolFriTip ;
   private String[] T01IB4_A3200SolFriDisN ;
   private boolean[] T01IB4_n3200SolFriDisN ;
   private String[] T01IB4_A3201SolFriNom ;
   private boolean[] T01IB4_n3201SolFriNom ;
   private int[] T01IB4_A3202SolFriNum ;
   private boolean[] T01IB4_n3202SolFriNum ;
   private java.util.Date[] T01IB4_A3203SolFriFec ;
   private boolean[] T01IB4_n3203SolFriFec ;
   private int[] T01IB4_A3204SolFriCliC ;
   private boolean[] T01IB4_n3204SolFriCliC ;
   private String[] T01IB4_A3205SolFriCliN ;
   private boolean[] T01IB4_n3205SolFriCliN ;
   private String[] T01IB4_A3206SolFriSol ;
   private boolean[] T01IB4_n3206SolFriSol ;
   private String[] T01IB4_A3207SolFriAlt ;
   private boolean[] T01IB4_n3207SolFriAlt ;
   private byte[] T01IB4_A3208SolFriUlin ;
   private boolean[] T01IB4_n3208SolFriUlin ;
   private String[] T01IB4_A3209SolFriAcS ;
   private boolean[] T01IB4_n3209SolFriAcS ;
   private String[] T01IB4_A3210SolFriAcH ;
   private boolean[] T01IB4_n3210SolFriAcH ;
   private String[] T01IB4_A3211SolFriMaS ;
   private boolean[] T01IB4_n3211SolFriMaS ;
   private String[] T01IB4_A3212SolFriMaH ;
   private boolean[] T01IB4_n3212SolFriMaH ;
   private String[] T01IB4_A3213SolFriNor ;
   private boolean[] T01IB4_n3213SolFriNor ;
   private String[] T01IB4_A3214SolFriMaq ;
   private boolean[] T01IB4_n3214SolFriMaq ;
   private String[] T01IB4_A3215SolFriRef ;
   private boolean[] T01IB4_n3215SolFriRef ;
   private String[] T01IB4_A11057SolFriLcs ;
   private boolean[] T01IB4_n11057SolFriLcs ;
   private String[] T01IB4_A11058SolFriLch ;
   private boolean[] T01IB4_n11058SolFriLch ;
   private String[] T01IB4_A11059SolFriLms ;
   private boolean[] T01IB4_n11059SolFriLms ;
   private String[] T01IB4_A11060SolFriLmh ;
   private boolean[] T01IB4_n11060SolFriLmh ;
   private byte[] T01IB4_A11805SolFriSt ;
   private boolean[] T01IB4_n11805SolFriSt ;
   private String[] T01IB4_A11922SolFriRqMn ;
   private boolean[] T01IB4_n11922SolFriRqMn ;
   private String[] T01IB4_A11923SolFriMtdo ;
   private boolean[] T01IB4_n11923SolFriMtdo ;
   private String[] T01IB4_A396EmprCod ;
   private int[] T01IB4_A129BarCod ;
   private boolean[] T01IB4_n129BarCod ;
   private byte[] T01IB4_A132BarCodReo ;
   private boolean[] T01IB4_n132BarCodReo ;
   private String[] T01IB4_A130BarCodPar ;
   private boolean[] T01IB4_n130BarCodPar ;
   private int[] T01IB4_A652OpeCod ;
   private boolean[] T01IB4_n652OpeCod ;
   private String[] T01IB18_A653OpeNom ;
   private boolean[] T01IB18_n653OpeNom ;
   private String[] T01IB19_A396EmprCod ;
   private int[] T01IB19_A3196SolFriCod ;
   private int[] T01IB20_A3196SolFriCod ;
   private byte[] T01IB20_A3216SolFriLin ;
   private String[] T01IB20_A3217SolFriObs ;
   private boolean[] T01IB20_n3217SolFriObs ;
   private String[] T01IB20_A396EmprCod ;
   private String[] T01IB21_A396EmprCod ;
   private int[] T01IB21_A3196SolFriCod ;
   private byte[] T01IB21_A3216SolFriLin ;
   private int[] T01IB3_A3196SolFriCod ;
   private byte[] T01IB3_A3216SolFriLin ;
   private String[] T01IB3_A3217SolFriObs ;
   private boolean[] T01IB3_n3217SolFriObs ;
   private String[] T01IB3_A396EmprCod ;
   private int[] T01IB2_A3196SolFriCod ;
   private byte[] T01IB2_A3216SolFriLin ;
   private String[] T01IB2_A3217SolFriObs ;
   private boolean[] T01IB2_n3217SolFriObs ;
   private String[] T01IB2_A396EmprCod ;
   private String[] T01IB25_A396EmprCod ;
   private int[] T01IB25_A3196SolFriCod ;
   private byte[] T01IB25_A3216SolFriLin ;
   private String[] T01IB26_A407EmprNom ;
   private boolean[] T01IB26_n407EmprNom ;
   private String[] T01IB27_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpsolfri__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolfri__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolfri__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolfri__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpsolfri__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IB2", "SELECT SolFriCod, SolFriLin, SolFriObs, EmprCod FROM TXPLFRICC WHERE EmprCod = ? AND SolFriCod = ? AND SolFriLin = ?  FOR UPDATE OF SolFriObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB3", "SELECT SolFriCod, SolFriLin, SolFriObs, EmprCod FROM TXPLFRICC WHERE EmprCod = ? AND SolFriCod = ? AND SolFriLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB4", "SELECT SolFriCod, SolFriMat, SolFriSer, SolFriTip, SolFriDisN, SolFriNom, SolFriNum, SolFriFec, SolFriCliC, SolFriCliN, SolFriSol, SolFriAlt, SolFriUlin, SolFriAcS, SolFriAcH, SolFriMaS, SolFriMaH, SolFriNor, SolFriMaq, SolFriRef, SolFriLcs, SolFriLch, SolFriLms, SolFriLmh, SolFriSt, SolFriRqMn, SolFriMtdo, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCFRICC WHERE EmprCod = ? AND SolFriCod = ?  FOR UPDATE OF SolFriMat, SolFriSer, SolFriTip, SolFriDisN, SolFriNom, SolFriNum, SolFriFec, SolFriCliC, SolFriCliN, SolFriSol, SolFriAlt, SolFriUlin, SolFriAcS, SolFriAcH, SolFriMaS, SolFriMaH, SolFriNor, SolFriMaq, SolFriRef, SolFriLcs, SolFriLch, SolFriLms, SolFriLmh, SolFriSt, SolFriRqMn, SolFriMtdo, BarCod, BarCodReo, BarCodPar, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB5", "SELECT SolFriCod, SolFriMat, SolFriSer, SolFriTip, SolFriDisN, SolFriNom, SolFriNum, SolFriFec, SolFriCliC, SolFriCliN, SolFriSol, SolFriAlt, SolFriUlin, SolFriAcS, SolFriAcH, SolFriMaS, SolFriMaH, SolFriNor, SolFriMaq, SolFriRef, SolFriLcs, SolFriLch, SolFriLms, SolFriLmh, SolFriSt, SolFriRqMn, SolFriMtdo, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCFRICC WHERE EmprCod = ? AND SolFriCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB8", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB9", "SELECT /*+ FIRST_ROWS(100) */ TM1.SolFriCod, T2.EmprNom, TM1.SolFriMat, TM1.SolFriSer, TM1.SolFriTip, TM1.SolFriDisN, TM1.SolFriNom, TM1.SolFriNum, TM1.SolFriFec, T3.OpeNom, TM1.SolFriCliC, TM1.SolFriCliN, TM1.SolFriSol, TM1.SolFriAlt, TM1.SolFriUlin, TM1.SolFriAcS, TM1.SolFriAcH, TM1.SolFriMaS, TM1.SolFriMaH, TM1.SolFriNor, TM1.SolFriMaq, TM1.SolFriRef, TM1.SolFriLcs, TM1.SolFriLch, TM1.SolFriLms, TM1.SolFriLmh, TM1.SolFriSt, TM1.SolFriRqMn, TM1.SolFriMtdo, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.OpeCod FROM ((TXPCFRICC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.SolFriCod = ? ORDER BY TM1.EmprCod, TM1.SolFriCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB10", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB11", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND SolFriCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolFriCod FROM TXPCFRICC WHERE ( SolFriCod > ?) and EmprCod = ? ORDER BY EmprCod, SolFriCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IB14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SolFriCod FROM TXPCFRICC WHERE ( SolFriCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, SolFriCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IB15", "INSERT INTO TXPCFRICC(SolFriCod, SolFriMat, SolFriSer, SolFriTip, SolFriDisN, SolFriNom, SolFriNum, SolFriFec, SolFriCliC, SolFriCliN, SolFriSol, SolFriAlt, SolFriUlin, SolFriAcS, SolFriAcH, SolFriMaS, SolFriMaH, SolFriNor, SolFriMaq, SolFriRef, SolFriLcs, SolFriLch, SolFriLms, SolFriLmh, SolFriSt, SolFriRqMn, SolFriMtdo, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCFRICC")
         ,new UpdateCursor("T01IB16", "UPDATE TXPCFRICC SET SolFriMat=?, SolFriSer=?, SolFriTip=?, SolFriDisN=?, SolFriNom=?, SolFriNum=?, SolFriFec=?, SolFriCliC=?, SolFriCliN=?, SolFriSol=?, SolFriAlt=?, SolFriUlin=?, SolFriAcS=?, SolFriAcH=?, SolFriMaS=?, SolFriMaH=?, SolFriNor=?, SolFriMaq=?, SolFriRef=?, SolFriLcs=?, SolFriLch=?, SolFriLms=?, SolFriLmh=?, SolFriSt=?, SolFriRqMn=?, SolFriMtdo=?, BarCod=?, BarCodReo=?, BarCodPar=?, OpeCod=?  WHERE EmprCod = ? AND SolFriCod = ?", GX_NOMASK, "TXPCFRICC")
         ,new UpdateCursor("T01IB17", "DELETE FROM TXPCFRICC  WHERE EmprCod = ? AND SolFriCod = ?", GX_NOMASK, "TXPCFRICC")
         ,new ForEachCursor("T01IB18", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? ORDER BY EmprCod, SolFriCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB20", "SELECT SolFriCod, SolFriLin, SolFriObs, EmprCod FROM TXPLFRICC WHERE EmprCod = ? and SolFriCod = ? and SolFriLin = ? ORDER BY EmprCod, SolFriCod, SolFriLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB21", "SELECT EmprCod, SolFriCod, SolFriLin FROM TXPLFRICC WHERE EmprCod = ? AND SolFriCod = ? AND SolFriLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01IB22", "INSERT INTO TXPLFRICC(SolFriCod, SolFriLin, SolFriObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLFRICC")
         ,new UpdateCursor("T01IB23", "UPDATE TXPLFRICC SET SolFriObs=?  WHERE EmprCod = ? AND SolFriCod = ? AND SolFriLin = ?", GX_NOMASK, "TXPLFRICC")
         ,new UpdateCursor("T01IB24", "DELETE FROM TXPLFRICC  WHERE EmprCod = ? AND SolFriCod = ? AND SolFriLin = ?", GX_NOMASK, "TXPLFRICC")
         ,new ForEachCursor("T01IB25", "SELECT EmprCod, SolFriCod, SolFriLin FROM TXPLFRICC WHERE EmprCod = ? and SolFriCod = ? ORDER BY EmprCod, SolFriCod, SolFriLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IB27", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 15);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 3);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 3);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 10);
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
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 15);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 3);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 3);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 10);
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
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 15);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 3);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 3);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 10);
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
                  stmt.setString(11, (String)parms[20], 30);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 4);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[24]).byteValue());
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
                  stmt.setString(18, (String)parms[34], 20);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 6);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 15);
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
                  stmt.setString(23, (String)parms[44], 3);
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
                  stmt.setString(26, (String)parms[50], 10);
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
                  stmt.setString(10, (String)parms[19], 30);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 4);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
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
                  stmt.setString(17, (String)parms[33], 20);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 6);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 15);
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
                  stmt.setString(22, (String)parms[43], 3);
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
                  stmt.setString(25, (String)parms[49], 10);
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

