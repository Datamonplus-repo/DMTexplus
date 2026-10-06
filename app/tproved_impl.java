package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproved_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A497FpgCod = httpContext.GetPar( "FpgCod") ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A497FpgCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9728Cod_Clas = (short)(GXutil.lval( httpContext.GetPar( "Cod_Clas"))) ;
         n9728Cod_Clas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A9728Cod_Clas) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10122GpoEcoCod = (int)(GXutil.lval( httpContext.GetPar( "GpoEcoCod"))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A10122GpoEcoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A3143PrvDivCo = (byte)(GXutil.lval( httpContext.GetPar( "PrvDivCo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A3143PrvDivCo) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PROVEEDORES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tproved_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tproved_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproved_impl.class ));
   }

   public tproved_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPrvPri = UIFactory.getCheckbox(this);
      cmbPrvTip = new HTMLChoice();
      cmbPrvMetTra = new HTMLChoice();
      cmbPrvDivCod = new HTMLChoice();
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
      A800PrvPri = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      if ( cmbPrvTip.getItemCount() > 0 )
      {
         A802PrvTip = cmbPrvTip.getValidValue(A802PrvTip) ;
         n802PrvTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Values", cmbPrvTip.ToJavascriptSource(), true);
      }
      if ( cmbPrvMetTra.getItemCount() > 0 )
      {
         A792PrvMetTra = cmbPrvMetTra.getValidValue(A792PrvMetTra) ;
         n792PrvMetTra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), true);
      }
      if ( cmbPrvDivCod.getItemCount() > 0 )
      {
         A3092PrvDivCod = cmbPrvDivCod.getValidValue(A3092PrvDivCod) ;
         n3092PrvDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Values", cmbPrvDivCod.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPROVED.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "ProveedorID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Direccion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDir_Internalname, GXutil.rtrim( A786PrvDir), GXutil.rtrim( localUtil.format( A786PrvDir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDir_Jsonclick, 0, "", "", "", "", "", 1, edtPrvDir_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Postal", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCpo_Internalname, GXutil.rtrim( A782PrvCpo), GXutil.rtrim( localUtil.format( A782PrvCpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCpo_Jsonclick, 0, "", "", "", "", "", 1, edtPrvCpo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Poblacion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPob_Internalname, GXutil.rtrim( A799PrvPob), GXutil.rtrim( localUtil.format( A799PrvPob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPob_Jsonclick, 0, "", "", "", "", "", 1, edtPrvPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N.I.F.", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNif_Internalname, GXutil.rtrim( A793PrvNif), GXutil.rtrim( localUtil.format( A793PrvNif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNif_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Telefonos", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvTlf_Internalname, GXutil.rtrim( A803PrvTlf), GXutil.rtrim( localUtil.format( A803PrvTlf, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvTlf_Jsonclick, 0, "", "", "", "", "", 1, edtPrvTlf_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Prioridad", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrvPri.getInternalname(), GXutil.str( A800PrvPri, 1, 0), "", "", 1, chkPrvPri.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(66, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Telex", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvTlx_Internalname, GXutil.rtrim( A804PrvTlx), GXutil.rtrim( localUtil.format( A804PrvTlx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvTlx_Jsonclick, 0, "", "", "", "", "", 1, edtPrvTlx_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvTip, cmbPrvTip.getInternalname(), GXutil.rtrim( A802PrvTip), 1, cmbPrvTip.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvTip.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, (byte)(0), "HLP_TPROVED.htm");
      cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Values", cmbPrvTip.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Forma de Pago", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFpgCod_Internalname, GXutil.rtrim( A497FpgCod), GXutil.rtrim( localUtil.format( A497FpgCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFpgCod_Jsonclick, 0, "", "", "", "", "", 1, edtFpgCod_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Codigo Forma de Pago", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFpgDsc_Internalname, GXutil.rtrim( A498FpgDsc), GXutil.rtrim( localUtil.format( A498FpgDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFpgDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFpgDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "No.Vencimientos", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvVto_Internalname, GXutil.ltrim( localUtil.ntoc( A805PrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvVto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvVto_Jsonclick, 0, "", "", "", "", "", 1, edtPrvVto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Dias de Pago", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDiaPag_Internalname, GXutil.ltrim( localUtil.ntoc( A785PrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvDiaPag_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDiaPag_Jsonclick, 0, "", "", "", "", "", 1, edtPrvDiaPag_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Periodicidad", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPer_Internalname, GXutil.ltrim( localUtil.ntoc( A797PrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvPer_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPer_Jsonclick, 0, "", "", "", "", "", 1, edtPrvPer_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Codigo Banco", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvBan_Internalname, GXutil.ltrim( localUtil.ntoc( A780PrvBan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvBan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvBan_Jsonclick, 0, "", "", "", "", "", 1, edtPrvBan_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Representante", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvRep_Internalname, GXutil.rtrim( A801PrvRep), GXutil.rtrim( localUtil.format( A801PrvRep, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvRep_Jsonclick, 0, "", "", "", "", "", 1, edtPrvRep_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Dias Plazo Entrega", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPlaEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A798PrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvPlaEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPlaEnt_Jsonclick, 0, "", "", "", "", "", 1, edtPrvPlaEnt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Metodo Transporte", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvMetTra, cmbPrvMetTra.getInternalname(), GXutil.rtrim( A792PrvMetTra), 1, cmbPrvMetTra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvMetTra.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "", true, (byte)(0), "HLP_TPROVED.htm");
      cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Cuenta Contable", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCta_Internalname, GXutil.rtrim( A783PrvCta), GXutil.rtrim( localUtil.format( A783PrvCta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCta_Jsonclick, 0, "", "", "", "", "", 1, edtPrvCta_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Divisa Traspaso Contable", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvDivCod, cmbPrvDivCod.getInternalname(), GXutil.rtrim( A3092PrvDivCod), 1, cmbPrvDivCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvDivCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "", true, (byte)(0), "HLP_TPROVED.htm");
      cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Values", cmbPrvDivCod.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Divisa", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDivCo_Internalname, GXutil.ltrim( localUtil.ntoc( A3143PrvDivCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvDivCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3143PrvDivCo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3143PrvDivCo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDivCo_Jsonclick, 0, "", "", "", "", "", 1, edtPrvDivCo_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Abreviatura", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDivAbr_Internalname, GXutil.rtrim( A3144PrvDivAbr), GXutil.rtrim( localUtil.format( A3144PrvDivAbr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDivAbr_Jsonclick, 0, "", "", "", "", "", 1, edtPrvDivAbr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Carta", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCar_Internalname, GXutil.rtrim( A3314PrvCar), GXutil.rtrim( localUtil.format( A3314PrvCar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCar_Jsonclick, 0, "", "", "", "", "", 1, edtPrvCar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Codigo Postal ampliado", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCp2_Internalname, GXutil.rtrim( A6075PrvCp2), GXutil.rtrim( localUtil.format( A6075PrvCp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCp2_Jsonclick, 0, "", "", "", "", "", 1, edtPrvCp2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Fax", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvFax_Internalname, GXutil.rtrim( A6076PrvFax), GXutil.rtrim( localUtil.format( A6076PrvFax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvFax_Jsonclick, 0, "", "", "", "", "", 1, edtPrvFax_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Mail", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvMail_Internalname, GXutil.rtrim( A6077PrvMail), GXutil.rtrim( localUtil.format( A6077PrvMail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvMail_Jsonclick, 0, "", "", "", "", "", 1, edtPrvMail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Nombre 2", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom2_Internalname, GXutil.rtrim( A6570PrvNom2), GXutil.rtrim( localUtil.format( A6570PrvNom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom2_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNom2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Direccion 2", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDir2_Internalname, GXutil.rtrim( A6571PrvDir2), GXutil.rtrim( localUtil.format( A6571PrvDir2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDir2_Jsonclick, 0, "", "", "", "", "", 1, edtPrvDir2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Contacto", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPrvContac_Internalname, A6572PrvContac, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", (short)(0), 1, edtPrvContac_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Dto.PP Proveedor", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDtoPP_Internalname, GXutil.ltrim( localUtil.ntoc( A8160PrvDtoPP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvDtoPP_Enabled!=0) ? localUtil.format( A8160PrvDtoPP, "ZZ9.99") : localUtil.format( A8160PrvDtoPP, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDtoPP_Jsonclick, 0, "", "", "", "", "", 1, edtPrvDtoPP_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCod_Clas_Internalname, GXutil.ltrim( localUtil.ntoc( A9728Cod_Clas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCod_Clas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9728Cod_Clas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9728Cod_Clas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCod_Clas_Jsonclick, 0, "", "", "", "", "", 1, edtCod_Clas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDes_Clas_Internalname, GXutil.rtrim( A9729Des_Clas), GXutil.rtrim( localUtil.format( A9729Des_Clas, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDes_Clas_Jsonclick, 0, "", "", "", "", "", 1, edtDes_Clas_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Cod. de Grupo Economico", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGpoEcoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGpoEcoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10122GpoEcoCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10122GpoEcoCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGpoEcoCod_Jsonclick, 0, "", "", "", "", "", edtGpoEcoCod_Visible, edtGpoEcoCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Nombre del Grupo Económico", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGpoEcoNom_Internalname, A10123GpoEcoNom, GXutil.rtrim( localUtil.format( A10123GpoEcoNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGpoEcoNom_Jsonclick, 0, "", "", "", "", "", edtGpoEcoNom_Visible, edtGpoEcoNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Dias Pago Alfanumerico", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDiaPgA_Internalname, GXutil.rtrim( A10477PrvDiaPgA), GXutil.rtrim( localUtil.format( A10477PrvDiaPgA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDiaPgA_Jsonclick, 0, "", "", "", "", "", 1, edtPrvDiaPgA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROVED.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 212,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROVED.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPROVED.htm");
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
      e1118A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z794PrvNom = httpContext.cgiGet( "Z794PrvNom") ;
            Z786PrvDir = httpContext.cgiGet( "Z786PrvDir") ;
            Z782PrvCpo = httpContext.cgiGet( "Z782PrvCpo") ;
            Z799PrvPob = httpContext.cgiGet( "Z799PrvPob") ;
            Z793PrvNif = httpContext.cgiGet( "Z793PrvNif") ;
            Z803PrvTlf = httpContext.cgiGet( "Z803PrvTlf") ;
            Z800PrvPri = (byte)(localUtil.ctol( httpContext.cgiGet( "Z800PrvPri"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z804PrvTlx = httpContext.cgiGet( "Z804PrvTlx") ;
            Z802PrvTip = httpContext.cgiGet( "Z802PrvTip") ;
            Z805PrvVto = (byte)(localUtil.ctol( httpContext.cgiGet( "Z805PrvVto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z785PrvDiaPag = (int)(localUtil.ctol( httpContext.cgiGet( "Z785PrvDiaPag"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z797PrvPer = (int)(localUtil.ctol( httpContext.cgiGet( "Z797PrvPer"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z780PrvBan = (int)(localUtil.ctol( httpContext.cgiGet( "Z780PrvBan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z801PrvRep = httpContext.cgiGet( "Z801PrvRep") ;
            Z798PrvPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z798PrvPlaEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z792PrvMetTra = httpContext.cgiGet( "Z792PrvMetTra") ;
            Z783PrvCta = httpContext.cgiGet( "Z783PrvCta") ;
            Z3092PrvDivCod = httpContext.cgiGet( "Z3092PrvDivCod") ;
            Z3314PrvCar = httpContext.cgiGet( "Z3314PrvCar") ;
            Z6075PrvCp2 = httpContext.cgiGet( "Z6075PrvCp2") ;
            Z6076PrvFax = httpContext.cgiGet( "Z6076PrvFax") ;
            Z6077PrvMail = httpContext.cgiGet( "Z6077PrvMail") ;
            Z6570PrvNom2 = httpContext.cgiGet( "Z6570PrvNom2") ;
            Z6571PrvDir2 = httpContext.cgiGet( "Z6571PrvDir2") ;
            Z8160PrvDtoPP = localUtil.ctond( httpContext.cgiGet( "Z8160PrvDtoPP")) ;
            Z10477PrvDiaPgA = httpContext.cgiGet( "Z10477PrvDiaPgA") ;
            Z497FpgCod = httpContext.cgiGet( "Z497FpgCod") ;
            Z9728Cod_Clas = (short)(localUtil.ctol( httpContext.cgiGet( "Z9728Cod_Clas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10122GpoEcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            Z3143PrvDivCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3143PrvDivCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV51Modo = httpContext.cgiGet( "MODO") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV51Modo = httpContext.cgiGet( "vMODO") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A795PrvNum = 0 ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            else
            {
               A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
            n794PrvNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A786PrvDir = httpContext.cgiGet( edtPrvDir_Internalname) ;
            n786PrvDir = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
            A782PrvCpo = httpContext.cgiGet( edtPrvCpo_Internalname) ;
            n782PrvCpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", A782PrvCpo);
            A799PrvPob = httpContext.cgiGet( edtPrvPob_Internalname) ;
            n799PrvPob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
            A793PrvNif = httpContext.cgiGet( edtPrvNif_Internalname) ;
            n793PrvNif = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", A793PrvNif);
            A803PrvTlf = httpContext.cgiGet( edtPrvTlf_Internalname) ;
            n803PrvTlf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrvPri.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrvPri.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVPRI");
               AnyError = (short)(1) ;
               GX_FocusControl = chkPrvPri.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A800PrvPri = (byte)(0) ;
               n800PrvPri = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
            }
            else
            {
               A800PrvPri = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrvPri.getInternalname()), "1")==0) ? 1 : 0)) ;
               n800PrvPri = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
            }
            A804PrvTlx = httpContext.cgiGet( edtPrvTlx_Internalname) ;
            n804PrvTlx = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
            cmbPrvTip.setValue( httpContext.cgiGet( cmbPrvTip.getInternalname()) );
            A802PrvTip = httpContext.cgiGet( cmbPrvTip.getInternalname()) ;
            n802PrvTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
            A497FpgCod = GXutil.upper( httpContext.cgiGet( edtFpgCod_Internalname)) ;
            n497FpgCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
            A498FpgDsc = httpContext.cgiGet( edtFpgDsc_Internalname) ;
            n498FpgDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVVTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvVto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A805PrvVto = (byte)(0) ;
               n805PrvVto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
            }
            else
            {
               A805PrvVto = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n805PrvVto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVDIAPAG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvDiaPag_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A785PrvDiaPag = 0 ;
               n785PrvDiaPag = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
            }
            else
            {
               A785PrvDiaPag = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n785PrvDiaPag = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVPER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvPer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A797PrvPer = 0 ;
               n797PrvPer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
            }
            else
            {
               A797PrvPer = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n797PrvPer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVBAN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvBan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A780PrvBan = 0 ;
               n780PrvBan = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
            }
            else
            {
               A780PrvBan = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n780PrvBan = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
            }
            A801PrvRep = httpContext.cgiGet( edtPrvRep_Internalname) ;
            n801PrvRep = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", A801PrvRep);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVPLAENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvPlaEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A798PrvPlaEnt = (short)(0) ;
               n798PrvPlaEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
            }
            else
            {
               A798PrvPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n798PrvPlaEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
            }
            cmbPrvMetTra.setValue( httpContext.cgiGet( cmbPrvMetTra.getInternalname()) );
            A792PrvMetTra = httpContext.cgiGet( cmbPrvMetTra.getInternalname()) ;
            n792PrvMetTra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
            A783PrvCta = httpContext.cgiGet( edtPrvCta_Internalname) ;
            n783PrvCta = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", A783PrvCta);
            cmbPrvDivCod.setValue( httpContext.cgiGet( cmbPrvDivCod.getInternalname()) );
            A3092PrvDivCod = httpContext.cgiGet( cmbPrvDivCod.getInternalname()) ;
            n3092PrvDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvDivCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvDivCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVDIVCO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvDivCo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3143PrvDivCo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
            }
            else
            {
               A3143PrvDivCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrvDivCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
            }
            A3144PrvDivAbr = httpContext.cgiGet( edtPrvDivAbr_Internalname) ;
            n3144PrvDivAbr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", A3144PrvDivAbr);
            A3314PrvCar = httpContext.cgiGet( edtPrvCar_Internalname) ;
            n3314PrvCar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
            A6075PrvCp2 = httpContext.cgiGet( edtPrvCp2_Internalname) ;
            n6075PrvCp2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", A6075PrvCp2);
            A6076PrvFax = httpContext.cgiGet( edtPrvFax_Internalname) ;
            n6076PrvFax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", A6076PrvFax);
            A6077PrvMail = httpContext.cgiGet( edtPrvMail_Internalname) ;
            n6077PrvMail = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", A6077PrvMail);
            A6570PrvNom2 = httpContext.cgiGet( edtPrvNom2_Internalname) ;
            n6570PrvNom2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", A6570PrvNom2);
            A6571PrvDir2 = httpContext.cgiGet( edtPrvDir2_Internalname) ;
            n6571PrvDir2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", A6571PrvDir2);
            A6572PrvContac = httpContext.cgiGet( edtPrvContac_Internalname) ;
            n6572PrvContac = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrvDtoPP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrvDtoPP_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVDTOPP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvDtoPP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8160PrvDtoPP = DecimalUtil.ZERO ;
               n8160PrvDtoPP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
            }
            else
            {
               A8160PrvDtoPP = localUtil.ctond( httpContext.cgiGet( edtPrvDtoPP_Internalname)) ;
               n8160PrvDtoPP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCod_Clas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCod_Clas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COD_CLAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCod_Clas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9728Cod_Clas = (short)(0) ;
               n9728Cod_Clas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
            }
            else
            {
               A9728Cod_Clas = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_Clas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9728Cod_Clas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
            }
            A9729Des_Clas = httpContext.cgiGet( edtDes_Clas_Internalname) ;
            n9729Des_Clas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", A9729Des_Clas);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGpoEcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGpoEcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GPOECOCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGpoEcoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10122GpoEcoCod = 0 ;
               n10122GpoEcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
            }
            else
            {
               A10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGpoEcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10122GpoEcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
            }
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            A10123GpoEcoNom = httpContext.cgiGet( edtGpoEcoNom_Internalname) ;
            n10123GpoEcoNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
            A10477PrvDiaPgA = httpContext.cgiGet( edtPrvDiaPgA_Internalname) ;
            n10477PrvDiaPgA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10477PrvDiaPgA", A10477PrvDiaPgA);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPROVED");
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV51Modo, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A795PrvNum != Z795PrvNum ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tproved:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
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
                        e1118A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1218A2 ();
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
         /* Execute user event: After Trn */
         e1218A2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll18A94( ) ;
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
      disableAttributes18A94( ) ;
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

   public void confirm_18A0( )
   {
      beforeValidate18A94( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18A94( ) ;
         }
         else
         {
            checkExtendedTable18A94( ) ;
            if ( AnyError == 0 )
            {
               zm18A94( 12) ;
               zm18A94( 13) ;
               zm18A94( 14) ;
               zm18A94( 15) ;
               zm18A94( 16) ;
            }
            closeExtendedTableCursors18A94( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues18A0( ) ;
      }
   }

   public void resetCaption18A0( )
   {
   }

   public void e1118A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char1 = AV20Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1237_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit1", AV20Lit1);
      GXt_char1 = AV21Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit2", AV21Lit2);
      GXt_char1 = AV22Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN175_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      GXt_char1 = AV23Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1486_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      GXt_char1 = AV24Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1485_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      GXt_char1 = AV25Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1311_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit6", AV25Lit6);
      GXt_char1 = AV26Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1275_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit7", AV26Lit7);
      GXt_char1 = AV27Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1367_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit8", AV27Lit8);
      GXt_char1 = AV28Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1493_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit9", AV28Lit9);
      GXt_char1 = AV29Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN458_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit10", AV29Lit10);
      GXt_char1 = AV30Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit11", AV30Lit11);
      GXt_char1 = AV31Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1181_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit12", AV31Lit12);
      GXt_char1 = AV32Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1276_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit13", AV32Lit13);
      GXt_char1 = AV33Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1030_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit14", AV33Lit14);
      GXt_char1 = AV34Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1352_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit15", AV34Lit15);
      GXt_char1 = AV35Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1093_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit16", AV35Lit16);
      GXt_char1 = AV36Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1520_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit17", AV36Lit17);
      GXt_char1 = AV37Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1304_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit18", AV37Lit18);
      GXt_char1 = AV38Lit19 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1309_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit19 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit19", AV38Lit19);
      GXt_char1 = AV39Lit20 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1251_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit20 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Lit20", AV39Lit20);
      GXt_char1 = AV40Lit21 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1002_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit21 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit21", AV40Lit21);
      GXt_char1 = AV42Lit22 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3001_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Lit22 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Lit22", AV42Lit22);
      GXt_char1 = AV43Lit23 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2011_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Lit23 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lit23", AV43Lit23);
      GXt_char1 = AV44Lit24 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2012_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Lit24 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lit24", AV44Lit24);
      GXt_char1 = AV54Lit25 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1105_ ", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Lit25 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Lit25", AV54Lit25);
      GXt_char1 = AV41LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41LitFe", AV41LitFe);
      GXt_char1 = AV52Lit48 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3027_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52Lit48 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Lit48", AV52Lit48);
      GXt_char1 = AV53Lit49 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1493_", ""), (byte)(99), GXv_char2) ;
      tproved_impl.this.GXt_char1 = GXv_char2[0] ;
      AV53Lit49 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Lit49", AV53Lit49);
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tproved_impl.this.A396EmprCod = GXv_char2[0] ;
      tproved_impl.this.AV16EmprNom = GXv_char3[0] ;
      tproved_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      AV45Salayet = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Salayet", GXutil.str( AV45Salayet, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALAYET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45Salayet), "9")));
      GXt_int5 = AV45Salayet ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int6) ;
      tproved_impl.this.GXt_int5 = GXv_int6[0] ;
      AV45Salayet = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Salayet", GXutil.str( AV45Salayet, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALAYET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45Salayet), "9")));
      AV46PLinea = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46PLinea", GXutil.str( AV46PLinea, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46PLinea), "9")));
      GXt_int5 = AV46PLinea ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int6) ;
      tproved_impl.this.GXt_int5 = GXv_int6[0] ;
      AV46PLinea = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46PLinea", GXutil.str( AV46PLinea, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46PLinea), "9")));
      AV55Lit50 = httpContext.getMessage( "Clasificacion", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Lit50", AV55Lit50);
      GXt_int5 = AV57Rontaltex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RONTAL", ""), GXv_int6) ;
      tproved_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57Rontaltex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Rontaltex", GXutil.str( AV57Rontaltex, 1, 0));
      AV56Lit26 = httpContext.getMessage( "Grupo Económico", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Lit26", AV56Lit26);
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('Rontaltex',23) ]
         Target    : [ t('Lit26',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      edtGpoEcoCod_Visible = AV57Rontaltex ;
      httpContext.ajax_rsp_assign_prop("", false, edtGpoEcoCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGpoEcoCod_Visible), 5, 0), true);
      edtGpoEcoNom_Visible = AV57Rontaltex ;
      httpContext.ajax_rsp_assign_prop("", false, edtGpoEcoNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGpoEcoNom_Visible), 5, 0), true);
   }

   public void e1218A2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( ( AV45Salayet == 1 ) || ( AV46PLinea == 1 ) ) && ( GXutil.strcmp(AV51Modo, httpContext.getMessage( "INS", "")) == 0 ) )
      {
         AV47Flag_Emp2 = (byte)(0) ;
         AV50Flag_Prv = (byte)(0) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV48EmprCod2 ;
         GXv_char2[0] = AV49EmprNom2 ;
         GXv_int6[0] = AV47Flag_Emp2 ;
         new app.pempaso(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int6) ;
         tproved_impl.this.A396EmprCod = GXv_char4[0] ;
         tproved_impl.this.AV48EmprCod2 = GXv_char3[0] ;
         tproved_impl.this.AV49EmprNom2 = GXv_char2[0] ;
         tproved_impl.this.AV47Flag_Emp2 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV48EmprCod2", AV48EmprCod2);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48EmprCod2, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV49EmprNom2", AV49EmprNom2);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprNom2, ""))));
         if ( AV47Flag_Emp2 == 1 )
         {
            GXv_char4[0] = AV48EmprCod2 ;
            GXv_int7[0] = A795PrvNum ;
            GXv_int6[0] = AV50Flag_Prv ;
            new app.pbusprv(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6) ;
            tproved_impl.this.AV48EmprCod2 = GXv_char4[0] ;
            tproved_impl.this.A795PrvNum = GXv_int7[0] ;
            tproved_impl.this.AV50Flag_Prv = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48EmprCod2", AV48EmprCod2);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48EmprCod2, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            if ( AV50Flag_Prv == 0 )
            {
               GXutil.Confirmed = true;
               if ( GXutil.Confirmed )
               {
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int7[0] = A795PrvNum ;
                  GXv_char3[0] = AV48EmprCod2 ;
                  GXv_int8[0] = A795PrvNum ;
                  new app.pnewprv(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int8) ;
                  tproved_impl.this.A396EmprCod = GXv_char4[0] ;
                  tproved_impl.this.A795PrvNum = GXv_int7[0] ;
                  tproved_impl.this.AV48EmprCod2 = GXv_char3[0] ;
                  tproved_impl.this.A795PrvNum = GXv_int8[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV48EmprCod2", AV48EmprCod2);
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48EmprCod2, "@!"))));
                  httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void zm18A94( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z794PrvNom = T018A3_A794PrvNom[0] ;
            Z786PrvDir = T018A3_A786PrvDir[0] ;
            Z782PrvCpo = T018A3_A782PrvCpo[0] ;
            Z799PrvPob = T018A3_A799PrvPob[0] ;
            Z793PrvNif = T018A3_A793PrvNif[0] ;
            Z803PrvTlf = T018A3_A803PrvTlf[0] ;
            Z800PrvPri = T018A3_A800PrvPri[0] ;
            Z804PrvTlx = T018A3_A804PrvTlx[0] ;
            Z802PrvTip = T018A3_A802PrvTip[0] ;
            Z805PrvVto = T018A3_A805PrvVto[0] ;
            Z785PrvDiaPag = T018A3_A785PrvDiaPag[0] ;
            Z797PrvPer = T018A3_A797PrvPer[0] ;
            Z780PrvBan = T018A3_A780PrvBan[0] ;
            Z801PrvRep = T018A3_A801PrvRep[0] ;
            Z798PrvPlaEnt = T018A3_A798PrvPlaEnt[0] ;
            Z792PrvMetTra = T018A3_A792PrvMetTra[0] ;
            Z783PrvCta = T018A3_A783PrvCta[0] ;
            Z3092PrvDivCod = T018A3_A3092PrvDivCod[0] ;
            Z3314PrvCar = T018A3_A3314PrvCar[0] ;
            Z6075PrvCp2 = T018A3_A6075PrvCp2[0] ;
            Z6076PrvFax = T018A3_A6076PrvFax[0] ;
            Z6077PrvMail = T018A3_A6077PrvMail[0] ;
            Z6570PrvNom2 = T018A3_A6570PrvNom2[0] ;
            Z6571PrvDir2 = T018A3_A6571PrvDir2[0] ;
            Z8160PrvDtoPP = T018A3_A8160PrvDtoPP[0] ;
            Z10477PrvDiaPgA = T018A3_A10477PrvDiaPgA[0] ;
            Z497FpgCod = T018A3_A497FpgCod[0] ;
            Z9728Cod_Clas = T018A3_A9728Cod_Clas[0] ;
            Z10122GpoEcoCod = T018A3_A10122GpoEcoCod[0] ;
            Z3143PrvDivCo = T018A3_A3143PrvDivCo[0] ;
         }
         else
         {
            Z794PrvNom = A794PrvNom ;
            Z786PrvDir = A786PrvDir ;
            Z782PrvCpo = A782PrvCpo ;
            Z799PrvPob = A799PrvPob ;
            Z793PrvNif = A793PrvNif ;
            Z803PrvTlf = A803PrvTlf ;
            Z800PrvPri = A800PrvPri ;
            Z804PrvTlx = A804PrvTlx ;
            Z802PrvTip = A802PrvTip ;
            Z805PrvVto = A805PrvVto ;
            Z785PrvDiaPag = A785PrvDiaPag ;
            Z797PrvPer = A797PrvPer ;
            Z780PrvBan = A780PrvBan ;
            Z801PrvRep = A801PrvRep ;
            Z798PrvPlaEnt = A798PrvPlaEnt ;
            Z792PrvMetTra = A792PrvMetTra ;
            Z783PrvCta = A783PrvCta ;
            Z3092PrvDivCod = A3092PrvDivCod ;
            Z3314PrvCar = A3314PrvCar ;
            Z6075PrvCp2 = A6075PrvCp2 ;
            Z6076PrvFax = A6076PrvFax ;
            Z6077PrvMail = A6077PrvMail ;
            Z6570PrvNom2 = A6570PrvNom2 ;
            Z6571PrvDir2 = A6571PrvDir2 ;
            Z8160PrvDtoPP = A8160PrvDtoPP ;
            Z10477PrvDiaPgA = A10477PrvDiaPgA ;
            Z497FpgCod = A497FpgCod ;
            Z9728Cod_Clas = A9728Cod_Clas ;
            Z10122GpoEcoCod = A10122GpoEcoCod ;
            Z3143PrvDivCo = A3143PrvDivCo ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z795PrvNum = A795PrvNum ;
         Z794PrvNom = A794PrvNom ;
         Z786PrvDir = A786PrvDir ;
         Z782PrvCpo = A782PrvCpo ;
         Z799PrvPob = A799PrvPob ;
         Z793PrvNif = A793PrvNif ;
         Z803PrvTlf = A803PrvTlf ;
         Z800PrvPri = A800PrvPri ;
         Z804PrvTlx = A804PrvTlx ;
         Z802PrvTip = A802PrvTip ;
         Z805PrvVto = A805PrvVto ;
         Z785PrvDiaPag = A785PrvDiaPag ;
         Z797PrvPer = A797PrvPer ;
         Z780PrvBan = A780PrvBan ;
         Z801PrvRep = A801PrvRep ;
         Z798PrvPlaEnt = A798PrvPlaEnt ;
         Z792PrvMetTra = A792PrvMetTra ;
         Z783PrvCta = A783PrvCta ;
         Z3092PrvDivCod = A3092PrvDivCod ;
         Z3314PrvCar = A3314PrvCar ;
         Z6075PrvCp2 = A6075PrvCp2 ;
         Z6076PrvFax = A6076PrvFax ;
         Z6077PrvMail = A6077PrvMail ;
         Z6570PrvNom2 = A6570PrvNom2 ;
         Z6571PrvDir2 = A6571PrvDir2 ;
         Z6572PrvContac = A6572PrvContac ;
         Z8160PrvDtoPP = A8160PrvDtoPP ;
         Z10477PrvDiaPgA = A10477PrvDiaPgA ;
         Z396EmprCod = A396EmprCod ;
         Z497FpgCod = A497FpgCod ;
         Z9728Cod_Clas = A9728Cod_Clas ;
         Z10122GpoEcoCod = A10122GpoEcoCod ;
         Z3143PrvDivCo = A3143PrvDivCo ;
         Z407EmprNom = A407EmprNom ;
         Z498FpgDsc = A498FpgDsc ;
         Z3144PrvDivAbr = A3144PrvDivAbr ;
         Z9729Des_Clas = A9729Des_Clas ;
         Z10123GpoEcoNom = A10123GpoEcoNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T018A4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018A4_A407EmprNom[0] ;
      n407EmprNom = T018A4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         AV51Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Modo", AV51Modo);
      }
      else
      {
         if ( isUpd( )  )
         {
            AV51Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Modo", AV51Modo);
         }
         else
         {
            if ( isDlt( )  )
            {
               AV51Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51Modo", AV51Modo);
            }
         }
      }
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
      if ( isIns( )  && (0==A800PrvPri) && ( Gx_BScreen == 0 ) )
      {
         A800PrvPri = (byte)(1) ;
         n800PrvPri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A802PrvTip)==0) && ( Gx_BScreen == 0 ) )
      {
         A802PrvTip = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         n802PrvTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
      }
      if ( isIns( )  && (GXutil.strcmp("", A792PrvMetTra)==0) && ( Gx_BScreen == 0 ) )
      {
         A792PrvMetTra = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         n792PrvMetTra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load18A94( )
   {
      /* Using cursor T018A9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound94 = (short)(1) ;
         A6572PrvContac = T018A9_A6572PrvContac[0] ;
         n6572PrvContac = T018A9_n6572PrvContac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
         A794PrvNom = T018A9_A794PrvNom[0] ;
         n794PrvNom = T018A9_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A407EmprNom = T018A9_A407EmprNom[0] ;
         n407EmprNom = T018A9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A786PrvDir = T018A9_A786PrvDir[0] ;
         n786PrvDir = T018A9_n786PrvDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
         A782PrvCpo = T018A9_A782PrvCpo[0] ;
         n782PrvCpo = T018A9_n782PrvCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", A782PrvCpo);
         A799PrvPob = T018A9_A799PrvPob[0] ;
         n799PrvPob = T018A9_n799PrvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
         A793PrvNif = T018A9_A793PrvNif[0] ;
         n793PrvNif = T018A9_n793PrvNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", A793PrvNif);
         A803PrvTlf = T018A9_A803PrvTlf[0] ;
         n803PrvTlf = T018A9_n803PrvTlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
         A800PrvPri = T018A9_A800PrvPri[0] ;
         n800PrvPri = T018A9_n800PrvPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
         A804PrvTlx = T018A9_A804PrvTlx[0] ;
         n804PrvTlx = T018A9_n804PrvTlx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
         A802PrvTip = T018A9_A802PrvTip[0] ;
         n802PrvTip = T018A9_n802PrvTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
         A498FpgDsc = T018A9_A498FpgDsc[0] ;
         n498FpgDsc = T018A9_n498FpgDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
         A805PrvVto = T018A9_A805PrvVto[0] ;
         n805PrvVto = T018A9_n805PrvVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
         A785PrvDiaPag = T018A9_A785PrvDiaPag[0] ;
         n785PrvDiaPag = T018A9_n785PrvDiaPag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
         A797PrvPer = T018A9_A797PrvPer[0] ;
         n797PrvPer = T018A9_n797PrvPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
         A780PrvBan = T018A9_A780PrvBan[0] ;
         n780PrvBan = T018A9_n780PrvBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
         A801PrvRep = T018A9_A801PrvRep[0] ;
         n801PrvRep = T018A9_n801PrvRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", A801PrvRep);
         A798PrvPlaEnt = T018A9_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = T018A9_n798PrvPlaEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
         A792PrvMetTra = T018A9_A792PrvMetTra[0] ;
         n792PrvMetTra = T018A9_n792PrvMetTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
         A783PrvCta = T018A9_A783PrvCta[0] ;
         n783PrvCta = T018A9_n783PrvCta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", A783PrvCta);
         A3092PrvDivCod = T018A9_A3092PrvDivCod[0] ;
         n3092PrvDivCod = T018A9_n3092PrvDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
         A3144PrvDivAbr = T018A9_A3144PrvDivAbr[0] ;
         n3144PrvDivAbr = T018A9_n3144PrvDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", A3144PrvDivAbr);
         A3314PrvCar = T018A9_A3314PrvCar[0] ;
         n3314PrvCar = T018A9_n3314PrvCar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
         A6075PrvCp2 = T018A9_A6075PrvCp2[0] ;
         n6075PrvCp2 = T018A9_n6075PrvCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", A6075PrvCp2);
         A6076PrvFax = T018A9_A6076PrvFax[0] ;
         n6076PrvFax = T018A9_n6076PrvFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", A6076PrvFax);
         A6077PrvMail = T018A9_A6077PrvMail[0] ;
         n6077PrvMail = T018A9_n6077PrvMail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", A6077PrvMail);
         A6570PrvNom2 = T018A9_A6570PrvNom2[0] ;
         n6570PrvNom2 = T018A9_n6570PrvNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", A6570PrvNom2);
         A6571PrvDir2 = T018A9_A6571PrvDir2[0] ;
         n6571PrvDir2 = T018A9_n6571PrvDir2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", A6571PrvDir2);
         A8160PrvDtoPP = T018A9_A8160PrvDtoPP[0] ;
         n8160PrvDtoPP = T018A9_n8160PrvDtoPP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
         A9729Des_Clas = T018A9_A9729Des_Clas[0] ;
         n9729Des_Clas = T018A9_n9729Des_Clas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", A9729Des_Clas);
         A10123GpoEcoNom = T018A9_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T018A9_n10123GpoEcoNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
         A10477PrvDiaPgA = T018A9_A10477PrvDiaPgA[0] ;
         n10477PrvDiaPgA = T018A9_n10477PrvDiaPgA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10477PrvDiaPgA", A10477PrvDiaPgA);
         A497FpgCod = T018A9_A497FpgCod[0] ;
         n497FpgCod = T018A9_n497FpgCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         A9728Cod_Clas = T018A9_A9728Cod_Clas[0] ;
         n9728Cod_Clas = T018A9_n9728Cod_Clas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         A10122GpoEcoCod = T018A9_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = T018A9_n10122GpoEcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         A3143PrvDivCo = T018A9_A3143PrvDivCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         zm18A94( -11) ;
      }
      pr_default.close(7);
      onLoadActions18A94( ) ;
   }

   public void onLoadActions18A94( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable18A94( )
   {
      nIsDirty_94 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T018A5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A497FpgCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FPGCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFpgCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A498FpgDsc = T018A5_A498FpgDsc[0] ;
      n498FpgDsc = T018A5_n498FpgDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
      pr_default.close(3);
      /* Using cursor T018A6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9728Cod_Clas) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ISOTB1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_CLAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCod_Clas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9729Des_Clas = T018A6_A9729Des_Clas[0] ;
      n9729Des_Clas = T018A6_n9729Des_Clas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", A9729Des_Clas);
      pr_default.close(4);
      /* Using cursor T018A7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10122GpoEcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGpoEcoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A10123GpoEcoNom = T018A7_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T018A7_n10123GpoEcoNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      pr_default.close(5);
      if ( (0==A795PrvNum) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Erroneo", ""), 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A800PrvPri == 0 ) || ( A800PrvPri == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRVPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = chkPrvPri.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A802PrvTip, "P") == 0 ) || ( GXutil.strcmp(A802PrvTip, "A") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRVTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPrvTip.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A792PrvMetTra, "N") == 0 ) || ( GXutil.strcmp(A792PrvMetTra, "S") == 0 ) || ( GXutil.strcmp(A792PrvMetTra, "A") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Metodo Transporte", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRVMETTRA");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPrvMetTra.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T018A8 */
      pr_default.execute(6, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvDivCo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3144PrvDivAbr = T018A8_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T018A8_n3144PrvDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", A3144PrvDivAbr);
      pr_default.close(6);
      if ( ! ( GxRegex.IsMatch(A6077PrvMail,"^((\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)|(\\s*))$") ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXM_DoesNotMatchRegExp", ""), httpContext.getMessage( "Mail", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRVMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvMail_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors18A94( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          String A497FpgCod )
   {
      /* Using cursor T018A10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A497FpgCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FPGCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFpgCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A498FpgDsc = T018A10_A498FpgDsc[0] ;
      n498FpgDsc = T018A10_n498FpgDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A498FpgDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_14( String A396EmprCod ,
                          short A9728Cod_Clas )
   {
      /* Using cursor T018A11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9728Cod_Clas) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ISOTB1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_CLAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCod_Clas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9729Des_Clas = T018A11_A9729Des_Clas[0] ;
      n9729Des_Clas = T018A11_n9729Des_Clas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", A9729Des_Clas);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9729Des_Clas))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_15( String A396EmprCod ,
                          int A10122GpoEcoCod )
   {
      /* Using cursor T018A12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10122GpoEcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGpoEcoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A10123GpoEcoNom = T018A12_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T018A12_n10123GpoEcoNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A10123GpoEcoNom)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_16( byte A3143PrvDivCo )
   {
      /* Using cursor T018A13 */
      pr_default.execute(11, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvDivCo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3144PrvDivAbr = T018A13_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T018A13_n3144PrvDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", A3144PrvDivAbr);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3144PrvDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey18A94( )
   {
      /* Using cursor T018A14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound94 = (short)(1) ;
      }
      else
      {
         RcdFound94 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T018A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T018A3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18A94( 11) ;
         RcdFound94 = (short)(1) ;
         A6572PrvContac = T018A3_A6572PrvContac[0] ;
         n6572PrvContac = T018A3_n6572PrvContac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
         A795PrvNum = T018A3_A795PrvNum[0] ;
         n795PrvNum = T018A3_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A794PrvNom = T018A3_A794PrvNom[0] ;
         n794PrvNom = T018A3_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A786PrvDir = T018A3_A786PrvDir[0] ;
         n786PrvDir = T018A3_n786PrvDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
         A782PrvCpo = T018A3_A782PrvCpo[0] ;
         n782PrvCpo = T018A3_n782PrvCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", A782PrvCpo);
         A799PrvPob = T018A3_A799PrvPob[0] ;
         n799PrvPob = T018A3_n799PrvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
         A793PrvNif = T018A3_A793PrvNif[0] ;
         n793PrvNif = T018A3_n793PrvNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", A793PrvNif);
         A803PrvTlf = T018A3_A803PrvTlf[0] ;
         n803PrvTlf = T018A3_n803PrvTlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
         A800PrvPri = T018A3_A800PrvPri[0] ;
         n800PrvPri = T018A3_n800PrvPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
         A804PrvTlx = T018A3_A804PrvTlx[0] ;
         n804PrvTlx = T018A3_n804PrvTlx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
         A802PrvTip = T018A3_A802PrvTip[0] ;
         n802PrvTip = T018A3_n802PrvTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
         A805PrvVto = T018A3_A805PrvVto[0] ;
         n805PrvVto = T018A3_n805PrvVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
         A785PrvDiaPag = T018A3_A785PrvDiaPag[0] ;
         n785PrvDiaPag = T018A3_n785PrvDiaPag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
         A797PrvPer = T018A3_A797PrvPer[0] ;
         n797PrvPer = T018A3_n797PrvPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
         A780PrvBan = T018A3_A780PrvBan[0] ;
         n780PrvBan = T018A3_n780PrvBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
         A801PrvRep = T018A3_A801PrvRep[0] ;
         n801PrvRep = T018A3_n801PrvRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", A801PrvRep);
         A798PrvPlaEnt = T018A3_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = T018A3_n798PrvPlaEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
         A792PrvMetTra = T018A3_A792PrvMetTra[0] ;
         n792PrvMetTra = T018A3_n792PrvMetTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
         A783PrvCta = T018A3_A783PrvCta[0] ;
         n783PrvCta = T018A3_n783PrvCta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", A783PrvCta);
         A3092PrvDivCod = T018A3_A3092PrvDivCod[0] ;
         n3092PrvDivCod = T018A3_n3092PrvDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
         A3314PrvCar = T018A3_A3314PrvCar[0] ;
         n3314PrvCar = T018A3_n3314PrvCar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
         A6075PrvCp2 = T018A3_A6075PrvCp2[0] ;
         n6075PrvCp2 = T018A3_n6075PrvCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", A6075PrvCp2);
         A6076PrvFax = T018A3_A6076PrvFax[0] ;
         n6076PrvFax = T018A3_n6076PrvFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", A6076PrvFax);
         A6077PrvMail = T018A3_A6077PrvMail[0] ;
         n6077PrvMail = T018A3_n6077PrvMail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", A6077PrvMail);
         A6570PrvNom2 = T018A3_A6570PrvNom2[0] ;
         n6570PrvNom2 = T018A3_n6570PrvNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", A6570PrvNom2);
         A6571PrvDir2 = T018A3_A6571PrvDir2[0] ;
         n6571PrvDir2 = T018A3_n6571PrvDir2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", A6571PrvDir2);
         A8160PrvDtoPP = T018A3_A8160PrvDtoPP[0] ;
         n8160PrvDtoPP = T018A3_n8160PrvDtoPP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
         A10477PrvDiaPgA = T018A3_A10477PrvDiaPgA[0] ;
         n10477PrvDiaPgA = T018A3_n10477PrvDiaPgA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10477PrvDiaPgA", A10477PrvDiaPgA);
         A497FpgCod = T018A3_A497FpgCod[0] ;
         n497FpgCod = T018A3_n497FpgCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
         A9728Cod_Clas = T018A3_A9728Cod_Clas[0] ;
         n9728Cod_Clas = T018A3_n9728Cod_Clas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         A10122GpoEcoCod = T018A3_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = T018A3_n10122GpoEcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         A3143PrvDivCo = T018A3_A3143PrvDivCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         sMode94 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18A94( ) ;
         if ( AnyError == 1 )
         {
            RcdFound94 = (short)(0) ;
            initializeNonKey18A94( ) ;
         }
         Gx_mode = sMode94 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound94 = (short)(0) ;
         initializeNonKey18A94( ) ;
         sMode94 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode94 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey18A94( ) ;
      if ( RcdFound94 == 0 )
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
      RcdFound94 = (short)(0) ;
      /* Using cursor T018A15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T018A15_A795PrvNum[0] < A795PrvNum ) ) && ( GXutil.strcmp(T018A15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T018A15_A795PrvNum[0] > A795PrvNum ) ) && ( GXutil.strcmp(T018A15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A795PrvNum = T018A15_A795PrvNum[0] ;
            n795PrvNum = T018A15_n795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            RcdFound94 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound94 = (short)(0) ;
      /* Using cursor T018A16 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T018A16_A795PrvNum[0] > A795PrvNum ) ) && ( GXutil.strcmp(T018A16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T018A16_A795PrvNum[0] < A795PrvNum ) ) && ( GXutil.strcmp(T018A16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A795PrvNum = T018A16_A795PrvNum[0] ;
            n795PrvNum = T018A16_n795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            RcdFound94 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18A94( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert18A94( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound94 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) )
            {
               A795PrvNum = Z795PrvNum ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update18A94( ) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert18A94( ) ;
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
                  GX_FocusControl = edtPrvNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert18A94( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) )
      {
         A795PrvNum = Z795PrvNum ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrvNum_Internalname ;
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
      getKey18A94( ) ;
      if ( RcdFound94 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) )
         {
            A795PrvNum = Z795PrvNum ;
            n795PrvNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A795PrvNum != Z795PrvNum ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tproved");
      GX_FocusControl = edtPrvNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_18A0( ) ;
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
      if ( RcdFound94 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrvNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart18A94( ) ;
      if ( RcdFound94 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrvNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18A94( ) ;
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
      if ( RcdFound94 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrvNom_Internalname ;
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
      if ( RcdFound94 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrvNom_Internalname ;
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
      scanStart18A94( ) ;
      if ( RcdFound94 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound94 != 0 )
         {
            scanNext18A94( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrvNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18A94( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18A94( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018A2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z794PrvNom, T018A2_A794PrvNom[0]) != 0 ) || ( GXutil.strcmp(Z786PrvDir, T018A2_A786PrvDir[0]) != 0 ) || ( GXutil.strcmp(Z782PrvCpo, T018A2_A782PrvCpo[0]) != 0 ) || ( GXutil.strcmp(Z799PrvPob, T018A2_A799PrvPob[0]) != 0 ) || ( GXutil.strcmp(Z793PrvNif, T018A2_A793PrvNif[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z803PrvTlf, T018A2_A803PrvTlf[0]) != 0 ) || ( Z800PrvPri != T018A2_A800PrvPri[0] ) || ( GXutil.strcmp(Z804PrvTlx, T018A2_A804PrvTlx[0]) != 0 ) || ( GXutil.strcmp(Z802PrvTip, T018A2_A802PrvTip[0]) != 0 ) || ( Z805PrvVto != T018A2_A805PrvVto[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z785PrvDiaPag != T018A2_A785PrvDiaPag[0] ) || ( Z797PrvPer != T018A2_A797PrvPer[0] ) || ( Z780PrvBan != T018A2_A780PrvBan[0] ) || ( GXutil.strcmp(Z801PrvRep, T018A2_A801PrvRep[0]) != 0 ) || ( Z798PrvPlaEnt != T018A2_A798PrvPlaEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z792PrvMetTra, T018A2_A792PrvMetTra[0]) != 0 ) || ( GXutil.strcmp(Z783PrvCta, T018A2_A783PrvCta[0]) != 0 ) || ( GXutil.strcmp(Z3092PrvDivCod, T018A2_A3092PrvDivCod[0]) != 0 ) || ( GXutil.strcmp(Z3314PrvCar, T018A2_A3314PrvCar[0]) != 0 ) || ( GXutil.strcmp(Z6075PrvCp2, T018A2_A6075PrvCp2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6076PrvFax, T018A2_A6076PrvFax[0]) != 0 ) || ( GXutil.strcmp(Z6077PrvMail, T018A2_A6077PrvMail[0]) != 0 ) || ( GXutil.strcmp(Z6570PrvNom2, T018A2_A6570PrvNom2[0]) != 0 ) || ( GXutil.strcmp(Z6571PrvDir2, T018A2_A6571PrvDir2[0]) != 0 ) || ( DecimalUtil.compareTo(Z8160PrvDtoPP, T018A2_A8160PrvDtoPP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10477PrvDiaPgA, T018A2_A10477PrvDiaPgA[0]) != 0 ) || ( GXutil.strcmp(Z497FpgCod, T018A2_A497FpgCod[0]) != 0 ) || ( Z9728Cod_Clas != T018A2_A9728Cod_Clas[0] ) || ( Z10122GpoEcoCod != T018A2_A10122GpoEcoCod[0] ) || ( Z3143PrvDivCo != T018A2_A3143PrvDivCo[0] ) )
         {
            if ( GXutil.strcmp(Z794PrvNom, T018A2_A794PrvNom[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvNom");
               GXutil.writeLogRaw("Old: ",Z794PrvNom);
               GXutil.writeLogRaw("Current: ",T018A2_A794PrvNom[0]);
            }
            if ( GXutil.strcmp(Z786PrvDir, T018A2_A786PrvDir[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvDir");
               GXutil.writeLogRaw("Old: ",Z786PrvDir);
               GXutil.writeLogRaw("Current: ",T018A2_A786PrvDir[0]);
            }
            if ( GXutil.strcmp(Z782PrvCpo, T018A2_A782PrvCpo[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvCpo");
               GXutil.writeLogRaw("Old: ",Z782PrvCpo);
               GXutil.writeLogRaw("Current: ",T018A2_A782PrvCpo[0]);
            }
            if ( GXutil.strcmp(Z799PrvPob, T018A2_A799PrvPob[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvPob");
               GXutil.writeLogRaw("Old: ",Z799PrvPob);
               GXutil.writeLogRaw("Current: ",T018A2_A799PrvPob[0]);
            }
            if ( GXutil.strcmp(Z793PrvNif, T018A2_A793PrvNif[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvNif");
               GXutil.writeLogRaw("Old: ",Z793PrvNif);
               GXutil.writeLogRaw("Current: ",T018A2_A793PrvNif[0]);
            }
            if ( GXutil.strcmp(Z803PrvTlf, T018A2_A803PrvTlf[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvTlf");
               GXutil.writeLogRaw("Old: ",Z803PrvTlf);
               GXutil.writeLogRaw("Current: ",T018A2_A803PrvTlf[0]);
            }
            if ( Z800PrvPri != T018A2_A800PrvPri[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvPri");
               GXutil.writeLogRaw("Old: ",Z800PrvPri);
               GXutil.writeLogRaw("Current: ",T018A2_A800PrvPri[0]);
            }
            if ( GXutil.strcmp(Z804PrvTlx, T018A2_A804PrvTlx[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvTlx");
               GXutil.writeLogRaw("Old: ",Z804PrvTlx);
               GXutil.writeLogRaw("Current: ",T018A2_A804PrvTlx[0]);
            }
            if ( GXutil.strcmp(Z802PrvTip, T018A2_A802PrvTip[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvTip");
               GXutil.writeLogRaw("Old: ",Z802PrvTip);
               GXutil.writeLogRaw("Current: ",T018A2_A802PrvTip[0]);
            }
            if ( Z805PrvVto != T018A2_A805PrvVto[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvVto");
               GXutil.writeLogRaw("Old: ",Z805PrvVto);
               GXutil.writeLogRaw("Current: ",T018A2_A805PrvVto[0]);
            }
            if ( Z785PrvDiaPag != T018A2_A785PrvDiaPag[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvDiaPag");
               GXutil.writeLogRaw("Old: ",Z785PrvDiaPag);
               GXutil.writeLogRaw("Current: ",T018A2_A785PrvDiaPag[0]);
            }
            if ( Z797PrvPer != T018A2_A797PrvPer[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvPer");
               GXutil.writeLogRaw("Old: ",Z797PrvPer);
               GXutil.writeLogRaw("Current: ",T018A2_A797PrvPer[0]);
            }
            if ( Z780PrvBan != T018A2_A780PrvBan[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvBan");
               GXutil.writeLogRaw("Old: ",Z780PrvBan);
               GXutil.writeLogRaw("Current: ",T018A2_A780PrvBan[0]);
            }
            if ( GXutil.strcmp(Z801PrvRep, T018A2_A801PrvRep[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvRep");
               GXutil.writeLogRaw("Old: ",Z801PrvRep);
               GXutil.writeLogRaw("Current: ",T018A2_A801PrvRep[0]);
            }
            if ( Z798PrvPlaEnt != T018A2_A798PrvPlaEnt[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvPlaEnt");
               GXutil.writeLogRaw("Old: ",Z798PrvPlaEnt);
               GXutil.writeLogRaw("Current: ",T018A2_A798PrvPlaEnt[0]);
            }
            if ( GXutil.strcmp(Z792PrvMetTra, T018A2_A792PrvMetTra[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvMetTra");
               GXutil.writeLogRaw("Old: ",Z792PrvMetTra);
               GXutil.writeLogRaw("Current: ",T018A2_A792PrvMetTra[0]);
            }
            if ( GXutil.strcmp(Z783PrvCta, T018A2_A783PrvCta[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvCta");
               GXutil.writeLogRaw("Old: ",Z783PrvCta);
               GXutil.writeLogRaw("Current: ",T018A2_A783PrvCta[0]);
            }
            if ( GXutil.strcmp(Z3092PrvDivCod, T018A2_A3092PrvDivCod[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvDivCod");
               GXutil.writeLogRaw("Old: ",Z3092PrvDivCod);
               GXutil.writeLogRaw("Current: ",T018A2_A3092PrvDivCod[0]);
            }
            if ( GXutil.strcmp(Z3314PrvCar, T018A2_A3314PrvCar[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvCar");
               GXutil.writeLogRaw("Old: ",Z3314PrvCar);
               GXutil.writeLogRaw("Current: ",T018A2_A3314PrvCar[0]);
            }
            if ( GXutil.strcmp(Z6075PrvCp2, T018A2_A6075PrvCp2[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvCp2");
               GXutil.writeLogRaw("Old: ",Z6075PrvCp2);
               GXutil.writeLogRaw("Current: ",T018A2_A6075PrvCp2[0]);
            }
            if ( GXutil.strcmp(Z6076PrvFax, T018A2_A6076PrvFax[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvFax");
               GXutil.writeLogRaw("Old: ",Z6076PrvFax);
               GXutil.writeLogRaw("Current: ",T018A2_A6076PrvFax[0]);
            }
            if ( GXutil.strcmp(Z6077PrvMail, T018A2_A6077PrvMail[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvMail");
               GXutil.writeLogRaw("Old: ",Z6077PrvMail);
               GXutil.writeLogRaw("Current: ",T018A2_A6077PrvMail[0]);
            }
            if ( GXutil.strcmp(Z6570PrvNom2, T018A2_A6570PrvNom2[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvNom2");
               GXutil.writeLogRaw("Old: ",Z6570PrvNom2);
               GXutil.writeLogRaw("Current: ",T018A2_A6570PrvNom2[0]);
            }
            if ( GXutil.strcmp(Z6571PrvDir2, T018A2_A6571PrvDir2[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvDir2");
               GXutil.writeLogRaw("Old: ",Z6571PrvDir2);
               GXutil.writeLogRaw("Current: ",T018A2_A6571PrvDir2[0]);
            }
            if ( DecimalUtil.compareTo(Z8160PrvDtoPP, T018A2_A8160PrvDtoPP[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvDtoPP");
               GXutil.writeLogRaw("Old: ",Z8160PrvDtoPP);
               GXutil.writeLogRaw("Current: ",T018A2_A8160PrvDtoPP[0]);
            }
            if ( GXutil.strcmp(Z10477PrvDiaPgA, T018A2_A10477PrvDiaPgA[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvDiaPgA");
               GXutil.writeLogRaw("Old: ",Z10477PrvDiaPgA);
               GXutil.writeLogRaw("Current: ",T018A2_A10477PrvDiaPgA[0]);
            }
            if ( GXutil.strcmp(Z497FpgCod, T018A2_A497FpgCod[0]) != 0 )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"FpgCod");
               GXutil.writeLogRaw("Old: ",Z497FpgCod);
               GXutil.writeLogRaw("Current: ",T018A2_A497FpgCod[0]);
            }
            if ( Z9728Cod_Clas != T018A2_A9728Cod_Clas[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"Cod_Clas");
               GXutil.writeLogRaw("Old: ",Z9728Cod_Clas);
               GXutil.writeLogRaw("Current: ",T018A2_A9728Cod_Clas[0]);
            }
            if ( Z10122GpoEcoCod != T018A2_A10122GpoEcoCod[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"GpoEcoCod");
               GXutil.writeLogRaw("Old: ",Z10122GpoEcoCod);
               GXutil.writeLogRaw("Current: ",T018A2_A10122GpoEcoCod[0]);
            }
            if ( Z3143PrvDivCo != T018A2_A3143PrvDivCo[0] )
            {
               GXutil.writeLogln("tproved:[seudo value changed for attri]"+"PrvDivCo");
               GXutil.writeLogRaw("Old: ",Z3143PrvDivCo);
               GXutil.writeLogRaw("Current: ",T018A2_A3143PrvDivCo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18A94( )
   {
      beforeValidate18A94( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18A94( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18A94( 0) ;
         checkOptimisticConcurrency18A94( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18A94( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18A94( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018A17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum), Boolean.valueOf(n794PrvNom), A794PrvNom, Boolean.valueOf(n786PrvDir), A786PrvDir, Boolean.valueOf(n782PrvCpo), A782PrvCpo, Boolean.valueOf(n799PrvPob), A799PrvPob, Boolean.valueOf(n793PrvNif), A793PrvNif, Boolean.valueOf(n803PrvTlf), A803PrvTlf, Boolean.valueOf(n800PrvPri), Byte.valueOf(A800PrvPri), Boolean.valueOf(n804PrvTlx), A804PrvTlx, Boolean.valueOf(n802PrvTip), A802PrvTip, Boolean.valueOf(n805PrvVto), Byte.valueOf(A805PrvVto), Boolean.valueOf(n785PrvDiaPag), Integer.valueOf(A785PrvDiaPag), Boolean.valueOf(n797PrvPer), Integer.valueOf(A797PrvPer), Boolean.valueOf(n780PrvBan), Integer.valueOf(A780PrvBan), Boolean.valueOf(n801PrvRep), A801PrvRep, Boolean.valueOf(n798PrvPlaEnt), Short.valueOf(A798PrvPlaEnt), Boolean.valueOf(n792PrvMetTra), A792PrvMetTra, Boolean.valueOf(n783PrvCta), A783PrvCta, Boolean.valueOf(n3092PrvDivCod), A3092PrvDivCod, Boolean.valueOf(n3314PrvCar), A3314PrvCar, Boolean.valueOf(n6075PrvCp2), A6075PrvCp2, Boolean.valueOf(n6076PrvFax), A6076PrvFax, Boolean.valueOf(n6077PrvMail), A6077PrvMail, Boolean.valueOf(n6570PrvNom2), A6570PrvNom2, Boolean.valueOf(n6571PrvDir2), A6571PrvDir2, Boolean.valueOf(n6572PrvContac), A6572PrvContac, Boolean.valueOf(n8160PrvDtoPP), A8160PrvDtoPP, Boolean.valueOf(n10477PrvDiaPgA), A10477PrvDiaPgA, A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas), Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod), Byte.valueOf(A3143PrvDivCo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption18A0( ) ;
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
            load18A94( ) ;
         }
         endLevel18A94( ) ;
      }
      closeExtendedTableCursors18A94( ) ;
   }

   public void update18A94( )
   {
      beforeValidate18A94( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18A94( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18A94( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18A94( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18A94( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018A18 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom, Boolean.valueOf(n786PrvDir), A786PrvDir, Boolean.valueOf(n782PrvCpo), A782PrvCpo, Boolean.valueOf(n799PrvPob), A799PrvPob, Boolean.valueOf(n793PrvNif), A793PrvNif, Boolean.valueOf(n803PrvTlf), A803PrvTlf, Boolean.valueOf(n800PrvPri), Byte.valueOf(A800PrvPri), Boolean.valueOf(n804PrvTlx), A804PrvTlx, Boolean.valueOf(n802PrvTip), A802PrvTip, Boolean.valueOf(n805PrvVto), Byte.valueOf(A805PrvVto), Boolean.valueOf(n785PrvDiaPag), Integer.valueOf(A785PrvDiaPag), Boolean.valueOf(n797PrvPer), Integer.valueOf(A797PrvPer), Boolean.valueOf(n780PrvBan), Integer.valueOf(A780PrvBan), Boolean.valueOf(n801PrvRep), A801PrvRep, Boolean.valueOf(n798PrvPlaEnt), Short.valueOf(A798PrvPlaEnt), Boolean.valueOf(n792PrvMetTra), A792PrvMetTra, Boolean.valueOf(n783PrvCta), A783PrvCta, Boolean.valueOf(n3092PrvDivCod), A3092PrvDivCod, Boolean.valueOf(n3314PrvCar), A3314PrvCar, Boolean.valueOf(n6075PrvCp2), A6075PrvCp2, Boolean.valueOf(n6076PrvFax), A6076PrvFax, Boolean.valueOf(n6077PrvMail), A6077PrvMail, Boolean.valueOf(n6570PrvNom2), A6570PrvNom2, Boolean.valueOf(n6571PrvDir2), A6571PrvDir2, Boolean.valueOf(n6572PrvContac), A6572PrvContac, Boolean.valueOf(n8160PrvDtoPP), A8160PrvDtoPP, Boolean.valueOf(n10477PrvDiaPgA), A10477PrvDiaPgA, Boolean.valueOf(n497FpgCod), A497FpgCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas), Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod), Byte.valueOf(A3143PrvDivCo), A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate18A94( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption18A0( ) ;
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
         endLevel18A94( ) ;
      }
      closeExtendedTableCursors18A94( ) ;
   }

   public void deferredUpdate18A94( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18A94( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18A94( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18A94( ) ;
         afterConfirm18A94( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18A94( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018A19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound94 == 0 )
                     {
                        initAll18A94( ) ;
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
                     resetCaption18A0( ) ;
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
      sMode94 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18A94( ) ;
      Gx_mode = sMode94 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18A94( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T018A20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
         A498FpgDsc = T018A20_A498FpgDsc[0] ;
         n498FpgDsc = T018A20_n498FpgDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
         pr_default.close(18);
         /* Using cursor T018A21 */
         pr_default.execute(19, new Object[] {Byte.valueOf(A3143PrvDivCo)});
         A3144PrvDivAbr = T018A21_A3144PrvDivAbr[0] ;
         n3144PrvDivAbr = T018A21_n3144PrvDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", A3144PrvDivAbr);
         pr_default.close(19);
         /* Using cursor T018A22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
         A9729Des_Clas = T018A22_A9729Des_Clas[0] ;
         n9729Des_Clas = T018A22_n9729Des_Clas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", A9729Des_Clas);
         pr_default.close(20);
         /* Using cursor T018A23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
         A10123GpoEcoNom = T018A23_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T018A23_n10123GpoEcoNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
         pr_default.close(21);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T018A24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Albaran Transporte Proveedor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T018A25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ingresos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T018A26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Proveedores", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T018A27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Compras", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T018A28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Mov de Stock en Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T018A29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRVESX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T018A30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T018A31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRVES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T018A32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T018A33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRODUC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
      }
   }

   public void endLevel18A94( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete18A94( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tproved");
         if ( AnyError == 0 )
         {
            confirmValues18A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tproved");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18A94( )
   {
      /* Scan By routine */
      /* Using cursor T018A34 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      RcdFound94 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound94 = (short)(1) ;
         A795PrvNum = T018A34_A795PrvNum[0] ;
         n795PrvNum = T018A34_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18A94( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound94 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound94 = (short)(1) ;
         A795PrvNum = T018A34_A795PrvNum[0] ;
         n795PrvNum = T018A34_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
   }

   public void scanEnd18A94( )
   {
      pr_default.close(32);
   }

   public void afterConfirm18A94( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18A94( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18A94( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18A94( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18A94( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18A94( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18A94( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrvDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDir_Enabled), 5, 0), true);
      edtPrvCpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCpo_Enabled), 5, 0), true);
      edtPrvPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPob_Enabled), 5, 0), true);
      edtPrvNif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNif_Enabled), 5, 0), true);
      edtPrvTlf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvTlf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlf_Enabled), 5, 0), true);
      chkPrvPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvPri.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrvPri.getEnabled(), 5, 0), true);
      edtPrvTlx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvTlx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlx_Enabled), 5, 0), true);
      cmbPrvTip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrvTip.getEnabled(), 5, 0), true);
      edtFpgCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), true);
      edtFpgDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgDsc_Enabled), 5, 0), true);
      edtPrvVto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvVto_Enabled), 5, 0), true);
      edtPrvDiaPag_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDiaPag_Enabled), 5, 0), true);
      edtPrvPer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPer_Enabled), 5, 0), true);
      edtPrvBan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvBan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvBan_Enabled), 5, 0), true);
      edtPrvRep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvRep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvRep_Enabled), 5, 0), true);
      edtPrvPlaEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPlaEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPlaEnt_Enabled), 5, 0), true);
      cmbPrvMetTra.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrvMetTra.getEnabled(), 5, 0), true);
      edtPrvCta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCta_Enabled), 5, 0), true);
      cmbPrvDivCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrvDivCod.getEnabled(), 5, 0), true);
      edtPrvDivCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDivCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDivCo_Enabled), 5, 0), true);
      edtPrvDivAbr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDivAbr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDivAbr_Enabled), 5, 0), true);
      edtPrvCar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCar_Enabled), 5, 0), true);
      edtPrvCp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCp2_Enabled), 5, 0), true);
      edtPrvFax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvFax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvFax_Enabled), 5, 0), true);
      edtPrvMail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvMail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvMail_Enabled), 5, 0), true);
      edtPrvNom2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom2_Enabled), 5, 0), true);
      edtPrvDir2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDir2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDir2_Enabled), 5, 0), true);
      edtPrvContac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvContac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvContac_Enabled), 5, 0), true);
      edtPrvDtoPP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDtoPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDtoPP_Enabled), 5, 0), true);
      edtCod_Clas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_Clas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_Clas_Enabled), 5, 0), true);
      edtDes_Clas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDes_Clas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDes_Clas_Enabled), 5, 0), true);
      edtGpoEcoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGpoEcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGpoEcoCod_Enabled), 5, 0), true);
      edtGpoEcoNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGpoEcoNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGpoEcoNom_Enabled), 5, 0), true);
      edtPrvDiaPgA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDiaPgA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDiaPgA_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes18A94( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues18A0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tproved", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPROVED");
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV51Modo, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tproved:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z786PrvDir", GXutil.rtrim( Z786PrvDir));
      app.GxWebStd.gx_hidden_field( httpContext, "Z782PrvCpo", GXutil.rtrim( Z782PrvCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z799PrvPob", GXutil.rtrim( Z799PrvPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z793PrvNif", GXutil.rtrim( Z793PrvNif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z803PrvTlf", GXutil.rtrim( Z803PrvTlf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z800PrvPri", GXutil.ltrim( localUtil.ntoc( Z800PrvPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z804PrvTlx", GXutil.rtrim( Z804PrvTlx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z802PrvTip", GXutil.rtrim( Z802PrvTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z805PrvVto", GXutil.ltrim( localUtil.ntoc( Z805PrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z785PrvDiaPag", GXutil.ltrim( localUtil.ntoc( Z785PrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z797PrvPer", GXutil.ltrim( localUtil.ntoc( Z797PrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z780PrvBan", GXutil.ltrim( localUtil.ntoc( Z780PrvBan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z801PrvRep", GXutil.rtrim( Z801PrvRep));
      app.GxWebStd.gx_hidden_field( httpContext, "Z798PrvPlaEnt", GXutil.ltrim( localUtil.ntoc( Z798PrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z792PrvMetTra", GXutil.rtrim( Z792PrvMetTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z783PrvCta", GXutil.rtrim( Z783PrvCta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3092PrvDivCod", GXutil.rtrim( Z3092PrvDivCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3314PrvCar", GXutil.rtrim( Z3314PrvCar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6075PrvCp2", GXutil.rtrim( Z6075PrvCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6076PrvFax", GXutil.rtrim( Z6076PrvFax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6077PrvMail", GXutil.rtrim( Z6077PrvMail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6570PrvNom2", GXutil.rtrim( Z6570PrvNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6571PrvDir2", GXutil.rtrim( Z6571PrvDir2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8160PrvDtoPP", GXutil.ltrim( localUtil.ntoc( Z8160PrvDtoPP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10477PrvDiaPgA", GXutil.rtrim( Z10477PrvDiaPgA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z497FpgCod", GXutil.rtrim( Z497FpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9728Cod_Clas", GXutil.ltrim( localUtil.ntoc( Z9728Cod_Clas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( Z10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3143PrvDivCo", GXutil.ltrim( localUtil.ntoc( Z3143PrvDivCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALAYET", GXutil.ltrim( localUtil.ntoc( AV45Salayet, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALAYET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45Salayet), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLINEA", GXutil.ltrim( localUtil.ntoc( AV46PLinea, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46PLinea), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD2", GXutil.rtrim( AV48EmprCod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48EmprCod2, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRNOM2", GXutil.rtrim( AV49EmprNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprNom2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV51Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV51Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tproved", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPROVED" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROVEEDORES", "") ;
   }

   public void initializeNonKey18A94( )
   {
      AV51Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Modo", AV51Modo);
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A786PrvDir = "" ;
      n786PrvDir = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
      A782PrvCpo = "" ;
      n782PrvCpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", A782PrvCpo);
      A799PrvPob = "" ;
      n799PrvPob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
      A793PrvNif = "" ;
      n793PrvNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", A793PrvNif);
      A803PrvTlf = "" ;
      n803PrvTlf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
      A804PrvTlx = "" ;
      n804PrvTlx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
      A497FpgCod = "" ;
      n497FpgCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", A497FpgCod);
      A498FpgDsc = "" ;
      n498FpgDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", A498FpgDsc);
      A805PrvVto = (byte)(0) ;
      n805PrvVto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
      A785PrvDiaPag = 0 ;
      n785PrvDiaPag = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
      A797PrvPer = 0 ;
      n797PrvPer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
      A780PrvBan = 0 ;
      n780PrvBan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
      A801PrvRep = "" ;
      n801PrvRep = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", A801PrvRep);
      A798PrvPlaEnt = (short)(0) ;
      n798PrvPlaEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
      A783PrvCta = "" ;
      n783PrvCta = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", A783PrvCta);
      A3092PrvDivCod = "" ;
      n3092PrvDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
      A3143PrvDivCo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
      A3144PrvDivAbr = "" ;
      n3144PrvDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", A3144PrvDivAbr);
      A3314PrvCar = "" ;
      n3314PrvCar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
      A6075PrvCp2 = "" ;
      n6075PrvCp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", A6075PrvCp2);
      A6076PrvFax = "" ;
      n6076PrvFax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", A6076PrvFax);
      A6077PrvMail = "" ;
      n6077PrvMail = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", A6077PrvMail);
      A6570PrvNom2 = "" ;
      n6570PrvNom2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", A6570PrvNom2);
      A6571PrvDir2 = "" ;
      n6571PrvDir2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", A6571PrvDir2);
      A6572PrvContac = "" ;
      n6572PrvContac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
      A8160PrvDtoPP = DecimalUtil.ZERO ;
      n8160PrvDtoPP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
      A9728Cod_Clas = (short)(0) ;
      n9728Cod_Clas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
      A9729Des_Clas = "" ;
      n9729Des_Clas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", A9729Des_Clas);
      A10122GpoEcoCod = 0 ;
      n10122GpoEcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
      A10123GpoEcoNom = "" ;
      n10123GpoEcoNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      A10477PrvDiaPgA = "" ;
      n10477PrvDiaPgA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10477PrvDiaPgA", A10477PrvDiaPgA);
      A800PrvPri = (byte)(1) ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      A802PrvTip = httpContext.getMessage( "P", "") ;
      n802PrvTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
      A792PrvMetTra = httpContext.getMessage( "S", "") ;
      n792PrvMetTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
      Z794PrvNom = "" ;
      Z786PrvDir = "" ;
      Z782PrvCpo = "" ;
      Z799PrvPob = "" ;
      Z793PrvNif = "" ;
      Z803PrvTlf = "" ;
      Z800PrvPri = (byte)(0) ;
      Z804PrvTlx = "" ;
      Z802PrvTip = "" ;
      Z805PrvVto = (byte)(0) ;
      Z785PrvDiaPag = 0 ;
      Z797PrvPer = 0 ;
      Z780PrvBan = 0 ;
      Z801PrvRep = "" ;
      Z798PrvPlaEnt = (short)(0) ;
      Z792PrvMetTra = "" ;
      Z783PrvCta = "" ;
      Z3092PrvDivCod = "" ;
      Z3314PrvCar = "" ;
      Z6075PrvCp2 = "" ;
      Z6076PrvFax = "" ;
      Z6077PrvMail = "" ;
      Z6570PrvNom2 = "" ;
      Z6571PrvDir2 = "" ;
      Z8160PrvDtoPP = DecimalUtil.ZERO ;
      Z10477PrvDiaPgA = "" ;
      Z497FpgCod = "" ;
      Z9728Cod_Clas = (short)(0) ;
      Z10122GpoEcoCod = 0 ;
      Z3143PrvDivCo = (byte)(0) ;
   }

   public void initAll18A94( )
   {
      A795PrvNum = 0 ;
      n795PrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      initializeNonKey18A94( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV51Modo = iV51Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Modo", AV51Modo);
      A800PrvPri = i800PrvPri ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      A802PrvTip = i802PrvTip ;
      n802PrvTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
      A792PrvMetTra = i792PrvMetTra ;
      n792PrvMetTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241553654", true, true);
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
      httpContext.AddJavascriptSource("tproved.js", "?20268241553654", false, true);
      /* End function include_jscripts */
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
      edtPrvNum_Internalname = "PRVNUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPrvDir_Internalname = "PRVDIR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPrvCpo_Internalname = "PRVCPO" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPrvPob_Internalname = "PRVPOB" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPrvNif_Internalname = "PRVNIF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPrvTlf_Internalname = "PRVTLF" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      chkPrvPri.setInternalname( "PRVPRI" );
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPrvTlx_Internalname = "PRVTLX" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      cmbPrvTip.setInternalname( "PRVTIP" );
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtFpgCod_Internalname = "FPGCOD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtFpgDsc_Internalname = "FPGDSC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtPrvVto_Internalname = "PRVVTO" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtPrvDiaPag_Internalname = "PRVDIAPAG" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtPrvPer_Internalname = "PRVPER" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtPrvBan_Internalname = "PRVBAN" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtPrvRep_Internalname = "PRVREP" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtPrvPlaEnt_Internalname = "PRVPLAENT" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      cmbPrvMetTra.setInternalname( "PRVMETTRA" );
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtPrvCta_Internalname = "PRVCTA" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      cmbPrvDivCod.setInternalname( "PRVDIVCOD" );
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtPrvDivCo_Internalname = "PRVDIVCO" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtPrvDivAbr_Internalname = "PRVDIVABR" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtPrvCar_Internalname = "PRVCAR" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtPrvCp2_Internalname = "PRVCP2" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtPrvFax_Internalname = "PRVFAX" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtPrvMail_Internalname = "PRVMAIL" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtPrvNom2_Internalname = "PRVNOM2" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtPrvDir2_Internalname = "PRVDIR2" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtPrvContac_Internalname = "PRVCONTAC" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtPrvDtoPP_Internalname = "PRVDTOPP" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtCod_Clas_Internalname = "COD_CLAS" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtDes_Clas_Internalname = "DES_CLAS" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtGpoEcoCod_Internalname = "GPOECOCOD" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtGpoEcoNom_Internalname = "GPOECONOM" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtPrvDiaPgA_Internalname = "PRVDIAPGA" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PROVEEDORES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrvDiaPgA_Jsonclick = "" ;
      edtPrvDiaPgA_Backcolor = (int)(0xFFFFFF) ;
      edtPrvDiaPgA_Enabled = 1 ;
      edtGpoEcoNom_Jsonclick = "" ;
      edtGpoEcoNom_Backcolor = (int)(0xFFFFFF) ;
      edtGpoEcoNom_Enabled = 0 ;
      edtGpoEcoNom_Visible = 1 ;
      edtGpoEcoCod_Jsonclick = "" ;
      edtGpoEcoCod_Backcolor = (int)(0xFFFFFF) ;
      edtGpoEcoCod_Enabled = 1 ;
      edtGpoEcoCod_Visible = 1 ;
      edtDes_Clas_Jsonclick = "" ;
      edtDes_Clas_Backcolor = (int)(0xFFFFFF) ;
      edtDes_Clas_Enabled = 0 ;
      edtCod_Clas_Jsonclick = "" ;
      edtCod_Clas_Backcolor = (int)(0xFFFFFF) ;
      edtCod_Clas_Enabled = 1 ;
      edtPrvDtoPP_Jsonclick = "" ;
      edtPrvDtoPP_Backcolor = (int)(0xFFFFFF) ;
      edtPrvDtoPP_Enabled = 1 ;
      edtPrvContac_Backcolor = (int)(0xFFFFFF) ;
      edtPrvContac_Enabled = 1 ;
      edtPrvDir2_Jsonclick = "" ;
      edtPrvDir2_Backcolor = (int)(0xFFFFFF) ;
      edtPrvDir2_Enabled = 1 ;
      edtPrvNom2_Jsonclick = "" ;
      edtPrvNom2_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNom2_Enabled = 1 ;
      edtPrvMail_Jsonclick = "" ;
      edtPrvMail_Backcolor = (int)(0xFFFFFF) ;
      edtPrvMail_Enabled = 1 ;
      edtPrvFax_Jsonclick = "" ;
      edtPrvFax_Backcolor = (int)(0xFFFFFF) ;
      edtPrvFax_Enabled = 1 ;
      edtPrvCp2_Jsonclick = "" ;
      edtPrvCp2_Backcolor = (int)(0xFFFFFF) ;
      edtPrvCp2_Enabled = 1 ;
      edtPrvCar_Jsonclick = "" ;
      edtPrvCar_Backcolor = (int)(0xFFFFFF) ;
      edtPrvCar_Enabled = 1 ;
      edtPrvDivAbr_Jsonclick = "" ;
      edtPrvDivAbr_Backcolor = (int)(0xFFFFFF) ;
      edtPrvDivAbr_Enabled = 0 ;
      edtPrvDivCo_Jsonclick = "" ;
      edtPrvDivCo_Backcolor = (int)(0xFFFFFF) ;
      edtPrvDivCo_Enabled = 1 ;
      cmbPrvDivCod.setJsonclick( "" );
      cmbPrvDivCod.setEnabled( 1 );
      cmbPrvDivCod.setIBackground( (int)(0xFFFFFF) );
      edtPrvCta_Jsonclick = "" ;
      edtPrvCta_Backcolor = (int)(0xFFFFFF) ;
      edtPrvCta_Enabled = 1 ;
      cmbPrvMetTra.setJsonclick( "" );
      cmbPrvMetTra.setEnabled( 1 );
      cmbPrvMetTra.setIBackground( (int)(0xFFFFFF) );
      edtPrvPlaEnt_Jsonclick = "" ;
      edtPrvPlaEnt_Backcolor = (int)(0xFFFFFF) ;
      edtPrvPlaEnt_Enabled = 1 ;
      edtPrvRep_Jsonclick = "" ;
      edtPrvRep_Backcolor = (int)(0xFFFFFF) ;
      edtPrvRep_Enabled = 1 ;
      edtPrvBan_Jsonclick = "" ;
      edtPrvBan_Backcolor = (int)(0xFFFFFF) ;
      edtPrvBan_Enabled = 1 ;
      edtPrvPer_Jsonclick = "" ;
      edtPrvPer_Backcolor = (int)(0xFFFFFF) ;
      edtPrvPer_Enabled = 1 ;
      edtPrvDiaPag_Jsonclick = "" ;
      edtPrvDiaPag_Backcolor = (int)(0xFFFFFF) ;
      edtPrvDiaPag_Enabled = 1 ;
      edtPrvVto_Jsonclick = "" ;
      edtPrvVto_Backcolor = (int)(0xFFFFFF) ;
      edtPrvVto_Enabled = 1 ;
      edtFpgDsc_Jsonclick = "" ;
      edtFpgDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFpgDsc_Enabled = 0 ;
      edtFpgCod_Jsonclick = "" ;
      edtFpgCod_Backcolor = (int)(0xFFFFFF) ;
      edtFpgCod_Enabled = 1 ;
      cmbPrvTip.setJsonclick( "" );
      cmbPrvTip.setEnabled( 1 );
      cmbPrvTip.setIBackground( (int)(0xFFFFFF) );
      edtPrvTlx_Jsonclick = "" ;
      edtPrvTlx_Backcolor = (int)(0xFFFFFF) ;
      edtPrvTlx_Enabled = 1 ;
      chkPrvPri.setIBackground( (int)(0xFFFFFF) );
      chkPrvPri.setEnabled( 1 );
      edtPrvTlf_Jsonclick = "" ;
      edtPrvTlf_Backcolor = (int)(0xFFFFFF) ;
      edtPrvTlf_Enabled = 1 ;
      edtPrvNif_Jsonclick = "" ;
      edtPrvNif_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNif_Enabled = 1 ;
      edtPrvPob_Jsonclick = "" ;
      edtPrvPob_Backcolor = (int)(0xFFFFFF) ;
      edtPrvPob_Enabled = 1 ;
      edtPrvCpo_Jsonclick = "" ;
      edtPrvCpo_Backcolor = (int)(0xFFFFFF) ;
      edtPrvCpo_Enabled = 1 ;
      edtPrvDir_Jsonclick = "" ;
      edtPrvDir_Backcolor = (int)(0xFFFFFF) ;
      edtPrvDir_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNum_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      chkPrvPri.setName( "PRVPRI" );
      chkPrvPri.setWebtags( "" );
      chkPrvPri.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrvPri.getInternalname(), "TitleCaption", chkPrvPri.getCaption(), true);
      chkPrvPri.setCheckedValue( "0" );
      if ( isIns( ) && (0==A800PrvPri) )
      {
         A800PrvPri = (byte)(1) ;
         n800PrvPri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      }
      cmbPrvTip.setName( "PRVTIP" );
      cmbPrvTip.setWebtags( "" );
      cmbPrvTip.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
      cmbPrvTip.addItem("A", httpContext.getMessage( "A", ""), (short)(0));
      if ( cmbPrvTip.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A802PrvTip)==0) )
         {
            A802PrvTip = httpContext.getMessage( "P", "") ;
            n802PrvTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", A802PrvTip);
         }
      }
      cmbPrvMetTra.setName( "PRVMETTRA" );
      cmbPrvMetTra.setWebtags( "" );
      cmbPrvMetTra.addItem("S", httpContext.getMessage( "Su Transporte", ""), (short)(0));
      cmbPrvMetTra.addItem("N", httpContext.getMessage( "Nuestro", ""), (short)(0));
      cmbPrvMetTra.addItem("A", httpContext.getMessage( "Agencia", ""), (short)(0));
      if ( cmbPrvMetTra.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A792PrvMetTra)==0) )
         {
            A792PrvMetTra = httpContext.getMessage( "S", "") ;
            n792PrvMetTra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", A792PrvMetTra);
         }
      }
      cmbPrvDivCod.setName( "PRVDIVCOD" );
      cmbPrvDivCod.setWebtags( "" );
      cmbPrvDivCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      cmbPrvDivCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      if ( cmbPrvDivCod.getItemCount() > 0 )
      {
         A3092PrvDivCod = cmbPrvDivCod.getValidValue(A3092PrvDivCod) ;
         n3092PrvDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", A3092PrvDivCod);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T018A35 */
      pr_default.execute(33, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018A35_A407EmprNom[0] ;
      n407EmprNom = T018A35_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(33);
      GX_FocusControl = edtPrvNom_Internalname ;
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

   public void valid_Prvnum( )
   {
      n3092PrvDivCod = false ;
      A3092PrvDivCod = cmbPrvDivCod.getValue() ;
      n3092PrvDivCod = false ;
      cmbPrvDivCod.setValue( A3092PrvDivCod );
      n795PrvNum = false ;
      n800PrvPri = false ;
      n802PrvTip = false ;
      A802PrvTip = cmbPrvTip.getValue() ;
      n802PrvTip = false ;
      cmbPrvTip.setValue( A802PrvTip );
      n792PrvMetTra = false ;
      A792PrvMetTra = cmbPrvMetTra.getValue() ;
      n792PrvMetTra = false ;
      cmbPrvMetTra.setValue( A792PrvMetTra );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( (0==A795PrvNum) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Erroneo", ""), 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
      }
      dynload_actions( ) ;
      A800PrvPri = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n800PrvPri = false ;
      if ( cmbPrvTip.getItemCount() > 0 )
      {
         A802PrvTip = cmbPrvTip.getValidValue(A802PrvTip) ;
         n802PrvTip = false ;
         cmbPrvTip.setValue( A802PrvTip );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
      }
      if ( cmbPrvMetTra.getItemCount() > 0 )
      {
         A792PrvMetTra = cmbPrvMetTra.getValidValue(A792PrvMetTra) ;
         n792PrvMetTra = false ;
         cmbPrvMetTra.setValue( A792PrvMetTra );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
      }
      if ( cmbPrvDivCod.getItemCount() > 0 )
      {
         A3092PrvDivCod = cmbPrvDivCod.getValidValue(A3092PrvDivCod) ;
         n3092PrvDivCod = false ;
         cmbPrvDivCod.setValue( A3092PrvDivCod );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", GXutil.rtrim( A786PrvDir));
      httpContext.ajax_rsp_assign_attri("", false, "A782PrvCpo", GXutil.rtrim( A782PrvCpo));
      httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", GXutil.rtrim( A799PrvPob));
      httpContext.ajax_rsp_assign_attri("", false, "A793PrvNif", GXutil.rtrim( A793PrvNif));
      httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", GXutil.rtrim( A803PrvTlf));
      httpContext.ajax_rsp_assign_attri("", false, "A800PrvPri", GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", GXutil.rtrim( A804PrvTlx));
      httpContext.ajax_rsp_assign_attri("", false, "A802PrvTip", GXutil.rtrim( A802PrvTip));
      cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvTip.getInternalname(), "Values", cmbPrvTip.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A497FpgCod", GXutil.rtrim( A497FpgCod));
      httpContext.ajax_rsp_assign_attri("", false, "A805PrvVto", GXutil.ltrim( localUtil.ntoc( A805PrvVto, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A785PrvDiaPag", GXutil.ltrim( localUtil.ntoc( A785PrvDiaPag, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A797PrvPer", GXutil.ltrim( localUtil.ntoc( A797PrvPer, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A780PrvBan", GXutil.ltrim( localUtil.ntoc( A780PrvBan, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A801PrvRep", GXutil.rtrim( A801PrvRep));
      httpContext.ajax_rsp_assign_attri("", false, "A798PrvPlaEnt", GXutil.ltrim( localUtil.ntoc( A798PrvPlaEnt, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A792PrvMetTra", GXutil.rtrim( A792PrvMetTra));
      cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A783PrvCta", GXutil.rtrim( A783PrvCta));
      httpContext.ajax_rsp_assign_attri("", false, "A3092PrvDivCod", GXutil.rtrim( A3092PrvDivCod));
      cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrvDivCod.getInternalname(), "Values", cmbPrvDivCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrim( localUtil.ntoc( A3143PrvDivCo, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", GXutil.rtrim( A3314PrvCar));
      httpContext.ajax_rsp_assign_attri("", false, "A6075PrvCp2", GXutil.rtrim( A6075PrvCp2));
      httpContext.ajax_rsp_assign_attri("", false, "A6076PrvFax", GXutil.rtrim( A6076PrvFax));
      httpContext.ajax_rsp_assign_attri("", false, "A6077PrvMail", GXutil.rtrim( A6077PrvMail));
      httpContext.ajax_rsp_assign_attri("", false, "A6570PrvNom2", GXutil.rtrim( A6570PrvNom2));
      httpContext.ajax_rsp_assign_attri("", false, "A6571PrvDir2", GXutil.rtrim( A6571PrvDir2));
      httpContext.ajax_rsp_assign_attri("", false, "A6572PrvContac", A6572PrvContac);
      httpContext.ajax_rsp_assign_attri("", false, "A8160PrvDtoPP", GXutil.ltrim( localUtil.ntoc( A8160PrvDtoPP, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9728Cod_Clas", GXutil.ltrim( localUtil.ntoc( A9728Cod_Clas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10477PrvDiaPgA", GXutil.rtrim( A10477PrvDiaPgA));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", GXutil.rtrim( A498FpgDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", GXutil.rtrim( A9729Des_Clas));
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", GXutil.rtrim( A3144PrvDivAbr));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z786PrvDir", GXutil.rtrim( Z786PrvDir));
      app.GxWebStd.gx_hidden_field( httpContext, "Z782PrvCpo", GXutil.rtrim( Z782PrvCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z799PrvPob", GXutil.rtrim( Z799PrvPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z793PrvNif", GXutil.rtrim( Z793PrvNif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z803PrvTlf", GXutil.rtrim( Z803PrvTlf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z800PrvPri", GXutil.ltrim( localUtil.ntoc( Z800PrvPri, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z804PrvTlx", GXutil.rtrim( Z804PrvTlx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z802PrvTip", GXutil.rtrim( Z802PrvTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z497FpgCod", GXutil.rtrim( Z497FpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z805PrvVto", GXutil.ltrim( localUtil.ntoc( Z805PrvVto, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z785PrvDiaPag", GXutil.ltrim( localUtil.ntoc( Z785PrvDiaPag, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z797PrvPer", GXutil.ltrim( localUtil.ntoc( Z797PrvPer, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z780PrvBan", GXutil.ltrim( localUtil.ntoc( Z780PrvBan, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z801PrvRep", GXutil.rtrim( Z801PrvRep));
      app.GxWebStd.gx_hidden_field( httpContext, "Z798PrvPlaEnt", GXutil.ltrim( localUtil.ntoc( Z798PrvPlaEnt, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z792PrvMetTra", GXutil.rtrim( Z792PrvMetTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z783PrvCta", GXutil.rtrim( Z783PrvCta));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3092PrvDivCod", GXutil.rtrim( Z3092PrvDivCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3143PrvDivCo", GXutil.ltrim( localUtil.ntoc( Z3143PrvDivCo, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3314PrvCar", GXutil.rtrim( Z3314PrvCar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6075PrvCp2", GXutil.rtrim( Z6075PrvCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6076PrvFax", GXutil.rtrim( Z6076PrvFax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6077PrvMail", GXutil.rtrim( Z6077PrvMail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6570PrvNom2", GXutil.rtrim( Z6570PrvNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6571PrvDir2", GXutil.rtrim( Z6571PrvDir2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6572PrvContac", Z6572PrvContac);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8160PrvDtoPP", GXutil.ltrim( localUtil.ntoc( Z8160PrvDtoPP, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9728Cod_Clas", GXutil.ltrim( localUtil.ntoc( Z9728Cod_Clas, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( Z10122GpoEcoCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10477PrvDiaPgA", GXutil.rtrim( Z10477PrvDiaPgA));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z498FpgDsc", GXutil.rtrim( Z498FpgDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9729Des_Clas", GXutil.rtrim( Z9729Des_Clas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10123GpoEcoNom", Z10123GpoEcoNom);
      app.GxWebStd.gx_hidden_field( httpContext, "Z3144PrvDivAbr", GXutil.rtrim( Z3144PrvDivAbr));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fpgcod( )
   {
      n497FpgCod = false ;
      n498FpgDsc = false ;
      /* Using cursor T018A20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A497FpgCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FPGCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFpgCod_Internalname ;
         }
      }
      A498FpgDsc = T018A20_A498FpgDsc[0] ;
      n498FpgDsc = T018A20_n498FpgDsc[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A498FpgDsc", GXutil.rtrim( A498FpgDsc));
   }

   public void valid_Prvdivco( )
   {
      n3144PrvDivAbr = false ;
      /* Using cursor T018A21 */
      pr_default.execute(19, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvDivCo_Internalname ;
      }
      A3144PrvDivAbr = T018A21_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T018A21_n3144PrvDivAbr[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", GXutil.rtrim( A3144PrvDivAbr));
   }

   public void valid_Cod_clas( )
   {
      n9728Cod_Clas = false ;
      n9729Des_Clas = false ;
      /* Using cursor T018A22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9728Cod_Clas) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ISOTB1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_CLAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCod_Clas_Internalname ;
         }
      }
      A9729Des_Clas = T018A22_A9729Des_Clas[0] ;
      n9729Des_Clas = T018A22_n9729Des_Clas[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9729Des_Clas", GXutil.rtrim( A9729Des_Clas));
   }

   public void valid_Gpoecocod( )
   {
      n10122GpoEcoCod = false ;
      n10123GpoEcoNom = false ;
      /* Using cursor T018A23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10122GpoEcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGpoEcoCod_Internalname ;
         }
      }
      A10123GpoEcoNom = T018A23_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T018A23_n10123GpoEcoNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV45Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV46PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV48EmprCod2',fld:'vEMPRCOD2',pic:'@!',hsh:true},{av:'AV49EmprNom2',fld:'vEMPRNOM2',pic:'',hsh:true},{av:'AV51Modo',fld:'vMODO',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e1218A2',iparms:[{av:'AV45Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV46PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV51Modo',fld:'vMODO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV48EmprCod2',fld:'vEMPRCOD2',pic:'@!',hsh:true},{av:'AV49EmprNom2',fld:'vEMPRNOM2',pic:'',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV49EmprNom2',fld:'vEMPRNOM2',pic:'',hsh:true},{av:'AV48EmprCod2',fld:'vEMPRCOD2',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'AV49EmprNom2',fld:'vEMPRNOM2',pic:'',hsh:true},{av:'AV48EmprCod2',fld:'vEMPRCOD2',pic:'@!',hsh:true},{av:'AV46PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV45Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'cmbPrvDivCod'},{av:'A3092PrvDivCod',fld:'PRVDIVCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV51Modo',fld:'vMODO',pic:''},{av:'cmbPrvTip'},{av:'A802PrvTip',fld:'PRVTIP',pic:''},{av:'cmbPrvMetTra'},{av:'A792PrvMetTra',fld:'PRVMETTRA',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A786PrvDir',fld:'PRVDIR',pic:''},{av:'A782PrvCpo',fld:'PRVCPO',pic:''},{av:'A799PrvPob',fld:'PRVPOB',pic:''},{av:'A793PrvNif',fld:'PRVNIF',pic:''},{av:'A803PrvTlf',fld:'PRVTLF',pic:''},{av:'A804PrvTlx',fld:'PRVTLX',pic:''},{av:'cmbPrvTip'},{av:'A802PrvTip',fld:'PRVTIP',pic:''},{av:'A497FpgCod',fld:'FPGCOD',pic:'@!'},{av:'A805PrvVto',fld:'PRVVTO',pic:'Z9'},{av:'A785PrvDiaPag',fld:'PRVDIAPAG',pic:'ZZZZZ9'},{av:'A797PrvPer',fld:'PRVPER',pic:'ZZZZZ9'},{av:'A780PrvBan',fld:'PRVBAN',pic:'ZZZZZ9'},{av:'A801PrvRep',fld:'PRVREP',pic:''},{av:'A798PrvPlaEnt',fld:'PRVPLAENT',pic:'ZZ9'},{av:'cmbPrvMetTra'},{av:'A792PrvMetTra',fld:'PRVMETTRA',pic:''},{av:'A783PrvCta',fld:'PRVCTA',pic:''},{av:'cmbPrvDivCod'},{av:'A3092PrvDivCod',fld:'PRVDIVCOD',pic:''},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A3314PrvCar',fld:'PRVCAR',pic:''},{av:'A6075PrvCp2',fld:'PRVCP2',pic:''},{av:'A6076PrvFax',fld:'PRVFAX',pic:''},{av:'A6077PrvMail',fld:'PRVMAIL',pic:''},{av:'A6570PrvNom2',fld:'PRVNOM2',pic:''},{av:'A6571PrvDir2',fld:'PRVDIR2',pic:''},{av:'A6572PrvContac',fld:'PRVCONTAC',pic:''},{av:'A8160PrvDtoPP',fld:'PRVDTOPP',pic:'ZZ9.99'},{av:'A9728Cod_Clas',fld:'COD_CLAS',pic:'ZZZ9'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'A10477PrvDiaPgA',fld:'PRVDIAPGA',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A498FpgDsc',fld:'FPGDSC',pic:''},{av:'A9729Des_Clas',fld:'DES_CLAS',pic:''},{av:'A10123GpoEcoNom',fld:'GPOECONOM',pic:''},{av:'A3144PrvDivAbr',fld:'PRVDIVABR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z795PrvNum'},{av:'Z794PrvNom'},{av:'Z407EmprNom'},{av:'Z786PrvDir'},{av:'Z782PrvCpo'},{av:'Z799PrvPob'},{av:'Z793PrvNif'},{av:'Z803PrvTlf'},{av:'Z800PrvPri'},{av:'Z804PrvTlx'},{av:'Z802PrvTip'},{av:'Z497FpgCod'},{av:'Z805PrvVto'},{av:'Z785PrvDiaPag'},{av:'Z797PrvPer'},{av:'Z780PrvBan'},{av:'Z801PrvRep'},{av:'Z798PrvPlaEnt'},{av:'Z792PrvMetTra'},{av:'Z783PrvCta'},{av:'Z3092PrvDivCod'},{av:'Z3143PrvDivCo'},{av:'Z3314PrvCar'},{av:'Z6075PrvCp2'},{av:'Z6076PrvFax'},{av:'Z6077PrvMail'},{av:'Z6570PrvNom2'},{av:'Z6571PrvDir2'},{av:'Z6572PrvContac'},{av:'Z8160PrvDtoPP'},{av:'Z9728Cod_Clas'},{av:'Z10122GpoEcoCod'},{av:'Z10477PrvDiaPgA'},{av:'ZV17UsurCod'},{av:'Z498FpgDsc'},{av:'Z9729Des_Clas'},{av:'Z10123GpoEcoNom'},{av:'Z3144PrvDivAbr'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_PRVPRI","{handler:'valid_Prvpri',iparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_PRVPRI",",oparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_PRVTIP","{handler:'valid_Prvtip',iparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_PRVTIP",",oparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_FPGCOD","{handler:'valid_Fpgcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A497FpgCod',fld:'FPGCOD',pic:'@!'},{av:'A498FpgDsc',fld:'FPGDSC',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_FPGCOD",",oparms:[{av:'A498FpgDsc',fld:'FPGDSC',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_PRVMETTRA","{handler:'valid_Prvmettra',iparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_PRVMETTRA",",oparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_PRVDIVCO","{handler:'valid_Prvdivco',iparms:[{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A3144PrvDivAbr',fld:'PRVDIVABR',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_PRVDIVCO",",oparms:[{av:'A3144PrvDivAbr',fld:'PRVDIVABR',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_PRVMAIL","{handler:'valid_Prvmail',iparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_PRVMAIL",",oparms:[{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_COD_CLAS","{handler:'valid_Cod_clas',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9728Cod_Clas',fld:'COD_CLAS',pic:'ZZZ9'},{av:'A9729Des_Clas',fld:'DES_CLAS',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_COD_CLAS",",oparms:[{av:'A9729Des_Clas',fld:'DES_CLAS',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
      setEventMetadata("VALID_GPOECOCOD","{handler:'valid_Gpoecocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'A10123GpoEcoNom',fld:'GPOECONOM',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("VALID_GPOECOCOD",",oparms:[{av:'A10123GpoEcoNom',fld:'GPOECONOM',pic:''},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]}");
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
      pr_default.close(18);
      pr_default.close(20);
      pr_default.close(21);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z794PrvNom = "" ;
      Z786PrvDir = "" ;
      Z782PrvCpo = "" ;
      Z799PrvPob = "" ;
      Z793PrvNif = "" ;
      Z803PrvTlf = "" ;
      Z804PrvTlx = "" ;
      Z802PrvTip = "" ;
      Z801PrvRep = "" ;
      Z792PrvMetTra = "" ;
      Z783PrvCta = "" ;
      Z3092PrvDivCod = "" ;
      Z3314PrvCar = "" ;
      Z6075PrvCp2 = "" ;
      Z6076PrvFax = "" ;
      Z6077PrvMail = "" ;
      Z6570PrvNom2 = "" ;
      Z6571PrvDir2 = "" ;
      Z8160PrvDtoPP = DecimalUtil.ZERO ;
      Z10477PrvDiaPgA = "" ;
      Z497FpgCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A497FpgCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A802PrvTip = "" ;
      A792PrvMetTra = "" ;
      A3092PrvDivCod = "" ;
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
      A794PrvNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A786PrvDir = "" ;
      lblTextblock6_Jsonclick = "" ;
      A782PrvCpo = "" ;
      lblTextblock7_Jsonclick = "" ;
      A799PrvPob = "" ;
      lblTextblock8_Jsonclick = "" ;
      A793PrvNif = "" ;
      lblTextblock9_Jsonclick = "" ;
      A803PrvTlf = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A804PrvTlx = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A498FpgDsc = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A801PrvRep = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A783PrvCta = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A3144PrvDivAbr = "" ;
      lblTextblock26_Jsonclick = "" ;
      A3314PrvCar = "" ;
      lblTextblock27_Jsonclick = "" ;
      A6075PrvCp2 = "" ;
      lblTextblock28_Jsonclick = "" ;
      A6076PrvFax = "" ;
      lblTextblock29_Jsonclick = "" ;
      A6077PrvMail = "" ;
      lblTextblock30_Jsonclick = "" ;
      A6570PrvNom2 = "" ;
      lblTextblock31_Jsonclick = "" ;
      A6571PrvDir2 = "" ;
      lblTextblock32_Jsonclick = "" ;
      A6572PrvContac = "" ;
      lblTextblock33_Jsonclick = "" ;
      A8160PrvDtoPP = DecimalUtil.ZERO ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      A9729Des_Clas = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      A10123GpoEcoNom = "" ;
      lblTextblock38_Jsonclick = "" ;
      A10477PrvDiaPgA = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV51Modo = "" ;
      AV17UsurCod = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV29Lit10 = "" ;
      AV30Lit11 = "" ;
      AV31Lit12 = "" ;
      AV32Lit13 = "" ;
      AV33Lit14 = "" ;
      AV34Lit15 = "" ;
      AV35Lit16 = "" ;
      AV36Lit17 = "" ;
      AV37Lit18 = "" ;
      AV38Lit19 = "" ;
      AV39Lit20 = "" ;
      AV40Lit21 = "" ;
      AV42Lit22 = "" ;
      AV43Lit23 = "" ;
      AV44Lit24 = "" ;
      AV54Lit25 = "" ;
      AV41LitFe = "" ;
      AV52Lit48 = "" ;
      AV53Lit49 = "" ;
      GXt_char1 = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV55Lit50 = "" ;
      AV56Lit26 = "" ;
      AV48EmprCod2 = "" ;
      AV49EmprNom2 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      Z6572PrvContac = "" ;
      Z407EmprNom = "" ;
      Z498FpgDsc = "" ;
      Z3144PrvDivAbr = "" ;
      Z9729Des_Clas = "" ;
      Z10123GpoEcoNom = "" ;
      T018A4_A407EmprNom = new String[] {""} ;
      T018A4_n407EmprNom = new boolean[] {false} ;
      T018A9_A6572PrvContac = new String[] {""} ;
      T018A9_n6572PrvContac = new boolean[] {false} ;
      T018A9_A795PrvNum = new int[1] ;
      T018A9_n795PrvNum = new boolean[] {false} ;
      T018A9_A794PrvNom = new String[] {""} ;
      T018A9_n794PrvNom = new boolean[] {false} ;
      T018A9_A407EmprNom = new String[] {""} ;
      T018A9_n407EmprNom = new boolean[] {false} ;
      T018A9_A786PrvDir = new String[] {""} ;
      T018A9_n786PrvDir = new boolean[] {false} ;
      T018A9_A782PrvCpo = new String[] {""} ;
      T018A9_n782PrvCpo = new boolean[] {false} ;
      T018A9_A799PrvPob = new String[] {""} ;
      T018A9_n799PrvPob = new boolean[] {false} ;
      T018A9_A793PrvNif = new String[] {""} ;
      T018A9_n793PrvNif = new boolean[] {false} ;
      T018A9_A803PrvTlf = new String[] {""} ;
      T018A9_n803PrvTlf = new boolean[] {false} ;
      T018A9_A800PrvPri = new byte[1] ;
      T018A9_n800PrvPri = new boolean[] {false} ;
      T018A9_A804PrvTlx = new String[] {""} ;
      T018A9_n804PrvTlx = new boolean[] {false} ;
      T018A9_A802PrvTip = new String[] {""} ;
      T018A9_n802PrvTip = new boolean[] {false} ;
      T018A9_A498FpgDsc = new String[] {""} ;
      T018A9_n498FpgDsc = new boolean[] {false} ;
      T018A9_A805PrvVto = new byte[1] ;
      T018A9_n805PrvVto = new boolean[] {false} ;
      T018A9_A785PrvDiaPag = new int[1] ;
      T018A9_n785PrvDiaPag = new boolean[] {false} ;
      T018A9_A797PrvPer = new int[1] ;
      T018A9_n797PrvPer = new boolean[] {false} ;
      T018A9_A780PrvBan = new int[1] ;
      T018A9_n780PrvBan = new boolean[] {false} ;
      T018A9_A801PrvRep = new String[] {""} ;
      T018A9_n801PrvRep = new boolean[] {false} ;
      T018A9_A798PrvPlaEnt = new short[1] ;
      T018A9_n798PrvPlaEnt = new boolean[] {false} ;
      T018A9_A792PrvMetTra = new String[] {""} ;
      T018A9_n792PrvMetTra = new boolean[] {false} ;
      T018A9_A783PrvCta = new String[] {""} ;
      T018A9_n783PrvCta = new boolean[] {false} ;
      T018A9_A3092PrvDivCod = new String[] {""} ;
      T018A9_n3092PrvDivCod = new boolean[] {false} ;
      T018A9_A3144PrvDivAbr = new String[] {""} ;
      T018A9_n3144PrvDivAbr = new boolean[] {false} ;
      T018A9_A3314PrvCar = new String[] {""} ;
      T018A9_n3314PrvCar = new boolean[] {false} ;
      T018A9_A6075PrvCp2 = new String[] {""} ;
      T018A9_n6075PrvCp2 = new boolean[] {false} ;
      T018A9_A6076PrvFax = new String[] {""} ;
      T018A9_n6076PrvFax = new boolean[] {false} ;
      T018A9_A6077PrvMail = new String[] {""} ;
      T018A9_n6077PrvMail = new boolean[] {false} ;
      T018A9_A6570PrvNom2 = new String[] {""} ;
      T018A9_n6570PrvNom2 = new boolean[] {false} ;
      T018A9_A6571PrvDir2 = new String[] {""} ;
      T018A9_n6571PrvDir2 = new boolean[] {false} ;
      T018A9_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018A9_n8160PrvDtoPP = new boolean[] {false} ;
      T018A9_A9729Des_Clas = new String[] {""} ;
      T018A9_n9729Des_Clas = new boolean[] {false} ;
      T018A9_A10123GpoEcoNom = new String[] {""} ;
      T018A9_n10123GpoEcoNom = new boolean[] {false} ;
      T018A9_A10477PrvDiaPgA = new String[] {""} ;
      T018A9_n10477PrvDiaPgA = new boolean[] {false} ;
      T018A9_A396EmprCod = new String[] {""} ;
      T018A9_A497FpgCod = new String[] {""} ;
      T018A9_n497FpgCod = new boolean[] {false} ;
      T018A9_A9728Cod_Clas = new short[1] ;
      T018A9_n9728Cod_Clas = new boolean[] {false} ;
      T018A9_A10122GpoEcoCod = new int[1] ;
      T018A9_n10122GpoEcoCod = new boolean[] {false} ;
      T018A9_A3143PrvDivCo = new byte[1] ;
      T018A5_A498FpgDsc = new String[] {""} ;
      T018A5_n498FpgDsc = new boolean[] {false} ;
      T018A6_A9729Des_Clas = new String[] {""} ;
      T018A6_n9729Des_Clas = new boolean[] {false} ;
      T018A7_A10123GpoEcoNom = new String[] {""} ;
      T018A7_n10123GpoEcoNom = new boolean[] {false} ;
      T018A8_A3144PrvDivAbr = new String[] {""} ;
      T018A8_n3144PrvDivAbr = new boolean[] {false} ;
      T018A10_A498FpgDsc = new String[] {""} ;
      T018A10_n498FpgDsc = new boolean[] {false} ;
      T018A11_A9729Des_Clas = new String[] {""} ;
      T018A11_n9729Des_Clas = new boolean[] {false} ;
      T018A12_A10123GpoEcoNom = new String[] {""} ;
      T018A12_n10123GpoEcoNom = new boolean[] {false} ;
      T018A13_A3144PrvDivAbr = new String[] {""} ;
      T018A13_n3144PrvDivAbr = new boolean[] {false} ;
      T018A14_A396EmprCod = new String[] {""} ;
      T018A14_A795PrvNum = new int[1] ;
      T018A14_n795PrvNum = new boolean[] {false} ;
      T018A3_A6572PrvContac = new String[] {""} ;
      T018A3_n6572PrvContac = new boolean[] {false} ;
      T018A3_A795PrvNum = new int[1] ;
      T018A3_n795PrvNum = new boolean[] {false} ;
      T018A3_A794PrvNom = new String[] {""} ;
      T018A3_n794PrvNom = new boolean[] {false} ;
      T018A3_A786PrvDir = new String[] {""} ;
      T018A3_n786PrvDir = new boolean[] {false} ;
      T018A3_A782PrvCpo = new String[] {""} ;
      T018A3_n782PrvCpo = new boolean[] {false} ;
      T018A3_A799PrvPob = new String[] {""} ;
      T018A3_n799PrvPob = new boolean[] {false} ;
      T018A3_A793PrvNif = new String[] {""} ;
      T018A3_n793PrvNif = new boolean[] {false} ;
      T018A3_A803PrvTlf = new String[] {""} ;
      T018A3_n803PrvTlf = new boolean[] {false} ;
      T018A3_A800PrvPri = new byte[1] ;
      T018A3_n800PrvPri = new boolean[] {false} ;
      T018A3_A804PrvTlx = new String[] {""} ;
      T018A3_n804PrvTlx = new boolean[] {false} ;
      T018A3_A802PrvTip = new String[] {""} ;
      T018A3_n802PrvTip = new boolean[] {false} ;
      T018A3_A805PrvVto = new byte[1] ;
      T018A3_n805PrvVto = new boolean[] {false} ;
      T018A3_A785PrvDiaPag = new int[1] ;
      T018A3_n785PrvDiaPag = new boolean[] {false} ;
      T018A3_A797PrvPer = new int[1] ;
      T018A3_n797PrvPer = new boolean[] {false} ;
      T018A3_A780PrvBan = new int[1] ;
      T018A3_n780PrvBan = new boolean[] {false} ;
      T018A3_A801PrvRep = new String[] {""} ;
      T018A3_n801PrvRep = new boolean[] {false} ;
      T018A3_A798PrvPlaEnt = new short[1] ;
      T018A3_n798PrvPlaEnt = new boolean[] {false} ;
      T018A3_A792PrvMetTra = new String[] {""} ;
      T018A3_n792PrvMetTra = new boolean[] {false} ;
      T018A3_A783PrvCta = new String[] {""} ;
      T018A3_n783PrvCta = new boolean[] {false} ;
      T018A3_A3092PrvDivCod = new String[] {""} ;
      T018A3_n3092PrvDivCod = new boolean[] {false} ;
      T018A3_A3314PrvCar = new String[] {""} ;
      T018A3_n3314PrvCar = new boolean[] {false} ;
      T018A3_A6075PrvCp2 = new String[] {""} ;
      T018A3_n6075PrvCp2 = new boolean[] {false} ;
      T018A3_A6076PrvFax = new String[] {""} ;
      T018A3_n6076PrvFax = new boolean[] {false} ;
      T018A3_A6077PrvMail = new String[] {""} ;
      T018A3_n6077PrvMail = new boolean[] {false} ;
      T018A3_A6570PrvNom2 = new String[] {""} ;
      T018A3_n6570PrvNom2 = new boolean[] {false} ;
      T018A3_A6571PrvDir2 = new String[] {""} ;
      T018A3_n6571PrvDir2 = new boolean[] {false} ;
      T018A3_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018A3_n8160PrvDtoPP = new boolean[] {false} ;
      T018A3_A10477PrvDiaPgA = new String[] {""} ;
      T018A3_n10477PrvDiaPgA = new boolean[] {false} ;
      T018A3_A396EmprCod = new String[] {""} ;
      T018A3_A497FpgCod = new String[] {""} ;
      T018A3_n497FpgCod = new boolean[] {false} ;
      T018A3_A9728Cod_Clas = new short[1] ;
      T018A3_n9728Cod_Clas = new boolean[] {false} ;
      T018A3_A10122GpoEcoCod = new int[1] ;
      T018A3_n10122GpoEcoCod = new boolean[] {false} ;
      T018A3_A3143PrvDivCo = new byte[1] ;
      sMode94 = "" ;
      T018A15_A396EmprCod = new String[] {""} ;
      T018A15_A795PrvNum = new int[1] ;
      T018A15_n795PrvNum = new boolean[] {false} ;
      T018A16_A396EmprCod = new String[] {""} ;
      T018A16_A795PrvNum = new int[1] ;
      T018A16_n795PrvNum = new boolean[] {false} ;
      T018A2_A6572PrvContac = new String[] {""} ;
      T018A2_n6572PrvContac = new boolean[] {false} ;
      T018A2_A795PrvNum = new int[1] ;
      T018A2_n795PrvNum = new boolean[] {false} ;
      T018A2_A794PrvNom = new String[] {""} ;
      T018A2_n794PrvNom = new boolean[] {false} ;
      T018A2_A786PrvDir = new String[] {""} ;
      T018A2_n786PrvDir = new boolean[] {false} ;
      T018A2_A782PrvCpo = new String[] {""} ;
      T018A2_n782PrvCpo = new boolean[] {false} ;
      T018A2_A799PrvPob = new String[] {""} ;
      T018A2_n799PrvPob = new boolean[] {false} ;
      T018A2_A793PrvNif = new String[] {""} ;
      T018A2_n793PrvNif = new boolean[] {false} ;
      T018A2_A803PrvTlf = new String[] {""} ;
      T018A2_n803PrvTlf = new boolean[] {false} ;
      T018A2_A800PrvPri = new byte[1] ;
      T018A2_n800PrvPri = new boolean[] {false} ;
      T018A2_A804PrvTlx = new String[] {""} ;
      T018A2_n804PrvTlx = new boolean[] {false} ;
      T018A2_A802PrvTip = new String[] {""} ;
      T018A2_n802PrvTip = new boolean[] {false} ;
      T018A2_A805PrvVto = new byte[1] ;
      T018A2_n805PrvVto = new boolean[] {false} ;
      T018A2_A785PrvDiaPag = new int[1] ;
      T018A2_n785PrvDiaPag = new boolean[] {false} ;
      T018A2_A797PrvPer = new int[1] ;
      T018A2_n797PrvPer = new boolean[] {false} ;
      T018A2_A780PrvBan = new int[1] ;
      T018A2_n780PrvBan = new boolean[] {false} ;
      T018A2_A801PrvRep = new String[] {""} ;
      T018A2_n801PrvRep = new boolean[] {false} ;
      T018A2_A798PrvPlaEnt = new short[1] ;
      T018A2_n798PrvPlaEnt = new boolean[] {false} ;
      T018A2_A792PrvMetTra = new String[] {""} ;
      T018A2_n792PrvMetTra = new boolean[] {false} ;
      T018A2_A783PrvCta = new String[] {""} ;
      T018A2_n783PrvCta = new boolean[] {false} ;
      T018A2_A3092PrvDivCod = new String[] {""} ;
      T018A2_n3092PrvDivCod = new boolean[] {false} ;
      T018A2_A3314PrvCar = new String[] {""} ;
      T018A2_n3314PrvCar = new boolean[] {false} ;
      T018A2_A6075PrvCp2 = new String[] {""} ;
      T018A2_n6075PrvCp2 = new boolean[] {false} ;
      T018A2_A6076PrvFax = new String[] {""} ;
      T018A2_n6076PrvFax = new boolean[] {false} ;
      T018A2_A6077PrvMail = new String[] {""} ;
      T018A2_n6077PrvMail = new boolean[] {false} ;
      T018A2_A6570PrvNom2 = new String[] {""} ;
      T018A2_n6570PrvNom2 = new boolean[] {false} ;
      T018A2_A6571PrvDir2 = new String[] {""} ;
      T018A2_n6571PrvDir2 = new boolean[] {false} ;
      T018A2_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018A2_n8160PrvDtoPP = new boolean[] {false} ;
      T018A2_A10477PrvDiaPgA = new String[] {""} ;
      T018A2_n10477PrvDiaPgA = new boolean[] {false} ;
      T018A2_A396EmprCod = new String[] {""} ;
      T018A2_A497FpgCod = new String[] {""} ;
      T018A2_n497FpgCod = new boolean[] {false} ;
      T018A2_A9728Cod_Clas = new short[1] ;
      T018A2_n9728Cod_Clas = new boolean[] {false} ;
      T018A2_A10122GpoEcoCod = new int[1] ;
      T018A2_n10122GpoEcoCod = new boolean[] {false} ;
      T018A2_A3143PrvDivCo = new byte[1] ;
      T018A20_A498FpgDsc = new String[] {""} ;
      T018A20_n498FpgDsc = new boolean[] {false} ;
      T018A21_A3144PrvDivAbr = new String[] {""} ;
      T018A21_n3144PrvDivAbr = new boolean[] {false} ;
      T018A22_A9729Des_Clas = new String[] {""} ;
      T018A22_n9729Des_Clas = new boolean[] {false} ;
      T018A23_A10123GpoEcoNom = new String[] {""} ;
      T018A23_n10123GpoEcoNom = new boolean[] {false} ;
      T018A24_A396EmprCod = new String[] {""} ;
      T018A24_A13418AlbProID = new int[1] ;
      T018A25_A396EmprCod = new String[] {""} ;
      T018A25_A12205OrdenCID = new long[1] ;
      T018A26_A396EmprCod = new String[] {""} ;
      T018A26_A9492MRCod = new int[1] ;
      T018A26_A795PrvNum = new int[1] ;
      T018A26_n795PrvNum = new boolean[] {false} ;
      T018A27_A396EmprCod = new String[] {""} ;
      T018A27_A11055MComCod = new long[1] ;
      T018A28_A396EmprCod = new String[] {""} ;
      T018A28_A9412MMSCod = new int[1] ;
      T018A29_A396EmprCod = new String[] {""} ;
      T018A29_A795PrvNum = new int[1] ;
      T018A29_n795PrvNum = new boolean[] {false} ;
      T018A29_A6146PrvPAny = new short[1] ;
      T018A29_A6147PrvPPr = new String[] {""} ;
      T018A30_A396EmprCod = new String[] {""} ;
      T018A30_A1387AlbPrvCod = new int[1] ;
      T018A31_A396EmprCod = new String[] {""} ;
      T018A31_A795PrvNum = new int[1] ;
      T018A31_n795PrvNum = new boolean[] {false} ;
      T018A31_A779PrvAny = new short[1] ;
      T018A32_A396EmprCod = new String[] {""} ;
      T018A32_A658PedCod = new int[1] ;
      T018A33_A396EmprCod = new String[] {""} ;
      T018A33_A719PrdNum = new String[] {""} ;
      T018A34_A396EmprCod = new String[] {""} ;
      T018A34_A795PrvNum = new int[1] ;
      T018A34_n795PrvNum = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV51Modo = "" ;
      i802PrvTip = "" ;
      i792PrvMetTra = "" ;
      T018A35_A407EmprNom = new String[] {""} ;
      T018A35_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ794PrvNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ786PrvDir = "" ;
      ZZ782PrvCpo = "" ;
      ZZ799PrvPob = "" ;
      ZZ793PrvNif = "" ;
      ZZ803PrvTlf = "" ;
      ZZ804PrvTlx = "" ;
      ZZ802PrvTip = "" ;
      ZZ497FpgCod = "" ;
      ZZ801PrvRep = "" ;
      ZZ792PrvMetTra = "" ;
      ZZ783PrvCta = "" ;
      ZZ3092PrvDivCod = "" ;
      ZZ3314PrvCar = "" ;
      ZZ6075PrvCp2 = "" ;
      ZZ6076PrvFax = "" ;
      ZZ6077PrvMail = "" ;
      ZZ6570PrvNom2 = "" ;
      ZZ6571PrvDir2 = "" ;
      ZZ6572PrvContac = "" ;
      ZZ8160PrvDtoPP = DecimalUtil.ZERO ;
      ZZ10477PrvDiaPgA = "" ;
      ZZV17UsurCod = "" ;
      ZZ498FpgDsc = "" ;
      ZZ9729Des_Clas = "" ;
      ZZ10123GpoEcoNom = "" ;
      ZZ3144PrvDivAbr = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tproved__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tproved__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tproved__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tproved__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tproved__default(),
         new Object[] {
             new Object[] {
            T018A2_A6572PrvContac, T018A2_n6572PrvContac, T018A2_A795PrvNum, T018A2_A794PrvNom, T018A2_n794PrvNom, T018A2_A786PrvDir, T018A2_n786PrvDir, T018A2_A782PrvCpo, T018A2_n782PrvCpo, T018A2_A799PrvPob,
            T018A2_n799PrvPob, T018A2_A793PrvNif, T018A2_n793PrvNif, T018A2_A803PrvTlf, T018A2_n803PrvTlf, T018A2_A800PrvPri, T018A2_n800PrvPri, T018A2_A804PrvTlx, T018A2_n804PrvTlx, T018A2_A802PrvTip,
            T018A2_n802PrvTip, T018A2_A805PrvVto, T018A2_n805PrvVto, T018A2_A785PrvDiaPag, T018A2_n785PrvDiaPag, T018A2_A797PrvPer, T018A2_n797PrvPer, T018A2_A780PrvBan, T018A2_n780PrvBan, T018A2_A801PrvRep,
            T018A2_n801PrvRep, T018A2_A798PrvPlaEnt, T018A2_n798PrvPlaEnt, T018A2_A792PrvMetTra, T018A2_n792PrvMetTra, T018A2_A783PrvCta, T018A2_n783PrvCta, T018A2_A3092PrvDivCod, T018A2_n3092PrvDivCod, T018A2_A3314PrvCar,
            T018A2_n3314PrvCar, T018A2_A6075PrvCp2, T018A2_n6075PrvCp2, T018A2_A6076PrvFax, T018A2_n6076PrvFax, T018A2_A6077PrvMail, T018A2_n6077PrvMail, T018A2_A6570PrvNom2, T018A2_n6570PrvNom2, T018A2_A6571PrvDir2,
            T018A2_n6571PrvDir2, T018A2_A8160PrvDtoPP, T018A2_n8160PrvDtoPP, T018A2_A10477PrvDiaPgA, T018A2_n10477PrvDiaPgA, T018A2_A396EmprCod, T018A2_A497FpgCod, T018A2_n497FpgCod, T018A2_A9728Cod_Clas, T018A2_n9728Cod_Clas,
            T018A2_A10122GpoEcoCod, T018A2_n10122GpoEcoCod, T018A2_A3143PrvDivCo
            }
            , new Object[] {
            T018A3_A6572PrvContac, T018A3_n6572PrvContac, T018A3_A795PrvNum, T018A3_A794PrvNom, T018A3_n794PrvNom, T018A3_A786PrvDir, T018A3_n786PrvDir, T018A3_A782PrvCpo, T018A3_n782PrvCpo, T018A3_A799PrvPob,
            T018A3_n799PrvPob, T018A3_A793PrvNif, T018A3_n793PrvNif, T018A3_A803PrvTlf, T018A3_n803PrvTlf, T018A3_A800PrvPri, T018A3_n800PrvPri, T018A3_A804PrvTlx, T018A3_n804PrvTlx, T018A3_A802PrvTip,
            T018A3_n802PrvTip, T018A3_A805PrvVto, T018A3_n805PrvVto, T018A3_A785PrvDiaPag, T018A3_n785PrvDiaPag, T018A3_A797PrvPer, T018A3_n797PrvPer, T018A3_A780PrvBan, T018A3_n780PrvBan, T018A3_A801PrvRep,
            T018A3_n801PrvRep, T018A3_A798PrvPlaEnt, T018A3_n798PrvPlaEnt, T018A3_A792PrvMetTra, T018A3_n792PrvMetTra, T018A3_A783PrvCta, T018A3_n783PrvCta, T018A3_A3092PrvDivCod, T018A3_n3092PrvDivCod, T018A3_A3314PrvCar,
            T018A3_n3314PrvCar, T018A3_A6075PrvCp2, T018A3_n6075PrvCp2, T018A3_A6076PrvFax, T018A3_n6076PrvFax, T018A3_A6077PrvMail, T018A3_n6077PrvMail, T018A3_A6570PrvNom2, T018A3_n6570PrvNom2, T018A3_A6571PrvDir2,
            T018A3_n6571PrvDir2, T018A3_A8160PrvDtoPP, T018A3_n8160PrvDtoPP, T018A3_A10477PrvDiaPgA, T018A3_n10477PrvDiaPgA, T018A3_A396EmprCod, T018A3_A497FpgCod, T018A3_n497FpgCod, T018A3_A9728Cod_Clas, T018A3_n9728Cod_Clas,
            T018A3_A10122GpoEcoCod, T018A3_n10122GpoEcoCod, T018A3_A3143PrvDivCo
            }
            , new Object[] {
            T018A4_A407EmprNom, T018A4_n407EmprNom
            }
            , new Object[] {
            T018A5_A498FpgDsc, T018A5_n498FpgDsc
            }
            , new Object[] {
            T018A6_A9729Des_Clas, T018A6_n9729Des_Clas
            }
            , new Object[] {
            T018A7_A10123GpoEcoNom, T018A7_n10123GpoEcoNom
            }
            , new Object[] {
            T018A8_A3144PrvDivAbr, T018A8_n3144PrvDivAbr
            }
            , new Object[] {
            T018A9_A6572PrvContac, T018A9_n6572PrvContac, T018A9_A795PrvNum, T018A9_A794PrvNom, T018A9_n794PrvNom, T018A9_A407EmprNom, T018A9_n407EmprNom, T018A9_A786PrvDir, T018A9_n786PrvDir, T018A9_A782PrvCpo,
            T018A9_n782PrvCpo, T018A9_A799PrvPob, T018A9_n799PrvPob, T018A9_A793PrvNif, T018A9_n793PrvNif, T018A9_A803PrvTlf, T018A9_n803PrvTlf, T018A9_A800PrvPri, T018A9_n800PrvPri, T018A9_A804PrvTlx,
            T018A9_n804PrvTlx, T018A9_A802PrvTip, T018A9_n802PrvTip, T018A9_A498FpgDsc, T018A9_n498FpgDsc, T018A9_A805PrvVto, T018A9_n805PrvVto, T018A9_A785PrvDiaPag, T018A9_n785PrvDiaPag, T018A9_A797PrvPer,
            T018A9_n797PrvPer, T018A9_A780PrvBan, T018A9_n780PrvBan, T018A9_A801PrvRep, T018A9_n801PrvRep, T018A9_A798PrvPlaEnt, T018A9_n798PrvPlaEnt, T018A9_A792PrvMetTra, T018A9_n792PrvMetTra, T018A9_A783PrvCta,
            T018A9_n783PrvCta, T018A9_A3092PrvDivCod, T018A9_n3092PrvDivCod, T018A9_A3144PrvDivAbr, T018A9_n3144PrvDivAbr, T018A9_A3314PrvCar, T018A9_n3314PrvCar, T018A9_A6075PrvCp2, T018A9_n6075PrvCp2, T018A9_A6076PrvFax,
            T018A9_n6076PrvFax, T018A9_A6077PrvMail, T018A9_n6077PrvMail, T018A9_A6570PrvNom2, T018A9_n6570PrvNom2, T018A9_A6571PrvDir2, T018A9_n6571PrvDir2, T018A9_A8160PrvDtoPP, T018A9_n8160PrvDtoPP, T018A9_A9729Des_Clas,
            T018A9_n9729Des_Clas, T018A9_A10123GpoEcoNom, T018A9_n10123GpoEcoNom, T018A9_A10477PrvDiaPgA, T018A9_n10477PrvDiaPgA, T018A9_A396EmprCod, T018A9_A497FpgCod, T018A9_n497FpgCod, T018A9_A9728Cod_Clas, T018A9_n9728Cod_Clas,
            T018A9_A10122GpoEcoCod, T018A9_n10122GpoEcoCod, T018A9_A3143PrvDivCo
            }
            , new Object[] {
            T018A10_A498FpgDsc, T018A10_n498FpgDsc
            }
            , new Object[] {
            T018A11_A9729Des_Clas, T018A11_n9729Des_Clas
            }
            , new Object[] {
            T018A12_A10123GpoEcoNom, T018A12_n10123GpoEcoNom
            }
            , new Object[] {
            T018A13_A3144PrvDivAbr, T018A13_n3144PrvDivAbr
            }
            , new Object[] {
            T018A14_A396EmprCod, T018A14_A795PrvNum
            }
            , new Object[] {
            T018A15_A396EmprCod, T018A15_A795PrvNum
            }
            , new Object[] {
            T018A16_A396EmprCod, T018A16_A795PrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018A20_A498FpgDsc, T018A20_n498FpgDsc
            }
            , new Object[] {
            T018A21_A3144PrvDivAbr, T018A21_n3144PrvDivAbr
            }
            , new Object[] {
            T018A22_A9729Des_Clas, T018A22_n9729Des_Clas
            }
            , new Object[] {
            T018A23_A10123GpoEcoNom, T018A23_n10123GpoEcoNom
            }
            , new Object[] {
            T018A24_A396EmprCod, T018A24_A13418AlbProID
            }
            , new Object[] {
            T018A25_A396EmprCod, T018A25_A12205OrdenCID
            }
            , new Object[] {
            T018A26_A396EmprCod, T018A26_A9492MRCod, T018A26_A795PrvNum
            }
            , new Object[] {
            T018A27_A396EmprCod, T018A27_A11055MComCod
            }
            , new Object[] {
            T018A28_A396EmprCod, T018A28_A9412MMSCod
            }
            , new Object[] {
            T018A29_A396EmprCod, T018A29_A795PrvNum, T018A29_A6146PrvPAny, T018A29_A6147PrvPPr
            }
            , new Object[] {
            T018A30_A396EmprCod, T018A30_A1387AlbPrvCod
            }
            , new Object[] {
            T018A31_A396EmprCod, T018A31_A795PrvNum, T018A31_A779PrvAny
            }
            , new Object[] {
            T018A32_A396EmprCod, T018A32_A658PedCod
            }
            , new Object[] {
            T018A33_A396EmprCod, T018A33_A719PrdNum
            }
            , new Object[] {
            T018A34_A396EmprCod, T018A34_A795PrvNum
            }
            , new Object[] {
            T018A35_A407EmprNom, T018A35_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z792PrvMetTra = httpContext.getMessage( "S", "") ;
      n792PrvMetTra = false ;
      A792PrvMetTra = httpContext.getMessage( "S", "") ;
      n792PrvMetTra = false ;
      i792PrvMetTra = httpContext.getMessage( "S", "") ;
      n792PrvMetTra = false ;
      Z802PrvTip = httpContext.getMessage( "P", "") ;
      n802PrvTip = false ;
      A802PrvTip = httpContext.getMessage( "P", "") ;
      n802PrvTip = false ;
      i802PrvTip = httpContext.getMessage( "P", "") ;
      n802PrvTip = false ;
      Z800PrvPri = (byte)(1) ;
      n800PrvPri = false ;
      A800PrvPri = (byte)(1) ;
      n800PrvPri = false ;
      i800PrvPri = (byte)(1) ;
      n800PrvPri = false ;
   }

   private byte Z800PrvPri ;
   private byte Z805PrvVto ;
   private byte Z3143PrvDivCo ;
   private byte GxWebError ;
   private byte A3143PrvDivCo ;
   private byte nKeyPressed ;
   private byte A800PrvPri ;
   private byte A805PrvVto ;
   private byte Gx_BScreen ;
   private byte AV45Salayet ;
   private byte AV46PLinea ;
   private byte AV57Rontaltex ;
   private byte GXt_int5 ;
   private byte AV47Flag_Emp2 ;
   private byte AV50Flag_Prv ;
   private byte GXv_int6[] ;
   private byte gxajaxcallmode ;
   private byte i800PrvPri ;
   private byte ZZ800PrvPri ;
   private byte ZZ805PrvVto ;
   private byte ZZ3143PrvDivCo ;
   private short Z798PrvPlaEnt ;
   private short Z9728Cod_Clas ;
   private short A9728Cod_Clas ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A798PrvPlaEnt ;
   private short RcdFound94 ;
   private short nIsDirty_94 ;
   private short ZZ798PrvPlaEnt ;
   private short ZZ9728Cod_Clas ;
   private int Z795PrvNum ;
   private int Z785PrvDiaPag ;
   private int Z797PrvPer ;
   private int Z780PrvBan ;
   private int Z10122GpoEcoCod ;
   private int A10122GpoEcoCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A795PrvNum ;
   private int edtPrvNum_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrvDir_Enabled ;
   private int edtPrvCpo_Enabled ;
   private int edtPrvPob_Enabled ;
   private int edtPrvNif_Enabled ;
   private int edtPrvTlf_Enabled ;
   private int edtPrvTlx_Enabled ;
   private int edtFpgCod_Enabled ;
   private int edtFpgDsc_Enabled ;
   private int edtPrvVto_Enabled ;
   private int A785PrvDiaPag ;
   private int edtPrvDiaPag_Enabled ;
   private int A797PrvPer ;
   private int edtPrvPer_Enabled ;
   private int A780PrvBan ;
   private int edtPrvBan_Enabled ;
   private int edtPrvRep_Enabled ;
   private int edtPrvPlaEnt_Enabled ;
   private int edtPrvCta_Enabled ;
   private int edtPrvDivCo_Enabled ;
   private int edtPrvDivAbr_Enabled ;
   private int edtPrvCar_Enabled ;
   private int edtPrvCp2_Enabled ;
   private int edtPrvFax_Enabled ;
   private int edtPrvMail_Enabled ;
   private int edtPrvNom2_Enabled ;
   private int edtPrvDir2_Enabled ;
   private int edtPrvContac_Enabled ;
   private int edtPrvDtoPP_Enabled ;
   private int edtCod_Clas_Enabled ;
   private int edtDes_Clas_Enabled ;
   private int edtGpoEcoCod_Enabled ;
   private int edtGpoEcoCod_Visible ;
   private int edtGpoEcoNom_Visible ;
   private int edtGpoEcoNom_Enabled ;
   private int edtPrvDiaPgA_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GX_JID ;
   private int idxLst ;
   private int edtPrvDiaPgA_Backcolor ;
   private int edtGpoEcoNom_Backcolor ;
   private int edtGpoEcoCod_Backcolor ;
   private int edtDes_Clas_Backcolor ;
   private int edtCod_Clas_Backcolor ;
   private int edtPrvDtoPP_Backcolor ;
   private int edtPrvContac_Backcolor ;
   private int edtPrvDir2_Backcolor ;
   private int edtPrvNom2_Backcolor ;
   private int edtPrvMail_Backcolor ;
   private int edtPrvFax_Backcolor ;
   private int edtPrvCp2_Backcolor ;
   private int edtPrvCar_Backcolor ;
   private int edtPrvDivAbr_Backcolor ;
   private int edtPrvDivCo_Backcolor ;
   private int edtPrvCta_Backcolor ;
   private int edtPrvPlaEnt_Backcolor ;
   private int edtPrvRep_Backcolor ;
   private int edtPrvBan_Backcolor ;
   private int edtPrvPer_Backcolor ;
   private int edtPrvDiaPag_Backcolor ;
   private int edtPrvVto_Backcolor ;
   private int edtFpgDsc_Backcolor ;
   private int edtFpgCod_Backcolor ;
   private int edtPrvTlx_Backcolor ;
   private int edtPrvTlf_Backcolor ;
   private int edtPrvNif_Backcolor ;
   private int edtPrvPob_Backcolor ;
   private int edtPrvCpo_Backcolor ;
   private int edtPrvDir_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPrvNom_Backcolor ;
   private int edtPrvNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ795PrvNum ;
   private int ZZ785PrvDiaPag ;
   private int ZZ797PrvPer ;
   private int ZZ780PrvBan ;
   private int ZZ10122GpoEcoCod ;
   private java.math.BigDecimal Z8160PrvDtoPP ;
   private java.math.BigDecimal A8160PrvDtoPP ;
   private java.math.BigDecimal ZZ8160PrvDtoPP ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z794PrvNom ;
   private String Z786PrvDir ;
   private String Z782PrvCpo ;
   private String Z799PrvPob ;
   private String Z793PrvNif ;
   private String Z803PrvTlf ;
   private String Z804PrvTlx ;
   private String Z802PrvTip ;
   private String Z801PrvRep ;
   private String Z792PrvMetTra ;
   private String Z783PrvCta ;
   private String Z3092PrvDivCod ;
   private String Z3314PrvCar ;
   private String Z6075PrvCp2 ;
   private String Z6076PrvFax ;
   private String Z6077PrvMail ;
   private String Z6570PrvNom2 ;
   private String Z6571PrvDir2 ;
   private String Z10477PrvDiaPgA ;
   private String Z497FpgCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A497FpgCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrvNum_Internalname ;
   private String A802PrvTip ;
   private String A792PrvMetTra ;
   private String A3092PrvDivCod ;
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
   private String edtPrvNum_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPrvDir_Internalname ;
   private String A786PrvDir ;
   private String edtPrvDir_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPrvCpo_Internalname ;
   private String A782PrvCpo ;
   private String edtPrvCpo_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPrvPob_Internalname ;
   private String A799PrvPob ;
   private String edtPrvPob_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPrvNif_Internalname ;
   private String A793PrvNif ;
   private String edtPrvNif_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPrvTlf_Internalname ;
   private String A803PrvTlf ;
   private String edtPrvTlf_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPrvTlx_Internalname ;
   private String A804PrvTlx ;
   private String edtPrvTlx_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtFpgCod_Internalname ;
   private String edtFpgCod_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtFpgDsc_Internalname ;
   private String A498FpgDsc ;
   private String edtFpgDsc_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtPrvVto_Internalname ;
   private String edtPrvVto_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtPrvDiaPag_Internalname ;
   private String edtPrvDiaPag_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtPrvPer_Internalname ;
   private String edtPrvPer_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtPrvBan_Internalname ;
   private String edtPrvBan_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtPrvRep_Internalname ;
   private String A801PrvRep ;
   private String edtPrvRep_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtPrvPlaEnt_Internalname ;
   private String edtPrvPlaEnt_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtPrvCta_Internalname ;
   private String A783PrvCta ;
   private String edtPrvCta_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtPrvDivCo_Internalname ;
   private String edtPrvDivCo_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtPrvDivAbr_Internalname ;
   private String A3144PrvDivAbr ;
   private String edtPrvDivAbr_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtPrvCar_Internalname ;
   private String A3314PrvCar ;
   private String edtPrvCar_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtPrvCp2_Internalname ;
   private String A6075PrvCp2 ;
   private String edtPrvCp2_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtPrvFax_Internalname ;
   private String A6076PrvFax ;
   private String edtPrvFax_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtPrvMail_Internalname ;
   private String A6077PrvMail ;
   private String edtPrvMail_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtPrvNom2_Internalname ;
   private String A6570PrvNom2 ;
   private String edtPrvNom2_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtPrvDir2_Internalname ;
   private String A6571PrvDir2 ;
   private String edtPrvDir2_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtPrvContac_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtPrvDtoPP_Internalname ;
   private String edtPrvDtoPP_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtCod_Clas_Internalname ;
   private String edtCod_Clas_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtDes_Clas_Internalname ;
   private String A9729Des_Clas ;
   private String edtDes_Clas_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtGpoEcoCod_Internalname ;
   private String edtGpoEcoCod_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtGpoEcoNom_Internalname ;
   private String edtGpoEcoNom_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtPrvDiaPgA_Internalname ;
   private String A10477PrvDiaPgA ;
   private String edtPrvDiaPgA_Jsonclick ;
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
   private String Gx_mode ;
   private String AV51Modo ;
   private String AV17UsurCod ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV29Lit10 ;
   private String AV30Lit11 ;
   private String AV31Lit12 ;
   private String AV32Lit13 ;
   private String AV33Lit14 ;
   private String AV34Lit15 ;
   private String AV35Lit16 ;
   private String AV36Lit17 ;
   private String AV37Lit18 ;
   private String AV38Lit19 ;
   private String AV39Lit20 ;
   private String AV40Lit21 ;
   private String AV42Lit22 ;
   private String AV43Lit23 ;
   private String AV44Lit24 ;
   private String AV54Lit25 ;
   private String AV41LitFe ;
   private String AV52Lit48 ;
   private String AV53Lit49 ;
   private String GXt_char1 ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV55Lit50 ;
   private String AV56Lit26 ;
   private String AV48EmprCod2 ;
   private String AV49EmprNom2 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z498FpgDsc ;
   private String Z3144PrvDivAbr ;
   private String Z9729Des_Clas ;
   private String sMode94 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV51Modo ;
   private String i802PrvTip ;
   private String i792PrvMetTra ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ794PrvNom ;
   private String ZZ407EmprNom ;
   private String ZZ786PrvDir ;
   private String ZZ782PrvCpo ;
   private String ZZ799PrvPob ;
   private String ZZ793PrvNif ;
   private String ZZ803PrvTlf ;
   private String ZZ804PrvTlx ;
   private String ZZ802PrvTip ;
   private String ZZ497FpgCod ;
   private String ZZ801PrvRep ;
   private String ZZ792PrvMetTra ;
   private String ZZ783PrvCta ;
   private String ZZ3092PrvDivCod ;
   private String ZZ3314PrvCar ;
   private String ZZ6075PrvCp2 ;
   private String ZZ6076PrvFax ;
   private String ZZ6077PrvMail ;
   private String ZZ6570PrvNom2 ;
   private String ZZ6571PrvDir2 ;
   private String ZZ10477PrvDiaPgA ;
   private String ZZV17UsurCod ;
   private String ZZ498FpgDsc ;
   private String ZZ9729Des_Clas ;
   private String ZZ3144PrvDivAbr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n497FpgCod ;
   private boolean n9728Cod_Clas ;
   private boolean n10122GpoEcoCod ;
   private boolean wbErr ;
   private boolean n800PrvPri ;
   private boolean n802PrvTip ;
   private boolean n792PrvMetTra ;
   private boolean n3092PrvDivCod ;
   private boolean n795PrvNum ;
   private boolean n794PrvNom ;
   private boolean n407EmprNom ;
   private boolean n786PrvDir ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private boolean n803PrvTlf ;
   private boolean n804PrvTlx ;
   private boolean n498FpgDsc ;
   private boolean n805PrvVto ;
   private boolean n785PrvDiaPag ;
   private boolean n797PrvPer ;
   private boolean n780PrvBan ;
   private boolean n801PrvRep ;
   private boolean n798PrvPlaEnt ;
   private boolean n783PrvCta ;
   private boolean n3144PrvDivAbr ;
   private boolean n3314PrvCar ;
   private boolean n6075PrvCp2 ;
   private boolean n6076PrvFax ;
   private boolean n6077PrvMail ;
   private boolean n6570PrvNom2 ;
   private boolean n6571PrvDir2 ;
   private boolean n6572PrvContac ;
   private boolean n8160PrvDtoPP ;
   private boolean n9729Des_Clas ;
   private boolean n10123GpoEcoNom ;
   private boolean n10477PrvDiaPgA ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A6572PrvContac ;
   private String Z6572PrvContac ;
   private String ZZ6572PrvContac ;
   private String A10123GpoEcoNom ;
   private String Z10123GpoEcoNom ;
   private String ZZ10123GpoEcoNom ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkPrvPri ;
   private HTMLChoice cmbPrvTip ;
   private HTMLChoice cmbPrvMetTra ;
   private HTMLChoice cmbPrvDivCod ;
   private IDataStoreProvider pr_default ;
   private String[] T018A4_A407EmprNom ;
   private boolean[] T018A4_n407EmprNom ;
   private String[] T018A9_A6572PrvContac ;
   private boolean[] T018A9_n6572PrvContac ;
   private int[] T018A9_A795PrvNum ;
   private boolean[] T018A9_n795PrvNum ;
   private String[] T018A9_A794PrvNom ;
   private boolean[] T018A9_n794PrvNom ;
   private String[] T018A9_A407EmprNom ;
   private boolean[] T018A9_n407EmprNom ;
   private String[] T018A9_A786PrvDir ;
   private boolean[] T018A9_n786PrvDir ;
   private String[] T018A9_A782PrvCpo ;
   private boolean[] T018A9_n782PrvCpo ;
   private String[] T018A9_A799PrvPob ;
   private boolean[] T018A9_n799PrvPob ;
   private String[] T018A9_A793PrvNif ;
   private boolean[] T018A9_n793PrvNif ;
   private String[] T018A9_A803PrvTlf ;
   private boolean[] T018A9_n803PrvTlf ;
   private byte[] T018A9_A800PrvPri ;
   private boolean[] T018A9_n800PrvPri ;
   private String[] T018A9_A804PrvTlx ;
   private boolean[] T018A9_n804PrvTlx ;
   private String[] T018A9_A802PrvTip ;
   private boolean[] T018A9_n802PrvTip ;
   private String[] T018A9_A498FpgDsc ;
   private boolean[] T018A9_n498FpgDsc ;
   private byte[] T018A9_A805PrvVto ;
   private boolean[] T018A9_n805PrvVto ;
   private int[] T018A9_A785PrvDiaPag ;
   private boolean[] T018A9_n785PrvDiaPag ;
   private int[] T018A9_A797PrvPer ;
   private boolean[] T018A9_n797PrvPer ;
   private int[] T018A9_A780PrvBan ;
   private boolean[] T018A9_n780PrvBan ;
   private String[] T018A9_A801PrvRep ;
   private boolean[] T018A9_n801PrvRep ;
   private short[] T018A9_A798PrvPlaEnt ;
   private boolean[] T018A9_n798PrvPlaEnt ;
   private String[] T018A9_A792PrvMetTra ;
   private boolean[] T018A9_n792PrvMetTra ;
   private String[] T018A9_A783PrvCta ;
   private boolean[] T018A9_n783PrvCta ;
   private String[] T018A9_A3092PrvDivCod ;
   private boolean[] T018A9_n3092PrvDivCod ;
   private String[] T018A9_A3144PrvDivAbr ;
   private boolean[] T018A9_n3144PrvDivAbr ;
   private String[] T018A9_A3314PrvCar ;
   private boolean[] T018A9_n3314PrvCar ;
   private String[] T018A9_A6075PrvCp2 ;
   private boolean[] T018A9_n6075PrvCp2 ;
   private String[] T018A9_A6076PrvFax ;
   private boolean[] T018A9_n6076PrvFax ;
   private String[] T018A9_A6077PrvMail ;
   private boolean[] T018A9_n6077PrvMail ;
   private String[] T018A9_A6570PrvNom2 ;
   private boolean[] T018A9_n6570PrvNom2 ;
   private String[] T018A9_A6571PrvDir2 ;
   private boolean[] T018A9_n6571PrvDir2 ;
   private java.math.BigDecimal[] T018A9_A8160PrvDtoPP ;
   private boolean[] T018A9_n8160PrvDtoPP ;
   private String[] T018A9_A9729Des_Clas ;
   private boolean[] T018A9_n9729Des_Clas ;
   private String[] T018A9_A10123GpoEcoNom ;
   private boolean[] T018A9_n10123GpoEcoNom ;
   private String[] T018A9_A10477PrvDiaPgA ;
   private boolean[] T018A9_n10477PrvDiaPgA ;
   private String[] T018A9_A396EmprCod ;
   private String[] T018A9_A497FpgCod ;
   private boolean[] T018A9_n497FpgCod ;
   private short[] T018A9_A9728Cod_Clas ;
   private boolean[] T018A9_n9728Cod_Clas ;
   private int[] T018A9_A10122GpoEcoCod ;
   private boolean[] T018A9_n10122GpoEcoCod ;
   private byte[] T018A9_A3143PrvDivCo ;
   private String[] T018A5_A498FpgDsc ;
   private boolean[] T018A5_n498FpgDsc ;
   private String[] T018A6_A9729Des_Clas ;
   private boolean[] T018A6_n9729Des_Clas ;
   private String[] T018A7_A10123GpoEcoNom ;
   private boolean[] T018A7_n10123GpoEcoNom ;
   private String[] T018A8_A3144PrvDivAbr ;
   private boolean[] T018A8_n3144PrvDivAbr ;
   private String[] T018A10_A498FpgDsc ;
   private boolean[] T018A10_n498FpgDsc ;
   private String[] T018A11_A9729Des_Clas ;
   private boolean[] T018A11_n9729Des_Clas ;
   private String[] T018A12_A10123GpoEcoNom ;
   private boolean[] T018A12_n10123GpoEcoNom ;
   private String[] T018A13_A3144PrvDivAbr ;
   private boolean[] T018A13_n3144PrvDivAbr ;
   private String[] T018A14_A396EmprCod ;
   private int[] T018A14_A795PrvNum ;
   private boolean[] T018A14_n795PrvNum ;
   private String[] T018A3_A6572PrvContac ;
   private boolean[] T018A3_n6572PrvContac ;
   private int[] T018A3_A795PrvNum ;
   private boolean[] T018A3_n795PrvNum ;
   private String[] T018A3_A794PrvNom ;
   private boolean[] T018A3_n794PrvNom ;
   private String[] T018A3_A786PrvDir ;
   private boolean[] T018A3_n786PrvDir ;
   private String[] T018A3_A782PrvCpo ;
   private boolean[] T018A3_n782PrvCpo ;
   private String[] T018A3_A799PrvPob ;
   private boolean[] T018A3_n799PrvPob ;
   private String[] T018A3_A793PrvNif ;
   private boolean[] T018A3_n793PrvNif ;
   private String[] T018A3_A803PrvTlf ;
   private boolean[] T018A3_n803PrvTlf ;
   private byte[] T018A3_A800PrvPri ;
   private boolean[] T018A3_n800PrvPri ;
   private String[] T018A3_A804PrvTlx ;
   private boolean[] T018A3_n804PrvTlx ;
   private String[] T018A3_A802PrvTip ;
   private boolean[] T018A3_n802PrvTip ;
   private byte[] T018A3_A805PrvVto ;
   private boolean[] T018A3_n805PrvVto ;
   private int[] T018A3_A785PrvDiaPag ;
   private boolean[] T018A3_n785PrvDiaPag ;
   private int[] T018A3_A797PrvPer ;
   private boolean[] T018A3_n797PrvPer ;
   private int[] T018A3_A780PrvBan ;
   private boolean[] T018A3_n780PrvBan ;
   private String[] T018A3_A801PrvRep ;
   private boolean[] T018A3_n801PrvRep ;
   private short[] T018A3_A798PrvPlaEnt ;
   private boolean[] T018A3_n798PrvPlaEnt ;
   private String[] T018A3_A792PrvMetTra ;
   private boolean[] T018A3_n792PrvMetTra ;
   private String[] T018A3_A783PrvCta ;
   private boolean[] T018A3_n783PrvCta ;
   private String[] T018A3_A3092PrvDivCod ;
   private boolean[] T018A3_n3092PrvDivCod ;
   private String[] T018A3_A3314PrvCar ;
   private boolean[] T018A3_n3314PrvCar ;
   private String[] T018A3_A6075PrvCp2 ;
   private boolean[] T018A3_n6075PrvCp2 ;
   private String[] T018A3_A6076PrvFax ;
   private boolean[] T018A3_n6076PrvFax ;
   private String[] T018A3_A6077PrvMail ;
   private boolean[] T018A3_n6077PrvMail ;
   private String[] T018A3_A6570PrvNom2 ;
   private boolean[] T018A3_n6570PrvNom2 ;
   private String[] T018A3_A6571PrvDir2 ;
   private boolean[] T018A3_n6571PrvDir2 ;
   private java.math.BigDecimal[] T018A3_A8160PrvDtoPP ;
   private boolean[] T018A3_n8160PrvDtoPP ;
   private String[] T018A3_A10477PrvDiaPgA ;
   private boolean[] T018A3_n10477PrvDiaPgA ;
   private String[] T018A3_A396EmprCod ;
   private String[] T018A3_A497FpgCod ;
   private boolean[] T018A3_n497FpgCod ;
   private short[] T018A3_A9728Cod_Clas ;
   private boolean[] T018A3_n9728Cod_Clas ;
   private int[] T018A3_A10122GpoEcoCod ;
   private boolean[] T018A3_n10122GpoEcoCod ;
   private byte[] T018A3_A3143PrvDivCo ;
   private String[] T018A15_A396EmprCod ;
   private int[] T018A15_A795PrvNum ;
   private boolean[] T018A15_n795PrvNum ;
   private String[] T018A16_A396EmprCod ;
   private int[] T018A16_A795PrvNum ;
   private boolean[] T018A16_n795PrvNum ;
   private String[] T018A2_A6572PrvContac ;
   private boolean[] T018A2_n6572PrvContac ;
   private int[] T018A2_A795PrvNum ;
   private boolean[] T018A2_n795PrvNum ;
   private String[] T018A2_A794PrvNom ;
   private boolean[] T018A2_n794PrvNom ;
   private String[] T018A2_A786PrvDir ;
   private boolean[] T018A2_n786PrvDir ;
   private String[] T018A2_A782PrvCpo ;
   private boolean[] T018A2_n782PrvCpo ;
   private String[] T018A2_A799PrvPob ;
   private boolean[] T018A2_n799PrvPob ;
   private String[] T018A2_A793PrvNif ;
   private boolean[] T018A2_n793PrvNif ;
   private String[] T018A2_A803PrvTlf ;
   private boolean[] T018A2_n803PrvTlf ;
   private byte[] T018A2_A800PrvPri ;
   private boolean[] T018A2_n800PrvPri ;
   private String[] T018A2_A804PrvTlx ;
   private boolean[] T018A2_n804PrvTlx ;
   private String[] T018A2_A802PrvTip ;
   private boolean[] T018A2_n802PrvTip ;
   private byte[] T018A2_A805PrvVto ;
   private boolean[] T018A2_n805PrvVto ;
   private int[] T018A2_A785PrvDiaPag ;
   private boolean[] T018A2_n785PrvDiaPag ;
   private int[] T018A2_A797PrvPer ;
   private boolean[] T018A2_n797PrvPer ;
   private int[] T018A2_A780PrvBan ;
   private boolean[] T018A2_n780PrvBan ;
   private String[] T018A2_A801PrvRep ;
   private boolean[] T018A2_n801PrvRep ;
   private short[] T018A2_A798PrvPlaEnt ;
   private boolean[] T018A2_n798PrvPlaEnt ;
   private String[] T018A2_A792PrvMetTra ;
   private boolean[] T018A2_n792PrvMetTra ;
   private String[] T018A2_A783PrvCta ;
   private boolean[] T018A2_n783PrvCta ;
   private String[] T018A2_A3092PrvDivCod ;
   private boolean[] T018A2_n3092PrvDivCod ;
   private String[] T018A2_A3314PrvCar ;
   private boolean[] T018A2_n3314PrvCar ;
   private String[] T018A2_A6075PrvCp2 ;
   private boolean[] T018A2_n6075PrvCp2 ;
   private String[] T018A2_A6076PrvFax ;
   private boolean[] T018A2_n6076PrvFax ;
   private String[] T018A2_A6077PrvMail ;
   private boolean[] T018A2_n6077PrvMail ;
   private String[] T018A2_A6570PrvNom2 ;
   private boolean[] T018A2_n6570PrvNom2 ;
   private String[] T018A2_A6571PrvDir2 ;
   private boolean[] T018A2_n6571PrvDir2 ;
   private java.math.BigDecimal[] T018A2_A8160PrvDtoPP ;
   private boolean[] T018A2_n8160PrvDtoPP ;
   private String[] T018A2_A10477PrvDiaPgA ;
   private boolean[] T018A2_n10477PrvDiaPgA ;
   private String[] T018A2_A396EmprCod ;
   private String[] T018A2_A497FpgCod ;
   private boolean[] T018A2_n497FpgCod ;
   private short[] T018A2_A9728Cod_Clas ;
   private boolean[] T018A2_n9728Cod_Clas ;
   private int[] T018A2_A10122GpoEcoCod ;
   private boolean[] T018A2_n10122GpoEcoCod ;
   private byte[] T018A2_A3143PrvDivCo ;
   private String[] T018A20_A498FpgDsc ;
   private boolean[] T018A20_n498FpgDsc ;
   private String[] T018A21_A3144PrvDivAbr ;
   private boolean[] T018A21_n3144PrvDivAbr ;
   private String[] T018A22_A9729Des_Clas ;
   private boolean[] T018A22_n9729Des_Clas ;
   private String[] T018A23_A10123GpoEcoNom ;
   private boolean[] T018A23_n10123GpoEcoNom ;
   private String[] T018A24_A396EmprCod ;
   private int[] T018A24_A13418AlbProID ;
   private String[] T018A25_A396EmprCod ;
   private long[] T018A25_A12205OrdenCID ;
   private String[] T018A26_A396EmprCod ;
   private int[] T018A26_A9492MRCod ;
   private int[] T018A26_A795PrvNum ;
   private boolean[] T018A26_n795PrvNum ;
   private String[] T018A27_A396EmprCod ;
   private long[] T018A27_A11055MComCod ;
   private String[] T018A28_A396EmprCod ;
   private int[] T018A28_A9412MMSCod ;
   private String[] T018A29_A396EmprCod ;
   private int[] T018A29_A795PrvNum ;
   private boolean[] T018A29_n795PrvNum ;
   private short[] T018A29_A6146PrvPAny ;
   private String[] T018A29_A6147PrvPPr ;
   private String[] T018A30_A396EmprCod ;
   private int[] T018A30_A1387AlbPrvCod ;
   private String[] T018A31_A396EmprCod ;
   private int[] T018A31_A795PrvNum ;
   private boolean[] T018A31_n795PrvNum ;
   private short[] T018A31_A779PrvAny ;
   private String[] T018A32_A396EmprCod ;
   private int[] T018A32_A658PedCod ;
   private String[] T018A33_A396EmprCod ;
   private String[] T018A33_A719PrdNum ;
   private String[] T018A34_A396EmprCod ;
   private int[] T018A34_A795PrvNum ;
   private boolean[] T018A34_n795PrvNum ;
   private String[] T018A35_A407EmprNom ;
   private boolean[] T018A35_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tproved__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproved__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproved__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproved__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproved__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018A2", "SELECT PrvContac, PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvDtoPP, PrvDiaPgA, EmprCod, FpgCod, Cod_Clas, GpoEcoCod, PrvDivCo FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ?  FOR UPDATE OF PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvContac, PrvDtoPP, PrvDiaPgA, FpgCod, Cod_Clas, GpoEcoCod, PrvDivCo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A3", "SELECT PrvContac, PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvDtoPP, PrvDiaPgA, EmprCod, FpgCod, Cod_Clas, GpoEcoCod, PrvDivCo FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A5", "SELECT FpgDsc FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A6", "SELECT Des_Clas FROM TXPISOTB1 WHERE EmprCod = ? AND Cod_Clas = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A7", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A8", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A9", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrvContac, TM1.PrvNum, TM1.PrvNom, T2.EmprNom, TM1.PrvDir, TM1.PrvCpo, TM1.PrvPob, TM1.PrvNif, TM1.PrvTlf, TM1.PrvPri, TM1.PrvTlx, TM1.PrvTip, T3.FpgDsc, TM1.PrvVto, TM1.PrvDiaPag, TM1.PrvPer, TM1.PrvBan, TM1.PrvRep, TM1.PrvPlaEnt, TM1.PrvMetTra, TM1.PrvCta, TM1.PrvDivCod, T4.DivAbr AS PrvDivAbr, TM1.PrvCar, TM1.PrvCp2, TM1.PrvFax, TM1.PrvMail, TM1.PrvNom2, TM1.PrvDir2, TM1.PrvDtoPP, T5.Des_Clas, T6.GpoEcoNom, TM1.PrvDiaPgA, TM1.EmprCod, TM1.FpgCod, TM1.Cod_Clas, TM1.GpoEcoCod, TM1.PrvDivCo AS PrvDivCo FROM (((((TXPPRVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPFORPAG T3 ON T3.EmprCod = TM1.EmprCod AND T3.FpgCod = TM1.FpgCod) INNER JOIN TXPDIVISA T4 ON T4.DivCod = TM1.PrvDivCo) LEFT JOIN TXPISOTB1 T5 ON T5.EmprCod = TM1.EmprCod AND T5.Cod_Clas = TM1.Cod_Clas) LEFT JOIN TXPGPOECO T6 ON T6.EmprCod = TM1.EmprCod AND T6.GpoEcoCod = TM1.GpoEcoCod) WHERE TM1.EmprCod = ? and TM1.PrvNum = ? ORDER BY TM1.EmprCod, TM1.PrvNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A10", "SELECT FpgDsc FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A11", "SELECT Des_Clas FROM TXPISOTB1 WHERE EmprCod = ? AND Cod_Clas = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A12", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A13", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrvNum FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrvNum FROM TXPPRVGEN WHERE ( PrvNum > ?) and EmprCod = ? ORDER BY EmprCod, PrvNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrvNum FROM TXPPRVGEN WHERE ( PrvNum < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrvNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018A17", "INSERT INTO TXPPRVGEN(PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif, PrvTlf, PrvPri, PrvTlx, PrvTip, PrvVto, PrvDiaPag, PrvPer, PrvBan, PrvRep, PrvPlaEnt, PrvMetTra, PrvCta, PrvDivCod, PrvCar, PrvCp2, PrvFax, PrvMail, PrvNom2, PrvDir2, PrvContac, PrvDtoPP, PrvDiaPgA, EmprCod, FpgCod, Cod_Clas, GpoEcoCod, PrvDivCo, PrvTipo, PrvClasID, PrvAct, PrvNac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ')", GX_NOMASK, "TXPPRVGEN")
         ,new UpdateCursor("T018A18", "UPDATE TXPPRVGEN SET PrvNom=?, PrvDir=?, PrvCpo=?, PrvPob=?, PrvNif=?, PrvTlf=?, PrvPri=?, PrvTlx=?, PrvTip=?, PrvVto=?, PrvDiaPag=?, PrvPer=?, PrvBan=?, PrvRep=?, PrvPlaEnt=?, PrvMetTra=?, PrvCta=?, PrvDivCod=?, PrvCar=?, PrvCp2=?, PrvFax=?, PrvMail=?, PrvNom2=?, PrvDir2=?, PrvContac=?, PrvDtoPP=?, PrvDiaPgA=?, FpgCod=?, Cod_Clas=?, GpoEcoCod=?, PrvDivCo=?  WHERE EmprCod = ? AND PrvNum = ?", GX_NOMASK, "TXPPRVGEN")
         ,new UpdateCursor("T018A19", "DELETE FROM TXPPRVGEN  WHERE EmprCod = ? AND PrvNum = ?", GX_NOMASK, "TXPPRVGEN")
         ,new ForEachCursor("T018A20", "SELECT FpgDsc FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A21", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A22", "SELECT Des_Clas FROM TXPISOTB1 WHERE EmprCod = ? AND Cod_Clas = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A23", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A24", "SELECT * FROM (SELECT EmprCod, AlbProID FROM TXPCALPRO WHERE EmprCod = ? AND AlbProPrvI = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A25", "SELECT * FROM (SELECT EmprCod, OrdenCID FROM TXPIngQui WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A26", "SELECT * FROM (SELECT EmprCod, MRCod, PrvNum FROM TXPMRepu1 WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A27", "SELECT * FROM (SELECT EmprCod, MComCod FROM TXPMRepCo WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A28", "SELECT * FROM (SELECT EmprCod, MMSCod FROM TXPMMoStk WHERE EmprCod = ? AND MMSPrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A29", "SELECT * FROM (SELECT EmprCod, PrvNum, PrvPAny, PrvPPr FROM TXPPRVESX WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A30", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A31", "SELECT * FROM (SELECT EmprCod, PrvNum, PrvAny FROM TXPCPRVES WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A32", "SELECT * FROM (SELECT EmprCod, PedCod FROM TXPCPEDID WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A33", "SELECT * FROM (SELECT EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrvNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018A34", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrvNum FROM TXPPRVGEN WHERE EmprCod = ? ORDER BY EmprCod, PrvNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018A35", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 18);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 12);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 15);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 40);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 40);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 6);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 3);
               ((String[]) buf[56])[0] = rslt.getString(30, 2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(31);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((byte[]) buf[62])[0] = rslt.getByte(33);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 18);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 12);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 15);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 40);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 40);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 6);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 3);
               ((String[]) buf[56])[0] = rslt.getString(30, 2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(31);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((byte[]) buf[62])[0] = rslt.getByte(33);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 18);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 12);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 15);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 40);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 40);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 40);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 60);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 6);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 3);
               ((String[]) buf[66])[0] = rslt.getString(35, 2);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((byte[]) buf[72])[0] = rslt.getByte(38);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
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
            case 1 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
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
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 12 :
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
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 18);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 14);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
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
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 20);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
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
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 12);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 6);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 15);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 40);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 40);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 40);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(26, (String)parms[51]);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 6);
               }
               stmt.setString(29, (String)parms[56], 3);
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[62]).intValue());
               }
               stmt.setByte(33, ((Number) parms[63]).byteValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 18);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 14);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 20);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 12);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 6);
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
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 40);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 40);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 40);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(25, (String)parms[49]);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 6);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[59]).intValue());
               }
               stmt.setByte(31, ((Number) parms[60]).byteValue());
               stmt.setString(32, (String)parms[61], 3);
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(33, ((Number) parms[63]).intValue());
               }
               return;
            case 17 :
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
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 19 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
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
               return;
            case 22 :
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
            case 23 :
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
            case 24 :
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
               return;
            case 28 :
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
            case 29 :
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
            case 31 :
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
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

