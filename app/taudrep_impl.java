package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class taudrep_impl extends GXDataArea
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
            A11349Aur_Reccod = (int)(GXutil.lval( httpContext.GetPar( "Aur_Reccod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11349Aur_Reccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11349Aur_Reccod), 8, 0));
            AV32Auc_Na = (int)(GXutil.lval( httpContext.GetPar( "Auc_Na"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Auc_Na", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Auc_Na), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AUDITORIA ENTRADAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAur_Pzas_Internalname ;
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
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
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

   public taudrep_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public taudrep_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( taudrep_impl.class ));
   }

   public taudrep_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TAUDREP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Recepcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_Reccod_Internalname, GXutil.ltrim( localUtil.ntoc( A11349Aur_Reccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_Reccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11349Aur_Reccod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11349Aur_Reccod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_Reccod_Jsonclick, 0, "", "", "", "", "", 1, edtAur_Reccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Prendas", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_Pzas_Internalname, GXutil.ltrim( localUtil.ntoc( A11350Aur_Pzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_Pzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11350Aur_Pzas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11350Aur_Pzas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_Pzas_Jsonclick, 0, "", "", "", "", "", 1, edtAur_Pzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Kilos Entrada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A11351Aur_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_Kgs_Enabled!=0) ? localUtil.format( A11351Aur_Kgs, "ZZZZZ9.99") : localUtil.format( A11351Aur_Kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_Kgs_Jsonclick, 0, "", "", "", "", "", 1, edtAur_Kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Unidades a Inspeccionar", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_UndM_Internalname, GXutil.ltrim( localUtil.ntoc( A11352Aur_UndM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_UndM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11352Aur_UndM), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11352Aur_UndM), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_UndM_Jsonclick, 0, "", "", "", "", "", 1, edtAur_UndM_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Suma Unidades Inspeccionadas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_UndMS_Internalname, GXutil.ltrim( localUtil.ntoc( A11353Aur_UndMS, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_UndMS_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11353Aur_UndMS), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11353Aur_UndMS), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_UndMS_Jsonclick, 0, "", "", "", "", "", 1, edtAur_UndMS_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAur_Obs_Internalname, A11354Aur_Obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", (short)(0), 1, edtAur_Obs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_stat_Internalname, GXutil.ltrim( localUtil.ntoc( A11355Aur_stat, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_stat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11355Aur_stat), "9") : localUtil.format( DecimalUtil.doubleToDec(A11355Aur_stat), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_stat_Jsonclick, 0, "", "", "", "", "", 1, edtAur_stat_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_Oper_Internalname, GXutil.ltrim( localUtil.ntoc( A11356Aur_Oper, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAur_Oper_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11356Aur_Oper), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11356Aur_Oper), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_Oper_Jsonclick, 0, "", "", "", "", "", 1, edtAur_Oper_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Aceptacion Rechazo", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAUDREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAur_FecHr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAur_FecHr_Internalname, localUtil.ttoc( A11357Aur_FecHr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11357Aur_FecHr, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAur_FecHr_Jsonclick, 0, "", "", "", "", "", 1, edtAur_FecHr_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAUDREP.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAur_FecHr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAur_FecHr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TAUDREP.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1515 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1515 = (short)(1) ;
            scanStart1BR1515( ) ;
            while ( RcdFound1515 != 0 )
            {
               init_level_properties1515( ) ;
               getByPrimaryKey1BR1515( ) ;
               addRow1BR1515( ) ;
               scanNext1BR1515( ) ;
            }
            scanEnd1BR1515( ) ;
            nBlankRcdCount1515 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11353Aur_UndMS = A11353Aur_UndMS ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         standaloneNotModal1BR1515( ) ;
         standaloneModal1BR1515( ) ;
         sMode1515 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow1BR1515( ) ;
            edtavnRcdDeleted_1515_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1515_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1515_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1515_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtAur_CodDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUR_CODDEF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAur_CodDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_CodDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtAur_DscDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUR_DSCDEF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAur_DscDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_DscDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtAur_Und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUR_UND_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAur_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Und_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_1515 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BR1515( ) ;
            }
            sendRow1BR1515( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode1515 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11353Aur_UndMS = B11353Aur_UndMS ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1515 = (short)(5) ;
         nRcdExists_1515 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BR1515( ) ;
            while ( RcdFound1515 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_751515( ) ;
               init_level_properties1515( ) ;
               standaloneNotModal1BR1515( ) ;
               getByPrimaryKey1BR1515( ) ;
               standaloneModal1BR1515( ) ;
               addRow1BR1515( ) ;
               scanNext1BR1515( ) ;
            }
            scanEnd1BR1515( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1515 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_751515( ) ;
      initAll1BR1515( ) ;
      init_level_properties1515( ) ;
      B11353Aur_UndMS = A11353Aur_UndMS ;
      n11353Aur_UndMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      nRcdExists_1515 = (short)(0) ;
      nIsMod_1515 = (short)(0) ;
      nRcdDeleted_1515 = (short)(0) ;
      nBlankRcdCount1515 = (short)(nBlankRcdUsr1515+nBlankRcdCount1515) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1515 > 0 )
      {
         standaloneNotModal1BR1515( ) ;
         standaloneModal1BR1515( ) ;
         addRow1BR1515( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAur_CodDef_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1515 = (short)(nBlankRcdCount1515-1) ;
      }
      Gx_mode = sMode1515 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11353Aur_UndMS = B11353Aur_UndMS ;
      n11353Aur_UndMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAUDREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TAUDREP.htm");
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
         Z11349Aur_Reccod = (int)(localUtil.ctol( httpContext.cgiGet( "Z11349Aur_Reccod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11350Aur_Pzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z11350Aur_Pzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11351Aur_Kgs = localUtil.ctond( httpContext.cgiGet( "Z11351Aur_Kgs")) ;
         Z11352Aur_UndM = (int)(localUtil.ctol( httpContext.cgiGet( "Z11352Aur_UndM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11354Aur_Obs = httpContext.cgiGet( "Z11354Aur_Obs") ;
         Z11355Aur_stat = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11355Aur_stat"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11356Aur_Oper = (int)(localUtil.ctol( httpContext.cgiGet( "Z11356Aur_Oper"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11357Aur_FecHr = localUtil.ctot( httpContext.cgiGet( "Z11357Aur_FecHr"), 0) ;
         O11353Aur_UndMS = (int)(localUtil.ctol( httpContext.cgiGet( "O11353Aur_UndMS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11349Aur_Reccod = (int)(localUtil.ctol( httpContext.cgiGet( edtAur_Reccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11349Aur_Reccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11349Aur_Reccod), 8, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAur_Pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAur_Pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AUR_PZAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAur_Pzas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11350Aur_Pzas = 0 ;
            n11350Aur_Pzas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11350Aur_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11350Aur_Pzas), 6, 0));
         }
         else
         {
            A11350Aur_Pzas = (int)(localUtil.ctol( httpContext.cgiGet( edtAur_Pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11350Aur_Pzas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11350Aur_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11350Aur_Pzas), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAur_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAur_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AUR_KGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAur_Kgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11351Aur_Kgs = DecimalUtil.ZERO ;
            n11351Aur_Kgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11351Aur_Kgs", GXutil.ltrimstr( A11351Aur_Kgs, 9, 2));
         }
         else
         {
            A11351Aur_Kgs = localUtil.ctond( httpContext.cgiGet( edtAur_Kgs_Internalname)) ;
            n11351Aur_Kgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11351Aur_Kgs", GXutil.ltrimstr( A11351Aur_Kgs, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAur_UndM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAur_UndM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AUR_UNDM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAur_UndM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11352Aur_UndM = 0 ;
            n11352Aur_UndM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11352Aur_UndM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11352Aur_UndM), 6, 0));
         }
         else
         {
            A11352Aur_UndM = (int)(localUtil.ctol( httpContext.cgiGet( edtAur_UndM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11352Aur_UndM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11352Aur_UndM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11352Aur_UndM), 6, 0));
         }
         A11353Aur_UndMS = (int)(localUtil.ctol( httpContext.cgiGet( edtAur_UndMS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         A11354Aur_Obs = httpContext.cgiGet( edtAur_Obs_Internalname) ;
         n11354Aur_Obs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11354Aur_Obs", A11354Aur_Obs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAur_stat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAur_stat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AUR_STAT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAur_stat_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11355Aur_stat = (byte)(0) ;
            n11355Aur_stat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11355Aur_stat", GXutil.str( A11355Aur_stat, 1, 0));
         }
         else
         {
            A11355Aur_stat = (byte)(localUtil.ctol( httpContext.cgiGet( edtAur_stat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11355Aur_stat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11355Aur_stat", GXutil.str( A11355Aur_stat, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAur_Oper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAur_Oper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AUR_OPER");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAur_Oper_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11356Aur_Oper = 0 ;
            n11356Aur_Oper = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11356Aur_Oper", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11356Aur_Oper), 6, 0));
         }
         else
         {
            A11356Aur_Oper = (int)(localUtil.ctol( httpContext.cgiGet( edtAur_Oper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11356Aur_Oper = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11356Aur_Oper", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11356Aur_Oper), 6, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtAur_FecHr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "AUR_FECHR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAur_FecHr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11357Aur_FecHr = GXutil.resetTime( GXutil.nullDate() );
            n11357Aur_FecHr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11357Aur_FecHr", localUtil.ttoc( A11357Aur_FecHr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11357Aur_FecHr = localUtil.ctot( httpContext.cgiGet( edtAur_FecHr_Internalname)) ;
            n11357Aur_FecHr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11357Aur_FecHr", localUtil.ttoc( A11357Aur_FecHr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
            A11349Aur_Reccod = (int)(GXutil.lval( httpContext.GetPar( "Aur_Reccod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11349Aur_Reccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11349Aur_Reccod), 8, 0));
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
            initAll1BR1514( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1515_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1515_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributes1BR1514( ) ;
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

   public void confirm_1BR0( )
   {
      beforeValidate1BR1514( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BR1514( ) ;
         }
         else
         {
            checkExtendedTable1BR1514( ) ;
            if ( AnyError == 0 )
            {
               zm1BR1514( 4) ;
               zm1BR1514( 5) ;
            }
            closeExtendedTableCursors1BR1514( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1514 = Gx_mode ;
         confirm_1BR1515( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1514 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1514 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1BR0( ) ;
      }
   }

   public void confirm_1BR1515( )
   {
      s11353Aur_UndMS = O11353Aur_UndMS ;
      n11353Aur_UndMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1BR1515( ) ;
         if ( ( nRcdExists_1515 != 0 ) || ( nIsMod_1515 != 0 ) )
         {
            getKey1BR1515( ) ;
            if ( ( nRcdExists_1515 == 0 ) && ( nRcdDeleted_1515 == 0 ) )
            {
               if ( RcdFound1515 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BR1515( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BR1515( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BR1515( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11353Aur_UndMS = A11353Aur_UndMS ;
                     n11353Aur_UndMS = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "AUR_CODDEF_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAur_CodDef_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1515 != 0 )
               {
                  if ( nRcdDeleted_1515 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BR1515( ) ;
                     load1BR1515( ) ;
                     beforeValidate1BR1515( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BR1515( ) ;
                        O11353Aur_UndMS = A11353Aur_UndMS ;
                        n11353Aur_UndMS = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1515 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BR1515( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BR1515( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BR1515( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11353Aur_UndMS = A11353Aur_UndMS ;
                           n11353Aur_UndMS = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1515 == 0 )
                  {
                     GXCCtl = "AUR_CODDEF_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAur_CodDef_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1515_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAur_CodDef_Internalname, GXutil.ltrim( localUtil.ntoc( A11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAur_DscDef_Internalname, GXutil.rtrim( A11360Aur_DscDef)) ;
         httpContext.changePostValue( edtAur_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11358Aur_CodDef_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11359Aur_Und_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11359Aur_Und_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1515_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1515_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1515_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1515 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1515_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1515_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUR_CODDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_CodDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUR_DSCDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_DscDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUR_UND_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_Und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11353Aur_UndMS = s11353Aur_UndMS ;
      n11353Aur_UndMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BR0( )
   {
   }

   public void zm1BR1514( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11350Aur_Pzas = T01BR5_A11350Aur_Pzas[0] ;
            Z11351Aur_Kgs = T01BR5_A11351Aur_Kgs[0] ;
            Z11352Aur_UndM = T01BR5_A11352Aur_UndM[0] ;
            Z11354Aur_Obs = T01BR5_A11354Aur_Obs[0] ;
            Z11355Aur_stat = T01BR5_A11355Aur_stat[0] ;
            Z11356Aur_Oper = T01BR5_A11356Aur_Oper[0] ;
            Z11357Aur_FecHr = T01BR5_A11357Aur_FecHr[0] ;
         }
         else
         {
            Z11350Aur_Pzas = A11350Aur_Pzas ;
            Z11351Aur_Kgs = A11351Aur_Kgs ;
            Z11352Aur_UndM = A11352Aur_UndM ;
            Z11354Aur_Obs = A11354Aur_Obs ;
            Z11355Aur_stat = A11355Aur_stat ;
            Z11356Aur_Oper = A11356Aur_Oper ;
            Z11357Aur_FecHr = A11357Aur_FecHr ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z11349Aur_Reccod = A11349Aur_Reccod ;
         Z11350Aur_Pzas = A11350Aur_Pzas ;
         Z11351Aur_Kgs = A11351Aur_Kgs ;
         Z11352Aur_UndM = A11352Aur_UndM ;
         Z11354Aur_Obs = A11354Aur_Obs ;
         Z11355Aur_stat = A11355Aur_stat ;
         Z11356Aur_Oper = A11356Aur_Oper ;
         Z11357Aur_FecHr = A11357Aur_FecHr ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z11353Aur_UndMS = A11353Aur_UndMS ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01BR6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BR6_A407EmprNom[0] ;
      n407EmprNom = T01BR6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01BR8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A11353Aur_UndMS = T01BR8_A11353Aur_UndMS[0] ;
         n11353Aur_UndMS = T01BR8_n11353Aur_UndMS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      else
      {
         A11353Aur_UndMS = 0 ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      O11353Aur_UndMS = A11353Aur_UndMS ;
      n11353Aur_UndMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
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

   public void load1BR1514( )
   {
      /* Using cursor T01BR10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1514 = (short)(1) ;
         A407EmprNom = T01BR10_A407EmprNom[0] ;
         n407EmprNom = T01BR10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11350Aur_Pzas = T01BR10_A11350Aur_Pzas[0] ;
         n11350Aur_Pzas = T01BR10_n11350Aur_Pzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11350Aur_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11350Aur_Pzas), 6, 0));
         A11351Aur_Kgs = T01BR10_A11351Aur_Kgs[0] ;
         n11351Aur_Kgs = T01BR10_n11351Aur_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11351Aur_Kgs", GXutil.ltrimstr( A11351Aur_Kgs, 9, 2));
         A11352Aur_UndM = T01BR10_A11352Aur_UndM[0] ;
         n11352Aur_UndM = T01BR10_n11352Aur_UndM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11352Aur_UndM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11352Aur_UndM), 6, 0));
         A11354Aur_Obs = T01BR10_A11354Aur_Obs[0] ;
         n11354Aur_Obs = T01BR10_n11354Aur_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11354Aur_Obs", A11354Aur_Obs);
         A11355Aur_stat = T01BR10_A11355Aur_stat[0] ;
         n11355Aur_stat = T01BR10_n11355Aur_stat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11355Aur_stat", GXutil.str( A11355Aur_stat, 1, 0));
         A11356Aur_Oper = T01BR10_A11356Aur_Oper[0] ;
         n11356Aur_Oper = T01BR10_n11356Aur_Oper[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11356Aur_Oper", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11356Aur_Oper), 6, 0));
         A11357Aur_FecHr = T01BR10_A11357Aur_FecHr[0] ;
         n11357Aur_FecHr = T01BR10_n11357Aur_FecHr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11357Aur_FecHr", localUtil.ttoc( A11357Aur_FecHr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11353Aur_UndMS = T01BR10_A11353Aur_UndMS[0] ;
         n11353Aur_UndMS = T01BR10_n11353Aur_UndMS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         zm1BR1514( -3) ;
      }
      pr_default.close(6);
      onLoadActions1BR1514( ) ;
   }

   public void onLoadActions1BR1514( )
   {
      O11353Aur_UndMS = A11353Aur_UndMS ;
      n11353Aur_UndMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
   }

   public void checkExtendedTable1BR1514( )
   {
      nIsDirty_1514 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1BR1514( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1BR1514( )
   {
      /* Using cursor T01BR11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1514 = (short)(1) ;
      }
      else
      {
         RcdFound1514 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01BR5_A11349Aur_Reccod[0] == A11349Aur_Reccod ) && ( GXutil.strcmp(T01BR5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BR1514( 3) ;
         RcdFound1514 = (short)(1) ;
         A11350Aur_Pzas = T01BR5_A11350Aur_Pzas[0] ;
         n11350Aur_Pzas = T01BR5_n11350Aur_Pzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11350Aur_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11350Aur_Pzas), 6, 0));
         A11351Aur_Kgs = T01BR5_A11351Aur_Kgs[0] ;
         n11351Aur_Kgs = T01BR5_n11351Aur_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11351Aur_Kgs", GXutil.ltrimstr( A11351Aur_Kgs, 9, 2));
         A11352Aur_UndM = T01BR5_A11352Aur_UndM[0] ;
         n11352Aur_UndM = T01BR5_n11352Aur_UndM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11352Aur_UndM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11352Aur_UndM), 6, 0));
         A11354Aur_Obs = T01BR5_A11354Aur_Obs[0] ;
         n11354Aur_Obs = T01BR5_n11354Aur_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11354Aur_Obs", A11354Aur_Obs);
         A11355Aur_stat = T01BR5_A11355Aur_stat[0] ;
         n11355Aur_stat = T01BR5_n11355Aur_stat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11355Aur_stat", GXutil.str( A11355Aur_stat, 1, 0));
         A11356Aur_Oper = T01BR5_A11356Aur_Oper[0] ;
         n11356Aur_Oper = T01BR5_n11356Aur_Oper[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11356Aur_Oper", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11356Aur_Oper), 6, 0));
         A11357Aur_FecHr = T01BR5_A11357Aur_FecHr[0] ;
         n11357Aur_FecHr = T01BR5_n11357Aur_FecHr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11357Aur_FecHr", localUtil.ttoc( A11357Aur_FecHr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Z396EmprCod = A396EmprCod ;
         Z11349Aur_Reccod = A11349Aur_Reccod ;
         sMode1514 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BR1514( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1514 = (short)(0) ;
            initializeNonKey1BR1514( ) ;
         }
         Gx_mode = sMode1514 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1514 = (short)(0) ;
         initializeNonKey1BR1514( ) ;
         sMode1514 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1514 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1BR1514( ) ;
      if ( RcdFound1514 == 0 )
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
      RcdFound1514 = (short)(0) ;
      /* Using cursor T01BR12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01BR12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BR12_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01BR12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BR12_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
         {
            RcdFound1514 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1514 = (short)(0) ;
      /* Using cursor T01BR13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01BR13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BR13_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01BR13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BR13_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
         {
            RcdFound1514 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BR1514( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11353Aur_UndMS = O11353Aur_UndMS ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         GX_FocusControl = edtAur_Pzas_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BR1514( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1514 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11353Aur_UndMS = O11353Aur_UndMS ;
               n11353Aur_UndMS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAur_Pzas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11353Aur_UndMS = O11353Aur_UndMS ;
               n11353Aur_UndMS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
               update1BR1514( ) ;
               GX_FocusControl = edtAur_Pzas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11353Aur_UndMS = O11353Aur_UndMS ;
               n11353Aur_UndMS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
               GX_FocusControl = edtAur_Pzas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1BR1514( ) ;
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
                  A11353Aur_UndMS = O11353Aur_UndMS ;
                  n11353Aur_UndMS = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
                  GX_FocusControl = edtAur_Pzas_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1BR1514( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11353Aur_UndMS = O11353Aur_UndMS ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAur_Pzas_Internalname ;
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
      getKey1BR1514( ) ;
      if ( RcdFound1514 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11349Aur_Reccod != Z11349Aur_Reccod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "taudrep");
      GX_FocusControl = edtAur_Pzas_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1BR0( ) ;
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
      if ( RcdFound1514 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAur_Pzas_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1BR1514( ) ;
      if ( RcdFound1514 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAur_Pzas_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BR1514( ) ;
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
      if ( RcdFound1514 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAur_Pzas_Internalname ;
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
      if ( RcdFound1514 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAur_Pzas_Internalname ;
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
      scanStart1BR1514( ) ;
      if ( RcdFound1514 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1514 != 0 )
         {
            scanNext1BR1514( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAur_Pzas_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BR1514( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BR1514( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAUDREP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z11350Aur_Pzas != T01BR4_A11350Aur_Pzas[0] ) || ( DecimalUtil.compareTo(Z11351Aur_Kgs, T01BR4_A11351Aur_Kgs[0]) != 0 ) || ( Z11352Aur_UndM != T01BR4_A11352Aur_UndM[0] ) || ( GXutil.strcmp(Z11354Aur_Obs, T01BR4_A11354Aur_Obs[0]) != 0 ) || ( Z11355Aur_stat != T01BR4_A11355Aur_stat[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11356Aur_Oper != T01BR4_A11356Aur_Oper[0] ) || !( GXutil.dateCompare(Z11357Aur_FecHr, T01BR4_A11357Aur_FecHr[0]) ) )
         {
            if ( Z11350Aur_Pzas != T01BR4_A11350Aur_Pzas[0] )
            {
               GXutil.writeLogln("taudrep:[seudo value changed for attri]"+"Aur_Pzas");
               GXutil.writeLogRaw("Old: ",Z11350Aur_Pzas);
               GXutil.writeLogRaw("Current: ",T01BR4_A11350Aur_Pzas[0]);
            }
            if ( DecimalUtil.compareTo(Z11351Aur_Kgs, T01BR4_A11351Aur_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("taudrep:[seudo value changed for attri]"+"Aur_Kgs");
               GXutil.writeLogRaw("Old: ",Z11351Aur_Kgs);
               GXutil.writeLogRaw("Current: ",T01BR4_A11351Aur_Kgs[0]);
            }
            if ( Z11352Aur_UndM != T01BR4_A11352Aur_UndM[0] )
            {
               GXutil.writeLogln("taudrep:[seudo value changed for attri]"+"Aur_UndM");
               GXutil.writeLogRaw("Old: ",Z11352Aur_UndM);
               GXutil.writeLogRaw("Current: ",T01BR4_A11352Aur_UndM[0]);
            }
            if ( GXutil.strcmp(Z11354Aur_Obs, T01BR4_A11354Aur_Obs[0]) != 0 )
            {
               GXutil.writeLogln("taudrep:[seudo value changed for attri]"+"Aur_Obs");
               GXutil.writeLogRaw("Old: ",Z11354Aur_Obs);
               GXutil.writeLogRaw("Current: ",T01BR4_A11354Aur_Obs[0]);
            }
            if ( Z11355Aur_stat != T01BR4_A11355Aur_stat[0] )
            {
               GXutil.writeLogln("taudrep:[seudo value changed for attri]"+"Aur_stat");
               GXutil.writeLogRaw("Old: ",Z11355Aur_stat);
               GXutil.writeLogRaw("Current: ",T01BR4_A11355Aur_stat[0]);
            }
            if ( Z11356Aur_Oper != T01BR4_A11356Aur_Oper[0] )
            {
               GXutil.writeLogln("taudrep:[seudo value changed for attri]"+"Aur_Oper");
               GXutil.writeLogRaw("Old: ",Z11356Aur_Oper);
               GXutil.writeLogRaw("Current: ",T01BR4_A11356Aur_Oper[0]);
            }
            if ( !( GXutil.dateCompare(Z11357Aur_FecHr, T01BR4_A11357Aur_FecHr[0]) ) )
            {
               GXutil.writeLogln("taudrep:[seudo value changed for attri]"+"Aur_FecHr");
               GXutil.writeLogRaw("Old: ",Z11357Aur_FecHr);
               GXutil.writeLogRaw("Current: ",T01BR4_A11357Aur_FecHr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAUDREP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BR1514( )
   {
      beforeValidate1BR1514( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BR1514( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BR1514( 0) ;
         checkOptimisticConcurrency1BR1514( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BR1514( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BR1514( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BR14 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A11349Aur_Reccod), Boolean.valueOf(n11350Aur_Pzas), Integer.valueOf(A11350Aur_Pzas), Boolean.valueOf(n11351Aur_Kgs), A11351Aur_Kgs, Boolean.valueOf(n11352Aur_UndM), Integer.valueOf(A11352Aur_UndM), Boolean.valueOf(n11354Aur_Obs), A11354Aur_Obs, Boolean.valueOf(n11355Aur_stat), Byte.valueOf(A11355Aur_stat), Boolean.valueOf(n11356Aur_Oper), Integer.valueOf(A11356Aur_Oper), Boolean.valueOf(n11357Aur_FecHr), A11357Aur_FecHr, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDREP");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel1BR1514( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BR0( ) ;
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
            load1BR1514( ) ;
         }
         endLevel1BR1514( ) ;
      }
      closeExtendedTableCursors1BR1514( ) ;
   }

   public void update1BR1514( )
   {
      beforeValidate1BR1514( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BR1514( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BR1514( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BR1514( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BR1514( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BR15 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n11350Aur_Pzas), Integer.valueOf(A11350Aur_Pzas), Boolean.valueOf(n11351Aur_Kgs), A11351Aur_Kgs, Boolean.valueOf(n11352Aur_UndM), Integer.valueOf(A11352Aur_UndM), Boolean.valueOf(n11354Aur_Obs), A11354Aur_Obs, Boolean.valueOf(n11355Aur_stat), Byte.valueOf(A11355Aur_stat), Boolean.valueOf(n11356Aur_Oper), Integer.valueOf(A11356Aur_Oper), Boolean.valueOf(n11357Aur_FecHr), A11357Aur_FecHr, A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDREP");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAUDREP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BR1514( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BR1514( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BR0( ) ;
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
         endLevel1BR1514( ) ;
      }
      closeExtendedTableCursors1BR1514( ) ;
   }

   public void deferredUpdate1BR1514( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BR1514( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BR1514( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BR1514( ) ;
         afterConfirm1BR1514( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BR1514( ) ;
            if ( AnyError == 0 )
            {
               A11353Aur_UndMS = O11353Aur_UndMS ;
               n11353Aur_UndMS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
               scanStart1BR1515( ) ;
               while ( RcdFound1515 != 0 )
               {
                  getByPrimaryKey1BR1515( ) ;
                  delete1BR1515( ) ;
                  scanNext1BR1515( ) ;
                  O11353Aur_UndMS = A11353Aur_UndMS ;
                  n11353Aur_UndMS = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
               }
               scanEnd1BR1515( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BR16 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDREP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1514 == 0 )
                        {
                           initAll1BR1514( ) ;
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
                        resetCaption1BR0( ) ;
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
      sMode1514 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BR1514( ) ;
      Gx_mode = sMode1514 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BR1514( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1BR1515( )
   {
      s11353Aur_UndMS = O11353Aur_UndMS ;
      n11353Aur_UndMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1BR1515( ) ;
         if ( ( nRcdExists_1515 != 0 ) || ( nIsMod_1515 != 0 ) )
         {
            standaloneNotModal1BR1515( ) ;
            getKey1BR1515( ) ;
            if ( ( nRcdExists_1515 == 0 ) && ( nRcdDeleted_1515 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BR1515( ) ;
            }
            else
            {
               if ( RcdFound1515 != 0 )
               {
                  if ( ( nRcdDeleted_1515 != 0 ) && ( nRcdExists_1515 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BR1515( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1515 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BR1515( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1515 == 0 )
                  {
                     GXCCtl = "AUR_CODDEF_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAur_CodDef_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11353Aur_UndMS = A11353Aur_UndMS ;
            n11353Aur_UndMS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1515_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAur_CodDef_Internalname, GXutil.ltrim( localUtil.ntoc( A11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAur_DscDef_Internalname, GXutil.rtrim( A11360Aur_DscDef)) ;
         httpContext.changePostValue( edtAur_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11358Aur_CodDef_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11359Aur_Und_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11359Aur_Und_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( O11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1515_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1515_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1515_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1515 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1515_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1515_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUR_CODDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_CodDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUR_DSCDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_DscDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AUR_UND_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_Und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BR1515( ) ;
      if ( AnyError != 0 )
      {
         O11353Aur_UndMS = s11353Aur_UndMS ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      nRcdExists_1515 = (short)(0) ;
      nIsMod_1515 = (short)(0) ;
      nRcdDeleted_1515 = (short)(0) ;
   }

   public void processLevel1BR1514( )
   {
      /* Save parent mode. */
      sMode1514 = Gx_mode ;
      processNestedLevel1BR1515( ) ;
      if ( AnyError != 0 )
      {
         O11353Aur_UndMS = s11353Aur_UndMS ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1514 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BR1514( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BR1514( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "taudrep");
         if ( AnyError == 0 )
         {
            confirmValues1BR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "taudrep");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BR1514( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A11349Aur_Reccod = A11349Aur_Reccod ;
      /* Scan By routine */
      /* Using cursor T01BR17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      RcdFound1514 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1514 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BR1514( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1514 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1514 = (short)(1) ;
      }
   }

   public void scanEnd1BR1514( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1BR1514( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BR1514( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BR1514( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BR1514( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BR1514( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BR1514( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BR1514( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAur_Reccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_Reccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Reccod_Enabled), 5, 0), true);
      edtAur_Pzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_Pzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Pzas_Enabled), 5, 0), true);
      edtAur_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Kgs_Enabled), 5, 0), true);
      edtAur_UndM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_UndM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_UndM_Enabled), 5, 0), true);
      edtAur_UndMS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_UndMS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_UndMS_Enabled), 5, 0), true);
      edtAur_Obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Obs_Enabled), 5, 0), true);
      edtAur_stat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_stat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_stat_Enabled), 5, 0), true);
      edtAur_Oper_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_Oper_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Oper_Enabled), 5, 0), true);
      edtAur_FecHr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_FecHr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_FecHr_Enabled), 5, 0), true);
   }

   public void zm1BR1515( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11359Aur_Und = T01BR3_A11359Aur_Und[0] ;
         }
         else
         {
            Z11359Aur_Und = A11359Aur_Und ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z396EmprCod = A396EmprCod ;
         Z11349Aur_Reccod = A11349Aur_Reccod ;
         Z11358Aur_CodDef = A11358Aur_CodDef ;
         Z11359Aur_Und = A11359Aur_Und ;
      }
   }

   public void standaloneNotModal1BR1515( )
   {
   }

   public void standaloneModal1BR1515( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAur_CodDef_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAur_CodDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_CodDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtAur_CodDef_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAur_CodDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_CodDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load1BR1515( )
   {
      /* Using cursor T01BR18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1515 = (short)(1) ;
         A11359Aur_Und = T01BR18_A11359Aur_Und[0] ;
         n11359Aur_Und = T01BR18_n11359Aur_Und[0] ;
         zm1BR1515( -6) ;
      }
      pr_default.close(14);
      onLoadActions1BR1515( ) ;
   }

   public void onLoadActions1BR1515( )
   {
      GXt_char1 = A11360Aur_DscDef ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdefaudc(remoteHandle, context).execute( A396EmprCod, A11358Aur_CodDef, GXv_char2) ;
      taudrep_impl.this.GXt_char1 = GXv_char2[0] ;
      A11360Aur_DscDef = GXt_char1 ;
      if ( isIns( )  )
      {
         A11353Aur_UndMS = (int)(O11353Aur_UndMS+A11359Aur_Und) ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A11353Aur_UndMS = (int)(O11353Aur_UndMS+A11359Aur_Und-O11359Aur_Und) ;
            n11353Aur_UndMS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A11353Aur_UndMS = (int)(O11353Aur_UndMS-O11359Aur_Und) ;
               n11353Aur_UndMS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
            }
         }
      }
   }

   public void checkExtendedTable1BR1515( )
   {
      nIsDirty_1515 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BR1515( ) ;
      nIsDirty_1515 = (short)(1) ;
      GXt_char1 = A11360Aur_DscDef ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdefaudc(remoteHandle, context).execute( A396EmprCod, A11358Aur_CodDef, GXv_char2) ;
      taudrep_impl.this.GXt_char1 = GXv_char2[0] ;
      A11360Aur_DscDef = GXt_char1 ;
      if ( isIns( )  )
      {
         nIsDirty_1515 = (short)(1) ;
         A11353Aur_UndMS = (int)(O11353Aur_UndMS+A11359Aur_Und) ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1515 = (short)(1) ;
            A11353Aur_UndMS = (int)(O11353Aur_UndMS+A11359Aur_Und-O11359Aur_Und) ;
            n11353Aur_UndMS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1515 = (short)(1) ;
               A11353Aur_UndMS = (int)(O11353Aur_UndMS-O11359Aur_Und) ;
               n11353Aur_UndMS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors1BR1515( )
   {
   }

   public void enableDisable1BR1515( )
   {
   }

   public void getKey1BR1515( )
   {
      /* Using cursor T01BR19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1515 = (short)(1) ;
      }
      else
      {
         RcdFound1515 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey1BR1515( )
   {
      /* Using cursor T01BR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01BR3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BR3_A11349Aur_Reccod[0] == A11349Aur_Reccod ) )
      {
         zm1BR1515( 6) ;
         RcdFound1515 = (short)(1) ;
         initializeNonKey1BR1515( ) ;
         A11358Aur_CodDef = T01BR3_A11358Aur_CodDef[0] ;
         A11359Aur_Und = T01BR3_A11359Aur_Und[0] ;
         n11359Aur_Und = T01BR3_n11359Aur_Und[0] ;
         O11359Aur_Und = A11359Aur_Und ;
         n11359Aur_Und = false ;
         Z396EmprCod = A396EmprCod ;
         Z11349Aur_Reccod = A11349Aur_Reccod ;
         Z11358Aur_CodDef = A11358Aur_CodDef ;
         sMode1515 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BR1515( ) ;
         load1BR1515( ) ;
         Gx_mode = sMode1515 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1515 = (short)(0) ;
         initializeNonKey1BR1515( ) ;
         sMode1515 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BR1515( ) ;
         Gx_mode = sMode1515 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BR1515( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BR1515( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAUDRE1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z11359Aur_Und != T01BR2_A11359Aur_Und[0] ) )
         {
            if ( Z11359Aur_Und != T01BR2_A11359Aur_Und[0] )
            {
               GXutil.writeLogln("taudrep:[seudo value changed for attri]"+"Aur_Und");
               GXutil.writeLogRaw("Old: ",Z11359Aur_Und);
               GXutil.writeLogRaw("Current: ",T01BR2_A11359Aur_Und[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAUDRE1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BR1515( )
   {
      beforeValidate1BR1515( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BR1515( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BR1515( 0) ;
         checkOptimisticConcurrency1BR1515( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BR1515( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BR1515( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BR20 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef), Boolean.valueOf(n11359Aur_Und), Integer.valueOf(A11359Aur_Und)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDRE1");
                  if ( (pr_default.getStatus(16) == 1) )
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
            load1BR1515( ) ;
         }
         endLevel1BR1515( ) ;
      }
      closeExtendedTableCursors1BR1515( ) ;
   }

   public void update1BR1515( )
   {
      beforeValidate1BR1515( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BR1515( ) ;
      }
      if ( ( nIsMod_1515 != 0 ) || ( nIsDirty_1515 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BR1515( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BR1515( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BR1515( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BR21 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n11359Aur_Und), Integer.valueOf(A11359Aur_Und), A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDRE1");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAUDRE1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BR1515( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BR1515( ) ;
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
            endLevel1BR1515( ) ;
         }
      }
      closeExtendedTableCursors1BR1515( ) ;
   }

   public void deferredUpdate1BR1515( )
   {
   }

   public void delete1BR1515( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BR1515( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BR1515( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BR1515( ) ;
         afterConfirm1BR1515( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BR1515( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BR22 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod), Short.valueOf(A11358Aur_CodDef)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDRE1");
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
      sMode1515 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BR1515( ) ;
      Gx_mode = sMode1515 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BR1515( )
   {
      standaloneModal1BR1515( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11360Aur_DscDef ;
         GXv_char2[0] = GXt_char1 ;
         new app.pdefaudc(remoteHandle, context).execute( A396EmprCod, A11358Aur_CodDef, GXv_char2) ;
         taudrep_impl.this.GXt_char1 = GXv_char2[0] ;
         A11360Aur_DscDef = GXt_char1 ;
         if ( isIns( )  )
         {
            A11353Aur_UndMS = (int)(O11353Aur_UndMS+A11359Aur_Und) ;
            n11353Aur_UndMS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A11353Aur_UndMS = (int)(O11353Aur_UndMS+A11359Aur_Und-O11359Aur_Und) ;
               n11353Aur_UndMS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A11353Aur_UndMS = (int)(O11353Aur_UndMS-O11359Aur_Und) ;
                  n11353Aur_UndMS = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
               }
            }
         }
      }
   }

   public void endLevel1BR1515( )
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

   public void scanStart1BR1515( )
   {
      /* Scan By routine */
      /* Using cursor T01BR23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      RcdFound1515 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1515 = (short)(1) ;
         A11358Aur_CodDef = T01BR23_A11358Aur_CodDef[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BR1515( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1515 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1515 = (short)(1) ;
         A11358Aur_CodDef = T01BR23_A11358Aur_CodDef[0] ;
      }
   }

   public void scanEnd1BR1515( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1BR1515( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BR1515( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BR1515( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BR1515( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BR1515( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BR1515( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BR1515( )
   {
      edtAur_CodDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_CodDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_CodDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtAur_DscDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_DscDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_DscDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtAur_Und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_Und_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes1BR1515( )
   {
   }

   public void send_integrity_lvl_hashes1BR1514( )
   {
   }

   public void subsflControlProps_751515( )
   {
      edtavnRcdDeleted_1515_Internalname = "vNRCDDELETED_1515_"+sGXsfl_75_idx ;
      edtAur_CodDef_Internalname = "AUR_CODDEF_"+sGXsfl_75_idx ;
      edtAur_DscDef_Internalname = "AUR_DSCDEF_"+sGXsfl_75_idx ;
      edtAur_Und_Internalname = "AUR_UND_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_751515( )
   {
      edtavnRcdDeleted_1515_Internalname = "vNRCDDELETED_1515_"+sGXsfl_75_fel_idx ;
      edtAur_CodDef_Internalname = "AUR_CODDEF_"+sGXsfl_75_fel_idx ;
      edtAur_DscDef_Internalname = "AUR_DSCDEF_"+sGXsfl_75_fel_idx ;
      edtAur_Und_Internalname = "AUR_UND_"+sGXsfl_75_fel_idx ;
   }

   public void addRow1BR1515( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751515( ) ;
      sendRow1BR1515( ) ;
   }

   public void sendRow1BR1515( )
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
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1515_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1515_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1515_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1515), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1515), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1515_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1515_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1515_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAur_CodDef_Internalname,GXutil.ltrim( localUtil.ntoc( A11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11358Aur_CodDef), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAur_CodDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAur_CodDef_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAur_DscDef_Internalname,GXutil.rtrim( A11360Aur_DscDef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAur_DscDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAur_DscDef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1515_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAur_Und_Internalname,GXutil.ltrim( localUtil.ntoc( A11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAur_Und_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11359Aur_Und), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11359Aur_Und), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAur_Und_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAur_Und_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BR1515( ) ;
      GXCCtl = "Z11358Aur_CodDef_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11358Aur_CodDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11359Aur_Und_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O11359Aur_Und_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11359Aur_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1515_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1515_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1515_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1515, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vAUC_NA_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32Auc_Na, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1515_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1515_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUR_CODDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_CodDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUR_DSCDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_DscDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AUR_UND_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_Und_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BR1515( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751515( ) ;
      edtavnRcdDeleted_1515_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1515_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAur_CodDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUR_CODDEF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAur_DscDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUR_DSCDEF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAur_Und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AUR_UND_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1515_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1515_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1515");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1515_Internalname ;
         wbErr = true ;
         nRcdDeleted_1515 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1515 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1515_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAur_CodDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAur_CodDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "AUR_CODDEF_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAur_CodDef_Internalname ;
         wbErr = true ;
         A11358Aur_CodDef = (short)(0) ;
      }
      else
      {
         A11358Aur_CodDef = (short)(localUtil.ctol( httpContext.cgiGet( edtAur_CodDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11360Aur_DscDef = httpContext.cgiGet( edtAur_DscDef_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAur_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAur_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AUR_UND_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAur_Und_Internalname ;
         wbErr = true ;
         A11359Aur_Und = 0 ;
         n11359Aur_Und = false ;
      }
      else
      {
         A11359Aur_Und = (int)(localUtil.ctol( httpContext.cgiGet( edtAur_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11359Aur_Und = false ;
      }
      GXCCtl = "Z11358Aur_CodDef_" + sGXsfl_75_idx ;
      Z11358Aur_CodDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11359Aur_Und_" + sGXsfl_75_idx ;
      Z11359Aur_Und = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O11359Aur_Und_" + sGXsfl_75_idx ;
      O11359Aur_Und = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1515_" + sGXsfl_75_idx ;
      nRcdDeleted_1515 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1515_" + sGXsfl_75_idx ;
      nRcdExists_1515 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1515_" + sGXsfl_75_idx ;
      nIsMod_1515 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAur_CodDef_Enabled = edtAur_CodDef_Enabled ;
   }

   public void confirmValues1BR0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751515( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_751515( ) ;
         httpContext.changePostValue( "Z11358Aur_CodDef_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11358Aur_CodDef_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11358Aur_CodDef_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z11359Aur_Und_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11359Aur_Und_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11359Aur_Und_"+sGXsfl_75_idx) ;
      }
      httpContext.changePostValue( "O11359Aur_Und", httpContext.cgiGet( "T11359Aur_Und")) ;
      httpContext.deletePostValue( "T11359Aur_Und") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.taudrep", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11349Aur_Reccod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32Auc_Na,6,0))}, new String[] {"EmprCod","Aur_Reccod","Auc_Na"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11349Aur_Reccod", GXutil.ltrim( localUtil.ntoc( Z11349Aur_Reccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11350Aur_Pzas", GXutil.ltrim( localUtil.ntoc( Z11350Aur_Pzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11351Aur_Kgs", GXutil.ltrim( localUtil.ntoc( Z11351Aur_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11352Aur_UndM", GXutil.ltrim( localUtil.ntoc( Z11352Aur_UndM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11354Aur_Obs", Z11354Aur_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11355Aur_stat", GXutil.ltrim( localUtil.ntoc( Z11355Aur_stat, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11356Aur_Oper", GXutil.ltrim( localUtil.ntoc( Z11356Aur_Oper, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11357Aur_FecHr", localUtil.ttoc( Z11357Aur_FecHr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "O11353Aur_UndMS", GXutil.ltrim( localUtil.ntoc( O11353Aur_UndMS, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUC_NA", GXutil.ltrim( localUtil.ntoc( AV32Auc_Na, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.taudrep", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11349Aur_Reccod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32Auc_Na,6,0))}, new String[] {"EmprCod","Aur_Reccod","Auc_Na"})  ;
   }

   public String getPgmname( )
   {
      return "TAUDREP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AUDITORIA ENTRADAS", "") ;
   }

   public void initializeNonKey1BR1514( )
   {
      A11350Aur_Pzas = 0 ;
      n11350Aur_Pzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11350Aur_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11350Aur_Pzas), 6, 0));
      A11351Aur_Kgs = DecimalUtil.ZERO ;
      n11351Aur_Kgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11351Aur_Kgs", GXutil.ltrimstr( A11351Aur_Kgs, 9, 2));
      A11352Aur_UndM = 0 ;
      n11352Aur_UndM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11352Aur_UndM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11352Aur_UndM), 6, 0));
      A11354Aur_Obs = "" ;
      n11354Aur_Obs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11354Aur_Obs", A11354Aur_Obs);
      A11355Aur_stat = (byte)(0) ;
      n11355Aur_stat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11355Aur_stat", GXutil.str( A11355Aur_stat, 1, 0));
      A11356Aur_Oper = 0 ;
      n11356Aur_Oper = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11356Aur_Oper", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11356Aur_Oper), 6, 0));
      A11357Aur_FecHr = GXutil.resetTime( GXutil.nullDate() );
      n11357Aur_FecHr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11357Aur_FecHr", localUtil.ttoc( A11357Aur_FecHr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      O11353Aur_UndMS = A11353Aur_UndMS ;
      n11353Aur_UndMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      Z11350Aur_Pzas = 0 ;
      Z11351Aur_Kgs = DecimalUtil.ZERO ;
      Z11352Aur_UndM = 0 ;
      Z11354Aur_Obs = "" ;
      Z11355Aur_stat = (byte)(0) ;
      Z11356Aur_Oper = 0 ;
      Z11357Aur_FecHr = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1BR1514( )
   {
      initializeNonKey1BR1514( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BR1515( )
   {
      A11360Aur_DscDef = "" ;
      A11359Aur_Und = 0 ;
      n11359Aur_Und = false ;
      O11359Aur_Und = A11359Aur_Und ;
      n11359Aur_Und = false ;
      Z11359Aur_Und = 0 ;
   }

   public void initAll1BR1515( )
   {
      A11358Aur_CodDef = (short)(0) ;
      initializeNonKey1BR1515( ) ;
   }

   public void standaloneModalInsert1BR1515( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565117", true, true);
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
      httpContext.AddJavascriptSource("taudrep.js", "?20268241565118", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1515( )
   {
      edtAur_CodDef_Enabled = defedtAur_CodDef_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAur_CodDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAur_CodDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1515, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1515_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11358Aur_CodDef, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_CodDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11360Aur_DscDef));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_DscDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11359Aur_Und, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAur_Und_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAur_Reccod_Internalname = "AUR_RECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAur_Pzas_Internalname = "AUR_PZAS" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAur_Kgs_Internalname = "AUR_KGS" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAur_UndM_Internalname = "AUR_UNDM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAur_UndMS_Internalname = "AUR_UNDMS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAur_Obs_Internalname = "AUR_OBS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAur_stat_Internalname = "AUR_STAT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAur_Oper_Internalname = "AUR_OPER" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAur_FecHr_Internalname = "AUR_FECHR" ;
      edtavnRcdDeleted_1515_Internalname = "vNRCDDELETED_1515" ;
      edtAur_CodDef_Internalname = "AUR_CODDEF" ;
      edtAur_DscDef_Internalname = "AUR_DSCDEF" ;
      edtAur_Und_Internalname = "AUR_UND" ;
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
      Form.setCaption( httpContext.getMessage( "AUDITORIA ENTRADAS", "") );
      edtAur_Und_Jsonclick = "" ;
      edtAur_DscDef_Jsonclick = "" ;
      edtAur_CodDef_Jsonclick = "" ;
      edtavnRcdDeleted_1515_Jsonclick = "" ;
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
      edtAur_Und_Enabled = 1 ;
      edtAur_DscDef_Enabled = 0 ;
      edtAur_CodDef_Enabled = 1 ;
      edtavnRcdDeleted_1515_Enabled = 1 ;
      edtAur_FecHr_Jsonclick = "" ;
      edtAur_FecHr_Backcolor = (int)(0xFFFFFF) ;
      edtAur_FecHr_Enabled = 1 ;
      edtAur_Oper_Jsonclick = "" ;
      edtAur_Oper_Backcolor = (int)(0xFFFFFF) ;
      edtAur_Oper_Enabled = 1 ;
      edtAur_stat_Jsonclick = "" ;
      edtAur_stat_Backcolor = (int)(0xFFFFFF) ;
      edtAur_stat_Enabled = 1 ;
      edtAur_Obs_Backcolor = (int)(0xFFFFFF) ;
      edtAur_Obs_Enabled = 1 ;
      edtAur_UndMS_Jsonclick = "" ;
      edtAur_UndMS_Backcolor = (int)(0xFFFFFF) ;
      edtAur_UndMS_Enabled = 0 ;
      edtAur_UndM_Jsonclick = "" ;
      edtAur_UndM_Backcolor = (int)(0xFFFFFF) ;
      edtAur_UndM_Enabled = 1 ;
      edtAur_Kgs_Jsonclick = "" ;
      edtAur_Kgs_Backcolor = (int)(0xFFFFFF) ;
      edtAur_Kgs_Enabled = 1 ;
      edtAur_Pzas_Jsonclick = "" ;
      edtAur_Pzas_Backcolor = (int)(0xFFFFFF) ;
      edtAur_Pzas_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAur_Reccod_Jsonclick = "" ;
      edtAur_Reccod_Backcolor = (int)(0xFFFFFF) ;
      edtAur_Reccod_Enabled = 0 ;
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
      subsflControlProps_751515( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BR1515( ) ;
         standaloneModal1BR1515( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BR1515( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_751515( ) ;
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
      /* Using cursor T01BR24 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BR24_A407EmprNom[0] ;
      n407EmprNom = T01BR24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T01BR26 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A11349Aur_Reccod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A11353Aur_UndMS = T01BR26_A11353Aur_UndMS[0] ;
         n11353Aur_UndMS = T01BR26_n11353Aur_UndMS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      else
      {
         A11353Aur_UndMS = 0 ;
         n11353Aur_UndMS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11353Aur_UndMS), 6, 0));
      }
      pr_default.close(21);
      GX_FocusControl = edtAur_Pzas_Internalname ;
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

   public void valid_Aur_reccod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11350Aur_Pzas", GXutil.ltrim( localUtil.ntoc( A11350Aur_Pzas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11351Aur_Kgs", GXutil.ltrim( localUtil.ntoc( A11351Aur_Kgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11352Aur_UndM", GXutil.ltrim( localUtil.ntoc( A11352Aur_UndM, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11353Aur_UndMS", GXutil.ltrim( localUtil.ntoc( A11353Aur_UndMS, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11354Aur_Obs", A11354Aur_Obs);
      httpContext.ajax_rsp_assign_attri("", false, "A11355Aur_stat", GXutil.ltrim( localUtil.ntoc( A11355Aur_stat, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11356Aur_Oper", GXutil.ltrim( localUtil.ntoc( A11356Aur_Oper, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11357Aur_FecHr", localUtil.ttoc( A11357Aur_FecHr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11349Aur_Reccod", GXutil.ltrim( localUtil.ntoc( Z11349Aur_Reccod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11350Aur_Pzas", GXutil.ltrim( localUtil.ntoc( Z11350Aur_Pzas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11351Aur_Kgs", GXutil.ltrim( localUtil.ntoc( Z11351Aur_Kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11352Aur_UndM", GXutil.ltrim( localUtil.ntoc( Z11352Aur_UndM, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11353Aur_UndMS", GXutil.ltrim( localUtil.ntoc( Z11353Aur_UndMS, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11354Aur_Obs", Z11354Aur_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11355Aur_stat", GXutil.ltrim( localUtil.ntoc( Z11355Aur_stat, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11356Aur_Oper", GXutil.ltrim( localUtil.ntoc( Z11356Aur_Oper, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11357Aur_FecHr", localUtil.ttoc( Z11357Aur_FecHr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "O11353Aur_UndMS", GXutil.ltrim( localUtil.ntoc( O11353Aur_UndMS, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Aur_coddef( )
   {
      GXt_char1 = A11360Aur_DscDef ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdefaudc(remoteHandle, context).execute( A396EmprCod, A11358Aur_CodDef, GXv_char2) ;
      taudrep_impl.this.GXt_char1 = GXv_char2[0] ;
      A11360Aur_DscDef = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11360Aur_DscDef", GXutil.rtrim( A11360Aur_DscDef));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11349Aur_Reccod',fld:'AUR_RECCOD',pic:'ZZZZZZZ9'},{av:'AV32Auc_Na',fld:'vAUC_NA',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_AUR_RECCOD","{handler:'valid_Aur_reccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11349Aur_Reccod',fld:'AUR_RECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_AUR_RECCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11350Aur_Pzas',fld:'AUR_PZAS',pic:'ZZZZZ9'},{av:'A11351Aur_Kgs',fld:'AUR_KGS',pic:'ZZZZZ9.99'},{av:'A11352Aur_UndM',fld:'AUR_UNDM',pic:'ZZZZZ9'},{av:'A11353Aur_UndMS',fld:'AUR_UNDMS',pic:'ZZZZZ9'},{av:'A11354Aur_Obs',fld:'AUR_OBS',pic:''},{av:'A11355Aur_stat',fld:'AUR_STAT',pic:'9'},{av:'A11356Aur_Oper',fld:'AUR_OPER',pic:'ZZZZZ9'},{av:'A11357Aur_FecHr',fld:'AUR_FECHR',pic:'99/99/99 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11349Aur_Reccod'},{av:'Z407EmprNom'},{av:'Z11350Aur_Pzas'},{av:'Z11351Aur_Kgs'},{av:'Z11352Aur_UndM'},{av:'Z11353Aur_UndMS'},{av:'Z11354Aur_Obs'},{av:'Z11355Aur_stat'},{av:'Z11356Aur_Oper'},{av:'Z11357Aur_FecHr'},{av:'O11353Aur_UndMS'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_AUR_CODDEF","{handler:'valid_Aur_coddef',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11358Aur_CodDef',fld:'AUR_CODDEF',pic:'ZZZ9'},{av:'A11360Aur_DscDef',fld:'AUR_DSCDEF',pic:''}]");
      setEventMetadata("VALID_AUR_CODDEF",",oparms:[{av:'A11360Aur_DscDef',fld:'AUR_DSCDEF',pic:''}]}");
      setEventMetadata("VALID_AUR_UND","{handler:'valid_Aur_und',iparms:[]");
      setEventMetadata("VALID_AUR_UND",",oparms:[]}");
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
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11351Aur_Kgs = DecimalUtil.ZERO ;
      Z11354Aur_Obs = "" ;
      Z11357Aur_FecHr = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A11351Aur_Kgs = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A11354Aur_Obs = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A11357Aur_FecHr = GXutil.resetTime( GXutil.nullDate() );
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1515 = "" ;
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
      sMode1514 = "" ;
      GXCCtl = "" ;
      A11360Aur_DscDef = "" ;
      Z407EmprNom = "" ;
      T01BR6_A407EmprNom = new String[] {""} ;
      T01BR6_n407EmprNom = new boolean[] {false} ;
      T01BR8_A11353Aur_UndMS = new int[1] ;
      T01BR8_n11353Aur_UndMS = new boolean[] {false} ;
      T01BR10_A11349Aur_Reccod = new int[1] ;
      T01BR10_A407EmprNom = new String[] {""} ;
      T01BR10_n407EmprNom = new boolean[] {false} ;
      T01BR10_A11350Aur_Pzas = new int[1] ;
      T01BR10_n11350Aur_Pzas = new boolean[] {false} ;
      T01BR10_A11351Aur_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BR10_n11351Aur_Kgs = new boolean[] {false} ;
      T01BR10_A11352Aur_UndM = new int[1] ;
      T01BR10_n11352Aur_UndM = new boolean[] {false} ;
      T01BR10_A11354Aur_Obs = new String[] {""} ;
      T01BR10_n11354Aur_Obs = new boolean[] {false} ;
      T01BR10_A11355Aur_stat = new byte[1] ;
      T01BR10_n11355Aur_stat = new boolean[] {false} ;
      T01BR10_A11356Aur_Oper = new int[1] ;
      T01BR10_n11356Aur_Oper = new boolean[] {false} ;
      T01BR10_A11357Aur_FecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01BR10_n11357Aur_FecHr = new boolean[] {false} ;
      T01BR10_A396EmprCod = new String[] {""} ;
      T01BR10_A11353Aur_UndMS = new int[1] ;
      T01BR10_n11353Aur_UndMS = new boolean[] {false} ;
      T01BR11_A396EmprCod = new String[] {""} ;
      T01BR11_A11349Aur_Reccod = new int[1] ;
      T01BR5_A11349Aur_Reccod = new int[1] ;
      T01BR5_A11350Aur_Pzas = new int[1] ;
      T01BR5_n11350Aur_Pzas = new boolean[] {false} ;
      T01BR5_A11351Aur_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BR5_n11351Aur_Kgs = new boolean[] {false} ;
      T01BR5_A11352Aur_UndM = new int[1] ;
      T01BR5_n11352Aur_UndM = new boolean[] {false} ;
      T01BR5_A11354Aur_Obs = new String[] {""} ;
      T01BR5_n11354Aur_Obs = new boolean[] {false} ;
      T01BR5_A11355Aur_stat = new byte[1] ;
      T01BR5_n11355Aur_stat = new boolean[] {false} ;
      T01BR5_A11356Aur_Oper = new int[1] ;
      T01BR5_n11356Aur_Oper = new boolean[] {false} ;
      T01BR5_A11357Aur_FecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01BR5_n11357Aur_FecHr = new boolean[] {false} ;
      T01BR5_A396EmprCod = new String[] {""} ;
      T01BR12_A396EmprCod = new String[] {""} ;
      T01BR12_A11349Aur_Reccod = new int[1] ;
      T01BR13_A396EmprCod = new String[] {""} ;
      T01BR13_A11349Aur_Reccod = new int[1] ;
      T01BR4_A11349Aur_Reccod = new int[1] ;
      T01BR4_A11350Aur_Pzas = new int[1] ;
      T01BR4_n11350Aur_Pzas = new boolean[] {false} ;
      T01BR4_A11351Aur_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BR4_n11351Aur_Kgs = new boolean[] {false} ;
      T01BR4_A11352Aur_UndM = new int[1] ;
      T01BR4_n11352Aur_UndM = new boolean[] {false} ;
      T01BR4_A11354Aur_Obs = new String[] {""} ;
      T01BR4_n11354Aur_Obs = new boolean[] {false} ;
      T01BR4_A11355Aur_stat = new byte[1] ;
      T01BR4_n11355Aur_stat = new boolean[] {false} ;
      T01BR4_A11356Aur_Oper = new int[1] ;
      T01BR4_n11356Aur_Oper = new boolean[] {false} ;
      T01BR4_A11357Aur_FecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01BR4_n11357Aur_FecHr = new boolean[] {false} ;
      T01BR4_A396EmprCod = new String[] {""} ;
      T01BR17_A396EmprCod = new String[] {""} ;
      T01BR17_A11349Aur_Reccod = new int[1] ;
      T01BR18_A396EmprCod = new String[] {""} ;
      T01BR18_A11349Aur_Reccod = new int[1] ;
      T01BR18_A11358Aur_CodDef = new short[1] ;
      T01BR18_A11359Aur_Und = new int[1] ;
      T01BR18_n11359Aur_Und = new boolean[] {false} ;
      T01BR19_A396EmprCod = new String[] {""} ;
      T01BR19_A11349Aur_Reccod = new int[1] ;
      T01BR19_A11358Aur_CodDef = new short[1] ;
      T01BR3_A396EmprCod = new String[] {""} ;
      T01BR3_A11349Aur_Reccod = new int[1] ;
      T01BR3_A11358Aur_CodDef = new short[1] ;
      T01BR3_A11359Aur_Und = new int[1] ;
      T01BR3_n11359Aur_Und = new boolean[] {false} ;
      T01BR2_A396EmprCod = new String[] {""} ;
      T01BR2_A11349Aur_Reccod = new int[1] ;
      T01BR2_A11358Aur_CodDef = new short[1] ;
      T01BR2_A11359Aur_Und = new int[1] ;
      T01BR2_n11359Aur_Und = new boolean[] {false} ;
      T01BR23_A396EmprCod = new String[] {""} ;
      T01BR23_A11349Aur_Reccod = new int[1] ;
      T01BR23_A11358Aur_CodDef = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01BR24_A407EmprNom = new String[] {""} ;
      T01BR24_n407EmprNom = new boolean[] {false} ;
      T01BR26_A11353Aur_UndMS = new int[1] ;
      T01BR26_n11353Aur_UndMS = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ11351Aur_Kgs = DecimalUtil.ZERO ;
      ZZ11354Aur_Obs = "" ;
      ZZ11357Aur_FecHr = GXutil.resetTime( GXutil.nullDate() );
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Z11360Aur_DscDef = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.taudrep__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.taudrep__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.taudrep__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.taudrep__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.taudrep__default(),
         new Object[] {
             new Object[] {
            T01BR2_A396EmprCod, T01BR2_A11349Aur_Reccod, T01BR2_A11358Aur_CodDef, T01BR2_A11359Aur_Und, T01BR2_n11359Aur_Und
            }
            , new Object[] {
            T01BR3_A396EmprCod, T01BR3_A11349Aur_Reccod, T01BR3_A11358Aur_CodDef, T01BR3_A11359Aur_Und, T01BR3_n11359Aur_Und
            }
            , new Object[] {
            T01BR4_A11349Aur_Reccod, T01BR4_A11350Aur_Pzas, T01BR4_n11350Aur_Pzas, T01BR4_A11351Aur_Kgs, T01BR4_n11351Aur_Kgs, T01BR4_A11352Aur_UndM, T01BR4_n11352Aur_UndM, T01BR4_A11354Aur_Obs, T01BR4_n11354Aur_Obs, T01BR4_A11355Aur_stat,
            T01BR4_n11355Aur_stat, T01BR4_A11356Aur_Oper, T01BR4_n11356Aur_Oper, T01BR4_A11357Aur_FecHr, T01BR4_n11357Aur_FecHr, T01BR4_A396EmprCod
            }
            , new Object[] {
            T01BR5_A11349Aur_Reccod, T01BR5_A11350Aur_Pzas, T01BR5_n11350Aur_Pzas, T01BR5_A11351Aur_Kgs, T01BR5_n11351Aur_Kgs, T01BR5_A11352Aur_UndM, T01BR5_n11352Aur_UndM, T01BR5_A11354Aur_Obs, T01BR5_n11354Aur_Obs, T01BR5_A11355Aur_stat,
            T01BR5_n11355Aur_stat, T01BR5_A11356Aur_Oper, T01BR5_n11356Aur_Oper, T01BR5_A11357Aur_FecHr, T01BR5_n11357Aur_FecHr, T01BR5_A396EmprCod
            }
            , new Object[] {
            T01BR6_A407EmprNom, T01BR6_n407EmprNom
            }
            , new Object[] {
            T01BR8_A11353Aur_UndMS, T01BR8_n11353Aur_UndMS
            }
            , new Object[] {
            T01BR10_A11349Aur_Reccod, T01BR10_A407EmprNom, T01BR10_n407EmprNom, T01BR10_A11350Aur_Pzas, T01BR10_n11350Aur_Pzas, T01BR10_A11351Aur_Kgs, T01BR10_n11351Aur_Kgs, T01BR10_A11352Aur_UndM, T01BR10_n11352Aur_UndM, T01BR10_A11354Aur_Obs,
            T01BR10_n11354Aur_Obs, T01BR10_A11355Aur_stat, T01BR10_n11355Aur_stat, T01BR10_A11356Aur_Oper, T01BR10_n11356Aur_Oper, T01BR10_A11357Aur_FecHr, T01BR10_n11357Aur_FecHr, T01BR10_A396EmprCod, T01BR10_A11353Aur_UndMS, T01BR10_n11353Aur_UndMS
            }
            , new Object[] {
            T01BR11_A396EmprCod, T01BR11_A11349Aur_Reccod
            }
            , new Object[] {
            T01BR12_A396EmprCod, T01BR12_A11349Aur_Reccod
            }
            , new Object[] {
            T01BR13_A396EmprCod, T01BR13_A11349Aur_Reccod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BR17_A396EmprCod, T01BR17_A11349Aur_Reccod
            }
            , new Object[] {
            T01BR18_A396EmprCod, T01BR18_A11349Aur_Reccod, T01BR18_A11358Aur_CodDef, T01BR18_A11359Aur_Und, T01BR18_n11359Aur_Und
            }
            , new Object[] {
            T01BR19_A396EmprCod, T01BR19_A11349Aur_Reccod, T01BR19_A11358Aur_CodDef
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BR23_A396EmprCod, T01BR23_A11349Aur_Reccod, T01BR23_A11358Aur_CodDef
            }
            , new Object[] {
            T01BR24_A407EmprNom, T01BR24_n407EmprNom
            }
            , new Object[] {
            T01BR26_A11353Aur_UndMS, T01BR26_n11353Aur_UndMS
            }
         }
      );
      Z11349Aur_Reccod = 0 ;
      A11349Aur_Reccod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z11355Aur_stat ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11355Aur_stat ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ11355Aur_stat ;
   private short Z11358Aur_CodDef ;
   private short nRcdDeleted_1515 ;
   private short nRcdExists_1515 ;
   private short nIsMod_1515 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1515 ;
   private short RcdFound1515 ;
   private short nBlankRcdUsr1515 ;
   private short A11358Aur_CodDef ;
   private short RcdFound1514 ;
   private short nIsDirty_1514 ;
   private short nIsDirty_1515 ;
   private int wcpOA11349Aur_Reccod ;
   private int wcpOAV32Auc_Na ;
   private int Z11349Aur_Reccod ;
   private int Z11350Aur_Pzas ;
   private int Z11352Aur_UndM ;
   private int Z11356Aur_Oper ;
   private int O11353Aur_UndMS ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int Z11359Aur_Und ;
   private int O11359Aur_Und ;
   private int A11349Aur_Reccod ;
   private int AV32Auc_Na ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAur_Reccod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A11350Aur_Pzas ;
   private int edtAur_Pzas_Enabled ;
   private int edtAur_Kgs_Enabled ;
   private int A11352Aur_UndM ;
   private int edtAur_UndM_Enabled ;
   private int A11353Aur_UndMS ;
   private int edtAur_UndMS_Enabled ;
   private int edtAur_Obs_Enabled ;
   private int edtAur_stat_Enabled ;
   private int A11356Aur_Oper ;
   private int edtAur_Oper_Enabled ;
   private int edtAur_FecHr_Enabled ;
   private int B11353Aur_UndMS ;
   private int edtavnRcdDeleted_1515_Enabled ;
   private int edtAur_CodDef_Enabled ;
   private int edtAur_DscDef_Enabled ;
   private int edtAur_Und_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s11353Aur_UndMS ;
   private int A11359Aur_Und ;
   private int T11359Aur_Und ;
   private int GX_JID ;
   private int Z11353Aur_UndMS ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAur_CodDef_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAur_FecHr_Backcolor ;
   private int edtAur_Oper_Backcolor ;
   private int edtAur_stat_Backcolor ;
   private int edtAur_Obs_Backcolor ;
   private int edtAur_UndMS_Backcolor ;
   private int edtAur_UndM_Backcolor ;
   private int edtAur_Kgs_Backcolor ;
   private int edtAur_Pzas_Backcolor ;
   private int edtAur_Reccod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11349Aur_Reccod ;
   private int ZZ11350Aur_Pzas ;
   private int ZZ11352Aur_UndM ;
   private int ZZ11353Aur_UndMS ;
   private int ZZ11356Aur_Oper ;
   private int ZO11353Aur_UndMS ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11351Aur_Kgs ;
   private java.math.BigDecimal A11351Aur_Kgs ;
   private java.math.BigDecimal ZZ11351Aur_Kgs ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAur_Pzas_Internalname ;
   private String sGXsfl_75_idx="0001" ;
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
   private String edtAur_Reccod_Internalname ;
   private String edtAur_Reccod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAur_Pzas_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAur_Kgs_Internalname ;
   private String edtAur_Kgs_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAur_UndM_Internalname ;
   private String edtAur_UndM_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAur_UndMS_Internalname ;
   private String edtAur_UndMS_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAur_Obs_Internalname ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAur_stat_Internalname ;
   private String edtAur_stat_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAur_Oper_Internalname ;
   private String edtAur_Oper_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAur_FecHr_Internalname ;
   private String edtAur_FecHr_Jsonclick ;
   private String sMode1515 ;
   private String edtavnRcdDeleted_1515_Internalname ;
   private String edtAur_CodDef_Internalname ;
   private String edtAur_DscDef_Internalname ;
   private String edtAur_Und_Internalname ;
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
   private String sMode1514 ;
   private String GXCCtl ;
   private String A11360Aur_DscDef ;
   private String Z407EmprNom ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1515_Jsonclick ;
   private String edtAur_CodDef_Jsonclick ;
   private String edtAur_DscDef_Jsonclick ;
   private String edtAur_Und_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z11360Aur_DscDef ;
   private java.util.Date Z11357Aur_FecHr ;
   private java.util.Date A11357Aur_FecHr ;
   private java.util.Date ZZ11357Aur_FecHr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11353Aur_UndMS ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11350Aur_Pzas ;
   private boolean n11351Aur_Kgs ;
   private boolean n11352Aur_UndM ;
   private boolean n11354Aur_Obs ;
   private boolean n11355Aur_stat ;
   private boolean n11356Aur_Oper ;
   private boolean n11357Aur_FecHr ;
   private boolean Gx_longc ;
   private boolean n11359Aur_Und ;
   private String Z11354Aur_Obs ;
   private String A11354Aur_Obs ;
   private String ZZ11354Aur_Obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01BR6_A407EmprNom ;
   private boolean[] T01BR6_n407EmprNom ;
   private int[] T01BR8_A11353Aur_UndMS ;
   private boolean[] T01BR8_n11353Aur_UndMS ;
   private int[] T01BR10_A11349Aur_Reccod ;
   private String[] T01BR10_A407EmprNom ;
   private boolean[] T01BR10_n407EmprNom ;
   private int[] T01BR10_A11350Aur_Pzas ;
   private boolean[] T01BR10_n11350Aur_Pzas ;
   private java.math.BigDecimal[] T01BR10_A11351Aur_Kgs ;
   private boolean[] T01BR10_n11351Aur_Kgs ;
   private int[] T01BR10_A11352Aur_UndM ;
   private boolean[] T01BR10_n11352Aur_UndM ;
   private String[] T01BR10_A11354Aur_Obs ;
   private boolean[] T01BR10_n11354Aur_Obs ;
   private byte[] T01BR10_A11355Aur_stat ;
   private boolean[] T01BR10_n11355Aur_stat ;
   private int[] T01BR10_A11356Aur_Oper ;
   private boolean[] T01BR10_n11356Aur_Oper ;
   private java.util.Date[] T01BR10_A11357Aur_FecHr ;
   private boolean[] T01BR10_n11357Aur_FecHr ;
   private String[] T01BR10_A396EmprCod ;
   private int[] T01BR10_A11353Aur_UndMS ;
   private boolean[] T01BR10_n11353Aur_UndMS ;
   private String[] T01BR11_A396EmprCod ;
   private int[] T01BR11_A11349Aur_Reccod ;
   private int[] T01BR5_A11349Aur_Reccod ;
   private int[] T01BR5_A11350Aur_Pzas ;
   private boolean[] T01BR5_n11350Aur_Pzas ;
   private java.math.BigDecimal[] T01BR5_A11351Aur_Kgs ;
   private boolean[] T01BR5_n11351Aur_Kgs ;
   private int[] T01BR5_A11352Aur_UndM ;
   private boolean[] T01BR5_n11352Aur_UndM ;
   private String[] T01BR5_A11354Aur_Obs ;
   private boolean[] T01BR5_n11354Aur_Obs ;
   private byte[] T01BR5_A11355Aur_stat ;
   private boolean[] T01BR5_n11355Aur_stat ;
   private int[] T01BR5_A11356Aur_Oper ;
   private boolean[] T01BR5_n11356Aur_Oper ;
   private java.util.Date[] T01BR5_A11357Aur_FecHr ;
   private boolean[] T01BR5_n11357Aur_FecHr ;
   private String[] T01BR5_A396EmprCod ;
   private String[] T01BR12_A396EmprCod ;
   private int[] T01BR12_A11349Aur_Reccod ;
   private String[] T01BR13_A396EmprCod ;
   private int[] T01BR13_A11349Aur_Reccod ;
   private int[] T01BR4_A11349Aur_Reccod ;
   private int[] T01BR4_A11350Aur_Pzas ;
   private boolean[] T01BR4_n11350Aur_Pzas ;
   private java.math.BigDecimal[] T01BR4_A11351Aur_Kgs ;
   private boolean[] T01BR4_n11351Aur_Kgs ;
   private int[] T01BR4_A11352Aur_UndM ;
   private boolean[] T01BR4_n11352Aur_UndM ;
   private String[] T01BR4_A11354Aur_Obs ;
   private boolean[] T01BR4_n11354Aur_Obs ;
   private byte[] T01BR4_A11355Aur_stat ;
   private boolean[] T01BR4_n11355Aur_stat ;
   private int[] T01BR4_A11356Aur_Oper ;
   private boolean[] T01BR4_n11356Aur_Oper ;
   private java.util.Date[] T01BR4_A11357Aur_FecHr ;
   private boolean[] T01BR4_n11357Aur_FecHr ;
   private String[] T01BR4_A396EmprCod ;
   private String[] T01BR17_A396EmprCod ;
   private int[] T01BR17_A11349Aur_Reccod ;
   private String[] T01BR18_A396EmprCod ;
   private int[] T01BR18_A11349Aur_Reccod ;
   private short[] T01BR18_A11358Aur_CodDef ;
   private int[] T01BR18_A11359Aur_Und ;
   private boolean[] T01BR18_n11359Aur_Und ;
   private String[] T01BR19_A396EmprCod ;
   private int[] T01BR19_A11349Aur_Reccod ;
   private short[] T01BR19_A11358Aur_CodDef ;
   private String[] T01BR3_A396EmprCod ;
   private int[] T01BR3_A11349Aur_Reccod ;
   private short[] T01BR3_A11358Aur_CodDef ;
   private int[] T01BR3_A11359Aur_Und ;
   private boolean[] T01BR3_n11359Aur_Und ;
   private String[] T01BR2_A396EmprCod ;
   private int[] T01BR2_A11349Aur_Reccod ;
   private short[] T01BR2_A11358Aur_CodDef ;
   private int[] T01BR2_A11359Aur_Und ;
   private boolean[] T01BR2_n11359Aur_Und ;
   private String[] T01BR23_A396EmprCod ;
   private int[] T01BR23_A11349Aur_Reccod ;
   private short[] T01BR23_A11358Aur_CodDef ;
   private String[] T01BR24_A407EmprNom ;
   private boolean[] T01BR24_n407EmprNom ;
   private int[] T01BR26_A11353Aur_UndMS ;
   private boolean[] T01BR26_n11353Aur_UndMS ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class taudrep__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taudrep__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taudrep__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taudrep__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class taudrep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BR2", "SELECT EmprCod, Aur_Reccod, Aur_CodDef, Aur_Und FROM TXPAUDRE1 WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ?  FOR UPDATE OF Aur_Und NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BR3", "SELECT EmprCod, Aur_Reccod, Aur_CodDef, Aur_Und FROM TXPAUDRE1 WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BR4", "SELECT Aur_Reccod, Aur_Pzas, Aur_Kgs, Aur_UndM, Aur_Obs, Aur_stat, Aur_Oper, Aur_FecHr, EmprCod FROM TXPAUDREP WHERE EmprCod = ? AND Aur_Reccod = ?  FOR UPDATE OF Aur_Pzas, Aur_Kgs, Aur_UndM, Aur_Obs, Aur_stat, Aur_Oper, Aur_FecHr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR5", "SELECT Aur_Reccod, Aur_Pzas, Aur_Kgs, Aur_UndM, Aur_Obs, Aur_stat, Aur_Oper, Aur_FecHr, EmprCod FROM TXPAUDREP WHERE EmprCod = ? AND Aur_Reccod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR8", "SELECT COALESCE( T1.Aur_UndMS, 0) AS Aur_UndMS FROM (SELECT SUM(Aur_Und) AS Aur_UndMS, EmprCod, Aur_Reccod FROM TXPAUDRE1 GROUP BY EmprCod, Aur_Reccod ) T1 WHERE T1.EmprCod = ? AND T1.Aur_Reccod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR10", "SELECT /*+ FIRST_ROWS(1) */ TM1.Aur_Reccod, T2.EmprNom, TM1.Aur_Pzas, TM1.Aur_Kgs, TM1.Aur_UndM, TM1.Aur_Obs, TM1.Aur_stat, TM1.Aur_Oper, TM1.Aur_FecHr, TM1.EmprCod, COALESCE( T3.Aur_UndMS, 0) AS Aur_UndMS FROM ((TXPAUDREP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(Aur_Und) AS Aur_UndMS, EmprCod, Aur_Reccod FROM TXPAUDRE1 GROUP BY EmprCod, Aur_Reccod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.Aur_Reccod = TM1.Aur_Reccod) WHERE TM1.EmprCod = ? and TM1.Aur_Reccod = ? ORDER BY TM1.EmprCod, TM1.Aur_Reccod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Aur_Reccod FROM TXPAUDREP WHERE EmprCod = ? AND Aur_Reccod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Aur_Reccod FROM TXPAUDREP WHERE EmprCod = ? and Aur_Reccod = ? ORDER BY EmprCod, Aur_Reccod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Aur_Reccod FROM TXPAUDREP WHERE EmprCod = ? and Aur_Reccod = ? ORDER BY EmprCod DESC, Aur_Reccod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BR14", "INSERT INTO TXPAUDREP(Aur_Reccod, Aur_Pzas, Aur_Kgs, Aur_UndM, Aur_Obs, Aur_stat, Aur_Oper, Aur_FecHr, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPAUDREP")
         ,new UpdateCursor("T01BR15", "UPDATE TXPAUDREP SET Aur_Pzas=?, Aur_Kgs=?, Aur_UndM=?, Aur_Obs=?, Aur_stat=?, Aur_Oper=?, Aur_FecHr=?  WHERE EmprCod = ? AND Aur_Reccod = ?", GX_NOMASK, "TXPAUDREP")
         ,new UpdateCursor("T01BR16", "DELETE FROM TXPAUDREP  WHERE EmprCod = ? AND Aur_Reccod = ?", GX_NOMASK, "TXPAUDREP")
         ,new ForEachCursor("T01BR17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Aur_Reccod FROM TXPAUDREP WHERE EmprCod = ? and Aur_Reccod = ? ORDER BY EmprCod, Aur_Reccod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR18", "SELECT EmprCod, Aur_Reccod, Aur_CodDef, Aur_Und FROM TXPAUDRE1 WHERE EmprCod = ? and Aur_Reccod = ? and Aur_CodDef = ? ORDER BY EmprCod, Aur_Reccod, Aur_CodDef ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BR19", "SELECT EmprCod, Aur_Reccod, Aur_CodDef FROM TXPAUDRE1 WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BR20", "INSERT INTO TXPAUDRE1(EmprCod, Aur_Reccod, Aur_CodDef, Aur_Und) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPAUDRE1")
         ,new UpdateCursor("T01BR21", "UPDATE TXPAUDRE1 SET Aur_Und=?  WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ?", GX_NOMASK, "TXPAUDRE1")
         ,new UpdateCursor("T01BR22", "DELETE FROM TXPAUDRE1  WHERE EmprCod = ? AND Aur_Reccod = ? AND Aur_CodDef = ?", GX_NOMASK, "TXPAUDRE1")
         ,new ForEachCursor("T01BR23", "SELECT EmprCod, Aur_Reccod, Aur_CodDef FROM TXPAUDRE1 WHERE EmprCod = ? and Aur_Reccod = ? ORDER BY EmprCod, Aur_Reccod, Aur_CodDef ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BR24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BR26", "SELECT COALESCE( T1.Aur_UndMS, 0) AS Aur_UndMS FROM (SELECT SUM(Aur_Und) AS Aur_UndMS, EmprCod, Aur_Reccod FROM TXPAUDRE1 GROUP BY EmprCod, Aur_Reccod ) T1 WHERE T1.EmprCod = ? AND T1.Aur_Reccod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 300);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[14], false);
               }
               stmt.setString(9, (String)parms[15], 3);
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
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 300);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
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
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               return;
            case 17 :
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
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

